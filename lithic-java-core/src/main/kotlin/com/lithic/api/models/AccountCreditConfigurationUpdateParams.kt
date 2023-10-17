// File generated from our OpenAPI spec by Stainless.

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

class AccountCreditConfigurationUpdateParams
constructor(
    private val accountToken: String,
    private val billingPeriod: Long?,
    private val creditLimit: Long?,
    private val externalBankAccountToken: String?,
    private val paymentPeriod: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountToken(): String = accountToken

    fun billingPeriod(): Optional<Long> = Optional.ofNullable(billingPeriod)

    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit)

    fun externalBankAccountToken(): Optional<String> = Optional.ofNullable(externalBankAccountToken)

    fun paymentPeriod(): Optional<Long> = Optional.ofNullable(paymentPeriod)

    @JvmSynthetic
    internal fun getBody(): AccountCreditConfigurationUpdateBody {
        return AccountCreditConfigurationUpdateBody(
            billingPeriod,
            creditLimit,
            externalBankAccountToken,
            paymentPeriod,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountCreditConfigurationUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountCreditConfigurationUpdateBody
    internal constructor(
        private val billingPeriod: Long?,
        private val creditLimit: Long?,
        private val externalBankAccountToken: String?,
        private val paymentPeriod: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Number of days within the billing period */
        @JsonProperty("billing_period") fun billingPeriod(): Long? = billingPeriod

        /** Credit limit extended to the Business Account */
        @JsonProperty("credit_limit") fun creditLimit(): Long? = creditLimit

        /** The external bank account token to use for auto-collections */
        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): String? = externalBankAccountToken

        /** Number of days after the billing period ends that a payment is required */
        @JsonProperty("payment_period") fun paymentPeriod(): Long? = paymentPeriod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountCreditConfigurationUpdateBody &&
                this.billingPeriod == other.billingPeriod &&
                this.creditLimit == other.creditLimit &&
                this.externalBankAccountToken == other.externalBankAccountToken &&
                this.paymentPeriod == other.paymentPeriod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        billingPeriod,
                        creditLimit,
                        externalBankAccountToken,
                        paymentPeriod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountCreditConfigurationUpdateBody{billingPeriod=$billingPeriod, creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, paymentPeriod=$paymentPeriod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingPeriod: Long? = null
            private var creditLimit: Long? = null
            private var externalBankAccountToken: String? = null
            private var paymentPeriod: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountCreditConfigurationUpdateBody: AccountCreditConfigurationUpdateBody
            ) = apply {
                this.billingPeriod = accountCreditConfigurationUpdateBody.billingPeriod
                this.creditLimit = accountCreditConfigurationUpdateBody.creditLimit
                this.externalBankAccountToken =
                    accountCreditConfigurationUpdateBody.externalBankAccountToken
                this.paymentPeriod = accountCreditConfigurationUpdateBody.paymentPeriod
                additionalProperties(accountCreditConfigurationUpdateBody.additionalProperties)
            }

            /** Number of days within the billing period */
            @JsonProperty("billing_period")
            fun billingPeriod(billingPeriod: Long) = apply { this.billingPeriod = billingPeriod }

            /** Credit limit extended to the Business Account */
            @JsonProperty("credit_limit")
            fun creditLimit(creditLimit: Long) = apply { this.creditLimit = creditLimit }

            /** The external bank account token to use for auto-collections */
            @JsonProperty("external_bank_account_token")
            fun externalBankAccountToken(externalBankAccountToken: String) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            /** Number of days after the billing period ends that a payment is required */
            @JsonProperty("payment_period")
            fun paymentPeriod(paymentPeriod: Long) = apply { this.paymentPeriod = paymentPeriod }

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

            fun build(): AccountCreditConfigurationUpdateBody =
                AccountCreditConfigurationUpdateBody(
                    billingPeriod,
                    creditLimit,
                    externalBankAccountToken,
                    paymentPeriod,
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

        return other is AccountCreditConfigurationUpdateParams &&
            this.accountToken == other.accountToken &&
            this.billingPeriod == other.billingPeriod &&
            this.creditLimit == other.creditLimit &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.paymentPeriod == other.paymentPeriod &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            billingPeriod,
            creditLimit,
            externalBankAccountToken,
            paymentPeriod,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountCreditConfigurationUpdateParams{accountToken=$accountToken, billingPeriod=$billingPeriod, creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, paymentPeriod=$paymentPeriod, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var billingPeriod: Long? = null
        private var creditLimit: Long? = null
        private var externalBankAccountToken: String? = null
        private var paymentPeriod: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountCreditConfigurationUpdateParams: AccountCreditConfigurationUpdateParams
        ) = apply {
            this.accountToken = accountCreditConfigurationUpdateParams.accountToken
            this.billingPeriod = accountCreditConfigurationUpdateParams.billingPeriod
            this.creditLimit = accountCreditConfigurationUpdateParams.creditLimit
            this.externalBankAccountToken =
                accountCreditConfigurationUpdateParams.externalBankAccountToken
            this.paymentPeriod = accountCreditConfigurationUpdateParams.paymentPeriod
            additionalQueryParams(accountCreditConfigurationUpdateParams.additionalQueryParams)
            additionalHeaders(accountCreditConfigurationUpdateParams.additionalHeaders)
            additionalBodyProperties(
                accountCreditConfigurationUpdateParams.additionalBodyProperties
            )
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /** Number of days within the billing period */
        fun billingPeriod(billingPeriod: Long) = apply { this.billingPeriod = billingPeriod }

        /** Credit limit extended to the Business Account */
        fun creditLimit(creditLimit: Long) = apply { this.creditLimit = creditLimit }

        /** The external bank account token to use for auto-collections */
        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Number of days after the billing period ends that a payment is required */
        fun paymentPeriod(paymentPeriod: Long) = apply { this.paymentPeriod = paymentPeriod }

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

        fun build(): AccountCreditConfigurationUpdateParams =
            AccountCreditConfigurationUpdateParams(
                checkNotNull(accountToken) { "`accountToken` is required but was not set" },
                billingPeriod,
                creditLimit,
                externalBankAccountToken,
                paymentPeriod,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
