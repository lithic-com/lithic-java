@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Dispute
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeInitiateEvidenceUploadResponse
import com.lithic.api.models.DisputeListEvidencesPage
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPage
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams

interface DisputeService {

    /** Initiate a dispute. */
    @JvmOverloads
    fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dispute

    /** Get dispute. */
    @JvmOverloads
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dispute

    /** Update dispute. Can only be modified if status is `NEW`. */
    @JvmOverloads
    fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dispute

    /** List disputes. */
    @JvmOverloads
    fun list(
        params: DisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisputeListPage

    /** Withdraw dispute. */
    @JvmOverloads
    fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dispute

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    @JvmOverloads
    fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisputeEvidence

    /**
     * Use this endpoint to upload evidences for the dispute. It will return a URL to upload your
     * documents to. The URL will expire in 30 minutes.
     *
     * Uploaded documents must either be a `jpg`, `png` or `pdf` file, and each must be less than 5
     * GiB.
     */
    @JvmOverloads
    fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisputeInitiateEvidenceUploadResponse

    /** List evidence metadata for a dispute. */
    @JvmOverloads
    fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisputeListEvidencesPage

    /** Get a dispute's evidence metadata. */
    @JvmOverloads
    fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisputeEvidence
}
