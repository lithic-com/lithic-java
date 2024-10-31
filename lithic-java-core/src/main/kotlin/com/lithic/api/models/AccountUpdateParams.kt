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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountUpdateParams
constructor(
    private val accountToken: String,
    private val dailySpendLimit: Long?,
    private val lifetimeSpendLimit: Long?,
    private val monthlySpendLimit: Long?,
    private val state: State?,
    private val verificationAddress: VerificationAddress?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountToken(): String = accountToken

    fun dailySpendLimit(): Optional<Long> = Optional.ofNullable(dailySpendLimit)

    fun lifetimeSpendLimit(): Optional<Long> = Optional.ofNullable(lifetimeSpendLimit)

    fun monthlySpendLimit(): Optional<Long> = Optional.ofNullable(monthlySpendLimit)

    fun state(): Optional<State> = Optional.ofNullable(state)

    fun verificationAddress(): Optional<VerificationAddress> =
        Optional.ofNullable(verificationAddress)

    @JvmSynthetic
    internal fun getBody(): AccountUpdateBody {
        return AccountUpdateBody(
            dailySpendLimit,
            lifetimeSpendLimit,
            monthlySpendLimit,
            state,
            verificationAddress,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountUpdateBody
    internal constructor(
        private val dailySpendLimit: Long?,
        private val lifetimeSpendLimit: Long?,
        private val monthlySpendLimit: Long?,
        private val state: State?,
        private val verificationAddress: VerificationAddress?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        @JsonProperty("daily_spend_limit") fun dailySpendLimit(): Long? = dailySpendLimit

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        @JsonProperty("lifetime_spend_limit") fun lifetimeSpendLimit(): Long? = lifetimeSpendLimit

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        @JsonProperty("monthly_spend_limit") fun monthlySpendLimit(): Long? = monthlySpendLimit

        /** Account states. */
        @JsonProperty("state") fun state(): State? = state

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        @JsonProperty("verification_address")
        fun verificationAddress(): VerificationAddress? = verificationAddress

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
                this.dailySpendLimit = accountUpdateBody.dailySpendLimit
                this.lifetimeSpendLimit = accountUpdateBody.lifetimeSpendLimit
                this.monthlySpendLimit = accountUpdateBody.monthlySpendLimit
                this.state = accountUpdateBody.state
                this.verificationAddress = accountUpdateBody.verificationAddress
                additionalProperties(accountUpdateBody.additionalProperties)
            }

            /**
             * Amount (in cents) for the account's daily spend limit. By default the daily spend
             * limit is set to $1,250.
             */
            @JsonProperty("daily_spend_limit")
            fun dailySpendLimit(dailySpendLimit: Long) = apply {
                this.dailySpendLimit = dailySpendLimit
            }

            /**
             * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached,
             * no transactions will be accepted on any card created for this account until the limit
             * is updated. Note that a spend limit of 0 is effectively no limit, and should only be
             * used to reset or remove a prior limit. Only a limit of 1 or above will result in
             * declined transactions due to checks against the account limit. This behavior differs
             * from the daily spend limit and the monthly spend limit.
             */
            @JsonProperty("lifetime_spend_limit")
            fun lifetimeSpendLimit(lifetimeSpendLimit: Long) = apply {
                this.lifetimeSpendLimit = lifetimeSpendLimit
            }

            /**
             * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
             * limit is set to $5,000.
             */
            @JsonProperty("monthly_spend_limit")
            fun monthlySpendLimit(monthlySpendLimit: Long) = apply {
                this.monthlySpendLimit = monthlySpendLimit
            }

            /** Account states. */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules. This field is deprecated as AVS checks are no longer
             * supported by Authorization Rules. The field will be removed from the schema in a
             * future release.
             */
            @JsonProperty("verification_address")
            fun verificationAddress(verificationAddress: VerificationAddress) = apply {
                this.verificationAddress = verificationAddress
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

            return /* spotless:off */ other is AccountUpdateBody && this.dailySpendLimit == other.dailySpendLimit && this.lifetimeSpendLimit == other.lifetimeSpendLimit && this.monthlySpendLimit == other.monthlySpendLimit && this.state == other.state && this.verificationAddress == other.verificationAddress && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(dailySpendLimit, lifetimeSpendLimit, monthlySpendLimit, state, verificationAddress, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountUpdateBody{dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, state=$state, verificationAddress=$verificationAddress, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateParams && this.accountToken == other.accountToken && this.dailySpendLimit == other.dailySpendLimit && this.lifetimeSpendLimit == other.lifetimeSpendLimit && this.monthlySpendLimit == other.monthlySpendLimit && this.state == other.state && this.verificationAddress == other.verificationAddress && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountToken, dailySpendLimit, lifetimeSpendLimit, monthlySpendLimit, state, verificationAddress, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountUpdateParams{accountToken=$accountToken, dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, state=$state, verificationAddress=$verificationAddress, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var dailySpendLimit: Long? = null
        private var lifetimeSpendLimit: Long? = null
        private var monthlySpendLimit: Long? = null
        private var state: State? = null
        private var verificationAddress: VerificationAddress? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            this.accountToken = accountUpdateParams.accountToken
            this.dailySpendLimit = accountUpdateParams.dailySpendLimit
            this.lifetimeSpendLimit = accountUpdateParams.lifetimeSpendLimit
            this.monthlySpendLimit = accountUpdateParams.monthlySpendLimit
            this.state = accountUpdateParams.state
            this.verificationAddress = accountUpdateParams.verificationAddress
            additionalQueryParams(accountUpdateParams.additionalQueryParams)
            additionalHeaders(accountUpdateParams.additionalHeaders)
            additionalBodyProperties(accountUpdateParams.additionalBodyProperties)
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * Amount (in cents) for the account's daily spend limit. By default the daily spend limit
         * is set to $1,250.
         */
        fun dailySpendLimit(dailySpendLimit: Long) = apply {
            this.dailySpendLimit = dailySpendLimit
        }

        /**
         * Amount (in cents) for the account's lifetime spend limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit. This behavior differs from the
         * daily spend limit and the monthly spend limit.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: Long) = apply {
            this.lifetimeSpendLimit = lifetimeSpendLimit
        }

        /**
         * Amount (in cents) for the account's monthly spend limit. By default the monthly spend
         * limit is set to $5,000.
         */
        fun monthlySpendLimit(monthlySpendLimit: Long) = apply {
            this.monthlySpendLimit = monthlySpendLimit
        }

        /** Account states. */
        fun state(state: State) = apply { this.state = state }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules. This field is deprecated as AVS checks are no longer supported by
         * Authorization Rules. The field will be removed from the schema in a future release.
         */
        fun verificationAddress(verificationAddress: VerificationAddress) = apply {
            this.verificationAddress = verificationAddress
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                checkNotNull(accountToken) { "`accountToken` is required but was not set" },
                dailySpendLimit,
                lifetimeSpendLimit,
                monthlySpendLimit,
                state,
                verificationAddress,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
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

            @JvmField val ACTIVE = State(JsonField.of("ACTIVE"))

            @JvmField val PAUSED = State(JsonField.of("PAUSED"))

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
    }

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules. This field is deprecated as AVS checks are no longer supported by
     * Authorization Rules. The field will be removed from the schema in a future release.
     */
    @JsonDeserialize(builder = VerificationAddress.Builder::class)
    @NoAutoDetect
    class VerificationAddress
    private constructor(
        private val address1: String?,
        private val address2: String?,
        private val city: String?,
        private val country: String?,
        private val postalCode: String?,
        private val state: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("address1") fun address1(): String? = address1

        @JsonProperty("address2") fun address2(): String? = address2

        @JsonProperty("city") fun city(): String? = city

        @JsonProperty("country") fun country(): String? = country

        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        @JsonProperty("state") fun state(): String? = state

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
                this.address1 = verificationAddress.address1
                this.address2 = verificationAddress.address2
                this.city = verificationAddress.city
                this.country = verificationAddress.country
                this.postalCode = verificationAddress.postalCode
                this.state = verificationAddress.state
                additionalProperties(verificationAddress.additionalProperties)
            }

            @JsonProperty("address1")
            fun address1(address1: String) = apply { this.address1 = address1 }

            @JsonProperty("address2")
            fun address2(address2: String) = apply { this.address2 = address2 }

            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

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

            return /* spotless:off */ other is VerificationAddress && this.address1 == other.address1 && this.address2 == other.address2 && this.city == other.city && this.country == other.country && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "VerificationAddress{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }
}
