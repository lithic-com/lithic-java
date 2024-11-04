// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.http.HttpClient
import com.lithic.api.core.http.PhantomReachableClosingHttpClient
import com.lithic.api.core.http.RetryingHttpClient
import java.time.Clock

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    @get:JvmName("maxRetries") val maxRetries: Int,
    @get:JvmName("apiKey") val apiKey: String,
    @get:JvmName("webhookSecret") val webhookSecret: String?,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.lithic.com"

        const val SANDBOX_URL = "https://sandbox.lithic.com"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: ListMultimap<String, String> = ArrayListMultimap.create()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var webhookSecret: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = ArrayListMultimap.create(clientOptions.headers)
            queryParams = ArrayListMultimap.create(clientOptions.queryParams)
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            webhookSecret = clientOptions.webhookSecret
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            headers.putAll(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::putHeaders)
        }

        fun replaceHeaders(name: String, value: String) = apply {
            headers.replaceValues(name, listOf(value))
        }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replaceValues(name, values)
        }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::replaceHeaders)
        }

        fun removeHeaders(name: String) = apply { headers.removeAll(name) }

        fun removeAllHeaders(names: Set<String>) = apply { names.forEach(::removeHeaders) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.putAll(key, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::putQueryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replaceValues(key, listOf(value))
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replaceValues(key, values)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::replaceQueryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.removeAll(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { keys.forEach(::removeQueryParams) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun fromEnv() = apply {
            System.getenv("LITHIC_API_KEY")?.let { apiKey(it) }
            System.getenv("LITHIC_WEBHOOK_SECRET")?.let { webhookSecret(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(apiKey) { "`apiKey` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("X-Lithic-Pagination", "cursor")
            if (!apiKey.isNullOrEmpty()) {
                headers.put("Authorization", apiKey)
            }
            this.headers.asMap().forEach(headers::replaceValues)
            this.queryParams.asMap().forEach(queryParams::replaceValues)

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .build()
                ),
                jsonMapper,
                clock,
                baseUrl,
                headers.toImmutable(),
                queryParams.toImmutable(),
                responseValidation,
                maxRetries,
                apiKey!!,
                webhookSecret,
            )
        }
    }
}
