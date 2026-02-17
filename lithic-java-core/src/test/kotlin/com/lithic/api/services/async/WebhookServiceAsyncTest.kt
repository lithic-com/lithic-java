// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicWebhookException
import com.standardwebhooks.Webhook
import java.time.Instant
import org.assertj.core.api.Assertions.assertThatCode
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    private val webhookSecret = "whsec_c2VjcmV0Cg=="

    @Test
    fun verifySignature() {
        val client =
            LithicOkHttpClientAsync.builder()
                .apiKey("test-api-key")
                .webhookSecret(webhookSecret)
                .build()

        val payload =
            "{\"event_type\":\"account_holder.created\",\"token\":\"00000000-0000-0000-0000-000000000001\"}"
        val messageId = "msg_1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .put("webhook-id", messageId)
                .put("webhook-timestamp", timestampSeconds.toString())
                .put("webhook-signature", signature)
                .build()

        // Valid signature should not throw
        assertThatCode {
                client.webhooks().verifySignature(payload, headers, null)
            }
            .doesNotThrowAnyException()

        // Wrong key should throw
        assertThatThrownBy {
                client.webhooks().verifySignature(payload, headers, "whsec_aaaaaaaaaa")
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Bad signature should throw
        val badSignature = webhook.sign(messageId, timestampSeconds, "some other payload")
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        headers.toBuilder().replace("webhook-signature", listOf(badSignature)).build(),
                        null,
                    )
            }
            .isInstanceOf(LithicWebhookException::class.java)

        // Old timestamp should throw
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        headers.toBuilder().replace("webhook-timestamp", listOf("5")).build(),
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
}
