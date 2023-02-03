package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountListParams
constructor(
    private val begin: String?,
    private val end: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {

    fun begin(): Optional<String> = Optional.ofNullable(begin)

    fun end(): Optional<String> = Optional.ofNullable(end)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        AccountListQueryParams(begin, end, page, pageSize, additionalQueryParams).toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    class AccountListQueryParams
    internal constructor(
        private val begin: String?,
        private val end: String?,
        private val page: Long?,
        private val pageSize: Long?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {

        private var hashCode: Int = 0

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

            return other is AccountListQueryParams &&
                this.begin == other.begin &&
                this.end == other.end &&
                this.page == other.page &&
                this.pageSize == other.pageSize &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
            "AccountListQueryParams{begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var begin: String? = null
            private var end: String? = null
            private var page: Long? = null
            private var pageSize: Long? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(accountListQueryParams: AccountListQueryParams) = apply {
                this.begin = accountListQueryParams.begin
                this.end = accountListQueryParams.end
                this.page = accountListQueryParams.page
                this.pageSize = accountListQueryParams.pageSize
                additionalProperties(accountListQueryParams.additionalProperties)
            }

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

            fun putAdditionalProperty(key: String, value: String) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: ListMultimap<String, String>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): AccountListQueryParams =
                AccountListQueryParams(
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

        return other is AccountListParams &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.page == other.page &&
            this.pageSize == other.pageSize &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            begin,
            end,
            page,
            pageSize,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AccountListParams{begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: String? = null
        private var end: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(accountListParams: AccountListParams) = apply {
            this.begin = accountListParams.begin
            this.end = accountListParams.end
            this.page = accountListParams.page
            this.pageSize = accountListParams.pageSize
            additionalQueryParams(accountListParams.additionalQueryParams)
            additionalHeaders(accountListParams.additionalHeaders)
        }

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

        fun build(): AccountListParams =
            AccountListParams(
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
