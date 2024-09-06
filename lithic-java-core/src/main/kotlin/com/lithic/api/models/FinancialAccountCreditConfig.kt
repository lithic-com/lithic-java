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

@JsonDeserialize(builder = FinancialAccountCreditConfig.Builder::class)
@NoAutoDetect
class FinancialAccountCreditConfig
private constructor(
    private val accountToken: JsonField<String>,
    private val creditLimit: JsonField<Long>,
    private val externalBankAccountToken: JsonField<String>,
    private val creditProductToken: JsonField<String>,
    private val tier: JsonField<String>,
    private val financialAccountState: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account */
    fun accountToken(): String = accountToken.getRequired("account_token")

    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit.getNullable("credit_limit"))

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    /** Globally unique identifier for the credit product */
    fun creditProductToken(): Optional<String> =
        Optional.ofNullable(creditProductToken.getNullable("credit_product_token"))

    /** Tier assigned to the financial account */
    fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

    /** State of the financial account */
    fun financialAccountState(): Optional<String> =
        Optional.ofNullable(financialAccountState.getNullable("financial_account_state"))

    /** Globally unique identifier for the account */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    /** Globally unique identifier for the credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken() = creditProductToken

    /** Tier assigned to the financial account */
    @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

    /** State of the financial account */
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    fun _financialAccountState() = financialAccountState

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FinancialAccountCreditConfig = apply {
        if (!validated) {
            accountToken()
            creditLimit()
            externalBankAccountToken()
            creditProductToken()
            tier()
            financialAccountState()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountCreditConfig &&
            this.accountToken == other.accountToken &&
            this.creditLimit == other.creditLimit &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.creditProductToken == other.creditProductToken &&
            this.tier == other.tier &&
            this.financialAccountState == other.financialAccountState &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountToken,
                    creditLimit,
                    externalBankAccountToken,
                    creditProductToken,
                    tier,
                    financialAccountState,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FinancialAccountCreditConfig{accountToken=$accountToken, creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, creditProductToken=$creditProductToken, tier=$tier, financialAccountState=$financialAccountState, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<String> = JsonMissing.of()
        private var financialAccountState: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
            this.accountToken = financialAccountCreditConfig.accountToken
            this.creditLimit = financialAccountCreditConfig.creditLimit
            this.externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
            this.creditProductToken = financialAccountCreditConfig.creditProductToken
            this.tier = financialAccountCreditConfig.tier
            this.financialAccountState = financialAccountCreditConfig.financialAccountState
            additionalProperties(financialAccountCreditConfig.additionalProperties)
        }

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for the credit product */
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Tier assigned to the financial account */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /** Tier assigned to the financial account */
        @JsonProperty("tier")
        @ExcludeMissing
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        /** State of the financial account */
        fun financialAccountState(financialAccountState: String) =
            financialAccountState(JsonField.of(financialAccountState))

        /** State of the financial account */
        @JsonProperty("financial_account_state")
        @ExcludeMissing
        fun financialAccountState(financialAccountState: JsonField<String>) = apply {
            this.financialAccountState = financialAccountState
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

        fun build(): FinancialAccountCreditConfig =
            FinancialAccountCreditConfig(
                accountToken,
                creditLimit,
                externalBankAccountToken,
                creditProductToken,
                tier,
                financialAccountState,
                additionalProperties.toUnmodifiable(),
            )
    }
}