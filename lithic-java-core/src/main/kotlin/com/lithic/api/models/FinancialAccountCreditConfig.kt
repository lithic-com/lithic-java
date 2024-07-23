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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FinancialAccountCreditConfig = apply {
        if (!validated) {
            accountToken()
            creditLimit()
            externalBankAccountToken()
            creditProductToken()
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
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FinancialAccountCreditConfig{accountToken=$accountToken, creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, creditProductToken=$creditProductToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
            this.accountToken = financialAccountCreditConfig.accountToken
            this.creditLimit = financialAccountCreditConfig.creditLimit
            this.externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
            this.creditProductToken = financialAccountCreditConfig.creditProductToken
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
                additionalProperties.toUnmodifiable(),
            )
    }
}
