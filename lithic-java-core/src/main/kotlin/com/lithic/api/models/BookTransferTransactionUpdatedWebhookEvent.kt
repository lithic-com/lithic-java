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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Book transfer transaction */
class BookTransferTransactionUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<BookTransferResponse.BookTransferCategory>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<BookTransferResponse.BookTransferEvent>>,
    private val family: JsonField<BookTransferResponse.Family>,
    private val fromFinancialAccountToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<BookTransferResponse.TransactionResult>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<BookTransferResponse.TransactionStatus>,
    private val toFinancialAccountToken: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val externalResource: JsonField<ExternalResource>,
    private val transactionSeries: JsonField<BookTransferResponse.TransactionSeries>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<BookTransferResponse.BookTransferCategory> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<BookTransferResponse.BookTransferEvent>> = JsonMissing.of(),
        @JsonProperty("family")
        @ExcludeMissing
        family: JsonField<BookTransferResponse.Family> = JsonMissing.of(),
        @JsonProperty("from_financial_account_token")
        @ExcludeMissing
        fromFinancialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<BookTransferResponse.TransactionResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<BookTransferResponse.TransactionStatus> = JsonMissing.of(),
        @JsonProperty("to_financial_account_token")
        @ExcludeMissing
        toFinancialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_resource")
        @ExcludeMissing
        externalResource: JsonField<ExternalResource> = JsonMissing.of(),
        @JsonProperty("transaction_series")
        @ExcludeMissing
        transactionSeries: JsonField<BookTransferResponse.TransactionSeries> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        category,
        created,
        currency,
        events,
        family,
        fromFinancialAccountToken,
        pendingAmount,
        result,
        settledAmount,
        status,
        toFinancialAccountToken,
        updated,
        externalId,
        externalResource,
        transactionSeries,
        eventType,
        mutableMapOf(),
    )

    fun toBookTransferResponse(): BookTransferResponse =
        BookTransferResponse.builder()
            .token(token)
            .category(category)
            .created(created)
            .currency(currency)
            .events(events)
            .family(family)
            .fromFinancialAccountToken(fromFinancialAccountToken)
            .pendingAmount(pendingAmount)
            .result(result)
            .settledAmount(settledAmount)
            .status(status)
            .toFinancialAccountToken(toFinancialAccountToken)
            .updated(updated)
            .externalId(externalId)
            .externalResource(externalResource)
            .transactionSeries(transactionSeries)
            .build()

    /**
     * Unique identifier for the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): BookTransferResponse.BookTransferCategory = category.getRequired("category")

    /**
     * ISO 8601 timestamp of when the transaction was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code for the settling currency of the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A list of all financial events that have modified this transfer
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<BookTransferResponse.BookTransferEvent> = events.getRequired("events")

    /**
     * TRANSFER - Book Transfer Transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun family(): BookTransferResponse.Family = family.getRequired("family")

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromFinancialAccountToken(): String =
        fromFinancialAccountToken.getRequired("from_financial_account_token")

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees.
     *
     * The value of this field will go to zero over time once the financial transaction is settled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): BookTransferResponse.TransactionResult = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g., cents)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * The status of the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): BookTransferResponse.TransactionStatus = status.getRequired("status")

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toFinancialAccountToken(): String =
        toFinancialAccountToken.getRequired("to_financial_account_token")

    /**
     * ISO 8601 timestamp of when the transaction was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * External ID defined by the customer
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * External resource associated with the management operation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalResource(): Optional<ExternalResource> =
        externalResource.getOptional("external_resource")

    /**
     * A series of transactions that are grouped together
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionSeries(): Optional<BookTransferResponse.TransactionSeries> =
        transactionSeries.getOptional("transaction_series")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

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
    fun _category(): JsonField<BookTransferResponse.BookTransferCategory> = category

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
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<BookTransferResponse.BookTransferEvent>> = events

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family")
    @ExcludeMissing
    fun _family(): JsonField<BookTransferResponse.Family> = family

    /**
     * Returns the raw JSON value of [fromFinancialAccountToken].
     *
     * Unlike [fromFinancialAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("from_financial_account_token")
    @ExcludeMissing
    fun _fromFinancialAccountToken(): JsonField<String> = fromFinancialAccountToken

    /**
     * Returns the raw JSON value of [pendingAmount].
     *
     * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result")
    @ExcludeMissing
    fun _result(): JsonField<BookTransferResponse.TransactionResult> = result

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<BookTransferResponse.TransactionStatus> = status

    /**
     * Returns the raw JSON value of [toFinancialAccountToken].
     *
     * Unlike [toFinancialAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("to_financial_account_token")
    @ExcludeMissing
    fun _toFinancialAccountToken(): JsonField<String> = toFinancialAccountToken

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [externalResource].
     *
     * Unlike [externalResource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_resource")
    @ExcludeMissing
    fun _externalResource(): JsonField<ExternalResource> = externalResource

    /**
     * Returns the raw JSON value of [transactionSeries].
     *
     * Unlike [transactionSeries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_series")
    @ExcludeMissing
    fun _transactionSeries(): JsonField<BookTransferResponse.TransactionSeries> = transactionSeries

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * Returns a mutable builder for constructing an instance of
         * [BookTransferTransactionUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .events()
         * .family()
         * .fromFinancialAccountToken()
         * .pendingAmount()
         * .result()
         * .settledAmount()
         * .status()
         * .toFinancialAccountToken()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookTransferTransactionUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<BookTransferResponse.BookTransferCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var events: JsonField<MutableList<BookTransferResponse.BookTransferEvent>>? = null
        private var family: JsonField<BookTransferResponse.Family>? = null
        private var fromFinancialAccountToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var result: JsonField<BookTransferResponse.TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<BookTransferResponse.TransactionStatus>? = null
        private var toFinancialAccountToken: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var externalResource: JsonField<ExternalResource> = JsonMissing.of()
        private var transactionSeries: JsonField<BookTransferResponse.TransactionSeries> =
            JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            bookTransferTransactionUpdatedWebhookEvent: BookTransferTransactionUpdatedWebhookEvent
        ) = apply {
            token = bookTransferTransactionUpdatedWebhookEvent.token
            category = bookTransferTransactionUpdatedWebhookEvent.category
            created = bookTransferTransactionUpdatedWebhookEvent.created
            currency = bookTransferTransactionUpdatedWebhookEvent.currency
            events = bookTransferTransactionUpdatedWebhookEvent.events.map { it.toMutableList() }
            family = bookTransferTransactionUpdatedWebhookEvent.family
            fromFinancialAccountToken =
                bookTransferTransactionUpdatedWebhookEvent.fromFinancialAccountToken
            pendingAmount = bookTransferTransactionUpdatedWebhookEvent.pendingAmount
            result = bookTransferTransactionUpdatedWebhookEvent.result
            settledAmount = bookTransferTransactionUpdatedWebhookEvent.settledAmount
            status = bookTransferTransactionUpdatedWebhookEvent.status
            toFinancialAccountToken =
                bookTransferTransactionUpdatedWebhookEvent.toFinancialAccountToken
            updated = bookTransferTransactionUpdatedWebhookEvent.updated
            externalId = bookTransferTransactionUpdatedWebhookEvent.externalId
            externalResource = bookTransferTransactionUpdatedWebhookEvent.externalResource
            transactionSeries = bookTransferTransactionUpdatedWebhookEvent.transactionSeries
            eventType = bookTransferTransactionUpdatedWebhookEvent.eventType
            additionalProperties =
                bookTransferTransactionUpdatedWebhookEvent.additionalProperties.toMutableMap()
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

        fun category(category: BookTransferResponse.BookTransferCategory) =
            category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed
         * [BookTransferResponse.BookTransferCategory] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<BookTransferResponse.BookTransferCategory>) = apply {
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

        /** 3-character alphabetic ISO 4217 code for the settling currency of the transaction */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A list of all financial events that have modified this transfer */
        fun events(events: List<BookTransferResponse.BookTransferEvent>) =
            events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed
         * `List<BookTransferResponse.BookTransferEvent>` value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun events(events: JsonField<List<BookTransferResponse.BookTransferEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [BookTransferResponse.BookTransferEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: BookTransferResponse.BookTransferEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** TRANSFER - Book Transfer Transaction */
        fun family(family: BookTransferResponse.Family) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [BookTransferResponse.Family]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun family(family: JsonField<BookTransferResponse.Family>) = apply { this.family = family }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: String) =
            fromFinancialAccountToken(JsonField.of(fromFinancialAccountToken))

        /**
         * Sets [Builder.fromFinancialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromFinancialAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: JsonField<String>) = apply {
            this.fromFinancialAccountToken = fromFinancialAccountToken
        }

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees.
         *
         * The value of this field will go to zero over time once the financial transaction is
         * settled.
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

        fun result(result: BookTransferResponse.TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed
         * [BookTransferResponse.TransactionResult] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<BookTransferResponse.TransactionResult>) = apply {
            this.result = result
        }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents)
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

        /** The status of the transaction */
        fun status(status: BookTransferResponse.TransactionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed
         * [BookTransferResponse.TransactionStatus] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<BookTransferResponse.TransactionStatus>) = apply {
            this.status = status
        }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case
         */
        fun toFinancialAccountToken(toFinancialAccountToken: String) =
            toFinancialAccountToken(JsonField.of(toFinancialAccountToken))

        /**
         * Sets [Builder.toFinancialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toFinancialAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toFinancialAccountToken(toFinancialAccountToken: JsonField<String>) = apply {
            this.toFinancialAccountToken = toFinancialAccountToken
        }

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

        /** External ID defined by the customer */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** External resource associated with the management operation */
        fun externalResource(externalResource: ExternalResource?) =
            externalResource(JsonField.ofNullable(externalResource))

        /** Alias for calling [Builder.externalResource] with `externalResource.orElse(null)`. */
        fun externalResource(externalResource: Optional<ExternalResource>) =
            externalResource(externalResource.getOrNull())

        /**
         * Sets [Builder.externalResource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalResource] with a well-typed [ExternalResource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalResource(externalResource: JsonField<ExternalResource>) = apply {
            this.externalResource = externalResource
        }

        /** A series of transactions that are grouped together */
        fun transactionSeries(transactionSeries: BookTransferResponse.TransactionSeries?) =
            transactionSeries(JsonField.ofNullable(transactionSeries))

        /** Alias for calling [Builder.transactionSeries] with `transactionSeries.orElse(null)`. */
        fun transactionSeries(transactionSeries: Optional<BookTransferResponse.TransactionSeries>) =
            transactionSeries(transactionSeries.getOrNull())

        /**
         * Sets [Builder.transactionSeries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionSeries] with a well-typed
         * [BookTransferResponse.TransactionSeries] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun transactionSeries(
            transactionSeries: JsonField<BookTransferResponse.TransactionSeries>
        ) = apply { this.transactionSeries = transactionSeries }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [BookTransferTransactionUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .events()
         * .family()
         * .fromFinancialAccountToken()
         * .pendingAmount()
         * .result()
         * .settledAmount()
         * .status()
         * .toFinancialAccountToken()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookTransferTransactionUpdatedWebhookEvent =
            BookTransferTransactionUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("family", family),
                checkRequired("fromFinancialAccountToken", fromFinancialAccountToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("toFinancialAccountToken", toFinancialAccountToken),
                checkRequired("updated", updated),
                externalId,
                externalResource,
                transactionSeries,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BookTransferTransactionUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        category().validate()
        created()
        currency()
        events().forEach { it.validate() }
        family().validate()
        fromFinancialAccountToken()
        pendingAmount()
        result().validate()
        settledAmount()
        status().validate()
        toFinancialAccountToken()
        updated()
        externalId()
        externalResource().ifPresent { it.validate() }
        transactionSeries().ifPresent { it.validate() }
        eventType().validate()
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
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (family.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fromFinancialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (pendingAmount.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (toFinancialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (externalResource.asKnown().getOrNull()?.validity() ?: 0) +
            (transactionSeries.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_UPDATED = of("book_transfer_transaction.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            BOOK_TRANSFER_TRANSACTION_UPDATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOK_TRANSFER_TRANSACTION_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                BOOK_TRANSFER_TRANSACTION_UPDATED -> Value.BOOK_TRANSFER_TRANSACTION_UPDATED
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
                BOOK_TRANSFER_TRANSACTION_UPDATED -> Known.BOOK_TRANSFER_TRANSACTION_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookTransferTransactionUpdatedWebhookEvent &&
            token == other.token &&
            category == other.category &&
            created == other.created &&
            currency == other.currency &&
            events == other.events &&
            family == other.family &&
            fromFinancialAccountToken == other.fromFinancialAccountToken &&
            pendingAmount == other.pendingAmount &&
            result == other.result &&
            settledAmount == other.settledAmount &&
            status == other.status &&
            toFinancialAccountToken == other.toFinancialAccountToken &&
            updated == other.updated &&
            externalId == other.externalId &&
            externalResource == other.externalResource &&
            transactionSeries == other.transactionSeries &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            category,
            created,
            currency,
            events,
            family,
            fromFinancialAccountToken,
            pendingAmount,
            result,
            settledAmount,
            status,
            toFinancialAccountToken,
            updated,
            externalId,
            externalResource,
            transactionSeries,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookTransferTransactionUpdatedWebhookEvent{token=$token, category=$category, created=$created, currency=$currency, events=$events, family=$family, fromFinancialAccountToken=$fromFinancialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, toFinancialAccountToken=$toFinancialAccountToken, updated=$updated, externalId=$externalId, externalResource=$externalResource, transactionSeries=$transactionSeries, eventType=$eventType, additionalProperties=$additionalProperties}"
}
