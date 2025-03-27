// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.responderendpoints.ResponderEndpointCheckStatusParams
import com.lithic.api.models.responderendpoints.ResponderEndpointCreateParams
import com.lithic.api.models.responderendpoints.ResponderEndpointCreateResponse
import com.lithic.api.models.responderendpoints.ResponderEndpointDeleteParams
import com.lithic.api.models.responderendpoints.ResponderEndpointStatus
import java.util.concurrent.CompletableFuture

interface ResponderEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll a responder endpoint */
    fun create(): CompletableFuture<ResponderEndpointCreateResponse> =
        create(ResponderEndpointCreateParams.none())

    /** @see [create] */
    fun create(
        params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponderEndpointCreateResponse>

    /** @see [create] */
    fun create(
        params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none()
    ): CompletableFuture<ResponderEndpointCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ResponderEndpointCreateResponse> =
        create(ResponderEndpointCreateParams.none(), requestOptions)

    /** Disenroll a responder endpoint */
    fun delete(params: ResponderEndpointDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResponderEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Check the status of a responder endpoint */
    fun checkStatus(
        params: ResponderEndpointCheckStatusParams
    ): CompletableFuture<ResponderEndpointStatus> = checkStatus(params, RequestOptions.none())

    /** @see [checkStatus] */
    fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponderEndpointStatus>

    /**
     * A view of [ResponderEndpointServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ResponderEndpointCreateResponse>> =
            create(ResponderEndpointCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponderEndpointCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ResponderEndpointCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ResponderEndpointCreateResponse>> =
            create(ResponderEndpointCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/responder_endpoints`, but is otherwise the
         * same as [ResponderEndpointServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ResponderEndpointDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResponderEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointServiceAsync.checkStatus].
         */
        @MustBeClosed
        fun checkStatus(
            params: ResponderEndpointCheckStatusParams
        ): CompletableFuture<HttpResponseFor<ResponderEndpointStatus>> =
            checkStatus(params, RequestOptions.none())

        /** @see [checkStatus] */
        @MustBeClosed
        fun checkStatus(
            params: ResponderEndpointCheckStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponderEndpointStatus>>
    }
}
