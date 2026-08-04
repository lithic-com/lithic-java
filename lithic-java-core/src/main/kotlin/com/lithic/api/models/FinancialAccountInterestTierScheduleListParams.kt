// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List interest tier schedules for a financial account with optional date filtering.
 *
 * If no date parameters are provided, returns all tier schedules. If date parameters are provided,
 * uses filtering to return matching schedules (max 100).
 * - for_date: Returns exact match (takes precedence over other dates)
 * - before_date: Returns schedules with effective_date <= before_date
 * - after_date: Returns schedules with effective_date >= after_date
 * - Both before_date and after_date: Returns schedules in range
 */
class FinancialAccountInterestTierScheduleListParams
private constructor(
    private val financialAccountToken: String?,
    private val afterDate: LocalDate?,
    private val beforeDate: LocalDate?,
    private val forDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    /** Return schedules with effective_date >= after_date (ISO format YYYY-MM-DD) */
    fun afterDate(): Optional<LocalDate> = Optional.ofNullable(afterDate)

    /** Return schedules with effective_date <= before_date (ISO format YYYY-MM-DD) */
    fun beforeDate(): Optional<LocalDate> = Optional.ofNullable(beforeDate)

    /** Return schedule with effective_date == for_date (ISO format YYYY-MM-DD) */
    fun forDate(): Optional<LocalDate> = Optional.ofNullable(forDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FinancialAccountInterestTierScheduleListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInterestTierScheduleListParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var afterDate: LocalDate? = null
        private var beforeDate: LocalDate? = null
        private var forDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleListParams:
                FinancialAccountInterestTierScheduleListParams
        ) = apply {
            financialAccountToken =
                financialAccountInterestTierScheduleListParams.financialAccountToken
            afterDate = financialAccountInterestTierScheduleListParams.afterDate
            beforeDate = financialAccountInterestTierScheduleListParams.beforeDate
            forDate = financialAccountInterestTierScheduleListParams.forDate
            additionalHeaders =
                financialAccountInterestTierScheduleListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInterestTierScheduleListParams.additionalQueryParams.toBuilder()
        }

        fun financialAccountToken(financialAccountToken: String?) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /** Return schedules with effective_date >= after_date (ISO format YYYY-MM-DD) */
        fun afterDate(afterDate: LocalDate?) = apply { this.afterDate = afterDate }

        /** Alias for calling [Builder.afterDate] with `afterDate.orElse(null)`. */
        fun afterDate(afterDate: Optional<LocalDate>) = afterDate(afterDate.getOrNull())

        /** Return schedules with effective_date <= before_date (ISO format YYYY-MM-DD) */
        fun beforeDate(beforeDate: LocalDate?) = apply { this.beforeDate = beforeDate }

        /** Alias for calling [Builder.beforeDate] with `beforeDate.orElse(null)`. */
        fun beforeDate(beforeDate: Optional<LocalDate>) = beforeDate(beforeDate.getOrNull())

        /** Return schedule with effective_date == for_date (ISO format YYYY-MM-DD) */
        fun forDate(forDate: LocalDate?) = apply { this.forDate = forDate }

        /** Alias for calling [Builder.forDate] with `forDate.orElse(null)`. */
        fun forDate(forDate: Optional<LocalDate>) = forDate(forDate.getOrNull())

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

        /**
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FinancialAccountInterestTierScheduleListParams =
            FinancialAccountInterestTierScheduleListParams(
                financialAccountToken,
                afterDate,
                beforeDate,
                forDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterDate?.let { put("after_date", it.toString()) }
                beforeDate?.let { put("before_date", it.toString()) }
                forDate?.let { put("for_date", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInterestTierScheduleListParams &&
            financialAccountToken == other.financialAccountToken &&
            afterDate == other.afterDate &&
            beforeDate == other.beforeDate &&
            forDate == other.forDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            afterDate,
            beforeDate,
            forDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FinancialAccountInterestTierScheduleListParams{financialAccountToken=$financialAccountToken, afterDate=$afterDate, beforeDate=$beforeDate, forDate=$forDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
