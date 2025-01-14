// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class FinancialAccountCreditConfig
@JsonCreator
private constructor(
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("charged_off_reason")
    @ExcludeMissing
    private val chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of(),
    @JsonProperty("credit_limit")
    @ExcludeMissing
    private val creditLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    private val creditProductToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    private val financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of(),
    @JsonProperty("is_spend_blocked")
    @ExcludeMissing
    private val isSpendBlocked: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("tier") @ExcludeMissing private val tier: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** Reason for the financial account being marked as Charged Off */
    fun chargedOffReason(): Optional<ChargedOffReason> =
        Optional.ofNullable(chargedOffReason.getNullable("charged_off_reason"))

    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit.getNullable("credit_limit"))

    /** Globally unique identifier for the credit product */
    fun creditProductToken(): Optional<String> =
        Optional.ofNullable(creditProductToken.getNullable("credit_product_token"))

    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    /** State of the financial account */
    fun financialAccountState(): FinancialAccountState =
        financialAccountState.getRequired("financial_account_state")

    fun isSpendBlocked(): Boolean = isSpendBlocked.getRequired("is_spend_blocked")

    /** Tier assigned to the financial account */
    fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

    /** Globally unique identifier for the account */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /** Reason for the financial account being marked as Charged Off */
    @JsonProperty("charged_off_reason")
    @ExcludeMissing
    fun _chargedOffReason(): JsonField<ChargedOffReason> = chargedOffReason

    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /** Globally unique identifier for the credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

    /** State of the financial account */
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    fun _financialAccountState(): JsonField<FinancialAccountState> = financialAccountState

    @JsonProperty("is_spend_blocked")
    @ExcludeMissing
    fun _isSpendBlocked(): JsonField<Boolean> = isSpendBlocked

    /** Tier assigned to the financial account */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialAccountCreditConfig = apply {
        if (validated) {
            return@apply
        }

        accountToken()
        chargedOffReason()
        creditLimit()
        creditProductToken()
        externalBankAccountToken()
        financialAccountState()
        isSpendBlocked()
        tier()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String>? = null
        private var chargedOffReason: JsonField<ChargedOffReason>? = null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var externalBankAccountToken: JsonField<String>? = null
        private var financialAccountState: JsonField<FinancialAccountState>? = null
        private var isSpendBlocked: JsonField<Boolean>? = null
        private var tier: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
            accountToken = financialAccountCreditConfig.accountToken
            chargedOffReason = financialAccountCreditConfig.chargedOffReason
            creditLimit = financialAccountCreditConfig.creditLimit
            creditProductToken = financialAccountCreditConfig.creditProductToken
            externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
            financialAccountState = financialAccountCreditConfig.financialAccountState
            isSpendBlocked = financialAccountCreditConfig.isSpendBlocked
            tier = financialAccountCreditConfig.tier
            additionalProperties = financialAccountCreditConfig.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: ChargedOffReason?) =
            chargedOffReason(JsonField.ofNullable(chargedOffReason))

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: Optional<ChargedOffReason>) =
            chargedOffReason(chargedOffReason.orElse(null))

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: JsonField<ChargedOffReason>) = apply {
            this.chargedOffReason = chargedOffReason
        }

        fun creditLimit(creditLimit: Long?) = creditLimit(JsonField.ofNullable(creditLimit))

        fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun creditLimit(creditLimit: Optional<Long>) =
            creditLimit(creditLimit.orElse(null) as Long?)

        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String?) =
            creditProductToken(JsonField.ofNullable(creditProductToken))

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: Optional<String>) =
            creditProductToken(creditProductToken.orElse(null))

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String?) =
            externalBankAccountToken(JsonField.ofNullable(externalBankAccountToken))

        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.orElse(null))

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** State of the financial account */
        fun financialAccountState(financialAccountState: FinancialAccountState) =
            financialAccountState(JsonField.of(financialAccountState))

        /** State of the financial account */
        fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) = apply {
            this.financialAccountState = financialAccountState
        }

        fun isSpendBlocked(isSpendBlocked: Boolean) = isSpendBlocked(JsonField.of(isSpendBlocked))

        fun isSpendBlocked(isSpendBlocked: JsonField<Boolean>) = apply {
            this.isSpendBlocked = isSpendBlocked
        }

        /** Tier assigned to the financial account */
        fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

        /** Tier assigned to the financial account */
        fun tier(tier: Optional<String>) = tier(tier.orElse(null))

        /** Tier assigned to the financial account */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

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

        fun build(): FinancialAccountCreditConfig =
            FinancialAccountCreditConfig(
                checkRequired("accountToken", accountToken),
                checkRequired("chargedOffReason", chargedOffReason),
                checkRequired("creditLimit", creditLimit),
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("externalBankAccountToken", externalBankAccountToken),
                checkRequired("financialAccountState", financialAccountState),
                checkRequired("isSpendBlocked", isSpendBlocked),
                checkRequired("tier", tier),
                additionalProperties.toImmutable(),
            )
    }

    class ChargedOffReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DELINQUENT = of("DELINQUENT")

            @JvmField val FRAUD = of("FRAUD")

            @JvmStatic fun of(value: String) = ChargedOffReason(JsonField.of(value))
        }

        enum class Known {
            DELINQUENT,
            FRAUD,
        }

        enum class Value {
            DELINQUENT,
            FRAUD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DELINQUENT -> Value.DELINQUENT
                FRAUD -> Value.FRAUD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DELINQUENT -> Known.DELINQUENT
                FRAUD -> Known.FRAUD
                else -> throw LithicInvalidDataException("Unknown ChargedOffReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargedOffReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class FinancialAccountState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val CURRENT = of("CURRENT")

            @JvmField val DELINQUENT = of("DELINQUENT")

            @JvmField val CHARGED_OFF = of("CHARGED_OFF")

            @JvmStatic fun of(value: String) = FinancialAccountState(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            CURRENT,
            DELINQUENT,
            CHARGED_OFF,
        }

        enum class Value {
            PENDING,
            CURRENT,
            DELINQUENT,
            CHARGED_OFF,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                CURRENT -> Value.CURRENT
                DELINQUENT -> Value.DELINQUENT
                CHARGED_OFF -> Value.CHARGED_OFF
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                CURRENT -> Known.CURRENT
                DELINQUENT -> Known.DELINQUENT
                CHARGED_OFF -> Known.CHARGED_OFF
                else -> throw LithicInvalidDataException("Unknown FinancialAccountState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountCreditConfig && accountToken == other.accountToken && chargedOffReason == other.chargedOffReason && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && externalBankAccountToken == other.externalBankAccountToken && financialAccountState == other.financialAccountState && isSpendBlocked == other.isSpendBlocked && tier == other.tier && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountToken, chargedOffReason, creditLimit, creditProductToken, externalBankAccountToken, financialAccountState, isSpendBlocked, tier, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccountCreditConfig{accountToken=$accountToken, chargedOffReason=$chargedOffReason, creditLimit=$creditLimit, creditProductToken=$creditProductToken, externalBankAccountToken=$externalBankAccountToken, financialAccountState=$financialAccountState, isSpendBlocked=$isSpendBlocked, tier=$tier, additionalProperties=$additionalProperties}"
}
