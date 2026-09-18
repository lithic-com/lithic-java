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

class TransactionCategoryBalances
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balanceTransfers: JsonField<CategoryBalances>,
    private val cashAdvances: JsonField<CategoryBalances>,
    private val purchases: JsonField<CategoryBalances>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        balanceTransfers: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("cash_advances")
        @ExcludeMissing
        cashAdvances: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("purchases")
        @ExcludeMissing
        purchases: JsonField<CategoryBalances> = JsonMissing.of(),
    ) : this(balanceTransfers, cashAdvances, purchases, mutableMapOf())

    /**
     * Amounts attributable to balance transfers
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceTransfers(): CategoryBalances = balanceTransfers.getRequired("balance_transfers")

    /**
     * Amounts attributable to cash advances
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cashAdvances(): CategoryBalances = cashAdvances.getRequired("cash_advances")

    /**
     * Amounts attributable to purchases
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purchases(): CategoryBalances = purchases.getRequired("purchases")

    /**
     * Returns the raw JSON value of [balanceTransfers].
     *
     * Unlike [balanceTransfers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("balance_transfers")
    @ExcludeMissing
    fun _balanceTransfers(): JsonField<CategoryBalances> = balanceTransfers

    /**
     * Returns the raw JSON value of [cashAdvances].
     *
     * Unlike [cashAdvances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cash_advances")
    @ExcludeMissing
    fun _cashAdvances(): JsonField<CategoryBalances> = cashAdvances

    /**
     * Returns the raw JSON value of [purchases].
     *
     * Unlike [purchases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purchases")
    @ExcludeMissing
    fun _purchases(): JsonField<CategoryBalances> = purchases

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
         * Returns a mutable builder for constructing an instance of [TransactionCategoryBalances].
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

    /** A builder for [TransactionCategoryBalances]. */
    class Builder internal constructor() {

        private var balanceTransfers: JsonField<CategoryBalances>? = null
        private var cashAdvances: JsonField<CategoryBalances>? = null
        private var purchases: JsonField<CategoryBalances>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionCategoryBalances: TransactionCategoryBalances) = apply {
            balanceTransfers = transactionCategoryBalances.balanceTransfers
            cashAdvances = transactionCategoryBalances.cashAdvances
            purchases = transactionCategoryBalances.purchases
            additionalProperties = transactionCategoryBalances.additionalProperties.toMutableMap()
        }

        /** Amounts attributable to balance transfers */
        fun balanceTransfers(balanceTransfers: CategoryBalances) =
            balanceTransfers(JsonField.of(balanceTransfers))

        /**
         * Sets [Builder.balanceTransfers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceTransfers] with a well-typed [CategoryBalances]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun balanceTransfers(balanceTransfers: JsonField<CategoryBalances>) = apply {
            this.balanceTransfers = balanceTransfers
        }

        /** Amounts attributable to cash advances */
        fun cashAdvances(cashAdvances: CategoryBalances) = cashAdvances(JsonField.of(cashAdvances))

        /**
         * Sets [Builder.cashAdvances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAdvances] with a well-typed [CategoryBalances] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cashAdvances(cashAdvances: JsonField<CategoryBalances>) = apply {
            this.cashAdvances = cashAdvances
        }

        /** Amounts attributable to purchases */
        fun purchases(purchases: CategoryBalances) = purchases(JsonField.of(purchases))

        /**
         * Sets [Builder.purchases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchases] with a well-typed [CategoryBalances] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchases(purchases: JsonField<CategoryBalances>) = apply { this.purchases = purchases }

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
         * Returns an immutable instance of [TransactionCategoryBalances].
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
        fun build(): TransactionCategoryBalances =
            TransactionCategoryBalances(
                checkRequired("balanceTransfers", balanceTransfers),
                checkRequired("cashAdvances", cashAdvances),
                checkRequired("purchases", purchases),
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
    fun validate(): TransactionCategoryBalances = apply {
        if (validated) {
            return@apply
        }

        balanceTransfers().validate()
        cashAdvances().validate()
        purchases().validate()
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
        (balanceTransfers.asKnown().getOrNull()?.validity() ?: 0) +
            (cashAdvances.asKnown().getOrNull()?.validity() ?: 0) +
            (purchases.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionCategoryBalances &&
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
        "TransactionCategoryBalances{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, purchases=$purchases, additionalProperties=$additionalProperties}"
}
