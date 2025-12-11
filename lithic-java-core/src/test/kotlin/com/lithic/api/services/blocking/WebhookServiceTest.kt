// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicException
import com.lithic.api.models.*
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookServiceTest {

    private fun generateSignature(
        secret: String,
        msgId: String,
        timestamp: Long,
        payload: String,
    ): String {
        val whsecret = Base64.getDecoder().decode(secret.removePrefix("whsec_"))
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(whsecret, "HmacSHA256"))
        val signature = mac.doFinal("$msgId.$timestamp.$payload".toByteArray())
        return Base64.getEncoder().encodeToString(signature)
    }

    @Test
    fun unwrap() {
        val now = Instant.now()
        val timestamp = now.epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(now, ZoneOffset.UTC))
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val msgId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val signature =
            generateSignature("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst", msgId, timestamp, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", msgId)
                .put("webhook-timestamp", timestamp.toString())
                .put("webhook-signature", "v1,$signature")
                .build()

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val now = Instant.now()
        val timestamp = now.epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(now, ZoneOffset.UTC))
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val webhookId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val webhookTimestamp = timestamp.toString()
        val webhookSignature =
            generateSignature(
                "whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst",
                webhookId,
                timestamp,
                payload,
            )
        val headers =
            Headers.builder()
                .put("webhook-id", webhookId)
                .put("webhook-timestamp", webhookTimestamp)
                .put("webhook-signature", "v1,$webhookSignature")
                .build()

        // Test timestamp too old (> 5 minutes)
        val oldTimestamp = timestamp - 360 // 6 minutes ago
        val oldSignature =
            generateSignature(
                "whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst",
                webhookId,
                oldTimestamp,
                payload,
            )
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", oldTimestamp.toString())
                            .put("webhook-signature", "v1,$oldSignature")
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Webhook timestamp too old")

        // Test timestamp too new (> 5 minutes in future)
        val futureTimestamp = timestamp + 360 // 6 minutes from now
        val futureSignature =
            generateSignature(
                "whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst",
                webhookId,
                futureTimestamp,
                payload,
            )
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", futureTimestamp.toString())
                            .put("webhook-signature", "v1,$futureSignature")
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Webhook timestamp too new")

        // Test invalid secret format
        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "invalid-secret") }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Invalid webhook secret")

        // Test incorrect signature with valid secret
        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "Zm9v") }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        // Test multiple signatures where one is valid
        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", webhookTimestamp)
                            .put("webhook-signature", "v1,$webhookSignature v1,Zm9v")
                            .build(),
                        null,
                    )
            }
            .doesNotThrowAnyException()

        // Test wrong signature version
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", webhookTimestamp)
                            .put("webhook-signature", "v2,$webhookSignature")
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        // Test multiple signatures where the first is valid (should succeed even if later ones are
        // wrong version)
        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", webhookTimestamp)
                            .put("webhook-signature", "v1,$webhookSignature v2,$webhookSignature")
                            .build(),
                        null,
                    )
            }
            .doesNotThrowAnyException()

        // Test signature without version prefix
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("webhook-id", webhookId)
                            .put("webhook-timestamp", webhookTimestamp)
                            .put("webhook-signature", webhookSignature)
                            .build(),
                        null,
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }

    @Test
    fun parse() {
        val now = Instant.now()
        val timestamp = now.epochSecond
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(now, ZoneOffset.UTC))
                .build()

        val payload = """{"card_token":"card_Ao6kQgjenC6H2bSd","event_type":"card.created"}"""
        val msgId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val signature =
            generateSignature("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst", msgId, timestamp, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", msgId)
                .put("webhook-timestamp", timestamp.toString())
                .put("webhook-signature", "v1,$signature")
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
