// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.UnwrapWebhookParams
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicWebhookException
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    @Test
    fun parsed() {
        val client = LithicOkHttpClient.builder().apiKey("My Lithic API Key").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"event_type\":\"account_holder.created\",\"token\":\"00000000-0000-0000-0000-000000000001\",\"account_token\":\"00000000-0000-0000-0000-000000000001\",\"created\":\"2019-12-27T18:11:19.117Z\",\"required_documents\":[{\"entity_token\":\"182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e\",\"status_reasons\":[\"string\"],\"valid_documents\":[\"string\"]}],\"status\":\"ACCEPTED\",\"status_reason\":[\"string\"]}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        webhookService.parsed(payload).validate()

        // Wrong key should throw
        assertThrows<LithicWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }

        // Bad signature should throw
        assertThrows<LithicWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Old timestamp should throw
        assertThrows<LithicWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Wrong message ID should throw
        assertThrows<LithicWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
    }
}
