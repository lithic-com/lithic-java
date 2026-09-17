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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Open to Buy */
class OpenToBuy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val openToBuy: JsonField<Long>,
    private val summary: JsonField<OpenToBuySummary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("open_to_buy") @ExcludeMissing openToBuy: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("summary")
        @ExcludeMissing
        summary: JsonField<OpenToBuySummary> = JsonMissing.of(),
    ) : this(openToBuy, summary, mutableMapOf())

    /**
     * Funds available for card spend backed by this Security Account, in the currency's smallest
     * unit (e.g., cents for USD). Equal to the sum of the amounts in `summary`, and reaches zero
     * once outstanding spend has consumed all available funding
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openToBuy(): Long = openToBuy.getRequired("open_to_buy")

    /**
     * Balances that open to buy is derived from
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): OpenToBuySummary = summary.getRequired("summary")

    /**
     * Returns the raw JSON value of [openToBuy].
     *
     * Unlike [openToBuy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_to_buy") @ExcludeMissing fun _openToBuy(): JsonField<Long> = openToBuy

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<OpenToBuySummary> = summary

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
         * Returns a mutable builder for constructing an instance of [OpenToBuy].
         *
         * The following fields are required:
         * ```java
         * .openToBuy()
         * .summary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenToBuy]. */
    class Builder internal constructor() {

        private var openToBuy: JsonField<Long>? = null
        private var summary: JsonField<OpenToBuySummary>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openToBuy: OpenToBuy) = apply {
            this.openToBuy = openToBuy.openToBuy
            summary = openToBuy.summary
            additionalProperties = openToBuy.additionalProperties.toMutableMap()
        }

        /**
         * Funds available for card spend backed by this Security Account, in the currency's
         * smallest unit (e.g., cents for USD). Equal to the sum of the amounts in `summary`, and
         * reaches zero once outstanding spend has consumed all available funding
         */
        fun openToBuy(openToBuy: Long) = openToBuy(JsonField.of(openToBuy))

        /**
         * Sets [Builder.openToBuy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openToBuy] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun openToBuy(openToBuy: JsonField<Long>) = apply { this.openToBuy = openToBuy }

        /** Balances that open to buy is derived from */
        fun summary(summary: OpenToBuySummary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [OpenToBuySummary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun summary(summary: JsonField<OpenToBuySummary>) = apply { this.summary = summary }

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
         * Returns an immutable instance of [OpenToBuy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .openToBuy()
         * .summary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OpenToBuy =
            OpenToBuy(
                checkRequired("openToBuy", openToBuy),
                checkRequired("summary", summary),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OpenToBuy = apply {
        if (validated) {
            return@apply
        }

        openToBuy()
        summary().validate()
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
        (if (openToBuy.asKnown().isPresent) 1 else 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenToBuy &&
            openToBuy == other.openToBuy &&
            summary == other.summary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(openToBuy, summary, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenToBuy{openToBuy=$openToBuy, summary=$summary, additionalProperties=$additionalProperties}"
}
