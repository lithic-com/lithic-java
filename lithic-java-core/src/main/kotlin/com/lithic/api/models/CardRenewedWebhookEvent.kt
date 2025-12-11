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

class CardRenewedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventType: JsonField<EventType>,
    private val cardToken: JsonField<String>,
    private val expMonth: JsonField<String>,
    private val expYear: JsonField<String>,
    private val previousExpMonth: JsonField<String>,
    private val previousExpYear: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_month") @ExcludeMissing expMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_year") @ExcludeMissing expYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_exp_month")
        @ExcludeMissing
        previousExpMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_exp_year")
        @ExcludeMissing
        previousExpYear: JsonField<String> = JsonMissing.of(),
    ) : this(
        eventType,
        cardToken,
        expMonth,
        expYear,
        previousExpMonth,
        previousExpYear,
        mutableMapOf(),
    )

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The token of the card that was renewed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardToken(): Optional<String> = cardToken.getOptional("card_token")

    /**
     * The new expiration month of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expMonth(): Optional<String> = expMonth.getOptional("exp_month")

    /**
     * The new expiration year of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expYear(): Optional<String> = expYear.getOptional("exp_year")

    /**
     * The previous expiration month of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousExpMonth(): Optional<String> = previousExpMonth.getOptional("previous_exp_month")

    /**
     * The previous expiration year of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousExpYear(): Optional<String> = previousExpYear.getOptional("previous_exp_year")

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [expMonth].
     *
     * Unlike [expMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_month") @ExcludeMissing fun _expMonth(): JsonField<String> = expMonth

    /**
     * Returns the raw JSON value of [expYear].
     *
     * Unlike [expYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_year") @ExcludeMissing fun _expYear(): JsonField<String> = expYear

    /**
     * Returns the raw JSON value of [previousExpMonth].
     *
     * Unlike [previousExpMonth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_exp_month")
    @ExcludeMissing
    fun _previousExpMonth(): JsonField<String> = previousExpMonth

    /**
     * Returns the raw JSON value of [previousExpYear].
     *
     * Unlike [previousExpYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_exp_year")
    @ExcludeMissing
    fun _previousExpYear(): JsonField<String> = previousExpYear

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
         * Returns a mutable builder for constructing an instance of [CardRenewedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardRenewedWebhookEvent]. */
    class Builder internal constructor() {

        private var eventType: JsonField<EventType>? = null
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<String> = JsonMissing.of()
        private var expYear: JsonField<String> = JsonMissing.of()
        private var previousExpMonth: JsonField<String> = JsonMissing.of()
        private var previousExpYear: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardRenewedWebhookEvent: CardRenewedWebhookEvent) = apply {
            eventType = cardRenewedWebhookEvent.eventType
            cardToken = cardRenewedWebhookEvent.cardToken
            expMonth = cardRenewedWebhookEvent.expMonth
            expYear = cardRenewedWebhookEvent.expYear
            previousExpMonth = cardRenewedWebhookEvent.previousExpMonth
            previousExpYear = cardRenewedWebhookEvent.previousExpYear
            additionalProperties = cardRenewedWebhookEvent.additionalProperties.toMutableMap()
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

        /** The token of the card that was renewed. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** The new expiration month of the card. */
        fun expMonth(expMonth: String) = expMonth(JsonField.of(expMonth))

        /**
         * Sets [Builder.expMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expMonth] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

        /** The new expiration year of the card. */
        fun expYear(expYear: String) = expYear(JsonField.of(expYear))

        /**
         * Sets [Builder.expYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expYear] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

        /** The previous expiration month of the card. */
        fun previousExpMonth(previousExpMonth: String) =
            previousExpMonth(JsonField.of(previousExpMonth))

        /**
         * Sets [Builder.previousExpMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousExpMonth] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousExpMonth(previousExpMonth: JsonField<String>) = apply {
            this.previousExpMonth = previousExpMonth
        }

        /** The previous expiration year of the card. */
        fun previousExpYear(previousExpYear: String) =
            previousExpYear(JsonField.of(previousExpYear))

        /**
         * Sets [Builder.previousExpYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousExpYear] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousExpYear(previousExpYear: JsonField<String>) = apply {
            this.previousExpYear = previousExpYear
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
         * Returns an immutable instance of [CardRenewedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardRenewedWebhookEvent =
            CardRenewedWebhookEvent(
                checkRequired("eventType", eventType),
                cardToken,
                expMonth,
                expYear,
                previousExpMonth,
                previousExpYear,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardRenewedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        eventType().validate()
        cardToken()
        expMonth()
        expYear()
        previousExpMonth()
        previousExpYear()
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
        (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (expMonth.asKnown().isPresent) 1 else 0) +
            (if (expYear.asKnown().isPresent) 1 else 0) +
            (if (previousExpMonth.asKnown().isPresent) 1 else 0) +
            (if (previousExpYear.asKnown().isPresent) 1 else 0)

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

            @JvmField val CARD_RENEWED = of("card.renewed")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_RENEWED
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
            CARD_RENEWED,
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
                CARD_RENEWED -> Value.CARD_RENEWED
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
                CARD_RENEWED -> Known.CARD_RENEWED
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

        return other is CardRenewedWebhookEvent &&
            eventType == other.eventType &&
            cardToken == other.cardToken &&
            expMonth == other.expMonth &&
            expYear == other.expYear &&
            previousExpMonth == other.previousExpMonth &&
            previousExpYear == other.previousExpYear &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventType,
            cardToken,
            expMonth,
            expYear,
            previousExpMonth,
            previousExpYear,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardRenewedWebhookEvent{eventType=$eventType, cardToken=$cardToken, expMonth=$expMonth, expYear=$expYear, previousExpMonth=$previousExpMonth, previousExpYear=$previousExpYear, additionalProperties=$additionalProperties}"
}
