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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Globally unique identifier for the account that the card will be associated with. Required
     * for programs enrolling users using the
     * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
     * [Managing Your Program](doc:managing-your-program) for more information.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = body.accountToken()

    /**
     * For card programs with more than one BIN range. This must be configured with Lithic before
     * use. Identifies the card program/BIN range under which to create the card. If omitted, will
     * utilize the program's default `card_program_token`. In Sandbox, use
     * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
     * creating cards on specific card programs.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardProgramToken(): Optional<String> = body.cardProgramToken()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrier(): Optional<Carrier> = body.carrier()

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet after
     * tokenization. This artwork must be approved by Mastercard and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalCardArtToken(): Optional<String> = body.digitalCardArtToken()

    /**
     * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an expiration
     * date will be generated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expMonth(): Optional<String> = body.expMonth()

    /**
     * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
     * expiration date will be generated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expYear(): Optional<String> = body.expYear()

    /**
     * Friendly name to identify the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
     * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pin(): Optional<String> = body.pin()

    /**
     * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before use.
     * Specifies the configuration (i.e., physical card art) that the card should be manufactured
     * with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * Restricted field limited to select use cases. Lithic will reach out directly if this field
     * should be used. Globally unique identifier for the replacement card's account. If this field
     * is specified, `replacement_for` must also be specified. If `replacement_for` is specified and
     * this field is omitted, the replacement card's account will be inferred from the card being
     * replaced.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replacementAccountToken(): Optional<String> = body.replacementAccountToken()

    /**
     * Globally unique identifier for the card that this card will replace. If the card type is
     * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it will be
     * replaced by a `VIRTUAL` card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replacementFor(): Optional<String> = body.replacementFor()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
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
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shippingMethod(): Optional<ShippingMethod> = body.shippingMethod()

    /**
     * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
     * Transaction requests above the spend limit will be declined. Note that a spend limit of 0 is
     * effectively no limit, and should only be used to reset or remove a prior limit. Only a limit
     * of 1 or above will result in declined transactions due to checks against the card limit.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendLimitDuration(): Optional<SpendLimitDuration> = body.spendLimitDuration()

    /**
     * Card state values:
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<State> = body.state()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountToken(): JsonField<String> = body._accountToken()

    /**
     * Returns the raw JSON value of [cardProgramToken].
     *
     * Unlike [cardProgramToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardProgramToken(): JsonField<String> = body._cardProgramToken()

    /**
     * Returns the raw JSON value of [carrier].
     *
     * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _carrier(): JsonField<Carrier> = body._carrier()

    /**
     * Returns the raw JSON value of [digitalCardArtToken].
     *
     * Unlike [digitalCardArtToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _digitalCardArtToken(): JsonField<String> = body._digitalCardArtToken()

    /**
     * Returns the raw JSON value of [expMonth].
     *
     * Unlike [expMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expMonth(): JsonField<String> = body._expMonth()

    /**
     * Returns the raw JSON value of [expYear].
     *
     * Unlike [expYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expYear(): JsonField<String> = body._expYear()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pin(): JsonField<String> = body._pin()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [replacementAccountToken].
     *
     * Unlike [replacementAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _replacementAccountToken(): JsonField<String> = body._replacementAccountToken()

    /**
     * Returns the raw JSON value of [replacementFor].
     *
     * Unlike [replacementFor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replacementFor(): JsonField<String> = body._replacementFor()

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shippingAddress(): JsonField<ShippingAddress> = body._shippingAddress()

    /**
     * Returns the raw JSON value of [shippingMethod].
     *
     * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shippingMethod(): JsonField<ShippingMethod> = body._shippingMethod()

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _spendLimit(): JsonField<Long> = body._spendLimit()

    /**
     * Returns the raw JSON value of [spendLimitDuration].
     *
     * Unlike [spendLimitDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _spendLimitDuration(): JsonField<SpendLimitDuration> = body._spendLimitDuration()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<State> = body._state()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [accountToken]
         * - [cardProgramToken]
         * - [carrier]
         * - [digitalCardArtToken]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.cardProgramToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardProgramToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            body.cardProgramToken(cardProgramToken)
        }

        fun carrier(carrier: Carrier) = apply { body.carrier(carrier) }

        /**
         * Sets [Builder.carrier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrier] with a well-typed [Carrier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.digitalCardArtToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalCardArtToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.expMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expMonth] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expMonth(expMonth: JsonField<String>) = apply { body.expMonth(expMonth) }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(expYear: String) = apply { body.expYear(expYear) }

        /**
         * Sets [Builder.expYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expYear] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expYear(expYear: JsonField<String>) = apply { body.expYear(expYear) }

        /** Friendly name to identify the card. */
        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(pin: String) = apply { body.pin(pin) }

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { body.pin(pin) }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.replacementAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacementAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Sets [Builder.replacementFor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacementFor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replacementFor(replacementFor: JsonField<String>) = apply {
            body.replacementFor(replacementFor)
        }

        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            body.shippingAddress(shippingAddress)
        }

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [ShippingAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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
         * Sets [Builder.shippingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Sets [Builder.spendLimitDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimitDuration] with a well-typed
         * [SpendLimitDuration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [CardCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardCreateParams =
            CardCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val type: JsonField<Type>,
        private val accountToken: JsonField<String>,
        private val cardProgramToken: JsonField<String>,
        private val carrier: JsonField<Carrier>,
        private val digitalCardArtToken: JsonField<String>,
        private val expMonth: JsonField<String>,
        private val expYear: JsonField<String>,
        private val memo: JsonField<String>,
        private val pin: JsonField<String>,
        private val productId: JsonField<String>,
        private val replacementAccountToken: JsonField<String>,
        private val replacementFor: JsonField<String>,
        private val shippingAddress: JsonField<ShippingAddress>,
        private val shippingMethod: JsonField<ShippingMethod>,
        private val spendLimit: JsonField<Long>,
        private val spendLimitDuration: JsonField<SpendLimitDuration>,
        private val state: JsonField<State>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_program_token")
            @ExcludeMissing
            cardProgramToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<Carrier> = JsonMissing.of(),
            @JsonProperty("digital_card_art_token")
            @ExcludeMissing
            digitalCardArtToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exp_month")
            @ExcludeMissing
            expMonth: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exp_year") @ExcludeMissing expYear: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("replacement_account_token")
            @ExcludeMissing
            replacementAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("replacement_for")
            @ExcludeMissing
            replacementFor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipping_address")
            @ExcludeMissing
            shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
            @JsonProperty("shipping_method")
            @ExcludeMissing
            shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
            @JsonProperty("spend_limit")
            @ExcludeMissing
            spendLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend_limit_duration")
            @ExcludeMissing
            spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        ) : this(
            type,
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
            mutableMapOf(),
        )

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardProgramToken(): Optional<String> =
            cardProgramToken.getOptional("card_program_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<Carrier> = carrier.getOptional("carrier")

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun digitalCardArtToken(): Optional<String> =
            digitalCardArtToken.getOptional("digital_card_art_token")

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expMonth(): Optional<String> = expMonth.getOptional("exp_month")

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expYear(): Optional<String> = expYear.getOptional("exp_year")

        /**
         * Friendly name to identify the card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pin(): Optional<String> = pin.getOptional("pin")

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replacementAccountToken(): Optional<String> =
            replacementAccountToken.getOptional("replacement_account_token")

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replacementFor(): Optional<String> = replacementFor.getOptional("replacement_for")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingAddress(): Optional<ShippingAddress> =
            shippingAddress.getOptional("shipping_address")

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingMethod(): Optional<ShippingMethod> =
            shippingMethod.getOptional("shipping_method")

        /**
         * Amount (in cents) to limit approved authorizations (e.g. 100000 would be a $1,000 limit).
         * Transaction requests above the spend limit will be declined. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the card
         * limit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendLimit(): Optional<Long> = spendLimit.getOptional("spend_limit")

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendLimitDuration(): Optional<SpendLimitDuration> =
            spendLimitDuration.getOptional("spend_limit_duration")

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<State> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [accountToken].
         *
         * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<Carrier> = carrier

        /**
         * Returns the raw JSON value of [digitalCardArtToken].
         *
         * Unlike [digitalCardArtToken], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [pin].
         *
         * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [replacementAccountToken].
         *
         * Unlike [replacementAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replacement_account_token")
        @ExcludeMissing
        fun _replacementAccountToken(): JsonField<String> = replacementAccountToken

        /**
         * Returns the raw JSON value of [replacementFor].
         *
         * Unlike [replacementFor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replacement_for")
        @ExcludeMissing
        fun _replacementFor(): JsonField<String> = replacementFor

        /**
         * Returns the raw JSON value of [shippingAddress].
         *
         * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

        /**
         * Returns the raw JSON value of [shippingMethod].
         *
         * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

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
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Sets [Builder.accountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.cardProgramToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardProgramToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
                this.cardProgramToken = cardProgramToken
            }

            fun carrier(carrier: Carrier) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [Carrier] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.digitalCardArtToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalCardArtToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.expMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expMonth] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expYear(expYear: String) = expYear(JsonField.of(expYear))

            /**
             * Sets [Builder.expYear] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expYear] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

            /** Friendly name to identify the card. */
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
             * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`.
             * See [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
             */
            fun pin(pin: String) = pin(JsonField.of(pin))

            /**
             * Sets [Builder.pin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pin] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pin(pin: JsonField<String>) = apply { this.pin = pin }

            /**
             * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic
             * before use. Specifies the configuration (i.e., physical card art) that the card
             * should be manufactured with.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.replacementAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacementAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.replacementFor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacementFor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replacementFor(replacementFor: JsonField<String>) = apply {
                this.replacementFor = replacementFor
            }

            fun shippingAddress(shippingAddress: ShippingAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            /**
             * Sets [Builder.shippingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingAddress] with a well-typed [ShippingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.shippingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.spendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.spendLimitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendLimitDuration] with a well-typed
             * [SpendLimitDuration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
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
            shippingMethod().ifPresent { it.validate() }
            spendLimit()
            spendLimitDuration().ifPresent { it.validate() }
            state().ifPresent { it.validate() }
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (accountToken.asKnown().isPresent) 1 else 0) +
                (if (cardProgramToken.asKnown().isPresent) 1 else 0) +
                (carrier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (digitalCardArtToken.asKnown().isPresent) 1 else 0) +
                (if (expMonth.asKnown().isPresent) 1 else 0) +
                (if (expYear.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (pin.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (replacementAccountToken.asKnown().isPresent) 1 else 0) +
                (if (replacementFor.asKnown().isPresent) 1 else 0) +
                (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (shippingMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (spendLimit.asKnown().isPresent) 1 else 0) +
                (spendLimitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0)

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

        private var validated: Boolean = false

        fun validate(): ShippingMethod = apply {
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
