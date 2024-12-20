// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PaymentCreateResponse.Builder::class)
@NoAutoDetect
class PaymentCreateResponse
private constructor(
    private val category: JsonField<Payment.Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<Payment.PaymentEvent>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<Payment.Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Payment.Status>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val direction: JsonField<Payment.Direction>,
    private val financialAccountToken: JsonField<String>,
    private val externalBankAccountToken: JsonField<String>,
    private val method: JsonField<Payment.Method>,
    private val methodAttributes: JsonField<Payment.PaymentMethodAttributes>,
    private val source: JsonField<Payment.Source>,
    private val userDefinedId: JsonField<String>,
    private val balance: JsonField<Balance>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Payment category */
    fun category(): Payment.Category = category.getRequired("category")

    /** Date and time when the payment first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    fun currency(): String = currency.getRequired("currency")

    /** A string that provides a description of the payment; may be useful to display to users. */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /** A list of all payment events that have modified this payment. */
    fun events(): List<Payment.PaymentEvent> = events.getRequired("events")

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    fun result(): Payment.Result = result.getRequired("result")

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
    fun status(): Payment.Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun direction(): Payment.Direction = direction.getRequired("direction")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    fun method(): Payment.Method = method.getRequired("method")

    fun methodAttributes(): Payment.PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun source(): Payment.Source = source.getRequired("source")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /** Balance */
    fun balance(): Optional<Balance> = Optional.ofNullable(balance.getNullable("balance"))

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

    /** Balance */
    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toPayment(): Payment =
        Payment.builder()
            .category(category)
            .created(created)
            .currency(currency)
            .descriptor(descriptor)
            .events(events)
            .pendingAmount(pendingAmount)
            .result(result)
            .settledAmount(settledAmount)
            .status(status)
            .token(token)
            .updated(updated)
            .direction(direction)
            .financialAccountToken(financialAccountToken)
            .externalBankAccountToken(externalBankAccountToken)
            .method(method)
            .methodAttributes(methodAttributes)
            .source(source)
            .userDefinedId(userDefinedId)
            .build()

    private var validated: Boolean = false

    fun validate(): PaymentCreateResponse = apply {
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
            balance().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Payment.Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<Payment.PaymentEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Payment.Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Payment.Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var direction: JsonField<Payment.Direction> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Payment.Method> = JsonMissing.of()
        private var methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of()
        private var source: JsonField<Payment.Source> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            category = paymentCreateResponse.category
            created = paymentCreateResponse.created
            currency = paymentCreateResponse.currency
            descriptor = paymentCreateResponse.descriptor
            events = paymentCreateResponse.events
            pendingAmount = paymentCreateResponse.pendingAmount
            result = paymentCreateResponse.result
            settledAmount = paymentCreateResponse.settledAmount
            status = paymentCreateResponse.status
            token = paymentCreateResponse.token
            updated = paymentCreateResponse.updated
            direction = paymentCreateResponse.direction
            financialAccountToken = paymentCreateResponse.financialAccountToken
            externalBankAccountToken = paymentCreateResponse.externalBankAccountToken
            method = paymentCreateResponse.method
            methodAttributes = paymentCreateResponse.methodAttributes
            source = paymentCreateResponse.source
            userDefinedId = paymentCreateResponse.userDefinedId
            balance = paymentCreateResponse.balance
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
        }

        /** Payment category */
        fun category(category: Payment.Category) = category(JsonField.of(category))

        /** Payment category */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Payment.Category>) = apply { this.category = category }

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
        fun events(events: List<Payment.PaymentEvent>) = events(JsonField.of(events))

        /** A list of all payment events that have modified this payment. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<Payment.PaymentEvent>>) = apply { this.events = events }

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
        fun result(result: Payment.Result) = result(JsonField.of(result))

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Payment.Result>) = apply { this.result = result }

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
        fun status(status: Payment.Status) = status(JsonField.of(status))

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
        fun status(status: JsonField<Payment.Status>) = apply { this.status = status }

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

        fun direction(direction: Payment.Direction) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Payment.Direction>) = apply {
            this.direction = direction
        }

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

        fun method(method: Payment.Method) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: Payment.PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun methodAttributes(methodAttributes: JsonField<Payment.PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun source(source: Payment.Source) = source(JsonField.of(source))

        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /** Balance */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /** Balance */
        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

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

        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                category,
                created,
                currency,
                descriptor,
                events.map { it.toImmutable() },
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
                balance,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateResponse && category == other.category && created == other.created && currency == other.currency && descriptor == other.descriptor && events == other.events && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && token == other.token && updated == other.updated && direction == other.direction && financialAccountToken == other.financialAccountToken && externalBankAccountToken == other.externalBankAccountToken && method == other.method && methodAttributes == other.methodAttributes && source == other.source && userDefinedId == other.userDefinedId && balance == other.balance && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(category, created, currency, descriptor, events, pendingAmount, result, settledAmount, status, token, updated, direction, financialAccountToken, externalBankAccountToken, method, methodAttributes, source, userDefinedId, balance, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, direction=$direction, financialAccountToken=$financialAccountToken, externalBankAccountToken=$externalBankAccountToken, method=$method, methodAttributes=$methodAttributes, source=$source, userDefinedId=$userDefinedId, balance=$balance, additionalProperties=$additionalProperties}"
}
