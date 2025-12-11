// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.fasterxml.jackson.core.JsonProcessingException
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicException
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.ParsedWebhookEvent
import com.lithic.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue {
        verifySignature(payload, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
        } catch (e: JsonProcessingException) {
            throw LithicException("Invalid event payload", e)
        }
    }

    override fun verifySignature(payload: String, headers: Headers, secret: String?) {
        WebhookServiceImpl(clientOptions).verifySignature(payload, headers, secret)
    }

    /**
     * Parses a webhook event and verifies the signtature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override fun parse(body: String, headers: Headers, secret: String?): ParsedWebhookEvent =
        WebhookServiceImpl(clientOptions).parse(body, headers, secret)

    /**
     * Parses a webhook event without validating the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override fun parseUnsafe(body: String): ParsedWebhookEvent =
        WebhookServiceImpl(clientOptions).parseUnsafe(body)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
