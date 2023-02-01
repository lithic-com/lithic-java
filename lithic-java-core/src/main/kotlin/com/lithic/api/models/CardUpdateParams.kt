package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Objects
import java.util.Optional
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class CardUpdateParams constructor(private val cardToken: String,private val accountToken: String?,private val fundingToken: String?,private val memo: String?,private val spendLimit: Long?,private val spendLimitDuration: SpendLimitDuration?,private val authRuleToken: String?,private val state: State?,private val pin: String?,private val digitalCardArtToken: String?,private val additionalQueryParams: ListMultimap<String, String>,private val additionalHeaders: ListMultimap<String, String>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun cardToken(): String = cardToken

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun fundingToken(): Optional<String> = Optional.ofNullable(fundingToken)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun spendLimit(): Optional<Long> = Optional.ofNullable(spendLimit)

    fun spendLimitDuration(): Optional<SpendLimitDuration> = Optional.ofNullable(spendLimitDuration)

    fun authRuleToken(): Optional<String> = Optional.ofNullable(authRuleToken)

    fun state(): Optional<State> = Optional.ofNullable(state)

    fun pin(): Optional<String> = Optional.ofNullable(pin)

    fun digitalCardArtToken(): Optional<String> = Optional.ofNullable(digitalCardArtToken)

    @JvmSynthetic
    internal fun toBody(): CardUpdateBody = CardUpdateBody(
        accountToken,
        fundingToken,
        memo,
        spendLimit,
        spendLimitDuration,
        authRuleToken,
        state,
        pin,
        digitalCardArtToken,
        additionalBodyProperties
    )

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic
    internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> cardToken
          else -> ""
      }
    }

    @NoAutoDetect
    class CardUpdateBody internal constructor(private val accountToken: String?,private val fundingToken: String?,private val memo: String?,private val spendLimit: Long?,private val spendLimitDuration: SpendLimitDuration?,private val authRuleToken: String?,private val state: State?,private val pin: String?,private val digitalCardArtToken: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Only required for multi-account users. Token identifying the account the card
         * will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
         * more information.
         */
        @JsonProperty("account_token")
        fun accountToken(): String? = accountToken

        /**
         * The token for the desired `FundingAccount` to use when making transactions with
         * this card.
         */
        @JsonProperty("funding_token")
        fun fundingToken(): String? = fundingToken

        /**
         * Friendly name to identify the card. We recommend against using this field to
         * store JSON data as it can cause unexpected behavior.
         */
        @JsonProperty("memo")
        fun memo(): String? = memo

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above
         * the spend limit will be declined. Note that a spend limit of 0 is effectively no
         * limit, and should only be used to reset or remove a prior limit. Only a limit of
         * 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        @JsonProperty("spend_limit")
        fun spendLimit(): Long? = spendLimit

        /**
         * Spend limit duration values:
         *
         * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar
         *   year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime
         *   of the card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the
         *   trailing month. Month is calculated as this calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        @JsonProperty("spend_limit_duration")
        fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

        /**
         * Identifier for any Auth Rules that will be applied to transactions taking place
         * with the card.
         */
        @JsonProperty("auth_rule_token")
        fun authRuleToken(): String? = authRuleToken

        /**
         * Card state values:
         *
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot
         *   be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account
         *   parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later
         *   time.
         */
        @JsonProperty("state")
        fun state(): State? = state

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
         * `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise).
         */
        @JsonProperty("pin")
        fun pin(): String? = pin

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet
         * after tokenization. This artwork must be approved by Mastercard and configured
         * by Lithic to use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        fun digitalCardArtToken(): String? = digitalCardArtToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CardUpdateBody &&
              accountToken == other.accountToken &&
              fundingToken == other.fundingToken &&
              memo == other.memo &&
              spendLimit == other.spendLimit &&
              spendLimitDuration == other.spendLimitDuration &&
              authRuleToken == other.authRuleToken &&
              state == other.state &&
              pin == other.pin &&
              digitalCardArtToken == other.digitalCardArtToken &&
              additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                accountToken,
                fundingToken,
                memo,
                spendLimit,
                spendLimitDuration,
                authRuleToken,
                state,
                pin,
                digitalCardArtToken,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CardUpdateBody{accountToken=$accountToken, fundingToken=$fundingToken, memo=$memo, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, authRuleToken=$authRuleToken, state=$state, pin=$pin, digitalCardArtToken=$digitalCardArtToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var accountToken: String? = null
            private var fundingToken: String? = null
            private var memo: String? = null
            private var spendLimit: Long? = null
            private var spendLimitDuration: SpendLimitDuration? = null
            private var authRuleToken: String? = null
            private var state: State? = null
            private var pin: String? = null
            private var digitalCardArtToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardUpdateBody: CardUpdateBody) = apply {
                this.accountToken = cardUpdateBody.accountToken
                this.fundingToken = cardUpdateBody.fundingToken
                this.memo = cardUpdateBody.memo
                this.spendLimit = cardUpdateBody.spendLimit
                this.spendLimitDuration = cardUpdateBody.spendLimitDuration
                this.authRuleToken = cardUpdateBody.authRuleToken
                this.state = cardUpdateBody.state
                this.pin = cardUpdateBody.pin
                this.digitalCardArtToken = cardUpdateBody.digitalCardArtToken
                additionalProperties(cardUpdateBody.additionalProperties)
            }

            /**
             * Only required for multi-account users. Token identifying the account the card
             * will be associated with. Only applicable if using account holder enrollment. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
             * more information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply {
                this.accountToken = accountToken
            }

            /**
             * The token for the desired `FundingAccount` to use when making transactions with
             * this card.
             */
            @JsonProperty("funding_token")
            fun fundingToken(fundingToken: String) = apply {
                this.fundingToken = fundingToken
            }

            /**
             * Friendly name to identify the card. We recommend against using this field to
             * store JSON data as it can cause unexpected behavior.
             */
            @JsonProperty("memo")
            fun memo(memo: String) = apply {
                this.memo = memo
            }

            /**
             * Amount (in cents) to limit approved authorizations. Transaction requests above
             * the spend limit will be declined. Note that a spend limit of 0 is effectively no
             * limit, and should only be used to reset or remove a prior limit. Only a limit of
             * 1 or above will result in declined transactions due to checks against the card
             * limit.
             */
            @JsonProperty("spend_limit")
            fun spendLimit(spendLimit: Long) = apply {
                this.spendLimit = spendLimit
            }

            /**
             * Spend limit duration values:
             *
             * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar
             *   year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime
             *   of the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the
             *   trailing month. Month is calculated as this calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             *   transaction is under the spend limit.
             */
            @JsonProperty("spend_limit_duration")
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            /**
             * Identifier for any Auth Rules that will be applied to transactions taking place
             * with the card.
             */
            @JsonProperty("auth_rule_token")
            fun authRuleToken(authRuleToken: String) = apply {
                this.authRuleToken = authRuleToken
            }

            /**
             * Card state values:
             *
             * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot
             *   be undone.
             * - `OPEN` - Card will approve authorizations (if they match card and account
             *   parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later
             *   time.
             */
            @JsonProperty("state")
            fun state(state: State) = apply {
                this.state = state
            }

            /**
             * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
             * `VIRTUAL`. See
             * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise).
             */
            @JsonProperty("pin")
            fun pin(pin: String) = apply {
                this.pin = pin
            }

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet
             * after tokenization. This artwork must be approved by Mastercard and configured
             * by Lithic to use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
             */
            @JsonProperty("digital_card_art_token")
            fun digitalCardArtToken(digitalCardArtToken: String) = apply {
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

            fun build(): CardUpdateBody = CardUpdateBody(
                accountToken,
                fundingToken,
                memo,
                spendLimit,
                spendLimitDuration,
                authRuleToken,
                state,
                pin,
                digitalCardArtToken,
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

      return other is CardUpdateParams &&
          cardToken == other.cardToken &&
          accountToken == other.accountToken &&
          fundingToken == other.fundingToken &&
          memo == other.memo &&
          spendLimit == other.spendLimit &&
          spendLimitDuration == other.spendLimitDuration &&
          authRuleToken == other.authRuleToken &&
          state == other.state &&
          pin == other.pin &&
          digitalCardArtToken == other.digitalCardArtToken &&
          additionalQueryParams == other.additionalQueryParams &&
          additionalHeaders == other.additionalHeaders &&
          additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cardToken,
          accountToken,
          fundingToken,
          memo,
          spendLimit,
          spendLimitDuration,
          authRuleToken,
          state,
          pin,
          digitalCardArtToken,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CardUpdateParams{cardToken=$cardToken, accountToken=$accountToken, fundingToken=$fundingToken, memo=$memo, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, authRuleToken=$authRuleToken, state=$state, pin=$pin, digitalCardArtToken=$digitalCardArtToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var accountToken: String? = null
        private var fundingToken: String? = null
        private var memo: String? = null
        private var spendLimit: Long? = null
        private var spendLimitDuration: SpendLimitDuration? = null
        private var authRuleToken: String? = null
        private var state: State? = null
        private var pin: String? = null
        private var digitalCardArtToken: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            this.cardToken = cardUpdateParams.cardToken
            this.accountToken = cardUpdateParams.accountToken
            this.fundingToken = cardUpdateParams.fundingToken
            this.memo = cardUpdateParams.memo
            this.spendLimit = cardUpdateParams.spendLimit
            this.spendLimitDuration = cardUpdateParams.spendLimitDuration
            this.authRuleToken = cardUpdateParams.authRuleToken
            this.state = cardUpdateParams.state
            this.pin = cardUpdateParams.pin
            this.digitalCardArtToken = cardUpdateParams.digitalCardArtToken
            additionalQueryParams(cardUpdateParams.additionalQueryParams)
            additionalHeaders(cardUpdateParams.additionalHeaders)
            additionalBodyProperties(cardUpdateParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only required for multi-account users. Token identifying the account the card
         * will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
         * more information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * The token for the desired `FundingAccount` to use when making transactions with
         * this card.
         */
        fun fundingToken(fundingToken: String) = apply { this.fundingToken = fundingToken }

        /**
         * Friendly name to identify the card. We recommend against using this field to
         * store JSON data as it can cause unexpected behavior.
         */
        fun memo(memo: String) = apply { this.memo = memo }

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above
         * the spend limit will be declined. Note that a spend limit of 0 is effectively no
         * limit, and should only be used to reset or remove a prior limit. Only a limit of
         * 1 or above will result in declined transactions due to checks against the card
         * limit.
         */
        fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

        /**
         * Spend limit duration values:
         *
         * - `ANNUALLY` - Card will authorize transactions up to spend limit in a calendar
         *   year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime
         *   of the card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the
         *   trailing month. Month is calculated as this calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply { this.spendLimitDuration = spendLimitDuration }

        /**
         * Identifier for any Auth Rules that will be applied to transactions taking place
         * with the card.
         */
        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /**
         * Card state values:
         *
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot
         *   be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account
         *   parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later
         *   time.
         */
        fun state(state: State) = apply { this.state = state }

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
         * `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block-enterprise).
         */
        fun pin(pin: String) = apply { this.pin = pin }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet
         * after tokenization. This artwork must be approved by Mastercard and configured
         * by Lithic to use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply { this.digitalCardArtToken = digitalCardArtToken }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply { this.additionalQueryParams.put(key, value) }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply { this.additionalHeaders.put(key, value) }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply { this.additionalBodyProperties.put(key, value) }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): CardUpdateParams = CardUpdateParams(
            checkNotNull(cardToken) { "Property `cardToken` is required but was not set" },
            accountToken,
            fundingToken,
            memo,
            spendLimit,
            spendLimitDuration,
            authRuleToken,
            state,
            pin,
            digitalCardArtToken,
            additionalQueryParams.toUnmodifiable(),
            additionalHeaders.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class State @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is State &&
              value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CLOSED = State(JsonField.of("CLOSED"))

            @JvmField val OPEN = State(JsonField.of("OPEN"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            CLOSED,
            OPEN,
            PAUSED,
        }

        enum class Value {
            CLOSED,
            OPEN,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CLOSED -> Value.CLOSED
            OPEN -> Value.OPEN
            PAUSED -> Value.PAUSED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CLOSED -> Known.CLOSED
            OPEN -> Known.OPEN
            PAUSED -> Known.PAUSED
            else -> throw LithicInvalidDataException("Unknown CardUpdateBody.State: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
