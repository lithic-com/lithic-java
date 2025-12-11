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

class ExternalPaymentUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val status: JsonField<ExternalPayment.TransactionStatus>,
    private val updated: JsonField<OffsetDateTime>,
    private val category: JsonField<ExternalPayment.ExternalPaymentCategory>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<ExternalPayment.ExternalPaymentEvent>>,
    private val family: JsonField<ExternalPayment.Family>,
    private val financialAccountToken: JsonField<String>,
    private val paymentType: JsonField<ExternalPayment.ExternalPaymentDirection>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<ExternalPayment.TransactionResult>,
    private val settledAmount: JsonField<Long>,
    private val userDefinedId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<ExternalPayment.TransactionStatus> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<ExternalPayment.ExternalPaymentCategory> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<ExternalPayment.ExternalPaymentEvent>> = JsonMissing.of(),
        @JsonProperty("family")
        @ExcludeMissing
        family: JsonField<ExternalPayment.Family> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_type")
        @ExcludeMissing
        paymentType: JsonField<ExternalPayment.ExternalPaymentDirection> = JsonMissing.of(),
        @JsonProperty("pending_amount")
        @ExcludeMissing
        pendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<ExternalPayment.TransactionResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        created,
        status,
        updated,
        category,
        currency,
        events,
        family,
        financialAccountToken,
        paymentType,
        pendingAmount,
        result,
        settledAmount,
        userDefinedId,
        eventType,
        mutableMapOf(),
    )

    fun toExternalPayment(): ExternalPayment =
        ExternalPayment.builder()
            .token(token)
            .created(created)
            .status(status)
            .updated(updated)
            .category(category)
            .currency(currency)
            .events(events)
            .family(family)
            .financialAccountToken(financialAccountToken)
            .paymentType(paymentType)
            .pendingAmount(pendingAmount)
            .result(result)
            .settledAmount(settledAmount)
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
     * ISO 8601 timestamp of when the transaction was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The status of the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): ExternalPayment.TransactionStatus = status.getRequired("status")

    /**
     * ISO 8601 timestamp of when the transaction was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<ExternalPayment.ExternalPaymentCategory> =
        category.getOptional("category")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<ExternalPayment.ExternalPaymentEvent>> =
        events.getOptional("events")

    /**
     * EXTERNAL_PAYMENT - External Payment Response
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun family(): Optional<ExternalPayment.Family> = family.getOptional("family")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun financialAccountToken(): Optional<String> =
        financialAccountToken.getOptional("financial_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentType(): Optional<ExternalPayment.ExternalPaymentDirection> =
        paymentType.getOptional("payment_type")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingAmount(): Optional<Long> = pendingAmount.getOptional("pending_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<ExternalPayment.TransactionResult> = result.getOptional("result")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settledAmount(): Optional<Long> = settledAmount.getOptional("settled_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<ExternalPayment.TransactionStatus> = status

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<ExternalPayment.ExternalPaymentCategory> = category

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
    fun _events(): JsonField<List<ExternalPayment.ExternalPaymentEvent>> = events

    /**
     * Returns the raw JSON value of [family].
     *
     * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family")
    @ExcludeMissing
    fun _family(): JsonField<ExternalPayment.Family> = family

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
     * Returns the raw JSON value of [paymentType].
     *
     * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_type")
    @ExcludeMissing
    fun _paymentType(): JsonField<ExternalPayment.ExternalPaymentDirection> = paymentType

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
    fun _result(): JsonField<ExternalPayment.TransactionResult> = result

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

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
         * [ExternalPaymentUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .status()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPaymentUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var status: JsonField<ExternalPayment.TransactionStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var category: JsonField<ExternalPayment.ExternalPaymentCategory> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<ExternalPayment.ExternalPaymentEvent>>? = null
        private var family: JsonField<ExternalPayment.Family> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var paymentType: JsonField<ExternalPayment.ExternalPaymentDirection> =
            JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<ExternalPayment.TransactionResult> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPaymentUpdatedWebhookEvent: ExternalPaymentUpdatedWebhookEvent) =
            apply {
                token = externalPaymentUpdatedWebhookEvent.token
                created = externalPaymentUpdatedWebhookEvent.created
                status = externalPaymentUpdatedWebhookEvent.status
                updated = externalPaymentUpdatedWebhookEvent.updated
                category = externalPaymentUpdatedWebhookEvent.category
                currency = externalPaymentUpdatedWebhookEvent.currency
                events = externalPaymentUpdatedWebhookEvent.events.map { it.toMutableList() }
                family = externalPaymentUpdatedWebhookEvent.family
                financialAccountToken = externalPaymentUpdatedWebhookEvent.financialAccountToken
                paymentType = externalPaymentUpdatedWebhookEvent.paymentType
                pendingAmount = externalPaymentUpdatedWebhookEvent.pendingAmount
                result = externalPaymentUpdatedWebhookEvent.result
                settledAmount = externalPaymentUpdatedWebhookEvent.settledAmount
                userDefinedId = externalPaymentUpdatedWebhookEvent.userDefinedId
                eventType = externalPaymentUpdatedWebhookEvent.eventType
                additionalProperties =
                    externalPaymentUpdatedWebhookEvent.additionalProperties.toMutableMap()
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

        /** The status of the transaction */
        fun status(status: ExternalPayment.TransactionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed
         * [ExternalPayment.TransactionStatus] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<ExternalPayment.TransactionStatus>) = apply {
            this.status = status
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

        fun category(category: ExternalPayment.ExternalPaymentCategory) =
            category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed
         * [ExternalPayment.ExternalPaymentCategory] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<ExternalPayment.ExternalPaymentCategory>) = apply {
            this.category = category
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun events(events: List<ExternalPayment.ExternalPaymentEvent>) =
            events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed
         * `List<ExternalPayment.ExternalPaymentEvent>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun events(events: JsonField<List<ExternalPayment.ExternalPaymentEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalPayment.ExternalPaymentEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: ExternalPayment.ExternalPaymentEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** EXTERNAL_PAYMENT - External Payment Response */
        fun family(family: ExternalPayment.Family) = family(JsonField.of(family))

        /**
         * Sets [Builder.family] to an arbitrary JSON value.
         *
         * You should usually call [Builder.family] with a well-typed [ExternalPayment.Family] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun family(family: JsonField<ExternalPayment.Family>) = apply { this.family = family }

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

        fun paymentType(paymentType: ExternalPayment.ExternalPaymentDirection) =
            paymentType(JsonField.of(paymentType))

        /**
         * Sets [Builder.paymentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentType] with a well-typed
         * [ExternalPayment.ExternalPaymentDirection] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun paymentType(paymentType: JsonField<ExternalPayment.ExternalPaymentDirection>) = apply {
            this.paymentType = paymentType
        }

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

        fun result(result: ExternalPayment.TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed
         * [ExternalPayment.TransactionResult] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<ExternalPayment.TransactionResult>) = apply {
            this.result = result
        }

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
         * Returns an immutable instance of [ExternalPaymentUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .status()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalPaymentUpdatedWebhookEvent =
            ExternalPaymentUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("status", status),
                checkRequired("updated", updated),
                category,
                currency,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                family,
                financialAccountToken,
                paymentType,
                pendingAmount,
                result,
                settledAmount,
                userDefinedId,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalPaymentUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        status().validate()
        updated()
        category().ifPresent { it.validate() }
        currency()
        events().ifPresent { it.forEach { it.validate() } }
        family().ifPresent { it.validate() }
        financialAccountToken()
        paymentType().ifPresent { it.validate() }
        pendingAmount()
        result().ifPresent { it.validate() }
        settledAmount()
        userDefinedId()
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
            (if (created.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (family.asKnown().getOrNull()?.validity() ?: 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (paymentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pendingAmount.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (if (userDefinedId.asKnown().isPresent) 1 else 0) +
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

            @JvmField val EXTERNAL_PAYMENT_UPDATED = of("external_payment.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            EXTERNAL_PAYMENT_UPDATED
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
            EXTERNAL_PAYMENT_UPDATED,
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
                EXTERNAL_PAYMENT_UPDATED -> Value.EXTERNAL_PAYMENT_UPDATED
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
                EXTERNAL_PAYMENT_UPDATED -> Known.EXTERNAL_PAYMENT_UPDATED
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

        return other is ExternalPaymentUpdatedWebhookEvent &&
            token == other.token &&
            created == other.created &&
            status == other.status &&
            updated == other.updated &&
            category == other.category &&
            currency == other.currency &&
            events == other.events &&
            family == other.family &&
            financialAccountToken == other.financialAccountToken &&
            paymentType == other.paymentType &&
            pendingAmount == other.pendingAmount &&
            result == other.result &&
            settledAmount == other.settledAmount &&
            userDefinedId == other.userDefinedId &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            created,
            status,
            updated,
            category,
            currency,
            events,
            family,
            financialAccountToken,
            paymentType,
            pendingAmount,
            result,
            settledAmount,
            userDefinedId,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalPaymentUpdatedWebhookEvent{token=$token, created=$created, status=$status, updated=$updated, category=$category, currency=$currency, events=$events, family=$family, financialAccountToken=$financialAccountToken, paymentType=$paymentType, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, userDefinedId=$userDefinedId, eventType=$eventType, additionalProperties=$additionalProperties}"
}
