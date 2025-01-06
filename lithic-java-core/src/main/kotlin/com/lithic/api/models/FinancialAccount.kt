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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class FinancialAccount
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_configuration")
    @ExcludeMissing
    private val creditConfiguration: JsonField<FinancialAccountCreditConfig> = JsonMissing.of(),
    @JsonProperty("is_for_benefit_of")
    @ExcludeMissing
    private val isForBenefitOf: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("nickname")
    @ExcludeMissing
    private val nickname: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account */
    fun token(): String = token.getRequired("token")

    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    fun created(): OffsetDateTime = created.getRequired("created")

    fun creditConfiguration(): Optional<FinancialAccountCreditConfig> =
        Optional.ofNullable(creditConfiguration.getNullable("credit_configuration"))

    /** Whether financial account is for the benefit of another entity */
    fun isForBenefitOf(): Boolean = isForBenefitOf.getRequired("is_for_benefit_of")

    fun nickname(): Optional<String> = Optional.ofNullable(nickname.getNullable("nickname"))

    fun type(): Type = type.getRequired("type")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun accountNumber(): Optional<String> =
        Optional.ofNullable(accountNumber.getNullable("account_number"))

    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    /** Globally unique identifier for the account */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    @JsonProperty("created") @ExcludeMissing fun _created() = created

    @JsonProperty("credit_configuration")
    @ExcludeMissing
    fun _creditConfiguration() = creditConfiguration

    /** Whether financial account is for the benefit of another entity */
    @JsonProperty("is_for_benefit_of") @ExcludeMissing fun _isForBenefitOf() = isForBenefitOf

    @JsonProperty("nickname") @ExcludeMissing fun _nickname() = nickname

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialAccount = apply {
        if (!validated) {
            token()
            accountToken()
            created()
            creditConfiguration().map { it.validate() }
            isForBenefitOf()
            nickname()
            type()
            updated()
            accountNumber()
            routingNumber()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditConfiguration: JsonField<FinancialAccountCreditConfig> = JsonMissing.of()
        private var isForBenefitOf: JsonField<Boolean> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccount: FinancialAccount) = apply {
            token = financialAccount.token
            accountToken = financialAccount.accountToken
            created = financialAccount.created
            creditConfiguration = financialAccount.creditConfiguration
            isForBenefitOf = financialAccount.isForBenefitOf
            nickname = financialAccount.nickname
            type = financialAccount.type
            updated = financialAccount.updated
            accountNumber = financialAccount.accountNumber
            routingNumber = financialAccount.routingNumber
            additionalProperties = financialAccount.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun creditConfiguration(creditConfiguration: FinancialAccountCreditConfig) =
            creditConfiguration(JsonField.of(creditConfiguration))

        fun creditConfiguration(creditConfiguration: JsonField<FinancialAccountCreditConfig>) =
            apply {
                this.creditConfiguration = creditConfiguration
            }

        /** Whether financial account is for the benefit of another entity */
        fun isForBenefitOf(isForBenefitOf: Boolean) = isForBenefitOf(JsonField.of(isForBenefitOf))

        /** Whether financial account is for the benefit of another entity */
        fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
            this.isForBenefitOf = isForBenefitOf
        }

        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

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

        fun build(): FinancialAccount =
            FinancialAccount(
                token,
                accountToken,
                created,
                creditConfiguration,
                isForBenefitOf,
                nickname,
                type,
                updated,
                accountNumber,
                routingNumber,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class FinancialAccountCreditConfig
    @JsonCreator
    private constructor(
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
        @JsonProperty("tier")
        @ExcludeMissing
        private val tier: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(): Optional<ChargedOffReason> =
            Optional.ofNullable(chargedOffReason.getNullable("charged_off_reason"))

        fun creditLimit(): Optional<Long> =
            Optional.ofNullable(creditLimit.getNullable("credit_limit"))

        /** Globally unique identifier for the credit product */
        fun creditProductToken(): Optional<String> =
            Optional.ofNullable(creditProductToken.getNullable("credit_product_token"))

        fun externalBankAccountToken(): Optional<String> =
            Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

        /** State of the financial account */
        fun financialAccountState(): Optional<FinancialAccountState> =
            Optional.ofNullable(financialAccountState.getNullable("financial_account_state"))

        fun isSpendBlocked(): Boolean = isSpendBlocked.getRequired("is_spend_blocked")

        /** Tier assigned to the financial account */
        fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

        /** Reason for the financial account being marked as Charged Off */
        @JsonProperty("charged_off_reason")
        @ExcludeMissing
        fun _chargedOffReason() = chargedOffReason

        @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

        /** Globally unique identifier for the credit product */
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        fun _creditProductToken() = creditProductToken

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun _externalBankAccountToken() = externalBankAccountToken

        /** State of the financial account */
        @JsonProperty("financial_account_state")
        @ExcludeMissing
        fun _financialAccountState() = financialAccountState

        @JsonProperty("is_spend_blocked") @ExcludeMissing fun _isSpendBlocked() = isSpendBlocked

        /** Tier assigned to the financial account */
        @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FinancialAccountCreditConfig = apply {
            if (!validated) {
                chargedOffReason()
                creditLimit()
                creditProductToken()
                externalBankAccountToken()
                financialAccountState()
                isSpendBlocked()
                tier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of()
            private var creditLimit: JsonField<Long> = JsonMissing.of()
            private var creditProductToken: JsonField<String> = JsonMissing.of()
            private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
            private var financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of()
            private var isSpendBlocked: JsonField<Boolean> = JsonMissing.of()
            private var tier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
                chargedOffReason = financialAccountCreditConfig.chargedOffReason
                creditLimit = financialAccountCreditConfig.creditLimit
                creditProductToken = financialAccountCreditConfig.creditProductToken
                externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
                financialAccountState = financialAccountCreditConfig.financialAccountState
                isSpendBlocked = financialAccountCreditConfig.isSpendBlocked
                tier = financialAccountCreditConfig.tier
                additionalProperties =
                    financialAccountCreditConfig.additionalProperties.toMutableMap()
            }

            /** Reason for the financial account being marked as Charged Off */
            fun chargedOffReason(chargedOffReason: ChargedOffReason) =
                chargedOffReason(JsonField.of(chargedOffReason))

            /** Reason for the financial account being marked as Charged Off */
            fun chargedOffReason(chargedOffReason: JsonField<ChargedOffReason>) = apply {
                this.chargedOffReason = chargedOffReason
            }

            fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

            fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

            /** Globally unique identifier for the credit product */
            fun creditProductToken(creditProductToken: String) =
                creditProductToken(JsonField.of(creditProductToken))

            /** Globally unique identifier for the credit product */
            fun creditProductToken(creditProductToken: JsonField<String>) = apply {
                this.creditProductToken = creditProductToken
            }

            fun externalBankAccountToken(externalBankAccountToken: String) =
                externalBankAccountToken(JsonField.of(externalBankAccountToken))

            fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            /** State of the financial account */
            fun financialAccountState(financialAccountState: FinancialAccountState) =
                financialAccountState(JsonField.of(financialAccountState))

            /** State of the financial account */
            fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) =
                apply {
                    this.financialAccountState = financialAccountState
                }

            fun isSpendBlocked(isSpendBlocked: Boolean) =
                isSpendBlocked(JsonField.of(isSpendBlocked))

            fun isSpendBlocked(isSpendBlocked: JsonField<Boolean>) = apply {
                this.isSpendBlocked = isSpendBlocked
            }

            /** Tier assigned to the financial account */
            fun tier(tier: String) = tier(JsonField.of(tier))

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
                    chargedOffReason,
                    creditLimit,
                    creditProductToken,
                    externalBankAccountToken,
                    financialAccountState,
                    isSpendBlocked,
                    tier,
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

            return /* spotless:off */ other is FinancialAccountCreditConfig && chargedOffReason == other.chargedOffReason && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && externalBankAccountToken == other.externalBankAccountToken && financialAccountState == other.financialAccountState && isSpendBlocked == other.isSpendBlocked && tier == other.tier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(chargedOffReason, creditLimit, creditProductToken, externalBankAccountToken, financialAccountState, isSpendBlocked, tier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialAccountCreditConfig{chargedOffReason=$chargedOffReason, creditLimit=$creditLimit, creditProductToken=$creditProductToken, externalBankAccountToken=$externalBankAccountToken, financialAccountState=$financialAccountState, isSpendBlocked=$isSpendBlocked, tier=$tier, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is FinancialAccount && token == other.token && accountToken == other.accountToken && created == other.created && creditConfiguration == other.creditConfiguration && isForBenefitOf == other.isForBenefitOf && nickname == other.nickname && type == other.type && updated == other.updated && accountNumber == other.accountNumber && routingNumber == other.routingNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, created, creditConfiguration, isForBenefitOf, nickname, type, updated, accountNumber, routingNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccount{token=$token, accountToken=$accountToken, created=$created, creditConfiguration=$creditConfiguration, isForBenefitOf=$isForBenefitOf, nickname=$nickname, type=$type, updated=$updated, accountNumber=$accountNumber, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
}
