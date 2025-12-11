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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CardTransactionEnhancedDataUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val common: JsonField<EnhancedData.CommonData>,
    private val eventToken: JsonField<String>,
    private val fleet: JsonField<List<EnhancedData.Fleet>>,
    private val transactionToken: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common")
        @ExcludeMissing
        common: JsonField<EnhancedData.CommonData> = JsonMissing.of(),
        @JsonProperty("event_token")
        @ExcludeMissing
        eventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fleet")
        @ExcludeMissing
        fleet: JsonField<List<EnhancedData.Fleet>> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(token, common, eventToken, fleet, transactionToken, eventType, mutableMapOf())

    fun toEnhancedData(): EnhancedData =
        EnhancedData.builder()
            .token(token)
            .common(common)
            .eventToken(eventToken)
            .fleet(fleet)
            .transactionToken(transactionToken)
            .build()

    /**
     * A unique identifier for the enhanced commercial data.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun common(): EnhancedData.CommonData = common.getRequired("common")

    /**
     * The token of the event that the enhanced data is associated with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventToken(): String = eventToken.getRequired("event_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fleet(): List<EnhancedData.Fleet> = fleet.getRequired("fleet")

    /**
     * The token of the transaction that the enhanced data is associated with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

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
     * Returns the raw JSON value of [common].
     *
     * Unlike [common], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("common")
    @ExcludeMissing
    fun _common(): JsonField<EnhancedData.CommonData> = common

    /**
     * Returns the raw JSON value of [eventToken].
     *
     * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /**
     * Returns the raw JSON value of [fleet].
     *
     * Unlike [fleet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleet") @ExcludeMissing fun _fleet(): JsonField<List<EnhancedData.Fleet>> = fleet

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

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
         * [CardTransactionEnhancedDataUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .common()
         * .eventToken()
         * .fleet()
         * .transactionToken()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardTransactionEnhancedDataUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var common: JsonField<EnhancedData.CommonData>? = null
        private var eventToken: JsonField<String>? = null
        private var fleet: JsonField<MutableList<EnhancedData.Fleet>>? = null
        private var transactionToken: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            cardTransactionEnhancedDataUpdatedWebhookEvent:
                CardTransactionEnhancedDataUpdatedWebhookEvent
        ) = apply {
            token = cardTransactionEnhancedDataUpdatedWebhookEvent.token
            common = cardTransactionEnhancedDataUpdatedWebhookEvent.common
            eventToken = cardTransactionEnhancedDataUpdatedWebhookEvent.eventToken
            fleet = cardTransactionEnhancedDataUpdatedWebhookEvent.fleet.map { it.toMutableList() }
            transactionToken = cardTransactionEnhancedDataUpdatedWebhookEvent.transactionToken
            eventType = cardTransactionEnhancedDataUpdatedWebhookEvent.eventType
            additionalProperties =
                cardTransactionEnhancedDataUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the enhanced commercial data. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun common(common: EnhancedData.CommonData) = common(JsonField.of(common))

        /**
         * Sets [Builder.common] to an arbitrary JSON value.
         *
         * You should usually call [Builder.common] with a well-typed [EnhancedData.CommonData]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun common(common: JsonField<EnhancedData.CommonData>) = apply { this.common = common }

        /** The token of the event that the enhanced data is associated with. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /**
         * Sets [Builder.eventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        fun fleet(fleet: List<EnhancedData.Fleet>) = fleet(JsonField.of(fleet))

        /**
         * Sets [Builder.fleet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleet] with a well-typed `List<EnhancedData.Fleet>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fleet(fleet: JsonField<List<EnhancedData.Fleet>>) = apply {
            this.fleet = fleet.map { it.toMutableList() }
        }

        /**
         * Adds a single [EnhancedData.Fleet] to [Builder.fleet].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFleet(fleet: EnhancedData.Fleet) = apply {
            this.fleet =
                (this.fleet ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fleet", it).add(fleet)
                }
        }

        /** The token of the transaction that the enhanced data is associated with. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * Sets [Builder.transactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
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
         * Returns an immutable instance of [CardTransactionEnhancedDataUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .common()
         * .eventToken()
         * .fleet()
         * .transactionToken()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardTransactionEnhancedDataUpdatedWebhookEvent =
            CardTransactionEnhancedDataUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("common", common),
                checkRequired("eventToken", eventToken),
                checkRequired("fleet", fleet).map { it.toImmutable() },
                checkRequired("transactionToken", transactionToken),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardTransactionEnhancedDataUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        common().validate()
        eventToken()
        fleet().forEach { it.validate() }
        transactionToken()
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
            (common.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventToken.asKnown().isPresent) 1 else 0) +
            (fleet.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0) +
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
            val CARD_TRANSACTION_ENHANCED_DATA_UPDATED =
                of("card_transaction.enhanced_data.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_TRANSACTION_ENHANCED_DATA_UPDATED
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
            CARD_TRANSACTION_ENHANCED_DATA_UPDATED,
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
                CARD_TRANSACTION_ENHANCED_DATA_UPDATED ->
                    Value.CARD_TRANSACTION_ENHANCED_DATA_UPDATED
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
                CARD_TRANSACTION_ENHANCED_DATA_UPDATED ->
                    Known.CARD_TRANSACTION_ENHANCED_DATA_UPDATED
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

        return other is CardTransactionEnhancedDataUpdatedWebhookEvent &&
            token == other.token &&
            common == other.common &&
            eventToken == other.eventToken &&
            fleet == other.fleet &&
            transactionToken == other.transactionToken &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            common,
            eventToken,
            fleet,
            transactionToken,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardTransactionEnhancedDataUpdatedWebhookEvent{token=$token, common=$common, eventToken=$eventToken, fleet=$fleet, transactionToken=$transactionToken, eventType=$eventType, additionalProperties=$additionalProperties}"
}
