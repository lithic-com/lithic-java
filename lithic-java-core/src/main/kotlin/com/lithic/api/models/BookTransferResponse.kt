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

class BookTransferResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val category: JsonField<BookTransferCategory>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<BookTransferEvent>>,
    private val externalId: JsonField<String>,
    private val externalResource: JsonField<ExternalResource>,
    private val fromFinancialAccountToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<TransactionResult>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val toFinancialAccountToken: JsonField<String>,
    private val transactionSeries: JsonField<TransactionSeries>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<BookTransferCategory> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<BookTransferEvent>> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_resource")
        @ExcludeMissing
        externalResource: JsonField<ExternalResource> = JsonMissing.of(),
        @JsonProperty("from_financial_account_token")
        @ExcludeMissing
        fromFinancialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<TransactionResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("to_financial_account_token")
        @ExcludeMissing
        toFinancialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_series")
        @ExcludeMissing
        transactionSeries: JsonField<TransactionSeries> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        category,
        created,
        currency,
        events,
        externalId,
        externalResource,
        fromFinancialAccountToken,
        pendingAmount,
        result,
        settledAmount,
        status,
        toFinancialAccountToken,
        transactionSeries,
        updated,
        mutableMapOf(),
    )

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Category of the book transfer
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): BookTransferCategory = category.getRequired("category")

    /**
     * Date and time when the transfer occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code for the settling currency of the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A list of all financial events that have modified this transfer.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<BookTransferEvent> = events.getRequired("events")

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
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
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
    fun result(): TransactionResult = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     * * `DECLINED` - The transfer was declined.
     * * `REVERSED` - The transfer was reversed
     * * `SETTLED` - The transfer is completed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toFinancialAccountToken(): String =
        toFinancialAccountToken.getRequired("to_financial_account_token")

    /**
     * A series of transactions that are grouped together.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionSeries(): Optional<TransactionSeries> =
        transactionSeries.getOptional("transaction_series")

    /**
     * Date and time when the financial transaction was last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

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
    fun _category(): JsonField<BookTransferCategory> = category

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
    fun _events(): JsonField<List<BookTransferEvent>> = events

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
     * Returns the raw JSON value of [transactionSeries].
     *
     * Unlike [transactionSeries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_series")
    @ExcludeMissing
    fun _transactionSeries(): JsonField<TransactionSeries> = transactionSeries

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [BookTransferResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .events()
         * .externalId()
         * .externalResource()
         * .fromFinancialAccountToken()
         * .pendingAmount()
         * .result()
         * .settledAmount()
         * .status()
         * .toFinancialAccountToken()
         * .transactionSeries()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookTransferResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<BookTransferCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var events: JsonField<MutableList<BookTransferEvent>>? = null
        private var externalId: JsonField<String>? = null
        private var externalResource: JsonField<ExternalResource>? = null
        private var fromFinancialAccountToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var result: JsonField<TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var toFinancialAccountToken: JsonField<String>? = null
        private var transactionSeries: JsonField<TransactionSeries>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookTransferResponse: BookTransferResponse) = apply {
            token = bookTransferResponse.token
            category = bookTransferResponse.category
            created = bookTransferResponse.created
            currency = bookTransferResponse.currency
            events = bookTransferResponse.events.map { it.toMutableList() }
            externalId = bookTransferResponse.externalId
            externalResource = bookTransferResponse.externalResource
            fromFinancialAccountToken = bookTransferResponse.fromFinancialAccountToken
            pendingAmount = bookTransferResponse.pendingAmount
            result = bookTransferResponse.result
            settledAmount = bookTransferResponse.settledAmount
            status = bookTransferResponse.status
            toFinancialAccountToken = bookTransferResponse.toFinancialAccountToken
            transactionSeries = bookTransferResponse.transactionSeries
            updated = bookTransferResponse.updated
            additionalProperties = bookTransferResponse.additionalProperties.toMutableMap()
        }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Category of the book transfer */
        fun category(category: BookTransferCategory) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [BookTransferCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<BookTransferCategory>) = apply { this.category = category }

        /** Date and time when the transfer occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A list of all financial events that have modified this transfer. */
        fun events(events: List<BookTransferEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<BookTransferEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun events(events: JsonField<List<BookTransferEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [BookTransferEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: BookTransferEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

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

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
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

        fun result(result: TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [TransactionResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
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

        /**
         * Status types:
         * * `DECLINED` - The transfer was declined.
         * * `REVERSED` - The transfer was reversed
         * * `SETTLED` - The transfer is completed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
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

        /** A series of transactions that are grouped together. */
        fun transactionSeries(transactionSeries: TransactionSeries?) =
            transactionSeries(JsonField.ofNullable(transactionSeries))

        /** Alias for calling [Builder.transactionSeries] with `transactionSeries.orElse(null)`. */
        fun transactionSeries(transactionSeries: Optional<TransactionSeries>) =
            transactionSeries(transactionSeries.getOrNull())

        /**
         * Sets [Builder.transactionSeries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionSeries] with a well-typed [TransactionSeries]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionSeries(transactionSeries: JsonField<TransactionSeries>) = apply {
            this.transactionSeries = transactionSeries
        }

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
         * Returns an immutable instance of [BookTransferResponse].
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
         * .externalId()
         * .externalResource()
         * .fromFinancialAccountToken()
         * .pendingAmount()
         * .result()
         * .settledAmount()
         * .status()
         * .toFinancialAccountToken()
         * .transactionSeries()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookTransferResponse =
            BookTransferResponse(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("externalId", externalId),
                checkRequired("externalResource", externalResource),
                checkRequired("fromFinancialAccountToken", fromFinancialAccountToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("toFinancialAccountToken", toFinancialAccountToken),
                checkRequired("transactionSeries", transactionSeries),
                checkRequired("updated", updated),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BookTransferResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        category().validate()
        created()
        currency()
        events().forEach { it.validate() }
        externalId()
        externalResource().ifPresent { it.validate() }
        fromFinancialAccountToken()
        pendingAmount()
        result().validate()
        settledAmount()
        status().validate()
        toFinancialAccountToken()
        transactionSeries().ifPresent { it.validate() }
        updated()
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
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (externalResource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fromFinancialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (pendingAmount.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (toFinancialAccountToken.asKnown().isPresent) 1 else 0) +
            (transactionSeries.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    /** Category of the book transfer */
    class BookTransferCategory
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

            @JvmField val ADJUSTMENT = of("ADJUSTMENT")

            @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

            @JvmField val DERECOGNITION = of("DERECOGNITION")

            @JvmField val DISPUTE = of("DISPUTE")

            @JvmField val FEE = of("FEE")

            @JvmField val REWARD = of("REWARD")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = BookTransferCategory(JsonField.of(value))
        }

        /** An enum containing [BookTransferCategory]'s known values. */
        enum class Known {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
        }

        /**
         * An enum containing [BookTransferCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [BookTransferCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
            /**
             * An enum member indicating that [BookTransferCategory] was instantiated with an
             * unknown value.
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
                ADJUSTMENT -> Value.ADJUSTMENT
                BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                DERECOGNITION -> Value.DERECOGNITION
                DISPUTE -> Value.DISPUTE
                FEE -> Value.FEE
                REWARD -> Value.REWARD
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
                ADJUSTMENT -> Known.ADJUSTMENT
                BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                DERECOGNITION -> Known.DERECOGNITION
                DISPUTE -> Known.DISPUTE
                FEE -> Known.FEE
                REWARD -> Known.REWARD
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown BookTransferCategory: $value")
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

        fun validate(): BookTransferCategory = apply {
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

            return other is BookTransferCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Book transfer Event */
    class BookTransferEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val detailedResults: JsonField<BookTransferDetailedResults>,
        private val memo: JsonField<String>,
        private val result: JsonField<Result>,
        private val subtype: JsonField<String>,
        private val type: JsonField<BookTransferType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("detailed_results")
            @ExcludeMissing
            detailedResults: JsonField<BookTransferDetailedResults> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<BookTransferType> = JsonMissing.of(),
        ) : this(
            token,
            amount,
            created,
            detailedResults,
            memo,
            result,
            subtype,
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
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detailedResults(): BookTransferDetailedResults =
            detailedResults.getRequired("detailed_results")

        /**
         * Memo for the transfer.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memo(): String = memo.getRequired("memo")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * The program specific subtype code for the specified category/type.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtype(): String = subtype.getRequired("subtype")

        /**
         * Type of the book transfer
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): BookTransferType = type.getRequired("type")

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
         * Returns the raw JSON value of [detailedResults].
         *
         * Unlike [detailedResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<BookTransferDetailedResults> = detailedResults

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BookTransferType> = type

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
             * Returns a mutable builder for constructing an instance of [BookTransferEvent].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .created()
             * .detailedResults()
             * .memo()
             * .result()
             * .subtype()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BookTransferEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var detailedResults: JsonField<BookTransferDetailedResults>? = null
            private var memo: JsonField<String>? = null
            private var result: JsonField<Result>? = null
            private var subtype: JsonField<String>? = null
            private var type: JsonField<BookTransferType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookTransferEvent: BookTransferEvent) = apply {
                token = bookTransferEvent.token
                amount = bookTransferEvent.amount
                created = bookTransferEvent.created
                detailedResults = bookTransferEvent.detailedResults
                memo = bookTransferEvent.memo
                result = bookTransferEvent.result
                subtype = bookTransferEvent.subtype
                type = bookTransferEvent.type
                additionalProperties = bookTransferEvent.additionalProperties.toMutableMap()
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

            fun detailedResults(detailedResults: BookTransferDetailedResults) =
                detailedResults(JsonField.of(detailedResults))

            /**
             * Sets [Builder.detailedResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailedResults] with a well-typed
             * [BookTransferDetailedResults] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun detailedResults(detailedResults: JsonField<BookTransferDetailedResults>) = apply {
                this.detailedResults = detailedResults
            }

            /** Memo for the transfer. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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

            /** The program specific subtype code for the specified category/type. */
            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

            /** Type of the book transfer */
            fun type(type: BookTransferType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [BookTransferType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<BookTransferType>) = apply { this.type = type }

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
             * Returns an immutable instance of [BookTransferEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .created()
             * .detailedResults()
             * .memo()
             * .result()
             * .subtype()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BookTransferEvent =
                BookTransferEvent(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("created", created),
                    checkRequired("detailedResults", detailedResults),
                    checkRequired("memo", memo),
                    checkRequired("result", result),
                    checkRequired("subtype", subtype),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BookTransferEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            created()
            detailedResults().validate()
            memo()
            result().validate()
            subtype()
            type().validate()
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
                (detailedResults.asKnown().getOrNull()?.validity() ?: 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subtype.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class BookTransferDetailedResults
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

                @JvmStatic fun of(value: String) = BookTransferDetailedResults(JsonField.of(value))
            }

            /** An enum containing [BookTransferDetailedResults]'s known values. */
            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
            }

            /**
             * An enum containing [BookTransferDetailedResults]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [BookTransferDetailedResults] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                /**
                 * An enum member indicating that [BookTransferDetailedResults] was instantiated
                 * with an unknown value.
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
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown BookTransferDetailedResults: $value"
                        )
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

            fun validate(): BookTransferDetailedResults = apply {
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

                return other is BookTransferDetailedResults && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

        /** Type of the book transfer */
        class BookTransferType
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

                @JvmField val ATM_WITHDRAWAL = of("ATM_WITHDRAWAL")

                @JvmField val ATM_DECLINE = of("ATM_DECLINE")

                @JvmField val INTERNATIONAL_ATM_WITHDRAWAL = of("INTERNATIONAL_ATM_WITHDRAWAL")

                @JvmField val INACTIVITY = of("INACTIVITY")

                @JvmField val STATEMENT = of("STATEMENT")

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val CUSTOMER_SERVICE = of("CUSTOMER_SERVICE")

                @JvmField val ACCOUNT_MAINTENANCE = of("ACCOUNT_MAINTENANCE")

                @JvmField val ACCOUNT_ACTIVATION = of("ACCOUNT_ACTIVATION")

                @JvmField val ACCOUNT_CLOSURE = of("ACCOUNT_CLOSURE")

                @JvmField val CARD_REPLACEMENT = of("CARD_REPLACEMENT")

                @JvmField val CARD_DELIVERY = of("CARD_DELIVERY")

                @JvmField val CARD_CREATE = of("CARD_CREATE")

                @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

                @JvmField val INTEREST = of("INTEREST")

                @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

                @JvmField val BILL_PAYMENT = of("BILL_PAYMENT")

                @JvmField val CASH_BACK = of("CASH_BACK")

                @JvmField val ACCOUNT_TO_ACCOUNT = of("ACCOUNT_TO_ACCOUNT")

                @JvmField val CARD_TO_CARD = of("CARD_TO_CARD")

                @JvmField val DISBURSE = of("DISBURSE")

                @JvmField val BILLING_ERROR = of("BILLING_ERROR")

                @JvmField val LOSS_WRITE_OFF = of("LOSS_WRITE_OFF")

                @JvmField val EXPIRED_CARD = of("EXPIRED_CARD")

                @JvmField val EARLY_DERECOGNITION = of("EARLY_DERECOGNITION")

                @JvmField val ESCHEATMENT = of("ESCHEATMENT")

                @JvmField val INACTIVITY_FEE_DOWN = of("INACTIVITY_FEE_DOWN")

                @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                @JvmField val DISPUTE_WON = of("DISPUTE_WON")

                @JvmField val SERVICE = of("SERVICE")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val COLLECTION = of("COLLECTION")

                @JvmStatic fun of(value: String) = BookTransferType(JsonField.of(value))
            }

            /** An enum containing [BookTransferType]'s known values. */
            enum class Known {
                ATM_WITHDRAWAL,
                ATM_DECLINE,
                INTERNATIONAL_ATM_WITHDRAWAL,
                INACTIVITY,
                STATEMENT,
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                CUSTOMER_SERVICE,
                ACCOUNT_MAINTENANCE,
                ACCOUNT_ACTIVATION,
                ACCOUNT_CLOSURE,
                CARD_REPLACEMENT,
                CARD_DELIVERY,
                CARD_CREATE,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILL_PAYMENT,
                CASH_BACK,
                ACCOUNT_TO_ACCOUNT,
                CARD_TO_CARD,
                DISBURSE,
                BILLING_ERROR,
                LOSS_WRITE_OFF,
                EXPIRED_CARD,
                EARLY_DERECOGNITION,
                ESCHEATMENT,
                INACTIVITY_FEE_DOWN,
                PROVISIONAL_CREDIT,
                DISPUTE_WON,
                SERVICE,
                TRANSFER,
                COLLECTION,
            }

            /**
             * An enum containing [BookTransferType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BookTransferType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ATM_WITHDRAWAL,
                ATM_DECLINE,
                INTERNATIONAL_ATM_WITHDRAWAL,
                INACTIVITY,
                STATEMENT,
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                CUSTOMER_SERVICE,
                ACCOUNT_MAINTENANCE,
                ACCOUNT_ACTIVATION,
                ACCOUNT_CLOSURE,
                CARD_REPLACEMENT,
                CARD_DELIVERY,
                CARD_CREATE,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILL_PAYMENT,
                CASH_BACK,
                ACCOUNT_TO_ACCOUNT,
                CARD_TO_CARD,
                DISBURSE,
                BILLING_ERROR,
                LOSS_WRITE_OFF,
                EXPIRED_CARD,
                EARLY_DERECOGNITION,
                ESCHEATMENT,
                INACTIVITY_FEE_DOWN,
                PROVISIONAL_CREDIT,
                DISPUTE_WON,
                SERVICE,
                TRANSFER,
                COLLECTION,
                /**
                 * An enum member indicating that [BookTransferType] was instantiated with an
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
                    ATM_WITHDRAWAL -> Value.ATM_WITHDRAWAL
                    ATM_DECLINE -> Value.ATM_DECLINE
                    INTERNATIONAL_ATM_WITHDRAWAL -> Value.INTERNATIONAL_ATM_WITHDRAWAL
                    INACTIVITY -> Value.INACTIVITY
                    STATEMENT -> Value.STATEMENT
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    CUSTOMER_SERVICE -> Value.CUSTOMER_SERVICE
                    ACCOUNT_MAINTENANCE -> Value.ACCOUNT_MAINTENANCE
                    ACCOUNT_ACTIVATION -> Value.ACCOUNT_ACTIVATION
                    ACCOUNT_CLOSURE -> Value.ACCOUNT_CLOSURE
                    CARD_REPLACEMENT -> Value.CARD_REPLACEMENT
                    CARD_DELIVERY -> Value.CARD_DELIVERY
                    CARD_CREATE -> Value.CARD_CREATE
                    CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                    INTEREST -> Value.INTEREST
                    LATE_PAYMENT -> Value.LATE_PAYMENT
                    BILL_PAYMENT -> Value.BILL_PAYMENT
                    CASH_BACK -> Value.CASH_BACK
                    ACCOUNT_TO_ACCOUNT -> Value.ACCOUNT_TO_ACCOUNT
                    CARD_TO_CARD -> Value.CARD_TO_CARD
                    DISBURSE -> Value.DISBURSE
                    BILLING_ERROR -> Value.BILLING_ERROR
                    LOSS_WRITE_OFF -> Value.LOSS_WRITE_OFF
                    EXPIRED_CARD -> Value.EXPIRED_CARD
                    EARLY_DERECOGNITION -> Value.EARLY_DERECOGNITION
                    ESCHEATMENT -> Value.ESCHEATMENT
                    INACTIVITY_FEE_DOWN -> Value.INACTIVITY_FEE_DOWN
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    DISPUTE_WON -> Value.DISPUTE_WON
                    SERVICE -> Value.SERVICE
                    TRANSFER -> Value.TRANSFER
                    COLLECTION -> Value.COLLECTION
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
                    ATM_WITHDRAWAL -> Known.ATM_WITHDRAWAL
                    ATM_DECLINE -> Known.ATM_DECLINE
                    INTERNATIONAL_ATM_WITHDRAWAL -> Known.INTERNATIONAL_ATM_WITHDRAWAL
                    INACTIVITY -> Known.INACTIVITY
                    STATEMENT -> Known.STATEMENT
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    CUSTOMER_SERVICE -> Known.CUSTOMER_SERVICE
                    ACCOUNT_MAINTENANCE -> Known.ACCOUNT_MAINTENANCE
                    ACCOUNT_ACTIVATION -> Known.ACCOUNT_ACTIVATION
                    ACCOUNT_CLOSURE -> Known.ACCOUNT_CLOSURE
                    CARD_REPLACEMENT -> Known.CARD_REPLACEMENT
                    CARD_DELIVERY -> Known.CARD_DELIVERY
                    CARD_CREATE -> Known.CARD_CREATE
                    CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                    INTEREST -> Known.INTEREST
                    LATE_PAYMENT -> Known.LATE_PAYMENT
                    BILL_PAYMENT -> Known.BILL_PAYMENT
                    CASH_BACK -> Known.CASH_BACK
                    ACCOUNT_TO_ACCOUNT -> Known.ACCOUNT_TO_ACCOUNT
                    CARD_TO_CARD -> Known.CARD_TO_CARD
                    DISBURSE -> Known.DISBURSE
                    BILLING_ERROR -> Known.BILLING_ERROR
                    LOSS_WRITE_OFF -> Known.LOSS_WRITE_OFF
                    EXPIRED_CARD -> Known.EXPIRED_CARD
                    EARLY_DERECOGNITION -> Known.EARLY_DERECOGNITION
                    ESCHEATMENT -> Known.ESCHEATMENT
                    INACTIVITY_FEE_DOWN -> Known.INACTIVITY_FEE_DOWN
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    DISPUTE_WON -> Known.DISPUTE_WON
                    SERVICE -> Known.SERVICE
                    TRANSFER -> Known.TRANSFER
                    COLLECTION -> Known.COLLECTION
                    else -> throw LithicInvalidDataException("Unknown BookTransferType: $value")
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

            fun validate(): BookTransferType = apply {
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

                return other is BookTransferType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BookTransferEvent &&
                token == other.token &&
                amount == other.amount &&
                created == other.created &&
                detailedResults == other.detailedResults &&
                memo == other.memo &&
                result == other.result &&
                subtype == other.subtype &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                amount,
                created,
                detailedResults,
                memo,
                result,
                subtype,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookTransferEvent{token=$token, amount=$amount, created=$created, detailedResults=$detailedResults, memo=$memo, result=$result, subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

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

    /**
     * Status types:
     * * `DECLINED` - The transfer was declined.
     * * `REVERSED` - The transfer was reversed
     * * `SETTLED` - The transfer is completed.
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

            @JvmField val REVERSED = of("REVERSED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DECLINED,
            REVERSED,
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
            REVERSED,
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
                REVERSED -> Value.REVERSED
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
                REVERSED -> Known.REVERSED
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

    /** A series of transactions that are grouped together. */
    class TransactionSeries
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val relatedTransactionEventToken: JsonField<String>,
        private val relatedTransactionToken: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("related_transaction_event_token")
            @ExcludeMissing
            relatedTransactionEventToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("related_transaction_token")
            @ExcludeMissing
            relatedTransactionToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(relatedTransactionEventToken, relatedTransactionToken, type, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relatedTransactionEventToken(): Optional<String> =
            relatedTransactionEventToken.getOptional("related_transaction_event_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relatedTransactionToken(): Optional<String> =
            relatedTransactionToken.getOptional("related_transaction_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Returns the raw JSON value of [relatedTransactionEventToken].
         *
         * Unlike [relatedTransactionEventToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("related_transaction_event_token")
        @ExcludeMissing
        fun _relatedTransactionEventToken(): JsonField<String> = relatedTransactionEventToken

        /**
         * Returns the raw JSON value of [relatedTransactionToken].
         *
         * Unlike [relatedTransactionToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("related_transaction_token")
        @ExcludeMissing
        fun _relatedTransactionToken(): JsonField<String> = relatedTransactionToken

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [TransactionSeries].
             *
             * The following fields are required:
             * ```java
             * .relatedTransactionEventToken()
             * .relatedTransactionToken()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionSeries]. */
        class Builder internal constructor() {

            private var relatedTransactionEventToken: JsonField<String>? = null
            private var relatedTransactionToken: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSeries: TransactionSeries) = apply {
                relatedTransactionEventToken = transactionSeries.relatedTransactionEventToken
                relatedTransactionToken = transactionSeries.relatedTransactionToken
                type = transactionSeries.type
                additionalProperties = transactionSeries.additionalProperties.toMutableMap()
            }

            fun relatedTransactionEventToken(relatedTransactionEventToken: String?) =
                relatedTransactionEventToken(JsonField.ofNullable(relatedTransactionEventToken))

            /**
             * Alias for calling [Builder.relatedTransactionEventToken] with
             * `relatedTransactionEventToken.orElse(null)`.
             */
            fun relatedTransactionEventToken(relatedTransactionEventToken: Optional<String>) =
                relatedTransactionEventToken(relatedTransactionEventToken.getOrNull())

            /**
             * Sets [Builder.relatedTransactionEventToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relatedTransactionEventToken] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun relatedTransactionEventToken(relatedTransactionEventToken: JsonField<String>) =
                apply {
                    this.relatedTransactionEventToken = relatedTransactionEventToken
                }

            fun relatedTransactionToken(relatedTransactionToken: String?) =
                relatedTransactionToken(JsonField.ofNullable(relatedTransactionToken))

            /**
             * Alias for calling [Builder.relatedTransactionToken] with
             * `relatedTransactionToken.orElse(null)`.
             */
            fun relatedTransactionToken(relatedTransactionToken: Optional<String>) =
                relatedTransactionToken(relatedTransactionToken.getOrNull())

            /**
             * Sets [Builder.relatedTransactionToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relatedTransactionToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun relatedTransactionToken(relatedTransactionToken: JsonField<String>) = apply {
                this.relatedTransactionToken = relatedTransactionToken
            }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [TransactionSeries].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .relatedTransactionEventToken()
             * .relatedTransactionToken()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionSeries =
                TransactionSeries(
                    checkRequired("relatedTransactionEventToken", relatedTransactionEventToken),
                    checkRequired("relatedTransactionToken", relatedTransactionToken),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransactionSeries = apply {
            if (validated) {
                return@apply
            }

            relatedTransactionEventToken()
            relatedTransactionToken()
            type()
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
            (if (relatedTransactionEventToken.asKnown().isPresent) 1 else 0) +
                (if (relatedTransactionToken.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSeries &&
                relatedTransactionEventToken == other.relatedTransactionEventToken &&
                relatedTransactionToken == other.relatedTransactionToken &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                relatedTransactionEventToken,
                relatedTransactionToken,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionSeries{relatedTransactionEventToken=$relatedTransactionEventToken, relatedTransactionToken=$relatedTransactionToken, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookTransferResponse &&
            token == other.token &&
            category == other.category &&
            created == other.created &&
            currency == other.currency &&
            events == other.events &&
            externalId == other.externalId &&
            externalResource == other.externalResource &&
            fromFinancialAccountToken == other.fromFinancialAccountToken &&
            pendingAmount == other.pendingAmount &&
            result == other.result &&
            settledAmount == other.settledAmount &&
            status == other.status &&
            toFinancialAccountToken == other.toFinancialAccountToken &&
            transactionSeries == other.transactionSeries &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            category,
            created,
            currency,
            events,
            externalId,
            externalResource,
            fromFinancialAccountToken,
            pendingAmount,
            result,
            settledAmount,
            status,
            toFinancialAccountToken,
            transactionSeries,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookTransferResponse{token=$token, category=$category, created=$created, currency=$currency, events=$events, externalId=$externalId, externalResource=$externalResource, fromFinancialAccountToken=$fromFinancialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, toFinancialAccountToken=$toFinancialAccountToken, transactionSeries=$transactionSeries, updated=$updated, additionalProperties=$additionalProperties}"
}
