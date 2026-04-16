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

class CardAuthorizationChallengeResponseWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cardToken: JsonField<String>,
    private val challengeMethod: JsonField<ChallengeMethod>,
    private val completed: JsonField<OffsetDateTime>,
    private val created: JsonField<OffsetDateTime>,
    private val eventToken: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val response: JsonField<Response>,
    private val transactionToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("challenge_method")
        @ExcludeMissing
        challengeMethod: JsonField<ChallengeMethod> = JsonMissing.of(),
        @JsonProperty("completed")
        @ExcludeMissing
        completed: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_token")
        @ExcludeMissing
        eventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<Response> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        cardToken,
        challengeMethod,
        completed,
        created,
        eventToken,
        eventType,
        response,
        transactionToken,
        mutableMapOf(),
    )

    /**
     * The token of the card associated with the challenge
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardToken(): Optional<String> = cardToken.getOptional("card_token")

    /**
     * The method used to deliver the challenge to the cardholder
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challengeMethod(): ChallengeMethod = challengeMethod.getRequired("challenge_method")

    /**
     * The timestamp of when the challenge was completed
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completed(): Optional<OffsetDateTime> = completed.getOptional("completed")

    /**
     * The timestamp of when the challenge was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Globally unique identifier for the event
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventToken(): String = eventToken.getRequired("event_token")

    /**
     * Event type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The cardholder's response to the challenge
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun response(): Response = response.getRequired("response")

    /**
     * The token of the transaction associated with the authorization event being challenged
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionToken(): Optional<String> = transactionToken.getOptional("transaction_token")

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [challengeMethod].
     *
     * Unlike [challengeMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge_method")
    @ExcludeMissing
    fun _challengeMethod(): JsonField<ChallengeMethod> = challengeMethod

    /**
     * Returns the raw JSON value of [completed].
     *
     * Unlike [completed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed")
    @ExcludeMissing
    fun _completed(): JsonField<OffsetDateTime> = completed

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [eventToken].
     *
     * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<Response> = response

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

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
         * [CardAuthorizationChallengeResponseWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * .challengeMethod()
         * .completed()
         * .created()
         * .eventToken()
         * .eventType()
         * .response()
         * .transactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAuthorizationChallengeResponseWebhookEvent]. */
    class Builder internal constructor() {

        private var cardToken: JsonField<String>? = null
        private var challengeMethod: JsonField<ChallengeMethod>? = null
        private var completed: JsonField<OffsetDateTime>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var eventToken: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var response: JsonField<Response>? = null
        private var transactionToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            cardAuthorizationChallengeResponseWebhookEvent:
                CardAuthorizationChallengeResponseWebhookEvent
        ) = apply {
            cardToken = cardAuthorizationChallengeResponseWebhookEvent.cardToken
            challengeMethod = cardAuthorizationChallengeResponseWebhookEvent.challengeMethod
            completed = cardAuthorizationChallengeResponseWebhookEvent.completed
            created = cardAuthorizationChallengeResponseWebhookEvent.created
            eventToken = cardAuthorizationChallengeResponseWebhookEvent.eventToken
            eventType = cardAuthorizationChallengeResponseWebhookEvent.eventType
            response = cardAuthorizationChallengeResponseWebhookEvent.response
            transactionToken = cardAuthorizationChallengeResponseWebhookEvent.transactionToken
            additionalProperties =
                cardAuthorizationChallengeResponseWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The token of the card associated with the challenge */
        fun cardToken(cardToken: String?) = cardToken(JsonField.ofNullable(cardToken))

        /** Alias for calling [Builder.cardToken] with `cardToken.orElse(null)`. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.getOrNull())

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** The method used to deliver the challenge to the cardholder */
        fun challengeMethod(challengeMethod: ChallengeMethod) =
            challengeMethod(JsonField.of(challengeMethod))

        /**
         * Sets [Builder.challengeMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeMethod] with a well-typed [ChallengeMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun challengeMethod(challengeMethod: JsonField<ChallengeMethod>) = apply {
            this.challengeMethod = challengeMethod
        }

        /** The timestamp of when the challenge was completed */
        fun completed(completed: OffsetDateTime?) = completed(JsonField.ofNullable(completed))

        /** Alias for calling [Builder.completed] with `completed.orElse(null)`. */
        fun completed(completed: Optional<OffsetDateTime>) = completed(completed.getOrNull())

        /**
         * Sets [Builder.completed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completed] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completed(completed: JsonField<OffsetDateTime>) = apply { this.completed = completed }

        /** The timestamp of when the challenge was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Globally unique identifier for the event */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /**
         * Sets [Builder.eventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        /** Event type */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** The cardholder's response to the challenge */
        fun response(response: Response) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [Response] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun response(response: JsonField<Response>) = apply { this.response = response }

        /** The token of the transaction associated with the authorization event being challenged */
        fun transactionToken(transactionToken: String?) =
            transactionToken(JsonField.ofNullable(transactionToken))

        /** Alias for calling [Builder.transactionToken] with `transactionToken.orElse(null)`. */
        fun transactionToken(transactionToken: Optional<String>) =
            transactionToken(transactionToken.getOrNull())

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
         * Returns an immutable instance of [CardAuthorizationChallengeResponseWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * .challengeMethod()
         * .completed()
         * .created()
         * .eventToken()
         * .eventType()
         * .response()
         * .transactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAuthorizationChallengeResponseWebhookEvent =
            CardAuthorizationChallengeResponseWebhookEvent(
                checkRequired("cardToken", cardToken),
                checkRequired("challengeMethod", challengeMethod),
                checkRequired("completed", completed),
                checkRequired("created", created),
                checkRequired("eventToken", eventToken),
                checkRequired("eventType", eventType),
                checkRequired("response", response),
                checkRequired("transactionToken", transactionToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardAuthorizationChallengeResponseWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        cardToken()
        challengeMethod().validate()
        completed()
        created()
        eventToken()
        eventType().validate()
        response().validate()
        transactionToken()
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
            (challengeMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completed.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (eventToken.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (response.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0)

    /** The method used to deliver the challenge to the cardholder */
    class ChallengeMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SMS = of("SMS")

            @JvmStatic fun of(value: String) = ChallengeMethod(JsonField.of(value))
        }

        /** An enum containing [ChallengeMethod]'s known values. */
        enum class Known {
            SMS
        }

        /**
         * An enum containing [ChallengeMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChallengeMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            /**
             * An enum member indicating that [ChallengeMethod] was instantiated with an unknown
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
                SMS -> Value.SMS
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
                SMS -> Known.SMS
                else -> throw LithicInvalidDataException("Unknown ChallengeMethod: $value")
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

        fun validate(): ChallengeMethod = apply {
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

            return other is ChallengeMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Event type */
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
            val CARD_AUTHORIZATION_CHALLENGE_RESPONSE = of("card_authorization.challenge_response")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_AUTHORIZATION_CHALLENGE_RESPONSE
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
            CARD_AUTHORIZATION_CHALLENGE_RESPONSE,
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
                CARD_AUTHORIZATION_CHALLENGE_RESPONSE -> Value.CARD_AUTHORIZATION_CHALLENGE_RESPONSE
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
                CARD_AUTHORIZATION_CHALLENGE_RESPONSE -> Known.CARD_AUTHORIZATION_CHALLENGE_RESPONSE
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

    /** The cardholder's response to the challenge */
    class Response @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVE = of("APPROVE")

            @JvmField val DECLINE = of("DECLINE")

            @JvmStatic fun of(value: String) = Response(JsonField.of(value))
        }

        /** An enum containing [Response]'s known values. */
        enum class Known {
            APPROVE,
            DECLINE,
        }

        /**
         * An enum containing [Response]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Response] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVE,
            DECLINE,
            /** An enum member indicating that [Response] was instantiated with an unknown value. */
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
                APPROVE -> Value.APPROVE
                DECLINE -> Value.DECLINE
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
                APPROVE -> Known.APPROVE
                DECLINE -> Known.DECLINE
                else -> throw LithicInvalidDataException("Unknown Response: $value")
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

        fun validate(): Response = apply {
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

            return other is Response && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardAuthorizationChallengeResponseWebhookEvent &&
            cardToken == other.cardToken &&
            challengeMethod == other.challengeMethod &&
            completed == other.completed &&
            created == other.created &&
            eventToken == other.eventToken &&
            eventType == other.eventType &&
            response == other.response &&
            transactionToken == other.transactionToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cardToken,
            challengeMethod,
            completed,
            created,
            eventToken,
            eventType,
            response,
            transactionToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardAuthorizationChallengeResponseWebhookEvent{cardToken=$cardToken, challengeMethod=$challengeMethod, completed=$completed, created=$created, eventToken=$eventToken, eventType=$eventType, response=$response, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
}
