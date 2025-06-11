// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.Dispute
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPage
import com.lithic.api.models.DisputeListEvidencesPageResponse
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPage
import com.lithic.api.models.DisputeListPageResponse
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams
import kotlin.jvm.optionals.getOrNull

class DisputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputeService {

    private val withRawResponse: DisputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DisputeService.WithRawResponse = withRawResponse

    override fun create(params: DisputeCreateParams, requestOptions: RequestOptions): Dispute =
        // post /v1/disputes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: DisputeRetrieveParams, requestOptions: RequestOptions): Dispute =
        // get /v1/disputes/{dispute_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: DisputeUpdateParams, requestOptions: RequestOptions): Dispute =
        // patch /v1/disputes/{dispute_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: DisputeListParams, requestOptions: RequestOptions): DisputeListPage =
        // get /v1/disputes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DisputeDeleteParams, requestOptions: RequestOptions): Dispute =
        // delete /v1/disputes/{dispute_token}
        withRawResponse().delete(params, requestOptions).parse()

    override fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence =
        // delete /v1/disputes/{dispute_token}/evidences/{evidence_token}
        withRawResponse().deleteEvidence(params, requestOptions).parse()

    override fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence =
        // post /v1/disputes/{dispute_token}/evidences
        withRawResponse().initiateEvidenceUpload(params, requestOptions).parse()

    override fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions,
    ): DisputeListEvidencesPage =
        // get /v1/disputes/{dispute_token}/evidences
        withRawResponse().listEvidences(params, requestOptions).parse()

    override fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions,
    ): DisputeEvidence =
        // get /v1/disputes/{dispute_token}/evidences/{evidence_token}
        withRawResponse().retrieveEvidence(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Dispute> =
            jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DisputeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dispute> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Dispute> =
            jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Dispute> =
            jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DisputeListPageResponse> =
            jsonHandler<DisputeListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DisputeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DisputeListPage.builder()
                            .service(DisputeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Dispute> =
            jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: DisputeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteEvidenceHandler: Handler<DisputeEvidence> =
            jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun deleteEvidence(
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeEvidence> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evidenceToken", params.evidenceToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "disputes",
                        params._pathParam(0),
                        "evidences",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteEvidenceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiateEvidenceUploadHandler: Handler<DisputeEvidence> =
            jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeEvidence> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes", params._pathParam(0), "evidences")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { initiateEvidenceUploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEvidencesHandler: Handler<DisputeListEvidencesPageResponse> =
            jsonHandler<DisputeListEvidencesPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listEvidences(
            params: DisputeListEvidencesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeListEvidencesPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "disputes", params._pathParam(0), "evidences")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listEvidencesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DisputeListEvidencesPage.builder()
                            .service(DisputeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveEvidenceHandler: Handler<DisputeEvidence> =
            jsonHandler<DisputeEvidence>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeEvidence> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evidenceToken", params.evidenceToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "disputes",
                        params._pathParam(0),
                        "evidences",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveEvidenceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
