// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.events.Event
import com.lithic.api.models.events.EventListAttemptsPage
import com.lithic.api.models.events.EventListAttemptsParams
import com.lithic.api.models.events.EventListPage
import com.lithic.api.models.events.EventListParams
import com.lithic.api.models.events.EventRetrieveParams
import com.lithic.api.services.blocking.events.SubscriptionService

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun subscriptions(): SubscriptionService

    /** Get an event. */
    fun retrieve(params: EventRetrieveParams): Event = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

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
    fun listAttempts(params: EventListAttemptsParams): EventListAttemptsPage =
        listAttempts(params, RequestOptions.none())

    /** @see [listAttempts] */
    fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListAttemptsPage

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}`, but is otherwise the same
         * as [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): HttpResponseFor<Event> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

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
        fun listAttempts(params: EventListAttemptsParams): HttpResponseFor<EventListAttemptsPage> =
            listAttempts(params, RequestOptions.none())

        /** @see [listAttempts] */
        @MustBeClosed
        fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListAttemptsPage>
    }
}
