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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Update account configuration such as state or spend limits. Can only be run on accounts that are
 * part of the program managed by this API key. Accounts that are in the `PAUSED` state will not be
 * able to transact or create new cards.
 */
class AccountUpdateParams
private constructor(
    private val accountToken: String,
    private val body: AccountUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountToken(): String = accountToken

    /**
     * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000 limit).
     * By default the daily spend limit is set to $1,250.
     */
    fun dailySpendLimit(): Optional<Long> = body.dailySpendLimit()

    /**
     * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
     * limit). Once this limit is reached, no transactions will be accepted on any card created for
     * this account until the limit is updated. Note that a spend limit of 0 is effectively no
     * limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or above
     * will result in declined transactions due to checks against the account limit. This behavior
     * differs from the daily spend limit and the monthly spend limit.
     */
    fun lifetimeSpendLimit(): Optional<Long> = body.lifetimeSpendLimit()

    /**
     * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
     * limit). By default the monthly spend limit is set to $5,000.
     */
    fun monthlySpendLimit(): Optional<Long> = body.monthlySpendLimit()

    /** Account states. */
    fun state(): Optional<State> = body.state()

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by
     * Authorization Rules. The field will be removed from the schema in a future release.
     */
    @Deprecated("deprecated")
    fun verificationAddress(): Optional<VerificationAddress> = body.verificationAddress()

    /**
     * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000 limit).
     * By default the daily spend limit is set to $1,250.
     */
    fun _dailySpendLimit(): JsonField<Long> = body._dailySpendLimit()

    /**
     * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
     * limit). Once this limit is reached, no transactions will be accepted on any card created for
     * this account until the limit is updated. Note that a spend limit of 0 is effectively no
     * limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or above
     * will result in declined transactions due to checks against the account limit. This behavior
     * differs from the daily spend limit and the monthly spend limit.
     */
    fun _lifetimeSpendLimit(): JsonField<Long> = body._lifetimeSpendLimit()

    /**
     * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
     * limit). By default the monthly spend limit is set to $5,000.
     */
    fun _monthlySpendLimit(): JsonField<Long> = body._monthlySpendLimit()

    /** Account states. */
    fun _state(): JsonField<State> = body._state()

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by
     * Authorization Rules. The field will be removed from the schema in a future release.
     */
    @Deprecated("deprecated")
    fun _verificationAddress(): JsonField<VerificationAddress> = body._verificationAddress()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): AccountUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("daily_spend_limit")
        @ExcludeMissing
        private val dailySpendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lifetime_spend_limit")
        @ExcludeMissing
        private val lifetimeSpendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthly_spend_limit")
        @ExcludeMissing
        private val monthlySpendLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("verification_address")
        @ExcludeMissing
        private val verificationAddress: JsonField<VerificationAddress> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
         */
        fun dailySpendLimit(): Optional<Long> =
            Optional.ofNullable(dailySpendLimit.getNullable("daily_spend_limit"))

        /**
         * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
         * limit). Once this limit is reached, no transactions will be accepted on any card created
         * for this account until the limit is updated. Note that a spend limit of 0 is effectively
         * no limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or
         * above will result in declined transactions due to checks against the account limit. This
         * behavior differs from the daily spend limit and the monthly spend limit.
         */
        fun lifetimeSpendLimit(): Optional<Long> =
            Optional.ofNullable(lifetimeSpendLimit.getNullable("lifetime_spend_limit"))

        /**
         * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
         * limit). By default the monthly spend limit is set to $5,000.
         */
        fun monthlySpendLimit(): Optional<Long> =
            Optional.ofNullable(monthlySpendLimit.getNullable("monthly_spend_limit"))

        /** Account states. */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        @Deprecated("deprecated")
        fun verificationAddress(): Optional<VerificationAddress> =
            Optional.ofNullable(verificationAddress.getNullable("verification_address"))

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
         */
        @JsonProperty("daily_spend_limit")
        @ExcludeMissing
        fun _dailySpendLimit(): JsonField<Long> = dailySpendLimit

        /**
         * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
         * limit). Once this limit is reached, no transactions will be accepted on any card created
         * for this account until the limit is updated. Note that a spend limit of 0 is effectively
         * no limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or
         * above will result in declined transactions due to checks against the account limit. This
         * behavior differs from the daily spend limit and the monthly spend limit.
         */
        @JsonProperty("lifetime_spend_limit")
        @ExcludeMissing
        fun _lifetimeSpendLimit(): JsonField<Long> = lifetimeSpendLimit

        /**
         * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
         * limit). By default the monthly spend limit is set to $5,000.
         */
        @JsonProperty("monthly_spend_limit")
        @ExcludeMissing
        fun _monthlySpendLimit(): JsonField<Long> = monthlySpendLimit

        /** Account states. */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        @Deprecated("deprecated")
        @JsonProperty("verification_address")
        @ExcludeMissing
        fun _verificationAddress(): JsonField<VerificationAddress> = verificationAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountUpdateBody = apply {
            if (validated) {
                return@apply
            }

            dailySpendLimit()
            lifetimeSpendLimit()
            monthlySpendLimit()
            state()
            verificationAddress().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountUpdateBody]. */
        class Builder internal constructor() {

            private var dailySpendLimit: JsonField<Long> = JsonMissing.of()
            private var lifetimeSpendLimit: JsonField<Long> = JsonMissing.of()
            private var monthlySpendLimit: JsonField<Long> = JsonMissing.of()
            private var state: JsonField<State> = JsonMissing.of()
            private var verificationAddress: JsonField<VerificationAddress> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountUpdateBody: AccountUpdateBody) = apply {
                dailySpendLimit = accountUpdateBody.dailySpendLimit
                lifetimeSpendLimit = accountUpdateBody.lifetimeSpendLimit
                monthlySpendLimit = accountUpdateBody.monthlySpendLimit
                state = accountUpdateBody.state
                verificationAddress = accountUpdateBody.verificationAddress
                additionalProperties = accountUpdateBody.additionalProperties.toMutableMap()
            }

            /**
             * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
             * limit). By default the daily spend limit is set to $1,250.
             */
            fun dailySpendLimit(dailySpendLimit: Long) =
                dailySpendLimit(JsonField.of(dailySpendLimit))

            /**
             * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
             * limit). By default the daily spend limit is set to $1,250.
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
             * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a
             * $1,000 limit). Once this limit is reached, no transactions will be accepted on any
             * card created for this account until the limit is updated. Note that a spend limit of
             * 0 is effectively no limit, and should only be used to reset or remove a prior limit.
             * Only a limit of 1 or above will result in declined transactions due to checks against
             * the account limit. This behavior differs from the daily spend limit and the monthly
             * spend limit.
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
             * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a
             * $1,000 limit). By default the monthly spend limit is set to $5,000.
             */
            fun monthlySpendLimit(monthlySpendLimit: JsonField<Long>) = apply {
                this.monthlySpendLimit = monthlySpendLimit
            }

            /** Account states. */
            fun state(state: State) = state(JsonField.of(state))

            /** Account states. */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Authorization Rules. The field will be removed from the schema in a
             * future release.
             */
            @Deprecated("deprecated")
            fun verificationAddress(verificationAddress: VerificationAddress) =
                verificationAddress(JsonField.of(verificationAddress))

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Authorization Rules. The field will be removed from the schema in a
             * future release.
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

            fun build(): AccountUpdateBody =
                AccountUpdateBody(
                    dailySpendLimit,
                    lifetimeSpendLimit,
                    monthlySpendLimit,
                    state,
                    verificationAddress,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountUpdateBody && dailySpendLimit == other.dailySpendLimit && lifetimeSpendLimit == other.lifetimeSpendLimit && monthlySpendLimit == other.monthlySpendLimit && state == other.state && verificationAddress == other.verificationAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dailySpendLimit, lifetimeSpendLimit, monthlySpendLimit, state, verificationAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountUpdateBody{dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, state=$state, verificationAddress=$verificationAddress, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var body: AccountUpdateBody.Builder = AccountUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            accountToken = accountUpdateParams.accountToken
            body = accountUpdateParams.body.toBuilder()
            additionalHeaders = accountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
         */
        fun dailySpendLimit(dailySpendLimit: Long) = apply { body.dailySpendLimit(dailySpendLimit) }

        /**
         * Amount (in cents) for the account's daily spend limit (e.g. 100000 would be a $1,000
         * limit). By default the daily spend limit is set to $1,250.
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
         * Amount (in cents) for the account's lifetime spend limit (e.g. 100000 would be a $1,000
         * limit). Once this limit is reached, no transactions will be accepted on any card created
         * for this account until the limit is updated. Note that a spend limit of 0 is effectively
         * no limit, and should only be used to reset or remove a prior limit. Only a limit of 1 or
         * above will result in declined transactions due to checks against the account limit. This
         * behavior differs from the daily spend limit and the monthly spend limit.
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
         * Amount (in cents) for the account's monthly spend limit (e.g. 100000 would be a $1,000
         * limit). By default the monthly spend limit is set to $5,000.
         */
        fun monthlySpendLimit(monthlySpendLimit: JsonField<Long>) = apply {
            body.monthlySpendLimit(monthlySpendLimit)
        }

        /** Account states. */
        fun state(state: State) = apply { body.state(state) }

        /** Account states. */
        fun state(state: JsonField<State>) = apply { body.state(state) }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: VerificationAddress) = apply {
            body.verificationAddress(verificationAddress)
        }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
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

        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                checkRequired("accountToken", accountToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Account states. */
    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
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
            ACTIVE,
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
                ACTIVE -> Value.ACTIVE
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
                ACTIVE -> Known.ACTIVE
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

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by
     * Authorization Rules. The field will be removed from the schema in a future release.
     */
    @Deprecated("deprecated")
    @NoAutoDetect
    class VerificationAddress
    @JsonCreator
    private constructor(
        @JsonProperty("address1")
        @ExcludeMissing
        private val address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2")
        @ExcludeMissing
        private val address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun address1(): Optional<String> = Optional.ofNullable(address1.getNullable("address1"))

        fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            fun address2(address2: String) = address2(JsonField.of(address2))

            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            fun city(city: String) = city(JsonField.of(city))

            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String) = country(JsonField.of(country))

            fun country(country: JsonField<String>) = apply { this.country = country }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String) = state(JsonField.of(state))

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

            fun build(): VerificationAddress =
                VerificationAddress(
                    address1,
                    address2,
                    city,
                    country,
                    postalCode,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationAddress && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationAddress{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateParams && accountToken == other.accountToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountUpdateParams{accountToken=$accountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
