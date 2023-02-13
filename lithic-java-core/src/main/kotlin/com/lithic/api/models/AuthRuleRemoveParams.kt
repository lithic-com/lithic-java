package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleRemoveParams
constructor(
    private val cardTokens: List<String>?,
    private val accountTokens: List<String>?,
    private val programLevel: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardTokens(): Optional<List<String>> = Optional.ofNullable(cardTokens)

    fun accountTokens(): Optional<List<String>> = Optional.ofNullable(accountTokens)

    fun programLevel(): Optional<Boolean> = Optional.ofNullable(programLevel)

    @JvmSynthetic
    internal fun getBody(): AuthRuleRemoveBody {
        return AuthRuleRemoveBody(
            cardTokens,
            accountTokens,
            programLevel,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @NoAutoDetect
    class AuthRuleRemoveBody
    internal constructor(
        private val cardTokens: List<String>?,
        private val accountTokens: List<String>?,
        private val programLevel: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("card_tokens") fun cardTokens(): List<String>? = cardTokens

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("account_tokens") fun accountTokens(): List<String>? = accountTokens

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        @JsonProperty("program_level") fun programLevel(): Boolean? = programLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthRuleRemoveBody &&
                this.cardTokens == other.cardTokens &&
                this.accountTokens == other.accountTokens &&
                this.programLevel == other.programLevel &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cardTokens,
                        accountTokens,
                        programLevel,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleRemoveBody{cardTokens=$cardTokens, accountTokens=$accountTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardTokens: List<String>? = null
            private var accountTokens: List<String>? = null
            private var programLevel: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleRemoveBody: AuthRuleRemoveBody) = apply {
                this.cardTokens = authRuleRemoveBody.cardTokens
                this.accountTokens = authRuleRemoveBody.accountTokens
                this.programLevel = authRuleRemoveBody.programLevel
                additionalProperties(authRuleRemoveBody.additionalProperties)
            }

            /**
             * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
             * only this field or `account_tokens` can be provided for a given Auth Rule.
             */
            @JsonProperty("card_tokens")
            fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

            /**
             * Array of account_token(s) identifying the accounts that the Auth Rule applies to.
             * Note that only this field or `card_tokens` can be provided for a given Auth Rule.
             */
            @JsonProperty("account_tokens")
            fun accountTokens(accountTokens: List<String>) = apply {
                this.accountTokens = accountTokens
            }

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
                    cardTokens?.toUnmodifiable(),
                    accountTokens?.toUnmodifiable(),
                    programLevel,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleRemoveParams &&
            this.cardTokens == other.cardTokens &&
            this.accountTokens == other.accountTokens &&
            this.programLevel == other.programLevel &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardTokens,
            accountTokens,
            programLevel,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AuthRuleRemoveParams{cardTokens=$cardTokens, accountTokens=$accountTokens, programLevel=$programLevel, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardTokens: List<String>? = null
        private var accountTokens: List<String>? = null
        private var programLevel: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleRemoveParams: AuthRuleRemoveParams) = apply {
            this.cardTokens = authRuleRemoveParams.cardTokens
            this.accountTokens = authRuleRemoveParams.accountTokens
            this.programLevel = authRuleRemoveParams.programLevel
            additionalQueryParams(authRuleRemoveParams.additionalQueryParams)
            additionalHeaders(authRuleRemoveParams.additionalHeaders)
            additionalBodyProperties(authRuleRemoveParams.additionalBodyProperties)
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = apply {
            this.accountTokens = accountTokens
        }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putQueryParam(key: String, value: List<String>) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParam)
        }

        fun removeQueryParam(key: String) = apply {
            this.additionalQueryParams.put(key, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(key: String, value: String) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putHeader(key: String, value: List<String>) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            additionalHeaders.forEach(this::putHeader)
        }

        fun removeHeader(key: String) = apply { this.additionalHeaders.put(key, mutableListOf()) }

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
                cardTokens?.toUnmodifiable(),
                accountTokens?.toUnmodifiable(),
                programLevel,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
