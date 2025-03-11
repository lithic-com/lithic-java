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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/** Card Aggregate Balance across all end-user accounts */
@NoAutoDetect
class AggregateBalanceListResponse
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
    @JsonProperty("last_card_token")
    @ExcludeMissing
    private val lastCardToken: JsonField<String> = JsonMissing.of(),
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

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /** Date and time for when the balance was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
    fun currency(): String = currency.getRequired("currency")

    /** Globally unique identifier for the card that had its balance updated most recently */
    fun lastCardToken(): String = lastCardToken.getRequired("last_card_token")

    /** Globally unique identifier for the last transaction event that impacted this balance */
    fun lastTransactionEventToken(): String =
        lastTransactionEventToken.getRequired("last_transaction_event_token")

    /** Globally unique identifier for the last transaction that impacted this balance */
    fun lastTransactionToken(): String = lastTransactionToken.getRequired("last_transaction_token")

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD)
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD)
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** Date and time for when the balance was last updated. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    @JsonProperty("available_amount")
    @ExcludeMissing
    fun _availableAmount(): JsonField<Long> = availableAmount

    /** Date and time for when the balance was first created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** Globally unique identifier for the card that had its balance updated most recently */
    @JsonProperty("last_card_token")
    @ExcludeMissing
    fun _lastCardToken(): JsonField<String> = lastCardToken

    /** Globally unique identifier for the last transaction event that impacted this balance */
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    fun _lastTransactionEventToken(): JsonField<String> = lastTransactionEventToken

    /** Globally unique identifier for the last transaction that impacted this balance */
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    fun _lastTransactionToken(): JsonField<String> = lastTransactionToken

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD)
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD)
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /** Date and time for when the balance was last updated. */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AggregateBalanceListResponse = apply {
        if (validated) {
            return@apply
        }

        availableAmount()
        created()
        currency()
        lastCardToken()
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
         * Returns a mutable builder for constructing an instance of [AggregateBalanceListResponse].
         *
         * The following fields are required:
         * ```java
         * .availableAmount()
         * .created()
         * .currency()
         * .lastCardToken()
         * .lastTransactionEventToken()
         * .lastTransactionToken()
         * .pendingAmount()
         * .totalAmount()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregateBalanceListResponse]. */
    class Builder internal constructor() {

        private var availableAmount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var lastCardToken: JsonField<String>? = null
        private var lastTransactionEventToken: JsonField<String>? = null
        private var lastTransactionToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var totalAmount: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aggregateBalanceListResponse: AggregateBalanceListResponse) = apply {
            availableAmount = aggregateBalanceListResponse.availableAmount
            created = aggregateBalanceListResponse.created
            currency = aggregateBalanceListResponse.currency
            lastCardToken = aggregateBalanceListResponse.lastCardToken
            lastTransactionEventToken = aggregateBalanceListResponse.lastTransactionEventToken
            lastTransactionToken = aggregateBalanceListResponse.lastTransactionToken
            pendingAmount = aggregateBalanceListResponse.pendingAmount
            totalAmount = aggregateBalanceListResponse.totalAmount
            updated = aggregateBalanceListResponse.updated
            additionalProperties = aggregateBalanceListResponse.additionalProperties.toMutableMap()
        }

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: Long) = availableAmount(JsonField.of(availableAmount))

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: JsonField<Long>) = apply {
            this.availableAmount = availableAmount
        }

        /** Date and time for when the balance was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time for when the balance was first created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Globally unique identifier for the card that had its balance updated most recently */
        fun lastCardToken(lastCardToken: String) = lastCardToken(JsonField.of(lastCardToken))

        /** Globally unique identifier for the card that had its balance updated most recently */
        fun lastCardToken(lastCardToken: JsonField<String>) = apply {
            this.lastCardToken = lastCardToken
        }

        /** Globally unique identifier for the last transaction event that impacted this balance */
        fun lastTransactionEventToken(lastTransactionEventToken: String) =
            lastTransactionEventToken(JsonField.of(lastTransactionEventToken))

        /** Globally unique identifier for the last transaction event that impacted this balance */
        fun lastTransactionEventToken(lastTransactionEventToken: JsonField<String>) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /** Globally unique identifier for the last transaction that impacted this balance */
        fun lastTransactionToken(lastTransactionToken: String) =
            lastTransactionToken(JsonField.of(lastTransactionToken))

        /** Globally unique identifier for the last transaction that impacted this balance */
        fun lastTransactionToken(lastTransactionToken: JsonField<String>) = apply {
            this.lastTransactionToken = lastTransactionToken
        }

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD)
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD)
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
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD)
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** Date and time for when the balance was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time for when the balance was last updated. */
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

        fun build(): AggregateBalanceListResponse =
            AggregateBalanceListResponse(
                checkRequired("availableAmount", availableAmount),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("lastCardToken", lastCardToken),
                checkRequired("lastTransactionEventToken", lastTransactionEventToken),
                checkRequired("lastTransactionToken", lastTransactionToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("totalAmount", totalAmount),
                checkRequired("updated", updated),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListResponse && availableAmount == other.availableAmount && created == other.created && currency == other.currency && lastCardToken == other.lastCardToken && lastTransactionEventToken == other.lastTransactionEventToken && lastTransactionToken == other.lastTransactionToken && pendingAmount == other.pendingAmount && totalAmount == other.totalAmount && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableAmount, created, currency, lastCardToken, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregateBalanceListResponse{availableAmount=$availableAmount, created=$created, currency=$currency, lastCardToken=$lastCardToken, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
