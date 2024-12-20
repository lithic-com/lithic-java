// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Balance */
@JsonDeserialize(builder = Balance.Builder::class)
@NoAutoDetect
class Balance
private constructor(
    private val availableAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val financialAccountType: JsonField<FinancialAccountType>,
    private val lastTransactionEventToken: JsonField<String>,
    private val lastTransactionToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val totalAmount: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /** Date and time for when the balance was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
    fun currency(): String = currency.getRequired("currency")

    /** Globally unique identifier for the financial account that holds this balance. */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Type of financial account. */
    fun financialAccountType(): FinancialAccountType =
        financialAccountType.getRequired("financial_account_type")

    /**
     * Globally unique identifier for the last financial transaction event that impacted this
     * balance.
     */
    fun lastTransactionEventToken(): String =
        lastTransactionEventToken.getRequired("last_transaction_event_token")

    /** Globally unique identifier for the last financial transaction that impacted this balance. */
    fun lastTransactionToken(): String = lastTransactionToken.getRequired("last_transaction_token")

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD).
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** Date and time for when the balance was last updated. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    @JsonProperty("available_amount") @ExcludeMissing fun _availableAmount() = availableAmount

    /** Date and time for when the balance was first created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Globally unique identifier for the financial account that holds this balance. */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Type of financial account. */
    @JsonProperty("financial_account_type")
    @ExcludeMissing
    fun _financialAccountType() = financialAccountType

    /**
     * Globally unique identifier for the last financial transaction event that impacted this
     * balance.
     */
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    fun _lastTransactionEventToken() = lastTransactionEventToken

    /** Globally unique identifier for the last financial transaction that impacted this balance. */
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    fun _lastTransactionToken() = lastTransactionToken

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD).
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD).
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount() = totalAmount

    /** Date and time for when the balance was last updated. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Balance = apply {
        if (!validated) {
            availableAmount()
            created()
            currency()
            financialAccountToken()
            financialAccountType()
            lastTransactionEventToken()
            lastTransactionToken()
            pendingAmount()
            totalAmount()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var availableAmount: JsonField<Long> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var financialAccountType: JsonField<FinancialAccountType> = JsonMissing.of()
        private var lastTransactionEventToken: JsonField<String> = JsonMissing.of()
        private var lastTransactionToken: JsonField<String> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var totalAmount: JsonField<Long> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balance: Balance) = apply {
            availableAmount = balance.availableAmount
            created = balance.created
            currency = balance.currency
            financialAccountToken = balance.financialAccountToken
            financialAccountType = balance.financialAccountType
            lastTransactionEventToken = balance.lastTransactionEventToken
            lastTransactionToken = balance.lastTransactionToken
            pendingAmount = balance.pendingAmount
            totalAmount = balance.totalAmount
            updated = balance.updated
            additionalProperties = balance.additionalProperties.toMutableMap()
        }

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: Long) = availableAmount(JsonField.of(availableAmount))

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        @JsonProperty("available_amount")
        @ExcludeMissing
        fun availableAmount(availableAmount: JsonField<Long>) = apply {
            this.availableAmount = availableAmount
        }

        /** Date and time for when the balance was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time for when the balance was first created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Globally unique identifier for the financial account that holds this balance. */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for the financial account that holds this balance. */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Type of financial account. */
        fun financialAccountType(financialAccountType: FinancialAccountType) =
            financialAccountType(JsonField.of(financialAccountType))

        /** Type of financial account. */
        @JsonProperty("financial_account_type")
        @ExcludeMissing
        fun financialAccountType(financialAccountType: JsonField<FinancialAccountType>) = apply {
            this.financialAccountType = financialAccountType
        }

        /**
         * Globally unique identifier for the last financial transaction event that impacted this
         * balance.
         */
        fun lastTransactionEventToken(lastTransactionEventToken: String) =
            lastTransactionEventToken(JsonField.of(lastTransactionEventToken))

        /**
         * Globally unique identifier for the last financial transaction event that impacted this
         * balance.
         */
        @JsonProperty("last_transaction_event_token")
        @ExcludeMissing
        fun lastTransactionEventToken(lastTransactionEventToken: JsonField<String>) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /**
         * Globally unique identifier for the last financial transaction that impacted this balance.
         */
        fun lastTransactionToken(lastTransactionToken: String) =
            lastTransactionToken(JsonField.of(lastTransactionToken))

        /**
         * Globally unique identifier for the last financial transaction that impacted this balance.
         */
        @JsonProperty("last_transaction_token")
        @ExcludeMissing
        fun lastTransactionToken(lastTransactionToken: JsonField<String>) = apply {
            this.lastTransactionToken = lastTransactionToken
        }

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD).
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD).
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD).
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD).
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** Date and time for when the balance was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time for when the balance was last updated. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): Balance =
            Balance(
                availableAmount,
                created,
                currency,
                financialAccountToken,
                financialAccountType,
                lastTransactionEventToken,
                lastTransactionToken,
                pendingAmount,
                totalAmount,
                updated,
                additionalProperties.toImmutable(),
            )
    }

    class FinancialAccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ISSUING = of("ISSUING")

            @JvmField val OPERATING = of("OPERATING")

            @JvmField val RESERVE = of("RESERVE")

            @JvmStatic fun of(value: String) = FinancialAccountType(JsonField.of(value))
        }

        enum class Known {
            ISSUING,
            OPERATING,
            RESERVE,
        }

        enum class Value {
            ISSUING,
            OPERATING,
            RESERVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                OPERATING -> Value.OPERATING
                RESERVE -> Value.RESERVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                OPERATING -> Known.OPERATING
                RESERVE -> Known.RESERVE
                else -> throw LithicInvalidDataException("Unknown FinancialAccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is Balance && availableAmount == other.availableAmount && created == other.created && currency == other.currency && financialAccountToken == other.financialAccountToken && financialAccountType == other.financialAccountType && lastTransactionEventToken == other.lastTransactionEventToken && lastTransactionToken == other.lastTransactionToken && pendingAmount == other.pendingAmount && totalAmount == other.totalAmount && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableAmount, created, currency, financialAccountToken, financialAccountType, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Balance{availableAmount=$availableAmount, created=$created, currency=$currency, financialAccountToken=$financialAccountToken, financialAccountType=$financialAccountType, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
