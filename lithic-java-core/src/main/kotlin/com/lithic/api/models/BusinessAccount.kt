// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = BusinessAccount.Builder::class)
@NoAutoDetect
class BusinessAccount
private constructor(
    private val collectionsConfiguration: JsonField<AccountHolderCollectionsConfiguration>,
    private val creditLimit: JsonField<Long>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun collectionsConfiguration(): Optional<AccountHolderCollectionsConfiguration> =
        Optional.ofNullable(collectionsConfiguration.getNullable("collections_configuration"))

    /** Credit limit extended to the Account */
    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit.getNullable("credit_limit"))

    /** Account token */
    fun token(): String = token.getRequired("token")

    @JsonProperty("collections_configuration")
    @ExcludeMissing
    fun _collectionsConfiguration() = collectionsConfiguration

    /** Credit limit extended to the Account */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    /** Account token */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BusinessAccount = apply {
        if (!validated) {
            collectionsConfiguration().map { it.validate() }
            creditLimit()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessAccount &&
            this.collectionsConfiguration == other.collectionsConfiguration &&
            this.creditLimit == other.creditLimit &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    collectionsConfiguration,
                    creditLimit,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BusinessAccount{collectionsConfiguration=$collectionsConfiguration, creditLimit=$creditLimit, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var collectionsConfiguration: JsonField<AccountHolderCollectionsConfiguration> =
            JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(businessAccount: BusinessAccount) = apply {
            this.collectionsConfiguration = businessAccount.collectionsConfiguration
            this.creditLimit = businessAccount.creditLimit
            this.token = businessAccount.token
            additionalProperties(businessAccount.additionalProperties)
        }

        fun collectionsConfiguration(
            collectionsConfiguration: AccountHolderCollectionsConfiguration
        ) = collectionsConfiguration(JsonField.of(collectionsConfiguration))

        @JsonProperty("collections_configuration")
        @ExcludeMissing
        fun collectionsConfiguration(
            collectionsConfiguration: JsonField<AccountHolderCollectionsConfiguration>
        ) = apply { this.collectionsConfiguration = collectionsConfiguration }

        /** Credit limit extended to the Account */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /** Credit limit extended to the Account */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Account token */
        fun token(token: String) = token(JsonField.of(token))

        /** Account token */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): BusinessAccount =
            BusinessAccount(
                collectionsConfiguration,
                creditLimit,
                token,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AccountHolderCollectionsConfiguration.Builder::class)
    @NoAutoDetect
    class AccountHolderCollectionsConfiguration
    private constructor(
        private val billingPeriod: JsonField<Long>,
        private val externalBankAccountToken: JsonField<String>,
        private val paymentPeriod: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Number of days within the billing period */
        fun billingPeriod(): Long = billingPeriod.getRequired("billing_period")

        /** The external bank account token to use for auto-collections */
        fun externalBankAccountToken(): Optional<String> =
            Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

        /** Number of days after the billing period ends that a payment is required */
        fun paymentPeriod(): Long = paymentPeriod.getRequired("payment_period")

        /** Number of days within the billing period */
        @JsonProperty("billing_period") @ExcludeMissing fun _billingPeriod() = billingPeriod

        /** The external bank account token to use for auto-collections */
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun _externalBankAccountToken() = externalBankAccountToken

        /** Number of days after the billing period ends that a payment is required */
        @JsonProperty("payment_period") @ExcludeMissing fun _paymentPeriod() = paymentPeriod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountHolderCollectionsConfiguration = apply {
            if (!validated) {
                billingPeriod()
                externalBankAccountToken()
                paymentPeriod()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderCollectionsConfiguration &&
                this.billingPeriod == other.billingPeriod &&
                this.externalBankAccountToken == other.externalBankAccountToken &&
                this.paymentPeriod == other.paymentPeriod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        billingPeriod,
                        externalBankAccountToken,
                        paymentPeriod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderCollectionsConfiguration{billingPeriod=$billingPeriod, externalBankAccountToken=$externalBankAccountToken, paymentPeriod=$paymentPeriod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingPeriod: JsonField<Long> = JsonMissing.of()
            private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
            private var paymentPeriod: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountHolderCollectionsConfiguration: AccountHolderCollectionsConfiguration
            ) = apply {
                this.billingPeriod = accountHolderCollectionsConfiguration.billingPeriod
                this.externalBankAccountToken =
                    accountHolderCollectionsConfiguration.externalBankAccountToken
                this.paymentPeriod = accountHolderCollectionsConfiguration.paymentPeriod
                additionalProperties(accountHolderCollectionsConfiguration.additionalProperties)
            }

            /** Number of days within the billing period */
            fun billingPeriod(billingPeriod: Long) = billingPeriod(JsonField.of(billingPeriod))

            /** Number of days within the billing period */
            @JsonProperty("billing_period")
            @ExcludeMissing
            fun billingPeriod(billingPeriod: JsonField<Long>) = apply {
                this.billingPeriod = billingPeriod
            }

            /** The external bank account token to use for auto-collections */
            fun externalBankAccountToken(externalBankAccountToken: String) =
                externalBankAccountToken(JsonField.of(externalBankAccountToken))

            /** The external bank account token to use for auto-collections */
            @JsonProperty("external_bank_account_token")
            @ExcludeMissing
            fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            /** Number of days after the billing period ends that a payment is required */
            fun paymentPeriod(paymentPeriod: Long) = paymentPeriod(JsonField.of(paymentPeriod))

            /** Number of days after the billing period ends that a payment is required */
            @JsonProperty("payment_period")
            @ExcludeMissing
            fun paymentPeriod(paymentPeriod: JsonField<Long>) = apply {
                this.paymentPeriod = paymentPeriod
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

            fun build(): AccountHolderCollectionsConfiguration =
                AccountHolderCollectionsConfiguration(
                    billingPeriod,
                    externalBankAccountToken,
                    paymentPeriod,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
