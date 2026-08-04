// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Credit Product Prime Rates */
class CreditProductPrimeRateRetrieveParams
private constructor(
    private val creditProductToken: String?,
    private val endingBefore: LocalDate?,
    private val startingAfter: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Globally unique identifier for credit products. */
    fun creditProductToken(): Optional<String> = Optional.ofNullable(creditProductToken)

    /** The effective date that the prime rates ends before */
    fun endingBefore(): Optional<LocalDate> = Optional.ofNullable(endingBefore)

    /** The effective date that the prime rate starts after */
    fun startingAfter(): Optional<LocalDate> = Optional.ofNullable(startingAfter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CreditProductPrimeRateRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditProductPrimeRateRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditProductPrimeRateRetrieveParams]. */
    class Builder internal constructor() {

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
        fun creditProductToken(creditProductToken: String?) = apply {
            this.creditProductToken = creditProductToken
        }

        /**
         * Alias for calling [Builder.creditProductToken] with `creditProductToken.orElse(null)`.
         */
        fun creditProductToken(creditProductToken: Optional<String>) =
            creditProductToken(creditProductToken.getOrNull())

        /** The effective date that the prime rates ends before */
        fun endingBefore(endingBefore: LocalDate?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<LocalDate>) = endingBefore(endingBefore.getOrNull())

        /** The effective date that the prime rate starts after */
        fun startingAfter(startingAfter: LocalDate?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<LocalDate>) =
            startingAfter(startingAfter.getOrNull())

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
         * Returns an immutable instance of [CreditProductPrimeRateRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditProductPrimeRateRetrieveParams =
            CreditProductPrimeRateRetrieveParams(
                creditProductToken,
                endingBefore,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> creditProductToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endingBefore?.let { put("ending_before", it.toString()) }
                startingAfter?.let { put("starting_after", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditProductPrimeRateRetrieveParams &&
            creditProductToken == other.creditProductToken &&
            endingBefore == other.endingBefore &&
            startingAfter == other.startingAfter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            creditProductToken,
            endingBefore,
            startingAfter,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CreditProductPrimeRateRetrieveParams{creditProductToken=$creditProductToken, endingBefore=$endingBefore, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
