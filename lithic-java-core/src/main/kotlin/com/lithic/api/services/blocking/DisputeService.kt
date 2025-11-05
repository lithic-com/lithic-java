// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeCreateResponse
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeDeleteResponse
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPage
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPage
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeRetrieveResponse
import com.lithic.api.models.DisputeUpdateParams
import com.lithic.api.models.DisputeUpdateResponse
import java.util.function.Consumer

interface DisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputeService

    /** Initiate a dispute. */
    fun create(params: DisputeCreateParams): DisputeCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeCreateResponse

    /** Get dispute. */
    fun retrieve(disputeToken: String): DisputeRetrieveResponse =
        retrieve(disputeToken, DisputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse =
        retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
    ): DisputeRetrieveResponse = retrieve(disputeToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DisputeRetrieveParams): DisputeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(disputeToken: String, requestOptions: RequestOptions): DisputeRetrieveResponse =
        retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

    /** Update dispute. Can only be modified if status is `NEW`. */
    fun update(disputeToken: String): DisputeUpdateResponse =
        update(disputeToken, DisputeUpdateParams.none())

    /** @see update */
    fun update(
        disputeToken: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeUpdateResponse =
        update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see update */
    fun update(
        disputeToken: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
    ): DisputeUpdateResponse = update(disputeToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeUpdateResponse

    /** @see update */
    fun update(params: DisputeUpdateParams): DisputeUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(disputeToken: String, requestOptions: RequestOptions): DisputeUpdateResponse =
        update(disputeToken, DisputeUpdateParams.none(), requestOptions)

    /** List disputes. */
    fun list(): DisputeListPage = list(DisputeListParams.none())

    /** @see list */
    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPage

    /** @see list */
    fun list(params: DisputeListParams = DisputeListParams.none()): DisputeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DisputeListPage =
        list(DisputeListParams.none(), requestOptions)

    /** Withdraw dispute. */
    fun delete(disputeToken: String): DisputeDeleteResponse =
        delete(disputeToken, DisputeDeleteParams.none())

    /** @see delete */
    fun delete(
        disputeToken: String,
        params: DisputeDeleteParams = DisputeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeDeleteResponse =
        delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        disputeToken: String,
        params: DisputeDeleteParams = DisputeDeleteParams.none(),
    ): DisputeDeleteResponse = delete(disputeToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeDeleteResponse

    /** @see delete */
    fun delete(params: DisputeDeleteParams): DisputeDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(disputeToken: String, requestOptions: RequestOptions): DisputeDeleteResponse =
        delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    fun deleteEvidence(
        evidenceToken: String,
        params: DisputeDeleteEvidenceParams,
    ): DisputeEvidence = deleteEvidence(evidenceToken, params, RequestOptions.none())

    /** @see deleteEvidence */
    fun deleteEvidence(
        evidenceToken: String,
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see deleteEvidence */
    fun deleteEvidence(params: DisputeDeleteEvidenceParams): DisputeEvidence =
        deleteEvidence(params, RequestOptions.none())

    /** @see deleteEvidence */
    fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    /**
     * Use this endpoint to upload evidences for the dispute. It will return a URL to upload your
     * documents to. The URL will expire in 30 minutes.
     *
     * Uploaded documents must either be a `jpg`, `png` or `pdf` file, and each must be less than 5
     * GiB.
     */
    fun initiateEvidenceUpload(disputeToken: String): DisputeEvidence =
        initiateEvidenceUpload(disputeToken, DisputeInitiateEvidenceUploadParams.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        initiateEvidenceUpload(
            params.toBuilder().disputeToken(disputeToken).build(),
            requestOptions,
        )

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
    ): DisputeEvidence = initiateEvidenceUpload(disputeToken, params, RequestOptions.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(params: DisputeInitiateEvidenceUploadParams): DisputeEvidence =
        initiateEvidenceUpload(params, RequestOptions.none())

    /** @see initiateEvidenceUpload */
    fun initiateEvidenceUpload(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeEvidence =
        initiateEvidenceUpload(
            disputeToken,
            DisputeInitiateEvidenceUploadParams.none(),
            requestOptions,
        )

    /** List evidence metadata for a dispute. */
    fun listEvidences(disputeToken: String): DisputeListEvidencesPage =
        listEvidences(disputeToken, DisputeListEvidencesParams.none())

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListEvidencesPage =
        listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
    ): DisputeListEvidencesPage = listEvidences(disputeToken, params, RequestOptions.none())

    /** @see listEvidences */
    fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListEvidencesPage

    /** @see listEvidences */
    fun listEvidences(params: DisputeListEvidencesParams): DisputeListEvidencesPage =
        listEvidences(params, RequestOptions.none())

    /** @see listEvidences */
    fun listEvidences(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeListEvidencesPage =
        listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

    /** Get a dispute's evidence metadata. */
    fun retrieveEvidence(
        evidenceToken: String,
        params: DisputeRetrieveEvidenceParams,
    ): DisputeEvidence = retrieveEvidence(evidenceToken, params, RequestOptions.none())

    /** @see retrieveEvidence */
    fun retrieveEvidence(
        evidenceToken: String,
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        retrieveEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see retrieveEvidence */
    fun retrieveEvidence(params: DisputeRetrieveEvidenceParams): DisputeEvidence =
        retrieveEvidence(params, RequestOptions.none())

    /** @see retrieveEvidence */
    fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    fun uploadEvidence(disputeToken: String, file: ByteArray)

    /** A view of [DisputeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/disputes`, but is otherwise the same as
         * [DisputeService.create].
         */
        @MustBeClosed
        fun create(params: DisputeCreateParams): HttpResponseFor<DisputeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(disputeToken: String): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(disputeToken, DisputeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(disputeToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DisputeRetrieveParams): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeService.update].
         */
        @MustBeClosed
        fun update(disputeToken: String): HttpResponseFor<DisputeUpdateResponse> =
            update(disputeToken, DisputeUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            disputeToken: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeUpdateResponse> =
            update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            disputeToken: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
        ): HttpResponseFor<DisputeUpdateResponse> =
            update(disputeToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: DisputeUpdateParams): HttpResponseFor<DisputeUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeUpdateResponse> =
            update(disputeToken, DisputeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/disputes`, but is otherwise the same as
         * [DisputeService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DisputeListPage> = list(DisputeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none()
        ): HttpResponseFor<DisputeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DisputeListPage> =
            list(DisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeService.delete].
         */
        @MustBeClosed
        fun delete(disputeToken: String): HttpResponseFor<DisputeDeleteResponse> =
            delete(disputeToken, DisputeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            disputeToken: String,
            params: DisputeDeleteParams = DisputeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeDeleteResponse> =
            delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            disputeToken: String,
            params: DisputeDeleteParams = DisputeDeleteParams.none(),
        ): HttpResponseFor<DisputeDeleteResponse> =
            delete(disputeToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DisputeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: DisputeDeleteParams): HttpResponseFor<DisputeDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeDeleteResponse> =
            delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeService.deleteEvidence].
         */
        @MustBeClosed
        fun deleteEvidence(
            evidenceToken: String,
            params: DisputeDeleteEvidenceParams,
        ): HttpResponseFor<DisputeEvidence> =
            deleteEvidence(evidenceToken, params, RequestOptions.none())

        /** @see deleteEvidence */
        @MustBeClosed
        fun deleteEvidence(
            evidenceToken: String,
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

        /** @see deleteEvidence */
        @MustBeClosed
        fun deleteEvidence(params: DisputeDeleteEvidenceParams): HttpResponseFor<DisputeEvidence> =
            deleteEvidence(params, RequestOptions.none())

        /** @see deleteEvidence */
        @MustBeClosed
        fun deleteEvidence(
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>

        /**
         * Returns a raw HTTP response for `post /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeService.initiateEvidenceUpload].
         */
        @MustBeClosed
        fun initiateEvidenceUpload(disputeToken: String): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(disputeToken, DisputeInitiateEvidenceUploadParams.none())

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        fun initiateEvidenceUpload(
            disputeToken: String,
            params: DisputeInitiateEvidenceUploadParams =
                DisputeInitiateEvidenceUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(
                params.toBuilder().disputeToken(disputeToken).build(),
                requestOptions,
            )

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        fun initiateEvidenceUpload(
            disputeToken: String,
            params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
        ): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(disputeToken, params, RequestOptions.none())

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams
        ): HttpResponseFor<DisputeEvidence> = initiateEvidenceUpload(params, RequestOptions.none())

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        fun initiateEvidenceUpload(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(
                disputeToken,
                DisputeInitiateEvidenceUploadParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeService.listEvidences].
         */
        @MustBeClosed
        fun listEvidences(disputeToken: String): HttpResponseFor<DisputeListEvidencesPage> =
            listEvidences(disputeToken, DisputeListEvidencesParams.none())

        /** @see listEvidences */
        @MustBeClosed
        fun listEvidences(
            disputeToken: String,
            params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListEvidencesPage> =
            listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see listEvidences */
        @MustBeClosed
        fun listEvidences(
            disputeToken: String,
            params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
        ): HttpResponseFor<DisputeListEvidencesPage> =
            listEvidences(disputeToken, params, RequestOptions.none())

        /** @see listEvidences */
        @MustBeClosed
        fun listEvidences(
            params: DisputeListEvidencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListEvidencesPage>

        /** @see listEvidences */
        @MustBeClosed
        fun listEvidences(
            params: DisputeListEvidencesParams
        ): HttpResponseFor<DisputeListEvidencesPage> = listEvidences(params, RequestOptions.none())

        /** @see listEvidences */
        @MustBeClosed
        fun listEvidences(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeListEvidencesPage> =
            listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeService.retrieveEvidence].
         */
        @MustBeClosed
        fun retrieveEvidence(
            evidenceToken: String,
            params: DisputeRetrieveEvidenceParams,
        ): HttpResponseFor<DisputeEvidence> =
            retrieveEvidence(evidenceToken, params, RequestOptions.none())

        /** @see retrieveEvidence */
        @MustBeClosed
        fun retrieveEvidence(
            evidenceToken: String,
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            retrieveEvidence(
                params.toBuilder().evidenceToken(evidenceToken).build(),
                requestOptions,
            )

        /** @see retrieveEvidence */
        @MustBeClosed
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams
        ): HttpResponseFor<DisputeEvidence> = retrieveEvidence(params, RequestOptions.none())

        /** @see retrieveEvidence */
        @MustBeClosed
        fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>
    }
}
