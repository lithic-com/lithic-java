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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
class DisputeV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val caseId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val disposition: JsonField<Disposition>,
    private val events: JsonField<List<Event>>,
    private val liabilityAllocation: JsonField<LiabilityAllocation>,
    private val merchant: JsonField<Merchant>,
    private val network: JsonField<Network>,
    private val status: JsonField<Status>,
    private val transactionSeries: JsonField<TransactionSeries>,
    private val updated: JsonField<OffsetDateTime>,
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
        disposition: JsonField<Disposition> = JsonMissing.of(),
        @JsonProperty("events") @ExcludeMissing events: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("liability_allocation")
        @ExcludeMissing
        liabilityAllocation: JsonField<LiabilityAllocation> = JsonMissing.of(),
        @JsonProperty("merchant") @ExcludeMissing merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_series")
        @ExcludeMissing
        transactionSeries: JsonField<TransactionSeries> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        mutableMapOf(),
    )

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
    fun disposition(): Optional<Disposition> = disposition.getOptional("disposition")

    /**
     * Chronological list of events that have occurred in the dispute lifecycle
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<Event> = events.getRequired("events")

    /**
     * Current breakdown of how liability is allocated for the disputed amount
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liabilityAllocation(): LiabilityAllocation =
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
    fun network(): Network = network.getRequired("network")

    /**
     * Current status of the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Contains identifiers for the transaction and specific event within being disputed; null if no
     * transaction can be identified
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionSeries(): Optional<TransactionSeries> =
        transactionSeries.getOptional("transaction_series")

    /**
     * When the dispute was last updated.
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
    fun _disposition(): JsonField<Disposition> = disposition

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

    /**
     * Returns the raw JSON value of [liabilityAllocation].
     *
     * Unlike [liabilityAllocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("liability_allocation")
    @ExcludeMissing
    fun _liabilityAllocation(): JsonField<LiabilityAllocation> = liabilityAllocation

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
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [DisputeV2].
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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DisputeV2]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var caseId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var disposition: JsonField<Disposition>? = null
        private var events: JsonField<MutableList<Event>>? = null
        private var liabilityAllocation: JsonField<LiabilityAllocation>? = null
        private var merchant: JsonField<Merchant>? = null
        private var network: JsonField<Network>? = null
        private var status: JsonField<Status>? = null
        private var transactionSeries: JsonField<TransactionSeries>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeV2: DisputeV2) = apply {
            token = disputeV2.token
            accountToken = disputeV2.accountToken
            cardToken = disputeV2.cardToken
            caseId = disputeV2.caseId
            created = disputeV2.created
            currency = disputeV2.currency
            disposition = disputeV2.disposition
            events = disputeV2.events.map { it.toMutableList() }
            liabilityAllocation = disputeV2.liabilityAllocation
            merchant = disputeV2.merchant
            network = disputeV2.network
            status = disputeV2.status
            transactionSeries = disputeV2.transactionSeries
            updated = disputeV2.updated
            additionalProperties = disputeV2.additionalProperties.toMutableMap()
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
        fun disposition(disposition: Disposition?) = disposition(JsonField.ofNullable(disposition))

        /** Alias for calling [Builder.disposition] with `disposition.orElse(null)`. */
        fun disposition(disposition: Optional<Disposition>) = disposition(disposition.getOrNull())

        /**
         * Sets [Builder.disposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disposition] with a well-typed [Disposition] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disposition(disposition: JsonField<Disposition>) = apply {
            this.disposition = disposition
        }

        /** Chronological list of events that have occurred in the dispute lifecycle */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** Current breakdown of how liability is allocated for the disputed amount */
        fun liabilityAllocation(liabilityAllocation: LiabilityAllocation) =
            liabilityAllocation(JsonField.of(liabilityAllocation))

        /**
         * Sets [Builder.liabilityAllocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liabilityAllocation] with a well-typed
         * [LiabilityAllocation] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun liabilityAllocation(liabilityAllocation: JsonField<LiabilityAllocation>) = apply {
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
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Current status of the dispute. */
        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Contains identifiers for the transaction and specific event within being disputed; null
         * if no transaction can be identified
         */
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
         * Returns an immutable instance of [DisputeV2].
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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeV2 =
            DisputeV2(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DisputeV2 = apply {
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
            (if (updated.asKnown().isPresent) 1 else 0)

    /** Dispute resolution outcome */
    class Disposition @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val WON = of("WON")

            @JvmField val LOST = of("LOST")

            @JvmField val PARTIALLY_WON = of("PARTIALLY_WON")

            @JvmField val WITHDRAWN = of("WITHDRAWN")

            @JvmField val DENIED = of("DENIED")

            @JvmStatic fun of(value: String) = Disposition(JsonField.of(value))
        }

        /** An enum containing [Disposition]'s known values. */
        enum class Known {
            WON,
            LOST,
            PARTIALLY_WON,
            WITHDRAWN,
            DENIED,
        }

        /**
         * An enum containing [Disposition]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Disposition] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WON,
            LOST,
            PARTIALLY_WON,
            WITHDRAWN,
            DENIED,
            /**
             * An enum member indicating that [Disposition] was instantiated with an unknown value.
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
                WON -> Value.WON
                LOST -> Value.LOST
                PARTIALLY_WON -> Value.PARTIALLY_WON
                WITHDRAWN -> Value.WITHDRAWN
                DENIED -> Value.DENIED
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
                WON -> Known.WON
                LOST -> Known.LOST
                PARTIALLY_WON -> Known.PARTIALLY_WON
                WITHDRAWN -> Known.WITHDRAWN
                DENIED -> Known.DENIED
                else -> throw LithicInvalidDataException("Unknown Disposition: $value")
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

        fun validate(): Disposition = apply {
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

            return other is Disposition && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Event that occurred in the dispute lifecycle */
    class Event
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val data: JsonField<Data>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(token, created, data, type, mutableMapOf())

        /**
         * Unique identifier for the event, in UUID format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * When the event occurred
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Details specific to the event type
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): Data = data.getRequired("data")

        /**
         * Type of event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

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
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Event].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .created()
             * .data()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var data: JsonField<Data>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                token = event.token
                created = event.created
                data = event.data
                type = event.type
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the event, in UUID format */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** When the event occurred */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Details specific to the event type */
            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /** Alias for calling [data] with `Data.ofWorkflow(workflow)`. */
            fun data(workflow: Data.WorkflowEventData) = data(Data.ofWorkflow(workflow))

            /** Alias for calling [data] with `Data.ofFinancial(financial)`. */
            fun data(financial: Data.FinancialEventData) = data(Data.ofFinancial(financial))

            /** Alias for calling [data] with `Data.ofCardholderLiability(cardholderLiability)`. */
            fun data(cardholderLiability: Data.CardholderLiabilityEventData) =
                data(Data.ofCardholderLiability(cardholderLiability))

            /** Type of event */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .created()
             * .data()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Event =
                Event(
                    checkRequired("token", token),
                    checkRequired("created", created),
                    checkRequired("data", data),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            token()
            created()
            data().validate()
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
                (if (created.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Details specific to the event type */
        @JsonDeserialize(using = Data.Deserializer::class)
        @JsonSerialize(using = Data.Serializer::class)
        class Data
        private constructor(
            private val workflow: WorkflowEventData? = null,
            private val financial: FinancialEventData? = null,
            private val cardholderLiability: CardholderLiabilityEventData? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Details specific to workflow events */
            fun workflow(): Optional<WorkflowEventData> = Optional.ofNullable(workflow)

            /** Details specific to financial events */
            fun financial(): Optional<FinancialEventData> = Optional.ofNullable(financial)

            /** Details specific to cardholder liability events */
            fun cardholderLiability(): Optional<CardholderLiabilityEventData> =
                Optional.ofNullable(cardholderLiability)

            fun isWorkflow(): Boolean = workflow != null

            fun isFinancial(): Boolean = financial != null

            fun isCardholderLiability(): Boolean = cardholderLiability != null

            /** Details specific to workflow events */
            fun asWorkflow(): WorkflowEventData = workflow.getOrThrow("workflow")

            /** Details specific to financial events */
            fun asFinancial(): FinancialEventData = financial.getOrThrow("financial")

            /** Details specific to cardholder liability events */
            fun asCardholderLiability(): CardholderLiabilityEventData =
                cardholderLiability.getOrThrow("cardholderLiability")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    workflow != null -> visitor.visitWorkflow(workflow)
                    financial != null -> visitor.visitFinancial(financial)
                    cardholderLiability != null ->
                        visitor.visitCardholderLiability(cardholderLiability)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitWorkflow(workflow: WorkflowEventData) {
                            workflow.validate()
                        }

                        override fun visitFinancial(financial: FinancialEventData) {
                            financial.validate()
                        }

                        override fun visitCardholderLiability(
                            cardholderLiability: CardholderLiabilityEventData
                        ) {
                            cardholderLiability.validate()
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
                        override fun visitWorkflow(workflow: WorkflowEventData) =
                            workflow.validity()

                        override fun visitFinancial(financial: FinancialEventData) =
                            financial.validity()

                        override fun visitCardholderLiability(
                            cardholderLiability: CardholderLiabilityEventData
                        ) = cardholderLiability.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    workflow == other.workflow &&
                    financial == other.financial &&
                    cardholderLiability == other.cardholderLiability
            }

            override fun hashCode(): Int = Objects.hash(workflow, financial, cardholderLiability)

            override fun toString(): String =
                when {
                    workflow != null -> "Data{workflow=$workflow}"
                    financial != null -> "Data{financial=$financial}"
                    cardholderLiability != null -> "Data{cardholderLiability=$cardholderLiability}"
                    _json != null -> "Data{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Data")
                }

            companion object {

                /** Details specific to workflow events */
                @JvmStatic fun ofWorkflow(workflow: WorkflowEventData) = Data(workflow = workflow)

                /** Details specific to financial events */
                @JvmStatic
                fun ofFinancial(financial: FinancialEventData) = Data(financial = financial)

                /** Details specific to cardholder liability events */
                @JvmStatic
                fun ofCardholderLiability(cardholderLiability: CardholderLiabilityEventData) =
                    Data(cardholderLiability = cardholderLiability)
            }

            /**
             * An interface that defines how to map each variant of [Data] to a value of type [T].
             */
            interface Visitor<out T> {

                /** Details specific to workflow events */
                fun visitWorkflow(workflow: WorkflowEventData): T

                /** Details specific to financial events */
                fun visitFinancial(financial: FinancialEventData): T

                /** Details specific to cardholder liability events */
                fun visitCardholderLiability(cardholderLiability: CardholderLiabilityEventData): T

                /**
                 * Maps an unknown variant of [Data] to a value of type [T].
                 *
                 * An instance of [Data] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LithicInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Data: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Data>(Data::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Data {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "WORKFLOW" -> {
                            return tryDeserialize(node, jacksonTypeRef<WorkflowEventData>())?.let {
                                Data(workflow = it, _json = json)
                            } ?: Data(_json = json)
                        }
                        "FINANCIAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<FinancialEventData>())?.let {
                                Data(financial = it, _json = json)
                            } ?: Data(_json = json)
                        }
                        "CARDHOLDER_LIABILITY" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<CardholderLiabilityEventData>(),
                                )
                                ?.let { Data(cardholderLiability = it, _json = json) }
                                ?: Data(_json = json)
                        }
                    }

                    return Data(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Data>(Data::class) {

                override fun serialize(
                    value: Data,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.workflow != null -> generator.writeObject(value.workflow)
                        value.financial != null -> generator.writeObject(value.financial)
                        value.cardholderLiability != null ->
                            generator.writeObject(value.cardholderLiability)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Data")
                    }
                }
            }

            /** Details specific to workflow events */
            class WorkflowEventData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val amount: JsonField<Long>,
                private val disposition: JsonField<Disposition>,
                private val reason: JsonField<String>,
                private val stage: JsonField<Stage>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("disposition")
                    @ExcludeMissing
                    disposition: JsonField<Disposition> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stage")
                    @ExcludeMissing
                    stage: JsonField<Stage> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(action, amount, disposition, reason, stage, type, mutableMapOf())

                /**
                 * Action taken in this stage
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * Amount in minor units
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * Dispute resolution outcome
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun disposition(): Optional<Disposition> = disposition.getOptional("disposition")

                /**
                 * Reason for the action
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Current stage of the dispute workflow
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun stage(): Stage = stage.getRequired("stage")

                /**
                 * Event type discriminator
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [disposition].
                 *
                 * Unlike [disposition], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("disposition")
                @ExcludeMissing
                fun _disposition(): JsonField<Disposition> = disposition

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * Returns the raw JSON value of [stage].
                 *
                 * Unlike [stage], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stage") @ExcludeMissing fun _stage(): JsonField<Stage> = stage

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * [WorkflowEventData].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .amount()
                     * .disposition()
                     * .reason()
                     * .stage()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WorkflowEventData]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var amount: JsonField<Long>? = null
                    private var disposition: JsonField<Disposition>? = null
                    private var reason: JsonField<String>? = null
                    private var stage: JsonField<Stage>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(workflowEventData: WorkflowEventData) = apply {
                        action = workflowEventData.action
                        amount = workflowEventData.amount
                        disposition = workflowEventData.disposition
                        reason = workflowEventData.reason
                        stage = workflowEventData.stage
                        type = workflowEventData.type
                        additionalProperties = workflowEventData.additionalProperties.toMutableMap()
                    }

                    /** Action taken in this stage */
                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /** Amount in minor units */
                    fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

                    /**
                     * Alias for [Builder.amount].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun amount(amount: Long) = amount(amount as Long?)

                    /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                    fun amount(amount: Optional<Long>) = amount(amount.getOrNull())

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** Dispute resolution outcome */
                    fun disposition(disposition: Disposition?) =
                        disposition(JsonField.ofNullable(disposition))

                    /** Alias for calling [Builder.disposition] with `disposition.orElse(null)`. */
                    fun disposition(disposition: Optional<Disposition>) =
                        disposition(disposition.getOrNull())

                    /**
                     * Sets [Builder.disposition] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.disposition] with a well-typed [Disposition]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun disposition(disposition: JsonField<Disposition>) = apply {
                        this.disposition = disposition
                    }

                    /** Reason for the action */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /** Current stage of the dispute workflow */
                    fun stage(stage: Stage) = stage(JsonField.of(stage))

                    /**
                     * Sets [Builder.stage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stage] with a well-typed [Stage] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun stage(stage: JsonField<Stage>) = apply { this.stage = stage }

                    /** Event type discriminator */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [WorkflowEventData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .amount()
                     * .disposition()
                     * .reason()
                     * .stage()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WorkflowEventData =
                        WorkflowEventData(
                            checkRequired("action", action),
                            checkRequired("amount", amount),
                            checkRequired("disposition", disposition),
                            checkRequired("reason", reason),
                            checkRequired("stage", stage),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WorkflowEventData = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    amount()
                    disposition().ifPresent { it.validate() }
                    reason()
                    stage().validate()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (disposition.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (reason.asKnown().isPresent) 1 else 0) +
                        (stage.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** Action taken in this stage */
                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val OPENED = of("OPENED")

                        @JvmField val CLOSED = of("CLOSED")

                        @JvmField val REOPENED = of("REOPENED")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        OPENED,
                        CLOSED,
                        REOPENED,
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        OPENED,
                        CLOSED,
                        REOPENED,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            OPENED -> Value.OPENED
                            CLOSED -> Value.CLOSED
                            REOPENED -> Value.REOPENED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            OPENED -> Known.OPENED
                            CLOSED -> Known.CLOSED
                            REOPENED -> Known.REOPENED
                            else -> throw LithicInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Dispute resolution outcome */
                class Disposition
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val WON = of("WON")

                        @JvmField val LOST = of("LOST")

                        @JvmField val PARTIALLY_WON = of("PARTIALLY_WON")

                        @JvmField val WITHDRAWN = of("WITHDRAWN")

                        @JvmField val DENIED = of("DENIED")

                        @JvmStatic fun of(value: String) = Disposition(JsonField.of(value))
                    }

                    /** An enum containing [Disposition]'s known values. */
                    enum class Known {
                        WON,
                        LOST,
                        PARTIALLY_WON,
                        WITHDRAWN,
                        DENIED,
                    }

                    /**
                     * An enum containing [Disposition]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Disposition] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        WON,
                        LOST,
                        PARTIALLY_WON,
                        WITHDRAWN,
                        DENIED,
                        /**
                         * An enum member indicating that [Disposition] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            WON -> Value.WON
                            LOST -> Value.LOST
                            PARTIALLY_WON -> Value.PARTIALLY_WON
                            WITHDRAWN -> Value.WITHDRAWN
                            DENIED -> Value.DENIED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            WON -> Known.WON
                            LOST -> Known.LOST
                            PARTIALLY_WON -> Known.PARTIALLY_WON
                            WITHDRAWN -> Known.WITHDRAWN
                            DENIED -> Known.DENIED
                            else -> throw LithicInvalidDataException("Unknown Disposition: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Disposition = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Disposition && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Current stage of the dispute workflow */
                class Stage @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CLAIM = of("CLAIM")

                        @JvmStatic fun of(value: String) = Stage(JsonField.of(value))
                    }

                    /** An enum containing [Stage]'s known values. */
                    enum class Known {
                        CLAIM
                    }

                    /**
                     * An enum containing [Stage]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Stage] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CLAIM,
                        /**
                         * An enum member indicating that [Stage] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CLAIM -> Value.CLAIM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CLAIM -> Known.CLAIM
                            else -> throw LithicInvalidDataException("Unknown Stage: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Stage = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Stage && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Event type discriminator */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val WORKFLOW = of("WORKFLOW")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        WORKFLOW
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        WORKFLOW,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            WORKFLOW -> Value.WORKFLOW
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            WORKFLOW -> Known.WORKFLOW
                            else -> throw LithicInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WorkflowEventData &&
                        action == other.action &&
                        amount == other.amount &&
                        disposition == other.disposition &&
                        reason == other.reason &&
                        stage == other.stage &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        action,
                        amount,
                        disposition,
                        reason,
                        stage,
                        type,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WorkflowEventData{action=$action, amount=$amount, disposition=$disposition, reason=$reason, stage=$stage, type=$type, additionalProperties=$additionalProperties}"
            }

            /** Details specific to financial events */
            class FinancialEventData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val polarity: JsonField<Polarity>,
                private val stage: JsonField<Stage>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("polarity")
                    @ExcludeMissing
                    polarity: JsonField<Polarity> = JsonMissing.of(),
                    @JsonProperty("stage")
                    @ExcludeMissing
                    stage: JsonField<Stage> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(amount, polarity, stage, type, mutableMapOf())

                /**
                 * Amount in minor units
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Direction of funds flow
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun polarity(): Polarity = polarity.getRequired("polarity")

                /**
                 * Stage at which the financial event occurred
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun stage(): Stage = stage.getRequired("stage")

                /**
                 * Event type discriminator
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [polarity].
                 *
                 * Unlike [polarity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("polarity")
                @ExcludeMissing
                fun _polarity(): JsonField<Polarity> = polarity

                /**
                 * Returns the raw JSON value of [stage].
                 *
                 * Unlike [stage], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stage") @ExcludeMissing fun _stage(): JsonField<Stage> = stage

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * [FinancialEventData].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .polarity()
                     * .stage()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FinancialEventData]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var polarity: JsonField<Polarity>? = null
                    private var stage: JsonField<Stage>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(financialEventData: FinancialEventData) = apply {
                        amount = financialEventData.amount
                        polarity = financialEventData.polarity
                        stage = financialEventData.stage
                        type = financialEventData.type
                        additionalProperties =
                            financialEventData.additionalProperties.toMutableMap()
                    }

                    /** Amount in minor units */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** Direction of funds flow */
                    fun polarity(polarity: Polarity) = polarity(JsonField.of(polarity))

                    /**
                     * Sets [Builder.polarity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.polarity] with a well-typed [Polarity] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun polarity(polarity: JsonField<Polarity>) = apply { this.polarity = polarity }

                    /** Stage at which the financial event occurred */
                    fun stage(stage: Stage) = stage(JsonField.of(stage))

                    /**
                     * Sets [Builder.stage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stage] with a well-typed [Stage] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun stage(stage: JsonField<Stage>) = apply { this.stage = stage }

                    /** Event type discriminator */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [FinancialEventData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .polarity()
                     * .stage()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FinancialEventData =
                        FinancialEventData(
                            checkRequired("amount", amount),
                            checkRequired("polarity", polarity),
                            checkRequired("stage", stage),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FinancialEventData = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    polarity().validate()
                    stage().validate()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (polarity.asKnown().getOrNull()?.validity() ?: 0) +
                        (stage.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** Direction of funds flow */
                class Polarity
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CREDIT = of("CREDIT")

                        @JvmField val DEBIT = of("DEBIT")

                        @JvmStatic fun of(value: String) = Polarity(JsonField.of(value))
                    }

                    /** An enum containing [Polarity]'s known values. */
                    enum class Known {
                        CREDIT,
                        DEBIT,
                    }

                    /**
                     * An enum containing [Polarity]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Polarity] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CREDIT,
                        DEBIT,
                        /**
                         * An enum member indicating that [Polarity] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CREDIT -> Known.CREDIT
                            DEBIT -> Known.DEBIT
                            else -> throw LithicInvalidDataException("Unknown Polarity: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Polarity = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Polarity && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Stage at which the financial event occurred */
                class Stage @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CHARGEBACK = of("CHARGEBACK")

                        @JvmField val REPRESENTMENT = of("REPRESENTMENT")

                        @JvmField val PREARBITRATION = of("PREARBITRATION")

                        @JvmField val ARBITRATION = of("ARBITRATION")

                        @JvmField val COLLABORATION = of("COLLABORATION")

                        @JvmStatic fun of(value: String) = Stage(JsonField.of(value))
                    }

                    /** An enum containing [Stage]'s known values. */
                    enum class Known {
                        CHARGEBACK,
                        REPRESENTMENT,
                        PREARBITRATION,
                        ARBITRATION,
                        COLLABORATION,
                    }

                    /**
                     * An enum containing [Stage]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Stage] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CHARGEBACK,
                        REPRESENTMENT,
                        PREARBITRATION,
                        ARBITRATION,
                        COLLABORATION,
                        /**
                         * An enum member indicating that [Stage] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CHARGEBACK -> Value.CHARGEBACK
                            REPRESENTMENT -> Value.REPRESENTMENT
                            PREARBITRATION -> Value.PREARBITRATION
                            ARBITRATION -> Value.ARBITRATION
                            COLLABORATION -> Value.COLLABORATION
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CHARGEBACK -> Known.CHARGEBACK
                            REPRESENTMENT -> Known.REPRESENTMENT
                            PREARBITRATION -> Known.PREARBITRATION
                            ARBITRATION -> Known.ARBITRATION
                            COLLABORATION -> Known.COLLABORATION
                            else -> throw LithicInvalidDataException("Unknown Stage: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Stage = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Stage && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Event type discriminator */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FINANCIAL = of("FINANCIAL")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        FINANCIAL
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FINANCIAL,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FINANCIAL -> Value.FINANCIAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FINANCIAL -> Known.FINANCIAL
                            else -> throw LithicInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FinancialEventData &&
                        amount == other.amount &&
                        polarity == other.polarity &&
                        stage == other.stage &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, polarity, stage, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FinancialEventData{amount=$amount, polarity=$polarity, stage=$stage, type=$type, additionalProperties=$additionalProperties}"
            }

            /** Details specific to cardholder liability events */
            class CardholderLiabilityEventData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val amount: JsonField<Long>,
                private val reason: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(action, amount, reason, type, mutableMapOf())

                /**
                 * Action taken regarding cardholder liability
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * Amount in minor units
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Reason for the action
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun reason(): String = reason.getRequired("reason")

                /**
                 * Event type discriminator
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * [CardholderLiabilityEventData].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .amount()
                     * .reason()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardholderLiabilityEventData]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var amount: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholderLiabilityEventData: CardholderLiabilityEventData) =
                        apply {
                            action = cardholderLiabilityEventData.action
                            amount = cardholderLiabilityEventData.amount
                            reason = cardholderLiabilityEventData.reason
                            type = cardholderLiabilityEventData.type
                            additionalProperties =
                                cardholderLiabilityEventData.additionalProperties.toMutableMap()
                        }

                    /** Action taken regarding cardholder liability */
                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /** Amount in minor units */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** Reason for the action */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /** Event type discriminator */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [CardholderLiabilityEventData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .amount()
                     * .reason()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CardholderLiabilityEventData =
                        CardholderLiabilityEventData(
                            checkRequired("action", action),
                            checkRequired("amount", amount),
                            checkRequired("reason", reason),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CardholderLiabilityEventData = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    amount()
                    reason()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** Action taken regarding cardholder liability */
                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PROVISIONAL_CREDIT_GRANTED = of("PROVISIONAL_CREDIT_GRANTED")

                        @JvmField
                        val PROVISIONAL_CREDIT_REVERSED = of("PROVISIONAL_CREDIT_REVERSED")

                        @JvmField val WRITTEN_OFF = of("WRITTEN_OFF")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        PROVISIONAL_CREDIT_GRANTED,
                        PROVISIONAL_CREDIT_REVERSED,
                        WRITTEN_OFF,
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PROVISIONAL_CREDIT_GRANTED,
                        PROVISIONAL_CREDIT_REVERSED,
                        WRITTEN_OFF,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PROVISIONAL_CREDIT_GRANTED -> Value.PROVISIONAL_CREDIT_GRANTED
                            PROVISIONAL_CREDIT_REVERSED -> Value.PROVISIONAL_CREDIT_REVERSED
                            WRITTEN_OFF -> Value.WRITTEN_OFF
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PROVISIONAL_CREDIT_GRANTED -> Known.PROVISIONAL_CREDIT_GRANTED
                            PROVISIONAL_CREDIT_REVERSED -> Known.PROVISIONAL_CREDIT_REVERSED
                            WRITTEN_OFF -> Known.WRITTEN_OFF
                            else -> throw LithicInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Event type discriminator */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CARDHOLDER_LIABILITY = of("CARDHOLDER_LIABILITY")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CARDHOLDER_LIABILITY
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CARDHOLDER_LIABILITY,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CARDHOLDER_LIABILITY -> Value.CARDHOLDER_LIABILITY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CARDHOLDER_LIABILITY -> Known.CARDHOLDER_LIABILITY
                            else -> throw LithicInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardholderLiabilityEventData &&
                        action == other.action &&
                        amount == other.amount &&
                        reason == other.reason &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, amount, reason, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardholderLiabilityEventData{action=$action, amount=$amount, reason=$reason, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        /** Type of event */
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

                @JvmField val WORKFLOW = of("WORKFLOW")

                @JvmField val FINANCIAL = of("FINANCIAL")

                @JvmField val CARDHOLDER_LIABILITY = of("CARDHOLDER_LIABILITY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                WORKFLOW,
                FINANCIAL,
                CARDHOLDER_LIABILITY,
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
                WORKFLOW,
                FINANCIAL,
                CARDHOLDER_LIABILITY,
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
                    WORKFLOW -> Value.WORKFLOW
                    FINANCIAL -> Value.FINANCIAL
                    CARDHOLDER_LIABILITY -> Value.CARDHOLDER_LIABILITY
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
                    WORKFLOW -> Known.WORKFLOW
                    FINANCIAL -> Known.FINANCIAL
                    CARDHOLDER_LIABILITY -> Known.CARDHOLDER_LIABILITY
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                token == other.token &&
                created == other.created &&
                data == other.data &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(token, created, data, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{token=$token, created=$created, data=$data, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Current breakdown of how liability is allocated for the disputed amount */
    class LiabilityAllocation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deniedAmount: JsonField<Long>,
        private val originalAmount: JsonField<Long>,
        private val recoveredAmount: JsonField<Long>,
        private val remainingAmount: JsonField<Long>,
        private val writtenOffAmount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("denied_amount")
            @ExcludeMissing
            deniedAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("original_amount")
            @ExcludeMissing
            originalAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("recovered_amount")
            @ExcludeMissing
            recoveredAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("remaining_amount")
            @ExcludeMissing
            remainingAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("written_off_amount")
            @ExcludeMissing
            writtenOffAmount: JsonField<Long> = JsonMissing.of(),
        ) : this(
            deniedAmount,
            originalAmount,
            recoveredAmount,
            remainingAmount,
            writtenOffAmount,
            mutableMapOf(),
        )

        /**
         * The amount that has been denied to the cardholder
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deniedAmount(): Long = deniedAmount.getRequired("denied_amount")

        /**
         * The initial amount disputed
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originalAmount(): Long = originalAmount.getRequired("original_amount")

        /**
         * The amount that has been recovered from the merchant through the dispute process
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recoveredAmount(): Long = recoveredAmount.getRequired("recovered_amount")

        /**
         * Any disputed amount that is still outstanding, i.e. has not been recovered, written off,
         * or denied
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun remainingAmount(): Long = remainingAmount.getRequired("remaining_amount")

        /**
         * The amount the issuer has chosen to write off
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun writtenOffAmount(): Long = writtenOffAmount.getRequired("written_off_amount")

        /**
         * Returns the raw JSON value of [deniedAmount].
         *
         * Unlike [deniedAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("denied_amount")
        @ExcludeMissing
        fun _deniedAmount(): JsonField<Long> = deniedAmount

        /**
         * Returns the raw JSON value of [originalAmount].
         *
         * Unlike [originalAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("original_amount")
        @ExcludeMissing
        fun _originalAmount(): JsonField<Long> = originalAmount

        /**
         * Returns the raw JSON value of [recoveredAmount].
         *
         * Unlike [recoveredAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recovered_amount")
        @ExcludeMissing
        fun _recoveredAmount(): JsonField<Long> = recoveredAmount

        /**
         * Returns the raw JSON value of [remainingAmount].
         *
         * Unlike [remainingAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remaining_amount")
        @ExcludeMissing
        fun _remainingAmount(): JsonField<Long> = remainingAmount

        /**
         * Returns the raw JSON value of [writtenOffAmount].
         *
         * Unlike [writtenOffAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("written_off_amount")
        @ExcludeMissing
        fun _writtenOffAmount(): JsonField<Long> = writtenOffAmount

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
             * Returns a mutable builder for constructing an instance of [LiabilityAllocation].
             *
             * The following fields are required:
             * ```java
             * .deniedAmount()
             * .originalAmount()
             * .recoveredAmount()
             * .remainingAmount()
             * .writtenOffAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LiabilityAllocation]. */
        class Builder internal constructor() {

            private var deniedAmount: JsonField<Long>? = null
            private var originalAmount: JsonField<Long>? = null
            private var recoveredAmount: JsonField<Long>? = null
            private var remainingAmount: JsonField<Long>? = null
            private var writtenOffAmount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(liabilityAllocation: LiabilityAllocation) = apply {
                deniedAmount = liabilityAllocation.deniedAmount
                originalAmount = liabilityAllocation.originalAmount
                recoveredAmount = liabilityAllocation.recoveredAmount
                remainingAmount = liabilityAllocation.remainingAmount
                writtenOffAmount = liabilityAllocation.writtenOffAmount
                additionalProperties = liabilityAllocation.additionalProperties.toMutableMap()
            }

            /** The amount that has been denied to the cardholder */
            fun deniedAmount(deniedAmount: Long) = deniedAmount(JsonField.of(deniedAmount))

            /**
             * Sets [Builder.deniedAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deniedAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deniedAmount(deniedAmount: JsonField<Long>) = apply {
                this.deniedAmount = deniedAmount
            }

            /** The initial amount disputed */
            fun originalAmount(originalAmount: Long) = originalAmount(JsonField.of(originalAmount))

            /**
             * Sets [Builder.originalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originalAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originalAmount(originalAmount: JsonField<Long>) = apply {
                this.originalAmount = originalAmount
            }

            /** The amount that has been recovered from the merchant through the dispute process */
            fun recoveredAmount(recoveredAmount: Long) =
                recoveredAmount(JsonField.of(recoveredAmount))

            /**
             * Sets [Builder.recoveredAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recoveredAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recoveredAmount(recoveredAmount: JsonField<Long>) = apply {
                this.recoveredAmount = recoveredAmount
            }

            /**
             * Any disputed amount that is still outstanding, i.e. has not been recovered, written
             * off, or denied
             */
            fun remainingAmount(remainingAmount: Long) =
                remainingAmount(JsonField.of(remainingAmount))

            /**
             * Sets [Builder.remainingAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remainingAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remainingAmount(remainingAmount: JsonField<Long>) = apply {
                this.remainingAmount = remainingAmount
            }

            /** The amount the issuer has chosen to write off */
            fun writtenOffAmount(writtenOffAmount: Long) =
                writtenOffAmount(JsonField.of(writtenOffAmount))

            /**
             * Sets [Builder.writtenOffAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.writtenOffAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun writtenOffAmount(writtenOffAmount: JsonField<Long>) = apply {
                this.writtenOffAmount = writtenOffAmount
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
             * Returns an immutable instance of [LiabilityAllocation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deniedAmount()
             * .originalAmount()
             * .recoveredAmount()
             * .remainingAmount()
             * .writtenOffAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LiabilityAllocation =
                LiabilityAllocation(
                    checkRequired("deniedAmount", deniedAmount),
                    checkRequired("originalAmount", originalAmount),
                    checkRequired("recoveredAmount", recoveredAmount),
                    checkRequired("remainingAmount", remainingAmount),
                    checkRequired("writtenOffAmount", writtenOffAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LiabilityAllocation = apply {
            if (validated) {
                return@apply
            }

            deniedAmount()
            originalAmount()
            recoveredAmount()
            remainingAmount()
            writtenOffAmount()
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
            (if (deniedAmount.asKnown().isPresent) 1 else 0) +
                (if (originalAmount.asKnown().isPresent) 1 else 0) +
                (if (recoveredAmount.asKnown().isPresent) 1 else 0) +
                (if (remainingAmount.asKnown().isPresent) 1 else 0) +
                (if (writtenOffAmount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LiabilityAllocation &&
                deniedAmount == other.deniedAmount &&
                originalAmount == other.originalAmount &&
                recoveredAmount == other.recoveredAmount &&
                remainingAmount == other.remainingAmount &&
                writtenOffAmount == other.writtenOffAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                deniedAmount,
                originalAmount,
                recoveredAmount,
                remainingAmount,
                writtenOffAmount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LiabilityAllocation{deniedAmount=$deniedAmount, originalAmount=$originalAmount, recoveredAmount=$recoveredAmount, remainingAmount=$remainingAmount, writtenOffAmount=$writtenOffAmount, additionalProperties=$additionalProperties}"
    }

    /** Card network handling the dispute. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VISA = of("VISA")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            VISA,
            MASTERCARD,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VISA,
            MASTERCARD,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
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
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                else -> throw LithicInvalidDataException("Unknown Network: $value")
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

        fun validate(): Network = apply {
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

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current status of the dispute. */
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

            @JvmField val OPEN = of("OPEN")

            @JvmField val CLOSED = of("CLOSED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            CLOSED,
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
            OPEN,
            CLOSED,
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
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
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
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
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

    /**
     * Contains identifiers for the transaction and specific event within being disputed; null if no
     * transaction can be identified
     */
    class TransactionSeries
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val relatedTransactionEventToken: JsonField<String>,
        private val relatedTransactionToken: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(relatedTransactionEventToken, relatedTransactionToken, type, mutableMapOf())

        /**
         * Token of the specific event in the original transaction being disputed, in UUID format;
         * null if no event can be identified
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relatedTransactionEventToken(): Optional<String> =
            relatedTransactionEventToken.getOptional("related_transaction_event_token")

        /**
         * Token of the original transaction being disputed, in UUID format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun relatedTransactionToken(): String =
            relatedTransactionToken.getRequired("related_transaction_token")

        /**
         * The type of transaction series associating the dispute and the original transaction.
         * Always set to DISPUTE
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSeries: TransactionSeries) = apply {
                relatedTransactionEventToken = transactionSeries.relatedTransactionEventToken
                relatedTransactionToken = transactionSeries.relatedTransactionToken
                type = transactionSeries.type
                additionalProperties = transactionSeries.additionalProperties.toMutableMap()
            }

            /**
             * Token of the specific event in the original transaction being disputed, in UUID
             * format; null if no event can be identified
             */
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

            /** Token of the original transaction being disputed, in UUID format */
            fun relatedTransactionToken(relatedTransactionToken: String) =
                relatedTransactionToken(JsonField.of(relatedTransactionToken))

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

            /**
             * The type of transaction series associating the dispute and the original transaction.
             * Always set to DISPUTE
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
            (if (relatedTransactionEventToken.asKnown().isPresent) 1 else 0) +
                (if (relatedTransactionToken.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The type of transaction series associating the dispute and the original transaction.
         * Always set to DISPUTE
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

                @JvmField val DISPUTE = of("DISPUTE")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DISPUTE
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
                DISPUTE,
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
                    DISPUTE -> Value.DISPUTE
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
                    DISPUTE -> Known.DISPUTE
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

        return other is DisputeV2 &&
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DisputeV2{token=$token, accountToken=$accountToken, cardToken=$cardToken, caseId=$caseId, created=$created, currency=$currency, disposition=$disposition, events=$events, liabilityAllocation=$liabilityAllocation, merchant=$merchant, network=$network, status=$status, transactionSeries=$transactionSeries, updated=$updated, additionalProperties=$additionalProperties}"
}
