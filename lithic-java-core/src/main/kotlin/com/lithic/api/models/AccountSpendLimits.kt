// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountSpendLimits.Builder::class)
@NoAutoDetect
class AccountSpendLimits
private constructor(
    private val availableSpendLimit: JsonField<AvailableSpendLimit>,
    private val spendLimit: JsonField<SpendLimit>,
    private val spendVelocity: JsonField<SpendVelocity>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun availableSpendLimit(): AvailableSpendLimit =
        availableSpendLimit.getRequired("available_spend_limit")

    fun spendLimit(): Optional<SpendLimit> =
        Optional.ofNullable(spendLimit.getNullable("spend_limit"))

    fun spendVelocity(): Optional<SpendVelocity> =
        Optional.ofNullable(spendVelocity.getNullable("spend_velocity"))

    @JsonProperty("available_spend_limit")
    @ExcludeMissing
    fun _availableSpendLimit() = availableSpendLimit

    @JsonProperty("spend_limit") @ExcludeMissing fun _spendLimit() = spendLimit

    @JsonProperty("spend_velocity") @ExcludeMissing fun _spendVelocity() = spendVelocity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountSpendLimits = apply {
        if (!validated) {
            availableSpendLimit().validate()
            spendLimit().map { it.validate() }
            spendVelocity().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var availableSpendLimit: JsonField<AvailableSpendLimit> = JsonMissing.of()
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var spendVelocity: JsonField<SpendVelocity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountSpendLimits: AccountSpendLimits) = apply {
            availableSpendLimit = accountSpendLimits.availableSpendLimit
            spendLimit = accountSpendLimits.spendLimit
            spendVelocity = accountSpendLimits.spendVelocity
            additionalProperties = accountSpendLimits.additionalProperties.toMutableMap()
        }

        fun availableSpendLimit(availableSpendLimit: AvailableSpendLimit) =
            availableSpendLimit(JsonField.of(availableSpendLimit))

        @JsonProperty("available_spend_limit")
        @ExcludeMissing
        fun availableSpendLimit(availableSpendLimit: JsonField<AvailableSpendLimit>) = apply {
            this.availableSpendLimit = availableSpendLimit
        }

        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        @JsonProperty("spend_limit")
        @ExcludeMissing
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        fun spendVelocity(spendVelocity: SpendVelocity) = spendVelocity(JsonField.of(spendVelocity))

        @JsonProperty("spend_velocity")
        @ExcludeMissing
        fun spendVelocity(spendVelocity: JsonField<SpendVelocity>) = apply {
            this.spendVelocity = spendVelocity
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): AccountSpendLimits =
            AccountSpendLimits(
                availableSpendLimit,
                spendLimit,
                spendVelocity,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AvailableSpendLimit.Builder::class)
    @NoAutoDetect
    class AvailableSpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The available spend limit (in cents) relative to the daily limit configured on the
         * Account.
         */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /**
         * The available spend limit (in cents) relative to the lifetime limit configured on the
         * Account.
         */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Account.
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * The available spend limit (in cents) relative to the daily limit configured on the
         * Account.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily() = daily

        /**
         * The available spend limit (in cents) relative to the lifetime limit configured on the
         * Account.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime() = lifetime

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Account.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AvailableSpendLimit = apply {
            if (!validated) {
                daily()
                lifetime()
                monthly()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableSpendLimit: AvailableSpendLimit) = apply {
                daily = availableSpendLimit.daily
                lifetime = availableSpendLimit.lifetime
                monthly = availableSpendLimit.monthly
                additionalProperties = availableSpendLimit.additionalProperties.toMutableMap()
            }

            /**
             * The available spend limit (in cents) relative to the daily limit configured on the
             * Account.
             */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * The available spend limit (in cents) relative to the daily limit configured on the
             * Account.
             */
            @JsonProperty("daily")
            @ExcludeMissing
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /**
             * The available spend limit (in cents) relative to the lifetime limit configured on the
             * Account.
             */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * The available spend limit (in cents) relative to the lifetime limit configured on the
             * Account.
             */
            @JsonProperty("lifetime")
            @ExcludeMissing
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Account.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Account.
             */
            @JsonProperty("monthly")
            @ExcludeMissing
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): AvailableSpendLimit =
                AvailableSpendLimit(
                    daily,
                    lifetime,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableSpendLimit && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableSpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = SpendLimit.Builder::class)
    @NoAutoDetect
    class SpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The configured daily spend limit (in cents) on the Account. */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /** The configured lifetime spend limit (in cents) on the Account. */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /** The configured monthly spend limit (in cents) on the Account. */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /** The configured daily spend limit (in cents) on the Account. */
        @JsonProperty("daily") @ExcludeMissing fun _daily() = daily

        /** The configured lifetime spend limit (in cents) on the Account. */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime() = lifetime

        /** The configured monthly spend limit (in cents) on the Account. */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (!validated) {
                daily()
                lifetime()
                monthly()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                daily = spendLimit.daily
                lifetime = spendLimit.lifetime
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** The configured daily spend limit (in cents) on the Account. */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /** The configured daily spend limit (in cents) on the Account. */
            @JsonProperty("daily")
            @ExcludeMissing
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /** The configured lifetime spend limit (in cents) on the Account. */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /** The configured lifetime spend limit (in cents) on the Account. */
            @JsonProperty("lifetime")
            @ExcludeMissing
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /** The configured monthly spend limit (in cents) on the Account. */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /** The configured monthly spend limit (in cents) on the Account. */
            @JsonProperty("monthly")
            @ExcludeMissing
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): SpendLimit =
                SpendLimit(
                    daily,
                    lifetime,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendLimit && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = SpendVelocity.Builder::class)
    @NoAutoDetect
    class SpendVelocity
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Current daily spend velocity (in cents) on the Account. Present if daily spend limit is
         * set.
         */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /**
         * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
         * limit is set.
         */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /**
         * Current monthly spend velocity (in cents) on the Account. Present if monthly spend limit
         * is set.
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * Current daily spend velocity (in cents) on the Account. Present if daily spend limit is
         * set.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily() = daily

        /**
         * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
         * limit is set.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime() = lifetime

        /**
         * Current monthly spend velocity (in cents) on the Account. Present if monthly spend limit
         * is set.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendVelocity = apply {
            if (!validated) {
                daily()
                lifetime()
                monthly()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendVelocity: SpendVelocity) = apply {
                daily = spendVelocity.daily
                lifetime = spendVelocity.lifetime
                monthly = spendVelocity.monthly
                additionalProperties = spendVelocity.additionalProperties.toMutableMap()
            }

            /**
             * Current daily spend velocity (in cents) on the Account. Present if daily spend limit
             * is set.
             */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Current daily spend velocity (in cents) on the Account. Present if daily spend limit
             * is set.
             */
            @JsonProperty("daily")
            @ExcludeMissing
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /**
             * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
             * limit is set.
             */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
             * limit is set.
             */
            @JsonProperty("lifetime")
            @ExcludeMissing
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /**
             * Current monthly spend velocity (in cents) on the Account. Present if monthly spend
             * limit is set.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Current monthly spend velocity (in cents) on the Account. Present if monthly spend
             * limit is set.
             */
            @JsonProperty("monthly")
            @ExcludeMissing
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): SpendVelocity =
                SpendVelocity(
                    daily,
                    lifetime,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendVelocity && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendVelocity{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountSpendLimits && availableSpendLimit == other.availableSpendLimit && spendLimit == other.spendLimit && spendVelocity == other.spendVelocity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableSpendLimit, spendLimit, spendVelocity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountSpendLimits{availableSpendLimit=$availableSpendLimit, spendLimit=$spendLimit, spendVelocity=$spendVelocity, additionalProperties=$additionalProperties}"
}
