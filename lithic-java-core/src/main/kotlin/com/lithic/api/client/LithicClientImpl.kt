package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.*
import com.lithic.api.services.blocking.*
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class LithicClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : LithicClient {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val accountHolders: AccountHolderService by lazy {
        AccountHolderServiceImpl(clientOptions)
    }

    private val authRules: AuthRuleService by lazy { AuthRuleServiceImpl(clientOptions) }

    private val authStreamEnrollment: AuthStreamEnrollmentService by lazy {
        AuthStreamEnrollmentServiceImpl(clientOptions)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val fundingSources: FundingSourceService by lazy {
        FundingSourceServiceImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    override fun accounts(): AccountService = accounts

    override fun accountHolders(): AccountHolderService = accountHolders

    override fun authRules(): AuthRuleService = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentService = authStreamEnrollment

    override fun cards(): CardService = cards

    override fun fundingSources(): FundingSourceService = fundingSources

    override fun transactions(): TransactionService = transactions

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** API status check */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): ApiStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("status")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { apiStatusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
