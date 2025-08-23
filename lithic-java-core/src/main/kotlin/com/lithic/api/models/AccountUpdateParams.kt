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
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update account configuration such as state or spend limits. Can only be run on accounts that are
 * part of the program managed by this API key. Accounts that are in the `PAUSED` state will not be
 * able to transact or create new cards.
 */
class AccountUpdateParams
private constructor(
    private val accountToken: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /**
     * Additional context or information related to the account.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = body.comment()

    /**
     * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000 limit).
     * By default the daily spend limit is set to $1,250.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimit(): Optional<Long> = body.dailySpendLimit()

    /**
     * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
     * limit). Once this limit is reached, no transactions will be accepted on any card created for
     * this account until the limit is updated. Note that a spend limit of 0 is effectively no
     * limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or above
     * will result in declined transactions due to checks against the account limit. This behavior
     * differs from the daily spend limit and the monthly spend limit.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lifetimeSpendLimit(): Optional<Long> = body.lifetimeSpendLimit()

    /**
     * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
     * limit). By default the monthly spend limit is set to $5,000.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlySpendLimit(): Optional<Long> = body.monthlySpendLimit()

    /**
     * Account states.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<State> = body.state()

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
    fun substatus(): Optional<Substatus> = body.substatus()

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by Auth Rules.
     * The field will be removed from the schema in a future release.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun verificationAddress(): Optional<VerificationAddress> = body.verificationAddress()

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _comment(): JsonField<String> = body._comment()

    /**
     * Returns the raw JSON value of [dailySpendLimit].
     *
     * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dailySpendLimit(): JsonField<Long> = body._dailySpendLimit()

    /**
     * Returns the raw JSON value of [lifetimeSpendLimit].
     *
     * Unlike [lifetimeSpendLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lifetimeSpendLimit(): JsonField<Long> = body._lifetimeSpendLimit()

    /**
     * Returns the raw JSON value of [monthlySpendLimit].
     *
     * Unlike [monthlySpendLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _monthlySpendLimit(): JsonField<Long> = body._monthlySpendLimit()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<State> = body._state()

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _substatus(): JsonField<Substatus> = body._substatus()

    /**
     * Returns the raw JSON value of [verificationAddress].
     *
     * Unlike [verificationAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _verificationAddress(): JsonField<VerificationAddress> = body._verificationAddress()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AccountUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateParams]. */
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            accountToken = accountUpdateParams.accountToken
            body = accountUpdateParams.body.toBuilder()
            additionalHeaders = accountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [comment]
         * - [dailySpendLimit]
         * - [lifetimeSpendLimit]
         * - [monthlySpendLimit]
         * - [state]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Additional context or information related to the account. */
        fun comment(comment: String) = apply { body.comment(comment) }

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { body.comment(comment) }

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
         */
        fun dailySpendLimit(dailySpendLimit: Long) = apply { body.dailySpendLimit(dailySpendLimit) }

        /**
         * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dailySpendLimit(dailySpendLimit: JsonField<Long>) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /**
         * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
         * limit). Once this limit is reached, no transactions will be accepted on any card created
         * for this account until the limit is updated. Note that a spend limit of 0 is effectively
         * no limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or
         * above will result in declined transactions due to checks against the account limit. This
         * behavior differs from the daily spend limit and the monthly spend limit.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: Long) = apply {
            body.lifetimeSpendLimit(lifetimeSpendLimit)
        }

        /**
         * Sets [Builder.lifetimeSpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifetimeSpendLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: JsonField<Long>) = apply {
            body.lifetimeSpendLimit(lifetimeSpendLimit)
        }

        /**
         * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
         * limit). By default the monthly spend limit is set to $5,000.
         */
        fun monthlySpendLimit(monthlySpendLimit: Long) = apply {
            body.monthlySpendLimit(monthlySpendLimit)
        }

        /**
         * Sets [Builder.monthlySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlySpendLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthlySpendLimit(monthlySpendLimit: JsonField<Long>) = apply {
            body.monthlySpendLimit(monthlySpendLimit)
        }

        /** Account states. */
        fun state(state: State) = apply { body.state(state) }

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { body.state(state) }

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
        fun substatus(substatus: Substatus) = apply { body.substatus(substatus) }

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed [Substatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun substatus(substatus: JsonField<Substatus>) = apply { body.substatus(substatus) }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Auth Rules. The field will be removed from the schema in a future release.
         */
        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: VerificationAddress) = apply {
            body.verificationAddress(verificationAddress)
        }

        /**
         * Sets [Builder.verificationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationAddress] with a well-typed
         * [VerificationAddress] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: JsonField<VerificationAddress>) = apply {
            body.verificationAddress(verificationAddress)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AccountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                accountToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val comment: JsonField<String>,
        private val dailySpendLimit: JsonField<Long>,
        private val lifetimeSpendLimit: JsonField<Long>,
        private val monthlySpendLimit: JsonField<Long>,
        private val state: JsonField<State>,
        private val substatus: JsonField<Substatus>,
        private val verificationAddress: JsonField<VerificationAddress>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("daily_spend_limit")
            @ExcludeMissing
            dailySpendLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime_spend_limit")
            @ExcludeMissing
            lifetimeSpendLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly_spend_limit")
            @ExcludeMissing
            monthlySpendLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("substatus")
            @ExcludeMissing
            substatus: JsonField<Substatus> = JsonMissing.of(),
            @JsonProperty("verification_address")
            @ExcludeMissing
            verificationAddress: JsonField<VerificationAddress> = JsonMissing.of(),
        ) : this(
            comment,
            dailySpendLimit,
            lifetimeSpendLimit,
            monthlySpendLimit,
            state,
            substatus,
            verificationAddress,
            mutableMapOf(),
        )

        /**
         * Additional context or information related to the account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comment(): Optional<String> = comment.getOptional("comment")

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dailySpendLimit(): Optional<Long> = dailySpendLimit.getOptional("daily_spend_limit")

        /**
         * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
         * limit). Once this limit is reached, no transactions will be accepted on any card created
         * for this account until the limit is updated. Note that a spend limit of 0 is effectively
         * no limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or
         * above will result in declined transactions due to checks against the account limit. This
         * behavior differs from the daily spend limit and the monthly spend limit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lifetimeSpendLimit(): Optional<Long> =
            lifetimeSpendLimit.getOptional("lifetime_spend_limit")

        /**
         * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
         * limit). By default the monthly spend limit is set to $5,000.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthlySpendLimit(): Optional<Long> =
            monthlySpendLimit.getOptional("monthly_spend_limit")

        /**
         * Account states.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<State> = state.getOptional("state")

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun substatus(): Optional<Substatus> = substatus.getOptional("substatus")

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Auth Rules. The field will be removed from the schema in a future release.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun verificationAddress(): Optional<VerificationAddress> =
            verificationAddress.getOptional("verification_address")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [dailySpendLimit].
         *
         * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("daily_spend_limit")
        @ExcludeMissing
        fun _dailySpendLimit(): JsonField<Long> = dailySpendLimit

        /**
         * Returns the raw JSON value of [lifetimeSpendLimit].
         *
         * Unlike [lifetimeSpendLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("lifetime_spend_limit")
        @ExcludeMissing
        fun _lifetimeSpendLimit(): JsonField<Long> = lifetimeSpendLimit

        /**
         * Returns the raw JSON value of [monthlySpendLimit].
         *
         * Unlike [monthlySpendLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthly_spend_limit")
        @ExcludeMissing
        fun _monthlySpendLimit(): JsonField<Long> = monthlySpendLimit

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Returns the raw JSON value of [substatus].
         *
         * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("substatus")
        @ExcludeMissing
        fun _substatus(): JsonField<Substatus> = substatus

        /**
         * Returns the raw JSON value of [verificationAddress].
         *
         * Unlike [verificationAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var comment: JsonField<String> = JsonMissing.of()
            private var dailySpendLimit: JsonField<Long> = JsonMissing.of()
            private var lifetimeSpendLimit: JsonField<Long> = JsonMissing.of()
            private var monthlySpendLimit: JsonField<Long> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var substatus: JsonField<Substatus> = JsonMissing.of()
            private var verificationAddress: JsonField<VerificationAddress> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                comment = body.comment
                dailySpendLimit = body.dailySpendLimit
                lifetimeSpendLimit = body.lifetimeSpendLimit
                monthlySpendLimit = body.monthlySpendLimit
                state = body.state
                substatus = body.substatus
                verificationAddress = body.verificationAddress
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Additional context or information related to the account. */
            fun comment(comment: String) = comment(JsonField.of(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

            /**
             * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
             * limit). By default the daily spend limit is set to $1,250.
             */
            fun dailySpendLimit(dailySpendLimit: Long) =
                dailySpendLimit(JsonField.of(dailySpendLimit))

            /**
             * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailySpendLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailySpendLimit(dailySpendLimit: JsonField<Long>) = apply {
                this.dailySpendLimit = dailySpendLimit
            }

            /**
             * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a
             * $1,000 limit). Once this limit is reached, no transactions will be accepted on any
             * card created for this account until the limit is updated. Note that a spend limit of
             * 0 is effectively no limit, and should only be used to reset or remove a prior limit.
             * Only a limit of 1 or above will result in declined transactions due to checks against
             * the account limit. This behavior differs from the daily spend limit and the monthly
             * spend limit.
             */
            fun lifetimeSpendLimit(lifetimeSpendLimit: Long) =
                lifetimeSpendLimit(JsonField.of(lifetimeSpendLimit))

            /**
             * Sets [Builder.lifetimeSpendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetimeSpendLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetimeSpendLimit(lifetimeSpendLimit: JsonField<Long>) = apply {
                this.lifetimeSpendLimit = lifetimeSpendLimit
            }

            /**
             * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a
             * $1,000 limit). By default the monthly spend limit is set to $5,000.
             */
            fun monthlySpendLimit(monthlySpendLimit: Long) =
                monthlySpendLimit(JsonField.of(monthlySpendLimit))

            /**
             * Sets [Builder.monthlySpendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlySpendLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlySpendLimit(monthlySpendLimit: JsonField<Long>) = apply {
                this.monthlySpendLimit = monthlySpendLimit
            }

            /** Account states. */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /**
             * Account state substatus values:
             * - `FRAUD_IDENTIFIED` - The account has been recognized as being created or used with
             *   stolen or fabricated identity information, encompassing both true identity theft
             *   and synthetic identities.
             * - `SUSPICIOUS_ACTIVITY` - The account has exhibited suspicious behavior, such as
             *   unauthorized access or fraudulent transactions, necessitating further
             *   investigation.
             * - `RISK_VIOLATION` - The account has been involved in deliberate misuse by the
             *   legitimate account holder. Examples include disputing valid transactions without
             *   cause, falsely claiming non-receipt of goods, or engaging in intentional bust-out
             *   schemes to exploit account services.
             * - `END_USER_REQUEST` - The account holder has voluntarily requested the closure of
             *   the account for personal reasons. This encompasses situations such as bankruptcy,
             *   other financial considerations, or the account holder's death.
             * - `ISSUER_REQUEST` - The issuer has initiated the closure of the account due to
             *   business strategy, risk management, inactivity, product changes, regulatory
             *   concerns, or violations of terms and conditions.
             * - `NOT_ACTIVE` - The account has not had any transactions or payment activity within
             *   a specified period. This status applies to accounts that are paused or closed due
             *   to inactivity.
             * - `INTERNAL_REVIEW` - The account is temporarily paused pending further internal
             *   review. In future implementations, this status may prevent clients from activating
             *   the account via APIs until the review is completed.
             * - `OTHER` - The reason for the account's current status does not fall into any of the
             *   above categories. A comment should be provided to specify the particular reason.
             */
            fun substatus(substatus: Substatus) = substatus(JsonField.of(substatus))

            /**
             * Sets [Builder.substatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.substatus] with a well-typed [Substatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun substatus(substatus: JsonField<Substatus>) = apply { this.substatus = substatus }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Auth Rules. The field will be removed from the schema in a future
             * release.
             */
            @Deprecated("deprecated")
            fun verificationAddress(verificationAddress: VerificationAddress) =
                verificationAddress(JsonField.of(verificationAddress))

            /**
             * Sets [Builder.verificationAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationAddress] with a well-typed
             * [VerificationAddress] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun verificationAddress(verificationAddress: JsonField<VerificationAddress>) = apply {
                this.verificationAddress = verificationAddress
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    comment,
                    dailySpendLimit,
                    lifetimeSpendLimit,
                    monthlySpendLimit,
                    state,
                    substatus,
                    verificationAddress,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            comment()
            dailySpendLimit()
            lifetimeSpendLimit()
            monthlySpendLimit()
            state().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (comment.asKnown().isPresent) 1 else 0) +
                (if (dailySpendLimit.asKnown().isPresent) 1 else 0) +
                (if (lifetimeSpendLimit.asKnown().isPresent) 1 else 0) +
                (if (monthlySpendLimit.asKnown().isPresent) 1 else 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (substatus.asKnown().getOrNull()?.validity() ?: 0) +
                (verificationAddress.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                comment == other.comment &&
                dailySpendLimit == other.dailySpendLimit &&
                lifetimeSpendLimit == other.lifetimeSpendLimit &&
                monthlySpendLimit == other.monthlySpendLimit &&
                state == other.state &&
                substatus == other.substatus &&
                verificationAddress == other.verificationAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                comment,
                dailySpendLimit,
                lifetimeSpendLimit,
                monthlySpendLimit,
                state,
                substatus,
                verificationAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{comment=$comment, dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, state=$state, substatus=$substatus, verificationAddress=$verificationAddress, additionalProperties=$additionalProperties}"
    }

    /** Account states. */
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

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by Auth Rules.
     * The field will be removed from the schema in a future release.
     */
    @Deprecated("deprecated")
    class VerificationAddress
    private constructor(
        private val address1: JsonField<String>,
        private val address2: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2")
            @ExcludeMissing
            address2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(address1, address2, city, country, postalCode, state, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address1(): Optional<String> = address1.getOptional("address1")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address2(): Optional<String> = address2.getOptional("address2")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [address1].
         *
         * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /**
         * Returns the raw JSON value of [address2].
         *
         * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

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

            /** Returns a mutable builder for constructing an instance of [VerificationAddress]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VerificationAddress]. */
        class Builder internal constructor() {

            private var address1: JsonField<String> = JsonMissing.of()
            private var address2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationAddress: VerificationAddress) = apply {
                address1 = verificationAddress.address1
                address2 = verificationAddress.address2
                city = verificationAddress.city
                country = verificationAddress.country
                postalCode = verificationAddress.postalCode
                state = verificationAddress.state
                additionalProperties = verificationAddress.additionalProperties.toMutableMap()
            }

            fun address1(address1: String) = address1(JsonField.of(address1))

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            fun address2(address2: String) = address2(JsonField.of(address2))

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [VerificationAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VerificationAddress =
                VerificationAddress(
                    address1,
                    address2,
                    city,
                    country,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VerificationAddress = apply {
            if (validated) {
                return@apply
            }

            address1()
            address2()
            city()
            country()
            postalCode()
            state()
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
                (if (address2.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationAddress &&
                address1 == other.address1 &&
                address2 == other.address2 &&
                city == other.city &&
                country == other.country &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationAddress{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountUpdateParams &&
            accountToken == other.accountToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountUpdateParams{accountToken=$accountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
