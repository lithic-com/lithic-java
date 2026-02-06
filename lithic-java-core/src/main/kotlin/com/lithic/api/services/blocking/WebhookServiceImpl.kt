// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.UnwrapWebhookParams
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.errors.LithicWebhookException
import com.lithic.api.models.ParsedWebhookEvent
import com.standardwebhooks.Webhook
import com.standardwebhooks.exceptions.WebhookVerificationException
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

    override fun parsed(body: String): ParsedWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<ParsedWebhookEvent>())
        } catch (e: Exception) {
            throw LithicInvalidDataException("Error parsing body", e)
        }

    override fun parsed(unwrapParams: UnwrapWebhookParams): ParsedWebhookEvent {
        val headers = unwrapParams.headers().getOrNull()
        if (headers != null) {
            try {
                val webhookSecret =
                    checkRequired(
                        "webhookSecret",
                        unwrapParams.secret().getOrNull()
                            ?: clientOptions.webhookSecret().getOrNull(),
                    )
                val headersMap =
                    headers.names().associateWith { name -> headers.values(name) }.toMap()

                val webhook = Webhook(webhookSecret)
                webhook.verify(unwrapParams.body(), headersMap)
            } catch (e: WebhookVerificationException) {
                throw LithicWebhookException("Could not verify webhook event signature", e)
            }
        }
        return parsed(unwrapParams.body())
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
