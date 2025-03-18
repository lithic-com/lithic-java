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
 * Update the specified properties of the card. Unsupplied properties will remain unchanged.
 *
 * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
 */
class CardUpdateParams
private constructor(
    private val cardToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardToken(): String = cardToken

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
     * Friendly name to identify the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
     * Changing PIN also resets PIN status to `OK`. See
     * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pin(): Optional<String> = body.pin()

    /**
     * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect attempts).
     * Can only be set to `OK` to unblock a card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pinStatus(): Optional<PinStatus> = body.pinStatus()

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
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
     * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
     * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<State> = body.state()

    /**
     * Returns the raw JSON value of [digitalCardArtToken].
     *
     * Unlike [digitalCardArtToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _digitalCardArtToken(): JsonField<String> = body._digitalCardArtToken()

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
     * Returns the raw JSON value of [pinStatus].
     *
     * Unlike [pinStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pinStatus(): JsonField<PinStatus> = body._pinStatus()

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

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        private val digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing private val pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin_status")
        @ExcludeMissing
        private val pinStatus: JsonField<PinStatus> = JsonMissing.of(),
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
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun digitalCardArtToken(): Optional<String> =
            Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

        /**
         * Friendly name to identify the card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * Changing PIN also resets PIN status to `OK`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pin(): Optional<String> = Optional.ofNullable(pin.getNullable("pin"))

        /**
         * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
         * attempts). Can only be set to `OK` to unblock a card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pinStatus(): Optional<PinStatus> =
            Optional.ofNullable(pinStatus.getNullable("pin_status"))

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendLimitDuration(): Optional<SpendLimitDuration> =
            Optional.ofNullable(spendLimitDuration.getNullable("spend_limit_duration"))

        /**
         * Card state values:
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

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
         * Returns the raw JSON value of [pinStatus].
         *
         * Unlike [pinStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pin_status")
        @ExcludeMissing
        fun _pinStatus(): JsonField<PinStatus> = pinStatus

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            digitalCardArtToken()
            memo()
            pin()
            pinStatus()
            spendLimit()
            spendLimitDuration()
            state()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var pin: JsonField<String> = JsonMissing.of()
            private var pinStatus: JsonField<PinStatus> = JsonMissing.of()
            private var spendLimit: JsonField<Long> = JsonMissing.of()
            private var spendLimitDuration: JsonField<SpendLimitDuration> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                digitalCardArtToken = body.digitalCardArtToken
                memo = body.memo
                pin = body.pin
                pinStatus = body.pinStatus
                spendLimit = body.spendLimit
                spendLimitDuration = body.spendLimitDuration
                state = body.state
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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
             * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
             * `VIRTUAL`. Changing PIN also resets PIN status to `OK`. See
             * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
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
             * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
             * attempts). Can only be set to `OK` to unblock a card.
             */
            fun pinStatus(pinStatus: PinStatus) = pinStatus(JsonField.of(pinStatus))

            /**
             * Sets [Builder.pinStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinStatus] with a well-typed [PinStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pinStatus(pinStatus: JsonField<PinStatus>) = apply { this.pinStatus = pinStatus }

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
             * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be
             *   undone.
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
             */
            fun build(): Body =
                Body(
                    digitalCardArtToken,
                    memo,
                    pin,
                    pinStatus,
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

            return /* spotless:off */ other is Body && digitalCardArtToken == other.digitalCardArtToken && memo == other.memo && pin == other.pin && pinStatus == other.pinStatus && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(digitalCardArtToken, memo, pin, pinStatus, spendLimit, spendLimitDuration, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{digitalCardArtToken=$digitalCardArtToken, memo=$memo, pin=$pin, pinStatus=$pinStatus, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var cardToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            cardToken = cardUpdateParams.cardToken
            body = cardUpdateParams.body.toBuilder()
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

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
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * Changing PIN also resets PIN status to `OK`. See
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
         * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
         * attempts). Can only be set to `OK` to unblock a card.
         */
        fun pinStatus(pinStatus: PinStatus) = apply { body.pinStatus(pinStatus) }

        /**
         * Sets [Builder.pinStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinStatus] with a well-typed [PinStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pinStatus(pinStatus: JsonField<PinStatus>) = apply { body.pinStatus(pinStatus) }

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
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
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
         * Returns an immutable instance of [CardUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardUpdateParams =
            CardUpdateParams(
                checkRequired("cardToken", cardToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect attempts).
     * Can only be set to `OK` to unblock a card.
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

            @JvmStatic fun of(value: String) = PinStatus(JsonField.of(value))
        }

        /** An enum containing [PinStatus]'s known values. */
        enum class Known {
            OK
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PinStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Card state values:
     * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
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

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val OPEN = of("OPEN")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            CLOSED,
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
            CLOSED,
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
                CLOSED -> Value.CLOSED
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
                CLOSED -> Known.CLOSED
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

        return /* spotless:off */ other is CardUpdateParams && cardToken == other.cardToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardUpdateParams{cardToken=$cardToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
