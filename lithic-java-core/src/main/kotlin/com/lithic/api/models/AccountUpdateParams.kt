// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
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
constructor(
    private val accountToken: String,
    private val body: AccountUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountToken(): String = accountToken

    /**
     * Amount (in cents) for the account's daily spend limit. By default the daily spend limit is
     * set to $1,250.
     */
    fun dailySpendLimit(): Optional<Long> = body.dailySpendLimit()

    /**
     * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
     * transactions will be accepted on any card created for this account until the limit is
     * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
     * reset or remove a prior limit. Only a limit of 1 or above will result in declined
     * transactions due to checks against the account limit. This behavior differs from the daily
     * spend limit and the monthly spend limit.
     */
    fun lifetimeSpendLimit(): Optional<Long> = body.lifetimeSpendLimit()

    /**
     * Amount (in cents) for the account's monthly spend limit. By default the monthly spend limit
     * is set to $5,000.
     */
    fun monthlySpendLimit(): Optional<Long> = body.monthlySpendLimit()

    /** Account states. */
    fun state(): Optional<State> = body.state()

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by
     * Authorization Rules. The field will be removed from the schema in a future release.
     */
    fun verificationAddress(): Optional<VerificationAddress> = body.verificationAddress()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): AccountUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
        @JsonProperty("daily_spend_limit") private val dailySpendLimit: Long?,
        @JsonProperty("lifetime_spend_limit") private val lifetimeSpendLimit: Long?,
        @JsonProperty("monthly_spend_limit") private val monthlySpendLimit: Long?,
        @JsonProperty("state") private val state: State?,
        @JsonProperty("verification_address") private val verificationAddress: VerificationAddress?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        @JsonProperty("daily_spend_limit")
        fun dailySpendLimit(): Optional<Long> = Optional.ofNullable(dailySpendLimit)

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        @JsonProperty("lifetime_spend_limit")
        fun lifetimeSpendLimit(): Optional<Long> = Optional.ofNullable(lifetimeSpendLimit)

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        @JsonProperty("monthly_spend_limit")
        fun monthlySpendLimit(): Optional<Long> = Optional.ofNullable(monthlySpendLimit)

        /** Account states. */
        @JsonProperty("state") fun state(): Optional<State> = Optional.ofNullable(state)

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        @JsonProperty("verification_address")
        fun verificationAddress(): Optional<VerificationAddress> =
            Optional.ofNullable(verificationAddress)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var dailySpendLimit: Long? = null
            private var lifetimeSpendLimit: Long? = null
            private var monthlySpendLimit: Long? = null
            private var state: State? = null
            private var verificationAddress: VerificationAddress? = null
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
             * Amount (in cents) for the account's daily spend limit. By default the daily spend
             * limit is set to $1,250.
             */
            fun dailySpendLimit(dailySpendLimit: Long?) = apply {
                this.dailySpendLimit = dailySpendLimit
            }

            /**
             * Amount (in cents) for the account's daily spend limit. By default the daily spend
             * limit is set to $1,250.
             */
            fun dailySpendLimit(dailySpendLimit: Long) = dailySpendLimit(dailySpendLimit as Long?)

            /**
             * Amount (in cents) for the account's daily spend limit. By default the daily spend
             * limit is set to $1,250.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun dailySpendLimit(dailySpendLimit: Optional<Long>) =
                dailySpendLimit(dailySpendLimit.orElse(null) as Long?)

            /**
             * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached,
             * no transactions will be accepted on any card created for this account until the limit
             * is updated. Note that a spend limit of 0 is effectively no limit, and should only be
             * used to reset or remove a prior limit. Only a limit of 1 or above will result in
             * declined transactions due to checks against the account limit. This behavior differs
             * from the daily spend limit and the monthly spend limit.
             */
            fun lifetimeSpendLimit(lifetimeSpendLimit: Long?) = apply {
                this.lifetimeSpendLimit = lifetimeSpendLimit
            }

            /**
             * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached,
             * no transactions will be accepted on any card created for this account until the limit
             * is updated. Note that a spend limit of 0 is effectively no limit, and should only be
             * used to reset or remove a prior limit. Only a limit of 1 or above will result in
             * declined transactions due to checks against the account limit. This behavior differs
             * from the daily spend limit and the monthly spend limit.
             */
            fun lifetimeSpendLimit(lifetimeSpendLimit: Long) =
                lifetimeSpendLimit(lifetimeSpendLimit as Long?)

            /**
             * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached,
             * no transactions will be accepted on any card created for this account until the limit
             * is updated. Note that a spend limit of 0 is effectively no limit, and should only be
             * used to reset or remove a prior limit. Only a limit of 1 or above will result in
             * declined transactions due to checks against the account limit. This behavior differs
             * from the daily spend limit and the monthly spend limit.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun lifetimeSpendLimit(lifetimeSpendLimit: Optional<Long>) =
                lifetimeSpendLimit(lifetimeSpendLimit.orElse(null) as Long?)

            /**
             * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
             * limit is set to $5,000.
             */
            fun monthlySpendLimit(monthlySpendLimit: Long?) = apply {
                this.monthlySpendLimit = monthlySpendLimit
            }

            /**
             * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
             * limit is set to $5,000.
             */
            fun monthlySpendLimit(monthlySpendLimit: Long) =
                monthlySpendLimit(monthlySpendLimit as Long?)

            /**
             * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
             * limit is set to $5,000.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun monthlySpendLimit(monthlySpendLimit: Optional<Long>) =
                monthlySpendLimit(monthlySpendLimit.orElse(null) as Long?)

            /** Account states. */
            fun state(state: State?) = apply { this.state = state }

            /** Account states. */
            fun state(state: Optional<State>) = state(state.orElse(null))

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Authorization Rules. The field will be removed from the schema in a
             * future release.
             */
            fun verificationAddress(verificationAddress: VerificationAddress?) = apply {
                this.verificationAddress = verificationAddress
            }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Authorization Rules. The field will be removed from the schema in a
             * future release.
             */
            fun verificationAddress(verificationAddress: Optional<VerificationAddress>) =
                verificationAddress(verificationAddress.orElse(null))

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

    @NoAutoDetect
    class Builder {

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
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        fun dailySpendLimit(dailySpendLimit: Long?) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /**
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        fun dailySpendLimit(dailySpendLimit: Long) = dailySpendLimit(dailySpendLimit as Long?)

        /**
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun dailySpendLimit(dailySpendLimit: Optional<Long>) =
            dailySpendLimit(dailySpendLimit.orElse(null) as Long?)

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: Long?) = apply {
            body.lifetimeSpendLimit(lifetimeSpendLimit)
        }

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: Long) =
            lifetimeSpendLimit(lifetimeSpendLimit as Long?)

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun lifetimeSpendLimit(lifetimeSpendLimit: Optional<Long>) =
            lifetimeSpendLimit(lifetimeSpendLimit.orElse(null) as Long?)

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        fun monthlySpendLimit(monthlySpendLimit: Long?) = apply {
            body.monthlySpendLimit(monthlySpendLimit)
        }

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        fun monthlySpendLimit(monthlySpendLimit: Long) =
            monthlySpendLimit(monthlySpendLimit as Long?)

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun monthlySpendLimit(monthlySpendLimit: Optional<Long>) =
            monthlySpendLimit(monthlySpendLimit.orElse(null) as Long?)

        /** Account states. */
        fun state(state: State?) = apply { body.state(state) }

        /** Account states. */
        fun state(state: Optional<State>) = state(state.orElse(null))

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        fun verificationAddress(verificationAddress: VerificationAddress?) = apply {
            body.verificationAddress(verificationAddress)
        }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        fun verificationAddress(verificationAddress: Optional<VerificationAddress>) =
            verificationAddress(verificationAddress.orElse(null))

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

        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                checkNotNull(accountToken) { "`accountToken` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            PAUSED,
        }

        enum class Value {
            ACTIVE,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

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
    @NoAutoDetect
    class VerificationAddress
    @JsonCreator
    private constructor(
        @JsonProperty("address1") private val address1: String?,
        @JsonProperty("address2") private val address2: String?,
        @JsonProperty("city") private val city: String?,
        @JsonProperty("country") private val country: String?,
        @JsonProperty("postal_code") private val postalCode: String?,
        @JsonProperty("state") private val state: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("address1") fun address1(): Optional<String> = Optional.ofNullable(address1)

        @JsonProperty("address2") fun address2(): Optional<String> = Optional.ofNullable(address2)

        @JsonProperty("city") fun city(): Optional<String> = Optional.ofNullable(city)

        @JsonProperty("country") fun country(): Optional<String> = Optional.ofNullable(country)

        @JsonProperty("postal_code")
        fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

        @JsonProperty("state") fun state(): Optional<String> = Optional.ofNullable(state)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address1: String? = null
            private var address2: String? = null
            private var city: String? = null
            private var country: String? = null
            private var postalCode: String? = null
            private var state: String? = null
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

            fun address1(address1: String?) = apply { this.address1 = address1 }

            fun address1(address1: Optional<String>) = address1(address1.orElse(null))

            fun address2(address2: String?) = apply { this.address2 = address2 }

            fun address2(address2: Optional<String>) = address2(address2.orElse(null))

            fun city(city: String?) = apply { this.city = city }

            fun city(city: Optional<String>) = city(city.orElse(null))

            fun country(country: String?) = apply { this.country = country }

            fun country(country: Optional<String>) = country(country.orElse(null))

            fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

            fun state(state: String?) = apply { this.state = state }

            fun state(state: Optional<String>) = state(state.orElse(null))

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
