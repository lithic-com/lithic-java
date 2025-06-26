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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V2RetrieveReportResponse
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
    private constructor(
        private val currentVersionStatistics: JsonField<RuleStats>,
        private val date: JsonField<LocalDate>,
        private val draftVersionStatistics: JsonField<RuleStats>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_version_statistics")
            @ExcludeMissing
            currentVersionStatistics: JsonField<RuleStats> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("draft_version_statistics")
            @ExcludeMissing
            draftVersionStatistics: JsonField<RuleStats> = JsonMissing.of(),
        ) : this(currentVersionStatistics, date, draftVersionStatistics, mutableMapOf())

        /**
         * Detailed statistics for the current version of the rule.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentVersionStatistics(): Optional<RuleStats> =
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
        fun draftVersionStatistics(): Optional<RuleStats> =
            draftVersionStatistics.getOptional("draft_version_statistics")

        /**
         * Returns the raw JSON value of [currentVersionStatistics].
         *
         * Unlike [currentVersionStatistics], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_version_statistics")
        @ExcludeMissing
        fun _currentVersionStatistics(): JsonField<RuleStats> = currentVersionStatistics

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
        fun _draftVersionStatistics(): JsonField<RuleStats> = draftVersionStatistics

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DailyStatistic]. */
        class Builder internal constructor() {

            private var currentVersionStatistics: JsonField<RuleStats>? = null
            private var date: JsonField<LocalDate>? = null
            private var draftVersionStatistics: JsonField<RuleStats>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dailyStatistic: DailyStatistic) = apply {
                currentVersionStatistics = dailyStatistic.currentVersionStatistics
                date = dailyStatistic.date
                draftVersionStatistics = dailyStatistic.draftVersionStatistics
                additionalProperties = dailyStatistic.additionalProperties.toMutableMap()
            }

            /** Detailed statistics for the current version of the rule. */
            fun currentVersionStatistics(currentVersionStatistics: RuleStats?) =
                currentVersionStatistics(JsonField.ofNullable(currentVersionStatistics))

            /**
             * Alias for calling [Builder.currentVersionStatistics] with
             * `currentVersionStatistics.orElse(null)`.
             */
            fun currentVersionStatistics(currentVersionStatistics: Optional<RuleStats>) =
                currentVersionStatistics(currentVersionStatistics.getOrNull())

            /**
             * Sets [Builder.currentVersionStatistics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentVersionStatistics] with a well-typed
             * [RuleStats] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun currentVersionStatistics(currentVersionStatistics: JsonField<RuleStats>) = apply {
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
            fun draftVersionStatistics(draftVersionStatistics: RuleStats?) =
                draftVersionStatistics(JsonField.ofNullable(draftVersionStatistics))

            /**
             * Alias for calling [Builder.draftVersionStatistics] with
             * `draftVersionStatistics.orElse(null)`.
             */
            fun draftVersionStatistics(draftVersionStatistics: Optional<RuleStats>) =
                draftVersionStatistics(draftVersionStatistics.getOrNull())

            /**
             * Sets [Builder.draftVersionStatistics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.draftVersionStatistics] with a well-typed
             * [RuleStats] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun draftVersionStatistics(draftVersionStatistics: JsonField<RuleStats>) = apply {
                this.draftVersionStatistics = draftVersionStatistics
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DailyStatistic =
                DailyStatistic(
                    checkRequired("currentVersionStatistics", currentVersionStatistics),
                    checkRequired("date", date),
                    checkRequired("draftVersionStatistics", draftVersionStatistics),
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
                (draftVersionStatistics.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DailyStatistic && currentVersionStatistics == other.currentVersionStatistics && date == other.date && draftVersionStatistics == other.draftVersionStatistics && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currentVersionStatistics, date, draftVersionStatistics, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DailyStatistic{currentVersionStatistics=$currentVersionStatistics, date=$date, draftVersionStatistics=$draftVersionStatistics, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2RetrieveReportResponse && authRuleToken == other.authRuleToken && begin == other.begin && dailyStatistics == other.dailyStatistics && end == other.end && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authRuleToken, begin, dailyStatistics, end, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveReportResponse{authRuleToken=$authRuleToken, begin=$begin, dailyStatistics=$dailyStatistics, end=$end, additionalProperties=$additionalProperties}"
}
