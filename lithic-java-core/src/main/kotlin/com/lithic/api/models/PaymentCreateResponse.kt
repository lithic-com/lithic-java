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

/** Payment transaction */
class PaymentCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<Payment.TransactionCategory>,
    private val created: JsonField<OffsetDateTime>,
    private val descriptor: JsonField<String>,
    private val direction: JsonField<Payment.Direction>,
    private val events: JsonField<List<Payment.PaymentEvent>>,
    private val family: JsonField<Payment.Family>,
    private val financialAccountToken: JsonField<String>,
    private val method: JsonField<Payment.Method>,
    private val methodAttributes: JsonField<Payment.MethodAttributes>,
    private val pendingAmount: JsonField<Long>,
    private val relatedAccountTokens: JsonField<Payment.RelatedAccountTokens>,
    private val result: JsonField<Payment.TransactionResult>,
    private val settledAmount: JsonField<Long>,
    private val source: JsonField<Payment.Source>,
    private val status: JsonField<Payment.TransactionStatus>,
    private val updated: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val expectedReleaseDate: JsonField<LocalDate>,
    private val externalBankAccountToken: JsonField<String>,
    private val type: JsonField<Payment.TransferType>,
    private val userDefinedId: JsonField<String>,
    private val balance: JsonField<Balance>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<Payment.TransactionCategory> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Payment.Direction> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<Payment.PaymentEvent>> = JsonMissing.of(),
        @JsonProperty("family")
        @ExcludeMissing
        family: JsonField<Payment.Family> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        method: JsonField<Payment.Method> = JsonMissing.of(),
        @JsonProperty("method_attributes")
        @ExcludeMissing
        methodAttributes: JsonField<Payment.MethodAttributes> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("related_account_tokens")
        @ExcludeMissing
        relatedAccountTokens: JsonField<Payment.RelatedAccountTokens> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<Payment.TransactionResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<Payment.Source> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<Payment.TransactionStatus> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_release_date")
        @ExcludeMissing
        expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        externalBankAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<Payment.TransferType> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Balance> = JsonMissing.of(),
    ) : this(
        token,
        category,
        created,
        descriptor,
        direction,
        events,
        family,
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
        currency,
        expectedReleaseDate,
        externalBankAccountToken,
        type,
        userDefinedId,
        balance,
        mutableMapOf(),
    )

    fun toPayment(): Payment =
        Payment.builder()
            .token(token)
            .category(category)
            .created(created)
            .descriptor(descriptor)
            .direction(direction)
            .events(events)
            .family(family)
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
            .currency(currency)
            .expectedReleaseDate(expectedReleaseDate)
            .externalBankAccountToken(externalBankAccountToken)
            .type(type)
            .userDefinedId(userDefinedId)
            .build()

    /**
     * Unique identifier for the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Transaction category
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Payment.TransactionCategory = category.getRequired("category")

    /**
     * ISO 8601 timestamp of when the transaction was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Transaction descriptor
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /**
     * Transfer direction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Payment.Direction = direction.getRequired("direction")

    /**
     * List of transaction events
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<Payment.PaymentEvent> = events.getRequired("events")

    /**
     * PAYMENT - Payment Transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun family(): Payment.Family = family.getRequired("family")

    /**
     * Financial account token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * Transfer method
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): Payment.Method = method.getRequired("method")

    /**
     * Method-specific attributes
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun methodAttributes(): Payment.MethodAttributes =
        methodAttributes.getRequired("method_attributes")

    /**
     * Pending amount in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * Account tokens related to a payment transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relatedAccountTokens(): Optional<Payment.RelatedAccountTokens> =
        relatedAccountTokens.getOptional("related_account_tokens")

    /**
     * Transaction result
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Payment.TransactionResult = result.getRequired("result")

    /**
     * Settled amount in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Transaction source
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Payment.Source = source.getRequired("source")

    /**
     * The status of the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Payment.TransactionStatus = status.getRequired("status")

    /**
     * ISO 8601 timestamp of when the transaction was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Currency of the transaction in ISO 4217 format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Expected release date for the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedReleaseDate(): Optional<LocalDate> =
        expectedReleaseDate.getOptional("expected_release_date")

    /**
     * External bank account token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalBankAccountToken(): Optional<String> =
        externalBankAccountToken.getOptional("external_bank_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Payment.TransferType> = type.getOptional("type")

    /**
     * User-defined identifier
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

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
    fun _category(): JsonField<Payment.TransactionCategory> = category

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Payment.Family> = family

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
    fun _methodAttributes(): JsonField<Payment.MethodAttributes> = methodAttributes

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
    @JsonProperty("result")
    @ExcludeMissing
    fun _result(): JsonField<Payment.TransactionResult> = result

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
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Payment.TransactionStatus> = status

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [externalBankAccountToken].
     *
     * Unlike [externalBankAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Payment.TransferType> = type

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

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
         * .descriptor()
         * .direction()
         * .events()
         * .family()
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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentCreateResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<Payment.TransactionCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var descriptor: JsonField<String>? = null
        private var direction: JsonField<Payment.Direction>? = null
        private var events: JsonField<MutableList<Payment.PaymentEvent>>? = null
        private var family: JsonField<Payment.Family>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var method: JsonField<Payment.Method>? = null
        private var methodAttributes: JsonField<Payment.MethodAttributes>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var relatedAccountTokens: JsonField<Payment.RelatedAccountTokens>? = null
        private var result: JsonField<Payment.TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var source: JsonField<Payment.Source>? = null
        private var status: JsonField<Payment.TransactionStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Payment.TransferType> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            token = paymentCreateResponse.token
            category = paymentCreateResponse.category
            created = paymentCreateResponse.created
            descriptor = paymentCreateResponse.descriptor
            direction = paymentCreateResponse.direction
            events = paymentCreateResponse.events.map { it.toMutableList() }
            family = paymentCreateResponse.family
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
            currency = paymentCreateResponse.currency
            expectedReleaseDate = paymentCreateResponse.expectedReleaseDate
            externalBankAccountToken = paymentCreateResponse.externalBankAccountToken
            type = paymentCreateResponse.type
            userDefinedId = paymentCreateResponse.userDefinedId
            balance = paymentCreateResponse.balance
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the transaction */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Transaction category */
        fun category(category: Payment.TransactionCategory) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed
         * [Payment.TransactionCategory] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<Payment.TransactionCategory>) = apply {
            this.category = category
        }

        /** ISO 8601 timestamp of when the transaction was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Transaction descriptor */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** Transfer direction */
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

        /** List of transaction events */
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

        /** PAYMENT - Payment Transaction */
        fun family(family: Payment.Family) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [Payment.Family] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun family(family: JsonField<Payment.Family>) = apply { this.family = family }

        /** Financial account token */
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

        /** Transfer method */
        fun method(method: Payment.Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Payment.Method] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

        /** Method-specific attributes */
        fun methodAttributes(methodAttributes: Payment.MethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        /**
         * Sets [Builder.methodAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.methodAttributes] with a well-typed
         * [Payment.MethodAttributes] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun methodAttributes(methodAttributes: JsonField<Payment.MethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        /** Alias for calling [methodAttributes] with `Payment.MethodAttributes.ofAch(ach)`. */
        fun methodAttributes(ach: Payment.MethodAttributes.AchMethodAttributes) =
            methodAttributes(Payment.MethodAttributes.ofAch(ach))

        /** Alias for calling [methodAttributes] with `Payment.MethodAttributes.ofWire(wire)`. */
        fun methodAttributes(wire: Payment.MethodAttributes.WireMethodAttributes) =
            methodAttributes(Payment.MethodAttributes.ofWire(wire))

        /** Pending amount in cents */
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
        fun relatedAccountTokens(relatedAccountTokens: Payment.RelatedAccountTokens?) =
            relatedAccountTokens(JsonField.ofNullable(relatedAccountTokens))

        /**
         * Alias for calling [Builder.relatedAccountTokens] with
         * `relatedAccountTokens.orElse(null)`.
         */
        fun relatedAccountTokens(relatedAccountTokens: Optional<Payment.RelatedAccountTokens>) =
            relatedAccountTokens(relatedAccountTokens.getOrNull())

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

        /** Transaction result */
        fun result(result: Payment.TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Payment.TransactionResult]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun result(result: JsonField<Payment.TransactionResult>) = apply { this.result = result }

        /** Settled amount in cents */
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

        /** Transaction source */
        fun source(source: Payment.Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Payment.Source] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

        /** The status of the transaction */
        fun status(status: Payment.TransactionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Payment.TransactionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<Payment.TransactionStatus>) = apply { this.status = status }

        /** ISO 8601 timestamp of when the transaction was last updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Currency of the transaction in ISO 4217 format */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Expected release date for the transaction */
        fun expectedReleaseDate(expectedReleaseDate: LocalDate?) =
            expectedReleaseDate(JsonField.ofNullable(expectedReleaseDate))

        /**
         * Alias for calling [Builder.expectedReleaseDate] with `expectedReleaseDate.orElse(null)`.
         */
        fun expectedReleaseDate(expectedReleaseDate: Optional<LocalDate>) =
            expectedReleaseDate(expectedReleaseDate.getOrNull())

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

        /** External bank account token */
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

        fun type(type: Payment.TransferType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Payment.TransferType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<Payment.TransferType>) = apply { this.type = type }

        /** User-defined identifier */
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
         * .descriptor()
         * .direction()
         * .events()
         * .family()
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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("descriptor", descriptor),
                checkRequired("direction", direction),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("family", family),
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
                currency,
                expectedReleaseDate,
                externalBankAccountToken,
                type,
                userDefinedId,
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
        descriptor()
        direction().validate()
        events().forEach { it.validate() }
        family().validate()
        financialAccountToken()
        method().validate()
        methodAttributes().validate()
        pendingAmount()
        relatedAccountTokens().ifPresent { it.validate() }
        result().validate()
        settledAmount()
        source().validate()
        status().validate()
        updated()
        currency()
        expectedReleaseDate()
        externalBankAccountToken()
        type().ifPresent { it.validate() }
        userDefinedId()
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
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (family.asKnown().getOrNull()?.validity() ?: 0) +
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
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (expectedReleaseDate.asKnown().isPresent) 1 else 0) +
            (if (externalBankAccountToken.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userDefinedId.asKnown().isPresent) 1 else 0) +
            (balance.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentCreateResponse &&
            token == other.token &&
            category == other.category &&
            created == other.created &&
            descriptor == other.descriptor &&
            direction == other.direction &&
            events == other.events &&
            family == other.family &&
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
            currency == other.currency &&
            expectedReleaseDate == other.expectedReleaseDate &&
            externalBankAccountToken == other.externalBankAccountToken &&
            type == other.type &&
            userDefinedId == other.userDefinedId &&
            balance == other.balance &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            category,
            created,
            descriptor,
            direction,
            events,
            family,
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
            currency,
            expectedReleaseDate,
            externalBankAccountToken,
            type,
            userDefinedId,
            balance,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{token=$token, category=$category, created=$created, descriptor=$descriptor, direction=$direction, events=$events, family=$family, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, relatedAccountTokens=$relatedAccountTokens, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, currency=$currency, expectedReleaseDate=$expectedReleaseDate, externalBankAccountToken=$externalBankAccountToken, type=$type, userDefinedId=$userDefinedId, balance=$balance, additionalProperties=$additionalProperties}"
}
