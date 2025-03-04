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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Create a new virtual or physical card. Parameters `shipping_address` and `product_id` only apply
 * to physical cards.
 */
class CardCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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
     * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
     *   instead.
     */
    fun type(): Type = body.type()

    /**
     * Globally unique identifier for the account that the card will be associated with. Required
     * for programs enrolling users using the
     * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
     * [Managing Your Program](doc:managing-your-program) for more information.
     */
    fun accountToken(): Optional<String> = body.accountToken()

    /**
     * For card programs with more than one BIN range. This must be configured with Lithic before
     * use. Identifies the card program/BIN range under which to create the card. If omitted, will
     * utilize the program's default `card_program_token`. In Sandbox, use
     * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
     * creating cards on specific card programs.
     */
    fun cardProgramToken(): Optional<String> = body.cardProgramToken()

    fun carrier(): Optional<Carrier> = body.carrier()

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun digitalCardArtToken(): Optional<String> = body.digitalCardArtToken()

    /**
     * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an expiration
     * date will be generated.
     */
    fun expMonth(): Optional<String> = body.expMonth()

    /**
     * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
     * expiration date will be generated.
     */
    fun expYear(): Optional<String> = body.expYear()

    /** Friendly name to identify the card. */
    fun memo(): Optional<String> = body.memo()

    /**
     * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
     * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
     */
    fun pin(): Optional<String> = body.pin()

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * Restricted field limited to select use cases. Lithic will reach out directly if this field
     * should be used. Globally unique identifier for the replacement card's account. If this field
     * is specified, `replacement_for` must also be specified. If `replacement_for` is specified and
     * this field is omitted, the replacement card's account will be inferred from the card being
     * replaced.
     */
    fun replacementAccountToken(): Optional<String> = body.replacementAccountToken()

    /**
     * Globally unique identifier for the card that this card will replace. If the card type is
     * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it will be
     * replaced by a `VIRTUAL` card.
     */
    fun replacementFor(): Optional<String> = body.replacementFor()

    fun shippingAddress(): Optional<ShippingAddress> = body.shippingAddress()

    /**
     * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options besides
     * `STANDARD` require additional permissions.
     * - `STANDARD` - USPS regular mail or similar international option, with no tracking
     * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with tracking
     * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
     * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
     * - `2_DAY` - FedEx 2-day shipping, with tracking
     * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
     */
    fun shippingMethod(): Optional<ShippingMethod> = body.shippingMethod()

    /**
     * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
     * Transaction requests above the spend limit will be declined. Note that a spend limit of 0 is
     * effectively no limit, and should only be used to reset or remove a prior limit. Only a limit
     * of 1 or above will result in declined transactions due to checks against the card limit.
     */
    fun spendLimit(): Optional<Long> = body.spendLimit()

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
    fun spendLimitDuration(): Optional<SpendLimitDuration> = body.spendLimitDuration()

    /**
     * Card state values:
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     */
    fun state(): Optional<State> = body.state()

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
     * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
     *   instead.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Globally unique identifier for the account that the card will be associated with. Required
     * for programs enrolling users using the
     * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
     * [Managing Your Program](doc:managing-your-program) for more information.
     */
    fun _accountToken(): JsonField<String> = body._accountToken()

    /**
     * For card programs with more than one BIN range. This must be configured with Lithic before
     * use. Identifies the card program/BIN range under which to create the card. If omitted, will
     * utilize the program's default `card_program_token`. In Sandbox, use
     * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
     * creating cards on specific card programs.
     */
    fun _cardProgramToken(): JsonField<String> = body._cardProgramToken()

    fun _carrier(): JsonField<Carrier> = body._carrier()

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun _digitalCardArtToken(): JsonField<String> = body._digitalCardArtToken()

    /**
     * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an expiration
     * date will be generated.
     */
    fun _expMonth(): JsonField<String> = body._expMonth()

    /**
     * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
     * expiration date will be generated.
     */
    fun _expYear(): JsonField<String> = body._expYear()

    /** Friendly name to identify the card. */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
     * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
     */
    fun _pin(): JsonField<String> = body._pin()

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Restricted field limited to select use cases. Lithic will reach out directly if this field
     * should be used. Globally unique identifier for the replacement card's account. If this field
     * is specified, `replacement_for` must also be specified. If `replacement_for` is specified and
     * this field is omitted, the replacement card's account will be inferred from the card being
     * replaced.
     */
    fun _replacementAccountToken(): JsonField<String> = body._replacementAccountToken()

    /**
     * Globally unique identifier for the card that this card will replace. If the card type is
     * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it will be
     * replaced by a `VIRTUAL` card.
     */
    fun _replacementFor(): JsonField<String> = body._replacementFor()

    fun _shippingAddress(): JsonField<ShippingAddress> = body._shippingAddress()

    /**
     * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options besides
     * `STANDARD` require additional permissions.
     * - `STANDARD` - USPS regular mail or similar international option, with no tracking
     * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with tracking
     * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
     * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
     * - `2_DAY` - FedEx 2-day shipping, with tracking
     * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
     */
    fun _shippingMethod(): JsonField<ShippingMethod> = body._shippingMethod()

    /**
     * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
     * Transaction requests above the spend limit will be declined. Note that a spend limit of 0 is
     * effectively no limit, and should only be used to reset or remove a prior limit. Only a limit
     * of 1 or above will result in declined transactions due to checks against the card limit.
     */
    fun _spendLimit(): JsonField<Long> = body._spendLimit()

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
    fun _spendLimitDuration(): JsonField<SpendLimitDuration> = body._spendLimitDuration()

    /**
     * Card state values:
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     */
    fun _state(): JsonField<State> = body._state()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        private val accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_program_token")
        @ExcludeMissing
        private val cardProgramToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("carrier")
        @ExcludeMissing
        private val carrier: JsonField<Carrier> = JsonMissing.of(),
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        private val digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_month")
        @ExcludeMissing
        private val expMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_year")
        @ExcludeMissing
        private val expYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing private val pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replacement_account_token")
        @ExcludeMissing
        private val replacementAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replacement_for")
        @ExcludeMissing
        private val replacementFor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        private val shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
        @JsonProperty("shipping_method")
        @ExcludeMissing
        private val shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        private val spendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend_limit_duration")
        @ExcludeMissing
        private val spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<State> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        fun accountToken(): Optional<String> =
            Optional.ofNullable(accountToken.getNullable("account_token"))

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        fun cardProgramToken(): Optional<String> =
            Optional.ofNullable(cardProgramToken.getNullable("card_program_token"))

        fun carrier(): Optional<Carrier> = Optional.ofNullable(carrier.getNullable("carrier"))

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(): Optional<String> =
            Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expMonth(): Optional<String> = Optional.ofNullable(expMonth.getNullable("exp_month"))

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(): Optional<String> = Optional.ofNullable(expYear.getNullable("exp_year"))

        /** Friendly name to identify the card. */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(): Optional<String> = Optional.ofNullable(pin.getNullable("pin"))

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        fun replacementAccountToken(): Optional<String> =
            Optional.ofNullable(replacementAccountToken.getNullable("replacement_account_token"))

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        fun replacementFor(): Optional<String> =
            Optional.ofNullable(replacementFor.getNullable("replacement_for"))

        fun shippingAddress(): Optional<ShippingAddress> =
            Optional.ofNullable(shippingAddress.getNullable("shipping_address"))

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(): Optional<ShippingMethod> =
            Optional.ofNullable(shippingMethod.getNullable("shipping_method"))

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        fun spendLimit(): Optional<Long> =
            Optional.ofNullable(spendLimit.getNullable("spend_limit"))

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
        fun spendLimitDuration(): Optional<SpendLimitDuration> =
            Optional.ofNullable(spendLimitDuration.getNullable("spend_limit_duration"))

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

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
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun _cardProgramToken(): JsonField<String> = cardProgramToken

        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<Carrier> = carrier

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        fun _digitalCardArtToken(): JsonField<String> = digitalCardArtToken

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_month") @ExcludeMissing fun _expMonth(): JsonField<String> = expMonth

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_year") @ExcludeMissing fun _expYear(): JsonField<String> = expYear

        /** Friendly name to identify the card. */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        @JsonProperty("replacement_account_token")
        @ExcludeMissing
        fun _replacementAccountToken(): JsonField<String> = replacementAccountToken

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        @JsonProperty("replacement_for")
        @ExcludeMissing
        fun _replacementFor(): JsonField<String> = replacementFor

        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit(): JsonField<Long> = spendLimit

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
        fun _spendLimitDuration(): JsonField<SpendLimitDuration> = spendLimitDuration

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type()
            accountToken()
            cardProgramToken()
            carrier().ifPresent { it.validate() }
            digitalCardArtToken()
            expMonth()
            expYear()
            memo()
            pin()
            productId()
            replacementAccountToken()
            replacementFor()
            shippingAddress().ifPresent { it.validate() }
            shippingMethod()
            spendLimit()
            spendLimitDuration()
            state()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var cardProgramToken: JsonField<String> = JsonMissing.of()
            private var carrier: JsonField<Carrier> = JsonMissing.of()
            private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
            private var expMonth: JsonField<String> = JsonMissing.of()
            private var expYear: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var pin: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var replacementAccountToken: JsonField<String> = JsonMissing.of()
            private var replacementFor: JsonField<String> = JsonMissing.of()
            private var shippingAddress: JsonField<ShippingAddress> = JsonMissing.of()
            private var shippingMethod: JsonField<ShippingMethod> = JsonMissing.of()
            private var spendLimit: JsonField<Long> = JsonMissing.of()
            private var spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                accountToken = body.accountToken
                cardProgramToken = body.cardProgramToken
                carrier = body.carrier
                digitalCardArtToken = body.digitalCardArtToken
                expMonth = body.expMonth
                expYear = body.expYear
                memo = body.memo
                pin = body.pin
                productId = body.productId
                replacementAccountToken = body.replacementAccountToken
                replacementFor = body.replacementFor
                shippingAddress = body.shippingAddress
                shippingMethod = body.shippingMethod
                spendLimit = body.spendLimit
                spendLimitDuration = body.spendLimitDuration
                state = body.state
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Card types:
             * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
             *   wallet like Apple Pay or Google Pay (if the card program is digital
             *   wallet-enabled).
             * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label
             *   branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach
             *   out at [lithic.com/contact](https://lithic.com/contact) for more information.
             * - `SINGLE_USE` - Card is closed upon first successful authorization.
             * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
             *   successfully authorizes the card.
             * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
             *   instead.
             * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use
             *   VIRTUAL instead.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Card types:
             * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
             *   wallet like Apple Pay or Google Pay (if the card program is digital
             *   wallet-enabled).
             * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label
             *   branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach
             *   out at [lithic.com/contact](https://lithic.com/contact) for more information.
             * - `SINGLE_USE` - Card is closed upon first successful authorization.
             * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
             *   successfully authorizes the card.
             * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
             *   instead.
             * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use
             *   VIRTUAL instead.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Globally unique identifier for the account that the card will be associated with.
             * Required for programs enrolling users using the
             * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
             * [Managing Your Program](doc:managing-your-program) for more information.
             */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Globally unique identifier for the account that the card will be associated with.
             * Required for programs enrolling users using the
             * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
             * [Managing Your Program](doc:managing-your-program) for more information.
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /**
             * For card programs with more than one BIN range. This must be configured with Lithic
             * before use. Identifies the card program/BIN range under which to create the card. If
             * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
             * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
             * creating cards on specific card programs.
             */
            fun cardProgramToken(cardProgramToken: String) =
                cardProgramToken(JsonField.of(cardProgramToken))

            /**
             * For card programs with more than one BIN range. This must be configured with Lithic
             * before use. Identifies the card program/BIN range under which to create the card. If
             * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
             * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
             * creating cards on specific card programs.
             */
            fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
                this.cardProgramToken = cardProgramToken
            }

            fun carrier(carrier: Carrier) = carrier(JsonField.of(carrier))

            fun carrier(carrier: JsonField<Carrier>) = apply { this.carrier = carrier }

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
            fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
                this.digitalCardArtToken = digitalCardArtToken
            }

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expMonth(expMonth: String) = expMonth(JsonField.of(expMonth))

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expYear(expYear: String) = expYear(JsonField.of(expYear))

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

            /** Friendly name to identify the card. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** Friendly name to identify the card. */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /**
             * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`.
             * See [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
             */
            fun pin(pin: String) = pin(JsonField.of(pin))

            /**
             * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`.
             * See [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
             */
            fun pin(pin: JsonField<String>) = apply { this.pin = pin }

            /**
             * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic
             * before use. Specifies the configuration (i.e., physical card art) that the card
             * should be manufactured with.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic
             * before use. Specifies the configuration (i.e., physical card art) that the card
             * should be manufactured with.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Restricted field limited to select use cases. Lithic will reach out directly if this
             * field should be used. Globally unique identifier for the replacement card's account.
             * If this field is specified, `replacement_for` must also be specified. If
             * `replacement_for` is specified and this field is omitted, the replacement card's
             * account will be inferred from the card being replaced.
             */
            fun replacementAccountToken(replacementAccountToken: String) =
                replacementAccountToken(JsonField.of(replacementAccountToken))

            /**
             * Restricted field limited to select use cases. Lithic will reach out directly if this
             * field should be used. Globally unique identifier for the replacement card's account.
             * If this field is specified, `replacement_for` must also be specified. If
             * `replacement_for` is specified and this field is omitted, the replacement card's
             * account will be inferred from the card being replaced.
             */
            fun replacementAccountToken(replacementAccountToken: JsonField<String>) = apply {
                this.replacementAccountToken = replacementAccountToken
            }

            /**
             * Globally unique identifier for the card that this card will replace. If the card type
             * is `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL`
             * it will be replaced by a `VIRTUAL` card.
             */
            fun replacementFor(replacementFor: String) =
                replacementFor(JsonField.of(replacementFor))

            /**
             * Globally unique identifier for the card that this card will replace. If the card type
             * is `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL`
             * it will be replaced by a `VIRTUAL` card.
             */
            fun replacementFor(replacementFor: JsonField<String>) = apply {
                this.replacementFor = replacementFor
            }

            fun shippingAddress(shippingAddress: ShippingAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
                this.shippingAddress = shippingAddress
            }

            /**
             * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
             * besides `STANDARD` require additional permissions.
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             *   tracking
             * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
             * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
             * - `2_DAY` - FedEx 2-day shipping, with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             *   tracking
             */
            fun shippingMethod(shippingMethod: ShippingMethod) =
                shippingMethod(JsonField.of(shippingMethod))

            /**
             * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
             * besides `STANDARD` require additional permissions.
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             *   tracking
             * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
             * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
             * - `2_DAY` - FedEx 2-day shipping, with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             *   tracking
             */
            fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000
             * limit). Transaction requests above the spend limit will be declined. Note that a
             * spend limit of 0 is effectively no limit, and should only be used to reset or remove
             * a prior limit. Only a limit of 1 or above will result in declined transactions due to
             * checks against the card limit.
             */
            fun spendLimit(spendLimit: Long) = spendLimit(JsonField.of(spendLimit))

            /**
             * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000
             * limit). Transaction requests above the spend limit will be declined. Note that a
             * spend limit of 0 is effectively no limit, and should only be used to reset or remove
             * a prior limit. Only a limit of 1 or above will result in declined transactions due to
             * checks against the card limit.
             */
            fun spendLimit(spendLimit: JsonField<Long>) = apply { this.spendLimit = spendLimit }

            /**
             * Spend limit duration values:
             * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing
             *   year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of
             *   the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing
             *   month. To support recurring monthly payments, which can occur on different day
             *   every month, the time window we consider for monthly velocity starts 6 days after
             *   the current calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             *   transaction is under the spend limit.
             */
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) =
                spendLimitDuration(JsonField.of(spendLimitDuration))

            /**
             * Spend limit duration values:
             * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing
             *   year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of
             *   the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing
             *   month. To support recurring monthly payments, which can occur on different day
             *   every month, the time window we consider for monthly velocity starts 6 days after
             *   the current calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             *   transaction is under the spend limit.
             */
            fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            /**
             * Card state values:
             * - `OPEN` - Card will approve authorizations (if they match card and account
             *   parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Card state values:
             * - `OPEN` - Card will approve authorizations (if they match card and account
             *   parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

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

            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    accountToken,
                    cardProgramToken,
                    carrier,
                    digitalCardArtToken,
                    expMonth,
                    expYear,
                    memo,
                    pin,
                    productId,
                    replacementAccountToken,
                    replacementFor,
                    shippingAddress,
                    shippingMethod,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && type == other.type && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && carrier == other.carrier && digitalCardArtToken == other.digitalCardArtToken && expMonth == other.expMonth && expYear == other.expYear && memo == other.memo && pin == other.pin && productId == other.productId && replacementAccountToken == other.replacementAccountToken && replacementFor == other.replacementFor && shippingAddress == other.shippingAddress && shippingMethod == other.shippingMethod && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, accountToken, cardProgramToken, carrier, digitalCardArtToken, expMonth, expYear, memo, pin, productId, replacementAccountToken, replacementFor, shippingAddress, shippingMethod, spendLimit, spendLimitDuration, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, accountToken=$accountToken, cardProgramToken=$cardProgramToken, carrier=$carrier, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, memo=$memo, pin=$pin, productId=$productId, replacementAccountToken=$replacementAccountToken, replacementFor=$replacementFor, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardCreateParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardCreateParams: CardCreateParams) = apply {
            body = cardCreateParams.body.toBuilder()
            additionalHeaders = cardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardCreateParams.additionalQueryParams.toBuilder()
        }

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
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        fun type(type: Type) = apply { body.type(type) }

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
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        fun accountToken(accountToken: String) = apply { body.accountToken(accountToken) }

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            body.accountToken(accountToken)
        }

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        fun cardProgramToken(cardProgramToken: String) = apply {
            body.cardProgramToken(cardProgramToken)
        }

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            body.cardProgramToken(cardProgramToken)
        }

        fun carrier(carrier: Carrier) = apply { body.carrier(carrier) }

        fun carrier(carrier: JsonField<Carrier>) = apply { body.carrier(carrier) }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply {
            body.digitalCardArtToken(digitalCardArtToken)
        }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            body.digitalCardArtToken(digitalCardArtToken)
        }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expMonth(expMonth: String) = apply { body.expMonth(expMonth) }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expMonth(expMonth: JsonField<String>) = apply { body.expMonth(expMonth) }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(expYear: String) = apply { body.expYear(expYear) }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(expYear: JsonField<String>) = apply { body.expYear(expYear) }

        /** Friendly name to identify the card. */
        fun memo(memo: String) = apply { body.memo(memo) }

        /** Friendly name to identify the card. */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(pin: String) = apply { body.pin(pin) }

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(pin: JsonField<String>) = apply { body.pin(pin) }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        fun replacementAccountToken(replacementAccountToken: String) = apply {
            body.replacementAccountToken(replacementAccountToken)
        }

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        fun replacementAccountToken(replacementAccountToken: JsonField<String>) = apply {
            body.replacementAccountToken(replacementAccountToken)
        }

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        fun replacementFor(replacementFor: String) = apply { body.replacementFor(replacementFor) }

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        fun replacementFor(replacementFor: JsonField<String>) = apply {
            body.replacementFor(replacementFor)
        }

        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            body.shippingAddress(shippingAddress)
        }

        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            body.shippingAddress(shippingAddress)
        }

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            body.shippingMethod(shippingMethod)
        }

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
            body.shippingMethod(shippingMethod)
        }

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        fun spendLimit(spendLimit: Long) = apply { body.spendLimit(spendLimit) }

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        fun spendLimit(spendLimit: JsonField<Long>) = apply { body.spendLimit(spendLimit) }

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
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
            body.spendLimitDuration(spendLimitDuration)
        }

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
        fun spendLimitDuration(spendLimitDuration: JsonField<SpendLimitDuration>) = apply {
            body.spendLimitDuration(spendLimitDuration)
        }

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(state: State) = apply { body.state(state) }

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(state: JsonField<State>) = apply { body.state(state) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): CardCreateParams =
            CardCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

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
     * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL instead.
     * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
     *   instead.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options besides
     * `STANDARD` require additional permissions.
     * - `STANDARD` - USPS regular mail or similar international option, with no tracking
     * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with tracking
     * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
     * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
     * - `2_DAY` - FedEx 2-day shipping, with tracking
     * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
     */
    class ShippingMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val _2_DAY = of("2_DAY")

            @JvmField val EXPEDITED = of("EXPEDITED")

            @JvmField val EXPRESS = of("EXPRESS")

            @JvmField val PRIORITY = of("PRIORITY")

            @JvmField val STANDARD = of("STANDARD")

            @JvmField val STANDARD_WITH_TRACKING = of("STANDARD_WITH_TRACKING")

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        /** An enum containing [ShippingMethod]'s known values. */
        enum class Known {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
        }

        /**
         * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
            /**
             * An enum member indicating that [ShippingMethod] was instantiated with an unknown
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
                _2_DAY -> Value._2_DAY
                EXPEDITED -> Value.EXPEDITED
                EXPRESS -> Value.EXPRESS
                PRIORITY -> Value.PRIORITY
                STANDARD -> Value.STANDARD
                STANDARD_WITH_TRACKING -> Value.STANDARD_WITH_TRACKING
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
                _2_DAY -> Known._2_DAY
                EXPEDITED -> Known.EXPEDITED
                EXPRESS -> Known.EXPRESS
                PRIORITY -> Known.PRIORITY
                STANDARD -> Known.STANDARD
                STANDARD_WITH_TRACKING -> Known.STANDARD_WITH_TRACKING
                else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Card state values:
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
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

            @JvmField val OPEN = of("OPEN")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            OPEN,
            PAUSED,
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
            OPEN,
            PAUSED,
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
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
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
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
