// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AccountHolder
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderCreateResponse
import com.lithic.api.models.AccountHolderDocument
import com.lithic.api.models.AccountHolderListDocumentsParams
import com.lithic.api.models.AccountHolderListDocumentsResponse
import com.lithic.api.models.AccountHolderListPage
import com.lithic.api.models.AccountHolderListParams
import com.lithic.api.models.AccountHolderResubmitParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderRetrieveParams
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUpdateResponse
import com.lithic.api.models.AccountHolderUploadDocumentParams

interface AccountHolderService {

    /**
     * Run an individual or business's information through the Customer Identification Program (CIP)
     * and return an `account_token` if the status is accepted or pending (i.e., further action
     * required). All calls to this endpoint will return an immediate response - though in some
     * cases, the response may indicate the workflow is under review or further action will be
     * needed to complete the account creation process. This endpoint can only be used on accounts
     * that are part of the program that the calling API key manages.
     */
    @JvmOverloads
    fun create(
        params: AccountHolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderCreateResponse

    /** Get an Individual or Business Account Holder and/or their KYC or KYB evaluation status. */
    @JvmOverloads
    fun retrieve(
        params: AccountHolderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolder

    /** Update the information associated with a particular account holder. */
    @JvmOverloads
    fun update(
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderUpdateResponse

    /**
     * Get a list of individual or business account holders and their KYC or KYB evaluation status.
     */
    @JvmOverloads
    fun list(
        params: AccountHolderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderListPage

    /**
     * Retrieve the status of account holder document uploads, or retrieve the upload URLs to
     * process your image uploads.
     *
     * Note that this is not equivalent to checking the status of the KYC evaluation overall (a
     * document may be successfully uploaded but not be sufficient for KYC to pass).
     *
     * In the event your upload URLs have expired, calling this endpoint will refresh them.
     * Similarly, in the event a previous account holder document upload has failed, you can use
     * this endpoint to get a new upload URL for the failed image upload.
     *
     * When a new document upload is generated for a failed attempt, the response will show an
     * additional entry in the `required_document_uploads` list in a `PENDING` state for the
     * corresponding `image_type`.
     */
    @JvmOverloads
    fun listDocuments(
        params: AccountHolderListDocumentsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderListDocumentsResponse

    /**
     * Resubmit a KYC submission. This endpoint should be used in cases where a KYC submission
     * returned a `PENDING_RESUBMIT` result, meaning one or more critical KYC fields may have been
     * mis-entered and the individual's identity has not yet been successfully verified. This step
     * must be completed in order to proceed with the KYC evaluation.
     *
     * Two resubmission attempts are permitted via this endpoint before a `REJECTED` status is
     * returned and the account creation process is ended.
     */
    @JvmOverloads
    fun resubmit(
        params: AccountHolderResubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolder

    /**
     * Check the status of an account holder document upload, or retrieve the upload URLs to process
     * your image uploads.
     *
     * Note that this is not equivalent to checking the status of the KYC evaluation overall (a
     * document may be successfully uploaded but not be sufficient for KYC to pass).
     *
     * In the event your upload URLs have expired, calling this endpoint will refresh them.
     * Similarly, in the event a document upload has failed, you can use this endpoint to get a new
     * upload URL for the failed image upload.
     *
     * When a new account holder document upload is generated for a failed attempt, the response
     * will show an additional entry in the `required_document_uploads` array in a `PENDING` state
     * for the corresponding `image_type`.
     */
    @JvmOverloads
    fun retrieveDocument(
        params: AccountHolderRetrieveDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderDocument

    /**
     * Use this endpoint to identify which type of supported government-issued documentation you
     * will upload for further verification. It will return two URLs to upload your document images
     * to - one for the front image and one for the back image.
     *
     * This endpoint is only valid for evaluations in a `PENDING_DOCUMENT` state.
     *
     * Uploaded images must either be a `jpg` or `png` file, and each must be less than 15 MiB. Once
     * both required uploads have been successfully completed, your document will be run through KYC
     * verification.
     *
     * If you have registered a webhook, you will receive evaluation updates for any document
     * submission evaluations, as well as for any failed document uploads.
     *
     * Two document submission attempts are permitted via this endpoint before a `REJECTED` status
     * is returned and the account creation process is ended. Currently only one type of account
     * holder document is supported per KYC verification.
     */
    @JvmOverloads
    fun uploadDocument(
        params: AccountHolderUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountHolderDocument
}
