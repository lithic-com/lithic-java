// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionDeleteParams
import com.lithic.api.models.EventSubscriptionListAttemptsPageAsync
import com.lithic.api.models.EventSubscriptionListAttemptsParams
import com.lithic.api.models.EventSubscriptionListPageAsync
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

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new event subscription. */
    fun create(params: EventSubscriptionCreateParams): CompletableFuture<EventSubscription> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Get an event subscription. */
    fun retrieve(eventSubscriptionToken: String): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription> =
        retrieve(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
    ): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** @see [retrieve] */
    fun retrieve(params: EventSubscriptionRetrieveParams): CompletableFuture<EventSubscription> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

    /** Update an event subscription. */
    fun update(
        eventSubscriptionToken: String,
        params: EventSubscriptionUpdateParams,
    ): CompletableFuture<EventSubscription> =
        update(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        eventSubscriptionToken: String,
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription> =
        update(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(params: EventSubscriptionUpdateParams): CompletableFuture<EventSubscription> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** List all the event subscriptions. */
    fun list(): CompletableFuture<EventSubscriptionListPageAsync> =
        list(EventSubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListPageAsync>

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none()
    ): CompletableFuture<EventSubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventSubscriptionListPageAsync> =
        list(EventSubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    fun delete(eventSubscriptionToken: String): CompletableFuture<Void?> =
        delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none())

    /** @see [delete] */
    fun delete(
        eventSubscriptionToken: String,
        params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [delete] */
    fun delete(
        eventSubscriptionToken: String,
        params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: EventSubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

    /** List all the message attempts for a given event subscription. */
    fun listAttempts(
        eventSubscriptionToken: String
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(eventSubscriptionToken, EventSubscriptionListAttemptsParams.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync>

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(
            eventSubscriptionToken,
            EventSubscriptionListAttemptsParams.none(),
            requestOptions,
        )

    /** Resend all failed messages since a given time. */
    fun recover(eventSubscriptionToken: String): CompletableFuture<Void?> =
        recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none())

    /** @see [recover] */
    fun recover(
        eventSubscriptionToken: String,
        params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        recover(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [recover] */
    fun recover(
        eventSubscriptionToken: String,
        params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
    ): CompletableFuture<Void?> = recover(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [recover] */
    fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [recover] */
    fun recover(params: EventSubscriptionRecoverParams): CompletableFuture<Void?> =
        recover(params, RequestOptions.none())

    /** @see [recover] */
    fun recover(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    fun replayMissing(eventSubscriptionToken: String): CompletableFuture<Void?> =
        replayMissing(eventSubscriptionToken, EventSubscriptionReplayMissingParams.none())

    /** @see [replayMissing] */
    fun replayMissing(
        eventSubscriptionToken: String,
        params: EventSubscriptionReplayMissingParams = EventSubscriptionReplayMissingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        replayMissing(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [replayMissing] */
    fun replayMissing(
        eventSubscriptionToken: String,
        params: EventSubscriptionReplayMissingParams = EventSubscriptionReplayMissingParams.none(),
    ): CompletableFuture<Void?> =
        replayMissing(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [replayMissing] */
    fun replayMissing(params: EventSubscriptionReplayMissingParams): CompletableFuture<Void?> =
        replayMissing(params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        replayMissing(
            eventSubscriptionToken,
            EventSubscriptionReplayMissingParams.none(),
            requestOptions,
        )

    /** Get the secret for an event subscription. */
    fun retrieveSecret(
        eventSubscriptionToken: String
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(eventSubscriptionToken, EventSubscriptionRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveSecretParams =
            EventSubscriptionRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveSecretParams = EventSubscriptionRetrieveSecretParams.none(),
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionRetrieveSecretResponse>

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(
            eventSubscriptionToken,
            EventSubscriptionRetrieveSecretParams.none(),
            requestOptions,
        )

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    fun rotateSecret(eventSubscriptionToken: String): CompletableFuture<Void?> =
        rotateSecret(eventSubscriptionToken, EventSubscriptionRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rotateSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [rotateSecret] */
    fun rotateSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
    ): CompletableFuture<Void?> =
        rotateSecret(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [rotateSecret] */
    fun rotateSecret(params: EventSubscriptionRotateSecretParams): CompletableFuture<Void?> =
        rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        rotateSecret(
            eventSubscriptionToken,
            EventSubscriptionRotateSecretParams.none(),
            requestOptions,
        )

    /** Send an example message for event. */
    fun sendSimulatedExample(eventSubscriptionToken: String): CompletableFuture<Void?> =
        sendSimulatedExample(
            eventSubscriptionToken,
            EventSubscriptionSendSimulatedExampleParams.none(),
        )

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        eventSubscriptionToken: String,
        params: EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendSimulatedExample(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        eventSubscriptionToken: String,
        params: EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams.none(),
    ): CompletableFuture<Void?> =
        sendSimulatedExample(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams
    ): CompletableFuture<Void?> = sendSimulatedExample(params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        sendSimulatedExample(
            eventSubscriptionToken,
            EventSubscriptionSendSimulatedExampleParams.none(),
            requestOptions,
        )

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions/{event_subscription_token}`,
         * but is otherwise the same as [SubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            eventSubscriptionToken: String,
            params: EventSubscriptionUpdateParams,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            eventSubscriptionToken: String,
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(eventSubscriptionToken: String): CompletableFuture<HttpResponse> =
            delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            eventSubscriptionToken: String,
            params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            eventSubscriptionToken: String,
            params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> =
            delete(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: EventSubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionServiceAsync.listAttempts].
         */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(eventSubscriptionToken, EventSubscriptionListAttemptsParams.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            params: EventSubscriptionListAttemptsParams =
                EventSubscriptionListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>>

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(
                eventSubscriptionToken,
                EventSubscriptionListAttemptsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionServiceAsync.recover].
         */
        @MustBeClosed
        fun recover(eventSubscriptionToken: String): CompletableFuture<HttpResponse> =
            recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            eventSubscriptionToken: String,
            params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            recover(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            eventSubscriptionToken: String,
            params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
        ): CompletableFuture<HttpResponse> =
            recover(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [recover] */
        @MustBeClosed
        fun recover(params: EventSubscriptionRecoverParams): CompletableFuture<HttpResponse> =
            recover(params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionServiceAsync.replayMissing].
         */
        @MustBeClosed
        fun replayMissing(eventSubscriptionToken: String): CompletableFuture<HttpResponse> =
            replayMissing(eventSubscriptionToken, EventSubscriptionReplayMissingParams.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            eventSubscriptionToken: String,
            params: EventSubscriptionReplayMissingParams =
                EventSubscriptionReplayMissingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            replayMissing(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            eventSubscriptionToken: String,
            params: EventSubscriptionReplayMissingParams =
                EventSubscriptionReplayMissingParams.none(),
        ): CompletableFuture<HttpResponse> =
            replayMissing(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            params: EventSubscriptionReplayMissingParams
        ): CompletableFuture<HttpResponse> = replayMissing(params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            replayMissing(
                eventSubscriptionToken,
                EventSubscriptionReplayMissingParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(eventSubscriptionToken, EventSubscriptionRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveSecretParams =
                EventSubscriptionRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveSecretParams =
                EventSubscriptionRetrieveSecretParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>>

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(
                eventSubscriptionToken,
                EventSubscriptionRetrieveSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionServiceAsync.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(eventSubscriptionToken: String): CompletableFuture<HttpResponse> =
            rotateSecret(eventSubscriptionToken, EventSubscriptionRotateSecretParams.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRotateSecretParams =
                EventSubscriptionRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rotateSecret(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
        ): CompletableFuture<HttpResponse> =
            rotateSecret(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: EventSubscriptionRotateSecretParams
        ): CompletableFuture<HttpResponse> = rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            rotateSecret(
                eventSubscriptionToken,
                EventSubscriptionRotateSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionServiceAsync.sendSimulatedExample].
         */
        @MustBeClosed
        fun sendSimulatedExample(eventSubscriptionToken: String): CompletableFuture<HttpResponse> =
            sendSimulatedExample(
                eventSubscriptionToken,
                EventSubscriptionSendSimulatedExampleParams.none(),
            )

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            eventSubscriptionToken: String,
            params: EventSubscriptionSendSimulatedExampleParams =
                EventSubscriptionSendSimulatedExampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendSimulatedExample(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            eventSubscriptionToken: String,
            params: EventSubscriptionSendSimulatedExampleParams =
                EventSubscriptionSendSimulatedExampleParams.none(),
        ): CompletableFuture<HttpResponse> =
            sendSimulatedExample(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams
        ): CompletableFuture<HttpResponse> = sendSimulatedExample(params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            sendSimulatedExample(
                eventSubscriptionToken,
                EventSubscriptionSendSimulatedExampleParams.none(),
                requestOptions,
            )
    }
}
