// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountHolder
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderCreateResponse
import com.lithic.api.models.AccountHolderListDocumentsParams
import com.lithic.api.models.AccountHolderListDocumentsResponse
import com.lithic.api.models.AccountHolderListPage
import com.lithic.api.models.AccountHolderListParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderRetrieveParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentDocumentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewResponse
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUpdateResponse
import com.lithic.api.models.AccountHolderUploadDocumentParams
import com.lithic.api.models.Document
import java.util.function.Consumer

interface AccountHolderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountHolderService

    /**
     * Create an account holder and initiate the appropriate onboarding workflow. Account holders
     * and accounts have a 1:1 relationship. When an account holder is successfully created an
     * associated account is also created. All calls to this endpoint will return a synchronous
     * response. The response time will depend on the workflow. In some cases, the response may
     * indicate the workflow is under review or further action will be needed to complete the
     * account creation process. This endpoint can only be used on accounts that are part of the
     * program that the calling API key manages.
     */
    fun create(params: AccountHolderCreateParams): AccountHolderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountHolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderCreateResponse

    /** Get an Individual or Business Account Holder and/or their KYC or KYB evaluation status. */
    fun retrieve(accountHolderToken: String): AccountHolder =
        retrieve(accountHolderToken, AccountHolderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accountHolderToken: String,
        params: AccountHolderRetrieveParams = AccountHolderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolder =
        retrieve(params.toBuilder().accountHolderToken(accountHolderToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accountHolderToken: String,
        params: AccountHolderRetrieveParams = AccountHolderRetrieveParams.none(),
    ): AccountHolder = retrieve(accountHolderToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountHolderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolder

    /** @see retrieve */
    fun retrieve(params: AccountHolderRetrieveParams): AccountHolder =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(accountHolderToken: String, requestOptions: RequestOptions): AccountHolder =
        retrieve(accountHolderToken, AccountHolderRetrieveParams.none(), requestOptions)

    /**
     * Update the information associated with a particular account holder (including business owners
     * and control persons associated to a business account). If Lithic is performing KYB or KYC and
     * additional verification is required we will run the individual's or business's updated
     * information again and return whether the status is accepted or pending (i.e., further action
     * required). All calls to this endpoint will return a synchronous response. The response time
     * will depend on the workflow. In some cases, the response may indicate the workflow is under
     * review or further action will be needed to complete the account creation process. This
     * endpoint can only be used on existing accounts that are part of the program that the calling
     * API key manages.
     */
    fun update(
        accountHolderToken: String,
        params: AccountHolderUpdateParams,
    ): AccountHolderUpdateResponse = update(accountHolderToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        accountHolderToken: String,
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderUpdateResponse =
        update(params.toBuilder().accountHolderToken(accountHolderToken).build(), requestOptions)

    /** @see update */
    fun update(params: AccountHolderUpdateParams): AccountHolderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderUpdateResponse

    /**
     * Get a list of individual or business account holders and their KYC or KYB evaluation status.
     */
    fun list(): AccountHolderListPage = list(AccountHolderListParams.none())

    /** @see list */
    fun list(
        params: AccountHolderListParams = AccountHolderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderListPage

    /** @see list */
    fun list(
        params: AccountHolderListParams = AccountHolderListParams.none()
    ): AccountHolderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountHolderListPage =
        list(AccountHolderListParams.none(), requestOptions)

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
    fun listDocuments(accountHolderToken: String): AccountHolderListDocumentsResponse =
        listDocuments(accountHolderToken, AccountHolderListDocumentsParams.none())

    /** @see listDocuments */
    fun listDocuments(
        accountHolderToken: String,
        params: AccountHolderListDocumentsParams = AccountHolderListDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderListDocumentsResponse =
        listDocuments(
            params.toBuilder().accountHolderToken(accountHolderToken).build(),
            requestOptions,
        )

    /** @see listDocuments */
    fun listDocuments(
        accountHolderToken: String,
        params: AccountHolderListDocumentsParams = AccountHolderListDocumentsParams.none(),
    ): AccountHolderListDocumentsResponse =
        listDocuments(accountHolderToken, params, RequestOptions.none())

    /** @see listDocuments */
    fun listDocuments(
        params: AccountHolderListDocumentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderListDocumentsResponse

    /** @see listDocuments */
    fun listDocuments(
        params: AccountHolderListDocumentsParams
    ): AccountHolderListDocumentsResponse = listDocuments(params, RequestOptions.none())

    /** @see listDocuments */
    fun listDocuments(
        accountHolderToken: String,
        requestOptions: RequestOptions,
    ): AccountHolderListDocumentsResponse =
        listDocuments(accountHolderToken, AccountHolderListDocumentsParams.none(), requestOptions)

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
    fun retrieveDocument(
        documentToken: String,
        params: AccountHolderRetrieveDocumentParams,
    ): Document = retrieveDocument(documentToken, params, RequestOptions.none())

    /** @see retrieveDocument */
    fun retrieveDocument(
        documentToken: String,
        params: AccountHolderRetrieveDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document =
        retrieveDocument(params.toBuilder().documentToken(documentToken).build(), requestOptions)

    /** @see retrieveDocument */
    fun retrieveDocument(params: AccountHolderRetrieveDocumentParams): Document =
        retrieveDocument(params, RequestOptions.none())

    /** @see retrieveDocument */
    fun retrieveDocument(
        params: AccountHolderRetrieveDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Simulates a review for an account holder document upload. */
    fun simulateEnrollmentDocumentReview(
        params: AccountHolderSimulateEnrollmentDocumentReviewParams
    ): Document = simulateEnrollmentDocumentReview(params, RequestOptions.none())

    /** @see simulateEnrollmentDocumentReview */
    fun simulateEnrollmentDocumentReview(
        params: AccountHolderSimulateEnrollmentDocumentReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /**
     * Simulates an enrollment review for an account holder. This endpoint is only applicable for
     * workflows that may required intervention such as `KYB_BASIC`.
     */
    fun simulateEnrollmentReview(): AccountHolderSimulateEnrollmentReviewResponse =
        simulateEnrollmentReview(AccountHolderSimulateEnrollmentReviewParams.none())

    /** @see simulateEnrollmentReview */
    fun simulateEnrollmentReview(
        params: AccountHolderSimulateEnrollmentReviewParams =
            AccountHolderSimulateEnrollmentReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderSimulateEnrollmentReviewResponse

    /** @see simulateEnrollmentReview */
    fun simulateEnrollmentReview(
        params: AccountHolderSimulateEnrollmentReviewParams =
            AccountHolderSimulateEnrollmentReviewParams.none()
    ): AccountHolderSimulateEnrollmentReviewResponse =
        simulateEnrollmentReview(params, RequestOptions.none())

    /** @see simulateEnrollmentReview */
    fun simulateEnrollmentReview(
        requestOptions: RequestOptions
    ): AccountHolderSimulateEnrollmentReviewResponse =
        simulateEnrollmentReview(AccountHolderSimulateEnrollmentReviewParams.none(), requestOptions)

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
    fun uploadDocument(
        accountHolderToken: String,
        params: AccountHolderUploadDocumentParams,
    ): Document = uploadDocument(accountHolderToken, params, RequestOptions.none())

    /** @see uploadDocument */
    fun uploadDocument(
        accountHolderToken: String,
        params: AccountHolderUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document =
        uploadDocument(
            params.toBuilder().accountHolderToken(accountHolderToken).build(),
            requestOptions,
        )

    /** @see uploadDocument */
    fun uploadDocument(params: AccountHolderUploadDocumentParams): Document =
        uploadDocument(params, RequestOptions.none())

    /** @see uploadDocument */
    fun uploadDocument(
        params: AccountHolderUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /**
     * A view of [AccountHolderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountHolderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/account_holders`, but is otherwise the same as
         * [AccountHolderService.create].
         */
        @MustBeClosed
        fun create(
            params: AccountHolderCreateParams
        ): HttpResponseFor<AccountHolderCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountHolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/account_holders/{account_holder_token}`, but is
         * otherwise the same as [AccountHolderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(accountHolderToken: String): HttpResponseFor<AccountHolder> =
            retrieve(accountHolderToken, AccountHolderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountHolderToken: String,
            params: AccountHolderRetrieveParams = AccountHolderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolder> =
            retrieve(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountHolderToken: String,
            params: AccountHolderRetrieveParams = AccountHolderRetrieveParams.none(),
        ): HttpResponseFor<AccountHolder> =
            retrieve(accountHolderToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountHolderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolder>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountHolderRetrieveParams): HttpResponseFor<AccountHolder> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountHolderToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolder> =
            retrieve(accountHolderToken, AccountHolderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/account_holders/{account_holder_token}`, but
         * is otherwise the same as [AccountHolderService.update].
         */
        @MustBeClosed
        fun update(
            accountHolderToken: String,
            params: AccountHolderUpdateParams,
        ): HttpResponseFor<AccountHolderUpdateResponse> =
            update(accountHolderToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            accountHolderToken: String,
            params: AccountHolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderUpdateResponse> =
            update(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountHolderUpdateParams
        ): HttpResponseFor<AccountHolderUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountHolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/account_holders`, but is otherwise the same as
         * [AccountHolderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountHolderListPage> = list(AccountHolderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountHolderListParams = AccountHolderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountHolderListParams = AccountHolderListParams.none()
        ): HttpResponseFor<AccountHolderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountHolderListPage> =
            list(AccountHolderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/account_holders/{account_holder_token}/documents`, but is otherwise the same as
         * [AccountHolderService.listDocuments].
         */
        @MustBeClosed
        fun listDocuments(
            accountHolderToken: String
        ): HttpResponseFor<AccountHolderListDocumentsResponse> =
            listDocuments(accountHolderToken, AccountHolderListDocumentsParams.none())

        /** @see listDocuments */
        @MustBeClosed
        fun listDocuments(
            accountHolderToken: String,
            params: AccountHolderListDocumentsParams = AccountHolderListDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderListDocumentsResponse> =
            listDocuments(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see listDocuments */
        @MustBeClosed
        fun listDocuments(
            accountHolderToken: String,
            params: AccountHolderListDocumentsParams = AccountHolderListDocumentsParams.none(),
        ): HttpResponseFor<AccountHolderListDocumentsResponse> =
            listDocuments(accountHolderToken, params, RequestOptions.none())

        /** @see listDocuments */
        @MustBeClosed
        fun listDocuments(
            params: AccountHolderListDocumentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderListDocumentsResponse>

        /** @see listDocuments */
        @MustBeClosed
        fun listDocuments(
            params: AccountHolderListDocumentsParams
        ): HttpResponseFor<AccountHolderListDocumentsResponse> =
            listDocuments(params, RequestOptions.none())

        /** @see listDocuments */
        @MustBeClosed
        fun listDocuments(
            accountHolderToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderListDocumentsResponse> =
            listDocuments(
                accountHolderToken,
                AccountHolderListDocumentsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/account_holders/{account_holder_token}/documents/{document_token}`, but is otherwise
         * the same as [AccountHolderService.retrieveDocument].
         */
        @MustBeClosed
        fun retrieveDocument(
            documentToken: String,
            params: AccountHolderRetrieveDocumentParams,
        ): HttpResponseFor<Document> =
            retrieveDocument(documentToken, params, RequestOptions.none())

        /** @see retrieveDocument */
        @MustBeClosed
        fun retrieveDocument(
            documentToken: String,
            params: AccountHolderRetrieveDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document> =
            retrieveDocument(
                params.toBuilder().documentToken(documentToken).build(),
                requestOptions,
            )

        /** @see retrieveDocument */
        @MustBeClosed
        fun retrieveDocument(
            params: AccountHolderRetrieveDocumentParams
        ): HttpResponseFor<Document> = retrieveDocument(params, RequestOptions.none())

        /** @see retrieveDocument */
        @MustBeClosed
        fun retrieveDocument(
            params: AccountHolderRetrieveDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/account_holders/enrollment_document_review`, but is otherwise the same as
         * [AccountHolderService.simulateEnrollmentDocumentReview].
         */
        @MustBeClosed
        fun simulateEnrollmentDocumentReview(
            params: AccountHolderSimulateEnrollmentDocumentReviewParams
        ): HttpResponseFor<Document> =
            simulateEnrollmentDocumentReview(params, RequestOptions.none())

        /** @see simulateEnrollmentDocumentReview */
        @MustBeClosed
        fun simulateEnrollmentDocumentReview(
            params: AccountHolderSimulateEnrollmentDocumentReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/account_holders/enrollment_review`,
         * but is otherwise the same as [AccountHolderService.simulateEnrollmentReview].
         */
        @MustBeClosed
        fun simulateEnrollmentReview():
            HttpResponseFor<AccountHolderSimulateEnrollmentReviewResponse> =
            simulateEnrollmentReview(AccountHolderSimulateEnrollmentReviewParams.none())

        /** @see simulateEnrollmentReview */
        @MustBeClosed
        fun simulateEnrollmentReview(
            params: AccountHolderSimulateEnrollmentReviewParams =
                AccountHolderSimulateEnrollmentReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderSimulateEnrollmentReviewResponse>

        /** @see simulateEnrollmentReview */
        @MustBeClosed
        fun simulateEnrollmentReview(
            params: AccountHolderSimulateEnrollmentReviewParams =
                AccountHolderSimulateEnrollmentReviewParams.none()
        ): HttpResponseFor<AccountHolderSimulateEnrollmentReviewResponse> =
            simulateEnrollmentReview(params, RequestOptions.none())

        /** @see simulateEnrollmentReview */
        @MustBeClosed
        fun simulateEnrollmentReview(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountHolderSimulateEnrollmentReviewResponse> =
            simulateEnrollmentReview(
                AccountHolderSimulateEnrollmentReviewParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/account_holders/{account_holder_token}/documents`, but is otherwise the same as
         * [AccountHolderService.uploadDocument].
         */
        @MustBeClosed
        fun uploadDocument(
            accountHolderToken: String,
            params: AccountHolderUploadDocumentParams,
        ): HttpResponseFor<Document> =
            uploadDocument(accountHolderToken, params, RequestOptions.none())

        /** @see uploadDocument */
        @MustBeClosed
        fun uploadDocument(
            accountHolderToken: String,
            params: AccountHolderUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document> =
            uploadDocument(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see uploadDocument */
        @MustBeClosed
        fun uploadDocument(params: AccountHolderUploadDocumentParams): HttpResponseFor<Document> =
            uploadDocument(params, RequestOptions.none())

        /** @see uploadDocument */
        @MustBeClosed
        fun uploadDocument(
            params: AccountHolderUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>
    }
}
