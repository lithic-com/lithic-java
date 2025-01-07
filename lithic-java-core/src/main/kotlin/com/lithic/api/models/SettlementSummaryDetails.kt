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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class SettlementSummaryDetails
@JsonCreator
private constructor(
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    private val disputesGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("institution")
    @ExcludeMissing
    private val institution: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    private val interchangeGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    private val otherFeesGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    private val settledNetAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    private val transactionsGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** ISO 4217 alpha 3 code. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** The total gross amount of disputes settlements. */
    fun disputesGrossAmount(): Optional<Long> =
        Optional.ofNullable(disputesGrossAmount.getNullable("disputes_gross_amount"))

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun institution(): Optional<String> =
        Optional.ofNullable(institution.getNullable("institution"))

    /** The total amount of interchange. */
    fun interchangeGrossAmount(): Optional<Long> =
        Optional.ofNullable(interchangeGrossAmount.getNullable("interchange_gross_amount"))

    /** Card network where the transaction took place */
    fun network(): Optional<Network> = Optional.ofNullable(network.getNullable("network"))

    /** Total amount of gross other fees outside of interchange. */
    fun otherFeesGrossAmount(): Optional<Long> =
        Optional.ofNullable(otherFeesGrossAmount.getNullable("other_fees_gross_amount"))

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     */
    fun settledNetAmount(): Optional<Long> =
        Optional.ofNullable(settledNetAmount.getNullable("settled_net_amount"))

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    fun transactionsGrossAmount(): Optional<Long> =
        Optional.ofNullable(transactionsGrossAmount.getNullable("transactions_gross_amount"))

    /** ISO 4217 alpha 3 code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The total gross amount of disputes settlements. */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount(): JsonField<Long> = disputesGrossAmount

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("institution") @ExcludeMissing fun _institution(): JsonField<String> = institution

    /** The total amount of interchange. */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount(): JsonField<Long> = interchangeGrossAmount

    /** Card network where the transaction took place */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /** Total amount of gross other fees outside of interchange. */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount(): JsonField<Long> = otherFeesGrossAmount

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     */
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    fun _settledNetAmount(): JsonField<Long> = settledNetAmount

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount(): JsonField<Long> = transactionsGrossAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SettlementSummaryDetails = apply {
        if (!validated) {
            currency()
            disputesGrossAmount()
            institution()
            interchangeGrossAmount()
            network()
            otherFeesGrossAmount()
            settledNetAmount()
            transactionsGrossAmount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var currency: JsonField<String> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var institution: JsonField<String> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var settledNetAmount: JsonField<Long> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementSummaryDetails: SettlementSummaryDetails) = apply {
            currency = settlementSummaryDetails.currency
            disputesGrossAmount = settlementSummaryDetails.disputesGrossAmount
            institution = settlementSummaryDetails.institution
            interchangeGrossAmount = settlementSummaryDetails.interchangeGrossAmount
            network = settlementSummaryDetails.network
            otherFeesGrossAmount = settlementSummaryDetails.otherFeesGrossAmount
            settledNetAmount = settlementSummaryDetails.settledNetAmount
            transactionsGrossAmount = settlementSummaryDetails.transactionsGrossAmount
            additionalProperties = settlementSummaryDetails.additionalProperties.toMutableMap()
        }

        /** ISO 4217 alpha 3 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** ISO 4217 alpha 3 code. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The total gross amount of disputes settlements. */
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /** The total gross amount of disputes settlements. */
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun institution(institution: String) = institution(JsonField.of(institution))

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun institution(institution: JsonField<String>) = apply { this.institution = institution }

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Card network where the transaction took place */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network where the transaction took place */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees).
         */
        fun settledNetAmount(settledNetAmount: Long) =
            settledNetAmount(JsonField.of(settledNetAmount))

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees).
         */
        fun settledNetAmount(settledNetAmount: JsonField<Long>) = apply {
            this.settledNetAmount = settledNetAmount
        }

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes).
         */
        fun transactionsGrossAmount(transactionsGrossAmount: Long) =
            transactionsGrossAmount(JsonField.of(transactionsGrossAmount))

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes).
         */
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
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

        fun build(): SettlementSummaryDetails =
            SettlementSummaryDetails(
                currency,
                disputesGrossAmount,
                institution,
                interchangeGrossAmount,
                network,
                otherFeesGrossAmount,
                settledNetAmount,
                transactionsGrossAmount,
                additionalProperties.toImmutable(),
            )
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
        }

        enum class Value {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                UNKNOWN -> Value.UNKNOWN
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                UNKNOWN -> Known.UNKNOWN
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

        return /* spotless:off */ other is SettlementSummaryDetails && currency == other.currency && disputesGrossAmount == other.disputesGrossAmount && institution == other.institution && interchangeGrossAmount == other.interchangeGrossAmount && network == other.network && otherFeesGrossAmount == other.otherFeesGrossAmount && settledNetAmount == other.settledNetAmount && transactionsGrossAmount == other.transactionsGrossAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(currency, disputesGrossAmount, institution, interchangeGrossAmount, network, otherFeesGrossAmount, settledNetAmount, transactionsGrossAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementSummaryDetails{currency=$currency, disputesGrossAmount=$disputesGrossAmount, institution=$institution, interchangeGrossAmount=$interchangeGrossAmount, network=$network, otherFeesGrossAmount=$otherFeesGrossAmount, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, additionalProperties=$additionalProperties}"
}
