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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class V2RetrieveFeaturesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val evaluated: JsonField<OffsetDateTime>,
    private val features: JsonField<List<SpendFeatureState>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("evaluated")
        @ExcludeMissing
        evaluated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("features")
        @ExcludeMissing
        features: JsonField<List<SpendFeatureState>> = JsonMissing.of(),
    ) : this(evaluated, features, mutableMapOf())

    /**
     * Timestamp at which the Features were evaluated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evaluated(): OffsetDateTime = evaluated.getRequired("evaluated")

    /**
     * Calculated Features used for evaluation of the provided Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun features(): List<SpendFeatureState> = features.getRequired("features")

    /**
     * Returns the raw JSON value of [evaluated].
     *
     * Unlike [evaluated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluated")
    @ExcludeMissing
    fun _evaluated(): JsonField<OffsetDateTime> = evaluated

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features")
    @ExcludeMissing
    fun _features(): JsonField<List<SpendFeatureState>> = features

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
         * Returns a mutable builder for constructing an instance of [V2RetrieveFeaturesResponse].
         *
         * The following fields are required:
         * ```java
         * .evaluated()
         * .features()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2RetrieveFeaturesResponse]. */
    class Builder internal constructor() {

        private var evaluated: JsonField<OffsetDateTime>? = null
        private var features: JsonField<MutableList<SpendFeatureState>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2RetrieveFeaturesResponse: V2RetrieveFeaturesResponse) = apply {
            evaluated = v2RetrieveFeaturesResponse.evaluated
            features = v2RetrieveFeaturesResponse.features.map { it.toMutableList() }
            additionalProperties = v2RetrieveFeaturesResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp at which the Features were evaluated */
        fun evaluated(evaluated: OffsetDateTime) = evaluated(JsonField.of(evaluated))

        /**
         * Sets [Builder.evaluated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluated(evaluated: JsonField<OffsetDateTime>) = apply { this.evaluated = evaluated }

        /** Calculated Features used for evaluation of the provided Auth Rule */
        fun features(features: List<SpendFeatureState>) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed `List<SpendFeatureState>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun features(features: JsonField<List<SpendFeatureState>>) = apply {
            this.features = features.map { it.toMutableList() }
        }

        /**
         * Adds a single [SpendFeatureState] to [features].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeature(feature: SpendFeatureState) = apply {
            features =
                (features ?: JsonField.of(mutableListOf())).also {
                    checkKnown("features", it).add(feature)
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

        /**
         * Returns an immutable instance of [V2RetrieveFeaturesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .evaluated()
         * .features()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2RetrieveFeaturesResponse =
            V2RetrieveFeaturesResponse(
                checkRequired("evaluated", evaluated),
                checkRequired("features", features).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2RetrieveFeaturesResponse = apply {
        if (validated) {
            return@apply
        }

        evaluated()
        features().forEach { it.validate() }
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
        (if (evaluated.asKnown().isPresent) 1 else 0) +
            (features.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class SpendFeatureState
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filters: JsonField<VelocityLimitFilters>,
        private val period: JsonField<VelocityLimitPeriod>,
        private val scope: JsonField<VelocityScope>,
        private val value: JsonField<Value>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<VelocityLimitFilters> = JsonMissing.of(),
            @JsonProperty("period")
            @ExcludeMissing
            period: JsonField<VelocityLimitPeriod> = JsonMissing.of(),
            @JsonProperty("scope")
            @ExcludeMissing
            scope: JsonField<VelocityScope> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        ) : this(filters, period, scope, value, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): VelocityLimitFilters = filters.getRequired("filters")

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
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Value = value.getRequired("value")

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<VelocityLimitFilters> = filters

        /**
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period")
        @ExcludeMissing
        fun _period(): JsonField<VelocityLimitPeriod> = period

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<VelocityScope> = scope

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
             * Returns a mutable builder for constructing an instance of [SpendFeatureState].
             *
             * The following fields are required:
             * ```java
             * .filters()
             * .period()
             * .scope()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendFeatureState]. */
        class Builder internal constructor() {

            private var filters: JsonField<VelocityLimitFilters>? = null
            private var period: JsonField<VelocityLimitPeriod>? = null
            private var scope: JsonField<VelocityScope>? = null
            private var value: JsonField<Value>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendFeatureState: SpendFeatureState) = apply {
                filters = spendFeatureState.filters
                period = spendFeatureState.period
                scope = spendFeatureState.scope
                value = spendFeatureState.value
                additionalProperties = spendFeatureState.additionalProperties.toMutableMap()
            }

            fun filters(filters: VelocityLimitFilters) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed [VelocityLimitFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<VelocityLimitFilters>) = apply { this.filters = filters }

            /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
            fun period(period: VelocityLimitPeriod) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [VelocityLimitPeriod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun period(period: JsonField<VelocityLimitPeriod>) = apply { this.period = period }

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)`.
             */
            fun period(trailingWindowObject: VelocityLimitPeriod.TrailingWindowObject) =
                period(VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)`.
             */
            fun period(fixedWindowDay: VelocityLimitPeriod.FixedWindowDay) =
                period(VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)`.
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
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)`.
             */
            fun period(fixedWindowYear: VelocityLimitPeriod.FixedWindowYear) =
                period(VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear))

            /** The scope the velocity is calculated for */
            fun scope(scope: VelocityScope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [VelocityScope] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scope(scope: JsonField<VelocityScope>) = apply { this.scope = scope }

            fun value(value: Value) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Value>) = apply { this.value = value }

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
             * Returns an immutable instance of [SpendFeatureState].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filters()
             * .period()
             * .scope()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpendFeatureState =
                SpendFeatureState(
                    checkRequired("filters", filters),
                    checkRequired("period", period),
                    checkRequired("scope", scope),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SpendFeatureState = apply {
            if (validated) {
                return@apply
            }

            filters().validate()
            period().validate()
            scope().validate()
            value().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
                (period.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

        /** The scope the velocity is calculated for */
        class VelocityScope @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

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

        class Value
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val count: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            ) : this(amount, count, mutableMapOf())

            /**
             * Amount (in cents) for the given Auth Rule that is used as input for calculating the
             * rule. For Velocity Limit rules this would be the calculated Velocity. For Conditional
             * Rules using CARD_TRANSACTION_COUNT_* this will be 0
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * Number of velocity impacting transactions matching the given scope, period and
             * filters
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Long = count.getRequired("count")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

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
                 * Returns a mutable builder for constructing an instance of [Value].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .count()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Value]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var count: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(value: Value) = apply {
                    amount = value.amount
                    count = value.count
                    additionalProperties = value.additionalProperties.toMutableMap()
                }

                /**
                 * Amount (in cents) for the given Auth Rule that is used as input for calculating
                 * the rule. For Velocity Limit rules this would be the calculated Velocity. For
                 * Conditional Rules using CARD_TRANSACTION_COUNT_* this will be 0
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * Number of velocity impacting transactions matching the given scope, period and
                 * filters
                 */
                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Value].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .count()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Value =
                    Value(
                        checkRequired("amount", amount),
                        checkRequired("count", count),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Value = apply {
                if (validated) {
                    return@apply
                }

                amount()
                count()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (count.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Value &&
                    amount == other.amount &&
                    count == other.count &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(amount, count, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Value{amount=$amount, count=$count, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendFeatureState &&
                filters == other.filters &&
                period == other.period &&
                scope == other.scope &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filters, period, scope, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendFeatureState{filters=$filters, period=$period, scope=$scope, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2RetrieveFeaturesResponse &&
            evaluated == other.evaluated &&
            features == other.features &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(evaluated, features, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveFeaturesResponse{evaluated=$evaluated, features=$features, additionalProperties=$additionalProperties}"
}
