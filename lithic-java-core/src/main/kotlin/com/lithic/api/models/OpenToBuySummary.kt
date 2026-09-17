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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Open to Buy Summary */
class OpenToBuySummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val security: JsonField<Long>,
    private val settledFunds: JsonField<Long>,
    private val totalOutstandingSpend: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("security") @ExcludeMissing security: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("settled_funds")
        @ExcludeMissing
        settledFunds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_outstanding_spend")
        @ExcludeMissing
        totalOutstandingSpend: JsonField<Long> = JsonMissing.of(),
    ) : this(security, settledFunds, totalOutstandingSpend, mutableMapOf())

    /**
     * Available balance of the Security Account backing card spend, in the currency's smallest unit
     * (e.g., cents for USD)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun security(): Long = security.getRequired("security")

    /**
     * Funding that has moved out of the Security Account to cover card spend Lithic has already
     * paid out to the networks, in the currency's smallest unit (e.g., cents for USD). Open to buy
     * counts it alongside `security`, and it clears once collected from your business clients. Only
     * Commercial Charge tracks this separately, so this is `null` for every other program setup
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settledFunds(): Optional<Long> = settledFunds.getOptional("settled_funds")

    /**
     * Customer card spend that has not yet been collected, in the currency's smallest unit (e.g.,
     * cents for USD). Reported as a negative amount, because it reduces open to buy
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalOutstandingSpend(): Long = totalOutstandingSpend.getRequired("total_outstanding_spend")

    /**
     * Returns the raw JSON value of [security].
     *
     * Unlike [security], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security") @ExcludeMissing fun _security(): JsonField<Long> = security

    /**
     * Returns the raw JSON value of [settledFunds].
     *
     * Unlike [settledFunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_funds")
    @ExcludeMissing
    fun _settledFunds(): JsonField<Long> = settledFunds

    /**
     * Returns the raw JSON value of [totalOutstandingSpend].
     *
     * Unlike [totalOutstandingSpend], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_outstanding_spend")
    @ExcludeMissing
    fun _totalOutstandingSpend(): JsonField<Long> = totalOutstandingSpend

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
         * Returns a mutable builder for constructing an instance of [OpenToBuySummary].
         *
         * The following fields are required:
         * ```java
         * .security()
         * .settledFunds()
         * .totalOutstandingSpend()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenToBuySummary]. */
    class Builder internal constructor() {

        private var security: JsonField<Long>? = null
        private var settledFunds: JsonField<Long>? = null
        private var totalOutstandingSpend: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openToBuySummary: OpenToBuySummary) = apply {
            security = openToBuySummary.security
            settledFunds = openToBuySummary.settledFunds
            totalOutstandingSpend = openToBuySummary.totalOutstandingSpend
            additionalProperties = openToBuySummary.additionalProperties.toMutableMap()
        }

        /**
         * Available balance of the Security Account backing card spend, in the currency's smallest
         * unit (e.g., cents for USD)
         */
        fun security(security: Long) = security(JsonField.of(security))

        /**
         * Sets [Builder.security] to an arbitrary JSON value.
         *
         * You should usually call [Builder.security] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun security(security: JsonField<Long>) = apply { this.security = security }

        /**
         * Funding that has moved out of the Security Account to cover card spend Lithic has already
         * paid out to the networks, in the currency's smallest unit (e.g., cents for USD). Open to
         * buy counts it alongside `security`, and it clears once collected from your business
         * clients. Only Commercial Charge tracks this separately, so this is `null` for every other
         * program setup
         */
        fun settledFunds(settledFunds: Long?) = settledFunds(JsonField.ofNullable(settledFunds))

        /**
         * Alias for [Builder.settledFunds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun settledFunds(settledFunds: Long) = settledFunds(settledFunds as Long?)

        /** Alias for calling [Builder.settledFunds] with `settledFunds.orElse(null)`. */
        fun settledFunds(settledFunds: Optional<Long>) = settledFunds(settledFunds.getOrNull())

        /**
         * Sets [Builder.settledFunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledFunds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settledFunds(settledFunds: JsonField<Long>) = apply { this.settledFunds = settledFunds }

        /**
         * Customer card spend that has not yet been collected, in the currency's smallest unit
         * (e.g., cents for USD). Reported as a negative amount, because it reduces open to buy
         */
        fun totalOutstandingSpend(totalOutstandingSpend: Long) =
            totalOutstandingSpend(JsonField.of(totalOutstandingSpend))

        /**
         * Sets [Builder.totalOutstandingSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalOutstandingSpend] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalOutstandingSpend(totalOutstandingSpend: JsonField<Long>) = apply {
            this.totalOutstandingSpend = totalOutstandingSpend
        }

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
         * Returns an immutable instance of [OpenToBuySummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .security()
         * .settledFunds()
         * .totalOutstandingSpend()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OpenToBuySummary =
            OpenToBuySummary(
                checkRequired("security", security),
                checkRequired("settledFunds", settledFunds),
                checkRequired("totalOutstandingSpend", totalOutstandingSpend),
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
    fun validate(): OpenToBuySummary = apply {
        if (validated) {
            return@apply
        }

        security()
        settledFunds()
        totalOutstandingSpend()
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
        (if (security.asKnown().isPresent) 1 else 0) +
            (if (settledFunds.asKnown().isPresent) 1 else 0) +
            (if (totalOutstandingSpend.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenToBuySummary &&
            security == other.security &&
            settledFunds == other.settledFunds &&
            totalOutstandingSpend == other.totalOutstandingSpend &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(security, settledFunds, totalOutstandingSpend, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenToBuySummary{security=$security, settledFunds=$settledFunds, totalOutstandingSpend=$totalOutstandingSpend, additionalProperties=$additionalProperties}"
}
