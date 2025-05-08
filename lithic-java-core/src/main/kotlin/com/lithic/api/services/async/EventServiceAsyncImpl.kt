// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPageAsync
import com.lithic.api.models.EventListAttemptsPageResponse
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListPageResponse
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.EventSubscriptionServiceAsync
import com.lithic.api.services.async.events.EventSubscriptionServiceAsyncImpl
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val eventSubscriptions: EventSubscriptionServiceAsync by lazy {
        EventSubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun eventSubscriptions(): EventSubscriptionServiceAsync = eventSubscriptions

    override fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Event> =
        // get /v1/events/{event_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventListPageAsync> =
        // get /v1/events
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventListAttemptsPageAsync> =
        // get /v1/events/{event_token}/attempts
        withRawResponse().listAttempts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventSubscriptions: EventSubscriptionServiceAsync.WithRawResponse by lazy {
            EventSubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun eventSubscriptions(): EventSubscriptionServiceAsync.WithRawResponse =
            eventSubscriptions

        private val retrieveHandler: Handler<Event> =
            jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Event>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventToken", params.eventToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EventListPageResponse> =
            jsonHandler<EventListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EventListPageAsync.builder()
                                    .service(EventServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listAttemptsHandler: Handler<EventListAttemptsPageResponse> =
            jsonHandler<EventListAttemptsPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventToken", params.eventToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "events", params._pathParam(0), "attempts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listAttemptsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EventListAttemptsPageAsync.builder()
                                    .service(EventServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
