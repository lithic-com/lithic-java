// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams

interface AuthenticationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get 3DS Authentication by token */
    fun retrieve(params: ThreeDSAuthenticationRetrieveParams): AuthenticationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationRetrieveResponse

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON).
     */
    fun simulate(params: ThreeDSAuthenticationSimulateParams): AuthenticationSimulateResponse =
        simulate(params, RequestOptions.none())

    /** @see [simulate] */
    fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationSimulateResponse

    /**
     * Endpoint for simulating entering OTP into 3DS Challenge UI. A call to
     * /v1/three_ds_authentication/simulate that resulted in triggered SMS-OTP challenge must
     * precede. Only a single attempt is supported; upon entering OTP, the challenge is either
     * approved or declined.
     */
    fun simulateOtpEntry(params: ThreeDSAuthenticationSimulateOtpEntryParams) =
        simulateOtpEntry(params, RequestOptions.none())

    /** @see [simulateOtpEntry] */
    fun simulateOtpEntry(
        params: ThreeDSAuthenticationSimulateOtpEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
            params: ThreeDSAuthenticationRetrieveParams
        ): HttpResponseFor<AuthenticationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_authentication/simulate`, but is
         * otherwise the same as [AuthenticationService.simulate].
         */
        @MustBeClosed
        fun simulate(
            params: ThreeDSAuthenticationSimulateParams
        ): HttpResponseFor<AuthenticationSimulateResponse> = simulate(params, RequestOptions.none())

        /** @see [simulate] */
        @MustBeClosed
        fun simulate(
            params: ThreeDSAuthenticationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationSimulateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/enter_otp`, but
         * is otherwise the same as [AuthenticationService.simulateOtpEntry].
         */
        @MustBeClosed
        fun simulateOtpEntry(params: ThreeDSAuthenticationSimulateOtpEntryParams): HttpResponse =
            simulateOtpEntry(params, RequestOptions.none())

        /** @see [simulateOtpEntry] */
        @MustBeClosed
        fun simulateOtpEntry(
            params: ThreeDSAuthenticationSimulateOtpEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
