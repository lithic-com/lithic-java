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
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Financial Event */
class FinancialEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val amount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val result: JsonField<Result>,
    private val type: JsonField<FinancialEventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<FinancialEventType> = JsonMissing.of(),
    ) : this(token, amount, created, result, type, mutableMapOf())

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * Amount of the financial event that has been settled in the currency's smallest unit (e.g.,
     * cents).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Long> = amount.getOptional("amount")

    /**
     * Date and time when the financial event occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * APPROVED financial events were successful while DECLINED financial events were declined by
     * user, Lithic, or the network.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<FinancialEventType> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FinancialEventType> = type

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

        /** Returns a mutable builder for constructing an instance of [FinancialEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var type: JsonField<FinancialEventType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialEvent: FinancialEvent) = apply {
            token = financialEvent.token
            amount = financialEvent.amount
            created = financialEvent.created
            result = financialEvent.result
            type = financialEvent.type
            additionalProperties = financialEvent.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        fun type(type: FinancialEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [FinancialEventType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<FinancialEventType>) = apply { this.type = type }

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
         * Returns an immutable instance of [FinancialEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FinancialEvent =
            FinancialEvent(
                token,
                amount,
                created,
                result,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FinancialEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        amount()
        created()
        result().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * APPROVED financial events were successful while DECLINED financial events were declined by
     * user, Lithic, or the network.
     */
    class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        /** An enum containing [Result]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Result] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /** An enum member indicating that [Result] was instantiated with an unknown value. */
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
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
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
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
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

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class FinancialEventType
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

            @JvmField val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

            @JvmField val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

            @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

            @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

            @JvmField val ACH_ORIGINATION_REJECTED = of("ACH_ORIGINATION_REJECTED")

            @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

            @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

            @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

            @JvmField val ACH_RECEIPT_RELEASED = of("ACH_RECEIPT_RELEASED")

            @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

            @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

            @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

            @JvmField val ACH_RETURN_REJECTED = of("ACH_RETURN_REJECTED")

            @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

            @JvmField val AUTHORIZATION = of("AUTHORIZATION")

            @JvmField val AUTHORIZATION_ADVICE = of("AUTHORIZATION_ADVICE")

            @JvmField val AUTHORIZATION_EXPIRY = of("AUTHORIZATION_EXPIRY")

            @JvmField val AUTHORIZATION_REVERSAL = of("AUTHORIZATION_REVERSAL")

            @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

            @JvmField val BILLING_ERROR = of("BILLING_ERROR")

            @JvmField val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

            @JvmField val CARD_TO_CARD = of("CARD_TO_CARD")

            @JvmField val CASH_BACK = of("CASH_BACK")

            @JvmField val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

            @JvmField val CLEARING = of("CLEARING")

            @JvmField val COLLECTION = of("COLLECTION")

            @JvmField val CORRECTION_CREDIT = of("CORRECTION_CREDIT")

            @JvmField val CORRECTION_DEBIT = of("CORRECTION_DEBIT")

            @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

            @JvmField val CREDIT_AUTHORIZATION_ADVICE = of("CREDIT_AUTHORIZATION_ADVICE")

            @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

            @JvmField val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

            @JvmField val DISPUTE_WON = of("DISPUTE_WON")

            @JvmField val EXTERNAL_ACH_CANCELED = of("EXTERNAL_ACH_CANCELED")

            @JvmField val EXTERNAL_ACH_INITIATED = of("EXTERNAL_ACH_INITIATED")

            @JvmField val EXTERNAL_ACH_RELEASED = of("EXTERNAL_ACH_RELEASED")

            @JvmField val EXTERNAL_ACH_REVERSED = of("EXTERNAL_ACH_REVERSED")

            @JvmField val EXTERNAL_ACH_SETTLED = of("EXTERNAL_ACH_SETTLED")

            @JvmField val EXTERNAL_CHECK_CANCELED = of("EXTERNAL_CHECK_CANCELED")

            @JvmField val EXTERNAL_CHECK_INITIATED = of("EXTERNAL_CHECK_INITIATED")

            @JvmField val EXTERNAL_CHECK_RELEASED = of("EXTERNAL_CHECK_RELEASED")

            @JvmField val EXTERNAL_CHECK_REVERSED = of("EXTERNAL_CHECK_REVERSED")

            @JvmField val EXTERNAL_CHECK_SETTLED = of("EXTERNAL_CHECK_SETTLED")

            @JvmField val EXTERNAL_TRANSFER_CANCELED = of("EXTERNAL_TRANSFER_CANCELED")

            @JvmField val EXTERNAL_TRANSFER_INITIATED = of("EXTERNAL_TRANSFER_INITIATED")

            @JvmField val EXTERNAL_TRANSFER_RELEASED = of("EXTERNAL_TRANSFER_RELEASED")

            @JvmField val EXTERNAL_TRANSFER_REVERSED = of("EXTERNAL_TRANSFER_REVERSED")

            @JvmField val EXTERNAL_TRANSFER_SETTLED = of("EXTERNAL_TRANSFER_SETTLED")

            @JvmField val EXTERNAL_WIRE_CANCELED = of("EXTERNAL_WIRE_CANCELED")

            @JvmField val EXTERNAL_WIRE_INITIATED = of("EXTERNAL_WIRE_INITIATED")

            @JvmField val EXTERNAL_WIRE_RELEASED = of("EXTERNAL_WIRE_RELEASED")

            @JvmField val EXTERNAL_WIRE_REVERSED = of("EXTERNAL_WIRE_REVERSED")

            @JvmField val EXTERNAL_WIRE_SETTLED = of("EXTERNAL_WIRE_SETTLED")

            @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

            @JvmField val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

            @JvmField val INTEREST = of("INTEREST")

            @JvmField val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

            @JvmField val INTERNAL_ADJUSTMENT = of("INTERNAL_ADJUSTMENT")

            @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

            @JvmField val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

            @JvmField val LOSS_WRITE_OFF = of("LOSS_WRITE_OFF")

            @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

            @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val RETURN = of("RETURN")

            @JvmField val RETURN_REVERSAL = of("RETURN_REVERSAL")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmField val TRANSFER_INSUFFICIENT_FUNDS = of("TRANSFER_INSUFFICIENT_FUNDS")

            @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

            @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

            @JvmField val LITHIC_NETWORK_PAYMENT = of("LITHIC_NETWORK_PAYMENT")

            @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
        }

        /** An enum containing [FinancialEventType]'s known values. */
        enum class Known {
            ACH_ORIGINATION_CANCELLED,
            ACH_ORIGINATION_INITIATED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_REJECTED,
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_PROCESSED,
            ACH_RECEIPT_RELEASED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            ACH_RETURN_REJECTED,
            ACH_RETURN_SETTLED,
            AUTHORIZATION,
            AUTHORIZATION_ADVICE,
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
            BALANCE_INQUIRY,
            BILLING_ERROR,
            BILLING_ERROR_REVERSAL,
            CARD_TO_CARD,
            CASH_BACK,
            CASH_BACK_REVERSAL,
            CLEARING,
            COLLECTION,
            CORRECTION_CREDIT,
            CORRECTION_DEBIT,
            CREDIT_AUTHORIZATION,
            CREDIT_AUTHORIZATION_ADVICE,
            CURRENCY_CONVERSION,
            CURRENCY_CONVERSION_REVERSAL,
            DISPUTE_WON,
            EXTERNAL_ACH_CANCELED,
            EXTERNAL_ACH_INITIATED,
            EXTERNAL_ACH_RELEASED,
            EXTERNAL_ACH_REVERSED,
            EXTERNAL_ACH_SETTLED,
            EXTERNAL_CHECK_CANCELED,
            EXTERNAL_CHECK_INITIATED,
            EXTERNAL_CHECK_RELEASED,
            EXTERNAL_CHECK_REVERSED,
            EXTERNAL_CHECK_SETTLED,
            EXTERNAL_TRANSFER_CANCELED,
            EXTERNAL_TRANSFER_INITIATED,
            EXTERNAL_TRANSFER_RELEASED,
            EXTERNAL_TRANSFER_REVERSED,
            EXTERNAL_TRANSFER_SETTLED,
            EXTERNAL_WIRE_CANCELED,
            EXTERNAL_WIRE_INITIATED,
            EXTERNAL_WIRE_RELEASED,
            EXTERNAL_WIRE_REVERSED,
            EXTERNAL_WIRE_SETTLED,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            INTEREST,
            INTEREST_REVERSAL,
            INTERNAL_ADJUSTMENT,
            LATE_PAYMENT,
            LATE_PAYMENT_REVERSAL,
            LOSS_WRITE_OFF,
            PROVISIONAL_CREDIT,
            PROVISIONAL_CREDIT_REVERSAL,
            SERVICE,
            RETURN,
            RETURN_REVERSAL,
            TRANSFER,
            TRANSFER_INSUFFICIENT_FUNDS,
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
            LITHIC_NETWORK_PAYMENT,
        }

        /**
         * An enum containing [FinancialEventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FinancialEventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_ORIGINATION_CANCELLED,
            ACH_ORIGINATION_INITIATED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_REJECTED,
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_PROCESSED,
            ACH_RECEIPT_RELEASED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            ACH_RETURN_REJECTED,
            ACH_RETURN_SETTLED,
            AUTHORIZATION,
            AUTHORIZATION_ADVICE,
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
            BALANCE_INQUIRY,
            BILLING_ERROR,
            BILLING_ERROR_REVERSAL,
            CARD_TO_CARD,
            CASH_BACK,
            CASH_BACK_REVERSAL,
            CLEARING,
            COLLECTION,
            CORRECTION_CREDIT,
            CORRECTION_DEBIT,
            CREDIT_AUTHORIZATION,
            CREDIT_AUTHORIZATION_ADVICE,
            CURRENCY_CONVERSION,
            CURRENCY_CONVERSION_REVERSAL,
            DISPUTE_WON,
            EXTERNAL_ACH_CANCELED,
            EXTERNAL_ACH_INITIATED,
            EXTERNAL_ACH_RELEASED,
            EXTERNAL_ACH_REVERSED,
            EXTERNAL_ACH_SETTLED,
            EXTERNAL_CHECK_CANCELED,
            EXTERNAL_CHECK_INITIATED,
            EXTERNAL_CHECK_RELEASED,
            EXTERNAL_CHECK_REVERSED,
            EXTERNAL_CHECK_SETTLED,
            EXTERNAL_TRANSFER_CANCELED,
            EXTERNAL_TRANSFER_INITIATED,
            EXTERNAL_TRANSFER_RELEASED,
            EXTERNAL_TRANSFER_REVERSED,
            EXTERNAL_TRANSFER_SETTLED,
            EXTERNAL_WIRE_CANCELED,
            EXTERNAL_WIRE_INITIATED,
            EXTERNAL_WIRE_RELEASED,
            EXTERNAL_WIRE_REVERSED,
            EXTERNAL_WIRE_SETTLED,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            INTEREST,
            INTEREST_REVERSAL,
            INTERNAL_ADJUSTMENT,
            LATE_PAYMENT,
            LATE_PAYMENT_REVERSAL,
            LOSS_WRITE_OFF,
            PROVISIONAL_CREDIT,
            PROVISIONAL_CREDIT_REVERSAL,
            SERVICE,
            RETURN,
            RETURN_REVERSAL,
            TRANSFER,
            TRANSFER_INSUFFICIENT_FUNDS,
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
            LITHIC_NETWORK_PAYMENT,
            /**
             * An enum member indicating that [FinancialEventType] was instantiated with an unknown
             * value.
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
                ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_REJECTED -> Value.ACH_ORIGINATION_REJECTED
                ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                ACH_RECEIPT_RELEASED -> Value.ACH_RECEIPT_RELEASED
                ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                ACH_RETURN_REJECTED -> Value.ACH_RETURN_REJECTED
                ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
                AUTHORIZATION -> Value.AUTHORIZATION
                AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                BILLING_ERROR -> Value.BILLING_ERROR
                BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                CARD_TO_CARD -> Value.CARD_TO_CARD
                CASH_BACK -> Value.CASH_BACK
                CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                CLEARING -> Value.CLEARING
                COLLECTION -> Value.COLLECTION
                CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                DISPUTE_WON -> Value.DISPUTE_WON
                EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
                EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                INTEREST -> Value.INTEREST
                INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                INTERNAL_ADJUSTMENT -> Value.INTERNAL_ADJUSTMENT
                LATE_PAYMENT -> Value.LATE_PAYMENT
                LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                LOSS_WRITE_OFF -> Value.LOSS_WRITE_OFF
                PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                SERVICE -> Value.SERVICE
                RETURN -> Value.RETURN
                RETURN_REVERSAL -> Value.RETURN_REVERSAL
                TRANSFER -> Value.TRANSFER
                TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
                LITHIC_NETWORK_PAYMENT -> Value.LITHIC_NETWORK_PAYMENT
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
                ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_REJECTED -> Known.ACH_ORIGINATION_REJECTED
                ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                ACH_RECEIPT_RELEASED -> Known.ACH_RECEIPT_RELEASED
                ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                ACH_RETURN_REJECTED -> Known.ACH_RETURN_REJECTED
                ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                AUTHORIZATION -> Known.AUTHORIZATION
                AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                BILLING_ERROR -> Known.BILLING_ERROR
                BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                CARD_TO_CARD -> Known.CARD_TO_CARD
                CASH_BACK -> Known.CASH_BACK
                CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                CLEARING -> Known.CLEARING
                COLLECTION -> Known.COLLECTION
                CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                DISPUTE_WON -> Known.DISPUTE_WON
                EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                INTEREST -> Known.INTEREST
                INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                INTERNAL_ADJUSTMENT -> Known.INTERNAL_ADJUSTMENT
                LATE_PAYMENT -> Known.LATE_PAYMENT
                LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                LOSS_WRITE_OFF -> Known.LOSS_WRITE_OFF
                PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                SERVICE -> Known.SERVICE
                RETURN -> Known.RETURN
                RETURN_REVERSAL -> Known.RETURN_REVERSAL
                TRANSFER -> Known.TRANSFER
                TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                LITHIC_NETWORK_PAYMENT -> Known.LITHIC_NETWORK_PAYMENT
                else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
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

        private var validated: Boolean = false

        fun validate(): FinancialEventType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialEventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialEvent &&
            token == other.token &&
            amount == other.amount &&
            created == other.created &&
            result == other.result &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(token, amount, created, result, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, additionalProperties=$additionalProperties}"
}
