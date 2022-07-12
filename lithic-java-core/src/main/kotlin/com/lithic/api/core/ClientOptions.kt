package com.lithic.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.lithic.api.core.http.HttpClient
import com.lithic.api.core.http.RetryingHttpClient

class ClientOptions
private constructor(
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    @get:JvmName("apiKey") val apiKey: String,
) {
    companion object {
        const val PRODUCTION_URL = "https://api.lithic.com/v1"

        const val SANDBOX_URL = "https://sandbox.lithic.com/v1"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {
        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper): Builder = apply { this.jsonMapper = jsonMapper }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String): Builder = apply { this.apiKey = apiKey }

        fun fromEnv(): Builder = apply { System.getenv("LITHIC_API_KEY")?.let { apiKey(it) } }

        fun build(): ClientOptions {
            return ClientOptions(
                RetryingHttpClient.builder()
                    .delegate(checkNotNull(httpClient))
                    .maxRetries(maxRetries)
                    .build(),
                jsonMapper ?: jsonMapper(),
                responseValidation,
                checkNotNull(this.apiKey) {
                    "Missing string value for 'apiKey'. A value can be specified either by calling 'apiKey()' or by using the client method 'fromEnv()' and the environment variable 'LITHIC_API_KEY'."
                },
            )
        }
    }
}
