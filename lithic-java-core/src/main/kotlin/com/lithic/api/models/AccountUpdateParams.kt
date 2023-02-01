package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
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
    private val verificationAddress: VerificationAddress?,
    private val state: State?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountToken(): String = accountToken

    fun dailySpendLimit(): Optional<Long> = Optional.ofNullable(dailySpendLimit)

    fun lifetimeSpendLimit(): Optional<Long> = Optional.ofNullable(lifetimeSpendLimit)

    fun monthlySpendLimit(): Optional<Long> = Optional.ofNullable(monthlySpendLimit)

    fun verificationAddress(): Optional<VerificationAddress> =
        Optional.ofNullable(verificationAddress)

    fun state(): Optional<State> = Optional.ofNullable(state)

    @JvmSynthetic
    internal fun toBody(): AccountUpdateBody =
        AccountUpdateBody(
            dailySpendLimit,
            lifetimeSpendLimit,
            monthlySpendLimit,
            verificationAddress,
            state,
            additionalBodyProperties
        )

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountUpdateBody
    internal constructor(
        private val dailySpendLimit: Long?,
        private val lifetimeSpendLimit: Long?,
        private val monthlySpendLimit: Long?,
        private val verificationAddress: VerificationAddress?,
        private val state: State?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents) for the account's new daily spend limit. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the
         * account limit.
         */
        @JsonProperty("daily_spend_limit") fun dailySpendLimit(): Long? = dailySpendLimit

        /**
         * Amount (in cents) for the account's new lifetime limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit.
         */
        @JsonProperty("lifetime_spend_limit") fun lifetimeSpendLimit(): Long? = lifetimeSpendLimit

        /**
         * Amount (in cents) for the account's new monthly spend limit. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the
         * account limit.
         */
        @JsonProperty("monthly_spend_limit") fun monthlySpendLimit(): Long? = monthlySpendLimit

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        @JsonProperty("verification_address")
        fun verificationAddress(): VerificationAddress? = verificationAddress

        /** Account states. */
        @JsonProperty("state") fun state(): State? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountUpdateBody &&
                dailySpendLimit == other.dailySpendLimit &&
                lifetimeSpendLimit == other.lifetimeSpendLimit &&
                monthlySpendLimit == other.monthlySpendLimit &&
                verificationAddress == other.verificationAddress &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        dailySpendLimit,
                        lifetimeSpendLimit,
                        monthlySpendLimit,
                        verificationAddress,
                        state,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountUpdateBody{dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, verificationAddress=$verificationAddress, state=$state, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var dailySpendLimit: Long? = null
            private var lifetimeSpendLimit: Long? = null
            private var monthlySpendLimit: Long? = null
            private var verificationAddress: VerificationAddress? = null
            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountUpdateBody: AccountUpdateBody) = apply {
                this.dailySpendLimit = accountUpdateBody.dailySpendLimit
                this.lifetimeSpendLimit = accountUpdateBody.lifetimeSpendLimit
                this.monthlySpendLimit = accountUpdateBody.monthlySpendLimit
                this.verificationAddress = accountUpdateBody.verificationAddress
                this.state = accountUpdateBody.state
                additionalProperties(accountUpdateBody.additionalProperties)
            }

            /**
             * Amount (in cents) for the account's new daily spend limit. Note that a spend limit of
             * 0 is effectively no limit, and should only be used to reset or remove a prior limit.
             * Only a limit of 1 or above will result in declined transactions due to checks against
             * the account limit.
             */
            @JsonProperty("daily_spend_limit")
            fun dailySpendLimit(dailySpendLimit: Long) = apply {
                this.dailySpendLimit = dailySpendLimit
            }

            /**
             * Amount (in cents) for the account's new lifetime limit. Once this limit is reached,
             * no transactions will be accepted on any card created for this account until the limit
             * is updated. Note that a spend limit of 0 is effectively no limit, and should only be
             * used to reset or remove a prior limit. Only a limit of 1 or above will result in
             * declined transactions due to checks against the account limit.
             */
            @JsonProperty("lifetime_spend_limit")
            fun lifetimeSpendLimit(lifetimeSpendLimit: Long) = apply {
                this.lifetimeSpendLimit = lifetimeSpendLimit
            }

            /**
             * Amount (in cents) for the account's new monthly spend limit. Note that a spend limit
             * of 0 is effectively no limit, and should only be used to reset or remove a prior
             * limit. Only a limit of 1 or above will result in declined transactions due to checks
             * against the account limit.
             */
            @JsonProperty("monthly_spend_limit")
            fun monthlySpendLimit(monthlySpendLimit: Long) = apply {
                this.monthlySpendLimit = monthlySpendLimit
            }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules.
             */
            @JsonProperty("verification_address")
            fun verificationAddress(verificationAddress: VerificationAddress) = apply {
                this.verificationAddress = verificationAddress
            }

            /** Account states. */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

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
                    verificationAddress,
                    state,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountUpdateParams &&
            accountToken == other.accountToken &&
            dailySpendLimit == other.dailySpendLimit &&
            lifetimeSpendLimit == other.lifetimeSpendLimit &&
            monthlySpendLimit == other.monthlySpendLimit &&
            verificationAddress == other.verificationAddress &&
            state == other.state &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            dailySpendLimit,
            lifetimeSpendLimit,
            monthlySpendLimit,
            verificationAddress,
            state,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountUpdateParams{accountToken=$accountToken, dailySpendLimit=$dailySpendLimit, lifetimeSpendLimit=$lifetimeSpendLimit, monthlySpendLimit=$monthlySpendLimit, verificationAddress=$verificationAddress, state=$state, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var verificationAddress: VerificationAddress? = null
        private var state: State? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            this.accountToken = accountUpdateParams.accountToken
            this.dailySpendLimit = accountUpdateParams.dailySpendLimit
            this.lifetimeSpendLimit = accountUpdateParams.lifetimeSpendLimit
            this.monthlySpendLimit = accountUpdateParams.monthlySpendLimit
            this.verificationAddress = accountUpdateParams.verificationAddress
            this.state = accountUpdateParams.state
            additionalQueryParams(accountUpdateParams.additionalQueryParams)
            additionalHeaders(accountUpdateParams.additionalHeaders)
            additionalBodyProperties(accountUpdateParams.additionalBodyProperties)
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * Amount (in cents) for the account's new daily spend limit. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the
         * account limit.
         */
        fun dailySpendLimit(dailySpendLimit: Long) = apply {
            this.dailySpendLimit = dailySpendLimit
        }

        /**
         * Amount (in cents) for the account's new lifetime limit. Once this limit is reached, no
         * transactions will be accepted on any card created for this account until the limit is
         * updated. Note that a spend limit of 0 is effectively no limit, and should only be used to
         * reset or remove a prior limit. Only a limit of 1 or above will result in declined
         * transactions due to checks against the account limit.
         */
        fun lifetimeSpendLimit(lifetimeSpendLimit: Long) = apply {
            this.lifetimeSpendLimit = lifetimeSpendLimit
        }

        /**
         * Amount (in cents) for the account's new monthly spend limit. Note that a spend limit of 0
         * is effectively no limit, and should only be used to reset or remove a prior limit. Only a
         * limit of 1 or above will result in declined transactions due to checks against the
         * account limit.
         */
        fun monthlySpendLimit(monthlySpendLimit: Long) = apply {
            this.monthlySpendLimit = monthlySpendLimit
        }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        fun verificationAddress(verificationAddress: VerificationAddress) = apply {
            this.verificationAddress = verificationAddress
        }

        /** Account states. */
        fun state(state: State) = apply { this.state = state }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                checkNotNull(accountToken) {
                    "Property `accountToken` is required but was not set"
                },
                dailySpendLimit,
                lifetimeSpendLimit,
                monthlySpendLimit,
                verificationAddress,
                state,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules.
     */
    @NoAutoDetect
    class VerificationAddress
    private constructor(
        private val address1: String?,
        private val address2: String?,
        private val city: String?,
        private val state: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("address1") fun address1(): String? = address1

        @JsonProperty("address2") fun address2(): String? = address2

        @JsonProperty("city") fun city(): String? = city

        @JsonProperty("state") fun state(): String? = state

        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationAddress &&
                address1 == other.address1 &&
                address2 == other.address2 &&
                city == other.city &&
                state == other.state &&
                postalCode == other.postalCode &&
                country == other.country &&
                additionalProperties == other.additionalProperties
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

            private var address1: String? = null
            private var address2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var postalCode: String? = null
            private var country: String? = null
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

            @JsonProperty("address1")
            fun address1(address1: String) = apply { this.address1 = address1 }

            @JsonProperty("address2")
            fun address2(address2: String) = apply { this.address2 = address2 }

            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            return other is State && value == other.value
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
                else -> throw LithicInvalidDataException("Unknown AccountUpdateBody.State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
