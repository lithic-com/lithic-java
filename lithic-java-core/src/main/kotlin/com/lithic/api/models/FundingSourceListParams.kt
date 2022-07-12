package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FundingSourceListParams
constructor(
    private val accountToken: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        FundingSourceListQueryParams(accountToken, page, pageSize, additionalQueryParams)
            .toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    class FundingSourceListQueryParams
    internal constructor(
        private val accountToken: String?,
        private val page: Long?,
        private val pageSize: Long?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {
        private var hashCode: Int = 0

        fun accountToken(): String? = accountToken

        /** Page (for pagination). */
        fun page(): Long? = page

        /** Page size (for pagination). */
        fun pageSize(): Long? = pageSize

        fun _additionalProperties(): ListMultimap<String, String> = additionalProperties

        fun toQueryParams(): ListMultimap<String, String> {
            val params = ArrayListMultimap.create<String, String>()
            this.accountToken()?.let { params.put("account_token", it.toString()) }
            this.page()?.let { params.put("page", it.toString()) }
            this.pageSize()?.let { params.put("page_size", it.toString()) }
            params.putAll(additionalProperties)
            return Multimaps.unmodifiableListMultimap(params)
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingSourceListQueryParams &&
                accountToken == other.accountToken &&
                page == other.page &&
                pageSize == other.pageSize &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        page,
                        pageSize,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FundingSourceListQueryParams{accountToken=$accountToken, page=$page, pageSize=$pageSize, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var accountToken: String? = null
            private var page: Long? = null
            private var pageSize: Long? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(fundingSourceListQueryParams: FundingSourceListQueryParams) = apply {
                this.accountToken = fundingSourceListQueryParams.accountToken
                this.page = fundingSourceListQueryParams.page
                this.pageSize = fundingSourceListQueryParams.pageSize
                additionalProperties(fundingSourceListQueryParams.additionalProperties)
            }

            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** Page (for pagination). */
            fun page(page: Long) = apply { this.page = page }

            /** Page size (for pagination). */
            fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

            fun additionalProperties(additionalProperties: ListMultimap<String, String>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperties(key: String, value: String) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: ListMultimap<String, String>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): FundingSourceListQueryParams =
                FundingSourceListQueryParams(
                    accountToken,
                    page,
                    pageSize,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSourceListParams &&
            accountToken == other.accountToken &&
            page == other.page &&
            pageSize == other.pageSize &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            page,
            pageSize,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "FundingSourceListParams{accountToken=$accountToken, page=$page, pageSize=$pageSize, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var accountToken: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(fundingSourceListParams: FundingSourceListParams) = apply {
            this.accountToken = fundingSourceListParams.accountToken
            this.page = fundingSourceListParams.page
            this.pageSize = fundingSourceListParams.pageSize
            additionalQueryParams(fundingSourceListParams.additionalQueryParams)
            additionalHeaders(fundingSourceListParams.additionalHeaders)
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /** Page (for pagination). */
        fun page(page: Long) = apply { this.page = page }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

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

        fun build(): FundingSourceListParams =
            FundingSourceListParams(
                accountToken,
                page,
                pageSize,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
