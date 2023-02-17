package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Event
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsyncImpl
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class EventServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EventServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    private val retrieveHandler: Handler<Event> =
        jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an event. */
    override fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Event> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EventListPageAsync.Response> =
        jsonHandler<EventListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all events. */
    override fun list(
        params: EventListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<EventListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EventListPageAsync.of(this, params, it) }
        }
    }
}
