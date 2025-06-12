// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionDeleteParams
import com.lithic.api.models.EventSubscriptionListAttemptsPage
import com.lithic.api.models.EventSubscriptionListAttemptsParams
import com.lithic.api.models.EventSubscriptionListPage
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

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    /** Create a new event subscription. */
    fun create(params: EventSubscriptionCreateParams): EventSubscription =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    fun retrieve(eventSubscriptionToken: String): EventSubscription =
        retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        retrieve(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
    ): EventSubscription = retrieve(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** @see [retrieve] */
    fun retrieve(params: EventSubscriptionRetrieveParams): EventSubscription =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): EventSubscription =
        retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

    /** Update an event subscription. */
    fun update(
        eventSubscriptionToken: String,
        params: EventSubscriptionUpdateParams,
    ): EventSubscription = update(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        eventSubscriptionToken: String,
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        update(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(params: EventSubscriptionUpdateParams): EventSubscription =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    fun list(): EventSubscriptionListPage = list(EventSubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPage

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none()
    ): EventSubscriptionListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventSubscriptionListPage =
        list(EventSubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    fun delete(eventSubscriptionToken: String) =
        delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none())

    /** @see [delete] */
    fun delete(
        eventSubscriptionToken: String,
        params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [delete] */
    fun delete(
        eventSubscriptionToken: String,
        params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
    ) = delete(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    fun delete(params: EventSubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

    /** List all the message attempts for a given event subscription. */
    fun listAttempts(eventSubscriptionToken: String): EventSubscriptionListAttemptsPage =
        listAttempts(eventSubscriptionToken, EventSubscriptionListAttemptsParams.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPage =
        listAttempts(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
    ): EventSubscriptionListAttemptsPage =
        listAttempts(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPage

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams
    ): EventSubscriptionListAttemptsPage = listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): EventSubscriptionListAttemptsPage =
        listAttempts(
            eventSubscriptionToken,
            EventSubscriptionListAttemptsParams.none(),
            requestOptions,
        )

    /** Resend all failed messages since a given time. */
    fun recover(eventSubscriptionToken: String) =
        recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none())

    /** @see [recover] */
    fun recover(
        eventSubscriptionToken: String,
        params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        recover(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [recover] */
    fun recover(
        eventSubscriptionToken: String,
        params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
    ) = recover(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [recover] */
    fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [recover] */
    fun recover(params: EventSubscriptionRecoverParams) = recover(params, RequestOptions.none())

    /** @see [recover] */
    fun recover(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    fun replayMissing(eventSubscriptionToken: String) =
        replayMissing(eventSubscriptionToken, EventSubscriptionReplayMissingParams.none())

    /** @see [replayMissing] */
    fun replayMissing(
        eventSubscriptionToken: String,
        params: EventSubscriptionReplayMissingParams = EventSubscriptionReplayMissingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        replayMissing(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [replayMissing] */
    fun replayMissing(
        eventSubscriptionToken: String,
        params: EventSubscriptionReplayMissingParams = EventSubscriptionReplayMissingParams.none(),
    ) = replayMissing(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [replayMissing] */
    fun replayMissing(params: EventSubscriptionReplayMissingParams) =
        replayMissing(params, RequestOptions.none())

    /** @see [replayMissing] */
    fun replayMissing(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        replayMissing(
            eventSubscriptionToken,
            EventSubscriptionReplayMissingParams.none(),
            requestOptions,
        )

    /** Get the secret for an event subscription. */
    fun retrieveSecret(eventSubscriptionToken: String): SubscriptionRetrieveSecretResponse =
        retrieveSecret(eventSubscriptionToken, EventSubscriptionRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveSecretParams =
            EventSubscriptionRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse =
        retrieveSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveSecretParams = EventSubscriptionRetrieveSecretParams.none(),
    ): SubscriptionRetrieveSecretResponse =
        retrieveSecret(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams
    ): SubscriptionRetrieveSecretResponse = retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveSecretResponse =
        retrieveSecret(
            eventSubscriptionToken,
            EventSubscriptionRetrieveSecretParams.none(),
            requestOptions,
        )

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    fun rotateSecret(eventSubscriptionToken: String) =
        rotateSecret(eventSubscriptionToken, EventSubscriptionRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rotateSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [rotateSecret] */
    fun rotateSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
    ) = rotateSecret(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [rotateSecret] */
    fun rotateSecret(params: EventSubscriptionRotateSecretParams) =
        rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        rotateSecret(
            eventSubscriptionToken,
            EventSubscriptionRotateSecretParams.none(),
            requestOptions,
        )

    /** Send an example message for event. */
    fun sendSimulatedExample(eventSubscriptionToken: String) =
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
    ) =
        sendSimulatedExample(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        eventSubscriptionToken: String,
        params: EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams.none(),
    ) = sendSimulatedExample(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(params: EventSubscriptionSendSimulatedExampleParams) =
        sendSimulatedExample(params, RequestOptions.none())

    /** @see [sendSimulatedExample] */
    fun sendSimulatedExample(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        sendSimulatedExample(
            eventSubscriptionToken,
            EventSubscriptionSendSimulatedExampleParams.none(),
            requestOptions,
        )

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: EventSubscriptionCreateParams): HttpResponseFor<EventSubscription> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions/{event_subscription_token}`,
         * but is otherwise the same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(eventSubscriptionToken: String): HttpResponseFor<EventSubscription> =
            retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            retrieve(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        ): HttpResponseFor<EventSubscription> =
            retrieve(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EventSubscriptionRetrieveParams): HttpResponseFor<EventSubscription> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> =
            retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(
            eventSubscriptionToken: String,
            params: EventSubscriptionUpdateParams,
        ): HttpResponseFor<EventSubscription> =
            update(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            eventSubscriptionToken: String,
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            update(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: EventSubscriptionUpdateParams): HttpResponseFor<EventSubscription> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EventSubscriptionListPage> =
            list(EventSubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none()
        ): HttpResponseFor<EventSubscriptionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventSubscriptionListPage> =
            list(EventSubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(eventSubscriptionToken: String): HttpResponse =
            delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            eventSubscriptionToken: String,
            params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            eventSubscriptionToken: String,
            params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
        ): HttpResponse = delete(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: EventSubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(eventSubscriptionToken: String, requestOptions: RequestOptions): HttpResponse =
            delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionService.listAttempts].
         */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> =
            listAttempts(eventSubscriptionToken, EventSubscriptionListAttemptsParams.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            params: EventSubscriptionListAttemptsParams =
                EventSubscriptionListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> =
            listAttempts(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> =
            listAttempts(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPage>

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventSubscriptionListAttemptsParams
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscriptionListAttemptsPage> =
            listAttempts(
                eventSubscriptionToken,
                EventSubscriptionListAttemptsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionService.recover].
         */
        @MustBeClosed
        fun recover(eventSubscriptionToken: String): HttpResponse =
            recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            eventSubscriptionToken: String,
            params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            recover(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            eventSubscriptionToken: String,
            params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
        ): HttpResponse = recover(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [recover] */
        @MustBeClosed
        fun recover(params: EventSubscriptionRecoverParams): HttpResponse =
            recover(params, RequestOptions.none())

        /** @see [recover] */
        @MustBeClosed
        fun recover(eventSubscriptionToken: String, requestOptions: RequestOptions): HttpResponse =
            recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionService.replayMissing].
         */
        @MustBeClosed
        fun replayMissing(eventSubscriptionToken: String): HttpResponse =
            replayMissing(eventSubscriptionToken, EventSubscriptionReplayMissingParams.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            eventSubscriptionToken: String,
            params: EventSubscriptionReplayMissingParams =
                EventSubscriptionReplayMissingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
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
        ): HttpResponse = replayMissing(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(params: EventSubscriptionReplayMissingParams): HttpResponse =
            replayMissing(params, RequestOptions.none())

        /** @see [replayMissing] */
        @MustBeClosed
        fun replayMissing(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            replayMissing(
                eventSubscriptionToken,
                EventSubscriptionReplayMissingParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(eventSubscriptionToken, EventSubscriptionRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveSecretParams =
                EventSubscriptionRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
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
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse>

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(
                eventSubscriptionToken,
                EventSubscriptionRetrieveSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(eventSubscriptionToken: String): HttpResponse =
            rotateSecret(eventSubscriptionToken, EventSubscriptionRotateSecretParams.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRotateSecretParams =
                EventSubscriptionRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rotateSecret(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
        ): HttpResponse = rotateSecret(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(params: EventSubscriptionRotateSecretParams): HttpResponse =
            rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            rotateSecret(
                eventSubscriptionToken,
                EventSubscriptionRotateSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionService.sendSimulatedExample].
         */
        @MustBeClosed
        fun sendSimulatedExample(eventSubscriptionToken: String): HttpResponse =
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
        ): HttpResponse =
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
        ): HttpResponse =
            sendSimulatedExample(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams
        ): HttpResponse = sendSimulatedExample(params, RequestOptions.none())

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        fun sendSimulatedExample(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            sendSimulatedExample(
                eventSubscriptionToken,
                EventSubscriptionSendSimulatedExampleParams.none(),
                requestOptions,
            )
    }
}
