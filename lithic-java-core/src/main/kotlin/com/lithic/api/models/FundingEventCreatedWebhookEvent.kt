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
import kotlin.jvm.optionals.getOrNull

class FundingEventCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val collectionResourceType: JsonField<FundingEvent.CollectionResourceType>,
    private val collectionTokens: JsonField<List<String>>,
    private val created: JsonField<OffsetDateTime>,
    private val highWatermark: JsonField<OffsetDateTime>,
    private val networkSettlementSummary: JsonField<List<FundingEvent.FundingEventSettlement>>,
    private val previousHighWatermark: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_resource_type")
        @ExcludeMissing
        collectionResourceType: JsonField<FundingEvent.CollectionResourceType> = JsonMissing.of(),
        @JsonProperty("collection_tokens")
        @ExcludeMissing
        collectionTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("high_watermark")
        @ExcludeMissing
        highWatermark: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("network_settlement_summary")
        @ExcludeMissing
        networkSettlementSummary: JsonField<List<FundingEvent.FundingEventSettlement>> =
            JsonMissing.of(),
        @JsonProperty("previous_high_watermark")
        @ExcludeMissing
        previousHighWatermark: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        collectionResourceType,
        collectionTokens,
        created,
        highWatermark,
        networkSettlementSummary,
        previousHighWatermark,
        updated,
        eventType,
        mutableMapOf(),
    )

    fun toFundingEvent(): FundingEvent =
        FundingEvent.builder()
            .token(token)
            .collectionResourceType(collectionResourceType)
            .collectionTokens(collectionTokens)
            .created(created)
            .highWatermark(highWatermark)
            .networkSettlementSummary(networkSettlementSummary)
            .previousHighWatermark(previousHighWatermark)
            .updated(updated)
            .build()

    /**
     * Unique token ID
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Collection resource type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionResourceType(): FundingEvent.CollectionResourceType =
        collectionResourceType.getRequired("collection_resource_type")

    /**
     * IDs of collections, further information can be gathered from the appropriate collection API
     * based on collection_resource_type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionTokens(): List<String> = collectionTokens.getRequired("collection_tokens")

    /**
     * Time of the creation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Time of the high watermark
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun highWatermark(): OffsetDateTime = highWatermark.getRequired("high_watermark")

    /**
     * Network settlement summary breakdown by network settlement date
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun networkSettlementSummary(): List<FundingEvent.FundingEventSettlement> =
        networkSettlementSummary.getRequired("network_settlement_summary")

    /**
     * Time of the previous high watermark
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousHighWatermark(): OffsetDateTime =
        previousHighWatermark.getRequired("previous_high_watermark")

    /**
     * Time of the update
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
     * Returns the raw JSON value of [collectionResourceType].
     *
     * Unlike [collectionResourceType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("collection_resource_type")
    @ExcludeMissing
    fun _collectionResourceType(): JsonField<FundingEvent.CollectionResourceType> =
        collectionResourceType

    /**
     * Returns the raw JSON value of [collectionTokens].
     *
     * Unlike [collectionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collection_tokens")
    @ExcludeMissing
    fun _collectionTokens(): JsonField<List<String>> = collectionTokens

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [highWatermark].
     *
     * Unlike [highWatermark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("high_watermark")
    @ExcludeMissing
    fun _highWatermark(): JsonField<OffsetDateTime> = highWatermark

    /**
     * Returns the raw JSON value of [networkSettlementSummary].
     *
     * Unlike [networkSettlementSummary], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("network_settlement_summary")
    @ExcludeMissing
    fun _networkSettlementSummary(): JsonField<List<FundingEvent.FundingEventSettlement>> =
        networkSettlementSummary

    /**
     * Returns the raw JSON value of [previousHighWatermark].
     *
     * Unlike [previousHighWatermark], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_high_watermark")
    @ExcludeMissing
    fun _previousHighWatermark(): JsonField<OffsetDateTime> = previousHighWatermark

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
         * [FundingEventCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .collectionResourceType()
         * .collectionTokens()
         * .created()
         * .highWatermark()
         * .networkSettlementSummary()
         * .previousHighWatermark()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FundingEventCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var collectionResourceType: JsonField<FundingEvent.CollectionResourceType>? = null
        private var collectionTokens: JsonField<MutableList<String>>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var highWatermark: JsonField<OffsetDateTime>? = null
        private var networkSettlementSummary:
            JsonField<MutableList<FundingEvent.FundingEventSettlement>>? =
            null
        private var previousHighWatermark: JsonField<OffsetDateTime>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingEventCreatedWebhookEvent: FundingEventCreatedWebhookEvent) =
            apply {
                token = fundingEventCreatedWebhookEvent.token
                collectionResourceType = fundingEventCreatedWebhookEvent.collectionResourceType
                collectionTokens =
                    fundingEventCreatedWebhookEvent.collectionTokens.map { it.toMutableList() }
                created = fundingEventCreatedWebhookEvent.created
                highWatermark = fundingEventCreatedWebhookEvent.highWatermark
                networkSettlementSummary =
                    fundingEventCreatedWebhookEvent.networkSettlementSummary.map {
                        it.toMutableList()
                    }
                previousHighWatermark = fundingEventCreatedWebhookEvent.previousHighWatermark
                updated = fundingEventCreatedWebhookEvent.updated
                eventType = fundingEventCreatedWebhookEvent.eventType
                additionalProperties =
                    fundingEventCreatedWebhookEvent.additionalProperties.toMutableMap()
            }

        /** Unique token ID */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Collection resource type */
        fun collectionResourceType(collectionResourceType: FundingEvent.CollectionResourceType) =
            collectionResourceType(JsonField.of(collectionResourceType))

        /**
         * Sets [Builder.collectionResourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionResourceType] with a well-typed
         * [FundingEvent.CollectionResourceType] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun collectionResourceType(
            collectionResourceType: JsonField<FundingEvent.CollectionResourceType>
        ) = apply { this.collectionResourceType = collectionResourceType }

        /**
         * IDs of collections, further information can be gathered from the appropriate collection
         * API based on collection_resource_type
         */
        fun collectionTokens(collectionTokens: List<String>) =
            collectionTokens(JsonField.of(collectionTokens))

        /**
         * Sets [Builder.collectionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionTokens(collectionTokens: JsonField<List<String>>) = apply {
            this.collectionTokens = collectionTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [collectionTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCollectionToken(collectionToken: String) = apply {
            collectionTokens =
                (collectionTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("collectionTokens", it).add(collectionToken)
                }
        }

        /** Time of the creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Time of the high watermark */
        fun highWatermark(highWatermark: OffsetDateTime) =
            highWatermark(JsonField.of(highWatermark))

        /**
         * Sets [Builder.highWatermark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highWatermark] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highWatermark(highWatermark: JsonField<OffsetDateTime>) = apply {
            this.highWatermark = highWatermark
        }

        /** Network settlement summary breakdown by network settlement date */
        fun networkSettlementSummary(
            networkSettlementSummary: List<FundingEvent.FundingEventSettlement>
        ) = networkSettlementSummary(JsonField.of(networkSettlementSummary))

        /**
         * Sets [Builder.networkSettlementSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkSettlementSummary] with a well-typed
         * `List<FundingEvent.FundingEventSettlement>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun networkSettlementSummary(
            networkSettlementSummary: JsonField<List<FundingEvent.FundingEventSettlement>>
        ) = apply {
            this.networkSettlementSummary = networkSettlementSummary.map { it.toMutableList() }
        }

        /**
         * Adds a single [FundingEvent.FundingEventSettlement] to
         * [Builder.networkSettlementSummary].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNetworkSettlementSummary(
            networkSettlementSummary: FundingEvent.FundingEventSettlement
        ) = apply {
            this.networkSettlementSummary =
                (this.networkSettlementSummary ?: JsonField.of(mutableListOf())).also {
                    checkKnown("networkSettlementSummary", it).add(networkSettlementSummary)
                }
        }

        /** Time of the previous high watermark */
        fun previousHighWatermark(previousHighWatermark: OffsetDateTime) =
            previousHighWatermark(JsonField.of(previousHighWatermark))

        /**
         * Sets [Builder.previousHighWatermark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousHighWatermark] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun previousHighWatermark(previousHighWatermark: JsonField<OffsetDateTime>) = apply {
            this.previousHighWatermark = previousHighWatermark
        }

        /** Time of the update */
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
         * Returns an immutable instance of [FundingEventCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .collectionResourceType()
         * .collectionTokens()
         * .created()
         * .highWatermark()
         * .networkSettlementSummary()
         * .previousHighWatermark()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FundingEventCreatedWebhookEvent =
            FundingEventCreatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("collectionResourceType", collectionResourceType),
                checkRequired("collectionTokens", collectionTokens).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("highWatermark", highWatermark),
                checkRequired("networkSettlementSummary", networkSettlementSummary).map {
                    it.toImmutable()
                },
                checkRequired("previousHighWatermark", previousHighWatermark),
                checkRequired("updated", updated),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FundingEventCreatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        collectionResourceType().validate()
        collectionTokens()
        created()
        highWatermark()
        networkSettlementSummary().forEach { it.validate() }
        previousHighWatermark()
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
            (collectionResourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (collectionTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (highWatermark.asKnown().isPresent) 1 else 0) +
            (networkSettlementSummary.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (previousHighWatermark.asKnown().isPresent) 1 else 0) +
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

            @JvmField val FUNDING_EVENT_CREATED = of("funding_event.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            FUNDING_EVENT_CREATED
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
            FUNDING_EVENT_CREATED,
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
                FUNDING_EVENT_CREATED -> Value.FUNDING_EVENT_CREATED
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
                FUNDING_EVENT_CREATED -> Known.FUNDING_EVENT_CREATED
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

        return other is FundingEventCreatedWebhookEvent &&
            token == other.token &&
            collectionResourceType == other.collectionResourceType &&
            collectionTokens == other.collectionTokens &&
            created == other.created &&
            highWatermark == other.highWatermark &&
            networkSettlementSummary == other.networkSettlementSummary &&
            previousHighWatermark == other.previousHighWatermark &&
            updated == other.updated &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            collectionResourceType,
            collectionTokens,
            created,
            highWatermark,
            networkSettlementSummary,
            previousHighWatermark,
            updated,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FundingEventCreatedWebhookEvent{token=$token, collectionResourceType=$collectionResourceType, collectionTokens=$collectionTokens, created=$created, highWatermark=$highWatermark, networkSettlementSummary=$networkSettlementSummary, previousHighWatermark=$previousHighWatermark, updated=$updated, eventType=$eventType, additionalProperties=$additionalProperties}"
}
