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

/** Update an existing interest tier schedule */
class FinancialAccountInterestTierScheduleUpdateParams
private constructor(
    private val financialAccountToken: String,
    private val effectiveDate: LocalDate?,
    private val body: UpdateTierScheduleEntryRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): String = financialAccountToken

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    /**
     * Name of a tier contained in the credit product. Mutually exclusive with tier_rates
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tierName(): Optional<String> = body.tierName()

    /**
     * Custom rates per category. Mutually exclusive with tier_name
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = financialAccountInterestTierScheduleUpdateParams.tierRates().convert(MyClass.class);
     * ```
     */
    fun _tierRates(): JsonValue = body._tierRates()

    /**
     * Returns the raw JSON value of [tierName].
     *
     * Unlike [tierName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tierName(): JsonField<String> = body._tierName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInterestTierScheduleUpdateParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var effectiveDate: LocalDate? = null
        private var body: UpdateTierScheduleEntryRequest.Builder =
            UpdateTierScheduleEntryRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleUpdateParams:
                FinancialAccountInterestTierScheduleUpdateParams
        ) = apply {
            financialAccountToken =
                financialAccountInterestTierScheduleUpdateParams.financialAccountToken
            effectiveDate = financialAccountInterestTierScheduleUpdateParams.effectiveDate
            body = financialAccountInterestTierScheduleUpdateParams.body.toBuilder()
            additionalHeaders =
                financialAccountInterestTierScheduleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInterestTierScheduleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun effectiveDate(effectiveDate: LocalDate?) = apply { this.effectiveDate = effectiveDate }

        /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
        fun effectiveDate(effectiveDate: Optional<LocalDate>) =
            effectiveDate(effectiveDate.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [tierName]
         * - [tierRates]
         */
        fun body(body: UpdateTierScheduleEntryRequest) = apply { this.body = body.toBuilder() }

        /** Name of a tier contained in the credit product. Mutually exclusive with tier_rates */
        fun tierName(tierName: String) = apply { body.tierName(tierName) }

        /**
         * Sets [Builder.tierName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tierName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tierName(tierName: JsonField<String>) = apply { body.tierName(tierName) }

        /** Custom rates per category. Mutually exclusive with tier_name */
        fun tierRates(tierRates: JsonValue) = apply { body.tierRates(tierRates) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleUpdateParams].
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
        fun build(): FinancialAccountInterestTierScheduleUpdateParams =
            FinancialAccountInterestTierScheduleUpdateParams(
                checkRequired("financialAccountToken", financialAccountToken),
                effectiveDate,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateTierScheduleEntryRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken
            1 -> effectiveDate?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Entry in the Tier Schedule of an account */
    class UpdateTierScheduleEntryRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val tierName: JsonField<String>,
        private val tierRates: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tier_name")
            @ExcludeMissing
            tierName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tier_rates") @ExcludeMissing tierRates: JsonValue = JsonMissing.of(),
        ) : this(tierName, tierRates, mutableMapOf())

        /**
         * Name of a tier contained in the credit product. Mutually exclusive with tier_rates
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tierName(): Optional<String> = tierName.getOptional("tier_name")

        /**
         * Custom rates per category. Mutually exclusive with tier_name
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = updateTierScheduleEntryRequest.tierRates().convert(MyClass.class);
         * ```
         */
        @JsonProperty("tier_rates") @ExcludeMissing fun _tierRates(): JsonValue = tierRates

        /**
         * Returns the raw JSON value of [tierName].
         *
         * Unlike [tierName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier_name") @ExcludeMissing fun _tierName(): JsonField<String> = tierName

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
             * Returns a mutable builder for constructing an instance of
             * [UpdateTierScheduleEntryRequest].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdateTierScheduleEntryRequest]. */
        class Builder internal constructor() {

            private var tierName: JsonField<String> = JsonMissing.of()
            private var tierRates: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updateTierScheduleEntryRequest: UpdateTierScheduleEntryRequest) =
                apply {
                    tierName = updateTierScheduleEntryRequest.tierName
                    tierRates = updateTierScheduleEntryRequest.tierRates
                    additionalProperties =
                        updateTierScheduleEntryRequest.additionalProperties.toMutableMap()
                }

            /**
             * Name of a tier contained in the credit product. Mutually exclusive with tier_rates
             */
            fun tierName(tierName: String) = tierName(JsonField.of(tierName))

            /**
             * Sets [Builder.tierName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tierName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tierName(tierName: JsonField<String>) = apply { this.tierName = tierName }

            /** Custom rates per category. Mutually exclusive with tier_name */
            fun tierRates(tierRates: JsonValue) = apply { this.tierRates = tierRates }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [UpdateTierScheduleEntryRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdateTierScheduleEntryRequest =
                UpdateTierScheduleEntryRequest(
                    tierName,
                    tierRates,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdateTierScheduleEntryRequest = apply {
            if (validated) {
                return@apply
            }

            tierName()
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
        @JvmSynthetic internal fun validity(): Int = (if (tierName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdateTierScheduleEntryRequest &&
                tierName == other.tierName &&
                tierRates == other.tierRates &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(tierName, tierRates, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdateTierScheduleEntryRequest{tierName=$tierName, tierRates=$tierRates, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInterestTierScheduleUpdateParams &&
            financialAccountToken == other.financialAccountToken &&
            effectiveDate == other.effectiveDate &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            effectiveDate,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FinancialAccountInterestTierScheduleUpdateParams{financialAccountToken=$financialAccountToken, effectiveDate=$effectiveDate, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
