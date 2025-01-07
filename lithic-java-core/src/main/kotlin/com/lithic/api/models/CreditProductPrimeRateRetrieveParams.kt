// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Get Credit Product Prime Rates */
class CreditProductPrimeRateRetrieveParams
constructor(
    private val creditProductToken: String,
    private val endingBefore: LocalDate?,
    private val startingAfter: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Globally unique identifier for credit products. */
    fun creditProductToken(): String = creditProductToken

    /** The effective date that the prime rates ends before */
    fun endingBefore(): Optional<LocalDate> = Optional.ofNullable(endingBefore)

    /** The effective date that the prime rate starts after */
    fun startingAfter(): Optional<LocalDate> = Optional.ofNullable(startingAfter)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> creditProductToken
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var creditProductToken: String? = null
        private var endingBefore: LocalDate? = null
        private var startingAfter: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            creditProductPrimeRateRetrieveParams: CreditProductPrimeRateRetrieveParams
        ) = apply {
            creditProductToken = creditProductPrimeRateRetrieveParams.creditProductToken
            endingBefore = creditProductPrimeRateRetrieveParams.endingBefore
            startingAfter = creditProductPrimeRateRetrieveParams.startingAfter
            additionalHeaders = creditProductPrimeRateRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                creditProductPrimeRateRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Globally unique identifier for credit products. */
        fun creditProductToken(creditProductToken: String) = apply {
            this.creditProductToken = creditProductToken
        }

        /** The effective date that the prime rates ends before */
        fun endingBefore(endingBefore: LocalDate?) = apply { this.endingBefore = endingBefore }

        /** The effective date that the prime rates ends before */
        fun endingBefore(endingBefore: Optional<LocalDate>) =
            endingBefore(endingBefore.orElse(null))

        /** The effective date that the prime rate starts after */
        fun startingAfter(startingAfter: LocalDate?) = apply { this.startingAfter = startingAfter }

        /** The effective date that the prime rate starts after */
        fun startingAfter(startingAfter: Optional<LocalDate>) =
            startingAfter(startingAfter.orElse(null))

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

        fun build(): CreditProductPrimeRateRetrieveParams =
            CreditProductPrimeRateRetrieveParams(
                checkNotNull(creditProductToken) {
                    "`creditProductToken` is required but was not set"
                },
                endingBefore,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditProductPrimeRateRetrieveParams && creditProductToken == other.creditProductToken && endingBefore == other.endingBefore && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditProductToken, endingBefore, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditProductPrimeRateRetrieveParams{creditProductToken=$creditProductToken, endingBefore=$endingBefore, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
