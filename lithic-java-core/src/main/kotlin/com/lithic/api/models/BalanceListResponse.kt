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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Balance of a Financial Account */
@JsonDeserialize(builder = BalanceListResponse.Builder::class)
@NoAutoDetect
class BalanceListResponse
private constructor(
    private val availableAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val lastTransactionEventToken: JsonField<String>,
    private val lastTransactionToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val totalAmount: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /** Date and time for when the balance was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
    fun currency(): String = currency.getRequired("currency")

    /** Globally unique identifier for the financial account that holds this balance. */
    fun token(): String = token.getRequired("token")

    /** Type of financial account. */
    fun type(): Type = type.getRequired("type")

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
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Type of financial account. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

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

    fun validate(): BalanceListResponse = apply {
        if (!validated) {
            availableAmount()
            created()
            currency()
            token()
            type()
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
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var lastTransactionEventToken: JsonField<String> = JsonMissing.of()
        private var lastTransactionToken: JsonField<String> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var totalAmount: JsonField<Long> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceListResponse: BalanceListResponse) = apply {
            this.availableAmount = balanceListResponse.availableAmount
            this.created = balanceListResponse.created
            this.currency = balanceListResponse.currency
            this.token = balanceListResponse.token
            this.type = balanceListResponse.type
            this.lastTransactionEventToken = balanceListResponse.lastTransactionEventToken
            this.lastTransactionToken = balanceListResponse.lastTransactionToken
            this.pendingAmount = balanceListResponse.pendingAmount
            this.totalAmount = balanceListResponse.totalAmount
            this.updated = balanceListResponse.updated
            additionalProperties(balanceListResponse.additionalProperties)
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
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the financial account that holds this balance. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Type of financial account. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Type of financial account. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): BalanceListResponse =
            BalanceListResponse(
                availableAmount,
                created,
                currency,
                token,
                type,
                lastTransactionEventToken,
                lastTransactionToken,
                pendingAmount,
                totalAmount,
                updated,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ISSUING = Type(JsonField.of("ISSUING"))

            @JvmField val OPERATING = Type(JsonField.of("OPERATING"))

            @JvmField val RESERVE = Type(JsonField.of("RESERVE"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListResponse && this.availableAmount == other.availableAmount && this.created == other.created && this.currency == other.currency && this.token == other.token && this.type == other.type && this.lastTransactionEventToken == other.lastTransactionEventToken && this.lastTransactionToken == other.lastTransactionToken && this.pendingAmount == other.pendingAmount && this.totalAmount == other.totalAmount && this.updated == other.updated && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(availableAmount, created, currency, token, type, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, updated, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "BalanceListResponse{availableAmount=$availableAmount, created=$created, currency=$currency, token=$token, type=$type, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
