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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SettlementDetail
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val disputesGrossAmount: JsonField<Long>,
    private val eventTokens: JsonField<List<String>>,
    private val institution: JsonField<String>,
    private val interchangeFeeExtendedPrecision: JsonField<Long>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val network: JsonField<Network>,
    private val otherFeesDetails: JsonField<OtherFeesDetails>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val reportDate: JsonField<String>,
    private val settlementDate: JsonField<String>,
    private val transactionToken: JsonField<String>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val type: JsonField<Type>,
    private val updated: JsonField<OffsetDateTime>,
    private val feeDescription: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_program_token")
        @ExcludeMissing
        cardProgramToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        disputesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("event_tokens")
        @ExcludeMissing
        eventTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("institution")
        @ExcludeMissing
        institution: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interchange_fee_extended_precision")
        @ExcludeMissing
        interchangeFeeExtendedPrecision: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        interchangeGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("other_fees_details")
        @ExcludeMissing
        otherFeesDetails: JsonField<OtherFeesDetails> = JsonMissing.of(),
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        otherFeesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("report_date")
        @ExcludeMissing
        reportDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_date")
        @ExcludeMissing
        settlementDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        transactionsGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fee_description")
        @ExcludeMissing
        feeDescription: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        cardProgramToken,
        cardToken,
        created,
        currency,
        disputesGrossAmount,
        eventTokens,
        institution,
        interchangeFeeExtendedPrecision,
        interchangeGrossAmount,
        network,
        otherFeesDetails,
        otherFeesGrossAmount,
        reportDate,
        settlementDate,
        transactionToken,
        transactionsGrossAmount,
        type,
        updated,
        feeDescription,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier denoting the Settlement Detail.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Globally unique identifier denoting the card program that the associated Transaction occurred
     * on.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /**
     * Globally unique identifier denoting the card that the associated Transaction occurred on.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Date and time when the transaction first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Three-character alphabetic ISO 4217 code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The total gross amount of disputes settlements.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /**
     * Globally unique identifiers denoting the Events associated with this settlement.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTokens(): List<String> = eventTokens.getRequired("event_tokens")

    /**
     * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun institution(): String = institution.getRequired("institution")

    /**
     * The total amount of interchange in six-digit extended precision.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interchangeFeeExtendedPrecision(): Long =
        interchangeFeeExtendedPrecision.getRequired("interchange_fee_extended_precision")

    /**
     * The total amount of interchange.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /**
     * Card network where the transaction took place.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = network.getRequired("network")

    /**
     * The total gross amount of other fees by type.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun otherFeesDetails(): OtherFeesDetails = otherFeesDetails.getRequired("other_fees_details")

    /**
     * Total amount of gross other fees outside of interchange.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /**
     * Date of when the report was first generated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /**
     * Date of when money movement is triggered for the transaction. One exception applies - for
     * Mastercard dual message settlement, this is the settlement advisement date, which is distinct
     * from the date of money movement.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementDate(): String = settlementDate.getRequired("settlement_date")

    /**
     * Globally unique identifier denoting the associated Transaction object.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /**
     * The type of settlement record.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Date and time when the transaction first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Network's description of a fee, only present on records with type `FEE`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feeDescription(): Optional<String> = feeDescription.getOptional("fee_description")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [cardProgramToken].
     *
     * Unlike [cardProgramToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("card_program_token")
    @ExcludeMissing
    fun _cardProgramToken(): JsonField<String> = cardProgramToken

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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
     * Returns the raw JSON value of [eventTokens].
     *
     * Unlike [eventTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_tokens")
    @ExcludeMissing
    fun _eventTokens(): JsonField<List<String>> = eventTokens

    /**
     * Returns the raw JSON value of [institution].
     *
     * Unlike [institution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("institution") @ExcludeMissing fun _institution(): JsonField<String> = institution

    /**
     * Returns the raw JSON value of [interchangeFeeExtendedPrecision].
     *
     * Unlike [interchangeFeeExtendedPrecision], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("interchange_fee_extended_precision")
    @ExcludeMissing
    fun _interchangeFeeExtendedPrecision(): JsonField<Long> = interchangeFeeExtendedPrecision

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
     * Returns the raw JSON value of [otherFeesDetails].
     *
     * Unlike [otherFeesDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_fees_details")
    @ExcludeMissing
    fun _otherFeesDetails(): JsonField<OtherFeesDetails> = otherFeesDetails

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
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate(): JsonField<String> = reportDate

    /**
     * Returns the raw JSON value of [settlementDate].
     *
     * Unlike [settlementDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settlement_date")
    @ExcludeMissing
    fun _settlementDate(): JsonField<String> = settlementDate

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

    /**
     * Returns the raw JSON value of [transactionsGrossAmount].
     *
     * Unlike [transactionsGrossAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount(): JsonField<Long> = transactionsGrossAmount

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [feeDescription].
     *
     * Unlike [feeDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_description")
    @ExcludeMissing
    fun _feeDescription(): JsonField<String> = feeDescription

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

        /**
         * Returns a mutable builder for constructing an instance of [SettlementDetail].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardProgramToken()
         * .cardToken()
         * .created()
         * .currency()
         * .disputesGrossAmount()
         * .eventTokens()
         * .institution()
         * .interchangeFeeExtendedPrecision()
         * .interchangeGrossAmount()
         * .network()
         * .otherFeesDetails()
         * .otherFeesGrossAmount()
         * .reportDate()
         * .settlementDate()
         * .transactionToken()
         * .transactionsGrossAmount()
         * .type()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettlementDetail]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardProgramToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var disputesGrossAmount: JsonField<Long>? = null
        private var eventTokens: JsonField<MutableList<String>>? = null
        private var institution: JsonField<String>? = null
        private var interchangeFeeExtendedPrecision: JsonField<Long>? = null
        private var interchangeGrossAmount: JsonField<Long>? = null
        private var network: JsonField<Network>? = null
        private var otherFeesDetails: JsonField<OtherFeesDetails>? = null
        private var otherFeesGrossAmount: JsonField<Long>? = null
        private var reportDate: JsonField<String>? = null
        private var settlementDate: JsonField<String>? = null
        private var transactionToken: JsonField<String>? = null
        private var transactionsGrossAmount: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var feeDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementDetail: SettlementDetail) = apply {
            token = settlementDetail.token
            accountToken = settlementDetail.accountToken
            cardProgramToken = settlementDetail.cardProgramToken
            cardToken = settlementDetail.cardToken
            created = settlementDetail.created
            currency = settlementDetail.currency
            disputesGrossAmount = settlementDetail.disputesGrossAmount
            eventTokens = settlementDetail.eventTokens.map { it.toMutableList() }
            institution = settlementDetail.institution
            interchangeFeeExtendedPrecision = settlementDetail.interchangeFeeExtendedPrecision
            interchangeGrossAmount = settlementDetail.interchangeGrossAmount
            network = settlementDetail.network
            otherFeesDetails = settlementDetail.otherFeesDetails
            otherFeesGrossAmount = settlementDetail.otherFeesGrossAmount
            reportDate = settlementDetail.reportDate
            settlementDate = settlementDetail.settlementDate
            transactionToken = settlementDetail.transactionToken
            transactionsGrossAmount = settlementDetail.transactionsGrossAmount
            type = settlementDetail.type
            updated = settlementDetail.updated
            feeDescription = settlementDetail.feeDescription
            additionalProperties = settlementDetail.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier denoting the Settlement Detail. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Globally unique identifier denoting the card program that the associated Transaction
         * occurred on.
         */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /**
         * Sets [Builder.cardProgramToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardProgramToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /**
         * Globally unique identifier denoting the card that the associated Transaction occurred on.
         */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Three-character alphabetic ISO 4217 code. */
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

        /** Globally unique identifiers denoting the Events associated with this settlement. */
        fun eventTokens(eventTokens: List<String>) = eventTokens(JsonField.of(eventTokens))

        /**
         * Sets [Builder.eventTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTokens(eventTokens: JsonField<List<String>>) = apply {
            this.eventTokens = eventTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [eventTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventToken(eventToken: String) = apply {
            eventTokens =
                (eventTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eventTokens", it).add(eventToken)
                }
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

        /** The total amount of interchange in six-digit extended precision. */
        fun interchangeFeeExtendedPrecision(interchangeFeeExtendedPrecision: Long) =
            interchangeFeeExtendedPrecision(JsonField.of(interchangeFeeExtendedPrecision))

        /**
         * Sets [Builder.interchangeFeeExtendedPrecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interchangeFeeExtendedPrecision] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun interchangeFeeExtendedPrecision(interchangeFeeExtendedPrecision: JsonField<Long>) =
            apply {
                this.interchangeFeeExtendedPrecision = interchangeFeeExtendedPrecision
            }

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

        /** Card network where the transaction took place. */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** The total gross amount of other fees by type. */
        fun otherFeesDetails(otherFeesDetails: OtherFeesDetails) =
            otherFeesDetails(JsonField.of(otherFeesDetails))

        /**
         * Sets [Builder.otherFeesDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherFeesDetails] with a well-typed [OtherFeesDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherFeesDetails(otherFeesDetails: JsonField<OtherFeesDetails>) = apply {
            this.otherFeesDetails = otherFeesDetails
        }

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

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportDate(reportDate: JsonField<String>) = apply { this.reportDate = reportDate }

        /**
         * Date of when money movement is triggered for the transaction. One exception applies - for
         * Mastercard dual message settlement, this is the settlement advisement date, which is
         * distinct from the date of money movement.
         */
        fun settlementDate(settlementDate: String) = settlementDate(JsonField.of(settlementDate))

        /**
         * Sets [Builder.settlementDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementDate(settlementDate: JsonField<String>) = apply {
            this.settlementDate = settlementDate
        }

        /** Globally unique identifier denoting the associated Transaction object. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * Sets [Builder.transactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
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

        /** The type of settlement record. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Network's description of a fee, only present on records with type `FEE`. */
        fun feeDescription(feeDescription: String) = feeDescription(JsonField.of(feeDescription))

        /**
         * Sets [Builder.feeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feeDescription(feeDescription: JsonField<String>) = apply {
            this.feeDescription = feeDescription
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
         * Returns an immutable instance of [SettlementDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardProgramToken()
         * .cardToken()
         * .created()
         * .currency()
         * .disputesGrossAmount()
         * .eventTokens()
         * .institution()
         * .interchangeFeeExtendedPrecision()
         * .interchangeGrossAmount()
         * .network()
         * .otherFeesDetails()
         * .otherFeesGrossAmount()
         * .reportDate()
         * .settlementDate()
         * .transactionToken()
         * .transactionsGrossAmount()
         * .type()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettlementDetail =
            SettlementDetail(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("cardProgramToken", cardProgramToken),
                checkRequired("cardToken", cardToken),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("disputesGrossAmount", disputesGrossAmount),
                checkRequired("eventTokens", eventTokens).map { it.toImmutable() },
                checkRequired("institution", institution),
                checkRequired("interchangeFeeExtendedPrecision", interchangeFeeExtendedPrecision),
                checkRequired("interchangeGrossAmount", interchangeGrossAmount),
                checkRequired("network", network),
                checkRequired("otherFeesDetails", otherFeesDetails),
                checkRequired("otherFeesGrossAmount", otherFeesGrossAmount),
                checkRequired("reportDate", reportDate),
                checkRequired("settlementDate", settlementDate),
                checkRequired("transactionToken", transactionToken),
                checkRequired("transactionsGrossAmount", transactionsGrossAmount),
                checkRequired("type", type),
                checkRequired("updated", updated),
                feeDescription,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettlementDetail = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        cardProgramToken()
        cardToken()
        created()
        currency()
        disputesGrossAmount()
        eventTokens()
        institution()
        interchangeFeeExtendedPrecision()
        interchangeGrossAmount()
        network().validate()
        otherFeesDetails().validate()
        otherFeesGrossAmount()
        reportDate()
        settlementDate()
        transactionToken()
        transactionsGrossAmount()
        type().validate()
        updated()
        feeDescription()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (cardProgramToken.asKnown().isPresent) 1 else 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (disputesGrossAmount.asKnown().isPresent) 1 else 0) +
            (eventTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (institution.asKnown().isPresent) 1 else 0) +
            (if (interchangeFeeExtendedPrecision.asKnown().isPresent) 1 else 0) +
            (if (interchangeGrossAmount.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (otherFeesDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (otherFeesGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (reportDate.asKnown().isPresent) 1 else 0) +
            (if (settlementDate.asKnown().isPresent) 1 else 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0) +
            (if (transactionsGrossAmount.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (feeDescription.asKnown().isPresent) 1 else 0)

    /** Card network where the transaction took place. */
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

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The total gross amount of other fees by type. */
    class OtherFeesDetails
    private constructor(
        private val isa: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ISA") @ExcludeMissing isa: JsonField<Long> = JsonMissing.of()
        ) : this(isa, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isa(): Optional<Long> = isa.getOptional("ISA")

        /**
         * Returns the raw JSON value of [isa].
         *
         * Unlike [isa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ISA") @ExcludeMissing fun _isa(): JsonField<Long> = isa

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

            /** Returns a mutable builder for constructing an instance of [OtherFeesDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OtherFeesDetails]. */
        class Builder internal constructor() {

            private var isa: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(otherFeesDetails: OtherFeesDetails) = apply {
                isa = otherFeesDetails.isa
                additionalProperties = otherFeesDetails.additionalProperties.toMutableMap()
            }

            fun isa(isa: Long) = isa(JsonField.of(isa))

            /**
             * Sets [Builder.isa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isa] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun isa(isa: JsonField<Long>) = apply { this.isa = isa }

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
             * Returns an immutable instance of [OtherFeesDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OtherFeesDetails =
                OtherFeesDetails(isa, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): OtherFeesDetails = apply {
            if (validated) {
                return@apply
            }

            isa()
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
        @JvmSynthetic internal fun validity(): Int = (if (isa.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OtherFeesDetails && isa == other.isa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(isa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OtherFeesDetails{isa=$isa, additionalProperties=$additionalProperties}"
    }

    /** The type of settlement record. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ADJUSTMENT = of("ADJUSTMENT")

            @JvmField val ARBITRATION = of("ARBITRATION")

            @JvmField val CHARGEBACK = of("CHARGEBACK")

            @JvmField val CLEARING = of("CLEARING")

            @JvmField val COLLABORATION = of("COLLABORATION")

            @JvmField val FEE = of("FEE")

            @JvmField val FINANCIAL = of("FINANCIAL")

            @JvmField val NON_FINANCIAL = of("NON-FINANCIAL")

            @JvmField val PREARBITRATION = of("PREARBITRATION")

            @JvmField val REPRESENTMENT = of("REPRESENTMENT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ADJUSTMENT,
            ARBITRATION,
            CHARGEBACK,
            CLEARING,
            COLLABORATION,
            FEE,
            FINANCIAL,
            NON_FINANCIAL,
            PREARBITRATION,
            REPRESENTMENT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADJUSTMENT,
            ARBITRATION,
            CHARGEBACK,
            CLEARING,
            COLLABORATION,
            FEE,
            FINANCIAL,
            NON_FINANCIAL,
            PREARBITRATION,
            REPRESENTMENT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ADJUSTMENT -> Value.ADJUSTMENT
                ARBITRATION -> Value.ARBITRATION
                CHARGEBACK -> Value.CHARGEBACK
                CLEARING -> Value.CLEARING
                COLLABORATION -> Value.COLLABORATION
                FEE -> Value.FEE
                FINANCIAL -> Value.FINANCIAL
                NON_FINANCIAL -> Value.NON_FINANCIAL
                PREARBITRATION -> Value.PREARBITRATION
                REPRESENTMENT -> Value.REPRESENTMENT
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
                ADJUSTMENT -> Known.ADJUSTMENT
                ARBITRATION -> Known.ARBITRATION
                CHARGEBACK -> Known.CHARGEBACK
                CLEARING -> Known.CLEARING
                COLLABORATION -> Known.COLLABORATION
                FEE -> Known.FEE
                FINANCIAL -> Known.FINANCIAL
                NON_FINANCIAL -> Known.NON_FINANCIAL
                PREARBITRATION -> Known.PREARBITRATION
                REPRESENTMENT -> Known.REPRESENTMENT
                else -> throw LithicInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SettlementDetail && token == other.token && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && cardToken == other.cardToken && created == other.created && currency == other.currency && disputesGrossAmount == other.disputesGrossAmount && eventTokens == other.eventTokens && institution == other.institution && interchangeFeeExtendedPrecision == other.interchangeFeeExtendedPrecision && interchangeGrossAmount == other.interchangeGrossAmount && network == other.network && otherFeesDetails == other.otherFeesDetails && otherFeesGrossAmount == other.otherFeesGrossAmount && reportDate == other.reportDate && settlementDate == other.settlementDate && transactionToken == other.transactionToken && transactionsGrossAmount == other.transactionsGrossAmount && type == other.type && updated == other.updated && feeDescription == other.feeDescription && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, cardProgramToken, cardToken, created, currency, disputesGrossAmount, eventTokens, institution, interchangeFeeExtendedPrecision, interchangeGrossAmount, network, otherFeesDetails, otherFeesGrossAmount, reportDate, settlementDate, transactionToken, transactionsGrossAmount, type, updated, feeDescription, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementDetail{token=$token, accountToken=$accountToken, cardProgramToken=$cardProgramToken, cardToken=$cardToken, created=$created, currency=$currency, disputesGrossAmount=$disputesGrossAmount, eventTokens=$eventTokens, institution=$institution, interchangeFeeExtendedPrecision=$interchangeFeeExtendedPrecision, interchangeGrossAmount=$interchangeGrossAmount, network=$network, otherFeesDetails=$otherFeesDetails, otherFeesGrossAmount=$otherFeesGrossAmount, reportDate=$reportDate, settlementDate=$settlementDate, transactionToken=$transactionToken, transactionsGrossAmount=$transactionsGrossAmount, type=$type, updated=$updated, feeDescription=$feeDescription, additionalProperties=$additionalProperties}"
}
