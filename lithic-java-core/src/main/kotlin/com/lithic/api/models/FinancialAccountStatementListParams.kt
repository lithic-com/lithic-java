// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class FinancialAccountStatementListParams
constructor(
    private val financialAccountToken: String,
    private val begin: LocalDate?,
    private val end: LocalDate?,
    private val endingBefore: String?,
    private val includeInitialStatements: Boolean?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun includeInitialStatements(): Optional<Boolean> =
        Optional.ofNullable(includeInitialStatements)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.begin?.let { queryParams.put("begin", listOf(it.toString())) }
        this.end?.let { queryParams.put("end", listOf(it.toString())) }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.includeInitialStatements?.let {
            queryParams.put("include_initial_statements", listOf(it.toString()))
        }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var begin: LocalDate? = null
        private var end: LocalDate? = null
        private var endingBefore: String? = null
        private var includeInitialStatements: Boolean? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountStatementListParams: FinancialAccountStatementListParams
        ) = apply {
            financialAccountToken = financialAccountStatementListParams.financialAccountToken
            begin = financialAccountStatementListParams.begin
            end = financialAccountStatementListParams.end
            endingBefore = financialAccountStatementListParams.endingBefore
            includeInitialStatements = financialAccountStatementListParams.includeInitialStatements
            pageSize = financialAccountStatementListParams.pageSize
            startingAfter = financialAccountStatementListParams.startingAfter
            additionalHeaders = financialAccountStatementListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountStatementListParams.additionalQueryParams.toBuilder()
        }

        /** Globally unique identifier for financial account. */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified date will be
         * included.
         */
        fun begin(begin: LocalDate) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified date will be
         * included.
         */
        fun end(end: LocalDate) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Whether to include the initial statement. It is not included by default. */
        fun includeInitialStatements(includeInitialStatements: Boolean) = apply {
            this.includeInitialStatements = includeInitialStatements
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): FinancialAccountStatementListParams =
            FinancialAccountStatementListParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                begin,
                end,
                endingBefore,
                includeInitialStatements,
                pageSize,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementListParams && financialAccountToken == other.financialAccountToken && begin == other.begin && end == other.end && endingBefore == other.endingBefore && includeInitialStatements == other.includeInitialStatements && pageSize == other.pageSize && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountToken, begin, end, endingBefore, includeInitialStatements, pageSize, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListParams{financialAccountToken=$financialAccountToken, begin=$begin, end=$end, endingBefore=$endingBefore, includeInitialStatements=$includeInitialStatements, pageSize=$pageSize, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
