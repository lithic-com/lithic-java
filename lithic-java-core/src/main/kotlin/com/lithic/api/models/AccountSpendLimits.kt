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
import com.lithic.api.core.toUnmodifiable
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

    private var validated: Boolean = false

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
            this.availableSpendLimit = accountSpendLimits.availableSpendLimit
            this.spendLimit = accountSpendLimits.spendLimit
            this.spendVelocity = accountSpendLimits.spendVelocity
            additionalProperties(accountSpendLimits.additionalProperties)
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
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AccountSpendLimits =
            AccountSpendLimits(
                availableSpendLimit,
                spendLimit,
                spendVelocity,
                additionalProperties.toUnmodifiable(),
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

        private var validated: Boolean = false

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
                this.daily = availableSpendLimit.daily
                this.lifetime = availableSpendLimit.lifetime
                this.monthly = availableSpendLimit.monthly
                additionalProperties(availableSpendLimit.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AvailableSpendLimit =
                AvailableSpendLimit(
                    daily,
                    lifetime,
                    monthly,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AvailableSpendLimit &&
                this.daily == other.daily &&
                this.lifetime == other.lifetime &&
                this.monthly == other.monthly &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        daily,
                        lifetime,
                        monthly,
                        additionalProperties,
                    )
            }
            return hashCode
        }

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

        private var validated: Boolean = false

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
                this.daily = spendLimit.daily
                this.lifetime = spendLimit.lifetime
                this.monthly = spendLimit.monthly
                additionalProperties(spendLimit.additionalProperties)
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
                    lifetime,
                    monthly,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimit &&
                this.daily == other.daily &&
                this.lifetime == other.lifetime &&
                this.monthly == other.monthly &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        daily,
                        lifetime,
                        monthly,
                        additionalProperties,
                    )
            }
            return hashCode
        }

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

        private var validated: Boolean = false

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
                this.daily = spendVelocity.daily
                this.lifetime = spendVelocity.lifetime
                this.monthly = spendVelocity.monthly
                additionalProperties(spendVelocity.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): SpendVelocity =
                SpendVelocity(
                    daily,
                    lifetime,
                    monthly,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendVelocity &&
                this.daily == other.daily &&
                this.lifetime == other.lifetime &&
                this.monthly == other.monthly &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        daily,
                        lifetime,
                        monthly,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SpendVelocity{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountSpendLimits &&
            this.availableSpendLimit == other.availableSpendLimit &&
            this.spendLimit == other.spendLimit &&
            this.spendVelocity == other.spendVelocity &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    availableSpendLimit,
                    spendLimit,
                    spendVelocity,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountSpendLimits{availableSpendLimit=$availableSpendLimit, spendLimit=$spendLimit, spendVelocity=$spendVelocity, additionalProperties=$additionalProperties}"
}
