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
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPage
import com.lithic.api.models.ExternalBankAccountListPageResponse
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositService
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalBankAccountServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalBankAccountService {

    private val withRawResponse: ExternalBankAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val microDeposits: MicroDepositService by lazy {
        MicroDepositServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalBankAccountService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalBankAccountService =
        ExternalBankAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun microDeposits(): MicroDepositService = microDeposits

    override fun create(
        params: ExternalBankAccountCreateParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountCreateResponse =
        // post /v1/external_bank_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetrieveResponse =
        // get /v1/external_bank_accounts/{external_bank_account_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountUpdateResponse =
        // patch /v1/external_bank_accounts/{external_bank_account_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExternalBankAccountListParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountListPage =
        // get /v1/external_bank_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetryMicroDepositsResponse =
        // post /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits
        withRawResponse().retryMicroDeposits(params, requestOptions).parse()

    override fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetryPrenoteResponse =
        // post /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote
        withRawResponse().retryPrenote(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalBankAccountService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val microDeposits: MicroDepositService.WithRawResponse by lazy {
            MicroDepositServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalBankAccountService.WithRawResponse =
            ExternalBankAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun microDeposits(): MicroDepositService.WithRawResponse = microDeposits

        private val createHandler: Handler<ExternalBankAccountCreateResponse> =
            jsonHandler<ExternalBankAccountCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ExternalBankAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_bank_accounts")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<ExternalBankAccountRetrieveResponse> =
            jsonHandler<ExternalBankAccountRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBankAccountToken", params.externalBankAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_bank_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<ExternalBankAccountUpdateResponse> =
            jsonHandler<ExternalBankAccountUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBankAccountToken", params.externalBankAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_bank_accounts", params._pathParam(0))
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

        private val listHandler: Handler<ExternalBankAccountListPageResponse> =
            jsonHandler<ExternalBankAccountListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExternalBankAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_bank_accounts")
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
                        ExternalBankAccountListPage.builder()
                            .service(ExternalBankAccountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retryMicroDepositsHandler:
            Handler<ExternalBankAccountRetryMicroDepositsResponse> =
            jsonHandler<ExternalBankAccountRetryMicroDepositsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBankAccountToken", params.externalBankAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "external_bank_accounts",
                        params._pathParam(0),
                        "retry_micro_deposits",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retryMicroDepositsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retryPrenoteHandler: Handler<ExternalBankAccountRetryPrenoteResponse> =
            jsonHandler<ExternalBankAccountRetryPrenoteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBankAccountToken", params.externalBankAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "external_bank_accounts",
                        params._pathParam(0),
                        "retry_prenote",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retryPrenoteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
