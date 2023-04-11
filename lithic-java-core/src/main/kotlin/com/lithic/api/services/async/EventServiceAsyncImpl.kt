package com.lithic.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.core.JsonValue
import com.lithic.api.models.Event
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.models.EventSubscription
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsyncImpl

class EventServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : EventServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionServiceAsync by lazy { SubscriptionServiceAsyncImpl(clientOptions) }

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    private val retrieveHandler: Handler<Event> =
    jsonHandler<Event>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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

    override fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue): CompletableFuture<Void> {
      val request =
          HttpRequest.builder()
              .method(HttpMethod.POST)
              .addPathSegments("events", eventToken, "event_subscriptions", eventSubscriptionToken, "resend")
              .body(json(clientOptions.jsonMapper, body))
              .build()
      return clientOptions.httpClient.executeAsync(request).thenApply { response ->
          response.let { emptyHandler().handle(it) }
      }
    }
}
