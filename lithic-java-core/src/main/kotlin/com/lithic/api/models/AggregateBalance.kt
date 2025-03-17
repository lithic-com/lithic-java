// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Aggregate Balance across all end-user accounts */
@NoAutoDetect
class AggregateBalance
@JsonCreator
private constructor(
    @JsonProperty("available_amount")
    @ExcludeMissing
    private val availableAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_type")
    @ExcludeMissing
    private val financialAccountType: JsonField<FinancialAccountType> = JsonMissing.of(),
    @JsonProperty("last_financial_account_token")
    @ExcludeMissing
    private val lastFinancialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    private val lastTransactionEventToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    private val lastTransactionToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Funds available for spend in the currency's smallest unit (e.g., cents for USD)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /**
     * Date and time for when the balance was first created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code for the local currency of the balance.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Type of financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountType(): FinancialAccountType =
        financialAccountType.getRequired("financial_account_type")

    /**
     * Globally unique identifier for the financial account that had its balance updated most
     * recently
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastFinancialAccountToken(): String =
        lastFinancialAccountToken.getRequired("last_financial_account_token")

    /**
     * Globally unique identifier for the last transaction event that impacted this balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastTransactionEventToken(): String =
        lastTransactionEventToken.getRequired("last_transaction_event_token")

    /**
     * Globally unique identifier for the last transaction that impacted this balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastTransactionToken(): String = lastTransactionToken.getRequired("last_transaction_token")

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /**
     * Date and time for when the balance was last updated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [availableAmount].
     *
     * Unlike [availableAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_amount")
    @ExcludeMissing
    fun _availableAmount(): JsonField<Long> = availableAmount

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [financialAccountType].
     *
     * Unlike [financialAccountType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_type")
    @ExcludeMissing
    fun _financialAccountType(): JsonField<FinancialAccountType> = financialAccountType

    /**
     * Returns the raw JSON value of [lastFinancialAccountToken].
     *
     * Unlike [lastFinancialAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("last_financial_account_token")
    @ExcludeMissing
    fun _lastFinancialAccountToken(): JsonField<String> = lastFinancialAccountToken

    /**
     * Returns the raw JSON value of [lastTransactionEventToken].
     *
     * Unlike [lastTransactionEventToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    fun _lastTransactionEventToken(): JsonField<String> = lastTransactionEventToken

    /**
     * Returns the raw JSON value of [lastTransactionToken].
     *
     * Unlike [lastTransactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    fun _lastTransactionToken(): JsonField<String> = lastTransactionToken

    /**
     * Returns the raw JSON value of [pendingAmount].
     *
     * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AggregateBalance = apply {
        if (validated) {
            return@apply
        }

        availableAmount()
        created()
        currency()
        financialAccountType()
        lastFinancialAccountToken()
        lastTransactionEventToken()
        lastTransactionToken()
        pendingAmount()
        totalAmount()
        updated()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregateBalance].
         *
         * The following fields are required:
         * ```java
         * .availableAmount()
         * .created()
         * .currency()
         * .financialAccountType()
         * .lastFinancialAccountToken()
         * .lastTransactionEventToken()
         * .lastTransactionToken()
         * .pendingAmount()
         * .totalAmount()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregateBalance]. */
    class Builder internal constructor() {

        private var availableAmount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var financialAccountType: JsonField<FinancialAccountType>? = null
        private var lastFinancialAccountToken: JsonField<String>? = null
        private var lastTransactionEventToken: JsonField<String>? = null
        private var lastTransactionToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var totalAmount: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aggregateBalance: AggregateBalance) = apply {
            availableAmount = aggregateBalance.availableAmount
            created = aggregateBalance.created
            currency = aggregateBalance.currency
            financialAccountType = aggregateBalance.financialAccountType
            lastFinancialAccountToken = aggregateBalance.lastFinancialAccountToken
            lastTransactionEventToken = aggregateBalance.lastTransactionEventToken
            lastTransactionToken = aggregateBalance.lastTransactionToken
            pendingAmount = aggregateBalance.pendingAmount
            totalAmount = aggregateBalance.totalAmount
            updated = aggregateBalance.updated
            additionalProperties = aggregateBalance.additionalProperties.toMutableMap()
        }

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: Long) = availableAmount(JsonField.of(availableAmount))

        /**
         * Sets [Builder.availableAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun availableAmount(availableAmount: JsonField<Long>) = apply {
            this.availableAmount = availableAmount
        }

        /** Date and time for when the balance was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Type of financial account */
        fun financialAccountType(financialAccountType: FinancialAccountType) =
            financialAccountType(JsonField.of(financialAccountType))

        /**
         * Sets [Builder.financialAccountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountType] with a well-typed
         * [FinancialAccountType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun financialAccountType(financialAccountType: JsonField<FinancialAccountType>) = apply {
            this.financialAccountType = financialAccountType
        }

        /**
         * Globally unique identifier for the financial account that had its balance updated most
         * recently
         */
        fun lastFinancialAccountToken(lastFinancialAccountToken: String) =
            lastFinancialAccountToken(JsonField.of(lastFinancialAccountToken))

        /**
         * Sets [Builder.lastFinancialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastFinancialAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastFinancialAccountToken(lastFinancialAccountToken: JsonField<String>) = apply {
            this.lastFinancialAccountToken = lastFinancialAccountToken
        }

        /** Globally unique identifier for the last transaction event that impacted this balance */
        fun lastTransactionEventToken(lastTransactionEventToken: String) =
            lastTransactionEventToken(JsonField.of(lastTransactionEventToken))

        /**
         * Sets [Builder.lastTransactionEventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTransactionEventToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastTransactionEventToken(lastTransactionEventToken: JsonField<String>) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /** Globally unique identifier for the last transaction that impacted this balance */
        fun lastTransactionToken(lastTransactionToken: String) =
            lastTransactionToken(JsonField.of(lastTransactionToken))

        /**
         * Sets [Builder.lastTransactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTransactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastTransactionToken(lastTransactionToken: JsonField<String>) = apply {
            this.lastTransactionToken = lastTransactionToken
        }

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD)
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Sets [Builder.pendingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD)
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** Date and time for when the balance was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [AggregateBalance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .availableAmount()
         * .created()
         * .currency()
         * .financialAccountType()
         * .lastFinancialAccountToken()
         * .lastTransactionEventToken()
         * .lastTransactionToken()
         * .pendingAmount()
         * .totalAmount()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AggregateBalance =
            AggregateBalance(
                checkRequired("availableAmount", availableAmount),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("financialAccountType", financialAccountType),
                checkRequired("lastFinancialAccountToken", lastFinancialAccountToken),
                checkRequired("lastTransactionEventToken", lastTransactionEventToken),
                checkRequired("lastTransactionToken", lastTransactionToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("totalAmount", totalAmount),
                checkRequired("updated", updated),
                additionalProperties.toImmutable(),
            )
    }

    /** Type of financial account */
    class FinancialAccountType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ISSUING = of("ISSUING")

            @JvmField val OPERATING = of("OPERATING")

            @JvmField val RESERVE = of("RESERVE")

            @JvmStatic fun of(value: String) = FinancialAccountType(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountType]'s known values. */
        enum class Known {
            ISSUING,
            OPERATING,
            RESERVE,
        }

        /**
         * An enum containing [FinancialAccountType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FinancialAccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUING,
            OPERATING,
            RESERVE,
            /**
             * An enum member indicating that [FinancialAccountType] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                OPERATING -> Value.OPERATING
                RESERVE -> Value.RESERVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                OPERATING -> Known.OPERATING
                RESERVE -> Known.RESERVE
                else -> throw LithicInvalidDataException("Unknown FinancialAccountType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalance && availableAmount == other.availableAmount && created == other.created && currency == other.currency && financialAccountType == other.financialAccountType && lastFinancialAccountToken == other.lastFinancialAccountToken && lastTransactionEventToken == other.lastTransactionEventToken && lastTransactionToken == other.lastTransactionToken && pendingAmount == other.pendingAmount && totalAmount == other.totalAmount && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableAmount, created, currency, financialAccountType, lastFinancialAccountToken, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregateBalance{availableAmount=$availableAmount, created=$created, currency=$currency, financialAccountType=$financialAccountType, lastFinancialAccountToken=$lastFinancialAccountToken, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
