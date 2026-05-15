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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The Auth Stream Access request payload that was sent to the ASA responder. */
class CardAuthorizationApprovalRequestWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val acquirerFee: JsonField<Long>,
    private val amount: JsonField<Long>,
    private val amounts: JsonField<CardAuthorization.Amounts>,
    private val authorizationAmount: JsonField<Long>,
    private val avs: JsonField<CardAuthorization.Avs>,
    private val card: JsonField<CardAuthorization.AsaRequestCard>,
    private val cardholderCurrency: JsonField<String>,
    private val cashAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val merchant: JsonField<CardAuthorization.TransactionMerchant>,
    private val merchantAmount: JsonField<Long>,
    private val merchantCurrency: JsonField<String>,
    private val serviceLocation: JsonField<CardAuthorization.ServiceLocation>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<CardAuthorization.AsaRequestStatus>,
    private val transactionInitiator: JsonField<CardAuthorization.TransactionInitiator>,
    private val accountType: JsonField<CardAuthorization.AccountType>,
    private val cardholderAuthentication: JsonField<CardholderAuthentication>,
    private val cashback: JsonField<Long>,
    private val conversionRate: JsonField<Double>,
    private val eventToken: JsonField<String>,
    private val fleetInfo: JsonField<CardAuthorization.AsaRequestFleetInfo>,
    private val latestChallenge: JsonField<CardAuthorization.LatestChallenge>,
    private val network: JsonField<CardAuthorization.Network>,
    private val networkRiskScore: JsonField<Long>,
    private val networkSpecificData: JsonField<CardAuthorization.AsaNetworkSpecificData>,
    private val pos: JsonField<CardAuthorization.Pos>,
    private val tokenInfo: JsonField<TokenInfo>,
    private val ttl: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquirer_fee")
        @ExcludeMissing
        acquirerFee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amounts")
        @ExcludeMissing
        amounts: JsonField<CardAuthorization.Amounts> = JsonMissing.of(),
        @JsonProperty("authorization_amount")
        @ExcludeMissing
        authorizationAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("avs")
        @ExcludeMissing
        avs: JsonField<CardAuthorization.Avs> = JsonMissing.of(),
        @JsonProperty("card")
        @ExcludeMissing
        card: JsonField<CardAuthorization.AsaRequestCard> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_amount") @ExcludeMissing cashAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("merchant")
        @ExcludeMissing
        merchant: JsonField<CardAuthorization.TransactionMerchant> = JsonMissing.of(),
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        merchantAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        merchantCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_location")
        @ExcludeMissing
        serviceLocation: JsonField<CardAuthorization.ServiceLocation> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<CardAuthorization.AsaRequestStatus> = JsonMissing.of(),
        @JsonProperty("transaction_initiator")
        @ExcludeMissing
        transactionInitiator: JsonField<CardAuthorization.TransactionInitiator> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        accountType: JsonField<CardAuthorization.AccountType> = JsonMissing.of(),
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
        fleetInfo: JsonField<CardAuthorization.AsaRequestFleetInfo> = JsonMissing.of(),
        @JsonProperty("latest_challenge")
        @ExcludeMissing
        latestChallenge: JsonField<CardAuthorization.LatestChallenge> = JsonMissing.of(),
        @JsonProperty("network")
        @ExcludeMissing
        network: JsonField<CardAuthorization.Network> = JsonMissing.of(),
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        networkRiskScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("network_specific_data")
        @ExcludeMissing
        networkSpecificData: JsonField<CardAuthorization.AsaNetworkSpecificData> = JsonMissing.of(),
        @JsonProperty("pos")
        @ExcludeMissing
        pos: JsonField<CardAuthorization.Pos> = JsonMissing.of(),
        @JsonProperty("token_info")
        @ExcludeMissing
        tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
        @JsonProperty("ttl") @ExcludeMissing ttl: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        acquirerFee,
        amount,
        amounts,
        authorizationAmount,
        avs,
        card,
        cardholderCurrency,
        cashAmount,
        created,
        merchant,
        merchantAmount,
        merchantCurrency,
        serviceLocation,
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
        eventType,
        mutableMapOf(),
    )

    fun toCardAuthorization(): CardAuthorization =
        CardAuthorization.builder()
            .token(token)
            .acquirerFee(acquirerFee)
            .amount(amount)
            .amounts(amounts)
            .authorizationAmount(authorizationAmount)
            .avs(avs)
            .card(card)
            .cardholderCurrency(cardholderCurrency)
            .cashAmount(cashAmount)
            .created(created)
            .merchant(merchant)
            .merchantAmount(merchantAmount)
            .merchantCurrency(merchantCurrency)
            .serviceLocation(serviceLocation)
            .settledAmount(settledAmount)
            .status(status)
            .transactionInitiator(transactionInitiator)
            .accountType(accountType)
            .cardholderAuthentication(cardholderAuthentication)
            .cashback(cashback)
            .conversionRate(conversionRate)
            .eventToken(eventToken)
            .fleetInfo(fleetInfo)
            .latestChallenge(latestChallenge)
            .network(network)
            .networkRiskScore(networkRiskScore)
            .networkSpecificData(networkSpecificData)
            .pos(pos)
            .tokenInfo(tokenInfo)
            .ttl(ttl)
            .build()

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
     * Deprecated, use `amounts`. Authorization amount of the transaction (in cents), including any
     * acquirer fees. The contents of this field are identical to `authorization_amount`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

    /**
     * Structured amounts for this authorization. The `cardholder` and `merchant` amounts reflect
     * the original network authorization values. For programs with hold adjustments enabled (e.g.,
     * automated fuel dispensers or tipping MCCs), the `hold` amount may exceed the `cardholder` and
     * `merchant` amounts to account for anticipated final transaction amounts such as tips or fuel
     * fill-ups
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amounts(): CardAuthorization.Amounts = amounts.getRequired("amounts")

    /**
     * Deprecated, use `amounts`. The base transaction amount (in cents) plus the acquirer fee
     * field. This is the amount the issuer should authorize against unless the issuer is paying the
     * acquirer fee on behalf of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun authorizationAmount(): Long = authorizationAmount.getRequired("authorization_amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avs(): CardAuthorization.Avs = avs.getRequired("avs")

    /**
     * Card object in ASA
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun card(): CardAuthorization.AsaRequestCard = card.getRequired("card")

    /**
     * Deprecated, use `amounts`. 3-character alphabetic ISO 4217 code for cardholder's billing
     * currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
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
     * Merchant information including full location details.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): CardAuthorization.TransactionMerchant = merchant.getRequired("merchant")

    /**
     * Deprecated, use `amounts`. The amount that the merchant will receive, denominated in
     * `merchant_currency` and in the smallest currency unit. Note the amount includes
     * `acquirer_fee`, similar to `authorization_amount`. It will be different from
     * `authorization_amount` if the merchant is taking payment in a different currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun merchantAmount(): Long = merchantAmount.getRequired("merchant_amount")

    /**
     * 3-character alphabetic ISO 4217 code for the local currency of the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

    /**
     * Where the cardholder received the service, when different from the card acceptor location.
     * This is populated from network data elements such as Mastercard DE-122 SE1 SF9-14 and Visa
     * F34 DS02.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceLocation(): Optional<CardAuthorization.ServiceLocation> =
        serviceLocation.getOptional("service_location")

    /**
     * Deprecated, use `amounts`. Amount (in cents) of the transaction that has been settled,
     * including any acquirer fees.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * The type of authorization request that this request is for. Note that `CREDIT_AUTHORIZATION`
     * and `FINANCIAL_CREDIT_AUTHORIZATION` is only available to users with credit decisioning via
     * ASA enabled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): CardAuthorization.AsaRequestStatus = status.getRequired("status")

    /**
     * The entity that initiated the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionInitiator(): CardAuthorization.TransactionInitiator =
        transactionInitiator.getRequired("transaction_initiator")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountType(): Optional<CardAuthorization.AccountType> =
        accountType.getOptional("account_type")

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
     * Deprecated, use `amounts`. If the transaction was requested in a currency other than the
     * settlement currency, this field will be populated to indicate the rate used to translate the
     * merchant_amount to the amount (i.e., `merchant_amount` x `conversion_rate` = `amount`). Note
     * that the `merchant_amount` is in the local currency and the amount is in the settlement
     * currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
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
    fun fleetInfo(): Optional<CardAuthorization.AsaRequestFleetInfo> =
        fleetInfo.getOptional("fleet_info")

    /**
     * The latest Authorization Challenge that was issued to the cardholder for this merchant.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestChallenge(): Optional<CardAuthorization.LatestChallenge> =
        latestChallenge.getOptional("latest_challenge")

    /**
     * Card network of the authorization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun network(): Optional<CardAuthorization.Network> = network.getOptional("network")

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
    fun networkSpecificData(): Optional<CardAuthorization.AsaNetworkSpecificData> =
        networkSpecificData.getOptional("network_specific_data")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pos(): Optional<CardAuthorization.Pos> = pos.getOptional("pos")

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
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

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
    @Deprecated("deprecated")
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [amounts].
     *
     * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amounts")
    @ExcludeMissing
    fun _amounts(): JsonField<CardAuthorization.Amounts> = amounts

    /**
     * Returns the raw JSON value of [authorizationAmount].
     *
     * Unlike [authorizationAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    fun _authorizationAmount(): JsonField<Long> = authorizationAmount

    /**
     * Returns the raw JSON value of [avs].
     *
     * Unlike [avs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avs") @ExcludeMissing fun _avs(): JsonField<CardAuthorization.Avs> = avs

    /**
     * Returns the raw JSON value of [card].
     *
     * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card")
    @ExcludeMissing
    fun _card(): JsonField<CardAuthorization.AsaRequestCard> = card

    /**
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
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
    @JsonProperty("merchant")
    @ExcludeMissing
    fun _merchant(): JsonField<CardAuthorization.TransactionMerchant> = merchant

    /**
     * Returns the raw JSON value of [merchantAmount].
     *
     * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("merchant_amount")
    @ExcludeMissing
    fun _merchantAmount(): JsonField<Long> = merchantAmount

    /**
     * Returns the raw JSON value of [merchantCurrency].
     *
     * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("merchant_currency")
    @ExcludeMissing
    fun _merchantCurrency(): JsonField<String> = merchantCurrency

    /**
     * Returns the raw JSON value of [serviceLocation].
     *
     * Unlike [serviceLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_location")
    @ExcludeMissing
    fun _serviceLocation(): JsonField<CardAuthorization.ServiceLocation> = serviceLocation

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<CardAuthorization.AsaRequestStatus> = status

    /**
     * Returns the raw JSON value of [transactionInitiator].
     *
     * Unlike [transactionInitiator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_initiator")
    @ExcludeMissing
    fun _transactionInitiator(): JsonField<CardAuthorization.TransactionInitiator> =
        transactionInitiator

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<CardAuthorization.AccountType> = accountType

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
    @Deprecated("deprecated")
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
    fun _fleetInfo(): JsonField<CardAuthorization.AsaRequestFleetInfo> = fleetInfo

    /**
     * Returns the raw JSON value of [latestChallenge].
     *
     * Unlike [latestChallenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest_challenge")
    @ExcludeMissing
    fun _latestChallenge(): JsonField<CardAuthorization.LatestChallenge> = latestChallenge

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network")
    @ExcludeMissing
    fun _network(): JsonField<CardAuthorization.Network> = network

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
    fun _networkSpecificData(): JsonField<CardAuthorization.AsaNetworkSpecificData> =
        networkSpecificData

    /**
     * Returns the raw JSON value of [pos].
     *
     * Unlike [pos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<CardAuthorization.Pos> = pos

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

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * [CardAuthorizationApprovalRequestWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .acquirerFee()
         * .amount()
         * .amounts()
         * .authorizationAmount()
         * .avs()
         * .card()
         * .cardholderCurrency()
         * .cashAmount()
         * .created()
         * .merchant()
         * .merchantAmount()
         * .merchantCurrency()
         * .serviceLocation()
         * .settledAmount()
         * .status()
         * .transactionInitiator()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAuthorizationApprovalRequestWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var acquirerFee: JsonField<Long>? = null
        private var amount: JsonField<Long>? = null
        private var amounts: JsonField<CardAuthorization.Amounts>? = null
        private var authorizationAmount: JsonField<Long>? = null
        private var avs: JsonField<CardAuthorization.Avs>? = null
        private var card: JsonField<CardAuthorization.AsaRequestCard>? = null
        private var cardholderCurrency: JsonField<String>? = null
        private var cashAmount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<CardAuthorization.TransactionMerchant>? = null
        private var merchantAmount: JsonField<Long>? = null
        private var merchantCurrency: JsonField<String>? = null
        private var serviceLocation: JsonField<CardAuthorization.ServiceLocation>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<CardAuthorization.AsaRequestStatus>? = null
        private var transactionInitiator: JsonField<CardAuthorization.TransactionInitiator>? = null
        private var accountType: JsonField<CardAuthorization.AccountType> = JsonMissing.of()
        private var cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of()
        private var cashback: JsonField<Long> = JsonMissing.of()
        private var conversionRate: JsonField<Double> = JsonMissing.of()
        private var eventToken: JsonField<String> = JsonMissing.of()
        private var fleetInfo: JsonField<CardAuthorization.AsaRequestFleetInfo> = JsonMissing.of()
        private var latestChallenge: JsonField<CardAuthorization.LatestChallenge> = JsonMissing.of()
        private var network: JsonField<CardAuthorization.Network> = JsonMissing.of()
        private var networkRiskScore: JsonField<Long> = JsonMissing.of()
        private var networkSpecificData: JsonField<CardAuthorization.AsaNetworkSpecificData> =
            JsonMissing.of()
        private var pos: JsonField<CardAuthorization.Pos> = JsonMissing.of()
        private var tokenInfo: JsonField<TokenInfo> = JsonMissing.of()
        private var ttl: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            cardAuthorizationApprovalRequestWebhookEvent:
                CardAuthorizationApprovalRequestWebhookEvent
        ) = apply {
            token = cardAuthorizationApprovalRequestWebhookEvent.token
            acquirerFee = cardAuthorizationApprovalRequestWebhookEvent.acquirerFee
            amount = cardAuthorizationApprovalRequestWebhookEvent.amount
            amounts = cardAuthorizationApprovalRequestWebhookEvent.amounts
            authorizationAmount = cardAuthorizationApprovalRequestWebhookEvent.authorizationAmount
            avs = cardAuthorizationApprovalRequestWebhookEvent.avs
            card = cardAuthorizationApprovalRequestWebhookEvent.card
            cardholderCurrency = cardAuthorizationApprovalRequestWebhookEvent.cardholderCurrency
            cashAmount = cardAuthorizationApprovalRequestWebhookEvent.cashAmount
            created = cardAuthorizationApprovalRequestWebhookEvent.created
            merchant = cardAuthorizationApprovalRequestWebhookEvent.merchant
            merchantAmount = cardAuthorizationApprovalRequestWebhookEvent.merchantAmount
            merchantCurrency = cardAuthorizationApprovalRequestWebhookEvent.merchantCurrency
            serviceLocation = cardAuthorizationApprovalRequestWebhookEvent.serviceLocation
            settledAmount = cardAuthorizationApprovalRequestWebhookEvent.settledAmount
            status = cardAuthorizationApprovalRequestWebhookEvent.status
            transactionInitiator = cardAuthorizationApprovalRequestWebhookEvent.transactionInitiator
            accountType = cardAuthorizationApprovalRequestWebhookEvent.accountType
            cardholderAuthentication =
                cardAuthorizationApprovalRequestWebhookEvent.cardholderAuthentication
            cashback = cardAuthorizationApprovalRequestWebhookEvent.cashback
            conversionRate = cardAuthorizationApprovalRequestWebhookEvent.conversionRate
            eventToken = cardAuthorizationApprovalRequestWebhookEvent.eventToken
            fleetInfo = cardAuthorizationApprovalRequestWebhookEvent.fleetInfo
            latestChallenge = cardAuthorizationApprovalRequestWebhookEvent.latestChallenge
            network = cardAuthorizationApprovalRequestWebhookEvent.network
            networkRiskScore = cardAuthorizationApprovalRequestWebhookEvent.networkRiskScore
            networkSpecificData = cardAuthorizationApprovalRequestWebhookEvent.networkSpecificData
            pos = cardAuthorizationApprovalRequestWebhookEvent.pos
            tokenInfo = cardAuthorizationApprovalRequestWebhookEvent.tokenInfo
            ttl = cardAuthorizationApprovalRequestWebhookEvent.ttl
            eventType = cardAuthorizationApprovalRequestWebhookEvent.eventType
            additionalProperties =
                cardAuthorizationApprovalRequestWebhookEvent.additionalProperties.toMutableMap()
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
         * Deprecated, use `amounts`. Authorization amount of the transaction (in cents), including
         * any acquirer fees. The contents of this field are identical to `authorization_amount`.
         */
        @Deprecated("deprecated") fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * Structured amounts for this authorization. The `cardholder` and `merchant` amounts
         * reflect the original network authorization values. For programs with hold adjustments
         * enabled (e.g., automated fuel dispensers or tipping MCCs), the `hold` amount may exceed
         * the `cardholder` and `merchant` amounts to account for anticipated final transaction
         * amounts such as tips or fuel fill-ups
         */
        fun amounts(amounts: CardAuthorization.Amounts) = amounts(JsonField.of(amounts))

        /**
         * Sets [Builder.amounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amounts] with a well-typed [CardAuthorization.Amounts]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun amounts(amounts: JsonField<CardAuthorization.Amounts>) = apply {
            this.amounts = amounts
        }

        /**
         * Deprecated, use `amounts`. The base transaction amount (in cents) plus the acquirer fee
         * field. This is the amount the issuer should authorize against unless the issuer is paying
         * the acquirer fee on behalf of the cardholder.
         */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(JsonField.of(authorizationAmount))

        /**
         * Sets [Builder.authorizationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: JsonField<Long>) = apply {
            this.authorizationAmount = authorizationAmount
        }

        fun avs(avs: CardAuthorization.Avs) = avs(JsonField.of(avs))

        /**
         * Sets [Builder.avs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avs] with a well-typed [CardAuthorization.Avs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avs(avs: JsonField<CardAuthorization.Avs>) = apply { this.avs = avs }

        /** Card object in ASA */
        fun card(card: CardAuthorization.AsaRequestCard) = card(JsonField.of(card))

        /**
         * Sets [Builder.card] to an arbitrary JSON value.
         *
         * You should usually call [Builder.card] with a well-typed
         * [CardAuthorization.AsaRequestCard] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun card(card: JsonField<CardAuthorization.AsaRequestCard>) = apply { this.card = card }

        /**
         * Deprecated, use `amounts`. 3-character alphabetic ISO 4217 code for cardholder's billing
         * currency.
         */
        @Deprecated("deprecated")
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /**
         * Sets [Builder.cardholderCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
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

        /** Merchant information including full location details. */
        fun merchant(merchant: CardAuthorization.TransactionMerchant) =
            merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed
         * [CardAuthorization.TransactionMerchant] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun merchant(merchant: JsonField<CardAuthorization.TransactionMerchant>) = apply {
            this.merchant = merchant
        }

        /**
         * Deprecated, use `amounts`. The amount that the merchant will receive, denominated in
         * `merchant_currency` and in the smallest currency unit. Note the amount includes
         * `acquirer_fee`, similar to `authorization_amount`. It will be different from
         * `authorization_amount` if the merchant is taking payment in a different currency.
         */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

        /**
         * Sets [Builder.merchantAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /** 3-character alphabetic ISO 4217 code for the local currency of the transaction. */
        @Deprecated("deprecated")
        fun merchantCurrency(merchantCurrency: String) =
            merchantCurrency(JsonField.of(merchantCurrency))

        /**
         * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Where the cardholder received the service, when different from the card acceptor
         * location. This is populated from network data elements such as Mastercard DE-122 SE1
         * SF9-14 and Visa F34 DS02.
         */
        fun serviceLocation(serviceLocation: CardAuthorization.ServiceLocation?) =
            serviceLocation(JsonField.ofNullable(serviceLocation))

        /** Alias for calling [Builder.serviceLocation] with `serviceLocation.orElse(null)`. */
        fun serviceLocation(serviceLocation: Optional<CardAuthorization.ServiceLocation>) =
            serviceLocation(serviceLocation.getOrNull())

        /**
         * Sets [Builder.serviceLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceLocation] with a well-typed
         * [CardAuthorization.ServiceLocation] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun serviceLocation(serviceLocation: JsonField<CardAuthorization.ServiceLocation>) = apply {
            this.serviceLocation = serviceLocation
        }

        /**
         * Deprecated, use `amounts`. Amount (in cents) of the transaction that has been settled,
         * including any acquirer fees.
         */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Sets [Builder.settledAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * The type of authorization request that this request is for. Note that
         * `CREDIT_AUTHORIZATION` and `FINANCIAL_CREDIT_AUTHORIZATION` is only available to users
         * with credit decisioning via ASA enabled.
         */
        fun status(status: CardAuthorization.AsaRequestStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed
         * [CardAuthorization.AsaRequestStatus] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<CardAuthorization.AsaRequestStatus>) = apply {
            this.status = status
        }

        /** The entity that initiated the transaction. */
        fun transactionInitiator(transactionInitiator: CardAuthorization.TransactionInitiator) =
            transactionInitiator(JsonField.of(transactionInitiator))

        /**
         * Sets [Builder.transactionInitiator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionInitiator] with a well-typed
         * [CardAuthorization.TransactionInitiator] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun transactionInitiator(
            transactionInitiator: JsonField<CardAuthorization.TransactionInitiator>
        ) = apply { this.transactionInitiator = transactionInitiator }

        fun accountType(accountType: CardAuthorization.AccountType) =
            accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed
         * [CardAuthorization.AccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountType(accountType: JsonField<CardAuthorization.AccountType>) = apply {
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
         * Deprecated, use `amounts`. If the transaction was requested in a currency other than the
         * settlement currency, this field will be populated to indicate the rate used to translate
         * the merchant_amount to the amount (i.e., `merchant_amount` x `conversion_rate` =
         * `amount`). Note that the `merchant_amount` is in the local currency and the amount is in
         * the settlement currency.
         */
        @Deprecated("deprecated")
        fun conversionRate(conversionRate: Double) = conversionRate(JsonField.of(conversionRate))

        /**
         * Sets [Builder.conversionRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
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
        fun fleetInfo(fleetInfo: CardAuthorization.AsaRequestFleetInfo?) =
            fleetInfo(JsonField.ofNullable(fleetInfo))

        /** Alias for calling [Builder.fleetInfo] with `fleetInfo.orElse(null)`. */
        fun fleetInfo(fleetInfo: Optional<CardAuthorization.AsaRequestFleetInfo>) =
            fleetInfo(fleetInfo.getOrNull())

        /**
         * Sets [Builder.fleetInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleetInfo] with a well-typed
         * [CardAuthorization.AsaRequestFleetInfo] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun fleetInfo(fleetInfo: JsonField<CardAuthorization.AsaRequestFleetInfo>) = apply {
            this.fleetInfo = fleetInfo
        }

        /**
         * The latest Authorization Challenge that was issued to the cardholder for this merchant.
         */
        fun latestChallenge(latestChallenge: CardAuthorization.LatestChallenge) =
            latestChallenge(JsonField.of(latestChallenge))

        /**
         * Sets [Builder.latestChallenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestChallenge] with a well-typed
         * [CardAuthorization.LatestChallenge] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun latestChallenge(latestChallenge: JsonField<CardAuthorization.LatestChallenge>) = apply {
            this.latestChallenge = latestChallenge
        }

        /** Card network of the authorization. */
        fun network(network: CardAuthorization.Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [CardAuthorization.Network]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun network(network: JsonField<CardAuthorization.Network>) = apply {
            this.network = network
        }

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
        fun networkSpecificData(networkSpecificData: CardAuthorization.AsaNetworkSpecificData?) =
            networkSpecificData(JsonField.ofNullable(networkSpecificData))

        /**
         * Alias for calling [Builder.networkSpecificData] with `networkSpecificData.orElse(null)`.
         */
        fun networkSpecificData(
            networkSpecificData: Optional<CardAuthorization.AsaNetworkSpecificData>
        ) = networkSpecificData(networkSpecificData.getOrNull())

        /**
         * Sets [Builder.networkSpecificData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkSpecificData] with a well-typed
         * [CardAuthorization.AsaNetworkSpecificData] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun networkSpecificData(
            networkSpecificData: JsonField<CardAuthorization.AsaNetworkSpecificData>
        ) = apply { this.networkSpecificData = networkSpecificData }

        fun pos(pos: CardAuthorization.Pos) = pos(JsonField.of(pos))

        /**
         * Sets [Builder.pos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pos] with a well-typed [CardAuthorization.Pos] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pos(pos: JsonField<CardAuthorization.Pos>) = apply { this.pos = pos }

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

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [CardAuthorizationApprovalRequestWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .acquirerFee()
         * .amount()
         * .amounts()
         * .authorizationAmount()
         * .avs()
         * .card()
         * .cardholderCurrency()
         * .cashAmount()
         * .created()
         * .merchant()
         * .merchantAmount()
         * .merchantCurrency()
         * .serviceLocation()
         * .settledAmount()
         * .status()
         * .transactionInitiator()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAuthorizationApprovalRequestWebhookEvent =
            CardAuthorizationApprovalRequestWebhookEvent(
                checkRequired("token", token),
                checkRequired("acquirerFee", acquirerFee),
                checkRequired("amount", amount),
                checkRequired("amounts", amounts),
                checkRequired("authorizationAmount", authorizationAmount),
                checkRequired("avs", avs),
                checkRequired("card", card),
                checkRequired("cardholderCurrency", cardholderCurrency),
                checkRequired("cashAmount", cashAmount),
                checkRequired("created", created),
                checkRequired("merchant", merchant),
                checkRequired("merchantAmount", merchantAmount),
                checkRequired("merchantCurrency", merchantCurrency),
                checkRequired("serviceLocation", serviceLocation),
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
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CardAuthorizationApprovalRequestWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        acquirerFee()
        amount()
        amounts().validate()
        authorizationAmount()
        avs().validate()
        card().validate()
        cardholderCurrency()
        cashAmount()
        created()
        merchant().validate()
        merchantAmount()
        merchantCurrency()
        serviceLocation().ifPresent { it.validate() }
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
        eventType().validate()
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
            (amounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (authorizationAmount.asKnown().isPresent) 1 else 0) +
            (avs.asKnown().getOrNull()?.validity() ?: 0) +
            (card.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (if (cashAmount.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
            (if (merchantAmount.asKnown().isPresent) 1 else 0) +
            (if (merchantCurrency.asKnown().isPresent) 1 else 0) +
            (serviceLocation.asKnown().getOrNull()?.validity() ?: 0) +
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
            (if (ttl.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField
            val CARD_AUTHORIZATION_APPROVAL_REQUEST = of("card_authorization.approval_request")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CARD_AUTHORIZATION_APPROVAL_REQUEST
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD_AUTHORIZATION_APPROVAL_REQUEST,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                CARD_AUTHORIZATION_APPROVAL_REQUEST -> Value.CARD_AUTHORIZATION_APPROVAL_REQUEST
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
                CARD_AUTHORIZATION_APPROVAL_REQUEST -> Known.CARD_AUTHORIZATION_APPROVAL_REQUEST
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardAuthorizationApprovalRequestWebhookEvent &&
            token == other.token &&
            acquirerFee == other.acquirerFee &&
            amount == other.amount &&
            amounts == other.amounts &&
            authorizationAmount == other.authorizationAmount &&
            avs == other.avs &&
            card == other.card &&
            cardholderCurrency == other.cardholderCurrency &&
            cashAmount == other.cashAmount &&
            created == other.created &&
            merchant == other.merchant &&
            merchantAmount == other.merchantAmount &&
            merchantCurrency == other.merchantCurrency &&
            serviceLocation == other.serviceLocation &&
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
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            acquirerFee,
            amount,
            amounts,
            authorizationAmount,
            avs,
            card,
            cardholderCurrency,
            cashAmount,
            created,
            merchant,
            merchantAmount,
            merchantCurrency,
            serviceLocation,
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
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardAuthorizationApprovalRequestWebhookEvent{token=$token, acquirerFee=$acquirerFee, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, avs=$avs, card=$card, cardholderCurrency=$cardholderCurrency, cashAmount=$cashAmount, created=$created, merchant=$merchant, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, serviceLocation=$serviceLocation, settledAmount=$settledAmount, status=$status, transactionInitiator=$transactionInitiator, accountType=$accountType, cardholderAuthentication=$cardholderAuthentication, cashback=$cashback, conversionRate=$conversionRate, eventToken=$eventToken, fleetInfo=$fleetInfo, latestChallenge=$latestChallenge, network=$network, networkRiskScore=$networkRiskScore, networkSpecificData=$networkSpecificData, pos=$pos, tokenInfo=$tokenInfo, ttl=$ttl, eventType=$eventType, additionalProperties=$additionalProperties}"
}
