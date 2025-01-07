// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Update an account's credit configuration */
class FinancialAccountCreditConfigurationUpdateParams
constructor(
    private val financialAccountToken: String,
    private val body: FinancialAccountCreditConfigurationUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun creditLimit(): Optional<Long> = body.creditLimit()

    /** Globally unique identifier for the credit product */
    fun creditProductToken(): Optional<String> = body.creditProductToken()

    fun externalBankAccountToken(): Optional<String> = body.externalBankAccountToken()

    /** Tier to assign to a financial account */
    fun tier(): Optional<String> = body.tier()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): FinancialAccountCreditConfigurationUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    @NoAutoDetect
    class FinancialAccountCreditConfigurationUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("credit_limit") private val creditLimit: Long?,
        @JsonProperty("credit_product_token") private val creditProductToken: String?,
        @JsonProperty("external_bank_account_token") private val externalBankAccountToken: String?,
        @JsonProperty("tier") private val tier: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("credit_limit")
        fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit)

        /** Globally unique identifier for the credit product */
        @JsonProperty("credit_product_token")
        fun creditProductToken(): Optional<String> = Optional.ofNullable(creditProductToken)

        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): Optional<String> =
            Optional.ofNullable(externalBankAccountToken)

        /** Tier to assign to a financial account */
        @JsonProperty("tier") fun tier(): Optional<String> = Optional.ofNullable(tier)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditLimit: Long? = null
            private var creditProductToken: String? = null
            private var externalBankAccountToken: String? = null
            private var tier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                financialAccountCreditConfigurationUpdateBody:
                    FinancialAccountCreditConfigurationUpdateBody
            ) = apply {
                creditLimit = financialAccountCreditConfigurationUpdateBody.creditLimit
                creditProductToken =
                    financialAccountCreditConfigurationUpdateBody.creditProductToken
                externalBankAccountToken =
                    financialAccountCreditConfigurationUpdateBody.externalBankAccountToken
                tier = financialAccountCreditConfigurationUpdateBody.tier
                additionalProperties =
                    financialAccountCreditConfigurationUpdateBody.additionalProperties
                        .toMutableMap()
            }

            fun creditLimit(creditLimit: Long?) = apply { this.creditLimit = creditLimit }

            fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun creditLimit(creditLimit: Optional<Long>) =
                creditLimit(creditLimit.orElse(null) as Long?)

            /** Globally unique identifier for the credit product */
            fun creditProductToken(creditProductToken: String?) = apply {
                this.creditProductToken = creditProductToken
            }

            /** Globally unique identifier for the credit product */
            fun creditProductToken(creditProductToken: Optional<String>) =
                creditProductToken(creditProductToken.orElse(null))

            fun externalBankAccountToken(externalBankAccountToken: String?) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
                externalBankAccountToken(externalBankAccountToken.orElse(null))

            /** Tier to assign to a financial account */
            fun tier(tier: String?) = apply { this.tier = tier }

            /** Tier to assign to a financial account */
            fun tier(tier: Optional<String>) = tier(tier.orElse(null))

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

            fun build(): FinancialAccountCreditConfigurationUpdateBody =
                FinancialAccountCreditConfigurationUpdateBody(
                    creditLimit,
                    creditProductToken,
                    externalBankAccountToken,
                    tier,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountCreditConfigurationUpdateBody && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && externalBankAccountToken == other.externalBankAccountToken && tier == other.tier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditLimit, creditProductToken, externalBankAccountToken, tier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialAccountCreditConfigurationUpdateBody{creditLimit=$creditLimit, creditProductToken=$creditProductToken, externalBankAccountToken=$externalBankAccountToken, tier=$tier, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var body: FinancialAccountCreditConfigurationUpdateBody.Builder =
            FinancialAccountCreditConfigurationUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountCreditConfigurationUpdateParams:
                FinancialAccountCreditConfigurationUpdateParams
        ) = apply {
            financialAccountToken =
                financialAccountCreditConfigurationUpdateParams.financialAccountToken
            body = financialAccountCreditConfigurationUpdateParams.body.toBuilder()
            additionalHeaders =
                financialAccountCreditConfigurationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountCreditConfigurationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun creditLimit(creditLimit: Long?) = apply { body.creditLimit(creditLimit) }

        fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun creditLimit(creditLimit: Optional<Long>) =
            creditLimit(creditLimit.orElse(null) as Long?)

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String?) = apply {
            body.creditProductToken(creditProductToken)
        }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: Optional<String>) =
            creditProductToken(creditProductToken.orElse(null))

        fun externalBankAccountToken(externalBankAccountToken: String?) = apply {
            body.externalBankAccountToken(externalBankAccountToken)
        }

        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.orElse(null))

        /** Tier to assign to a financial account */
        fun tier(tier: String?) = apply { body.tier(tier) }

        /** Tier to assign to a financial account */
        fun tier(tier: Optional<String>) = tier(tier.orElse(null))

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

        fun build(): FinancialAccountCreditConfigurationUpdateParams =
            FinancialAccountCreditConfigurationUpdateParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountCreditConfigurationUpdateParams && financialAccountToken == other.financialAccountToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FinancialAccountCreditConfigurationUpdateParams{financialAccountToken=$financialAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
