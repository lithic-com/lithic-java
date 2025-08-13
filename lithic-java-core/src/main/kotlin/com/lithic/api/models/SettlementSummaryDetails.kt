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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SettlementSummaryDetails
private constructor(
    private val currency: JsonField<String>,
    private val disputesGrossAmount: JsonField<Long>,
    private val institution: JsonField<String>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val network: JsonField<Network>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val settledNetAmount: JsonField<Long>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        disputesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("institution")
        @ExcludeMissing
        institution: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        interchangeGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        otherFeesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("settled_net_amount")
        @ExcludeMissing
        settledNetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        transactionsGrossAmount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        currency,
        disputesGrossAmount,
        institution,
        interchangeGrossAmount,
        network,
        otherFeesGrossAmount,
        settledNetAmount,
        transactionsGrossAmount,
        mutableMapOf(),
    )

    /**
     * 3-character alphabetic ISO 4217 code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * The total gross amount of disputes settlements.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disputesGrossAmount(): Optional<Long> =
        disputesGrossAmount.getOptional("disputes_gross_amount")

    /**
     * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun institution(): Optional<String> = institution.getOptional("institution")

    /**
     * The total amount of interchange.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interchangeGrossAmount(): Optional<Long> =
        interchangeGrossAmount.getOptional("interchange_gross_amount")

    /**
     * Card network where the transaction took place
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun network(): Optional<Network> = network.getOptional("network")

    /**
     * Total amount of gross other fees outside of interchange.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherFeesGrossAmount(): Optional<Long> =
        otherFeesGrossAmount.getOptional("other_fees_gross_amount")

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settledNetAmount(): Optional<Long> = settledNetAmount.getOptional("settled_net_amount")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionsGrossAmount(): Optional<Long> =
        transactionsGrossAmount.getOptional("transactions_gross_amount")

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [disputesGrossAmount].
     *
     * Unlike [disputesGrossAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount(): JsonField<Long> = disputesGrossAmount

    /**
     * Returns the raw JSON value of [institution].
     *
     * Unlike [institution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("institution") @ExcludeMissing fun _institution(): JsonField<String> = institution

    /**
     * Returns the raw JSON value of [interchangeGrossAmount].
     *
     * Unlike [interchangeGrossAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount(): JsonField<Long> = interchangeGrossAmount

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [otherFeesGrossAmount].
     *
     * Unlike [otherFeesGrossAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount(): JsonField<Long> = otherFeesGrossAmount

    /**
     * Returns the raw JSON value of [settledNetAmount].
     *
     * Unlike [settledNetAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    fun _settledNetAmount(): JsonField<Long> = settledNetAmount

    /**
     * Returns the raw JSON value of [transactionsGrossAmount].
     *
     * Unlike [transactionsGrossAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount(): JsonField<Long> = transactionsGrossAmount

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

        /** Returns a mutable builder for constructing an instance of [SettlementSummaryDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettlementSummaryDetails]. */
    class Builder internal constructor() {

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

        /** 3-character alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The total gross amount of disputes settlements. */
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /**
         * Sets [Builder.disputesGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputesGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun institution(institution: String) = institution(JsonField.of(institution))

        /**
         * Sets [Builder.institution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.institution] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun institution(institution: JsonField<String>) = apply { this.institution = institution }

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /**
         * Sets [Builder.interchangeGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interchangeGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Card network where the transaction took place */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /**
         * Sets [Builder.otherFeesGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherFeesGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.settledNetAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledNetAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.transactionsGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionsGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [SettlementSummaryDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettlementSummaryDetails = apply {
        if (validated) {
            return@apply
        }

        currency()
        disputesGrossAmount()
        institution()
        interchangeGrossAmount()
        network().ifPresent { it.validate() }
        otherFeesGrossAmount()
        settledNetAmount()
        transactionsGrossAmount()
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
        (if (currency.asKnown().isPresent) 1 else 0) +
            (if (disputesGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (institution.asKnown().isPresent) 1 else 0) +
            (if (interchangeGrossAmount.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (otherFeesGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (settledNetAmount.asKnown().isPresent) 1 else 0) +
            (if (transactionsGrossAmount.asKnown().isPresent) 1 else 0)

    /** Card network where the transaction took place */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
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
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
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
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                UNKNOWN -> Value.UNKNOWN
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
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                UNKNOWN -> Known.UNKNOWN
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
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

        fun validate(): Network = apply {
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

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettlementSummaryDetails &&
            currency == other.currency &&
            disputesGrossAmount == other.disputesGrossAmount &&
            institution == other.institution &&
            interchangeGrossAmount == other.interchangeGrossAmount &&
            network == other.network &&
            otherFeesGrossAmount == other.otherFeesGrossAmount &&
            settledNetAmount == other.settledNetAmount &&
            transactionsGrossAmount == other.transactionsGrossAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currency,
            disputesGrossAmount,
            institution,
            interchangeGrossAmount,
            network,
            otherFeesGrossAmount,
            settledNetAmount,
            transactionsGrossAmount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementSummaryDetails{currency=$currency, disputesGrossAmount=$disputesGrossAmount, institution=$institution, interchangeGrossAmount=$interchangeGrossAmount, network=$network, otherFeesGrossAmount=$otherFeesGrossAmount, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, additionalProperties=$additionalProperties}"
}
