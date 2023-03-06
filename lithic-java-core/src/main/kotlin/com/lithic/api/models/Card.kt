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

@JsonDeserialize(builder = Card.Builder::class)
@NoAutoDetect
class Card
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val cvv: JsonField<String>,
    private val funding: JsonField<FundingSource>,
    private val expMonth: JsonField<String>,
    private val expYear: JsonField<String>,
    private val hostname: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val memo: JsonField<String>,
    private val pan: JsonField<String>,
    private val spendLimit: JsonField<Long>,
    private val spendLimitDuration: JsonField<SpendLimitDuration>,
    private val state: JsonField<State>,
    private val authRuleTokens: JsonField<List<String>>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val digitalCardArtToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** An ISO 8601 timestamp for when the card was created. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Three digit cvv printed on the back of the card. */
    fun cvv(): Optional<String> = Optional.ofNullable(cvv.getNullable("cvv"))

    fun funding(): FundingSource = funding.getRequired("funding")

    /** Two digit (MM) expiry month. */
    fun expMonth(): Optional<String> = Optional.ofNullable(expMonth.getNullable("exp_month"))

    /** Four digit (yyyy) expiry year. */
    fun expYear(): Optional<String> = Optional.ofNullable(expYear.getNullable("exp_year"))

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
     * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
     * limit will be declined.
     */
    fun spendLimit(): Long = spendLimit.getRequired("spend_limit")

    /**
     * Spend limit duration values:
     *
     * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar year.
     * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
     * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
     * Month is calculated as this calendar date one month prior.
     * - `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
     * under the spend limit.
     */
    fun spendLimitDuration(): SpendLimitDuration =
        spendLimitDuration.getRequired("spend_limit_duration")

    /**
     * Card state values:
     *
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     * provisioned pending manufacturing and fulfillment. Cards in this state can accept
     * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     * physical card itself is present.
     * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
     * `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     * updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this state
     * can be used for e-commerce transactions. API clients should update the card's state to `OPEN`
     * only after the cardholder confirms receipt of the card.
     *
     * In sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     */
    fun state(): State = state.getRequired("state")

    /** List of identifiers for the Auth Rule(s) that are applied on the card. */
    fun authRuleTokens(): Optional<List<String>> =
        Optional.ofNullable(authRuleTokens.getNullable("auth_rule_tokens"))

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * Card types:
     *
     * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet like
     * Apple Pay or Google Pay (if the card program is digital wallet-enabled).
     * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
     * credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that successfully
     * authorizes the card.
     * - `SINGLE_USE` - _[Deprecated]_ Card is closed upon first successful authorization.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
     * .
     */
    fun digitalCardArtToken(): Optional<String> =
        Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

    /** An ISO 8601 timestamp for when the card was created. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Three digit cvv printed on the back of the card. */
    @JsonProperty("cvv") @ExcludeMissing fun _cvv() = cvv

    @JsonProperty("funding") @ExcludeMissing fun _funding() = funding

    /** Two digit (MM) expiry month. */
    @JsonProperty("exp_month") @ExcludeMissing fun _expMonth() = expMonth

    /** Four digit (yyyy) expiry year. */
    @JsonProperty("exp_year") @ExcludeMissing fun _expYear() = expYear

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
     * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
     * limit will be declined.
     */
    @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit() = spendLimit

    /**
     * Spend limit duration values:
     *
     * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar year.
     * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
     * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
     * Month is calculated as this calendar date one month prior.
     * - `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
     * under the spend limit.
     */
    @JsonProperty("spend_limit_duration")
    @ExcludeMissing
    fun _spendLimitDuration() = spendLimitDuration

    /**
     * Card state values:
     *
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
     * provisioned pending manufacturing and fulfillment. Cards in this state can accept
     * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
     * physical card itself is present.
     * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
     * `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
     * updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this state
     * can be used for e-commerce transactions. API clients should update the card's state to `OPEN`
     * only after the cardholder confirms receipt of the card.
     *
     * In sandbox, the same daily batch fulfillment occurs, but no cards are actually manufactured.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** List of identifiers for the Auth Rule(s) that are applied on the card. */
    @JsonProperty("auth_rule_tokens") @ExcludeMissing fun _authRuleTokens() = authRuleTokens

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Card types:
     *
     * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet like
     * Apple Pay or Google Pay (if the card program is digital wallet-enabled).
     * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
     * credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that successfully
     * authorizes the card.
     * - `SINGLE_USE` - _[Deprecated]_ Card is closed upon first successful authorization.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
     * .
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken() = digitalCardArtToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            created()
            cvv()
            funding().validate()
            expMonth()
            expYear()
            hostname()
            lastFour()
            memo()
            pan()
            spendLimit()
            spendLimitDuration()
            state()
            authRuleTokens()
            token()
            type()
            digitalCardArtToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Card &&
            this.created == other.created &&
            this.cvv == other.cvv &&
            this.funding == other.funding &&
            this.expMonth == other.expMonth &&
            this.expYear == other.expYear &&
            this.hostname == other.hostname &&
            this.lastFour == other.lastFour &&
            this.memo == other.memo &&
            this.pan == other.pan &&
            this.spendLimit == other.spendLimit &&
            this.spendLimitDuration == other.spendLimitDuration &&
            this.state == other.state &&
            this.authRuleTokens == other.authRuleTokens &&
            this.token == other.token &&
            this.type == other.type &&
            this.digitalCardArtToken == other.digitalCardArtToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    created,
                    cvv,
                    funding,
                    expMonth,
                    expYear,
                    hostname,
                    lastFour,
                    memo,
                    pan,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    authRuleTokens,
                    token,
                    type,
                    digitalCardArtToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Card{created=$created, cvv=$cvv, funding=$funding, expMonth=$expMonth, expYear=$expYear, hostname=$hostname, lastFour=$lastFour, memo=$memo, pan=$pan, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, authRuleTokens=$authRuleTokens, token=$token, type=$type, digitalCardArtToken=$digitalCardArtToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cvv: JsonField<String> = JsonMissing.of()
        private var funding: JsonField<FundingSource> = JsonMissing.of()
        private var expMonth: JsonField<String> = JsonMissing.of()
        private var expYear: JsonField<String> = JsonMissing.of()
        private var hostname: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var pan: JsonField<String> = JsonMissing.of()
        private var spendLimit: JsonField<Long> = JsonMissing.of()
        private var spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var authRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(card: Card) = apply {
            this.created = card.created
            this.cvv = card.cvv
            this.funding = card.funding
            this.expMonth = card.expMonth
            this.expYear = card.expYear
            this.hostname = card.hostname
            this.lastFour = card.lastFour
            this.memo = card.memo
            this.pan = card.pan
            this.spendLimit = card.spendLimit
            this.spendLimitDuration = card.spendLimitDuration
            this.state = card.state
            this.authRuleTokens = card.authRuleTokens
            this.token = card.token
            this.type = card.type
            this.digitalCardArtToken = card.digitalCardArtToken
            additionalProperties(card.additionalProperties)
        }

        /** An ISO 8601 timestamp for when the card was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** An ISO 8601 timestamp for when the card was created. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Three digit cvv printed on the back of the card. */
        fun cvv(cvv: String) = cvv(JsonField.of(cvv))

        /** Three digit cvv printed on the back of the card. */
        @JsonProperty("cvv")
        @ExcludeMissing
        fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

        fun funding(funding: FundingSource) = funding(JsonField.of(funding))

        @JsonProperty("funding")
        @ExcludeMissing
        fun funding(funding: JsonField<FundingSource>) = apply { this.funding = funding }

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
         *
         * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         * card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         * Month is calculated as this calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         * transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) =
            spendLimitDuration(JsonField.of(spendLimitDuration))

        /**
         * Spend limit duration values:
         *
         * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         * card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         * Month is calculated as this calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         * transaction is under the spend limit.
         */
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values:
         *
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
         * provisioned pending manufacturing and fulfillment. Cards in this state can accept
         * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
         * physical card itself is present.
         * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
         * `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
         * updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
         * state can be used for e-commerce transactions. API clients should update the card's state
         * to `OPEN` only after the cardholder confirms receipt of the card.
         *
         * In sandbox, the same daily batch fulfillment occurs, but no cards are actually
         * manufactured.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Card state values:
         *
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         * - `PENDING_FULFILLMENT` - The initial state for cards of type `PHYSICAL`. The card is
         * provisioned pending manufacturing and fulfillment. Cards in this state can accept
         * authorizations for e-commerce purchases, but not for "Card Present" purchases where the
         * physical card itself is present.
         * - `PENDING_ACTIVATION` - Each business day at 2pm Eastern Time Zone (ET), cards of type
         * `PHYSICAL` in state `PENDING_FULFILLMENT` are sent to the card production warehouse and
         * updated to state `PENDING_ACTIVATION` . Similar to `PENDING_FULFILLMENT`, cards in this
         * state can be used for e-commerce transactions. API clients should update the card's state
         * to `OPEN` only after the cardholder confirms receipt of the card.
         *
         * In sandbox, the same daily batch fulfillment occurs, but no cards are actually
         * manufactured.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** List of identifiers for the Auth Rule(s) that are applied on the card. */
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /** List of identifiers for the Auth Rule(s) that are applied on the card. */
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Card types:
         *
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         * like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         * credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         * [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         * successfully authorizes the card.
         * - `SINGLE_USE` - _[Deprecated]_ Card is closed upon first successful authorization.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Card types:
         *
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         * like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         * credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         * [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         * successfully authorizes the card.
         * - `SINGLE_USE` - _[Deprecated]_ Card is closed upon first successful authorization.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
         * .
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
         * .
         */
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
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

        fun build(): Card =
            Card(
                created,
                cvv,
                funding,
                expMonth,
                expYear,
                hostname,
                lastFour,
                memo,
                pan,
                spendLimit,
                spendLimitDuration,
                state,
                authRuleTokens.map { it.toUnmodifiable() },
                token,
                type,
                digitalCardArtToken,
                additionalProperties.toUnmodifiable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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
    ) {

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

            @JvmField val VIRTUAL = Type(JsonField.of("VIRTUAL"))

            @JvmField val PHYSICAL = Type(JsonField.of("PHYSICAL"))

            @JvmField val MERCHANT_LOCKED = Type(JsonField.of("MERCHANT_LOCKED"))

            @JvmField val SINGLE_USE = Type(JsonField.of("SINGLE_USE"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            VIRTUAL,
            PHYSICAL,
            MERCHANT_LOCKED,
            SINGLE_USE,
        }

        enum class Value {
            VIRTUAL,
            PHYSICAL,
            MERCHANT_LOCKED,
            SINGLE_USE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VIRTUAL -> Value.VIRTUAL
                PHYSICAL -> Value.PHYSICAL
                MERCHANT_LOCKED -> Value.MERCHANT_LOCKED
                SINGLE_USE -> Value.SINGLE_USE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VIRTUAL -> Known.VIRTUAL
                PHYSICAL -> Known.PHYSICAL
                MERCHANT_LOCKED -> Known.MERCHANT_LOCKED
                SINGLE_USE -> Known.SINGLE_USE
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
