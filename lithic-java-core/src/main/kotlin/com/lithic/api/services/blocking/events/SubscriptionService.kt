// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.events

import com.lithic.api.core.RequestOptions
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

interface SubscriptionService {

    /** Create a new event subscription. */
    @JvmOverloads
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    @JvmOverloads
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Update an event subscription. */
    @JvmOverloads
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    @JvmOverloads
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPage

    /** List all the event subscriptions. */
    fun list(requestOptions: RequestOptions): EventSubscriptionListPage =
        list(EventSubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    @JvmOverloads
    fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all the message attempts for a given event subscription. */
    @JvmOverloads
    fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPage

    /** Resend all failed messages since a given time. */
    @JvmOverloads
    fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    @JvmOverloads
    fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the secret for an event subscription. */
    @JvmOverloads
    fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    @JvmOverloads
    fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an example message for event. */
    @JvmOverloads
    fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
