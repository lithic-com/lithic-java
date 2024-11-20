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

@JsonDeserialize(builder = DigitalCardArt.Builder::class)
@NoAutoDetect
class DigitalCardArt
private constructor(
    private val cardProgramToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val isCardProgramDefault: JsonField<Boolean>,
    private val isEnabled: JsonField<Boolean>,
    private val network: JsonField<Network>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for the card program. */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** Timestamp of when card art was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Description of the card art. */
    fun description(): String = description.getRequired("description")

    /** Whether the card art is the default card art to be added upon tokenization. */
    fun isCardProgramDefault(): Optional<Boolean> =
        Optional.ofNullable(isCardProgramDefault.getNullable("is_card_program_default"))

    /** Whether the card art is enabled. */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    /** Card network. */
    fun network(): Network = network.getRequired("network")

    /** Globally unique identifier for the card art. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the card program. */
    @JsonProperty("card_program_token") @ExcludeMissing fun _cardProgramToken() = cardProgramToken

    /** Timestamp of when card art was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Description of the card art. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Whether the card art is the default card art to be added upon tokenization. */
    @JsonProperty("is_card_program_default")
    @ExcludeMissing
    fun _isCardProgramDefault() = isCardProgramDefault

    /** Whether the card art is enabled. */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled() = isEnabled

    /** Card network. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** Globally unique identifier for the card art. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DigitalCardArt = apply {
        if (!validated) {
            cardProgramToken()
            created()
            description()
            isCardProgramDefault()
            isEnabled()
            network()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var cardProgramToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var isCardProgramDefault: JsonField<Boolean> = JsonMissing.of()
        private var isEnabled: JsonField<Boolean> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardArt: DigitalCardArt) = apply {
            this.cardProgramToken = digitalCardArt.cardProgramToken
            this.created = digitalCardArt.created
            this.description = digitalCardArt.description
            this.isCardProgramDefault = digitalCardArt.isCardProgramDefault
            this.isEnabled = digitalCardArt.isEnabled
            this.network = digitalCardArt.network
            this.token = digitalCardArt.token
            additionalProperties(digitalCardArt.additionalProperties)
        }

        /** Globally unique identifier for the card program. */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /** Globally unique identifier for the card program. */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /** Timestamp of when card art was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when card art was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Description of the card art. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the card art. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether the card art is the default card art to be added upon tokenization. */
        fun isCardProgramDefault(isCardProgramDefault: Boolean) =
            isCardProgramDefault(JsonField.of(isCardProgramDefault))

        /** Whether the card art is the default card art to be added upon tokenization. */
        @JsonProperty("is_card_program_default")
        @ExcludeMissing
        fun isCardProgramDefault(isCardProgramDefault: JsonField<Boolean>) = apply {
            this.isCardProgramDefault = isCardProgramDefault
        }

        /** Whether the card art is enabled. */
        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /** Whether the card art is enabled. */
        @JsonProperty("is_enabled")
        @ExcludeMissing
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        /** Card network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Globally unique identifier for the card art. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the card art. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): DigitalCardArt =
            DigitalCardArt(
                cardProgramToken,
                created,
                description,
                isCardProgramDefault,
                isEnabled,
                network,
                token,
                additionalProperties.toImmutable(),
            )
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MASTERCARD = Network(JsonField.of("MASTERCARD"))

            @JvmField val VISA = Network(JsonField.of("VISA"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            MASTERCARD,
            VISA,
        }

        enum class Value {
            MASTERCARD,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MASTERCARD -> Value.MASTERCARD
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MASTERCARD -> Known.MASTERCARD
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArt && cardProgramToken == other.cardProgramToken && created == other.created && description == other.description && isCardProgramDefault == other.isCardProgramDefault && isEnabled == other.isEnabled && network == other.network && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cardProgramToken, created, description, isCardProgramDefault, isEnabled, network, token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalCardArt{cardProgramToken=$cardProgramToken, created=$created, description=$description, isCardProgramDefault=$isCardProgramDefault, isEnabled=$isEnabled, network=$network, token=$token, additionalProperties=$additionalProperties}"
}
