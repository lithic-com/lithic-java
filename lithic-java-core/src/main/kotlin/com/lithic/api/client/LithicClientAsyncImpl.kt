package com.lithic.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

class LithicClientAsyncImpl constructor(private val clientOptions: ClientOptions,) : LithicClientAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val accountHolders: AccountHolderServiceAsync by lazy { AccountHolderServiceAsyncImpl(clientOptions) }

    private val authRules: AuthRuleServiceAsync by lazy { AuthRuleServiceAsyncImpl(clientOptions) }

    private val authStreamEnrollment: AuthStreamEnrollmentServiceAsync by lazy { AuthStreamEnrollmentServiceAsyncImpl(clientOptions) }

    private val tokenizationDecisioning: TokenizationDecisioningServiceAsync by lazy { TokenizationDecisioningServiceAsyncImpl(clientOptions) }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val disputes: DisputeServiceAsync by lazy { DisputeServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val transactions: TransactionServiceAsync by lazy { TransactionServiceAsyncImpl(clientOptions) }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountHolders(): AccountHolderServiceAsync = accountHolders

    override fun authRules(): AuthRuleServiceAsync = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync = authStreamEnrollment

    override fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync = tokenizationDecisioning

    override fun cards(): CardServiceAsync = cards

    override fun disputes(): DisputeServiceAsync = disputes

    override fun events(): EventServiceAsync = events

    override fun transactions(): TransactionServiceAsync = transactions

    override fun webhooks(): WebhookServiceAsync = webhooks

    private val apiStatusHandler: Handler<ApiStatus> =
    jsonHandler<ApiStatus>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
