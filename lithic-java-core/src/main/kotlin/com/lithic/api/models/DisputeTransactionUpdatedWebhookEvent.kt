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

/** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
class DisputeTransactionUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val caseId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val disposition: JsonField<DisputeV2.Disposition>,
    private val events: JsonField<List<DisputeV2.Event>>,
    private val liabilityAllocation: JsonField<DisputeV2.LiabilityAllocation>,
    private val merchant: JsonField<Merchant>,
    private val network: JsonField<DisputeV2.Network>,
    private val status: JsonField<DisputeV2.Status>,
    private val transactionSeries: JsonField<DisputeV2.TransactionSeries>,
    private val updated: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_id") @ExcludeMissing caseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disposition")
        @ExcludeMissing
        disposition: JsonField<DisputeV2.Disposition> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<DisputeV2.Event>> = JsonMissing.of(),
        @JsonProperty("liability_allocation")
        @ExcludeMissing
        liabilityAllocation: JsonField<DisputeV2.LiabilityAllocation> = JsonMissing.of(),
        @JsonProperty("merchant") @ExcludeMissing merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("network")
        @ExcludeMissing
        network: JsonField<DisputeV2.Network> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DisputeV2.Status> = JsonMissing.of(),
        @JsonProperty("transaction_series")
        @ExcludeMissing
        transactionSeries: JsonField<DisputeV2.TransactionSeries> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        cardToken,
        caseId,
        created,
        currency,
        disposition,
        events,
        liabilityAllocation,
        merchant,
        network,
        status,
        transactionSeries,
        updated,
        eventType,
        mutableMapOf(),
    )

    fun toDisputeV2(): DisputeV2 =
        DisputeV2.builder()
            .token(token)
            .accountToken(accountToken)
            .cardToken(cardToken)
            .caseId(caseId)
            .created(created)
            .currency(currency)
            .disposition(disposition)
            .events(events)
            .liabilityAllocation(liabilityAllocation)
            .merchant(merchant)
            .network(network)
            .status(status)
            .transactionSeries(transactionSeries)
            .updated(updated)
            .build()

    /**
     * Token assigned by Lithic for the dispute, in UUID format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Token for the account associated with the dispute, in UUID format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Token for the card used in the dispute, in UUID format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Identifier assigned by the network for this dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun caseId(): Optional<String> = caseId.getOptional("case_id")

    /**
     * When the dispute was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Three-letter ISO 4217 currency code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Dispute resolution outcome
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disposition(): Optional<DisputeV2.Disposition> = disposition.getOptional("disposition")

    /**
     * Chronological list of events that have occurred in the dispute lifecycle
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<DisputeV2.Event> = events.getRequired("events")

    /**
     * Current breakdown of how liability is allocated for the disputed amount
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liabilityAllocation(): DisputeV2.LiabilityAllocation =
        liabilityAllocation.getRequired("liability_allocation")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Card network handling the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): DisputeV2.Network = network.getRequired("network")

    /**
     * Current status of the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<DisputeV2.Status> = status.getOptional("status")

    /**
     * Contains identifiers for the transaction and specific event within being disputed; null if no
     * transaction can be identified
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionSeries(): Optional<DisputeV2.TransactionSeries> =
        transactionSeries.getOptional("transaction_series")

    /**
     * When the dispute was last updated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

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
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [caseId].
     *
     * Unlike [caseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("case_id") @ExcludeMissing fun _caseId(): JsonField<String> = caseId

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
     * Returns the raw JSON value of [disposition].
     *
     * Unlike [disposition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disposition")
    @ExcludeMissing
    fun _disposition(): JsonField<DisputeV2.Disposition> = disposition

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<DisputeV2.Event>> = events

    /**
     * Returns the raw JSON value of [liabilityAllocation].
     *
     * Unlike [liabilityAllocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("liability_allocation")
    @ExcludeMissing
    fun _liabilityAllocation(): JsonField<DisputeV2.LiabilityAllocation> = liabilityAllocation

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<DisputeV2.Network> = network

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DisputeV2.Status> = status

    /**
     * Returns the raw JSON value of [transactionSeries].
     *
     * Unlike [transactionSeries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_series")
    @ExcludeMissing
    fun _transactionSeries(): JsonField<DisputeV2.TransactionSeries> = transactionSeries

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * [DisputeTransactionUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardToken()
         * .caseId()
         * .created()
         * .currency()
         * .disposition()
         * .events()
         * .liabilityAllocation()
         * .merchant()
         * .network()
         * .status()
         * .transactionSeries()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DisputeTransactionUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var caseId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var disposition: JsonField<DisputeV2.Disposition>? = null
        private var events: JsonField<MutableList<DisputeV2.Event>>? = null
        private var liabilityAllocation: JsonField<DisputeV2.LiabilityAllocation>? = null
        private var merchant: JsonField<Merchant>? = null
        private var network: JsonField<DisputeV2.Network>? = null
        private var status: JsonField<DisputeV2.Status>? = null
        private var transactionSeries: JsonField<DisputeV2.TransactionSeries>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            disputeTransactionUpdatedWebhookEvent: DisputeTransactionUpdatedWebhookEvent
        ) = apply {
            token = disputeTransactionUpdatedWebhookEvent.token
            accountToken = disputeTransactionUpdatedWebhookEvent.accountToken
            cardToken = disputeTransactionUpdatedWebhookEvent.cardToken
            caseId = disputeTransactionUpdatedWebhookEvent.caseId
            created = disputeTransactionUpdatedWebhookEvent.created
            currency = disputeTransactionUpdatedWebhookEvent.currency
            disposition = disputeTransactionUpdatedWebhookEvent.disposition
            events = disputeTransactionUpdatedWebhookEvent.events.map { it.toMutableList() }
            liabilityAllocation = disputeTransactionUpdatedWebhookEvent.liabilityAllocation
            merchant = disputeTransactionUpdatedWebhookEvent.merchant
            network = disputeTransactionUpdatedWebhookEvent.network
            status = disputeTransactionUpdatedWebhookEvent.status
            transactionSeries = disputeTransactionUpdatedWebhookEvent.transactionSeries
            updated = disputeTransactionUpdatedWebhookEvent.updated
            eventType = disputeTransactionUpdatedWebhookEvent.eventType
            additionalProperties =
                disputeTransactionUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Token assigned by Lithic for the dispute, in UUID format. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Token for the account associated with the dispute, in UUID format. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Token for the card used in the dispute, in UUID format. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Identifier assigned by the network for this dispute. */
        fun caseId(caseId: String?) = caseId(JsonField.ofNullable(caseId))

        /** Alias for calling [Builder.caseId] with `caseId.orElse(null)`. */
        fun caseId(caseId: Optional<String>) = caseId(caseId.getOrNull())

        /**
         * Sets [Builder.caseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caseId(caseId: JsonField<String>) = apply { this.caseId = caseId }

        /** When the dispute was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Three-letter ISO 4217 currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Dispute resolution outcome */
        fun disposition(disposition: DisputeV2.Disposition?) =
            disposition(JsonField.ofNullable(disposition))

        /** Alias for calling [Builder.disposition] with `disposition.orElse(null)`. */
        fun disposition(disposition: Optional<DisputeV2.Disposition>) =
            disposition(disposition.getOrNull())

        /**
         * Sets [Builder.disposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disposition] with a well-typed [DisputeV2.Disposition]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun disposition(disposition: JsonField<DisputeV2.Disposition>) = apply {
            this.disposition = disposition
        }

        /** Chronological list of events that have occurred in the dispute lifecycle */
        fun events(events: List<DisputeV2.Event>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<DisputeV2.Event>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<DisputeV2.Event>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [DisputeV2.Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: DisputeV2.Event) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** Current breakdown of how liability is allocated for the disputed amount */
        fun liabilityAllocation(liabilityAllocation: DisputeV2.LiabilityAllocation) =
            liabilityAllocation(JsonField.of(liabilityAllocation))

        /**
         * Sets [Builder.liabilityAllocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liabilityAllocation] with a well-typed
         * [DisputeV2.LiabilityAllocation] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun liabilityAllocation(liabilityAllocation: JsonField<DisputeV2.LiabilityAllocation>) =
            apply {
                this.liabilityAllocation = liabilityAllocation
            }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [Merchant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /** Card network handling the dispute. */
        fun network(network: DisputeV2.Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [DisputeV2.Network] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun network(network: JsonField<DisputeV2.Network>) = apply { this.network = network }

        /** Current status of the dispute. */
        fun status(status: DisputeV2.Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<DisputeV2.Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DisputeV2.Status] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<DisputeV2.Status>) = apply { this.status = status }

        /**
         * Contains identifiers for the transaction and specific event within being disputed; null
         * if no transaction can be identified
         */
        fun transactionSeries(transactionSeries: DisputeV2.TransactionSeries?) =
            transactionSeries(JsonField.ofNullable(transactionSeries))

        /** Alias for calling [Builder.transactionSeries] with `transactionSeries.orElse(null)`. */
        fun transactionSeries(transactionSeries: Optional<DisputeV2.TransactionSeries>) =
            transactionSeries(transactionSeries.getOrNull())

        /**
         * Sets [Builder.transactionSeries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionSeries] with a well-typed
         * [DisputeV2.TransactionSeries] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun transactionSeries(transactionSeries: JsonField<DisputeV2.TransactionSeries>) = apply {
            this.transactionSeries = transactionSeries
        }

        /** When the dispute was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [DisputeTransactionUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardToken()
         * .caseId()
         * .created()
         * .currency()
         * .disposition()
         * .events()
         * .liabilityAllocation()
         * .merchant()
         * .network()
         * .status()
         * .transactionSeries()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeTransactionUpdatedWebhookEvent =
            DisputeTransactionUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("cardToken", cardToken),
                checkRequired("caseId", caseId),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("disposition", disposition),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("liabilityAllocation", liabilityAllocation),
                checkRequired("merchant", merchant),
                checkRequired("network", network),
                checkRequired("status", status),
                checkRequired("transactionSeries", transactionSeries),
                checkRequired("updated", updated),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DisputeTransactionUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        cardToken()
        caseId()
        created()
        currency()
        disposition().ifPresent { it.validate() }
        events().forEach { it.validate() }
        liabilityAllocation().validate()
        merchant().validate()
        network().validate()
        status().ifPresent { it.validate() }
        transactionSeries().ifPresent { it.validate() }
        updated()
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
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (caseId.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (disposition.asKnown().getOrNull()?.validity() ?: 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (liabilityAllocation.asKnown().getOrNull()?.validity() ?: 0) +
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (transactionSeries.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
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

            @JvmField val DISPUTE_TRANSACTION_UPDATED = of("dispute_transaction.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            DISPUTE_TRANSACTION_UPDATED
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
            DISPUTE_TRANSACTION_UPDATED,
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
                DISPUTE_TRANSACTION_UPDATED -> Value.DISPUTE_TRANSACTION_UPDATED
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
                DISPUTE_TRANSACTION_UPDATED -> Known.DISPUTE_TRANSACTION_UPDATED
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

        return other is DisputeTransactionUpdatedWebhookEvent &&
            token == other.token &&
            accountToken == other.accountToken &&
            cardToken == other.cardToken &&
            caseId == other.caseId &&
            created == other.created &&
            currency == other.currency &&
            disposition == other.disposition &&
            events == other.events &&
            liabilityAllocation == other.liabilityAllocation &&
            merchant == other.merchant &&
            network == other.network &&
            status == other.status &&
            transactionSeries == other.transactionSeries &&
            updated == other.updated &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            cardToken,
            caseId,
            created,
            currency,
            disposition,
            events,
            liabilityAllocation,
            merchant,
            network,
            status,
            transactionSeries,
            updated,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DisputeTransactionUpdatedWebhookEvent{token=$token, accountToken=$accountToken, cardToken=$cardToken, caseId=$caseId, created=$created, currency=$currency, disposition=$disposition, events=$events, liabilityAllocation=$liabilityAllocation, merchant=$merchant, network=$network, status=$status, transactionSeries=$transactionSeries, updated=$updated, eventType=$eventType, additionalProperties=$additionalProperties}"
}
