package com.lithic.api.client.okhttp

import com.lithic.api.client.LithicClient
import com.lithic.api.client.LithicClientImpl
import com.lithic.api.core.ClientOptions
import java.time.Duration

class LithicOkHttpClient private constructor() {

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

        fun responseValidation(responseValidation: Boolean) = apply {
            this.clientOptions.responseValidation(responseValidation)
        }

        fun apiKey(apiKey: String): Builder = apply { clientOptions.apiKey(apiKey) }

        fun fromEnv(): Builder = apply { clientOptions.fromEnv() }

        fun build(): LithicClient {
            return LithicClientImpl(
                clientOptions
                    .httpClient(OkHttpClient.builder().baseUrl(baseUrl).timeout(timeout).build())
                    .build()
            )
        }
    }
}
