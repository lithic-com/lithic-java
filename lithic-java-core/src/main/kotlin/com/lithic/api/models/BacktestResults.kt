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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BacktestResults
private constructor(
    private val backtestToken: JsonField<String>,
    private val results: JsonField<Results>,
    private val simulationParameters: JsonField<SimulationParameters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backtest_token")
        @ExcludeMissing
        backtestToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<Results> = JsonMissing.of(),
        @JsonProperty("simulation_parameters")
        @ExcludeMissing
        simulationParameters: JsonField<SimulationParameters> = JsonMissing.of(),
    ) : this(backtestToken, results, simulationParameters, mutableMapOf())

    /**
     * Auth Rule Backtest Token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backtestToken(): String = backtestToken.getRequired("backtest_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): Results = results.getRequired("results")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun simulationParameters(): SimulationParameters =
        simulationParameters.getRequired("simulation_parameters")

    /**
     * Returns the raw JSON value of [backtestToken].
     *
     * Unlike [backtestToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backtest_token")
    @ExcludeMissing
    fun _backtestToken(): JsonField<String> = backtestToken

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<Results> = results

    /**
     * Returns the raw JSON value of [simulationParameters].
     *
     * Unlike [simulationParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("simulation_parameters")
    @ExcludeMissing
    fun _simulationParameters(): JsonField<SimulationParameters> = simulationParameters

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
         * Returns a mutable builder for constructing an instance of [BacktestResults].
         *
         * The following fields are required:
         * ```java
         * .backtestToken()
         * .results()
         * .simulationParameters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BacktestResults]. */
    class Builder internal constructor() {

        private var backtestToken: JsonField<String>? = null
        private var results: JsonField<Results>? = null
        private var simulationParameters: JsonField<SimulationParameters>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backtestResults: BacktestResults) = apply {
            backtestToken = backtestResults.backtestToken
            results = backtestResults.results
            simulationParameters = backtestResults.simulationParameters
            additionalProperties = backtestResults.additionalProperties.toMutableMap()
        }

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: String) = backtestToken(JsonField.of(backtestToken))

        /**
         * Sets [Builder.backtestToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backtestToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backtestToken(backtestToken: JsonField<String>) = apply {
            this.backtestToken = backtestToken
        }

        fun results(results: Results) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed [Results] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun results(results: JsonField<Results>) = apply { this.results = results }

        fun simulationParameters(simulationParameters: SimulationParameters) =
            simulationParameters(JsonField.of(simulationParameters))

        /**
         * Sets [Builder.simulationParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simulationParameters] with a well-typed
         * [SimulationParameters] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun simulationParameters(simulationParameters: JsonField<SimulationParameters>) = apply {
            this.simulationParameters = simulationParameters
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [BacktestResults].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backtestToken()
         * .results()
         * .simulationParameters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BacktestResults =
            BacktestResults(
                checkRequired("backtestToken", backtestToken),
                checkRequired("results", results),
                checkRequired("simulationParameters", simulationParameters),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BacktestResults = apply {
        if (validated) {
            return@apply
        }

        backtestToken()
        results().validate()
        simulationParameters().validate()
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
        (if (backtestToken.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.validity() ?: 0) +
            (simulationParameters.asKnown().getOrNull()?.validity() ?: 0)

    class Results
    private constructor(
        private val currentVersion: JsonField<RuleStats>,
        private val draftVersion: JsonField<RuleStats>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_version")
            @ExcludeMissing
            currentVersion: JsonField<RuleStats> = JsonMissing.of(),
            @JsonProperty("draft_version")
            @ExcludeMissing
            draftVersion: JsonField<RuleStats> = JsonMissing.of(),
        ) : this(currentVersion, draftVersion, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentVersion(): Optional<RuleStats> = currentVersion.getOptional("current_version")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun draftVersion(): Optional<RuleStats> = draftVersion.getOptional("draft_version")

        /**
         * Returns the raw JSON value of [currentVersion].
         *
         * Unlike [currentVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_version")
        @ExcludeMissing
        fun _currentVersion(): JsonField<RuleStats> = currentVersion

        /**
         * Returns the raw JSON value of [draftVersion].
         *
         * Unlike [draftVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("draft_version")
        @ExcludeMissing
        fun _draftVersion(): JsonField<RuleStats> = draftVersion

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

            /** Returns a mutable builder for constructing an instance of [Results]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Results]. */
        class Builder internal constructor() {

            private var currentVersion: JsonField<RuleStats> = JsonMissing.of()
            private var draftVersion: JsonField<RuleStats> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(results: Results) = apply {
                currentVersion = results.currentVersion
                draftVersion = results.draftVersion
                additionalProperties = results.additionalProperties.toMutableMap()
            }

            fun currentVersion(currentVersion: RuleStats?) =
                currentVersion(JsonField.ofNullable(currentVersion))

            /** Alias for calling [Builder.currentVersion] with `currentVersion.orElse(null)`. */
            fun currentVersion(currentVersion: Optional<RuleStats>) =
                currentVersion(currentVersion.getOrNull())

            /**
             * Sets [Builder.currentVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentVersion] with a well-typed [RuleStats] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentVersion(currentVersion: JsonField<RuleStats>) = apply {
                this.currentVersion = currentVersion
            }

            fun draftVersion(draftVersion: RuleStats?) =
                draftVersion(JsonField.ofNullable(draftVersion))

            /** Alias for calling [Builder.draftVersion] with `draftVersion.orElse(null)`. */
            fun draftVersion(draftVersion: Optional<RuleStats>) =
                draftVersion(draftVersion.getOrNull())

            /**
             * Sets [Builder.draftVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.draftVersion] with a well-typed [RuleStats] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun draftVersion(draftVersion: JsonField<RuleStats>) = apply {
                this.draftVersion = draftVersion
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Results].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Results =
                Results(currentVersion, draftVersion, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Results = apply {
            if (validated) {
                return@apply
            }

            currentVersion().ifPresent { it.validate() }
            draftVersion().ifPresent { it.validate() }
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
            (currentVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (draftVersion.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Results &&
                currentVersion == other.currentVersion &&
                draftVersion == other.draftVersion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currentVersion, draftVersion, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Results{currentVersion=$currentVersion, draftVersion=$draftVersion, additionalProperties=$additionalProperties}"
    }

    class SimulationParameters
    private constructor(
        private val authRuleToken: JsonField<String>,
        private val end: JsonField<OffsetDateTime>,
        private val start: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth_rule_token")
            @ExcludeMissing
            authRuleToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(authRuleToken, end, start, mutableMapOf())

        /**
         * Auth Rule Token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authRuleToken(): Optional<String> = authRuleToken.getOptional("auth_rule_token")

        /**
         * The end time of the simulation.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun end(): Optional<OffsetDateTime> = end.getOptional("end")

        /**
         * The start time of the simulation.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<OffsetDateTime> = start.getOptional("start")

        /**
         * Returns the raw JSON value of [authRuleToken].
         *
         * Unlike [authRuleToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auth_rule_token")
        @ExcludeMissing
        fun _authRuleToken(): JsonField<String> = authRuleToken

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

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

            /** Returns a mutable builder for constructing an instance of [SimulationParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulationParameters]. */
        class Builder internal constructor() {

            private var authRuleToken: JsonField<String> = JsonMissing.of()
            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationParameters: SimulationParameters) = apply {
                authRuleToken = simulationParameters.authRuleToken
                end = simulationParameters.end
                start = simulationParameters.start
                additionalProperties = simulationParameters.additionalProperties.toMutableMap()
            }

            /** Auth Rule Token */
            fun authRuleToken(authRuleToken: String) = authRuleToken(JsonField.of(authRuleToken))

            /**
             * Sets [Builder.authRuleToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authRuleToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authRuleToken(authRuleToken: JsonField<String>) = apply {
                this.authRuleToken = authRuleToken
            }

            /** The end time of the simulation. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

            /** The start time of the simulation. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [SimulationParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SimulationParameters =
                SimulationParameters(authRuleToken, end, start, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SimulationParameters = apply {
            if (validated) {
                return@apply
            }

            authRuleToken()
            end()
            start()
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
            (if (authRuleToken.asKnown().isPresent) 1 else 0) +
                (if (end.asKnown().isPresent) 1 else 0) +
                (if (start.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationParameters &&
                authRuleToken == other.authRuleToken &&
                end == other.end &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(authRuleToken, end, start, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationParameters{authRuleToken=$authRuleToken, end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BacktestResults &&
            backtestToken == other.backtestToken &&
            results == other.results &&
            simulationParameters == other.simulationParameters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(backtestToken, results, simulationParameters, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BacktestResults{backtestToken=$backtestToken, results=$results, simulationParameters=$simulationParameters, additionalProperties=$additionalProperties}"
}
