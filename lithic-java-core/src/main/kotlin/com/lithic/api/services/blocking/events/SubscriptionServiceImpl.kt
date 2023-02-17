package com.lithic.api.services.blocking.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventsSubscriptionCreateParams
import com.lithic.api.models.EventsSubscriptionDeleteParams
import com.lithic.api.models.EventsSubscriptionListPage
import com.lithic.api.models.EventsSubscriptionListParams
import com.lithic.api.models.EventsSubscriptionRecoverParams
import com.lithic.api.models.EventsSubscriptionReplayMissingParams
import com.lithic.api.models.EventsSubscriptionRetrieveParams
import com.lithic.api.models.EventsSubscriptionRetrieveSecretParams
import com.lithic.api.models.EventsSubscriptionRotateSecretParams
import com.lithic.api.models.EventsSubscriptionUpdateParams
import com.lithic.api.models.SubscriptionRetrieveSecretResponse
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class SubscriptionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SubscriptionService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new event subscription. */
    override fun create(
        params: EventsSubscriptionCreateParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an event subscription. */
    override fun retrieve(
        params: EventsSubscriptionRetrieveParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an event subscription. */
    override fun update(
        params: EventsSubscriptionUpdateParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EventsSubscriptionListPage.Response> =
        jsonHandler<EventsSubscriptionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the event subscriptions. */
    override fun list(
        params: EventsSubscriptionListParams,
        requestOptions: RequestOptions
    ): EventsSubscriptionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EventsSubscriptionListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete an event subscription. */
    override fun delete(params: EventsSubscriptionDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { deleteHandler.handle(it) }
        }
    }

    private val recoverHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Resend all failed messages since a given time. */
    override fun recover(params: EventsSubscriptionRecoverParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions", params.getPathParam(0), "recover")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { recoverHandler.handle(it) }
        }
    }

    private val replayMissingHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent.
     */
    override fun replayMissing(
        params: EventsSubscriptionReplayMissingParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions", params.getPathParam(0), "replay_missing")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { replayMissingHandler.handle(it) }
        }
    }

    private val retrieveSecretHandler: Handler<SubscriptionRetrieveSecretResponse> =
        jsonHandler<SubscriptionRetrieveSecretResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the secret for an event subscription. */
    override fun retrieveSecret(
        params: EventsSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions
    ): SubscriptionRetrieveSecretResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions", params.getPathParam(0), "secret")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveSecretHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val rotateSecretHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    override fun rotateSecret(
        params: EventsSubscriptionRotateSecretParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions", params.getPathParam(0), "secret", "rotate")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { rotateSecretHandler.handle(it) }
        }
    }
}
