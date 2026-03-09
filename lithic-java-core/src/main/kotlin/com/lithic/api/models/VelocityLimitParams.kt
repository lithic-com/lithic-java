// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VelocityLimitParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val period: JsonField<VelocityLimitPeriod>,
    private val scope: JsonField<VelocityScope>,
    private val filters: JsonField<VelocityLimitFilters>,
    private val limitAmount: JsonField<Long>,
    private val limitCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("period")
        @ExcludeMissing
        period: JsonField<VelocityLimitPeriod> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<VelocityScope> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<VelocityLimitFilters> = JsonMissing.of(),
        @JsonProperty("limit_amount")
        @ExcludeMissing
        limitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("limit_count") @ExcludeMissing limitCount: JsonField<Long> = JsonMissing.of(),
    ) : this(period, scope, filters, limitAmount, limitCount, mutableMapOf())

    /**
     * Velocity over the current day since 00:00 / 12 AM in Eastern Time
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): VelocityLimitPeriod = period.getRequired("period")

    /**
     * The scope the velocity is calculated for
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): VelocityScope = scope.getRequired("scope")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<VelocityLimitFilters> = filters.getOptional("filters")

    /**
     * The maximum amount of spend velocity allowed in the period in minor units (the smallest unit
     * of a currency, e.g. cents for USD). Transactions exceeding this limit will be declined.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitAmount(): Optional<Long> = limitAmount.getOptional("limit_amount")

    /**
     * The number of spend velocity impacting transactions may not exceed this limit in the period.
     * Transactions exceeding this limit will be declined. A spend velocity impacting transaction is
     * a transaction that has been authorized, and optionally settled, or a force post (a
     * transaction that settled without prior authorization).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitCount(): Optional<Long> = limitCount.getOptional("limit_count")

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<VelocityLimitPeriod> = period

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<VelocityScope> = scope

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<VelocityLimitFilters> = filters

    /**
     * Returns the raw JSON value of [limitAmount].
     *
     * Unlike [limitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_amount") @ExcludeMissing fun _limitAmount(): JsonField<Long> = limitAmount

    /**
     * Returns the raw JSON value of [limitCount].
     *
     * Unlike [limitCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_count") @ExcludeMissing fun _limitCount(): JsonField<Long> = limitCount

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VelocityLimitParams].
         *
         * The following fields are required:
         * ```java
         * .period()
         * .scope()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VelocityLimitParams]. */
    class Builder internal constructor() {

        private var period: JsonField<VelocityLimitPeriod>? = null
        private var scope: JsonField<VelocityScope>? = null
        private var filters: JsonField<VelocityLimitFilters> = JsonMissing.of()
        private var limitAmount: JsonField<Long> = JsonMissing.of()
        private var limitCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(velocityLimitParams: VelocityLimitParams) = apply {
            period = velocityLimitParams.period
            scope = velocityLimitParams.scope
            filters = velocityLimitParams.filters
            limitAmount = velocityLimitParams.limitAmount
            limitCount = velocityLimitParams.limitCount
            additionalProperties = velocityLimitParams.additionalProperties.toMutableMap()
        }

        /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
        fun period(period: VelocityLimitPeriod) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [VelocityLimitPeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun period(period: JsonField<VelocityLimitPeriod>) = apply { this.period = period }

        /**
         * Alias for calling [period] with
         * `VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)`.
         */
        fun period(trailingWindowObject: VelocityLimitPeriod.TrailingWindowObject) =
            period(VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject))

        /**
         * Alias for calling [period] with `VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)`.
         */
        fun period(fixedWindowDay: VelocityLimitPeriod.FixedWindowDay) =
            period(VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay))

        /**
         * Alias for calling [period] with `VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)`.
         */
        fun period(fixedWindowWeek: VelocityLimitPeriod.FixedWindowWeek) =
            period(VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek))

        /**
         * Alias for calling [period] with
         * `VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth)`.
         */
        fun period(fixedWindowMonth: VelocityLimitPeriod.FixedWindowMonth) =
            period(VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth))

        /**
         * Alias for calling [period] with `VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)`.
         */
        fun period(fixedWindowYear: VelocityLimitPeriod.FixedWindowYear) =
            period(VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear))

        /** The scope the velocity is calculated for */
        fun scope(scope: VelocityScope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [VelocityScope] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scope(scope: JsonField<VelocityScope>) = apply { this.scope = scope }

        fun filters(filters: VelocityLimitFilters) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [VelocityLimitFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filters(filters: JsonField<VelocityLimitFilters>) = apply { this.filters = filters }

        /**
         * The maximum amount of spend velocity allowed in the period in minor units (the smallest
         * unit of a currency, e.g. cents for USD). Transactions exceeding this limit will be
         * declined.
         */
        fun limitAmount(limitAmount: Long?) = limitAmount(JsonField.ofNullable(limitAmount))

        /**
         * Alias for [Builder.limitAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limitAmount(limitAmount: Long) = limitAmount(limitAmount as Long?)

        /** Alias for calling [Builder.limitAmount] with `limitAmount.orElse(null)`. */
        fun limitAmount(limitAmount: Optional<Long>) = limitAmount(limitAmount.getOrNull())

        /**
         * Sets [Builder.limitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Alias for [Builder.limitCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limitCount(limitCount: Long) = limitCount(limitCount as Long?)

        /** Alias for calling [Builder.limitCount] with `limitCount.orElse(null)`. */
        fun limitCount(limitCount: Optional<Long>) = limitCount(limitCount.getOrNull())

        /**
         * Sets [Builder.limitCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [VelocityLimitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .period()
         * .scope()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VelocityLimitParams =
            VelocityLimitParams(
                checkRequired("period", period),
                checkRequired("scope", scope),
                filters,
                limitAmount,
                limitCount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VelocityLimitParams = apply {
        if (validated) {
            return@apply
        }

        period().validate()
        scope().validate()
        filters().ifPresent { it.validate() }
        limitAmount()
        limitCount()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (period.asKnown().getOrNull()?.validity() ?: 0) +
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limitAmount.asKnown().isPresent) 1 else 0) +
            (if (limitCount.asKnown().isPresent) 1 else 0)

    /** The scope the velocity is calculated for */
    class VelocityScope @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmStatic fun of(value: String) = VelocityScope(JsonField.of(value))
        }

        /** An enum containing [VelocityScope]'s known values. */
        enum class Known {
            CARD,
            ACCOUNT,
        }

        /**
         * An enum containing [VelocityScope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VelocityScope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD,
            ACCOUNT,
            /**
             * An enum member indicating that [VelocityScope] was instantiated with an unknown
             * value.
             */
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
                else -> throw LithicInvalidDataException("Unknown VelocityScope: $value")
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

        private var validated: Boolean = false

        fun validate(): VelocityScope = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VelocityScope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VelocityLimitParams &&
            period == other.period &&
            scope == other.scope &&
            filters == other.filters &&
            limitAmount == other.limitAmount &&
            limitCount == other.limitCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(period, scope, filters, limitAmount, limitCount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VelocityLimitParams{period=$period, scope=$scope, filters=$filters, limitAmount=$limitAmount, limitCount=$limitCount, additionalProperties=$additionalProperties}"
}
