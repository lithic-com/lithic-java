package com.lithic.api.models

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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun begin(): Optional<String> = Optional.ofNullable(begin)

    fun end(): Optional<String> = Optional.ofNullable(end)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.page?.let { params.put("page", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

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

        fun build(): AccountListParams =
            AccountListParams(
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
