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
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = VelocityLimitParams.Builder::class)
@NoAutoDetect
class VelocityLimitParams
private constructor(
    private val scope: JsonField<Scope>,
    private val period: JsonField<Period>,
    private val filters: JsonField<Filters>,
    private val limitAmount: JsonField<Double>,
    private val limitCount: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun scope(): Scope = scope.getRequired("scope")

    fun period(): Period = period.getRequired("period")

    fun filters(): Filters = filters.getRequired("filters")

    /**
     * The maximum amount of spend velocity allowed in the period in minor units (the smallest unit
     * of a currency, e.g. cents for USD). Transactions exceeding this limit will be declined.
     */
    fun limitAmount(): Optional<Double> =
        Optional.ofNullable(limitAmount.getNullable("limit_amount"))

    /**
     * The number of spend velocity impacting transactions may not exceed this limit in the period.
     * Transactions exceeding this limit will be declined. A spend velocity impacting transaction is
     * a transaction that has been authorized, and optionally settled, or a force post (a
     * transaction that settled without prior authorization).
     */
    fun limitCount(): Optional<Double> = Optional.ofNullable(limitCount.getNullable("limit_count"))

    @JsonProperty("scope") @ExcludeMissing fun _scope() = scope

    @JsonProperty("period") @ExcludeMissing fun _period() = period

    @JsonProperty("filters") @ExcludeMissing fun _filters() = filters

    /**
     * The maximum amount of spend velocity allowed in the period in minor units (the smallest unit
     * of a currency, e.g. cents for USD). Transactions exceeding this limit will be declined.
     */
    @JsonProperty("limit_amount") @ExcludeMissing fun _limitAmount() = limitAmount

    /**
     * The number of spend velocity impacting transactions may not exceed this limit in the period.
     * Transactions exceeding this limit will be declined. A spend velocity impacting transaction is
     * a transaction that has been authorized, and optionally settled, or a force post (a
     * transaction that settled without prior authorization).
     */
    @JsonProperty("limit_count") @ExcludeMissing fun _limitCount() = limitCount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): VelocityLimitParams = apply {
        if (!validated) {
            scope()
            period()
            filters().validate()
            limitAmount()
            limitCount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VelocityLimitParams &&
            this.scope == other.scope &&
            this.period == other.period &&
            this.filters == other.filters &&
            this.limitAmount == other.limitAmount &&
            this.limitCount == other.limitCount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    scope,
                    period,
                    filters,
                    limitAmount,
                    limitCount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "VelocityLimitParams{scope=$scope, period=$period, filters=$filters, limitAmount=$limitAmount, limitCount=$limitCount, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var scope: JsonField<Scope> = JsonMissing.of()
        private var period: JsonField<Period> = JsonMissing.of()
        private var filters: JsonField<Filters> = JsonMissing.of()
        private var limitAmount: JsonField<Double> = JsonMissing.of()
        private var limitCount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(velocityLimitParams: VelocityLimitParams) = apply {
            this.scope = velocityLimitParams.scope
            this.period = velocityLimitParams.period
            this.filters = velocityLimitParams.filters
            this.limitAmount = velocityLimitParams.limitAmount
            this.limitCount = velocityLimitParams.limitCount
            additionalProperties(velocityLimitParams.additionalProperties)
        }

        fun scope(scope: Scope) = scope(JsonField.of(scope))

        @JsonProperty("scope")
        @ExcludeMissing
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

        fun period(period: Period) = period(JsonField.of(period))

        @JsonProperty("period")
        @ExcludeMissing
        fun period(period: JsonField<Period>) = apply { this.period = period }

        fun filters(filters: Filters) = filters(JsonField.of(filters))

        @JsonProperty("filters")
        @ExcludeMissing
        fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        fun limitAmount(limitAmount: Double) = limitAmount(JsonField.of(limitAmount))

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        @JsonProperty("limit_amount")
        @ExcludeMissing
        fun limitAmount(limitAmount: JsonField<Double>) = apply { this.limitAmount = limitAmount }

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        fun limitCount(limitCount: Double) = limitCount(JsonField.of(limitCount))

        /**
         * The number of spend velocity impacting transactions may not exceed this limit in the
         * period. Transactions exceeding this limit will be declined. A spend velocity impacting
         * transaction is a transaction that has been authorized, and optionally settled, or a force
         * post (a transaction that settled without prior authorization).
         */
        @JsonProperty("limit_count")
        @ExcludeMissing
        fun limitCount(limitCount: JsonField<Double>) = apply { this.limitCount = limitCount }

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

        fun build(): VelocityLimitParams =
            VelocityLimitParams(
                scope,
                period,
                filters,
                limitAmount,
                limitCount,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Filters.Builder::class)
    @NoAutoDetect
    class Filters
    private constructor(
        private val includeMccs: JsonField<List<String>>,
        private val includeCountries: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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
        fun includeCountries(): Optional<List<String>> =
            Optional.ofNullable(includeCountries.getNullable("include_countries"))

        /**
         * Merchant Category Codes to include in the velocity calculation. Transactions not matching
         * this MCC will not be included in the calculated velocity.
         */
        @JsonProperty("include_mccs") @ExcludeMissing fun _includeMccs() = includeMccs

        /**
         * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
         * matching any of the provided will not be included in the calculated velocity.
         */
        @JsonProperty("include_countries")
        @ExcludeMissing
        fun _includeCountries() = includeCountries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Filters = apply {
            if (!validated) {
                includeMccs()
                includeCountries()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters &&
                this.includeMccs == other.includeMccs &&
                this.includeCountries == other.includeCountries &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        includeMccs,
                        includeCountries,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Filters{includeMccs=$includeMccs, includeCountries=$includeCountries, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var includeMccs: JsonField<List<String>> = JsonMissing.of()
            private var includeCountries: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                this.includeMccs = filters.includeMccs
                this.includeCountries = filters.includeCountries
                additionalProperties(filters.additionalProperties)
            }

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            fun includeMccs(includeMccs: List<String>) = includeMccs(JsonField.of(includeMccs))

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             */
            @JsonProperty("include_mccs")
            @ExcludeMissing
            fun includeMccs(includeMccs: JsonField<List<String>>) = apply {
                this.includeMccs = includeMccs
            }

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun includeCountries(includeCountries: List<String>) =
                includeCountries(JsonField.of(includeCountries))

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            @JsonProperty("include_countries")
            @ExcludeMissing
            fun includeCountries(includeCountries: JsonField<List<String>>) = apply {
                this.includeCountries = includeCountries
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

            fun build(): Filters =
                Filters(
                    includeMccs.map { it.toUnmodifiable() },
                    includeCountries.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(using = Period.Deserializer::class)
    @JsonSerialize(using = Period.Serializer::class)
    class Period
    private constructor(
        private val double: Double? = null,
        private val velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The size of the trailing window to calculate Spend Velocity over in seconds. */
        fun double(): Optional<Double> = Optional.ofNullable(double)
        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         */
        fun velocityLimitParamsPeriodWindow(): Optional<VelocityLimitParamsPeriodWindow> =
            Optional.ofNullable(velocityLimitParamsPeriodWindow)

        fun isDouble(): Boolean = double != null

        fun isVelocityLimitParamsPeriodWindow(): Boolean = velocityLimitParamsPeriodWindow != null

        fun asDouble(): Double = double.getOrThrow("double")

        fun asVelocityLimitParamsPeriodWindow(): VelocityLimitParamsPeriodWindow =
            velocityLimitParamsPeriodWindow.getOrThrow("velocityLimitParamsPeriodWindow")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                double != null -> visitor.visitDouble(double)
                velocityLimitParamsPeriodWindow != null ->
                    visitor.visitVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Period = apply {
            if (!validated) {
                if (double == null && velocityLimitParamsPeriodWindow == null) {
                    throw LithicInvalidDataException("Unknown Period: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Period &&
                this.double == other.double &&
                this.velocityLimitParamsPeriodWindow == other.velocityLimitParamsPeriodWindow
        }

        override fun hashCode(): Int {
            return Objects.hash(double, velocityLimitParamsPeriodWindow)
        }

        override fun toString(): String {
            return when {
                double != null -> "Period{double=$double}"
                velocityLimitParamsPeriodWindow != null ->
                    "Period{velocityLimitParamsPeriodWindow=$velocityLimitParamsPeriodWindow}"
                _json != null -> "Period{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Period")
            }
        }

        companion object {

            @JvmStatic fun ofDouble(double: Double) = Period(double = double)

            @JvmStatic
            fun ofVelocityLimitParamsPeriodWindow(
                velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
            ) = Period(velocityLimitParamsPeriodWindow = velocityLimitParamsPeriodWindow)
        }

        interface Visitor<out T> {

            fun visitDouble(double: Double): T

            fun visitVelocityLimitParamsPeriodWindow(
                velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
            ): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Period: $json")
            }
        }

        class Deserializer : BaseDeserializer<Period>(Period::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Period {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Period(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<VelocityLimitParamsPeriodWindow>())?.let {
                    return Period(velocityLimitParamsPeriodWindow = it, _json = json)
                }

                return Period(_json = json)
            }
        }

        class Serializer : BaseSerializer<Period>(Period::class) {

            override fun serialize(
                value: Period,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.double != null -> generator.writeObject(value.double)
                    value.velocityLimitParamsPeriodWindow != null ->
                        generator.writeObject(value.velocityLimitParamsPeriodWindow)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Period")
                }
            }
        }
    }

    class Scope
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scope && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD = Scope(JsonField.of("CARD"))

            @JvmField val ACCOUNT = Scope(JsonField.of("ACCOUNT"))

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        enum class Known {
            CARD,
            ACCOUNT,
        }

        enum class Value {
            CARD,
            ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                ACCOUNT -> Value.ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                ACCOUNT -> Known.ACCOUNT
                else -> throw LithicInvalidDataException("Unknown Scope: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
