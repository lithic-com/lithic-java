// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FundingEventListPageAsync
import com.lithic.api.models.FundingEventListParams
import com.lithic.api.models.FundingEventRetrieveDetailsParams
import com.lithic.api.models.FundingEventRetrieveDetailsResponse
import com.lithic.api.models.FundingEventRetrieveParams
import com.lithic.api.models.FundingEventRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FundingEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FundingEventServiceAsync

    /** Get funding event for program by id */
    fun retrieve(fundingEventToken: String): CompletableFuture<FundingEventRetrieveResponse> =
        retrieve(fundingEventToken, FundingEventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundingEventRetrieveResponse> =
        retrieve(params.toBuilder().fundingEventToken(fundingEventToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
    ): CompletableFuture<FundingEventRetrieveResponse> =
        retrieve(fundingEventToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FundingEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundingEventRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: FundingEventRetrieveParams
    ): CompletableFuture<FundingEventRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FundingEventRetrieveResponse> =
        retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

    /** Get all funding events for program */
    fun list(): CompletableFuture<FundingEventListPageAsync> = list(FundingEventListParams.none())

    /** @see [list] */
    fun list(
        params: FundingEventListParams = FundingEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundingEventListPageAsync>

    /** @see [list] */
    fun list(
        params: FundingEventListParams = FundingEventListParams.none()
    ): CompletableFuture<FundingEventListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<FundingEventListPageAsync> =
        list(FundingEventListParams.none(), requestOptions)

    /** Get funding event details by id */
    fun retrieveDetails(
        fundingEventToken: String
    ): CompletableFuture<FundingEventRetrieveDetailsResponse> =
        retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundingEventRetrieveDetailsResponse> =
        retrieveDetails(
            params.toBuilder().fundingEventToken(fundingEventToken).build(),
            requestOptions,
        )

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
    ): CompletableFuture<FundingEventRetrieveDetailsResponse> =
        retrieveDetails(fundingEventToken, params, RequestOptions.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundingEventRetrieveDetailsResponse>

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams
    ): CompletableFuture<FundingEventRetrieveDetailsResponse> =
        retrieveDetails(params, RequestOptions.none())

    /** @see [retrieveDetails] */
    fun retrieveDetails(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FundingEventRetrieveDetailsResponse> =
        retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none(), requestOptions)

    /**
     * A view of [FundingEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): FundingEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}`, but is
         * otherwise the same as [FundingEventServiceAsync.retrieve].
         */
        fun retrieve(
            fundingEventToken: String
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>> =
            retrieve(fundingEventToken, FundingEventRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            fundingEventToken: String,
            params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>> =
            retrieve(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            fundingEventToken: String,
            params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>> =
            retrieve(fundingEventToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: FundingEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: FundingEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveResponse>> =
            retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events`, but is otherwise the same as
         * [FundingEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FundingEventListPageAsync>> =
            list(FundingEventListParams.none())

        /** @see [list] */
        fun list(
            params: FundingEventListParams = FundingEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventListPageAsync>>

        /** @see [list] */
        fun list(
            params: FundingEventListParams = FundingEventListParams.none()
        ): CompletableFuture<HttpResponseFor<FundingEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FundingEventListPageAsync>> =
            list(FundingEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}/details`,
         * but is otherwise the same as [FundingEventServiceAsync.retrieveDetails].
         */
        fun retrieveDetails(
            fundingEventToken: String
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>> =
            retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none())

        /** @see [retrieveDetails] */
        fun retrieveDetails(
            fundingEventToken: String,
            params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>> =
            retrieveDetails(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieveDetails] */
        fun retrieveDetails(
            fundingEventToken: String,
            params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>> =
            retrieveDetails(fundingEventToken, params, RequestOptions.none())

        /** @see [retrieveDetails] */
        fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>>

        /** @see [retrieveDetails] */
        fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>> =
            retrieveDetails(params, RequestOptions.none())

        /** @see [retrieveDetails] */
        fun retrieveDetails(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FundingEventRetrieveDetailsResponse>> =
            retrieveDetails(
                fundingEventToken,
                FundingEventRetrieveDetailsParams.none(),
                requestOptions,
            )
    }
}
