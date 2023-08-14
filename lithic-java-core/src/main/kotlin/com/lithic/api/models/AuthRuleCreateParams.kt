package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleCreateParams
constructor(
    private val allowedMcc: List<String>?,
    private val blockedMcc: List<String>?,
    private val allowedCountries: List<String>?,
    private val blockedCountries: List<String>?,
    private val accountTokens: List<String>?,
    private val cardTokens: List<String>?,
    private val programLevel: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun allowedMcc(): Optional<List<String>> = Optional.ofNullable(allowedMcc)

    fun blockedMcc(): Optional<List<String>> = Optional.ofNullable(blockedMcc)

    fun allowedCountries(): Optional<List<String>> = Optional.ofNullable(allowedCountries)

    fun blockedCountries(): Optional<List<String>> = Optional.ofNullable(blockedCountries)

    fun accountTokens(): Optional<List<String>> = Optional.ofNullable(accountTokens)

    fun cardTokens(): Optional<List<String>> = Optional.ofNullable(cardTokens)

    fun programLevel(): Optional<Boolean> = Optional.ofNullable(programLevel)

    @JvmSynthetic
    internal fun getBody(): AuthRuleCreateBody {
        return AuthRuleCreateBody(
            allowedMcc,
            blockedMcc,
            allowedCountries,
            blockedCountries,
            accountTokens,
            cardTokens,
            programLevel,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AuthRuleCreateBody.Builder::class)
    @NoAutoDetect
    class AuthRuleCreateBody
    internal constructor(
        private val allowedMcc: List<String>?,
        private val blockedMcc: List<String>?,
        private val allowedCountries: List<String>?,
        private val blockedCountries: List<String>?,
        private val accountTokens: List<String>?,
        private val cardTokens: List<String>?,
        private val programLevel: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Merchant category codes for which the Auth Rule permits transactions. */
        @JsonProperty("allowed_mcc") fun allowedMcc(): List<String>? = allowedMcc

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_mcc") fun blockedMcc(): List<String>? = blockedMcc

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        @JsonProperty("allowed_countries") fun allowedCountries(): List<String>? = allowedCountries

        /** Countries in which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_countries") fun blockedCountries(): List<String>? = blockedCountries

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthRuleCreateBody &&
                this.allowedMcc == other.allowedMcc &&
                this.blockedMcc == other.blockedMcc &&
                this.allowedCountries == other.allowedCountries &&
                this.blockedCountries == other.blockedCountries &&
                this.accountTokens == other.accountTokens &&
                this.cardTokens == other.cardTokens &&
                this.programLevel == other.programLevel &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        allowedMcc,
                        blockedMcc,
                        allowedCountries,
                        blockedCountries,
                        accountTokens,
                        cardTokens,
                        programLevel,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleCreateBody{allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, accountTokens=$accountTokens, cardTokens=$cardTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var allowedMcc: List<String>? = null
            private var blockedMcc: List<String>? = null
            private var allowedCountries: List<String>? = null
            private var blockedCountries: List<String>? = null
            private var accountTokens: List<String>? = null
            private var cardTokens: List<String>? = null
            private var programLevel: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleCreateBody: AuthRuleCreateBody) = apply {
                this.allowedMcc = authRuleCreateBody.allowedMcc
                this.blockedMcc = authRuleCreateBody.blockedMcc
                this.allowedCountries = authRuleCreateBody.allowedCountries
                this.blockedCountries = authRuleCreateBody.blockedCountries
                this.accountTokens = authRuleCreateBody.accountTokens
                this.cardTokens = authRuleCreateBody.cardTokens
                this.programLevel = authRuleCreateBody.programLevel
                additionalProperties(authRuleCreateBody.additionalProperties)
            }

            /** Merchant category codes for which the Auth Rule permits transactions. */
            @JsonProperty("allowed_mcc")
            fun allowedMcc(allowedMcc: List<String>) = apply { this.allowedMcc = allowedMcc }

            /**
             * Merchant category codes for which the Auth Rule automatically declines transactions.
             */
            @JsonProperty("blocked_mcc")
            fun blockedMcc(blockedMcc: List<String>) = apply { this.blockedMcc = blockedMcc }

            /**
             * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a
             * list of countries in which all transactions are blocked; "allowing" those countries
             * in an Auth Rule does not override the Lithic-wide restrictions.
             */
            @JsonProperty("allowed_countries")
            fun allowedCountries(allowedCountries: List<String>) = apply {
                this.allowedCountries = allowedCountries
            }

            /** Countries in which the Auth Rule automatically declines transactions. */
            @JsonProperty("blocked_countries")
            fun blockedCountries(blockedCountries: List<String>) = apply {
                this.blockedCountries = blockedCountries
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

            fun build(): AuthRuleCreateBody =
                AuthRuleCreateBody(
                    allowedMcc?.toUnmodifiable(),
                    blockedMcc?.toUnmodifiable(),
                    allowedCountries?.toUnmodifiable(),
                    blockedCountries?.toUnmodifiable(),
                    accountTokens?.toUnmodifiable(),
                    cardTokens?.toUnmodifiable(),
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

        return other is AuthRuleCreateParams &&
            this.allowedMcc == other.allowedMcc &&
            this.blockedMcc == other.blockedMcc &&
            this.allowedCountries == other.allowedCountries &&
            this.blockedCountries == other.blockedCountries &&
            this.accountTokens == other.accountTokens &&
            this.cardTokens == other.cardTokens &&
            this.programLevel == other.programLevel &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            allowedMcc,
            blockedMcc,
            allowedCountries,
            blockedCountries,
            accountTokens,
            cardTokens,
            programLevel,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AuthRuleCreateParams{allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, accountTokens=$accountTokens, cardTokens=$cardTokens, programLevel=$programLevel, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var allowedMcc: MutableList<String> = mutableListOf()
        private var blockedMcc: MutableList<String> = mutableListOf()
        private var allowedCountries: MutableList<String> = mutableListOf()
        private var blockedCountries: MutableList<String> = mutableListOf()
        private var accountTokens: MutableList<String> = mutableListOf()
        private var cardTokens: MutableList<String> = mutableListOf()
        private var programLevel: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleCreateParams: AuthRuleCreateParams) = apply {
            this.allowedMcc(authRuleCreateParams.allowedMcc ?: listOf())
            this.blockedMcc(authRuleCreateParams.blockedMcc ?: listOf())
            this.allowedCountries(authRuleCreateParams.allowedCountries ?: listOf())
            this.blockedCountries(authRuleCreateParams.blockedCountries ?: listOf())
            this.accountTokens(authRuleCreateParams.accountTokens ?: listOf())
            this.cardTokens(authRuleCreateParams.cardTokens ?: listOf())
            this.programLevel = authRuleCreateParams.programLevel
            additionalQueryParams(authRuleCreateParams.additionalQueryParams)
            additionalHeaders(authRuleCreateParams.additionalHeaders)
            additionalBodyProperties(authRuleCreateParams.additionalBodyProperties)
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: List<String>) = apply {
            this.allowedMcc.clear()
            this.allowedMcc.addAll(allowedMcc)
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun addAllowedMcc(allowedMcc: String) = apply { this.allowedMcc.add(allowedMcc) }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: List<String>) = apply {
            this.blockedMcc.clear()
            this.blockedMcc.addAll(blockedMcc)
        }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun addBlockedMcc(blockedMcc: String) = apply { this.blockedMcc.add(blockedMcc) }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun allowedCountries(allowedCountries: List<String>) = apply {
            this.allowedCountries.clear()
            this.allowedCountries.addAll(allowedCountries)
        }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun addAllowedCountry(allowedCountry: String) = apply {
            this.allowedCountries.add(allowedCountry)
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: List<String>) = apply {
            this.blockedCountries.clear()
            this.blockedCountries.addAll(blockedCountries)
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun addBlockedCountry(blockedCountry: String) = apply {
            this.blockedCountries.add(blockedCountry)
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

        fun build(): AuthRuleCreateParams =
            AuthRuleCreateParams(
                if (allowedMcc.size == 0) null else allowedMcc.toUnmodifiable(),
                if (blockedMcc.size == 0) null else blockedMcc.toUnmodifiable(),
                if (allowedCountries.size == 0) null else allowedCountries.toUnmodifiable(),
                if (blockedCountries.size == 0) null else blockedCountries.toUnmodifiable(),
                if (accountTokens.size == 0) null else accountTokens.toUnmodifiable(),
                if (cardTokens.size == 0) null else cardTokens.toUnmodifiable(),
                programLevel,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
