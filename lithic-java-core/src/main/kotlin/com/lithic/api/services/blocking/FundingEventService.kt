// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FundingEventListPage
import com.lithic.api.models.FundingEventListParams
import com.lithic.api.models.FundingEventRetrieveDetailsParams
import com.lithic.api.models.FundingEventRetrieveDetailsResponse
import com.lithic.api.models.FundingEventRetrieveParams
import com.lithic.api.models.FundingEventRetrieveResponse
import java.util.function.Consumer

interface FundingEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FundingEventService

    /** Get funding event for program by id */
    fun retrieve(fundingEventToken: String): FundingEventRetrieveResponse =
        retrieve(fundingEventToken, FundingEventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveResponse =
        retrieve(params.toBuilder().fundingEventToken(fundingEventToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
    ): FundingEventRetrieveResponse = retrieve(fundingEventToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FundingEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: FundingEventRetrieveParams): FundingEventRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveResponse =
        retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

    /** Get all funding events for program */
    fun list(): FundingEventListPage = list(FundingEventListParams.none())

    /** @see [list] */
    fun list(
        params: FundingEventListParams = FundingEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventListPage

    /** @see [list] */
    fun list(params: FundingEventListParams = FundingEventListParams.none()): FundingEventListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): FundingEventListPage =
        list(FundingEventListParams.none(), requestOptions)

    /** Get funding event details by id */
    fun retrieveDetails(fundingEventToken: String): FundingEventRetrieveDetailsResponse =
        retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveDetailsResponse =
        retrieveDetails(
            params.toBuilder().fundingEventToken(fundingEventToken).build(),
            requestOptions,
        )

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
    ): FundingEventRetrieveDetailsResponse =
        retrieveDetails(fundingEventToken, params, RequestOptions.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveDetailsResponse

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams
    ): FundingEventRetrieveDetailsResponse = retrieveDetails(params, RequestOptions.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveDetailsResponse =
        retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none(), requestOptions)

    /**
     * A view of [FundingEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FundingEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}`, but is
         * otherwise the same as [FundingEventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(fundingEventToken: String): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(fundingEventToken, FundingEventRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fundingEventToken: String,
            params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fundingEventToken: String,
            params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
        ): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(fundingEventToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FundingEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FundingEventRetrieveParams
        ): HttpResponseFor<FundingEventRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events`, but is otherwise the same as
         * [FundingEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FundingEventListPage> = list(FundingEventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FundingEventListParams = FundingEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FundingEventListParams = FundingEventListParams.none()
        ): HttpResponseFor<FundingEventListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FundingEventListPage> =
            list(FundingEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}/details`,
         * but is otherwise the same as [FundingEventService.retrieveDetails].
         */
        @MustBeClosed
        fun retrieveDetails(
            fundingEventToken: String
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none())

        /** @see [retrieveDetails] */
        @MustBeClosed
        fun retrieveDetails(
            fundingEventToken: String,
            params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieveDetails] */
        @MustBeClosed
        fun retrieveDetails(
            fundingEventToken: String,
            params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(fundingEventToken, params, RequestOptions.none())

        /** @see [retrieveDetails] */
        @MustBeClosed
        fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse>

        /** @see [retrieveDetails] */
        @MustBeClosed
        fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(params, RequestOptions.none())

        /** @see [retrieveDetails] */
        @MustBeClosed
        fun retrieveDetails(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(
                fundingEventToken,
                FundingEventRetrieveDetailsParams.none(),
                requestOptions,
            )
    }
}
