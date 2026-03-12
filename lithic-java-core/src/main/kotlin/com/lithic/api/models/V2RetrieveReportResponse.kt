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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V2RetrieveReportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authRuleToken: JsonField<String>,
    private val begin: JsonField<LocalDate>,
    private val dailyStatistics: JsonField<List<DailyStatistic>>,
    private val end: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_rule_token")
        @ExcludeMissing
        authRuleToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("begin") @ExcludeMissing begin: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("daily_statistics")
        @ExcludeMissing
        dailyStatistics: JsonField<List<DailyStatistic>> = JsonMissing.of(),
        @JsonProperty("end") @ExcludeMissing end: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(authRuleToken, begin, dailyStatistics, end, mutableMapOf())

    /**
     * Auth Rule Token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authRuleToken(): String = authRuleToken.getRequired("auth_rule_token")

    /**
     * The start date (UTC) of the report.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun begin(): LocalDate = begin.getRequired("begin")

    /**
     * Daily evaluation statistics for the Auth Rule.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyStatistics(): List<DailyStatistic> = dailyStatistics.getRequired("daily_statistics")

    /**
     * The end date (UTC) of the report.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun end(): LocalDate = end.getRequired("end")

    /**
     * Returns the raw JSON value of [authRuleToken].
     *
     * Unlike [authRuleToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_rule_token")
    @ExcludeMissing
    fun _authRuleToken(): JsonField<String> = authRuleToken

    /**
     * Returns the raw JSON value of [begin].
     *
     * Unlike [begin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("begin") @ExcludeMissing fun _begin(): JsonField<LocalDate> = begin

    /**
     * Returns the raw JSON value of [dailyStatistics].
     *
     * Unlike [dailyStatistics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily_statistics")
    @ExcludeMissing
    fun _dailyStatistics(): JsonField<List<DailyStatistic>> = dailyStatistics

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<LocalDate> = end

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
         * Returns a mutable builder for constructing an instance of [V2RetrieveReportResponse].
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .begin()
         * .dailyStatistics()
         * .end()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2RetrieveReportResponse]. */
    class Builder internal constructor() {

        private var authRuleToken: JsonField<String>? = null
        private var begin: JsonField<LocalDate>? = null
        private var dailyStatistics: JsonField<MutableList<DailyStatistic>>? = null
        private var end: JsonField<LocalDate>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2RetrieveReportResponse: V2RetrieveReportResponse) = apply {
            authRuleToken = v2RetrieveReportResponse.authRuleToken
            begin = v2RetrieveReportResponse.begin
            dailyStatistics = v2RetrieveReportResponse.dailyStatistics.map { it.toMutableList() }
            end = v2RetrieveReportResponse.end
            additionalProperties = v2RetrieveReportResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Token */
        fun authRuleToken(authRuleToken: String) = authRuleToken(JsonField.of(authRuleToken))

        /**
         * Sets [Builder.authRuleToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authRuleToken(authRuleToken: JsonField<String>) = apply {
            this.authRuleToken = authRuleToken
        }

        /** The start date (UTC) of the report. */
        fun begin(begin: LocalDate) = begin(JsonField.of(begin))

        /**
         * Sets [Builder.begin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.begin] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun begin(begin: JsonField<LocalDate>) = apply { this.begin = begin }

        /** Daily evaluation statistics for the Auth Rule. */
        fun dailyStatistics(dailyStatistics: List<DailyStatistic>) =
            dailyStatistics(JsonField.of(dailyStatistics))

        /**
         * Sets [Builder.dailyStatistics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyStatistics] with a well-typed
         * `List<DailyStatistic>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dailyStatistics(dailyStatistics: JsonField<List<DailyStatistic>>) = apply {
            this.dailyStatistics = dailyStatistics.map { it.toMutableList() }
        }

        /**
         * Adds a single [DailyStatistic] to [dailyStatistics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDailyStatistic(dailyStatistic: DailyStatistic) = apply {
            dailyStatistics =
                (dailyStatistics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dailyStatistics", it).add(dailyStatistic)
                }
        }

        /** The end date (UTC) of the report. */
        fun end(end: LocalDate) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun end(end: JsonField<LocalDate>) = apply { this.end = end }

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
         * Returns an immutable instance of [V2RetrieveReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .begin()
         * .dailyStatistics()
         * .end()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2RetrieveReportResponse =
            V2RetrieveReportResponse(
                checkRequired("authRuleToken", authRuleToken),
                checkRequired("begin", begin),
                checkRequired("dailyStatistics", dailyStatistics).map { it.toImmutable() },
                checkRequired("end", end),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2RetrieveReportResponse = apply {
        if (validated) {
            return@apply
        }

        authRuleToken()
        begin()
        dailyStatistics().forEach { it.validate() }
        end()
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
        (if (authRuleToken.asKnown().isPresent) 1 else 0) +
            (if (begin.asKnown().isPresent) 1 else 0) +
            (dailyStatistics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (end.asKnown().isPresent) 1 else 0)

    class DailyStatistic
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currentVersionStatistics: JsonField<ReportStats>,
        private val date: JsonField<LocalDate>,
        private val draftVersionStatistics: JsonField<ReportStats>,
        private val versions: JsonField<List<ReportStatsV2>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_version_statistics")
            @ExcludeMissing
            currentVersionStatistics: JsonField<ReportStats> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("draft_version_statistics")
            @ExcludeMissing
            draftVersionStatistics: JsonField<ReportStats> = JsonMissing.of(),
            @JsonProperty("versions")
            @ExcludeMissing
            versions: JsonField<List<ReportStatsV2>> = JsonMissing.of(),
        ) : this(currentVersionStatistics, date, draftVersionStatistics, versions, mutableMapOf())

        /**
         * Detailed statistics for the current version of the rule.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentVersionStatistics(): Optional<ReportStats> =
            currentVersionStatistics.getOptional("current_version_statistics")

        /**
         * The date (UTC) for which the statistics are reported.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): LocalDate = date.getRequired("date")

        /**
         * Detailed statistics for the draft version of the rule.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun draftVersionStatistics(): Optional<ReportStats> =
            draftVersionStatistics.getOptional("draft_version_statistics")

        /**
         * Statistics for each version of the rule that was evaluated during the reported day.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun versions(): List<ReportStatsV2> = versions.getRequired("versions")

        /**
         * Returns the raw JSON value of [currentVersionStatistics].
         *
         * Unlike [currentVersionStatistics], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_version_statistics")
        @ExcludeMissing
        fun _currentVersionStatistics(): JsonField<ReportStats> = currentVersionStatistics

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [draftVersionStatistics].
         *
         * Unlike [draftVersionStatistics], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("draft_version_statistics")
        @ExcludeMissing
        fun _draftVersionStatistics(): JsonField<ReportStats> = draftVersionStatistics

        /**
         * Returns the raw JSON value of [versions].
         *
         * Unlike [versions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("versions")
        @ExcludeMissing
        fun _versions(): JsonField<List<ReportStatsV2>> = versions

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
             * Returns a mutable builder for constructing an instance of [DailyStatistic].
             *
             * The following fields are required:
             * ```java
             * .currentVersionStatistics()
             * .date()
             * .draftVersionStatistics()
             * .versions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DailyStatistic]. */
        class Builder internal constructor() {

            private var currentVersionStatistics: JsonField<ReportStats>? = null
            private var date: JsonField<LocalDate>? = null
            private var draftVersionStatistics: JsonField<ReportStats>? = null
            private var versions: JsonField<MutableList<ReportStatsV2>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dailyStatistic: DailyStatistic) = apply {
                currentVersionStatistics = dailyStatistic.currentVersionStatistics
                date = dailyStatistic.date
                draftVersionStatistics = dailyStatistic.draftVersionStatistics
                versions = dailyStatistic.versions.map { it.toMutableList() }
                additionalProperties = dailyStatistic.additionalProperties.toMutableMap()
            }

            /** Detailed statistics for the current version of the rule. */
            fun currentVersionStatistics(currentVersionStatistics: ReportStats?) =
                currentVersionStatistics(JsonField.ofNullable(currentVersionStatistics))

            /**
             * Alias for calling [Builder.currentVersionStatistics] with
             * `currentVersionStatistics.orElse(null)`.
             */
            fun currentVersionStatistics(currentVersionStatistics: Optional<ReportStats>) =
                currentVersionStatistics(currentVersionStatistics.getOrNull())

            /**
             * Sets [Builder.currentVersionStatistics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentVersionStatistics] with a well-typed
             * [ReportStats] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun currentVersionStatistics(currentVersionStatistics: JsonField<ReportStats>) = apply {
                this.currentVersionStatistics = currentVersionStatistics
            }

            /** The date (UTC) for which the statistics are reported. */
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** Detailed statistics for the draft version of the rule. */
            fun draftVersionStatistics(draftVersionStatistics: ReportStats?) =
                draftVersionStatistics(JsonField.ofNullable(draftVersionStatistics))

            /**
             * Alias for calling [Builder.draftVersionStatistics] with
             * `draftVersionStatistics.orElse(null)`.
             */
            fun draftVersionStatistics(draftVersionStatistics: Optional<ReportStats>) =
                draftVersionStatistics(draftVersionStatistics.getOrNull())

            /**
             * Sets [Builder.draftVersionStatistics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.draftVersionStatistics] with a well-typed
             * [ReportStats] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun draftVersionStatistics(draftVersionStatistics: JsonField<ReportStats>) = apply {
                this.draftVersionStatistics = draftVersionStatistics
            }

            /**
             * Statistics for each version of the rule that was evaluated during the reported day.
             */
            fun versions(versions: List<ReportStatsV2>) = versions(JsonField.of(versions))

            /**
             * Sets [Builder.versions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.versions] with a well-typed `List<ReportStatsV2>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun versions(versions: JsonField<List<ReportStatsV2>>) = apply {
                this.versions = versions.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReportStatsV2] to [versions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVersion(version: ReportStatsV2) = apply {
                versions =
                    (versions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("versions", it).add(version)
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
             * Returns an immutable instance of [DailyStatistic].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currentVersionStatistics()
             * .date()
             * .draftVersionStatistics()
             * .versions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DailyStatistic =
                DailyStatistic(
                    checkRequired("currentVersionStatistics", currentVersionStatistics),
                    checkRequired("date", date),
                    checkRequired("draftVersionStatistics", draftVersionStatistics),
                    checkRequired("versions", versions).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DailyStatistic = apply {
            if (validated) {
                return@apply
            }

            currentVersionStatistics().ifPresent { it.validate() }
            date()
            draftVersionStatistics().ifPresent { it.validate() }
            versions().forEach { it.validate() }
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
            (currentVersionStatistics.asKnown().getOrNull()?.validity() ?: 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (draftVersionStatistics.asKnown().getOrNull()?.validity() ?: 0) +
                (versions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class ReportStatsV2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actionCounts: JsonField<ActionCounts>,
            private val examples: JsonField<List<Example>>,
            private val state: JsonField<State>,
            private val version: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action_counts")
                @ExcludeMissing
                actionCounts: JsonField<ActionCounts> = JsonMissing.of(),
                @JsonProperty("examples")
                @ExcludeMissing
                examples: JsonField<List<Example>> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
                @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            ) : this(actionCounts, examples, state, version, mutableMapOf())

            /**
             * A mapping of action types to the number of times that action was returned by this
             * version during the relevant period. Actions are the possible outcomes of a rule
             * evaluation, such as DECLINE, CHALLENGE, REQUIRE_TFA, etc. In case rule didn't trigger
             * any action, it's counted under NO_ACTION key.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actionCounts(): ActionCounts = actionCounts.getRequired("action_counts")

            /**
             * Example events and their outcomes for this version.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun examples(): List<Example> = examples.getRequired("examples")

            /**
             * The evaluation mode of this version during the reported period.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): State = state.getRequired("state")

            /**
             * The rule version number.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): Long = version.getRequired("version")

            /**
             * Returns the raw JSON value of [actionCounts].
             *
             * Unlike [actionCounts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("action_counts")
            @ExcludeMissing
            fun _actionCounts(): JsonField<ActionCounts> = actionCounts

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
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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

                /**
                 * Returns a mutable builder for constructing an instance of [ReportStatsV2].
                 *
                 * The following fields are required:
                 * ```java
                 * .actionCounts()
                 * .examples()
                 * .state()
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ReportStatsV2]. */
            class Builder internal constructor() {

                private var actionCounts: JsonField<ActionCounts>? = null
                private var examples: JsonField<MutableList<Example>>? = null
                private var state: JsonField<State>? = null
                private var version: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(reportStatsV2: ReportStatsV2) = apply {
                    actionCounts = reportStatsV2.actionCounts
                    examples = reportStatsV2.examples.map { it.toMutableList() }
                    state = reportStatsV2.state
                    version = reportStatsV2.version
                    additionalProperties = reportStatsV2.additionalProperties.toMutableMap()
                }

                /**
                 * A mapping of action types to the number of times that action was returned by this
                 * version during the relevant period. Actions are the possible outcomes of a rule
                 * evaluation, such as DECLINE, CHALLENGE, REQUIRE_TFA, etc. In case rule didn't
                 * trigger any action, it's counted under NO_ACTION key.
                 */
                fun actionCounts(actionCounts: ActionCounts) =
                    actionCounts(JsonField.of(actionCounts))

                /**
                 * Sets [Builder.actionCounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actionCounts] with a well-typed [ActionCounts]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun actionCounts(actionCounts: JsonField<ActionCounts>) = apply {
                    this.actionCounts = actionCounts
                }

                /** Example events and their outcomes for this version. */
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

                /** The evaluation mode of this version during the reported period. */
                fun state(state: State) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [State] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<State>) = apply { this.state = state }

                /** The rule version number. */
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
                 * Returns an immutable instance of [ReportStatsV2].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .actionCounts()
                 * .examples()
                 * .state()
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReportStatsV2 =
                    ReportStatsV2(
                        checkRequired("actionCounts", actionCounts),
                        checkRequired("examples", examples).map { it.toImmutable() },
                        checkRequired("state", state),
                        checkRequired("version", version),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ReportStatsV2 = apply {
                if (validated) {
                    return@apply
                }

                actionCounts().validate()
                examples().forEach { it.validate() }
                state().validate()
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
                (actionCounts.asKnown().getOrNull()?.validity() ?: 0) +
                    (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (state.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

            /**
             * A mapping of action types to the number of times that action was returned by this
             * version during the relevant period. Actions are the possible outcomes of a rule
             * evaluation, such as DECLINE, CHALLENGE, REQUIRE_TFA, etc. In case rule didn't trigger
             * any action, it's counted under NO_ACTION key.
             */
            class ActionCounts
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ActionCounts]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ActionCounts]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(actionCounts: ActionCounts) = apply {
                        additionalProperties = actionCounts.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [ActionCounts].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ActionCounts = ActionCounts(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ActionCounts = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ActionCounts &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ActionCounts{additionalProperties=$additionalProperties}"
            }

            class Example
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val actions: JsonField<List<Action>>,
                private val eventToken: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("actions")
                    @ExcludeMissing
                    actions: JsonField<List<Action>> = JsonMissing.of(),
                    @JsonProperty("event_token")
                    @ExcludeMissing
                    eventToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(actions, eventToken, timestamp, mutableMapOf())

                /**
                 * The actions taken by this version for this event.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun actions(): List<Action> = actions.getRequired("actions")

                /**
                 * The event token.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventToken(): String = eventToken.getRequired("event_token")

                /**
                 * The timestamp of the event.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Returns the raw JSON value of [actions].
                 *
                 * Unlike [actions], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("actions")
                @ExcludeMissing
                fun _actions(): JsonField<List<Action>> = actions

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

                    /**
                     * Returns a mutable builder for constructing an instance of [Example].
                     *
                     * The following fields are required:
                     * ```java
                     * .actions()
                     * .eventToken()
                     * .timestamp()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Example]. */
                class Builder internal constructor() {

                    private var actions: JsonField<MutableList<Action>>? = null
                    private var eventToken: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        actions = example.actions.map { it.toMutableList() }
                        eventToken = example.eventToken
                        timestamp = example.timestamp
                        additionalProperties = example.additionalProperties.toMutableMap()
                    }

                    /** The actions taken by this version for this event. */
                    fun actions(actions: List<Action>) = actions(JsonField.of(actions))

                    /**
                     * Sets [Builder.actions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actions] with a well-typed `List<Action>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actions(actions: JsonField<List<Action>>) = apply {
                        this.actions = actions.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Action] to [actions].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAction(action: Action) = apply {
                        actions =
                            (actions ?: JsonField.of(mutableListOf())).also {
                                checkKnown("actions", it).add(action)
                            }
                    }

                    /**
                     * Alias for calling [addAction] with
                     * `Action.ofDeclineActionAuthorization(declineActionAuthorization)`.
                     */
                    fun addAction(declineActionAuthorization: Action.DeclineActionAuthorization) =
                        addAction(Action.ofDeclineActionAuthorization(declineActionAuthorization))

                    /**
                     * Alias for calling [addAction] with
                     * `Action.ofChallengeActionAuthorization(challengeActionAuthorization)`.
                     */
                    fun addAction(
                        challengeActionAuthorization: Action.ChallengeActionAuthorization
                    ) =
                        addAction(
                            Action.ofChallengeActionAuthorization(challengeActionAuthorization)
                        )

                    /**
                     * Alias for calling [addAction] with
                     * `Action.ofResultAuthentication3ds(resultAuthentication3ds)`.
                     */
                    fun addAction(resultAuthentication3ds: Action.ResultAuthentication3dsAction) =
                        addAction(Action.ofResultAuthentication3ds(resultAuthentication3ds))

                    /**
                     * Alias for calling [addAction] with
                     * `Action.ofDeclineActionTokenization(declineActionTokenization)`.
                     */
                    fun addAction(declineActionTokenization: Action.DeclineActionTokenization) =
                        addAction(Action.ofDeclineActionTokenization(declineActionTokenization))

                    /** Alias for calling [addAction] with `Action.ofRequireTfa(requireTfa)`. */
                    fun addAction(requireTfa: Action.RequireTfaAction) =
                        addAction(Action.ofRequireTfa(requireTfa))

                    /**
                     * Alias for calling [addAction] with
                     * `Action.ofApproveActionAch(approveActionAch)`.
                     */
                    fun addAction(approveActionAch: Action.ApproveActionAch) =
                        addAction(Action.ofApproveActionAch(approveActionAch))

                    /** Alias for calling [addAction] with `Action.ofReturnAction(returnAction)`. */
                    fun addAction(returnAction: Action.ReturnAction) =
                        addAction(Action.ofReturnAction(returnAction))

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
                     *
                     * The following fields are required:
                     * ```java
                     * .actions()
                     * .eventToken()
                     * .timestamp()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Example =
                        Example(
                            checkRequired("actions", actions).map { it.toImmutable() },
                            checkRequired("eventToken", eventToken),
                            checkRequired("timestamp", timestamp),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Example = apply {
                    if (validated) {
                        return@apply
                    }

                    actions().forEach { it.validate() }
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
                    (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (eventToken.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0)

                @JsonDeserialize(using = Action.Deserializer::class)
                @JsonSerialize(using = Action.Serializer::class)
                class Action
                private constructor(
                    private val declineActionAuthorization: DeclineActionAuthorization? = null,
                    private val challengeActionAuthorization: ChallengeActionAuthorization? = null,
                    private val resultAuthentication3ds: ResultAuthentication3dsAction? = null,
                    private val declineActionTokenization: DeclineActionTokenization? = null,
                    private val requireTfa: RequireTfaAction? = null,
                    private val approveActionAch: ApproveActionAch? = null,
                    private val returnAction: ReturnAction? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun declineActionAuthorization(): Optional<DeclineActionAuthorization> =
                        Optional.ofNullable(declineActionAuthorization)

                    fun challengeActionAuthorization(): Optional<ChallengeActionAuthorization> =
                        Optional.ofNullable(challengeActionAuthorization)

                    fun resultAuthentication3ds(): Optional<ResultAuthentication3dsAction> =
                        Optional.ofNullable(resultAuthentication3ds)

                    fun declineActionTokenization(): Optional<DeclineActionTokenization> =
                        Optional.ofNullable(declineActionTokenization)

                    fun requireTfa(): Optional<RequireTfaAction> = Optional.ofNullable(requireTfa)

                    fun approveActionAch(): Optional<ApproveActionAch> =
                        Optional.ofNullable(approveActionAch)

                    fun returnAction(): Optional<ReturnAction> = Optional.ofNullable(returnAction)

                    fun isDeclineActionAuthorization(): Boolean = declineActionAuthorization != null

                    fun isChallengeActionAuthorization(): Boolean =
                        challengeActionAuthorization != null

                    fun isResultAuthentication3ds(): Boolean = resultAuthentication3ds != null

                    fun isDeclineActionTokenization(): Boolean = declineActionTokenization != null

                    fun isRequireTfa(): Boolean = requireTfa != null

                    fun isApproveActionAch(): Boolean = approveActionAch != null

                    fun isReturnAction(): Boolean = returnAction != null

                    fun asDeclineActionAuthorization(): DeclineActionAuthorization =
                        declineActionAuthorization.getOrThrow("declineActionAuthorization")

                    fun asChallengeActionAuthorization(): ChallengeActionAuthorization =
                        challengeActionAuthorization.getOrThrow("challengeActionAuthorization")

                    fun asResultAuthentication3ds(): ResultAuthentication3dsAction =
                        resultAuthentication3ds.getOrThrow("resultAuthentication3ds")

                    fun asDeclineActionTokenization(): DeclineActionTokenization =
                        declineActionTokenization.getOrThrow("declineActionTokenization")

                    fun asRequireTfa(): RequireTfaAction = requireTfa.getOrThrow("requireTfa")

                    fun asApproveActionAch(): ApproveActionAch =
                        approveActionAch.getOrThrow("approveActionAch")

                    fun asReturnAction(): ReturnAction = returnAction.getOrThrow("returnAction")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            declineActionAuthorization != null ->
                                visitor.visitDeclineActionAuthorization(declineActionAuthorization)
                            challengeActionAuthorization != null ->
                                visitor.visitChallengeActionAuthorization(
                                    challengeActionAuthorization
                                )
                            resultAuthentication3ds != null ->
                                visitor.visitResultAuthentication3ds(resultAuthentication3ds)
                            declineActionTokenization != null ->
                                visitor.visitDeclineActionTokenization(declineActionTokenization)
                            requireTfa != null -> visitor.visitRequireTfa(requireTfa)
                            approveActionAch != null ->
                                visitor.visitApproveActionAch(approveActionAch)
                            returnAction != null -> visitor.visitReturnAction(returnAction)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitDeclineActionAuthorization(
                                    declineActionAuthorization: DeclineActionAuthorization
                                ) {
                                    declineActionAuthorization.validate()
                                }

                                override fun visitChallengeActionAuthorization(
                                    challengeActionAuthorization: ChallengeActionAuthorization
                                ) {
                                    challengeActionAuthorization.validate()
                                }

                                override fun visitResultAuthentication3ds(
                                    resultAuthentication3ds: ResultAuthentication3dsAction
                                ) {
                                    resultAuthentication3ds.validate()
                                }

                                override fun visitDeclineActionTokenization(
                                    declineActionTokenization: DeclineActionTokenization
                                ) {
                                    declineActionTokenization.validate()
                                }

                                override fun visitRequireTfa(requireTfa: RequireTfaAction) {
                                    requireTfa.validate()
                                }

                                override fun visitApproveActionAch(
                                    approveActionAch: ApproveActionAch
                                ) {
                                    approveActionAch.validate()
                                }

                                override fun visitReturnAction(returnAction: ReturnAction) {
                                    returnAction.validate()
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
                                override fun visitDeclineActionAuthorization(
                                    declineActionAuthorization: DeclineActionAuthorization
                                ) = declineActionAuthorization.validity()

                                override fun visitChallengeActionAuthorization(
                                    challengeActionAuthorization: ChallengeActionAuthorization
                                ) = challengeActionAuthorization.validity()

                                override fun visitResultAuthentication3ds(
                                    resultAuthentication3ds: ResultAuthentication3dsAction
                                ) = resultAuthentication3ds.validity()

                                override fun visitDeclineActionTokenization(
                                    declineActionTokenization: DeclineActionTokenization
                                ) = declineActionTokenization.validity()

                                override fun visitRequireTfa(requireTfa: RequireTfaAction) =
                                    requireTfa.validity()

                                override fun visitApproveActionAch(
                                    approveActionAch: ApproveActionAch
                                ) = approveActionAch.validity()

                                override fun visitReturnAction(returnAction: ReturnAction) =
                                    returnAction.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action &&
                            declineActionAuthorization == other.declineActionAuthorization &&
                            challengeActionAuthorization == other.challengeActionAuthorization &&
                            resultAuthentication3ds == other.resultAuthentication3ds &&
                            declineActionTokenization == other.declineActionTokenization &&
                            requireTfa == other.requireTfa &&
                            approveActionAch == other.approveActionAch &&
                            returnAction == other.returnAction
                    }

                    override fun hashCode(): Int =
                        Objects.hash(
                            declineActionAuthorization,
                            challengeActionAuthorization,
                            resultAuthentication3ds,
                            declineActionTokenization,
                            requireTfa,
                            approveActionAch,
                            returnAction,
                        )

                    override fun toString(): String =
                        when {
                            declineActionAuthorization != null ->
                                "Action{declineActionAuthorization=$declineActionAuthorization}"
                            challengeActionAuthorization != null ->
                                "Action{challengeActionAuthorization=$challengeActionAuthorization}"
                            resultAuthentication3ds != null ->
                                "Action{resultAuthentication3ds=$resultAuthentication3ds}"
                            declineActionTokenization != null ->
                                "Action{declineActionTokenization=$declineActionTokenization}"
                            requireTfa != null -> "Action{requireTfa=$requireTfa}"
                            approveActionAch != null -> "Action{approveActionAch=$approveActionAch}"
                            returnAction != null -> "Action{returnAction=$returnAction}"
                            _json != null -> "Action{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Action")
                        }

                    companion object {

                        @JvmStatic
                        fun ofDeclineActionAuthorization(
                            declineActionAuthorization: DeclineActionAuthorization
                        ) = Action(declineActionAuthorization = declineActionAuthorization)

                        @JvmStatic
                        fun ofChallengeActionAuthorization(
                            challengeActionAuthorization: ChallengeActionAuthorization
                        ) = Action(challengeActionAuthorization = challengeActionAuthorization)

                        @JvmStatic
                        fun ofResultAuthentication3ds(
                            resultAuthentication3ds: ResultAuthentication3dsAction
                        ) = Action(resultAuthentication3ds = resultAuthentication3ds)

                        @JvmStatic
                        fun ofDeclineActionTokenization(
                            declineActionTokenization: DeclineActionTokenization
                        ) = Action(declineActionTokenization = declineActionTokenization)

                        @JvmStatic
                        fun ofRequireTfa(requireTfa: RequireTfaAction) =
                            Action(requireTfa = requireTfa)

                        @JvmStatic
                        fun ofApproveActionAch(approveActionAch: ApproveActionAch) =
                            Action(approveActionAch = approveActionAch)

                        @JvmStatic
                        fun ofReturnAction(returnAction: ReturnAction) =
                            Action(returnAction = returnAction)
                    }

                    /**
                     * An interface that defines how to map each variant of [Action] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitDeclineActionAuthorization(
                            declineActionAuthorization: DeclineActionAuthorization
                        ): T

                        fun visitChallengeActionAuthorization(
                            challengeActionAuthorization: ChallengeActionAuthorization
                        ): T

                        fun visitResultAuthentication3ds(
                            resultAuthentication3ds: ResultAuthentication3dsAction
                        ): T

                        fun visitDeclineActionTokenization(
                            declineActionTokenization: DeclineActionTokenization
                        ): T

                        fun visitRequireTfa(requireTfa: RequireTfaAction): T

                        fun visitApproveActionAch(approveActionAch: ApproveActionAch): T

                        fun visitReturnAction(returnAction: ReturnAction): T

                        /**
                         * Maps an unknown variant of [Action] to a value of type [T].
                         *
                         * An instance of [Action] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LithicInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LithicInvalidDataException("Unknown Action: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Action>(Action::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Action {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<DeclineActionAuthorization>(),
                                            )
                                            ?.let {
                                                Action(
                                                    declineActionAuthorization = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChallengeActionAuthorization>(),
                                            )
                                            ?.let {
                                                Action(
                                                    challengeActionAuthorization = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ResultAuthentication3dsAction>(),
                                            )
                                            ?.let {
                                                Action(resultAuthentication3ds = it, _json = json)
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<DeclineActionTokenization>(),
                                            )
                                            ?.let {
                                                Action(declineActionTokenization = it, _json = json)
                                            },
                                        tryDeserialize(node, jacksonTypeRef<RequireTfaAction>())
                                            ?.let { Action(requireTfa = it, _json = json) },
                                        tryDeserialize(node, jacksonTypeRef<ApproveActionAch>())
                                            ?.let { Action(approveActionAch = it, _json = json) },
                                        tryDeserialize(node, jacksonTypeRef<ReturnAction>())?.let {
                                            Action(returnAction = it, _json = json)
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from boolean).
                                0 -> Action(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Action>(Action::class) {

                        override fun serialize(
                            value: Action,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.declineActionAuthorization != null ->
                                    generator.writeObject(value.declineActionAuthorization)
                                value.challengeActionAuthorization != null ->
                                    generator.writeObject(value.challengeActionAuthorization)
                                value.resultAuthentication3ds != null ->
                                    generator.writeObject(value.resultAuthentication3ds)
                                value.declineActionTokenization != null ->
                                    generator.writeObject(value.declineActionTokenization)
                                value.requireTfa != null -> generator.writeObject(value.requireTfa)
                                value.approveActionAch != null ->
                                    generator.writeObject(value.approveActionAch)
                                value.returnAction != null ->
                                    generator.writeObject(value.returnAction)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Action")
                            }
                        }
                    }

                    class DeclineActionAuthorization
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val code: JsonField<DetailedResult>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("code")
                            @ExcludeMissing
                            code: JsonField<DetailedResult> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(code, type, mutableMapOf())

                        /**
                         * The detailed result code explaining the specific reason for the decline
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun code(): DetailedResult = code.getRequired("code")

                        /**
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [code].
                         *
                         * Unlike [code], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("code")
                        @ExcludeMissing
                        fun _code(): JsonField<DetailedResult> = code

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * [DeclineActionAuthorization].
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [DeclineActionAuthorization]. */
                        class Builder internal constructor() {

                            private var code: JsonField<DetailedResult>? = null
                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(
                                declineActionAuthorization: DeclineActionAuthorization
                            ) = apply {
                                code = declineActionAuthorization.code
                                type = declineActionAuthorization.type
                                additionalProperties =
                                    declineActionAuthorization.additionalProperties.toMutableMap()
                            }

                            /**
                             * The detailed result code explaining the specific reason for the
                             * decline
                             */
                            fun code(code: DetailedResult) = code(JsonField.of(code))

                            /**
                             * Sets [Builder.code] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.code] with a well-typed
                             * [DetailedResult] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun code(code: JsonField<DetailedResult>) = apply { this.code = code }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [DeclineActionAuthorization].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): DeclineActionAuthorization =
                                DeclineActionAuthorization(
                                    checkRequired("code", code),
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): DeclineActionAuthorization = apply {
                            if (validated) {
                                return@apply
                            }

                            code().validate()
                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (code.asKnown().getOrNull()?.validity() ?: 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * The detailed result code explaining the specific reason for the decline
                         */
                        class DetailedResult
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField
                                val ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED =
                                    of("ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED")

                                @JvmField val ACCOUNT_DELINQUENT = of("ACCOUNT_DELINQUENT")

                                @JvmField val ACCOUNT_INACTIVE = of("ACCOUNT_INACTIVE")

                                @JvmField
                                val ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED =
                                    of("ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED")

                                @JvmField
                                val ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED =
                                    of("ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED")

                                @JvmField val ACCOUNT_PAUSED = of("ACCOUNT_PAUSED")

                                @JvmField val ACCOUNT_UNDER_REVIEW = of("ACCOUNT_UNDER_REVIEW")

                                @JvmField val ADDRESS_INCORRECT = of("ADDRESS_INCORRECT")

                                @JvmField val APPROVED = of("APPROVED")

                                @JvmField
                                val AUTH_RULE_ALLOWED_COUNTRY = of("AUTH_RULE_ALLOWED_COUNTRY")

                                @JvmField val AUTH_RULE_ALLOWED_MCC = of("AUTH_RULE_ALLOWED_MCC")

                                @JvmField
                                val AUTH_RULE_BLOCKED_COUNTRY = of("AUTH_RULE_BLOCKED_COUNTRY")

                                @JvmField val AUTH_RULE_BLOCKED_MCC = of("AUTH_RULE_BLOCKED_MCC")

                                @JvmField val AUTH_RULE = of("AUTH_RULE")

                                @JvmField val CARD_CLOSED = of("CARD_CLOSED")

                                @JvmField
                                val CARD_CRYPTOGRAM_VALIDATION_FAILURE =
                                    of("CARD_CRYPTOGRAM_VALIDATION_FAILURE")

                                @JvmField val CARD_EXPIRED = of("CARD_EXPIRED")

                                @JvmField
                                val CARD_EXPIRY_DATE_INCORRECT = of("CARD_EXPIRY_DATE_INCORRECT")

                                @JvmField val CARD_INVALID = of("CARD_INVALID")

                                @JvmField val CARD_NOT_ACTIVATED = of("CARD_NOT_ACTIVATED")

                                @JvmField val CARD_PAUSED = of("CARD_PAUSED")

                                @JvmField val CARD_PIN_INCORRECT = of("CARD_PIN_INCORRECT")

                                @JvmField val CARD_RESTRICTED = of("CARD_RESTRICTED")

                                @JvmField
                                val CARD_SECURITY_CODE_INCORRECT =
                                    of("CARD_SECURITY_CODE_INCORRECT")

                                @JvmField
                                val CARD_SPEND_LIMIT_EXCEEDED = of("CARD_SPEND_LIMIT_EXCEEDED")

                                @JvmField val CONTACT_CARD_ISSUER = of("CONTACT_CARD_ISSUER")

                                @JvmField val CUSTOMER_ASA_TIMEOUT = of("CUSTOMER_ASA_TIMEOUT")

                                @JvmField val CUSTOM_ASA_RESULT = of("CUSTOM_ASA_RESULT")

                                @JvmField val DECLINED = of("DECLINED")

                                @JvmField val DO_NOT_HONOR = of("DO_NOT_HONOR")

                                @JvmField val DRIVER_NUMBER_INVALID = of("DRIVER_NUMBER_INVALID")

                                @JvmField val FORMAT_ERROR = of("FORMAT_ERROR")

                                @JvmField
                                val INSUFFICIENT_FUNDING_SOURCE_BALANCE =
                                    of("INSUFFICIENT_FUNDING_SOURCE_BALANCE")

                                @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

                                @JvmField val LITHIC_SYSTEM_ERROR = of("LITHIC_SYSTEM_ERROR")

                                @JvmField
                                val LITHIC_SYSTEM_RATE_LIMIT = of("LITHIC_SYSTEM_RATE_LIMIT")

                                @JvmField val MALFORMED_ASA_RESPONSE = of("MALFORMED_ASA_RESPONSE")

                                @JvmField val MERCHANT_INVALID = of("MERCHANT_INVALID")

                                @JvmField
                                val MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE =
                                    of("MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE")

                                @JvmField val MERCHANT_NOT_PERMITTED = of("MERCHANT_NOT_PERMITTED")

                                @JvmField
                                val OVER_REVERSAL_ATTEMPTED = of("OVER_REVERSAL_ATTEMPTED")

                                @JvmField val PIN_BLOCKED = of("PIN_BLOCKED")

                                @JvmField
                                val PROGRAM_CARD_SPEND_LIMIT_EXCEEDED =
                                    of("PROGRAM_CARD_SPEND_LIMIT_EXCEEDED")

                                @JvmField val PROGRAM_SUSPENDED = of("PROGRAM_SUSPENDED")

                                @JvmField
                                val PROGRAM_USAGE_RESTRICTION = of("PROGRAM_USAGE_RESTRICTION")

                                @JvmField val REVERSAL_UNMATCHED = of("REVERSAL_UNMATCHED")

                                @JvmField val SECURITY_VIOLATION = of("SECURITY_VIOLATION")

                                @JvmField
                                val SINGLE_USE_CARD_REATTEMPTED = of("SINGLE_USE_CARD_REATTEMPTED")

                                @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

                                @JvmField val TRANSACTION_INVALID = of("TRANSACTION_INVALID")

                                @JvmField
                                val TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL =
                                    of("TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL")

                                @JvmField
                                val TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER =
                                    of("TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER")

                                @JvmField
                                val TRANSACTION_PREVIOUSLY_COMPLETED =
                                    of("TRANSACTION_PREVIOUSLY_COMPLETED")

                                @JvmField val UNAUTHORIZED_MERCHANT = of("UNAUTHORIZED_MERCHANT")

                                @JvmField val VEHICLE_NUMBER_INVALID = of("VEHICLE_NUMBER_INVALID")

                                @JvmField val CARDHOLDER_CHALLENGED = of("CARDHOLDER_CHALLENGED")

                                @JvmField
                                val CARDHOLDER_CHALLENGE_FAILED = of("CARDHOLDER_CHALLENGE_FAILED")

                                @JvmStatic
                                fun of(value: String) = DetailedResult(JsonField.of(value))
                            }

                            /** An enum containing [DetailedResult]'s known values. */
                            enum class Known {
                                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_DELINQUENT,
                                ACCOUNT_INACTIVE,
                                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_PAUSED,
                                ACCOUNT_UNDER_REVIEW,
                                ADDRESS_INCORRECT,
                                APPROVED,
                                AUTH_RULE_ALLOWED_COUNTRY,
                                AUTH_RULE_ALLOWED_MCC,
                                AUTH_RULE_BLOCKED_COUNTRY,
                                AUTH_RULE_BLOCKED_MCC,
                                AUTH_RULE,
                                CARD_CLOSED,
                                CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                                CARD_EXPIRED,
                                CARD_EXPIRY_DATE_INCORRECT,
                                CARD_INVALID,
                                CARD_NOT_ACTIVATED,
                                CARD_PAUSED,
                                CARD_PIN_INCORRECT,
                                CARD_RESTRICTED,
                                CARD_SECURITY_CODE_INCORRECT,
                                CARD_SPEND_LIMIT_EXCEEDED,
                                CONTACT_CARD_ISSUER,
                                CUSTOMER_ASA_TIMEOUT,
                                CUSTOM_ASA_RESULT,
                                DECLINED,
                                DO_NOT_HONOR,
                                DRIVER_NUMBER_INVALID,
                                FORMAT_ERROR,
                                INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                                INSUFFICIENT_FUNDS,
                                LITHIC_SYSTEM_ERROR,
                                LITHIC_SYSTEM_RATE_LIMIT,
                                MALFORMED_ASA_RESPONSE,
                                MERCHANT_INVALID,
                                MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                                MERCHANT_NOT_PERMITTED,
                                OVER_REVERSAL_ATTEMPTED,
                                PIN_BLOCKED,
                                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                                PROGRAM_SUSPENDED,
                                PROGRAM_USAGE_RESTRICTION,
                                REVERSAL_UNMATCHED,
                                SECURITY_VIOLATION,
                                SINGLE_USE_CARD_REATTEMPTED,
                                SUSPECTED_FRAUD,
                                TRANSACTION_INVALID,
                                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                                TRANSACTION_PREVIOUSLY_COMPLETED,
                                UNAUTHORIZED_MERCHANT,
                                VEHICLE_NUMBER_INVALID,
                                CARDHOLDER_CHALLENGED,
                                CARDHOLDER_CHALLENGE_FAILED,
                            }

                            /**
                             * An enum containing [DetailedResult]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [DetailedResult] can contain an unknown value in a
                             * couple of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_DELINQUENT,
                                ACCOUNT_INACTIVE,
                                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                                ACCOUNT_PAUSED,
                                ACCOUNT_UNDER_REVIEW,
                                ADDRESS_INCORRECT,
                                APPROVED,
                                AUTH_RULE_ALLOWED_COUNTRY,
                                AUTH_RULE_ALLOWED_MCC,
                                AUTH_RULE_BLOCKED_COUNTRY,
                                AUTH_RULE_BLOCKED_MCC,
                                AUTH_RULE,
                                CARD_CLOSED,
                                CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                                CARD_EXPIRED,
                                CARD_EXPIRY_DATE_INCORRECT,
                                CARD_INVALID,
                                CARD_NOT_ACTIVATED,
                                CARD_PAUSED,
                                CARD_PIN_INCORRECT,
                                CARD_RESTRICTED,
                                CARD_SECURITY_CODE_INCORRECT,
                                CARD_SPEND_LIMIT_EXCEEDED,
                                CONTACT_CARD_ISSUER,
                                CUSTOMER_ASA_TIMEOUT,
                                CUSTOM_ASA_RESULT,
                                DECLINED,
                                DO_NOT_HONOR,
                                DRIVER_NUMBER_INVALID,
                                FORMAT_ERROR,
                                INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                                INSUFFICIENT_FUNDS,
                                LITHIC_SYSTEM_ERROR,
                                LITHIC_SYSTEM_RATE_LIMIT,
                                MALFORMED_ASA_RESPONSE,
                                MERCHANT_INVALID,
                                MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                                MERCHANT_NOT_PERMITTED,
                                OVER_REVERSAL_ATTEMPTED,
                                PIN_BLOCKED,
                                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                                PROGRAM_SUSPENDED,
                                PROGRAM_USAGE_RESTRICTION,
                                REVERSAL_UNMATCHED,
                                SECURITY_VIOLATION,
                                SINGLE_USE_CARD_REATTEMPTED,
                                SUSPECTED_FRAUD,
                                TRANSACTION_INVALID,
                                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                                TRANSACTION_PREVIOUSLY_COMPLETED,
                                UNAUTHORIZED_MERCHANT,
                                VEHICLE_NUMBER_INVALID,
                                CARDHOLDER_CHALLENGED,
                                CARDHOLDER_CHALLENGE_FAILED,
                                /**
                                 * An enum member indicating that [DetailedResult] was instantiated
                                 * with an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                                        Value.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_DELINQUENT -> Value.ACCOUNT_DELINQUENT
                                    ACCOUNT_INACTIVE -> Value.ACCOUNT_INACTIVE
                                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                                        Value.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                                        Value.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_PAUSED -> Value.ACCOUNT_PAUSED
                                    ACCOUNT_UNDER_REVIEW -> Value.ACCOUNT_UNDER_REVIEW
                                    ADDRESS_INCORRECT -> Value.ADDRESS_INCORRECT
                                    APPROVED -> Value.APPROVED
                                    AUTH_RULE_ALLOWED_COUNTRY -> Value.AUTH_RULE_ALLOWED_COUNTRY
                                    AUTH_RULE_ALLOWED_MCC -> Value.AUTH_RULE_ALLOWED_MCC
                                    AUTH_RULE_BLOCKED_COUNTRY -> Value.AUTH_RULE_BLOCKED_COUNTRY
                                    AUTH_RULE_BLOCKED_MCC -> Value.AUTH_RULE_BLOCKED_MCC
                                    AUTH_RULE -> Value.AUTH_RULE
                                    CARD_CLOSED -> Value.CARD_CLOSED
                                    CARD_CRYPTOGRAM_VALIDATION_FAILURE ->
                                        Value.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                                    CARD_EXPIRED -> Value.CARD_EXPIRED
                                    CARD_EXPIRY_DATE_INCORRECT -> Value.CARD_EXPIRY_DATE_INCORRECT
                                    CARD_INVALID -> Value.CARD_INVALID
                                    CARD_NOT_ACTIVATED -> Value.CARD_NOT_ACTIVATED
                                    CARD_PAUSED -> Value.CARD_PAUSED
                                    CARD_PIN_INCORRECT -> Value.CARD_PIN_INCORRECT
                                    CARD_RESTRICTED -> Value.CARD_RESTRICTED
                                    CARD_SECURITY_CODE_INCORRECT ->
                                        Value.CARD_SECURITY_CODE_INCORRECT
                                    CARD_SPEND_LIMIT_EXCEEDED -> Value.CARD_SPEND_LIMIT_EXCEEDED
                                    CONTACT_CARD_ISSUER -> Value.CONTACT_CARD_ISSUER
                                    CUSTOMER_ASA_TIMEOUT -> Value.CUSTOMER_ASA_TIMEOUT
                                    CUSTOM_ASA_RESULT -> Value.CUSTOM_ASA_RESULT
                                    DECLINED -> Value.DECLINED
                                    DO_NOT_HONOR -> Value.DO_NOT_HONOR
                                    DRIVER_NUMBER_INVALID -> Value.DRIVER_NUMBER_INVALID
                                    FORMAT_ERROR -> Value.FORMAT_ERROR
                                    INSUFFICIENT_FUNDING_SOURCE_BALANCE ->
                                        Value.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                                    LITHIC_SYSTEM_ERROR -> Value.LITHIC_SYSTEM_ERROR
                                    LITHIC_SYSTEM_RATE_LIMIT -> Value.LITHIC_SYSTEM_RATE_LIMIT
                                    MALFORMED_ASA_RESPONSE -> Value.MALFORMED_ASA_RESPONSE
                                    MERCHANT_INVALID -> Value.MERCHANT_INVALID
                                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                                        Value.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                                    MERCHANT_NOT_PERMITTED -> Value.MERCHANT_NOT_PERMITTED
                                    OVER_REVERSAL_ATTEMPTED -> Value.OVER_REVERSAL_ATTEMPTED
                                    PIN_BLOCKED -> Value.PIN_BLOCKED
                                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED ->
                                        Value.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                                    PROGRAM_SUSPENDED -> Value.PROGRAM_SUSPENDED
                                    PROGRAM_USAGE_RESTRICTION -> Value.PROGRAM_USAGE_RESTRICTION
                                    REVERSAL_UNMATCHED -> Value.REVERSAL_UNMATCHED
                                    SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                                    SINGLE_USE_CARD_REATTEMPTED -> Value.SINGLE_USE_CARD_REATTEMPTED
                                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                                    TRANSACTION_INVALID -> Value.TRANSACTION_INVALID
                                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                                        Value.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                                        Value.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                                    TRANSACTION_PREVIOUSLY_COMPLETED ->
                                        Value.TRANSACTION_PREVIOUSLY_COMPLETED
                                    UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                                    VEHICLE_NUMBER_INVALID -> Value.VEHICLE_NUMBER_INVALID
                                    CARDHOLDER_CHALLENGED -> Value.CARDHOLDER_CHALLENGED
                                    CARDHOLDER_CHALLENGE_FAILED -> Value.CARDHOLDER_CHALLENGE_FAILED
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                                        Known.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_DELINQUENT -> Known.ACCOUNT_DELINQUENT
                                    ACCOUNT_INACTIVE -> Known.ACCOUNT_INACTIVE
                                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                                        Known.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                                        Known.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                                    ACCOUNT_PAUSED -> Known.ACCOUNT_PAUSED
                                    ACCOUNT_UNDER_REVIEW -> Known.ACCOUNT_UNDER_REVIEW
                                    ADDRESS_INCORRECT -> Known.ADDRESS_INCORRECT
                                    APPROVED -> Known.APPROVED
                                    AUTH_RULE_ALLOWED_COUNTRY -> Known.AUTH_RULE_ALLOWED_COUNTRY
                                    AUTH_RULE_ALLOWED_MCC -> Known.AUTH_RULE_ALLOWED_MCC
                                    AUTH_RULE_BLOCKED_COUNTRY -> Known.AUTH_RULE_BLOCKED_COUNTRY
                                    AUTH_RULE_BLOCKED_MCC -> Known.AUTH_RULE_BLOCKED_MCC
                                    AUTH_RULE -> Known.AUTH_RULE
                                    CARD_CLOSED -> Known.CARD_CLOSED
                                    CARD_CRYPTOGRAM_VALIDATION_FAILURE ->
                                        Known.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                                    CARD_EXPIRED -> Known.CARD_EXPIRED
                                    CARD_EXPIRY_DATE_INCORRECT -> Known.CARD_EXPIRY_DATE_INCORRECT
                                    CARD_INVALID -> Known.CARD_INVALID
                                    CARD_NOT_ACTIVATED -> Known.CARD_NOT_ACTIVATED
                                    CARD_PAUSED -> Known.CARD_PAUSED
                                    CARD_PIN_INCORRECT -> Known.CARD_PIN_INCORRECT
                                    CARD_RESTRICTED -> Known.CARD_RESTRICTED
                                    CARD_SECURITY_CODE_INCORRECT ->
                                        Known.CARD_SECURITY_CODE_INCORRECT
                                    CARD_SPEND_LIMIT_EXCEEDED -> Known.CARD_SPEND_LIMIT_EXCEEDED
                                    CONTACT_CARD_ISSUER -> Known.CONTACT_CARD_ISSUER
                                    CUSTOMER_ASA_TIMEOUT -> Known.CUSTOMER_ASA_TIMEOUT
                                    CUSTOM_ASA_RESULT -> Known.CUSTOM_ASA_RESULT
                                    DECLINED -> Known.DECLINED
                                    DO_NOT_HONOR -> Known.DO_NOT_HONOR
                                    DRIVER_NUMBER_INVALID -> Known.DRIVER_NUMBER_INVALID
                                    FORMAT_ERROR -> Known.FORMAT_ERROR
                                    INSUFFICIENT_FUNDING_SOURCE_BALANCE ->
                                        Known.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                                    LITHIC_SYSTEM_ERROR -> Known.LITHIC_SYSTEM_ERROR
                                    LITHIC_SYSTEM_RATE_LIMIT -> Known.LITHIC_SYSTEM_RATE_LIMIT
                                    MALFORMED_ASA_RESPONSE -> Known.MALFORMED_ASA_RESPONSE
                                    MERCHANT_INVALID -> Known.MERCHANT_INVALID
                                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                                        Known.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                                    MERCHANT_NOT_PERMITTED -> Known.MERCHANT_NOT_PERMITTED
                                    OVER_REVERSAL_ATTEMPTED -> Known.OVER_REVERSAL_ATTEMPTED
                                    PIN_BLOCKED -> Known.PIN_BLOCKED
                                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED ->
                                        Known.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                                    PROGRAM_SUSPENDED -> Known.PROGRAM_SUSPENDED
                                    PROGRAM_USAGE_RESTRICTION -> Known.PROGRAM_USAGE_RESTRICTION
                                    REVERSAL_UNMATCHED -> Known.REVERSAL_UNMATCHED
                                    SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                                    SINGLE_USE_CARD_REATTEMPTED -> Known.SINGLE_USE_CARD_REATTEMPTED
                                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                                    TRANSACTION_INVALID -> Known.TRANSACTION_INVALID
                                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                                        Known.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                                        Known.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                                    TRANSACTION_PREVIOUSLY_COMPLETED ->
                                        Known.TRANSACTION_PREVIOUSLY_COMPLETED
                                    UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                                    VEHICLE_NUMBER_INVALID -> Known.VEHICLE_NUMBER_INVALID
                                    CARDHOLDER_CHALLENGED -> Known.CARDHOLDER_CHALLENGED
                                    CARDHOLDER_CHALLENGE_FAILED -> Known.CARDHOLDER_CHALLENGE_FAILED
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown DetailedResult: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): DetailedResult = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is DetailedResult && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val DECLINE = of("DECLINE")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                DECLINE
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                DECLINE,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    DECLINE -> Value.DECLINE
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    DECLINE -> Known.DECLINE
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DeclineActionAuthorization &&
                                code == other.code &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(code, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DeclineActionAuthorization{code=$code, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ChallengeActionAuthorization
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of()
                        ) : this(type, mutableMapOf())

                        /**
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * [ChallengeActionAuthorization].
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ChallengeActionAuthorization]. */
                        class Builder internal constructor() {

                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(
                                challengeActionAuthorization: ChallengeActionAuthorization
                            ) = apply {
                                type = challengeActionAuthorization.type
                                additionalProperties =
                                    challengeActionAuthorization.additionalProperties.toMutableMap()
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChallengeActionAuthorization].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChallengeActionAuthorization =
                                ChallengeActionAuthorization(
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChallengeActionAuthorization = apply {
                            if (validated) {
                                return@apply
                            }

                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val CHALLENGE = of("CHALLENGE")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                CHALLENGE
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                CHALLENGE,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    CHALLENGE -> Value.CHALLENGE
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    CHALLENGE -> Known.CHALLENGE
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChallengeActionAuthorization &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChallengeActionAuthorization{type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ResultAuthentication3dsAction
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonField<Authentication3dsAction>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Authentication3dsAction> = JsonMissing.of()
                        ) : this(type, mutableMapOf())

                        /**
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Authentication3dsAction = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type")
                        @ExcludeMissing
                        fun _type(): JsonField<Authentication3dsAction> = type

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
                             * [ResultAuthentication3dsAction].
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ResultAuthentication3dsAction]. */
                        class Builder internal constructor() {

                            private var type: JsonField<Authentication3dsAction>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(
                                resultAuthentication3dsAction: ResultAuthentication3dsAction
                            ) = apply {
                                type = resultAuthentication3dsAction.type
                                additionalProperties =
                                    resultAuthentication3dsAction.additionalProperties
                                        .toMutableMap()
                            }

                            fun type(type: Authentication3dsAction) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed
                             * [Authentication3dsAction] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Authentication3dsAction>) = apply {
                                this.type = type
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ResultAuthentication3dsAction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ResultAuthentication3dsAction =
                                ResultAuthentication3dsAction(
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ResultAuthentication3dsAction = apply {
                            if (validated) {
                                return@apply
                            }

                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

                        class Authentication3dsAction
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val DECLINE = of("DECLINE")

                                @JvmField val CHALLENGE = of("CHALLENGE")

                                @JvmStatic
                                fun of(value: String) = Authentication3dsAction(JsonField.of(value))
                            }

                            /** An enum containing [Authentication3dsAction]'s known values. */
                            enum class Known {
                                DECLINE,
                                CHALLENGE,
                            }

                            /**
                             * An enum containing [Authentication3dsAction]'s known values, as well
                             * as an [_UNKNOWN] member.
                             *
                             * An instance of [Authentication3dsAction] can contain an unknown value
                             * in a couple of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                DECLINE,
                                CHALLENGE,
                                /**
                                 * An enum member indicating that [Authentication3dsAction] was
                                 * instantiated with an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    DECLINE -> Value.DECLINE
                                    CHALLENGE -> Value.CHALLENGE
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    DECLINE -> Known.DECLINE
                                    CHALLENGE -> Known.CHALLENGE
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Authentication3dsAction: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Authentication3dsAction = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Authentication3dsAction && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ResultAuthentication3dsAction &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ResultAuthentication3dsAction{type=$type, additionalProperties=$additionalProperties}"
                    }

                    class DeclineActionTokenization
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonField<Type>,
                        private val reason: JsonField<Reason>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                            @JsonProperty("reason")
                            @ExcludeMissing
                            reason: JsonField<Reason> = JsonMissing.of(),
                        ) : this(type, reason, mutableMapOf())

                        /**
                         * Decline the tokenization request
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Reason code for declining the tokenization request
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun reason(): Optional<Reason> = reason.getOptional("reason")

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                        /**
                         * Returns the raw JSON value of [reason].
                         *
                         * Unlike [reason], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("reason")
                        @ExcludeMissing
                        fun _reason(): JsonField<Reason> = reason

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
                             * [DeclineActionTokenization].
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [DeclineActionTokenization]. */
                        class Builder internal constructor() {

                            private var type: JsonField<Type>? = null
                            private var reason: JsonField<Reason> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(
                                declineActionTokenization: DeclineActionTokenization
                            ) = apply {
                                type = declineActionTokenization.type
                                reason = declineActionTokenization.reason
                                additionalProperties =
                                    declineActionTokenization.additionalProperties.toMutableMap()
                            }

                            /** Decline the tokenization request */
                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            /** Reason code for declining the tokenization request */
                            fun reason(reason: Reason) = reason(JsonField.of(reason))

                            /**
                             * Sets [Builder.reason] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.reason] with a well-typed [Reason]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [DeclineActionTokenization].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): DeclineActionTokenization =
                                DeclineActionTokenization(
                                    checkRequired("type", type),
                                    reason,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): DeclineActionTokenization = apply {
                            if (validated) {
                                return@apply
                            }

                            type().validate()
                            reason().ifPresent { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                                (reason.asKnown().getOrNull()?.validity() ?: 0)

                        /** Decline the tokenization request */
                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val DECLINE = of("DECLINE")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                DECLINE
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                DECLINE,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    DECLINE -> Value.DECLINE
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    DECLINE -> Known.DECLINE
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        /** Reason code for declining the tokenization request */
                        class Reason
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val ACCOUNT_SCORE_1 = of("ACCOUNT_SCORE_1")

                                @JvmField val DEVICE_SCORE_1 = of("DEVICE_SCORE_1")

                                @JvmField
                                val ALL_WALLET_DECLINE_REASONS_PRESENT =
                                    of("ALL_WALLET_DECLINE_REASONS_PRESENT")

                                @JvmField
                                val WALLET_RECOMMENDED_DECISION_RED =
                                    of("WALLET_RECOMMENDED_DECISION_RED")

                                @JvmField val CVC_MISMATCH = of("CVC_MISMATCH")

                                @JvmField
                                val CARD_EXPIRY_MONTH_MISMATCH = of("CARD_EXPIRY_MONTH_MISMATCH")

                                @JvmField
                                val CARD_EXPIRY_YEAR_MISMATCH = of("CARD_EXPIRY_YEAR_MISMATCH")

                                @JvmField val CARD_INVALID_STATE = of("CARD_INVALID_STATE")

                                @JvmField val CUSTOMER_RED_PATH = of("CUSTOMER_RED_PATH")

                                @JvmField
                                val INVALID_CUSTOMER_RESPONSE = of("INVALID_CUSTOMER_RESPONSE")

                                @JvmField val NETWORK_FAILURE = of("NETWORK_FAILURE")

                                @JvmField val GENERIC_DECLINE = of("GENERIC_DECLINE")

                                @JvmField
                                val DIGITAL_CARD_ART_REQUIRED = of("DIGITAL_CARD_ART_REQUIRED")

                                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                            }

                            /** An enum containing [Reason]'s known values. */
                            enum class Known {
                                ACCOUNT_SCORE_1,
                                DEVICE_SCORE_1,
                                ALL_WALLET_DECLINE_REASONS_PRESENT,
                                WALLET_RECOMMENDED_DECISION_RED,
                                CVC_MISMATCH,
                                CARD_EXPIRY_MONTH_MISMATCH,
                                CARD_EXPIRY_YEAR_MISMATCH,
                                CARD_INVALID_STATE,
                                CUSTOMER_RED_PATH,
                                INVALID_CUSTOMER_RESPONSE,
                                NETWORK_FAILURE,
                                GENERIC_DECLINE,
                                DIGITAL_CARD_ART_REQUIRED,
                            }

                            /**
                             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Reason] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                ACCOUNT_SCORE_1,
                                DEVICE_SCORE_1,
                                ALL_WALLET_DECLINE_REASONS_PRESENT,
                                WALLET_RECOMMENDED_DECISION_RED,
                                CVC_MISMATCH,
                                CARD_EXPIRY_MONTH_MISMATCH,
                                CARD_EXPIRY_YEAR_MISMATCH,
                                CARD_INVALID_STATE,
                                CUSTOMER_RED_PATH,
                                INVALID_CUSTOMER_RESPONSE,
                                NETWORK_FAILURE,
                                GENERIC_DECLINE,
                                DIGITAL_CARD_ART_REQUIRED,
                                /**
                                 * An enum member indicating that [Reason] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    ACCOUNT_SCORE_1 -> Value.ACCOUNT_SCORE_1
                                    DEVICE_SCORE_1 -> Value.DEVICE_SCORE_1
                                    ALL_WALLET_DECLINE_REASONS_PRESENT ->
                                        Value.ALL_WALLET_DECLINE_REASONS_PRESENT
                                    WALLET_RECOMMENDED_DECISION_RED ->
                                        Value.WALLET_RECOMMENDED_DECISION_RED
                                    CVC_MISMATCH -> Value.CVC_MISMATCH
                                    CARD_EXPIRY_MONTH_MISMATCH -> Value.CARD_EXPIRY_MONTH_MISMATCH
                                    CARD_EXPIRY_YEAR_MISMATCH -> Value.CARD_EXPIRY_YEAR_MISMATCH
                                    CARD_INVALID_STATE -> Value.CARD_INVALID_STATE
                                    CUSTOMER_RED_PATH -> Value.CUSTOMER_RED_PATH
                                    INVALID_CUSTOMER_RESPONSE -> Value.INVALID_CUSTOMER_RESPONSE
                                    NETWORK_FAILURE -> Value.NETWORK_FAILURE
                                    GENERIC_DECLINE -> Value.GENERIC_DECLINE
                                    DIGITAL_CARD_ART_REQUIRED -> Value.DIGITAL_CARD_ART_REQUIRED
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    ACCOUNT_SCORE_1 -> Known.ACCOUNT_SCORE_1
                                    DEVICE_SCORE_1 -> Known.DEVICE_SCORE_1
                                    ALL_WALLET_DECLINE_REASONS_PRESENT ->
                                        Known.ALL_WALLET_DECLINE_REASONS_PRESENT
                                    WALLET_RECOMMENDED_DECISION_RED ->
                                        Known.WALLET_RECOMMENDED_DECISION_RED
                                    CVC_MISMATCH -> Known.CVC_MISMATCH
                                    CARD_EXPIRY_MONTH_MISMATCH -> Known.CARD_EXPIRY_MONTH_MISMATCH
                                    CARD_EXPIRY_YEAR_MISMATCH -> Known.CARD_EXPIRY_YEAR_MISMATCH
                                    CARD_INVALID_STATE -> Known.CARD_INVALID_STATE
                                    CUSTOMER_RED_PATH -> Known.CUSTOMER_RED_PATH
                                    INVALID_CUSTOMER_RESPONSE -> Known.INVALID_CUSTOMER_RESPONSE
                                    NETWORK_FAILURE -> Known.NETWORK_FAILURE
                                    GENERIC_DECLINE -> Known.GENERIC_DECLINE
                                    DIGITAL_CARD_ART_REQUIRED -> Known.DIGITAL_CARD_ART_REQUIRED
                                    else ->
                                        throw LithicInvalidDataException("Unknown Reason: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Reason = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Reason && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DeclineActionTokenization &&
                                type == other.type &&
                                reason == other.reason &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, reason, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DeclineActionTokenization{type=$type, reason=$reason, additionalProperties=$additionalProperties}"
                    }

                    class RequireTfaAction
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonField<Type>,
                        private val reason: JsonField<Reason>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                            @JsonProperty("reason")
                            @ExcludeMissing
                            reason: JsonField<Reason> = JsonMissing.of(),
                        ) : this(type, reason, mutableMapOf())

                        /**
                         * Require two-factor authentication for the tokenization request
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Reason code for requiring two-factor authentication
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun reason(): Optional<Reason> = reason.getOptional("reason")

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                        /**
                         * Returns the raw JSON value of [reason].
                         *
                         * Unlike [reason], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("reason")
                        @ExcludeMissing
                        fun _reason(): JsonField<Reason> = reason

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
                             * [RequireTfaAction].
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [RequireTfaAction]. */
                        class Builder internal constructor() {

                            private var type: JsonField<Type>? = null
                            private var reason: JsonField<Reason> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(requireTfaAction: RequireTfaAction) = apply {
                                type = requireTfaAction.type
                                reason = requireTfaAction.reason
                                additionalProperties =
                                    requireTfaAction.additionalProperties.toMutableMap()
                            }

                            /** Require two-factor authentication for the tokenization request */
                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            /** Reason code for requiring two-factor authentication */
                            fun reason(reason: Reason) = reason(JsonField.of(reason))

                            /**
                             * Sets [Builder.reason] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.reason] with a well-typed [Reason]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [RequireTfaAction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): RequireTfaAction =
                                RequireTfaAction(
                                    checkRequired("type", type),
                                    reason,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): RequireTfaAction = apply {
                            if (validated) {
                                return@apply
                            }

                            type().validate()
                            reason().ifPresent { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                                (reason.asKnown().getOrNull()?.validity() ?: 0)

                        /** Require two-factor authentication for the tokenization request */
                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val REQUIRE_TFA = of("REQUIRE_TFA")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                REQUIRE_TFA
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                REQUIRE_TFA,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    REQUIRE_TFA -> Value.REQUIRE_TFA
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    REQUIRE_TFA -> Known.REQUIRE_TFA
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        /** Reason code for requiring two-factor authentication */
                        class Reason
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val WALLET_RECOMMENDED_TFA = of("WALLET_RECOMMENDED_TFA")

                                @JvmField val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

                                @JvmField val DEVICE_RECENTLY_LOST = of("DEVICE_RECENTLY_LOST")

                                @JvmField
                                val TOO_MANY_RECENT_ATTEMPTS = of("TOO_MANY_RECENT_ATTEMPTS")

                                @JvmField val TOO_MANY_RECENT_TOKENS = of("TOO_MANY_RECENT_TOKENS")

                                @JvmField
                                val TOO_MANY_DIFFERENT_CARDHOLDERS =
                                    of("TOO_MANY_DIFFERENT_CARDHOLDERS")

                                @JvmField val OUTSIDE_HOME_TERRITORY = of("OUTSIDE_HOME_TERRITORY")

                                @JvmField val HAS_SUSPENDED_TOKENS = of("HAS_SUSPENDED_TOKENS")

                                @JvmField val HIGH_RISK = of("HIGH_RISK")

                                @JvmField val ACCOUNT_SCORE_LOW = of("ACCOUNT_SCORE_LOW")

                                @JvmField val DEVICE_SCORE_LOW = of("DEVICE_SCORE_LOW")

                                @JvmField val CARD_STATE_TFA = of("CARD_STATE_TFA")

                                @JvmField val HARDCODED_TFA = of("HARDCODED_TFA")

                                @JvmField val CUSTOMER_RULE_TFA = of("CUSTOMER_RULE_TFA")

                                @JvmField
                                val DEVICE_HOST_CARD_EMULATION = of("DEVICE_HOST_CARD_EMULATION")

                                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                            }

                            /** An enum containing [Reason]'s known values. */
                            enum class Known {
                                WALLET_RECOMMENDED_TFA,
                                SUSPICIOUS_ACTIVITY,
                                DEVICE_RECENTLY_LOST,
                                TOO_MANY_RECENT_ATTEMPTS,
                                TOO_MANY_RECENT_TOKENS,
                                TOO_MANY_DIFFERENT_CARDHOLDERS,
                                OUTSIDE_HOME_TERRITORY,
                                HAS_SUSPENDED_TOKENS,
                                HIGH_RISK,
                                ACCOUNT_SCORE_LOW,
                                DEVICE_SCORE_LOW,
                                CARD_STATE_TFA,
                                HARDCODED_TFA,
                                CUSTOMER_RULE_TFA,
                                DEVICE_HOST_CARD_EMULATION,
                            }

                            /**
                             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Reason] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                WALLET_RECOMMENDED_TFA,
                                SUSPICIOUS_ACTIVITY,
                                DEVICE_RECENTLY_LOST,
                                TOO_MANY_RECENT_ATTEMPTS,
                                TOO_MANY_RECENT_TOKENS,
                                TOO_MANY_DIFFERENT_CARDHOLDERS,
                                OUTSIDE_HOME_TERRITORY,
                                HAS_SUSPENDED_TOKENS,
                                HIGH_RISK,
                                ACCOUNT_SCORE_LOW,
                                DEVICE_SCORE_LOW,
                                CARD_STATE_TFA,
                                HARDCODED_TFA,
                                CUSTOMER_RULE_TFA,
                                DEVICE_HOST_CARD_EMULATION,
                                /**
                                 * An enum member indicating that [Reason] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    WALLET_RECOMMENDED_TFA -> Value.WALLET_RECOMMENDED_TFA
                                    SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
                                    DEVICE_RECENTLY_LOST -> Value.DEVICE_RECENTLY_LOST
                                    TOO_MANY_RECENT_ATTEMPTS -> Value.TOO_MANY_RECENT_ATTEMPTS
                                    TOO_MANY_RECENT_TOKENS -> Value.TOO_MANY_RECENT_TOKENS
                                    TOO_MANY_DIFFERENT_CARDHOLDERS ->
                                        Value.TOO_MANY_DIFFERENT_CARDHOLDERS
                                    OUTSIDE_HOME_TERRITORY -> Value.OUTSIDE_HOME_TERRITORY
                                    HAS_SUSPENDED_TOKENS -> Value.HAS_SUSPENDED_TOKENS
                                    HIGH_RISK -> Value.HIGH_RISK
                                    ACCOUNT_SCORE_LOW -> Value.ACCOUNT_SCORE_LOW
                                    DEVICE_SCORE_LOW -> Value.DEVICE_SCORE_LOW
                                    CARD_STATE_TFA -> Value.CARD_STATE_TFA
                                    HARDCODED_TFA -> Value.HARDCODED_TFA
                                    CUSTOMER_RULE_TFA -> Value.CUSTOMER_RULE_TFA
                                    DEVICE_HOST_CARD_EMULATION -> Value.DEVICE_HOST_CARD_EMULATION
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    WALLET_RECOMMENDED_TFA -> Known.WALLET_RECOMMENDED_TFA
                                    SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
                                    DEVICE_RECENTLY_LOST -> Known.DEVICE_RECENTLY_LOST
                                    TOO_MANY_RECENT_ATTEMPTS -> Known.TOO_MANY_RECENT_ATTEMPTS
                                    TOO_MANY_RECENT_TOKENS -> Known.TOO_MANY_RECENT_TOKENS
                                    TOO_MANY_DIFFERENT_CARDHOLDERS ->
                                        Known.TOO_MANY_DIFFERENT_CARDHOLDERS
                                    OUTSIDE_HOME_TERRITORY -> Known.OUTSIDE_HOME_TERRITORY
                                    HAS_SUSPENDED_TOKENS -> Known.HAS_SUSPENDED_TOKENS
                                    HIGH_RISK -> Known.HIGH_RISK
                                    ACCOUNT_SCORE_LOW -> Known.ACCOUNT_SCORE_LOW
                                    DEVICE_SCORE_LOW -> Known.DEVICE_SCORE_LOW
                                    CARD_STATE_TFA -> Known.CARD_STATE_TFA
                                    HARDCODED_TFA -> Known.HARDCODED_TFA
                                    CUSTOMER_RULE_TFA -> Known.CUSTOMER_RULE_TFA
                                    DEVICE_HOST_CARD_EMULATION -> Known.DEVICE_HOST_CARD_EMULATION
                                    else ->
                                        throw LithicInvalidDataException("Unknown Reason: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Reason = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Reason && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RequireTfaAction &&
                                type == other.type &&
                                reason == other.reason &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, reason, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "RequireTfaAction{type=$type, reason=$reason, additionalProperties=$additionalProperties}"
                    }

                    class ApproveActionAch
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of()
                        ) : this(type, mutableMapOf())

                        /**
                         * Approve the ACH transaction
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * [ApproveActionAch].
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ApproveActionAch]. */
                        class Builder internal constructor() {

                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(approveActionAch: ApproveActionAch) = apply {
                                type = approveActionAch.type
                                additionalProperties =
                                    approveActionAch.additionalProperties.toMutableMap()
                            }

                            /** Approve the ACH transaction */
                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ApproveActionAch].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ApproveActionAch =
                                ApproveActionAch(
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ApproveActionAch = apply {
                            if (validated) {
                                return@apply
                            }

                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

                        /** Approve the ACH transaction */
                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val APPROVE = of("APPROVE")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                APPROVE
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                APPROVE,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    APPROVE -> Value.APPROVE
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    APPROVE -> Known.APPROVE
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ApproveActionAch &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ApproveActionAch{type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ReturnAction
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val code: JsonField<Code>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("code")
                            @ExcludeMissing
                            code: JsonField<Code> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(code, type, mutableMapOf())

                        /**
                         * NACHA return code to use when returning the transaction. Note that the
                         * list of available return codes is subject to an allowlist configured at
                         * the program level
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun code(): Code = code.getRequired("code")

                        /**
                         * Return the ACH transaction
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [code].
                         *
                         * Unlike [code], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * [ReturnAction].
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ReturnAction]. */
                        class Builder internal constructor() {

                            private var code: JsonField<Code>? = null
                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(returnAction: ReturnAction) = apply {
                                code = returnAction.code
                                type = returnAction.type
                                additionalProperties =
                                    returnAction.additionalProperties.toMutableMap()
                            }

                            /**
                             * NACHA return code to use when returning the transaction. Note that
                             * the list of available return codes is subject to an allowlist
                             * configured at the program level
                             */
                            fun code(code: Code) = code(JsonField.of(code))

                            /**
                             * Sets [Builder.code] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.code] with a well-typed [Code] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun code(code: JsonField<Code>) = apply { this.code = code }

                            /** Return the ACH transaction */
                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ReturnAction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ReturnAction =
                                ReturnAction(
                                    checkRequired("code", code),
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ReturnAction = apply {
                            if (validated) {
                                return@apply
                            }

                            code().validate()
                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (code.asKnown().getOrNull()?.validity() ?: 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * NACHA return code to use when returning the transaction. Note that the
                         * list of available return codes is subject to an allowlist configured at
                         * the program level
                         */
                        class Code
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val R01 = of("R01")

                                @JvmField val R02 = of("R02")

                                @JvmField val R03 = of("R03")

                                @JvmField val R04 = of("R04")

                                @JvmField val R05 = of("R05")

                                @JvmField val R06 = of("R06")

                                @JvmField val R07 = of("R07")

                                @JvmField val R08 = of("R08")

                                @JvmField val R09 = of("R09")

                                @JvmField val R10 = of("R10")

                                @JvmField val R11 = of("R11")

                                @JvmField val R12 = of("R12")

                                @JvmField val R13 = of("R13")

                                @JvmField val R14 = of("R14")

                                @JvmField val R15 = of("R15")

                                @JvmField val R16 = of("R16")

                                @JvmField val R17 = of("R17")

                                @JvmField val R18 = of("R18")

                                @JvmField val R19 = of("R19")

                                @JvmField val R20 = of("R20")

                                @JvmField val R21 = of("R21")

                                @JvmField val R22 = of("R22")

                                @JvmField val R23 = of("R23")

                                @JvmField val R24 = of("R24")

                                @JvmField val R25 = of("R25")

                                @JvmField val R26 = of("R26")

                                @JvmField val R27 = of("R27")

                                @JvmField val R28 = of("R28")

                                @JvmField val R29 = of("R29")

                                @JvmField val R30 = of("R30")

                                @JvmField val R31 = of("R31")

                                @JvmField val R32 = of("R32")

                                @JvmField val R33 = of("R33")

                                @JvmField val R34 = of("R34")

                                @JvmField val R35 = of("R35")

                                @JvmField val R36 = of("R36")

                                @JvmField val R37 = of("R37")

                                @JvmField val R38 = of("R38")

                                @JvmField val R39 = of("R39")

                                @JvmField val R40 = of("R40")

                                @JvmField val R41 = of("R41")

                                @JvmField val R42 = of("R42")

                                @JvmField val R43 = of("R43")

                                @JvmField val R44 = of("R44")

                                @JvmField val R45 = of("R45")

                                @JvmField val R46 = of("R46")

                                @JvmField val R47 = of("R47")

                                @JvmField val R50 = of("R50")

                                @JvmField val R51 = of("R51")

                                @JvmField val R52 = of("R52")

                                @JvmField val R53 = of("R53")

                                @JvmField val R61 = of("R61")

                                @JvmField val R62 = of("R62")

                                @JvmField val R67 = of("R67")

                                @JvmField val R68 = of("R68")

                                @JvmField val R69 = of("R69")

                                @JvmField val R70 = of("R70")

                                @JvmField val R71 = of("R71")

                                @JvmField val R72 = of("R72")

                                @JvmField val R73 = of("R73")

                                @JvmField val R74 = of("R74")

                                @JvmField val R75 = of("R75")

                                @JvmField val R76 = of("R76")

                                @JvmField val R77 = of("R77")

                                @JvmField val R80 = of("R80")

                                @JvmField val R81 = of("R81")

                                @JvmField val R82 = of("R82")

                                @JvmField val R83 = of("R83")

                                @JvmField val R84 = of("R84")

                                @JvmField val R85 = of("R85")

                                @JvmStatic fun of(value: String) = Code(JsonField.of(value))
                            }

                            /** An enum containing [Code]'s known values. */
                            enum class Known {
                                R01,
                                R02,
                                R03,
                                R04,
                                R05,
                                R06,
                                R07,
                                R08,
                                R09,
                                R10,
                                R11,
                                R12,
                                R13,
                                R14,
                                R15,
                                R16,
                                R17,
                                R18,
                                R19,
                                R20,
                                R21,
                                R22,
                                R23,
                                R24,
                                R25,
                                R26,
                                R27,
                                R28,
                                R29,
                                R30,
                                R31,
                                R32,
                                R33,
                                R34,
                                R35,
                                R36,
                                R37,
                                R38,
                                R39,
                                R40,
                                R41,
                                R42,
                                R43,
                                R44,
                                R45,
                                R46,
                                R47,
                                R50,
                                R51,
                                R52,
                                R53,
                                R61,
                                R62,
                                R67,
                                R68,
                                R69,
                                R70,
                                R71,
                                R72,
                                R73,
                                R74,
                                R75,
                                R76,
                                R77,
                                R80,
                                R81,
                                R82,
                                R83,
                                R84,
                                R85,
                            }

                            /**
                             * An enum containing [Code]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Code] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                R01,
                                R02,
                                R03,
                                R04,
                                R05,
                                R06,
                                R07,
                                R08,
                                R09,
                                R10,
                                R11,
                                R12,
                                R13,
                                R14,
                                R15,
                                R16,
                                R17,
                                R18,
                                R19,
                                R20,
                                R21,
                                R22,
                                R23,
                                R24,
                                R25,
                                R26,
                                R27,
                                R28,
                                R29,
                                R30,
                                R31,
                                R32,
                                R33,
                                R34,
                                R35,
                                R36,
                                R37,
                                R38,
                                R39,
                                R40,
                                R41,
                                R42,
                                R43,
                                R44,
                                R45,
                                R46,
                                R47,
                                R50,
                                R51,
                                R52,
                                R53,
                                R61,
                                R62,
                                R67,
                                R68,
                                R69,
                                R70,
                                R71,
                                R72,
                                R73,
                                R74,
                                R75,
                                R76,
                                R77,
                                R80,
                                R81,
                                R82,
                                R83,
                                R84,
                                R85,
                                /**
                                 * An enum member indicating that [Code] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    R01 -> Value.R01
                                    R02 -> Value.R02
                                    R03 -> Value.R03
                                    R04 -> Value.R04
                                    R05 -> Value.R05
                                    R06 -> Value.R06
                                    R07 -> Value.R07
                                    R08 -> Value.R08
                                    R09 -> Value.R09
                                    R10 -> Value.R10
                                    R11 -> Value.R11
                                    R12 -> Value.R12
                                    R13 -> Value.R13
                                    R14 -> Value.R14
                                    R15 -> Value.R15
                                    R16 -> Value.R16
                                    R17 -> Value.R17
                                    R18 -> Value.R18
                                    R19 -> Value.R19
                                    R20 -> Value.R20
                                    R21 -> Value.R21
                                    R22 -> Value.R22
                                    R23 -> Value.R23
                                    R24 -> Value.R24
                                    R25 -> Value.R25
                                    R26 -> Value.R26
                                    R27 -> Value.R27
                                    R28 -> Value.R28
                                    R29 -> Value.R29
                                    R30 -> Value.R30
                                    R31 -> Value.R31
                                    R32 -> Value.R32
                                    R33 -> Value.R33
                                    R34 -> Value.R34
                                    R35 -> Value.R35
                                    R36 -> Value.R36
                                    R37 -> Value.R37
                                    R38 -> Value.R38
                                    R39 -> Value.R39
                                    R40 -> Value.R40
                                    R41 -> Value.R41
                                    R42 -> Value.R42
                                    R43 -> Value.R43
                                    R44 -> Value.R44
                                    R45 -> Value.R45
                                    R46 -> Value.R46
                                    R47 -> Value.R47
                                    R50 -> Value.R50
                                    R51 -> Value.R51
                                    R52 -> Value.R52
                                    R53 -> Value.R53
                                    R61 -> Value.R61
                                    R62 -> Value.R62
                                    R67 -> Value.R67
                                    R68 -> Value.R68
                                    R69 -> Value.R69
                                    R70 -> Value.R70
                                    R71 -> Value.R71
                                    R72 -> Value.R72
                                    R73 -> Value.R73
                                    R74 -> Value.R74
                                    R75 -> Value.R75
                                    R76 -> Value.R76
                                    R77 -> Value.R77
                                    R80 -> Value.R80
                                    R81 -> Value.R81
                                    R82 -> Value.R82
                                    R83 -> Value.R83
                                    R84 -> Value.R84
                                    R85 -> Value.R85
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    R01 -> Known.R01
                                    R02 -> Known.R02
                                    R03 -> Known.R03
                                    R04 -> Known.R04
                                    R05 -> Known.R05
                                    R06 -> Known.R06
                                    R07 -> Known.R07
                                    R08 -> Known.R08
                                    R09 -> Known.R09
                                    R10 -> Known.R10
                                    R11 -> Known.R11
                                    R12 -> Known.R12
                                    R13 -> Known.R13
                                    R14 -> Known.R14
                                    R15 -> Known.R15
                                    R16 -> Known.R16
                                    R17 -> Known.R17
                                    R18 -> Known.R18
                                    R19 -> Known.R19
                                    R20 -> Known.R20
                                    R21 -> Known.R21
                                    R22 -> Known.R22
                                    R23 -> Known.R23
                                    R24 -> Known.R24
                                    R25 -> Known.R25
                                    R26 -> Known.R26
                                    R27 -> Known.R27
                                    R28 -> Known.R28
                                    R29 -> Known.R29
                                    R30 -> Known.R30
                                    R31 -> Known.R31
                                    R32 -> Known.R32
                                    R33 -> Known.R33
                                    R34 -> Known.R34
                                    R35 -> Known.R35
                                    R36 -> Known.R36
                                    R37 -> Known.R37
                                    R38 -> Known.R38
                                    R39 -> Known.R39
                                    R40 -> Known.R40
                                    R41 -> Known.R41
                                    R42 -> Known.R42
                                    R43 -> Known.R43
                                    R44 -> Known.R44
                                    R45 -> Known.R45
                                    R46 -> Known.R46
                                    R47 -> Known.R47
                                    R50 -> Known.R50
                                    R51 -> Known.R51
                                    R52 -> Known.R52
                                    R53 -> Known.R53
                                    R61 -> Known.R61
                                    R62 -> Known.R62
                                    R67 -> Known.R67
                                    R68 -> Known.R68
                                    R69 -> Known.R69
                                    R70 -> Known.R70
                                    R71 -> Known.R71
                                    R72 -> Known.R72
                                    R73 -> Known.R73
                                    R74 -> Known.R74
                                    R75 -> Known.R75
                                    R76 -> Known.R76
                                    R77 -> Known.R77
                                    R80 -> Known.R80
                                    R81 -> Known.R81
                                    R82 -> Known.R82
                                    R83 -> Known.R83
                                    R84 -> Known.R84
                                    R85 -> Known.R85
                                    else -> throw LithicInvalidDataException("Unknown Code: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Code = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Code && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        /** Return the ACH transaction */
                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val RETURN = of("RETURN")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                RETURN
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                RETURN,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    RETURN -> Value.RETURN
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    RETURN -> Known.RETURN
                                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LithicInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            fun validate(): Type = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ReturnAction &&
                                code == other.code &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(code, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ReturnAction{code=$code, type=$type, additionalProperties=$additionalProperties}"
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Example &&
                        actions == other.actions &&
                        eventToken == other.eventToken &&
                        timestamp == other.timestamp &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(actions, eventToken, timestamp, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{actions=$actions, eventToken=$eventToken, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            /** The evaluation mode of this version during the reported period. */
            class State @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val ACTIVE = of("ACTIVE")

                    @JvmField val SHADOW = of("SHADOW")

                    @JvmField val INACTIVE = of("INACTIVE")

                    @JvmStatic fun of(value: String) = State(JsonField.of(value))
                }

                /** An enum containing [State]'s known values. */
                enum class Known {
                    ACTIVE,
                    SHADOW,
                    INACTIVE,
                }

                /**
                 * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [State] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVE,
                    SHADOW,
                    INACTIVE,
                    /**
                     * An enum member indicating that [State] was instantiated with an unknown
                     * value.
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
                        ACTIVE -> Value.ACTIVE
                        SHADOW -> Value.SHADOW
                        INACTIVE -> Value.INACTIVE
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
                        ACTIVE -> Known.ACTIVE
                        SHADOW -> Known.SHADOW
                        INACTIVE -> Known.INACTIVE
                        else -> throw LithicInvalidDataException("Unknown State: $value")
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

                fun validate(): State = apply {
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

                    return other is State && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReportStatsV2 &&
                    actionCounts == other.actionCounts &&
                    examples == other.examples &&
                    state == other.state &&
                    version == other.version &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(actionCounts, examples, state, version, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReportStatsV2{actionCounts=$actionCounts, examples=$examples, state=$state, version=$version, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DailyStatistic &&
                currentVersionStatistics == other.currentVersionStatistics &&
                date == other.date &&
                draftVersionStatistics == other.draftVersionStatistics &&
                versions == other.versions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currentVersionStatistics,
                date,
                draftVersionStatistics,
                versions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DailyStatistic{currentVersionStatistics=$currentVersionStatistics, date=$date, draftVersionStatistics=$draftVersionStatistics, versions=$versions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2RetrieveReportResponse &&
            authRuleToken == other.authRuleToken &&
            begin == other.begin &&
            dailyStatistics == other.dailyStatistics &&
            end == other.end &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authRuleToken, begin, dailyStatistics, end, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveReportResponse{authRuleToken=$authRuleToken, begin=$begin, dailyStatistics=$dailyStatistics, end=$end, additionalProperties=$additionalProperties}"
}
