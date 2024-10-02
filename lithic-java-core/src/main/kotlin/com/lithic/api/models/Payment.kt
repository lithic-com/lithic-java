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
import java.util.Optional

@JsonDeserialize(builder = Payment.Builder::class)
@NoAutoDetect
class Payment
private constructor(
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<PaymentEvent>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val direction: JsonField<Direction>,
    private val financialAccountToken: JsonField<String>,
    private val externalBankAccountToken: JsonField<String>,
    private val method: JsonField<Method>,
    private val methodAttributes: JsonField<PaymentMethodAttributes>,
    private val source: JsonField<Source>,
    private val userDefinedId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Payment category */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the payment first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    fun currency(): String = currency.getRequired("currency")

    /** A string that provides a description of the payment; may be useful to display to users. */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /** A list of all payment events that have modified this payment. */
    fun events(): List<PaymentEvent> = events.getRequired("events")

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

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun direction(): Direction = direction.getRequired("direction")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    fun method(): Method = method.getRequired("method")

    fun methodAttributes(): PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun source(): Source = source.getRequired("source")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /** Payment category */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the payment first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the payment; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all payment events that have modified this payment. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

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

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Payment = apply {
        if (!validated) {
            category()
            created()
            currency()
            descriptor()
            events().forEach { it.validate() }
            pendingAmount()
            result()
            settledAmount()
            status()
            token()
            updated()
            direction()
            financialAccountToken()
            externalBankAccountToken()
            method()
            methodAttributes().validate()
            source()
            userDefinedId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<PaymentEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            this.category = payment.category
            this.created = payment.created
            this.currency = payment.currency
            this.descriptor = payment.descriptor
            this.events = payment.events
            this.pendingAmount = payment.pendingAmount
            this.result = payment.result
            this.settledAmount = payment.settledAmount
            this.status = payment.status
            this.token = payment.token
            this.updated = payment.updated
            this.direction = payment.direction
            this.financialAccountToken = payment.financialAccountToken
            this.externalBankAccountToken = payment.externalBankAccountToken
            this.method = payment.method
            this.methodAttributes = payment.methodAttributes
            this.source = payment.source
            this.userDefinedId = payment.userDefinedId
            additionalProperties(payment.additionalProperties)
        }

        /** Payment category */
        fun category(category: Category) = category(JsonField.of(category))

        /** Payment category */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the payment first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<PaymentEvent>) = events(JsonField.of(events))

        /** A list of all payment events that have modified this payment. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<PaymentEvent>>) = apply { this.events = events }

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
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
        @JsonProperty("result")
        @ExcludeMissing
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
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

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
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun method(method: Method) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun methodAttributes(methodAttributes: JsonField<PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun source(source: Source) = source(JsonField.of(source))

        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

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

        fun build(): Payment =
            Payment(
                category,
                created,
                currency,
                descriptor,
                events.map { it.toUnmodifiable() },
                pendingAmount,
                result,
                settledAmount,
                status,
                token,
                updated,
                direction,
                financialAccountToken,
                externalBankAccountToken,
                method,
                methodAttributes,
                source,
                userDefinedId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Category(JsonField.of("ACH"))

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
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = Direction(JsonField.of("CREDIT"))

            @JvmField val DEBIT = Direction(JsonField.of("DEBIT"))

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
    }

    @JsonDeserialize(builder = PaymentEvent.Builder::class)
    @NoAutoDetect
    class PaymentEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<PaymentEventType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** More detailed reasons for the event */
        fun detailedResults(): Optional<List<DetailedResult>> =
            Optional.ofNullable(detailedResults.getNullable("detailed_results"))

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Result = result.getRequired("result")

        /** Globally unique identifier. */
        fun token(): String = token.getRequired("token")

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

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** More detailed reasons for the event */
        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PaymentEvent = apply {
            if (!validated) {
                amount()
                created()
                detailedResults()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<PaymentEventType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentEvent: PaymentEvent) = apply {
                this.amount = paymentEvent.amount
                this.created = paymentEvent.created
                this.detailedResults = paymentEvent.detailedResults
                this.result = paymentEvent.result
                this.token = paymentEvent.token
                this.type = paymentEvent.type
                additionalProperties(paymentEvent.additionalProperties)
            }

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /** More detailed reasons for the event */
            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

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
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<PaymentEventType>) = apply { this.type = type }

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

            fun build(): PaymentEvent =
                PaymentEvent(
                    amount,
                    created,
                    detailedResults.map { it.toUnmodifiable() },
                    result,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

                @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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
        }

        class PaymentEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentEventType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACH_ORIGINATION_CANCELLED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_CANCELLED"))

                @JvmField
                val ACH_ORIGINATION_INITIATED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_INITIATED"))

                @JvmField
                val ACH_ORIGINATION_PROCESSED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_PROCESSED"))

                @JvmField
                val ACH_ORIGINATION_SETTLED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_SETTLED"))

                @JvmField
                val ACH_ORIGINATION_RELEASED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_RELEASED"))

                @JvmField
                val ACH_ORIGINATION_REVIEWED =
                    PaymentEventType(JsonField.of("ACH_ORIGINATION_REVIEWED"))

                @JvmField
                val ACH_RECEIPT_PROCESSED = PaymentEventType(JsonField.of("ACH_RECEIPT_PROCESSED"))

                @JvmField
                val ACH_RECEIPT_SETTLED = PaymentEventType(JsonField.of("ACH_RECEIPT_SETTLED"))

                @JvmField
                val ACH_RETURN_INITIATED = PaymentEventType(JsonField.of("ACH_RETURN_INITIATED"))

                @JvmField
                val ACH_RETURN_PROCESSED = PaymentEventType(JsonField.of("ACH_RETURN_PROCESSED"))

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
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DetailedResult && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = DetailedResult(JsonField.of("APPROVED"))

                @JvmField
                val FUNDS_INSUFFICIENT = DetailedResult(JsonField.of("FUNDS_INSUFFICIENT"))

                @JvmField val ACCOUNT_INVALID = DetailedResult(JsonField.of("ACCOUNT_INVALID"))

                @JvmField
                val PROGRAM_TRANSACTION_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED"))

                @JvmField
                val PROGRAM_DAILY_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_DAILY_LIMIT_EXCEEDED"))

                @JvmField
                val PROGRAM_MONTHLY_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_MONTHLY_LIMIT_EXCEEDED"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentEvent &&
                this.amount == other.amount &&
                this.created == other.created &&
                this.detailedResults == other.detailedResults &&
                this.result == other.result &&
                this.token == other.token &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        created,
                        detailedResults,
                        result,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentEvent{amount=$amount, created=$created, detailedResults=$detailedResults, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Method && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH_NEXT_DAY = Method(JsonField.of("ACH_NEXT_DAY"))

            @JvmField val ACH_SAME_DAY = Method(JsonField.of("ACH_SAME_DAY"))

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
    }

    @JsonDeserialize(builder = PaymentMethodAttributes.Builder::class)
    @NoAutoDetect
    class PaymentMethodAttributes
    private constructor(
        private val companyId: JsonField<String>,
        private val receiptRoutingNumber: JsonField<String>,
        private val retries: JsonField<Long>,
        private val returnReasonCode: JsonField<String>,
        private val secCode: JsonField<SecCode>,
        private val traceNumbers: JsonField<List<String?>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.companyId = paymentMethodAttributes.companyId
                this.receiptRoutingNumber = paymentMethodAttributes.receiptRoutingNumber
                this.retries = paymentMethodAttributes.retries
                this.returnReasonCode = paymentMethodAttributes.returnReasonCode
                this.secCode = paymentMethodAttributes.secCode
                this.traceNumbers = paymentMethodAttributes.traceNumbers
                additionalProperties(paymentMethodAttributes.additionalProperties)
            }

            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            @JsonProperty("company_id")
            @ExcludeMissing
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            fun receiptRoutingNumber(receiptRoutingNumber: String) =
                receiptRoutingNumber(JsonField.of(receiptRoutingNumber))

            @JsonProperty("receipt_routing_number")
            @ExcludeMissing
            fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                this.receiptRoutingNumber = receiptRoutingNumber
            }

            fun retries(retries: Long) = retries(JsonField.of(retries))

            @JsonProperty("retries")
            @ExcludeMissing
            fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            @JsonProperty("sec_code")
            @ExcludeMissing
            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

            fun traceNumbers(traceNumbers: List<String?>) = traceNumbers(JsonField.of(traceNumbers))

            @JsonProperty("trace_numbers")
            @ExcludeMissing
            fun traceNumbers(traceNumbers: JsonField<List<String?>>) = apply {
                this.traceNumbers = traceNumbers
            }

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

            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(
                    companyId,
                    receiptRoutingNumber,
                    retries,
                    returnReasonCode,
                    secCode,
                    traceNumbers.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SecCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CCD = SecCode(JsonField.of("CCD"))

                @JvmField val PPD = SecCode(JsonField.of("PPD"))

                @JvmField val WEB = SecCode(JsonField.of("WEB"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethodAttributes &&
                this.companyId == other.companyId &&
                this.receiptRoutingNumber == other.receiptRoutingNumber &&
                this.retries == other.retries &&
                this.returnReasonCode == other.returnReasonCode &&
                this.secCode == other.secCode &&
                this.traceNumbers == other.traceNumbers &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        companyId,
                        receiptRoutingNumber,
                        retries,
                        returnReasonCode,
                        secCode,
                        traceNumbers,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentMethodAttributes{companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, secCode=$secCode, traceNumbers=$traceNumbers, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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
    }

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CUSTOMER = Source(JsonField.of("CUSTOMER"))

            @JvmField val LITHIC = Source(JsonField.of("LITHIC"))

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
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val RETURNED = Status(JsonField.of("RETURNED"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
            this.category == other.category &&
            this.created == other.created &&
            this.currency == other.currency &&
            this.descriptor == other.descriptor &&
            this.events == other.events &&
            this.pendingAmount == other.pendingAmount &&
            this.result == other.result &&
            this.settledAmount == other.settledAmount &&
            this.status == other.status &&
            this.token == other.token &&
            this.updated == other.updated &&
            this.direction == other.direction &&
            this.financialAccountToken == other.financialAccountToken &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.method == other.method &&
            this.methodAttributes == other.methodAttributes &&
            this.source == other.source &&
            this.userDefinedId == other.userDefinedId &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    category,
                    created,
                    currency,
                    descriptor,
                    events,
                    pendingAmount,
                    result,
                    settledAmount,
                    status,
                    token,
                    updated,
                    direction,
                    financialAccountToken,
                    externalBankAccountToken,
                    method,
                    methodAttributes,
                    source,
                    userDefinedId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Payment{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, direction=$direction, financialAccountToken=$financialAccountToken, externalBankAccountToken=$externalBankAccountToken, method=$method, methodAttributes=$methodAttributes, source=$source, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
