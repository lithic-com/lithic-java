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

@JsonDeserialize(builder = SettlementDetail.Builder::class)
@NoAutoDetect
class SettlementDetail
private constructor(
    private val token: JsonField<String>,
    private val institution: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val eventTokens: JsonField<List<String>>,
    private val transactionToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val currency: JsonField<String>,
    private val network: JsonField<Network>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val disputesGrossAmount: JsonField<Long>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val otherFeesDetails: JsonField<OtherFeesDetails>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val settlementDate: JsonField<String>,
    private val reportDate: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier denoting the Settlement Detail. */
    fun token(): String = token.getRequired("token")

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun institution(): String = institution.getRequired("institution")

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** Globally unique identifiers denoting the Events associated with this settlement. */
    fun eventTokens(): List<String> = eventTokens.getRequired("event_tokens")

    /** Globally unique identifier denoting the associated Transaction object. */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /** Globally unique identifier denoting the card that the associated Transaction occurred on. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Globally unique identifier denoting the card program that the associated Transaction occurred
     * on.
     */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** Three-digit alphabetic ISO 4217 code. */
    fun currency(): String = currency.getRequired("currency")

    /** Card network where the transaction took place. */
    fun network(): Network = network.getRequired("network")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /** The total amount of interchange. */
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /** The total gross amount of disputes settlements. */
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /** Total amount of gross other fees outside of interchange. */
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /** The total gross amount of other fees by type. */
    fun otherFeesDetails(): OtherFeesDetails = otherFeesDetails.getRequired("other_fees_details")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Date of when money movement is triggered for the transaction. */
    fun settlementDate(): String = settlementDate.getRequired("settlement_date")

    /** Date of when the report was first generated. */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /** Globally unique identifier denoting the Settlement Detail. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("institution") @ExcludeMissing fun _institution() = institution

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** Globally unique identifiers denoting the Events associated with this settlement. */
    @JsonProperty("event_tokens") @ExcludeMissing fun _eventTokens() = eventTokens

    /** Globally unique identifier denoting the associated Transaction object. */
    @JsonProperty("transaction_token") @ExcludeMissing fun _transactionToken() = transactionToken

    /** Globally unique identifier denoting the card that the associated Transaction occurred on. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    /**
     * Globally unique identifier denoting the card program that the associated Transaction occurred
     * on.
     */
    @JsonProperty("card_program_token") @ExcludeMissing fun _cardProgramToken() = cardProgramToken

    /** Three-digit alphabetic ISO 4217 code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Card network where the transaction took place. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

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

    /** The total gross amount of other fees by type. */
    @JsonProperty("other_fees_details") @ExcludeMissing fun _otherFeesDetails() = otherFeesDetails

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    /** Date of when money movement is triggered for the transaction. */
    @JsonProperty("settlement_date") @ExcludeMissing fun _settlementDate() = settlementDate

    /** Date of when the report was first generated. */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate() = reportDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SettlementDetail = apply {
        if (!validated) {
            token()
            institution()
            accountToken()
            eventTokens()
            transactionToken()
            cardToken()
            cardProgramToken()
            currency()
            network()
            transactionsGrossAmount()
            interchangeGrossAmount()
            disputesGrossAmount()
            otherFeesGrossAmount()
            otherFeesDetails().validate()
            created()
            updated()
            settlementDate()
            reportDate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettlementDetail &&
            this.token == other.token &&
            this.institution == other.institution &&
            this.accountToken == other.accountToken &&
            this.eventTokens == other.eventTokens &&
            this.transactionToken == other.transactionToken &&
            this.cardToken == other.cardToken &&
            this.cardProgramToken == other.cardProgramToken &&
            this.currency == other.currency &&
            this.network == other.network &&
            this.transactionsGrossAmount == other.transactionsGrossAmount &&
            this.interchangeGrossAmount == other.interchangeGrossAmount &&
            this.disputesGrossAmount == other.disputesGrossAmount &&
            this.otherFeesGrossAmount == other.otherFeesGrossAmount &&
            this.otherFeesDetails == other.otherFeesDetails &&
            this.created == other.created &&
            this.updated == other.updated &&
            this.settlementDate == other.settlementDate &&
            this.reportDate == other.reportDate &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    institution,
                    accountToken,
                    eventTokens,
                    transactionToken,
                    cardToken,
                    cardProgramToken,
                    currency,
                    network,
                    transactionsGrossAmount,
                    interchangeGrossAmount,
                    disputesGrossAmount,
                    otherFeesGrossAmount,
                    otherFeesDetails,
                    created,
                    updated,
                    settlementDate,
                    reportDate,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SettlementDetail{token=$token, institution=$institution, accountToken=$accountToken, eventTokens=$eventTokens, transactionToken=$transactionToken, cardToken=$cardToken, cardProgramToken=$cardProgramToken, currency=$currency, network=$network, transactionsGrossAmount=$transactionsGrossAmount, interchangeGrossAmount=$interchangeGrossAmount, disputesGrossAmount=$disputesGrossAmount, otherFeesGrossAmount=$otherFeesGrossAmount, otherFeesDetails=$otherFeesDetails, created=$created, updated=$updated, settlementDate=$settlementDate, reportDate=$reportDate, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var institution: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var eventTokens: JsonField<List<String>> = JsonMissing.of()
        private var transactionToken: JsonField<String> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var cardProgramToken: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var otherFeesDetails: JsonField<OtherFeesDetails> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var settlementDate: JsonField<String> = JsonMissing.of()
        private var reportDate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementDetail: SettlementDetail) = apply {
            this.token = settlementDetail.token
            this.institution = settlementDetail.institution
            this.accountToken = settlementDetail.accountToken
            this.eventTokens = settlementDetail.eventTokens
            this.transactionToken = settlementDetail.transactionToken
            this.cardToken = settlementDetail.cardToken
            this.cardProgramToken = settlementDetail.cardProgramToken
            this.currency = settlementDetail.currency
            this.network = settlementDetail.network
            this.transactionsGrossAmount = settlementDetail.transactionsGrossAmount
            this.interchangeGrossAmount = settlementDetail.interchangeGrossAmount
            this.disputesGrossAmount = settlementDetail.disputesGrossAmount
            this.otherFeesGrossAmount = settlementDetail.otherFeesGrossAmount
            this.otherFeesDetails = settlementDetail.otherFeesDetails
            this.created = settlementDetail.created
            this.updated = settlementDetail.updated
            this.settlementDate = settlementDetail.settlementDate
            this.reportDate = settlementDetail.reportDate
            additionalProperties(settlementDetail.additionalProperties)
        }

        /** Globally unique identifier denoting the Settlement Detail. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier denoting the Settlement Detail. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Globally unique identifiers denoting the Events associated with this settlement. */
        fun eventTokens(eventTokens: List<String>) = eventTokens(JsonField.of(eventTokens))

        /** Globally unique identifiers denoting the Events associated with this settlement. */
        @JsonProperty("event_tokens")
        @ExcludeMissing
        fun eventTokens(eventTokens: JsonField<List<String>>) = apply {
            this.eventTokens = eventTokens
        }

        /** Globally unique identifier denoting the associated Transaction object. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /** Globally unique identifier denoting the associated Transaction object. */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
        }

        /**
         * Globally unique identifier denoting the card that the associated Transaction occurred on.
         */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Globally unique identifier denoting the card that the associated Transaction occurred on.
         */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /**
         * Globally unique identifier denoting the card program that the associated Transaction
         * occurred on.
         */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /**
         * Globally unique identifier denoting the card program that the associated Transaction
         * occurred on.
         */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /** Three-digit alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** Three-digit alphabetic ISO 4217 code. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Card network where the transaction took place. */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network where the transaction took place. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

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

        /** The total gross amount of other fees by type. */
        fun otherFeesDetails(otherFeesDetails: OtherFeesDetails) =
            otherFeesDetails(JsonField.of(otherFeesDetails))

        /** The total gross amount of other fees by type. */
        @JsonProperty("other_fees_details")
        @ExcludeMissing
        fun otherFeesDetails(otherFeesDetails: JsonField<OtherFeesDetails>) = apply {
            this.otherFeesDetails = otherFeesDetails
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Date of when money movement is triggered for the transaction. */
        fun settlementDate(settlementDate: String) = settlementDate(JsonField.of(settlementDate))

        /** Date of when money movement is triggered for the transaction. */
        @JsonProperty("settlement_date")
        @ExcludeMissing
        fun settlementDate(settlementDate: JsonField<String>) = apply {
            this.settlementDate = settlementDate
        }

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /** Date of when the report was first generated. */
        @JsonProperty("report_date")
        @ExcludeMissing
        fun reportDate(reportDate: JsonField<String>) = apply { this.reportDate = reportDate }

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

        fun build(): SettlementDetail =
            SettlementDetail(
                token,
                institution,
                accountToken,
                eventTokens.map { it.toUnmodifiable() },
                transactionToken,
                cardToken,
                cardProgramToken,
                currency,
                network,
                transactionsGrossAmount,
                interchangeGrossAmount,
                disputesGrossAmount,
                otherFeesGrossAmount,
                otherFeesDetails,
                created,
                updated,
                settlementDate,
                reportDate,
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

    /** The total gross amount of other fees by type. */
    @JsonDeserialize(builder = OtherFeesDetails.Builder::class)
    @NoAutoDetect
    class OtherFeesDetails
    private constructor(
        private val isa: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun isa(): Optional<Long> = Optional.ofNullable(isa.getNullable("ISA"))

        @JsonProperty("ISA") @ExcludeMissing fun _isa() = isa

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): OtherFeesDetails = apply {
            if (!validated) {
                isa()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OtherFeesDetails &&
                this.isa == other.isa &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(isa, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "OtherFeesDetails{isa=$isa, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var isa: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(otherFeesDetails: OtherFeesDetails) = apply {
                this.isa = otherFeesDetails.isa
                additionalProperties(otherFeesDetails.additionalProperties)
            }

            fun isa(isa: Long) = isa(JsonField.of(isa))

            @JsonProperty("ISA")
            @ExcludeMissing
            fun isa(isa: JsonField<Long>) = apply { this.isa = isa }

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

            fun build(): OtherFeesDetails =
                OtherFeesDetails(isa, additionalProperties.toUnmodifiable())
        }
    }
}
