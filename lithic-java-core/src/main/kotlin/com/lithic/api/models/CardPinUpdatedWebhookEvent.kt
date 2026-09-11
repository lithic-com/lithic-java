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
import kotlin.jvm.optionals.getOrNull

class CardPinUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cardToken: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val pinStatus: JsonField<PinStatus>,
    private val statusReason: JsonField<StatusReason>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("pin_status")
        @ExcludeMissing
        pinStatus: JsonField<PinStatus> = JsonMissing.of(),
        @JsonProperty("status_reason")
        @ExcludeMissing
        statusReason: JsonField<StatusReason> = JsonMissing.of(),
    ) : this(cardToken, eventType, pinStatus, statusReason, mutableMapOf())

    /**
     * The token of the card whose PIN or PIN status was updated
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
     * The card's PIN status after the update
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pinStatus(): PinStatus = pinStatus.getRequired("pin_status")

    /**
     * The reason for the PIN update:
     * * `PIN_SET` - The PIN was set for the first time; `pin_status` is `OK`
     * * `PIN_CHANGED` - The PIN was changed, including when changing a blocked PIN; `pin_status` is
     *   `OK`
     * * `PIN_UNBLOCKED` - The PIN was unblocked without changing it; `pin_status` is `OK`
     * * `EXCESSIVE_PIN_ATTEMPTS` - The PIN was blocked due to excessive incorrect PIN attempts;
     *   `pin_status` is `BLOCKED`
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusReason(): StatusReason = statusReason.getRequired("status_reason")

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
     * Returns the raw JSON value of [pinStatus].
     *
     * Unlike [pinStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin_status") @ExcludeMissing fun _pinStatus(): JsonField<PinStatus> = pinStatus

    /**
     * Returns the raw JSON value of [statusReason].
     *
     * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_reason")
    @ExcludeMissing
    fun _statusReason(): JsonField<StatusReason> = statusReason

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
         * Returns a mutable builder for constructing an instance of [CardPinUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * .eventType()
         * .pinStatus()
         * .statusReason()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPinUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var cardToken: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var pinStatus: JsonField<PinStatus>? = null
        private var statusReason: JsonField<StatusReason>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPinUpdatedWebhookEvent: CardPinUpdatedWebhookEvent) = apply {
            cardToken = cardPinUpdatedWebhookEvent.cardToken
            eventType = cardPinUpdatedWebhookEvent.eventType
            pinStatus = cardPinUpdatedWebhookEvent.pinStatus
            statusReason = cardPinUpdatedWebhookEvent.statusReason
            additionalProperties = cardPinUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The token of the card whose PIN or PIN status was updated */
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

        /** The card's PIN status after the update */
        fun pinStatus(pinStatus: PinStatus) = pinStatus(JsonField.of(pinStatus))

        /**
         * Sets [Builder.pinStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinStatus] with a well-typed [PinStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pinStatus(pinStatus: JsonField<PinStatus>) = apply { this.pinStatus = pinStatus }

        /**
         * The reason for the PIN update:
         * * `PIN_SET` - The PIN was set for the first time; `pin_status` is `OK`
         * * `PIN_CHANGED` - The PIN was changed, including when changing a blocked PIN;
         *   `pin_status` is `OK`
         * * `PIN_UNBLOCKED` - The PIN was unblocked without changing it; `pin_status` is `OK`
         * * `EXCESSIVE_PIN_ATTEMPTS` - The PIN was blocked due to excessive incorrect PIN attempts;
         *   `pin_status` is `BLOCKED`
         */
        fun statusReason(statusReason: StatusReason) = statusReason(JsonField.of(statusReason))

        /**
         * Sets [Builder.statusReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReason] with a well-typed [StatusReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusReason(statusReason: JsonField<StatusReason>) = apply {
            this.statusReason = statusReason
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
         * Returns an immutable instance of [CardPinUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * .eventType()
         * .pinStatus()
         * .statusReason()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPinUpdatedWebhookEvent =
            CardPinUpdatedWebhookEvent(
                checkRequired("cardToken", cardToken),
                checkRequired("eventType", eventType),
                checkRequired("pinStatus", pinStatus),
                checkRequired("statusReason", statusReason),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CardPinUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        cardToken()
        eventType().validate()
        pinStatus().validate()
        statusReason().validate()
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
        (if (cardToken.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (pinStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (statusReason.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val CARD_PIN_UPDATED = of("card.pin_updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_PIN_UPDATED
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
            CARD_PIN_UPDATED,
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
                CARD_PIN_UPDATED -> Value.CARD_PIN_UPDATED
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
                CARD_PIN_UPDATED -> Known.CARD_PIN_UPDATED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** The card's PIN status after the update */
    class PinStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OK = of("OK")

            @JvmField val BLOCKED = of("BLOCKED")

            @JvmStatic fun of(value: String) = PinStatus(JsonField.of(value))
        }

        /** An enum containing [PinStatus]'s known values. */
        enum class Known {
            OK,
            BLOCKED,
        }

        /**
         * An enum containing [PinStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PinStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            BLOCKED,
            /**
             * An enum member indicating that [PinStatus] was instantiated with an unknown value.
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
                OK -> Value.OK
                BLOCKED -> Value.BLOCKED
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
                OK -> Known.OK
                BLOCKED -> Known.BLOCKED
                else -> throw LithicInvalidDataException("Unknown PinStatus: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PinStatus = apply {
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

            return other is PinStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The reason for the PIN update:
     * * `PIN_SET` - The PIN was set for the first time; `pin_status` is `OK`
     * * `PIN_CHANGED` - The PIN was changed, including when changing a blocked PIN; `pin_status` is
     *   `OK`
     * * `PIN_UNBLOCKED` - The PIN was unblocked without changing it; `pin_status` is `OK`
     * * `EXCESSIVE_PIN_ATTEMPTS` - The PIN was blocked due to excessive incorrect PIN attempts;
     *   `pin_status` is `BLOCKED`
     */
    class StatusReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PIN_SET = of("PIN_SET")

            @JvmField val PIN_CHANGED = of("PIN_CHANGED")

            @JvmField val PIN_UNBLOCKED = of("PIN_UNBLOCKED")

            @JvmField val EXCESSIVE_PIN_ATTEMPTS = of("EXCESSIVE_PIN_ATTEMPTS")

            @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
        }

        /** An enum containing [StatusReason]'s known values. */
        enum class Known {
            PIN_SET,
            PIN_CHANGED,
            PIN_UNBLOCKED,
            EXCESSIVE_PIN_ATTEMPTS,
        }

        /**
         * An enum containing [StatusReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PIN_SET,
            PIN_CHANGED,
            PIN_UNBLOCKED,
            EXCESSIVE_PIN_ATTEMPTS,
            /**
             * An enum member indicating that [StatusReason] was instantiated with an unknown value.
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
                PIN_SET -> Value.PIN_SET
                PIN_CHANGED -> Value.PIN_CHANGED
                PIN_UNBLOCKED -> Value.PIN_UNBLOCKED
                EXCESSIVE_PIN_ATTEMPTS -> Value.EXCESSIVE_PIN_ATTEMPTS
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
                PIN_SET -> Known.PIN_SET
                PIN_CHANGED -> Known.PIN_CHANGED
                PIN_UNBLOCKED -> Known.PIN_UNBLOCKED
                EXCESSIVE_PIN_ATTEMPTS -> Known.EXCESSIVE_PIN_ATTEMPTS
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): StatusReason = apply {
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

            return other is StatusReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPinUpdatedWebhookEvent &&
            cardToken == other.cardToken &&
            eventType == other.eventType &&
            pinStatus == other.pinStatus &&
            statusReason == other.statusReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cardToken, eventType, pinStatus, statusReason, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPinUpdatedWebhookEvent{cardToken=$cardToken, eventType=$eventType, pinStatus=$pinStatus, statusReason=$statusReason, additionalProperties=$additionalProperties}"
}
