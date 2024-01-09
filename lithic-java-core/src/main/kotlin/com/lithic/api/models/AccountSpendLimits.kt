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
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun availableSpendLimit(): AvailableSpendLimit =
        availableSpendLimit.getRequired("available_spend_limit")

    @JsonProperty("available_spend_limit")
    @ExcludeMissing
    fun _availableSpendLimit() = availableSpendLimit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountSpendLimits = apply {
        if (!validated) {
            availableSpendLimit().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountSpendLimits &&
            this.availableSpendLimit == other.availableSpendLimit &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(availableSpendLimit, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AccountSpendLimits{availableSpendLimit=$availableSpendLimit, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var availableSpendLimit: JsonField<AvailableSpendLimit> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountSpendLimits: AccountSpendLimits) = apply {
            this.availableSpendLimit = accountSpendLimits.availableSpendLimit
            additionalProperties(accountSpendLimits.additionalProperties)
        }

        fun availableSpendLimit(availableSpendLimit: AvailableSpendLimit) =
            availableSpendLimit(JsonField.of(availableSpendLimit))

        @JsonProperty("available_spend_limit")
        @ExcludeMissing
        fun availableSpendLimit(availableSpendLimit: JsonField<AvailableSpendLimit>) = apply {
            this.availableSpendLimit = availableSpendLimit
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
            AccountSpendLimits(availableSpendLimit, additionalProperties.toUnmodifiable())
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

        private var hashCode: Int = 0

        /** The available spend limit relative to the daily limit configured on the Account. */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /** The available spend limit relative to the lifetime limit configured on the Account. */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /** The available spend limit relative to the monthly limit configured on the Account. */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /** The available spend limit relative to the daily limit configured on the Account. */
        @JsonProperty("daily") @ExcludeMissing fun _daily() = daily

        /** The available spend limit relative to the lifetime limit configured on the Account. */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime() = lifetime

        /** The available spend limit relative to the monthly limit configured on the Account. */
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

            /** The available spend limit relative to the daily limit configured on the Account. */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /** The available spend limit relative to the daily limit configured on the Account. */
            @JsonProperty("daily")
            @ExcludeMissing
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /**
             * The available spend limit relative to the lifetime limit configured on the Account.
             */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * The available spend limit relative to the lifetime limit configured on the Account.
             */
            @JsonProperty("lifetime")
            @ExcludeMissing
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /**
             * The available spend limit relative to the monthly limit configured on the Account.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * The available spend limit relative to the monthly limit configured on the Account.
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
    }
}
