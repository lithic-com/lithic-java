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

/** The Auth Stream Access request payload that was sent to the ASA responder. */
class AsaRequestWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val acquirerFee: JsonField<Long>,
    private val amount: JsonField<Long>,
    private val authorizationAmount: JsonField<Long>,
    private val avs: JsonField<Avs>,
    private val card: JsonField<AsaRequestCard>,
    private val cardholderCurrency: JsonField<String>,
    private val cashAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val merchant: JsonField<Merchant>,
    private val merchantAmount: JsonField<Long>,
    private val merchantCurrency: JsonField<String>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<AsaRequestStatus>,
    private val transactionInitiator: JsonField<TransactionInitiator>,
    private val accountType: JsonField<AccountType>,
    private val cardholderAuthentication: JsonField<CardholderAuthentication>,
    private val cashback: JsonField<Long>,
    private val conversionRate: JsonField<Double>,
    private val eventToken: JsonField<String>,
    private val fleetInfo: JsonField<AsaRequestFleetInfo>,
    private val latestChallenge: JsonField<LatestChallenge>,
    private val network: JsonField<Network>,
    private val networkRiskScore: JsonField<Long>,
    private val networkSpecificData: JsonField<AsaNetworkSpecificData>,
    private val pos: JsonField<Pos>,
    private val tokenInfo: JsonField<TokenInfo>,
    private val ttl: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquirer_fee")
        @ExcludeMissing
        acquirerFee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("authorization_amount")
        @ExcludeMissing
        authorizationAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("avs") @ExcludeMissing avs: JsonField<Avs> = JsonMissing.of(),
        @JsonProperty("card") @ExcludeMissing card: JsonField<AsaRequestCard> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_amount") @ExcludeMissing cashAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("merchant") @ExcludeMissing merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        merchantAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        merchantCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<AsaRequestStatus> = JsonMissing.of(),
        @JsonProperty("transaction_initiator")
        @ExcludeMissing
        transactionInitiator: JsonField<TransactionInitiator> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("cardholder_authentication")
        @ExcludeMissing
        cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of(),
        @JsonProperty("cashback") @ExcludeMissing cashback: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("conversion_rate")
        @ExcludeMissing
        conversionRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("event_token")
        @ExcludeMissing
        eventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fleet_info")
        @ExcludeMissing
        fleetInfo: JsonField<AsaRequestFleetInfo> = JsonMissing.of(),
        @JsonProperty("latest_challenge")
        @ExcludeMissing
        latestChallenge: JsonField<LatestChallenge> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        networkRiskScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("network_specific_data")
        @ExcludeMissing
        networkSpecificData: JsonField<AsaNetworkSpecificData> = JsonMissing.of(),
        @JsonProperty("pos") @ExcludeMissing pos: JsonField<Pos> = JsonMissing.of(),
        @JsonProperty("token_info")
        @ExcludeMissing
        tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
        @JsonProperty("ttl") @ExcludeMissing ttl: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        acquirerFee,
        amount,
        authorizationAmount,
        avs,
        card,
        cardholderCurrency,
        cashAmount,
        created,
        merchant,
        merchantAmount,
        merchantCurrency,
        settledAmount,
        status,
        transactionInitiator,
        accountType,
        cardholderAuthentication,
        cashback,
        conversionRate,
        eventToken,
        fleetInfo,
        latestChallenge,
        network,
        networkRiskScore,
        networkSpecificData,
        pos,
        tokenInfo,
        ttl,
        mutableMapOf(),
    )

    /**
     * The provisional transaction group uuid associated with the authorization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Fee (in cents) assessed by the merchant and paid for by the cardholder. Will be zero if no
     * fee is assessed. Rebates may be transmitted as a negative value to indicate credited fees.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acquirerFee(): Long = acquirerFee.getRequired("acquirer_fee")

    /**
     * Authorization amount of the transaction (in cents), including any acquirer fees. The contents
     * of this field are identical to `authorization_amount`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The base transaction amount (in cents) plus the acquirer fee field. This is the amount the
     * issuer should authorize against unless the issuer is paying the acquirer fee on behalf of the
     * cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizationAmount(): Long = authorizationAmount.getRequired("authorization_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avs(): Avs = avs.getRequired("avs")

    /**
     * Card object in ASA
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun card(): AsaRequestCard = card.getRequired("card")

    /**
     * 3-character alphabetic ISO 4217 code for cardholder's billing currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholderCurrency(): String = cardholderCurrency.getRequired("cardholder_currency")

    /**
     * The portion of the transaction requested as cash back by the cardholder, and does not include
     * any acquirer fees. The amount field includes the purchase amount, the requested cash back
     * amount, and any acquirer fees.
     *
     * If no cash back was requested, the value of this field will be 0, and the field will always
     * be present.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cashAmount(): Long = cashAmount.getRequired("cash_amount")

    /**
     * Date and time when the transaction first occurred in UTC.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * The amount that the merchant will receive, denominated in `merchant_currency` and in the
     * smallest currency unit. Note the amount includes `acquirer_fee`, similar to
     * `authorization_amount`. It will be different from `authorization_amount` if the merchant is
     * taking payment in a different currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantAmount(): Long = merchantAmount.getRequired("merchant_amount")

    /**
     * 3-character alphabetic ISO 4217 code for the local currency of the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

    /**
     * Amount (in cents) of the transaction that has been settled, including any acquirer fees
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * The type of authorization request that this request is for. Note that `CREDIT_AUTHORIZATION`
     * and `FINANCIAL_CREDIT_AUTHORIZATION` is only available to users with credit decisioning via
     * ASA enabled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): AsaRequestStatus = status.getRequired("status")

    /**
     * The entity that initiated the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionInitiator(): TransactionInitiator =
        transactionInitiator.getRequired("transaction_initiator")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountType(): Optional<AccountType> = accountType.getOptional("account_type")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderAuthentication(): Optional<CardholderAuthentication> =
        cardholderAuthentication.getOptional("cardholder_authentication")

    /**
     * Deprecated, use `cash_amount`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cashback(): Optional<Long> = cashback.getOptional("cashback")

    /**
     * If the transaction was requested in a currency other than the settlement currency, this field
     * will be populated to indicate the rate used to translate the merchant_amount to the amount
     * (i.e., `merchant_amount` x `conversion_rate` = `amount`). Note that the `merchant_amount` is
     * in the local currency and the amount is in the settlement currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversionRate(): Optional<Double> = conversionRate.getOptional("conversion_rate")

    /**
     * The event token associated with the authorization. This field is only set for programs
     * enrolled into the beta.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventToken(): Optional<String> = eventToken.getOptional("event_token")

    /**
     * Optional Object containing information if the Card is a part of a Fleet managed program
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fleetInfo(): Optional<AsaRequestFleetInfo> = fleetInfo.getOptional("fleet_info")

    /**
     * The latest Authorization Challenge that was issued to the cardholder for this merchant.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestChallenge(): Optional<LatestChallenge> =
        latestChallenge.getOptional("latest_challenge")

    /**
     * Card network of the authorization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun network(): Optional<Network> = network.getOptional("network")

    /**
     * Network-provided score assessing risk level associated with a given authorization. Scores are
     * on a range of 0-999, with 0 representing the lowest risk and 999 representing the highest
     * risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will normalize
     * the score by multiplying the raw score by 10x.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkRiskScore(): Optional<Long> = networkRiskScore.getOptional("network_risk_score")

    /**
     * Contains raw data provided by the card network, including attributes that provide further
     * context about the authorization. If populated by the network, data is organized by Lithic and
     * passed through without further modification. Please consult the official network
     * documentation for more details about these values and how to use them. This object is only
     * available to certain programs- contact your Customer Success Manager to discuss enabling
     * access.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkSpecificData(): Optional<AsaNetworkSpecificData> =
        networkSpecificData.getOptional("network_specific_data")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pos(): Optional<Pos> = pos.getOptional("pos")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenInfo(): Optional<TokenInfo> = tokenInfo.getOptional("token_info")

    /**
     * Deprecated: approximate time-to-live for the authorization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttl(): Optional<OffsetDateTime> = ttl.getOptional("ttl")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [acquirerFee].
     *
     * Unlike [acquirerFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquirer_fee") @ExcludeMissing fun _acquirerFee(): JsonField<Long> = acquirerFee

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [authorizationAmount].
     *
     * Unlike [authorizationAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    fun _authorizationAmount(): JsonField<Long> = authorizationAmount

    /**
     * Returns the raw JSON value of [avs].
     *
     * Unlike [avs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avs") @ExcludeMissing fun _avs(): JsonField<Avs> = avs

    /**
     * Returns the raw JSON value of [card].
     *
     * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<AsaRequestCard> = card

    /**
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * Returns the raw JSON value of [cashAmount].
     *
     * Unlike [cashAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cash_amount") @ExcludeMissing fun _cashAmount(): JsonField<Long> = cashAmount

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /**
     * Returns the raw JSON value of [merchantAmount].
     *
     * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant_amount")
    @ExcludeMissing
    fun _merchantAmount(): JsonField<Long> = merchantAmount

    /**
     * Returns the raw JSON value of [merchantCurrency].
     *
     * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_currency")
    @ExcludeMissing
    fun _merchantCurrency(): JsonField<String> = merchantCurrency

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<AsaRequestStatus> = status

    /**
     * Returns the raw JSON value of [transactionInitiator].
     *
     * Unlike [transactionInitiator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_initiator")
    @ExcludeMissing
    fun _transactionInitiator(): JsonField<TransactionInitiator> = transactionInitiator

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [cardholderAuthentication].
     *
     * Unlike [cardholderAuthentication], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cardholder_authentication")
    @ExcludeMissing
    fun _cardholderAuthentication(): JsonField<CardholderAuthentication> = cardholderAuthentication

    /**
     * Returns the raw JSON value of [cashback].
     *
     * Unlike [cashback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cashback") @ExcludeMissing fun _cashback(): JsonField<Long> = cashback

    /**
     * Returns the raw JSON value of [conversionRate].
     *
     * Unlike [conversionRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversion_rate")
    @ExcludeMissing
    fun _conversionRate(): JsonField<Double> = conversionRate

    /**
     * Returns the raw JSON value of [eventToken].
     *
     * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /**
     * Returns the raw JSON value of [fleetInfo].
     *
     * Unlike [fleetInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleet_info")
    @ExcludeMissing
    fun _fleetInfo(): JsonField<AsaRequestFleetInfo> = fleetInfo

    /**
     * Returns the raw JSON value of [latestChallenge].
     *
     * Unlike [latestChallenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest_challenge")
    @ExcludeMissing
    fun _latestChallenge(): JsonField<LatestChallenge> = latestChallenge

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [networkRiskScore].
     *
     * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_risk_score")
    @ExcludeMissing
    fun _networkRiskScore(): JsonField<Long> = networkRiskScore

    /**
     * Returns the raw JSON value of [networkSpecificData].
     *
     * Unlike [networkSpecificData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_specific_data")
    @ExcludeMissing
    fun _networkSpecificData(): JsonField<AsaNetworkSpecificData> = networkSpecificData

    /**
     * Returns the raw JSON value of [pos].
     *
     * Unlike [pos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<Pos> = pos

    /**
     * Returns the raw JSON value of [tokenInfo].
     *
     * Unlike [tokenInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_info") @ExcludeMissing fun _tokenInfo(): JsonField<TokenInfo> = tokenInfo

    /**
     * Returns the raw JSON value of [ttl].
     *
     * Unlike [ttl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttl") @ExcludeMissing fun _ttl(): JsonField<OffsetDateTime> = ttl

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
         * Returns a mutable builder for constructing an instance of [AsaRequestWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .acquirerFee()
         * .amount()
         * .authorizationAmount()
         * .avs()
         * .card()
         * .cardholderCurrency()
         * .cashAmount()
         * .created()
         * .merchant()
         * .merchantAmount()
         * .merchantCurrency()
         * .settledAmount()
         * .status()
         * .transactionInitiator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AsaRequestWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var acquirerFee: JsonField<Long>? = null
        private var amount: JsonField<Long>? = null
        private var authorizationAmount: JsonField<Long>? = null
        private var avs: JsonField<Avs>? = null
        private var card: JsonField<AsaRequestCard>? = null
        private var cardholderCurrency: JsonField<String>? = null
        private var cashAmount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<Merchant>? = null
        private var merchantAmount: JsonField<Long>? = null
        private var merchantCurrency: JsonField<String>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<AsaRequestStatus>? = null
        private var transactionInitiator: JsonField<TransactionInitiator>? = null
        private var accountType: JsonField<AccountType> = JsonMissing.of()
        private var cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of()
        private var cashback: JsonField<Long> = JsonMissing.of()
        private var conversionRate: JsonField<Double> = JsonMissing.of()
        private var eventToken: JsonField<String> = JsonMissing.of()
        private var fleetInfo: JsonField<AsaRequestFleetInfo> = JsonMissing.of()
        private var latestChallenge: JsonField<LatestChallenge> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var networkRiskScore: JsonField<Long> = JsonMissing.of()
        private var networkSpecificData: JsonField<AsaNetworkSpecificData> = JsonMissing.of()
        private var pos: JsonField<Pos> = JsonMissing.of()
        private var tokenInfo: JsonField<TokenInfo> = JsonMissing.of()
        private var ttl: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(asaRequestWebhookEvent: AsaRequestWebhookEvent) = apply {
            token = asaRequestWebhookEvent.token
            acquirerFee = asaRequestWebhookEvent.acquirerFee
            amount = asaRequestWebhookEvent.amount
            authorizationAmount = asaRequestWebhookEvent.authorizationAmount
            avs = asaRequestWebhookEvent.avs
            card = asaRequestWebhookEvent.card
            cardholderCurrency = asaRequestWebhookEvent.cardholderCurrency
            cashAmount = asaRequestWebhookEvent.cashAmount
            created = asaRequestWebhookEvent.created
            merchant = asaRequestWebhookEvent.merchant
            merchantAmount = asaRequestWebhookEvent.merchantAmount
            merchantCurrency = asaRequestWebhookEvent.merchantCurrency
            settledAmount = asaRequestWebhookEvent.settledAmount
            status = asaRequestWebhookEvent.status
            transactionInitiator = asaRequestWebhookEvent.transactionInitiator
            accountType = asaRequestWebhookEvent.accountType
            cardholderAuthentication = asaRequestWebhookEvent.cardholderAuthentication
            cashback = asaRequestWebhookEvent.cashback
            conversionRate = asaRequestWebhookEvent.conversionRate
            eventToken = asaRequestWebhookEvent.eventToken
            fleetInfo = asaRequestWebhookEvent.fleetInfo
            latestChallenge = asaRequestWebhookEvent.latestChallenge
            network = asaRequestWebhookEvent.network
            networkRiskScore = asaRequestWebhookEvent.networkRiskScore
            networkSpecificData = asaRequestWebhookEvent.networkSpecificData
            pos = asaRequestWebhookEvent.pos
            tokenInfo = asaRequestWebhookEvent.tokenInfo
            ttl = asaRequestWebhookEvent.ttl
            additionalProperties = asaRequestWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The provisional transaction group uuid associated with the authorization */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Fee (in cents) assessed by the merchant and paid for by the cardholder. Will be zero if
         * no fee is assessed. Rebates may be transmitted as a negative value to indicate credited
         * fees.
         */
        fun acquirerFee(acquirerFee: Long) = acquirerFee(JsonField.of(acquirerFee))

        /**
         * Sets [Builder.acquirerFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerFee] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acquirerFee(acquirerFee: JsonField<Long>) = apply { this.acquirerFee = acquirerFee }

        /**
         * Authorization amount of the transaction (in cents), including any acquirer fees. The
         * contents of this field are identical to `authorization_amount`.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The base transaction amount (in cents) plus the acquirer fee field. This is the amount
         * the issuer should authorize against unless the issuer is paying the acquirer fee on
         * behalf of the cardholder.
         */
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(JsonField.of(authorizationAmount))

        /**
         * Sets [Builder.authorizationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationAmount(authorizationAmount: JsonField<Long>) = apply {
            this.authorizationAmount = authorizationAmount
        }

        fun avs(avs: Avs) = avs(JsonField.of(avs))

        /**
         * Sets [Builder.avs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avs] with a well-typed [Avs] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avs(avs: JsonField<Avs>) = apply { this.avs = avs }

        /** Card object in ASA */
        fun card(card: AsaRequestCard) = card(JsonField.of(card))

        /**
         * Sets [Builder.card] to an arbitrary JSON value.
         *
         * You should usually call [Builder.card] with a well-typed [AsaRequestCard] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun card(card: JsonField<AsaRequestCard>) = apply { this.card = card }

        /** 3-character alphabetic ISO 4217 code for cardholder's billing currency. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /**
         * Sets [Builder.cardholderCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
        }

        /**
         * The portion of the transaction requested as cash back by the cardholder, and does not
         * include any acquirer fees. The amount field includes the purchase amount, the requested
         * cash back amount, and any acquirer fees.
         *
         * If no cash back was requested, the value of this field will be 0, and the field will
         * always be present.
         */
        fun cashAmount(cashAmount: Long) = cashAmount(JsonField.of(cashAmount))

        /**
         * Sets [Builder.cashAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cashAmount(cashAmount: JsonField<Long>) = apply { this.cashAmount = cashAmount }

        /** Date and time when the transaction first occurred in UTC. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [Merchant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /**
         * The amount that the merchant will receive, denominated in `merchant_currency` and in the
         * smallest currency unit. Note the amount includes `acquirer_fee`, similar to
         * `authorization_amount`. It will be different from `authorization_amount` if the merchant
         * is taking payment in a different currency.
         */
        fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

        /**
         * Sets [Builder.merchantAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /** 3-character alphabetic ISO 4217 code for the local currency of the transaction. */
        fun merchantCurrency(merchantCurrency: String) =
            merchantCurrency(JsonField.of(merchantCurrency))

        /**
         * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Amount (in cents) of the transaction that has been settled, including any acquirer fees
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Sets [Builder.settledAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * The type of authorization request that this request is for. Note that
         * `CREDIT_AUTHORIZATION` and `FINANCIAL_CREDIT_AUTHORIZATION` is only available to users
         * with credit decisioning via ASA enabled.
         */
        fun status(status: AsaRequestStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [AsaRequestStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<AsaRequestStatus>) = apply { this.status = status }

        /** The entity that initiated the transaction. */
        fun transactionInitiator(transactionInitiator: TransactionInitiator) =
            transactionInitiator(JsonField.of(transactionInitiator))

        /**
         * Sets [Builder.transactionInitiator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionInitiator] with a well-typed
         * [TransactionInitiator] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun transactionInitiator(transactionInitiator: JsonField<TransactionInitiator>) = apply {
            this.transactionInitiator = transactionInitiator
        }

        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [AccountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication) =
            cardholderAuthentication(JsonField.of(cardholderAuthentication))

        /**
         * Sets [Builder.cardholderAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderAuthentication] with a well-typed
         * [CardholderAuthentication] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun cardholderAuthentication(
            cardholderAuthentication: JsonField<CardholderAuthentication>
        ) = apply { this.cardholderAuthentication = cardholderAuthentication }

        /** Deprecated, use `cash_amount`. */
        fun cashback(cashback: Long) = cashback(JsonField.of(cashback))

        /**
         * Sets [Builder.cashback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashback] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cashback(cashback: JsonField<Long>) = apply { this.cashback = cashback }

        /**
         * If the transaction was requested in a currency other than the settlement currency, this
         * field will be populated to indicate the rate used to translate the merchant_amount to the
         * amount (i.e., `merchant_amount` x `conversion_rate` = `amount`). Note that the
         * `merchant_amount` is in the local currency and the amount is in the settlement currency.
         */
        fun conversionRate(conversionRate: Double) = conversionRate(JsonField.of(conversionRate))

        /**
         * Sets [Builder.conversionRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversionRate(conversionRate: JsonField<Double>) = apply {
            this.conversionRate = conversionRate
        }

        /**
         * The event token associated with the authorization. This field is only set for programs
         * enrolled into the beta.
         */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /**
         * Sets [Builder.eventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        /**
         * Optional Object containing information if the Card is a part of a Fleet managed program
         */
        fun fleetInfo(fleetInfo: AsaRequestFleetInfo?) = fleetInfo(JsonField.ofNullable(fleetInfo))

        /** Alias for calling [Builder.fleetInfo] with `fleetInfo.orElse(null)`. */
        fun fleetInfo(fleetInfo: Optional<AsaRequestFleetInfo>) = fleetInfo(fleetInfo.getOrNull())

        /**
         * Sets [Builder.fleetInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleetInfo] with a well-typed [AsaRequestFleetInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fleetInfo(fleetInfo: JsonField<AsaRequestFleetInfo>) = apply {
            this.fleetInfo = fleetInfo
        }

        /**
         * The latest Authorization Challenge that was issued to the cardholder for this merchant.
         */
        fun latestChallenge(latestChallenge: LatestChallenge) =
            latestChallenge(JsonField.of(latestChallenge))

        /**
         * Sets [Builder.latestChallenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestChallenge] with a well-typed [LatestChallenge]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun latestChallenge(latestChallenge: JsonField<LatestChallenge>) = apply {
            this.latestChallenge = latestChallenge
        }

        /** Card network of the authorization. */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: Long?) =
            networkRiskScore(JsonField.ofNullable(networkRiskScore))

        /**
         * Alias for [Builder.networkRiskScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun networkRiskScore(networkRiskScore: Long) = networkRiskScore(networkRiskScore as Long?)

        /** Alias for calling [Builder.networkRiskScore] with `networkRiskScore.orElse(null)`. */
        fun networkRiskScore(networkRiskScore: Optional<Long>) =
            networkRiskScore(networkRiskScore.getOrNull())

        /**
         * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
            this.networkRiskScore = networkRiskScore
        }

        /**
         * Contains raw data provided by the card network, including attributes that provide further
         * context about the authorization. If populated by the network, data is organized by Lithic
         * and passed through without further modification. Please consult the official network
         * documentation for more details about these values and how to use them. This object is
         * only available to certain programs- contact your Customer Success Manager to discuss
         * enabling access.
         */
        fun networkSpecificData(networkSpecificData: AsaNetworkSpecificData?) =
            networkSpecificData(JsonField.ofNullable(networkSpecificData))

        /**
         * Alias for calling [Builder.networkSpecificData] with `networkSpecificData.orElse(null)`.
         */
        fun networkSpecificData(networkSpecificData: Optional<AsaNetworkSpecificData>) =
            networkSpecificData(networkSpecificData.getOrNull())

        /**
         * Sets [Builder.networkSpecificData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkSpecificData] with a well-typed
         * [AsaNetworkSpecificData] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun networkSpecificData(networkSpecificData: JsonField<AsaNetworkSpecificData>) = apply {
            this.networkSpecificData = networkSpecificData
        }

        fun pos(pos: Pos) = pos(JsonField.of(pos))

        /**
         * Sets [Builder.pos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pos] with a well-typed [Pos] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pos(pos: JsonField<Pos>) = apply { this.pos = pos }

        fun tokenInfo(tokenInfo: TokenInfo?) = tokenInfo(JsonField.ofNullable(tokenInfo))

        /** Alias for calling [Builder.tokenInfo] with `tokenInfo.orElse(null)`. */
        fun tokenInfo(tokenInfo: Optional<TokenInfo>) = tokenInfo(tokenInfo.getOrNull())

        /**
         * Sets [Builder.tokenInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenInfo] with a well-typed [TokenInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

        /** Deprecated: approximate time-to-live for the authorization. */
        fun ttl(ttl: OffsetDateTime) = ttl(JsonField.of(ttl))

        /**
         * Sets [Builder.ttl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttl] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ttl(ttl: JsonField<OffsetDateTime>) = apply { this.ttl = ttl }

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
         * Returns an immutable instance of [AsaRequestWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .acquirerFee()
         * .amount()
         * .authorizationAmount()
         * .avs()
         * .card()
         * .cardholderCurrency()
         * .cashAmount()
         * .created()
         * .merchant()
         * .merchantAmount()
         * .merchantCurrency()
         * .settledAmount()
         * .status()
         * .transactionInitiator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AsaRequestWebhookEvent =
            AsaRequestWebhookEvent(
                checkRequired("token", token),
                checkRequired("acquirerFee", acquirerFee),
                checkRequired("amount", amount),
                checkRequired("authorizationAmount", authorizationAmount),
                checkRequired("avs", avs),
                checkRequired("card", card),
                checkRequired("cardholderCurrency", cardholderCurrency),
                checkRequired("cashAmount", cashAmount),
                checkRequired("created", created),
                checkRequired("merchant", merchant),
                checkRequired("merchantAmount", merchantAmount),
                checkRequired("merchantCurrency", merchantCurrency),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("transactionInitiator", transactionInitiator),
                accountType,
                cardholderAuthentication,
                cashback,
                conversionRate,
                eventToken,
                fleetInfo,
                latestChallenge,
                network,
                networkRiskScore,
                networkSpecificData,
                pos,
                tokenInfo,
                ttl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AsaRequestWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        acquirerFee()
        amount()
        authorizationAmount()
        avs().validate()
        card().validate()
        cardholderCurrency()
        cashAmount()
        created()
        merchant().validate()
        merchantAmount()
        merchantCurrency()
        settledAmount()
        status().validate()
        transactionInitiator().validate()
        accountType().ifPresent { it.validate() }
        cardholderAuthentication().ifPresent { it.validate() }
        cashback()
        conversionRate()
        eventToken()
        fleetInfo().ifPresent { it.validate() }
        latestChallenge().ifPresent { it.validate() }
        network().ifPresent { it.validate() }
        networkRiskScore()
        networkSpecificData().ifPresent { it.validate() }
        pos().ifPresent { it.validate() }
        tokenInfo().ifPresent { it.validate() }
        ttl()
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
            (if (acquirerFee.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (authorizationAmount.asKnown().isPresent) 1 else 0) +
            (avs.asKnown().getOrNull()?.validity() ?: 0) +
            (card.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (if (cashAmount.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
            (if (merchantAmount.asKnown().isPresent) 1 else 0) +
            (if (merchantCurrency.asKnown().isPresent) 1 else 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (transactionInitiator.asKnown().getOrNull()?.validity() ?: 0) +
            (accountType.asKnown().getOrNull()?.validity() ?: 0) +
            (cardholderAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cashback.asKnown().isPresent) 1 else 0) +
            (if (conversionRate.asKnown().isPresent) 1 else 0) +
            (if (eventToken.asKnown().isPresent) 1 else 0) +
            (fleetInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (latestChallenge.asKnown().getOrNull()?.validity() ?: 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
            (networkSpecificData.asKnown().getOrNull()?.validity() ?: 0) +
            (pos.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ttl.asKnown().isPresent) 1 else 0)

    class Avs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<String>,
        private val addressOnFileMatch: JsonField<AddressMatchResult>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_on_file_match")
            @ExcludeMissing
            addressOnFileMatch: JsonField<AddressMatchResult> = JsonMissing.of(),
            @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
        ) : this(address, addressOnFileMatch, zipcode, mutableMapOf())

        /**
         * Cardholder address
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): String = address.getRequired("address")

        /**
         * Lithic's evaluation result comparing the transaction's address data with the cardholder
         * KYC data if it exists. In the event Lithic does not have any Cardholder KYC data, or the
         * transaction does not contain any address data, NOT_PRESENT will be returned
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addressOnFileMatch(): AddressMatchResult =
            addressOnFileMatch.getRequired("address_on_file_match")

        /**
         * Cardholder ZIP code
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun zipcode(): String = zipcode.getRequired("zipcode")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [addressOnFileMatch].
         *
         * Unlike [addressOnFileMatch], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("address_on_file_match")
        @ExcludeMissing
        fun _addressOnFileMatch(): JsonField<AddressMatchResult> = addressOnFileMatch

        /**
         * Returns the raw JSON value of [zipcode].
         *
         * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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
             * Returns a mutable builder for constructing an instance of [Avs].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .addressOnFileMatch()
             * .zipcode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Avs]. */
        class Builder internal constructor() {

            private var address: JsonField<String>? = null
            private var addressOnFileMatch: JsonField<AddressMatchResult>? = null
            private var zipcode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avs: Avs) = apply {
                address = avs.address
                addressOnFileMatch = avs.addressOnFileMatch
                zipcode = avs.zipcode
                additionalProperties = avs.additionalProperties.toMutableMap()
            }

            /** Cardholder address */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /**
             * Lithic's evaluation result comparing the transaction's address data with the
             * cardholder KYC data if it exists. In the event Lithic does not have any Cardholder
             * KYC data, or the transaction does not contain any address data, NOT_PRESENT will be
             * returned
             */
            fun addressOnFileMatch(addressOnFileMatch: AddressMatchResult) =
                addressOnFileMatch(JsonField.of(addressOnFileMatch))

            /**
             * Sets [Builder.addressOnFileMatch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressOnFileMatch] with a well-typed
             * [AddressMatchResult] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun addressOnFileMatch(addressOnFileMatch: JsonField<AddressMatchResult>) = apply {
                this.addressOnFileMatch = addressOnFileMatch
            }

            /** Cardholder ZIP code */
            fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

            /**
             * Sets [Builder.zipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipcode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

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
             * Returns an immutable instance of [Avs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .addressOnFileMatch()
             * .zipcode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Avs =
                Avs(
                    checkRequired("address", address),
                    checkRequired("addressOnFileMatch", addressOnFileMatch),
                    checkRequired("zipcode", zipcode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Avs = apply {
            if (validated) {
                return@apply
            }

            address()
            addressOnFileMatch().validate()
            zipcode()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (address.asKnown().isPresent) 1 else 0) +
                (addressOnFileMatch.asKnown().getOrNull()?.validity() ?: 0) +
                (if (zipcode.asKnown().isPresent) 1 else 0)

        /**
         * Lithic's evaluation result comparing the transaction's address data with the cardholder
         * KYC data if it exists. In the event Lithic does not have any Cardholder KYC data, or the
         * transaction does not contain any address data, NOT_PRESENT will be returned
         */
        class AddressMatchResult
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MATCH = of("MATCH")

                @JvmField val MATCH_ADDRESS_ONLY = of("MATCH_ADDRESS_ONLY")

                @JvmField val MATCH_ZIP_ONLY = of("MATCH_ZIP_ONLY")

                @JvmField val MISMATCH = of("MISMATCH")

                @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                @JvmStatic fun of(value: String) = AddressMatchResult(JsonField.of(value))
            }

            /** An enum containing [AddressMatchResult]'s known values. */
            enum class Known {
                MATCH,
                MATCH_ADDRESS_ONLY,
                MATCH_ZIP_ONLY,
                MISMATCH,
                NOT_PRESENT,
            }

            /**
             * An enum containing [AddressMatchResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AddressMatchResult] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MATCH,
                MATCH_ADDRESS_ONLY,
                MATCH_ZIP_ONLY,
                MISMATCH,
                NOT_PRESENT,
                /**
                 * An enum member indicating that [AddressMatchResult] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MATCH -> Value.MATCH
                    MATCH_ADDRESS_ONLY -> Value.MATCH_ADDRESS_ONLY
                    MATCH_ZIP_ONLY -> Value.MATCH_ZIP_ONLY
                    MISMATCH -> Value.MISMATCH
                    NOT_PRESENT -> Value.NOT_PRESENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MATCH -> Known.MATCH
                    MATCH_ADDRESS_ONLY -> Known.MATCH_ADDRESS_ONLY
                    MATCH_ZIP_ONLY -> Known.MATCH_ZIP_ONLY
                    MISMATCH -> Known.MISMATCH
                    NOT_PRESENT -> Known.NOT_PRESENT
                    else -> throw LithicInvalidDataException("Unknown AddressMatchResult: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): AddressMatchResult = apply {
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

                return other is AddressMatchResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Avs &&
                address == other.address &&
                addressOnFileMatch == other.addressOnFileMatch &&
                zipcode == other.zipcode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, addressOnFileMatch, zipcode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avs{address=$address, addressOnFileMatch=$addressOnFileMatch, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /** Card object in ASA */
    class AsaRequestCard
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val hostname: JsonField<String>,
        private val lastFour: JsonField<String>,
        private val memo: JsonField<String>,
        private val spendLimit: JsonField<Long>,
        private val spendLimitDuration: JsonField<SpendLimitDuration>,
        private val state: JsonField<State>,
        private val type: JsonField<CardType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostname")
            @ExcludeMissing
            hostname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_four")
            @ExcludeMissing
            lastFour: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spend_limit")
            @ExcludeMissing
            spendLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend_limit_duration")
            @ExcludeMissing
            spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<CardType> = JsonMissing.of(),
        ) : this(
            token,
            hostname,
            lastFour,
            memo,
            spendLimit,
            spendLimitDuration,
            state,
            type,
            mutableMapOf(),
        )

        /**
         * Globally unique identifier for the card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * Hostname of card’s locked merchant (will be empty if not applicable)
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hostname(): Optional<String> = hostname.getOptional("hostname")

        /**
         * Last four digits of the card number
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastFour(): Optional<String> = lastFour.getOptional("last_four")

        /**
         * Customizable name to identify the card. We recommend against using this field to store
         * JSON data as it can cause unexpected behavior.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * Amount (in cents) to limit approved authorizations. Purchase requests above the spend
         * limit will be declined (refunds and credits will be approved).
         *
         * Note that while spend limits are enforced based on authorized and settled volume on a
         * card, they are not recommended to be used for balance or reconciliation-level accuracy.
         * Spend limits also cannot block force posted charges (i.e., when a merchant sends a
         * clearing message without a prior authorization).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendLimit(): Optional<Long> = spendLimit.getOptional("spend_limit")

        /**
         * Note that to support recurring monthly payments, which can occur on different day every
         * month, the time window we consider for MONTHLY velocity starts 6 days after the current
         * calendar date one month prior.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendLimitDuration(): Optional<SpendLimitDuration> =
            spendLimitDuration.getOptional("spend_limit_duration")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<State> = state.getOptional("state")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<CardType> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [hostname].
         *
         * Unlike [hostname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hostname") @ExcludeMissing fun _hostname(): JsonField<String> = hostname

        /**
         * Returns the raw JSON value of [lastFour].
         *
         * Unlike [lastFour], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [spendLimit].
         *
         * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit(): JsonField<Long> = spendLimit

        /**
         * Returns the raw JSON value of [spendLimitDuration].
         *
         * Unlike [spendLimitDuration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        fun _spendLimitDuration(): JsonField<SpendLimitDuration> = spendLimitDuration

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<CardType> = type

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

            /** Returns a mutable builder for constructing an instance of [AsaRequestCard]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AsaRequestCard]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var hostname: JsonField<String> = JsonMissing.of()
            private var lastFour: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var spendLimit: JsonField<Long> = JsonMissing.of()
            private var spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var type: JsonField<CardType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(asaRequestCard: AsaRequestCard) = apply {
                token = asaRequestCard.token
                hostname = asaRequestCard.hostname
                lastFour = asaRequestCard.lastFour
                memo = asaRequestCard.memo
                spendLimit = asaRequestCard.spendLimit
                spendLimitDuration = asaRequestCard.spendLimitDuration
                state = asaRequestCard.state
                type = asaRequestCard.type
                additionalProperties = asaRequestCard.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the card. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Hostname of card’s locked merchant (will be empty if not applicable) */
            fun hostname(hostname: String) = hostname(JsonField.of(hostname))

            /**
             * Sets [Builder.hostname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostname(hostname: JsonField<String>) = apply { this.hostname = hostname }

            /** Last four digits of the card number */
            fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

            /**
             * Sets [Builder.lastFour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastFour] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

            /**
             * Customizable name to identify the card. We recommend against using this field to
             * store JSON data as it can cause unexpected behavior.
             */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /**
             * Amount (in cents) to limit approved authorizations. Purchase requests above the spend
             * limit will be declined (refunds and credits will be approved).
             *
             * Note that while spend limits are enforced based on authorized and settled volume on a
             * card, they are not recommended to be used for balance or reconciliation-level
             * accuracy. Spend limits also cannot block force posted charges (i.e., when a merchant
             * sends a clearing message without a prior authorization).
             */
            fun spendLimit(spendLimit: Long) = spendLimit(JsonField.of(spendLimit))

            /**
             * Sets [Builder.spendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spendLimit(spendLimit: JsonField<Long>) = apply { this.spendLimit = spendLimit }

            /**
             * Note that to support recurring monthly payments, which can occur on different day
             * every month, the time window we consider for MONTHLY velocity starts 6 days after the
             * current calendar date one month prior.
             */
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) =
                spendLimitDuration(JsonField.of(spendLimitDuration))

            /**
             * Sets [Builder.spendLimitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendLimitDuration] with a well-typed
             * [SpendLimitDuration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            fun type(type: CardType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [CardType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<CardType>) = apply { this.type = type }

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
             * Returns an immutable instance of [AsaRequestCard].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AsaRequestCard =
                AsaRequestCard(
                    token,
                    hostname,
                    lastFour,
                    memo,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AsaRequestCard = apply {
            if (validated) {
                return@apply
            }

            token()
            hostname()
            lastFour()
            memo()
            spendLimit()
            spendLimitDuration().ifPresent { it.validate() }
            state().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (hostname.asKnown().isPresent) 1 else 0) +
                (if (lastFour.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (spendLimit.asKnown().isPresent) 1 else 0) +
                (spendLimitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Note that to support recurring monthly payments, which can occur on different day every
         * month, the time window we consider for MONTHLY velocity starts 6 days after the current
         * calendar date one month prior.
         */
        class SpendLimitDuration
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ANNUALLY = of("ANNUALLY")

                @JvmField val FOREVER = of("FOREVER")

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val TRANSACTION = of("TRANSACTION")

                @JvmStatic fun of(value: String) = SpendLimitDuration(JsonField.of(value))
            }

            /** An enum containing [SpendLimitDuration]'s known values. */
            enum class Known {
                ANNUALLY,
                FOREVER,
                MONTHLY,
                TRANSACTION,
            }

            /**
             * An enum containing [SpendLimitDuration]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SpendLimitDuration] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANNUALLY,
                FOREVER,
                MONTHLY,
                TRANSACTION,
                /**
                 * An enum member indicating that [SpendLimitDuration] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ANNUALLY -> Value.ANNUALLY
                    FOREVER -> Value.FOREVER
                    MONTHLY -> Value.MONTHLY
                    TRANSACTION -> Value.TRANSACTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ANNUALLY -> Known.ANNUALLY
                    FOREVER -> Known.FOREVER
                    MONTHLY -> Known.MONTHLY
                    TRANSACTION -> Known.TRANSACTION
                    else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): SpendLimitDuration = apply {
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

                return other is SpendLimitDuration && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CLOSED = of("CLOSED")

                @JvmField val OPEN = of("OPEN")

                @JvmField val PAUSED = of("PAUSED")

                @JvmField val PENDING_ACTIVATION = of("PENDING_ACTIVATION")

                @JvmField val PENDING_FULFILLMENT = of("PENDING_FULFILLMENT")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                CLOSED,
                OPEN,
                PAUSED,
                PENDING_ACTIVATION,
                PENDING_FULFILLMENT,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CLOSED,
                OPEN,
                PAUSED,
                PENDING_ACTIVATION,
                PENDING_FULFILLMENT,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CLOSED -> Value.CLOSED
                    OPEN -> Value.OPEN
                    PAUSED -> Value.PAUSED
                    PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                    PENDING_FULFILLMENT -> Value.PENDING_FULFILLMENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CLOSED -> Known.CLOSED
                    OPEN -> Known.OPEN
                    PAUSED -> Known.PAUSED
                    PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                    PENDING_FULFILLMENT -> Known.PENDING_FULFILLMENT
                    else -> throw LithicInvalidDataException("Unknown State: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): State = apply {
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

                return other is State && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class CardType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SINGLE_USE = of("SINGLE_USE")

                @JvmField val MERCHANT_LOCKED = of("MERCHANT_LOCKED")

                @JvmField val UNLOCKED = of("UNLOCKED")

                @JvmField val PHYSICAL = of("PHYSICAL")

                @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

                @JvmField val VIRTUAL = of("VIRTUAL")

                @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
            }

            /** An enum containing [CardType]'s known values. */
            enum class Known {
                SINGLE_USE,
                MERCHANT_LOCKED,
                UNLOCKED,
                PHYSICAL,
                DIGITAL_WALLET,
                VIRTUAL,
            }

            /**
             * An enum containing [CardType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CardType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SINGLE_USE,
                MERCHANT_LOCKED,
                UNLOCKED,
                PHYSICAL,
                DIGITAL_WALLET,
                VIRTUAL,
                /**
                 * An enum member indicating that [CardType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SINGLE_USE -> Value.SINGLE_USE
                    MERCHANT_LOCKED -> Value.MERCHANT_LOCKED
                    UNLOCKED -> Value.UNLOCKED
                    PHYSICAL -> Value.PHYSICAL
                    DIGITAL_WALLET -> Value.DIGITAL_WALLET
                    VIRTUAL -> Value.VIRTUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SINGLE_USE -> Known.SINGLE_USE
                    MERCHANT_LOCKED -> Known.MERCHANT_LOCKED
                    UNLOCKED -> Known.UNLOCKED
                    PHYSICAL -> Known.PHYSICAL
                    DIGITAL_WALLET -> Known.DIGITAL_WALLET
                    VIRTUAL -> Known.VIRTUAL
                    else -> throw LithicInvalidDataException("Unknown CardType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): CardType = apply {
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

                return other is CardType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AsaRequestCard &&
                token == other.token &&
                hostname == other.hostname &&
                lastFour == other.lastFour &&
                memo == other.memo &&
                spendLimit == other.spendLimit &&
                spendLimitDuration == other.spendLimitDuration &&
                state == other.state &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                hostname,
                lastFour,
                memo,
                spendLimit,
                spendLimitDuration,
                state,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AsaRequestCard{token=$token, hostname=$hostname, lastFour=$lastFour, memo=$memo, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The type of authorization request that this request is for. Note that `CREDIT_AUTHORIZATION`
     * and `FINANCIAL_CREDIT_AUTHORIZATION` is only available to users with credit decisioning via
     * ASA enabled.
     */
    class AsaRequestStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AUTHORIZATION = of("AUTHORIZATION")

            @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

            @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

            @JvmField val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

            @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

            @JvmStatic fun of(value: String) = AsaRequestStatus(JsonField.of(value))
        }

        /** An enum containing [AsaRequestStatus]'s known values. */
        enum class Known {
            AUTHORIZATION,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            BALANCE_INQUIRY,
        }

        /**
         * An enum containing [AsaRequestStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AsaRequestStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZATION,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            BALANCE_INQUIRY,
            /**
             * An enum member indicating that [AsaRequestStatus] was instantiated with an unknown
             * value.
             */
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
                AUTHORIZATION -> Value.AUTHORIZATION
                CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
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
                AUTHORIZATION -> Known.AUTHORIZATION
                CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                else -> throw LithicInvalidDataException("Unknown AsaRequestStatus: $value")
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

        fun validate(): AsaRequestStatus = apply {
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

            return other is AsaRequestStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The entity that initiated the transaction. */
    class TransactionInitiator
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CARDHOLDER = of("CARDHOLDER")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = TransactionInitiator(JsonField.of(value))
        }

        /** An enum containing [TransactionInitiator]'s known values. */
        enum class Known {
            CARDHOLDER,
            MERCHANT,
            UNKNOWN,
        }

        /**
         * An enum containing [TransactionInitiator]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [TransactionInitiator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARDHOLDER,
            MERCHANT,
            UNKNOWN,
            /**
             * An enum member indicating that [TransactionInitiator] was instantiated with an
             * unknown value.
             */
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
                CARDHOLDER -> Value.CARDHOLDER
                MERCHANT -> Value.MERCHANT
                UNKNOWN -> Value.UNKNOWN
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
                CARDHOLDER -> Known.CARDHOLDER
                MERCHANT -> Known.MERCHANT
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown TransactionInitiator: $value")
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

        fun validate(): TransactionInitiator = apply {
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

            return other is TransactionInitiator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CHECKING = of("CHECKING")

            @JvmField val SAVINGS = of("SAVINGS")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKING,
            SAVINGS,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
             */
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
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

        fun validate(): AccountType = apply {
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

            return other is AccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Optional Object containing information if the Card is a part of a Fleet managed program */
    class AsaRequestFleetInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fleetPromptCode: JsonField<FleetPromptCode>,
        private val fleetRestrictionCode: JsonField<FleetRestrictionCode>,
        private val driverNumber: JsonField<String>,
        private val vehicleNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fleet_prompt_code")
            @ExcludeMissing
            fleetPromptCode: JsonField<FleetPromptCode> = JsonMissing.of(),
            @JsonProperty("fleet_restriction_code")
            @ExcludeMissing
            fleetRestrictionCode: JsonField<FleetRestrictionCode> = JsonMissing.of(),
            @JsonProperty("driver_number")
            @ExcludeMissing
            driverNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vehicle_number")
            @ExcludeMissing
            vehicleNumber: JsonField<String> = JsonMissing.of(),
        ) : this(fleetPromptCode, fleetRestrictionCode, driverNumber, vehicleNumber, mutableMapOf())

        /**
         * Code indicating what the driver was prompted to enter at time of purchase. This is
         * configured at a program level and is a static configuration, and does not change on a
         * request to request basis
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fleetPromptCode(): FleetPromptCode = fleetPromptCode.getRequired("fleet_prompt_code")

        /**
         * Code indicating which restrictions, if any, there are on purchase. This is configured at
         * a program level and is a static configuration, and does not change on a request to
         * request basis
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fleetRestrictionCode(): FleetRestrictionCode =
            fleetRestrictionCode.getRequired("fleet_restriction_code")

        /**
         * Number representing the driver
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun driverNumber(): Optional<String> = driverNumber.getOptional("driver_number")

        /**
         * Number associated with the vehicle
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vehicleNumber(): Optional<String> = vehicleNumber.getOptional("vehicle_number")

        /**
         * Returns the raw JSON value of [fleetPromptCode].
         *
         * Unlike [fleetPromptCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fleet_prompt_code")
        @ExcludeMissing
        fun _fleetPromptCode(): JsonField<FleetPromptCode> = fleetPromptCode

        /**
         * Returns the raw JSON value of [fleetRestrictionCode].
         *
         * Unlike [fleetRestrictionCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fleet_restriction_code")
        @ExcludeMissing
        fun _fleetRestrictionCode(): JsonField<FleetRestrictionCode> = fleetRestrictionCode

        /**
         * Returns the raw JSON value of [driverNumber].
         *
         * Unlike [driverNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("driver_number")
        @ExcludeMissing
        fun _driverNumber(): JsonField<String> = driverNumber

        /**
         * Returns the raw JSON value of [vehicleNumber].
         *
         * Unlike [vehicleNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vehicle_number")
        @ExcludeMissing
        fun _vehicleNumber(): JsonField<String> = vehicleNumber

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
             * Returns a mutable builder for constructing an instance of [AsaRequestFleetInfo].
             *
             * The following fields are required:
             * ```java
             * .fleetPromptCode()
             * .fleetRestrictionCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AsaRequestFleetInfo]. */
        class Builder internal constructor() {

            private var fleetPromptCode: JsonField<FleetPromptCode>? = null
            private var fleetRestrictionCode: JsonField<FleetRestrictionCode>? = null
            private var driverNumber: JsonField<String> = JsonMissing.of()
            private var vehicleNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(asaRequestFleetInfo: AsaRequestFleetInfo) = apply {
                fleetPromptCode = asaRequestFleetInfo.fleetPromptCode
                fleetRestrictionCode = asaRequestFleetInfo.fleetRestrictionCode
                driverNumber = asaRequestFleetInfo.driverNumber
                vehicleNumber = asaRequestFleetInfo.vehicleNumber
                additionalProperties = asaRequestFleetInfo.additionalProperties.toMutableMap()
            }

            /**
             * Code indicating what the driver was prompted to enter at time of purchase. This is
             * configured at a program level and is a static configuration, and does not change on a
             * request to request basis
             */
            fun fleetPromptCode(fleetPromptCode: FleetPromptCode) =
                fleetPromptCode(JsonField.of(fleetPromptCode))

            /**
             * Sets [Builder.fleetPromptCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fleetPromptCode] with a well-typed [FleetPromptCode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fleetPromptCode(fleetPromptCode: JsonField<FleetPromptCode>) = apply {
                this.fleetPromptCode = fleetPromptCode
            }

            /**
             * Code indicating which restrictions, if any, there are on purchase. This is configured
             * at a program level and is a static configuration, and does not change on a request to
             * request basis
             */
            fun fleetRestrictionCode(fleetRestrictionCode: FleetRestrictionCode) =
                fleetRestrictionCode(JsonField.of(fleetRestrictionCode))

            /**
             * Sets [Builder.fleetRestrictionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fleetRestrictionCode] with a well-typed
             * [FleetRestrictionCode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun fleetRestrictionCode(fleetRestrictionCode: JsonField<FleetRestrictionCode>) =
                apply {
                    this.fleetRestrictionCode = fleetRestrictionCode
                }

            /** Number representing the driver */
            fun driverNumber(driverNumber: String?) =
                driverNumber(JsonField.ofNullable(driverNumber))

            /** Alias for calling [Builder.driverNumber] with `driverNumber.orElse(null)`. */
            fun driverNumber(driverNumber: Optional<String>) =
                driverNumber(driverNumber.getOrNull())

            /**
             * Sets [Builder.driverNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.driverNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun driverNumber(driverNumber: JsonField<String>) = apply {
                this.driverNumber = driverNumber
            }

            /** Number associated with the vehicle */
            fun vehicleNumber(vehicleNumber: String?) =
                vehicleNumber(JsonField.ofNullable(vehicleNumber))

            /** Alias for calling [Builder.vehicleNumber] with `vehicleNumber.orElse(null)`. */
            fun vehicleNumber(vehicleNumber: Optional<String>) =
                vehicleNumber(vehicleNumber.getOrNull())

            /**
             * Sets [Builder.vehicleNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicleNumber(vehicleNumber: JsonField<String>) = apply {
                this.vehicleNumber = vehicleNumber
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
             * Returns an immutable instance of [AsaRequestFleetInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fleetPromptCode()
             * .fleetRestrictionCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AsaRequestFleetInfo =
                AsaRequestFleetInfo(
                    checkRequired("fleetPromptCode", fleetPromptCode),
                    checkRequired("fleetRestrictionCode", fleetRestrictionCode),
                    driverNumber,
                    vehicleNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AsaRequestFleetInfo = apply {
            if (validated) {
                return@apply
            }

            fleetPromptCode().validate()
            fleetRestrictionCode().validate()
            driverNumber()
            vehicleNumber()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (fleetPromptCode.asKnown().getOrNull()?.validity() ?: 0) +
                (fleetRestrictionCode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (driverNumber.asKnown().isPresent) 1 else 0) +
                (if (vehicleNumber.asKnown().isPresent) 1 else 0)

        /**
         * Code indicating what the driver was prompted to enter at time of purchase. This is
         * configured at a program level and is a static configuration, and does not change on a
         * request to request basis
         */
        class FleetPromptCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NO_PROMPT = of("NO_PROMPT")

                @JvmField val VEHICLE_NUMBER = of("VEHICLE_NUMBER")

                @JvmField val DRIVER_NUMBER = of("DRIVER_NUMBER")

                @JvmStatic fun of(value: String) = FleetPromptCode(JsonField.of(value))
            }

            /** An enum containing [FleetPromptCode]'s known values. */
            enum class Known {
                NO_PROMPT,
                VEHICLE_NUMBER,
                DRIVER_NUMBER,
            }

            /**
             * An enum containing [FleetPromptCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FleetPromptCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NO_PROMPT,
                VEHICLE_NUMBER,
                DRIVER_NUMBER,
                /**
                 * An enum member indicating that [FleetPromptCode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NO_PROMPT -> Value.NO_PROMPT
                    VEHICLE_NUMBER -> Value.VEHICLE_NUMBER
                    DRIVER_NUMBER -> Value.DRIVER_NUMBER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NO_PROMPT -> Known.NO_PROMPT
                    VEHICLE_NUMBER -> Known.VEHICLE_NUMBER
                    DRIVER_NUMBER -> Known.DRIVER_NUMBER
                    else -> throw LithicInvalidDataException("Unknown FleetPromptCode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): FleetPromptCode = apply {
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

                return other is FleetPromptCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Code indicating which restrictions, if any, there are on purchase. This is configured at
         * a program level and is a static configuration, and does not change on a request to
         * request basis
         */
        class FleetRestrictionCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NO_RESTRICTIONS = of("NO_RESTRICTIONS")

                @JvmField val FUEL_ONLY = of("FUEL_ONLY")

                @JvmStatic fun of(value: String) = FleetRestrictionCode(JsonField.of(value))
            }

            /** An enum containing [FleetRestrictionCode]'s known values. */
            enum class Known {
                NO_RESTRICTIONS,
                FUEL_ONLY,
            }

            /**
             * An enum containing [FleetRestrictionCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [FleetRestrictionCode] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NO_RESTRICTIONS,
                FUEL_ONLY,
                /**
                 * An enum member indicating that [FleetRestrictionCode] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                    FUEL_ONLY -> Value.FUEL_ONLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                    FUEL_ONLY -> Known.FUEL_ONLY
                    else -> throw LithicInvalidDataException("Unknown FleetRestrictionCode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): FleetRestrictionCode = apply {
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

                return other is FleetRestrictionCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AsaRequestFleetInfo &&
                fleetPromptCode == other.fleetPromptCode &&
                fleetRestrictionCode == other.fleetRestrictionCode &&
                driverNumber == other.driverNumber &&
                vehicleNumber == other.vehicleNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fleetPromptCode,
                fleetRestrictionCode,
                driverNumber,
                vehicleNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AsaRequestFleetInfo{fleetPromptCode=$fleetPromptCode, fleetRestrictionCode=$fleetRestrictionCode, driverNumber=$driverNumber, vehicleNumber=$vehicleNumber, additionalProperties=$additionalProperties}"
    }

    /** The latest Authorization Challenge that was issued to the cardholder for this merchant. */
    class LatestChallenge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumber: JsonField<String>,
        private val status: JsonField<Status>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(phoneNumber, status, completedAt, mutableMapOf())

        /**
         * The phone number used for sending Authorization Challenge SMS.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * The status of the Authorization Challenge
         * * `COMPLETED` - Challenge was successfully completed by the cardholder
         * * `PENDING` - Challenge is still open
         * * `EXPIRED` - Challenge has expired without being completed
         * * `ERROR` - There was an error processing the challenge
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The date and time when the Authorization Challenge was completed in UTC. Present only if
         * the status is `COMPLETED`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

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
             * Returns a mutable builder for constructing an instance of [LatestChallenge].
             *
             * The following fields are required:
             * ```java
             * .phoneNumber()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LatestChallenge]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(latestChallenge: LatestChallenge) = apply {
                phoneNumber = latestChallenge.phoneNumber
                status = latestChallenge.status
                completedAt = latestChallenge.completedAt
                additionalProperties = latestChallenge.additionalProperties.toMutableMap()
            }

            /** The phone number used for sending Authorization Challenge SMS. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * The status of the Authorization Challenge
             * * `COMPLETED` - Challenge was successfully completed by the cardholder
             * * `PENDING` - Challenge is still open
             * * `EXPIRED` - Challenge has expired without being completed
             * * `ERROR` - There was an error processing the challenge
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * The date and time when the Authorization Challenge was completed in UTC. Present only
             * if the status is `COMPLETED`.
             */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
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
             * Returns an immutable instance of [LatestChallenge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .phoneNumber()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LatestChallenge =
                LatestChallenge(
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("status", status),
                    completedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LatestChallenge = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
            status().validate()
            completedAt()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0)

        /**
         * The status of the Authorization Challenge
         * * `COMPLETED` - Challenge was successfully completed by the cardholder
         * * `PENDING` - Challenge is still open
         * * `EXPIRED` - Challenge has expired without being completed
         * * `ERROR` - There was an error processing the challenge
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMPLETED = of("COMPLETED")

                @JvmField val PENDING = of("PENDING")

                @JvmField val EXPIRED = of("EXPIRED")

                @JvmField val ERROR = of("ERROR")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                COMPLETED,
                PENDING,
                EXPIRED,
                ERROR,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMPLETED,
                PENDING,
                EXPIRED,
                ERROR,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMPLETED -> Value.COMPLETED
                    PENDING -> Value.PENDING
                    EXPIRED -> Value.EXPIRED
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMPLETED -> Known.COMPLETED
                    PENDING -> Known.PENDING
                    EXPIRED -> Known.EXPIRED
                    ERROR -> Known.ERROR
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LatestChallenge &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                completedAt == other.completedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(phoneNumber, status, completedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LatestChallenge{phoneNumber=$phoneNumber, status=$status, completedAt=$completedAt, additionalProperties=$additionalProperties}"
    }

    /** Card network of the authorization. */
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

            @JvmField val AMEX = of("AMEX")

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            AMEX,
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
            AMEX,
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
                AMEX -> Value.AMEX
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
                AMEX -> Known.AMEX
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

    /**
     * Contains raw data provided by the card network, including attributes that provide further
     * context about the authorization. If populated by the network, data is organized by Lithic and
     * passed through without further modification. Please consult the official network
     * documentation for more details about these values and how to use them. This object is only
     * available to certain programs- contact your Customer Success Manager to discuss enabling
     * access.
     */
    class AsaNetworkSpecificData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mastercard: JsonField<AsaNetworkSpecificDataMastercard>,
        private val visa: JsonField<AsaNetworkSpecificDataVisa>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mastercard")
            @ExcludeMissing
            mastercard: JsonField<AsaNetworkSpecificDataMastercard> = JsonMissing.of(),
            @JsonProperty("visa")
            @ExcludeMissing
            visa: JsonField<AsaNetworkSpecificDataVisa> = JsonMissing.of(),
        ) : this(mastercard, visa, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mastercard(): Optional<AsaNetworkSpecificDataMastercard> =
            mastercard.getOptional("mastercard")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun visa(): Optional<AsaNetworkSpecificDataVisa> = visa.getOptional("visa")

        /**
         * Returns the raw JSON value of [mastercard].
         *
         * Unlike [mastercard], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mastercard")
        @ExcludeMissing
        fun _mastercard(): JsonField<AsaNetworkSpecificDataMastercard> = mastercard

        /**
         * Returns the raw JSON value of [visa].
         *
         * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visa")
        @ExcludeMissing
        fun _visa(): JsonField<AsaNetworkSpecificDataVisa> = visa

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
             * Returns a mutable builder for constructing an instance of [AsaNetworkSpecificData].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AsaNetworkSpecificData]. */
        class Builder internal constructor() {

            private var mastercard: JsonField<AsaNetworkSpecificDataMastercard> = JsonMissing.of()
            private var visa: JsonField<AsaNetworkSpecificDataVisa> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(asaNetworkSpecificData: AsaNetworkSpecificData) = apply {
                mastercard = asaNetworkSpecificData.mastercard
                visa = asaNetworkSpecificData.visa
                additionalProperties = asaNetworkSpecificData.additionalProperties.toMutableMap()
            }

            fun mastercard(mastercard: AsaNetworkSpecificDataMastercard?) =
                mastercard(JsonField.ofNullable(mastercard))

            /** Alias for calling [Builder.mastercard] with `mastercard.orElse(null)`. */
            fun mastercard(mastercard: Optional<AsaNetworkSpecificDataMastercard>) =
                mastercard(mastercard.getOrNull())

            /**
             * Sets [Builder.mastercard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mastercard] with a well-typed
             * [AsaNetworkSpecificDataMastercard] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun mastercard(mastercard: JsonField<AsaNetworkSpecificDataMastercard>) = apply {
                this.mastercard = mastercard
            }

            fun visa(visa: AsaNetworkSpecificDataVisa?) = visa(JsonField.ofNullable(visa))

            /** Alias for calling [Builder.visa] with `visa.orElse(null)`. */
            fun visa(visa: Optional<AsaNetworkSpecificDataVisa>) = visa(visa.getOrNull())

            /**
             * Sets [Builder.visa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visa] with a well-typed [AsaNetworkSpecificDataVisa]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun visa(visa: JsonField<AsaNetworkSpecificDataVisa>) = apply { this.visa = visa }

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
             * Returns an immutable instance of [AsaNetworkSpecificData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AsaNetworkSpecificData =
                AsaNetworkSpecificData(mastercard, visa, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AsaNetworkSpecificData = apply {
            if (validated) {
                return@apply
            }

            mastercard().ifPresent { it.validate() }
            visa().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (mastercard.asKnown().getOrNull()?.validity() ?: 0) +
                (visa.asKnown().getOrNull()?.validity() ?: 0)

        class AsaNetworkSpecificDataMastercard
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ecommerceSecurityLevelIndicator: JsonField<String>,
            private val onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>>,
            private val transactionTypeIdentifier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ecommerce_security_level_indicator")
                @ExcludeMissing
                ecommerceSecurityLevelIndicator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("on_behalf_service_result")
                @ExcludeMissing
                onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>> = JsonMissing.of(),
                @JsonProperty("transaction_type_identifier")
                @ExcludeMissing
                transactionTypeIdentifier: JsonField<String> = JsonMissing.of(),
            ) : this(
                ecommerceSecurityLevelIndicator,
                onBehalfServiceResult,
                transactionTypeIdentifier,
                mutableMapOf(),
            )

            /**
             * Indicates the electronic commerce security level and UCAF collection.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ecommerceSecurityLevelIndicator(): Optional<String> =
                ecommerceSecurityLevelIndicator.getOptional("ecommerce_security_level_indicator")

            /**
             * The On-behalf Service performed on the transaction and the results. Contains all
             * applicable, on-behalf service results that were performed on a given transaction.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun onBehalfServiceResult(): Optional<List<OnBehalfServiceResult>> =
                onBehalfServiceResult.getOptional("on_behalf_service_result")

            /**
             * Indicates the type of additional transaction purpose.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transactionTypeIdentifier(): Optional<String> =
                transactionTypeIdentifier.getOptional("transaction_type_identifier")

            /**
             * Returns the raw JSON value of [ecommerceSecurityLevelIndicator].
             *
             * Unlike [ecommerceSecurityLevelIndicator], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("ecommerce_security_level_indicator")
            @ExcludeMissing
            fun _ecommerceSecurityLevelIndicator(): JsonField<String> =
                ecommerceSecurityLevelIndicator

            /**
             * Returns the raw JSON value of [onBehalfServiceResult].
             *
             * Unlike [onBehalfServiceResult], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("on_behalf_service_result")
            @ExcludeMissing
            fun _onBehalfServiceResult(): JsonField<List<OnBehalfServiceResult>> =
                onBehalfServiceResult

            /**
             * Returns the raw JSON value of [transactionTypeIdentifier].
             *
             * Unlike [transactionTypeIdentifier], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("transaction_type_identifier")
            @ExcludeMissing
            fun _transactionTypeIdentifier(): JsonField<String> = transactionTypeIdentifier

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
                 * Returns a mutable builder for constructing an instance of
                 * [AsaNetworkSpecificDataMastercard].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AsaNetworkSpecificDataMastercard]. */
            class Builder internal constructor() {

                private var ecommerceSecurityLevelIndicator: JsonField<String> = JsonMissing.of()
                private var onBehalfServiceResult: JsonField<MutableList<OnBehalfServiceResult>>? =
                    null
                private var transactionTypeIdentifier: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    asaNetworkSpecificDataMastercard: AsaNetworkSpecificDataMastercard
                ) = apply {
                    ecommerceSecurityLevelIndicator =
                        asaNetworkSpecificDataMastercard.ecommerceSecurityLevelIndicator
                    onBehalfServiceResult =
                        asaNetworkSpecificDataMastercard.onBehalfServiceResult.map {
                            it.toMutableList()
                        }
                    transactionTypeIdentifier =
                        asaNetworkSpecificDataMastercard.transactionTypeIdentifier
                    additionalProperties =
                        asaNetworkSpecificDataMastercard.additionalProperties.toMutableMap()
                }

                /** Indicates the electronic commerce security level and UCAF collection. */
                fun ecommerceSecurityLevelIndicator(ecommerceSecurityLevelIndicator: String?) =
                    ecommerceSecurityLevelIndicator(
                        JsonField.ofNullable(ecommerceSecurityLevelIndicator)
                    )

                /**
                 * Alias for calling [Builder.ecommerceSecurityLevelIndicator] with
                 * `ecommerceSecurityLevelIndicator.orElse(null)`.
                 */
                fun ecommerceSecurityLevelIndicator(
                    ecommerceSecurityLevelIndicator: Optional<String>
                ) = ecommerceSecurityLevelIndicator(ecommerceSecurityLevelIndicator.getOrNull())

                /**
                 * Sets [Builder.ecommerceSecurityLevelIndicator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ecommerceSecurityLevelIndicator] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ecommerceSecurityLevelIndicator(
                    ecommerceSecurityLevelIndicator: JsonField<String>
                ) = apply { this.ecommerceSecurityLevelIndicator = ecommerceSecurityLevelIndicator }

                /**
                 * The On-behalf Service performed on the transaction and the results. Contains all
                 * applicable, on-behalf service results that were performed on a given transaction.
                 */
                fun onBehalfServiceResult(onBehalfServiceResult: List<OnBehalfServiceResult>?) =
                    onBehalfServiceResult(JsonField.ofNullable(onBehalfServiceResult))

                /**
                 * Alias for calling [Builder.onBehalfServiceResult] with
                 * `onBehalfServiceResult.orElse(null)`.
                 */
                fun onBehalfServiceResult(
                    onBehalfServiceResult: Optional<List<OnBehalfServiceResult>>
                ) = onBehalfServiceResult(onBehalfServiceResult.getOrNull())

                /**
                 * Sets [Builder.onBehalfServiceResult] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onBehalfServiceResult] with a well-typed
                 * `List<OnBehalfServiceResult>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun onBehalfServiceResult(
                    onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>>
                ) = apply {
                    this.onBehalfServiceResult = onBehalfServiceResult.map { it.toMutableList() }
                }

                /**
                 * Adds a single [OnBehalfServiceResult] to [Builder.onBehalfServiceResult].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOnBehalfServiceResult(onBehalfServiceResult: OnBehalfServiceResult) = apply {
                    this.onBehalfServiceResult =
                        (this.onBehalfServiceResult ?: JsonField.of(mutableListOf())).also {
                            checkKnown("onBehalfServiceResult", it).add(onBehalfServiceResult)
                        }
                }

                /** Indicates the type of additional transaction purpose. */
                fun transactionTypeIdentifier(transactionTypeIdentifier: String?) =
                    transactionTypeIdentifier(JsonField.ofNullable(transactionTypeIdentifier))

                /**
                 * Alias for calling [Builder.transactionTypeIdentifier] with
                 * `transactionTypeIdentifier.orElse(null)`.
                 */
                fun transactionTypeIdentifier(transactionTypeIdentifier: Optional<String>) =
                    transactionTypeIdentifier(transactionTypeIdentifier.getOrNull())

                /**
                 * Sets [Builder.transactionTypeIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionTypeIdentifier] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun transactionTypeIdentifier(transactionTypeIdentifier: JsonField<String>) =
                    apply {
                        this.transactionTypeIdentifier = transactionTypeIdentifier
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AsaNetworkSpecificDataMastercard].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AsaNetworkSpecificDataMastercard =
                    AsaNetworkSpecificDataMastercard(
                        ecommerceSecurityLevelIndicator,
                        (onBehalfServiceResult ?: JsonMissing.of()).map { it.toImmutable() },
                        transactionTypeIdentifier,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AsaNetworkSpecificDataMastercard = apply {
                if (validated) {
                    return@apply
                }

                ecommerceSecurityLevelIndicator()
                onBehalfServiceResult().ifPresent { it.forEach { it.validate() } }
                transactionTypeIdentifier()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (ecommerceSecurityLevelIndicator.asKnown().isPresent) 1 else 0) +
                    (onBehalfServiceResult.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (transactionTypeIdentifier.asKnown().isPresent) 1 else 0)

            class OnBehalfServiceResult
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val result1: JsonField<String>,
                private val result2: JsonField<String>,
                private val service: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("result_1")
                    @ExcludeMissing
                    result1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("result_2")
                    @ExcludeMissing
                    result2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("service")
                    @ExcludeMissing
                    service: JsonField<String> = JsonMissing.of(),
                ) : this(result1, result2, service, mutableMapOf())

                /**
                 * Indicates the results of the service processing.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun result1(): String = result1.getRequired("result_1")

                /**
                 * Identifies the results of the service processing.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun result2(): String = result2.getRequired("result_2")

                /**
                 * Indicates the service performed on the transaction.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun service(): String = service.getRequired("service")

                /**
                 * Returns the raw JSON value of [result1].
                 *
                 * Unlike [result1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("result_1")
                @ExcludeMissing
                fun _result1(): JsonField<String> = result1

                /**
                 * Returns the raw JSON value of [result2].
                 *
                 * Unlike [result2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("result_2")
                @ExcludeMissing
                fun _result2(): JsonField<String> = result2

                /**
                 * Returns the raw JSON value of [service].
                 *
                 * Unlike [service], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

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
                     * Returns a mutable builder for constructing an instance of
                     * [OnBehalfServiceResult].
                     *
                     * The following fields are required:
                     * ```java
                     * .result1()
                     * .result2()
                     * .service()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OnBehalfServiceResult]. */
                class Builder internal constructor() {

                    private var result1: JsonField<String>? = null
                    private var result2: JsonField<String>? = null
                    private var service: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(onBehalfServiceResult: OnBehalfServiceResult) = apply {
                        result1 = onBehalfServiceResult.result1
                        result2 = onBehalfServiceResult.result2
                        service = onBehalfServiceResult.service
                        additionalProperties =
                            onBehalfServiceResult.additionalProperties.toMutableMap()
                    }

                    /** Indicates the results of the service processing. */
                    fun result1(result1: String) = result1(JsonField.of(result1))

                    /**
                     * Sets [Builder.result1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result1(result1: JsonField<String>) = apply { this.result1 = result1 }

                    /** Identifies the results of the service processing. */
                    fun result2(result2: String) = result2(JsonField.of(result2))

                    /**
                     * Sets [Builder.result2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result2(result2: JsonField<String>) = apply { this.result2 = result2 }

                    /** Indicates the service performed on the transaction. */
                    fun service(service: String) = service(JsonField.of(service))

                    /**
                     * Sets [Builder.service] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.service] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun service(service: JsonField<String>) = apply { this.service = service }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [OnBehalfServiceResult].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .result1()
                     * .result2()
                     * .service()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OnBehalfServiceResult =
                        OnBehalfServiceResult(
                            checkRequired("result1", result1),
                            checkRequired("result2", result2),
                            checkRequired("service", service),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OnBehalfServiceResult = apply {
                    if (validated) {
                        return@apply
                    }

                    result1()
                    result2()
                    service()
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (result1.asKnown().isPresent) 1 else 0) +
                        (if (result2.asKnown().isPresent) 1 else 0) +
                        (if (service.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OnBehalfServiceResult &&
                        result1 == other.result1 &&
                        result2 == other.result2 &&
                        service == other.service &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(result1, result2, service, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OnBehalfServiceResult{result1=$result1, result2=$result2, service=$service, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AsaNetworkSpecificDataMastercard &&
                    ecommerceSecurityLevelIndicator == other.ecommerceSecurityLevelIndicator &&
                    onBehalfServiceResult == other.onBehalfServiceResult &&
                    transactionTypeIdentifier == other.transactionTypeIdentifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    ecommerceSecurityLevelIndicator,
                    onBehalfServiceResult,
                    transactionTypeIdentifier,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AsaNetworkSpecificDataMastercard{ecommerceSecurityLevelIndicator=$ecommerceSecurityLevelIndicator, onBehalfServiceResult=$onBehalfServiceResult, transactionTypeIdentifier=$transactionTypeIdentifier, additionalProperties=$additionalProperties}"
        }

        class AsaNetworkSpecificDataVisa
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val businessApplicationIdentifier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("business_application_identifier")
                @ExcludeMissing
                businessApplicationIdentifier: JsonField<String> = JsonMissing.of()
            ) : this(businessApplicationIdentifier, mutableMapOf())

            /**
             * Identifies the purpose or category of a transaction, used to classify and process
             * transactions according to Visa’s rules.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun businessApplicationIdentifier(): Optional<String> =
                businessApplicationIdentifier.getOptional("business_application_identifier")

            /**
             * Returns the raw JSON value of [businessApplicationIdentifier].
             *
             * Unlike [businessApplicationIdentifier], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("business_application_identifier")
            @ExcludeMissing
            fun _businessApplicationIdentifier(): JsonField<String> = businessApplicationIdentifier

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
                 * Returns a mutable builder for constructing an instance of
                 * [AsaNetworkSpecificDataVisa].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AsaNetworkSpecificDataVisa]. */
            class Builder internal constructor() {

                private var businessApplicationIdentifier: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(asaNetworkSpecificDataVisa: AsaNetworkSpecificDataVisa) = apply {
                    businessApplicationIdentifier =
                        asaNetworkSpecificDataVisa.businessApplicationIdentifier
                    additionalProperties =
                        asaNetworkSpecificDataVisa.additionalProperties.toMutableMap()
                }

                /**
                 * Identifies the purpose or category of a transaction, used to classify and process
                 * transactions according to Visa’s rules.
                 */
                fun businessApplicationIdentifier(businessApplicationIdentifier: String?) =
                    businessApplicationIdentifier(
                        JsonField.ofNullable(businessApplicationIdentifier)
                    )

                /**
                 * Alias for calling [Builder.businessApplicationIdentifier] with
                 * `businessApplicationIdentifier.orElse(null)`.
                 */
                fun businessApplicationIdentifier(businessApplicationIdentifier: Optional<String>) =
                    businessApplicationIdentifier(businessApplicationIdentifier.getOrNull())

                /**
                 * Sets [Builder.businessApplicationIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessApplicationIdentifier] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun businessApplicationIdentifier(
                    businessApplicationIdentifier: JsonField<String>
                ) = apply { this.businessApplicationIdentifier = businessApplicationIdentifier }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AsaNetworkSpecificDataVisa].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AsaNetworkSpecificDataVisa =
                    AsaNetworkSpecificDataVisa(
                        businessApplicationIdentifier,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AsaNetworkSpecificDataVisa = apply {
                if (validated) {
                    return@apply
                }

                businessApplicationIdentifier()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (businessApplicationIdentifier.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AsaNetworkSpecificDataVisa &&
                    businessApplicationIdentifier == other.businessApplicationIdentifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(businessApplicationIdentifier, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AsaNetworkSpecificDataVisa{businessApplicationIdentifier=$businessApplicationIdentifier, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AsaNetworkSpecificData &&
                mastercard == other.mastercard &&
                visa == other.visa &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(mastercard, visa, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AsaNetworkSpecificData{mastercard=$mastercard, visa=$visa, additionalProperties=$additionalProperties}"
    }

    class Pos
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entryMode: JsonField<AsaRequestPosEntryMode>,
        private val terminal: JsonField<AsaPosTerminal>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entry_mode")
            @ExcludeMissing
            entryMode: JsonField<AsaRequestPosEntryMode> = JsonMissing.of(),
            @JsonProperty("terminal")
            @ExcludeMissing
            terminal: JsonField<AsaPosTerminal> = JsonMissing.of(),
        ) : this(entryMode, terminal, mutableMapOf())

        /**
         * POS > Entry Mode object in ASA
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entryMode(): Optional<AsaRequestPosEntryMode> = entryMode.getOptional("entry_mode")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminal(): Optional<AsaPosTerminal> = terminal.getOptional("terminal")

        /**
         * Returns the raw JSON value of [entryMode].
         *
         * Unlike [entryMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_mode")
        @ExcludeMissing
        fun _entryMode(): JsonField<AsaRequestPosEntryMode> = entryMode

        /**
         * Returns the raw JSON value of [terminal].
         *
         * Unlike [terminal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terminal")
        @ExcludeMissing
        fun _terminal(): JsonField<AsaPosTerminal> = terminal

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

            /** Returns a mutable builder for constructing an instance of [Pos]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pos]. */
        class Builder internal constructor() {

            private var entryMode: JsonField<AsaRequestPosEntryMode> = JsonMissing.of()
            private var terminal: JsonField<AsaPosTerminal> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pos: Pos) = apply {
                entryMode = pos.entryMode
                terminal = pos.terminal
                additionalProperties = pos.additionalProperties.toMutableMap()
            }

            /** POS > Entry Mode object in ASA */
            fun entryMode(entryMode: AsaRequestPosEntryMode) = entryMode(JsonField.of(entryMode))

            /**
             * Sets [Builder.entryMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryMode] with a well-typed
             * [AsaRequestPosEntryMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun entryMode(entryMode: JsonField<AsaRequestPosEntryMode>) = apply {
                this.entryMode = entryMode
            }

            fun terminal(terminal: AsaPosTerminal) = terminal(JsonField.of(terminal))

            /**
             * Sets [Builder.terminal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminal] with a well-typed [AsaPosTerminal] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminal(terminal: JsonField<AsaPosTerminal>) = apply { this.terminal = terminal }

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
             * Returns an immutable instance of [Pos].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pos = Pos(entryMode, terminal, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Pos = apply {
            if (validated) {
                return@apply
            }

            entryMode().ifPresent { it.validate() }
            terminal().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (entryMode.asKnown().getOrNull()?.validity() ?: 0) +
                (terminal.asKnown().getOrNull()?.validity() ?: 0)

        /** POS > Entry Mode object in ASA */
        class AsaRequestPosEntryMode
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val card: JsonField<Card>,
            private val cardholder: JsonField<Cardholder>,
            private val pan: JsonField<Pan>,
            private val pinEntered: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card") @ExcludeMissing card: JsonField<Card> = JsonMissing.of(),
                @JsonProperty("cardholder")
                @ExcludeMissing
                cardholder: JsonField<Cardholder> = JsonMissing.of(),
                @JsonProperty("pan") @ExcludeMissing pan: JsonField<Pan> = JsonMissing.of(),
                @JsonProperty("pin_entered")
                @ExcludeMissing
                pinEntered: JsonField<Boolean> = JsonMissing.of(),
            ) : this(card, cardholder, pan, pinEntered, mutableMapOf())

            /**
             * Card Presence Indicator
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun card(): Optional<Card> = card.getOptional("card")

            /**
             * Cardholder Presence Indicator
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardholder(): Optional<Cardholder> = cardholder.getOptional("cardholder")

            /**
             * Method of entry for the PAN
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pan(): Optional<Pan> = pan.getOptional("pan")

            /**
             * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pinEntered(): Optional<Boolean> = pinEntered.getOptional("pin_entered")

            /**
             * Returns the raw JSON value of [card].
             *
             * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<Card> = card

            /**
             * Returns the raw JSON value of [cardholder].
             *
             * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardholder")
            @ExcludeMissing
            fun _cardholder(): JsonField<Cardholder> = cardholder

            /**
             * Returns the raw JSON value of [pan].
             *
             * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<Pan> = pan

            /**
             * Returns the raw JSON value of [pinEntered].
             *
             * Unlike [pinEntered], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pin_entered")
            @ExcludeMissing
            fun _pinEntered(): JsonField<Boolean> = pinEntered

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
                 * Returns a mutable builder for constructing an instance of
                 * [AsaRequestPosEntryMode].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AsaRequestPosEntryMode]. */
            class Builder internal constructor() {

                private var card: JsonField<Card> = JsonMissing.of()
                private var cardholder: JsonField<Cardholder> = JsonMissing.of()
                private var pan: JsonField<Pan> = JsonMissing.of()
                private var pinEntered: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(asaRequestPosEntryMode: AsaRequestPosEntryMode) = apply {
                    card = asaRequestPosEntryMode.card
                    cardholder = asaRequestPosEntryMode.cardholder
                    pan = asaRequestPosEntryMode.pan
                    pinEntered = asaRequestPosEntryMode.pinEntered
                    additionalProperties =
                        asaRequestPosEntryMode.additionalProperties.toMutableMap()
                }

                /** Card Presence Indicator */
                fun card(card: Card) = card(JsonField.of(card))

                /**
                 * Sets [Builder.card] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.card] with a well-typed [Card] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun card(card: JsonField<Card>) = apply { this.card = card }

                /** Cardholder Presence Indicator */
                fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

                /**
                 * Sets [Builder.cardholder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                /** Method of entry for the PAN */
                fun pan(pan: Pan) = pan(JsonField.of(pan))

                /**
                 * Sets [Builder.pan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pan] with a well-typed [Pan] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun pan(pan: JsonField<Pan>) = apply { this.pan = pan }

                /**
                 * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
                 */
                fun pinEntered(pinEntered: Boolean) = pinEntered(JsonField.of(pinEntered))

                /**
                 * Sets [Builder.pinEntered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pinEntered] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pinEntered(pinEntered: JsonField<Boolean>) = apply {
                    this.pinEntered = pinEntered
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AsaRequestPosEntryMode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AsaRequestPosEntryMode =
                    AsaRequestPosEntryMode(
                        card,
                        cardholder,
                        pan,
                        pinEntered,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AsaRequestPosEntryMode = apply {
                if (validated) {
                    return@apply
                }

                card().ifPresent { it.validate() }
                cardholder().ifPresent { it.validate() }
                pan().ifPresent { it.validate() }
                pinEntered()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (card.asKnown().getOrNull()?.validity() ?: 0) +
                    (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
                    (pan.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (pinEntered.asKnown().isPresent) 1 else 0)

            /** Card Presence Indicator */
            class Card @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PRESENT = of("PRESENT")

                    @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Card(JsonField.of(value))
                }

                /** An enum containing [Card]'s known values. */
                enum class Known {
                    PRESENT,
                    NOT_PRESENT,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Card]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Card] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PRESENT,
                    NOT_PRESENT,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Card] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PRESENT -> Value.PRESENT
                        NOT_PRESENT -> Value.NOT_PRESENT
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PRESENT -> Known.PRESENT
                        NOT_PRESENT -> Known.NOT_PRESENT
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Card: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Card = apply {
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

                    return other is Card && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Cardholder Presence Indicator */
            class Cardholder
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DEFERRED_BILLING = of("DEFERRED_BILLING")

                    @JvmField val ELECTRONIC_ORDER = of("ELECTRONIC_ORDER")

                    @JvmField val INSTALLMENT = of("INSTALLMENT")

                    @JvmField val MAIL_ORDER = of("MAIL_ORDER")

                    @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                    @JvmField val PRESENT = of("PRESENT")

                    @JvmField val REOCCURRING = of("REOCCURRING")

                    @JvmField val TELEPHONE_ORDER = of("TELEPHONE_ORDER")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Cardholder(JsonField.of(value))
                }

                /** An enum containing [Cardholder]'s known values. */
                enum class Known {
                    DEFERRED_BILLING,
                    ELECTRONIC_ORDER,
                    INSTALLMENT,
                    MAIL_ORDER,
                    NOT_PRESENT,
                    PRESENT,
                    REOCCURRING,
                    TELEPHONE_ORDER,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Cardholder]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cardholder] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEFERRED_BILLING,
                    ELECTRONIC_ORDER,
                    INSTALLMENT,
                    MAIL_ORDER,
                    NOT_PRESENT,
                    PRESENT,
                    REOCCURRING,
                    TELEPHONE_ORDER,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Cardholder] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DEFERRED_BILLING -> Value.DEFERRED_BILLING
                        ELECTRONIC_ORDER -> Value.ELECTRONIC_ORDER
                        INSTALLMENT -> Value.INSTALLMENT
                        MAIL_ORDER -> Value.MAIL_ORDER
                        NOT_PRESENT -> Value.NOT_PRESENT
                        PRESENT -> Value.PRESENT
                        REOCCURRING -> Value.REOCCURRING
                        TELEPHONE_ORDER -> Value.TELEPHONE_ORDER
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DEFERRED_BILLING -> Known.DEFERRED_BILLING
                        ELECTRONIC_ORDER -> Known.ELECTRONIC_ORDER
                        INSTALLMENT -> Known.INSTALLMENT
                        MAIL_ORDER -> Known.MAIL_ORDER
                        NOT_PRESENT -> Known.NOT_PRESENT
                        PRESENT -> Known.PRESENT
                        REOCCURRING -> Known.REOCCURRING
                        TELEPHONE_ORDER -> Known.TELEPHONE_ORDER
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Cardholder: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Cardholder = apply {
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

                    return other is Cardholder && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Method of entry for the PAN */
            class Pan @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AUTO_ENTRY = of("AUTO_ENTRY")

                    @JvmField val BAR_CODE = of("BAR_CODE")

                    @JvmField val CONTACTLESS = of("CONTACTLESS")

                    @JvmField val ECOMMERCE = of("ECOMMERCE")

                    @JvmField val ERROR_KEYED = of("ERROR_KEYED")

                    @JvmField val ERROR_MAGNETIC_STRIPE = of("ERROR_MAGNETIC_STRIPE")

                    @JvmField val ICC = of("ICC")

                    @JvmField val KEY_ENTERED = of("KEY_ENTERED")

                    @JvmField val MAGNETIC_STRIPE = of("MAGNETIC_STRIPE")

                    @JvmField val MANUAL = of("MANUAL")

                    @JvmField val OCR = of("OCR")

                    @JvmField val SECURE_CARDLESS = of("SECURE_CARDLESS")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmField val CREDENTIAL_ON_FILE = of("CREDENTIAL_ON_FILE")

                    @JvmStatic fun of(value: String) = Pan(JsonField.of(value))
                }

                /** An enum containing [Pan]'s known values. */
                enum class Known {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNSPECIFIED,
                    UNKNOWN,
                    CREDENTIAL_ON_FILE,
                }

                /**
                 * An enum containing [Pan]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Pan] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNSPECIFIED,
                    UNKNOWN,
                    CREDENTIAL_ON_FILE,
                    /**
                     * An enum member indicating that [Pan] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTO_ENTRY -> Value.AUTO_ENTRY
                        BAR_CODE -> Value.BAR_CODE
                        CONTACTLESS -> Value.CONTACTLESS
                        ECOMMERCE -> Value.ECOMMERCE
                        ERROR_KEYED -> Value.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Value.ERROR_MAGNETIC_STRIPE
                        ICC -> Value.ICC
                        KEY_ENTERED -> Value.KEY_ENTERED
                        MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                        MANUAL -> Value.MANUAL
                        OCR -> Value.OCR
                        SECURE_CARDLESS -> Value.SECURE_CARDLESS
                        UNSPECIFIED -> Value.UNSPECIFIED
                        UNKNOWN -> Value.UNKNOWN
                        CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTO_ENTRY -> Known.AUTO_ENTRY
                        BAR_CODE -> Known.BAR_CODE
                        CONTACTLESS -> Known.CONTACTLESS
                        ECOMMERCE -> Known.ECOMMERCE
                        ERROR_KEYED -> Known.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Known.ERROR_MAGNETIC_STRIPE
                        ICC -> Known.ICC
                        KEY_ENTERED -> Known.KEY_ENTERED
                        MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                        MANUAL -> Known.MANUAL
                        OCR -> Known.OCR
                        SECURE_CARDLESS -> Known.SECURE_CARDLESS
                        UNSPECIFIED -> Known.UNSPECIFIED
                        UNKNOWN -> Known.UNKNOWN
                        CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                        else -> throw LithicInvalidDataException("Unknown Pan: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Pan = apply {
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

                    return other is Pan && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AsaRequestPosEntryMode &&
                    card == other.card &&
                    cardholder == other.cardholder &&
                    pan == other.pan &&
                    pinEntered == other.pinEntered &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(card, cardholder, pan, pinEntered, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AsaRequestPosEntryMode{card=$card, cardholder=$cardholder, pan=$pan, pinEntered=$pinEntered, additionalProperties=$additionalProperties}"
        }

        class AsaPosTerminal
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attended: JsonField<Boolean>,
            private val cardRetentionCapable: JsonField<Boolean>,
            private val onPremise: JsonField<Boolean>,
            private val operator: JsonField<Operator>,
            private val partialApprovalCapable: JsonField<Boolean>,
            private val pinCapability: JsonField<PinCapability>,
            private val type: JsonField<Type>,
            private val acceptorTerminalId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attended")
                @ExcludeMissing
                attended: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("card_retention_capable")
                @ExcludeMissing
                cardRetentionCapable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("on_premise")
                @ExcludeMissing
                onPremise: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("partial_approval_capable")
                @ExcludeMissing
                partialApprovalCapable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pin_capability")
                @ExcludeMissing
                pinCapability: JsonField<PinCapability> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("acceptor_terminal_id")
                @ExcludeMissing
                acceptorTerminalId: JsonField<String> = JsonMissing.of(),
            ) : this(
                attended,
                cardRetentionCapable,
                onPremise,
                operator,
                partialApprovalCapable,
                pinCapability,
                type,
                acceptorTerminalId,
                mutableMapOf(),
            )

            /**
             * True if a clerk is present at the sale.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attended(): Boolean = attended.getRequired("attended")

            /**
             * True if the terminal is capable of retaining the card.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardRetentionCapable(): Boolean =
                cardRetentionCapable.getRequired("card_retention_capable")

            /**
             * True if the sale was made at the place of business (vs. mobile).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun onPremise(): Boolean = onPremise.getRequired("on_premise")

            /**
             * The person that is designated to swipe the card
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partialApprovalCapable(): Boolean =
                partialApprovalCapable.getRequired("partial_approval_capable")

            /**
             * Status of whether the POS is able to accept PINs
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pinCapability(): PinCapability = pinCapability.getRequired("pin_capability")

            /**
             * POS Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Uniquely identifies a terminal at the card acceptor location of acquiring
             * institutions or merchant POS Systems. Left justified with trailing spaces.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acceptorTerminalId(): Optional<String> =
                acceptorTerminalId.getOptional("acceptor_terminal_id")

            /**
             * Returns the raw JSON value of [attended].
             *
             * Unlike [attended], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attended") @ExcludeMissing fun _attended(): JsonField<Boolean> = attended

            /**
             * Returns the raw JSON value of [cardRetentionCapable].
             *
             * Unlike [cardRetentionCapable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            fun _cardRetentionCapable(): JsonField<Boolean> = cardRetentionCapable

            /**
             * Returns the raw JSON value of [onPremise].
             *
             * Unlike [onPremise], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_premise")
            @ExcludeMissing
            fun _onPremise(): JsonField<Boolean> = onPremise

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [partialApprovalCapable].
             *
             * Unlike [partialApprovalCapable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            fun _partialApprovalCapable(): JsonField<Boolean> = partialApprovalCapable

            /**
             * Returns the raw JSON value of [pinCapability].
             *
             * Unlike [pinCapability], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pin_capability")
            @ExcludeMissing
            fun _pinCapability(): JsonField<PinCapability> = pinCapability

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [acceptorTerminalId].
             *
             * Unlike [acceptorTerminalId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("acceptor_terminal_id")
            @ExcludeMissing
            fun _acceptorTerminalId(): JsonField<String> = acceptorTerminalId

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
                 * Returns a mutable builder for constructing an instance of [AsaPosTerminal].
                 *
                 * The following fields are required:
                 * ```java
                 * .attended()
                 * .cardRetentionCapable()
                 * .onPremise()
                 * .operator()
                 * .partialApprovalCapable()
                 * .pinCapability()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AsaPosTerminal]. */
            class Builder internal constructor() {

                private var attended: JsonField<Boolean>? = null
                private var cardRetentionCapable: JsonField<Boolean>? = null
                private var onPremise: JsonField<Boolean>? = null
                private var operator: JsonField<Operator>? = null
                private var partialApprovalCapable: JsonField<Boolean>? = null
                private var pinCapability: JsonField<PinCapability>? = null
                private var type: JsonField<Type>? = null
                private var acceptorTerminalId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(asaPosTerminal: AsaPosTerminal) = apply {
                    attended = asaPosTerminal.attended
                    cardRetentionCapable = asaPosTerminal.cardRetentionCapable
                    onPremise = asaPosTerminal.onPremise
                    operator = asaPosTerminal.operator
                    partialApprovalCapable = asaPosTerminal.partialApprovalCapable
                    pinCapability = asaPosTerminal.pinCapability
                    type = asaPosTerminal.type
                    acceptorTerminalId = asaPosTerminal.acceptorTerminalId
                    additionalProperties = asaPosTerminal.additionalProperties.toMutableMap()
                }

                /** True if a clerk is present at the sale. */
                fun attended(attended: Boolean) = attended(JsonField.of(attended))

                /**
                 * Sets [Builder.attended] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attended] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attended(attended: JsonField<Boolean>) = apply { this.attended = attended }

                /** True if the terminal is capable of retaining the card. */
                fun cardRetentionCapable(cardRetentionCapable: Boolean) =
                    cardRetentionCapable(JsonField.of(cardRetentionCapable))

                /**
                 * Sets [Builder.cardRetentionCapable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardRetentionCapable] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cardRetentionCapable(cardRetentionCapable: JsonField<Boolean>) = apply {
                    this.cardRetentionCapable = cardRetentionCapable
                }

                /** True if the sale was made at the place of business (vs. mobile). */
                fun onPremise(onPremise: Boolean) = onPremise(JsonField.of(onPremise))

                /**
                 * Sets [Builder.onPremise] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onPremise] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun onPremise(onPremise: JsonField<Boolean>) = apply { this.onPremise = onPremise }

                /** The person that is designated to swipe the card */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /**
                 * True if the terminal is capable of partial approval. Partial approval is when
                 * part of a transaction is approved and another payment must be used for the
                 * remainder. Example scenario: A $40 transaction is attempted on a prepaid card
                 * with a $25 balance. If partial approval is enabled, $25 can be authorized, at
                 * which point the POS will prompt the user for an additional payment of $15.
                 */
                fun partialApprovalCapable(partialApprovalCapable: Boolean) =
                    partialApprovalCapable(JsonField.of(partialApprovalCapable))

                /**
                 * Sets [Builder.partialApprovalCapable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partialApprovalCapable] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
                    this.partialApprovalCapable = partialApprovalCapable
                }

                /** Status of whether the POS is able to accept PINs */
                fun pinCapability(pinCapability: PinCapability) =
                    pinCapability(JsonField.of(pinCapability))

                /**
                 * Sets [Builder.pinCapability] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pinCapability] with a well-typed [PinCapability]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pinCapability(pinCapability: JsonField<PinCapability>) = apply {
                    this.pinCapability = pinCapability
                }

                /** POS Type */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Uniquely identifies a terminal at the card acceptor location of acquiring
                 * institutions or merchant POS Systems. Left justified with trailing spaces.
                 */
                fun acceptorTerminalId(acceptorTerminalId: String?) =
                    acceptorTerminalId(JsonField.ofNullable(acceptorTerminalId))

                /**
                 * Alias for calling [Builder.acceptorTerminalId] with
                 * `acceptorTerminalId.orElse(null)`.
                 */
                fun acceptorTerminalId(acceptorTerminalId: Optional<String>) =
                    acceptorTerminalId(acceptorTerminalId.getOrNull())

                /**
                 * Sets [Builder.acceptorTerminalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acceptorTerminalId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun acceptorTerminalId(acceptorTerminalId: JsonField<String>) = apply {
                    this.acceptorTerminalId = acceptorTerminalId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AsaPosTerminal].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .attended()
                 * .cardRetentionCapable()
                 * .onPremise()
                 * .operator()
                 * .partialApprovalCapable()
                 * .pinCapability()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AsaPosTerminal =
                    AsaPosTerminal(
                        checkRequired("attended", attended),
                        checkRequired("cardRetentionCapable", cardRetentionCapable),
                        checkRequired("onPremise", onPremise),
                        checkRequired("operator", operator),
                        checkRequired("partialApprovalCapable", partialApprovalCapable),
                        checkRequired("pinCapability", pinCapability),
                        checkRequired("type", type),
                        acceptorTerminalId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AsaPosTerminal = apply {
                if (validated) {
                    return@apply
                }

                attended()
                cardRetentionCapable()
                onPremise()
                operator().validate()
                partialApprovalCapable()
                pinCapability().validate()
                type().validate()
                acceptorTerminalId()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (attended.asKnown().isPresent) 1 else 0) +
                    (if (cardRetentionCapable.asKnown().isPresent) 1 else 0) +
                    (if (onPremise.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (partialApprovalCapable.asKnown().isPresent) 1 else 0) +
                    (pinCapability.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (acceptorTerminalId.asKnown().isPresent) 1 else 0)

            /** The person that is designated to swipe the card */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ADMINISTRATIVE = of("ADMINISTRATIVE")

                    @JvmField val CARDHOLDER = of("CARDHOLDER")

                    @JvmField val CARD_ACCEPTOR = of("CARD_ACCEPTOR")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADMINISTRATIVE -> Value.ADMINISTRATIVE
                        CARDHOLDER -> Value.CARDHOLDER
                        CARD_ACCEPTOR -> Value.CARD_ACCEPTOR
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADMINISTRATIVE -> Known.ADMINISTRATIVE
                        CARDHOLDER -> Known.CARDHOLDER
                        CARD_ACCEPTOR -> Known.CARD_ACCEPTOR
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Status of whether the POS is able to accept PINs */
            class PinCapability
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CAPABLE = of("CAPABLE")

                    @JvmField val INOPERATIVE = of("INOPERATIVE")

                    @JvmField val NOT_CAPABLE = of("NOT_CAPABLE")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

                    @JvmStatic fun of(value: String) = PinCapability(JsonField.of(value))
                }

                /** An enum containing [PinCapability]'s known values. */
                enum class Known {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                }

                /**
                 * An enum containing [PinCapability]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PinCapability] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                    /**
                     * An enum member indicating that [PinCapability] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CAPABLE -> Value.CAPABLE
                        INOPERATIVE -> Value.INOPERATIVE
                        NOT_CAPABLE -> Value.NOT_CAPABLE
                        UNSPECIFIED -> Value.UNSPECIFIED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CAPABLE -> Known.CAPABLE
                        INOPERATIVE -> Known.INOPERATIVE
                        NOT_CAPABLE -> Known.NOT_CAPABLE
                        UNSPECIFIED -> Known.UNSPECIFIED
                        else -> throw LithicInvalidDataException("Unknown PinCapability: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): PinCapability = apply {
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

                    return other is PinCapability && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** POS Type */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ADMINISTRATIVE = of("ADMINISTRATIVE")

                    @JvmField val ATM = of("ATM")

                    @JvmField val AUTHORIZATION = of("AUTHORIZATION")

                    @JvmField val COUPON_MACHINE = of("COUPON_MACHINE")

                    @JvmField val DIAL_TERMINAL = of("DIAL_TERMINAL")

                    @JvmField val ECOMMERCE = of("ECOMMERCE")

                    @JvmField val ECR = of("ECR")

                    @JvmField val FUEL_MACHINE = of("FUEL_MACHINE")

                    @JvmField val HOME_TERMINAL = of("HOME_TERMINAL")

                    @JvmField val MICR = of("MICR")

                    @JvmField val OFF_PREMISE = of("OFF_PREMISE")

                    @JvmField val PAYMENT = of("PAYMENT")

                    @JvmField val PDA = of("PDA")

                    @JvmField val PHONE = of("PHONE")

                    @JvmField val POINT = of("POINT")

                    @JvmField val POS_TERMINAL = of("POS_TERMINAL")

                    @JvmField val PUBLIC_UTILITY = of("PUBLIC_UTILITY")

                    @JvmField val SELF_SERVICE = of("SELF_SERVICE")

                    @JvmField val TELEVISION = of("TELEVISION")

                    @JvmField val TELLER = of("TELLER")

                    @JvmField val TRAVELERS_CHECK_MACHINE = of("TRAVELERS_CHECK_MACHINE")

                    @JvmField val VENDING = of("VENDING")

                    @JvmField val VOICE = of("VOICE")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ADMINISTRATIVE,
                    ATM,
                    AUTHORIZATION,
                    COUPON_MACHINE,
                    DIAL_TERMINAL,
                    ECOMMERCE,
                    ECR,
                    FUEL_MACHINE,
                    HOME_TERMINAL,
                    MICR,
                    OFF_PREMISE,
                    PAYMENT,
                    PDA,
                    PHONE,
                    POINT,
                    POS_TERMINAL,
                    PUBLIC_UTILITY,
                    SELF_SERVICE,
                    TELEVISION,
                    TELLER,
                    TRAVELERS_CHECK_MACHINE,
                    VENDING,
                    VOICE,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADMINISTRATIVE,
                    ATM,
                    AUTHORIZATION,
                    COUPON_MACHINE,
                    DIAL_TERMINAL,
                    ECOMMERCE,
                    ECR,
                    FUEL_MACHINE,
                    HOME_TERMINAL,
                    MICR,
                    OFF_PREMISE,
                    PAYMENT,
                    PDA,
                    PHONE,
                    POINT,
                    POS_TERMINAL,
                    PUBLIC_UTILITY,
                    SELF_SERVICE,
                    TELEVISION,
                    TELLER,
                    TRAVELERS_CHECK_MACHINE,
                    VENDING,
                    VOICE,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADMINISTRATIVE -> Value.ADMINISTRATIVE
                        ATM -> Value.ATM
                        AUTHORIZATION -> Value.AUTHORIZATION
                        COUPON_MACHINE -> Value.COUPON_MACHINE
                        DIAL_TERMINAL -> Value.DIAL_TERMINAL
                        ECOMMERCE -> Value.ECOMMERCE
                        ECR -> Value.ECR
                        FUEL_MACHINE -> Value.FUEL_MACHINE
                        HOME_TERMINAL -> Value.HOME_TERMINAL
                        MICR -> Value.MICR
                        OFF_PREMISE -> Value.OFF_PREMISE
                        PAYMENT -> Value.PAYMENT
                        PDA -> Value.PDA
                        PHONE -> Value.PHONE
                        POINT -> Value.POINT
                        POS_TERMINAL -> Value.POS_TERMINAL
                        PUBLIC_UTILITY -> Value.PUBLIC_UTILITY
                        SELF_SERVICE -> Value.SELF_SERVICE
                        TELEVISION -> Value.TELEVISION
                        TELLER -> Value.TELLER
                        TRAVELERS_CHECK_MACHINE -> Value.TRAVELERS_CHECK_MACHINE
                        VENDING -> Value.VENDING
                        VOICE -> Value.VOICE
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADMINISTRATIVE -> Known.ADMINISTRATIVE
                        ATM -> Known.ATM
                        AUTHORIZATION -> Known.AUTHORIZATION
                        COUPON_MACHINE -> Known.COUPON_MACHINE
                        DIAL_TERMINAL -> Known.DIAL_TERMINAL
                        ECOMMERCE -> Known.ECOMMERCE
                        ECR -> Known.ECR
                        FUEL_MACHINE -> Known.FUEL_MACHINE
                        HOME_TERMINAL -> Known.HOME_TERMINAL
                        MICR -> Known.MICR
                        OFF_PREMISE -> Known.OFF_PREMISE
                        PAYMENT -> Known.PAYMENT
                        PDA -> Known.PDA
                        PHONE -> Known.PHONE
                        POINT -> Known.POINT
                        POS_TERMINAL -> Known.POS_TERMINAL
                        PUBLIC_UTILITY -> Known.PUBLIC_UTILITY
                        SELF_SERVICE -> Known.SELF_SERVICE
                        TELEVISION -> Known.TELEVISION
                        TELLER -> Known.TELLER
                        TRAVELERS_CHECK_MACHINE -> Known.TRAVELERS_CHECK_MACHINE
                        VENDING -> Known.VENDING
                        VOICE -> Known.VOICE
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AsaPosTerminal &&
                    attended == other.attended &&
                    cardRetentionCapable == other.cardRetentionCapable &&
                    onPremise == other.onPremise &&
                    operator == other.operator &&
                    partialApprovalCapable == other.partialApprovalCapable &&
                    pinCapability == other.pinCapability &&
                    type == other.type &&
                    acceptorTerminalId == other.acceptorTerminalId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    attended,
                    cardRetentionCapable,
                    onPremise,
                    operator,
                    partialApprovalCapable,
                    pinCapability,
                    type,
                    acceptorTerminalId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AsaPosTerminal{attended=$attended, cardRetentionCapable=$cardRetentionCapable, onPremise=$onPremise, operator=$operator, partialApprovalCapable=$partialApprovalCapable, pinCapability=$pinCapability, type=$type, acceptorTerminalId=$acceptorTerminalId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pos &&
                entryMode == other.entryMode &&
                terminal == other.terminal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(entryMode, terminal, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pos{entryMode=$entryMode, terminal=$terminal, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AsaRequestWebhookEvent &&
            token == other.token &&
            acquirerFee == other.acquirerFee &&
            amount == other.amount &&
            authorizationAmount == other.authorizationAmount &&
            avs == other.avs &&
            card == other.card &&
            cardholderCurrency == other.cardholderCurrency &&
            cashAmount == other.cashAmount &&
            created == other.created &&
            merchant == other.merchant &&
            merchantAmount == other.merchantAmount &&
            merchantCurrency == other.merchantCurrency &&
            settledAmount == other.settledAmount &&
            status == other.status &&
            transactionInitiator == other.transactionInitiator &&
            accountType == other.accountType &&
            cardholderAuthentication == other.cardholderAuthentication &&
            cashback == other.cashback &&
            conversionRate == other.conversionRate &&
            eventToken == other.eventToken &&
            fleetInfo == other.fleetInfo &&
            latestChallenge == other.latestChallenge &&
            network == other.network &&
            networkRiskScore == other.networkRiskScore &&
            networkSpecificData == other.networkSpecificData &&
            pos == other.pos &&
            tokenInfo == other.tokenInfo &&
            ttl == other.ttl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            acquirerFee,
            amount,
            authorizationAmount,
            avs,
            card,
            cardholderCurrency,
            cashAmount,
            created,
            merchant,
            merchantAmount,
            merchantCurrency,
            settledAmount,
            status,
            transactionInitiator,
            accountType,
            cardholderAuthentication,
            cashback,
            conversionRate,
            eventToken,
            fleetInfo,
            latestChallenge,
            network,
            networkRiskScore,
            networkSpecificData,
            pos,
            tokenInfo,
            ttl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AsaRequestWebhookEvent{token=$token, acquirerFee=$acquirerFee, amount=$amount, authorizationAmount=$authorizationAmount, avs=$avs, card=$card, cardholderCurrency=$cardholderCurrency, cashAmount=$cashAmount, created=$created, merchant=$merchant, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, settledAmount=$settledAmount, status=$status, transactionInitiator=$transactionInitiator, accountType=$accountType, cardholderAuthentication=$cardholderAuthentication, cashback=$cashback, conversionRate=$conversionRate, eventToken=$eventToken, fleetInfo=$fleetInfo, latestChallenge=$latestChallenge, network=$network, networkRiskScore=$networkRiskScore, networkSpecificData=$networkSpecificData, pos=$pos, tokenInfo=$tokenInfo, ttl=$ttl, additionalProperties=$additionalProperties}"
}
