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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalBankAccountRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val country: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val owner: JsonField<String>,
    private val ownerType: JsonField<OwnerType>,
    private val routingNumber: JsonField<String>,
    private val state: JsonField<State>,
    private val type: JsonField<AccountType>,
    private val verificationAttempts: JsonField<Long>,
    private val verificationMethod: JsonField<VerificationMethod>,
    private val verificationState: JsonField<VerificationState>,
    private val accountToken: JsonField<String>,
    private val address: JsonField<ExternalBankAccountAddress>,
    private val companyId: JsonField<String>,
    private val dob: JsonField<LocalDate>,
    private val doingBusinessAs: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val name: JsonField<String>,
    private val userDefinedId: JsonField<String>,
    private val verificationFailedReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_four") @ExcludeMissing lastFour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("verification_attempts")
        @ExcludeMissing
        verificationAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("verification_method")
        @ExcludeMissing
        verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
        @JsonProperty("verification_state")
        @ExcludeMissing
        verificationState: JsonField<VerificationState> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address")
        @ExcludeMissing
        address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing dob: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_failed_reason")
        @ExcludeMissing
        verificationFailedReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        country,
        created,
        currency,
        lastFour,
        owner,
        ownerType,
        routingNumber,
        state,
        type,
        verificationAttempts,
        verificationMethod,
        verificationState,
        accountToken,
        address,
        companyId,
        dob,
        doingBusinessAs,
        financialAccountToken,
        name,
        userDefinedId,
        verificationFailedReason,
        mutableMapOf(),
    )

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * An ISO 8601 string representing when this funding source was added to the Lithic account.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * currency of the external account 3-character alphabetic ISO 4217 code
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The last 4 digits of the bank account. Derived by Lithic from the account number passed
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun owner(): String = owner.getRequired("owner")

    /**
     * Owner Type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /**
     * Routing Number
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * Account State
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * Account Type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AccountType = type.getRequired("type")

    /**
     * The number of attempts at verification
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationAttempts(): Long = verificationAttempts.getRequired("verification_attempts")

    /**
     * Verification Method
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    /**
     * Verification State
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

    /**
     * Address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<ExternalBankAccountAddress> = address.getOptional("address")

    /**
     * Optional field that helps identify bank accounts in receipts
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyId(): Optional<String> = companyId.getOptional("company_id")

    /**
     * Date of Birth of the Individual that owns the external bank account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dob(): Optional<LocalDate> = dob.getOptional("dob")

    /**
     * Doing Business As
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doingBusinessAs(): Optional<String> = doingBusinessAs.getOptional("doing_business_as")

    /**
     * The financial account token of the operating account to fund the micro deposits
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun financialAccountToken(): Optional<String> =
        financialAccountToken.getOptional("financial_account_token")

    /**
     * The nickname for this External Bank Account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * User Defined ID
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verificationFailedReason(): Optional<String> =
        verificationFailedReason.getOptional("verification_failed_reason")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [lastFour].
     *
     * Unlike [lastFour], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [ownerType].
     *
     * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType(): JsonField<OwnerType> = ownerType

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

    /**
     * Returns the raw JSON value of [verificationAttempts].
     *
     * Unlike [verificationAttempts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    fun _verificationAttempts(): JsonField<Long> = verificationAttempts

    /**
     * Returns the raw JSON value of [verificationMethod].
     *
     * Unlike [verificationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

    /**
     * Returns the raw JSON value of [verificationState].
     *
     * Unlike [verificationState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_state")
    @ExcludeMissing
    fun _verificationState(): JsonField<VerificationState> = verificationState

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address")
    @ExcludeMissing
    fun _address(): JsonField<ExternalBankAccountAddress> = address

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [dob].
     *
     * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

    /**
     * Returns the raw JSON value of [doingBusinessAs].
     *
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

    /**
     * Returns the raw JSON value of [verificationFailedReason].
     *
     * Unlike [verificationFailedReason], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    fun _verificationFailedReason(): JsonField<String> = verificationFailedReason

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
         * [ExternalBankAccountRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .country()
         * .created()
         * .currency()
         * .lastFour()
         * .owner()
         * .ownerType()
         * .routingNumber()
         * .state()
         * .type()
         * .verificationAttempts()
         * .verificationMethod()
         * .verificationState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountRetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var lastFour: JsonField<String>? = null
        private var owner: JsonField<String>? = null
        private var ownerType: JsonField<OwnerType>? = null
        private var routingNumber: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var type: JsonField<AccountType>? = null
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
        internal fun from(
            externalBankAccountRetrieveResponse: ExternalBankAccountRetrieveResponse
        ) = apply {
            token = externalBankAccountRetrieveResponse.token
            country = externalBankAccountRetrieveResponse.country
            created = externalBankAccountRetrieveResponse.created
            currency = externalBankAccountRetrieveResponse.currency
            lastFour = externalBankAccountRetrieveResponse.lastFour
            owner = externalBankAccountRetrieveResponse.owner
            ownerType = externalBankAccountRetrieveResponse.ownerType
            routingNumber = externalBankAccountRetrieveResponse.routingNumber
            state = externalBankAccountRetrieveResponse.state
            type = externalBankAccountRetrieveResponse.type
            verificationAttempts = externalBankAccountRetrieveResponse.verificationAttempts
            verificationMethod = externalBankAccountRetrieveResponse.verificationMethod
            verificationState = externalBankAccountRetrieveResponse.verificationState
            accountToken = externalBankAccountRetrieveResponse.accountToken
            address = externalBankAccountRetrieveResponse.address
            companyId = externalBankAccountRetrieveResponse.companyId
            dob = externalBankAccountRetrieveResponse.dob
            doingBusinessAs = externalBankAccountRetrieveResponse.doingBusinessAs
            financialAccountToken = externalBankAccountRetrieveResponse.financialAccountToken
            name = externalBankAccountRetrieveResponse.name
            userDefinedId = externalBankAccountRetrieveResponse.userDefinedId
            verificationFailedReason = externalBankAccountRetrieveResponse.verificationFailedReason
            additionalProperties =
                externalBankAccountRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * A globally unique identifier for this record of an external bank account association. If
         * a program links an external bank account to more than one end-user or to both the program
         * and the end-user, then Lithic will return each record of the association
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** currency of the external account 3-character alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * Sets [Builder.lastFour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastFour] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        /**
         * Sets [Builder.ownerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /** Routing Number */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

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

        /** Account State */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Account Type */
        fun type(type: AccountType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AccountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<AccountType>) = apply { this.type = type }

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: Long) =
            verificationAttempts(JsonField.of(verificationAttempts))

        /**
         * Sets [Builder.verificationAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationAttempts] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verificationAttempts(verificationAttempts: JsonField<Long>) = apply {
            this.verificationAttempts = verificationAttempts
        }

        /** Verification Method */
        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        /**
         * Sets [Builder.verificationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationMethod] with a well-typed
         * [VerificationMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        /** Verification State */
        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        /**
         * Sets [Builder.verificationState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationState] with a well-typed [VerificationState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
        }

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
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

        /** Address */
        fun address(address: ExternalBankAccountAddress?) = address(JsonField.ofNullable(address))

        /** Alias for calling [Builder.address] with `address.orElse(null)`. */
        fun address(address: Optional<ExternalBankAccountAddress>) = address(address.getOrNull())

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [ExternalBankAccountAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
        }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String?) = companyId(JsonField.ofNullable(companyId))

        /** Alias for calling [Builder.companyId] with `companyId.orElse(null)`. */
        fun companyId(companyId: Optional<String>) = companyId(companyId.getOrNull())

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate?) = dob(JsonField.ofNullable(dob))

        /** Alias for calling [Builder.dob] with `dob.orElse(null)`. */
        fun dob(dob: Optional<LocalDate>) = dob(dob.getOrNull())

        /**
         * Sets [Builder.dob] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dob] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String?) =
            doingBusinessAs(JsonField.ofNullable(doingBusinessAs))

        /** Alias for calling [Builder.doingBusinessAs] with `doingBusinessAs.orElse(null)`. */
        fun doingBusinessAs(doingBusinessAs: Optional<String>) =
            doingBusinessAs(doingBusinessAs.getOrNull())

        /**
         * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: String?) =
            financialAccountToken(JsonField.ofNullable(financialAccountToken))

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** The nickname for this External Bank Account */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String?) =
            userDefinedId(JsonField.ofNullable(userDefinedId))

        /** Alias for calling [Builder.userDefinedId] with `userDefinedId.orElse(null)`. */
        fun userDefinedId(userDefinedId: Optional<String>) =
            userDefinedId(userDefinedId.getOrNull())

        /**
         * Sets [Builder.userDefinedId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /**
         * Optional free text description of the reason for the failed verification. For ACH
         * micro-deposits returned, this field will display the reason return code sent by the ACH
         * network
         */
        fun verificationFailedReason(verificationFailedReason: String?) =
            verificationFailedReason(JsonField.ofNullable(verificationFailedReason))

        /**
         * Alias for calling [Builder.verificationFailedReason] with
         * `verificationFailedReason.orElse(null)`.
         */
        fun verificationFailedReason(verificationFailedReason: Optional<String>) =
            verificationFailedReason(verificationFailedReason.getOrNull())

        /**
         * Sets [Builder.verificationFailedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationFailedReason] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /**
         * Returns an immutable instance of [ExternalBankAccountRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .country()
         * .created()
         * .currency()
         * .lastFour()
         * .owner()
         * .ownerType()
         * .routingNumber()
         * .state()
         * .type()
         * .verificationAttempts()
         * .verificationMethod()
         * .verificationState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBankAccountRetrieveResponse =
            ExternalBankAccountRetrieveResponse(
                checkRequired("token", token),
                checkRequired("country", country),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("lastFour", lastFour),
                checkRequired("owner", owner),
                checkRequired("ownerType", ownerType),
                checkRequired("routingNumber", routingNumber),
                checkRequired("state", state),
                checkRequired("type", type),
                checkRequired("verificationAttempts", verificationAttempts),
                checkRequired("verificationMethod", verificationMethod),
                checkRequired("verificationState", verificationState),
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                financialAccountToken,
                name,
                userDefinedId,
                verificationFailedReason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalBankAccountRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        country()
        created()
        currency()
        lastFour()
        owner()
        ownerType().validate()
        routingNumber()
        state().validate()
        type().validate()
        verificationAttempts()
        verificationMethod().validate()
        verificationState().validate()
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
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (lastFour.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (verificationAttempts.asKnown().isPresent) 1 else 0) +
            (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (verificationState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (address.asKnown().getOrNull()?.validity() ?: 0) +
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (if (dob.asKnown().isPresent) 1 else 0) +
            (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (userDefinedId.asKnown().isPresent) 1 else 0) +
            (if (verificationFailedReason.asKnown().isPresent) 1 else 0)

    /** Owner Type */
    class OwnerType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BUSINESS = of("BUSINESS")

            @JvmField val INDIVIDUAL = of("INDIVIDUAL")

            @JvmStatic fun of(value: String) = OwnerType(JsonField.of(value))
        }

        /** An enum containing [OwnerType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [OwnerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OwnerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /**
             * An enum member indicating that [OwnerType] was instantiated with an unknown value.
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
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

        fun validate(): OwnerType = apply {
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

            return other is OwnerType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Account State */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
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
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Account Type */
    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CHECKING = of("CHECKING")

            @JvmField val SAVINGS = of("SAVINGS")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKING,
            SAVINGS,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
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

        fun validate(): AccountType = apply {
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

            return other is AccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Verification Method */
    class VerificationMethod
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

            @JvmField val MANUAL = of("MANUAL")

            @JvmField val MICRO_DEPOSIT = of("MICRO_DEPOSIT")

            @JvmField val PLAID = of("PLAID")

            @JvmField val PRENOTE = of("PRENOTE")

            @JvmStatic fun of(value: String) = VerificationMethod(JsonField.of(value))
        }

        /** An enum containing [VerificationMethod]'s known values. */
        enum class Known {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
        }

        /**
         * An enum containing [VerificationMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
            /**
             * An enum member indicating that [VerificationMethod] was instantiated with an unknown
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
                MANUAL -> Value.MANUAL
                MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
                PLAID -> Value.PLAID
                PRENOTE -> Value.PRENOTE
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
                MANUAL -> Known.MANUAL
                MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
                PLAID -> Known.PLAID
                PRENOTE -> Known.PRENOTE
                else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
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

        fun validate(): VerificationMethod = apply {
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

            return other is VerificationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Verification State */
    class VerificationState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        /** An enum containing [VerificationState]'s known values. */
        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        /**
         * An enum containing [VerificationState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            /**
             * An enum member indicating that [VerificationState] was instantiated with an unknown
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
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
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

        fun validate(): VerificationState = apply {
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

            return other is VerificationState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountRetrieveResponse &&
            token == other.token &&
            country == other.country &&
            created == other.created &&
            currency == other.currency &&
            lastFour == other.lastFour &&
            owner == other.owner &&
            ownerType == other.ownerType &&
            routingNumber == other.routingNumber &&
            state == other.state &&
            type == other.type &&
            verificationAttempts == other.verificationAttempts &&
            verificationMethod == other.verificationMethod &&
            verificationState == other.verificationState &&
            accountToken == other.accountToken &&
            address == other.address &&
            companyId == other.companyId &&
            dob == other.dob &&
            doingBusinessAs == other.doingBusinessAs &&
            financialAccountToken == other.financialAccountToken &&
            name == other.name &&
            userDefinedId == other.userDefinedId &&
            verificationFailedReason == other.verificationFailedReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            country,
            created,
            currency,
            lastFour,
            owner,
            ownerType,
            routingNumber,
            state,
            type,
            verificationAttempts,
            verificationMethod,
            verificationState,
            accountToken,
            address,
            companyId,
            dob,
            doingBusinessAs,
            financialAccountToken,
            name,
            userDefinedId,
            verificationFailedReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBankAccountRetrieveResponse{token=$token, country=$country, created=$created, currency=$currency, lastFour=$lastFour, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, state=$state, type=$type, verificationAttempts=$verificationAttempts, verificationMethod=$verificationMethod, verificationState=$verificationState, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, financialAccountToken=$financialAccountToken, name=$name, userDefinedId=$userDefinedId, verificationFailedReason=$verificationFailedReason, additionalProperties=$additionalProperties}"
}
