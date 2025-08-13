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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentCreateResponse
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<Payment.Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val direction: JsonField<Payment.Direction>,
    private val events: JsonField<List<Payment.PaymentEvent>>,
    private val externalBankAccountToken: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val method: JsonField<Payment.Method>,
    private val methodAttributes: JsonField<Payment.PaymentMethodAttributes>,
    private val pendingAmount: JsonField<Long>,
    private val relatedAccountTokens: JsonField<Payment.RelatedAccountTokens>,
    private val result: JsonField<Payment.Result>,
    private val settledAmount: JsonField<Long>,
    private val source: JsonField<Payment.Source>,
    private val status: JsonField<Payment.Status>,
    private val updated: JsonField<OffsetDateTime>,
    private val userDefinedId: JsonField<String>,
    private val expectedReleaseDate: JsonField<LocalDate>,
    private val balance: JsonField<Balance>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<Payment.Category> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Payment.Direction> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<Payment.PaymentEvent>> = JsonMissing.of(),
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        externalBankAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        method: JsonField<Payment.Method> = JsonMissing.of(),
        @JsonProperty("method_attributes")
        @ExcludeMissing
        methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("related_account_tokens")
        @ExcludeMissing
        relatedAccountTokens: JsonField<Payment.RelatedAccountTokens> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<Payment.Result> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<Payment.Source> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<Payment.Status> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_release_date")
        @ExcludeMissing
        expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Balance> = JsonMissing.of(),
    ) : this(
        token,
        category,
        created,
        currency,
        descriptor,
        direction,
        events,
        externalBankAccountToken,
        financialAccountToken,
        method,
        methodAttributes,
        pendingAmount,
        relatedAccountTokens,
        result,
        settledAmount,
        source,
        status,
        updated,
        userDefinedId,
        expectedReleaseDate,
        balance,
        mutableMapOf(),
    )

    fun toPayment(): Payment =
        Payment.builder()
            .token(token)
            .category(category)
            .created(created)
            .currency(currency)
            .descriptor(descriptor)
            .direction(direction)
            .events(events)
            .externalBankAccountToken(externalBankAccountToken)
            .financialAccountToken(financialAccountToken)
            .method(method)
            .methodAttributes(methodAttributes)
            .pendingAmount(pendingAmount)
            .relatedAccountTokens(relatedAccountTokens)
            .result(result)
            .settledAmount(settledAmount)
            .source(source)
            .status(status)
            .updated(updated)
            .userDefinedId(userDefinedId)
            .expectedReleaseDate(expectedReleaseDate)
            .build()

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Payment category
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Payment.Category = category.getRequired("category")

    /**
     * Date and time when the payment first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code for the settling currency of the payment.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A string that provides a description of the payment; may be useful to display to users.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Payment.Direction = direction.getRequired("direction")

    /**
     * A list of all payment events that have modified this payment.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<Payment.PaymentEvent> = events.getRequired("events")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalBankAccountToken(): Optional<String> =
        externalBankAccountToken.getOptional("external_bank_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): Payment.Method = method.getRequired("method")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun methodAttributes(): Payment.PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * Account tokens related to a payment transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relatedAccountTokens(): Payment.RelatedAccountTokens =
        relatedAccountTokens.getRequired("related_account_tokens")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Payment.Result = result.getRequired("result")

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Payment.Source = source.getRequired("source")

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Payment.Status = status.getRequired("status")

    /**
     * Date and time when the financial transaction was last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

    /**
     * Date when the financial transaction expected to be released after settlement
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedReleaseDate(): Optional<LocalDate> =
        expectedReleaseDate.getOptional("expected_release_date")

    /**
     * Balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balance(): Optional<Balance> = balance.getOptional("balance")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<Payment.Category> = category

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
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<Payment.Direction> = direction

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<Payment.PaymentEvent>> = events

    /**
     * Returns the raw JSON value of [externalBankAccountToken].
     *
     * Unlike [externalBankAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Payment.Method> = method

    /**
     * Returns the raw JSON value of [methodAttributes].
     *
     * Unlike [methodAttributes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("method_attributes")
    @ExcludeMissing
    fun _methodAttributes(): JsonField<Payment.PaymentMethodAttributes> = methodAttributes

    /**
     * Returns the raw JSON value of [pendingAmount].
     *
     * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * Returns the raw JSON value of [relatedAccountTokens].
     *
     * Unlike [relatedAccountTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("related_account_tokens")
    @ExcludeMissing
    fun _relatedAccountTokens(): JsonField<Payment.RelatedAccountTokens> = relatedAccountTokens

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Payment.Result> = result

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Payment.Source> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Payment.Status> = status

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

    /**
     * Returns the raw JSON value of [expectedReleaseDate].
     *
     * Unlike [expectedReleaseDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expected_release_date")
    @ExcludeMissing
    fun _expectedReleaseDate(): JsonField<LocalDate> = expectedReleaseDate

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Balance> = balance

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
         * Returns a mutable builder for constructing an instance of [PaymentCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .descriptor()
         * .direction()
         * .events()
         * .externalBankAccountToken()
         * .financialAccountToken()
         * .method()
         * .methodAttributes()
         * .pendingAmount()
         * .relatedAccountTokens()
         * .result()
         * .settledAmount()
         * .source()
         * .status()
         * .updated()
         * .userDefinedId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentCreateResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<Payment.Category>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var descriptor: JsonField<String>? = null
        private var direction: JsonField<Payment.Direction>? = null
        private var events: JsonField<MutableList<Payment.PaymentEvent>>? = null
        private var externalBankAccountToken: JsonField<String>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var method: JsonField<Payment.Method>? = null
        private var methodAttributes: JsonField<Payment.PaymentMethodAttributes>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var relatedAccountTokens: JsonField<Payment.RelatedAccountTokens>? = null
        private var result: JsonField<Payment.Result>? = null
        private var settledAmount: JsonField<Long>? = null
        private var source: JsonField<Payment.Source>? = null
        private var status: JsonField<Payment.Status>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var userDefinedId: JsonField<String>? = null
        private var expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            token = paymentCreateResponse.token
            category = paymentCreateResponse.category
            created = paymentCreateResponse.created
            currency = paymentCreateResponse.currency
            descriptor = paymentCreateResponse.descriptor
            direction = paymentCreateResponse.direction
            events = paymentCreateResponse.events.map { it.toMutableList() }
            externalBankAccountToken = paymentCreateResponse.externalBankAccountToken
            financialAccountToken = paymentCreateResponse.financialAccountToken
            method = paymentCreateResponse.method
            methodAttributes = paymentCreateResponse.methodAttributes
            pendingAmount = paymentCreateResponse.pendingAmount
            relatedAccountTokens = paymentCreateResponse.relatedAccountTokens
            result = paymentCreateResponse.result
            settledAmount = paymentCreateResponse.settledAmount
            source = paymentCreateResponse.source
            status = paymentCreateResponse.status
            updated = paymentCreateResponse.updated
            userDefinedId = paymentCreateResponse.userDefinedId
            expectedReleaseDate = paymentCreateResponse.expectedReleaseDate
            balance = paymentCreateResponse.balance
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
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

        /** Payment category */
        fun category(category: Payment.Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Payment.Category] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<Payment.Category>) = apply { this.category = category }

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        fun direction(direction: Payment.Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Payment.Direction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun direction(direction: JsonField<Payment.Direction>) = apply {
            this.direction = direction
        }

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<Payment.PaymentEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Payment.PaymentEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun events(events: JsonField<List<Payment.PaymentEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [Payment.PaymentEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Payment.PaymentEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun externalBankAccountToken(externalBankAccountToken: String?) =
            externalBankAccountToken(JsonField.ofNullable(externalBankAccountToken))

        /**
         * Alias for calling [Builder.externalBankAccountToken] with
         * `externalBankAccountToken.orElse(null)`.
         */
        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.getOrNull())

        /**
         * Sets [Builder.externalBankAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalBankAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun method(method: Payment.Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Payment.Method] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: Payment.PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        /**
         * Sets [Builder.methodAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.methodAttributes] with a well-typed
         * [Payment.PaymentMethodAttributes] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun methodAttributes(methodAttributes: JsonField<Payment.PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
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

        /** Account tokens related to a payment transaction */
        fun relatedAccountTokens(relatedAccountTokens: Payment.RelatedAccountTokens) =
            relatedAccountTokens(JsonField.of(relatedAccountTokens))

        /**
         * Sets [Builder.relatedAccountTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedAccountTokens] with a well-typed
         * [Payment.RelatedAccountTokens] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun relatedAccountTokens(relatedAccountTokens: JsonField<Payment.RelatedAccountTokens>) =
            apply {
                this.relatedAccountTokens = relatedAccountTokens
            }

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: Payment.Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Payment.Result] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<Payment.Result>) = apply { this.result = result }

        /**
         * Amount of the payment that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Sets [Builder.settledAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        fun source(source: Payment.Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Payment.Source] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

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
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Payment.Status] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<Payment.Status>) = apply { this.status = status }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun userDefinedId(userDefinedId: String?) =
            userDefinedId(JsonField.ofNullable(userDefinedId))

        /** Alias for calling [Builder.userDefinedId] with `userDefinedId.orElse(null)`. */
        fun userDefinedId(userDefinedId: Optional<String>) =
            userDefinedId(userDefinedId.getOrNull())

        /**
         * Sets [Builder.userDefinedId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /** Date when the financial transaction expected to be released after settlement */
        fun expectedReleaseDate(expectedReleaseDate: LocalDate) =
            expectedReleaseDate(JsonField.of(expectedReleaseDate))

        /**
         * Sets [Builder.expectedReleaseDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedReleaseDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedReleaseDate(expectedReleaseDate: JsonField<LocalDate>) = apply {
            this.expectedReleaseDate = expectedReleaseDate
        }

        /** Balance */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Balance] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

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
         * Returns an immutable instance of [PaymentCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .descriptor()
         * .direction()
         * .events()
         * .externalBankAccountToken()
         * .financialAccountToken()
         * .method()
         * .methodAttributes()
         * .pendingAmount()
         * .relatedAccountTokens()
         * .result()
         * .settledAmount()
         * .source()
         * .status()
         * .updated()
         * .userDefinedId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("descriptor", descriptor),
                checkRequired("direction", direction),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("externalBankAccountToken", externalBankAccountToken),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("method", method),
                checkRequired("methodAttributes", methodAttributes),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("relatedAccountTokens", relatedAccountTokens),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("updated", updated),
                checkRequired("userDefinedId", userDefinedId),
                expectedReleaseDate,
                balance,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentCreateResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        category().validate()
        created()
        currency()
        descriptor()
        direction().validate()
        events().forEach { it.validate() }
        externalBankAccountToken()
        financialAccountToken()
        method().validate()
        methodAttributes().validate()
        pendingAmount()
        relatedAccountTokens().validate()
        result().validate()
        settledAmount()
        source().validate()
        status().validate()
        updated()
        userDefinedId()
        expectedReleaseDate()
        balance().ifPresent { it.validate() }
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (externalBankAccountToken.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0) +
            (methodAttributes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pendingAmount.asKnown().isPresent) 1 else 0) +
            (relatedAccountTokens.asKnown().getOrNull()?.validity() ?: 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (userDefinedId.asKnown().isPresent) 1 else 0) +
            (if (expectedReleaseDate.asKnown().isPresent) 1 else 0) +
            (balance.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentCreateResponse &&
            token == other.token &&
            category == other.category &&
            created == other.created &&
            currency == other.currency &&
            descriptor == other.descriptor &&
            direction == other.direction &&
            events == other.events &&
            externalBankAccountToken == other.externalBankAccountToken &&
            financialAccountToken == other.financialAccountToken &&
            method == other.method &&
            methodAttributes == other.methodAttributes &&
            pendingAmount == other.pendingAmount &&
            relatedAccountTokens == other.relatedAccountTokens &&
            result == other.result &&
            settledAmount == other.settledAmount &&
            source == other.source &&
            status == other.status &&
            updated == other.updated &&
            userDefinedId == other.userDefinedId &&
            expectedReleaseDate == other.expectedReleaseDate &&
            balance == other.balance &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            category,
            created,
            currency,
            descriptor,
            direction,
            events,
            externalBankAccountToken,
            financialAccountToken,
            method,
            methodAttributes,
            pendingAmount,
            relatedAccountTokens,
            result,
            settledAmount,
            source,
            status,
            updated,
            userDefinedId,
            expectedReleaseDate,
            balance,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, direction=$direction, events=$events, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, relatedAccountTokens=$relatedAccountTokens, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, userDefinedId=$userDefinedId, expectedReleaseDate=$expectedReleaseDate, balance=$balance, additionalProperties=$additionalProperties}"
}
