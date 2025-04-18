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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FinancialAccount
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val creditConfiguration: JsonField<FinancialAccountCreditConfig>,
    private val isForBenefitOf: JsonField<Boolean>,
    private val nickname: JsonField<String>,
    private val status: JsonField<FinancialAccountStatus>,
    private val type: JsonField<Type>,
    private val updated: JsonField<OffsetDateTime>,
    private val accountNumber: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val substatus: JsonField<FinancialAccountSubstatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_configuration")
        @ExcludeMissing
        creditConfiguration: JsonField<FinancialAccountCreditConfig> = JsonMissing.of(),
        @JsonProperty("is_for_benefit_of")
        @ExcludeMissing
        isForBenefitOf: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<FinancialAccountStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("substatus")
        @ExcludeMissing
        substatus: JsonField<FinancialAccountSubstatus> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        created,
        creditConfiguration,
        isForBenefitOf,
        nickname,
        status,
        type,
        updated,
        accountNumber,
        routingNumber,
        substatus,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditConfiguration(): Optional<FinancialAccountCreditConfig> =
        creditConfiguration.getOptional("credit_configuration")

    /**
     * Whether financial account is for the benefit of another entity
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isForBenefitOf(): Boolean = isForBenefitOf.getRequired("is_for_benefit_of")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nickname(): Optional<String> = nickname.getOptional("nickname")

    /**
     * Status of the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): FinancialAccountStatus = status.getRequired("status")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingNumber(): Optional<String> = routingNumber.getOptional("routing_number")

    /**
     * Substatus for the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun substatus(): Optional<FinancialAccountSubstatus> = substatus.getOptional("substatus")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [creditConfiguration].
     *
     * Unlike [creditConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_configuration")
    @ExcludeMissing
    fun _creditConfiguration(): JsonField<FinancialAccountCreditConfig> = creditConfiguration

    /**
     * Returns the raw JSON value of [isForBenefitOf].
     *
     * Unlike [isForBenefitOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_for_benefit_of")
    @ExcludeMissing
    fun _isForBenefitOf(): JsonField<Boolean> = isForBenefitOf

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<FinancialAccountStatus> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("substatus")
    @ExcludeMissing
    fun _substatus(): JsonField<FinancialAccountSubstatus> = substatus

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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
        private var substatus: JsonField<FinancialAccountSubstatus> = JsonMissing.of()
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
            substatus = financialAccount.substatus
            additionalProperties = financialAccount.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountToken(accountToken: String?) = accountToken(JsonField.ofNullable(accountToken))

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

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

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun creditConfiguration(creditConfiguration: FinancialAccountCreditConfig?) =
            creditConfiguration(JsonField.ofNullable(creditConfiguration))

        /**
         * Alias for calling [Builder.creditConfiguration] with `creditConfiguration.orElse(null)`.
         */
        fun creditConfiguration(creditConfiguration: Optional<FinancialAccountCreditConfig>) =
            creditConfiguration(creditConfiguration.getOrNull())

        /**
         * Sets [Builder.creditConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditConfiguration] with a well-typed
         * [FinancialAccountCreditConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditConfiguration(creditConfiguration: JsonField<FinancialAccountCreditConfig>) =
            apply {
                this.creditConfiguration = creditConfiguration
            }

        /** Whether financial account is for the benefit of another entity */
        fun isForBenefitOf(isForBenefitOf: Boolean) = isForBenefitOf(JsonField.of(isForBenefitOf))

        /**
         * Sets [Builder.isForBenefitOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isForBenefitOf] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
            this.isForBenefitOf = isForBenefitOf
        }

        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
        fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Status of the financial account */
        fun status(status: FinancialAccountStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [FinancialAccountStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<FinancialAccountStatus>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun accountNumber(accountNumber: String?) =
            accountNumber(JsonField.ofNullable(accountNumber))

        /** Alias for calling [Builder.accountNumber] with `accountNumber.orElse(null)`. */
        fun accountNumber(accountNumber: Optional<String>) =
            accountNumber(accountNumber.getOrNull())

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun routingNumber(routingNumber: String?) =
            routingNumber(JsonField.ofNullable(routingNumber))

        /** Alias for calling [Builder.routingNumber] with `routingNumber.orElse(null)`. */
        fun routingNumber(routingNumber: Optional<String>) =
            routingNumber(routingNumber.getOrNull())

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** Substatus for the financial account */
        fun substatus(substatus: FinancialAccountSubstatus?) =
            substatus(JsonField.ofNullable(substatus))

        /** Alias for calling [Builder.substatus] with `substatus.orElse(null)`. */
        fun substatus(substatus: Optional<FinancialAccountSubstatus>) =
            substatus(substatus.getOrNull())

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed [FinancialAccountSubstatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun substatus(substatus: JsonField<FinancialAccountSubstatus>) = apply {
            this.substatus = substatus
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

        /**
         * Returns an immutable instance of [FinancialAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                substatus,
                additionalProperties.toMutableMap(),
            )
    }

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
        status().validate()
        type().validate()
        updated()
        accountNumber()
        routingNumber()
        substatus().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (creditConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isForBenefitOf.asKnown().isPresent) 1 else 0) +
            (if (nickname.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
            (substatus.asKnown().getOrNull()?.validity() ?: 0)

    class FinancialAccountCreditConfig
    private constructor(
        private val chargedOffReason: JsonField<ChargedOffReason>,
        private val creditLimit: JsonField<Long>,
        private val creditProductToken: JsonField<String>,
        private val externalBankAccountToken: JsonField<String>,
        private val financialAccountState: JsonField<FinancialAccountState>,
        private val isSpendBlocked: JsonField<Boolean>,
        private val tier: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("charged_off_reason")
            @ExcludeMissing
            chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of(),
            @JsonProperty("credit_limit")
            @ExcludeMissing
            creditLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("credit_product_token")
            @ExcludeMissing
            creditProductToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_bank_account_token")
            @ExcludeMissing
            externalBankAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("financial_account_state")
            @ExcludeMissing
            financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of(),
            @JsonProperty("is_spend_blocked")
            @ExcludeMissing
            isSpendBlocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
        ) : this(
            chargedOffReason,
            creditLimit,
            creditProductToken,
            externalBankAccountToken,
            financialAccountState,
            isSpendBlocked,
            tier,
            mutableMapOf(),
        )

        /**
         * Reason for the financial account being marked as Charged Off
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chargedOffReason(): Optional<ChargedOffReason> =
            chargedOffReason.getOptional("charged_off_reason")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditLimit(): Optional<Long> = creditLimit.getOptional("credit_limit")

        /**
         * Globally unique identifier for the credit product
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditProductToken(): Optional<String> =
            creditProductToken.getOptional("credit_product_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalBankAccountToken(): Optional<String> =
            externalBankAccountToken.getOptional("external_bank_account_token")

        /**
         * State of the financial account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun financialAccountState(): Optional<FinancialAccountState> =
            financialAccountState.getOptional("financial_account_state")

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
        fun tier(): Optional<String> = tier.getOptional("tier")

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
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun _creditLimit(): JsonField<Long> = creditLimit

        /**
         * Returns the raw JSON value of [creditProductToken].
         *
         * Unlike [creditProductToken], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [financialAccountState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_state")
        @ExcludeMissing
        fun _financialAccountState(): JsonField<FinancialAccountState> = financialAccountState

        /**
         * Returns the raw JSON value of [isSpendBlocked].
         *
         * Unlike [isSpendBlocked], this method doesn't throw if the JSON field has an unexpected
         * type.
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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Alias for calling [Builder.chargedOffReason] with `chargedOffReason.orElse(null)`.
             */
            fun chargedOffReason(chargedOffReason: Optional<ChargedOffReason>) =
                chargedOffReason(chargedOffReason.getOrNull())

            /**
             * Sets [Builder.chargedOffReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargedOffReason] with a well-typed
             * [ChargedOffReason] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

            /** Globally unique identifier for the credit product */
            fun creditProductToken(creditProductToken: String?) =
                creditProductToken(JsonField.ofNullable(creditProductToken))

            /**
             * Alias for calling [Builder.creditProductToken] with
             * `creditProductToken.orElse(null)`.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            /** State of the financial account */
            fun financialAccountState(financialAccountState: FinancialAccountState?) =
                financialAccountState(JsonField.ofNullable(financialAccountState))

            /**
             * Alias for calling [Builder.financialAccountState] with
             * `financialAccountState.orElse(null)`.
             */
            fun financialAccountState(financialAccountState: Optional<FinancialAccountState>) =
                financialAccountState(financialAccountState.getOrNull())

            /**
             * Sets [Builder.financialAccountState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountState] with a well-typed
             * [FinancialAccountState] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) =
                apply {
                    this.financialAccountState = financialAccountState
                }

            fun isSpendBlocked(isSpendBlocked: Boolean) =
                isSpendBlocked(JsonField.of(isSpendBlocked))

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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
                    checkRequired("chargedOffReason", chargedOffReason),
                    checkRequired("creditLimit", creditLimit),
                    checkRequired("creditProductToken", creditProductToken),
                    checkRequired("externalBankAccountToken", externalBankAccountToken),
                    checkRequired("financialAccountState", financialAccountState),
                    checkRequired("isSpendBlocked", isSpendBlocked),
                    checkRequired("tier", tier),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FinancialAccountCreditConfig = apply {
            if (validated) {
                return@apply
            }

            chargedOffReason().ifPresent { it.validate() }
            creditLimit()
            creditProductToken()
            externalBankAccountToken()
            financialAccountState().ifPresent { it.validate() }
            isSpendBlocked()
            tier()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (chargedOffReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (creditLimit.asKnown().isPresent) 1 else 0) +
                (if (creditProductToken.asKnown().isPresent) 1 else 0) +
                (if (externalBankAccountToken.asKnown().isPresent) 1 else 0) +
                (financialAccountState.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isSpendBlocked.asKnown().isPresent) 1 else 0) +
                (if (tier.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            fun validate(): ChargedOffReason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            private var validated: Boolean = false

            fun validate(): FinancialAccountState = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        private var validated: Boolean = false

        fun validate(): FinancialAccountStatus = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            @JvmField val CHARGED_OFF_FEES = of("CHARGED_OFF_FEES")

            @JvmField val CHARGED_OFF_INTEREST = of("CHARGED_OFF_INTEREST")

            @JvmField val CHARGED_OFF_PRINCIPAL = of("CHARGED_OFF_PRINCIPAL")

            @JvmField val SECURITY = of("SECURITY")

            @JvmField val PROGRAM_RECEIVABLES = of("PROGRAM_RECEIVABLES")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ISSUING,
            RESERVE,
            OPERATING,
            CHARGED_OFF_FEES,
            CHARGED_OFF_INTEREST,
            CHARGED_OFF_PRINCIPAL,
            SECURITY,
            PROGRAM_RECEIVABLES,
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
            CHARGED_OFF_FEES,
            CHARGED_OFF_INTEREST,
            CHARGED_OFF_PRINCIPAL,
            SECURITY,
            PROGRAM_RECEIVABLES,
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
                CHARGED_OFF_FEES -> Value.CHARGED_OFF_FEES
                CHARGED_OFF_INTEREST -> Value.CHARGED_OFF_INTEREST
                CHARGED_OFF_PRINCIPAL -> Value.CHARGED_OFF_PRINCIPAL
                SECURITY -> Value.SECURITY
                PROGRAM_RECEIVABLES -> Value.PROGRAM_RECEIVABLES
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
                CHARGED_OFF_FEES -> Known.CHARGED_OFF_FEES
                CHARGED_OFF_INTEREST -> Known.CHARGED_OFF_INTEREST
                CHARGED_OFF_PRINCIPAL -> Known.CHARGED_OFF_PRINCIPAL
                SECURITY -> Known.SECURITY
                PROGRAM_RECEIVABLES -> Known.PROGRAM_RECEIVABLES
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Substatus for the financial account */
    class FinancialAccountSubstatus
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

            @JvmStatic fun of(value: String) = FinancialAccountSubstatus(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountSubstatus]'s known values. */
        enum class Known {
            CHARGED_OFF_DELINQUENT,
            CHARGED_OFF_FRAUD,
            END_USER_REQUEST,
            BANK_REQUEST,
            DELINQUENT,
        }

        /**
         * An enum containing [FinancialAccountSubstatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FinancialAccountSubstatus] can contain an unknown value in a couple of
         * cases:
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
             * An enum member indicating that [FinancialAccountSubstatus] was instantiated with an
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
                    throw LithicInvalidDataException("Unknown FinancialAccountSubstatus: $value")
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

        private var validated: Boolean = false

        fun validate(): FinancialAccountSubstatus = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountSubstatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccount && token == other.token && accountToken == other.accountToken && created == other.created && creditConfiguration == other.creditConfiguration && isForBenefitOf == other.isForBenefitOf && nickname == other.nickname && status == other.status && type == other.type && updated == other.updated && accountNumber == other.accountNumber && routingNumber == other.routingNumber && substatus == other.substatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, created, creditConfiguration, isForBenefitOf, nickname, status, type, updated, accountNumber, routingNumber, substatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccount{token=$token, accountToken=$accountToken, created=$created, creditConfiguration=$creditConfiguration, isForBenefitOf=$isForBenefitOf, nickname=$nickname, status=$status, type=$type, updated=$updated, accountNumber=$accountNumber, routingNumber=$routingNumber, substatus=$substatus, additionalProperties=$additionalProperties}"
}
