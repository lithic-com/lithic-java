package com.lithic.api.client.okhttp

import com.lithic.api.core.ClientOptions
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.*
import java.time.Duration

class LithicClientAsync private constructor(private val clientOptions: ClientOptions) {
    @get:JvmName("accounts")
    val accounts: AccountServiceAsync by lazy { AccountServiceAsync(clientOptions) }

    @get:JvmName("accountHolders")
    val accountHolders: AccountHolderServiceAsync by lazy {
        AccountHolderServiceAsync(clientOptions)
    }

    @get:JvmName("authRules")
    val authRules: AuthRuleServiceAsync by lazy { AuthRuleServiceAsync(clientOptions) }

    @get:JvmName("authStreamEnrollment")
    val authStreamEnrollment: AuthStreamEnrollmentServiceAsync by lazy {
        AuthStreamEnrollmentServiceAsync(clientOptions)
    }

    @get:JvmName("cards") val cards: CardServiceAsync by lazy { CardServiceAsync(clientOptions) }

    @get:JvmName("fundingSources")
    val fundingSources: FundingSourceServiceAsync by lazy {
        FundingSourceServiceAsync(clientOptions)
    }

    @get:JvmName("transactions")
    val transactions: TransactionServiceAsync by lazy { TransactionServiceAsync(clientOptions) }

    private val lithicClientInternalService: LithicClientInternalServiceAsync by lazy {
        LithicClientInternalServiceAsync(clientOptions)
    }

    companion object {
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): LithicClientAsync = builder().fromEnv().build()
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

        fun build(): LithicClientAsync {
            return LithicClientAsync(
                clientOptions
                    .httpClient(OkHttpClient.builder().baseUrl(baseUrl).timeout(timeout).build())
                    .build()
            )
        }
    }
}
