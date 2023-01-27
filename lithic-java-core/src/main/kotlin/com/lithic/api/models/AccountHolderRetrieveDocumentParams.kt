package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects

class AccountHolderRetrieveDocumentParams
constructor(
    private val accountHolderToken: String,
    private val documentToken: String,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun documentToken(): String = documentToken

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            1 -> documentToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderRetrieveDocumentParams &&
            accountHolderToken == other.accountHolderToken &&
            documentToken == other.documentToken &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
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
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

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

        fun build(): AccountHolderRetrieveDocumentParams =
            AccountHolderRetrieveDocumentParams(
                accountHolderToken!!,
                documentToken!!,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
