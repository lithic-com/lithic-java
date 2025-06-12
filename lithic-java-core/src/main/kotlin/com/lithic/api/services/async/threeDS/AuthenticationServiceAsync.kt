// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthenticationServiceAsync

    /** Get 3DS Authentication by token */
    fun retrieve(
        threeDSAuthenticationToken: String
    ): CompletableFuture<AuthenticationRetrieveResponse> =
        retrieve(threeDSAuthenticationToken, ThreeDSAuthenticationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        threeDSAuthenticationToken: String,
        params: ThreeDSAuthenticationRetrieveParams = ThreeDSAuthenticationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationRetrieveResponse> =
        retrieve(
            params.toBuilder().threeDSAuthenticationToken(threeDSAuthenticationToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        threeDSAuthenticationToken: String,
        params: ThreeDSAuthenticationRetrieveParams = ThreeDSAuthenticationRetrieveParams.none(),
    ): CompletableFuture<AuthenticationRetrieveResponse> =
        retrieve(threeDSAuthenticationToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams
    ): CompletableFuture<AuthenticationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        threeDSAuthenticationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationRetrieveResponse> =
        retrieve(
            threeDSAuthenticationToken,
            ThreeDSAuthenticationRetrieveParams.none(),
            requestOptions,
        )

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON). If the
     * authentication decision is to challenge, ensure that the account holder associated with the
     * card transaction has a valid phone number configured to receive the OTP code via SMS.
     */
    fun simulate(
        params: ThreeDSAuthenticationSimulateParams
    ): CompletableFuture<AuthenticationSimulateResponse> = simulate(params, RequestOptions.none())

    /** @see [simulate] */
    fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationSimulateResponse>

    /**
     * Endpoint for simulating entering OTP into 3DS Challenge UI. A call to
     * /v1/three_ds_authentication/simulate that resulted in triggered SMS-OTP challenge must
     * precede. Only a single attempt is supported; upon entering OTP, the challenge is either
     * approved or declined.
     */
    fun simulateOtpEntry(
        params: ThreeDSAuthenticationSimulateOtpEntryParams
    ): CompletableFuture<Void?> = simulateOtpEntry(params, RequestOptions.none())

    /** @see [simulateOtpEntry] */
    fun simulateOtpEntry(
        params: ThreeDSAuthenticationSimulateOtpEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AuthenticationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AuthenticationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/three_ds_authentication/{three_ds_authentication_token}`, but is otherwise the same
         * as [AuthenticationServiceAsync.retrieve].
         */
        fun retrieve(
            threeDSAuthenticationToken: String
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>> =
            retrieve(threeDSAuthenticationToken, ThreeDSAuthenticationRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            threeDSAuthenticationToken: String,
            params: ThreeDSAuthenticationRetrieveParams =
                ThreeDSAuthenticationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>> =
            retrieve(
                params.toBuilder().threeDSAuthenticationToken(threeDSAuthenticationToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            threeDSAuthenticationToken: String,
            params: ThreeDSAuthenticationRetrieveParams = ThreeDSAuthenticationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>> =
            retrieve(threeDSAuthenticationToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            threeDSAuthenticationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationRetrieveResponse>> =
            retrieve(
                threeDSAuthenticationToken,
                ThreeDSAuthenticationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_authentication/simulate`, but is
         * otherwise the same as [AuthenticationServiceAsync.simulate].
         */
        fun simulate(
            params: ThreeDSAuthenticationSimulateParams
        ): CompletableFuture<HttpResponseFor<AuthenticationSimulateResponse>> =
            simulate(params, RequestOptions.none())

        /** @see [simulate] */
        fun simulate(
            params: ThreeDSAuthenticationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationSimulateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/enter_otp`, but
         * is otherwise the same as [AuthenticationServiceAsync.simulateOtpEntry].
         */
        fun simulateOtpEntry(
            params: ThreeDSAuthenticationSimulateOtpEntryParams
        ): CompletableFuture<HttpResponse> = simulateOtpEntry(params, RequestOptions.none())

        /** @see [simulateOtpEntry] */
        fun simulateOtpEntry(
            params: ThreeDSAuthenticationSimulateOtpEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
