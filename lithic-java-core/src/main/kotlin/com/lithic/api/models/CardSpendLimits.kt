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

@JsonDeserialize(builder = CardSpendLimits.Builder::class)
@NoAutoDetect
class CardSpendLimits
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

    fun validate(): CardSpendLimits = apply {
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

        return other is CardSpendLimits &&
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
        "CardSpendLimits{availableSpendLimit=$availableSpendLimit, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var availableSpendLimit: JsonField<AvailableSpendLimit> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardSpendLimits: CardSpendLimits) = apply {
            this.availableSpendLimit = cardSpendLimits.availableSpendLimit
            additionalProperties(cardSpendLimits.additionalProperties)
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

        fun build(): CardSpendLimits =
            CardSpendLimits(availableSpendLimit, additionalProperties.toUnmodifiable())
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

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The available spend limit relative to the annual limit configured on the Card. */
        fun annually(): Optional<Long> = Optional.ofNullable(annually.getNullable("annually"))

        /** The available spend limit relative to the forever limit configured on the Card. */
        fun forever(): Optional<Long> = Optional.ofNullable(forever.getNullable("forever"))

        /** The available spend limit relative to the monthly limit configured on the Card. */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /** The available spend limit relative to the annual limit configured on the Card. */
        @JsonProperty("annually") @ExcludeMissing fun _annually() = annually

        /** The available spend limit relative to the forever limit configured on the Card. */
        @JsonProperty("forever") @ExcludeMissing fun _forever() = forever

        /** The available spend limit relative to the monthly limit configured on the Card. */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly() = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AvailableSpendLimit = apply {
            if (!validated) {
                annually()
                forever()
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
                this.annually == other.annually &&
                this.forever == other.forever &&
                this.monthly == other.monthly &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        annually,
                        forever,
                        monthly,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AvailableSpendLimit{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"

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
                this.annually = availableSpendLimit.annually
                this.forever = availableSpendLimit.forever
                this.monthly = availableSpendLimit.monthly
                additionalProperties(availableSpendLimit.additionalProperties)
            }

            /** The available spend limit relative to the annual limit configured on the Card. */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /** The available spend limit relative to the annual limit configured on the Card. */
            @JsonProperty("annually")
            @ExcludeMissing
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /** The available spend limit relative to the forever limit configured on the Card. */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /** The available spend limit relative to the forever limit configured on the Card. */
            @JsonProperty("forever")
            @ExcludeMissing
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /** The available spend limit relative to the monthly limit configured on the Card. */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /** The available spend limit relative to the monthly limit configured on the Card. */
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
                    annually,
                    forever,
                    monthly,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
