// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.IpRangeRetrieveParams
import com.lithic.api.models.IpRangeRetrieveResponse
import java.util.function.Consumer

interface IpRangeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeService

    /**
     * Returns the IP addresses Lithic sends responder requests from (Auth Stream Access, 3DS
     * decisioning, and tokenization decisioning), so you can allowlist them in your firewall. Each
     * environment returns its own set of addresses. Lithic announces new addresses at least 30 days
     * before sending traffic from them. Event webhooks are not sent from these addresses
     */
    fun retrieve(): IpRangeRetrieveResponse = retrieve(IpRangeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: IpRangeRetrieveParams = IpRangeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRangeRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: IpRangeRetrieveParams = IpRangeRetrieveParams.none()
    ): IpRangeRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): IpRangeRetrieveResponse =
        retrieve(IpRangeRetrieveParams.none(), requestOptions)

    /** A view of [IpRangeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/ip_ranges`, but is otherwise the same as
         * [IpRangeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<IpRangeRetrieveResponse> =
            retrieve(IpRangeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpRangeRetrieveParams = IpRangeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRangeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpRangeRetrieveParams = IpRangeRetrieveParams.none()
        ): HttpResponseFor<IpRangeRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<IpRangeRetrieveResponse> =
            retrieve(IpRangeRetrieveParams.none(), requestOptions)
    }
}
