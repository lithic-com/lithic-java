// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.UnwrapWebhookParams
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicWebhookException
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceAsyncTest {

    @Test
    fun parsed() {
        val client = LithicOkHttpClientAsync.builder().apiKey("My Lithic API Key").build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"account_token\":\"00000000-0000-0000-0000-000000000002\",\"card_token\":\"00000000-0000-0000-0000-000000000001\",\"created\":\"2023-09-18T12:34:56Z\",\"digital_wallet_token_metadata\":{\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"+15555555555\"},\"pan_unique_reference\":\"pan_unique_ref_1234567890123456789012345678\",\"payment_account_reference\":\"ref_1234567890123456789012\",\"token_unique_reference\":\"token_unique_ref_1234567890123456789012345678\"},\"status\":\"Pending\",\"payment_app_instance_id\":\"app_instance_123456789012345678901234567890\",\"token_requestor_id\":\"12345678901\",\"token_requestor_name\":\"APPLE_PAY\"},\"event_type\":\"digital_wallet.tokenization_approval_request\",\"issuer_decision\":\"APPROVED\",\"tokenization_channel\":\"DIGITAL_WALLET\",\"tokenization_token\":\"tok_1234567890abcdef\",\"wallet_decisioning_info\":{\"account_score\":\"100\",\"device_score\":\"100\",\"recommended_decision\":\"Decision1\",\"recommendation_reasons\":[\"Reason1\"]},\"customer_tokenization_decision\":{\"outcome\":\"APPROVED\",\"responder_url\":\"https://example.com\",\"latency\":\"100\",\"response_code\":\"123456\"},\"device\":{\"imei\":\"123456789012345\",\"ip_address\":\"1.1.1.1\",\"location\":\"37.3860517/-122.0838511\"},\"rule_results\":[{\"auth_rule_token\":\"550e8400-e29b-41d4-a716-446655440003\",\"explanation\":\"Account risk too high\",\"name\":\"CustomerAccountRule\",\"result\":\"DECLINED\"}],\"tokenization_decline_reasons\":[\"ACCOUNT_SCORE_1\"],\"tokenization_source\":\"PUSH_PROVISION\",\"tokenization_tfa_reasons\":[\"WALLET_RECOMMENDED_TFA\"]}"
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

        // Correct key should not throw
        webhookServiceAsync.parsed(
            UnwrapWebhookParams.builder()
                .body(payload)
                .headers(headers)
                .secret(webhookSecret)
                .build()
        )
        webhookServiceAsync
            .withOptions { it.webhookSecret(webhookSecret) }
            .parsed(UnwrapWebhookParams.builder().body(payload).headers(headers).build())

        // Secret in method takes precedence to secret on client
        val wrongKey = "whsec_aaaaaaaaaa"
        webhookServiceAsync
            .withOptions { it.webhookSecret(wrongKey) }
            .parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(webhookSecret)
                    .build()
            )

        // Wrong key should throw
        assertThrows<LithicWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<LithicWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync
                .withOptions { it.webhookSecret(wrongKey) }
                .parsed(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        assertThrows<LithicWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<LithicWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync
                .withOptions { it.webhookSecret(wrongKey) }
                .parsed(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        // Bad signature should throw
        assertThrows<LithicWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookServiceAsync.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<LithicWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookServiceAsync
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsed(UnwrapWebhookParams.builder().body(payload).headers(badHeaders).build())
        }

        // Old timestamp should throw
        assertThrows<LithicWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookServiceAsync.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<LithicWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookServiceAsync
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsed(UnwrapWebhookParams.builder().body(payload).headers(oldHeaders).build())
        }

        // Wrong message ID should throw
        assertThrows<LithicWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookServiceAsync.parsed(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<LithicWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookServiceAsync
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsed(UnwrapWebhookParams.builder().body(payload).headers(wrongIdHeaders).build())
        }
    }
}
