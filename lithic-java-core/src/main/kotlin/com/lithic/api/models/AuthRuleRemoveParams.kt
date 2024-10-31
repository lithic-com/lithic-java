// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleRemoveParams
constructor(
    private val accountTokens: List<String>?,
    private val cardTokens: List<String>?,
    private val programLevel: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountTokens(): Optional<List<String>> = Optional.ofNullable(accountTokens)

    fun cardTokens(): Optional<List<String>> = Optional.ofNullable(cardTokens)

    fun programLevel(): Optional<Boolean> = Optional.ofNullable(programLevel)

    @JvmSynthetic
    internal fun getBody(): AuthRuleRemoveBody {
        return AuthRuleRemoveBody(
            accountTokens,
            cardTokens,
            programLevel,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AuthRuleRemoveBody.Builder::class)
    @NoAutoDetect
    class AuthRuleRemoveBody
    internal constructor(
        private val accountTokens: List<String>?,
        private val cardTokens: List<String>?,
        private val programLevel: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("account_tokens") fun accountTokens(): List<String>? = accountTokens

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("card_tokens") fun cardTokens(): List<String>? = cardTokens

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        @JsonProperty("program_level") fun programLevel(): Boolean? = programLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountTokens: List<String>? = null
            private var cardTokens: List<String>? = null
            private var programLevel: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleRemoveBody: AuthRuleRemoveBody) = apply {
                this.accountTokens = authRuleRemoveBody.accountTokens
                this.cardTokens = authRuleRemoveBody.cardTokens
                this.programLevel = authRuleRemoveBody.programLevel
                additionalProperties(authRuleRemoveBody.additionalProperties)
            }

            /**
             * Array of account_token(s) identifying the accounts that the Auth Rule applies to.
             * Note that only this field or `card_tokens` can be provided for a given Auth Rule.
             */
            @JsonProperty("account_tokens")
            fun accountTokens(accountTokens: List<String>) = apply {
                this.accountTokens = accountTokens
            }

            /**
             * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
             * only this field or `account_tokens` can be provided for a given Auth Rule.
             */
            @JsonProperty("card_tokens")
            fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

            /** Boolean indicating whether the Auth Rule is applied at the program level. */
            @JsonProperty("program_level")
            fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

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

            fun build(): AuthRuleRemoveBody =
                AuthRuleRemoveBody(
                    accountTokens?.toImmutable(),
                    cardTokens?.toImmutable(),
                    programLevel,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleRemoveBody && this.accountTokens == other.accountTokens && this.cardTokens == other.cardTokens && this.programLevel == other.programLevel && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountTokens, cardTokens, programLevel, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleRemoveBody{accountTokens=$accountTokens, cardTokens=$cardTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleRemoveParams && this.accountTokens == other.accountTokens && this.cardTokens == other.cardTokens && this.programLevel == other.programLevel && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountTokens, cardTokens, programLevel, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AuthRuleRemoveParams{accountTokens=$accountTokens, cardTokens=$cardTokens, programLevel=$programLevel, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountTokens: MutableList<String> = mutableListOf()
        private var cardTokens: MutableList<String> = mutableListOf()
        private var programLevel: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleRemoveParams: AuthRuleRemoveParams) = apply {
            this.accountTokens(authRuleRemoveParams.accountTokens ?: listOf())
            this.cardTokens(authRuleRemoveParams.cardTokens ?: listOf())
            this.programLevel = authRuleRemoveParams.programLevel
            additionalQueryParams(authRuleRemoveParams.additionalQueryParams)
            additionalHeaders(authRuleRemoveParams.additionalHeaders)
            additionalBodyProperties(authRuleRemoveParams.additionalBodyProperties)
        }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = apply {
            this.accountTokens.clear()
            this.accountTokens.addAll(accountTokens)
        }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun addAccountToken(accountToken: String) = apply { this.accountTokens.add(accountToken) }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = apply {
            this.cardTokens.clear()
            this.cardTokens.addAll(cardTokens)
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun addCardToken(cardToken: String) = apply { this.cardTokens.add(cardToken) }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AuthRuleRemoveParams =
            AuthRuleRemoveParams(
                if (accountTokens.size == 0) null else accountTokens.toImmutable(),
                if (cardTokens.size == 0) null else cardTokens.toImmutable(),
                programLevel,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
