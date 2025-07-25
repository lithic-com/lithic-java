// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionDeleteParams
import com.lithic.api.models.EventSubscriptionListAttemptsPage
import com.lithic.api.models.EventSubscriptionListAttemptsPageResponse
import com.lithic.api.models.EventSubscriptionListAttemptsParams
import com.lithic.api.models.EventSubscriptionListPage
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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService =
        SubscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // post /v1/event_subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // get /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // patch /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions,
    ): EventSubscriptionListPage =
        // get /v1/event_subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EventSubscriptionDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions,
    ): EventSubscriptionListAttemptsPage =
        // get /v1/event_subscriptions/{event_subscription_token}/attempts
        withRawResponse().listAttempts(params, requestOptions).parse()

    override fun recover(params: EventSubscriptionRecoverParams, requestOptions: RequestOptions) {
        // post /v1/event_subscriptions/{event_subscription_token}/recover
        withRawResponse().recover(params, requestOptions)
    }

    override fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/event_subscriptions/{event_subscription_token}/replay_missing
        withRawResponse().replayMissing(params, requestOptions)
    }

    override fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveSecretResponse =
        // get /v1/event_subscriptions/{event_subscription_token}/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/event_subscriptions/{event_subscription_token}/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions)
    }

    override fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/simulate/event_subscriptions/{event_subscription_token}/send_example
        withRawResponse().sendSimulatedExample(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse =
            SubscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EventSubscriptionListPageResponse> =
            jsonHandler<EventSubscriptionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventSubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscriptionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EventSubscriptionListPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAttemptsHandler: Handler<EventSubscriptionListAttemptsPageResponse> =
            jsonHandler<EventSubscriptionListAttemptsPageResponse>(clientOptions.jsonMapper)

        override fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "attempts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAttemptsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EventSubscriptionListAttemptsPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val recoverHandler: Handler<Void?> = emptyHandler()

        override fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { recoverHandler.handle(it) }
            }
        }

        private val replayMissingHandler: Handler<Void?> = emptyHandler()

        override fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { replayMissingHandler.handle(it) }
            }
        }

        private val retrieveSecretHandler: Handler<SubscriptionRetrieveSecretResponse> =
            jsonHandler<SubscriptionRetrieveSecretResponse>(clientOptions.jsonMapper)

        override fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "secret")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<Void?> = emptyHandler()

        override fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { rotateSecretHandler.handle(it) }
            }
        }

        private val sendSimulatedExampleHandler: Handler<Void?> = emptyHandler()

        override fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendSimulatedExampleHandler.handle(it) }
            }
        }
    }
}
