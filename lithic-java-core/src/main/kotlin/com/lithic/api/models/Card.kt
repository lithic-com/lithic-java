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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Card details with potentially PCI sensitive information for Enterprise customers */
class Card
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val funding: JsonField<NonPciCard.FundingAccount>,
    private val lastFour: JsonField<String>,
    private val pinStatus: JsonField<NonPciCard.PinStatus>,
    private val spendLimit: JsonField<Long>,
    private val spendLimitDuration: JsonField<SpendLimitDuration>,
    private val state: JsonField<NonPciCard.State>,
    private val type: JsonField<NonPciCard.Type>,
    private val authRuleTokens: JsonField<List<String>>,
    private val bulkOrderToken: JsonField<String>,
    private val cardholderCurrency: JsonField<String>,
    private val comment: JsonField<String>,
    private val digitalCardArtToken: JsonField<String>,
    private val expMonth: JsonField<String>,
    private val expYear: JsonField<String>,
    private val hostname: JsonField<String>,
    private val memo: JsonField<String>,
    private val networkProgramToken: JsonField<String>,
    private val pendingCommands: JsonField<List<String>>,
    private val productId: JsonField<String>,
    private val replacementFor: JsonField<String>,
    private val substatus: JsonField<NonPciCard.Substatus>,
    private val cvv: JsonField<String>,
    private val pan: JsonField<String>,
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
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("funding")
        @ExcludeMissing
        funding: JsonField<NonPciCard.FundingAccount> = JsonMissing.of(),
        @JsonProperty("last_four") @ExcludeMissing lastFour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin_status")
        @ExcludeMissing
        pinStatus: JsonField<NonPciCard.PinStatus> = JsonMissing.of(),
        @JsonProperty("spend_limit") @ExcludeMissing spendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        state: JsonField<NonPciCard.State> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<NonPciCard.Type> = JsonMissing.of(),
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        authRuleTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("bulk_order_token")
        @ExcludeMissing
        bulkOrderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_month") @ExcludeMissing expMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_year") @ExcludeMissing expYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostname") @ExcludeMissing hostname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_program_token")
        @ExcludeMissing
        networkProgramToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_commands")
        @ExcludeMissing
        pendingCommands: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replacement_for")
        @ExcludeMissing
        replacementFor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("substatus")
        @ExcludeMissing
        substatus: JsonField<NonPciCard.Substatus> = JsonMissing.of(),
        @JsonProperty("cvv") @ExcludeMissing cvv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan") @ExcludeMissing pan: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        cardProgramToken,
        created,
        funding,
        lastFour,
        pinStatus,
        spendLimit,
        spendLimitDuration,
        state,
        type,
        authRuleTokens,
        bulkOrderToken,
        cardholderCurrency,
        comment,
        digitalCardArtToken,
        expMonth,
        expYear,
        hostname,
        memo,
        networkProgramToken,
        pendingCommands,
        productId,
        replacementFor,
        substatus,
        cvv,
        pan,
        mutableMapOf(),
    )

    fun toNonPciCard(): NonPciCard =
        NonPciCard.builder()
            .token(token)
            .accountToken(accountToken)
            .cardProgramToken(cardProgramToken)
            .created(created)
            .funding(funding)
            .lastFour(lastFour)
            .pinStatus(pinStatus)
            .spendLimit(spendLimit)
            .spendLimitDuration(spendLimitDuration)
            .state(state)
            .type(type)
            .authRuleTokens(authRuleTokens)
            .bulkOrderToken(bulkOrderToken)
            .cardholderCurrency(cardholderCurrency)
            .comment(comment)
            .digitalCardArtToken(digitalCardArtToken)
            .expMonth(expMonth)
            .expYear(expYear)
            .hostname(hostname)
            .memo(memo)
            .networkProgramToken(networkProgramToken)
            .pendingCommands(pendingCommands)
            .productId(productId)
            .replacementFor(replacementFor)
            .substatus(substatus)
            .build()

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Globally unique identifier for the account to which the card belongs.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Globally unique identifier for the card program on which the card exists.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /**
     * An RFC 3339 timestamp for when the card was created. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Deprecated: Funding account for the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun funding(): NonPciCard.FundingAccount = funding.getRequired("funding")

    /**
     * Last four digits of the card number.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /**
     * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect attempts).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pinStatus(): NonPciCard.PinStatus = pinStatus.getRequired("pin_status")

    /**
     * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
     * Transaction requests above the spend limit will be declined.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimit(): Long = spendLimit.getRequired("spend_limit")

    /**
     * Spend limit duration values:
     * * `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
     * * `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
     * * `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month. To
     *   support recurring monthly payments, which can occur on different day every month, the time
     *   window we consider for monthly velocity starts 6 days after the current calendar date one
     *   month prior.
     * * `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
     *   under the spend limit.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimitDuration(): SpendLimitDuration =
        spendLimitDuration.getRequired("spend_limit_duration")

    /**
     * Card state values: * `CLOSED` - Card will no longer approve authorizations. Closing a card
     * cannot be undone. * `OPEN` - Card will approve authorizations (if they match card and account
     * parameters). * `PAUSED` - Card will decline authorizations, but can be resumed at a later
     * time. * `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     * provisioned pending manufacturing and fulfillment. Cards in this state can accept
     * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     * physical card itself is present. * `PENDING_ACTIVATION` - At regular intervals, cards of type
     * `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     * updated to state `PENDING_ACTIVATION`. Similar to `PENDING_FULFILLMENT`, cards in this state
     * can be used for e-commerce transactions or can be added to mobile wallets. API clients should
     * update the card's state to `OPEN` only after the cardholder confirms receipt of the card. In
     * sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): NonPciCard.State = state.getRequired("state")

    /**
     * Card types: * `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
     * wallet like Apple Pay or Google Pay (if the card program is digital wallet-enabled). *
     * `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding, credit,
     * ATM, PIN debit, chip/EMV, NFC and magstripe functionality. * `SINGLE_USE` - Card is closed
     * upon first successful authorization. * `MERCHANT_LOCKED` - *[Deprecated]* Card is locked to
     * the first merchant that successfully authorizes the card. * `UNLOCKED` - *[Deprecated]*
     * Similar behavior to VIRTUAL cards, please use VIRTUAL instead. * `DIGITAL_WALLET` -
     * *[Deprecated]* Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): NonPciCard.Type = type.getRequired("type")

    /**
     * List of identifiers for the Auth Rule(s) that are applied on the card. This field is
     * deprecated and will no longer be populated in the `Card` object. The key will be removed from
     * the schema in a future release. Use the `/auth_rules` endpoints to fetch Auth Rule
     * information instead.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun authRuleTokens(): Optional<List<String>> = authRuleTokens.getOptional("auth_rule_tokens")

    /**
     * Globally unique identifier for the bulk order associated with this card. Only applicable to
     * physical cards that are part of a bulk shipment
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bulkOrderToken(): Optional<String> = bulkOrderToken.getOptional("bulk_order_token")

    /**
     * 3-character alphabetic ISO 4217 code for the currency of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderCurrency(): Optional<String> =
        cardholderCurrency.getOptional("cardholder_currency")

    /**
     * Additional context or information related to the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * Specifies the digital card art to be displayed in the user's digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalCardArtToken(): Optional<String> =
        digitalCardArtToken.getOptional("digital_card_art_token")

    /**
     * Two digit (MM) expiry month.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expMonth(): Optional<String> = expMonth.getOptional("exp_month")

    /**
     * Four digit (yyyy) expiry year.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expYear(): Optional<String> = expYear.getOptional("exp_year")

    /**
     * Hostname of card's locked merchant (will be empty if not applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostname(): Optional<String> = hostname.getOptional("hostname")

    /**
     * Friendly name to identify the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = memo.getOptional("memo")

    /**
     * Globally unique identifier for the card's network program. Null if the card is not associated
     * with a network program. Currently applicable to Visa cards participating in Account Level
     * Management only
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkProgramToken(): Optional<String> =
        networkProgramToken.getOptional("network_program_token")

    /**
     * Indicates if there are offline PIN changes pending card interaction with an offline PIN
     * terminal. Possible commands are: CHANGE_PIN, UNBLOCK_PIN. Applicable only to cards issued in
     * markets supporting offline PINs.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingCommands(): Optional<List<String>> = pendingCommands.getOptional("pending_commands")

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = productId.getOptional("product_id")

    /**
     * If the card is a replacement for another card, the globally unique identifier for the card
     * that was replaced.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replacementFor(): Optional<String> = replacementFor.getOptional("replacement_for")

    /**
     * Card state substatus values: * `LOST` - The physical card is no longer in the cardholder's
     * possession due to being lost or never received by the cardholder. * `COMPROMISED` - Card
     * information has been exposed, potentially leading to unauthorized access. This may involve
     * physical card theft, cloning, or online data breaches. * `DAMAGED` - The physical card is not
     * functioning properly, such as having chip failures or a demagnetized magnetic stripe. *
     * `END_USER_REQUEST` - The cardholder requested the closure of the card for reasons unrelated
     * to fraud or damage, such as switching to a different product or closing the account. *
     * `ISSUER_REQUEST` - The issuer closed the card for reasons unrelated to fraud or damage, such
     * as account inactivity, product or policy changes, or technology upgrades. * `NOT_ACTIVE` -
     * The card hasn’t had any transaction activity for a specified period, applicable to statuses
     * like `PAUSED` or `CLOSED`. * `SUSPICIOUS_ACTIVITY` - The card has one or more suspicious
     * transactions or activities that require review. This can involve prompting the cardholder to
     * confirm legitimate use or report confirmed fraud. * `INTERNAL_REVIEW` - The card is
     * temporarily paused pending further internal review. * `EXPIRED` - The card has expired and
     * has been closed without being reissued. * `UNDELIVERABLE` - The card cannot be delivered to
     * the cardholder and has been returned. * `OTHER` - The reason for the status does not fall
     * into any of the above categories. A comment can be provided to specify the reason.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun substatus(): Optional<NonPciCard.Substatus> = substatus.getOptional("substatus")

    /**
     * Three digit cvv printed on the back of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cvv(): Optional<String> = cvv.getOptional("cvv")

    /**
     * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to have
     * PAN returned as a field in production. Please contact support@lithic.com for questions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pan(): Optional<String> = pan.getOptional("pan")

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [funding].
     *
     * Unlike [funding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("funding")
    @ExcludeMissing
    fun _funding(): JsonField<NonPciCard.FundingAccount> = funding

    /**
     * Returns the raw JSON value of [lastFour].
     *
     * Unlike [lastFour], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

    /**
     * Returns the raw JSON value of [pinStatus].
     *
     * Unlike [pinStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin_status")
    @ExcludeMissing
    fun _pinStatus(): JsonField<NonPciCard.PinStatus> = pinStatus

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit(): JsonField<Long> = spendLimit

    /**
     * Returns the raw JSON value of [spendLimitDuration].
     *
     * Unlike [spendLimitDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("spend_limit_duration")
    @ExcludeMissing
    fun _spendLimitDuration(): JsonField<SpendLimitDuration> = spendLimitDuration

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<NonPciCard.State> = state

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<NonPciCard.Type> = type

    /**
     * Returns the raw JSON value of [authRuleTokens].
     *
     * Unlike [authRuleTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("auth_rule_tokens")
    @ExcludeMissing
    fun _authRuleTokens(): JsonField<List<String>> = authRuleTokens

    /**
     * Returns the raw JSON value of [bulkOrderToken].
     *
     * Unlike [bulkOrderToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bulk_order_token")
    @ExcludeMissing
    fun _bulkOrderToken(): JsonField<String> = bulkOrderToken

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
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [digitalCardArtToken].
     *
     * Unlike [digitalCardArtToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken(): JsonField<String> = digitalCardArtToken

    /**
     * Returns the raw JSON value of [expMonth].
     *
     * Unlike [expMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_month") @ExcludeMissing fun _expMonth(): JsonField<String> = expMonth

    /**
     * Returns the raw JSON value of [expYear].
     *
     * Unlike [expYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_year") @ExcludeMissing fun _expYear(): JsonField<String> = expYear

    /**
     * Returns the raw JSON value of [hostname].
     *
     * Unlike [hostname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hostname") @ExcludeMissing fun _hostname(): JsonField<String> = hostname

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [networkProgramToken].
     *
     * Unlike [networkProgramToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_program_token")
    @ExcludeMissing
    fun _networkProgramToken(): JsonField<String> = networkProgramToken

    /**
     * Returns the raw JSON value of [pendingCommands].
     *
     * Unlike [pendingCommands], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_commands")
    @ExcludeMissing
    fun _pendingCommands(): JsonField<List<String>> = pendingCommands

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [replacementFor].
     *
     * Unlike [replacementFor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replacement_for")
    @ExcludeMissing
    fun _replacementFor(): JsonField<String> = replacementFor

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("substatus")
    @ExcludeMissing
    fun _substatus(): JsonField<NonPciCard.Substatus> = substatus

    /**
     * Returns the raw JSON value of [cvv].
     *
     * Unlike [cvv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cvv") @ExcludeMissing fun _cvv(): JsonField<String> = cvv

    /**
     * Returns the raw JSON value of [pan].
     *
     * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

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
         * Returns a mutable builder for constructing an instance of [Card].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardProgramToken()
         * .created()
         * .funding()
         * .lastFour()
         * .pinStatus()
         * .spendLimit()
         * .spendLimitDuration()
         * .state()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Card]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardProgramToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var funding: JsonField<NonPciCard.FundingAccount>? = null
        private var lastFour: JsonField<String>? = null
        private var pinStatus: JsonField<NonPciCard.PinStatus>? = null
        private var spendLimit: JsonField<Long>? = null
        private var spendLimitDuration: JsonField<SpendLimitDuration>? = null
        private var state: JsonField<NonPciCard.State>? = null
        private var type: JsonField<NonPciCard.Type>? = null
        private var authRuleTokens: JsonField<MutableList<String>>? = null
        private var bulkOrderToken: JsonField<String> = JsonMissing.of()
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var comment: JsonField<String> = JsonMissing.of()
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<String> = JsonMissing.of()
        private var expYear: JsonField<String> = JsonMissing.of()
        private var hostname: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var networkProgramToken: JsonField<String> = JsonMissing.of()
        private var pendingCommands: JsonField<MutableList<String>>? = null
        private var productId: JsonField<String> = JsonMissing.of()
        private var replacementFor: JsonField<String> = JsonMissing.of()
        private var substatus: JsonField<NonPciCard.Substatus> = JsonMissing.of()
        private var cvv: JsonField<String> = JsonMissing.of()
        private var pan: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(card: Card) = apply {
            token = card.token
            accountToken = card.accountToken
            cardProgramToken = card.cardProgramToken
            created = card.created
            funding = card.funding
            lastFour = card.lastFour
            pinStatus = card.pinStatus
            spendLimit = card.spendLimit
            spendLimitDuration = card.spendLimitDuration
            state = card.state
            type = card.type
            authRuleTokens = card.authRuleTokens.map { it.toMutableList() }
            bulkOrderToken = card.bulkOrderToken
            cardholderCurrency = card.cardholderCurrency
            comment = card.comment
            digitalCardArtToken = card.digitalCardArtToken
            expMonth = card.expMonth
            expYear = card.expYear
            hostname = card.hostname
            memo = card.memo
            networkProgramToken = card.networkProgramToken
            pendingCommands = card.pendingCommands.map { it.toMutableList() }
            productId = card.productId
            replacementFor = card.replacementFor
            substatus = card.substatus
            cvv = card.cvv
            pan = card.pan
            additionalProperties = card.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account to which the card belongs. */
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

        /** Globally unique identifier for the card program on which the card exists. */
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

        /** An RFC 3339 timestamp for when the card was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Deprecated: Funding account for the card. */
        fun funding(funding: NonPciCard.FundingAccount) = funding(JsonField.of(funding))

        /**
         * Sets [Builder.funding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.funding] with a well-typed [NonPciCard.FundingAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun funding(funding: JsonField<NonPciCard.FundingAccount>) = apply {
            this.funding = funding
        }

        /** Last four digits of the card number. */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * Sets [Builder.lastFour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastFour] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /**
         * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
         * attempts).
         */
        fun pinStatus(pinStatus: NonPciCard.PinStatus) = pinStatus(JsonField.of(pinStatus))

        /**
         * Sets [Builder.pinStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinStatus] with a well-typed [NonPciCard.PinStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pinStatus(pinStatus: JsonField<NonPciCard.PinStatus>) = apply {
            this.pinStatus = pinStatus
        }

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined.
         */
        fun spendLimit(spendLimit: Long) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendLimit(spendLimit: JsonField<Long>) = apply { this.spendLimit = spendLimit }

        /**
         * Spend limit duration values:
         * * `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * * `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * * `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * * `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) =
            spendLimitDuration(JsonField.of(spendLimitDuration))

        /**
         * Sets [Builder.spendLimitDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimitDuration] with a well-typed
         * [SpendLimitDuration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values: * `CLOSED` - Card will no longer approve authorizations. Closing a
         * card cannot be undone. * `OPEN` - Card will approve authorizations (if they match card
         * and account parameters). * `PAUSED` - Card will decline authorizations, but can be
         * resumed at a later time. * `PENDING_FULFILLMENT` - The initial state for cards of type
         * `PHYSICAL`. The card is provisioned pending manufacturing and fulfillment. Cards in this
         * state can accept authorizations for e-commerce purchases, but not for "Card Present"
         * purchases where the physical card itself is present. * `PENDING_ACTIVATION` - At regular
         * intervals, cards of type `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card
         * production warehouse and updated to state `PENDING_ACTIVATION`. Similar to
         * `PENDING_FULFILLMENT`, cards in this state can be used for e-commerce transactions or can
         * be added to mobile wallets. API clients should update the card's state to `OPEN` only
         * after the cardholder confirms receipt of the card. In sandbox, the same daily batch
         * fulfillment occurs, but no cards are actually manufactured.
         */
        fun state(state: NonPciCard.State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [NonPciCard.State] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun state(state: JsonField<NonPciCard.State>) = apply { this.state = state }

        /**
         * Card types: * `VIRTUAL` - Card will authorize at any merchant and can be added to a
         * digital wallet like Apple Pay or Google Pay (if the card program is digital
         * wallet-enabled). * `PHYSICAL` - Manufactured and sent to the cardholder. We offer white
         * label branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. *
         * `SINGLE_USE` - Card is closed upon first successful authorization. * `MERCHANT_LOCKED` -
         * *[Deprecated]* Card is locked to the first merchant that successfully authorizes the
         * card. * `UNLOCKED` - *[Deprecated]* Similar behavior to VIRTUAL cards, please use VIRTUAL
         * instead. * `DIGITAL_WALLET` - *[Deprecated]* Similar behavior to VIRTUAL cards, please
         * use VIRTUAL instead.
         */
        fun type(type: NonPciCard.Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [NonPciCard.Type] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<NonPciCard.Type>) = apply { this.type = type }

        /**
         * List of identifiers for the Auth Rule(s) that are applied on the card. This field is
         * deprecated and will no longer be populated in the `Card` object. The key will be removed
         * from the schema in a future release. Use the `/auth_rules` endpoints to fetch Auth Rule
         * information instead.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /**
         * Sets [Builder.authRuleTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [authRuleTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addAuthRuleToken(authRuleToken: String) = apply {
            authRuleTokens =
                (authRuleTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authRuleTokens", it).add(authRuleToken)
                }
        }

        /**
         * Globally unique identifier for the bulk order associated with this card. Only applicable
         * to physical cards that are part of a bulk shipment
         */
        fun bulkOrderToken(bulkOrderToken: String?) =
            bulkOrderToken(JsonField.ofNullable(bulkOrderToken))

        /** Alias for calling [Builder.bulkOrderToken] with `bulkOrderToken.orElse(null)`. */
        fun bulkOrderToken(bulkOrderToken: Optional<String>) =
            bulkOrderToken(bulkOrderToken.getOrNull())

        /**
         * Sets [Builder.bulkOrderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bulkOrderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bulkOrderToken(bulkOrderToken: JsonField<String>) = apply {
            this.bulkOrderToken = bulkOrderToken
        }

        /** 3-character alphabetic ISO 4217 code for the currency of the cardholder. */
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

        /** Additional context or information related to the card. */
        fun comment(comment: String) = comment(JsonField.of(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /**
         * Specifies the digital card art to be displayed in the user's digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use.
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Sets [Builder.digitalCardArtToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalCardArtToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** Two digit (MM) expiry month. */
        fun expMonth(expMonth: String) = expMonth(JsonField.of(expMonth))

        /**
         * Sets [Builder.expMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expMonth] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

        /** Four digit (yyyy) expiry year. */
        fun expYear(expYear: String) = expYear(JsonField.of(expYear))

        /**
         * Sets [Builder.expYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expYear] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

        /** Hostname of card's locked merchant (will be empty if not applicable). */
        fun hostname(hostname: String) = hostname(JsonField.of(hostname))

        /**
         * Sets [Builder.hostname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hostname(hostname: JsonField<String>) = apply { this.hostname = hostname }

        /** Friendly name to identify the card. */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * Globally unique identifier for the card's network program. Null if the card is not
         * associated with a network program. Currently applicable to Visa cards participating in
         * Account Level Management only
         */
        fun networkProgramToken(networkProgramToken: String?) =
            networkProgramToken(JsonField.ofNullable(networkProgramToken))

        /**
         * Alias for calling [Builder.networkProgramToken] with `networkProgramToken.orElse(null)`.
         */
        fun networkProgramToken(networkProgramToken: Optional<String>) =
            networkProgramToken(networkProgramToken.getOrNull())

        /**
         * Sets [Builder.networkProgramToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkProgramToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkProgramToken(networkProgramToken: JsonField<String>) = apply {
            this.networkProgramToken = networkProgramToken
        }

        /**
         * Indicates if there are offline PIN changes pending card interaction with an offline PIN
         * terminal. Possible commands are: CHANGE_PIN, UNBLOCK_PIN. Applicable only to cards issued
         * in markets supporting offline PINs.
         */
        fun pendingCommands(pendingCommands: List<String>) =
            pendingCommands(JsonField.of(pendingCommands))

        /**
         * Sets [Builder.pendingCommands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingCommands] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingCommands(pendingCommands: JsonField<List<String>>) = apply {
            this.pendingCommands = pendingCommands.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [pendingCommands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPendingCommand(pendingCommand: String) = apply {
            pendingCommands =
                (pendingCommands ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pendingCommands", it).add(pendingCommand)
                }
        }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * If the card is a replacement for another card, the globally unique identifier for the
         * card that was replaced.
         */
        fun replacementFor(replacementFor: String?) =
            replacementFor(JsonField.ofNullable(replacementFor))

        /** Alias for calling [Builder.replacementFor] with `replacementFor.orElse(null)`. */
        fun replacementFor(replacementFor: Optional<String>) =
            replacementFor(replacementFor.getOrNull())

        /**
         * Sets [Builder.replacementFor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacementFor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replacementFor(replacementFor: JsonField<String>) = apply {
            this.replacementFor = replacementFor
        }

        /**
         * Card state substatus values: * `LOST` - The physical card is no longer in the
         * cardholder's possession due to being lost or never received by the cardholder. *
         * `COMPROMISED` - Card information has been exposed, potentially leading to unauthorized
         * access. This may involve physical card theft, cloning, or online data breaches. *
         * `DAMAGED` - The physical card is not functioning properly, such as having chip failures
         * or a demagnetized magnetic stripe. * `END_USER_REQUEST` - The cardholder requested the
         * closure of the card for reasons unrelated to fraud or damage, such as switching to a
         * different product or closing the account. * `ISSUER_REQUEST` - The issuer closed the card
         * for reasons unrelated to fraud or damage, such as account inactivity, product or policy
         * changes, or technology upgrades. * `NOT_ACTIVE` - The card hasn’t had any transaction
         * activity for a specified period, applicable to statuses like `PAUSED` or `CLOSED`. *
         * `SUSPICIOUS_ACTIVITY` - The card has one or more suspicious transactions or activities
         * that require review. This can involve prompting the cardholder to confirm legitimate use
         * or report confirmed fraud. * `INTERNAL_REVIEW` - The card is temporarily paused pending
         * further internal review. * `EXPIRED` - The card has expired and has been closed without
         * being reissued. * `UNDELIVERABLE` - The card cannot be delivered to the cardholder and
         * has been returned. * `OTHER` - The reason for the status does not fall into any of the
         * above categories. A comment can be provided to specify the reason.
         */
        fun substatus(substatus: NonPciCard.Substatus) = substatus(JsonField.of(substatus))

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed [NonPciCard.Substatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun substatus(substatus: JsonField<NonPciCard.Substatus>) = apply {
            this.substatus = substatus
        }

        /** Three digit cvv printed on the back of the card. */
        fun cvv(cvv: String) = cvv(JsonField.of(cvv))

        /**
         * Sets [Builder.cvv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cvv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

        /**
         * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to
         * have PAN returned as a field in production. Please contact support@lithic.com for
         * questions.
         */
        fun pan(pan: String) = pan(JsonField.of(pan))

        /**
         * Sets [Builder.pan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pan(pan: JsonField<String>) = apply { this.pan = pan }

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
         * Returns an immutable instance of [Card].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardProgramToken()
         * .created()
         * .funding()
         * .lastFour()
         * .pinStatus()
         * .spendLimit()
         * .spendLimitDuration()
         * .state()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Card =
            Card(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("cardProgramToken", cardProgramToken),
                checkRequired("created", created),
                checkRequired("funding", funding),
                checkRequired("lastFour", lastFour),
                checkRequired("pinStatus", pinStatus),
                checkRequired("spendLimit", spendLimit),
                checkRequired("spendLimitDuration", spendLimitDuration),
                checkRequired("state", state),
                checkRequired("type", type),
                (authRuleTokens ?: JsonMissing.of()).map { it.toImmutable() },
                bulkOrderToken,
                cardholderCurrency,
                comment,
                digitalCardArtToken,
                expMonth,
                expYear,
                hostname,
                memo,
                networkProgramToken,
                (pendingCommands ?: JsonMissing.of()).map { it.toImmutable() },
                productId,
                replacementFor,
                substatus,
                cvv,
                pan,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Card = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        cardProgramToken()
        created()
        funding().validate()
        lastFour()
        pinStatus().validate()
        spendLimit()
        spendLimitDuration().validate()
        state().validate()
        type().validate()
        authRuleTokens()
        bulkOrderToken()
        cardholderCurrency()
        comment()
        digitalCardArtToken()
        expMonth()
        expYear()
        hostname()
        memo()
        networkProgramToken()
        pendingCommands()
        productId()
        replacementFor()
        substatus().ifPresent { it.validate() }
        cvv()
        pan()
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
            (if (created.asKnown().isPresent) 1 else 0) +
            (funding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastFour.asKnown().isPresent) 1 else 0) +
            (pinStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (spendLimit.asKnown().isPresent) 1 else 0) +
            (spendLimitDuration.asKnown().getOrNull()?.validity() ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (authRuleTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (bulkOrderToken.asKnown().isPresent) 1 else 0) +
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (digitalCardArtToken.asKnown().isPresent) 1 else 0) +
            (if (expMonth.asKnown().isPresent) 1 else 0) +
            (if (expYear.asKnown().isPresent) 1 else 0) +
            (if (hostname.asKnown().isPresent) 1 else 0) +
            (if (memo.asKnown().isPresent) 1 else 0) +
            (if (networkProgramToken.asKnown().isPresent) 1 else 0) +
            (pendingCommands.asKnown().getOrNull()?.size ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (replacementFor.asKnown().isPresent) 1 else 0) +
            (substatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cvv.asKnown().isPresent) 1 else 0) +
            (if (pan.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Card &&
            token == other.token &&
            accountToken == other.accountToken &&
            cardProgramToken == other.cardProgramToken &&
            created == other.created &&
            funding == other.funding &&
            lastFour == other.lastFour &&
            pinStatus == other.pinStatus &&
            spendLimit == other.spendLimit &&
            spendLimitDuration == other.spendLimitDuration &&
            state == other.state &&
            type == other.type &&
            authRuleTokens == other.authRuleTokens &&
            bulkOrderToken == other.bulkOrderToken &&
            cardholderCurrency == other.cardholderCurrency &&
            comment == other.comment &&
            digitalCardArtToken == other.digitalCardArtToken &&
            expMonth == other.expMonth &&
            expYear == other.expYear &&
            hostname == other.hostname &&
            memo == other.memo &&
            networkProgramToken == other.networkProgramToken &&
            pendingCommands == other.pendingCommands &&
            productId == other.productId &&
            replacementFor == other.replacementFor &&
            substatus == other.substatus &&
            cvv == other.cvv &&
            pan == other.pan &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            cardProgramToken,
            created,
            funding,
            lastFour,
            pinStatus,
            spendLimit,
            spendLimitDuration,
            state,
            type,
            authRuleTokens,
            bulkOrderToken,
            cardholderCurrency,
            comment,
            digitalCardArtToken,
            expMonth,
            expYear,
            hostname,
            memo,
            networkProgramToken,
            pendingCommands,
            productId,
            replacementFor,
            substatus,
            cvv,
            pan,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Card{token=$token, accountToken=$accountToken, cardProgramToken=$cardProgramToken, created=$created, funding=$funding, lastFour=$lastFour, pinStatus=$pinStatus, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, type=$type, authRuleTokens=$authRuleTokens, bulkOrderToken=$bulkOrderToken, cardholderCurrency=$cardholderCurrency, comment=$comment, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, hostname=$hostname, memo=$memo, networkProgramToken=$networkProgramToken, pendingCommands=$pendingCommands, productId=$productId, replacementFor=$replacementFor, substatus=$substatus, cvv=$cvv, pan=$pan, additionalProperties=$additionalProperties}"
}
