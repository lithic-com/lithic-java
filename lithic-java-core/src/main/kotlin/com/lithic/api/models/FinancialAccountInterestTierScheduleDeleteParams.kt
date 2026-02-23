// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Delete an interest tier schedule entry.
 *
 * Returns:
 * - 400 Bad Request: Invalid effective_date format OR attempting to delete the earliest tier
 *   schedule entry for a non-PENDING account
 * - 404 Not Found: Tier schedule entry not found for the given effective_date OR ledger account not
 *   found
 *
 * Note: PENDING accounts can delete the earliest tier schedule entry (account hasn't opened yet).
 * Active/non-PENDING accounts cannot delete the earliest entry to prevent orphaning the account.
 *
 * If the deleted tier schedule has a past effective_date and the account is ACTIVE, the loan tape
 * rebuild configuration will be updated to trigger rebuilds from that date.
 */
class FinancialAccountInterestTierScheduleDeleteParams
private constructor(
    private val financialAccountToken: String,
    private val effectiveDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun financialAccountToken(): String = financialAccountToken

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInterestTierScheduleDeleteParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var effectiveDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleDeleteParams:
                FinancialAccountInterestTierScheduleDeleteParams
        ) = apply {
            financialAccountToken =
                financialAccountInterestTierScheduleDeleteParams.financialAccountToken
            effectiveDate = financialAccountInterestTierScheduleDeleteParams.effectiveDate
            additionalHeaders =
                financialAccountInterestTierScheduleDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInterestTierScheduleDeleteParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                financialAccountInterestTierScheduleDeleteParams.additionalBodyProperties
                    .toMutableMap()
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun effectiveDate(effectiveDate: LocalDate?) = apply { this.effectiveDate = effectiveDate }

        /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
        fun effectiveDate(effectiveDate: Optional<LocalDate>) =
            effectiveDate(effectiveDate.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountInterestTierScheduleDeleteParams =
            FinancialAccountInterestTierScheduleDeleteParams(
                checkRequired("financialAccountToken", financialAccountToken),
                effectiveDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken
            1 -> effectiveDate?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInterestTierScheduleDeleteParams &&
            financialAccountToken == other.financialAccountToken &&
            effectiveDate == other.effectiveDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            effectiveDate,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "FinancialAccountInterestTierScheduleDeleteParams{financialAccountToken=$financialAccountToken, effectiveDate=$effectiveDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
