// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.models.EventEventSubscriptionResendParams
import java.util.concurrent.CompletableFuture

interface EventSubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Resend an event to an event subscription. */
    fun resend(
        eventSubscriptionToken: String,
        params: EventEventSubscriptionResendParams,
    ): CompletableFuture<Void?> = resend(eventSubscriptionToken, params, RequestOptions.none())

    /** @see [resend] */
    fun resend(
        eventSubscriptionToken: String,
        params: EventEventSubscriptionResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resend(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [resend] */
    fun resend(params: EventEventSubscriptionResendParams): CompletableFuture<Void?> =
        resend(params, RequestOptions.none())

    /** @see [resend] */
    fun resend(
        params: EventEventSubscriptionResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EventSubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/events/{event_token}/event_subscriptions/{event_subscription_token}/resend`, but is
         * otherwise the same as [EventSubscriptionServiceAsync.resend].
         */
        fun resend(
            eventSubscriptionToken: String,
            params: EventEventSubscriptionResendParams,
        ): CompletableFuture<HttpResponse> =
            resend(eventSubscriptionToken, params, RequestOptions.none())

        /** @see [resend] */
        fun resend(
            eventSubscriptionToken: String,
            params: EventEventSubscriptionResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resend(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [resend] */
        fun resend(params: EventEventSubscriptionResendParams): CompletableFuture<HttpResponse> =
            resend(params, RequestOptions.none())

        /** @see [resend] */
        fun resend(
            params: EventEventSubscriptionResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
