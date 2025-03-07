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
    fun retrieve(params: EventSubscriptionRetrieveParams): CompletableFuture<EventSubscription> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Update an event subscription. */
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
    fun delete(params: EventSubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List all the message attempts for a given event subscription. */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync> =
        listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListAttemptsPageAsync>

    /** Resend all failed messages since a given time. */
    fun recover(params: EventSubscriptionRecoverParams): CompletableFuture<Void?> =
        recover(params, RequestOptions.none())

    /** @see [recover] */
    fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    fun replayMissing(params: EventSubscriptionReplayMissingParams): CompletableFuture<Void?> =
        replayMissing(params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the secret for an event subscription. */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams
    ): CompletableFuture<SubscriptionRetrieveSecretResponse> =
        retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionRetrieveSecretResponse>

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    fun rotateSecret(params: EventSubscriptionRotateSecretParams): CompletableFuture<Void?> =
        rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Send an example message for event. */
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams
    ): CompletableFuture<Void?> = sendSimulatedExample(params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
            params: EventSubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
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
        fun delete(params: EventSubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionServiceAsync.listAttempts].
         */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListAttemptsPageAsync>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionServiceAsync.recover].
         */
        @MustBeClosed
        fun recover(params: EventSubscriptionRecoverParams): CompletableFuture<HttpResponse> =
            recover(params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionServiceAsync.replayMissing].
         */
        @MustBeClosed
        fun replayMissing(
            params: EventSubscriptionReplayMissingParams
        ): CompletableFuture<HttpResponse> = replayMissing(params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveSecretResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionServiceAsync.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(
            params: EventSubscriptionRotateSecretParams
        ): CompletableFuture<HttpResponse> = rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionServiceAsync.sendSimulatedExample].
         */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams
        ): CompletableFuture<HttpResponse> = sendSimulatedExample(params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
