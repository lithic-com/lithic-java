// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class VelocityLimitParams
@JsonCreator
private constructor(
    @JsonProperty("filters")
    @ExcludeMissing
    private val filters: JsonField<Filters> = JsonMissing.of(),
    @JsonProperty("period")
    @ExcludeMissing
    private val period: JsonField<Period> = JsonMissing.of(),
    @JsonProperty("scope") @ExcludeMissing private val scope: JsonField<Scope> = JsonMissing.of(),
    @JsonProperty("limit_amount")
    @ExcludeMissing
    private val limitAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("limit_count")
    @ExcludeMissing
    private val limitCount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun filters(): Filters = filters.getRequired("filters")

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     */
    fun period(): Period = period.getRequired("period")

    fun scope(): Scope = scope.getRequired("scope")

    /**
     * The maximum amount of spend velocity allowed in the period in minor units (the smallest unit
     * of a currency, e.g. cents for USD). Transactions exceeding this limit will be declined.
     */
    fun limitAmount(): Optional<Long> = Optional.ofNullable(limitAmount.getNullable("limit_amount"))

    /**
     * The number of spend velocity impacting transactions may not exceed this limit in the period.
     * Transactions exceeding this limit will be declined. A spend velocity impacting transaction is
     * a transaction that has been authorized, and optionally settled, or a force post (a
     * transaction that settled without prior authorization).
     */
    fun limitCount(): Optional<Long> = Optional.ofNullable(limitCount.getNullable("limit_count"))

    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

    /**
     * The maximum amount of spend velocity allowed in the period in minor units (the smallest unit
     * of a currency, e.g. cents for USD). Transactions exceeding this limit will be declined.
     */
    @JsonProperty("limit_amount") @ExcludeMissing fun _limitAmount(): JsonField<Long> = limitAmount

    /**
     * The number of spend velocity impacting transactions may not exceed this limit in the period.
     * Transactions exceeding this limit will be declined. A spend velocity impacting transaction is
     * a transaction that has been authorized, and optionally settled, or a force post (a
     * transaction that settled without prior authorization).
     */
    @JsonProperty("limit_count") @ExcludeMissing fun _limitCount(): JsonField<Long> = limitCount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): VelocityLimitParams = apply {
        if (validated) {
            return@apply
        }

        filters().validate()
        period().validate()
        scope()
        limitAmount()
        limitCount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VelocityLimitParams]. */
    class Builder internal constructor() {

        private var filters: JsonField<Filters>? = null
        private var period: JsonField<Period>? = null
        private var scope: JsonField<Scope>? = null
        private var limitAmount: JsonField<Long> = JsonMissing.of()
        private var limitCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(velocityLimitParams: VelocityLimitParams) = apply {
            filters = velocityLimitParams.filters
            period = velocityLimitParams.period
            scope = velocityLimitParams.scope
            limitAmount = velocityLimitParams.limitAmount
            limitCount = velocityLimitParams.limitCount
            additionalProperties = velocityLimitParams.additionalProperties.toMutableMap()
        }

        fun filters(filters: Filters) = filters(JsonField.of(filters))

        fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun period(period: Period) = period(JsonField.of(period))

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun period(period: JsonField<Period>) = apply { this.period = period }

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun period(trailingWindow: Long) = period(Period.ofTrailingWindow(trailingWindow))

        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         */
        fun period(velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow) =
            period(Period.ofVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow))

        fun scope(scope: Scope) = scope(JsonField.of(scope))

        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        fun limitAmount(limitAmount: Long?) = limitAmount(JsonField.ofNullable(limitAmount))

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        fun limitAmount(limitAmount: Long) = limitAmount(limitAmount as Long?)

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limitAmount(limitAmount: Optional<Long>) =
            limitAmount(limitAmount.orElse(null) as Long?)

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        fun limitAmount(limitAmount: JsonField<Long>) = apply { this.limitAmount = limitAmount }

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        fun limitCount(limitCount: Long?) = limitCount(JsonField.ofNullable(limitCount))

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        fun limitCount(limitCount: Long) = limitCount(limitCount as Long?)

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limitCount(limitCount: Optional<Long>) = limitCount(limitCount.orElse(null) as Long?)

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        fun limitCount(limitCount: JsonField<Long>) = apply { this.limitCount = limitCount }

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

        fun build(): VelocityLimitParams =
            VelocityLimitParams(
                checkRequired("filters", filters),
                checkRequired("period", period),
                checkRequired("scope", scope),
                limitAmount,
                limitCount,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Filters
    @JsonCreator
    private constructor(
        @JsonProperty("include_countries")
        @ExcludeMissing
        private val includeCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("include_mccs")
        @ExcludeMissing
        private val includeMccs: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
         * matching any of the provided will not be included in the calculated velocity.
         */
        fun includeCountries(): Optional<List<String>> =
            Optional.ofNullable(includeCountries.getNullable("include_countries"))

        /**
         * Merchant Category Codes to include in the velocity calculation. Transactions not matching
         * this MCC will not be included in the calculated velocity.
         */
        fun includeMccs(): Optional<List<String>> =
            Optional.ofNullable(includeMccs.getNullable("include_mccs"))

        /**
         * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
         * matching any of the provided will not be included in the calculated velocity.
         */
        @JsonProperty("include_countries")
        @ExcludeMissing
        fun _includeCountries(): JsonField<List<String>> = includeCountries

        /**
         * Merchant Category Codes to include in the velocity calculation. Transactions not matching
         * this MCC will not be included in the calculated velocity.
         */
        @JsonProperty("include_mccs")
        @ExcludeMissing
        fun _includeMccs(): JsonField<List<String>> = includeMccs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Filters = apply {
            if (validated) {
                return@apply
            }

            includeCountries()
            includeMccs()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var includeCountries: JsonField<MutableList<String>>? = null
            private var includeMccs: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                includeCountries = filters.includeCountries.map { it.toMutableList() }
                includeMccs = filters.includeMccs.map { it.toMutableList() }
                additionalProperties = filters.additionalProperties.toMutableMap()
            }

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun includeCountries(includeCountries: List<String>?) =
                includeCountries(JsonField.ofNullable(includeCountries))

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun includeCountries(includeCountries: Optional<List<String>>) =
                includeCountries(includeCountries.orElse(null))

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun includeCountries(includeCountries: JsonField<List<String>>) = apply {
                this.includeCountries = includeCountries.map { it.toMutableList() }
            }

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun addIncludeCountry(includeCountry: String) = apply {
                includeCountries =
                    (includeCountries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includeCountries", it).add(includeCountry)
                    }
            }

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            fun includeMccs(includeMccs: List<String>?) =
                includeMccs(JsonField.ofNullable(includeMccs))

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            fun includeMccs(includeMccs: Optional<List<String>>) =
                includeMccs(includeMccs.orElse(null))

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            fun includeMccs(includeMccs: JsonField<List<String>>) = apply {
                this.includeMccs = includeMccs.map { it.toMutableList() }
            }

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            fun addIncludeMcc(includeMcc: String) = apply {
                includeMccs =
                    (includeMccs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includeMccs", it).add(includeMcc)
                    }
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

            fun build(): Filters =
                Filters(
                    (includeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Filters && includeCountries == other.includeCountries && includeMccs == other.includeMccs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(includeCountries, includeMccs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{includeCountries=$includeCountries, includeMccs=$includeMccs, additionalProperties=$additionalProperties}"
    }

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     */
    @JsonDeserialize(using = Period.Deserializer::class)
    @JsonSerialize(using = Period.Serializer::class)
    class Period
    private constructor(
        private val trailingWindow: Long? = null,
        private val velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun trailingWindow(): Optional<Long> = Optional.ofNullable(trailingWindow)

        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         */
        fun velocityLimitParamsPeriodWindow(): Optional<VelocityLimitParamsPeriodWindow> =
            Optional.ofNullable(velocityLimitParamsPeriodWindow)

        fun isTrailingWindow(): Boolean = trailingWindow != null

        fun isVelocityLimitParamsPeriodWindow(): Boolean = velocityLimitParamsPeriodWindow != null

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun asTrailingWindow(): Long = trailingWindow.getOrThrow("trailingWindow")

        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         */
        fun asVelocityLimitParamsPeriodWindow(): VelocityLimitParamsPeriodWindow =
            velocityLimitParamsPeriodWindow.getOrThrow("velocityLimitParamsPeriodWindow")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                trailingWindow != null -> visitor.visitTrailingWindow(trailingWindow)
                velocityLimitParamsPeriodWindow != null ->
                    visitor.visitVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Period = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTrailingWindow(trailingWindow: Long) {}

                    override fun visitVelocityLimitParamsPeriodWindow(
                        velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
                    ) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Period && trailingWindow == other.trailingWindow && velocityLimitParamsPeriodWindow == other.velocityLimitParamsPeriodWindow /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(trailingWindow, velocityLimitParamsPeriodWindow) /* spotless:on */

        override fun toString(): String =
            when {
                trailingWindow != null -> "Period{trailingWindow=$trailingWindow}"
                velocityLimitParamsPeriodWindow != null ->
                    "Period{velocityLimitParamsPeriodWindow=$velocityLimitParamsPeriodWindow}"
                _json != null -> "Period{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Period")
            }

        companion object {

            /**
             * The size of the trailing window to calculate Spend Velocity over in seconds. The
             * minimum value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
             */
            @JvmStatic
            fun ofTrailingWindow(trailingWindow: Long) = Period(trailingWindow = trailingWindow)

            /**
             * The window of time to calculate Spend Velocity over.
             * - `DAY`: Velocity over the current day since midnight Eastern Time.
             * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the
             *   month in Eastern Time.
             */
            @JvmStatic
            fun ofVelocityLimitParamsPeriodWindow(
                velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
            ) = Period(velocityLimitParamsPeriodWindow = velocityLimitParamsPeriodWindow)
        }

        /** An interface that defines how to map each variant of [Period] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * The size of the trailing window to calculate Spend Velocity over in seconds. The
             * minimum value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
             */
            fun visitTrailingWindow(trailingWindow: Long): T

            /**
             * The window of time to calculate Spend Velocity over.
             * - `DAY`: Velocity over the current day since midnight Eastern Time.
             * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the
             *   month in Eastern Time.
             */
            fun visitVelocityLimitParamsPeriodWindow(
                velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
            ): T

            /**
             * Maps an unknown variant of [Period] to a value of type [T].
             *
             * An instance of [Period] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Period: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Period>(Period::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Period {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                    return Period(trailingWindow = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<VelocityLimitParamsPeriodWindow>())?.let {
                    return Period(velocityLimitParamsPeriodWindow = it, _json = json)
                }

                return Period(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Period>(Period::class) {

            override fun serialize(
                value: Period,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.trailingWindow != null -> generator.writeObject(value.trailingWindow)
                    value.velocityLimitParamsPeriodWindow != null ->
                        generator.writeObject(value.velocityLimitParamsPeriodWindow)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Period")
                }
            }
        }
    }

    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CARD = of("CARD")

            @JvmField val ACCOUNT = of("ACCOUNT")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            CARD,
            ACCOUNT,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD,
            ACCOUNT,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                ACCOUNT -> Value.ACCOUNT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                ACCOUNT -> Known.ACCOUNT
                else -> throw LithicInvalidDataException("Unknown Scope: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scope && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VelocityLimitParams && filters == other.filters && period == other.period && scope == other.scope && limitAmount == other.limitAmount && limitCount == other.limitCount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(filters, period, scope, limitAmount, limitCount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VelocityLimitParams{filters=$filters, period=$period, scope=$scope, limitAmount=$limitAmount, limitCount=$limitCount, additionalProperties=$additionalProperties}"
}
