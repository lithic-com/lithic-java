// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CardProgram
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pan_range_end")
    @ExcludeMissing
    private val panRangeEnd: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pan_range_start")
    @ExcludeMissing
    private val panRangeStart: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    private val cardholderCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settlement_currencies")
    @ExcludeMissing
    private val settlementCurrencies: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Timestamp of when the card program was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** The name of the card program. */
    fun name(): String = name.getRequired("name")

    /** The first digits of the card number that this card program ends with. */
    fun panRangeEnd(): String = panRangeEnd.getRequired("pan_range_end")

    /** The first digits of the card number that this card program starts with. */
    fun panRangeStart(): String = panRangeStart.getRequired("pan_range_start")

    /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
    fun cardholderCurrency(): Optional<String> =
        Optional.ofNullable(cardholderCurrency.getNullable("cardholder_currency"))

    /**
     * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program supports
     * for settlement.
     */
    fun settlementCurrencies(): Optional<List<String>> =
        Optional.ofNullable(settlementCurrencies.getNullable("settlement_currencies"))

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Timestamp of when the card program was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** The name of the card program. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The first digits of the card number that this card program ends with. */
    @JsonProperty("pan_range_end")
    @ExcludeMissing
    fun _panRangeEnd(): JsonField<String> = panRangeEnd

    /** The first digits of the card number that this card program starts with. */
    @JsonProperty("pan_range_start")
    @ExcludeMissing
    fun _panRangeStart(): JsonField<String> = panRangeStart

    /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program supports
     * for settlement.
     */
    @JsonProperty("settlement_currencies")
    @ExcludeMissing
    fun _settlementCurrencies(): JsonField<List<String>> = settlementCurrencies

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardProgram = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        name()
        panRangeEnd()
        panRangeStart()
        cardholderCurrency()
        settlementCurrencies()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgram].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .name()
         * .panRangeEnd()
         * .panRangeStart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardProgram]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var panRangeEnd: JsonField<String>? = null
        private var panRangeStart: JsonField<String>? = null
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var settlementCurrencies: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProgram: CardProgram) = apply {
            token = cardProgram.token
            created = cardProgram.created
            name = cardProgram.name
            panRangeEnd = cardProgram.panRangeEnd
            panRangeStart = cardProgram.panRangeStart
            cardholderCurrency = cardProgram.cardholderCurrency
            settlementCurrencies = cardProgram.settlementCurrencies.map { it.toMutableList() }
            additionalProperties = cardProgram.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when the card program was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the card program was created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The name of the card program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the card program. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The first digits of the card number that this card program ends with. */
        fun panRangeEnd(panRangeEnd: String) = panRangeEnd(JsonField.of(panRangeEnd))

        /** The first digits of the card number that this card program ends with. */
        fun panRangeEnd(panRangeEnd: JsonField<String>) = apply { this.panRangeEnd = panRangeEnd }

        /** The first digits of the card number that this card program starts with. */
        fun panRangeStart(panRangeStart: String) = panRangeStart(JsonField.of(panRangeStart))

        /** The first digits of the card number that this card program starts with. */
        fun panRangeStart(panRangeStart: JsonField<String>) = apply {
            this.panRangeStart = panRangeStart
        }

        /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /** 3-digit alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
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
        fun settlementCurrencies(settlementCurrencies: JsonField<List<String>>) = apply {
            this.settlementCurrencies = settlementCurrencies.map { it.toMutableList() }
        }

        /**
         * List of 3-digit alphabetic ISO 4217 codes for the currencies that the card program
         * supports for settlement.
         */
        fun addSettlementCurrency(settlementCurrency: String) = apply {
            settlementCurrencies =
                (settlementCurrencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("settlementCurrencies", it).add(settlementCurrency)
                }
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

        fun build(): CardProgram =
            CardProgram(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("name", name),
                checkRequired("panRangeEnd", panRangeEnd),
                checkRequired("panRangeStart", panRangeStart),
                cardholderCurrency,
                (settlementCurrencies ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgram && token == other.token && created == other.created && name == other.name && panRangeEnd == other.panRangeEnd && panRangeStart == other.panRangeStart && cardholderCurrency == other.cardholderCurrency && settlementCurrencies == other.settlementCurrencies && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, name, panRangeEnd, panRangeStart, cardholderCurrency, settlementCurrencies, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardProgram{token=$token, created=$created, name=$name, panRangeEnd=$panRangeEnd, panRangeStart=$panRangeStart, cardholderCurrency=$cardholderCurrency, settlementCurrencies=$settlementCurrencies, additionalProperties=$additionalProperties}"
}
