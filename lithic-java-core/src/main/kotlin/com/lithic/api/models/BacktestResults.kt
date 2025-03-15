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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class BacktestResults
@JsonCreator
private constructor(
    @JsonProperty("backtest_token")
    @ExcludeMissing
    private val backtestToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("results")
    @ExcludeMissing
    private val results: JsonField<Results> = JsonMissing.of(),
    @JsonProperty("simulation_parameters")
    @ExcludeMissing
    private val simulationParameters: JsonField<SimulationParameters> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun build(): BacktestResults =
            BacktestResults(
                checkRequired("backtestToken", backtestToken),
                checkRequired("results", results),
                checkRequired("simulationParameters", simulationParameters),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Results
    @JsonCreator
    private constructor(
        @JsonProperty("current_version")
        @ExcludeMissing
        private val currentVersion: JsonField<RuleStats> = JsonMissing.of(),
        @JsonProperty("draft_version")
        @ExcludeMissing
        private val draftVersion: JsonField<RuleStats> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentVersion(): Optional<RuleStats> =
            Optional.ofNullable(currentVersion.getNullable("current_version"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun draftVersion(): Optional<RuleStats> =
            Optional.ofNullable(draftVersion.getNullable("draft_version"))

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Results = apply {
            if (validated) {
                return@apply
            }

            currentVersion().ifPresent { it.validate() }
            draftVersion().ifPresent { it.validate() }
            validated = true
        }

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

            fun build(): Results =
                Results(currentVersion, draftVersion, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class RuleStats
        @JsonCreator
        private constructor(
            @JsonProperty("approved")
            @ExcludeMissing
            private val approved: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("declined")
            @ExcludeMissing
            private val declined: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("examples")
            @ExcludeMissing
            private val examples: JsonField<List<Example>> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The total number of historical transactions approved by this rule during the backtest
             * period, or the number of transactions that would have been approved if the rule was
             * evaluated in shadow mode.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun approved(): Optional<Long> = Optional.ofNullable(approved.getNullable("approved"))

            /**
             * The total number of historical transactions declined by this rule during the backtest
             * period, or the number of transactions that would have been declined if the rule was
             * evaluated in shadow mode.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun declined(): Optional<Long> = Optional.ofNullable(declined.getNullable("declined"))

            /**
             * Example authorization request events that would have been approved or declined.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun examples(): Optional<List<Example>> =
                Optional.ofNullable(examples.getNullable("examples"))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [approved].
             *
             * Unlike [approved], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Long> = approved

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

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RuleStats = apply {
                if (validated) {
                    return@apply
                }

                approved()
                declined()
                examples().ifPresent { it.forEach { it.validate() } }
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [RuleStats]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuleStats]. */
            class Builder internal constructor() {

                private var approved: JsonField<Long> = JsonMissing.of()
                private var declined: JsonField<Long> = JsonMissing.of()
                private var examples: JsonField<MutableList<Example>>? = null
                private var version: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleStats: RuleStats) = apply {
                    approved = ruleStats.approved
                    declined = ruleStats.declined
                    examples = ruleStats.examples.map { it.toMutableList() }
                    version = ruleStats.version
                    additionalProperties = ruleStats.additionalProperties.toMutableMap()
                }

                /**
                 * The total number of historical transactions approved by this rule during the
                 * backtest period, or the number of transactions that would have been approved if
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
                 * The total number of historical transactions declined by this rule during the
                 * backtest period, or the number of transactions that would have been declined if
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

                /**
                 * Example authorization request events that would have been approved or declined.
                 */
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

                fun build(): RuleStats =
                    RuleStats(
                        approved,
                        declined,
                        (examples ?: JsonMissing.of()).map { it.toImmutable() },
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Example
            @JsonCreator
            private constructor(
                @JsonProperty("approved")
                @ExcludeMissing
                private val approved: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("event_token")
                @ExcludeMissing
                private val eventToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Whether the rule would have approved the authorization request.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun approved(): Optional<Boolean> =
                    Optional.ofNullable(approved.getNullable("approved"))

                /**
                 * The authorization request event token.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun eventToken(): Optional<String> =
                    Optional.ofNullable(eventToken.getNullable("event_token"))

                /**
                 * The timestamp of the authorization request event.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<OffsetDateTime> =
                    Optional.ofNullable(timestamp.getNullable("timestamp"))

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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Example = apply {
                    if (validated) {
                        return@apply
                    }

                    approved()
                    eventToken()
                    timestamp()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Example]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Example]. */
                class Builder internal constructor() {

                    private var approved: JsonField<Boolean> = JsonMissing.of()
                    private var eventToken: JsonField<String> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        approved = example.approved
                        eventToken = example.eventToken
                        timestamp = example.timestamp
                        additionalProperties = example.additionalProperties.toMutableMap()
                    }

                    /** Whether the rule would have approved the authorization request. */
                    fun approved(approved: Boolean) = approved(JsonField.of(approved))

                    /**
                     * Sets [Builder.approved] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.approved] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

                    /** The authorization request event token. */
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

                    /** The timestamp of the authorization request event. */
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

                    fun build(): Example =
                        Example(approved, eventToken, timestamp, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Example && approved == other.approved && eventToken == other.eventToken && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(approved, eventToken, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{approved=$approved, eventToken=$eventToken, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RuleStats && approved == other.approved && declined == other.declined && examples == other.examples && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(approved, declined, examples, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleStats{approved=$approved, declined=$declined, examples=$examples, version=$version, additionalProperties=$additionalProperties}"
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

    @NoAutoDetect
    class SimulationParameters
    @JsonCreator
    private constructor(
        @JsonProperty("auth_rule_token")
        @ExcludeMissing
        private val authRuleToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end")
        @ExcludeMissing
        private val end: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start")
        @ExcludeMissing
        private val start: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Auth Rule Token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authRuleToken(): Optional<String> =
            Optional.ofNullable(authRuleToken.getNullable("auth_rule_token"))

        /**
         * The end time of the simulation.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end.getNullable("end"))

        /**
         * The start time of the simulation.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<OffsetDateTime> = Optional.ofNullable(start.getNullable("start"))

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun build(): SimulationParameters =
                SimulationParameters(authRuleToken, end, start, additionalProperties.toImmutable())
        }

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
