package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class LithicClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LithicClientAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val accountHolders: AccountHolderServiceAsync by lazy {
        AccountHolderServiceAsyncImpl(clientOptions)
    }

    private val authRules: AuthRuleServiceAsync by lazy { AuthRuleServiceAsyncImpl(clientOptions) }

    private val authStreamEnrollment: AuthStreamEnrollmentServiceAsync by lazy {
        AuthStreamEnrollmentServiceAsyncImpl(clientOptions)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val fundingSources: FundingSourceServiceAsync by lazy {
        FundingSourceServiceAsyncImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountHolders(): AccountHolderServiceAsync = accountHolders

    override fun authRules(): AuthRuleServiceAsync = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync = authStreamEnrollment

    override fun cards(): CardServiceAsync = cards

    override fun events(): EventServiceAsync = events

    override fun fundingSources(): FundingSourceServiceAsync = fundingSources

    override fun transactions(): TransactionServiceAsync = transactions

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** API status check */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ApiStatus> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("status")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
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
