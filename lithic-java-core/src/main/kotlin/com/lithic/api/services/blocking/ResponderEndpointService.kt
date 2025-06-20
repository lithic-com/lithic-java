// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointCreateResponse
import com.lithic.api.models.ResponderEndpointDeleteParams
import com.lithic.api.models.ResponderEndpointStatus
import java.util.function.Consumer

interface ResponderEndpointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponderEndpointService

    /** Enroll a responder endpoint */
    fun create(): ResponderEndpointCreateResponse = create(ResponderEndpointCreateParams.none())

    /** @see [create] */
    fun create(
        params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponderEndpointCreateResponse

    /** @see [create] */
    fun create(
        params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none()
    ): ResponderEndpointCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ResponderEndpointCreateResponse =
        create(ResponderEndpointCreateParams.none(), requestOptions)

    /** Disenroll a responder endpoint */
    fun delete(params: ResponderEndpointDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResponderEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Check the status of a responder endpoint */
    fun checkStatus(params: ResponderEndpointCheckStatusParams): ResponderEndpointStatus =
        checkStatus(params, RequestOptions.none())

    /** @see [checkStatus] */
    fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponderEndpointStatus

    /**
     * A view of [ResponderEndpointService] that provides access to raw HTTP responses for each
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
        ): ResponderEndpointService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ResponderEndpointCreateResponse> =
            create(ResponderEndpointCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponderEndpointCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none()
        ): HttpResponseFor<ResponderEndpointCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<ResponderEndpointCreateResponse> =
            create(ResponderEndpointCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/responder_endpoints`, but is otherwise the
         * same as [ResponderEndpointService.delete].
         */
        @MustBeClosed
        fun delete(params: ResponderEndpointDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResponderEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointService.checkStatus].
         */
        @MustBeClosed
        fun checkStatus(
            params: ResponderEndpointCheckStatusParams
        ): HttpResponseFor<ResponderEndpointStatus> = checkStatus(params, RequestOptions.none())

        /** @see [checkStatus] */
        @MustBeClosed
        fun checkStatus(
            params: ResponderEndpointCheckStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponderEndpointStatus>
    }
}
