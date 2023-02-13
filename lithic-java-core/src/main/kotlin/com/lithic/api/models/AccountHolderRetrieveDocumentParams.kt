package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects

class AccountHolderRetrieveDocumentParams
constructor(
    private val accountHolderToken: String,
    private val documentToken: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun documentToken(): String = documentToken

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            1 -> documentToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderRetrieveDocumentParams &&
            this.accountHolderToken == other.accountHolderToken &&
            this.documentToken == other.documentToken &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountHolderToken,
            documentToken,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AccountHolderRetrieveDocumentParams{accountHolderToken=$accountHolderToken, documentToken=$documentToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var documentToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountHolderRetrieveDocumentParams: AccountHolderRetrieveDocumentParams
        ) = apply {
            this.accountHolderToken = accountHolderRetrieveDocumentParams.accountHolderToken
            this.documentToken = accountHolderRetrieveDocumentParams.documentToken
            additionalQueryParams(accountHolderRetrieveDocumentParams.additionalQueryParams)
            additionalHeaders(accountHolderRetrieveDocumentParams.additionalHeaders)
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        fun documentToken(documentToken: String) = apply { this.documentToken = documentToken }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putQueryParam(key: String, value: List<String>) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParam)
        }

        fun removeQueryParam(key: String) = apply {
            this.additionalQueryParams.put(key, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(key: String, value: String) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putHeader(key: String, value: List<String>) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            additionalHeaders.forEach(this::putHeader)
        }

        fun removeHeader(key: String) = apply { this.additionalHeaders.put(key, mutableListOf()) }

        fun build(): AccountHolderRetrieveDocumentParams =
            AccountHolderRetrieveDocumentParams(
                checkNotNull(accountHolderToken) {
                    "Property `accountHolderToken` is required but was not set"
                },
                checkNotNull(documentToken) {
                    "Property `documentToken` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
