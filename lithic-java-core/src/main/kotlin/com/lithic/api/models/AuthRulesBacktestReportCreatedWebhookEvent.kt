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
import kotlin.jvm.optionals.getOrNull

class AuthRulesBacktestReportCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backtestToken: JsonField<String>,
    private val results: JsonField<BacktestResults.Results>,
    private val simulationParameters: JsonField<BacktestResults.SimulationParameters>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backtest_token")
        @ExcludeMissing
        backtestToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<BacktestResults.Results> = JsonMissing.of(),
        @JsonProperty("simulation_parameters")
        @ExcludeMissing
        simulationParameters: JsonField<BacktestResults.SimulationParameters> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(backtestToken, results, simulationParameters, eventType, mutableMapOf())

    fun toBacktestResults(): BacktestResults =
        BacktestResults.builder()
            .backtestToken(backtestToken)
            .results(results)
            .simulationParameters(simulationParameters)
            .build()

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
    fun results(): BacktestResults.Results = results.getRequired("results")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun simulationParameters(): BacktestResults.SimulationParameters =
        simulationParameters.getRequired("simulation_parameters")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

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
    @JsonProperty("results")
    @ExcludeMissing
    fun _results(): JsonField<BacktestResults.Results> = results

    /**
     * Returns the raw JSON value of [simulationParameters].
     *
     * Unlike [simulationParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("simulation_parameters")
    @ExcludeMissing
    fun _simulationParameters(): JsonField<BacktestResults.SimulationParameters> =
        simulationParameters

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * Returns a mutable builder for constructing an instance of
         * [AuthRulesBacktestReportCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .backtestToken()
         * .results()
         * .simulationParameters()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRulesBacktestReportCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var backtestToken: JsonField<String>? = null
        private var results: JsonField<BacktestResults.Results>? = null
        private var simulationParameters: JsonField<BacktestResults.SimulationParameters>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            authRulesBacktestReportCreatedWebhookEvent: AuthRulesBacktestReportCreatedWebhookEvent
        ) = apply {
            backtestToken = authRulesBacktestReportCreatedWebhookEvent.backtestToken
            results = authRulesBacktestReportCreatedWebhookEvent.results
            simulationParameters = authRulesBacktestReportCreatedWebhookEvent.simulationParameters
            eventType = authRulesBacktestReportCreatedWebhookEvent.eventType
            additionalProperties =
                authRulesBacktestReportCreatedWebhookEvent.additionalProperties.toMutableMap()
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

        fun results(results: BacktestResults.Results) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed [BacktestResults.Results]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun results(results: JsonField<BacktestResults.Results>) = apply { this.results = results }

        fun simulationParameters(simulationParameters: BacktestResults.SimulationParameters) =
            simulationParameters(JsonField.of(simulationParameters))

        /**
         * Sets [Builder.simulationParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simulationParameters] with a well-typed
         * [BacktestResults.SimulationParameters] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun simulationParameters(
            simulationParameters: JsonField<BacktestResults.SimulationParameters>
        ) = apply { this.simulationParameters = simulationParameters }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [AuthRulesBacktestReportCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backtestToken()
         * .results()
         * .simulationParameters()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRulesBacktestReportCreatedWebhookEvent =
            AuthRulesBacktestReportCreatedWebhookEvent(
                checkRequired("backtestToken", backtestToken),
                checkRequired("results", results),
                checkRequired("simulationParameters", simulationParameters),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRulesBacktestReportCreatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        backtestToken()
        results().validate()
        simulationParameters().validate()
        eventType().validate()
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
            (simulationParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField
            val AUTH_RULES_BACKTEST_REPORT_CREATED = of("auth_rules.backtest_report.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            AUTH_RULES_BACKTEST_REPORT_CREATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTH_RULES_BACKTEST_REPORT_CREATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                AUTH_RULES_BACKTEST_REPORT_CREATED -> Value.AUTH_RULES_BACKTEST_REPORT_CREATED
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
                AUTH_RULES_BACKTEST_REPORT_CREATED -> Known.AUTH_RULES_BACKTEST_REPORT_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRulesBacktestReportCreatedWebhookEvent &&
            backtestToken == other.backtestToken &&
            results == other.results &&
            simulationParameters == other.simulationParameters &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(backtestToken, results, simulationParameters, eventType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRulesBacktestReportCreatedWebhookEvent{backtestToken=$backtestToken, results=$results, simulationParameters=$simulationParameters, eventType=$eventType, additionalProperties=$additionalProperties}"
}
