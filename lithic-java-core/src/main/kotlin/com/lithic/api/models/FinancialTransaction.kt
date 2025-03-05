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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class FinancialTransaction
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<Category> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("descriptor")
    @ExcludeMissing
    private val descriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<FinancialEvent>> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<Result> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * Status types:
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `INTERNAL` - Transaction for internal adjustment.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the financial transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A string that provides a description of the financial transaction; may be useful to display
     * to users.
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /** A list of all financial events that have modified this financial transaction. */
    fun events(): List<FinancialEvent> = events.getRequired("events")

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents), including any acquirer fees. This may change over time.
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - The authorization as it has passed its expiration time. Card transaction only.
     * - `PENDING` - The transaction is expected to settle.
     * - `RETURNED` - The transaction has been returned.
     * - `SETTLED` - The transaction is completed.
     * - `VOIDED` - The transaction was voided. Card transaction only.
     */
    fun status(): Status = status.getRequired("status")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Status types:
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `INTERNAL` - Transaction for internal adjustment.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /** Date and time when the financial transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * A string that provides a description of the financial transaction; may be useful to display
     * to users.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /** A list of all financial events that have modified this financial transaction. */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<FinancialEvent>> = events

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents), including any acquirer fees. This may change over time.
     */
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Status types:
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - The authorization as it has passed its expiration time. Card transaction only.
     * - `PENDING` - The transaction is expected to settle.
     * - `RETURNED` - The transaction has been returned.
     * - `SETTLED` - The transaction is completed.
     * - `VOIDED` - The transaction was voided. Card transaction only.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialTransaction = apply {
        if (validated) {
            return@apply
        }

        token()
        category()
        created()
        currency()
        descriptor()
        events().forEach { it.validate() }
        pendingAmount()
        result()
        settledAmount()
        status()
        updated()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialTransaction]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<Category>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var descriptor: JsonField<String>? = null
        private var events: JsonField<MutableList<FinancialEvent>>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var result: JsonField<Result>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialTransaction: FinancialTransaction) = apply {
            token = financialTransaction.token
            category = financialTransaction.category
            created = financialTransaction.created
            currency = financialTransaction.currency
            descriptor = financialTransaction.descriptor
            events = financialTransaction.events.map { it.toMutableList() }
            pendingAmount = financialTransaction.pendingAmount
            result = financialTransaction.result
            settledAmount = financialTransaction.settledAmount
            status = financialTransaction.status
            updated = financialTransaction.updated
            additionalProperties = financialTransaction.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Status types:
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `INTERNAL` - Transaction for internal adjustment.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Status types:
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `INTERNAL` - Transaction for internal adjustment.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the financial transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the financial transaction first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the financial transaction; may be useful to
         * display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the financial transaction; may be useful to
         * display to users.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all financial events that have modified this financial transaction. */
        fun events(events: List<FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this financial transaction. */
        fun events(events: JsonField<List<FinancialEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /** A list of all financial events that have modified this financial transaction. */
        fun addEvent(event: FinancialEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents), including any acquirer fees. This may change over time.
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents), including any acquirer fees. This may change over time.
         */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types:
         * - `DECLINED` - The transaction was declined.
         * - `EXPIRED` - The authorization as it has passed its expiration time. Card transaction
         *   only.
         * - `PENDING` - The transaction is expected to settle.
         * - `RETURNED` - The transaction has been returned.
         * - `SETTLED` - The transaction is completed.
         * - `VOIDED` - The transaction was voided. Card transaction only.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The transaction was declined.
         * - `EXPIRED` - The authorization as it has passed its expiration time. Card transaction
         *   only.
         * - `PENDING` - The transaction is expected to settle.
         * - `RETURNED` - The transaction has been returned.
         * - `SETTLED` - The transaction is completed.
         * - `VOIDED` - The transaction was voided. Card transaction only.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
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

        fun build(): FinancialTransaction =
            FinancialTransaction(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("descriptor", descriptor),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("updated", updated),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Status types:
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `INTERNAL` - Transaction for internal adjustment.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACH = of("ACH")

            @JvmField val CARD = of("CARD")

            @JvmField val INTERNAL = of("INTERNAL")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            ACH,
            CARD,
            INTERNAL,
            TRANSFER,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            CARD,
            INTERNAL,
            TRANSFER,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                ACH -> Value.ACH
                CARD -> Value.CARD
                INTERNAL -> Value.INTERNAL
                TRANSFER -> Value.TRANSFER
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
                ACH -> Known.ACH
                CARD -> Known.CARD
                INTERNAL -> Known.INTERNAL
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class FinancialEvent
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<FinancialEventType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Globally unique identifier. */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        fun type(): Optional<FinancialEventType> = Optional.ofNullable(type.getNullable("type"))

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FinancialEventType> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FinancialEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            created()
            result()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Globally unique identifier. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            fun type(type: FinancialEventType) = type(JsonField.of(type))

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

            fun build(): FinancialEvent =
                FinancialEvent(
                    token,
                    amount,
                    created,
                    result,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                @JvmField val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

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

                @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

                @JvmField val RETURN = of("RETURN")

                @JvmField val RETURN_REVERSAL = of("RETURN_REVERSAL")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val TRANSFER_INSUFFICIENT_FUNDS = of("TRANSFER_INSUFFICIENT_FUNDS")

                @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

                @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

                @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
            }

            /** An enum containing [FinancialEventType]'s known values. */
            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
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
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
            }

            /**
             * An enum containing [FinancialEventType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [FinancialEventType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
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
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
                /**
                 * An enum member indicating that [FinancialEventType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
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
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    TRANSFER -> Value.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                    RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
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
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    TRANSFER -> Known.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                    RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                    else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FinancialEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialEvent && token == other.token && amount == other.amount && created == other.created && result == other.result && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, created, result, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status types:
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - The authorization as it has passed its expiration time. Card transaction only.
     * - `PENDING` - The transaction is expected to settle.
     * - `RETURNED` - The transaction has been returned.
     * - `SETTLED` - The transaction is completed.
     * - `VOIDED` - The transaction was voided. Card transaction only.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val RETURNED = of("RETURNED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val VOIDED = of("VOIDED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            RETURNED,
            SETTLED,
            VOIDED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            RETURNED,
            SETTLED,
            VOIDED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
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
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransaction && token == other.token && category == other.category && created == other.created && currency == other.currency && descriptor == other.descriptor && events == other.events && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, category, created, currency, descriptor, events, pendingAmount, result, settledAmount, status, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialTransaction{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, updated=$updated, additionalProperties=$additionalProperties}"
}
