// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.ContentTypes
import com.lithic.api.core.MultipartFormValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.multipartFormData
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.Dispute
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPage
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPage
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams

class DisputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputeService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Dispute> =
        jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Initiate a dispute. */
    override fun create(params: DisputeCreateParams, requestOptions: RequestOptions): Dispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "disputes")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Dispute> =
        jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get dispute. */
    override fun retrieve(params: DisputeRetrieveParams, requestOptions: RequestOptions): Dispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "disputes", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Dispute> =
        jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update dispute. Can only be modified if status is `NEW`. */
    override fun update(params: DisputeUpdateParams, requestOptions: RequestOptions): Dispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "disputes", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<DisputeListPage.Response> =
        jsonHandler<DisputeListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List disputes. */
    override fun list(params: DisputeListParams, requestOptions: RequestOptions): DisputeListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "disputes")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { DisputeListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<Dispute> =
        jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Withdraw dispute. */
    override fun delete(params: DisputeDeleteParams, requestOptions: RequestOptions): Dispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "disputes", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val deleteEvidenceHandler: Handler<DisputeEvidence> =
        jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    override fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "v1",
                    "disputes",
                    params.getPathParam(0),
                    "evidences",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteEvidenceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val initiateEvidenceUploadHandler: Handler<DisputeEvidence> =
        jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Use this endpoint to upload evidences for the dispute. It will return a URL to upload your
     * documents to. The URL will expire in 30 minutes.
     *
     * Uploaded documents must either be a `jpg`, `png` or `pdf` file, and each must be less than 5
     * GiB.
     */
    override fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "disputes", params.getPathParam(0), "evidences")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { initiateEvidenceUploadHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listEvidencesHandler: Handler<DisputeListEvidencesPage.Response> =
        jsonHandler<DisputeListEvidencesPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List evidence metadata for a dispute. */
    override fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions,
    ): DisputeListEvidencesPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "disputes", params.getPathParam(0), "evidences")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listEvidencesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { DisputeListEvidencesPage.of(this, params, it) }
    }

    private val retrieveEvidenceHandler: Handler<DisputeEvidence> =
        jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a dispute's evidence metadata. */
    override fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "disputes",
                    params.getPathParam(0),
                    "evidences",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveEvidenceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    override fun uploadEvidence(disputeToken: String, file: ByteArray) {
        val initiateParams =
            DisputeInitiateEvidenceUploadParams.builder().disputeToken(disputeToken).build()
        val initiateResponse = initiateEvidenceUpload(initiateParams)

        val uploadUrl =
            initiateResponse.uploadUrl().orElseThrow {
                LithicInvalidDataException("Missing 'upload_url' from response payload")
            }

        val fileParams = MultipartFormValue.fromByteArray("file", file, ContentTypes.DefaultBinary)
        val uploadRequest =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .url(uploadUrl)
                .body(multipartFormData(clientOptions.jsonMapper, arrayOf(fileParams)))
                .build()
        clientOptions.httpClient.execute(uploadRequest).let { response ->
            response.let { emptyHandler().handle(it) }
        }
    }
}
