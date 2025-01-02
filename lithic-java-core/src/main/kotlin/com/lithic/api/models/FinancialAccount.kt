// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = FinancialAccount.Builder::class)
@NoAutoDetect
class FinancialAccount
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val routingNumber: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val nickname: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val isForBenefitOf: JsonField<Boolean>,
    private val creditConfiguration: JsonField<FinancialAccountCreditConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Globally unique identifier for the account */
    fun token(): String = token.getRequired("token")

    fun created(): OffsetDateTime = created.getRequired("created")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun type(): Type = type.getRequired("type")

    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    fun accountNumber(): Optional<String> =
        Optional.ofNullable(accountNumber.getNullable("account_number"))

    fun nickname(): Optional<String> = Optional.ofNullable(nickname.getNullable("nickname"))

    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /** Whether financial account is for the benefit of another entity */
    fun isForBenefitOf(): Boolean = isForBenefitOf.getRequired("is_for_benefit_of")

    fun creditConfiguration(): Optional<FinancialAccountCreditConfig> =
        Optional.ofNullable(creditConfiguration.getNullable("credit_configuration"))

    /** Globally unique identifier for the account */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("created") @ExcludeMissing fun _created() = created

    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    @JsonProperty("nickname") @ExcludeMissing fun _nickname() = nickname

    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** Whether financial account is for the benefit of another entity */
    @JsonProperty("is_for_benefit_of") @ExcludeMissing fun _isForBenefitOf() = isForBenefitOf

    @JsonProperty("credit_configuration")
    @ExcludeMissing
    fun _creditConfiguration() = creditConfiguration

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialAccount = apply {
        if (!validated) {
            token()
            created()
            updated()
            type()
            routingNumber()
            accountNumber()
            nickname()
            accountToken()
            isForBenefitOf()
            creditConfiguration().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var isForBenefitOf: JsonField<Boolean> = JsonMissing.of()
        private var creditConfiguration: JsonField<FinancialAccountCreditConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccount: FinancialAccount) = apply {
            token = financialAccount.token
            created = financialAccount.created
            updated = financialAccount.updated
            type = financialAccount.type
            routingNumber = financialAccount.routingNumber
            accountNumber = financialAccount.accountNumber
            nickname = financialAccount.nickname
            accountToken = financialAccount.accountToken
            isForBenefitOf = financialAccount.isForBenefitOf
            creditConfiguration = financialAccount.creditConfiguration
            additionalProperties = financialAccount.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        @JsonProperty("nickname")
        @ExcludeMissing
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Whether financial account is for the benefit of another entity */
        fun isForBenefitOf(isForBenefitOf: Boolean) = isForBenefitOf(JsonField.of(isForBenefitOf))

        /** Whether financial account is for the benefit of another entity */
        @JsonProperty("is_for_benefit_of")
        @ExcludeMissing
        fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
            this.isForBenefitOf = isForBenefitOf
        }

        fun creditConfiguration(creditConfiguration: FinancialAccountCreditConfig) =
            creditConfiguration(JsonField.of(creditConfiguration))

        @JsonProperty("credit_configuration")
        @ExcludeMissing
        fun creditConfiguration(creditConfiguration: JsonField<FinancialAccountCreditConfig>) =
            apply {
                this.creditConfiguration = creditConfiguration
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): FinancialAccount =
            FinancialAccount(
                token,
                created,
                updated,
                type,
                routingNumber,
                accountNumber,
                nickname,
                accountToken,
                isForBenefitOf,
                creditConfiguration,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = FinancialAccountCreditConfig.Builder::class)
    @NoAutoDetect
    class FinancialAccountCreditConfig
    private constructor(
        private val creditLimit: JsonField<Long>,
        private val externalBankAccountToken: JsonField<String>,
        private val creditProductToken: JsonField<String>,
        private val tier: JsonField<String>,
        private val isSpendBlocked: JsonField<Boolean>,
        private val financialAccountState: JsonField<FinancialAccountState>,
        private val chargedOffReason: JsonField<ChargedOffReason>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun creditLimit(): Optional<Long> =
            Optional.ofNullable(creditLimit.getNullable("credit_limit"))

        fun externalBankAccountToken(): Optional<String> =
            Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

        /** Globally unique identifier for the credit product */
        fun creditProductToken(): Optional<String> =
            Optional.ofNullable(creditProductToken.getNullable("credit_product_token"))

        /** Tier assigned to the financial account */
        fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

        fun isSpendBlocked(): Boolean = isSpendBlocked.getRequired("is_spend_blocked")

        /** State of the financial account */
        fun financialAccountState(): Optional<FinancialAccountState> =
            Optional.ofNullable(financialAccountState.getNullable("financial_account_state"))

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(): Optional<ChargedOffReason> =
            Optional.ofNullable(chargedOffReason.getNullable("charged_off_reason"))

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

        @JsonProperty("is_spend_blocked") @ExcludeMissing fun _isSpendBlocked() = isSpendBlocked

        /** State of the financial account */
        @JsonProperty("financial_account_state")
        @ExcludeMissing
        fun _financialAccountState() = financialAccountState

        /** Reason for the financial account being marked as Charged Off */
        @JsonProperty("charged_off_reason")
        @ExcludeMissing
        fun _chargedOffReason() = chargedOffReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FinancialAccountCreditConfig = apply {
            if (!validated) {
                creditLimit()
                externalBankAccountToken()
                creditProductToken()
                tier()
                isSpendBlocked()
                financialAccountState()
                chargedOffReason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditLimit: JsonField<Long> = JsonMissing.of()
            private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
            private var creditProductToken: JsonField<String> = JsonMissing.of()
            private var tier: JsonField<String> = JsonMissing.of()
            private var isSpendBlocked: JsonField<Boolean> = JsonMissing.of()
            private var financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of()
            private var chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
                creditLimit = financialAccountCreditConfig.creditLimit
                externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
                creditProductToken = financialAccountCreditConfig.creditProductToken
                tier = financialAccountCreditConfig.tier
                isSpendBlocked = financialAccountCreditConfig.isSpendBlocked
                financialAccountState = financialAccountCreditConfig.financialAccountState
                chargedOffReason = financialAccountCreditConfig.chargedOffReason
                additionalProperties =
                    financialAccountCreditConfig.additionalProperties.toMutableMap()
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

            fun isSpendBlocked(isSpendBlocked: Boolean) =
                isSpendBlocked(JsonField.of(isSpendBlocked))

            @JsonProperty("is_spend_blocked")
            @ExcludeMissing
            fun isSpendBlocked(isSpendBlocked: JsonField<Boolean>) = apply {
                this.isSpendBlocked = isSpendBlocked
            }

            /** State of the financial account */
            fun financialAccountState(financialAccountState: FinancialAccountState) =
                financialAccountState(JsonField.of(financialAccountState))

            /** State of the financial account */
            @JsonProperty("financial_account_state")
            @ExcludeMissing
            fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) =
                apply {
                    this.financialAccountState = financialAccountState
                }

            /** Reason for the financial account being marked as Charged Off */
            fun chargedOffReason(chargedOffReason: ChargedOffReason) =
                chargedOffReason(JsonField.of(chargedOffReason))

            /** Reason for the financial account being marked as Charged Off */
            @JsonProperty("charged_off_reason")
            @ExcludeMissing
            fun chargedOffReason(chargedOffReason: JsonField<ChargedOffReason>) = apply {
                this.chargedOffReason = chargedOffReason
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    creditLimit,
                    externalBankAccountToken,
                    creditProductToken,
                    tier,
                    isSpendBlocked,
                    financialAccountState,
                    chargedOffReason,
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
                    else ->
                        throw LithicInvalidDataException("Unknown FinancialAccountState: $value")
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

            return /* spotless:off */ other is FinancialAccountCreditConfig && creditLimit == other.creditLimit && externalBankAccountToken == other.externalBankAccountToken && creditProductToken == other.creditProductToken && tier == other.tier && isSpendBlocked == other.isSpendBlocked && financialAccountState == other.financialAccountState && chargedOffReason == other.chargedOffReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditLimit, externalBankAccountToken, creditProductToken, tier, isSpendBlocked, financialAccountState, chargedOffReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialAccountCreditConfig{creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, creditProductToken=$creditProductToken, tier=$tier, isSpendBlocked=$isSpendBlocked, financialAccountState=$financialAccountState, chargedOffReason=$chargedOffReason, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ISSUING = of("ISSUING")

            @JvmField val RESERVE = of("RESERVE")

            @JvmField val OPERATING = of("OPERATING")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ISSUING,
            RESERVE,
            OPERATING,
        }

        enum class Value {
            ISSUING,
            RESERVE,
            OPERATING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                RESERVE -> Value.RESERVE
                OPERATING -> Value.OPERATING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                RESERVE -> Known.RESERVE
                OPERATING -> Known.OPERATING
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccount && token == other.token && created == other.created && updated == other.updated && type == other.type && routingNumber == other.routingNumber && accountNumber == other.accountNumber && nickname == other.nickname && accountToken == other.accountToken && isForBenefitOf == other.isForBenefitOf && creditConfiguration == other.creditConfiguration && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, updated, type, routingNumber, accountNumber, nickname, accountToken, isForBenefitOf, creditConfiguration, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccount{token=$token, created=$created, updated=$updated, type=$type, routingNumber=$routingNumber, accountNumber=$accountNumber, nickname=$nickname, accountToken=$accountToken, isForBenefitOf=$isForBenefitOf, creditConfiguration=$creditConfiguration, additionalProperties=$additionalProperties}"
}
