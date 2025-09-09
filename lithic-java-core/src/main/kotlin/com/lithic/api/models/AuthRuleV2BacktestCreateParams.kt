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
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Initiates a request to asynchronously generate a backtest for an Auth rule. During backtesting,
 * both the active version (if one exists) and the draft version of the Auth Rule are evaluated by
 * replaying historical transaction data against the rule's conditions. This process allows
 * customers to simulate and understand the effects of proposed rule changes before deployment. The
 * generated backtest report provides detailed results showing whether the draft version of the Auth
 * Rule would have approved or declined historical transactions which were processed during the
 * backtest period. These reports help evaluate how changes to rule configurations might affect
 * overall transaction approval rates.
 *
 * The generated backtest report will be delivered asynchronously through a webhook with
 * `event_type` = `auth_rules.backtest_report.created`. See the docs on setting up
 * [webhook subscriptions](https://docs.lithic.com/docs/events-api). It is also possible to request
 * backtest reports on-demand through the
 * `/v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}` endpoint.
 *
 * Lithic currently supports backtesting for `CONDITIONAL_BLOCK` / `CONDITIONAL_ACTION` rules.
 * Backtesting for `VELOCITY_LIMIT` rules is generally not supported. In specific cases (i.e. where
 * Lithic has pre-calculated the requested velocity metrics for historical transactions), a backtest
 * may be feasible. However, such cases are uncommon and customers should not anticipate support for
 * velocity backtests under most configurations. If a historical transaction does not feature the
 * required inputs to evaluate the rule, then it will not be included in the final backtest report.
 */
class AuthRuleV2BacktestCreateParams
private constructor(
    private val authRuleToken: String?,
    private val body: BacktestRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): Optional<String> = Optional.ofNullable(authRuleToken)

    /**
     * The end time of the backtest.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun end(): Optional<OffsetDateTime> = body.end()

    /**
     * The start time of the backtest.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun start(): Optional<OffsetDateTime> = body.start()

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _end(): JsonField<OffsetDateTime> = body._end()

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _start(): JsonField<OffsetDateTime> = body._start()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuthRuleV2BacktestCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthRuleV2BacktestCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2BacktestCreateParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: BacktestRequest.Builder = BacktestRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2BacktestCreateParams: AuthRuleV2BacktestCreateParams) = apply {
            authRuleToken = authRuleV2BacktestCreateParams.authRuleToken
            body = authRuleV2BacktestCreateParams.body.toBuilder()
            additionalHeaders = authRuleV2BacktestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2BacktestCreateParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String?) = apply { this.authRuleToken = authRuleToken }

        /** Alias for calling [Builder.authRuleToken] with `authRuleToken.orElse(null)`. */
        fun authRuleToken(authRuleToken: Optional<String>) =
            authRuleToken(authRuleToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [end]
         * - [start]
         */
        fun body(body: BacktestRequest) = apply { this.body = body.toBuilder() }

        /** The end time of the backtest. */
        fun end(end: OffsetDateTime) = apply { body.end(end) }

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun end(end: JsonField<OffsetDateTime>) = apply { body.end(end) }

        /** The start time of the backtest. */
        fun start(start: OffsetDateTime) = apply { body.start(start) }

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { body.start(start) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AuthRuleV2BacktestCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRuleV2BacktestCreateParams =
            AuthRuleV2BacktestCreateParams(
                authRuleToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BacktestRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class BacktestRequest
    private constructor(
        private val end: JsonField<OffsetDateTime>,
        private val start: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(end, start, mutableMapOf())

        /**
         * The end time of the backtest.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun end(): Optional<OffsetDateTime> = end.getOptional("end")

        /**
         * The start time of the backtest.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<OffsetDateTime> = start.getOptional("start")

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

            /** Returns a mutable builder for constructing an instance of [BacktestRequest]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BacktestRequest]. */
        class Builder internal constructor() {

            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(backtestRequest: BacktestRequest) = apply {
                end = backtestRequest.end
                start = backtestRequest.start
                additionalProperties = backtestRequest.additionalProperties.toMutableMap()
            }

            /** The end time of the backtest. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

            /** The start time of the backtest. */
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
             * Returns an immutable instance of [BacktestRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BacktestRequest =
                BacktestRequest(end, start, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): BacktestRequest = apply {
            if (validated) {
                return@apply
            }

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
            (if (end.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BacktestRequest &&
                end == other.end &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BacktestRequest{end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleV2BacktestCreateParams &&
            authRuleToken == other.authRuleToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthRuleV2BacktestCreateParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
