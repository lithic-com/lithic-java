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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ThreeDSAuthenticationChallengeWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationObject: JsonField<ThreeDSAuthentication>,
    private val challenge: JsonField<Challenge>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_object")
        @ExcludeMissing
        authenticationObject: JsonField<ThreeDSAuthentication> = JsonMissing.of(),
        @JsonProperty("challenge")
        @ExcludeMissing
        challenge: JsonField<Challenge> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(authenticationObject, challenge, eventType, mutableMapOf())

    /**
     * Represents a 3DS authentication
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationObject(): ThreeDSAuthentication =
        authenticationObject.getRequired("authentication_object")

    /**
     * Represents a challenge object for 3DS authentication
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challenge(): Challenge = challenge.getRequired("challenge")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [authenticationObject].
     *
     * Unlike [authenticationObject], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_object")
    @ExcludeMissing
    fun _authenticationObject(): JsonField<ThreeDSAuthentication> = authenticationObject

    /**
     * Returns the raw JSON value of [challenge].
     *
     * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<Challenge> = challenge

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
         * [ThreeDSAuthenticationChallengeWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .authenticationObject()
         * .challenge()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreeDSAuthenticationChallengeWebhookEvent]. */
    class Builder internal constructor() {

        private var authenticationObject: JsonField<ThreeDSAuthentication>? = null
        private var challenge: JsonField<Challenge>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSAuthenticationChallengeWebhookEvent: ThreeDSAuthenticationChallengeWebhookEvent
        ) = apply {
            authenticationObject = threeDSAuthenticationChallengeWebhookEvent.authenticationObject
            challenge = threeDSAuthenticationChallengeWebhookEvent.challenge
            eventType = threeDSAuthenticationChallengeWebhookEvent.eventType
            additionalProperties =
                threeDSAuthenticationChallengeWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Represents a 3DS authentication */
        fun authenticationObject(authenticationObject: ThreeDSAuthentication) =
            authenticationObject(JsonField.of(authenticationObject))

        /**
         * Sets [Builder.authenticationObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationObject] with a well-typed
         * [ThreeDSAuthentication] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authenticationObject(authenticationObject: JsonField<ThreeDSAuthentication>) = apply {
            this.authenticationObject = authenticationObject
        }

        /** Represents a challenge object for 3DS authentication */
        fun challenge(challenge: Challenge) = challenge(JsonField.of(challenge))

        /**
         * Sets [Builder.challenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenge] with a well-typed [Challenge] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun challenge(challenge: JsonField<Challenge>) = apply { this.challenge = challenge }

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
         * Returns an immutable instance of [ThreeDSAuthenticationChallengeWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationObject()
         * .challenge()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreeDSAuthenticationChallengeWebhookEvent =
            ThreeDSAuthenticationChallengeWebhookEvent(
                checkRequired("authenticationObject", authenticationObject),
                checkRequired("challenge", challenge),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ThreeDSAuthenticationChallengeWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        authenticationObject().validate()
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
        (authenticationObject.asKnown().getOrNull()?.validity() ?: 0) +
            (challenge.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** Represents a challenge object for 3DS authentication */
    class Challenge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val challengeMethodType: JsonField<ChallengeMethodType>,
        private val expiryTime: JsonField<OffsetDateTime>,
        private val startTime: JsonField<OffsetDateTime>,
        private val appRequestorUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("challenge_method_type")
            @ExcludeMissing
            challengeMethodType: JsonField<ChallengeMethodType> = JsonMissing.of(),
            @JsonProperty("expiry_time")
            @ExcludeMissing
            expiryTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("app_requestor_url")
            @ExcludeMissing
            appRequestorUrl: JsonField<String> = JsonMissing.of(),
        ) : this(challengeMethodType, expiryTime, startTime, appRequestorUrl, mutableMapOf())

        /**
         * The type of challenge method issued to the cardholder
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun challengeMethodType(): ChallengeMethodType =
            challengeMethodType.getRequired("challenge_method_type")

        /**
         * ISO-8601 time at which the challenge expires
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiryTime(): OffsetDateTime = expiryTime.getRequired("expiry_time")

        /**
         * ISO-8601 time at which the challenge has started
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * Fully qualified app URL of the merchant app. This should be used to redirect the
         * cardholder back to the merchant app after completing an app-based challenge. This URL
         * will only be populated if the 3DS Requestor App is provided to the 3DS SDK.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appRequestorUrl(): Optional<String> = appRequestorUrl.getOptional("app_requestor_url")

        /**
         * Returns the raw JSON value of [challengeMethodType].
         *
         * Unlike [challengeMethodType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("challenge_method_type")
        @ExcludeMissing
        fun _challengeMethodType(): JsonField<ChallengeMethodType> = challengeMethodType

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

        /**
         * Returns the raw JSON value of [appRequestorUrl].
         *
         * Unlike [appRequestorUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("app_requestor_url")
        @ExcludeMissing
        fun _appRequestorUrl(): JsonField<String> = appRequestorUrl

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
             * Returns a mutable builder for constructing an instance of [Challenge].
             *
             * The following fields are required:
             * ```java
             * .challengeMethodType()
             * .expiryTime()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Challenge]. */
        class Builder internal constructor() {

            private var challengeMethodType: JsonField<ChallengeMethodType>? = null
            private var expiryTime: JsonField<OffsetDateTime>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var appRequestorUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(challenge: Challenge) = apply {
                challengeMethodType = challenge.challengeMethodType
                expiryTime = challenge.expiryTime
                startTime = challenge.startTime
                appRequestorUrl = challenge.appRequestorUrl
                additionalProperties = challenge.additionalProperties.toMutableMap()
            }

            /** The type of challenge method issued to the cardholder */
            fun challengeMethodType(challengeMethodType: ChallengeMethodType) =
                challengeMethodType(JsonField.of(challengeMethodType))

            /**
             * Sets [Builder.challengeMethodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.challengeMethodType] with a well-typed
             * [ChallengeMethodType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun challengeMethodType(challengeMethodType: JsonField<ChallengeMethodType>) = apply {
                this.challengeMethodType = challengeMethodType
            }

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

            /** ISO-8601 time at which the challenge has started */
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

            /**
             * Fully qualified app URL of the merchant app. This should be used to redirect the
             * cardholder back to the merchant app after completing an app-based challenge. This URL
             * will only be populated if the 3DS Requestor App is provided to the 3DS SDK.
             */
            fun appRequestorUrl(appRequestorUrl: String?) =
                appRequestorUrl(JsonField.ofNullable(appRequestorUrl))

            /** Alias for calling [Builder.appRequestorUrl] with `appRequestorUrl.orElse(null)`. */
            fun appRequestorUrl(appRequestorUrl: Optional<String>) =
                appRequestorUrl(appRequestorUrl.getOrNull())

            /**
             * Sets [Builder.appRequestorUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appRequestorUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appRequestorUrl(appRequestorUrl: JsonField<String>) = apply {
                this.appRequestorUrl = appRequestorUrl
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
             * Returns an immutable instance of [Challenge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .challengeMethodType()
             * .expiryTime()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Challenge =
                Challenge(
                    checkRequired("challengeMethodType", challengeMethodType),
                    checkRequired("expiryTime", expiryTime),
                    checkRequired("startTime", startTime),
                    appRequestorUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Challenge = apply {
            if (validated) {
                return@apply
            }

            challengeMethodType().validate()
            expiryTime()
            startTime()
            appRequestorUrl()
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
            (challengeMethodType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (expiryTime.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (appRequestorUrl.asKnown().isPresent) 1 else 0)

        /** The type of challenge method issued to the cardholder */
        class ChallengeMethodType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val OUT_OF_BAND = of("OUT_OF_BAND")

                @JvmStatic fun of(value: String) = ChallengeMethodType(JsonField.of(value))
            }

            /** An enum containing [ChallengeMethodType]'s known values. */
            enum class Known {
                OUT_OF_BAND
            }

            /**
             * An enum containing [ChallengeMethodType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ChallengeMethodType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OUT_OF_BAND,
                /**
                 * An enum member indicating that [ChallengeMethodType] was instantiated with an
                 * unknown value.
                 */
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
                    OUT_OF_BAND -> Value.OUT_OF_BAND
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
                    OUT_OF_BAND -> Known.OUT_OF_BAND
                    else -> throw LithicInvalidDataException("Unknown ChallengeMethodType: $value")
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

            fun validate(): ChallengeMethodType = apply {
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

                return other is ChallengeMethodType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Challenge &&
                challengeMethodType == other.challengeMethodType &&
                expiryTime == other.expiryTime &&
                startTime == other.startTime &&
                appRequestorUrl == other.appRequestorUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                challengeMethodType,
                expiryTime,
                startTime,
                appRequestorUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Challenge{challengeMethodType=$challengeMethodType, expiryTime=$expiryTime, startTime=$startTime, appRequestorUrl=$appRequestorUrl, additionalProperties=$additionalProperties}"
    }

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
            val THREE_DS_AUTHENTICATION_CHALLENGE = of("three_ds_authentication.challenge")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            THREE_DS_AUTHENTICATION_CHALLENGE
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
            THREE_DS_AUTHENTICATION_CHALLENGE,
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
                THREE_DS_AUTHENTICATION_CHALLENGE -> Value.THREE_DS_AUTHENTICATION_CHALLENGE
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
                THREE_DS_AUTHENTICATION_CHALLENGE -> Known.THREE_DS_AUTHENTICATION_CHALLENGE
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

        return other is ThreeDSAuthenticationChallengeWebhookEvent &&
            authenticationObject == other.authenticationObject &&
            challenge == other.challenge &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authenticationObject, challenge, eventType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreeDSAuthenticationChallengeWebhookEvent{authenticationObject=$authenticationObject, challenge=$challenge, eventType=$eventType, additionalProperties=$additionalProperties}"
}
