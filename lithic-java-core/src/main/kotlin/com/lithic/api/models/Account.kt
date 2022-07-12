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
     * - `ACTIVE` - Active, account is able to transact and create new cards.
     * - `PAUSED` - Paused, account will not be able to transact or create new cards.
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
     * - `ACTIVE` - Active, account is able to transact and create new cards.
     * - `PAUSED` - Paused, account will not be able to transact or create new cards.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * Globally unique identifier for the account. This is the same as the account_token returned by
     * the enroll endpoint. If using this parameter, do not include pagination.
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** List of identifiers for the Auth Rule(s) that are applied on the account. */
    @JsonProperty("auth_rule_tokens") @ExcludeMissing fun _authRuleTokens() = authRuleTokens

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            spendLimit().validate()
            state()
            token()
            authRuleTokens()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            spendLimit == other.spendLimit &&
            state == other.state &&
            token == other.token &&
            authRuleTokens == other.authRuleTokens &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    spendLimit,
                    state,
                    token,
                    authRuleTokens,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Account{spendLimit=$spendLimit, state=$state, token=$token, authRuleTokens=$authRuleTokens, additionalProperties=$additionalProperties}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var authRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            this.spendLimit = account.spendLimit
            this.state = account.state
            this.token = account.token
            this.authRuleTokens = account.authRuleTokens
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
         * - `ACTIVE` - Active, account is able to transact and create new cards.
         * - `PAUSED` - Paused, account will not be able to transact or create new cards.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Account state:
         *
         * - `ACTIVE` - Active, account is able to transact and create new cards.
         * - `PAUSED` - Paused, account will not be able to transact or create new cards.
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

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperties(key: String, value: JsonValue) = apply {
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

        fun validate() = apply {
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
                daily == other.daily &&
                monthly == other.monthly &&
                lifetime == other.lifetime &&
                additionalProperties == other.additionalProperties
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
            fun putAdditionalProperties(key: String, value: JsonValue) = apply {
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

    class State @JsonCreator private constructor(private val value: JsonField<String>) {
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
                else -> throw IllegalArgumentException("Unknown Account.State: $value")
            }
    }
}
