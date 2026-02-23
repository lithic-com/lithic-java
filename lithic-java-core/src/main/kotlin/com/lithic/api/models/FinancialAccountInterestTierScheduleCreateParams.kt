// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new interest tier schedule entry for a supported financial account */
class FinancialAccountInterestTierScheduleCreateParams
private constructor(
    private val financialAccountToken: String?,
    private val interestTierSchedule: InterestTierSchedule,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    /** Entry in the Tier Schedule of an account */
    fun interestTierSchedule(): InterestTierSchedule = interestTierSchedule

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        interestTierSchedule._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleCreateParams].
         *
         * The following fields are required:
         * ```java
         * .interestTierSchedule()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInterestTierScheduleCreateParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var interestTierSchedule: InterestTierSchedule? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleCreateParams:
                FinancialAccountInterestTierScheduleCreateParams
        ) = apply {
            financialAccountToken =
                financialAccountInterestTierScheduleCreateParams.financialAccountToken
            interestTierSchedule =
                financialAccountInterestTierScheduleCreateParams.interestTierSchedule
            additionalHeaders =
                financialAccountInterestTierScheduleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInterestTierScheduleCreateParams.additionalQueryParams.toBuilder()
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

        /** Entry in the Tier Schedule of an account */
        fun interestTierSchedule(interestTierSchedule: InterestTierSchedule) = apply {
            this.interestTierSchedule = interestTierSchedule
        }

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
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .interestTierSchedule()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountInterestTierScheduleCreateParams =
            FinancialAccountInterestTierScheduleCreateParams(
                financialAccountToken,
                checkRequired("interestTierSchedule", interestTierSchedule),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): InterestTierSchedule = interestTierSchedule

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInterestTierScheduleCreateParams &&
            financialAccountToken == other.financialAccountToken &&
            interestTierSchedule == other.interestTierSchedule &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            interestTierSchedule,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FinancialAccountInterestTierScheduleCreateParams{financialAccountToken=$financialAccountToken, interestTierSchedule=$interestTierSchedule, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
