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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ExternalBankAccountUpdateResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_four")
    @ExcludeMissing
    private val lastFour: JsonField<String> = JsonMissing.of(),
    @JsonProperty("owner") @ExcludeMissing private val owner: JsonField<String> = JsonMissing.of(),
    @JsonProperty("owner_type")
    @ExcludeMissing
    private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<State> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    private val verificationAttempts: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("verification_method")
    @ExcludeMissing
    private val verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
    @JsonProperty("verification_state")
    @ExcludeMissing
    private val verificationState: JsonField<VerificationState> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    private val verificationFailedReason: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    fun token(): String = token.getRequired("token")

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    fun country(): String = country.getRequired("country")

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    fun currency(): String = currency.getRequired("currency")

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String = owner.getRequired("owner")

    /** Owner Type */
    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /** Routing Number */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** Account State */
    fun state(): State = state.getRequired("state")

    /** Account Type */
    fun type(): Type = type.getRequired("type")

    /** The number of attempts at verification */
    fun verificationAttempts(): Long = verificationAttempts.getRequired("verification_attempts")

    /** Verification Method */
    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    /** Verification State */
    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /** Address */
    fun address(): Optional<ExternalBankAccountAddress> =
        Optional.ofNullable(address.getNullable("address"))

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

    /** Doing Business As */
    fun doingBusinessAs(): Optional<String> =
        Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

    /** The financial account token of the operating account to fund the micro deposits */
    fun financialAccountToken(): Optional<String> =
        Optional.ofNullable(financialAccountToken.getNullable("financial_account_token"))

    /** The nickname for this External Bank Account */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** User Defined ID */
    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    fun verificationFailedReason(): Optional<String> =
        Optional.ofNullable(verificationFailedReason.getNullable("verification_failed_reason"))

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /** Owner Type */
    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType(): JsonField<OwnerType> = ownerType

    /** Routing Number */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** Account State */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /** Account Type */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The number of attempts at verification */
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    fun _verificationAttempts(): JsonField<Long> = verificationAttempts

    /** Verification Method */
    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

    /** Verification State */
    @JsonProperty("verification_state")
    @ExcludeMissing
    fun _verificationState(): JsonField<VerificationState> = verificationState

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /** Address */
    @JsonProperty("address")
    @ExcludeMissing
    fun _address(): JsonField<ExternalBankAccountAddress> = address

    /** Optional field that helps identify bank accounts in receipts */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /** Date of Birth of the Individual that owns the external bank account */
    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

    /** Doing Business As */
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /** The financial account token of the operating account to fund the micro deposits */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /** The nickname for this External Bank Account */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** User Defined ID */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    fun _verificationFailedReason(): JsonField<String> = verificationFailedReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalBankAccountUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        country()
        created()
        currency()
        lastFour()
        owner()
        ownerType()
        routingNumber()
        state()
        type()
        verificationAttempts()
        verificationMethod()
        verificationState()
        accountToken()
        address().ifPresent { it.validate() }
        companyId()
        dob()
        doingBusinessAs()
        financialAccountToken()
        name()
        userDefinedId()
        verificationFailedReason()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var lastFour: JsonField<String>? = null
        private var owner: JsonField<String>? = null
        private var ownerType: JsonField<OwnerType>? = null
        private var routingNumber: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var type: JsonField<Type>? = null
        private var verificationAttempts: JsonField<Long>? = null
        private var verificationMethod: JsonField<VerificationMethod>? = null
        private var verificationState: JsonField<VerificationState>? = null
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var dob: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var verificationFailedReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountUpdateResponse: ExternalBankAccountUpdateResponse) =
            apply {
                token = externalBankAccountUpdateResponse.token
                country = externalBankAccountUpdateResponse.country
                created = externalBankAccountUpdateResponse.created
                currency = externalBankAccountUpdateResponse.currency
                lastFour = externalBankAccountUpdateResponse.lastFour
                owner = externalBankAccountUpdateResponse.owner
                ownerType = externalBankAccountUpdateResponse.ownerType
                routingNumber = externalBankAccountUpdateResponse.routingNumber
                state = externalBankAccountUpdateResponse.state
                type = externalBankAccountUpdateResponse.type
                verificationAttempts = externalBankAccountUpdateResponse.verificationAttempts
                verificationMethod = externalBankAccountUpdateResponse.verificationMethod
                verificationState = externalBankAccountUpdateResponse.verificationState
                accountToken = externalBankAccountUpdateResponse.accountToken
                address = externalBankAccountUpdateResponse.address
                companyId = externalBankAccountUpdateResponse.companyId
                dob = externalBankAccountUpdateResponse.dob
                doingBusinessAs = externalBankAccountUpdateResponse.doingBusinessAs
                financialAccountToken = externalBankAccountUpdateResponse.financialAccountToken
                name = externalBankAccountUpdateResponse.name
                userDefinedId = externalBankAccountUpdateResponse.userDefinedId
                verificationFailedReason =
                    externalBankAccountUpdateResponse.verificationFailedReason
                additionalProperties =
                    externalBankAccountUpdateResponse.additionalProperties.toMutableMap()
            }

        /**
         * A globally unique identifier for this record of an external bank account association. If
         * a program links an external bank account to more than one end-user or to both the program
         * and the end-user, then Lithic will return each record of the association
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A globally unique identifier for this record of an external bank account association. If
         * a program links an external bank account to more than one end-user or to both the program
         * and the end-user, then Lithic will return each record of the association
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        /** Owner Type */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /** Routing Number */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** Routing Number */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** Account State */
        fun state(state: State) = state(JsonField.of(state))

        /** Account State */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Account Type */
        fun type(type: Type) = type(JsonField.of(type))

        /** Account Type */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: Long) =
            verificationAttempts(JsonField.of(verificationAttempts))

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: JsonField<Long>) = apply {
            this.verificationAttempts = verificationAttempts
        }

        /** Verification Method */
        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        /** Verification Method */
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        /** Verification State */
        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        /** Verification State */
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
        }

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

        /** Address */
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
        }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = dob(JsonField.of(dob))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** The nickname for this External Bank Account */
        fun name(name: String) = name(JsonField.of(name))

        /** The nickname for this External Bank Account */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        /** User Defined ID */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /**
         * Optional free text description of the reason for the failed verification. For ACH
         * micro-deposits returned, this field will display the reason return code sent by the ACH
         * network
         */
        fun verificationFailedReason(verificationFailedReason: String) =
            verificationFailedReason(JsonField.of(verificationFailedReason))

        /**
         * Optional free text description of the reason for the failed verification. For ACH
         * micro-deposits returned, this field will display the reason return code sent by the ACH
         * network
         */
        fun verificationFailedReason(verificationFailedReason: JsonField<String>) = apply {
            this.verificationFailedReason = verificationFailedReason
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

        fun build(): ExternalBankAccountUpdateResponse =
            ExternalBankAccountUpdateResponse(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(country) { "`country` is required but was not set" },
                checkNotNull(created) { "`created` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(lastFour) { "`lastFour` is required but was not set" },
                checkNotNull(owner) { "`owner` is required but was not set" },
                checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                checkNotNull(state) { "`state` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                checkNotNull(verificationAttempts) {
                    "`verificationAttempts` is required but was not set"
                },
                checkNotNull(verificationMethod) {
                    "`verificationMethod` is required but was not set"
                },
                checkNotNull(verificationState) {
                    "`verificationState` is required but was not set"
                },
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                financialAccountToken,
                name,
                userDefinedId,
                verificationFailedReason,
                additionalProperties.toImmutable(),
            )
    }

    class OwnerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS = of("BUSINESS")

            @JvmField val INDIVIDUAL = of("INDIVIDUAL")

            @JvmStatic fun of(value: String) = OwnerType(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OwnerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHECKING = of("CHECKING")

            @JvmField val SAVINGS = of("SAVINGS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
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

    class VerificationMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MANUAL = of("MANUAL")

            @JvmField val MICRO_DEPOSIT = of("MICRO_DEPOSIT")

            @JvmField val PLAID = of("PLAID")

            @JvmField val PRENOTE = of("PRENOTE")

            @JvmStatic fun of(value: String) = VerificationMethod(JsonField.of(value))
        }

        enum class Known {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
        }

        enum class Value {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MANUAL -> Value.MANUAL
                MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
                PLAID -> Value.PLAID
                PRENOTE -> Value.PRENOTE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MANUAL -> Known.MANUAL
                MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
                PLAID -> Known.PLAID
                PRENOTE -> Known.PRENOTE
                else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class VerificationState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountUpdateResponse && token == other.token && country == other.country && created == other.created && currency == other.currency && lastFour == other.lastFour && owner == other.owner && ownerType == other.ownerType && routingNumber == other.routingNumber && state == other.state && type == other.type && verificationAttempts == other.verificationAttempts && verificationMethod == other.verificationMethod && verificationState == other.verificationState && accountToken == other.accountToken && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && financialAccountToken == other.financialAccountToken && name == other.name && userDefinedId == other.userDefinedId && verificationFailedReason == other.verificationFailedReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, country, created, currency, lastFour, owner, ownerType, routingNumber, state, type, verificationAttempts, verificationMethod, verificationState, accountToken, address, companyId, dob, doingBusinessAs, financialAccountToken, name, userDefinedId, verificationFailedReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBankAccountUpdateResponse{token=$token, country=$country, created=$created, currency=$currency, lastFour=$lastFour, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, state=$state, type=$type, verificationAttempts=$verificationAttempts, verificationMethod=$verificationMethod, verificationState=$verificationState, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, financialAccountToken=$financialAccountToken, name=$name, userDefinedId=$userDefinedId, verificationFailedReason=$verificationFailedReason, additionalProperties=$additionalProperties}"
}
