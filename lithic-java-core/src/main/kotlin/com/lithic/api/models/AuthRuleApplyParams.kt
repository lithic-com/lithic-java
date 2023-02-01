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

class AuthRuleApplyParams constructor(private val authRuleToken: String,private val cardTokens: List<String>?,private val accountTokens: List<String>?,private val programLevel: Boolean?,private val additionalQueryParams: ListMultimap<String, String>,private val additionalHeaders: ListMultimap<String, String>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun authRuleToken(): String = authRuleToken

    fun cardTokens(): Optional<List<String>> = Optional.ofNullable(cardTokens)

    fun accountTokens(): Optional<List<String>> = Optional.ofNullable(accountTokens)

    fun programLevel(): Optional<Boolean> = Optional.ofNullable(programLevel)

    @JvmSynthetic
    internal fun toBody(): AuthRuleApplyBody = AuthRuleApplyBody(
        cardTokens,
        accountTokens,
        programLevel,
        additionalBodyProperties
    )

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic
    internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> authRuleToken
          else -> ""
      }
    }

    @NoAutoDetect
    class AuthRuleApplyBody internal constructor(private val cardTokens: List<String>?,private val accountTokens: List<String>?,private val programLevel: Boolean?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note
         * that only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("card_tokens")
        fun cardTokens(): List<String>? = cardTokens

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies
         * to. Note that only this field or `card_tokens` can be provided for a given Auth
         * Rule.
         */
        @JsonProperty("account_tokens")
        fun accountTokens(): List<String>? = accountTokens

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        @JsonProperty("program_level")
        fun programLevel(): Boolean? = programLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AuthRuleApplyBody &&
              cardTokens == other.cardTokens &&
              accountTokens == other.accountTokens &&
              programLevel == other.programLevel &&
              additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                cardTokens,
                accountTokens,
                programLevel,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "AuthRuleApplyBody{cardTokens=$cardTokens, accountTokens=$accountTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var cardTokens: List<String>? = null
            private var accountTokens: List<String>? = null
            private var programLevel: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleApplyBody: AuthRuleApplyBody) = apply {
                this.cardTokens = authRuleApplyBody.cardTokens
                this.accountTokens = authRuleApplyBody.accountTokens
                this.programLevel = authRuleApplyBody.programLevel
                additionalProperties(authRuleApplyBody.additionalProperties)
            }

            /**
             * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note
             * that only this field or `account_tokens` can be provided for a given Auth Rule.
             */
            @JsonProperty("card_tokens")
            fun cardTokens(cardTokens: List<String>) = apply {
                this.cardTokens = cardTokens
            }

            /**
             * Array of account_token(s) identifying the accounts that the Auth Rule applies
             * to. Note that only this field or `card_tokens` can be provided for a given Auth
             * Rule.
             */
            @JsonProperty("account_tokens")
            fun accountTokens(accountTokens: List<String>) = apply {
                this.accountTokens = accountTokens
            }

            /** Boolean indicating whether the Auth Rule is applied at the program level. */
            @JsonProperty("program_level")
            fun programLevel(programLevel: Boolean) = apply {
                this.programLevel = programLevel
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

            fun build(): AuthRuleApplyBody = AuthRuleApplyBody(
                cardTokens?.toUnmodifiable(),
                accountTokens?.toUnmodifiable(),
                programLevel,
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

      return other is AuthRuleApplyParams &&
          authRuleToken == other.authRuleToken &&
          cardTokens == other.cardTokens &&
          accountTokens == other.accountTokens &&
          programLevel == other.programLevel &&
          additionalQueryParams == other.additionalQueryParams &&
          additionalHeaders == other.additionalHeaders &&
          additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          authRuleToken,
          cardTokens,
          accountTokens,
          programLevel,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "AuthRuleApplyParams{authRuleToken=$authRuleToken, cardTokens=$cardTokens, accountTokens=$accountTokens, programLevel=$programLevel, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var cardTokens: List<String>? = null
        private var accountTokens: List<String>? = null
        private var programLevel: Boolean? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleApplyParams: AuthRuleApplyParams) = apply {
            this.authRuleToken = authRuleApplyParams.authRuleToken
            this.cardTokens = authRuleApplyParams.cardTokens
            this.accountTokens = authRuleApplyParams.accountTokens
            this.programLevel = authRuleApplyParams.programLevel
            additionalQueryParams(authRuleApplyParams.additionalQueryParams)
            additionalHeaders(authRuleApplyParams.additionalHeaders)
            additionalBodyProperties(authRuleApplyParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note
         * that only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies
         * to. Note that only this field or `card_tokens` can be provided for a given Auth
         * Rule.
         */
        fun accountTokens(accountTokens: List<String>) = apply { this.accountTokens = accountTokens }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

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

        fun build(): AuthRuleApplyParams = AuthRuleApplyParams(
            checkNotNull(authRuleToken) { "Property `authRuleToken` is required but was not set" },
            cardTokens?.toUnmodifiable(),
            accountTokens?.toUnmodifiable(),
            programLevel,
            additionalQueryParams.toUnmodifiable(),
            additionalHeaders.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
