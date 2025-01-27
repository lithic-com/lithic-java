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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class DigitalCardArt
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_program_token")
    @ExcludeMissing
    private val cardProgramToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("is_enabled")
    @ExcludeMissing
    private val isEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
    @JsonProperty("is_card_program_default")
    @ExcludeMissing
    private val isCardProgramDefault: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the card art. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the card program. */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** Timestamp of when card art was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Description of the card art. */
    fun description(): String = description.getRequired("description")

    /** Whether the card art is enabled. */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    /** Card network. */
    fun network(): Network = network.getRequired("network")

    /** Whether the card art is the default card art to be added upon tokenization. */
    fun isCardProgramDefault(): Optional<Boolean> =
        Optional.ofNullable(isCardProgramDefault.getNullable("is_card_program_default"))

    /** Globally unique identifier for the card art. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Globally unique identifier for the card program. */
    @JsonProperty("card_program_token")
    @ExcludeMissing
    fun _cardProgramToken(): JsonField<String> = cardProgramToken

    /** Timestamp of when card art was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Description of the card art. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** Whether the card art is enabled. */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    /** Card network. */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /** Whether the card art is the default card art to be added upon tokenization. */
    @JsonProperty("is_card_program_default")
    @ExcludeMissing
    fun _isCardProgramDefault(): JsonField<Boolean> = isCardProgramDefault

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DigitalCardArt = apply {
        if (validated) {
            return@apply
        }

        token()
        cardProgramToken()
        created()
        description()
        isEnabled()
        network()
        isCardProgramDefault()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalCardArt]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var cardProgramToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var network: JsonField<Network>? = null
        private var isCardProgramDefault: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardArt: DigitalCardArt) = apply {
            token = digitalCardArt.token
            cardProgramToken = digitalCardArt.cardProgramToken
            created = digitalCardArt.created
            description = digitalCardArt.description
            isEnabled = digitalCardArt.isEnabled
            network = digitalCardArt.network
            isCardProgramDefault = digitalCardArt.isCardProgramDefault
            additionalProperties = digitalCardArt.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the card art. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the card art. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the card program. */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /** Globally unique identifier for the card program. */
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /** Timestamp of when card art was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when card art was created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Description of the card art. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the card art. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether the card art is enabled. */
        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /** Whether the card art is enabled. */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        /** Card network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network. */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Whether the card art is the default card art to be added upon tokenization. */
        fun isCardProgramDefault(isCardProgramDefault: Boolean) =
            isCardProgramDefault(JsonField.of(isCardProgramDefault))

        /** Whether the card art is the default card art to be added upon tokenization. */
        fun isCardProgramDefault(isCardProgramDefault: JsonField<Boolean>) = apply {
            this.isCardProgramDefault = isCardProgramDefault
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

        fun build(): DigitalCardArt =
            DigitalCardArt(
                checkRequired("token", token),
                checkRequired("cardProgramToken", cardProgramToken),
                checkRequired("created", created),
                checkRequired("description", description),
                checkRequired("isEnabled", isEnabled),
                checkRequired("network", network),
                isCardProgramDefault,
                additionalProperties.toImmutable(),
            )
    }

    /** Card network. */
    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            MASTERCARD,
            VISA,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MASTERCARD,
            VISA,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                MASTERCARD -> Value.MASTERCARD
                VISA -> Value.VISA
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
                MASTERCARD -> Known.MASTERCARD
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArt && token == other.token && cardProgramToken == other.cardProgramToken && created == other.created && description == other.description && isEnabled == other.isEnabled && network == other.network && isCardProgramDefault == other.isCardProgramDefault && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, cardProgramToken, created, description, isEnabled, network, isCardProgramDefault, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalCardArt{token=$token, cardProgramToken=$cardProgramToken, created=$created, description=$description, isEnabled=$isEnabled, network=$network, isCardProgramDefault=$isCardProgramDefault, additionalProperties=$additionalProperties}"
}
