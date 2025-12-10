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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NetworkTotalUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val amounts: JsonField<NetworkTotal.Amounts>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val institutionId: JsonField<String>,
    private val isComplete: JsonField<Boolean>,
    private val network: JsonField<NetworkTotal.Network>,
    private val reportDate: JsonField<LocalDate>,
    private val settlementInstitutionId: JsonField<String>,
    private val settlementService: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val cycle: JsonField<Long>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amounts")
        @ExcludeMissing
        amounts: JsonField<NetworkTotal.Amounts> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("institution_id")
        @ExcludeMissing
        institutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_complete")
        @ExcludeMissing
        isComplete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("network")
        @ExcludeMissing
        network: JsonField<NetworkTotal.Network> = JsonMissing.of(),
        @JsonProperty("report_date")
        @ExcludeMissing
        reportDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("settlement_institution_id")
        @ExcludeMissing
        settlementInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_service")
        @ExcludeMissing
        settlementService: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cycle") @ExcludeMissing cycle: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        amounts,
        created,
        currency,
        institutionId,
        isComplete,
        network,
        reportDate,
        settlementInstitutionId,
        settlementService,
        updated,
        cycle,
        eventType,
        mutableMapOf(),
    )

    fun toNetworkTotal(): NetworkTotal =
        NetworkTotal.builder()
            .token(token)
            .amounts(amounts)
            .created(created)
            .currency(currency)
            .institutionId(institutionId)
            .isComplete(isComplete)
            .network(network)
            .reportDate(reportDate)
            .settlementInstitutionId(settlementInstitutionId)
            .settlementService(settlementService)
            .updated(updated)
            .cycle(cycle)
            .build()

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amounts(): NetworkTotal.Amounts = amounts.getRequired("amounts")

    /**
     * RFC 3339 timestamp for when the record was created. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The institution that activity occurred on. For Mastercard: ICA (Interbank Card Association).
     * For Maestro: institution ID. For Visa: lowest level SRE (Settlement Reporting Entity).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun institutionId(): String = institutionId.getRequired("institution_id")

    /**
     * Indicates that all settlement records related to this Network Total are available in the
     * details endpoint.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isComplete(): Boolean = isComplete.getRequired("is_complete")

    /**
     * Card network where the transaction took place. AMEX, VISA, MASTERCARD, MAESTRO, or INTERLINK.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): NetworkTotal.Network = network.getRequired("network")

    /**
     * Date that the network total record applies to. YYYY-MM-DD format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): LocalDate = reportDate.getRequired("report_date")

    /**
     * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
     * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementInstitutionId(): String =
        settlementInstitutionId.getRequired("settlement_institution_id")

    /**
     * Settlement service.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementService(): String = settlementService.getRequired("settlement_service")

    /**
     * RFC 3339 timestamp for when the record was last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * The clearing cycle that the network total record applies to. Mastercard only.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cycle(): Optional<Long> = cycle.getOptional("cycle")

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
     * Returns the raw JSON value of [amounts].
     *
     * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amounts")
    @ExcludeMissing
    fun _amounts(): JsonField<NetworkTotal.Amounts> = amounts

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
     * Returns the raw JSON value of [institutionId].
     *
     * Unlike [institutionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("institution_id")
    @ExcludeMissing
    fun _institutionId(): JsonField<String> = institutionId

    /**
     * Returns the raw JSON value of [isComplete].
     *
     * Unlike [isComplete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_complete") @ExcludeMissing fun _isComplete(): JsonField<Boolean> = isComplete

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network")
    @ExcludeMissing
    fun _network(): JsonField<NetworkTotal.Network> = network

    /**
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_date")
    @ExcludeMissing
    fun _reportDate(): JsonField<LocalDate> = reportDate

    /**
     * Returns the raw JSON value of [settlementInstitutionId].
     *
     * Unlike [settlementInstitutionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("settlement_institution_id")
    @ExcludeMissing
    fun _settlementInstitutionId(): JsonField<String> = settlementInstitutionId

    /**
     * Returns the raw JSON value of [settlementService].
     *
     * Unlike [settlementService], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_service")
    @ExcludeMissing
    fun _settlementService(): JsonField<String> = settlementService

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [cycle].
     *
     * Unlike [cycle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cycle") @ExcludeMissing fun _cycle(): JsonField<Long> = cycle

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
         * [NetworkTotalUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amounts()
         * .created()
         * .currency()
         * .institutionId()
         * .isComplete()
         * .network()
         * .reportDate()
         * .settlementInstitutionId()
         * .settlementService()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkTotalUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var amounts: JsonField<NetworkTotal.Amounts>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var institutionId: JsonField<String>? = null
        private var isComplete: JsonField<Boolean>? = null
        private var network: JsonField<NetworkTotal.Network>? = null
        private var reportDate: JsonField<LocalDate>? = null
        private var settlementInstitutionId: JsonField<String>? = null
        private var settlementService: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var cycle: JsonField<Long> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkTotalUpdatedWebhookEvent: NetworkTotalUpdatedWebhookEvent) =
            apply {
                token = networkTotalUpdatedWebhookEvent.token
                amounts = networkTotalUpdatedWebhookEvent.amounts
                created = networkTotalUpdatedWebhookEvent.created
                currency = networkTotalUpdatedWebhookEvent.currency
                institutionId = networkTotalUpdatedWebhookEvent.institutionId
                isComplete = networkTotalUpdatedWebhookEvent.isComplete
                network = networkTotalUpdatedWebhookEvent.network
                reportDate = networkTotalUpdatedWebhookEvent.reportDate
                settlementInstitutionId = networkTotalUpdatedWebhookEvent.settlementInstitutionId
                settlementService = networkTotalUpdatedWebhookEvent.settlementService
                updated = networkTotalUpdatedWebhookEvent.updated
                cycle = networkTotalUpdatedWebhookEvent.cycle
                eventType = networkTotalUpdatedWebhookEvent.eventType
                additionalProperties =
                    networkTotalUpdatedWebhookEvent.additionalProperties.toMutableMap()
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

        fun amounts(amounts: NetworkTotal.Amounts) = amounts(JsonField.of(amounts))

        /**
         * Sets [Builder.amounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amounts] with a well-typed [NetworkTotal.Amounts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amounts(amounts: JsonField<NetworkTotal.Amounts>) = apply { this.amounts = amounts }

        /** RFC 3339 timestamp for when the record was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The institution that activity occurred on. For Mastercard: ICA (Interbank Card
         * Association). For Maestro: institution ID. For Visa: lowest level SRE (Settlement
         * Reporting Entity).
         */
        fun institutionId(institutionId: String) = institutionId(JsonField.of(institutionId))

        /**
         * Sets [Builder.institutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.institutionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun institutionId(institutionId: JsonField<String>) = apply {
            this.institutionId = institutionId
        }

        /**
         * Indicates that all settlement records related to this Network Total are available in the
         * details endpoint.
         */
        fun isComplete(isComplete: Boolean) = isComplete(JsonField.of(isComplete))

        /**
         * Sets [Builder.isComplete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isComplete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isComplete(isComplete: JsonField<Boolean>) = apply { this.isComplete = isComplete }

        /**
         * Card network where the transaction took place. AMEX, VISA, MASTERCARD, MAESTRO, or
         * INTERLINK.
         */
        fun network(network: NetworkTotal.Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [NetworkTotal.Network] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun network(network: JsonField<NetworkTotal.Network>) = apply { this.network = network }

        /** Date that the network total record applies to. YYYY-MM-DD format. */
        fun reportDate(reportDate: LocalDate) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportDate(reportDate: JsonField<LocalDate>) = apply { this.reportDate = reportDate }

        /**
         * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
         * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
         */
        fun settlementInstitutionId(settlementInstitutionId: String) =
            settlementInstitutionId(JsonField.of(settlementInstitutionId))

        /**
         * Sets [Builder.settlementInstitutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementInstitutionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlementInstitutionId(settlementInstitutionId: JsonField<String>) = apply {
            this.settlementInstitutionId = settlementInstitutionId
        }

        /** Settlement service. */
        fun settlementService(settlementService: String) =
            settlementService(JsonField.of(settlementService))

        /**
         * Sets [Builder.settlementService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementService] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementService(settlementService: JsonField<String>) = apply {
            this.settlementService = settlementService
        }

        /** RFC 3339 timestamp for when the record was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** The clearing cycle that the network total record applies to. Mastercard only. */
        fun cycle(cycle: Long) = cycle(JsonField.of(cycle))

        /**
         * Sets [Builder.cycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cycle] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cycle(cycle: JsonField<Long>) = apply { this.cycle = cycle }

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
         * Returns an immutable instance of [NetworkTotalUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amounts()
         * .created()
         * .currency()
         * .institutionId()
         * .isComplete()
         * .network()
         * .reportDate()
         * .settlementInstitutionId()
         * .settlementService()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NetworkTotalUpdatedWebhookEvent =
            NetworkTotalUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("amounts", amounts),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("institutionId", institutionId),
                checkRequired("isComplete", isComplete),
                checkRequired("network", network),
                checkRequired("reportDate", reportDate),
                checkRequired("settlementInstitutionId", settlementInstitutionId),
                checkRequired("settlementService", settlementService),
                checkRequired("updated", updated),
                cycle,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NetworkTotalUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        amounts().validate()
        created()
        currency()
        institutionId()
        isComplete()
        network().validate()
        reportDate()
        settlementInstitutionId()
        settlementService()
        updated()
        cycle()
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
            (amounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (institutionId.asKnown().isPresent) 1 else 0) +
            (if (isComplete.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reportDate.asKnown().isPresent) 1 else 0) +
            (if (settlementInstitutionId.asKnown().isPresent) 1 else 0) +
            (if (settlementService.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (cycle.asKnown().isPresent) 1 else 0) +
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

            @JvmField val NETWORK_TOTAL_UPDATED = of("network_total.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            NETWORK_TOTAL_UPDATED
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
            NETWORK_TOTAL_UPDATED,
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
                NETWORK_TOTAL_UPDATED -> Value.NETWORK_TOTAL_UPDATED
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
                NETWORK_TOTAL_UPDATED -> Known.NETWORK_TOTAL_UPDATED
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

        return other is NetworkTotalUpdatedWebhookEvent &&
            token == other.token &&
            amounts == other.amounts &&
            created == other.created &&
            currency == other.currency &&
            institutionId == other.institutionId &&
            isComplete == other.isComplete &&
            network == other.network &&
            reportDate == other.reportDate &&
            settlementInstitutionId == other.settlementInstitutionId &&
            settlementService == other.settlementService &&
            updated == other.updated &&
            cycle == other.cycle &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            amounts,
            created,
            currency,
            institutionId,
            isComplete,
            network,
            reportDate,
            settlementInstitutionId,
            settlementService,
            updated,
            cycle,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkTotalUpdatedWebhookEvent{token=$token, amounts=$amounts, created=$created, currency=$currency, institutionId=$institutionId, isComplete=$isComplete, network=$network, reportDate=$reportDate, settlementInstitutionId=$settlementInstitutionId, settlementService=$settlementService, updated=$updated, cycle=$cycle, eventType=$eventType, additionalProperties=$additionalProperties}"
}
