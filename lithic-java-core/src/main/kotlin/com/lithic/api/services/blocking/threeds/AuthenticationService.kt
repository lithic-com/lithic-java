// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeds

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.threeds.authentication.AuthenticationRetrieveParams
import com.lithic.api.models.threeds.authentication.AuthenticationRetrieveResponse
import com.lithic.api.models.threeds.authentication.AuthenticationSimulateParams
import com.lithic.api.models.threeds.authentication.AuthenticationSimulateResponse

interface AuthenticationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get 3DS Authentication by token */
    fun retrieve(params: AuthenticationRetrieveParams): AuthenticationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationRetrieveResponse

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON).
     */
    fun simulate(params: AuthenticationSimulateParams): AuthenticationSimulateResponse =
        simulate(params, RequestOptions.none())

    /** @see [simulate] */
    fun simulate(
        params: AuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationSimulateResponse

    /**
     * A view of [AuthenticationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/three_ds_authentication/{three_ds_authentication_token}`, but is otherwise the same
         * as [AuthenticationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AuthenticationRetrieveParams
        ): HttpResponseFor<AuthenticationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AuthenticationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_authentication/simulate`, but is
         * otherwise the same as [AuthenticationService.simulate].
         */
        @MustBeClosed
        fun simulate(
            params: AuthenticationSimulateParams
        ): HttpResponseFor<AuthenticationSimulateResponse> = simulate(params, RequestOptions.none())

        /** @see [simulate] */
        @MustBeClosed
        fun simulate(
            params: AuthenticationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationSimulateResponse>
    }
}
