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
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<FinancialAccountStatus> = JsonMissing.of(),
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
    @JsonProperty("status_change_reason")
    @ExcludeMissing
    private val statusChangeReason: JsonField<FinancialAccountStatusChangeReason> =
        JsonMissing.of(),
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

    /** Status of the financial account */
    fun status(): FinancialAccountStatus = status.getRequired("status")

    fun type(): Type = type.getRequired("type")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun accountNumber(): Optional<String> =
        Optional.ofNullable(accountNumber.getNullable("account_number"))

    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    /** Reason for the financial account status change */
    fun statusChangeReason(): Optional<FinancialAccountStatusChangeReason> =
        Optional.ofNullable(statusChangeReason.getNullable("status_change_reason"))

    /** Globally unique identifier for the account */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("credit_configuration")
    @ExcludeMissing
    fun _creditConfiguration(): JsonField<FinancialAccountCreditConfig> = creditConfiguration

    /** Whether financial account is for the benefit of another entity */
    @JsonProperty("is_for_benefit_of")
    @ExcludeMissing
    fun _isForBenefitOf(): JsonField<Boolean> = isForBenefitOf

    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /** Status of the financial account */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<FinancialAccountStatus> = status

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** Reason for the financial account status change */
    @JsonProperty("status_change_reason")
    @ExcludeMissing
    fun _statusChangeReason(): JsonField<FinancialAccountStatusChangeReason> = statusChangeReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialAccount = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        created()
        creditConfiguration().ifPresent { it.validate() }
        isForBenefitOf()
        nickname()
        status()
        type()
        updated()
        accountNumber()
        routingNumber()
        statusChangeReason()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FinancialAccount].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .created()
         * .creditConfiguration()
         * .isForBenefitOf()
         * .nickname()
         * .status()
         * .type()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccount]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditConfiguration: JsonField<FinancialAccountCreditConfig>? = null
        private var isForBenefitOf: JsonField<Boolean>? = null
        private var nickname: JsonField<String>? = null
        private var status: JsonField<FinancialAccountStatus>? = null
        private var type: JsonField<Type>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var statusChangeReason: JsonField<FinancialAccountStatusChangeReason> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccount: FinancialAccount) = apply {
            token = financialAccount.token
            accountToken = financialAccount.accountToken
            created = financialAccount.created
            creditConfiguration = financialAccount.creditConfiguration
            isForBenefitOf = financialAccount.isForBenefitOf
            nickname = financialAccount.nickname
            status = financialAccount.status
            type = financialAccount.type
            updated = financialAccount.updated
            accountNumber = financialAccount.accountNumber
            routingNumber = financialAccount.routingNumber
            statusChangeReason = financialAccount.statusChangeReason
            additionalProperties = financialAccount.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountToken(accountToken: String?) = accountToken(JsonField.ofNullable(accountToken))

        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.orElse(null))

        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun creditConfiguration(creditConfiguration: FinancialAccountCreditConfig?) =
            creditConfiguration(JsonField.ofNullable(creditConfiguration))

        fun creditConfiguration(creditConfiguration: Optional<FinancialAccountCreditConfig>) =
            creditConfiguration(creditConfiguration.orElse(null))

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

        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        fun nickname(nickname: Optional<String>) = nickname(nickname.orElse(null))

        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Status of the financial account */
        fun status(status: FinancialAccountStatus) = status(JsonField.of(status))

        /** Status of the financial account */
        fun status(status: JsonField<FinancialAccountStatus>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun accountNumber(accountNumber: String?) =
            accountNumber(JsonField.ofNullable(accountNumber))

        fun accountNumber(accountNumber: Optional<String>) =
            accountNumber(accountNumber.orElse(null))

        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun routingNumber(routingNumber: String?) =
            routingNumber(JsonField.ofNullable(routingNumber))

        fun routingNumber(routingNumber: Optional<String>) =
            routingNumber(routingNumber.orElse(null))

        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** Reason for the financial account status change */
        fun statusChangeReason(statusChangeReason: FinancialAccountStatusChangeReason?) =
            statusChangeReason(JsonField.ofNullable(statusChangeReason))

        /** Reason for the financial account status change */
        fun statusChangeReason(statusChangeReason: Optional<FinancialAccountStatusChangeReason>) =
            statusChangeReason(statusChangeReason.orElse(null))

        /** Reason for the financial account status change */
        fun statusChangeReason(statusChangeReason: JsonField<FinancialAccountStatusChangeReason>) =
            apply {
                this.statusChangeReason = statusChangeReason
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
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("created", created),
                checkRequired("creditConfiguration", creditConfiguration),
                checkRequired("isForBenefitOf", isForBenefitOf),
                checkRequired("nickname", nickname),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("updated", updated),
                accountNumber,
                routingNumber,
                statusChangeReason,
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
        fun _chargedOffReason(): JsonField<ChargedOffReason> = chargedOffReason

        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun _creditLimit(): JsonField<Long> = creditLimit

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [FinancialAccountCreditConfig].
             *
             * The following fields are required:
             * ```java
             * .chargedOffReason()
             * .creditLimit()
             * .creditProductToken()
             * .externalBankAccountToken()
             * .financialAccountState()
             * .isSpendBlocked()
             * .tier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FinancialAccountCreditConfig]. */
        class Builder internal constructor() {

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
            fun financialAccountState(financialAccountState: FinancialAccountState?) =
                financialAccountState(JsonField.ofNullable(financialAccountState))

            /** State of the financial account */
            fun financialAccountState(financialAccountState: Optional<FinancialAccountState>) =
                financialAccountState(financialAccountState.orElse(null))

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

        /** Reason for the financial account being marked as Charged Off */
        class ChargedOffReason
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DELINQUENT = of("DELINQUENT")

                @JvmField val FRAUD = of("FRAUD")

                @JvmStatic fun of(value: String) = ChargedOffReason(JsonField.of(value))
            }

            /** An enum containing [ChargedOffReason]'s known values. */
            enum class Known {
                DELINQUENT,
                FRAUD,
            }

            /**
             * An enum containing [ChargedOffReason]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ChargedOffReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DELINQUENT,
                FRAUD,
                /**
                 * An enum member indicating that [ChargedOffReason] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DELINQUENT -> Value.DELINQUENT
                    FRAUD -> Value.FRAUD
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DELINQUENT -> Known.DELINQUENT
                    FRAUD -> Known.FRAUD
                    else -> throw LithicInvalidDataException("Unknown ChargedOffReason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChargedOffReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** State of the financial account */
        class FinancialAccountState
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("PENDING")

                @JvmField val CURRENT = of("CURRENT")

                @JvmField val DELINQUENT = of("DELINQUENT")

                @JvmField val CHARGED_OFF = of("CHARGED_OFF")

                @JvmStatic fun of(value: String) = FinancialAccountState(JsonField.of(value))
            }

            /** An enum containing [FinancialAccountState]'s known values. */
            enum class Known {
                PENDING,
                CURRENT,
                DELINQUENT,
                CHARGED_OFF,
            }

            /**
             * An enum containing [FinancialAccountState]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [FinancialAccountState] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                CURRENT,
                DELINQUENT,
                CHARGED_OFF,
                /**
                 * An enum member indicating that [FinancialAccountState] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    CURRENT -> Value.CURRENT
                    DELINQUENT -> Value.DELINQUENT
                    CHARGED_OFF -> Value.CHARGED_OFF
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    CURRENT -> Known.CURRENT
                    DELINQUENT -> Known.DELINQUENT
                    CHARGED_OFF -> Known.CHARGED_OFF
                    else ->
                        throw LithicInvalidDataException("Unknown FinancialAccountState: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

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

    /** Status of the financial account */
    class FinancialAccountStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPEN = of("OPEN")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val SUSPENDED = of("SUSPENDED")

            @JvmField val PENDING = of("PENDING")

            @JvmStatic fun of(value: String) = FinancialAccountStatus(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountStatus]'s known values. */
        enum class Known {
            OPEN,
            CLOSED,
            SUSPENDED,
            PENDING,
        }

        /**
         * An enum containing [FinancialAccountStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FinancialAccountStatus] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            CLOSED,
            SUSPENDED,
            PENDING,
            /**
             * An enum member indicating that [FinancialAccountStatus] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
                SUSPENDED -> Value.SUSPENDED
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
                SUSPENDED -> Known.SUSPENDED
                PENDING -> Known.PENDING
                else -> throw LithicInvalidDataException("Unknown FinancialAccountStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ISSUING = of("ISSUING")

            @JvmField val RESERVE = of("RESERVE")

            @JvmField val OPERATING = of("OPERATING")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ISSUING,
            RESERVE,
            OPERATING,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUING,
            RESERVE,
            OPERATING,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                RESERVE -> Value.RESERVE
                OPERATING -> Value.OPERATING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                RESERVE -> Known.RESERVE
                OPERATING -> Known.OPERATING
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Reason for the financial account status change */
    class FinancialAccountStatusChangeReason
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHARGED_OFF_DELINQUENT = of("CHARGED_OFF_DELINQUENT")

            @JvmField val CHARGED_OFF_FRAUD = of("CHARGED_OFF_FRAUD")

            @JvmField val END_USER_REQUEST = of("END_USER_REQUEST")

            @JvmField val BANK_REQUEST = of("BANK_REQUEST")

            @JvmField val DELINQUENT = of("DELINQUENT")

            @JvmStatic
            fun of(value: String) = FinancialAccountStatusChangeReason(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountStatusChangeReason]'s known values. */
        enum class Known {
            CHARGED_OFF_DELINQUENT,
            CHARGED_OFF_FRAUD,
            END_USER_REQUEST,
            BANK_REQUEST,
            DELINQUENT,
        }

        /**
         * An enum containing [FinancialAccountStatusChangeReason]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [FinancialAccountStatusChangeReason] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHARGED_OFF_DELINQUENT,
            CHARGED_OFF_FRAUD,
            END_USER_REQUEST,
            BANK_REQUEST,
            DELINQUENT,
            /**
             * An enum member indicating that [FinancialAccountStatusChangeReason] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CHARGED_OFF_DELINQUENT -> Value.CHARGED_OFF_DELINQUENT
                CHARGED_OFF_FRAUD -> Value.CHARGED_OFF_FRAUD
                END_USER_REQUEST -> Value.END_USER_REQUEST
                BANK_REQUEST -> Value.BANK_REQUEST
                DELINQUENT -> Value.DELINQUENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CHARGED_OFF_DELINQUENT -> Known.CHARGED_OFF_DELINQUENT
                CHARGED_OFF_FRAUD -> Known.CHARGED_OFF_FRAUD
                END_USER_REQUEST -> Known.END_USER_REQUEST
                BANK_REQUEST -> Known.BANK_REQUEST
                DELINQUENT -> Known.DELINQUENT
                else ->
                    throw LithicInvalidDataException(
                        "Unknown FinancialAccountStatusChangeReason: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountStatusChangeReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccount && token == other.token && accountToken == other.accountToken && created == other.created && creditConfiguration == other.creditConfiguration && isForBenefitOf == other.isForBenefitOf && nickname == other.nickname && status == other.status && type == other.type && updated == other.updated && accountNumber == other.accountNumber && routingNumber == other.routingNumber && statusChangeReason == other.statusChangeReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, created, creditConfiguration, isForBenefitOf, nickname, status, type, updated, accountNumber, routingNumber, statusChangeReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccount{token=$token, accountToken=$accountToken, created=$created, creditConfiguration=$creditConfiguration, isForBenefitOf=$isForBenefitOf, nickname=$nickname, status=$status, type=$type, updated=$updated, accountNumber=$accountNumber, routingNumber=$routingNumber, statusChangeReason=$statusChangeReason, additionalProperties=$additionalProperties}"
}
