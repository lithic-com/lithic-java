// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CardProgram.Builder::class)
@NoAutoDetect
class CardProgram
private constructor(
    private val cardholderCurrency: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val panRangeEnd: JsonField<String>,
    private val panRangeStart: JsonField<String>,
    private val settlementCurrencies: JsonField<List<String>>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
    fun cardholderCurrency(): Optional<String> =
        Optional.ofNullable(cardholderCurrency.getNullable("cardholder_currency"))

    /** Timestamp of when the card program was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** The name of the card program. */
    fun name(): String = name.getRequired("name")

    /** The first digits of the card number that this card program ends with. */
    fun panRangeEnd(): String = panRangeEnd.getRequired("pan_range_end")

    /** The first digits of the card number that this card program starts with. */
    fun panRangeStart(): String = panRangeStart.getRequired("pan_range_start")

    /**
     * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program supports
     * for settlement.
     */
    fun settlementCurrencies(): Optional<List<String>> =
        Optional.ofNullable(settlementCurrencies.getNullable("settlement_currencies"))

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency() = cardholderCurrency

    /** Timestamp of when the card program was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** The name of the card program. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The first digits of the card number that this card program ends with. */
    @JsonProperty("pan_range_end") @ExcludeMissing fun _panRangeEnd() = panRangeEnd

    /** The first digits of the card number that this card program starts with. */
    @JsonProperty("pan_range_start") @ExcludeMissing fun _panRangeStart() = panRangeStart

    /**
     * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program supports
     * for settlement.
     */
    @JsonProperty("settlement_currencies")
    @ExcludeMissing
    fun _settlementCurrencies() = settlementCurrencies

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardProgram = apply {
        if (!validated) {
            cardholderCurrency()
            created()
            name()
            panRangeEnd()
            panRangeStart()
            settlementCurrencies()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var panRangeEnd: JsonField<String> = JsonMissing.of()
        private var panRangeStart: JsonField<String> = JsonMissing.of()
        private var settlementCurrencies: JsonField<List<String>> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProgram: CardProgram) = apply {
            this.cardholderCurrency = cardProgram.cardholderCurrency
            this.created = cardProgram.created
            this.name = cardProgram.name
            this.panRangeEnd = cardProgram.panRangeEnd
            this.panRangeStart = cardProgram.panRangeStart
            this.settlementCurrencies = cardProgram.settlementCurrencies
            this.token = cardProgram.token
            additionalProperties(cardProgram.additionalProperties)
        }

        /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
        }

        /** Timestamp of when the card program was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the card program was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The name of the card program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the card program. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The first digits of the card number that this card program ends with. */
        fun panRangeEnd(panRangeEnd: String) = panRangeEnd(JsonField.of(panRangeEnd))

        /** The first digits of the card number that this card program ends with. */
        @JsonProperty("pan_range_end")
        @ExcludeMissing
        fun panRangeEnd(panRangeEnd: JsonField<String>) = apply { this.panRangeEnd = panRangeEnd }

        /** The first digits of the card number that this card program starts with. */
        fun panRangeStart(panRangeStart: String) = panRangeStart(JsonField.of(panRangeStart))

        /** The first digits of the card number that this card program starts with. */
        @JsonProperty("pan_range_start")
        @ExcludeMissing
        fun panRangeStart(panRangeStart: JsonField<String>) = apply {
            this.panRangeStart = panRangeStart
        }

        /**
         * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program
         * supports for settlement.
         */
        fun settlementCurrencies(settlementCurrencies: List<String>) =
            settlementCurrencies(JsonField.of(settlementCurrencies))

        /**
         * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program
         * supports for settlement.
         */
        @JsonProperty("settlement_currencies")
        @ExcludeMissing
        fun settlementCurrencies(settlementCurrencies: JsonField<List<String>>) = apply {
            this.settlementCurrencies = settlementCurrencies
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
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

        fun build(): CardProgram =
            CardProgram(
                cardholderCurrency,
                created,
                name,
                panRangeEnd,
                panRangeStart,
                settlementCurrencies.map { it.toImmutable() },
                token,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgram && cardholderCurrency == other.cardholderCurrency && created == other.created && name == other.name && panRangeEnd == other.panRangeEnd && panRangeStart == other.panRangeStart && settlementCurrencies == other.settlementCurrencies && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cardholderCurrency, created, name, panRangeEnd, panRangeStart, settlementCurrencies, token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardProgram{cardholderCurrency=$cardholderCurrency, created=$created, name=$name, panRangeEnd=$panRangeEnd, panRangeStart=$panRangeStart, settlementCurrencies=$settlementCurrencies, token=$token, additionalProperties=$additionalProperties}"
}
