// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Dispute
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPageAsync
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPageAsync
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams
import java.util.concurrent.CompletableFuture

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Initiate a dispute. */
    fun create(params: DisputeCreateParams): CompletableFuture<Dispute> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** Get dispute. */
    fun retrieve(params: DisputeRetrieveParams): CompletableFuture<Dispute> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** Update dispute. Can only be modified if status is `NEW`. */
    fun update(params: DisputeUpdateParams): CompletableFuture<Dispute> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** List disputes. */
    fun list(): CompletableFuture<DisputeListPageAsync> = list(DisputeListParams.none())

    /** @see [list] */
    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListPageAsync>

    /** @see [list] */
    fun list(
        params: DisputeListParams = DisputeListParams.none()
    ): CompletableFuture<DisputeListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DisputeListPageAsync> =
        list(DisputeListParams.none(), requestOptions)

    /** Withdraw dispute. */
    fun delete(params: DisputeDeleteParams): CompletableFuture<Dispute> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    fun deleteEvidence(params: DisputeDeleteEvidenceParams): CompletableFuture<DisputeEvidence> =
        deleteEvidence(params, RequestOptions.none())

    /** @see [deleteEvidence] */
    fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence>

    /**
     * Use this endpoint to upload evidences for the dispute. It will return a URL to upload your
     * documents to. The URL will expire in 30 minutes.
     *
     * Uploaded documents must either be a `jpg`, `png` or `pdf` file, and each must be less than 5
     * GiB.
     */
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams
    ): CompletableFuture<DisputeEvidence> = initiateEvidenceUpload(params, RequestOptions.none())

    /** @see [initiateEvidenceUpload] */
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence>

    /** List evidence metadata for a dispute. */
    fun listEvidences(
        params: DisputeListEvidencesParams
    ): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(params, RequestOptions.none())

    /** @see [listEvidences] */
    fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListEvidencesPageAsync>

    /** Get a dispute's evidence metadata. */
    fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams
    ): CompletableFuture<DisputeEvidence> = retrieveEvidence(params, RequestOptions.none())

    /** @see [retrieveEvidence] */
    fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence>

    fun uploadEvidence(disputeToken: String, file: ByteArray): CompletableFuture<Void>

    /**
     * A view of [DisputeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: DisputeCreateParams): CompletableFuture<HttpResponseFor<Dispute>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DisputeRetrieveParams): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `patch /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: DisputeUpdateParams): CompletableFuture<HttpResponseFor<Dispute>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `get /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: DisputeDeleteParams): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DisputeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.deleteEvidence].
         */
        @MustBeClosed
        fun deleteEvidence(
            params: DisputeDeleteEvidenceParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            deleteEvidence(params, RequestOptions.none())

        /** @see [deleteEvidence] */
        @MustBeClosed
        fun deleteEvidence(
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>

        /**
         * Returns a raw HTTP response for `post /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.initiateEvidenceUpload].
         */
        @MustBeClosed
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(params, RequestOptions.none())

        /** @see [initiateEvidenceUpload] */
        @MustBeClosed
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.listEvidences].
         */
        @MustBeClosed
        fun listEvidences(
            params: DisputeListEvidencesParams
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(params, RequestOptions.none())

        /** @see [listEvidences] */
        @MustBeClosed
        fun listEvidences(
            params: DisputeListEvidencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.retrieveEvidence].
         */
        @MustBeClosed
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            retrieveEvidence(params, RequestOptions.none())

        /** @see [retrieveEvidence] */
        @MustBeClosed
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>
    }
}
