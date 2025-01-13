// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CardSpendLimits
@JsonCreator
private constructor(
    @JsonProperty("available_spend_limit")
    @ExcludeMissing
    private val availableSpendLimit: JsonField<AvailableSpendLimit> = JsonMissing.of(),
    @JsonProperty("spend_limit")
    @ExcludeMissing
    private val spendLimit: JsonField<SpendLimit> = JsonMissing.of(),
    @JsonProperty("spend_velocity")
    @ExcludeMissing
    private val spendVelocity: JsonField<SpendVelocity> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun availableSpendLimit(): AvailableSpendLimit =
        availableSpendLimit.getRequired("available_spend_limit")

    fun spendLimit(): Optional<SpendLimit> =
        Optional.ofNullable(spendLimit.getNullable("spend_limit"))

    fun spendVelocity(): Optional<SpendVelocity> =
        Optional.ofNullable(spendVelocity.getNullable("spend_velocity"))

    @JsonProperty("available_spend_limit")
    @ExcludeMissing
    fun _availableSpendLimit(): JsonField<AvailableSpendLimit> = availableSpendLimit

    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<SpendLimit> = spendLimit

    @JsonProperty("spend_velocity")
    @ExcludeMissing
    fun _spendVelocity(): JsonField<SpendVelocity> = spendVelocity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardSpendLimits = apply {
        if (validated) {
            return@apply
        }

        availableSpendLimit().validate()
        spendLimit().ifPresent { it.validate() }
        spendVelocity().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var availableSpendLimit: JsonField<AvailableSpendLimit>? = null
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var spendVelocity: JsonField<SpendVelocity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardSpendLimits: CardSpendLimits) = apply {
            availableSpendLimit = cardSpendLimits.availableSpendLimit
            spendLimit = cardSpendLimits.spendLimit
            spendVelocity = cardSpendLimits.spendVelocity
            additionalProperties = cardSpendLimits.additionalProperties.toMutableMap()
        }

        fun availableSpendLimit(availableSpendLimit: AvailableSpendLimit) =
            availableSpendLimit(JsonField.of(availableSpendLimit))

        fun availableSpendLimit(availableSpendLimit: JsonField<AvailableSpendLimit>) = apply {
            this.availableSpendLimit = availableSpendLimit
        }

        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        fun spendVelocity(spendVelocity: SpendVelocity) = spendVelocity(JsonField.of(spendVelocity))

        fun spendVelocity(spendVelocity: JsonField<SpendVelocity>) = apply {
            this.spendVelocity = spendVelocity
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

        fun build(): CardSpendLimits =
            CardSpendLimits(
                checkNotNull(availableSpendLimit) {
                    "`availableSpendLimit` is required but was not set"
                },
                spendLimit,
                spendVelocity,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AvailableSpendLimit
    @JsonCreator
    private constructor(
        @JsonProperty("annually")
        @ExcludeMissing
        private val annually: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("forever")
        @ExcludeMissing
        private val forever: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthly")
        @ExcludeMissing
        private val monthly: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The available spend limit (in cents) relative to the annual limit configured on the Card
         * (e.g. 100000 would be a $1,000 limit).
         */
        fun annually(): Optional<Long> = Optional.ofNullable(annually.getNullable("annually"))

        /**
         * The available spend limit (in cents) relative to the forever limit configured on the
         * Card.
         */
        fun forever(): Optional<Long> = Optional.ofNullable(forever.getNullable("forever"))

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Card.
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * The available spend limit (in cents) relative to the annual limit configured on the Card
         * (e.g. 100000 would be a $1,000 limit).
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /**
         * The available spend limit (in cents) relative to the forever limit configured on the
         * Card.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Card.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AvailableSpendLimit = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableSpendLimit: AvailableSpendLimit) = apply {
                annually = availableSpendLimit.annually
                forever = availableSpendLimit.forever
                monthly = availableSpendLimit.monthly
                additionalProperties = availableSpendLimit.additionalProperties.toMutableMap()
            }

            /**
             * The available spend limit (in cents) relative to the annual limit configured on the
             * Card (e.g. 100000 would be a $1,000 limit).
             */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * The available spend limit (in cents) relative to the annual limit configured on the
             * Card (e.g. 100000 would be a $1,000 limit).
             */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /**
             * The available spend limit (in cents) relative to the forever limit configured on the
             * Card.
             */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /**
             * The available spend limit (in cents) relative to the forever limit configured on the
             * Card.
             */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Card.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Card.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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

            fun build(): AvailableSpendLimit =
                AvailableSpendLimit(
                    annually,
                    forever,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableSpendLimit && annually == other.annually && forever == other.forever && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annually, forever, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableSpendLimit{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class SpendLimit
    @JsonCreator
    private constructor(
        @JsonProperty("annually")
        @ExcludeMissing
        private val annually: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("forever")
        @ExcludeMissing
        private val forever: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthly")
        @ExcludeMissing
        private val monthly: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The configured annual spend limit (in cents) on the Card. */
        fun annually(): Optional<Long> = Optional.ofNullable(annually.getNullable("annually"))

        /** The configured forever spend limit (in cents) on the Card. */
        fun forever(): Optional<Long> = Optional.ofNullable(forever.getNullable("forever"))

        /** The configured monthly spend limit (in cents) on the Card. */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /** The configured annual spend limit (in cents) on the Card. */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /** The configured forever spend limit (in cents) on the Card. */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /** The configured monthly spend limit (in cents) on the Card. */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                annually = spendLimit.annually
                forever = spendLimit.forever
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** The configured annual spend limit (in cents) on the Card. */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /** The configured annual spend limit (in cents) on the Card. */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /** The configured forever spend limit (in cents) on the Card. */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /** The configured forever spend limit (in cents) on the Card. */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /** The configured monthly spend limit (in cents) on the Card. */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /** The configured monthly spend limit (in cents) on the Card. */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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

            fun build(): SpendLimit =
                SpendLimit(
                    annually,
                    forever,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendLimit && annually == other.annually && forever == other.forever && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annually, forever, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class SpendVelocity
    @JsonCreator
    private constructor(
        @JsonProperty("annually")
        @ExcludeMissing
        private val annually: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("forever")
        @ExcludeMissing
        private val forever: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthly")
        @ExcludeMissing
        private val monthly: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Current annual spend velocity (in cents) on the Card. Present if annual spend limit is
         * set.
         */
        fun annually(): Optional<Long> = Optional.ofNullable(annually.getNullable("annually"))

        /**
         * Current forever spend velocity (in cents) on the Card. Present if forever spend limit is
         * set.
         */
        fun forever(): Optional<Long> = Optional.ofNullable(forever.getNullable("forever"))

        /**
         * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit is
         * set.
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * Current annual spend velocity (in cents) on the Card. Present if annual spend limit is
         * set.
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /**
         * Current forever spend velocity (in cents) on the Card. Present if forever spend limit is
         * set.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /**
         * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit is
         * set.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendVelocity = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendVelocity: SpendVelocity) = apply {
                annually = spendVelocity.annually
                forever = spendVelocity.forever
                monthly = spendVelocity.monthly
                additionalProperties = spendVelocity.additionalProperties.toMutableMap()
            }

            /**
             * Current annual spend velocity (in cents) on the Card. Present if annual spend limit
             * is set.
             */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * Current annual spend velocity (in cents) on the Card. Present if annual spend limit
             * is set.
             */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /**
             * Current forever spend velocity (in cents) on the Card. Present if forever spend limit
             * is set.
             */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /**
             * Current forever spend velocity (in cents) on the Card. Present if forever spend limit
             * is set.
             */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /**
             * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit
             * is set.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit
             * is set.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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

            fun build(): SpendVelocity =
                SpendVelocity(
                    annually,
                    forever,
                    monthly,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendVelocity && annually == other.annually && forever == other.forever && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annually, forever, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendVelocity{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardSpendLimits && availableSpendLimit == other.availableSpendLimit && spendLimit == other.spendLimit && spendVelocity == other.spendVelocity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableSpendLimit, spendLimit, spendVelocity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardSpendLimits{availableSpendLimit=$availableSpendLimit, spendLimit=$spendLimit, spendVelocity=$spendVelocity, additionalProperties=$additionalProperties}"
}
