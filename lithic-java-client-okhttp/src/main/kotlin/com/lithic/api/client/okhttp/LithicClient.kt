package com.lithic.api.client.okhttp

import com.lithic.api.core.ClientOptions
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.*
import java.time.Duration

class LithicClient private constructor(private val clientOptions: ClientOptions) {
    @get:JvmName("accounts") val accounts: AccountService by lazy { AccountService(clientOptions) }

    @get:JvmName("accountHolders")
    val accountHolders: AccountHolderService by lazy { AccountHolderService(clientOptions) }

    @get:JvmName("authRules")
    val authRules: AuthRuleService by lazy { AuthRuleService(clientOptions) }

    @get:JvmName("authStreamEnrollment")
    val authStreamEnrollment: AuthStreamEnrollmentService by lazy {
        AuthStreamEnrollmentService(clientOptions)
    }

    @get:JvmName("cards") val cards: CardService by lazy { CardService(clientOptions) }

    @get:JvmName("fundingSources")
    val fundingSources: FundingSourceService by lazy { FundingSourceService(clientOptions) }

    @get:JvmName("transactions")
    val transactions: TransactionService by lazy { TransactionService(clientOptions) }

    private val lithicClientInternalService: LithicClientInternalService by lazy {
        LithicClientInternalService(clientOptions)
    }

    companion object {
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): LithicClient = builder().fromEnv().build()
    }

    /** API status check */
    fun apiStatus(params: ClientApiStatusParams) = lithicClientInternalService.apiStatus(params)

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
