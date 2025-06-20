// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.JsonValue

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPage
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPage
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.blocking.events.EventSubscriptionService
import com.lithic.api.services.blocking.events.SubscriptionService
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    fun subscriptions(): SubscriptionService

    fun eventSubscriptions(): EventSubscriptionService

    /** Get an event. */
    fun retrieve(eventToken: String): Event = retrieve(eventToken, EventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event = retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): Event = retrieve(eventToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** @see [retrieve] */
    fun retrieve(params: EventRetrieveParams): Event = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(eventToken: String, requestOptions: RequestOptions): Event =
        retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

    /** List all events. */
    fun list(): EventListPage = list(EventListParams.none())

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** @see [list] */
    fun list(params: EventListParams = EventListParams.none()): EventListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /** List all the message attempts for a given event. */
    fun listAttempts(eventToken: String): EventListAttemptsPage =
        listAttempts(eventToken, EventListAttemptsParams.none())

    /** @see [listAttempts] */
    fun listAttempts(
        eventToken: String,
        params: EventListAttemptsParams = EventListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListAttemptsPage =
        listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [listAttempts] */
    fun listAttempts(
        eventToken: String,
        params: EventListAttemptsParams = EventListAttemptsParams.none(),
    ): EventListAttemptsPage = listAttempts(eventToken, params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListAttemptsPage

    /** @see [listAttempts] */
    fun listAttempts(params: EventListAttemptsParams): EventListAttemptsPage =
        listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(eventToken: String, requestOptions: RequestOptions): EventListAttemptsPage =
        listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)

    fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun eventSubscriptions(): EventSubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}`, but is otherwise the same
         * as [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(eventToken: String): HttpResponseFor<Event> =
            retrieve(eventToken, EventRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventToken: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event> =
            retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            eventToken: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): HttpResponseFor<Event> = retrieve(eventToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): HttpResponseFor<Event> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(eventToken: String, requestOptions: RequestOptions): HttpResponseFor<Event> =
            retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListPage> = list(EventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}/attempts`, but is otherwise
         * the same as [EventService.listAttempts].
         */
        @MustBeClosed
        fun listAttempts(eventToken: String): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(eventToken, EventListAttemptsParams.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventToken: String,
            params: EventListAttemptsParams = EventListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventToken: String,
            params: EventListAttemptsParams = EventListAttemptsParams.none(),
        ): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(eventToken, params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListAttemptsPage>

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(params: EventListAttemptsParams): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            eventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)
    }
}
