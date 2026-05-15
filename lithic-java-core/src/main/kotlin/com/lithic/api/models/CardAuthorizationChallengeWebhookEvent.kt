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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CardAuthorizationChallengeWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorization: JsonField<CardAuthorization>,
    private val challenge: JsonField<AuthorizationChallenge>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorization")
        @ExcludeMissing
        authorization: JsonField<CardAuthorization> = JsonMissing.of(),
        @JsonProperty("challenge")
        @ExcludeMissing
        challenge: JsonField<AuthorizationChallenge> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(authorization, challenge, eventType, mutableMapOf())

    /**
     * The authorization that triggered the challenge
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorization(): CardAuthorization = authorization.getRequired("authorization")

    /**
     * Details of the Authorization Challenge issued during card authorization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challenge(): AuthorizationChallenge = challenge.getRequired("challenge")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [authorization].
     *
     * Unlike [authorization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorization")
    @ExcludeMissing
    fun _authorization(): JsonField<CardAuthorization> = authorization

    /**
     * Returns the raw JSON value of [challenge].
     *
     * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge")
    @ExcludeMissing
    fun _challenge(): JsonField<AuthorizationChallenge> = challenge

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
         * [CardAuthorizationChallengeWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .authorization()
         * .challenge()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAuthorizationChallengeWebhookEvent]. */
    class Builder internal constructor() {

        private var authorization: JsonField<CardAuthorization>? = null
        private var challenge: JsonField<AuthorizationChallenge>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            cardAuthorizationChallengeWebhookEvent: CardAuthorizationChallengeWebhookEvent
        ) = apply {
            authorization = cardAuthorizationChallengeWebhookEvent.authorization
            challenge = cardAuthorizationChallengeWebhookEvent.challenge
            eventType = cardAuthorizationChallengeWebhookEvent.eventType
            additionalProperties =
                cardAuthorizationChallengeWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The authorization that triggered the challenge */
        fun authorization(authorization: CardAuthorization) =
            authorization(JsonField.of(authorization))

        /**
         * Sets [Builder.authorization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorization] with a well-typed [CardAuthorization]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authorization(authorization: JsonField<CardAuthorization>) = apply {
            this.authorization = authorization
        }

        /** Details of the Authorization Challenge issued during card authorization */
        fun challenge(challenge: AuthorizationChallenge) = challenge(JsonField.of(challenge))

        /**
         * Sets [Builder.challenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenge] with a well-typed [AuthorizationChallenge]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun challenge(challenge: JsonField<AuthorizationChallenge>) = apply {
            this.challenge = challenge
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
         * Returns an immutable instance of [CardAuthorizationChallengeWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authorization()
         * .challenge()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAuthorizationChallengeWebhookEvent =
            CardAuthorizationChallengeWebhookEvent(
                checkRequired("authorization", authorization),
                checkRequired("challenge", challenge),
                checkRequired("eventType", eventType),
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
    fun validate(): CardAuthorizationChallengeWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        authorization().validate()
        challenge().validate()
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
        (authorization.asKnown().getOrNull()?.validity() ?: 0) +
            (challenge.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** Details of the Authorization Challenge issued during card authorization */
    class AuthorizationChallenge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventToken: JsonField<String>,
        private val expiryTime: JsonField<OffsetDateTime>,
        private val startTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_token")
            @ExcludeMissing
            eventToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_time")
            @ExcludeMissing
            expiryTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(eventToken, expiryTime, startTime, mutableMapOf())

        /**
         * Globally unique identifier for the event that triggered the challenge. Use this token
         * when calling the challenge response endpoint
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventToken(): String = eventToken.getRequired("event_token")

        /**
         * ISO-8601 time at which the challenge expires
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiryTime(): OffsetDateTime = expiryTime.getRequired("expiry_time")

        /**
         * ISO-8601 time at which the challenge was issued
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * Returns the raw JSON value of [eventToken].
         *
         * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_token")
        @ExcludeMissing
        fun _eventToken(): JsonField<String> = eventToken

        /**
         * Returns the raw JSON value of [expiryTime].
         *
         * Unlike [expiryTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiry_time")
        @ExcludeMissing
        fun _expiryTime(): JsonField<OffsetDateTime> = expiryTime

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

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
             * Returns a mutable builder for constructing an instance of [AuthorizationChallenge].
             *
             * The following fields are required:
             * ```java
             * .eventToken()
             * .expiryTime()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthorizationChallenge]. */
        class Builder internal constructor() {

            private var eventToken: JsonField<String>? = null
            private var expiryTime: JsonField<OffsetDateTime>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authorizationChallenge: AuthorizationChallenge) = apply {
                eventToken = authorizationChallenge.eventToken
                expiryTime = authorizationChallenge.expiryTime
                startTime = authorizationChallenge.startTime
                additionalProperties = authorizationChallenge.additionalProperties.toMutableMap()
            }

            /**
             * Globally unique identifier for the event that triggered the challenge. Use this token
             * when calling the challenge response endpoint
             */
            fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

            /**
             * Sets [Builder.eventToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

            /** ISO-8601 time at which the challenge expires */
            fun expiryTime(expiryTime: OffsetDateTime) = expiryTime(JsonField.of(expiryTime))

            /**
             * Sets [Builder.expiryTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiryTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiryTime(expiryTime: JsonField<OffsetDateTime>) = apply {
                this.expiryTime = expiryTime
            }

            /** ISO-8601 time at which the challenge was issued */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
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
             * Returns an immutable instance of [AuthorizationChallenge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventToken()
             * .expiryTime()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthorizationChallenge =
                AuthorizationChallenge(
                    checkRequired("eventToken", eventToken),
                    checkRequired("expiryTime", expiryTime),
                    checkRequired("startTime", startTime),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): AuthorizationChallenge = apply {
            if (validated) {
                return@apply
            }

            eventToken()
            expiryTime()
            startTime()
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
            (if (eventToken.asKnown().isPresent) 1 else 0) +
                (if (expiryTime.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthorizationChallenge &&
                eventToken == other.eventToken &&
                expiryTime == other.expiryTime &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventToken, expiryTime, startTime, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthorizationChallenge{eventToken=$eventToken, expiryTime=$expiryTime, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

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

            @JvmField val CARD_AUTHORIZATION_CHALLENGE = of("card_authorization.challenge")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_AUTHORIZATION_CHALLENGE
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
            CARD_AUTHORIZATION_CHALLENGE,
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
                CARD_AUTHORIZATION_CHALLENGE -> Value.CARD_AUTHORIZATION_CHALLENGE
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
                CARD_AUTHORIZATION_CHALLENGE -> Known.CARD_AUTHORIZATION_CHALLENGE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardAuthorizationChallengeWebhookEvent &&
            authorization == other.authorization &&
            challenge == other.challenge &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorization, challenge, eventType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardAuthorizationChallengeWebhookEvent{authorization=$authorization, challenge=$challenge, eventType=$eventType, additionalProperties=$additionalProperties}"
}
