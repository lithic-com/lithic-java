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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = SettlementSummaryDetails.Builder::class)
@NoAutoDetect
class SettlementSummaryDetails
private constructor(
    private val network: JsonField<Network>,
    private val institution: JsonField<String>,
    private val settledNetAmount: JsonField<Long>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val disputesGrossAmount: JsonField<Long>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Card network where the transaction took place */
    fun network(): Optional<Network> = Optional.ofNullable(network.getNullable("network"))

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun institution(): Optional<String> =
        Optional.ofNullable(institution.getNullable("institution"))

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

    /** The total amount of interchange. */
    fun interchangeGrossAmount(): Optional<Long> =
        Optional.ofNullable(interchangeGrossAmount.getNullable("interchange_gross_amount"))

    /** The total gross amount of disputes settlements. */
    fun disputesGrossAmount(): Optional<Long> =
        Optional.ofNullable(disputesGrossAmount.getNullable("disputes_gross_amount"))

    /** Total amount of gross other fees outside of interchange. */
    fun otherFeesGrossAmount(): Optional<Long> =
        Optional.ofNullable(otherFeesGrossAmount.getNullable("other_fees_gross_amount"))

    /** Card network where the transaction took place */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("institution") @ExcludeMissing fun _institution() = institution

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     */
    @JsonProperty("settled_net_amount") @ExcludeMissing fun _settledNetAmount() = settledNetAmount

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount() = transactionsGrossAmount

    /** The total amount of interchange. */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount() = interchangeGrossAmount

    /** The total gross amount of disputes settlements. */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount() = disputesGrossAmount

    /** Total amount of gross other fees outside of interchange. */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount() = otherFeesGrossAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SettlementSummaryDetails = apply {
        if (!validated) {
            network()
            institution()
            settledNetAmount()
            transactionsGrossAmount()
            interchangeGrossAmount()
            disputesGrossAmount()
            otherFeesGrossAmount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettlementSummaryDetails &&
            this.network == other.network &&
            this.institution == other.institution &&
            this.settledNetAmount == other.settledNetAmount &&
            this.transactionsGrossAmount == other.transactionsGrossAmount &&
            this.interchangeGrossAmount == other.interchangeGrossAmount &&
            this.disputesGrossAmount == other.disputesGrossAmount &&
            this.otherFeesGrossAmount == other.otherFeesGrossAmount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    network,
                    institution,
                    settledNetAmount,
                    transactionsGrossAmount,
                    interchangeGrossAmount,
                    disputesGrossAmount,
                    otherFeesGrossAmount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SettlementSummaryDetails{network=$network, institution=$institution, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, interchangeGrossAmount=$interchangeGrossAmount, disputesGrossAmount=$disputesGrossAmount, otherFeesGrossAmount=$otherFeesGrossAmount, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var network: JsonField<Network> = JsonMissing.of()
        private var institution: JsonField<String> = JsonMissing.of()
        private var settledNetAmount: JsonField<Long> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementSummaryDetails: SettlementSummaryDetails) = apply {
            this.network = settlementSummaryDetails.network
            this.institution = settlementSummaryDetails.institution
            this.settledNetAmount = settlementSummaryDetails.settledNetAmount
            this.transactionsGrossAmount = settlementSummaryDetails.transactionsGrossAmount
            this.interchangeGrossAmount = settlementSummaryDetails.interchangeGrossAmount
            this.disputesGrossAmount = settlementSummaryDetails.disputesGrossAmount
            this.otherFeesGrossAmount = settlementSummaryDetails.otherFeesGrossAmount
            additionalProperties(settlementSummaryDetails.additionalProperties)
        }

        /** Card network where the transaction took place */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network where the transaction took place */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun institution(institution: String) = institution(JsonField.of(institution))

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        @JsonProperty("institution")
        @ExcludeMissing
        fun institution(institution: JsonField<String>) = apply { this.institution = institution }

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
        @JsonProperty("settled_net_amount")
        @ExcludeMissing
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
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
        }

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /** The total amount of interchange. */
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** The total gross amount of disputes settlements. */
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /** The total gross amount of disputes settlements. */
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /** Total amount of gross other fees outside of interchange. */
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

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

        fun build(): SettlementSummaryDetails =
            SettlementSummaryDetails(
                network,
                institution,
                settledNetAmount,
                transactionsGrossAmount,
                interchangeGrossAmount,
                disputesGrossAmount,
                otherFeesGrossAmount,
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

            @JvmField val INTERLINK = Network(JsonField.of("INTERLINK"))

            @JvmField val MAESTRO = Network(JsonField.of("MAESTRO"))

            @JvmField val UNKNOWN = Network(JsonField.of("UNKNOWN"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            MASTERCARD,
            VISA,
            INTERLINK,
            MAESTRO,
            UNKNOWN,
        }

        enum class Value {
            MASTERCARD,
            VISA,
            INTERLINK,
            MAESTRO,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MASTERCARD -> Value.MASTERCARD
                VISA -> Value.VISA
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MASTERCARD -> Known.MASTERCARD
                VISA -> Known.VISA
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
