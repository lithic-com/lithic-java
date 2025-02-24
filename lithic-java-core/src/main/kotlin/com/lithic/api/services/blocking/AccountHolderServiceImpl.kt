// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
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
import java.time.Duration

class AccountHolderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountHolderService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountHolderCreateResponse> =
        jsonHandler<AccountHolderCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create an account holder and initiate the appropriate onboarding workflow. Account holders
     * and accounts have a 1:1 relationship. When an account holder is successfully created an
     * associated account is also created. All calls to this endpoint will return an immediate
     * response - though in some cases, the response may indicate the enrollment is under review or
     * further action will be needed to complete the account enrollment process. This endpoint can
     * only be used on accounts that are part of the program that the calling API key manages.
     */
    override fun create(
        params: AccountHolderCreateParams,
        requestOptions: RequestOptions,
    ): AccountHolderCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "account_holders")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response =
            clientOptions.httpClient.execute(
                request,
                requestOptions.applyDefaults(
                    RequestOptions.builder().timeout(Duration.ofMillis(300000)).build()
                ),
            )
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<AccountHolder> =
        jsonHandler<AccountHolder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an Individual or Business Account Holder and/or their KYC or KYB evaluation status. */
    override fun retrieve(
        params: AccountHolderRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountHolder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "account_holders", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<AccountHolderUpdateResponse> =
        jsonHandler<AccountHolderUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the information associated with a particular account holder. */
    override fun update(
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions,
    ): AccountHolderUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "account_holders", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<AccountHolderListPage.Response> =
        jsonHandler<AccountHolderListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a list of individual or business account holders and their KYC or KYB evaluation status.
     */
    override fun list(
        params: AccountHolderListParams,
        requestOptions: RequestOptions,
    ): AccountHolderListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "account_holders")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { AccountHolderListPage.of(this, params, it) }
    }

    private val listDocumentsHandler: Handler<AccountHolderListDocumentsResponse> =
        jsonHandler<AccountHolderListDocumentsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun listDocuments(
        params: AccountHolderListDocumentsParams,
        requestOptions: RequestOptions,
    ): AccountHolderListDocumentsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "account_holders", params.getPathParam(0), "documents")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listDocumentsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveDocumentHandler: Handler<Document> =
        jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun retrieveDocument(
        params: AccountHolderRetrieveDocumentParams,
        requestOptions: RequestOptions,
    ): Document {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "account_holders",
                    params.getPathParam(0),
                    "documents",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveDocumentHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateEnrollmentDocumentReviewHandler: Handler<Document> =
        jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulates a review for an account holder document upload. */
    override fun simulateEnrollmentDocumentReview(
        params: AccountHolderSimulateEnrollmentDocumentReviewParams,
        requestOptions: RequestOptions,
    ): Document {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "account_holders", "enrollment_document_review")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateEnrollmentDocumentReviewHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateEnrollmentReviewHandler:
        Handler<AccountHolderSimulateEnrollmentReviewResponse> =
        jsonHandler<AccountHolderSimulateEnrollmentReviewResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an enrollment review for an account holder. This endpoint is only applicable for
     * workflows that may required intervention such as `KYB_BASIC`.
     */
    override fun simulateEnrollmentReview(
        params: AccountHolderSimulateEnrollmentReviewParams,
        requestOptions: RequestOptions,
    ): AccountHolderSimulateEnrollmentReviewResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "account_holders", "enrollment_review")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateEnrollmentReviewHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val uploadDocumentHandler: Handler<Document> =
        jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun uploadDocument(
        params: AccountHolderUploadDocumentParams,
        requestOptions: RequestOptions,
    ): Document {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "account_holders", params.getPathParam(0), "documents")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { uploadDocumentHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
