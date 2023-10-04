// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Tokenization.Builder::class)
@NoAutoDetect
class Tokenization
private constructor(
    private val token: JsonField<String>,
    private val tokenRequestorName: JsonField<TokenRequestorName>,
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val tokenUniqueReference: JsonField<String>,
    private val status: JsonField<Status>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A fixed-width 23-digit numeric identifier for the Transaction that may be set if the
     * transaction originated from the Mastercard network. This number may be used for dispute
     * tracking.
     */
    fun token(): String = token.getRequired("token")

    /** The entity that is requested the tokenization. Represents a Digital Wallet. */
    fun tokenRequestorName(): TokenRequestorName =
        tokenRequestorName.getRequired("token_requestor_name")

    /** The account token associated with the card being tokenized. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** The card token associated with the card being tokenized. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** The network's unique reference for the tokenization. */
    fun tokenUniqueReference(): String = tokenUniqueReference.getRequired("token_unique_reference")

    /** The status of the tokenization request */
    fun status(): Status = status.getRequired("status")

    /** Date and time when the tokenization first occurred. UTC time zone. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * A fixed-width 23-digit numeric identifier for the Transaction that may be set if the
     * transaction originated from the Mastercard network. This number may be used for dispute
     * tracking.
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The entity that is requested the tokenization. Represents a Digital Wallet. */
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    fun _tokenRequestorName() = tokenRequestorName

    /** The account token associated with the card being tokenized. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** The card token associated with the card being tokenized. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    /** The network's unique reference for the tokenization. */
    @JsonProperty("token_unique_reference")
    @ExcludeMissing
    fun _tokenUniqueReference() = tokenUniqueReference

    /** The status of the tokenization request */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Date and time when the tokenization first occurred. UTC time zone. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Tokenization = apply {
        if (!validated) {
            token()
            tokenRequestorName()
            accountToken()
            cardToken()
            tokenUniqueReference()
            status()
            createdAt()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Tokenization &&
            this.token == other.token &&
            this.tokenRequestorName == other.tokenRequestorName &&
            this.accountToken == other.accountToken &&
            this.cardToken == other.cardToken &&
            this.tokenUniqueReference == other.tokenUniqueReference &&
            this.status == other.status &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    tokenRequestorName,
                    accountToken,
                    cardToken,
                    tokenUniqueReference,
                    status,
                    createdAt,
                    updatedAt,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Tokenization{token=$token, tokenRequestorName=$tokenRequestorName, accountToken=$accountToken, cardToken=$cardToken, tokenUniqueReference=$tokenUniqueReference, status=$status, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var tokenUniqueReference: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenization: Tokenization) = apply {
            this.token = tokenization.token
            this.tokenRequestorName = tokenization.tokenRequestorName
            this.accountToken = tokenization.accountToken
            this.cardToken = tokenization.cardToken
            this.tokenUniqueReference = tokenization.tokenUniqueReference
            this.status = tokenization.status
            this.createdAt = tokenization.createdAt
            this.updatedAt = tokenization.updatedAt
            additionalProperties(tokenization.additionalProperties)
        }

        /**
         * A fixed-width 23-digit numeric identifier for the Transaction that may be set if the
         * transaction originated from the Mastercard network. This number may be used for dispute
         * tracking.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A fixed-width 23-digit numeric identifier for the Transaction that may be set if the
         * transaction originated from the Mastercard network. This number may be used for dispute
         * tracking.
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The entity that is requested the tokenization. Represents a Digital Wallet. */
        fun tokenRequestorName(tokenRequestorName: TokenRequestorName) =
            tokenRequestorName(JsonField.of(tokenRequestorName))

        /** The entity that is requested the tokenization. Represents a Digital Wallet. */
        @JsonProperty("token_requestor_name")
        @ExcludeMissing
        fun tokenRequestorName(tokenRequestorName: JsonField<TokenRequestorName>) = apply {
            this.tokenRequestorName = tokenRequestorName
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

        /** The network's unique reference for the tokenization. */
        fun tokenUniqueReference(tokenUniqueReference: String) =
            tokenUniqueReference(JsonField.of(tokenUniqueReference))

        /** The network's unique reference for the tokenization. */
        @JsonProperty("token_unique_reference")
        @ExcludeMissing
        fun tokenUniqueReference(tokenUniqueReference: JsonField<String>) = apply {
            this.tokenUniqueReference = tokenUniqueReference
        }

        /** The status of the tokenization request */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the tokenization request */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Date and time when the tokenization first occurred. UTC time zone. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Date and time when the tokenization first occurred. UTC time zone. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Tokenization =
            Tokenization(
                token,
                tokenRequestorName,
                accountToken,
                cardToken,
                tokenUniqueReference,
                status,
                createdAt,
                updatedAt,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Status(JsonField.of("APPROVED"))

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField
            val REQUIRE_ADDITIONAL_AUTHENTICATION =
                Status(JsonField.of("REQUIRE_ADDITIONAL_AUTHENTICATION"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class TokenRequestorName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenRequestorName && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPLE_PAY = TokenRequestorName(JsonField.of("APPLE_PAY"))

            @JvmField val GOOGLE = TokenRequestorName(JsonField.of("GOOGLE"))

            @JvmField val SAMSUNG_PAY = TokenRequestorName(JsonField.of("SAMSUNG_PAY"))

            @JvmStatic fun of(value: String) = TokenRequestorName(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE -> Value.GOOGLE
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE -> Known.GOOGLE
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown TokenRequestorName: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
