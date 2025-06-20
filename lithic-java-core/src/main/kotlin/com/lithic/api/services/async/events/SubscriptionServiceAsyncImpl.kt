// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionDeleteParams
import com.lithic.api.models.EventSubscriptionListAttemptsPageAsync
import com.lithic.api.models.EventSubscriptionListAttemptsPageResponse
import com.lithic.api.models.EventSubscriptionListAttemptsParams
import com.lithic.api.models.EventSubscriptionListPageAsync
import com.lithic.api.models.EventSubscriptionListPageResponse
import com.lithic.api.models.EventSubscriptionListParams
import com.lithic.api.models.EventSubscriptionRecoverParams
import com.lithic.api.models.EventSubscriptionReplayMissingParams
import com.lithic.api.models.EventSubscriptionRetrieveParams
import com.lithic.api.models.EventSubscriptionRetrieveSecretParams
import com.lithic.api.models.EventSubscriptionRotateSecretParams
import com.lithic.api.models.EventSubscriptionSendSimulatedExampleParams
import com.lithic.api.models.EventSubscriptionUpdateParams
import com.lithic.api.models.SubscriptionRetrieveSecretResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // post /v1/event_subscriptions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // get /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // patch /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscriptionListPageAsync> =
        // get /v1/event_subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        // get /v1/event_subscriptions/{event_subscription_token}/attempts
        withRawResponse().listAttempts(params, requestOptions).thenApply { it.parse() }

    override fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/event_subscriptions/{event_subscription_token}/recover
        withRawResponse().recover(params, requestOptions).thenAccept {}

    override fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/event_subscriptions/{event_subscription_token}/replay_missing
        withRawResponse().replayMissing(params, requestOptions).thenAccept {}

    override fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        // get /v1/event_subscriptions/{event_subscription_token}/secret
        withRawResponse().retrieveSecret(params, requestOptions).thenApply { it.parse() }

    override fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/event_subscriptions/{event_subscription_token}/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions).thenAccept {}

    override fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/simulate/event_subscriptions/{event_subscription_token}/send_example
        withRawResponse().sendSimulatedExample(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
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

        private val updateHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EventSubscriptionListPageResponse> =
            jsonHandler<EventSubscriptionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EventSubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions")
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
                                EventSubscriptionListPageAsync.builder()
                                    .service(SubscriptionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val listAttemptsHandler: Handler<EventSubscriptionListAttemptsPageResponse> =
            jsonHandler<EventSubscriptionListAttemptsPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "attempts")
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
                                EventSubscriptionListAttemptsPageAsync.builder()
                                    .service(SubscriptionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val recoverHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "recover")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { recoverHandler.handle(it) } }
                }
        }

        private val replayMissingHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "event_subscriptions",
                        params._pathParam(0),
                        "replay_missing",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { replayMissingHandler.handle(it) } }
                }
        }

        private val retrieveSecretHandler: Handler<SubscriptionRetrieveSecretResponse> =
            jsonHandler<SubscriptionRetrieveSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "secret")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveSecretHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "event_subscriptions",
                        params._pathParam(0),
                        "secret",
                        "rotate",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { rotateSecretHandler.handle(it) } }
                }
        }

        private val sendSimulatedExampleHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "simulate",
                        "event_subscriptions",
                        params._pathParam(0),
                        "send_example",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { sendSimulatedExampleHandler.handle(it) } }
                }
        }
    }
}
