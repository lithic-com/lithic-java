// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun includeInitialStatements(): Optional<Boolean> =
        Optional.ofNullable(includeInitialStatements)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.includeInitialStatements?.let {
            params.put("include_initial_statements", listOf(it.toString()))
        }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementListParams && this.financialAccountToken == other.financialAccountToken && this.begin == other.begin && this.end == other.end && this.endingBefore == other.endingBefore && this.includeInitialStatements == other.includeInitialStatements && this.pageSize == other.pageSize && this.startingAfter == other.startingAfter && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(financialAccountToken, begin, end, endingBefore, includeInitialStatements, pageSize, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "FinancialAccountStatementListParams{financialAccountToken=$financialAccountToken, begin=$begin, end=$end, endingBefore=$endingBefore, includeInitialStatements=$includeInitialStatements, pageSize=$pageSize, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(
            financialAccountStatementListParams: FinancialAccountStatementListParams
        ) = apply {
            this.financialAccountToken = financialAccountStatementListParams.financialAccountToken
            this.begin = financialAccountStatementListParams.begin
            this.end = financialAccountStatementListParams.end
            this.endingBefore = financialAccountStatementListParams.endingBefore
            this.includeInitialStatements =
                financialAccountStatementListParams.includeInitialStatements
            this.pageSize = financialAccountStatementListParams.pageSize
            this.startingAfter = financialAccountStatementListParams.startingAfter
            additionalHeaders(financialAccountStatementListParams.additionalHeaders)
            additionalQueryParams(financialAccountStatementListParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
