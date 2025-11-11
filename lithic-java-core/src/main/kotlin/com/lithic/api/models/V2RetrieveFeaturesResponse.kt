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
import java.util.Optional
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

        class VelocityLimitFilters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val excludeCountries: JsonField<List<String>>,
            private val excludeMccs: JsonField<List<String>>,
            private val includeCountries: JsonField<List<String>>,
            private val includeMccs: JsonField<List<String>>,
            private val includePanEntryModes: JsonField<List<IncludePanEntryMode>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("exclude_countries")
                @ExcludeMissing
                excludeCountries: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("exclude_mccs")
                @ExcludeMissing
                excludeMccs: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("include_countries")
                @ExcludeMissing
                includeCountries: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("include_mccs")
                @ExcludeMissing
                includeMccs: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("include_pan_entry_modes")
                @ExcludeMissing
                includePanEntryModes: JsonField<List<IncludePanEntryMode>> = JsonMissing.of(),
            ) : this(
                excludeCountries,
                excludeMccs,
                includeCountries,
                includeMccs,
                includePanEntryModes,
                mutableMapOf(),
            )

            /**
             * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation.
             * Transactions matching any of the provided will be excluded from the calculated
             * velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludeCountries(): Optional<List<String>> =
                excludeCountries.getOptional("exclude_countries")

            /**
             * Merchant Category Codes to exclude from the velocity calculation. Transactions
             * matching this MCC will be excluded from the calculated velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludeMccs(): Optional<List<String>> = excludeMccs.getOptional("exclude_mccs")

            /**
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includeCountries(): Optional<List<String>> =
                includeCountries.getOptional("include_countries")

            /**
             * Merchant Category Codes to include in the velocity calculation. Transactions not
             * matching this MCC will not be included in the calculated velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includeMccs(): Optional<List<String>> = includeMccs.getOptional("include_mccs")

            /**
             * PAN entry modes to include in the velocity calculation. Transactions not matching any
             * of the provided will not be included in the calculated velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includePanEntryModes(): Optional<List<IncludePanEntryMode>> =
                includePanEntryModes.getOptional("include_pan_entry_modes")

            /**
             * Returns the raw JSON value of [excludeCountries].
             *
             * Unlike [excludeCountries], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exclude_countries")
            @ExcludeMissing
            fun _excludeCountries(): JsonField<List<String>> = excludeCountries

            /**
             * Returns the raw JSON value of [excludeMccs].
             *
             * Unlike [excludeMccs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("exclude_mccs")
            @ExcludeMissing
            fun _excludeMccs(): JsonField<List<String>> = excludeMccs

            /**
             * Returns the raw JSON value of [includeCountries].
             *
             * Unlike [includeCountries], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_countries")
            @ExcludeMissing
            fun _includeCountries(): JsonField<List<String>> = includeCountries

            /**
             * Returns the raw JSON value of [includeMccs].
             *
             * Unlike [includeMccs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("include_mccs")
            @ExcludeMissing
            fun _includeMccs(): JsonField<List<String>> = includeMccs

            /**
             * Returns the raw JSON value of [includePanEntryModes].
             *
             * Unlike [includePanEntryModes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_pan_entry_modes")
            @ExcludeMissing
            fun _includePanEntryModes(): JsonField<List<IncludePanEntryMode>> = includePanEntryModes

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
                 * Returns a mutable builder for constructing an instance of [VelocityLimitFilters].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VelocityLimitFilters]. */
            class Builder internal constructor() {

                private var excludeCountries: JsonField<MutableList<String>>? = null
                private var excludeMccs: JsonField<MutableList<String>>? = null
                private var includeCountries: JsonField<MutableList<String>>? = null
                private var includeMccs: JsonField<MutableList<String>>? = null
                private var includePanEntryModes: JsonField<MutableList<IncludePanEntryMode>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(velocityLimitFilters: VelocityLimitFilters) = apply {
                    excludeCountries =
                        velocityLimitFilters.excludeCountries.map { it.toMutableList() }
                    excludeMccs = velocityLimitFilters.excludeMccs.map { it.toMutableList() }
                    includeCountries =
                        velocityLimitFilters.includeCountries.map { it.toMutableList() }
                    includeMccs = velocityLimitFilters.includeMccs.map { it.toMutableList() }
                    includePanEntryModes =
                        velocityLimitFilters.includePanEntryModes.map { it.toMutableList() }
                    additionalProperties = velocityLimitFilters.additionalProperties.toMutableMap()
                }

                /**
                 * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation.
                 * Transactions matching any of the provided will be excluded from the calculated
                 * velocity.
                 */
                fun excludeCountries(excludeCountries: List<String>?) =
                    excludeCountries(JsonField.ofNullable(excludeCountries))

                /**
                 * Alias for calling [Builder.excludeCountries] with
                 * `excludeCountries.orElse(null)`.
                 */
                fun excludeCountries(excludeCountries: Optional<List<String>>) =
                    excludeCountries(excludeCountries.getOrNull())

                /**
                 * Sets [Builder.excludeCountries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludeCountries] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun excludeCountries(excludeCountries: JsonField<List<String>>) = apply {
                    this.excludeCountries = excludeCountries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [excludeCountries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludeCountry(excludeCountry: String) = apply {
                    excludeCountries =
                        (excludeCountries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludeCountries", it).add(excludeCountry)
                        }
                }

                /**
                 * Merchant Category Codes to exclude from the velocity calculation. Transactions
                 * matching this MCC will be excluded from the calculated velocity.
                 */
                fun excludeMccs(excludeMccs: List<String>?) =
                    excludeMccs(JsonField.ofNullable(excludeMccs))

                /** Alias for calling [Builder.excludeMccs] with `excludeMccs.orElse(null)`. */
                fun excludeMccs(excludeMccs: Optional<List<String>>) =
                    excludeMccs(excludeMccs.getOrNull())

                /**
                 * Sets [Builder.excludeMccs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludeMccs] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun excludeMccs(excludeMccs: JsonField<List<String>>) = apply {
                    this.excludeMccs = excludeMccs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [excludeMccs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludeMcc(excludeMcc: String) = apply {
                    excludeMccs =
                        (excludeMccs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludeMccs", it).add(excludeMcc)
                        }
                }

                /**
                 * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation.
                 * Transactions not matching any of the provided will not be included in the
                 * calculated velocity.
                 */
                fun includeCountries(includeCountries: List<String>?) =
                    includeCountries(JsonField.ofNullable(includeCountries))

                /**
                 * Alias for calling [Builder.includeCountries] with
                 * `includeCountries.orElse(null)`.
                 */
                fun includeCountries(includeCountries: Optional<List<String>>) =
                    includeCountries(includeCountries.getOrNull())

                /**
                 * Sets [Builder.includeCountries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeCountries] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun includeCountries(includeCountries: JsonField<List<String>>) = apply {
                    this.includeCountries = includeCountries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [includeCountries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
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

                /** Alias for calling [Builder.includeMccs] with `includeMccs.orElse(null)`. */
                fun includeMccs(includeMccs: Optional<List<String>>) =
                    includeMccs(includeMccs.getOrNull())

                /**
                 * Sets [Builder.includeMccs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeMccs] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includeMccs(includeMccs: JsonField<List<String>>) = apply {
                    this.includeMccs = includeMccs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [includeMccs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIncludeMcc(includeMcc: String) = apply {
                    includeMccs =
                        (includeMccs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("includeMccs", it).add(includeMcc)
                        }
                }

                /**
                 * PAN entry modes to include in the velocity calculation. Transactions not matching
                 * any of the provided will not be included in the calculated velocity.
                 */
                fun includePanEntryModes(includePanEntryModes: List<IncludePanEntryMode>?) =
                    includePanEntryModes(JsonField.ofNullable(includePanEntryModes))

                /**
                 * Alias for calling [Builder.includePanEntryModes] with
                 * `includePanEntryModes.orElse(null)`.
                 */
                fun includePanEntryModes(
                    includePanEntryModes: Optional<List<IncludePanEntryMode>>
                ) = includePanEntryModes(includePanEntryModes.getOrNull())

                /**
                 * Sets [Builder.includePanEntryModes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includePanEntryModes] with a well-typed
                 * `List<IncludePanEntryMode>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun includePanEntryModes(
                    includePanEntryModes: JsonField<List<IncludePanEntryMode>>
                ) = apply {
                    this.includePanEntryModes = includePanEntryModes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [IncludePanEntryMode] to [includePanEntryModes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIncludePanEntryMode(includePanEntryMode: IncludePanEntryMode) = apply {
                    includePanEntryModes =
                        (includePanEntryModes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("includePanEntryModes", it).add(includePanEntryMode)
                        }
                }

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
                 * Returns an immutable instance of [VelocityLimitFilters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VelocityLimitFilters =
                    VelocityLimitFilters(
                        (excludeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                        (excludeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                        (includeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                        (includeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                        (includePanEntryModes ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VelocityLimitFilters = apply {
                if (validated) {
                    return@apply
                }

                excludeCountries()
                excludeMccs()
                includeCountries()
                includeMccs()
                includePanEntryModes().ifPresent { it.forEach { it.validate() } }
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
                (excludeCountries.asKnown().getOrNull()?.size ?: 0) +
                    (excludeMccs.asKnown().getOrNull()?.size ?: 0) +
                    (includeCountries.asKnown().getOrNull()?.size ?: 0) +
                    (includeMccs.asKnown().getOrNull()?.size ?: 0) +
                    (includePanEntryModes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0)

            class IncludePanEntryMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AUTO_ENTRY = of("AUTO_ENTRY")

                    @JvmField val BAR_CODE = of("BAR_CODE")

                    @JvmField val CONTACTLESS = of("CONTACTLESS")

                    @JvmField val CREDENTIAL_ON_FILE = of("CREDENTIAL_ON_FILE")

                    @JvmField val ECOMMERCE = of("ECOMMERCE")

                    @JvmField val ERROR_KEYED = of("ERROR_KEYED")

                    @JvmField val ERROR_MAGNETIC_STRIPE = of("ERROR_MAGNETIC_STRIPE")

                    @JvmField val ICC = of("ICC")

                    @JvmField val KEY_ENTERED = of("KEY_ENTERED")

                    @JvmField val MAGNETIC_STRIPE = of("MAGNETIC_STRIPE")

                    @JvmField val MANUAL = of("MANUAL")

                    @JvmField val OCR = of("OCR")

                    @JvmField val SECURE_CARDLESS = of("SECURE_CARDLESS")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = IncludePanEntryMode(JsonField.of(value))
                }

                /** An enum containing [IncludePanEntryMode]'s known values. */
                enum class Known {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    CREDENTIAL_ON_FILE,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNSPECIFIED,
                    UNKNOWN,
                }

                /**
                 * An enum containing [IncludePanEntryMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [IncludePanEntryMode] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    CREDENTIAL_ON_FILE,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNSPECIFIED,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [IncludePanEntryMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTO_ENTRY -> Value.AUTO_ENTRY
                        BAR_CODE -> Value.BAR_CODE
                        CONTACTLESS -> Value.CONTACTLESS
                        CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                        ECOMMERCE -> Value.ECOMMERCE
                        ERROR_KEYED -> Value.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Value.ERROR_MAGNETIC_STRIPE
                        ICC -> Value.ICC
                        KEY_ENTERED -> Value.KEY_ENTERED
                        MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                        MANUAL -> Value.MANUAL
                        OCR -> Value.OCR
                        SECURE_CARDLESS -> Value.SECURE_CARDLESS
                        UNSPECIFIED -> Value.UNSPECIFIED
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTO_ENTRY -> Known.AUTO_ENTRY
                        BAR_CODE -> Known.BAR_CODE
                        CONTACTLESS -> Known.CONTACTLESS
                        CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                        ECOMMERCE -> Known.ECOMMERCE
                        ERROR_KEYED -> Known.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Known.ERROR_MAGNETIC_STRIPE
                        ICC -> Known.ICC
                        KEY_ENTERED -> Known.KEY_ENTERED
                        MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                        MANUAL -> Known.MANUAL
                        OCR -> Known.OCR
                        SECURE_CARDLESS -> Known.SECURE_CARDLESS
                        UNSPECIFIED -> Known.UNSPECIFIED
                        UNKNOWN -> Known.UNKNOWN
                        else ->
                            throw LithicInvalidDataException("Unknown IncludePanEntryMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): IncludePanEntryMode = apply {
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

                    return other is IncludePanEntryMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VelocityLimitFilters &&
                    excludeCountries == other.excludeCountries &&
                    excludeMccs == other.excludeMccs &&
                    includeCountries == other.includeCountries &&
                    includeMccs == other.includeMccs &&
                    includePanEntryModes == other.includePanEntryModes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    excludeCountries,
                    excludeMccs,
                    includeCountries,
                    includeMccs,
                    includePanEntryModes,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VelocityLimitFilters{excludeCountries=$excludeCountries, excludeMccs=$excludeMccs, includeCountries=$includeCountries, includeMccs=$includeMccs, includePanEntryModes=$includePanEntryModes, additionalProperties=$additionalProperties}"
        }

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
