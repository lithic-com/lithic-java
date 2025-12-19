// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Payment transaction */
class Payment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<TransactionCategory>,
    private val created: JsonField<OffsetDateTime>,
    private val descriptor: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val events: JsonField<List<PaymentEvent>>,
    private val family: JsonField<Family>,
    private val financialAccountToken: JsonField<String>,
    private val method: JsonField<Method>,
    private val methodAttributes: JsonField<MethodAttributes>,
    private val pendingAmount: JsonField<Long>,
    private val relatedAccountTokens: JsonField<RelatedAccountTokens>,
    private val result: JsonField<TransactionResult>,
    private val settledAmount: JsonField<Long>,
    private val source: JsonField<Source>,
    private val status: JsonField<TransactionStatus>,
    private val updated: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val expectedReleaseDate: JsonField<LocalDate>,
    private val externalBankAccountToken: JsonField<String>,
    private val type: JsonField<TransferType>,
    private val userDefinedId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<TransactionCategory> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<PaymentEvent>> = JsonMissing.of(),
        @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("method_attributes")
        @ExcludeMissing
        methodAttributes: JsonField<MethodAttributes> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("related_account_tokens")
        @ExcludeMissing
        relatedAccountTokens: JsonField<RelatedAccountTokens> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<TransactionResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<TransactionStatus> = JsonMissing.of(),
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<TransferType> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
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
        mutableMapOf(),
    )

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
    fun category(): TransactionCategory = category.getRequired("category")

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
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * List of transaction events
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<PaymentEvent> = events.getRequired("events")

    /**
     * PAYMENT - Payment Transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun family(): Family = family.getRequired("family")

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
    fun method(): Method = method.getRequired("method")

    /**
     * Method-specific attributes
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun methodAttributes(): MethodAttributes = methodAttributes.getRequired("method_attributes")

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
    fun relatedAccountTokens(): Optional<RelatedAccountTokens> =
        relatedAccountTokens.getOptional("related_account_tokens")

    /**
     * Transaction result
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): TransactionResult = result.getRequired("result")

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
    fun source(): Source = source.getRequired("source")

    /**
     * The status of the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): TransactionStatus = status.getRequired("status")

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
    fun type(): Optional<TransferType> = type.getOptional("type")

    /**
     * User-defined identifier
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

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
    fun _category(): JsonField<TransactionCategory> = category

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
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<PaymentEvent>> = events

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

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
    fun _methodAttributes(): JsonField<MethodAttributes> = methodAttributes

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
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<TransferType> = type

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

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

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<TransactionCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var descriptor: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var events: JsonField<MutableList<PaymentEvent>>? = null
        private var family: JsonField<Family>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var method: JsonField<Method>? = null
        private var methodAttributes: JsonField<MethodAttributes>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var relatedAccountTokens: JsonField<RelatedAccountTokens>? = null
        private var result: JsonField<TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var source: JsonField<Source>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var type: JsonField<TransferType> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            token = payment.token
            category = payment.category
            created = payment.created
            descriptor = payment.descriptor
            direction = payment.direction
            events = payment.events.map { it.toMutableList() }
            family = payment.family
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
            currency = payment.currency
            expectedReleaseDate = payment.expectedReleaseDate
            externalBankAccountToken = payment.externalBankAccountToken
            type = payment.type
            userDefinedId = payment.userDefinedId
            additionalProperties = payment.additionalProperties.toMutableMap()
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
        fun category(category: TransactionCategory) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [TransactionCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<TransactionCategory>) = apply { this.category = category }

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
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** List of transaction events */
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

        /** PAYMENT - Payment Transaction */
        fun family(family: Family) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [Family] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun family(family: JsonField<Family>) = apply { this.family = family }

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
        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

        /** Method-specific attributes */
        fun methodAttributes(methodAttributes: MethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        /**
         * Sets [Builder.methodAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.methodAttributes] with a well-typed [MethodAttributes]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun methodAttributes(methodAttributes: JsonField<MethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        /** Alias for calling [methodAttributes] with `MethodAttributes.ofAch(ach)`. */
        fun methodAttributes(ach: MethodAttributes.AchMethodAttributes) =
            methodAttributes(MethodAttributes.ofAch(ach))

        /** Alias for calling [methodAttributes] with `MethodAttributes.ofWire(wire)`. */
        fun methodAttributes(wire: MethodAttributes.WireMethodAttributes) =
            methodAttributes(MethodAttributes.ofWire(wire))

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
        fun relatedAccountTokens(relatedAccountTokens: RelatedAccountTokens?) =
            relatedAccountTokens(JsonField.ofNullable(relatedAccountTokens))

        /**
         * Alias for calling [Builder.relatedAccountTokens] with
         * `relatedAccountTokens.orElse(null)`.
         */
        fun relatedAccountTokens(relatedAccountTokens: Optional<RelatedAccountTokens>) =
            relatedAccountTokens(relatedAccountTokens.getOrNull())

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

        /** Transaction result */
        fun result(result: TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [TransactionResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

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
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** The status of the transaction */
        fun status(status: TransactionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [TransactionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

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

        fun type(type: TransferType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [TransferType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<TransferType>) = apply { this.type = type }

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
        fun build(): Payment =
            Payment(
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
            (if (userDefinedId.asKnown().isPresent) 1 else 0)

    /** Transaction category */
    class TransactionCategory
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

            @JvmField val ACH = of("ACH")

            @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

            @JvmField val FEE = of("FEE")

            @JvmField val REWARD = of("REWARD")

            @JvmField val ADJUSTMENT = of("ADJUSTMENT")

            @JvmField val DERECOGNITION = of("DERECOGNITION")

            @JvmField val DISPUTE = of("DISPUTE")

            @JvmField val CARD = of("CARD")

            @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

            @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

            @JvmField val EXTERNAL_FEDNOW = of("EXTERNAL_FEDNOW")

            @JvmField val EXTERNAL_RTP = of("EXTERNAL_RTP")

            @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

            @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

            @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

            @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

            @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

            @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

            @JvmField val MANAGEMENT_DISBURSEMENT = of("MANAGEMENT_DISBURSEMENT")

            @JvmField val PROGRAM_FUNDING = of("PROGRAM_FUNDING")

            @JvmStatic fun of(value: String) = TransactionCategory(JsonField.of(value))
        }

        /** An enum containing [TransactionCategory]'s known values. */
        enum class Known {
            ACH,
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            CARD,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_FEDNOW,
            EXTERNAL_RTP,
            EXTERNAL_TRANSFER,
            EXTERNAL_WIRE,
            MANAGEMENT_ADJUSTMENT,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_FEE,
            MANAGEMENT_REWARD,
            MANAGEMENT_DISBURSEMENT,
            PROGRAM_FUNDING,
        }

        /**
         * An enum containing [TransactionCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            CARD,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_FEDNOW,
            EXTERNAL_RTP,
            EXTERNAL_TRANSFER,
            EXTERNAL_WIRE,
            MANAGEMENT_ADJUSTMENT,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_FEE,
            MANAGEMENT_REWARD,
            MANAGEMENT_DISBURSEMENT,
            PROGRAM_FUNDING,
            /**
             * An enum member indicating that [TransactionCategory] was instantiated with an unknown
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
                ACH -> Value.ACH
                BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                FEE -> Value.FEE
                REWARD -> Value.REWARD
                ADJUSTMENT -> Value.ADJUSTMENT
                DERECOGNITION -> Value.DERECOGNITION
                DISPUTE -> Value.DISPUTE
                CARD -> Value.CARD
                EXTERNAL_ACH -> Value.EXTERNAL_ACH
                EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                EXTERNAL_FEDNOW -> Value.EXTERNAL_FEDNOW
                EXTERNAL_RTP -> Value.EXTERNAL_RTP
                EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                MANAGEMENT_DISBURSEMENT -> Value.MANAGEMENT_DISBURSEMENT
                PROGRAM_FUNDING -> Value.PROGRAM_FUNDING
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
                BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                FEE -> Known.FEE
                REWARD -> Known.REWARD
                ADJUSTMENT -> Known.ADJUSTMENT
                DERECOGNITION -> Known.DERECOGNITION
                DISPUTE -> Known.DISPUTE
                CARD -> Known.CARD
                EXTERNAL_ACH -> Known.EXTERNAL_ACH
                EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                EXTERNAL_FEDNOW -> Known.EXTERNAL_FEDNOW
                EXTERNAL_RTP -> Known.EXTERNAL_RTP
                EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                MANAGEMENT_DISBURSEMENT -> Known.MANAGEMENT_DISBURSEMENT
                PROGRAM_FUNDING -> Known.PROGRAM_FUNDING
                else -> throw LithicInvalidDataException("Unknown TransactionCategory: $value")
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

        fun validate(): TransactionCategory = apply {
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

            return other is TransactionCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Transfer direction */
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val type: JsonField<PaymentEventType>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val externalId: JsonField<String>,
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
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<PaymentEventType> = JsonMissing.of(),
            @JsonProperty("detailed_results")
            @ExcludeMissing
            detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
        ) : this(token, amount, created, result, type, detailedResults, externalId, mutableMapOf())

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
         * * `ACH_ORIGINATION_REJECTED` - ACH origination was rejected and not sent to the Federal
         *   Reserve.
         * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * * `ACH_RETURN_INITIATED` - ACH initiated return for an ACH receipt.
         * * `ACH_RETURN_PROCESSED` - ACH receipt returned by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RETURN_SETTLED` - ACH return settled by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RETURN_REJECTED` - ACH return was rejected by the Receiving Depository Financial
         *   Institution.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): PaymentEventType = type.getRequired("type")

        /**
         * More detailed reasons for the event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detailedResults(): Optional<List<DetailedResult>> =
            detailedResults.getOptional("detailed_results")

        /**
         * Payment event external ID, for example, ACH trace number.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentEventType> = type

        /**
         * Returns the raw JSON value of [detailedResults].
         *
         * Unlike [detailedResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<List<DetailedResult>> = detailedResults

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

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
            private var type: JsonField<PaymentEventType>? = null
            private var detailedResults: JsonField<MutableList<DetailedResult>>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentEvent: PaymentEvent) = apply {
                token = paymentEvent.token
                amount = paymentEvent.amount
                created = paymentEvent.created
                result = paymentEvent.result
                type = paymentEvent.type
                detailedResults = paymentEvent.detailedResults.map { it.toMutableList() }
                externalId = paymentEvent.externalId
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
             * * `ACH_ORIGINATION_REJECTED` - ACH origination was rejected and not sent to the
             *   Federal Reserve.
             * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * * `ACH_RETURN_INITIATED` - ACH initiated return for an ACH receipt.
             * * `ACH_RETURN_PROCESSED` - ACH receipt returned by the Receiving Depository Financial
             *   Institution.
             * * `ACH_RETURN_SETTLED` - ACH return settled by the Receiving Depository Financial
             *   Institution.
             * * `ACH_RETURN_REJECTED` - ACH return was rejected by the Receiving Depository
             *   Financial Institution.
             */
            fun type(type: PaymentEventType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [PaymentEventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<PaymentEventType>) = apply { this.type = type }

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

            /** Payment event external ID, for example, ACH trace number. */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
            fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

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
                    externalId,
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
            externalId()
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
                (detailedResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalId.asKnown().isPresent) 1 else 0)

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
         * * `ACH_ORIGINATION_REJECTED` - ACH origination was rejected and not sent to the Federal
         *   Reserve.
         * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * * `ACH_RETURN_INITIATED` - ACH initiated return for an ACH receipt.
         * * `ACH_RETURN_PROCESSED` - ACH receipt returned by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RETURN_SETTLED` - ACH return settled by the Receiving Depository Financial
         *   Institution.
         * * `ACH_RETURN_REJECTED` - ACH return was rejected by the Receiving Depository Financial
         *   Institution.
         */
        class PaymentEventType
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

                @JvmField val ACH_ORIGINATION_REJECTED = of("ACH_ORIGINATION_REJECTED")

                @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                @JvmField val ACH_RECEIPT_RELEASED = of("ACH_RECEIPT_RELEASED")

                @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                @JvmField val ACH_RETURN_REJECTED = of("ACH_RETURN_REJECTED")

                @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

                @JvmStatic fun of(value: String) = PaymentEventType(JsonField.of(value))
            }

            /** An enum containing [PaymentEventType]'s known values. */
            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_REJECTED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_RELEASED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                ACH_RETURN_REJECTED,
                ACH_RETURN_SETTLED,
            }

            /**
             * An enum containing [PaymentEventType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PaymentEventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_REJECTED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_RELEASED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                ACH_RETURN_REJECTED,
                ACH_RETURN_SETTLED,
                /**
                 * An enum member indicating that [PaymentEventType] was instantiated with an
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
                    ACH_ORIGINATION_REJECTED -> Value.ACH_ORIGINATION_REJECTED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_RELEASED -> Value.ACH_RECEIPT_RELEASED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    ACH_RETURN_REJECTED -> Value.ACH_RETURN_REJECTED
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
                    ACH_ORIGINATION_REJECTED -> Known.ACH_ORIGINATION_REJECTED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_RELEASED -> Known.ACH_RECEIPT_RELEASED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    ACH_RETURN_REJECTED -> Known.ACH_RETURN_REJECTED
                    ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                    else -> throw LithicInvalidDataException("Unknown PaymentEventType: $value")
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

            fun validate(): PaymentEventType = apply {
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

                return other is PaymentEventType && value == other.value
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

                @JvmField val DECLINED = of("DECLINED")

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
                DECLINED,
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
                DECLINED,
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
                    DECLINED -> Value.DECLINED
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
                    DECLINED -> Known.DECLINED
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
                externalId == other.externalId &&
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
                externalId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, detailedResults=$detailedResults, externalId=$externalId, additionalProperties=$additionalProperties}"
    }

    /** PAYMENT - Payment Transaction */
    class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAYMENT = of("PAYMENT")

            @JvmStatic fun of(value: String) = Family(JsonField.of(value))
        }

        /** An enum containing [Family]'s known values. */
        enum class Known {
            PAYMENT
        }

        /**
         * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Family] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT,
            /** An enum member indicating that [Family] was instantiated with an unknown value. */
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
                PAYMENT -> Value.PAYMENT
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
                PAYMENT -> Known.PAYMENT
                else -> throw LithicInvalidDataException("Unknown Family: $value")
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

        fun validate(): Family = apply {
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

            return other is Family && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Transfer method */
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

            @JvmField val WIRE = of("WIRE")

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            WIRE,
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
            WIRE,
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
                WIRE -> Value.WIRE
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
                WIRE -> Known.WIRE
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

    /** Method-specific attributes */
    @JsonDeserialize(using = MethodAttributes.Deserializer::class)
    @JsonSerialize(using = MethodAttributes.Serializer::class)
    class MethodAttributes
    private constructor(
        private val ach: AchMethodAttributes? = null,
        private val wire: WireMethodAttributes? = null,
        private val _json: JsonValue? = null,
    ) {

        fun ach(): Optional<AchMethodAttributes> = Optional.ofNullable(ach)

        fun wire(): Optional<WireMethodAttributes> = Optional.ofNullable(wire)

        fun isAch(): Boolean = ach != null

        fun isWire(): Boolean = wire != null

        fun asAch(): AchMethodAttributes = ach.getOrThrow("ach")

        fun asWire(): WireMethodAttributes = wire.getOrThrow("wire")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                ach != null -> visitor.visitAch(ach)
                wire != null -> visitor.visitWire(wire)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MethodAttributes = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAch(ach: AchMethodAttributes) {
                        ach.validate()
                    }

                    override fun visitWire(wire: WireMethodAttributes) {
                        wire.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAch(ach: AchMethodAttributes) = ach.validity()

                    override fun visitWire(wire: WireMethodAttributes) = wire.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MethodAttributes && ach == other.ach && wire == other.wire
        }

        override fun hashCode(): Int = Objects.hash(ach, wire)

        override fun toString(): String =
            when {
                ach != null -> "MethodAttributes{ach=$ach}"
                wire != null -> "MethodAttributes{wire=$wire}"
                _json != null -> "MethodAttributes{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MethodAttributes")
            }

        companion object {

            @JvmStatic fun ofAch(ach: AchMethodAttributes) = MethodAttributes(ach = ach)

            @JvmStatic fun ofWire(wire: WireMethodAttributes) = MethodAttributes(wire = wire)
        }

        /**
         * An interface that defines how to map each variant of [MethodAttributes] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAch(ach: AchMethodAttributes): T

            fun visitWire(wire: WireMethodAttributes): T

            /**
             * Maps an unknown variant of [MethodAttributes] to a value of type [T].
             *
             * An instance of [MethodAttributes] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown MethodAttributes: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MethodAttributes>(MethodAttributes::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MethodAttributes {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AchMethodAttributes>())?.let {
                                MethodAttributes(ach = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<WireMethodAttributes>())?.let {
                                MethodAttributes(wire = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> MethodAttributes(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MethodAttributes>(MethodAttributes::class) {

            override fun serialize(
                value: MethodAttributes,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.ach != null -> generator.writeObject(value.ach)
                    value.wire != null -> generator.writeObject(value.wire)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MethodAttributes")
                }
            }
        }

        class AchMethodAttributes
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val secCode: JsonField<SecCode>,
            private val achHoldPeriod: JsonField<Long>,
            private val addenda: JsonField<String>,
            private val companyId: JsonField<String>,
            private val receiptRoutingNumber: JsonField<String>,
            private val retries: JsonField<Long>,
            private val returnReasonCode: JsonField<String>,
            private val traceNumbers: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("sec_code")
                @ExcludeMissing
                secCode: JsonField<SecCode> = JsonMissing.of(),
                @JsonProperty("ach_hold_period")
                @ExcludeMissing
                achHoldPeriod: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("addenda")
                @ExcludeMissing
                addenda: JsonField<String> = JsonMissing.of(),
                @JsonProperty("company_id")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receipt_routing_number")
                @ExcludeMissing
                receiptRoutingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("retries")
                @ExcludeMissing
                retries: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                returnReasonCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_numbers")
                @ExcludeMissing
                traceNumbers: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                secCode,
                achHoldPeriod,
                addenda,
                companyId,
                receiptRoutingNumber,
                retries,
                returnReasonCode,
                traceNumbers,
                mutableMapOf(),
            )

            /**
             * SEC code for ACH transaction
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun secCode(): SecCode = secCode.getRequired("sec_code")

            /**
             * Number of days the ACH transaction is on hold
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun achHoldPeriod(): Optional<Long> = achHoldPeriod.getOptional("ach_hold_period")

            /**
             * Addenda information
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun addenda(): Optional<String> = addenda.getOptional("addenda")

            /**
             * Company ID for the ACH transaction
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyId(): Optional<String> = companyId.getOptional("company_id")

            /**
             * Receipt routing number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun receiptRoutingNumber(): Optional<String> =
                receiptRoutingNumber.getOptional("receipt_routing_number")

            /**
             * Number of retries attempted
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun retries(): Optional<Long> = retries.getOptional("retries")

            /**
             * Return reason code if the transaction was returned
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun returnReasonCode(): Optional<String> =
                returnReasonCode.getOptional("return_reason_code")

            /**
             * Trace numbers for the ACH transaction
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun traceNumbers(): Optional<List<String>> = traceNumbers.getOptional("trace_numbers")

            /**
             * Returns the raw JSON value of [secCode].
             *
             * Unlike [secCode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sec_code") @ExcludeMissing fun _secCode(): JsonField<SecCode> = secCode

            /**
             * Returns the raw JSON value of [achHoldPeriod].
             *
             * Unlike [achHoldPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ach_hold_period")
            @ExcludeMissing
            fun _achHoldPeriod(): JsonField<Long> = achHoldPeriod

            /**
             * Returns the raw JSON value of [addenda].
             *
             * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<String> = addenda

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_id")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

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
             * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun _returnReasonCode(): JsonField<String> = returnReasonCode

            /**
             * Returns the raw JSON value of [traceNumbers].
             *
             * Unlike [traceNumbers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_numbers")
            @ExcludeMissing
            fun _traceNumbers(): JsonField<List<String>> = traceNumbers

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
                 * Returns a mutable builder for constructing an instance of [AchMethodAttributes].
                 *
                 * The following fields are required:
                 * ```java
                 * .secCode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AchMethodAttributes]. */
            class Builder internal constructor() {

                private var secCode: JsonField<SecCode>? = null
                private var achHoldPeriod: JsonField<Long> = JsonMissing.of()
                private var addenda: JsonField<String> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var receiptRoutingNumber: JsonField<String> = JsonMissing.of()
                private var retries: JsonField<Long> = JsonMissing.of()
                private var returnReasonCode: JsonField<String> = JsonMissing.of()
                private var traceNumbers: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achMethodAttributes: AchMethodAttributes) = apply {
                    secCode = achMethodAttributes.secCode
                    achHoldPeriod = achMethodAttributes.achHoldPeriod
                    addenda = achMethodAttributes.addenda
                    companyId = achMethodAttributes.companyId
                    receiptRoutingNumber = achMethodAttributes.receiptRoutingNumber
                    retries = achMethodAttributes.retries
                    returnReasonCode = achMethodAttributes.returnReasonCode
                    traceNumbers = achMethodAttributes.traceNumbers.map { it.toMutableList() }
                    additionalProperties = achMethodAttributes.additionalProperties.toMutableMap()
                }

                /** SEC code for ACH transaction */
                fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

                /**
                 * Sets [Builder.secCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secCode] with a well-typed [SecCode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

                /** Number of days the ACH transaction is on hold */
                fun achHoldPeriod(achHoldPeriod: Long?) =
                    achHoldPeriod(JsonField.ofNullable(achHoldPeriod))

                /**
                 * Alias for [Builder.achHoldPeriod].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun achHoldPeriod(achHoldPeriod: Long) = achHoldPeriod(achHoldPeriod as Long?)

                /** Alias for calling [Builder.achHoldPeriod] with `achHoldPeriod.orElse(null)`. */
                fun achHoldPeriod(achHoldPeriod: Optional<Long>) =
                    achHoldPeriod(achHoldPeriod.getOrNull())

                /**
                 * Sets [Builder.achHoldPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.achHoldPeriod] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun achHoldPeriod(achHoldPeriod: JsonField<Long>) = apply {
                    this.achHoldPeriod = achHoldPeriod
                }

                /** Addenda information */
                fun addenda(addenda: String?) = addenda(JsonField.ofNullable(addenda))

                /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
                fun addenda(addenda: Optional<String>) = addenda(addenda.getOrNull())

                /**
                 * Sets [Builder.addenda] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addenda] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun addenda(addenda: JsonField<String>) = apply { this.addenda = addenda }

                /** Company ID for the ACH transaction */
                fun companyId(companyId: String?) = companyId(JsonField.ofNullable(companyId))

                /** Alias for calling [Builder.companyId] with `companyId.orElse(null)`. */
                fun companyId(companyId: Optional<String>) = companyId(companyId.getOrNull())

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** Receipt routing number */
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                    this.receiptRoutingNumber = receiptRoutingNumber
                }

                /** Number of retries attempted */
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

                /** Return reason code if the transaction was returned */
                fun returnReasonCode(returnReasonCode: String?) =
                    returnReasonCode(JsonField.ofNullable(returnReasonCode))

                /**
                 * Alias for calling [Builder.returnReasonCode] with
                 * `returnReasonCode.orElse(null)`.
                 */
                fun returnReasonCode(returnReasonCode: Optional<String>) =
                    returnReasonCode(returnReasonCode.getOrNull())

                /**
                 * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.returnReasonCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                    this.returnReasonCode = returnReasonCode
                }

                /** Trace numbers for the ACH transaction */
                fun traceNumbers(traceNumbers: List<String>) =
                    traceNumbers(JsonField.of(traceNumbers))

                /**
                 * Sets [Builder.traceNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceNumbers] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun traceNumbers(traceNumbers: JsonField<List<String>>) = apply {
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

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AchMethodAttributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .secCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AchMethodAttributes =
                    AchMethodAttributes(
                        checkRequired("secCode", secCode),
                        achHoldPeriod,
                        addenda,
                        companyId,
                        receiptRoutingNumber,
                        retries,
                        returnReasonCode,
                        (traceNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AchMethodAttributes = apply {
                if (validated) {
                    return@apply
                }

                secCode().validate()
                achHoldPeriod()
                addenda()
                companyId()
                receiptRoutingNumber()
                retries()
                returnReasonCode()
                traceNumbers()
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
                (secCode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (achHoldPeriod.asKnown().isPresent) 1 else 0) +
                    (if (addenda.asKnown().isPresent) 1 else 0) +
                    (if (companyId.asKnown().isPresent) 1 else 0) +
                    (if (receiptRoutingNumber.asKnown().isPresent) 1 else 0) +
                    (if (retries.asKnown().isPresent) 1 else 0) +
                    (if (returnReasonCode.asKnown().isPresent) 1 else 0) +
                    (traceNumbers.asKnown().getOrNull()?.size ?: 0)

            /** SEC code for ACH transaction */
            class SecCode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CCD = of("CCD")

                    @JvmField val PPD = of("PPD")

                    @JvmField val WEB = of("WEB")

                    @JvmField val TEL = of("TEL")

                    @JvmField val CIE = of("CIE")

                    @JvmField val CTX = of("CTX")

                    @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
                }

                /** An enum containing [SecCode]'s known values. */
                enum class Known {
                    CCD,
                    PPD,
                    WEB,
                    TEL,
                    CIE,
                    CTX,
                }

                /**
                 * An enum containing [SecCode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SecCode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CCD,
                    PPD,
                    WEB,
                    TEL,
                    CIE,
                    CTX,
                    /**
                     * An enum member indicating that [SecCode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CCD -> Value.CCD
                        PPD -> Value.PPD
                        WEB -> Value.WEB
                        TEL -> Value.TEL
                        CIE -> Value.CIE
                        CTX -> Value.CTX
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CCD -> Known.CCD
                        PPD -> Known.PPD
                        WEB -> Known.WEB
                        TEL -> Known.TEL
                        CIE -> Known.CIE
                        CTX -> Known.CTX
                        else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is AchMethodAttributes &&
                    secCode == other.secCode &&
                    achHoldPeriod == other.achHoldPeriod &&
                    addenda == other.addenda &&
                    companyId == other.companyId &&
                    receiptRoutingNumber == other.receiptRoutingNumber &&
                    retries == other.retries &&
                    returnReasonCode == other.returnReasonCode &&
                    traceNumbers == other.traceNumbers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    secCode,
                    achHoldPeriod,
                    addenda,
                    companyId,
                    receiptRoutingNumber,
                    retries,
                    returnReasonCode,
                    traceNumbers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AchMethodAttributes{secCode=$secCode, achHoldPeriod=$achHoldPeriod, addenda=$addenda, companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, traceNumbers=$traceNumbers, additionalProperties=$additionalProperties}"
        }

        class WireMethodAttributes
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val wireMessageType: JsonField<String>,
            private val wireNetwork: JsonField<WireNetwork>,
            private val creditor: JsonField<WirePartyDetails>,
            private val debtor: JsonField<WirePartyDetails>,
            private val messageId: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("wire_message_type")
                @ExcludeMissing
                wireMessageType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("wire_network")
                @ExcludeMissing
                wireNetwork: JsonField<WireNetwork> = JsonMissing.of(),
                @JsonProperty("creditor")
                @ExcludeMissing
                creditor: JsonField<WirePartyDetails> = JsonMissing.of(),
                @JsonProperty("debtor")
                @ExcludeMissing
                debtor: JsonField<WirePartyDetails> = JsonMissing.of(),
                @JsonProperty("message_id")
                @ExcludeMissing
                messageId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
            ) : this(
                wireMessageType,
                wireNetwork,
                creditor,
                debtor,
                messageId,
                remittanceInformation,
                mutableMapOf(),
            )

            /**
             * Type of wire message
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun wireMessageType(): Optional<String> =
                wireMessageType.getOptional("wire_message_type")

            /**
             * Type of wire transfer
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun wireNetwork(): WireNetwork = wireNetwork.getRequired("wire_network")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditor(): Optional<WirePartyDetails> = creditor.getOptional("creditor")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun debtor(): Optional<WirePartyDetails> = debtor.getOptional("debtor")

            /**
             * Point to point reference identifier, as assigned by the instructing party, used for
             * tracking the message through the Fedwire system
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun messageId(): Optional<String> = messageId.getOptional("message_id")

            /**
             * Payment details or invoice reference
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun remittanceInformation(): Optional<String> =
                remittanceInformation.getOptional("remittance_information")

            /**
             * Returns the raw JSON value of [wireMessageType].
             *
             * Unlike [wireMessageType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("wire_message_type")
            @ExcludeMissing
            fun _wireMessageType(): JsonField<String> = wireMessageType

            /**
             * Returns the raw JSON value of [wireNetwork].
             *
             * Unlike [wireNetwork], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("wire_network")
            @ExcludeMissing
            fun _wireNetwork(): JsonField<WireNetwork> = wireNetwork

            /**
             * Returns the raw JSON value of [creditor].
             *
             * Unlike [creditor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creditor")
            @ExcludeMissing
            fun _creditor(): JsonField<WirePartyDetails> = creditor

            /**
             * Returns the raw JSON value of [debtor].
             *
             * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("debtor")
            @ExcludeMissing
            fun _debtor(): JsonField<WirePartyDetails> = debtor

            /**
             * Returns the raw JSON value of [messageId].
             *
             * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("message_id")
            @ExcludeMissing
            fun _messageId(): JsonField<String> = messageId

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

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
                 * Returns a mutable builder for constructing an instance of [WireMethodAttributes].
                 *
                 * The following fields are required:
                 * ```java
                 * .wireMessageType()
                 * .wireNetwork()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WireMethodAttributes]. */
            class Builder internal constructor() {

                private var wireMessageType: JsonField<String>? = null
                private var wireNetwork: JsonField<WireNetwork>? = null
                private var creditor: JsonField<WirePartyDetails> = JsonMissing.of()
                private var debtor: JsonField<WirePartyDetails> = JsonMissing.of()
                private var messageId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireMethodAttributes: WireMethodAttributes) = apply {
                    wireMessageType = wireMethodAttributes.wireMessageType
                    wireNetwork = wireMethodAttributes.wireNetwork
                    creditor = wireMethodAttributes.creditor
                    debtor = wireMethodAttributes.debtor
                    messageId = wireMethodAttributes.messageId
                    remittanceInformation = wireMethodAttributes.remittanceInformation
                    additionalProperties = wireMethodAttributes.additionalProperties.toMutableMap()
                }

                /** Type of wire message */
                fun wireMessageType(wireMessageType: String?) =
                    wireMessageType(JsonField.ofNullable(wireMessageType))

                /**
                 * Alias for calling [Builder.wireMessageType] with `wireMessageType.orElse(null)`.
                 */
                fun wireMessageType(wireMessageType: Optional<String>) =
                    wireMessageType(wireMessageType.getOrNull())

                /**
                 * Sets [Builder.wireMessageType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wireMessageType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun wireMessageType(wireMessageType: JsonField<String>) = apply {
                    this.wireMessageType = wireMessageType
                }

                /** Type of wire transfer */
                fun wireNetwork(wireNetwork: WireNetwork) = wireNetwork(JsonField.of(wireNetwork))

                /**
                 * Sets [Builder.wireNetwork] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wireNetwork] with a well-typed [WireNetwork]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun wireNetwork(wireNetwork: JsonField<WireNetwork>) = apply {
                    this.wireNetwork = wireNetwork
                }

                fun creditor(creditor: WirePartyDetails) = creditor(JsonField.of(creditor))

                /**
                 * Sets [Builder.creditor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditor] with a well-typed [WirePartyDetails]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun creditor(creditor: JsonField<WirePartyDetails>) = apply {
                    this.creditor = creditor
                }

                fun debtor(debtor: WirePartyDetails) = debtor(JsonField.of(debtor))

                /**
                 * Sets [Builder.debtor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debtor] with a well-typed [WirePartyDetails]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun debtor(debtor: JsonField<WirePartyDetails>) = apply { this.debtor = debtor }

                /**
                 * Point to point reference identifier, as assigned by the instructing party, used
                 * for tracking the message through the Fedwire system
                 */
                fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

                /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
                fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

                /**
                 * Sets [Builder.messageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

                /** Payment details or invoice reference */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Alias for calling [Builder.remittanceInformation] with
                 * `remittanceInformation.orElse(null)`.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.getOrNull())

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [WireMethodAttributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .wireMessageType()
                 * .wireNetwork()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WireMethodAttributes =
                    WireMethodAttributes(
                        checkRequired("wireMessageType", wireMessageType),
                        checkRequired("wireNetwork", wireNetwork),
                        creditor,
                        debtor,
                        messageId,
                        remittanceInformation,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WireMethodAttributes = apply {
                if (validated) {
                    return@apply
                }

                wireMessageType()
                wireNetwork().validate()
                creditor().ifPresent { it.validate() }
                debtor().ifPresent { it.validate() }
                messageId()
                remittanceInformation()
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
                (if (wireMessageType.asKnown().isPresent) 1 else 0) +
                    (wireNetwork.asKnown().getOrNull()?.validity() ?: 0) +
                    (creditor.asKnown().getOrNull()?.validity() ?: 0) +
                    (debtor.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (messageId.asKnown().isPresent) 1 else 0) +
                    (if (remittanceInformation.asKnown().isPresent) 1 else 0)

            /** Type of wire transfer */
            class WireNetwork
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FEDWIRE = of("FEDWIRE")

                    @JvmField val SWIFT = of("SWIFT")

                    @JvmStatic fun of(value: String) = WireNetwork(JsonField.of(value))
                }

                /** An enum containing [WireNetwork]'s known values. */
                enum class Known {
                    FEDWIRE,
                    SWIFT,
                }

                /**
                 * An enum containing [WireNetwork]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [WireNetwork] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FEDWIRE,
                    SWIFT,
                    /**
                     * An enum member indicating that [WireNetwork] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FEDWIRE -> Value.FEDWIRE
                        SWIFT -> Value.SWIFT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FEDWIRE -> Known.FEDWIRE
                        SWIFT -> Known.SWIFT
                        else -> throw LithicInvalidDataException("Unknown WireNetwork: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): WireNetwork = apply {
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

                    return other is WireNetwork && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireMethodAttributes &&
                    wireMessageType == other.wireMessageType &&
                    wireNetwork == other.wireNetwork &&
                    creditor == other.creditor &&
                    debtor == other.debtor &&
                    messageId == other.messageId &&
                    remittanceInformation == other.remittanceInformation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    wireMessageType,
                    wireNetwork,
                    creditor,
                    debtor,
                    messageId,
                    remittanceInformation,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WireMethodAttributes{wireMessageType=$wireMessageType, wireNetwork=$wireNetwork, creditor=$creditor, debtor=$debtor, messageId=$messageId, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"
        }
    }

    /** Account tokens related to a payment transaction */
    class RelatedAccountTokens
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

    /** Transaction result */
    class TransactionResult @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
        }

        /** An enum containing [TransactionResult]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /**
             * An enum member indicating that [TransactionResult] was instantiated with an unknown
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
                else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

        fun validate(): TransactionResult = apply {
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

            return other is TransactionResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Transaction source */
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

            @JvmField val LITHIC = of("LITHIC")

            @JvmField val EXTERNAL = of("EXTERNAL")

            @JvmField val CUSTOMER = of("CUSTOMER")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            LITHIC,
            EXTERNAL,
            CUSTOMER,
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
            LITHIC,
            EXTERNAL,
            CUSTOMER,
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
                LITHIC -> Value.LITHIC
                EXTERNAL -> Value.EXTERNAL
                CUSTOMER -> Value.CUSTOMER
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
                LITHIC -> Known.LITHIC
                EXTERNAL -> Known.EXTERNAL
                CUSTOMER -> Known.CUSTOMER
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

    /** The status of the transaction */
    class TransactionStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val REVERSED = of("REVERSED")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val RETURNED = of("RETURNED")

            @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
        }

        /** An enum containing [TransactionStatus]'s known values. */
        enum class Known {
            PENDING,
            SETTLED,
            DECLINED,
            REVERSED,
            CANCELED,
            RETURNED,
        }

        /**
         * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            SETTLED,
            DECLINED,
            REVERSED,
            CANCELED,
            RETURNED,
            /**
             * An enum member indicating that [TransactionStatus] was instantiated with an unknown
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
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
                CANCELED -> Value.CANCELED
                RETURNED -> Value.RETURNED
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
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
                CANCELED -> Known.CANCELED
                RETURNED -> Known.RETURNED
                else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
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

        fun validate(): TransactionStatus = apply {
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

            return other is TransactionStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{token=$token, category=$category, created=$created, descriptor=$descriptor, direction=$direction, events=$events, family=$family, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, relatedAccountTokens=$relatedAccountTokens, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, currency=$currency, expectedReleaseDate=$expectedReleaseDate, externalBankAccountToken=$externalBankAccountToken, type=$type, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
