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

class CategoryDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balanceTransfers: JsonField<String>,
    private val cashAdvances: JsonField<String>,
    private val purchases: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        balanceTransfers: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_advances")
        @ExcludeMissing
        cashAdvances: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchases") @ExcludeMissing purchases: JsonField<String> = JsonMissing.of(),
    ) : this(balanceTransfers, cashAdvances, purchases, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceTransfers(): String = balanceTransfers.getRequired("balance_transfers")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cashAdvances(): String = cashAdvances.getRequired("cash_advances")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purchases(): String = purchases.getRequired("purchases")

    /**
     * Returns the raw JSON value of [balanceTransfers].
     *
     * Unlike [balanceTransfers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("balance_transfers")
    @ExcludeMissing
    fun _balanceTransfers(): JsonField<String> = balanceTransfers

    /**
     * Returns the raw JSON value of [cashAdvances].
     *
     * Unlike [cashAdvances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cash_advances")
    @ExcludeMissing
    fun _cashAdvances(): JsonField<String> = cashAdvances

    /**
     * Returns the raw JSON value of [purchases].
     *
     * Unlike [purchases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purchases") @ExcludeMissing fun _purchases(): JsonField<String> = purchases

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
         * Returns a mutable builder for constructing an instance of [CategoryDetails].
         *
         * The following fields are required:
         * ```java
         * .balanceTransfers()
         * .cashAdvances()
         * .purchases()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CategoryDetails]. */
    class Builder internal constructor() {

        private var balanceTransfers: JsonField<String>? = null
        private var cashAdvances: JsonField<String>? = null
        private var purchases: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(categoryDetails: CategoryDetails) = apply {
            balanceTransfers = categoryDetails.balanceTransfers
            cashAdvances = categoryDetails.cashAdvances
            purchases = categoryDetails.purchases
            additionalProperties = categoryDetails.additionalProperties.toMutableMap()
        }

        fun balanceTransfers(balanceTransfers: String) =
            balanceTransfers(JsonField.of(balanceTransfers))

        /**
         * Sets [Builder.balanceTransfers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceTransfers] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceTransfers(balanceTransfers: JsonField<String>) = apply {
            this.balanceTransfers = balanceTransfers
        }

        fun cashAdvances(cashAdvances: String) = cashAdvances(JsonField.of(cashAdvances))

        /**
         * Sets [Builder.cashAdvances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAdvances] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cashAdvances(cashAdvances: JsonField<String>) = apply {
            this.cashAdvances = cashAdvances
        }

        fun purchases(purchases: String) = purchases(JsonField.of(purchases))

        /**
         * Sets [Builder.purchases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchases] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun purchases(purchases: JsonField<String>) = apply { this.purchases = purchases }

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
         * Returns an immutable instance of [CategoryDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .balanceTransfers()
         * .cashAdvances()
         * .purchases()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CategoryDetails =
            CategoryDetails(
                checkRequired("balanceTransfers", balanceTransfers),
                checkRequired("cashAdvances", cashAdvances),
                checkRequired("purchases", purchases),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CategoryDetails = apply {
        if (validated) {
            return@apply
        }

        balanceTransfers()
        cashAdvances()
        purchases()
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
        (if (balanceTransfers.asKnown().isPresent) 1 else 0) +
            (if (cashAdvances.asKnown().isPresent) 1 else 0) +
            (if (purchases.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryDetails &&
            balanceTransfers == other.balanceTransfers &&
            cashAdvances == other.cashAdvances &&
            purchases == other.purchases &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(balanceTransfers, cashAdvances, purchases, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryDetails{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, purchases=$purchases, additionalProperties=$additionalProperties}"
}
