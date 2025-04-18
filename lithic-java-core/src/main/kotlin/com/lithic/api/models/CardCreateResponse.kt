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

/** Card details with potentially PCI sensitive information for Enterprise customers */
class CardCreateResponse
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val funding: JsonField<FundingAccount>,
    private val lastFour: JsonField<String>,
    private val pinStatus: JsonField<PinStatus>,
    private val spendLimit: JsonField<Long>,
    private val spendLimitDuration: JsonField<SpendLimitDuration>,
    private val state: JsonField<State>,
    private val type: JsonField<Type>,
    private val authRuleTokens: JsonField<List<String>>,
    private val cardholderCurrency: JsonField<String>,
    private val cvv: JsonField<String>,
    private val digitalCardArtToken: JsonField<String>,
    private val expMonth: JsonField<String>,
    private val expYear: JsonField<String>,
    private val hostname: JsonField<String>,
    private val memo: JsonField<String>,
    private val pan: JsonField<String>,
    private val pendingCommands: JsonField<List<String>>,
    private val productId: JsonField<String>,
    private val replacementFor: JsonField<String>,
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
        funding: JsonField<FundingAccount> = JsonMissing.of(),
        @JsonProperty("last_four") @ExcludeMissing lastFour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin_status")
        @ExcludeMissing
        pinStatus: JsonField<PinStatus> = JsonMissing.of(),
        @JsonProperty("spend_limit") @ExcludeMissing spendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        authRuleTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cvv") @ExcludeMissing cvv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_month") @ExcludeMissing expMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_year") @ExcludeMissing expYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hostname") @ExcludeMissing hostname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan") @ExcludeMissing pan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_commands")
        @ExcludeMissing
        pendingCommands: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replacement_for")
        @ExcludeMissing
        replacementFor: JsonField<String> = JsonMissing.of(),
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
        cardholderCurrency,
        cvv,
        digitalCardArtToken,
        expMonth,
        expYear,
        hostname,
        memo,
        pan,
        pendingCommands,
        productId,
        replacementFor,
        mutableMapOf(),
    )

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
    fun funding(): FundingAccount = funding.getRequired("funding")

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
    fun pinStatus(): PinStatus = pinStatus.getRequired("pin_status")

    /**
     * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
     * Transaction requests above the spend limit will be declined.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimit(): Long = spendLimit.getRequired("spend_limit")

    /**
     * Spend limit duration
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimitDuration(): SpendLimitDuration =
        spendLimitDuration.getRequired("spend_limit_duration")

    /**
     * Card state values: _ `CLOSED` - Card will no longer approve authorizations. Closing a card
     * cannot be undone. _ `OPEN` - Card will approve authorizations (if they match card and account
     * parameters). _ `PAUSED` - Card will decline authorizations, but can be resumed at a later
     * time. _ `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     * provisioned pending manufacturing and fulfillment. Cards in this state can accept
     * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     * physical card itself is present. \* `PENDING_ACTIVATION` - At regular intervals, cards of
     * type `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     * updated to state `PENDING_ACTIVATION`. Similar to `PENDING_FULFILLMENT`, cards in this state
     * can be used for e-commerce transactions or can be added to mobile wallets. API clients should
     * update the card's state to `OPEN` only after the cardholder confirms receipt of the card. In
     * sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * Card types: _ `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
     * wallet like Apple Pay or Google Pay (if the card program is digital wallet-enabled). _
     * `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding, credit,
     * ATM, PIN debit, chip/EMV, NFC and magstripe functionality. _ `SINGLE_USE` - Card is closed
     * upon first successful authorization. _ `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to
     * the first merchant that successfully authorizes the card. _ `UNLOCKED` - _[Deprecated]_
     * Similar behavior to VIRTUAL cards, please use VIRTUAL instead. _ `DIGITAL_WALLET` -
     * _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

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
     * 3-character alphabetic ISO 4217 code for the currency of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderCurrency(): Optional<String> =
        cardholderCurrency.getOptional("cardholder_currency")

    /**
     * Three digit cvv printed on the back of the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cvv(): Optional<String> = cvv.getOptional("cvv")

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
     * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to have
     * PAN returned as a field in production. Please contact support@lithic.com for questions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pan(): Optional<String> = pan.getOptional("pan")

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
    @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<FundingAccount> = funding

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
    @JsonProperty("pin_status") @ExcludeMissing fun _pinStatus(): JsonField<PinStatus> = pinStatus

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
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * Returns the raw JSON value of [cvv].
     *
     * Unlike [cvv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cvv") @ExcludeMissing fun _cvv(): JsonField<String> = cvv

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
     * Returns the raw JSON value of [pan].
     *
     * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

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
         * Returns a mutable builder for constructing an instance of [CardCreateResponse].
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

    /** A builder for [CardCreateResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardProgramToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var funding: JsonField<FundingAccount>? = null
        private var lastFour: JsonField<String>? = null
        private var pinStatus: JsonField<PinStatus>? = null
        private var spendLimit: JsonField<Long>? = null
        private var spendLimitDuration: JsonField<SpendLimitDuration>? = null
        private var state: JsonField<State>? = null
        private var type: JsonField<Type>? = null
        private var authRuleTokens: JsonField<MutableList<String>>? = null
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var cvv: JsonField<String> = JsonMissing.of()
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<String> = JsonMissing.of()
        private var expYear: JsonField<String> = JsonMissing.of()
        private var hostname: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var pan: JsonField<String> = JsonMissing.of()
        private var pendingCommands: JsonField<MutableList<String>>? = null
        private var productId: JsonField<String> = JsonMissing.of()
        private var replacementFor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardCreateResponse: CardCreateResponse) = apply {
            token = cardCreateResponse.token
            accountToken = cardCreateResponse.accountToken
            cardProgramToken = cardCreateResponse.cardProgramToken
            created = cardCreateResponse.created
            funding = cardCreateResponse.funding
            lastFour = cardCreateResponse.lastFour
            pinStatus = cardCreateResponse.pinStatus
            spendLimit = cardCreateResponse.spendLimit
            spendLimitDuration = cardCreateResponse.spendLimitDuration
            state = cardCreateResponse.state
            type = cardCreateResponse.type
            authRuleTokens = cardCreateResponse.authRuleTokens.map { it.toMutableList() }
            cardholderCurrency = cardCreateResponse.cardholderCurrency
            cvv = cardCreateResponse.cvv
            digitalCardArtToken = cardCreateResponse.digitalCardArtToken
            expMonth = cardCreateResponse.expMonth
            expYear = cardCreateResponse.expYear
            hostname = cardCreateResponse.hostname
            memo = cardCreateResponse.memo
            pan = cardCreateResponse.pan
            pendingCommands = cardCreateResponse.pendingCommands.map { it.toMutableList() }
            productId = cardCreateResponse.productId
            replacementFor = cardCreateResponse.replacementFor
            additionalProperties = cardCreateResponse.additionalProperties.toMutableMap()
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
        fun funding(funding: FundingAccount) = funding(JsonField.of(funding))

        /**
         * Sets [Builder.funding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.funding] with a well-typed [FundingAccount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun funding(funding: JsonField<FundingAccount>) = apply { this.funding = funding }

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
        fun pinStatus(pinStatus: PinStatus) = pinStatus(JsonField.of(pinStatus))

        /**
         * Sets [Builder.pinStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinStatus] with a well-typed [PinStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pinStatus(pinStatus: JsonField<PinStatus>) = apply { this.pinStatus = pinStatus }

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

        /** Spend limit duration */
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
         * Card state values: _ `CLOSED` - Card will no longer approve authorizations. Closing a
         * card cannot be undone. _ `OPEN` - Card will approve authorizations (if they match card
         * and account parameters). _ `PAUSED` - Card will decline authorizations, but can be
         * resumed at a later time. _ `PENDING_FULFILLMENT` - The initial state for cards of type
         * `PHYSICAL`. The card is provisioned pending manufacturing and fulfillment. Cards in this
         * state can accept authorizations for e-commerce purchases, but not for "Card Present"
         * purchases where the physical card itself is present. \* `PENDING_ACTIVATION` - At regular
         * intervals, cards of type `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card
         * production warehouse and updated to state `PENDING_ACTIVATION`. Similar to
         * `PENDING_FULFILLMENT`, cards in this state can be used for e-commerce transactions or can
         * be added to mobile wallets. API clients should update the card's state to `OPEN` only
         * after the cardholder confirms receipt of the card. In sandbox, the same daily batch
         * fulfillment occurs, but no cards are actually manufactured.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Card types: _ `VIRTUAL` - Card will authorize at any merchant and can be added to a
         * digital wallet like Apple Pay or Google Pay (if the card program is digital
         * wallet-enabled). _ `PHYSICAL` - Manufactured and sent to the cardholder. We offer white
         * label branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. _
         * `SINGLE_USE` - Card is closed upon first successful authorization. _ `MERCHANT_LOCKED` -
         * _[Deprecated]_ Card is locked to the first merchant that successfully authorizes the
         * card. _ `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         * instead. _ `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please
         * use VIRTUAL instead.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CardCreateResponse].
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
        fun build(): CardCreateResponse =
            CardCreateResponse(
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
                cardholderCurrency,
                cvv,
                digitalCardArtToken,
                expMonth,
                expYear,
                hostname,
                memo,
                pan,
                (pendingCommands ?: JsonMissing.of()).map { it.toImmutable() },
                productId,
                replacementFor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardCreateResponse = apply {
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
        cardholderCurrency()
        cvv()
        digitalCardArtToken()
        expMonth()
        expYear()
        hostname()
        memo()
        pan()
        pendingCommands()
        productId()
        replacementFor()
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
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (if (cvv.asKnown().isPresent) 1 else 0) +
            (if (digitalCardArtToken.asKnown().isPresent) 1 else 0) +
            (if (expMonth.asKnown().isPresent) 1 else 0) +
            (if (expYear.asKnown().isPresent) 1 else 0) +
            (if (hostname.asKnown().isPresent) 1 else 0) +
            (if (memo.asKnown().isPresent) 1 else 0) +
            (if (pan.asKnown().isPresent) 1 else 0) +
            (pendingCommands.asKnown().getOrNull()?.size ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (replacementFor.asKnown().isPresent) 1 else 0)

    /** Deprecated: Funding account for the card. */
    class FundingAccount
    private constructor(
        private val token: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val lastFour: JsonField<String>,
        private val state: JsonField<State>,
        private val type: JsonField<Type>,
        private val accountName: JsonField<String>,
        private val nickname: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("last_four")
            @ExcludeMissing
            lastFour: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("account_name")
            @ExcludeMissing
            accountName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        ) : this(token, created, lastFour, state, type, accountName, nickname, mutableMapOf())

        /**
         * A globally unique identifier for this FundingAccount.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * An RFC 3339 string representing when this funding source was added to the Lithic account.
         * This may be `null`. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * The last 4 digits of the account (e.g. bank account, debit card) associated with this
         * FundingAccount. This may be null.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastFour(): String = lastFour.getRequired("last_four")

        /**
         * State of funding source. Funding source states: _ `ENABLED` - The funding account is
         * available to use for card creation and transactions. _ `PENDING` - The funding account is
         * still being verified e.g. bank micro-deposits verification. \* `DELETED` - The founding
         * account has been deleted.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): State = state.getRequired("state")

        /**
         * Types of funding source: _ `DEPOSITORY_CHECKING` - Bank checking account. _
         * `DEPOSITORY_SAVINGS` - Bank savings account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Account name identifying the funding source. This may be `null`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountName(): Optional<String> = accountName.getOptional("account_name")

        /**
         * The nickname given to the `FundingAccount` or `null` if it has no nickname.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nickname(): Optional<String> = nickname.getOptional("nickname")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [lastFour].
         *
         * Unlike [lastFour], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [accountName].
         *
         * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /**
         * Returns the raw JSON value of [nickname].
         *
         * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

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
             * Returns a mutable builder for constructing an instance of [FundingAccount].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .created()
             * .lastFour()
             * .state()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FundingAccount]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var lastFour: JsonField<String>? = null
            private var state: JsonField<State>? = null
            private var type: JsonField<Type>? = null
            private var accountName: JsonField<String> = JsonMissing.of()
            private var nickname: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingAccount: FundingAccount) = apply {
                token = fundingAccount.token
                created = fundingAccount.created
                lastFour = fundingAccount.lastFour
                state = fundingAccount.state
                type = fundingAccount.type
                accountName = fundingAccount.accountName
                nickname = fundingAccount.nickname
                additionalProperties = fundingAccount.additionalProperties.toMutableMap()
            }

            /** A globally unique identifier for this FundingAccount. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * An RFC 3339 string representing when this funding source was added to the Lithic
             * account. This may be `null`. UTC time zone.
             */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * The last 4 digits of the account (e.g. bank account, debit card) associated with this
             * FundingAccount. This may be null.
             */
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
             * State of funding source. Funding source states: _ `ENABLED` - The funding account is
             * available to use for card creation and transactions. _ `PENDING` - The funding
             * account is still being verified e.g. bank micro-deposits verification. \* `DELETED` -
             * The founding account has been deleted.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /**
             * Types of funding source: _ `DEPOSITORY_CHECKING` - Bank checking account. _
             * `DEPOSITORY_SAVINGS` - Bank savings account.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Account name identifying the funding source. This may be `null`. */
            fun accountName(accountName: String) = accountName(JsonField.of(accountName))

            /**
             * Sets [Builder.accountName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
            fun nickname(nickname: String) = nickname(JsonField.of(nickname))

            /**
             * Sets [Builder.nickname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nickname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

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
             * Returns an immutable instance of [FundingAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .created()
             * .lastFour()
             * .state()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FundingAccount =
                FundingAccount(
                    checkRequired("token", token),
                    checkRequired("created", created),
                    checkRequired("lastFour", lastFour),
                    checkRequired("state", state),
                    checkRequired("type", type),
                    accountName,
                    nickname,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FundingAccount = apply {
            if (validated) {
                return@apply
            }

            token()
            created()
            lastFour()
            state().validate()
            type().validate()
            accountName()
            nickname()
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
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (lastFour.asKnown().isPresent) 1 else 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (accountName.asKnown().isPresent) 1 else 0) +
                (if (nickname.asKnown().isPresent) 1 else 0)

        /**
         * State of funding source. Funding source states: _ `ENABLED` - The funding account is
         * available to use for card creation and transactions. _ `PENDING` - The funding account is
         * still being verified e.g. bank micro-deposits verification. \* `DELETED` - The founding
         * account has been deleted.
         */
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

                @JvmField val DELETED = of("DELETED")

                @JvmField val ENABLED = of("ENABLED")

                @JvmField val PENDING = of("PENDING")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                DELETED,
                ENABLED,
                PENDING,
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
                DELETED,
                ENABLED,
                PENDING,
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
                    DELETED -> Value.DELETED
                    ENABLED -> Value.ENABLED
                    PENDING -> Value.PENDING
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
                    DELETED -> Known.DELETED
                    ENABLED -> Known.ENABLED
                    PENDING -> Known.PENDING
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

                return /* spotless:off */ other is State && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Types of funding source: _ `DEPOSITORY_CHECKING` - Bank checking account. _
         * `DEPOSITORY_SAVINGS` - Bank savings account.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEPOSITORY_CHECKING = of("DEPOSITORY_CHECKING")

                @JvmField val DEPOSITORY_SAVINGS = of("DEPOSITORY_SAVINGS")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DEPOSITORY_CHECKING,
                DEPOSITORY_SAVINGS,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEPOSITORY_CHECKING,
                DEPOSITORY_SAVINGS,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DEPOSITORY_CHECKING -> Value.DEPOSITORY_CHECKING
                    DEPOSITORY_SAVINGS -> Value.DEPOSITORY_SAVINGS
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
                    DEPOSITORY_CHECKING -> Known.DEPOSITORY_CHECKING
                    DEPOSITORY_SAVINGS -> Known.DEPOSITORY_SAVINGS
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is FundingAccount && token == other.token && created == other.created && lastFour == other.lastFour && state == other.state && type == other.type && accountName == other.accountName && nickname == other.nickname && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, created, lastFour, state, type, accountName, nickname, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FundingAccount{token=$token, created=$created, lastFour=$lastFour, state=$state, type=$type, accountName=$accountName, nickname=$nickname, additionalProperties=$additionalProperties}"
    }

    /**
     * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect attempts).
     */
    class PinStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OK = of("OK")

            @JvmField val BLOCKED = of("BLOCKED")

            @JvmField val NOT_SET = of("NOT_SET")

            @JvmStatic fun of(value: String) = PinStatus(JsonField.of(value))
        }

        /** An enum containing [PinStatus]'s known values. */
        enum class Known {
            OK,
            BLOCKED,
            NOT_SET,
        }

        /**
         * An enum containing [PinStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PinStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            BLOCKED,
            NOT_SET,
            /**
             * An enum member indicating that [PinStatus] was instantiated with an unknown value.
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
                OK -> Value.OK
                BLOCKED -> Value.BLOCKED
                NOT_SET -> Value.NOT_SET
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
                OK -> Known.OK
                BLOCKED -> Known.BLOCKED
                NOT_SET -> Known.NOT_SET
                else -> throw LithicInvalidDataException("Unknown PinStatus: $value")
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

        fun validate(): PinStatus = apply {
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

            return /* spotless:off */ other is PinStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Spend limit duration */
    class SpendLimitDuration
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

            @JvmField val ANNUALLY = of("ANNUALLY")

            @JvmField val FOREVER = of("FOREVER")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val TRANSACTION = of("TRANSACTION")

            @JvmField val DAILY = of("DAILY")

            @JvmStatic fun of(value: String) = SpendLimitDuration(JsonField.of(value))
        }

        /** An enum containing [SpendLimitDuration]'s known values. */
        enum class Known {
            ANNUALLY,
            FOREVER,
            MONTHLY,
            TRANSACTION,
            DAILY,
        }

        /**
         * An enum containing [SpendLimitDuration]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SpendLimitDuration] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNUALLY,
            FOREVER,
            MONTHLY,
            TRANSACTION,
            DAILY,
            /**
             * An enum member indicating that [SpendLimitDuration] was instantiated with an unknown
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
                ANNUALLY -> Value.ANNUALLY
                FOREVER -> Value.FOREVER
                MONTHLY -> Value.MONTHLY
                TRANSACTION -> Value.TRANSACTION
                DAILY -> Value.DAILY
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
                ANNUALLY -> Known.ANNUALLY
                FOREVER -> Known.FOREVER
                MONTHLY -> Known.MONTHLY
                TRANSACTION -> Known.TRANSACTION
                DAILY -> Known.DAILY
                else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
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

            return /* spotless:off */ other is SpendLimitDuration && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Card state values: _ `CLOSED` - Card will no longer approve authorizations. Closing a card
     * cannot be undone. _ `OPEN` - Card will approve authorizations (if they match card and account
     * parameters). _ `PAUSED` - Card will decline authorizations, but can be resumed at a later
     * time. _ `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     * provisioned pending manufacturing and fulfillment. Cards in this state can accept
     * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     * physical card itself is present. \* `PENDING_ACTIVATION` - At regular intervals, cards of
     * type `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     * updated to state `PENDING_ACTIVATION`. Similar to `PENDING_FULFILLMENT`, cards in this state
     * can be used for e-commerce transactions or can be added to mobile wallets. API clients should
     * update the card's state to `OPEN` only after the cardholder confirms receipt of the card. In
     * sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLOSED,
            OPEN,
            PAUSED,
            PENDING_ACTIVATION,
            PENDING_FULFILLMENT,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

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

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Card types: _ `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
     * wallet like Apple Pay or Google Pay (if the card program is digital wallet-enabled). _
     * `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding, credit,
     * ATM, PIN debit, chip/EMV, NFC and magstripe functionality. _ `SINGLE_USE` - Card is closed
     * upon first successful authorization. _ `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to
     * the first merchant that successfully authorizes the card. _ `UNLOCKED` - _[Deprecated]_
     * Similar behavior to VIRTUAL cards, please use VIRTUAL instead. _ `DIGITAL_WALLET` -
     * _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     */
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

            @JvmField val MERCHANT_LOCKED = of("MERCHANT_LOCKED")

            @JvmField val PHYSICAL = of("PHYSICAL")

            @JvmField val SINGLE_USE = of("SINGLE_USE")

            @JvmField val VIRTUAL = of("VIRTUAL")

            @JvmField val UNLOCKED = of("UNLOCKED")

            @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
            UNLOCKED,
            DIGITAL_WALLET,
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
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
            UNLOCKED,
            DIGITAL_WALLET,
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
                MERCHANT_LOCKED -> Value.MERCHANT_LOCKED
                PHYSICAL -> Value.PHYSICAL
                SINGLE_USE -> Value.SINGLE_USE
                VIRTUAL -> Value.VIRTUAL
                UNLOCKED -> Value.UNLOCKED
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
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
                MERCHANT_LOCKED -> Known.MERCHANT_LOCKED
                PHYSICAL -> Known.PHYSICAL
                SINGLE_USE -> Known.SINGLE_USE
                VIRTUAL -> Known.VIRTUAL
                UNLOCKED -> Known.UNLOCKED
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
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

        return /* spotless:off */ other is CardCreateResponse && token == other.token && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && created == other.created && funding == other.funding && lastFour == other.lastFour && pinStatus == other.pinStatus && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && type == other.type && authRuleTokens == other.authRuleTokens && cardholderCurrency == other.cardholderCurrency && cvv == other.cvv && digitalCardArtToken == other.digitalCardArtToken && expMonth == other.expMonth && expYear == other.expYear && hostname == other.hostname && memo == other.memo && pan == other.pan && pendingCommands == other.pendingCommands && productId == other.productId && replacementFor == other.replacementFor && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, cardProgramToken, created, funding, lastFour, pinStatus, spendLimit, spendLimitDuration, state, type, authRuleTokens, cardholderCurrency, cvv, digitalCardArtToken, expMonth, expYear, hostname, memo, pan, pendingCommands, productId, replacementFor, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardCreateResponse{token=$token, accountToken=$accountToken, cardProgramToken=$cardProgramToken, created=$created, funding=$funding, lastFour=$lastFour, pinStatus=$pinStatus, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, type=$type, authRuleTokens=$authRuleTokens, cardholderCurrency=$cardholderCurrency, cvv=$cvv, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, hostname=$hostname, memo=$memo, pan=$pan, pendingCommands=$pendingCommands, productId=$productId, replacementFor=$replacementFor, additionalProperties=$additionalProperties}"
}
