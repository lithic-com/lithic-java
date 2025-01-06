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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Payment
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
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<PaymentEvent>> = JsonMissing.of(),
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("method")
    @ExcludeMissing
    private val method: JsonField<Method> = JsonMissing.of(),
    @JsonProperty("method_attributes")
    @ExcludeMissing
    private val methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<Result> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Source> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Payment category */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the payment first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    fun currency(): String = currency.getRequired("currency")

    /** A string that provides a description of the payment; may be useful to display to users. */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    fun direction(): Direction = direction.getRequired("direction")

    /** A list of all payment events that have modified this payment. */
    fun events(): List<PaymentEvent> = events.getRequired("events")

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun method(): Method = method.getRequired("method")

    fun methodAttributes(): PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    fun source(): Source = source.getRequired("source")

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    fun status(): Status = status.getRequired("status")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Payment category */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the payment first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the payment; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** A list of all payment events that have modified this payment. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (!validated) {
            token()
            category()
            created()
            currency()
            descriptor()
            direction()
            events().forEach { it.validate() }
            externalBankAccountToken()
            financialAccountToken()
            method()
            methodAttributes().validate()
            pendingAmount()
            result()
            settledAmount()
            source()
            status()
            updated()
            userDefinedId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var events: JsonField<List<PaymentEvent>> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            token = payment.token
            category = payment.category
            created = payment.created
            currency = payment.currency
            descriptor = payment.descriptor
            direction = payment.direction
            events = payment.events
            externalBankAccountToken = payment.externalBankAccountToken
            financialAccountToken = payment.financialAccountToken
            method = payment.method
            methodAttributes = payment.methodAttributes
            pendingAmount = payment.pendingAmount
            result = payment.result
            settledAmount = payment.settledAmount
            source = payment.source
            status = payment.status
            updated = payment.updated
            userDefinedId = payment.userDefinedId
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Payment category */
        fun category(category: Category) = category(JsonField.of(category))

        /** Payment category */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<PaymentEvent>) = events(JsonField.of(events))

        /** A list of all payment events that have modified this payment. */
        fun events(events: JsonField<List<PaymentEvent>>) = apply { this.events = events }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun method(method: Method) = method(JsonField.of(method))

        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        fun methodAttributes(methodAttributes: JsonField<PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * Amount of the payment that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the payment that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        fun source(source: Source) = source(JsonField.of(source))

        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
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

        fun build(): Payment =
            Payment(
                token,
                category,
                created,
                currency,
                descriptor,
                direction,
                events.map { it.toImmutable() },
                externalBankAccountToken,
                financialAccountToken,
                method,
                methodAttributes,
                pendingAmount,
                result,
                settledAmount,
                source,
                status,
                updated,
                userDefinedId,
                additionalProperties.toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH = of("ACH")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw LithicInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentEvent
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
        private val type: JsonField<PaymentEventType> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        private val detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Globally unique identifier. */
        fun token(): String = token.getRequired("token")

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         */
        fun type(): PaymentEventType = type.getRequired("type")

        /** More detailed reasons for the event */
        fun detailedResults(): Optional<List<DetailedResult>> =
            Optional.ofNullable(detailedResults.getNullable("detailed_results"))

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** More detailed reasons for the event */
        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentEvent = apply {
            if (!validated) {
                token()
                amount()
                created()
                result()
                type()
                detailedResults()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var type: JsonField<PaymentEventType> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentEvent: PaymentEvent) = apply {
                token = paymentEvent.token
                amount = paymentEvent.amount
                created = paymentEvent.created
                result = paymentEvent.result
                type = paymentEvent.type
                detailedResults = paymentEvent.detailedResults
                additionalProperties = paymentEvent.additionalProperties.toMutableMap()
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

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             */
            fun type(type: PaymentEventType) = type(JsonField.of(type))

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             */
            fun type(type: JsonField<PaymentEventType>) = apply { this.type = type }

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
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

            fun build(): PaymentEvent =
                PaymentEvent(
                    token,
                    amount,
                    created,
                    result,
                    type,
                    detailedResults.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                DECLINED,
            }

            enum class Value {
                APPROVED,
                DECLINED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                @JvmField val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                @JvmStatic fun of(value: String) = PaymentEventType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
            }

            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    else -> throw LithicInvalidDataException("Unknown PaymentEventType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                @JvmField val ACCOUNT_INVALID = of("ACCOUNT_INVALID")

                @JvmField
                val PROGRAM_TRANSACTION_LIMIT_EXCEEDED = of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")

                @JvmField val PROGRAM_DAILY_LIMIT_EXCEEDED = of("PROGRAM_DAILY_LIMIT_EXCEEDED")

                @JvmField val PROGRAM_MONTHLY_LIMIT_EXCEEDED = of("PROGRAM_MONTHLY_LIMIT_EXCEEDED")

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            }

            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentEvent && token == other.token && amount == other.amount && created == other.created && result == other.result && type == other.type && detailedResults == other.detailedResults && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, created, result, type, detailedResults, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, detailedResults=$detailedResults, additionalProperties=$additionalProperties}"
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

            @JvmField val ACH_SAME_DAY = of("ACH_SAME_DAY")

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
        }

        enum class Value {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                ACH_SAME_DAY -> Value.ACH_SAME_DAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_NEXT_DAY -> Known.ACH_NEXT_DAY
                ACH_SAME_DAY -> Known.ACH_SAME_DAY
                else -> throw LithicInvalidDataException("Unknown Method: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentMethodAttributes
    @JsonCreator
    private constructor(
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receipt_routing_number")
        @ExcludeMissing
        private val receiptRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retries")
        @ExcludeMissing
        private val retries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        private val returnReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sec_code")
        @ExcludeMissing
        private val secCode: JsonField<SecCode> = JsonMissing.of(),
        @JsonProperty("trace_numbers")
        @ExcludeMissing
        private val traceNumbers: JsonField<List<String?>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

        fun receiptRoutingNumber(): Optional<String> =
            Optional.ofNullable(receiptRoutingNumber.getNullable("receipt_routing_number"))

        fun retries(): Optional<Long> = Optional.ofNullable(retries.getNullable("retries"))

        fun returnReasonCode(): Optional<String> =
            Optional.ofNullable(returnReasonCode.getNullable("return_reason_code"))

        fun secCode(): SecCode = secCode.getRequired("sec_code")

        fun traceNumbers(): List<String?> = traceNumbers.getRequired("trace_numbers")

        @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

        @JsonProperty("receipt_routing_number")
        @ExcludeMissing
        fun _receiptRoutingNumber() = receiptRoutingNumber

        @JsonProperty("retries") @ExcludeMissing fun _retries() = retries

        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        @JsonProperty("sec_code") @ExcludeMissing fun _secCode() = secCode

        @JsonProperty("trace_numbers") @ExcludeMissing fun _traceNumbers() = traceNumbers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentMethodAttributes = apply {
            if (!validated) {
                companyId()
                receiptRoutingNumber()
                retries()
                returnReasonCode()
                secCode()
                traceNumbers()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var companyId: JsonField<String> = JsonMissing.of()
            private var receiptRoutingNumber: JsonField<String> = JsonMissing.of()
            private var retries: JsonField<Long> = JsonMissing.of()
            private var returnReasonCode: JsonField<String> = JsonMissing.of()
            private var secCode: JsonField<SecCode> = JsonMissing.of()
            private var traceNumbers: JsonField<List<String?>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentMethodAttributes: PaymentMethodAttributes) = apply {
                companyId = paymentMethodAttributes.companyId
                receiptRoutingNumber = paymentMethodAttributes.receiptRoutingNumber
                retries = paymentMethodAttributes.retries
                returnReasonCode = paymentMethodAttributes.returnReasonCode
                secCode = paymentMethodAttributes.secCode
                traceNumbers = paymentMethodAttributes.traceNumbers
                additionalProperties = paymentMethodAttributes.additionalProperties.toMutableMap()
            }

            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            fun receiptRoutingNumber(receiptRoutingNumber: String) =
                receiptRoutingNumber(JsonField.of(receiptRoutingNumber))

            fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                this.receiptRoutingNumber = receiptRoutingNumber
            }

            fun retries(retries: Long) = retries(JsonField.of(retries))

            fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

            fun traceNumbers(traceNumbers: List<String?>) = traceNumbers(JsonField.of(traceNumbers))

            fun traceNumbers(traceNumbers: JsonField<List<String?>>) = apply {
                this.traceNumbers = traceNumbers
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

            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(
                    companyId,
                    receiptRoutingNumber,
                    retries,
                    returnReasonCode,
                    secCode,
                    traceNumbers.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CCD = of("CCD")

                @JvmField val PPD = of("PPD")

                @JvmField val WEB = of("WEB")

                @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
            }

            enum class Known {
                CCD,
                PPD,
                WEB,
            }

            enum class Value {
                CCD,
                PPD,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CCD -> Value.CCD
                    PPD -> Value.PPD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CCD -> Known.CCD
                    PPD -> Known.PPD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SecCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethodAttributes && companyId == other.companyId && receiptRoutingNumber == other.receiptRoutingNumber && retries == other.retries && returnReasonCode == other.returnReasonCode && secCode == other.secCode && traceNumbers == other.traceNumbers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(companyId, receiptRoutingNumber, retries, returnReasonCode, secCode, traceNumbers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentMethodAttributes{companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, secCode=$secCode, traceNumbers=$traceNumbers, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CUSTOMER = of("CUSTOMER")

            @JvmField val LITHIC = of("LITHIC")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        enum class Known {
            CUSTOMER,
            LITHIC,
        }

        enum class Value {
            CUSTOMER,
            LITHIC,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                LITHIC -> Value.LITHIC
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                LITHIC -> Known.LITHIC
                else -> throw LithicInvalidDataException("Unknown Source: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val RETURNED = of("RETURNED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            PENDING,
            RETURNED,
            SETTLED,
        }

        enum class Value {
            DECLINED,
            PENDING,
            RETURNED,
            SETTLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                SETTLED -> Value.SETTLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                SETTLED -> Known.SETTLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is Payment && token == other.token && category == other.category && created == other.created && currency == other.currency && descriptor == other.descriptor && direction == other.direction && events == other.events && externalBankAccountToken == other.externalBankAccountToken && financialAccountToken == other.financialAccountToken && method == other.method && methodAttributes == other.methodAttributes && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && source == other.source && status == other.status && updated == other.updated && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, category, created, currency, descriptor, direction, events, externalBankAccountToken, financialAccountToken, method, methodAttributes, pendingAmount, result, settledAmount, source, status, updated, userDefinedId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, direction=$direction, events=$events, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
