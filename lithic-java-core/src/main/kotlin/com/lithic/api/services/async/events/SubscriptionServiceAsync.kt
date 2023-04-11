@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.events

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventsSubscriptionCreateParams
import com.lithic.api.models.EventsSubscriptionDeleteParams
import com.lithic.api.models.EventsSubscriptionListPageAsync
import com.lithic.api.models.EventsSubscriptionListParams
import com.lithic.api.models.EventsSubscriptionRecoverParams
import com.lithic.api.models.EventsSubscriptionReplayMissingParams
import com.lithic.api.models.EventsSubscriptionRetrieveParams
import com.lithic.api.models.EventsSubscriptionRetrieveSecretParams
import com.lithic.api.models.EventsSubscriptionRotateSecretParams
import com.lithic.api.models.EventsSubscriptionUpdateParams
import com.lithic.api.models.SubscriptionRetrieveSecretResponse
import java.util.concurrent.CompletableFuture

interface SubscriptionServiceAsync {

    /** Create a new event subscription. */
    @JvmOverloads
    fun create(
        params: EventsSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** Get an event subscription. */
    @JvmOverloads
    fun retrieve(
        params: EventsSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** Update an event subscription. */
    @JvmOverloads
    fun update(
        params: EventsSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** List all the event subscriptions. */
    @JvmOverloads
    fun list(
        params: EventsSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventsSubscriptionListPageAsync>

    /** Delete an event subscription. */
    @JvmOverloads
    fun delete(
        params: EventsSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Resend all failed messages since a given time. */
    @JvmOverloads
    fun recover(
        params: EventsSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent.
     */
    @JvmOverloads
    fun replayMissing(
        params: EventsSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Get the secret for an event subscription. */
    @JvmOverloads
    fun retrieveSecret(
        params: EventsSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionRetrieveSecretResponse>

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    @JvmOverloads
    fun rotateSecret(
        params: EventsSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
