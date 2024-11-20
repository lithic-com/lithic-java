// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FinancialAccountCreditConfigurationUpdateParams
constructor(
    private val financialAccountToken: String,
    private val creditLimit: Long?,
    private val creditProductToken: String?,
    private val externalBankAccountToken: String?,
    private val tier: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit)

    fun creditProductToken(): Optional<String> = Optional.ofNullable(creditProductToken)

    fun externalBankAccountToken(): Optional<String> = Optional.ofNullable(externalBankAccountToken)

    fun tier(): Optional<String> = Optional.ofNullable(tier)

    @JvmSynthetic
    internal fun getBody(): FinancialAccountCreditConfigurationUpdateBody {
        return FinancialAccountCreditConfigurationUpdateBody(
            creditLimit,
            creditProductToken,
            externalBankAccountToken,
            tier,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = FinancialAccountCreditConfigurationUpdateBody.Builder::class)
    @NoAutoDetect
    class FinancialAccountCreditConfigurationUpdateBody
    internal constructor(
        private val creditLimit: Long?,
        private val creditProductToken: String?,
        private val externalBankAccountToken: String?,
        private val tier: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("credit_limit") fun creditLimit(): Long? = creditLimit

        /** Globally unique identifier for the credit product */
        @JsonProperty("credit_product_token") fun creditProductToken(): String? = creditProductToken

        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): String? = externalBankAccountToken

        /** Tier to assign to a financial account */
        @JsonProperty("tier") fun tier(): String? = tier

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
                this.creditLimit = financialAccountCreditConfigurationUpdateBody.creditLimit
                this.creditProductToken =
                    financialAccountCreditConfigurationUpdateBody.creditProductToken
                this.externalBankAccountToken =
                    financialAccountCreditConfigurationUpdateBody.externalBankAccountToken
                this.tier = financialAccountCreditConfigurationUpdateBody.tier
                additionalProperties(
                    financialAccountCreditConfigurationUpdateBody.additionalProperties
                )
            }

            @JsonProperty("credit_limit")
            fun creditLimit(creditLimit: Long) = apply { this.creditLimit = creditLimit }

            /** Globally unique identifier for the credit product */
            @JsonProperty("credit_product_token")
            fun creditProductToken(creditProductToken: String) = apply {
                this.creditProductToken = creditProductToken
            }

            @JsonProperty("external_bank_account_token")
            fun externalBankAccountToken(externalBankAccountToken: String) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            /** Tier to assign to a financial account */
            @JsonProperty("tier") fun tier(tier: String) = apply { this.tier = tier }

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountCreditConfigurationUpdateParams && financialAccountToken == other.financialAccountToken && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && externalBankAccountToken == other.externalBankAccountToken && tier == other.tier && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountToken, creditLimit, creditProductToken, externalBankAccountToken, tier, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "FinancialAccountCreditConfigurationUpdateParams{financialAccountToken=$financialAccountToken, creditLimit=$creditLimit, creditProductToken=$creditProductToken, externalBankAccountToken=$externalBankAccountToken, tier=$tier, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var creditLimit: Long? = null
        private var creditProductToken: String? = null
        private var externalBankAccountToken: String? = null
        private var tier: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            financialAccountCreditConfigurationUpdateParams:
                FinancialAccountCreditConfigurationUpdateParams
        ) = apply {
            this.financialAccountToken =
                financialAccountCreditConfigurationUpdateParams.financialAccountToken
            this.creditLimit = financialAccountCreditConfigurationUpdateParams.creditLimit
            this.creditProductToken =
                financialAccountCreditConfigurationUpdateParams.creditProductToken
            this.externalBankAccountToken =
                financialAccountCreditConfigurationUpdateParams.externalBankAccountToken
            this.tier = financialAccountCreditConfigurationUpdateParams.tier
            additionalHeaders(financialAccountCreditConfigurationUpdateParams.additionalHeaders)
            additionalQueryParams(
                financialAccountCreditConfigurationUpdateParams.additionalQueryParams
            )
            additionalBodyProperties(
                financialAccountCreditConfigurationUpdateParams.additionalBodyProperties
            )
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun creditLimit(creditLimit: Long) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String) = apply {
            this.creditProductToken = creditProductToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Tier to assign to a financial account */
        fun tier(tier: String) = apply { this.tier = tier }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): FinancialAccountCreditConfigurationUpdateParams =
            FinancialAccountCreditConfigurationUpdateParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                creditLimit,
                creditProductToken,
                externalBankAccountToken,
                tier,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
