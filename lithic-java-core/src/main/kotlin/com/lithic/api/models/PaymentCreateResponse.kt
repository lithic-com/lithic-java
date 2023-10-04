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
import com.lithic.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PaymentCreateResponse.Builder::class)
@NoAutoDetect
class PaymentCreateResponse
private constructor(
    private val category: JsonField<FinancialTransaction.Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<FinancialTransaction.FinancialEvent>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<FinancialTransaction.Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<FinancialTransaction.Status>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val methodAttributes: JsonField<Payment.PaymentMethodAttributes>,
    private val externalBankAccountToken: JsonField<String>,
    private val direction: JsonField<Payment.Direction>,
    private val source: JsonField<Payment.Source>,
    private val method: JsonField<Payment.Method>,
    private val userDefinedId: JsonField<String>,
    private val balance: JsonField<Balance>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Status types:
     *
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    fun category(): FinancialTransaction.Category = category.getRequired("category")

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
    fun events(): List<FinancialTransaction.FinancialEvent> = events.getRequired("events")

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
    fun result(): FinancialTransaction.Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents), including any acquirer fees. This may change over time.
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     *
     * - `DECLINED` - The card transaction was declined.
     * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant or pending release from
     * ACH hold period
     * - `SETTLED` - The financial transaction is completed.
     * - `VOIDED` - The merchant has voided the previously pending card authorization.
     */
    fun status(): FinancialTransaction.Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun methodAttributes(): Payment.PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    fun direction(): Payment.Direction = direction.getRequired("direction")

    fun source(): Payment.Source = source.getRequired("source")

    fun method(): Payment.Method = method.getRequired("method")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /** Balance of a Financial Account */
    fun balance(): Optional<Balance> = Optional.ofNullable(balance.getNullable("balance"))

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
            .methodAttributes(methodAttributes)
            .externalBankAccountToken(externalBankAccountToken)
            .direction(direction)
            .source(source)
            .method(method)
            .userDefinedId(userDefinedId)
            .build()

    /**
     * Status types:
     *
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the financial transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * A string that provides a description of the financial transaction; may be useful to display
     * to users.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all financial events that have modified this financial transaction. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents), including any acquirer fees. This may change over time.
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types:
     *
     * - `DECLINED` - The card transaction was declined.
     * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant or pending release from
     * ACH hold period
     * - `SETTLED` - The financial transaction is completed.
     * - `VOIDED` - The merchant has voided the previously pending card authorization.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    /** Balance of a Financial Account */
    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            methodAttributes().validate()
            externalBankAccountToken()
            direction()
            source()
            method()
            userDefinedId()
            balance().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentCreateResponse &&
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
            this.methodAttributes == other.methodAttributes &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.direction == other.direction &&
            this.source == other.source &&
            this.method == other.method &&
            this.userDefinedId == other.userDefinedId &&
            this.balance == other.balance &&
            this.additionalProperties == other.additionalProperties
    }

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
                    methodAttributes,
                    externalBankAccountToken,
                    direction,
                    source,
                    method,
                    userDefinedId,
                    balance,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaymentCreateResponse{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, methodAttributes=$methodAttributes, externalBankAccountToken=$externalBankAccountToken, direction=$direction, source=$source, method=$method, userDefinedId=$userDefinedId, balance=$balance, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<FinancialTransaction.Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<FinancialTransaction.FinancialEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<FinancialTransaction.Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<FinancialTransaction.Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Payment.Direction> = JsonMissing.of()
        private var source: JsonField<Payment.Source> = JsonMissing.of()
        private var method: JsonField<Payment.Method> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            this.category = paymentCreateResponse.category
            this.created = paymentCreateResponse.created
            this.currency = paymentCreateResponse.currency
            this.descriptor = paymentCreateResponse.descriptor
            this.events = paymentCreateResponse.events
            this.pendingAmount = paymentCreateResponse.pendingAmount
            this.result = paymentCreateResponse.result
            this.settledAmount = paymentCreateResponse.settledAmount
            this.status = paymentCreateResponse.status
            this.token = paymentCreateResponse.token
            this.updated = paymentCreateResponse.updated
            this.methodAttributes = paymentCreateResponse.methodAttributes
            this.externalBankAccountToken = paymentCreateResponse.externalBankAccountToken
            this.direction = paymentCreateResponse.direction
            this.source = paymentCreateResponse.source
            this.method = paymentCreateResponse.method
            this.userDefinedId = paymentCreateResponse.userDefinedId
            this.balance = paymentCreateResponse.balance
            additionalProperties(paymentCreateResponse.additionalProperties)
        }

        /**
         * Status types:
         *
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: FinancialTransaction.Category) = category(JsonField.of(category))

        /**
         * Status types:
         *
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<FinancialTransaction.Category>) = apply {
            this.category = category
        }

        /** Date and time when the financial transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the financial transaction first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        @JsonProperty("currency")
        @ExcludeMissing
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
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all financial events that have modified this financial transaction. */
        fun events(events: List<FinancialTransaction.FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this financial transaction. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<FinancialTransaction.FinancialEvent>>) = apply {
            this.events = events
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
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        fun result(result: FinancialTransaction.Result) = result(JsonField.of(result))

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<FinancialTransaction.Result>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents), including any acquirer fees. This may change over time.
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents), including any acquirer fees. This may change over time.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types:
         *
         * - `DECLINED` - The card transaction was declined.
         * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration
         * time.
         * - `PENDING` - Authorization is pending completion from the merchant or pending release
         * from ACH hold period
         * - `SETTLED` - The financial transaction is completed.
         * - `VOIDED` - The merchant has voided the previously pending card authorization.
         */
        fun status(status: FinancialTransaction.Status) = status(JsonField.of(status))

        /**
         * Status types:
         *
         * - `DECLINED` - The card transaction was declined.
         * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration
         * time.
         * - `PENDING` - Authorization is pending completion from the merchant or pending release
         * from ACH hold period
         * - `SETTLED` - The financial transaction is completed.
         * - `VOIDED` - The merchant has voided the previously pending card authorization.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<FinancialTransaction.Status>) = apply { this.status = status }

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

        fun methodAttributes(methodAttributes: Payment.PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun methodAttributes(methodAttributes: JsonField<Payment.PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun direction(direction: Payment.Direction) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Payment.Direction>) = apply {
            this.direction = direction
        }

        fun source(source: Payment.Source) = source(JsonField.of(source))

        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

        fun method(method: Payment.Method) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /** Balance of a Financial Account */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /** Balance of a Financial Account */
        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

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

        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
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
                methodAttributes,
                externalBankAccountToken,
                direction,
                source,
                method,
                userDefinedId,
                balance,
                additionalProperties.toUnmodifiable(),
            )
    }
}
