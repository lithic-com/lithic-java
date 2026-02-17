// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicWebhookException
import com.lithic.api.models.*
import com.standardwebhooks.Webhook
import java.time.Instant
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookServiceTest {

    private val webhookSecret = "whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst"

    private fun signPayload(
        msgId: String,
        timestamp: Long,
        payload: String,
    ): String {
        val webhook = Webhook(webhookSecret)
        return webhook.sign(msgId, timestamp, payload)
    }

    @Test
    fun unwrap() {
        val timestamp = Instant.now().epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret(webhookSecret)
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val msgId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val signature = signPayload(msgId, timestamp, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", msgId)
                .put("webhook-timestamp", timestamp.toString())
                .put("webhook-signature", signature)
                .build()

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val timestamp = Instant.now().epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret(webhookSecret)
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val webhookId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val webhookTimestamp = timestamp.toString()
        val signature = signPayload(webhookId, timestamp, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", webhookId)
                .put("webhook-timestamp", webhookTimestamp)
                .put("webhook-signature", signature)
                .build()

        // Valid signature should not throw
        assertThatCode {
                client.webhooks().verifySignature(payload, headers, null)
            }
            .doesNotThrowAnyException()

        // Timestamp too old (> 5 minutes)
        val oldTimestamp = timestamp - 360
        val oldSignature = signPayload(webhookId, oldTimestamp, payload)
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", oldTimestamp.toString())
                            .put("webhook-signature", oldSignature)
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Timestamp too new (> 5 minutes in future)
        val futureTimestamp = timestamp + 360
        val futureSignature = signPayload(webhookId, futureTimestamp, payload)
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", futureTimestamp.toString())
                            .put("webhook-signature", futureSignature)
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Wrong secret should throw
        assertThatThrownBy {
                client.webhooks().verifySignature(payload, headers, "whsec_aaaaaaaaaa")
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Bad signature (signed with different payload) should throw
        val badSignature = signPayload(webhookId, timestamp, "some other payload")
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", webhookTimestamp)
                            .put("webhook-signature", badSignature)
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Wrong message ID should throw
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        headers.toBuilder().replace("webhook-id", listOf("wrong")).build(),
                        null,
                    )
            }
            .isInstanceOf(LithicWebhookException::class.java)
    }

    @Test
    fun parse() {
        val timestamp = Instant.now().epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret(webhookSecret)
                .build()

        val payload = """{"card_token":"card_Ao6kQgjenC6H2bSd","event_type":"card.created"}"""
        val msgId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val signature = signPayload(msgId, timestamp, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", msgId)
                .put("webhook-timestamp", timestamp.toString())
                .put("webhook-signature", signature)
                .build()

        val event = client.webhooks().parse(payload, headers, null)

        assertThat(event.isCardCreated()).isTrue()
        assertThat(event.cardCreated()).isPresent
        assertThat(event.cardCreated().get().cardToken()).isEqualTo("card_Ao6kQgjenC6H2bSd")
        assertThat(event.asCardCreated().cardToken()).isEqualTo("card_Ao6kQgjenC6H2bSd")

        // Verify other event types are not present
        assertThat(event.isCardTransactionUpdated()).isFalse()
        assertThat(event.isDisputeUpdated()).isFalse()
    }

    @Test
    fun parseUnsafe() {
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .build()

        val payload = """{"card_token":"card_Ao6kQgjenC6H2bSd","event_type":"card.created"}"""

        val event = client.webhooks().parseUnsafe(payload)

        assertThat(event.isCardCreated()).isTrue()
        assertThat(event.asCardCreated().cardToken()).isEqualTo("card_Ao6kQgjenC6H2bSd")
    }
}
