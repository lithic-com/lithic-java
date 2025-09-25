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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Card Aggregate Balance across all end-user accounts */
class AggregateBalanceListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availableAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val lastCardToken: JsonField<String>,
    private val lastTransactionEventToken: JsonField<String>,
    private val lastTransactionToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val totalAmount: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_amount")
        @ExcludeMissing
        availableAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_card_token")
        @ExcludeMissing
        lastCardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_transaction_event_token")
        @ExcludeMissing
        lastTransactionEventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_transaction_token")
        @ExcludeMissing
        lastTransactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        availableAmount,
        created,
        currency,
        lastCardToken,
        lastTransactionEventToken,
        lastTransactionToken,
        pendingAmount,
        totalAmount,
        updated,
        mutableMapOf(),
    )

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
     * Globally unique identifier for the card that had its balance updated most recently
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastCardToken(): String = lastCardToken.getRequired("last_card_token")

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
     * Returns the raw JSON value of [lastCardToken].
     *
     * Unlike [lastCardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_card_token")
    @ExcludeMissing
    fun _lastCardToken(): JsonField<String> = lastCardToken

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

        /** Globally unique identifier for the card that had its balance updated most recently */
        fun lastCardToken(lastCardToken: String) = lastCardToken(JsonField.of(lastCardToken))

        /**
         * Sets [Builder.lastCardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastCardToken(lastCardToken: JsonField<String>) = apply {
            this.lastCardToken = lastCardToken
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
         * Returns an immutable instance of [AggregateBalanceListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        (if (availableAmount.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (lastCardToken.asKnown().isPresent) 1 else 0) +
            (if (lastTransactionEventToken.asKnown().isPresent) 1 else 0) +
            (if (lastTransactionToken.asKnown().isPresent) 1 else 0) +
            (if (pendingAmount.asKnown().isPresent) 1 else 0) +
            (if (totalAmount.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AggregateBalanceListResponse &&
            availableAmount == other.availableAmount &&
            created == other.created &&
            currency == other.currency &&
            lastCardToken == other.lastCardToken &&
            lastTransactionEventToken == other.lastTransactionEventToken &&
            lastTransactionToken == other.lastTransactionToken &&
            pendingAmount == other.pendingAmount &&
            totalAmount == other.totalAmount &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            availableAmount,
            created,
            currency,
            lastCardToken,
            lastTransactionEventToken,
            lastTransactionToken,
            pendingAmount,
            totalAmount,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregateBalanceListResponse{availableAmount=$availableAmount, created=$created, currency=$currency, lastCardToken=$lastCardToken, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
