// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Tokenization.Builder::class)
@NoAutoDetect
class Tokenization
private constructor(
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val digitalCardArtToken: JsonField<String>,
    private val events: JsonField<List<TokenizationEvent>>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val tokenRequestorName: JsonField<TokenRequestorName>,
    private val tokenUniqueReference: JsonField<String>,
    private val tokenizationChannel: JsonField<TokenizationChannel>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The account token associated with the card being tokenized. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** The card token associated with the card being tokenized. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** Date and time when the tokenization first occurred. UTC time zone. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
     * This will be null if the tokenization was created without an associated digital card art. See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun digitalCardArtToken(): Optional<String> =
        Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

    /** A list of events related to the tokenization. */
    fun events(): Optional<List<TokenizationEvent>> =
        Optional.ofNullable(events.getNullable("events"))

    /** The status of the tokenization request */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier for a Tokenization */
    fun token(): String = token.getRequired("token")

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    fun tokenRequestorName(): TokenRequestorName =
        tokenRequestorName.getRequired("token_requestor_name")

    /** The network's unique reference for the tokenization. */
    fun tokenUniqueReference(): String = tokenUniqueReference.getRequired("token_unique_reference")

    /** The channel through which the tokenization was made. */
    fun tokenizationChannel(): TokenizationChannel =
        tokenizationChannel.getRequired("tokenization_channel")

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The account token associated with the card being tokenized. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** The card token associated with the card being tokenized. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    /** Date and time when the tokenization first occurred. UTC time zone. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
     * This will be null if the tokenization was created without an associated digital card art. See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken() = digitalCardArtToken

    /** A list of events related to the tokenization. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /** The status of the tokenization request */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier for a Tokenization */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    fun _tokenRequestorName() = tokenRequestorName

    /** The network's unique reference for the tokenization. */
    @JsonProperty("token_unique_reference")
    @ExcludeMissing
    fun _tokenUniqueReference() = tokenUniqueReference

    /** The channel through which the tokenization was made. */
    @JsonProperty("tokenization_channel")
    @ExcludeMissing
    fun _tokenizationChannel() = tokenizationChannel

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Tokenization = apply {
        if (!validated) {
            accountToken()
            cardToken()
            createdAt()
            digitalCardArtToken()
            events().map { it.forEach { it.validate() } }
            status()
            token()
            tokenRequestorName()
            tokenUniqueReference()
            tokenizationChannel()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<TokenizationEvent>> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of()
        private var tokenUniqueReference: JsonField<String> = JsonMissing.of()
        private var tokenizationChannel: JsonField<TokenizationChannel> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenization: Tokenization) = apply {
            accountToken = tokenization.accountToken
            cardToken = tokenization.cardToken
            createdAt = tokenization.createdAt
            digitalCardArtToken = tokenization.digitalCardArtToken
            events = tokenization.events
            status = tokenization.status
            token = tokenization.token
            tokenRequestorName = tokenization.tokenRequestorName
            tokenUniqueReference = tokenization.tokenUniqueReference
            tokenizationChannel = tokenization.tokenizationChannel
            updatedAt = tokenization.updatedAt
            additionalProperties = tokenization.additionalProperties.toMutableMap()
        }

        /** The account token associated with the card being tokenized. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** The account token associated with the card being tokenized. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** The card token associated with the card being tokenized. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** The card token associated with the card being tokenized. */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time when the tokenization first occurred. UTC time zone. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Date and time when the tokenization first occurred. UTC time zone. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
         * This will be null if the tokenization was created without an associated digital card art.
         * See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
         * This will be null if the tokenization was created without an associated digital card art.
         * See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** A list of events related to the tokenization. */
        fun events(events: List<TokenizationEvent>) = events(JsonField.of(events))

        /** A list of events related to the tokenization. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<TokenizationEvent>>) = apply { this.events = events }

        /** The status of the tokenization request */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the tokenization request */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier for a Tokenization */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a Tokenization */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
        fun tokenRequestorName(tokenRequestorName: TokenRequestorName) =
            tokenRequestorName(JsonField.of(tokenRequestorName))

        /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
        @JsonProperty("token_requestor_name")
        @ExcludeMissing
        fun tokenRequestorName(tokenRequestorName: JsonField<TokenRequestorName>) = apply {
            this.tokenRequestorName = tokenRequestorName
        }

        /** The network's unique reference for the tokenization. */
        fun tokenUniqueReference(tokenUniqueReference: String) =
            tokenUniqueReference(JsonField.of(tokenUniqueReference))

        /** The network's unique reference for the tokenization. */
        @JsonProperty("token_unique_reference")
        @ExcludeMissing
        fun tokenUniqueReference(tokenUniqueReference: JsonField<String>) = apply {
            this.tokenUniqueReference = tokenUniqueReference
        }

        /** The channel through which the tokenization was made. */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel) =
            tokenizationChannel(JsonField.of(tokenizationChannel))

        /** The channel through which the tokenization was made. */
        @JsonProperty("tokenization_channel")
        @ExcludeMissing
        fun tokenizationChannel(tokenizationChannel: JsonField<TokenizationChannel>) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): Tokenization =
            Tokenization(
                accountToken,
                cardToken,
                createdAt,
                digitalCardArtToken,
                events.map { it.toImmutable() },
                status,
                token,
                tokenRequestorName,
                tokenUniqueReference,
                tokenizationChannel,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val DEACTIVATED = of("DEACTIVATED")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmField val PAUSED = of("PAUSED")

            @JvmField val PENDING_2_FA = of("PENDING_2FA")

            @JvmField val PENDING_ACTIVATION = of("PENDING_ACTIVATION")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
        }

        enum class Value {
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DEACTIVATED -> Value.DEACTIVATED
                INACTIVE -> Value.INACTIVE
                PAUSED -> Value.PAUSED
                PENDING_2_FA -> Value.PENDING_2_FA
                PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DEACTIVATED -> Known.DEACTIVATED
                INACTIVE -> Known.INACTIVE
                PAUSED -> Known.PAUSED
                PENDING_2_FA -> Known.PENDING_2_FA
                PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TokenRequestorName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AMAZON_ONE = of("AMAZON_ONE")

            @JvmField val ANDROID_PAY = of("ANDROID_PAY")

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val FACEBOOK = of("FACEBOOK")

            @JvmField val FITBIT_PAY = of("FITBIT_PAY")

            @JvmField val GARMIN_PAY = of("GARMIN_PAY")

            @JvmField val MICROSOFT_PAY = of("MICROSOFT_PAY")

            @JvmField val NETFLIX = of("NETFLIX")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA_CHECKOUT = of("VISA_CHECKOUT")

            @JvmStatic fun of(value: String) = TokenRequestorName(JsonField.of(value))
        }

        enum class Known {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
        }

        enum class Value {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AMAZON_ONE -> Value.AMAZON_ONE
                ANDROID_PAY -> Value.ANDROID_PAY
                APPLE_PAY -> Value.APPLE_PAY
                FACEBOOK -> Value.FACEBOOK
                FITBIT_PAY -> Value.FITBIT_PAY
                GARMIN_PAY -> Value.GARMIN_PAY
                MICROSOFT_PAY -> Value.MICROSOFT_PAY
                NETFLIX -> Value.NETFLIX
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                UNKNOWN -> Value.UNKNOWN
                VISA_CHECKOUT -> Value.VISA_CHECKOUT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AMAZON_ONE -> Known.AMAZON_ONE
                ANDROID_PAY -> Known.ANDROID_PAY
                APPLE_PAY -> Known.APPLE_PAY
                FACEBOOK -> Known.FACEBOOK
                FITBIT_PAY -> Known.FITBIT_PAY
                GARMIN_PAY -> Known.GARMIN_PAY
                MICROSOFT_PAY -> Known.MICROSOFT_PAY
                NETFLIX -> Known.NETFLIX
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                UNKNOWN -> Known.UNKNOWN
                VISA_CHECKOUT -> Known.VISA_CHECKOUT
                else -> throw LithicInvalidDataException("Unknown TokenRequestorName: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenRequestorName && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TokenizationChannel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmStatic fun of(value: String) = TokenizationChannel(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_WALLET,
            MERCHANT,
        }

        enum class Value {
            DIGITAL_WALLET,
            MERCHANT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                MERCHANT -> Value.MERCHANT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationChannel: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationChannel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = TokenizationEvent.Builder::class)
    @NoAutoDetect
    class TokenizationEvent
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Date and time when the tokenization event first occurred. UTC time zone. */
        fun createdAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** Enum representing the result of the tokenization event */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        /** Globally unique identifier for a Tokenization Event */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        /** Enum representing the type of tokenization event that occurred */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** Date and time when the tokenization event first occurred. UTC time zone. */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** Enum representing the result of the tokenization event */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier for a Tokenization Event */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /** Enum representing the type of tokenization event that occurred */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TokenizationEvent = apply {
            if (!validated) {
                createdAt()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenizationEvent: TokenizationEvent) = apply {
                createdAt = tokenizationEvent.createdAt
                result = tokenizationEvent.result
                token = tokenizationEvent.token
                type = tokenizationEvent.type
                additionalProperties = tokenizationEvent.additionalProperties.toMutableMap()
            }

            /** Date and time when the tokenization event first occurred. UTC time zone. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** Date and time when the tokenization event first occurred. UTC time zone. */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Enum representing the result of the tokenization event */
            fun result(result: Result) = result(JsonField.of(result))

            /** Enum representing the result of the tokenization event */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Globally unique identifier for a Tokenization Event */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for a Tokenization Event */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Enum representing the type of tokenization event that occurred */
            fun type(type: Type) = type(JsonField.of(type))

            /** Enum representing the type of tokenization event that occurred */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): TokenizationEvent =
                TokenizationEvent(
                    createdAt,
                    result,
                    token,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val NOTIFICATION_DELIVERED = of("NOTIFICATION_DELIVERED")

                @JvmField
                val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

                @JvmField val TOKEN_ACTIVATED = of("TOKEN_ACTIVATED")

                @JvmField val TOKEN_CREATED = of("TOKEN_CREATED")

                @JvmField val TOKEN_DEACTIVATED = of("TOKEN_DEACTIVATED")

                @JvmField val TOKEN_INACTIVE = of("TOKEN_INACTIVE")

                @JvmField val TOKEN_STATE_UNKNOWN = of("TOKEN_STATE_UNKNOWN")

                @JvmField val TOKEN_SUSPENDED = of("TOKEN_SUSPENDED")

                @JvmField val TOKEN_UPDATED = of("TOKEN_UPDATED")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
            }

            enum class Value {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    NOTIFICATION_DELIVERED -> Value.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Value.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Value.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Value.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Value.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Value.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Value.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Value.TOKEN_UPDATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    NOTIFICATION_DELIVERED -> Known.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Known.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Known.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Known.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Known.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Known.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Known.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Known.TOKEN_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TOKENIZATION_2_FA = of("TOKENIZATION_2FA")

                @JvmField val TOKENIZATION_AUTHORIZATION = of("TOKENIZATION_AUTHORIZATION")

                @JvmField val TOKENIZATION_DECISIONING = of("TOKENIZATION_DECISIONING")

                @JvmField val TOKENIZATION_ELIGIBILITY_CHECK = of("TOKENIZATION_ELIGIBILITY_CHECK")

                @JvmField val TOKENIZATION_UPDATED = of("TOKENIZATION_UPDATED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
            }

            enum class Value {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TOKENIZATION_2_FA -> Value.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Value.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Value.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Value.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TOKENIZATION_2_FA -> Known.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Known.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Known.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Known.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationEvent && createdAt == other.createdAt && result == other.result && token == other.token && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, result, token, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationEvent{createdAt=$createdAt, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tokenization && accountToken == other.accountToken && cardToken == other.cardToken && createdAt == other.createdAt && digitalCardArtToken == other.digitalCardArtToken && events == other.events && status == other.status && token == other.token && tokenRequestorName == other.tokenRequestorName && tokenUniqueReference == other.tokenUniqueReference && tokenizationChannel == other.tokenizationChannel && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountToken, cardToken, createdAt, digitalCardArtToken, events, status, token, tokenRequestorName, tokenUniqueReference, tokenizationChannel, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tokenization{accountToken=$accountToken, cardToken=$cardToken, createdAt=$createdAt, digitalCardArtToken=$digitalCardArtToken, events=$events, status=$status, token=$token, tokenRequestorName=$tokenRequestorName, tokenUniqueReference=$tokenUniqueReference, tokenizationChannel=$tokenizationChannel, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
