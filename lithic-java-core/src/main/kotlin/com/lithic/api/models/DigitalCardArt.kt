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
import java.util.Optional

@JsonDeserialize(builder = DigitalCardArt.Builder::class)
@NoAutoDetect
class DigitalCardArt
private constructor(
    private val token: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val isEnabled: JsonField<Boolean>,
    private val isCardProgramDefault: JsonField<Boolean>,
    private val created: JsonField<OffsetDateTime>,
    private val network: JsonField<Network>,
    private val description: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the card art. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the card program. */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** Whether the card art is enabled. */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    /** Whether the card art is the default card art to be added upon tokenization. */
    fun isCardProgramDefault(): Optional<Boolean> =
        Optional.ofNullable(isCardProgramDefault.getNullable("is_card_program_default"))

    /** Timestamp of when card art was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Card network. */
    fun network(): Network = network.getRequired("network")

    /** Description of the card art. */
    fun description(): String = description.getRequired("description")

    /** Globally unique identifier for the card art. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for the card program. */
    @JsonProperty("card_program_token") @ExcludeMissing fun _cardProgramToken() = cardProgramToken

    /** Whether the card art is enabled. */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled() = isEnabled

    /** Whether the card art is the default card art to be added upon tokenization. */
    @JsonProperty("is_card_program_default")
    @ExcludeMissing
    fun _isCardProgramDefault() = isCardProgramDefault

    /** Timestamp of when card art was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Card network. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** Description of the card art. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DigitalCardArt = apply {
        if (!validated) {
            token()
            cardProgramToken()
            isEnabled()
            isCardProgramDefault()
            created()
            network()
            description()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalCardArt &&
            this.token == other.token &&
            this.cardProgramToken == other.cardProgramToken &&
            this.isEnabled == other.isEnabled &&
            this.isCardProgramDefault == other.isCardProgramDefault &&
            this.created == other.created &&
            this.network == other.network &&
            this.description == other.description &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    cardProgramToken,
                    isEnabled,
                    isCardProgramDefault,
                    created,
                    network,
                    description,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DigitalCardArt{token=$token, cardProgramToken=$cardProgramToken, isEnabled=$isEnabled, isCardProgramDefault=$isCardProgramDefault, created=$created, network=$network, description=$description, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var cardProgramToken: JsonField<String> = JsonMissing.of()
        private var isEnabled: JsonField<Boolean> = JsonMissing.of()
        private var isCardProgramDefault: JsonField<Boolean> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardArt: DigitalCardArt) = apply {
            this.token = digitalCardArt.token
            this.cardProgramToken = digitalCardArt.cardProgramToken
            this.isEnabled = digitalCardArt.isEnabled
            this.isCardProgramDefault = digitalCardArt.isCardProgramDefault
            this.created = digitalCardArt.created
            this.network = digitalCardArt.network
            this.description = digitalCardArt.description
            additionalProperties(digitalCardArt.additionalProperties)
        }

        /** Globally unique identifier for the card art. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the card art. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the card program. */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /** Globally unique identifier for the card program. */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /** Whether the card art is enabled. */
        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /** Whether the card art is enabled. */
        @JsonProperty("is_enabled")
        @ExcludeMissing
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        /** Whether the card art is the default card art to be added upon tokenization. */
        fun isCardProgramDefault(isCardProgramDefault: Boolean) =
            isCardProgramDefault(JsonField.of(isCardProgramDefault))

        /** Whether the card art is the default card art to be added upon tokenization. */
        @JsonProperty("is_card_program_default")
        @ExcludeMissing
        fun isCardProgramDefault(isCardProgramDefault: JsonField<Boolean>) = apply {
            this.isCardProgramDefault = isCardProgramDefault
        }

        /** Timestamp of when card art was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when card art was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Card network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Description of the card art. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the card art. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

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
                token,
                cardProgramToken,
                isEnabled,
                isCardProgramDefault,
                created,
                network,
                description,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Network && this.value == other.value
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
}
