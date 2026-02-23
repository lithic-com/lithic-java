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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Rate and rate cap for interest on a category */
class CategoryTier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val capRate: JsonField<String>,
    private val rate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cap_rate") @ExcludeMissing capRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
    ) : this(capRate, rate, mutableMapOf())

    /**
     * Maximum interest rate for this category, e.g. '0.0525' for 5.25%
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capRate(): Optional<String> = capRate.getOptional("cap_rate")

    /**
     * Interest rate for this category, e.g. '0.0525' for 5.25%
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rate(): Optional<String> = rate.getOptional("rate")

    /**
     * Returns the raw JSON value of [capRate].
     *
     * Unlike [capRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cap_rate") @ExcludeMissing fun _capRate(): JsonField<String> = capRate

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

        /** Returns a mutable builder for constructing an instance of [CategoryTier]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CategoryTier]. */
    class Builder internal constructor() {

        private var capRate: JsonField<String> = JsonMissing.of()
        private var rate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(categoryTier: CategoryTier) = apply {
            capRate = categoryTier.capRate
            rate = categoryTier.rate
            additionalProperties = categoryTier.additionalProperties.toMutableMap()
        }

        /** Maximum interest rate for this category, e.g. '0.0525' for 5.25% */
        fun capRate(capRate: String) = capRate(JsonField.of(capRate))

        /**
         * Sets [Builder.capRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capRate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun capRate(capRate: JsonField<String>) = apply { this.capRate = capRate }

        /** Interest rate for this category, e.g. '0.0525' for 5.25% */
        fun rate(rate: String) = rate(JsonField.of(rate))

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<String>) = apply { this.rate = rate }

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
         * Returns an immutable instance of [CategoryTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CategoryTier = CategoryTier(capRate, rate, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CategoryTier = apply {
        if (validated) {
            return@apply
        }

        capRate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (capRate.asKnown().isPresent) 1 else 0) + (if (rate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryTier &&
            capRate == other.capRate &&
            rate == other.rate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(capRate, rate, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryTier{capRate=$capRate, rate=$rate, additionalProperties=$additionalProperties}"
}
