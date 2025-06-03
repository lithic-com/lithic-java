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

        class RuleStats
        private constructor(
            private val approved: JsonField<Long>,
            private val challenged: JsonField<Long>,
            private val declined: JsonField<Long>,
            private val examples: JsonField<List<Example>>,
            private val version: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approved")
                @ExcludeMissing
                approved: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("challenged")
                @ExcludeMissing
                challenged: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("declined")
                @ExcludeMissing
                declined: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("examples")
                @ExcludeMissing
                examples: JsonField<List<Example>> = JsonMissing.of(),
                @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            ) : this(approved, challenged, declined, examples, version, mutableMapOf())

            /**
             * The total number of historical transactions approved by this rule during the relevant
             * period, or the number of transactions that would have been approved if the rule was
             * evaluated in shadow mode.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun approved(): Optional<Long> = approved.getOptional("approved")

            /**
             * The total number of historical transactions challenged by this rule during the
             * relevant period, or the number of transactions that would have been challenged if the
             * rule was evaluated in shadow mode. Currently applicable only for 3DS Auth Rules.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun challenged(): Optional<Long> = challenged.getOptional("challenged")

            /**
             * The total number of historical transactions declined by this rule during the relevant
             * period, or the number of transactions that would have been declined if the rule was
             * evaluated in shadow mode.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun declined(): Optional<Long> = declined.getOptional("declined")

            /**
             * Example events and their outcomes.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun examples(): Optional<List<Example>> = examples.getOptional("examples")

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun version(): Optional<Long> = version.getOptional("version")

            /**
             * Returns the raw JSON value of [approved].
             *
             * Unlike [approved], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Long> = approved

            /**
             * Returns the raw JSON value of [challenged].
             *
             * Unlike [challenged], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("challenged")
            @ExcludeMissing
            fun _challenged(): JsonField<Long> = challenged

            /**
             * Returns the raw JSON value of [declined].
             *
             * Unlike [declined], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("declined") @ExcludeMissing fun _declined(): JsonField<Long> = declined

            /**
             * Returns the raw JSON value of [examples].
             *
             * Unlike [examples], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("examples")
            @ExcludeMissing
            fun _examples(): JsonField<List<Example>> = examples

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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

                /** Returns a mutable builder for constructing an instance of [RuleStats]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuleStats]. */
            class Builder internal constructor() {

                private var approved: JsonField<Long> = JsonMissing.of()
                private var challenged: JsonField<Long> = JsonMissing.of()
                private var declined: JsonField<Long> = JsonMissing.of()
                private var examples: JsonField<MutableList<Example>>? = null
                private var version: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleStats: RuleStats) = apply {
                    approved = ruleStats.approved
                    challenged = ruleStats.challenged
                    declined = ruleStats.declined
                    examples = ruleStats.examples.map { it.toMutableList() }
                    version = ruleStats.version
                    additionalProperties = ruleStats.additionalProperties.toMutableMap()
                }

                /**
                 * The total number of historical transactions approved by this rule during the
                 * relevant period, or the number of transactions that would have been approved if
                 * the rule was evaluated in shadow mode.
                 */
                fun approved(approved: Long) = approved(JsonField.of(approved))

                /**
                 * Sets [Builder.approved] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approved] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun approved(approved: JsonField<Long>) = apply { this.approved = approved }

                /**
                 * The total number of historical transactions challenged by this rule during the
                 * relevant period, or the number of transactions that would have been challenged if
                 * the rule was evaluated in shadow mode. Currently applicable only for 3DS Auth
                 * Rules.
                 */
                fun challenged(challenged: Long) = challenged(JsonField.of(challenged))

                /**
                 * Sets [Builder.challenged] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.challenged] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun challenged(challenged: JsonField<Long>) = apply { this.challenged = challenged }

                /**
                 * The total number of historical transactions declined by this rule during the
                 * relevant period, or the number of transactions that would have been declined if
                 * the rule was evaluated in shadow mode.
                 */
                fun declined(declined: Long) = declined(JsonField.of(declined))

                /**
                 * Sets [Builder.declined] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.declined] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun declined(declined: JsonField<Long>) = apply { this.declined = declined }

                /** Example events and their outcomes. */
                fun examples(examples: List<Example>) = examples(JsonField.of(examples))

                /**
                 * Sets [Builder.examples] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.examples] with a well-typed `List<Example>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun examples(examples: JsonField<List<Example>>) = apply {
                    this.examples = examples.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Example] to [examples].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExample(example: Example) = apply {
                    examples =
                        (examples ?: JsonField.of(mutableListOf())).also {
                            checkKnown("examples", it).add(example)
                        }
                }

                /**
                 * The version of the rule, this is incremented whenever the rule's parameters
                 * change.
                 */
                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun version(version: JsonField<Long>) = apply { this.version = version }

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
                 * Returns an immutable instance of [RuleStats].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RuleStats =
                    RuleStats(
                        approved,
                        challenged,
                        declined,
                        (examples ?: JsonMissing.of()).map { it.toImmutable() },
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RuleStats = apply {
                if (validated) {
                    return@apply
                }

                approved()
                challenged()
                declined()
                examples().ifPresent { it.forEach { it.validate() } }
                version()
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
                (if (approved.asKnown().isPresent) 1 else 0) +
                    (if (challenged.asKnown().isPresent) 1 else 0) +
                    (if (declined.asKnown().isPresent) 1 else 0) +
                    (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

            class Example
            private constructor(
                private val approved: JsonField<Boolean>,
                private val decision: JsonField<Decision>,
                private val eventToken: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("approved")
                    @ExcludeMissing
                    approved: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("decision")
                    @ExcludeMissing
                    decision: JsonField<Decision> = JsonMissing.of(),
                    @JsonProperty("event_token")
                    @ExcludeMissing
                    eventToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(approved, decision, eventToken, timestamp, mutableMapOf())

                /**
                 * Whether the rule would have approved the request.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun approved(): Optional<Boolean> = approved.getOptional("approved")

                /**
                 * The decision made by the rule for this event.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun decision(): Optional<Decision> = decision.getOptional("decision")

                /**
                 * The event token.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun eventToken(): Optional<String> = eventToken.getOptional("event_token")

                /**
                 * The timestamp of the event.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

                /**
                 * Returns the raw JSON value of [approved].
                 *
                 * Unlike [approved], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("approved")
                @ExcludeMissing
                fun _approved(): JsonField<Boolean> = approved

                /**
                 * Returns the raw JSON value of [decision].
                 *
                 * Unlike [decision], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("decision")
                @ExcludeMissing
                fun _decision(): JsonField<Decision> = decision

                /**
                 * Returns the raw JSON value of [eventToken].
                 *
                 * Unlike [eventToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("event_token")
                @ExcludeMissing
                fun _eventToken(): JsonField<String> = eventToken

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

                    /** Returns a mutable builder for constructing an instance of [Example]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Example]. */
                class Builder internal constructor() {

                    private var approved: JsonField<Boolean> = JsonMissing.of()
                    private var decision: JsonField<Decision> = JsonMissing.of()
                    private var eventToken: JsonField<String> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        approved = example.approved
                        decision = example.decision
                        eventToken = example.eventToken
                        timestamp = example.timestamp
                        additionalProperties = example.additionalProperties.toMutableMap()
                    }

                    /** Whether the rule would have approved the request. */
                    fun approved(approved: Boolean) = approved(JsonField.of(approved))

                    /**
                     * Sets [Builder.approved] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.approved] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

                    /** The decision made by the rule for this event. */
                    fun decision(decision: Decision) = decision(JsonField.of(decision))

                    /**
                     * Sets [Builder.decision] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.decision] with a well-typed [Decision] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

                    /** The event token. */
                    fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

                    /**
                     * Sets [Builder.eventToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventToken] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun eventToken(eventToken: JsonField<String>) = apply {
                        this.eventToken = eventToken
                    }

                    /** The timestamp of the event. */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
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
                     * Returns an immutable instance of [Example].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Example =
                        Example(
                            approved,
                            decision,
                            eventToken,
                            timestamp,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Example = apply {
                    if (validated) {
                        return@apply
                    }

                    approved()
                    decision().ifPresent { it.validate() }
                    eventToken()
                    timestamp()
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
                    (if (approved.asKnown().isPresent) 1 else 0) +
                        (decision.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (eventToken.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0)

                /** The decision made by the rule for this event. */
                class Decision
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val APPROVED = of("APPROVED")

                        @JvmField val DECLINED = of("DECLINED")

                        @JvmField val CHALLENGED = of("CHALLENGED")

                        @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
                    }

                    /** An enum containing [Decision]'s known values. */
                    enum class Known {
                        APPROVED,
                        DECLINED,
                        CHALLENGED,
                    }

                    /**
                     * An enum containing [Decision]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Decision] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        APPROVED,
                        DECLINED,
                        CHALLENGED,
                        /**
                         * An enum member indicating that [Decision] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            APPROVED -> Value.APPROVED
                            DECLINED -> Value.DECLINED
                            CHALLENGED -> Value.CHALLENGED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            APPROVED -> Known.APPROVED
                            DECLINED -> Known.DECLINED
                            CHALLENGED -> Known.CHALLENGED
                            else -> throw LithicInvalidDataException("Unknown Decision: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Decision = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Example && approved == other.approved && decision == other.decision && eventToken == other.eventToken && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(approved, decision, eventToken, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{approved=$approved, decision=$decision, eventToken=$eventToken, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RuleStats && approved == other.approved && challenged == other.challenged && declined == other.declined && examples == other.examples && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(approved, challenged, declined, examples, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleStats{approved=$approved, challenged=$challenged, declined=$declined, examples=$examples, version=$version, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Results && currentVersion == other.currentVersion && draftVersion == other.draftVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currentVersion, draftVersion, additionalProperties) }
        /* spotless:on */

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

            return /* spotless:off */ other is SimulationParameters && authRuleToken == other.authRuleToken && end == other.end && start == other.start && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authRuleToken, end, start, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationParameters{authRuleToken=$authRuleToken, end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BacktestResults && backtestToken == other.backtestToken && results == other.results && simulationParameters == other.simulationParameters && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(backtestToken, results, simulationParameters, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BacktestResults{backtestToken=$backtestToken, results=$results, simulationParameters=$simulationParameters, additionalProperties=$additionalProperties}"
}
