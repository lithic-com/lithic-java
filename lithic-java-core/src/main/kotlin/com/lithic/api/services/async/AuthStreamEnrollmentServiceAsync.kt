// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret
import java.util.concurrent.CompletableFuture

interface AuthStreamEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    @JvmOverloads
    fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams =
            AuthStreamEnrollmentRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthStreamSecret>

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    fun retrieveSecret(requestOptions: RequestOptions): CompletableFuture<AuthStreamSecret> =
        retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    @JvmOverloads
    fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams =
            AuthStreamEnrollmentRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<Void?> =
        rotateSecret(AuthStreamEnrollmentRotateSecretParams.none(), requestOptions)

    /**
     * A view of [AuthStreamEnrollmentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/auth_stream/secret`, but is otherwise the same
         * as [AuthStreamEnrollmentServiceAsync.retrieveSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieveSecret(
            params: AuthStreamEnrollmentRetrieveSecretParams =
                AuthStreamEnrollmentRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthStreamSecret>>

        /**
         * Returns a raw HTTP response for `get /v1/auth_stream/secret`, but is otherwise the same
         * as [AuthStreamEnrollmentServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthStreamSecret>> =
            retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/auth_stream/secret/rotate`, but is otherwise
         * the same as [AuthStreamEnrollmentServiceAsync.rotateSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun rotateSecret(
            params: AuthStreamEnrollmentRotateSecretParams =
                AuthStreamEnrollmentRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/auth_stream/secret/rotate`, but is otherwise
         * the same as [AuthStreamEnrollmentServiceAsync.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            rotateSecret(AuthStreamEnrollmentRotateSecretParams.none(), requestOptions)
    }
}
