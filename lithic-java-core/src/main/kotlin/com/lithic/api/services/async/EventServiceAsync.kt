// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPageAsync
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.EventSubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun subscriptions(): SubscriptionServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    /** Get an event. */
    fun retrieve(eventToken: String): CompletableFuture<Event> =
        retrieve(eventToken, EventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event> =
        retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): CompletableFuture<Event> = retrieve(eventToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event>

    /** @see [retrieve] */
    fun retrieve(params: EventRetrieveParams): CompletableFuture<Event> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(eventToken: String, requestOptions: RequestOptions): CompletableFuture<Event> =
        retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

    /** List all events. */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)

    /** List all the message attempts for a given event. */
    fun listAttempts(eventToken: String): CompletableFuture<EventListAttemptsPageAsync> =
        listAttempts(eventToken, EventListAttemptsParams.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventToken: String,
        params: EventListAttemptsParams = EventListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListAttemptsPageAsync> =
        listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [listAttempts] */
    fun listAttempts(
        eventToken: String,
        params: EventListAttemptsParams = EventListAttemptsParams.none(),
    ): CompletableFuture<EventListAttemptsPageAsync> =
        listAttempts(eventToken, params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListAttemptsPageAsync>

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventListAttemptsParams
    ): CompletableFuture<EventListAttemptsPageAsync> = listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventListAttemptsPageAsync> =
        listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        fun eventSubscriptions(): EventSubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}`, but is otherwise the same
         * as [EventServiceAsync.retrieve].
         */
        fun retrieve(eventToken: String): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventToken, EventRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>>

        /** @see [retrieve] */
        fun retrieve(params: EventRetrieveParams): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none())

        /** @see [list] */
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see [list] */
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}/attempts`, but is otherwise
         * the same as [EventServiceAsync.listAttempts].
         */
        fun listAttempts(
            eventToken: String
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> =
            listAttempts(eventToken, EventListAttemptsParams.none())

        /** @see [listAttempts] */
        fun listAttempts(
            eventToken: String,
            params: EventListAttemptsParams = EventListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> =
            listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [listAttempts] */
        fun listAttempts(
            eventToken: String,
            params: EventListAttemptsParams = EventListAttemptsParams.none(),
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> =
            listAttempts(eventToken, params, RequestOptions.none())

        /** @see [listAttempts] */
        fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>>

        /** @see [listAttempts] */
        fun listAttempts(
            params: EventListAttemptsParams
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        fun listAttempts(
            eventToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventListAttemptsPageAsync>> =
            listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)
    }
}
