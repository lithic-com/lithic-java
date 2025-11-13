// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
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
import java.util.function.Consumer

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputeServiceAsync

    /** Initiate a dispute. */
    fun create(params: DisputeCreateParams): CompletableFuture<Dispute> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** Get dispute. */
    fun retrieve(disputeToken: String): CompletableFuture<Dispute> =
        retrieve(disputeToken, DisputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute> =
        retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
    ): CompletableFuture<Dispute> = retrieve(disputeToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** @see retrieve */
    fun retrieve(params: DisputeRetrieveParams): CompletableFuture<Dispute> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(disputeToken: String, requestOptions: RequestOptions): CompletableFuture<Dispute> =
        retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

    /** Update dispute. Can only be modified if status is `NEW`. */
    fun update(disputeToken: String): CompletableFuture<Dispute> =
        update(disputeToken, DisputeUpdateParams.none())

    /** @see update */
    fun update(
        disputeToken: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute> =
        update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see update */
    fun update(
        disputeToken: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
    ): CompletableFuture<Dispute> = update(disputeToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** @see update */
    fun update(params: DisputeUpdateParams): CompletableFuture<Dispute> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(disputeToken: String, requestOptions: RequestOptions): CompletableFuture<Dispute> =
        update(disputeToken, DisputeUpdateParams.none(), requestOptions)

    /** List disputes. */
    fun list(): CompletableFuture<DisputeListPageAsync> = list(DisputeListParams.none())

    /** @see list */
    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListPageAsync>

    /** @see list */
    fun list(
        params: DisputeListParams = DisputeListParams.none()
    ): CompletableFuture<DisputeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DisputeListPageAsync> =
        list(DisputeListParams.none(), requestOptions)

    /** Withdraw dispute. */
    fun delete(disputeToken: String): CompletableFuture<Dispute> =
        delete(disputeToken, DisputeDeleteParams.none())

    /** @see delete */
    fun delete(
        disputeToken: String,
        params: DisputeDeleteParams = DisputeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute> =
        delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        disputeToken: String,
        params: DisputeDeleteParams = DisputeDeleteParams.none(),
    ): CompletableFuture<Dispute> = delete(disputeToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

    /** @see delete */
    fun delete(params: DisputeDeleteParams): CompletableFuture<Dispute> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(disputeToken: String, requestOptions: RequestOptions): CompletableFuture<Dispute> =
        delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    fun deleteEvidence(
        evidenceToken: String,
        params: DisputeDeleteEvidenceParams,
    ): CompletableFuture<DisputeEvidence> =
        deleteEvidence(evidenceToken, params, RequestOptions.none())

    /** @see deleteEvidence */
    fun deleteEvidence(
        evidenceToken: String,
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence> =
        deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see deleteEvidence */
    fun deleteEvidence(params: DisputeDeleteEvidenceParams): CompletableFuture<DisputeEvidence> =
        deleteEvidence(params, RequestOptions.none())

    /** @see deleteEvidence */
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
    fun initiateEvidenceUpload(disputeToken: String): CompletableFuture<DisputeEvidence> =
        initiateEvidenceUpload(disputeToken, DisputeInitiateEvidenceUploadParams.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence> =
        initiateEvidenceUpload(
            params.toBuilder().disputeToken(disputeToken).build(),
            requestOptions,
        )

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
    ): CompletableFuture<DisputeEvidence> =
        initiateEvidenceUpload(disputeToken, params, RequestOptions.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence>

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams
    ): CompletableFuture<DisputeEvidence> = initiateEvidenceUpload(params, RequestOptions.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeEvidence> =
        initiateEvidenceUpload(
            disputeToken,
            DisputeInitiateEvidenceUploadParams.none(),
            requestOptions,
        )

    /** List evidence metadata for a dispute. */
    fun listEvidences(disputeToken: String): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(disputeToken, DisputeListEvidencesParams.none())

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
    ): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(disputeToken, params, RequestOptions.none())

    /** @see listEvidences */
    fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListEvidencesPageAsync>

    /** @see listEvidences */
    fun listEvidences(
        params: DisputeListEvidencesParams
    ): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(params, RequestOptions.none())

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeListEvidencesPageAsync> =
        listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

    /** Get a dispute's evidence metadata. */
    fun retrieveEvidence(
        evidenceToken: String,
        params: DisputeRetrieveEvidenceParams,
    ): CompletableFuture<DisputeEvidence> =
        retrieveEvidence(evidenceToken, params, RequestOptions.none())

    /** @see retrieveEvidence */
    fun retrieveEvidence(
        evidenceToken: String,
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeEvidence> =
        retrieveEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see retrieveEvidence */
    fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams
    ): CompletableFuture<DisputeEvidence> = retrieveEvidence(params, RequestOptions.none())

    /** @see retrieveEvidence */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.create].
         */
        fun create(params: DisputeCreateParams): CompletableFuture<HttpResponseFor<Dispute>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputeServiceAsync.retrieve].
         */
        fun retrieve(disputeToken: String): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(disputeToken, DisputeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(disputeToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /** @see retrieve */
        fun retrieve(params: DisputeRetrieveParams): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.update].
         */
        fun update(disputeToken: String): CompletableFuture<HttpResponseFor<Dispute>> =
            update(disputeToken, DisputeUpdateParams.none())

        /** @see update */
        fun update(
            disputeToken: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see update */
        fun update(
            disputeToken: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            update(disputeToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /** @see update */
        fun update(params: DisputeUpdateParams): CompletableFuture<HttpResponseFor<Dispute>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            update(disputeToken, DisputeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none())

        /** @see list */
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>>

        /** @see list */
        fun list(
            params: DisputeListParams = DisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.delete].
         */
        fun delete(disputeToken: String): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(disputeToken, DisputeDeleteParams.none())

        /** @see delete */
        fun delete(
            disputeToken: String,
            params: DisputeDeleteParams = DisputeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            disputeToken: String,
            params: DisputeDeleteParams = DisputeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(disputeToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DisputeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /** @see delete */
        fun delete(params: DisputeDeleteParams): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dispute>> =
            delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.deleteEvidence].
         */
        fun deleteEvidence(
            evidenceToken: String,
            params: DisputeDeleteEvidenceParams,
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            deleteEvidence(evidenceToken, params, RequestOptions.none())

        /** @see deleteEvidence */
        fun deleteEvidence(
            evidenceToken: String,
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

        /** @see deleteEvidence */
        fun deleteEvidence(
            params: DisputeDeleteEvidenceParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            deleteEvidence(params, RequestOptions.none())

        /** @see deleteEvidence */
        fun deleteEvidence(
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>

        /**
         * Returns a raw HTTP response for `post /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.initiateEvidenceUpload].
         */
        fun initiateEvidenceUpload(
            disputeToken: String
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(disputeToken, DisputeInitiateEvidenceUploadParams.none())

        /** @see initiateEvidenceUpload */
        fun initiateEvidenceUpload(
            disputeToken: String,
            params: DisputeInitiateEvidenceUploadParams =
                DisputeInitiateEvidenceUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(
                params.toBuilder().disputeToken(disputeToken).build(),
                requestOptions,
            )

        /** @see initiateEvidenceUpload */
        fun initiateEvidenceUpload(
            disputeToken: String,
            params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(disputeToken, params, RequestOptions.none())

        /** @see initiateEvidenceUpload */
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>

        /** @see initiateEvidenceUpload */
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(params, RequestOptions.none())

        /** @see initiateEvidenceUpload */
        fun initiateEvidenceUpload(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            initiateEvidenceUpload(
                disputeToken,
                DisputeInitiateEvidenceUploadParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.listEvidences].
         */
        fun listEvidences(
            disputeToken: String
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(disputeToken, DisputeListEvidencesParams.none())

        /** @see listEvidences */
        fun listEvidences(
            disputeToken: String,
            params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see listEvidences */
        fun listEvidences(
            disputeToken: String,
            params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(disputeToken, params, RequestOptions.none())

        /** @see listEvidences */
        fun listEvidences(
            params: DisputeListEvidencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>>

        /** @see listEvidences */
        fun listEvidences(
            params: DisputeListEvidencesParams
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(params, RequestOptions.none())

        /** @see listEvidences */
        fun listEvidences(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeListEvidencesPageAsync>> =
            listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.retrieveEvidence].
         */
        fun retrieveEvidence(
            evidenceToken: String,
            params: DisputeRetrieveEvidenceParams,
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            retrieveEvidence(evidenceToken, params, RequestOptions.none())

        /** @see retrieveEvidence */
        fun retrieveEvidence(
            evidenceToken: String,
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            retrieveEvidence(
                params.toBuilder().evidenceToken(evidenceToken).build(),
                requestOptions,
            )

        /** @see retrieveEvidence */
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>> =
            retrieveEvidence(params, RequestOptions.none())

        /** @see retrieveEvidence */
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeEvidence>>
    }
}
