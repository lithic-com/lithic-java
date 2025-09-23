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

class Payment
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val events: JsonField<List<PaymentEvent>>,
    private val externalBankAccountToken: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val method: JsonField<Method>,
    private val methodAttributes: JsonField<PaymentMethodAttributes>,
    private val pendingAmount: JsonField<Long>,
    private val relatedAccountTokens: JsonField<RelatedAccountTokens>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val source: JsonField<Source>,
    private val status: JsonField<Status>,
    private val updated: JsonField<OffsetDateTime>,
    private val userDefinedId: JsonField<String>,
    private val expectedReleaseDate: JsonField<LocalDate>,
    private val type: JsonField<TransferType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<PaymentEvent>> = JsonMissing.of(),
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        externalBankAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("method_attributes")
        @ExcludeMissing
        methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("related_account_tokens")
        @ExcludeMissing
        relatedAccountTokens: JsonField<RelatedAccountTokens> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_release_date")
        @ExcludeMissing
        expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<TransferType> = JsonMissing.of(),
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
        type,
        mutableMapOf(),
    )

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
    fun category(): Category = category.getRequired("category")

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
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * A list of all payment events that have modified this payment.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<PaymentEvent> = events.getRequired("events")

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
    fun method(): Method = method.getRequired("method")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun methodAttributes(): PaymentMethodAttributes =
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
    fun relatedAccountTokens(): RelatedAccountTokens =
        relatedAccountTokens.getRequired("related_account_tokens")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Result = result.getRequired("result")

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
    fun source(): Source = source.getRequired("source")

    /**
     * Status types:
     * * `DECLINED` - The payment was declined.
     * * `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * * `RETURNED` - The payment has been returned.
     * * `SETTLED` - The payment is completed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

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
     * Payment type indicating the specific ACH message or Fedwire transfer type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<TransferType> = type.getOptional("type")

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
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

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
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<PaymentEvent>> = events

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
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

    /**
     * Returns the raw JSON value of [methodAttributes].
     *
     * Unlike [methodAttributes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("method_attributes")
    @ExcludeMissing
    fun _methodAttributes(): JsonField<PaymentMethodAttributes> = methodAttributes

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
    fun _relatedAccountTokens(): JsonField<RelatedAccountTokens> = relatedAccountTokens

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<TransferType> = type

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
         * Returns a mutable builder for constructing an instance of [Payment].
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

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<Category>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var descriptor: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var events: JsonField<MutableList<PaymentEvent>>? = null
        private var externalBankAccountToken: JsonField<String>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var method: JsonField<Method>? = null
        private var methodAttributes: JsonField<PaymentMethodAttributes>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var relatedAccountTokens: JsonField<RelatedAccountTokens>? = null
        private var result: JsonField<Result>? = null
        private var settledAmount: JsonField<Long>? = null
        private var source: JsonField<Source>? = null
        private var status: JsonField<Status>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var userDefinedId: JsonField<String>? = null
        private var expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of()
        private var type: JsonField<TransferType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            token = payment.token
            category = payment.category
            created = payment.created
            currency = payment.currency
            descriptor = payment.descriptor
            direction = payment.direction
            events = payment.events.map { it.toMutableList() }
            externalBankAccountToken = payment.externalBankAccountToken
            financialAccountToken = payment.financialAccountToken
            method = payment.method
            methodAttributes = payment.methodAttributes
            pendingAmount = payment.pendingAmount
            relatedAccountTokens = payment.relatedAccountTokens
            result = payment.result
            settledAmount = payment.settledAmount
            source = payment.source
            status = payment.status
            updated = payment.updated
            userDefinedId = payment.userDefinedId
            expectedReleaseDate = payment.expectedReleaseDate
            type = payment.type
            additionalProperties = payment.additionalProperties.toMutableMap()
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
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

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

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<PaymentEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<PaymentEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<PaymentEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: PaymentEvent) = apply {
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

        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        /**
         * Sets [Builder.methodAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.methodAttributes] with a well-typed
         * [PaymentMethodAttributes] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun methodAttributes(methodAttributes: JsonField<PaymentMethodAttributes>) = apply {
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
        fun relatedAccountTokens(relatedAccountTokens: RelatedAccountTokens) =
            relatedAccountTokens(JsonField.of(relatedAccountTokens))

        /**
         * Sets [Builder.relatedAccountTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedAccountTokens] with a well-typed
         * [RelatedAccountTokens] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun relatedAccountTokens(relatedAccountTokens: JsonField<RelatedAccountTokens>) = apply {
            this.relatedAccountTokens = relatedAccountTokens
        }

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

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

        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * Status types:
         * * `DECLINED` - The payment was declined.
         * * `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * * `RETURNED` - The payment has been returned.
         * * `SETTLED` - The payment is completed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /** Payment type indicating the specific ACH message or Fedwire transfer type */
        fun type(type: TransferType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [TransferType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<TransferType>) = apply { this.type = type }

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
         * Returns an immutable instance of [Payment].
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
        fun build(): Payment =
            Payment(
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
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Payment = apply {
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
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Payment category */
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

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            ACH
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

        private var validated: Boolean = false

        fun validate(): Category = apply {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw LithicInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Payment Event */
    class PaymentEvent
    private constructor(
        private val token: JsonField<String>,
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val type: JsonField<Type>,
        private val detailedResults: JsonField<List<DetailedResult>>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("detailed_results")
            @ExcludeMissing
            detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
        ) : this(token, amount, created, result, type, detailedResults, mutableMapOf())

        /**
         * Globally unique identifier.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Date and time when the financial event occurred. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Event types:
         * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
         *   Federal Reserve.
         * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository Financial
         *   Institution.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * More detailed reasons for the event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detailedResults(): Optional<List<DetailedResult>> =
            detailedResults.getOptional("detailed_results")

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [detailedResults].
         *
         * Unlike [detailedResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<List<DetailedResult>> = detailedResults

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
             * Returns a mutable builder for constructing an instance of [PaymentEvent].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .created()
             * .result()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var result: JsonField<Result>? = null
            private var type: JsonField<Type>? = null
            private var detailedResults: JsonField<MutableList<DetailedResult>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentEvent: PaymentEvent) = apply {
                token = paymentEvent.token
                amount = paymentEvent.amount
                created = paymentEvent.created
                result = paymentEvent.result
                type = paymentEvent.type
                detailedResults = paymentEvent.detailedResults.map { it.toMutableList() }
                additionalProperties = paymentEvent.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /**
             * Event types:
             * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   Federal Reserve.
             * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository
             *   Financial Institution.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /**
             * Sets [Builder.detailedResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailedResults] with a well-typed
             * `List<DetailedResult>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults.map { it.toMutableList() }
            }

            /**
             * Adds a single [DetailedResult] to [detailedResults].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDetailedResult(detailedResult: DetailedResult) = apply {
                detailedResults =
                    (detailedResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("detailedResults", it).add(detailedResult)
                    }
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

            /**
             * Returns an immutable instance of [PaymentEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .created()
             * .result()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentEvent =
                PaymentEvent(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("created", created),
                    checkRequired("result", result),
                    checkRequired("type", type),
                    (detailedResults ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            created()
            result().validate()
            type().validate()
            detailedResults().ifPresent { it.forEach { it.validate() } }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (detailedResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        /**
         * Event types:
         * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
         *   Federal Reserve.
         * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository Financial
         *   Institution.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
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
                ACH_RETURN_SETTLED,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                ACH_RETURN_SETTLED,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
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
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DetailedResult
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

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                @JvmField val ACCOUNT_INVALID = of("ACCOUNT_INVALID")

                @JvmField
                val PROGRAM_TRANSACTION_LIMIT_EXCEEDED = of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")

                @JvmField val PROGRAM_DAILY_LIMIT_EXCEEDED = of("PROGRAM_DAILY_LIMIT_EXCEEDED")

                @JvmField val PROGRAM_MONTHLY_LIMIT_EXCEEDED = of("PROGRAM_MONTHLY_LIMIT_EXCEEDED")

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            /** An enum containing [DetailedResult]'s known values. */
            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            }

            /**
             * An enum containing [DetailedResult]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DetailedResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
                /**
                 * An enum member indicating that [DetailedResult] was instantiated with an unknown
                 * value.
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
                    FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
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
                    FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
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

            private var validated: Boolean = false

            fun validate(): DetailedResult = apply {
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

                return other is DetailedResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentEvent &&
                token == other.token &&
                amount == other.amount &&
                created == other.created &&
                result == other.result &&
                type == other.type &&
                detailedResults == other.detailedResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                amount,
                created,
                result,
                type,
                detailedResults,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, detailedResults=$detailedResults, additionalProperties=$additionalProperties}"
    }

    class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

            @JvmField val ACH_SAME_DAY = of("ACH_SAME_DAY")

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
        }

        /**
         * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Method] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            /** An enum member indicating that [Method] was instantiated with an unknown value. */
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
                ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                ACH_SAME_DAY -> Value.ACH_SAME_DAY
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
                ACH_NEXT_DAY -> Known.ACH_NEXT_DAY
                ACH_SAME_DAY -> Known.ACH_SAME_DAY
                else -> throw LithicInvalidDataException("Unknown Method: $value")
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

        fun validate(): Method = apply {
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

            return other is Method && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PaymentMethodAttributes
    private constructor(
        private val companyId: JsonField<String>,
        private val receiptRoutingNumber: JsonField<String>,
        private val retries: JsonField<Long>,
        private val returnReasonCode: JsonField<String>,
        private val secCode: JsonField<SecCode>,
        private val traceNumbers: JsonField<List<String?>>,
        private val addenda: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("company_id")
            @ExcludeMissing
            companyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receipt_routing_number")
            @ExcludeMissing
            receiptRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retries") @ExcludeMissing retries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            returnReasonCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sec_code")
            @ExcludeMissing
            secCode: JsonField<SecCode> = JsonMissing.of(),
            @JsonProperty("trace_numbers")
            @ExcludeMissing
            traceNumbers: JsonField<List<String?>> = JsonMissing.of(),
            @JsonProperty("addenda") @ExcludeMissing addenda: JsonField<String> = JsonMissing.of(),
        ) : this(
            companyId,
            receiptRoutingNumber,
            retries,
            returnReasonCode,
            secCode,
            traceNumbers,
            addenda,
            mutableMapOf(),
        )

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun companyId(): Optional<String> = companyId.getOptional("company_id")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun receiptRoutingNumber(): Optional<String> =
            receiptRoutingNumber.getOptional("receipt_routing_number")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retries(): Optional<Long> = retries.getOptional("retries")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun returnReasonCode(): Optional<String> =
            returnReasonCode.getOptional("return_reason_code")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun secCode(): SecCode = secCode.getRequired("sec_code")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun traceNumbers(): List<String?> = traceNumbers.getRequired("trace_numbers")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addenda(): Optional<String> = addenda.getOptional("addenda")

        /**
         * Returns the raw JSON value of [companyId].
         *
         * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /**
         * Returns the raw JSON value of [receiptRoutingNumber].
         *
         * Unlike [receiptRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receipt_routing_number")
        @ExcludeMissing
        fun _receiptRoutingNumber(): JsonField<String> = receiptRoutingNumber

        /**
         * Returns the raw JSON value of [retries].
         *
         * Unlike [retries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retries") @ExcludeMissing fun _retries(): JsonField<Long> = retries

        /**
         * Returns the raw JSON value of [returnReasonCode].
         *
         * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<String> = returnReasonCode

        /**
         * Returns the raw JSON value of [secCode].
         *
         * Unlike [secCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sec_code") @ExcludeMissing fun _secCode(): JsonField<SecCode> = secCode

        /**
         * Returns the raw JSON value of [traceNumbers].
         *
         * Unlike [traceNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trace_numbers")
        @ExcludeMissing
        fun _traceNumbers(): JsonField<List<String?>> = traceNumbers

        /**
         * Returns the raw JSON value of [addenda].
         *
         * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<String> = addenda

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
             * Returns a mutable builder for constructing an instance of [PaymentMethodAttributes].
             *
             * The following fields are required:
             * ```java
             * .companyId()
             * .receiptRoutingNumber()
             * .retries()
             * .returnReasonCode()
             * .secCode()
             * .traceNumbers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentMethodAttributes]. */
        class Builder internal constructor() {

            private var companyId: JsonField<String>? = null
            private var receiptRoutingNumber: JsonField<String>? = null
            private var retries: JsonField<Long>? = null
            private var returnReasonCode: JsonField<String>? = null
            private var secCode: JsonField<SecCode>? = null
            private var traceNumbers: JsonField<MutableList<String?>>? = null
            private var addenda: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentMethodAttributes: PaymentMethodAttributes) = apply {
                companyId = paymentMethodAttributes.companyId
                receiptRoutingNumber = paymentMethodAttributes.receiptRoutingNumber
                retries = paymentMethodAttributes.retries
                returnReasonCode = paymentMethodAttributes.returnReasonCode
                secCode = paymentMethodAttributes.secCode
                traceNumbers = paymentMethodAttributes.traceNumbers.map { it.toMutableList() }
                addenda = paymentMethodAttributes.addenda
                additionalProperties = paymentMethodAttributes.additionalProperties.toMutableMap()
            }

            fun companyId(companyId: String?) = companyId(JsonField.ofNullable(companyId))

            /** Alias for calling [Builder.companyId] with `companyId.orElse(null)`. */
            fun companyId(companyId: Optional<String>) = companyId(companyId.getOrNull())

            /**
             * Sets [Builder.companyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            fun receiptRoutingNumber(receiptRoutingNumber: String?) =
                receiptRoutingNumber(JsonField.ofNullable(receiptRoutingNumber))

            /**
             * Alias for calling [Builder.receiptRoutingNumber] with
             * `receiptRoutingNumber.orElse(null)`.
             */
            fun receiptRoutingNumber(receiptRoutingNumber: Optional<String>) =
                receiptRoutingNumber(receiptRoutingNumber.getOrNull())

            /**
             * Sets [Builder.receiptRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiptRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                this.receiptRoutingNumber = receiptRoutingNumber
            }

            fun retries(retries: Long?) = retries(JsonField.ofNullable(retries))

            /**
             * Alias for [Builder.retries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun retries(retries: Long) = retries(retries as Long?)

            /** Alias for calling [Builder.retries] with `retries.orElse(null)`. */
            fun retries(retries: Optional<Long>) = retries(retries.getOrNull())

            /**
             * Sets [Builder.retries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

            fun returnReasonCode(returnReasonCode: String?) =
                returnReasonCode(JsonField.ofNullable(returnReasonCode))

            /**
             * Alias for calling [Builder.returnReasonCode] with `returnReasonCode.orElse(null)`.
             */
            fun returnReasonCode(returnReasonCode: Optional<String>) =
                returnReasonCode(returnReasonCode.getOrNull())

            /**
             * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            /**
             * Sets [Builder.secCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secCode] with a well-typed [SecCode] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

            fun traceNumbers(traceNumbers: List<String?>) = traceNumbers(JsonField.of(traceNumbers))

            /**
             * Sets [Builder.traceNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceNumbers] with a well-typed `List<String?>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun traceNumbers(traceNumbers: JsonField<List<String?>>) = apply {
                this.traceNumbers = traceNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [traceNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTraceNumber(traceNumber: String) = apply {
                traceNumbers =
                    (traceNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("traceNumbers", it).add(traceNumber)
                    }
            }

            fun addenda(addenda: String?) = addenda(JsonField.ofNullable(addenda))

            /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
            fun addenda(addenda: Optional<String>) = addenda(addenda.getOrNull())

            /**
             * Sets [Builder.addenda] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addenda] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addenda(addenda: JsonField<String>) = apply { this.addenda = addenda }

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
             * Returns an immutable instance of [PaymentMethodAttributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .companyId()
             * .receiptRoutingNumber()
             * .retries()
             * .returnReasonCode()
             * .secCode()
             * .traceNumbers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(
                    checkRequired("companyId", companyId),
                    checkRequired("receiptRoutingNumber", receiptRoutingNumber),
                    checkRequired("retries", retries),
                    checkRequired("returnReasonCode", returnReasonCode),
                    checkRequired("secCode", secCode),
                    checkRequired("traceNumbers", traceNumbers).map { it.toImmutable() },
                    addenda,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentMethodAttributes = apply {
            if (validated) {
                return@apply
            }

            companyId()
            receiptRoutingNumber()
            retries()
            returnReasonCode()
            secCode().validate()
            traceNumbers()
            addenda()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (companyId.asKnown().isPresent) 1 else 0) +
                (if (receiptRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (retries.asKnown().isPresent) 1 else 0) +
                (if (returnReasonCode.asKnown().isPresent) 1 else 0) +
                (secCode.asKnown().getOrNull()?.validity() ?: 0) +
                (traceNumbers.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() }
                    ?: 0) +
                (if (addenda.asKnown().isPresent) 1 else 0)

        class SecCode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val CCD = of("CCD")

                @JvmField val PPD = of("PPD")

                @JvmField val WEB = of("WEB")

                @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
            }

            /** An enum containing [SecCode]'s known values. */
            enum class Known {
                CCD,
                PPD,
                WEB,
            }

            /**
             * An enum containing [SecCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SecCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CCD,
                PPD,
                WEB,
                /**
                 * An enum member indicating that [SecCode] was instantiated with an unknown value.
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
                    CCD -> Value.CCD
                    PPD -> Value.PPD
                    WEB -> Value.WEB
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
                    CCD -> Known.CCD
                    PPD -> Known.PPD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
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

            private var validated: Boolean = false

            fun validate(): SecCode = apply {
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

                return other is SecCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethodAttributes &&
                companyId == other.companyId &&
                receiptRoutingNumber == other.receiptRoutingNumber &&
                retries == other.retries &&
                returnReasonCode == other.returnReasonCode &&
                secCode == other.secCode &&
                traceNumbers == other.traceNumbers &&
                addenda == other.addenda &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                companyId,
                receiptRoutingNumber,
                retries,
                returnReasonCode,
                secCode,
                traceNumbers,
                addenda,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentMethodAttributes{companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, secCode=$secCode, traceNumbers=$traceNumbers, addenda=$addenda, additionalProperties=$additionalProperties}"
    }

    /** Account tokens related to a payment transaction */
    class RelatedAccountTokens
    private constructor(
        private val accountToken: JsonField<String>,
        private val businessAccountToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_account_token")
            @ExcludeMissing
            businessAccountToken: JsonField<String> = JsonMissing.of(),
        ) : this(accountToken, businessAccountToken, mutableMapOf())

        /**
         * Globally unique identifier for the account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

        /**
         * Globally unique identifier for the business account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun businessAccountToken(): Optional<String> =
            businessAccountToken.getOptional("business_account_token")

        /**
         * Returns the raw JSON value of [accountToken].
         *
         * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /**
         * Returns the raw JSON value of [businessAccountToken].
         *
         * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun _businessAccountToken(): JsonField<String> = businessAccountToken

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
             * Returns a mutable builder for constructing an instance of [RelatedAccountTokens].
             *
             * The following fields are required:
             * ```java
             * .accountToken()
             * .businessAccountToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RelatedAccountTokens]. */
        class Builder internal constructor() {

            private var accountToken: JsonField<String>? = null
            private var businessAccountToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(relatedAccountTokens: RelatedAccountTokens) = apply {
                accountToken = relatedAccountTokens.accountToken
                businessAccountToken = relatedAccountTokens.businessAccountToken
                additionalProperties = relatedAccountTokens.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the account */
            fun accountToken(accountToken: String?) =
                accountToken(JsonField.ofNullable(accountToken))

            /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
            fun accountToken(accountToken: Optional<String>) =
                accountToken(accountToken.getOrNull())

            /**
             * Sets [Builder.accountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** Globally unique identifier for the business account */
            fun businessAccountToken(businessAccountToken: String?) =
                businessAccountToken(JsonField.ofNullable(businessAccountToken))

            /**
             * Alias for calling [Builder.businessAccountToken] with
             * `businessAccountToken.orElse(null)`.
             */
            fun businessAccountToken(businessAccountToken: Optional<String>) =
                businessAccountToken(businessAccountToken.getOrNull())

            /**
             * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                this.businessAccountToken = businessAccountToken
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

            /**
             * Returns an immutable instance of [RelatedAccountTokens].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountToken()
             * .businessAccountToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RelatedAccountTokens =
                RelatedAccountTokens(
                    checkRequired("accountToken", accountToken),
                    checkRequired("businessAccountToken", businessAccountToken),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RelatedAccountTokens = apply {
            if (validated) {
                return@apply
            }

            accountToken()
            businessAccountToken()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accountToken.asKnown().isPresent) 1 else 0) +
                (if (businessAccountToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RelatedAccountTokens &&
                accountToken == other.accountToken &&
                businessAccountToken == other.businessAccountToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountToken, businessAccountToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RelatedAccountTokens{accountToken=$accountToken, businessAccountToken=$businessAccountToken, additionalProperties=$additionalProperties}"
    }

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
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

    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CUSTOMER = of("CUSTOMER")

            @JvmField val LITHIC = of("LITHIC")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            CUSTOMER,
            LITHIC,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            LITHIC,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                CUSTOMER -> Value.CUSTOMER
                LITHIC -> Value.LITHIC
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
                CUSTOMER -> Known.CUSTOMER
                LITHIC -> Known.LITHIC
                else -> throw LithicInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status types:
     * * `DECLINED` - The payment was declined.
     * * `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * * `RETURNED` - The payment has been returned.
     * * `SETTLED` - The payment is completed.
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val RETURNED = of("RETURNED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DECLINED,
            PENDING,
            RETURNED,
            SETTLED,
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
            PENDING,
            RETURNED,
            SETTLED,
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
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                SETTLED -> Value.SETTLED
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
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                SETTLED -> Known.SETTLED
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Payment type indicating the specific ACH message or Fedwire transfer type */
    class TransferType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ORIGINATION_CREDIT = of("ORIGINATION_CREDIT")

            @JvmField val ORIGINATION_DEBIT = of("ORIGINATION_DEBIT")

            @JvmField val RECEIPT_CREDIT = of("RECEIPT_CREDIT")

            @JvmField val RECEIPT_DEBIT = of("RECEIPT_DEBIT")

            @JvmField val WIRE_INBOUND_PAYMENT = of("WIRE_INBOUND_PAYMENT")

            @JvmField val WIRE_INBOUND_ADMIN = of("WIRE_INBOUND_ADMIN")

            @JvmField val WIRE_OUTBOUND_PAYMENT = of("WIRE_OUTBOUND_PAYMENT")

            @JvmField val WIRE_OUTBOUND_ADMIN = of("WIRE_OUTBOUND_ADMIN")

            @JvmStatic fun of(value: String) = TransferType(JsonField.of(value))
        }

        /** An enum containing [TransferType]'s known values. */
        enum class Known {
            ORIGINATION_CREDIT,
            ORIGINATION_DEBIT,
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
            WIRE_INBOUND_PAYMENT,
            WIRE_INBOUND_ADMIN,
            WIRE_OUTBOUND_PAYMENT,
            WIRE_OUTBOUND_ADMIN,
        }

        /**
         * An enum containing [TransferType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransferType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORIGINATION_CREDIT,
            ORIGINATION_DEBIT,
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
            WIRE_INBOUND_PAYMENT,
            WIRE_INBOUND_ADMIN,
            WIRE_OUTBOUND_PAYMENT,
            WIRE_OUTBOUND_ADMIN,
            /**
             * An enum member indicating that [TransferType] was instantiated with an unknown value.
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
                ORIGINATION_CREDIT -> Value.ORIGINATION_CREDIT
                ORIGINATION_DEBIT -> Value.ORIGINATION_DEBIT
                RECEIPT_CREDIT -> Value.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Value.RECEIPT_DEBIT
                WIRE_INBOUND_PAYMENT -> Value.WIRE_INBOUND_PAYMENT
                WIRE_INBOUND_ADMIN -> Value.WIRE_INBOUND_ADMIN
                WIRE_OUTBOUND_PAYMENT -> Value.WIRE_OUTBOUND_PAYMENT
                WIRE_OUTBOUND_ADMIN -> Value.WIRE_OUTBOUND_ADMIN
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
                ORIGINATION_CREDIT -> Known.ORIGINATION_CREDIT
                ORIGINATION_DEBIT -> Known.ORIGINATION_DEBIT
                RECEIPT_CREDIT -> Known.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Known.RECEIPT_DEBIT
                WIRE_INBOUND_PAYMENT -> Known.WIRE_INBOUND_PAYMENT
                WIRE_INBOUND_ADMIN -> Known.WIRE_INBOUND_ADMIN
                WIRE_OUTBOUND_PAYMENT -> Known.WIRE_OUTBOUND_PAYMENT
                WIRE_OUTBOUND_ADMIN -> Known.WIRE_OUTBOUND_ADMIN
                else -> throw LithicInvalidDataException("Unknown TransferType: $value")
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

        fun validate(): TransferType = apply {
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

            return other is TransferType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
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
            type == other.type &&
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
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, direction=$direction, events=$events, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, relatedAccountTokens=$relatedAccountTokens, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, userDefinedId=$userDefinedId, expectedReleaseDate=$expectedReleaseDate, type=$type, additionalProperties=$additionalProperties}"
}
