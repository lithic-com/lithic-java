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

class StatementTotals
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balanceTransfers: JsonField<Long>,
    private val cashAdvances: JsonField<Long>,
    private val credits: JsonField<Long>,
    private val debits: JsonField<Long>,
    private val fees: JsonField<Long>,
    private val interest: JsonField<Long>,
    private val payments: JsonField<Long>,
    private val purchases: JsonField<Long>,
    private val creditDetails: JsonValue,
    private val debitDetails: JsonValue,
    private val paymentDetails: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        balanceTransfers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cash_advances")
        @ExcludeMissing
        cashAdvances: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credits") @ExcludeMissing credits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("debits") @ExcludeMissing debits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interest") @ExcludeMissing interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payments") @ExcludeMissing payments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("purchases") @ExcludeMissing purchases: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credit_details") @ExcludeMissing creditDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("debit_details") @ExcludeMissing debitDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("payment_details")
        @ExcludeMissing
        paymentDetails: JsonValue = JsonMissing.of(),
    ) : this(
        balanceTransfers,
        cashAdvances,
        credits,
        debits,
        fees,
        interest,
        payments,
        purchases,
        creditDetails,
        debitDetails,
        paymentDetails,
        mutableMapOf(),
    )

    /**
     * Opening balance transferred from previous account in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceTransfers(): Long = balanceTransfers.getRequired("balance_transfers")

    /**
     * ATM and cashback transactions in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cashAdvances(): Long = cashAdvances.getRequired("cash_advances")

    /**
     * Volume of credit management operation transactions less any balance transfers in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credits(): Long = credits.getRequired("credits")

    /**
     * Volume of debit management operation transactions less any interest in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debits(): Long = debits.getRequired("debits")

    /**
     * Volume of debit management operation transactions less any interest in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fees(): Long = fees.getRequired("fees")

    /**
     * Interest accrued in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interest(): Long = interest.getRequired("interest")

    /**
     * Any funds transfers which affective the balance in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payments(): Long = payments.getRequired("payments")

    /**
     * Net card transaction volume less any cash advances in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purchases(): Long = purchases.getRequired("purchases")

    /**
     * Breakdown of credits
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = statementTotals.creditDetails().convert(MyClass.class);
     * ```
     */
    @JsonProperty("credit_details") @ExcludeMissing fun _creditDetails(): JsonValue = creditDetails

    /**
     * Breakdown of debits
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = statementTotals.debitDetails().convert(MyClass.class);
     * ```
     */
    @JsonProperty("debit_details") @ExcludeMissing fun _debitDetails(): JsonValue = debitDetails

    /**
     * Breakdown of payments
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = statementTotals.paymentDetails().convert(MyClass.class);
     * ```
     */
    @JsonProperty("payment_details")
    @ExcludeMissing
    fun _paymentDetails(): JsonValue = paymentDetails

    /**
     * Returns the raw JSON value of [balanceTransfers].
     *
     * Unlike [balanceTransfers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("balance_transfers")
    @ExcludeMissing
    fun _balanceTransfers(): JsonField<Long> = balanceTransfers

    /**
     * Returns the raw JSON value of [cashAdvances].
     *
     * Unlike [cashAdvances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cash_advances")
    @ExcludeMissing
    fun _cashAdvances(): JsonField<Long> = cashAdvances

    /**
     * Returns the raw JSON value of [credits].
     *
     * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

    /**
     * Returns the raw JSON value of [debits].
     *
     * Unlike [debits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debits") @ExcludeMissing fun _debits(): JsonField<Long> = debits

    /**
     * Returns the raw JSON value of [fees].
     *
     * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

    /**
     * Returns the raw JSON value of [interest].
     *
     * Unlike [interest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

    /**
     * Returns the raw JSON value of [payments].
     *
     * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payments") @ExcludeMissing fun _payments(): JsonField<Long> = payments

    /**
     * Returns the raw JSON value of [purchases].
     *
     * Unlike [purchases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purchases") @ExcludeMissing fun _purchases(): JsonField<Long> = purchases

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
         * Returns a mutable builder for constructing an instance of [StatementTotals].
         *
         * The following fields are required:
         * ```java
         * .balanceTransfers()
         * .cashAdvances()
         * .credits()
         * .debits()
         * .fees()
         * .interest()
         * .payments()
         * .purchases()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementTotals]. */
    class Builder internal constructor() {

        private var balanceTransfers: JsonField<Long>? = null
        private var cashAdvances: JsonField<Long>? = null
        private var credits: JsonField<Long>? = null
        private var debits: JsonField<Long>? = null
        private var fees: JsonField<Long>? = null
        private var interest: JsonField<Long>? = null
        private var payments: JsonField<Long>? = null
        private var purchases: JsonField<Long>? = null
        private var creditDetails: JsonValue = JsonMissing.of()
        private var debitDetails: JsonValue = JsonMissing.of()
        private var paymentDetails: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statementTotals: StatementTotals) = apply {
            balanceTransfers = statementTotals.balanceTransfers
            cashAdvances = statementTotals.cashAdvances
            credits = statementTotals.credits
            debits = statementTotals.debits
            fees = statementTotals.fees
            interest = statementTotals.interest
            payments = statementTotals.payments
            purchases = statementTotals.purchases
            creditDetails = statementTotals.creditDetails
            debitDetails = statementTotals.debitDetails
            paymentDetails = statementTotals.paymentDetails
            additionalProperties = statementTotals.additionalProperties.toMutableMap()
        }

        /** Opening balance transferred from previous account in cents */
        fun balanceTransfers(balanceTransfers: Long) =
            balanceTransfers(JsonField.of(balanceTransfers))

        /**
         * Sets [Builder.balanceTransfers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceTransfers] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceTransfers(balanceTransfers: JsonField<Long>) = apply {
            this.balanceTransfers = balanceTransfers
        }

        /** ATM and cashback transactions in cents */
        fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

        /**
         * Sets [Builder.cashAdvances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAdvances] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cashAdvances(cashAdvances: JsonField<Long>) = apply { this.cashAdvances = cashAdvances }

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         */
        fun credits(credits: Long) = credits(JsonField.of(credits))

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

        /** Volume of debit management operation transactions less any interest in cents */
        fun debits(debits: Long) = debits(JsonField.of(debits))

        /**
         * Sets [Builder.debits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debits] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun debits(debits: JsonField<Long>) = apply { this.debits = debits }

        /** Volume of debit management operation transactions less any interest in cents */
        fun fees(fees: Long) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

        /** Interest accrued in cents */
        fun interest(interest: Long) = interest(JsonField.of(interest))

        /**
         * Sets [Builder.interest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interest] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

        /** Any funds transfers which affective the balance in cents */
        fun payments(payments: Long) = payments(JsonField.of(payments))

        /**
         * Sets [Builder.payments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payments] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

        /** Net card transaction volume less any cash advances in cents */
        fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

        /**
         * Sets [Builder.purchases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchases] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

        /** Breakdown of credits */
        fun creditDetails(creditDetails: JsonValue) = apply { this.creditDetails = creditDetails }

        /** Breakdown of debits */
        fun debitDetails(debitDetails: JsonValue) = apply { this.debitDetails = debitDetails }

        /** Breakdown of payments */
        fun paymentDetails(paymentDetails: JsonValue) = apply {
            this.paymentDetails = paymentDetails
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
         * Returns an immutable instance of [StatementTotals].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .balanceTransfers()
         * .cashAdvances()
         * .credits()
         * .debits()
         * .fees()
         * .interest()
         * .payments()
         * .purchases()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatementTotals =
            StatementTotals(
                checkRequired("balanceTransfers", balanceTransfers),
                checkRequired("cashAdvances", cashAdvances),
                checkRequired("credits", credits),
                checkRequired("debits", debits),
                checkRequired("fees", fees),
                checkRequired("interest", interest),
                checkRequired("payments", payments),
                checkRequired("purchases", purchases),
                creditDetails,
                debitDetails,
                paymentDetails,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatementTotals = apply {
        if (validated) {
            return@apply
        }

        balanceTransfers()
        cashAdvances()
        credits()
        debits()
        fees()
        interest()
        payments()
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
            (if (credits.asKnown().isPresent) 1 else 0) +
            (if (debits.asKnown().isPresent) 1 else 0) +
            (if (fees.asKnown().isPresent) 1 else 0) +
            (if (interest.asKnown().isPresent) 1 else 0) +
            (if (payments.asKnown().isPresent) 1 else 0) +
            (if (purchases.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementTotals &&
            balanceTransfers == other.balanceTransfers &&
            cashAdvances == other.cashAdvances &&
            credits == other.credits &&
            debits == other.debits &&
            fees == other.fees &&
            interest == other.interest &&
            payments == other.payments &&
            purchases == other.purchases &&
            creditDetails == other.creditDetails &&
            debitDetails == other.debitDetails &&
            paymentDetails == other.paymentDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            balanceTransfers,
            cashAdvances,
            credits,
            debits,
            fees,
            interest,
            payments,
            purchases,
            creditDetails,
            debitDetails,
            paymentDetails,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementTotals{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, credits=$credits, debits=$debits, fees=$fees, interest=$interest, payments=$payments, purchases=$purchases, creditDetails=$creditDetails, debitDetails=$debitDetails, paymentDetails=$paymentDetails, additionalProperties=$additionalProperties}"
}
