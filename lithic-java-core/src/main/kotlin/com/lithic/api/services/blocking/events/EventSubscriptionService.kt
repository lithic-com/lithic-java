// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.models.EventEventSubscriptionResendParams
import java.util.function.Consumer

interface EventSubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventSubscriptionService

    /** Resend an event to an event subscription. */
    fun resend(eventSubscriptionToken: String, params: EventEventSubscriptionResendParams) =
        resend(eventSubscriptionToken, params, RequestOptions.none())

    /** @see resend */
    fun resend(
        eventSubscriptionToken: String,
        params: EventEventSubscriptionResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        resend(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see resend */
    fun resend(params: EventEventSubscriptionResendParams) = resend(params, RequestOptions.none())

    /** @see resend */
    fun resend(
        params: EventEventSubscriptionResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [EventSubscriptionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventSubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/events/{event_token}/event_subscriptions/{event_subscription_token}/resend`, but is
         * otherwise the same as [EventSubscriptionService.resend].
         */
        @MustBeClosed
        fun resend(
            eventSubscriptionToken: String,
            params: EventEventSubscriptionResendParams,
        ): HttpResponse = resend(eventSubscriptionToken, params, RequestOptions.none())

        /** @see resend */
        @MustBeClosed
        fun resend(
            eventSubscriptionToken: String,
            params: EventEventSubscriptionResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            resend(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see resend */
        @MustBeClosed
        fun resend(params: EventEventSubscriptionResendParams): HttpResponse =
            resend(params, RequestOptions.none())

        /** @see resend */
        @MustBeClosed
        fun resend(
            params: EventEventSubscriptionResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
