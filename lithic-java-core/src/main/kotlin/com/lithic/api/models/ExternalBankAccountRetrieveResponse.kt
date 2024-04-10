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

@JsonDeserialize(builder = ExternalBankAccountRetrieveResponse.Builder::class)
@NoAutoDetect
class ExternalBankAccountRetrieveResponse
private constructor(
    private val accountToken: JsonField<String>,
    private val address: JsonField<ExternalBankAccountAddress>,
    private val companyId: JsonField<String>,
    private val country: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val dob: JsonField<LocalDate>,
    private val doingBusinessAs: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val name: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val owner: JsonField<String>,
    private val ownerType: JsonField<OwnerType>,
    private val routingNumber: JsonField<String>,
    private val state: JsonField<State>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val userDefinedId: JsonField<String>,
    private val verificationAttempts: JsonField<Long>,
    private val verificationFailedReason: JsonField<String>,
    private val verificationMethod: JsonField<VerificationMethod>,
    private val verificationState: JsonField<VerificationState>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules.
     */
    fun address(): Optional<ExternalBankAccountAddress> =
        Optional.ofNullable(address.getNullable("address"))

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    fun country(): String = country.getRequired("country")

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    fun currency(): String = currency.getRequired("currency")

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

    fun doingBusinessAs(): Optional<String> =
        Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /** The nickname given to this record of External Bank Account */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The financial account token of the operating account used to verify the account */
    fun financialAccountToken(): Optional<String> =
        Optional.ofNullable(financialAccountToken.getNullable("financial_account_token"))

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String = owner.getRequired("owner")

    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    fun state(): State = state.getRequired("state")

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    fun token(): String = token.getRequired("token")

    fun type(): Type = type.getRequired("type")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    /** The number of attempts at verification */
    fun verificationAttempts(): Long = verificationAttempts.getRequired("verification_attempts")

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    fun verificationFailedReason(): Optional<String> =
        Optional.ofNullable(verificationFailedReason.getNullable("verification_failed_reason"))

    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules.
     */
    @JsonProperty("address") @ExcludeMissing fun _address() = address

    /** Optional field that helps identify bank accounts in receipts */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Date of Birth of the Individual that owns the external bank account */
    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

    @JsonProperty("doing_business_as") @ExcludeMissing fun _doingBusinessAs() = doingBusinessAs

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

    /** The nickname given to this record of External Bank Account */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The financial account token of the operating account used to verify the account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner() = owner

    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType() = ownerType

    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    /** The number of attempts at verification */
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    fun _verificationAttempts() = verificationAttempts

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    fun _verificationFailedReason() = verificationFailedReason

    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod() = verificationMethod

    @JsonProperty("verification_state") @ExcludeMissing fun _verificationState() = verificationState

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExternalBankAccountRetrieveResponse = apply {
        if (!validated) {
            accountToken()
            address().map { it.validate() }
            companyId()
            country()
            created()
            currency()
            dob()
            doingBusinessAs()
            lastFour()
            name()
            financialAccountToken()
            owner()
            ownerType()
            routingNumber()
            state()
            token()
            type()
            userDefinedId()
            verificationAttempts()
            verificationFailedReason()
            verificationMethod()
            verificationState()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountRetrieveResponse &&
            this.accountToken == other.accountToken &&
            this.address == other.address &&
            this.companyId == other.companyId &&
            this.country == other.country &&
            this.created == other.created &&
            this.currency == other.currency &&
            this.dob == other.dob &&
            this.doingBusinessAs == other.doingBusinessAs &&
            this.lastFour == other.lastFour &&
            this.name == other.name &&
            this.financialAccountToken == other.financialAccountToken &&
            this.owner == other.owner &&
            this.ownerType == other.ownerType &&
            this.routingNumber == other.routingNumber &&
            this.state == other.state &&
            this.token == other.token &&
            this.type == other.type &&
            this.userDefinedId == other.userDefinedId &&
            this.verificationAttempts == other.verificationAttempts &&
            this.verificationFailedReason == other.verificationFailedReason &&
            this.verificationMethod == other.verificationMethod &&
            this.verificationState == other.verificationState &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountToken,
                    address,
                    companyId,
                    country,
                    created,
                    currency,
                    dob,
                    doingBusinessAs,
                    lastFour,
                    name,
                    financialAccountToken,
                    owner,
                    ownerType,
                    routingNumber,
                    state,
                    token,
                    type,
                    userDefinedId,
                    verificationAttempts,
                    verificationFailedReason,
                    verificationMethod,
                    verificationState,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ExternalBankAccountRetrieveResponse{accountToken=$accountToken, address=$address, companyId=$companyId, country=$country, created=$created, currency=$currency, dob=$dob, doingBusinessAs=$doingBusinessAs, lastFour=$lastFour, name=$name, financialAccountToken=$financialAccountToken, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, state=$state, token=$token, type=$type, userDefinedId=$userDefinedId, verificationAttempts=$verificationAttempts, verificationFailedReason=$verificationFailedReason, verificationMethod=$verificationMethod, verificationState=$verificationState, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var dob: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var ownerType: JsonField<OwnerType> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var verificationAttempts: JsonField<Long> = JsonMissing.of()
        private var verificationFailedReason: JsonField<String> = JsonMissing.of()
        private var verificationMethod: JsonField<VerificationMethod> = JsonMissing.of()
        private var verificationState: JsonField<VerificationState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalBankAccountRetrieveResponse: ExternalBankAccountRetrieveResponse
        ) = apply {
            this.accountToken = externalBankAccountRetrieveResponse.accountToken
            this.address = externalBankAccountRetrieveResponse.address
            this.companyId = externalBankAccountRetrieveResponse.companyId
            this.country = externalBankAccountRetrieveResponse.country
            this.created = externalBankAccountRetrieveResponse.created
            this.currency = externalBankAccountRetrieveResponse.currency
            this.dob = externalBankAccountRetrieveResponse.dob
            this.doingBusinessAs = externalBankAccountRetrieveResponse.doingBusinessAs
            this.lastFour = externalBankAccountRetrieveResponse.lastFour
            this.name = externalBankAccountRetrieveResponse.name
            this.financialAccountToken = externalBankAccountRetrieveResponse.financialAccountToken
            this.owner = externalBankAccountRetrieveResponse.owner
            this.ownerType = externalBankAccountRetrieveResponse.ownerType
            this.routingNumber = externalBankAccountRetrieveResponse.routingNumber
            this.state = externalBankAccountRetrieveResponse.state
            this.token = externalBankAccountRetrieveResponse.token
            this.type = externalBankAccountRetrieveResponse.type
            this.userDefinedId = externalBankAccountRetrieveResponse.userDefinedId
            this.verificationAttempts = externalBankAccountRetrieveResponse.verificationAttempts
            this.verificationFailedReason =
                externalBankAccountRetrieveResponse.verificationFailedReason
            this.verificationMethod = externalBankAccountRetrieveResponse.verificationMethod
            this.verificationState = externalBankAccountRetrieveResponse.verificationState
            additionalProperties(externalBankAccountRetrieveResponse.additionalProperties)
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
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
        }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

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
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = dob(JsonField.of(dob))

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob")
        @ExcludeMissing
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
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

        /** The nickname given to this record of External Bank Account */
        fun name(name: String) = name(JsonField.of(name))

        /** The nickname given to this record of External Bank Account */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The financial account token of the operating account used to verify the account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** The financial account token of the operating account used to verify the account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

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

        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        @JsonProperty("owner_type")
        @ExcludeMissing
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        fun state(state: State) = state(JsonField.of(state))

        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

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

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
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

        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        @JsonProperty("verification_method")
        @ExcludeMissing
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        @JsonProperty("verification_state")
        @ExcludeMissing
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
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

        fun build(): ExternalBankAccountRetrieveResponse =
            ExternalBankAccountRetrieveResponse(
                accountToken,
                address,
                companyId,
                country,
                created,
                currency,
                dob,
                doingBusinessAs,
                lastFour,
                name,
                financialAccountToken,
                owner,
                ownerType,
                routingNumber,
                state,
                token,
                type,
                userDefinedId,
                verificationAttempts,
                verificationFailedReason,
                verificationMethod,
                verificationState,
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

            return other is OwnerType && this.value == other.value
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

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CLOSED = State(JsonField.of("CLOSED"))

            @JvmField val ENABLED = State(JsonField.of("ENABLED"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            CLOSED,
            ENABLED,
            PAUSED,
        }

        enum class Value {
            CLOSED,
            ENABLED,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CLOSED -> Value.CLOSED
                ENABLED -> Value.ENABLED
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CLOSED -> Known.CLOSED
                ENABLED -> Known.ENABLED
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

            return other is Type && this.value == other.value
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

            return other is VerificationMethod && this.value == other.value
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

            return other is VerificationState && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ENABLED = VerificationState(JsonField.of("ENABLED"))

            @JvmField
            val FAILED_VERIFICATION = VerificationState(JsonField.of("FAILED_VERIFICATION"))

            @JvmField val INSUFFICIENT_FUNDS = VerificationState(JsonField.of("INSUFFICIENT_FUNDS"))

            @JvmField val PENDING = VerificationState(JsonField.of("PENDING"))

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            PENDING,
        }

        enum class Value {
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                PENDING -> Known.PENDING
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
