package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardCreateParams
constructor(
    private val accountToken: String?,
    private val cardProgramToken: String?,
    private val expMonth: String?,
    private val expYear: String?,
    private val fundingToken: String?,
    private val memo: String?,
    private val spendLimit: Long?,
    private val spendLimitDuration: SpendLimitDuration?,
    private val state: State?,
    private val type: Type,
    private val pin: String?,
    private val digitalCardArtToken: String?,
    private val productId: String?,
    private val shippingAddress: ShippingAddress?,
    private val shippingMethod: ShippingMethod?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun cardProgramToken(): Optional<String> = Optional.ofNullable(cardProgramToken)

    fun expMonth(): Optional<String> = Optional.ofNullable(expMonth)

    fun expYear(): Optional<String> = Optional.ofNullable(expYear)

    fun fundingToken(): Optional<String> = Optional.ofNullable(fundingToken)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun spendLimit(): Optional<Long> = Optional.ofNullable(spendLimit)

    fun spendLimitDuration(): Optional<SpendLimitDuration> = Optional.ofNullable(spendLimitDuration)

    fun state(): Optional<State> = Optional.ofNullable(state)

    fun type(): Type = type

    fun pin(): Optional<String> = Optional.ofNullable(pin)

    fun digitalCardArtToken(): Optional<String> = Optional.ofNullable(digitalCardArtToken)

    fun productId(): Optional<String> = Optional.ofNullable(productId)

    fun shippingAddress(): Optional<ShippingAddress> = Optional.ofNullable(shippingAddress)

    fun shippingMethod(): Optional<ShippingMethod> = Optional.ofNullable(shippingMethod)

    @JvmSynthetic
    internal fun toBody(): CardCreateBody =
        CardCreateBody(
            accountToken,
            cardProgramToken,
            expMonth,
            expYear,
            fundingToken,
            memo,
            spendLimit,
            spendLimitDuration,
            state,
            type,
            pin,
            digitalCardArtToken,
            productId,
            shippingAddress,
            shippingMethod,
            additionalBodyProperties
        )

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @NoAutoDetect
    class CardCreateBody
    internal constructor(
        private val accountToken: String?,
        private val cardProgramToken: String?,
        private val expMonth: String?,
        private val expYear: String?,
        private val fundingToken: String?,
        private val memo: String?,
        private val spendLimit: Long?,
        private val spendLimitDuration: SpendLimitDuration?,
        private val state: State?,
        private val type: Type?,
        private val pin: String?,
        private val digitalCardArtToken: String?,
        private val productId: String?,
        private val shippingAddress: ShippingAddress?,
        private val shippingMethod: ShippingMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Only required for multi-account users. Token identifying the account the card will be
         * associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /**
         * For physical card programs with more than one BIN range. This must be configured with
         * Lithic before use. Identifies the card program/BIN range under which to create the card.
         * If omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        @JsonProperty("card_program_token") fun cardProgramToken(): String? = cardProgramToken

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_month") fun expMonth(): String? = expMonth

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_year") fun expYear(): String? = expYear

        /**
         * The token for the desired `FundingAccount` to use when making transactions with this
         * card.
         */
        @JsonProperty("funding_token") fun fundingToken(): String? = fundingToken

        /**
         * Friendly name to identify the card. We recommend against using this field to store JSON
         * data as it can cause unexpected behavior.
         */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        @JsonProperty("spend_limit") fun spendLimit(): Long? = spendLimit

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
        fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

        /**
         * Card state values:
         *
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        @JsonProperty("state") fun state(): State? = state

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
        @JsonProperty("type") fun type(): Type? = type

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise).
         */
        @JsonProperty("pin") fun pin(): String? = pin

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
         * .
         */
        @JsonProperty("digital_card_art_token")
        fun digitalCardArtToken(): String? = digitalCardArtToken

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        @JsonProperty("product_id") fun productId(): String? = productId

        @JsonProperty("shipping_address") fun shippingAddress(): ShippingAddress? = shippingAddress

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL [beta]. Use of
         * options besides `STANDARD` require additional permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         * tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        @JsonProperty("shipping_method") fun shippingMethod(): ShippingMethod? = shippingMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardCreateBody &&
                accountToken == other.accountToken &&
                cardProgramToken == other.cardProgramToken &&
                expMonth == other.expMonth &&
                expYear == other.expYear &&
                fundingToken == other.fundingToken &&
                memo == other.memo &&
                spendLimit == other.spendLimit &&
                spendLimitDuration == other.spendLimitDuration &&
                state == other.state &&
                type == other.type &&
                pin == other.pin &&
                digitalCardArtToken == other.digitalCardArtToken &&
                productId == other.productId &&
                shippingAddress == other.shippingAddress &&
                shippingMethod == other.shippingMethod &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        cardProgramToken,
                        expMonth,
                        expYear,
                        fundingToken,
                        memo,
                        spendLimit,
                        spendLimitDuration,
                        state,
                        type,
                        pin,
                        digitalCardArtToken,
                        productId,
                        shippingAddress,
                        shippingMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardCreateBody{accountToken=$accountToken, cardProgramToken=$cardProgramToken, expMonth=$expMonth, expYear=$expYear, fundingToken=$fundingToken, memo=$memo, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, type=$type, pin=$pin, digitalCardArtToken=$digitalCardArtToken, productId=$productId, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountToken: String? = null
            private var cardProgramToken: String? = null
            private var expMonth: String? = null
            private var expYear: String? = null
            private var fundingToken: String? = null
            private var memo: String? = null
            private var spendLimit: Long? = null
            private var spendLimitDuration: SpendLimitDuration? = null
            private var state: State? = null
            private var type: Type? = null
            private var pin: String? = null
            private var digitalCardArtToken: String? = null
            private var productId: String? = null
            private var shippingAddress: ShippingAddress? = null
            private var shippingMethod: ShippingMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardCreateBody: CardCreateBody) = apply {
                this.accountToken = cardCreateBody.accountToken
                this.cardProgramToken = cardCreateBody.cardProgramToken
                this.expMonth = cardCreateBody.expMonth
                this.expYear = cardCreateBody.expYear
                this.fundingToken = cardCreateBody.fundingToken
                this.memo = cardCreateBody.memo
                this.spendLimit = cardCreateBody.spendLimit
                this.spendLimitDuration = cardCreateBody.spendLimitDuration
                this.state = cardCreateBody.state
                this.type = cardCreateBody.type
                this.pin = cardCreateBody.pin
                this.digitalCardArtToken = cardCreateBody.digitalCardArtToken
                this.productId = cardCreateBody.productId
                this.shippingAddress = cardCreateBody.shippingAddress
                this.shippingMethod = cardCreateBody.shippingMethod
                additionalProperties(cardCreateBody.additionalProperties)
            }

            /**
             * Only required for multi-account users. Token identifying the account the card will be
             * associated with. Only applicable if using account holder enrollment. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
             * information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /**
             * For physical card programs with more than one BIN range. This must be configured with
             * Lithic before use. Identifies the card program/BIN range under which to create the
             * card. If omitted, will utilize the program's default `card_program_token`. In
             * Sandbox, use 00000000-0000-0000-1000-000000000000 and
             * 00000000-0000-0000-2000-000000000000 to test creating cards on specific card
             * programs.
             */
            @JsonProperty("card_program_token")
            fun cardProgramToken(cardProgramToken: String) = apply {
                this.cardProgramToken = cardProgramToken
            }

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            @JsonProperty("exp_month")
            fun expMonth(expMonth: String) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            @JsonProperty("exp_year")
            fun expYear(expYear: String) = apply { this.expYear = expYear }

            /**
             * The token for the desired `FundingAccount` to use when making transactions with this
             * card.
             */
            @JsonProperty("funding_token")
            fun fundingToken(fundingToken: String) = apply { this.fundingToken = fundingToken }

            /**
             * Friendly name to identify the card. We recommend against using this field to store
             * JSON data as it can cause unexpected behavior.
             */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /**
             * Amount (in cents) to limit approved authorizations. Transaction requests above the
             * spend limit will be declined. Note that a spend limit of 0 is effectively no limit,
             * and should only be used to reset or remove a prior limit. Only a limit of 1 or above
             * will result in declined transactions due to checks against the card limit.
             */
            @JsonProperty("spend_limit")
            fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

            /**
             * Spend limit duration values:
             *
             * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of
             * the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing
             * month. Month is calculated as this calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             * transaction is under the spend limit.
             */
            @JsonProperty("spend_limit_duration")
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            /**
             * Card state values:
             *
             * - `OPEN` - Card will approve authorizations (if they match card and account
             * parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
             */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

            /**
             * Card types:
             *
             * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
             * wallet like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
             * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label
             * branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach
             * out at [lithic.com/contact](https://lithic.com/contact) for more information.
             * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
             * successfully authorizes the card.
             * - `SINGLE_USE` - _[Deprecated]_ Card is closed upon first successful authorization.
             */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /**
             * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
             * `VIRTUAL`. See
             * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise)
             * .
             */
            @JsonProperty("pin") fun pin(pin: String) = apply { this.pin = pin }

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet after
             * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
             * use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
             * .
             */
            @JsonProperty("digital_card_art_token")
            fun digitalCardArtToken(digitalCardArtToken: String) = apply {
                this.digitalCardArtToken = digitalCardArtToken
            }

            /**
             * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic
             * before use. Specifies the configuration (i.e., physical card art) that the card
             * should be manufactured with.
             */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            @JsonProperty("shipping_address")
            fun shippingAddress(shippingAddress: ShippingAddress) = apply {
                this.shippingAddress = shippingAddress
            }

            /**
             * Shipping method for the card. Only applies to cards of type PHYSICAL [beta]. Use of
             * options besides `STANDARD` require additional permissions.
             *
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             * tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             * tracking
             */
            @JsonProperty("shipping_method")
            fun shippingMethod(shippingMethod: ShippingMethod) = apply {
                this.shippingMethod = shippingMethod
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

            fun build(): CardCreateBody =
                CardCreateBody(
                    accountToken,
                    cardProgramToken,
                    expMonth,
                    expYear,
                    fundingToken,
                    memo,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    type!!,
                    pin,
                    digitalCardArtToken,
                    productId,
                    shippingAddress,
                    shippingMethod,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateParams &&
            accountToken == other.accountToken &&
            cardProgramToken == other.cardProgramToken &&
            expMonth == other.expMonth &&
            expYear == other.expYear &&
            fundingToken == other.fundingToken &&
            memo == other.memo &&
            spendLimit == other.spendLimit &&
            spendLimitDuration == other.spendLimitDuration &&
            state == other.state &&
            type == other.type &&
            pin == other.pin &&
            digitalCardArtToken == other.digitalCardArtToken &&
            productId == other.productId &&
            shippingAddress == other.shippingAddress &&
            shippingMethod == other.shippingMethod &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            cardProgramToken,
            expMonth,
            expYear,
            fundingToken,
            memo,
            spendLimit,
            spendLimitDuration,
            state,
            type,
            pin,
            digitalCardArtToken,
            productId,
            shippingAddress,
            shippingMethod,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardCreateParams{accountToken=$accountToken, cardProgramToken=$cardProgramToken, expMonth=$expMonth, expYear=$expYear, fundingToken=$fundingToken, memo=$memo, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, type=$type, pin=$pin, digitalCardArtToken=$digitalCardArtToken, productId=$productId, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var cardProgramToken: String? = null
        private var expMonth: String? = null
        private var expYear: String? = null
        private var fundingToken: String? = null
        private var memo: String? = null
        private var spendLimit: Long? = null
        private var spendLimitDuration: SpendLimitDuration? = null
        private var state: State? = null
        private var type: Type? = null
        private var pin: String? = null
        private var digitalCardArtToken: String? = null
        private var productId: String? = null
        private var shippingAddress: ShippingAddress? = null
        private var shippingMethod: ShippingMethod? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardCreateParams: CardCreateParams) = apply {
            this.accountToken = cardCreateParams.accountToken
            this.cardProgramToken = cardCreateParams.cardProgramToken
            this.expMonth = cardCreateParams.expMonth
            this.expYear = cardCreateParams.expYear
            this.fundingToken = cardCreateParams.fundingToken
            this.memo = cardCreateParams.memo
            this.spendLimit = cardCreateParams.spendLimit
            this.spendLimitDuration = cardCreateParams.spendLimitDuration
            this.state = cardCreateParams.state
            this.type = cardCreateParams.type
            this.pin = cardCreateParams.pin
            this.digitalCardArtToken = cardCreateParams.digitalCardArtToken
            this.productId = cardCreateParams.productId
            this.shippingAddress = cardCreateParams.shippingAddress
            this.shippingMethod = cardCreateParams.shippingMethod
            additionalQueryParams(cardCreateParams.additionalQueryParams)
            additionalHeaders(cardCreateParams.additionalHeaders)
            additionalBodyProperties(cardCreateParams.additionalBodyProperties)
        }

        /**
         * Only required for multi-account users. Token identifying the account the card will be
         * associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * For physical card programs with more than one BIN range. This must be configured with
         * Lithic before use. Identifies the card program/BIN range under which to create the card.
         * If omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        fun cardProgramToken(cardProgramToken: String) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expMonth(expMonth: String) = apply { this.expMonth = expMonth }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(expYear: String) = apply { this.expYear = expYear }

        /**
         * The token for the desired `FundingAccount` to use when making transactions with this
         * card.
         */
        fun fundingToken(fundingToken: String) = apply { this.fundingToken = fundingToken }

        /**
         * Friendly name to identify the card. We recommend against using this field to store JSON
         * data as it can cause unexpected behavior.
         */
        fun memo(memo: String) = apply { this.memo = memo }

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

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
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values:
         *
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(state: State) = apply { this.state = state }

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
        fun type(type: Type) = apply { this.type = type }

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise).
         */
        fun pin(pin: String) = apply { this.pin = pin }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art)
         * .
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = apply { this.productId = productId }

        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            this.shippingAddress = shippingAddress
        }

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL [beta]. Use of
         * options besides `STANDARD` require additional permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         * tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            this.shippingMethod = shippingMethod
        }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CardCreateParams =
            CardCreateParams(
                accountToken,
                cardProgramToken,
                expMonth,
                expYear,
                fundingToken,
                memo,
                spendLimit,
                spendLimitDuration,
                state,
                type!!,
                pin,
                digitalCardArtToken,
                productId,
                shippingAddress,
                shippingMethod,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class SpendLimitDuration
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimitDuration && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ANNUALLY = SpendLimitDuration(JsonField.of("ANNUALLY"))

            @JvmField val FOREVER = SpendLimitDuration(JsonField.of("FOREVER"))

            @JvmField val MONTHLY = SpendLimitDuration(JsonField.of("MONTHLY"))

            @JvmField val TRANSACTION = SpendLimitDuration(JsonField.of("TRANSACTION"))

            @JvmStatic fun of(value: String) = SpendLimitDuration(JsonField.of(value))
        }

        enum class Known {
            ANNUALLY,
            FOREVER,
            MONTHLY,
            TRANSACTION,
        }

        enum class Value {
            ANNUALLY,
            FOREVER,
            MONTHLY,
            TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ANNUALLY -> Value.ANNUALLY
                FOREVER -> Value.FOREVER
                MONTHLY -> Value.MONTHLY
                TRANSACTION -> Value.TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ANNUALLY -> Known.ANNUALLY
                FOREVER -> Known.FOREVER
                MONTHLY -> Known.MONTHLY
                TRANSACTION -> Known.TRANSACTION
                else ->
                    throw LithicInvalidDataException(
                        "Unknown CardCreateBody.SpendLimitDuration: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OPEN = State(JsonField.of("OPEN"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            PAUSED,
        }

        enum class Value {
            OPEN,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown CardCreateBody.State: $value")
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

            return other is Type && value == other.value
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
                else -> throw LithicInvalidDataException("Unknown CardCreateBody.Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ShippingMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ShippingMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val STANDARD = ShippingMethod(JsonField.of("STANDARD"))

            @JvmField
            val STANDARD_WITH_TRACKING = ShippingMethod(JsonField.of("STANDARD_WITH_TRACKING"))

            @JvmField val EXPEDITED = ShippingMethod(JsonField.of("EXPEDITED"))

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        enum class Known {
            STANDARD,
            STANDARD_WITH_TRACKING,
            EXPEDITED,
        }

        enum class Value {
            STANDARD,
            STANDARD_WITH_TRACKING,
            EXPEDITED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                STANDARD -> Value.STANDARD
                STANDARD_WITH_TRACKING -> Value.STANDARD_WITH_TRACKING
                EXPEDITED -> Value.EXPEDITED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                STANDARD -> Known.STANDARD
                STANDARD_WITH_TRACKING -> Known.STANDARD_WITH_TRACKING
                EXPEDITED -> Known.EXPEDITED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown CardCreateBody.ShippingMethod: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
