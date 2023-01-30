package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects

class AuthRuleRetrieveParams
constructor(
    private val authRuleToken: String,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {

    fun authRuleToken(): String = authRuleToken

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleRetrieveParams &&
            authRuleToken == other.authRuleToken &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            authRuleToken,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AuthRuleRetrieveParams{authRuleToken=$authRuleToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(authRuleRetrieveParams: AuthRuleRetrieveParams) = apply {
            this.authRuleToken = authRuleRetrieveParams.authRuleToken
            additionalQueryParams(authRuleRetrieveParams.additionalQueryParams)
            additionalHeaders(authRuleRetrieveParams.additionalHeaders)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun build(): AuthRuleRetrieveParams =
            AuthRuleRetrieveParams(
                checkNotNull(authRuleToken) {
                    "Property `authRuleToken` is required but was not set"
                },
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
