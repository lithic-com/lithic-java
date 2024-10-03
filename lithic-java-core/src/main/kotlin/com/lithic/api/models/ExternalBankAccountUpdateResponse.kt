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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ExternalBankAccountUpdateResponse.Builder::class)
@NoAutoDetect
class ExternalBankAccountUpdateResponse
private constructor(
    private val token: JsonField<String>,
    private val owner: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val name: JsonField<String>,
    private val currency: JsonField<String>,
    private val country: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val companyId: JsonField<String>,
    private val dob: JsonField<LocalDate>,
    private val doingBusinessAs: JsonField<String>,
    private val userDefinedId: JsonField<String>,
    private val verificationFailedReason: JsonField<String>,
    private val verificationAttempts: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val type: JsonField<Type>,
    private val verificationMethod: JsonField<VerificationMethod>,
    private val ownerType: JsonField<OwnerType>,
    private val state: JsonField<State>,
    private val verificationState: JsonField<VerificationState>,
    private val address: JsonField<ExternalBankAccountAddress>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    fun token(): String = token.getRequired("token")

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String = owner.getRequired("owner")

    /** Routing Number */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /** The nickname for this External Bank Account */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    fun country(): String = country.getRequired("country")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

    /** Doing Business As */
    fun doingBusinessAs(): Optional<String> =
        Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

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

    /** The number of attempts at verification */
    fun verificationAttempts(): Long = verificationAttempts.getRequired("verification_attempts")

    /** The financial account token of the operating account to fund the micro deposits */
    fun financialAccountToken(): Optional<String> =
        Optional.ofNullable(financialAccountToken.getNullable("financial_account_token"))

    /** Account Type */
    fun type(): Type = type.getRequired("type")

    /** Verification Method */
    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    /** Owner Type */
    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /** Account State */
    fun state(): State = state.getRequired("state")

    /** Verification State */
    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /** Address */
    fun address(): Optional<ExternalBankAccountAddress> =
        Optional.ofNullable(address.getNullable("address"))

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner() = owner

    /** Routing Number */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

    /** The nickname for this External Bank Account */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Optional field that helps identify bank accounts in receipts */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** Date of Birth of the Individual that owns the external bank account */
    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

    /** Doing Business As */
    @JsonProperty("doing_business_as") @ExcludeMissing fun _doingBusinessAs() = doingBusinessAs

    /** User Defined ID */
    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    fun _verificationFailedReason() = verificationFailedReason

    /** The number of attempts at verification */
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    fun _verificationAttempts() = verificationAttempts

    /** The financial account token of the operating account to fund the micro deposits */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Account Type */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Verification Method */
    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod() = verificationMethod

    /** Owner Type */
    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType() = ownerType

    /** Account State */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Verification State */
    @JsonProperty("verification_state") @ExcludeMissing fun _verificationState() = verificationState

    /** Address */
    @JsonProperty("address") @ExcludeMissing fun _address() = address

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExternalBankAccountUpdateResponse = apply {
        if (!validated) {
            token()
            owner()
            routingNumber()
            lastFour()
            name()
            currency()
            country()
            accountToken()
            created()
            companyId()
            dob()
            doingBusinessAs()
            userDefinedId()
            verificationFailedReason()
            verificationAttempts()
            financialAccountToken()
            type()
            verificationMethod()
            ownerType()
            state()
            verificationState()
            address().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var dob: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var verificationFailedReason: JsonField<String> = JsonMissing.of()
        private var verificationAttempts: JsonField<Long> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var verificationMethod: JsonField<VerificationMethod> = JsonMissing.of()
        private var ownerType: JsonField<OwnerType> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var verificationState: JsonField<VerificationState> = JsonMissing.of()
        private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountUpdateResponse: ExternalBankAccountUpdateResponse) =
            apply {
                this.token = externalBankAccountUpdateResponse.token
                this.owner = externalBankAccountUpdateResponse.owner
                this.routingNumber = externalBankAccountUpdateResponse.routingNumber
                this.lastFour = externalBankAccountUpdateResponse.lastFour
                this.name = externalBankAccountUpdateResponse.name
                this.currency = externalBankAccountUpdateResponse.currency
                this.country = externalBankAccountUpdateResponse.country
                this.accountToken = externalBankAccountUpdateResponse.accountToken
                this.created = externalBankAccountUpdateResponse.created
                this.companyId = externalBankAccountUpdateResponse.companyId
                this.dob = externalBankAccountUpdateResponse.dob
                this.doingBusinessAs = externalBankAccountUpdateResponse.doingBusinessAs
                this.userDefinedId = externalBankAccountUpdateResponse.userDefinedId
                this.verificationFailedReason =
                    externalBankAccountUpdateResponse.verificationFailedReason
                this.verificationAttempts = externalBankAccountUpdateResponse.verificationAttempts
                this.financialAccountToken = externalBankAccountUpdateResponse.financialAccountToken
                this.type = externalBankAccountUpdateResponse.type
                this.verificationMethod = externalBankAccountUpdateResponse.verificationMethod
                this.ownerType = externalBankAccountUpdateResponse.ownerType
                this.state = externalBankAccountUpdateResponse.state
                this.verificationState = externalBankAccountUpdateResponse.verificationState
                this.address = externalBankAccountUpdateResponse.address
                additionalProperties(externalBankAccountUpdateResponse.additionalProperties)
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
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner")
        @ExcludeMissing
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Routing Number */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** Routing Number */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        @JsonProperty("last_four")
        @ExcludeMissing
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /** The nickname for this External Bank Account */
        fun name(name: String) = name(JsonField.of(name))

        /** The nickname for this External Bank Account */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        @JsonProperty("country")
        @ExcludeMissing
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = dob(JsonField.of(dob))

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob")
        @ExcludeMissing
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
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
        @JsonProperty("verification_failed_reason")
        @ExcludeMissing
        fun verificationFailedReason(verificationFailedReason: JsonField<String>) = apply {
            this.verificationFailedReason = verificationFailedReason
        }

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: Long) =
            verificationAttempts(JsonField.of(verificationAttempts))

        /** The number of attempts at verification */
        @JsonProperty("verification_attempts")
        @ExcludeMissing
        fun verificationAttempts(verificationAttempts: JsonField<Long>) = apply {
            this.verificationAttempts = verificationAttempts
        }

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** The financial account token of the operating account to fund the micro deposits */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Account Type */
        fun type(type: Type) = type(JsonField.of(type))

        /** Account Type */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Verification Method */
        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        /** Verification Method */
        @JsonProperty("verification_method")
        @ExcludeMissing
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        /** Owner Type */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /** Account State */
        fun state(state: State) = state(JsonField.of(state))

        /** Account State */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Verification State */
        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        /** Verification State */
        @JsonProperty("verification_state")
        @ExcludeMissing
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

        /** Address */
        @JsonProperty("address")
        @ExcludeMissing
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
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

        fun build(): ExternalBankAccountUpdateResponse =
            ExternalBankAccountUpdateResponse(
                token,
                owner,
                routingNumber,
                lastFour,
                name,
                currency,
                country,
                accountToken,
                created,
                companyId,
                dob,
                doingBusinessAs,
                userDefinedId,
                verificationFailedReason,
                verificationAttempts,
                financialAccountToken,
                type,
                verificationMethod,
                ownerType,
                state,
                verificationState,
                address,
                additionalProperties.toUnmodifiable(),
            )
    }

    class OwnerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OwnerType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BUSINESS = OwnerType(JsonField.of("BUSINESS"))

            @JvmField val INDIVIDUAL = OwnerType(JsonField.of("INDIVIDUAL"))

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
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ENABLED = State(JsonField.of("ENABLED"))

            @JvmField val CLOSED = State(JsonField.of("CLOSED"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = Type(JsonField.of("CHECKING"))

            @JvmField val SAVINGS = Type(JsonField.of("SAVINGS"))

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
    }

    class VerificationMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationMethod && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MANUAL = VerificationMethod(JsonField.of("MANUAL"))

            @JvmField val MICRO_DEPOSIT = VerificationMethod(JsonField.of("MICRO_DEPOSIT"))

            @JvmField val PLAID = VerificationMethod(JsonField.of("PLAID"))

            @JvmField val PRENOTE = VerificationMethod(JsonField.of("PRENOTE"))

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
    }

    class VerificationState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationState && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = VerificationState(JsonField.of("PENDING"))

            @JvmField val ENABLED = VerificationState(JsonField.of("ENABLED"))

            @JvmField
            val FAILED_VERIFICATION = VerificationState(JsonField.of("FAILED_VERIFICATION"))

            @JvmField val INSUFFICIENT_FUNDS = VerificationState(JsonField.of("INSUFFICIENT_FUNDS"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountUpdateResponse && this.token == other.token && this.owner == other.owner && this.routingNumber == other.routingNumber && this.lastFour == other.lastFour && this.name == other.name && this.currency == other.currency && this.country == other.country && this.accountToken == other.accountToken && this.created == other.created && this.companyId == other.companyId && this.dob == other.dob && this.doingBusinessAs == other.doingBusinessAs && this.userDefinedId == other.userDefinedId && this.verificationFailedReason == other.verificationFailedReason && this.verificationAttempts == other.verificationAttempts && this.financialAccountToken == other.financialAccountToken && this.type == other.type && this.verificationMethod == other.verificationMethod && this.ownerType == other.ownerType && this.state == other.state && this.verificationState == other.verificationState && this.address == other.address && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, owner, routingNumber, lastFour, name, currency, country, accountToken, created, companyId, dob, doingBusinessAs, userDefinedId, verificationFailedReason, verificationAttempts, financialAccountToken, type, verificationMethod, ownerType, state, verificationState, address, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ExternalBankAccountUpdateResponse{token=$token, owner=$owner, routingNumber=$routingNumber, lastFour=$lastFour, name=$name, currency=$currency, country=$country, accountToken=$accountToken, created=$created, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, userDefinedId=$userDefinedId, verificationFailedReason=$verificationFailedReason, verificationAttempts=$verificationAttempts, financialAccountToken=$financialAccountToken, type=$type, verificationMethod=$verificationMethod, ownerType=$ownerType, state=$state, verificationState=$verificationState, address=$address, additionalProperties=$additionalProperties}"
}
