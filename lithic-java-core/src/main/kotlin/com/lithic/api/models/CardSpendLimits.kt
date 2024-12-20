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

@JsonDeserialize(builder = CardSpendLimits.Builder::class)
@NoAutoDetect
class CardSpendLimits
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

    fun validate(): CardSpendLimits = apply {
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
        internal fun from(cardSpendLimits: CardSpendLimits) = apply {
            availableSpendLimit = cardSpendLimits.availableSpendLimit
            spendLimit = cardSpendLimits.spendLimit
            spendVelocity = cardSpendLimits.spendVelocity
            additionalProperties = cardSpendLimits.additionalProperties.toMutableMap()
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

        fun build(): CardSpendLimits =
            CardSpendLimits(
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
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The available spend limit (in cents) relative to the annual limit configured on the Card.
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
         * The available spend limit (in cents) relative to the annual limit configured on the Card.
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually() = annually

        /**
         * The available spend limit (in cents) relative to the forever limit configured on the
         * Card.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever() = forever

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Card.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AvailableSpendLimit = apply {
            if (!validated) {
                annually()
                forever()
                monthly()
                validated = true
            }
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
             * Card.
             */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * The available spend limit (in cents) relative to the annual limit configured on the
             * Card.
             */
            @JsonProperty("annually")
            @ExcludeMissing
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
            @JsonProperty("forever")
            @ExcludeMissing
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

    @JsonDeserialize(builder = SpendLimit.Builder::class)
    @NoAutoDetect
    class SpendLimit
    private constructor(
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The configured annual spend limit (in cents) on the Card. */
        fun annually(): Optional<Long> = Optional.ofNullable(annually.getNullable("annually"))

        /** The configured forever spend limit (in cents) on the Card. */
        fun forever(): Optional<Long> = Optional.ofNullable(forever.getNullable("forever"))

        /** The configured monthly spend limit (in cents) on the Card. */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /** The configured annual spend limit (in cents) on the Card. */
        @JsonProperty("annually") @ExcludeMissing fun _annually() = annually

        /** The configured forever spend limit (in cents) on the Card. */
        @JsonProperty("forever") @ExcludeMissing fun _forever() = forever

        /** The configured monthly spend limit (in cents) on the Card. */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (!validated) {
                annually()
                forever()
                monthly()
                validated = true
            }
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
            @JsonProperty("annually")
            @ExcludeMissing
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /** The configured forever spend limit (in cents) on the Card. */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /** The configured forever spend limit (in cents) on the Card. */
            @JsonProperty("forever")
            @ExcludeMissing
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /** The configured monthly spend limit (in cents) on the Card. */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /** The configured monthly spend limit (in cents) on the Card. */
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

    @JsonDeserialize(builder = SpendVelocity.Builder::class)
    @NoAutoDetect
    class SpendVelocity
    private constructor(
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("annually") @ExcludeMissing fun _annually() = annually

        /**
         * Current forever spend velocity (in cents) on the Card. Present if forever spend limit is
         * set.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever() = forever

        /**
         * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit is
         * set.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendVelocity = apply {
            if (!validated) {
                annually()
                forever()
                monthly()
                validated = true
            }
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
            @JsonProperty("annually")
            @ExcludeMissing
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
            @JsonProperty("forever")
            @ExcludeMissing
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
