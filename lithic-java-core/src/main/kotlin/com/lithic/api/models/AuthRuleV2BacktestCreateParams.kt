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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Initiates a request to asynchronously generate a backtest for an authorization rule. During
 * backtesting, both the active version (if one exists) and the draft version of the Authorization
 * Rule are evaluated by replaying historical transaction data against the rule's conditions. This
 * process allows customers to simulate and understand the effects of proposed rule changes before
 * deployment. The generated backtest report provides detailed results showing whether the draft
 * version of the Auth Rule would have approved or declined historical transactions which were
 * processed during the backtest period. These reports help evaluate how changes to rule
 * configurations might affect overall transaction approval rates.
 *
 * The generated backtest report will be delivered asynchronously through a webhook with
 * `event_type` = `auth_rules.backtest_report.created`. See the docs on setting up
 * [webhook subscriptions](https://docs.lithic.com/docs/events-api). It is also possible to request
 * backtest reports on-demand through the
 * `/v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}` endpoint.
 *
 * Lithic currently supports backtesting for `CONDITIONAL_BLOCK` rules. Backtesting for
 * `VELOCITY_LIMIT` rules is generally not supported. In specific cases (i.e. where Lithic has
 * pre-calculated the requested velocity metrics for historical transactions), a backtest may be
 * feasible. However, such cases are uncommon and customers should not anticipate support for
 * velocity backtests under most configurations. If a historical transaction does not feature the
 * required inputs to evaluate the rule, then it will not be included in the final backtest report.
 */
class AuthRuleV2BacktestCreateParams
constructor(
    private val authRuleToken: String,
    private val body: AuthRuleV2BacktestCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun authRuleToken(): String = authRuleToken

    /** The end time of the backtest. */
    fun end(): Optional<OffsetDateTime> = body.end()

    /** The start time of the backtest. */
    fun start(): Optional<OffsetDateTime> = body.start()

    /** The end time of the backtest. */
    fun _end(): JsonField<OffsetDateTime> = body._end()

    /** The start time of the backtest. */
    fun _start(): JsonField<OffsetDateTime> = body._start()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AuthRuleV2BacktestCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AuthRuleV2BacktestCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("end")
        @ExcludeMissing
        private val end: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start")
        @ExcludeMissing
        private val start: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The end time of the backtest. */
        fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end.getNullable("end"))

        /** The start time of the backtest. */
        fun start(): Optional<OffsetDateTime> = Optional.ofNullable(start.getNullable("start"))

        /** The end time of the backtest. */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

        /** The start time of the backtest. */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AuthRuleV2BacktestCreateBody = apply {
            if (!validated) {
                end()
                start()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleV2BacktestCreateBody: AuthRuleV2BacktestCreateBody) = apply {
                end = authRuleV2BacktestCreateBody.end
                start = authRuleV2BacktestCreateBody.start
                additionalProperties =
                    authRuleV2BacktestCreateBody.additionalProperties.toMutableMap()
            }

            /** The end time of the backtest. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /** The end time of the backtest. */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

            /** The start time of the backtest. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /** The start time of the backtest. */
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

            fun build(): AuthRuleV2BacktestCreateBody =
                AuthRuleV2BacktestCreateBody(
                    end,
                    start,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2BacktestCreateBody && end == other.end && start == other.start && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthRuleV2BacktestCreateBody{end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var body: AuthRuleV2BacktestCreateBody.Builder =
            AuthRuleV2BacktestCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2BacktestCreateParams: AuthRuleV2BacktestCreateParams) = apply {
            authRuleToken = authRuleV2BacktestCreateParams.authRuleToken
            body = authRuleV2BacktestCreateParams.body.toBuilder()
            additionalHeaders = authRuleV2BacktestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2BacktestCreateParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /** The end time of the backtest. */
        fun end(end: OffsetDateTime) = apply { body.end(end) }

        /** The end time of the backtest. */
        fun end(end: JsonField<OffsetDateTime>) = apply { body.end(end) }

        /** The start time of the backtest. */
        fun start(start: OffsetDateTime) = apply { body.start(start) }

        /** The start time of the backtest. */
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

        fun build(): AuthRuleV2BacktestCreateParams =
            AuthRuleV2BacktestCreateParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2BacktestCreateParams && authRuleToken == other.authRuleToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2BacktestCreateParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
