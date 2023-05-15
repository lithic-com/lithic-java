package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Account.Builder::class)
@NoAutoDetect
class Account
private constructor(
    private val spendLimit: JsonField<SpendLimit>,
    private val state: JsonField<State>,
    private val token: JsonField<String>,
    private val authRuleTokens: JsonField<List<String>>,
    private val verificationAddress: JsonField<VerificationAddress>,
    private val accountHolder: JsonField<AccountHolder>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     */
    fun spendLimit(): SpendLimit = spendLimit.getRequired("spend_limit")

    /**
     * Account state:
     *
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     * `ACTIVE`.
     * - `CLOSED` - Account will permanently not be able to transact or create new cards.
     */
    fun state(): State = state.getRequired("state")

    /**
     * Globally unique identifier for the account. This is the same as the account_token returned by
     * the enroll endpoint. If using this parameter, do not include pagination.
     */
    fun token(): String = token.getRequired("token")

    /** List of identifiers for the Auth Rule(s) that are applied on the account. */
    fun authRuleTokens(): Optional<List<String>> =
        Optional.ofNullable(authRuleTokens.getNullable("auth_rule_tokens"))

    fun verificationAddress(): Optional<VerificationAddress> =
        Optional.ofNullable(verificationAddress.getNullable("verification_address"))

    fun accountHolder(): Optional<AccountHolder> =
        Optional.ofNullable(accountHolder.getNullable("account_holder"))

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     */
    @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit() = spendLimit

    /**
     * Account state:
     *
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     * `ACTIVE`.
     * - `CLOSED` - Account will permanently not be able to transact or create new cards.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * Globally unique identifier for the account. This is the same as the account_token returned by
     * the enroll endpoint. If using this parameter, do not include pagination.
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** List of identifiers for the Auth Rule(s) that are applied on the account. */
    @JsonProperty("auth_rule_tokens") @ExcludeMissing fun _authRuleTokens() = authRuleTokens

    @JsonProperty("verification_address")
    @ExcludeMissing
    fun _verificationAddress() = verificationAddress

    @JsonProperty("account_holder") @ExcludeMissing fun _accountHolder() = accountHolder

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Account = apply {
        if (!validated) {
            spendLimit().validate()
            state()
            token()
            authRuleTokens()
            verificationAddress().map { it.validate() }
            accountHolder().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            this.spendLimit == other.spendLimit &&
            this.state == other.state &&
            this.token == other.token &&
            this.authRuleTokens == other.authRuleTokens &&
            this.verificationAddress == other.verificationAddress &&
            this.accountHolder == other.accountHolder &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    spendLimit,
                    state,
                    token,
                    authRuleTokens,
                    verificationAddress,
                    accountHolder,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Account{spendLimit=$spendLimit, state=$state, token=$token, authRuleTokens=$authRuleTokens, verificationAddress=$verificationAddress, accountHolder=$accountHolder, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var authRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var verificationAddress: JsonField<VerificationAddress> = JsonMissing.of()
        private var accountHolder: JsonField<AccountHolder> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            this.spendLimit = account.spendLimit
            this.state = account.state
            this.token = account.token
            this.authRuleTokens = account.authRuleTokens
            this.verificationAddress = account.verificationAddress
            this.accountHolder = account.accountHolder
            additionalProperties(account.additionalProperties)
        }

        /**
         * Spend limit information for the user containing the daily, monthly, and lifetime spend
         * limit of the account. Any charges to a card owned by this account will be declined once
         * their transaction volume has surpassed the value in the applicable time limit (rolling).
         * A lifetime limit of 0 indicates that the lifetime limit feature is disabled.
         */
        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Spend limit information for the user containing the daily, monthly, and lifetime spend
         * limit of the account. Any charges to a card owned by this account will be declined once
         * their transaction volume has surpassed the value in the applicable time limit (rolling).
         * A lifetime limit of 0 indicates that the lifetime limit feature is disabled.
         */
        @JsonProperty("spend_limit")
        @ExcludeMissing
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        /**
         * Account state:
         *
         * - `ACTIVE` - Account is able to transact and create new cards.
         * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back
         * to `ACTIVE`.
         * - `CLOSED` - Account will permanently not be able to transact or create new cards.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Account state:
         *
         * - `ACTIVE` - Account is able to transact and create new cards.
         * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back
         * to `ACTIVE`.
         * - `CLOSED` - Account will permanently not be able to transact or create new cards.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Globally unique identifier for the account. This is the same as the account_token
         * returned by the enroll endpoint. If using this parameter, do not include pagination.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Globally unique identifier for the account. This is the same as the account_token
         * returned by the enroll endpoint. If using this parameter, do not include pagination.
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** List of identifiers for the Auth Rule(s) that are applied on the account. */
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /** List of identifiers for the Auth Rule(s) that are applied on the account. */
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens
        }

        fun verificationAddress(verificationAddress: VerificationAddress) =
            verificationAddress(JsonField.of(verificationAddress))

        @JsonProperty("verification_address")
        @ExcludeMissing
        fun verificationAddress(verificationAddress: JsonField<VerificationAddress>) = apply {
            this.verificationAddress = verificationAddress
        }

        fun accountHolder(accountHolder: AccountHolder) = accountHolder(JsonField.of(accountHolder))

        @JsonProperty("account_holder")
        @ExcludeMissing
        fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
            this.accountHolder = accountHolder
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

        fun build(): Account =
            Account(
                spendLimit,
                state,
                token,
                authRuleTokens.map { it.toUnmodifiable() },
                verificationAddress,
                accountHolder,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     */
    @JsonDeserialize(builder = SpendLimit.Builder::class)
    @NoAutoDetect
    class SpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Daily spend limit (in cents). */
        fun daily(): Long = daily.getRequired("daily")

        /** Monthly spend limit (in cents). */
        fun monthly(): Long = monthly.getRequired("monthly")

        /** Total spend limit over account lifetime (in cents). */
        fun lifetime(): Long = lifetime.getRequired("lifetime")

        /** Daily spend limit (in cents). */
        @JsonProperty("daily") @ExcludeMissing fun _daily() = daily

        /** Monthly spend limit (in cents). */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        /** Total spend limit over account lifetime (in cents). */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime() = lifetime

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): SpendLimit = apply {
            if (!validated) {
                daily()
                monthly()
                lifetime()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimit &&
                this.daily == other.daily &&
                this.monthly == other.monthly &&
                this.lifetime == other.lifetime &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        daily,
                        monthly,
                        lifetime,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SpendLimit{daily=$daily, monthly=$monthly, lifetime=$lifetime, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var daily: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                this.daily = spendLimit.daily
                this.monthly = spendLimit.monthly
                this.lifetime = spendLimit.lifetime
                additionalProperties(spendLimit.additionalProperties)
            }

            /** Daily spend limit (in cents). */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /** Daily spend limit (in cents). */
            @JsonProperty("daily")
            @ExcludeMissing
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /** Monthly spend limit (in cents). */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /** Monthly spend limit (in cents). */
            @JsonProperty("monthly")
            @ExcludeMissing
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

            /** Total spend limit over account lifetime (in cents). */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /** Total spend limit over account lifetime (in cents). */
            @JsonProperty("lifetime")
            @ExcludeMissing
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

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

            fun build(): SpendLimit =
                SpendLimit(
                    daily,
                    monthly,
                    lifetime,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val ACTIVE = State(JsonField.of("ACTIVE"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

            @JvmField val CLOSED = State(JsonField.of("CLOSED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            PAUSED,
            CLOSED,
        }

        enum class Value {
            ACTIVE,
            PAUSED,
            CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                PAUSED -> Value.PAUSED
                CLOSED -> Value.CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                PAUSED -> Known.PAUSED
                CLOSED -> Known.CLOSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = VerificationAddress.Builder::class)
    @NoAutoDetect
    class VerificationAddress
    private constructor(
        private val address1: JsonField<String>,
        private val address2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Valid deliverable address (no PO boxes). */
        fun address1(): String = address1.getRequired("address1")

        /** Unit or apartment number (if applicable). */
        fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

        /** City name. */
        fun city(): String = city.getRequired("city")

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
        fun state(): String = state.getRequired("state")

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country name. Only USA is currently supported. */
        fun country(): String = country.getRequired("country")

        /** Valid deliverable address (no PO boxes). */
        @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

        /** Unit or apartment number (if applicable). */
        @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

        /** City name. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country name. Only USA is currently supported. */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): VerificationAddress = apply {
            if (!validated) {
                address1()
                address2()
                city()
                state()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationAddress &&
                this.address1 == other.address1 &&
                this.address2 == other.address2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        address1,
                        address2,
                        city,
                        state,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "VerificationAddress{address1=$address1, address2=$address2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address1: JsonField<String> = JsonMissing.of()
            private var address2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationAddress: VerificationAddress) = apply {
                this.address1 = verificationAddress.address1
                this.address2 = verificationAddress.address2
                this.city = verificationAddress.city
                this.state = verificationAddress.state
                this.postalCode = verificationAddress.postalCode
                this.country = verificationAddress.country
                additionalProperties(verificationAddress.additionalProperties)
            }

            /** Valid deliverable address (no PO boxes). */
            fun address1(address1: String) = address1(JsonField.of(address1))

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1")
            @ExcludeMissing
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** Unit or apartment number (if applicable). */
            fun address2(address2: String) = address2(JsonField.of(address2))

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2")
            @ExcludeMissing
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            /** City name. */
            fun city(city: String) = city(JsonField.of(city))

            /** City name. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country name. Only USA is currently supported. */
            fun country(country: String) = country(JsonField.of(country))

            /** Country name. Only USA is currently supported. */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun build(): VerificationAddress =
                VerificationAddress(
                    address1,
                    address2,
                    city,
                    state,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = AccountHolder.Builder::class)
    @NoAutoDetect
    class AccountHolder
    private constructor(
        private val token: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val email: JsonField<String>,
        private val businessAccountToken: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Globally unique identifier for the account holder. */
        fun token(): String = token.getRequired("token")

        /** Phone number of the individual. */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /** Email address. */
        fun email(): String = email.getRequired("email")

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Account_token of the enrolled business associated with an enrolled
         * AUTHORIZED_USER individual.
         */
        fun businessAccountToken(): String =
            businessAccountToken.getRequired("business_account_token")

        /** Globally unique identifier for the account holder. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /** Phone number of the individual. */
        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        /** Email address. */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Account_token of the enrolled business associated with an enrolled
         * AUTHORIZED_USER individual.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun _businessAccountToken() = businessAccountToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountHolder = apply {
            if (!validated) {
                token()
                phoneNumber()
                email()
                businessAccountToken()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolder &&
                this.token == other.token &&
                this.phoneNumber == other.phoneNumber &&
                this.email == other.email &&
                this.businessAccountToken == other.businessAccountToken &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        token,
                        phoneNumber,
                        email,
                        businessAccountToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolder{token=$token, phoneNumber=$phoneNumber, email=$email, businessAccountToken=$businessAccountToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var businessAccountToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolder: AccountHolder) = apply {
                this.token = accountHolder.token
                this.phoneNumber = accountHolder.phoneNumber
                this.email = accountHolder.email
                this.businessAccountToken = accountHolder.businessAccountToken
                additionalProperties(accountHolder.additionalProperties)
            }

            /** Globally unique identifier for the account holder. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for the account holder. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Phone number of the individual. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /** Phone number of the individual. */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Email address. */
            fun email(email: String) = email(JsonField.of(email))

            /** Email address. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Account_token of the enrolled business associated with an
             * enrolled AUTHORIZED_USER individual.
             */
            fun businessAccountToken(businessAccountToken: String) =
                businessAccountToken(JsonField.of(businessAccountToken))

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Account_token of the enrolled business associated with an
             * enrolled AUTHORIZED_USER individual.
             */
            @JsonProperty("business_account_token")
            @ExcludeMissing
            fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                this.businessAccountToken = businessAccountToken
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

            fun build(): AccountHolder =
                AccountHolder(
                    token,
                    phoneNumber,
                    email,
                    businessAccountToken,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
