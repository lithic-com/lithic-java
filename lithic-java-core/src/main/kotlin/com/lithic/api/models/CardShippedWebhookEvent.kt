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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardShippedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bulkOrderToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val shippingMethod: JsonField<ShippingMethod>,
    private val trackingNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bulk_order_token")
        @ExcludeMissing
        bulkOrderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("shipping_method")
        @ExcludeMissing
        shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        @JsonProperty("tracking_number")
        @ExcludeMissing
        trackingNumber: JsonField<String> = JsonMissing.of(),
    ) : this(bulkOrderToken, cardToken, eventType, shippingMethod, trackingNumber, mutableMapOf())

    /**
     * The token of the bulk order associated with this card shipment, if applicable.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bulkOrderToken(): Optional<String> = bulkOrderToken.getOptional("bulk_order_token")

    /**
     * The token of the card that was shipped.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The specific shipping method used to ship the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shippingMethod(): ShippingMethod = shippingMethod.getRequired("shipping_method")

    /**
     * The tracking number of the shipment.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trackingNumber(): Optional<String> = trackingNumber.getOptional("tracking_number")

    /**
     * Returns the raw JSON value of [bulkOrderToken].
     *
     * Unlike [bulkOrderToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bulk_order_token")
    @ExcludeMissing
    fun _bulkOrderToken(): JsonField<String> = bulkOrderToken

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [shippingMethod].
     *
     * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_method")
    @ExcludeMissing
    fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

    /**
     * Returns the raw JSON value of [trackingNumber].
     *
     * Unlike [trackingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking_number")
    @ExcludeMissing
    fun _trackingNumber(): JsonField<String> = trackingNumber

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
         * Returns a mutable builder for constructing an instance of [CardShippedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .bulkOrderToken()
         * .cardToken()
         * .eventType()
         * .shippingMethod()
         * .trackingNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardShippedWebhookEvent]. */
    class Builder internal constructor() {

        private var bulkOrderToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var shippingMethod: JsonField<ShippingMethod>? = null
        private var trackingNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardShippedWebhookEvent: CardShippedWebhookEvent) = apply {
            bulkOrderToken = cardShippedWebhookEvent.bulkOrderToken
            cardToken = cardShippedWebhookEvent.cardToken
            eventType = cardShippedWebhookEvent.eventType
            shippingMethod = cardShippedWebhookEvent.shippingMethod
            trackingNumber = cardShippedWebhookEvent.trackingNumber
            additionalProperties = cardShippedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The token of the bulk order associated with this card shipment, if applicable. */
        fun bulkOrderToken(bulkOrderToken: String?) =
            bulkOrderToken(JsonField.ofNullable(bulkOrderToken))

        /** Alias for calling [Builder.bulkOrderToken] with `bulkOrderToken.orElse(null)`. */
        fun bulkOrderToken(bulkOrderToken: Optional<String>) =
            bulkOrderToken(bulkOrderToken.getOrNull())

        /**
         * Sets [Builder.bulkOrderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bulkOrderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bulkOrderToken(bulkOrderToken: JsonField<String>) = apply {
            this.bulkOrderToken = bulkOrderToken
        }

        /** The token of the card that was shipped. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

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

        /** The specific shipping method used to ship the card. */
        fun shippingMethod(shippingMethod: ShippingMethod) =
            shippingMethod(JsonField.of(shippingMethod))

        /**
         * Sets [Builder.shippingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
            this.shippingMethod = shippingMethod
        }

        /** The tracking number of the shipment. */
        fun trackingNumber(trackingNumber: String?) =
            trackingNumber(JsonField.ofNullable(trackingNumber))

        /** Alias for calling [Builder.trackingNumber] with `trackingNumber.orElse(null)`. */
        fun trackingNumber(trackingNumber: Optional<String>) =
            trackingNumber(trackingNumber.getOrNull())

        /**
         * Sets [Builder.trackingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trackingNumber(trackingNumber: JsonField<String>) = apply {
            this.trackingNumber = trackingNumber
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
         * Returns an immutable instance of [CardShippedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bulkOrderToken()
         * .cardToken()
         * .eventType()
         * .shippingMethod()
         * .trackingNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardShippedWebhookEvent =
            CardShippedWebhookEvent(
                checkRequired("bulkOrderToken", bulkOrderToken),
                checkRequired("cardToken", cardToken),
                checkRequired("eventType", eventType),
                checkRequired("shippingMethod", shippingMethod),
                checkRequired("trackingNumber", trackingNumber),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardShippedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        bulkOrderToken()
        cardToken()
        eventType().validate()
        shippingMethod().validate()
        trackingNumber()
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
        (if (bulkOrderToken.asKnown().isPresent) 1 else 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (shippingMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trackingNumber.asKnown().isPresent) 1 else 0)

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

            @JvmField val CARD_SHIPPED = of("card.shipped")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_SHIPPED
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
            CARD_SHIPPED,
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
                CARD_SHIPPED -> Value.CARD_SHIPPED
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
                CARD_SHIPPED -> Known.CARD_SHIPPED
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

    /** The specific shipping method used to ship the card. */
    class ShippingMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EX_US_EXPEDITED_WITH_TRACKING = of("Ex-US expedited with tracking")

            @JvmField val EX_US_STANDARD_WITH_TRACKING = of("Ex-US standard with tracking")

            @JvmField val EX_US_STANDARD_WITHOUT_TRACKING = of("Ex-US standard without tracking")

            @JvmField val FED_EX_2_DAYS = of("FedEx 2 days")

            @JvmField val FED_EX_EXPRESS = of("FedEx express")

            @JvmField val FED_EX_OVERNIGHT = of("FedEx overnight")

            @JvmField val USPS_PRIORITY = of("USPS priority")

            @JvmField val USPS_WITH_TRACKING = of("USPS with tracking")

            @JvmField val USPS_WITHOUT_TRACKING_ENVELOPE = of("USPS without tracking envelope")

            @JvmField
            val USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE =
                of("USPS without tracking envelope non-machine")

            @JvmField val USPS_WITHOUT_TRACKING_FLAT = of("USPS without tracking flat")

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        /** An enum containing [ShippingMethod]'s known values. */
        enum class Known {
            EX_US_EXPEDITED_WITH_TRACKING,
            EX_US_STANDARD_WITH_TRACKING,
            EX_US_STANDARD_WITHOUT_TRACKING,
            FED_EX_2_DAYS,
            FED_EX_EXPRESS,
            FED_EX_OVERNIGHT,
            USPS_PRIORITY,
            USPS_WITH_TRACKING,
            USPS_WITHOUT_TRACKING_ENVELOPE,
            USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE,
            USPS_WITHOUT_TRACKING_FLAT,
        }

        /**
         * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EX_US_EXPEDITED_WITH_TRACKING,
            EX_US_STANDARD_WITH_TRACKING,
            EX_US_STANDARD_WITHOUT_TRACKING,
            FED_EX_2_DAYS,
            FED_EX_EXPRESS,
            FED_EX_OVERNIGHT,
            USPS_PRIORITY,
            USPS_WITH_TRACKING,
            USPS_WITHOUT_TRACKING_ENVELOPE,
            USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE,
            USPS_WITHOUT_TRACKING_FLAT,
            /**
             * An enum member indicating that [ShippingMethod] was instantiated with an unknown
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
                EX_US_EXPEDITED_WITH_TRACKING -> Value.EX_US_EXPEDITED_WITH_TRACKING
                EX_US_STANDARD_WITH_TRACKING -> Value.EX_US_STANDARD_WITH_TRACKING
                EX_US_STANDARD_WITHOUT_TRACKING -> Value.EX_US_STANDARD_WITHOUT_TRACKING
                FED_EX_2_DAYS -> Value.FED_EX_2_DAYS
                FED_EX_EXPRESS -> Value.FED_EX_EXPRESS
                FED_EX_OVERNIGHT -> Value.FED_EX_OVERNIGHT
                USPS_PRIORITY -> Value.USPS_PRIORITY
                USPS_WITH_TRACKING -> Value.USPS_WITH_TRACKING
                USPS_WITHOUT_TRACKING_ENVELOPE -> Value.USPS_WITHOUT_TRACKING_ENVELOPE
                USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE ->
                    Value.USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE
                USPS_WITHOUT_TRACKING_FLAT -> Value.USPS_WITHOUT_TRACKING_FLAT
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
                EX_US_EXPEDITED_WITH_TRACKING -> Known.EX_US_EXPEDITED_WITH_TRACKING
                EX_US_STANDARD_WITH_TRACKING -> Known.EX_US_STANDARD_WITH_TRACKING
                EX_US_STANDARD_WITHOUT_TRACKING -> Known.EX_US_STANDARD_WITHOUT_TRACKING
                FED_EX_2_DAYS -> Known.FED_EX_2_DAYS
                FED_EX_EXPRESS -> Known.FED_EX_EXPRESS
                FED_EX_OVERNIGHT -> Known.FED_EX_OVERNIGHT
                USPS_PRIORITY -> Known.USPS_PRIORITY
                USPS_WITH_TRACKING -> Known.USPS_WITH_TRACKING
                USPS_WITHOUT_TRACKING_ENVELOPE -> Known.USPS_WITHOUT_TRACKING_ENVELOPE
                USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE ->
                    Known.USPS_WITHOUT_TRACKING_ENVELOPE_NON_MACHINE
                USPS_WITHOUT_TRACKING_FLAT -> Known.USPS_WITHOUT_TRACKING_FLAT
                else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
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

        fun validate(): ShippingMethod = apply {
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

            return other is ShippingMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardShippedWebhookEvent &&
            bulkOrderToken == other.bulkOrderToken &&
            cardToken == other.cardToken &&
            eventType == other.eventType &&
            shippingMethod == other.shippingMethod &&
            trackingNumber == other.trackingNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bulkOrderToken,
            cardToken,
            eventType,
            shippingMethod,
            trackingNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardShippedWebhookEvent{bulkOrderToken=$bulkOrderToken, cardToken=$cardToken, eventType=$eventType, shippingMethod=$shippingMethod, trackingNumber=$trackingNumber, additionalProperties=$additionalProperties}"
}
