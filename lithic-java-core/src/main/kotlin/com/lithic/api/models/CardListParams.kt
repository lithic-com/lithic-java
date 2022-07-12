package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardListParams
constructor(
    private val accountToken: String?,
    private val begin: String?,
    private val end: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun begin(): Optional<String> = Optional.ofNullable(begin)

    fun end(): Optional<String> = Optional.ofNullable(end)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        CardListQueryParams(accountToken, begin, end, page, pageSize, additionalQueryParams)
            .toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    class CardListQueryParams
    internal constructor(
        private val accountToken: String?,
        private val begin: String?,
        private val end: String?,
        private val page: Long?,
        private val pageSize: Long?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {
        private var hashCode: Int = 0

        /**
         * Only required for multi-account users. Returns cards associated with this account. Only
         * applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(): String? = accountToken

        /**
         * Date string in 8601 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(): String? = begin

        /**
         * Date string in 8601 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(): String? = end

        /** Page (for pagination). */
        fun page(): Long? = page

        /** Page size (for pagination). */
        fun pageSize(): Long? = pageSize

        fun _additionalProperties(): ListMultimap<String, String> = additionalProperties

        fun toQueryParams(): ListMultimap<String, String> {
            val params = ArrayListMultimap.create<String, String>()
            this.accountToken()?.let { params.put("account_token", it.toString()) }
            this.begin()?.let { params.put("begin", it.toString()) }
            this.end()?.let { params.put("end", it.toString()) }
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

            return other is CardListQueryParams &&
                accountToken == other.accountToken &&
                begin == other.begin &&
                end == other.end &&
                page == other.page &&
                pageSize == other.pageSize &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        begin,
                        end,
                        page,
                        pageSize,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardListQueryParams{accountToken=$accountToken, begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var accountToken: String? = null
            private var begin: String? = null
            private var end: String? = null
            private var page: Long? = null
            private var pageSize: Long? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(cardListQueryParams: CardListQueryParams) = apply {
                this.accountToken = cardListQueryParams.accountToken
                this.begin = cardListQueryParams.begin
                this.end = cardListQueryParams.end
                this.page = cardListQueryParams.page
                this.pageSize = cardListQueryParams.pageSize
                additionalProperties(cardListQueryParams.additionalProperties)
            }

            /**
             * Only required for multi-account users. Returns cards associated with this account.
             * Only applicable if using account holder enrollment. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
             * information.
             */
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /**
             * Date string in 8601 format. Only entries created after the specified date will be
             * included. UTC time zone.
             */
            fun begin(begin: String) = apply { this.begin = begin }

            /**
             * Date string in 8601 format. Only entries created before the specified date will be
             * included. UTC time zone.
             */
            fun end(end: String) = apply { this.end = end }

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

            fun build(): CardListQueryParams =
                CardListQueryParams(
                    accountToken,
                    begin,
                    end,
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

        return other is CardListParams &&
            accountToken == other.accountToken &&
            begin == other.begin &&
            end == other.end &&
            page == other.page &&
            pageSize == other.pageSize &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            begin,
            end,
            page,
            pageSize,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardListParams{accountToken=$accountToken, begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var accountToken: String? = null
        private var begin: String? = null
        private var end: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(cardListParams: CardListParams) = apply {
            this.accountToken = cardListParams.accountToken
            this.begin = cardListParams.begin
            this.end = cardListParams.end
            this.page = cardListParams.page
            this.pageSize = cardListParams.pageSize
            additionalQueryParams(cardListParams.additionalQueryParams)
            additionalHeaders(cardListParams.additionalHeaders)
        }

        /**
         * Only required for multi-account users. Returns cards associated with this account. Only
         * applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * Date string in 8601 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(begin: String) = apply { this.begin = begin }

        /**
         * Date string in 8601 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(end: String) = apply { this.end = end }

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

        fun build(): CardListParams =
            CardListParams(
                accountToken,
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
