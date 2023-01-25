package com.lithic.api.client.okhttp

import com.lithic.api.core.ClientOptions
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.*
import com.lithic.api.services.blocking.*
import java.time.Duration
import kotlin.LazyThreadSafetyMode.PUBLICATION

class LithicClient private constructor(private val clientOptions: ClientOptions) {
    private val accounts: AccountService by lazy(PUBLICATION) { AccountServiceImpl(clientOptions) }
    private val accountHolders: AccountHolderService by
        lazy(PUBLICATION) { AccountHolderServiceImpl(clientOptions) }
    private val authRules: AuthRuleService by
        lazy(PUBLICATION) { AuthRuleServiceImpl(clientOptions) }
    private val authStreamEnrollment: AuthStreamEnrollmentService by
        lazy(PUBLICATION) { AuthStreamEnrollmentServiceImpl(clientOptions) }
    private val cards: CardService by lazy(PUBLICATION) { CardServiceImpl(clientOptions) }
    private val fundingSources: FundingSourceService by
        lazy(PUBLICATION) { FundingSourceServiceImpl(clientOptions) }
    private val transactions: TransactionService by
        lazy(PUBLICATION) { TransactionServiceImpl(clientOptions) }

    private val lithicClientInternalService: LithicClientInternalServiceImpl by
        lazy(PUBLICATION) { LithicClientInternalServiceImpl(clientOptions) }

    fun accounts(): AccountService = accounts

    fun accountHolders(): AccountHolderService = accountHolders

    fun authRules(): AuthRuleService = authRules

    fun authStreamEnrollment(): AuthStreamEnrollmentService = authStreamEnrollment

    fun cards(): CardService = cards

    fun fundingSources(): FundingSourceService = fundingSources

    fun transactions(): TransactionService = transactions

    fun lithicClientInternalService(): LithicClientInternalService = lithicClientInternalService

    /** API status check */
    fun apiStatus(params: ClientApiStatusParams) = lithicClientInternalService.apiStatus(params)

    companion object {
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): LithicClient = builder().fromEnv().build()
    }

    class Builder {
        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var baseUrl: String = ClientOptions.PRODUCTION_URL
        private var timeout: Duration = Duration.ofSeconds(60)
        private var maxRetries: Int = 2

        fun sandbox() = apply { baseUrl(ClientOptions.SANDBOX_URL) }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun timeout(timeout: Duration) = apply { this.timeout = timeout }

        fun maxRetries(maxRetries: Int) = apply { this.clientOptions.maxRetries(maxRetries) }

        fun apiKey(apiKey: String): Builder = apply { clientOptions.apiKey(apiKey) }

        fun fromEnv(): Builder = apply { clientOptions.fromEnv() }

        fun build(): LithicClient {
            return LithicClient(
                clientOptions
                    .httpClient(OkHttpClient.builder().baseUrl(baseUrl).timeout(timeout).build())
                    .build()
            )
        }
    }
}
