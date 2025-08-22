// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Post Credit Product Prime Rate */
class CreditProductPrimeRateCreateParams
private constructor(
    private val creditProductToken: String?,
    private val body: InterestRate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Globally unique identifier for credit products. */
    fun creditProductToken(): Optional<String> = Optional.ofNullable(creditProductToken)

    /**
     * Date the rate goes into effect
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = body.effectiveDate()

    /**
     * The rate in decimal format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rate(): String = body.rate()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rate(): JsonField<String> = body._rate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditProductPrimeRateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .effectiveDate()
         * .rate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditProductPrimeRateCreateParams]. */
    class Builder internal constructor() {

        private var creditProductToken: String? = null
        private var body: InterestRate.Builder = InterestRate.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditProductPrimeRateCreateParams: CreditProductPrimeRateCreateParams) =
            apply {
                creditProductToken = creditProductPrimeRateCreateParams.creditProductToken
                body = creditProductPrimeRateCreateParams.body.toBuilder()
                additionalHeaders = creditProductPrimeRateCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    creditProductPrimeRateCreateParams.additionalQueryParams.toBuilder()
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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [effectiveDate]
         * - [rate]
         */
        fun body(body: InterestRate) = apply { this.body = body.toBuilder() }

        /** Date the rate goes into effect */
        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        /** The rate in decimal format */
        fun rate(rate: String) = apply { body.rate(rate) }

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<String>) = apply { body.rate(rate) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CreditProductPrimeRateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .effectiveDate()
         * .rate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditProductPrimeRateCreateParams =
            CreditProductPrimeRateCreateParams(
                creditProductToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): InterestRate = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> creditProductToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class InterestRate
    private constructor(
        private val effectiveDate: JsonField<LocalDate>,
        private val rate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
        ) : this(effectiveDate, rate, mutableMapOf())

        /**
         * Date the rate goes into effect
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /**
         * The rate in decimal format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rate(): String = rate.getRequired("rate")

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [InterestRate].
             *
             * The following fields are required:
             * ```java
             * .effectiveDate()
             * .rate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InterestRate]. */
        class Builder internal constructor() {

            private var effectiveDate: JsonField<LocalDate>? = null
            private var rate: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interestRate: InterestRate) = apply {
                effectiveDate = interestRate.effectiveDate
                rate = interestRate.rate
                additionalProperties = interestRate.additionalProperties.toMutableMap()
            }

            /** Date the rate goes into effect */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** The rate in decimal format */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [InterestRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .effectiveDate()
             * .rate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InterestRate =
                InterestRate(
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("rate", rate),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InterestRate = apply {
            if (validated) {
                return@apply
            }

            effectiveDate()
            rate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InterestRate &&
                effectiveDate == other.effectiveDate &&
                rate == other.rate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(effectiveDate, rate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestRate{effectiveDate=$effectiveDate, rate=$rate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditProductPrimeRateCreateParams &&
            creditProductToken == other.creditProductToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(creditProductToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditProductPrimeRateCreateParams{creditProductToken=$creditProductToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
