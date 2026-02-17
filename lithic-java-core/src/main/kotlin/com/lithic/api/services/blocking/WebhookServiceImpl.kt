// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicException
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.errors.LithicWebhookException
import com.lithic.api.models.ParsedWebhookEvent
import com.standardwebhooks.Webhook
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue {
        verifySignature(payload, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
        } catch (e: JsonProcessingException) {
            throw LithicException("Invalid event payload", e)
        }
    }

    override fun verifySignature(payload: String, headers: Headers, secret: String?) {
        val webhookSecret =
            secret
                ?: clientOptions.webhookSecret().getOrNull()
                ?: throw LithicException(
                    "The webhook secret must either be set using the env var, LITHIC_WEBHOOK_SECRET, on the client class, or passed to this method"
                )

        try {
            val headersMap =
                headers.names().associateWith { name -> headers.values(name) }

            val webhook = Webhook(webhookSecret)
            webhook.verify(payload, headersMap)
        } catch (e: Exception) {
            throw LithicWebhookException("Could not verify webhook event signature", e)
        }
    }

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override fun parse(body: String, headers: Headers, secret: String?): ParsedWebhookEvent {
        verifySignature(body, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<ParsedWebhookEvent>())
        } catch (e: Exception) {
            throw LithicInvalidDataException("Error parsing body", e)
        }
    }

    /**
     * Unwraps a webhook event from its JSON representation without verifying the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override fun parseUnsafe(body: String): ParsedWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<ParsedWebhookEvent>())
        } catch (e: Exception) {
            throw LithicInvalidDataException("Error parsing body", e)
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
