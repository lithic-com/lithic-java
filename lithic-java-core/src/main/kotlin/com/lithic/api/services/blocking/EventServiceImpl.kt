// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPage
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPage
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.blocking.events.SubscriptionService
import com.lithic.api.services.blocking.events.SubscriptionServiceImpl

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions): Event =
        // get /v1/events/{event_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage =
        // get /v1/events
        withRawResponse().list(params, requestOptions).parse()

    override fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions,
    ): EventListAttemptsPage =
        // get /v1/events/{event_token}/attempts
        withRawResponse().listAttempts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        private val retrieveHandler: Handler<Event> =
            jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Event> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EventListPage.Response> =
            jsonHandler<EventListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { EventListPage.of(EventServiceImpl(clientOptions), params, it) }
            }
        }

        private val listAttemptsHandler: Handler<EventListAttemptsPage.Response> =
            jsonHandler<EventListAttemptsPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListAttemptsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events", params.getPathParam(0), "attempts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listAttemptsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { EventListAttemptsPage.of(EventServiceImpl(clientOptions), params, it) }
            }
        }
    }

    override fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "events",
                    eventToken,
                    "event_subscriptions",
                    eventSubscriptionToken,
                    "resend",
                )
                .body(json(clientOptions.jsonMapper, body))
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { emptyHandler().handle(it) }
        }
    }
}
