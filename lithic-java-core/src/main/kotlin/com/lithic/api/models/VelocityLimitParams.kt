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
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VelocityLimitParams
private constructor(
    private val filters: JsonField<Filters>,
    private val period: JsonField<Period>,
    private val scope: JsonField<Scope>,
    private val limitAmount: JsonField<Long>,
    private val limitCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters") @ExcludeMissing filters: JsonField<Filters> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        @JsonProperty("limit_amount")
        @ExcludeMissing
        limitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("limit_count") @ExcludeMissing limitCount: JsonField<Long> = JsonMissing.of(),
    ) : this(filters, period, scope, limitAmount, limitCount, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): Filters = filters.getRequired("filters")

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): Period = period.getRequired("period")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): Scope = scope.getRequired("scope")

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
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
         * .filters()
         * .period()
         * .scope()
         * ```
         */
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

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [Filters] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun period(period: Period) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Period] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Period>) = apply { this.period = period }

        /** Alias for calling [period] with `Period.ofTrailingWindow(trailingWindow)`. */
        fun period(trailingWindow: Long) = period(Period.ofTrailingWindow(trailingWindow))

        /**
         * Alias for calling [period] with
         * `Period.ofVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow)`.
         */
        fun period(velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow) =
            period(Period.ofVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow))

        fun scope(scope: Scope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
         * .filters()
         * .period()
         * .scope()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VelocityLimitParams =
            VelocityLimitParams(
                checkRequired("filters", filters),
                checkRequired("period", period),
                checkRequired("scope", scope),
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

        filters().validate()
        period().validate()
        scope().validate()
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
        (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0) +
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limitAmount.asKnown().isPresent) 1 else 0) +
            (if (limitCount.asKnown().isPresent) 1 else 0)

    class Filters
    private constructor(
        private val excludeCountries: JsonField<List<String>>,
        private val excludeMccs: JsonField<List<String>>,
        private val includeCountries: JsonField<List<String>>,
        private val includeMccs: JsonField<List<String>>,
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
        ) : this(excludeCountries, excludeMccs, includeCountries, includeMccs, mutableMapOf())

        /**
         * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation. Transactions
         * matching any of the provided will be excluded from the calculated velocity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludeCountries(): Optional<List<String>> =
            excludeCountries.getOptional("exclude_countries")

        /**
         * Merchant Category Codes to exclude from the velocity calculation. Transactions matching
         * this MCC will be excluded from the calculated velocity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludeMccs(): Optional<List<String>> = excludeMccs.getOptional("exclude_mccs")

        /**
         * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
         * matching any of the provided will not be included in the calculated velocity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeCountries(): Optional<List<String>> =
            includeCountries.getOptional("include_countries")

        /**
         * Merchant Category Codes to include in the velocity calculation. Transactions not matching
         * this MCC will not be included in the calculated velocity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeMccs(): Optional<List<String>> = includeMccs.getOptional("include_mccs")

        /**
         * Returns the raw JSON value of [excludeCountries].
         *
         * Unlike [excludeCountries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_countries")
        @ExcludeMissing
        fun _excludeCountries(): JsonField<List<String>> = excludeCountries

        /**
         * Returns the raw JSON value of [excludeMccs].
         *
         * Unlike [excludeMccs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exclude_mccs")
        @ExcludeMissing
        fun _excludeMccs(): JsonField<List<String>> = excludeMccs

        /**
         * Returns the raw JSON value of [includeCountries].
         *
         * Unlike [includeCountries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_countries")
        @ExcludeMissing
        fun _includeCountries(): JsonField<List<String>> = includeCountries

        /**
         * Returns the raw JSON value of [includeMccs].
         *
         * Unlike [includeMccs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("include_mccs")
        @ExcludeMissing
        fun _includeMccs(): JsonField<List<String>> = includeMccs

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

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var excludeCountries: JsonField<MutableList<String>>? = null
            private var excludeMccs: JsonField<MutableList<String>>? = null
            private var includeCountries: JsonField<MutableList<String>>? = null
            private var includeMccs: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                excludeCountries = filters.excludeCountries.map { it.toMutableList() }
                excludeMccs = filters.excludeMccs.map { it.toMutableList() }
                includeCountries = filters.includeCountries.map { it.toMutableList() }
                includeMccs = filters.includeMccs.map { it.toMutableList() }
                additionalProperties = filters.additionalProperties.toMutableMap()
            }

            /**
             * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation.
             * Transactions matching any of the provided will be excluded from the calculated
             * velocity.
             */
            fun excludeCountries(excludeCountries: List<String>?) =
                excludeCountries(JsonField.ofNullable(excludeCountries))

            /**
             * Alias for calling [Builder.excludeCountries] with `excludeCountries.orElse(null)`.
             */
            fun excludeCountries(excludeCountries: Optional<List<String>>) =
                excludeCountries(excludeCountries.getOrNull())

            /**
             * Sets [Builder.excludeCountries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeCountries] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.excludeMccs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions
             * not matching any of the provided will not be included in the calculated velocity.
             */
            fun includeCountries(includeCountries: List<String>?) =
                includeCountries(JsonField.ofNullable(includeCountries))

            /**
             * Alias for calling [Builder.includeCountries] with `includeCountries.orElse(null)`.
             */
            fun includeCountries(includeCountries: Optional<List<String>>) =
                includeCountries(includeCountries.getOrNull())

            /**
             * Sets [Builder.includeCountries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeCountries] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.includeMccs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters =
                Filters(
                    (excludeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                    (excludeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Filters = apply {
            if (validated) {
                return@apply
            }

            excludeCountries()
            excludeMccs()
            includeCountries()
            includeMccs()
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
                (includeMccs.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Filters && excludeCountries == other.excludeCountries && excludeMccs == other.excludeMccs && includeCountries == other.includeCountries && includeMccs == other.includeMccs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(excludeCountries, excludeMccs, includeCountries, includeMccs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{excludeCountries=$excludeCountries, excludeMccs=$excludeMccs, includeCountries=$includeCountries, includeMccs=$includeMccs, additionalProperties=$additionalProperties}"
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
         * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern
         *   Time.
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
         * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern
         *   Time.
         */
        fun asVelocityLimitParamsPeriodWindow(): VelocityLimitParamsPeriodWindow =
            velocityLimitParamsPeriodWindow.getOrThrow("velocityLimitParamsPeriodWindow")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                trailingWindow != null -> visitor.visitTrailingWindow(trailingWindow)
                velocityLimitParamsPeriodWindow != null ->
                    visitor.visitVelocityLimitParamsPeriodWindow(velocityLimitParamsPeriodWindow)
                else -> visitor.unknown(_json)
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
                    ) {
                        velocityLimitParamsPeriodWindow.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitTrailingWindow(trailingWindow: Long) = 1

                    override fun visitVelocityLimitParamsPeriodWindow(
                        velocityLimitParamsPeriodWindow: VelocityLimitParamsPeriodWindow
                    ) = velocityLimitParamsPeriodWindow.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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
             * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern
             *   Time.
             * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the
             *   month in Eastern Time.
             * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in
             *   Eastern Time.
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
             * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern
             *   Time.
             * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the
             *   month in Eastern Time.
             * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in
             *   Eastern Time.
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<VelocityLimitParamsPeriodWindow>())
                                ?.let {
                                    Period(velocityLimitParamsPeriodWindow = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                Period(trailingWindow = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Period(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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

        private var validated: Boolean = false

        fun validate(): Scope = apply {
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
