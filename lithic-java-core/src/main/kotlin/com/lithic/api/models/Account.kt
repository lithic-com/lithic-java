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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Account
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val spendLimit: JsonField<SpendLimit>,
    private val state: JsonField<State>,
    private val accountHolder: JsonField<AccountHolder>,
    private val authRuleTokens: JsonField<List<String>>,
    private val cardholderCurrency: JsonField<String>,
    private val comment: JsonField<String>,
    private val substatus: JsonField<Substatus>,
    private val verificationAddress: JsonField<VerificationAddress>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        spendLimit: JsonField<SpendLimit> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("account_holder")
        @ExcludeMissing
        accountHolder: JsonField<AccountHolder> = JsonMissing.of(),
        @JsonProperty("auth_rule_tokens")
        @ExcludeMissing
        authRuleTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("substatus")
        @ExcludeMissing
        substatus: JsonField<Substatus> = JsonMissing.of(),
        @JsonProperty("verification_address")
        @ExcludeMissing
        verificationAddress: JsonField<VerificationAddress> = JsonMissing.of(),
    ) : this(
        token,
        created,
        spendLimit,
        state,
        accountHolder,
        authRuleTokens,
        cardholderCurrency,
        comment,
        substatus,
        verificationAddress,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the account. This is the same as the account_token returned by
     * the enroll endpoint. If using this parameter, do not include pagination.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Timestamp of when the account was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimit(): SpendLimit = spendLimit.getRequired("spend_limit")

    /**
     * Account state:
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     *   `ACTIVE`.
     * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts are
     *   unable to be transitioned to `ACTIVE` or `PAUSED` states. Accounts can be manually set to
     *   `CLOSED`, or this can be done by Lithic due to failure to pass KYB/KYC or for
     *   risk/compliance reasons. Please contact [support@lithic.com](mailto:support@lithic.com) if
     *   you believe this was done by mistake.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountHolder(): Optional<AccountHolder> = accountHolder.getOptional("account_holder")

    /**
     * List of identifiers for the Auth Rule(s) that are applied on the account. This field is
     * deprecated and will no longer be populated in the `account_holder` object. The key will be
     * removed from the schema in a future release. Use the `/auth_rules` endpoints to fetch Auth
     * Rule information instead.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun authRuleTokens(): Optional<List<String>> = authRuleTokens.getOptional("auth_rule_tokens")

    /**
     * 3-character alphabetic ISO 4217 code for the currency of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderCurrency(): Optional<String> =
        cardholderCurrency.getOptional("cardholder_currency")

    /**
     * Additional context or information related to the account.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * Account state substatus values:
     * - `FRAUD_IDENTIFIED` - The account has been recognized as being created or used with stolen
     *   or fabricated identity information, encompassing both true identity theft and synthetic
     *   identities.
     * - `SUSPICIOUS_ACTIVITY` - The account has exhibited suspicious behavior, such as unauthorized
     *   access or fraudulent transactions, necessitating further investigation.
     * - `RISK_VIOLATION` - The account has been involved in deliberate misuse by the legitimate
     *   account holder. Examples include disputing valid transactions without cause, falsely
     *   claiming non-receipt of goods, or engaging in intentional bust-out schemes to exploit
     *   account services.
     * - `END_USER_REQUEST` - The account holder has voluntarily requested the closure of the
     *   account for personal reasons. This encompasses situations such as bankruptcy, other
     *   financial considerations, or the account holder's death.
     * - `ISSUER_REQUEST` - The issuer has initiated the closure of the account due to business
     *   strategy, risk management, inactivity, product changes, regulatory concerns, or violations
     *   of terms and conditions.
     * - `NOT_ACTIVE` - The account has not had any transactions or payment activity within a
     *   specified period. This status applies to accounts that are paused or closed due to
     *   inactivity.
     * - `INTERNAL_REVIEW` - The account is temporarily paused pending further internal review. In
     *   future implementations, this status may prevent clients from activating the account via
     *   APIs until the review is completed.
     * - `OTHER` - The reason for the account's current status does not fall into any of the above
     *   categories. A comment should be provided to specify the particular reason.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun substatus(): Optional<Substatus> = substatus.getOptional("substatus")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun verificationAddress(): Optional<VerificationAddress> =
        verificationAddress.getOptional("verification_address")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<SpendLimit> = spendLimit

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [accountHolder].
     *
     * Unlike [accountHolder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_holder")
    @ExcludeMissing
    fun _accountHolder(): JsonField<AccountHolder> = accountHolder

    /**
     * Returns the raw JSON value of [authRuleTokens].
     *
     * Unlike [authRuleTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("auth_rule_tokens")
    @ExcludeMissing
    fun _authRuleTokens(): JsonField<List<String>> = authRuleTokens

    /**
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("substatus") @ExcludeMissing fun _substatus(): JsonField<Substatus> = substatus

    /**
     * Returns the raw JSON value of [verificationAddress].
     *
     * Unlike [verificationAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("verification_address")
    @ExcludeMissing
    fun _verificationAddress(): JsonField<VerificationAddress> = verificationAddress

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
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .spendLimit()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var spendLimit: JsonField<SpendLimit>? = null
        private var state: JsonField<State>? = null
        private var accountHolder: JsonField<AccountHolder> = JsonMissing.of()
        private var authRuleTokens: JsonField<MutableList<String>>? = null
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var comment: JsonField<String> = JsonMissing.of()
        private var substatus: JsonField<Substatus> = JsonMissing.of()
        private var verificationAddress: JsonField<VerificationAddress> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            token = account.token
            created = account.created
            spendLimit = account.spendLimit
            state = account.state
            accountHolder = account.accountHolder
            authRuleTokens = account.authRuleTokens.map { it.toMutableList() }
            cardholderCurrency = account.cardholderCurrency
            comment = account.comment
            substatus = account.substatus
            verificationAddress = account.verificationAddress
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        /**
         * Globally unique identifier for the account. This is the same as the account_token
         * returned by the enroll endpoint. If using this parameter, do not include pagination.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when the account was created. */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Alias for calling [Builder.created] with `created.orElse(null)`. */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Spend limit information for the user containing the daily, monthly, and lifetime spend
         * limit of the account. Any charges to a card owned by this account will be declined once
         * their transaction volume has surpassed the value in the applicable time limit (rolling).
         * A lifetime limit of 0 indicates that the lifetime limit feature is disabled.
         */
        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [SpendLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        /**
         * Account state:
         * - `ACTIVE` - Account is able to transact and create new cards.
         * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back
         *   to `ACTIVE`.
         * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts
         *   are unable to be transitioned to `ACTIVE` or `PAUSED` states. Accounts can be manually
         *   set to `CLOSED`, or this can be done by Lithic due to failure to pass KYB/KYC or for
         *   risk/compliance reasons. Please contact [support@lithic.com](mailto:support@lithic.com)
         *   if you believe this was done by mistake.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        fun accountHolder(accountHolder: AccountHolder) = accountHolder(JsonField.of(accountHolder))

        /**
         * Sets [Builder.accountHolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolder] with a well-typed [AccountHolder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
            this.accountHolder = accountHolder
        }

        /**
         * List of identifiers for the Auth Rule(s) that are applied on the account. This field is
         * deprecated and will no longer be populated in the `account_holder` object. The key will
         * be removed from the schema in a future release. Use the `/auth_rules` endpoints to fetch
         * Auth Rule information instead.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /**
         * Sets [Builder.authRuleTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [authRuleTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addAuthRuleToken(authRuleToken: String) = apply {
            authRuleTokens =
                (authRuleTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authRuleTokens", it).add(authRuleToken)
                }
        }

        /** 3-character alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /**
         * Sets [Builder.cardholderCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
        }

        /** Additional context or information related to the account. */
        fun comment(comment: String) = comment(JsonField.of(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /**
         * Account state substatus values:
         * - `FRAUD_IDENTIFIED` - The account has been recognized as being created or used with
         *   stolen or fabricated identity information, encompassing both true identity theft and
         *   synthetic identities.
         * - `SUSPICIOUS_ACTIVITY` - The account has exhibited suspicious behavior, such as
         *   unauthorized access or fraudulent transactions, necessitating further investigation.
         * - `RISK_VIOLATION` - The account has been involved in deliberate misuse by the legitimate
         *   account holder. Examples include disputing valid transactions without cause, falsely
         *   claiming non-receipt of goods, or engaging in intentional bust-out schemes to exploit
         *   account services.
         * - `END_USER_REQUEST` - The account holder has voluntarily requested the closure of the
         *   account for personal reasons. This encompasses situations such as bankruptcy, other
         *   financial considerations, or the account holder's death.
         * - `ISSUER_REQUEST` - The issuer has initiated the closure of the account due to business
         *   strategy, risk management, inactivity, product changes, regulatory concerns, or
         *   violations of terms and conditions.
         * - `NOT_ACTIVE` - The account has not had any transactions or payment activity within a
         *   specified period. This status applies to accounts that are paused or closed due to
         *   inactivity.
         * - `INTERNAL_REVIEW` - The account is temporarily paused pending further internal review.
         *   In future implementations, this status may prevent clients from activating the account
         *   via APIs until the review is completed.
         * - `OTHER` - The reason for the account's current status does not fall into any of the
         *   above categories. A comment should be provided to specify the particular reason.
         */
        fun substatus(substatus: Substatus) = substatus(JsonField.of(substatus))

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed [Substatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun substatus(substatus: JsonField<Substatus>) = apply { this.substatus = substatus }

        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: VerificationAddress) =
            verificationAddress(JsonField.of(verificationAddress))

        /**
         * Sets [Builder.verificationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationAddress] with a well-typed
         * [VerificationAddress] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: JsonField<VerificationAddress>) = apply {
            this.verificationAddress = verificationAddress
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Account].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .spendLimit()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Account =
            Account(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("spendLimit", spendLimit),
                checkRequired("state", state),
                accountHolder,
                (authRuleTokens ?: JsonMissing.of()).map { it.toImmutable() },
                cardholderCurrency,
                comment,
                substatus,
                verificationAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        spendLimit().validate()
        state().validate()
        accountHolder().ifPresent { it.validate() }
        authRuleTokens()
        cardholderCurrency()
        comment()
        substatus().ifPresent { it.validate() }
        verificationAddress().ifPresent { it.validate() }
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
            (if (created.asKnown().isPresent) 1 else 0) +
            (spendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (accountHolder.asKnown().getOrNull()?.validity() ?: 0) +
            (authRuleTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (substatus.asKnown().getOrNull()?.validity() ?: 0) +
            (verificationAddress.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     */
    class SpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("daily") @ExcludeMissing daily: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime") @ExcludeMissing lifetime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(daily, lifetime, monthly, mutableMapOf())

        /**
         * Daily spend limit (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun daily(): Long = daily.getRequired("daily")

        /**
         * Total spend limit over account lifetime (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lifetime(): Long = lifetime.getRequired("lifetime")

        /**
         * Monthly spend limit (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthly(): Long = monthly.getRequired("monthly")

        /**
         * Returns the raw JSON value of [daily].
         *
         * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Long> = daily

        /**
         * Returns the raw JSON value of [lifetime].
         *
         * Unlike [lifetime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime(): JsonField<Long> = lifetime

        /**
         * Returns the raw JSON value of [monthly].
         *
         * Unlike [monthly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

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
             * Returns a mutable builder for constructing an instance of [SpendLimit].
             *
             * The following fields are required:
             * ```java
             * .daily()
             * .lifetime()
             * .monthly()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendLimit]. */
        class Builder internal constructor() {

            private var daily: JsonField<Long>? = null
            private var lifetime: JsonField<Long>? = null
            private var monthly: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                daily = spendLimit.daily
                lifetime = spendLimit.lifetime
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** Daily spend limit (in cents). */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Sets [Builder.daily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daily] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /** Total spend limit over account lifetime (in cents). */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Sets [Builder.lifetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /** Monthly spend limit (in cents). */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Sets [Builder.monthly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthly] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [SpendLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .daily()
             * .lifetime()
             * .monthly()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpendLimit =
                SpendLimit(
                    checkRequired("daily", daily),
                    checkRequired("lifetime", lifetime),
                    checkRequired("monthly", monthly),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            daily()
            lifetime()
            monthly()
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
            (if (daily.asKnown().isPresent) 1 else 0) +
                (if (lifetime.asKnown().isPresent) 1 else 0) +
                (if (monthly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimit &&
                daily == other.daily &&
                lifetime == other.lifetime &&
                monthly == other.monthly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(daily, lifetime, monthly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    /**
     * Account state:
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     *   `ACTIVE`.
     * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts are
     *   unable to be transitioned to `ACTIVE` or `PAUSED` states. Accounts can be manually set to
     *   `CLOSED`, or this can be done by Lithic due to failure to pass KYB/KYC or for
     *   risk/compliance reasons. Please contact [support@lithic.com](mailto:support@lithic.com) if
     *   you believe this was done by mistake.
     */
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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val PAUSED = of("PAUSED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
            PAUSED,
            CLOSED,
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
            ACTIVE,
            PAUSED,
            CLOSED,
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
                ACTIVE -> Value.ACTIVE
                PAUSED -> Value.PAUSED
                CLOSED -> Value.CLOSED
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
                ACTIVE -> Known.ACTIVE
                PAUSED -> Known.PAUSED
                CLOSED -> Known.CLOSED
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

    class AccountHolder
    private constructor(
        private val token: JsonField<String>,
        private val businessAccountToken: JsonField<String>,
        private val email: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_account_token")
            @ExcludeMissing
            businessAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(token, businessAccountToken, email, phoneNumber, mutableMapOf())

        /**
         * Globally unique identifier for the account holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Account_token of the enrolled business associated with an enrolled
         * AUTHORIZED_USER individual.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessAccountToken(): String =
            businessAccountToken.getRequired("business_account_token")

        /**
         * Email address.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Phone number of the individual.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [businessAccountToken].
         *
         * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun _businessAccountToken(): JsonField<String> = businessAccountToken

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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
             * Returns a mutable builder for constructing an instance of [AccountHolder].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .businessAccountToken()
             * .email()
             * .phoneNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountHolder]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var businessAccountToken: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolder: AccountHolder) = apply {
                token = accountHolder.token
                businessAccountToken = accountHolder.businessAccountToken
                email = accountHolder.email
                phoneNumber = accountHolder.phoneNumber
                additionalProperties = accountHolder.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the account holder. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Account_token of the enrolled business associated with an
             * enrolled AUTHORIZED_USER individual.
             */
            fun businessAccountToken(businessAccountToken: String) =
                businessAccountToken(JsonField.of(businessAccountToken))

            /**
             * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                this.businessAccountToken = businessAccountToken
            }

            /** Email address. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Phone number of the individual. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AccountHolder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .businessAccountToken()
             * .email()
             * .phoneNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountHolder =
                AccountHolder(
                    checkRequired("token", token),
                    checkRequired("businessAccountToken", businessAccountToken),
                    checkRequired("email", email),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountHolder = apply {
            if (validated) {
                return@apply
            }

            token()
            businessAccountToken()
            email()
            phoneNumber()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (businessAccountToken.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolder &&
                token == other.token &&
                businessAccountToken == other.businessAccountToken &&
                email == other.email &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(token, businessAccountToken, email, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolder{token=$token, businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * Account state substatus values:
     * - `FRAUD_IDENTIFIED` - The account has been recognized as being created or used with stolen
     *   or fabricated identity information, encompassing both true identity theft and synthetic
     *   identities.
     * - `SUSPICIOUS_ACTIVITY` - The account has exhibited suspicious behavior, such as unauthorized
     *   access or fraudulent transactions, necessitating further investigation.
     * - `RISK_VIOLATION` - The account has been involved in deliberate misuse by the legitimate
     *   account holder. Examples include disputing valid transactions without cause, falsely
     *   claiming non-receipt of goods, or engaging in intentional bust-out schemes to exploit
     *   account services.
     * - `END_USER_REQUEST` - The account holder has voluntarily requested the closure of the
     *   account for personal reasons. This encompasses situations such as bankruptcy, other
     *   financial considerations, or the account holder's death.
     * - `ISSUER_REQUEST` - The issuer has initiated the closure of the account due to business
     *   strategy, risk management, inactivity, product changes, regulatory concerns, or violations
     *   of terms and conditions.
     * - `NOT_ACTIVE` - The account has not had any transactions or payment activity within a
     *   specified period. This status applies to accounts that are paused or closed due to
     *   inactivity.
     * - `INTERNAL_REVIEW` - The account is temporarily paused pending further internal review. In
     *   future implementations, this status may prevent clients from activating the account via
     *   APIs until the review is completed.
     * - `OTHER` - The reason for the account's current status does not fall into any of the above
     *   categories. A comment should be provided to specify the particular reason.
     */
    class Substatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FRAUD_IDENTIFIED = of("FRAUD_IDENTIFIED")

            @JvmField val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

            @JvmField val RISK_VIOLATION = of("RISK_VIOLATION")

            @JvmField val END_USER_REQUEST = of("END_USER_REQUEST")

            @JvmField val ISSUER_REQUEST = of("ISSUER_REQUEST")

            @JvmField val NOT_ACTIVE = of("NOT_ACTIVE")

            @JvmField val INTERNAL_REVIEW = of("INTERNAL_REVIEW")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Substatus(JsonField.of(value))
        }

        /** An enum containing [Substatus]'s known values. */
        enum class Known {
            FRAUD_IDENTIFIED,
            SUSPICIOUS_ACTIVITY,
            RISK_VIOLATION,
            END_USER_REQUEST,
            ISSUER_REQUEST,
            NOT_ACTIVE,
            INTERNAL_REVIEW,
            OTHER,
        }

        /**
         * An enum containing [Substatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Substatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FRAUD_IDENTIFIED,
            SUSPICIOUS_ACTIVITY,
            RISK_VIOLATION,
            END_USER_REQUEST,
            ISSUER_REQUEST,
            NOT_ACTIVE,
            INTERNAL_REVIEW,
            OTHER,
            /**
             * An enum member indicating that [Substatus] was instantiated with an unknown value.
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
                FRAUD_IDENTIFIED -> Value.FRAUD_IDENTIFIED
                SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
                RISK_VIOLATION -> Value.RISK_VIOLATION
                END_USER_REQUEST -> Value.END_USER_REQUEST
                ISSUER_REQUEST -> Value.ISSUER_REQUEST
                NOT_ACTIVE -> Value.NOT_ACTIVE
                INTERNAL_REVIEW -> Value.INTERNAL_REVIEW
                OTHER -> Value.OTHER
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
                FRAUD_IDENTIFIED -> Known.FRAUD_IDENTIFIED
                SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
                RISK_VIOLATION -> Known.RISK_VIOLATION
                END_USER_REQUEST -> Known.END_USER_REQUEST
                ISSUER_REQUEST -> Known.ISSUER_REQUEST
                NOT_ACTIVE -> Known.NOT_ACTIVE
                INTERNAL_REVIEW -> Known.INTERNAL_REVIEW
                OTHER -> Known.OTHER
                else -> throw LithicInvalidDataException("Unknown Substatus: $value")
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

        fun validate(): Substatus = apply {
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

            return other is Substatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @Deprecated("deprecated")
    class VerificationAddress
    private constructor(
        private val address1: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val address2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        ) : this(address1, city, country, postalCode, state, address2, mutableMapOf())

        /**
         * Valid deliverable address (no PO boxes).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address1(): String = address1.getRequired("address1")

        /**
         * City name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country name. Only USA is currently supported.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Valid postal code. Only USA postal codes (ZIP codes) are currently supported, entered as
         * a five-digit postal code or nine-digit postal code (ZIP+4) using the format 12345-1234.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Unit or apartment number (if applicable).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address2(): Optional<String> = address2.getOptional("address2")

        /**
         * Returns the raw JSON value of [address1].
         *
         * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [address2].
         *
         * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

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
             * Returns a mutable builder for constructing an instance of [VerificationAddress].
             *
             * The following fields are required:
             * ```java
             * .address1()
             * .city()
             * .country()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VerificationAddress]. */
        class Builder internal constructor() {

            private var address1: JsonField<String>? = null
            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var address2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationAddress: VerificationAddress) = apply {
                address1 = verificationAddress.address1
                city = verificationAddress.city
                country = verificationAddress.country
                postalCode = verificationAddress.postalCode
                state = verificationAddress.state
                address2 = verificationAddress.address2
                additionalProperties = verificationAddress.additionalProperties.toMutableMap()
            }

            /** Valid deliverable address (no PO boxes). */
            fun address1(address1: String) = address1(JsonField.of(address1))

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** City name. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Country name. Only USA is currently supported. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Valid postal code. Only USA postal codes (ZIP codes) are currently supported, entered
             * as a five-digit postal code or nine-digit postal code (ZIP+4) using the format
             * 12345-1234.
             */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Unit or apartment number (if applicable). */
            fun address2(address2: String) = address2(JsonField.of(address2))

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [VerificationAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address1()
             * .city()
             * .country()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VerificationAddress =
                VerificationAddress(
                    checkRequired("address1", address1),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    address2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VerificationAddress = apply {
            if (validated) {
                return@apply
            }

            address1()
            city()
            country()
            postalCode()
            state()
            address2()
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
            (if (address1.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (address2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationAddress &&
                address1 == other.address1 &&
                city == other.city &&
                country == other.country &&
                postalCode == other.postalCode &&
                state == other.state &&
                address2 == other.address2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationAddress{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            token == other.token &&
            created == other.created &&
            spendLimit == other.spendLimit &&
            state == other.state &&
            accountHolder == other.accountHolder &&
            authRuleTokens == other.authRuleTokens &&
            cardholderCurrency == other.cardholderCurrency &&
            comment == other.comment &&
            substatus == other.substatus &&
            verificationAddress == other.verificationAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            created,
            spendLimit,
            state,
            accountHolder,
            authRuleTokens,
            cardholderCurrency,
            comment,
            substatus,
            verificationAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{token=$token, created=$created, spendLimit=$spendLimit, state=$state, accountHolder=$accountHolder, authRuleTokens=$authRuleTokens, cardholderCurrency=$cardholderCurrency, comment=$comment, substatus=$substatus, verificationAddress=$verificationAddress, additionalProperties=$additionalProperties}"
}
