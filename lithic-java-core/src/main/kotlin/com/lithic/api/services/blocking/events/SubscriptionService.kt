// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.events.EventSubscription
import com.lithic.api.models.events.subscriptions.SubscriptionCreateParams
import com.lithic.api.models.events.subscriptions.SubscriptionDeleteParams
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsPage
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsParams
import com.lithic.api.models.events.subscriptions.SubscriptionListPage
import com.lithic.api.models.events.subscriptions.SubscriptionListParams
import com.lithic.api.models.events.subscriptions.SubscriptionRecoverParams
import com.lithic.api.models.events.subscriptions.SubscriptionReplayMissingParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretResponse
import com.lithic.api.models.events.subscriptions.SubscriptionRotateSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionSendSimulatedExampleParams
import com.lithic.api.models.events.subscriptions.SubscriptionUpdateParams

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new event subscription. */
    fun create(params: SubscriptionCreateParams): EventSubscription =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    fun retrieve(params: SubscriptionRetrieveParams): EventSubscription =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Update an event subscription. */
    fun update(params: SubscriptionUpdateParams): EventSubscription =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    fun list(): SubscriptionListPage = list(SubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see [list] */
    fun list(params: SubscriptionListParams = SubscriptionListParams.none()): SubscriptionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all the message attempts for a given event subscription. */
    fun listAttempts(params: SubscriptionListAttemptsParams): SubscriptionListAttemptsPage =
        listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: SubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListAttemptsPage

    /** Resend all failed messages since a given time. */
    fun recover(params: SubscriptionRecoverParams) = recover(params, RequestOptions.none())

    /** @see [recover] */
    fun recover(
        params: SubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    fun replayMissing(params: SubscriptionReplayMissingParams) =
        replayMissing(params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(
        params: SubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the secret for an event subscription. */
    fun retrieveSecret(
        params: SubscriptionRetrieveSecretParams
    ): SubscriptionRetrieveSecretResponse = retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: SubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    fun rotateSecret(params: SubscriptionRotateSecretParams) =
        rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: SubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an example message for event. */
    fun sendSimulatedExample(params: SubscriptionSendSimulatedExampleParams) =
        sendSimulatedExample(params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        params: SubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<EventSubscription> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions/{event_subscription_token}`,
         * but is otherwise the same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: SubscriptionRetrieveParams): HttpResponseFor<EventSubscription> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponseFor<EventSubscription> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubscriptionListPage> = list(SubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionService.listAttempts].
         */
        @MustBeClosed
        fun listAttempts(
            params: SubscriptionListAttemptsParams
        ): HttpResponseFor<SubscriptionListAttemptsPage> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: SubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListAttemptsPage>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionService.recover].
         */
        @MustBeClosed
        fun recover(params: SubscriptionRecoverParams): HttpResponse =
            recover(params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            params: SubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionService.replayMissing].
         */
        @MustBeClosed
        fun replayMissing(params: SubscriptionReplayMissingParams): HttpResponse =
            replayMissing(params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            params: SubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            params: SubscriptionRetrieveSecretParams
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: SubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(params: SubscriptionRotateSecretParams): HttpResponse =
            rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: SubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionService.sendSimulatedExample].
         */
        @MustBeClosed
        fun sendSimulatedExample(params: SubscriptionSendSimulatedExampleParams): HttpResponse =
            sendSimulatedExample(params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: SubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
