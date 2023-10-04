// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AccountHolder
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderDocument
import com.lithic.api.models.AccountHolderListDocumentsParams
import com.lithic.api.models.AccountHolderListDocumentsResponse
import com.lithic.api.models.AccountHolderResubmitParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderRetrieveParams
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUpdateResponse
import com.lithic.api.models.AccountHolderUploadDocumentParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.time.Duration

class AccountHolderServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountHolderService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountHolder> =
        jsonHandler<AccountHolder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Run an individual or business's information through the Customer Identification Program (CIP)
     * and return an `account_token` if the status is accepted or pending (i.e., further action
     * required). All calls to this endpoint will return an immediate response - though in some
     * cases, the response may indicate the workflow is under review or further action will be
     * needed to complete the account creation process. This endpoint can only be used on accounts
     * that are part of the program the calling API key manages.
     */
    override fun create(
        params: AccountHolderCreateParams,
        requestOptions: RequestOptions
    ): AccountHolder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_holders")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient
            .execute(
                request,
                requestOptions.applyDefaults(
                    RequestOptions.builder().timeout(Duration.ofMillis(300000)).build()
                )
            )
            .let { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<AccountHolder> =
        jsonHandler<AccountHolder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an Individual or Business Account Holder and/or their KYC or KYB evaluation status. */
    override fun retrieve(
        params: AccountHolderRetrieveParams,
        requestOptions: RequestOptions
    ): AccountHolder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_holders", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AccountHolderUpdateResponse> =
        jsonHandler<AccountHolderUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the information associated with a particular account holder. */
    override fun update(
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions
    ): AccountHolderUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("account_holders", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
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
        requestOptions: RequestOptions
    ): AccountHolderListDocumentsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_holders", params.getPathParam(0), "documents")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listDocumentsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val resubmitHandler: Handler<AccountHolder> =
        jsonHandler<AccountHolder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Resubmit a KYC submission. This endpoint should be used in cases where a KYC submission
     * returned a `PENDING_RESUBMIT` result, meaning one or more critical KYC fields may have been
     * mis-entered and the individual's identity has not yet been successfully verified. This step
     * must be completed in order to proceed with the KYC evaluation.
     *
     * Two resubmission attempts are permitted via this endpoint before a `REJECTED` status is
     * returned and the account creation process is ended.
     */
    override fun resubmit(
        params: AccountHolderResubmitParams,
        requestOptions: RequestOptions
    ): AccountHolder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_holders", params.getPathParam(0), "resubmit")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { resubmitHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveDocumentHandler: Handler<AccountHolderDocument> =
        jsonHandler<AccountHolderDocument>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
        requestOptions: RequestOptions
    ): AccountHolderDocument {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "account_holders",
                    params.getPathParam(0),
                    "documents",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveDocumentHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val uploadDocumentHandler: Handler<AccountHolderDocument> =
        jsonHandler<AccountHolderDocument>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
        requestOptions: RequestOptions
    ): AccountHolderDocument {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_holders", params.getPathParam(0), "documents")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { uploadDocumentHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
