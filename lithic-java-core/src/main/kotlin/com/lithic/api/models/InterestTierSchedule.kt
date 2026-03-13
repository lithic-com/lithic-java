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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Entry in the Tier Schedule of an account */
class InterestTierSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditProductToken: JsonField<String>,
    private val effectiveDate: JsonField<LocalDate>,
    private val tierName: JsonField<String>,
    private val tierRates: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("tier_name") @ExcludeMissing tierName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tier_rates") @ExcludeMissing tierRates: JsonValue = JsonMissing.of(),
    ) : this(creditProductToken, effectiveDate, tierName, tierRates, mutableMapOf())

    /**
     * Globally unique identifier for a credit product
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /**
     * Date the tier should be effective in YYYY-MM-DD format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

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
     * MyClass myObject = interestTierSchedule.tierRates().convert(MyClass.class);
     * ```
     */
    @JsonProperty("tier_rates") @ExcludeMissing fun _tierRates(): JsonValue = tierRates

    /**
     * Returns the raw JSON value of [creditProductToken].
     *
     * Unlike [creditProductToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

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
         * Returns a mutable builder for constructing an instance of [InterestTierSchedule].
         *
         * The following fields are required:
         * ```java
         * .creditProductToken()
         * .effectiveDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InterestTierSchedule]. */
    class Builder internal constructor() {

        private var creditProductToken: JsonField<String>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var tierName: JsonField<String> = JsonMissing.of()
        private var tierRates: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interestTierSchedule: InterestTierSchedule) = apply {
            creditProductToken = interestTierSchedule.creditProductToken
            effectiveDate = interestTierSchedule.effectiveDate
            tierName = interestTierSchedule.tierName
            tierRates = interestTierSchedule.tierRates
            additionalProperties = interestTierSchedule.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /**
         * Sets [Builder.creditProductToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditProductToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Date the tier should be effective in YYYY-MM-DD format */
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

        /** Name of a tier contained in the credit product. Mutually exclusive with tier_rates */
        fun tierName(tierName: String) = tierName(JsonField.of(tierName))

        /**
         * Sets [Builder.tierName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tierName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [InterestTierSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditProductToken()
         * .effectiveDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InterestTierSchedule =
            InterestTierSchedule(
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("effectiveDate", effectiveDate),
                tierName,
                tierRates,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InterestTierSchedule = apply {
        if (validated) {
            return@apply
        }

        creditProductToken()
        effectiveDate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (creditProductToken.asKnown().isPresent) 1 else 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (if (tierName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InterestTierSchedule &&
            creditProductToken == other.creditProductToken &&
            effectiveDate == other.effectiveDate &&
            tierName == other.tierName &&
            tierRates == other.tierRates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(creditProductToken, effectiveDate, tierName, tierRates, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InterestTierSchedule{creditProductToken=$creditProductToken, effectiveDate=$effectiveDate, tierName=$tierName, tierRates=$tierRates, additionalProperties=$additionalProperties}"
}
