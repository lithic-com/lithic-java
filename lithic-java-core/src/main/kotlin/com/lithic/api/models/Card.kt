// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
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

@JsonDeserialize(builder = Card.Builder::class)
@NoAutoDetect
class Card
private constructor(
    private val accountToken: JsonField<String>,
    private val authRuleTokens: JsonField<List<String>>,
    private val cardProgramToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val cvv: JsonField<String>,
    private val digitalCardArtToken: JsonField<String>,
    private val expMonth: JsonField<String>,
    private val expYear: JsonField<String>,
    private val funding: JsonField<FundingAccount>,
    private val hostname: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val memo: JsonField<String>,
    private val pan: JsonField<String>,
    private val productId: JsonField<String>,
    private val spendLimit: JsonField<Long>,
    private val spendLimitDuration: JsonField<SpendLimitDuration>,
    private val state: JsonField<State>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account to which the card belongs. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** List of identifiers for the Auth Rule(s) that are applied on the card. */
    fun authRuleTokens(): Optional<List<String>> =
        Optional.ofNullable(authRuleTokens.getNullable("auth_rule_tokens"))

    /** Globally unique identifier for the card program on which the card exists. */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** An RFC 3339 timestamp for when the card was created. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Three digit cvv printed on the back of the card. */
    fun cvv(): Optional<String> = Optional.ofNullable(cvv.getNullable("cvv"))

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun digitalCardArtToken(): Optional<String> =
        Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

    /** Two digit (MM) expiry month. */
    fun expMonth(): Optional<String> = Optional.ofNullable(expMonth.getNullable("exp_month"))

    /** Four digit (yyyy) expiry year. */
    fun expYear(): Optional<String> = Optional.ofNullable(expYear.getNullable("exp_year"))

    fun funding(): FundingAccount = funding.getRequired("funding")

    /** Hostname of card’s locked merchant (will be empty if not applicable). */
    fun hostname(): Optional<String> = Optional.ofNullable(hostname.getNullable("hostname"))

    /** Last four digits of the card number. */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /**
     * Friendly name to identify the card. We recommend against using this field to store JSON data
     * as it can cause unexpected behavior.
     */
    fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

    /**
     * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to have
     * PAN returned as a field in production. Please contact
     * [support@lithic.com](mailto:support@lithic.com) for questions.
     */
    fun pan(): Optional<String> = Optional.ofNullable(pan.getNullable("pan"))

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

    /**
     * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
     * limit will be declined.
     */
    fun spendLimit(): Long = spendLimit.getRequired("spend_limit")

    /**
     * Spend limit duration values:
     * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
     * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
     * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month. To
     *   support recurring monthly payments, which can occur on different day every month, the time
     *   window we consider for monthly velocity starts 6 days after the current calendar date one
     *   month prior.
     * - `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
     *   under the spend limit.
     */
    fun spendLimitDuration(): SpendLimitDuration =
        spendLimitDuration.getRequired("spend_limit_duration")

    /**
     * Card state values:
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     *   provisioned pending manufacturing and fulfillment. Cards in this state can accept
     *   authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     *   physical card itself is present.
     * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
     *   `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     *   updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
     *   state can be used for e-commerce transactions. API clients should update the card's state
     *   to `OPEN` only after the cardholder confirms receipt of the card.
     *
     * In sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     */
    fun state(): State = state.getRequired("state")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * Card types:
     * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet like
     *   Apple Pay or Google Pay (if the card program is digital wallet-enabled).
     * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
     *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
     *   [lithic.com/contact](https://lithic.com/contact) for more information.
     * - `SINGLE_USE` - Card is closed upon first successful authorization.
     * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that successfully
     *   authorizes the card.
     */
    fun type(): Type = type.getRequired("type")

    /** Globally unique identifier for the account to which the card belongs. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** List of identifiers for the Auth Rule(s) that are applied on the card. */
    @JsonProperty("auth_rule_tokens") @ExcludeMissing fun _authRuleTokens() = authRuleTokens

    /** Globally unique identifier for the card program on which the card exists. */
    @JsonProperty("card_program_token") @ExcludeMissing fun _cardProgramToken() = cardProgramToken

    /** An RFC 3339 timestamp for when the card was created. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Three digit cvv printed on the back of the card. */
    @JsonProperty("cvv") @ExcludeMissing fun _cvv() = cvv

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken() = digitalCardArtToken

    /** Two digit (MM) expiry month. */
    @JsonProperty("exp_month") @ExcludeMissing fun _expMonth() = expMonth

    /** Four digit (yyyy) expiry year. */
    @JsonProperty("exp_year") @ExcludeMissing fun _expYear() = expYear

    @JsonProperty("funding") @ExcludeMissing fun _funding() = funding

    /** Hostname of card’s locked merchant (will be empty if not applicable). */
    @JsonProperty("hostname") @ExcludeMissing fun _hostname() = hostname

    /** Last four digits of the card number. */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

    /**
     * Friendly name to identify the card. We recommend against using this field to store JSON data
     * as it can cause unexpected behavior.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

    /**
     * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to have
     * PAN returned as a field in production. Please contact
     * [support@lithic.com](mailto:support@lithic.com) for questions.
     */
    @JsonProperty("pan") @ExcludeMissing fun _pan() = pan

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

    /**
     * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
     * limit will be declined.
     */
    @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit() = spendLimit

    /**
     * Spend limit duration values:
     * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
     * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
     * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month. To
     *   support recurring monthly payments, which can occur on different day every month, the time
     *   window we consider for monthly velocity starts 6 days after the current calendar date one
     *   month prior.
     * - `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
     *   under the spend limit.
     */
    @JsonProperty("spend_limit_duration")
    @ExcludeMissing
    fun _spendLimitDuration() = spendLimitDuration

    /**
     * Card state values:
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     *   provisioned pending manufacturing and fulfillment. Cards in this state can accept
     *   authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     *   physical card itself is present.
     * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
     *   `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     *   updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
     *   state can be used for e-commerce transactions. API clients should update the card's state
     *   to `OPEN` only after the cardholder confirms receipt of the card.
     *
     * In sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Card types:
     * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet like
     *   Apple Pay or Google Pay (if the card program is digital wallet-enabled).
     * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
     *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
     *   [lithic.com/contact](https://lithic.com/contact) for more information.
     * - `SINGLE_USE` - Card is closed upon first successful authorization.
     * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that successfully
     *   authorizes the card.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Card = apply {
        if (!validated) {
            accountToken()
            authRuleTokens()
            cardProgramToken()
            created()
            cvv()
            digitalCardArtToken()
            expMonth()
            expYear()
            funding().validate()
            hostname()
            lastFour()
            memo()
            pan()
            productId()
            spendLimit()
            spendLimitDuration()
            state()
            token()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Card &&
            this.accountToken == other.accountToken &&
            this.authRuleTokens == other.authRuleTokens &&
            this.cardProgramToken == other.cardProgramToken &&
            this.created == other.created &&
            this.cvv == other.cvv &&
            this.digitalCardArtToken == other.digitalCardArtToken &&
            this.expMonth == other.expMonth &&
            this.expYear == other.expYear &&
            this.funding == other.funding &&
            this.hostname == other.hostname &&
            this.lastFour == other.lastFour &&
            this.memo == other.memo &&
            this.pan == other.pan &&
            this.productId == other.productId &&
            this.spendLimit == other.spendLimit &&
            this.spendLimitDuration == other.spendLimitDuration &&
            this.state == other.state &&
            this.token == other.token &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountToken,
                    authRuleTokens,
                    cardProgramToken,
                    created,
                    cvv,
                    digitalCardArtToken,
                    expMonth,
                    expYear,
                    funding,
                    hostname,
                    lastFour,
                    memo,
                    pan,
                    productId,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    token,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Card{accountToken=$accountToken, authRuleTokens=$authRuleTokens, cardProgramToken=$cardProgramToken, created=$created, cvv=$cvv, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, funding=$funding, hostname=$hostname, lastFour=$lastFour, memo=$memo, pan=$pan, productId=$productId, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, token=$token, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var authRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var cardProgramToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cvv: JsonField<String> = JsonMissing.of()
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<String> = JsonMissing.of()
        private var expYear: JsonField<String> = JsonMissing.of()
        private var funding: JsonField<FundingAccount> = JsonMissing.of()
        private var hostname: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var pan: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var spendLimit: JsonField<Long> = JsonMissing.of()
        private var spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(card: Card) = apply {
            this.accountToken = card.accountToken
            this.authRuleTokens = card.authRuleTokens
            this.cardProgramToken = card.cardProgramToken
            this.created = card.created
            this.cvv = card.cvv
            this.digitalCardArtToken = card.digitalCardArtToken
            this.expMonth = card.expMonth
            this.expYear = card.expYear
            this.funding = card.funding
            this.hostname = card.hostname
            this.lastFour = card.lastFour
            this.memo = card.memo
            this.pan = card.pan
            this.productId = card.productId
            this.spendLimit = card.spendLimit
            this.spendLimitDuration = card.spendLimitDuration
            this.state = card.state
            this.token = card.token
            this.type = card.type
            additionalProperties(card.additionalProperties)
        }

        /** Globally unique identifier for the account to which the card belongs. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account to which the card belongs. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** List of identifiers for the Auth Rule(s) that are applied on the card. */
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /** List of identifiers for the Auth Rule(s) that are applied on the card. */
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens
        }

        /** Globally unique identifier for the card program on which the card exists. */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /** Globally unique identifier for the card program on which the card exists. */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /** An RFC 3339 timestamp for when the card was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** An RFC 3339 timestamp for when the card was created. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Three digit cvv printed on the back of the card. */
        fun cvv(cvv: String) = cvv(JsonField.of(cvv))

        /** Three digit cvv printed on the back of the card. */
        @JsonProperty("cvv")
        @ExcludeMissing
        fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** Two digit (MM) expiry month. */
        fun expMonth(expMonth: String) = expMonth(JsonField.of(expMonth))

        /** Two digit (MM) expiry month. */
        @JsonProperty("exp_month")
        @ExcludeMissing
        fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

        /** Four digit (yyyy) expiry year. */
        fun expYear(expYear: String) = expYear(JsonField.of(expYear))

        /** Four digit (yyyy) expiry year. */
        @JsonProperty("exp_year")
        @ExcludeMissing
        fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

        fun funding(funding: FundingAccount) = funding(JsonField.of(funding))

        @JsonProperty("funding")
        @ExcludeMissing
        fun funding(funding: JsonField<FundingAccount>) = apply { this.funding = funding }

        /** Hostname of card’s locked merchant (will be empty if not applicable). */
        fun hostname(hostname: String) = hostname(JsonField.of(hostname))

        /** Hostname of card’s locked merchant (will be empty if not applicable). */
        @JsonProperty("hostname")
        @ExcludeMissing
        fun hostname(hostname: JsonField<String>) = apply { this.hostname = hostname }

        /** Last four digits of the card number. */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /** Last four digits of the card number. */
        @JsonProperty("last_four")
        @ExcludeMissing
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /**
         * Friendly name to identify the card. We recommend against using this field to store JSON
         * data as it can cause unexpected behavior.
         */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /**
         * Friendly name to identify the card. We recommend against using this field to store JSON
         * data as it can cause unexpected behavior.
         */
        @JsonProperty("memo")
        @ExcludeMissing
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to
         * have PAN returned as a field in production. Please contact
         * [support@lithic.com](mailto:support@lithic.com) for questions.
         */
        fun pan(pan: String) = pan(JsonField.of(pan))

        /**
         * Primary Account Number (PAN) (i.e. the card number). Customers must be PCI compliant to
         * have PAN returned as a field in production. Please contact
         * [support@lithic.com](mailto:support@lithic.com) for questions.
         */
        @JsonProperty("pan")
        @ExcludeMissing
        fun pan(pan: JsonField<String>) = apply { this.pan = pan }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        @JsonProperty("product_id")
        @ExcludeMissing
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined.
         */
        fun spendLimit(spendLimit: Long) = spendLimit(JsonField.of(spendLimit))

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined.
         */
        @JsonProperty("spend_limit")
        @ExcludeMissing
        fun spendLimit(spendLimit: JsonField<Long>) = apply { this.spendLimit = spendLimit }

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) =
            spendLimitDuration(JsonField.of(spendLimitDuration))

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values:
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
         *   provisioned pending manufacturing and fulfillment. Cards in this state can accept
         *   authorizations for e-commerce purchases, but not for "Card Present" purchases where the
         *   physical card itself is present.
         * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
         *   `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
         *   updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
         *   state can be used for e-commerce transactions. API clients should update the card's
         *   state to `OPEN` only after the cardholder confirms receipt of the card.
         *
         * In sandbox, the same daily batch fulfillment occurs, but no cards are actually
         * manufactured.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Card state values:
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
         *   provisioned pending manufacturing and fulfillment. Cards in this state can accept
         *   authorizations for e-commerce purchases, but not for "Card Present" purchases where the
         *   physical card itself is present.
         * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
         *   `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
         *   updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
         *   state can be used for e-commerce transactions. API clients should update the card's
         *   state to `OPEN` only after the cardholder confirms receipt of the card.
         *
         * In sandbox, the same daily batch fulfillment occurs, but no cards are actually
         * manufactured.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Card types:
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         *   like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         *   [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `SINGLE_USE` - Card is closed upon first successful authorization.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         *   successfully authorizes the card.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Card types:
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         *   like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         *   [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `SINGLE_USE` - Card is closed upon first successful authorization.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         *   successfully authorizes the card.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): Card =
            Card(
                accountToken,
                authRuleTokens.map { it.toUnmodifiable() },
                cardProgramToken,
                created,
                cvv,
                digitalCardArtToken,
                expMonth,
                expYear,
                funding,
                hostname,
                lastFour,
                memo,
                pan,
                productId,
                spendLimit,
                spendLimitDuration,
                state,
                token,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = FundingAccount.Builder::class)
    @NoAutoDetect
    class FundingAccount
    private constructor(
        private val accountName: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val lastFour: JsonField<String>,
        private val nickname: JsonField<String>,
        private val state: JsonField<State>,
        private val token: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Account name identifying the funding source. This may be `null`. */
        fun accountName(): Optional<String> =
            Optional.ofNullable(accountName.getNullable("account_name"))

        /**
         * An RFC 3339 string representing when this funding source was added to the Lithic account.
         * This may be `null`. UTC time zone.
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * The last 4 digits of the account (e.g. bank account, debit card) associated with this
         * FundingAccount. This may be null.
         */
        fun lastFour(): String = lastFour.getRequired("last_four")

        /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
        fun nickname(): Optional<String> = Optional.ofNullable(nickname.getNullable("nickname"))

        /**
         * State of funding source.
         *
         * Funding source states:
         * - `ENABLED` - The funding account is available to use for card creation and transactions.
         * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
         *   verification.
         * - `DELETED` - The founding account has been deleted.
         */
        fun state(): State = state.getRequired("state")

        /** A globally unique identifier for this FundingAccount. */
        fun token(): String = token.getRequired("token")

        /**
         * Types of funding source:
         * - `DEPOSITORY_CHECKING` - Bank checking account.
         * - `DEPOSITORY_SAVINGS` - Bank savings account.
         */
        fun type(): Type = type.getRequired("type")

        /** Account name identifying the funding source. This may be `null`. */
        @JsonProperty("account_name") @ExcludeMissing fun _accountName() = accountName

        /**
         * An RFC 3339 string representing when this funding source was added to the Lithic account.
         * This may be `null`. UTC time zone.
         */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * The last 4 digits of the account (e.g. bank account, debit card) associated with this
         * FundingAccount. This may be null.
         */
        @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

        /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
        @JsonProperty("nickname") @ExcludeMissing fun _nickname() = nickname

        /**
         * State of funding source.
         *
         * Funding source states:
         * - `ENABLED` - The funding account is available to use for card creation and transactions.
         * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
         *   verification.
         * - `DELETED` - The founding account has been deleted.
         */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /** A globally unique identifier for this FundingAccount. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Types of funding source:
         * - `DEPOSITORY_CHECKING` - Bank checking account.
         * - `DEPOSITORY_SAVINGS` - Bank savings account.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FundingAccount = apply {
            if (!validated) {
                accountName()
                created()
                lastFour()
                nickname()
                state()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingAccount &&
                this.accountName == other.accountName &&
                this.created == other.created &&
                this.lastFour == other.lastFour &&
                this.nickname == other.nickname &&
                this.state == other.state &&
                this.token == other.token &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountName,
                        created,
                        lastFour,
                        nickname,
                        state,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FundingAccount{accountName=$accountName, created=$created, lastFour=$lastFour, nickname=$nickname, state=$state, token=$token, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountName: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastFour: JsonField<String> = JsonMissing.of()
            private var nickname: JsonField<String> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingAccount: FundingAccount) = apply {
                this.accountName = fundingAccount.accountName
                this.created = fundingAccount.created
                this.lastFour = fundingAccount.lastFour
                this.nickname = fundingAccount.nickname
                this.state = fundingAccount.state
                this.token = fundingAccount.token
                this.type = fundingAccount.type
                additionalProperties(fundingAccount.additionalProperties)
            }

            /** Account name identifying the funding source. This may be `null`. */
            fun accountName(accountName: String) = accountName(JsonField.of(accountName))

            /** Account name identifying the funding source. This may be `null`. */
            @JsonProperty("account_name")
            @ExcludeMissing
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /**
             * An RFC 3339 string representing when this funding source was added to the Lithic
             * account. This may be `null`. UTC time zone.
             */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * An RFC 3339 string representing when this funding source was added to the Lithic
             * account. This may be `null`. UTC time zone.
             */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * The last 4 digits of the account (e.g. bank account, debit card) associated with this
             * FundingAccount. This may be null.
             */
            fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

            /**
             * The last 4 digits of the account (e.g. bank account, debit card) associated with this
             * FundingAccount. This may be null.
             */
            @JsonProperty("last_four")
            @ExcludeMissing
            fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

            /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
            fun nickname(nickname: String) = nickname(JsonField.of(nickname))

            /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
            @JsonProperty("nickname")
            @ExcludeMissing
            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

            /**
             * State of funding source.
             *
             * Funding source states:
             * - `ENABLED` - The funding account is available to use for card creation and
             *   transactions.
             * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
             *   verification.
             * - `DELETED` - The founding account has been deleted.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * State of funding source.
             *
             * Funding source states:
             * - `ENABLED` - The funding account is available to use for card creation and
             *   transactions.
             * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
             *   verification.
             * - `DELETED` - The founding account has been deleted.
             */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<State>) = apply { this.state = state }

            /** A globally unique identifier for this FundingAccount. */
            fun token(token: String) = token(JsonField.of(token))

            /** A globally unique identifier for this FundingAccount. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Types of funding source:
             * - `DEPOSITORY_CHECKING` - Bank checking account.
             * - `DEPOSITORY_SAVINGS` - Bank savings account.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Types of funding source:
             * - `DEPOSITORY_CHECKING` - Bank checking account.
             * - `DEPOSITORY_SAVINGS` - Bank savings account.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): FundingAccount =
                FundingAccount(
                    accountName,
                    created,
                    lastFour,
                    nickname,
                    state,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class State
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is State && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DELETED = State(JsonField.of("DELETED"))

                @JvmField val ENABLED = State(JsonField.of("ENABLED"))

                @JvmField val PENDING = State(JsonField.of("PENDING"))

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            enum class Known {
                DELETED,
                ENABLED,
                PENDING,
            }

            enum class Value {
                DELETED,
                ENABLED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DELETED -> Value.DELETED
                    ENABLED -> Value.ENABLED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DELETED -> Known.DELETED
                    ENABLED -> Known.ENABLED
                    PENDING -> Known.PENDING
                    else -> throw LithicInvalidDataException("Unknown State: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DEPOSITORY_CHECKING = Type(JsonField.of("DEPOSITORY_CHECKING"))

                @JvmField val DEPOSITORY_SAVINGS = Type(JsonField.of("DEPOSITORY_SAVINGS"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                DEPOSITORY_CHECKING,
                DEPOSITORY_SAVINGS,
            }

            enum class Value {
                DEPOSITORY_CHECKING,
                DEPOSITORY_SAVINGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DEPOSITORY_CHECKING -> Value.DEPOSITORY_CHECKING
                    DEPOSITORY_SAVINGS -> Value.DEPOSITORY_SAVINGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DEPOSITORY_CHECKING -> Known.DEPOSITORY_CHECKING
                    DEPOSITORY_SAVINGS -> Known.DEPOSITORY_SAVINGS
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CLOSED = State(JsonField.of("CLOSED"))

            @JvmField val OPEN = State(JsonField.of("OPEN"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

            @JvmField val PENDING_ACTIVATION = State(JsonField.of("PENDING_ACTIVATION"))

            @JvmField val PENDING_FULFILLMENT = State(JsonField.of("PENDING_FULFILLMENT"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            CLOSED,
            OPEN,
            PAUSED,
            PENDING_ACTIVATION,
            PENDING_FULFILLMENT,
        }

        enum class Value {
            CLOSED,
            OPEN,
            PAUSED,
            PENDING_ACTIVATION,
            PENDING_FULFILLMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CLOSED -> Value.CLOSED
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
                PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                PENDING_FULFILLMENT -> Value.PENDING_FULFILLMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CLOSED -> Known.CLOSED
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
                PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                PENDING_FULFILLMENT -> Known.PENDING_FULFILLMENT
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MERCHANT_LOCKED = Type(JsonField.of("MERCHANT_LOCKED"))

            @JvmField val PHYSICAL = Type(JsonField.of("PHYSICAL"))

            @JvmField val SINGLE_USE = Type(JsonField.of("SINGLE_USE"))

            @JvmField val VIRTUAL = Type(JsonField.of("VIRTUAL"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
        }

        enum class Value {
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MERCHANT_LOCKED -> Value.MERCHANT_LOCKED
                PHYSICAL -> Value.PHYSICAL
                SINGLE_USE -> Value.SINGLE_USE
                VIRTUAL -> Value.VIRTUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MERCHANT_LOCKED -> Known.MERCHANT_LOCKED
                PHYSICAL -> Known.PHYSICAL
                SINGLE_USE -> Known.SINGLE_USE
                VIRTUAL -> Known.VIRTUAL
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
