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
import kotlin.jvm.optionals.getOrNull

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

    /**
     * Globally unique identifier for the account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Reason for the financial account being marked as Charged Off
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chargedOffReason(): Optional<ChargedOffReason> =
        Optional.ofNullable(chargedOffReason.getNullable("charged_off_reason"))

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditLimit(): Optional<Long> = Optional.ofNullable(creditLimit.getNullable("credit_limit"))

    /**
     * Globally unique identifier for the credit product
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditProductToken(): Optional<String> =
        Optional.ofNullable(creditProductToken.getNullable("credit_product_token"))

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalBankAccountToken(): Optional<String> =
        Optional.ofNullable(externalBankAccountToken.getNullable("external_bank_account_token"))

    /**
     * State of the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountState(): FinancialAccountState =
        financialAccountState.getRequired("financial_account_state")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSpendBlocked(): Boolean = isSpendBlocked.getRequired("is_spend_blocked")

    /**
     * Tier assigned to the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [chargedOffReason].
     *
     * Unlike [chargedOffReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("charged_off_reason")
    @ExcludeMissing
    fun _chargedOffReason(): JsonField<ChargedOffReason> = chargedOffReason

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /**
     * Returns the raw JSON value of [creditProductToken].
     *
     * Unlike [creditProductToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /**
     * Returns the raw JSON value of [externalBankAccountToken].
     *
     * Unlike [externalBankAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

    /**
     * Returns the raw JSON value of [financialAccountState].
     *
     * Unlike [financialAccountState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    fun _financialAccountState(): JsonField<FinancialAccountState> = financialAccountState

    /**
     * Returns the raw JSON value of [isSpendBlocked].
     *
     * Unlike [isSpendBlocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_spend_blocked")
    @ExcludeMissing
    fun _isSpendBlocked(): JsonField<Boolean> = isSpendBlocked

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * Returns a mutable builder for constructing an instance of [FinancialAccountCreditConfig].
         *
         * The following fields are required:
         * ```java
         * .accountToken()
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

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: ChargedOffReason?) =
            chargedOffReason(JsonField.ofNullable(chargedOffReason))

        /** Alias for calling [Builder.chargedOffReason] with `chargedOffReason.orElse(null)`. */
        fun chargedOffReason(chargedOffReason: Optional<ChargedOffReason>) =
            chargedOffReason(chargedOffReason.getOrNull())

        /**
         * Sets [Builder.chargedOffReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargedOffReason] with a well-typed [ChargedOffReason]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun chargedOffReason(chargedOffReason: JsonField<ChargedOffReason>) = apply {
            this.chargedOffReason = chargedOffReason
        }

        fun creditLimit(creditLimit: Long?) = creditLimit(JsonField.ofNullable(creditLimit))

        /**
         * Alias for [Builder.creditLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

        /** Alias for calling [Builder.creditLimit] with `creditLimit.orElse(null)`. */
        fun creditLimit(creditLimit: Optional<Long>) = creditLimit(creditLimit.getOrNull())

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String?) =
            creditProductToken(JsonField.ofNullable(creditProductToken))

        /**
         * Alias for calling [Builder.creditProductToken] with `creditProductToken.orElse(null)`.
         */
        fun creditProductToken(creditProductToken: Optional<String>) =
            creditProductToken(creditProductToken.getOrNull())

        /**
         * Sets [Builder.creditProductToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditProductToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String?) =
            externalBankAccountToken(JsonField.ofNullable(externalBankAccountToken))

        /**
         * Alias for calling [Builder.externalBankAccountToken] with
         * `externalBankAccountToken.orElse(null)`.
         */
        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.getOrNull())

        /**
         * Sets [Builder.externalBankAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalBankAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** State of the financial account */
        fun financialAccountState(financialAccountState: FinancialAccountState) =
            financialAccountState(JsonField.of(financialAccountState))

        /**
         * Sets [Builder.financialAccountState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountState] with a well-typed
         * [FinancialAccountState] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) = apply {
            this.financialAccountState = financialAccountState
        }

        fun isSpendBlocked(isSpendBlocked: Boolean) = isSpendBlocked(JsonField.of(isSpendBlocked))

        /**
         * Sets [Builder.isSpendBlocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSpendBlocked] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isSpendBlocked(isSpendBlocked: JsonField<Boolean>) = apply {
            this.isSpendBlocked = isSpendBlocked
        }

        /** Tier assigned to the financial account */
        fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<String>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [FinancialAccountCreditConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .chargedOffReason()
         * .creditLimit()
         * .creditProductToken()
         * .externalBankAccountToken()
         * .financialAccountState()
         * .isSpendBlocked()
         * .tier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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

    /** Reason for the financial account being marked as Charged Off */
    class ChargedOffReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * An enum containing [ChargedOffReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChargedOffReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DELINQUENT,
            FRAUD,
            /**
             * An enum member indicating that [ChargedOffReason] was instantiated with an unknown
             * value.
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
                DELINQUENT -> Value.DELINQUENT
                FRAUD -> Value.FRAUD
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
                DELINQUENT -> Known.DELINQUENT
                FRAUD -> Known.FRAUD
                else -> throw LithicInvalidDataException("Unknown ChargedOffReason: $value")
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * An instance of [FinancialAccountState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                else -> throw LithicInvalidDataException("Unknown FinancialAccountState: $value")
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
