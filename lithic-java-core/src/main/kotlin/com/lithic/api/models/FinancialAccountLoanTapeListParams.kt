// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class FinancialAccountLoanTapeListParams
constructor(
    private val financialAccountToken: String,
    private val begin: LocalDate?,
    private val end: LocalDate?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountLoanTapeListParams &&
            this.financialAccountToken == other.financialAccountToken &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.endingBefore == other.endingBefore &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            financialAccountToken,
            begin,
            end,
            endingBefore,
            pageSize,
            startingAfter,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "FinancialAccountLoanTapeListParams{financialAccountToken=$financialAccountToken, begin=$begin, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountLoanTapeListParams: FinancialAccountLoanTapeListParams) =
            apply {
                this.financialAccountToken =
                    financialAccountLoanTapeListParams.financialAccountToken
                this.begin = financialAccountLoanTapeListParams.begin
                this.end = financialAccountLoanTapeListParams.end
                this.endingBefore = financialAccountLoanTapeListParams.endingBefore
                this.pageSize = financialAccountLoanTapeListParams.pageSize
                this.startingAfter = financialAccountLoanTapeListParams.startingAfter
                additionalQueryParams(financialAccountLoanTapeListParams.additionalQueryParams)
                additionalHeaders(financialAccountLoanTapeListParams.additionalHeaders)
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

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): FinancialAccountLoanTapeListParams =
            FinancialAccountLoanTapeListParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                begin,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
