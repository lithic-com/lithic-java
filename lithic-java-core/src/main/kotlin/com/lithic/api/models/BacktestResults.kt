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
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = BacktestResults.Builder::class)
@NoAutoDetect
class BacktestResults
private constructor(
    private val backtestToken: JsonField<String>,
    private val simulationParameters: JsonField<SimulationParameters>,
    private val results: JsonField<Results>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Auth Rule Backtest Token */
    fun backtestToken(): String = backtestToken.getRequired("backtest_token")

    fun simulationParameters(): SimulationParameters =
        simulationParameters.getRequired("simulation_parameters")

    fun results(): Results = results.getRequired("results")

    /** Auth Rule Backtest Token */
    @JsonProperty("backtest_token") @ExcludeMissing fun _backtestToken() = backtestToken

    @JsonProperty("simulation_parameters")
    @ExcludeMissing
    fun _simulationParameters() = simulationParameters

    @JsonProperty("results") @ExcludeMissing fun _results() = results

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BacktestResults = apply {
        if (!validated) {
            backtestToken()
            simulationParameters().validate()
            results().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var backtestToken: JsonField<String> = JsonMissing.of()
        private var simulationParameters: JsonField<SimulationParameters> = JsonMissing.of()
        private var results: JsonField<Results> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backtestResults: BacktestResults) = apply {
            this.backtestToken = backtestResults.backtestToken
            this.simulationParameters = backtestResults.simulationParameters
            this.results = backtestResults.results
            additionalProperties(backtestResults.additionalProperties)
        }

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: String) = backtestToken(JsonField.of(backtestToken))

        /** Auth Rule Backtest Token */
        @JsonProperty("backtest_token")
        @ExcludeMissing
        fun backtestToken(backtestToken: JsonField<String>) = apply {
            this.backtestToken = backtestToken
        }

        fun simulationParameters(simulationParameters: SimulationParameters) =
            simulationParameters(JsonField.of(simulationParameters))

        @JsonProperty("simulation_parameters")
        @ExcludeMissing
        fun simulationParameters(simulationParameters: JsonField<SimulationParameters>) = apply {
            this.simulationParameters = simulationParameters
        }

        fun results(results: Results) = results(JsonField.of(results))

        @JsonProperty("results")
        @ExcludeMissing
        fun results(results: JsonField<Results>) = apply { this.results = results }

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

        fun build(): BacktestResults =
            BacktestResults(
                backtestToken,
                simulationParameters,
                results,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Results.Builder::class)
    @NoAutoDetect
    class Results
    private constructor(
        private val currentVersion: JsonField<RuleStats>,
        private val draftVersion: JsonField<RuleStats>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun currentVersion(): Optional<RuleStats> =
            Optional.ofNullable(currentVersion.getNullable("current_version"))

        fun draftVersion(): Optional<RuleStats> =
            Optional.ofNullable(draftVersion.getNullable("draft_version"))

        @JsonProperty("current_version") @ExcludeMissing fun _currentVersion() = currentVersion

        @JsonProperty("draft_version") @ExcludeMissing fun _draftVersion() = draftVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Results = apply {
            if (!validated) {
                currentVersion().map { it.validate() }
                draftVersion().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var currentVersion: JsonField<RuleStats> = JsonMissing.of()
            private var draftVersion: JsonField<RuleStats> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(results: Results) = apply {
                this.currentVersion = results.currentVersion
                this.draftVersion = results.draftVersion
                additionalProperties(results.additionalProperties)
            }

            fun currentVersion(currentVersion: RuleStats) =
                currentVersion(JsonField.of(currentVersion))

            @JsonProperty("current_version")
            @ExcludeMissing
            fun currentVersion(currentVersion: JsonField<RuleStats>) = apply {
                this.currentVersion = currentVersion
            }

            fun draftVersion(draftVersion: RuleStats) = draftVersion(JsonField.of(draftVersion))

            @JsonProperty("draft_version")
            @ExcludeMissing
            fun draftVersion(draftVersion: JsonField<RuleStats>) = apply {
                this.draftVersion = draftVersion
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

            fun build(): Results =
                Results(
                    currentVersion,
                    draftVersion,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = RuleStats.Builder::class)
        @NoAutoDetect
        class RuleStats
        private constructor(
            private val version: JsonField<Long>,
            private val approved: JsonField<Long>,
            private val declined: JsonField<Long>,
            private val examples: JsonField<List<Example>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

            /**
             * The total number of historical transactions approved by this rule during the backtest
             * period, or the number of transactions that would have been approved if the rule was
             * evaluated in shadow mode.
             */
            fun approved(): Optional<Long> = Optional.ofNullable(approved.getNullable("approved"))

            /**
             * The total number of historical transactions declined by this rule during the backtest
             * period, or the number of transactions that would have been declined if the rule was
             * evaluated in shadow mode.
             */
            fun declined(): Optional<Long> = Optional.ofNullable(declined.getNullable("declined"))

            /** Example authorization request events that would have been approved or declined. */
            fun examples(): Optional<List<Example>> =
                Optional.ofNullable(examples.getNullable("examples"))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            /**
             * The total number of historical transactions approved by this rule during the backtest
             * period, or the number of transactions that would have been approved if the rule was
             * evaluated in shadow mode.
             */
            @JsonProperty("approved") @ExcludeMissing fun _approved() = approved

            /**
             * The total number of historical transactions declined by this rule during the backtest
             * period, or the number of transactions that would have been declined if the rule was
             * evaluated in shadow mode.
             */
            @JsonProperty("declined") @ExcludeMissing fun _declined() = declined

            /** Example authorization request events that would have been approved or declined. */
            @JsonProperty("examples") @ExcludeMissing fun _examples() = examples

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RuleStats = apply {
                if (!validated) {
                    version()
                    approved()
                    declined()
                    examples().map { it.forEach { it.validate() } }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var version: JsonField<Long> = JsonMissing.of()
                private var approved: JsonField<Long> = JsonMissing.of()
                private var declined: JsonField<Long> = JsonMissing.of()
                private var examples: JsonField<List<Example>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleStats: RuleStats) = apply {
                    this.version = ruleStats.version
                    this.approved = ruleStats.approved
                    this.declined = ruleStats.declined
                    this.examples = ruleStats.examples
                    additionalProperties(ruleStats.additionalProperties)
                }

                /**
                 * The version of the rule, this is incremented whenever the rule's parameters
                 * change.
                 */
                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * The version of the rule, this is incremented whenever the rule's parameters
                 * change.
                 */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<Long>) = apply { this.version = version }

                /**
                 * The total number of historical transactions approved by this rule during the
                 * backtest period, or the number of transactions that would have been approved if
                 * the rule was evaluated in shadow mode.
                 */
                fun approved(approved: Long) = approved(JsonField.of(approved))

                /**
                 * The total number of historical transactions approved by this rule during the
                 * backtest period, or the number of transactions that would have been approved if
                 * the rule was evaluated in shadow mode.
                 */
                @JsonProperty("approved")
                @ExcludeMissing
                fun approved(approved: JsonField<Long>) = apply { this.approved = approved }

                /**
                 * The total number of historical transactions declined by this rule during the
                 * backtest period, or the number of transactions that would have been declined if
                 * the rule was evaluated in shadow mode.
                 */
                fun declined(declined: Long) = declined(JsonField.of(declined))

                /**
                 * The total number of historical transactions declined by this rule during the
                 * backtest period, or the number of transactions that would have been declined if
                 * the rule was evaluated in shadow mode.
                 */
                @JsonProperty("declined")
                @ExcludeMissing
                fun declined(declined: JsonField<Long>) = apply { this.declined = declined }

                /**
                 * Example authorization request events that would have been approved or declined.
                 */
                fun examples(examples: List<Example>) = examples(JsonField.of(examples))

                /**
                 * Example authorization request events that would have been approved or declined.
                 */
                @JsonProperty("examples")
                @ExcludeMissing
                fun examples(examples: JsonField<List<Example>>) = apply {
                    this.examples = examples
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RuleStats =
                    RuleStats(
                        version,
                        approved,
                        declined,
                        examples.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Example.Builder::class)
            @NoAutoDetect
            class Example
            private constructor(
                private val eventToken: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val approved: JsonField<Boolean>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The authorization request event token. */
                fun eventToken(): Optional<String> =
                    Optional.ofNullable(eventToken.getNullable("event_token"))

                /** The timestamp of the authorization request event. */
                fun timestamp(): Optional<OffsetDateTime> =
                    Optional.ofNullable(timestamp.getNullable("timestamp"))

                /** Whether the rule would have approved the authorization request. */
                fun approved(): Optional<Boolean> =
                    Optional.ofNullable(approved.getNullable("approved"))

                /** The authorization request event token. */
                @JsonProperty("event_token") @ExcludeMissing fun _eventToken() = eventToken

                /** The timestamp of the authorization request event. */
                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                /** Whether the rule would have approved the authorization request. */
                @JsonProperty("approved") @ExcludeMissing fun _approved() = approved

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Example = apply {
                    if (!validated) {
                        eventToken()
                        timestamp()
                        approved()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var eventToken: JsonField<String> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var approved: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        this.eventToken = example.eventToken
                        this.timestamp = example.timestamp
                        this.approved = example.approved
                        additionalProperties(example.additionalProperties)
                    }

                    /** The authorization request event token. */
                    fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

                    /** The authorization request event token. */
                    @JsonProperty("event_token")
                    @ExcludeMissing
                    fun eventToken(eventToken: JsonField<String>) = apply {
                        this.eventToken = eventToken
                    }

                    /** The timestamp of the authorization request event. */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /** The timestamp of the authorization request event. */
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /** Whether the rule would have approved the authorization request. */
                    fun approved(approved: Boolean) = approved(JsonField.of(approved))

                    /** Whether the rule would have approved the authorization request. */
                    @JsonProperty("approved")
                    @ExcludeMissing
                    fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Example =
                        Example(
                            eventToken,
                            timestamp,
                            approved,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Example && eventToken == other.eventToken && timestamp == other.timestamp && approved == other.approved && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(eventToken, timestamp, approved, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{eventToken=$eventToken, timestamp=$timestamp, approved=$approved, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RuleStats && version == other.version && approved == other.approved && declined == other.declined && examples == other.examples && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(version, approved, declined, examples, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleStats{version=$version, approved=$approved, declined=$declined, examples=$examples, additionalProperties=$additionalProperties}"
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

    @JsonDeserialize(builder = SimulationParameters.Builder::class)
    @NoAutoDetect
    class SimulationParameters
    private constructor(
        private val authRuleToken: JsonField<String>,
        private val start: JsonField<OffsetDateTime>,
        private val end: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Auth Rule Token */
        fun authRuleToken(): Optional<String> =
            Optional.ofNullable(authRuleToken.getNullable("auth_rule_token"))

        /** The start time of the simulation. */
        fun start(): Optional<OffsetDateTime> = Optional.ofNullable(start.getNullable("start"))

        /** The end time of the simulation. */
        fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end.getNullable("end"))

        /** Auth Rule Token */
        @JsonProperty("auth_rule_token") @ExcludeMissing fun _authRuleToken() = authRuleToken

        /** The start time of the simulation. */
        @JsonProperty("start") @ExcludeMissing fun _start() = start

        /** The end time of the simulation. */
        @JsonProperty("end") @ExcludeMissing fun _end() = end

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): SimulationParameters = apply {
            if (!validated) {
                authRuleToken()
                start()
                end()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var authRuleToken: JsonField<String> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationParameters: SimulationParameters) = apply {
                this.authRuleToken = simulationParameters.authRuleToken
                this.start = simulationParameters.start
                this.end = simulationParameters.end
                additionalProperties(simulationParameters.additionalProperties)
            }

            /** Auth Rule Token */
            fun authRuleToken(authRuleToken: String) = authRuleToken(JsonField.of(authRuleToken))

            /** Auth Rule Token */
            @JsonProperty("auth_rule_token")
            @ExcludeMissing
            fun authRuleToken(authRuleToken: JsonField<String>) = apply {
                this.authRuleToken = authRuleToken
            }

            /** The start time of the simulation. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /** The start time of the simulation. */
            @JsonProperty("start")
            @ExcludeMissing
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

            /** The end time of the simulation. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /** The end time of the simulation. */
            @JsonProperty("end")
            @ExcludeMissing
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

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

            fun build(): SimulationParameters =
                SimulationParameters(
                    authRuleToken,
                    start,
                    end,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationParameters && authRuleToken == other.authRuleToken && start == other.start && end == other.end && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authRuleToken, start, end, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationParameters{authRuleToken=$authRuleToken, start=$start, end=$end, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BacktestResults && backtestToken == other.backtestToken && simulationParameters == other.simulationParameters && results == other.results && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(backtestToken, simulationParameters, results, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BacktestResults{backtestToken=$backtestToken, simulationParameters=$simulationParameters, results=$results, additionalProperties=$additionalProperties}"
}
