// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a performance report for an Auth rule containing daily statistics and evaluation
 * outcomes.
 *
 * **Time Range Limitations:**
 * - Reports are supported for the past 3 months only
 * - Maximum interval length is 1 month
 * - Report data is available only through the previous day in UTC (current day data is not
 *   available)
 *
 * The report provides daily statistics for both current and draft versions of the Auth rule,
 * including approval, decline, and challenge counts along with sample events.
 */
class AuthRuleV2RetrieveReportParams
private constructor(
    private val authRuleToken: String?,
    private val begin: LocalDate,
    private val end: LocalDate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): Optional<String> = Optional.ofNullable(authRuleToken)

    /** Start date for the report */
    fun begin(): LocalDate = begin

    /** End date for the report */
    fun end(): LocalDate = end

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthRuleV2RetrieveReportParams].
         *
         * The following fields are required:
         * ```java
         * .begin()
         * .end()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2RetrieveReportParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var begin: LocalDate? = null
        private var end: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2RetrieveReportParams: AuthRuleV2RetrieveReportParams) = apply {
            authRuleToken = authRuleV2RetrieveReportParams.authRuleToken
            begin = authRuleV2RetrieveReportParams.begin
            end = authRuleV2RetrieveReportParams.end
            additionalHeaders = authRuleV2RetrieveReportParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2RetrieveReportParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String?) = apply { this.authRuleToken = authRuleToken }

        /** Alias for calling [Builder.authRuleToken] with `authRuleToken.orElse(null)`. */
        fun authRuleToken(authRuleToken: Optional<String>) =
            authRuleToken(authRuleToken.getOrNull())

        /** Start date for the report */
        fun begin(begin: LocalDate) = apply { this.begin = begin }

        /** End date for the report */
        fun end(end: LocalDate) = apply { this.end = end }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AuthRuleV2RetrieveReportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .begin()
         * .end()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2RetrieveReportParams =
            AuthRuleV2RetrieveReportParams(
                authRuleToken,
                checkRequired("begin", begin),
                checkRequired("end", end),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("begin", begin.toString())
                put("end", end.toString())
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleV2RetrieveReportParams &&
            authRuleToken == other.authRuleToken &&
            begin == other.begin &&
            end == other.end &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(authRuleToken, begin, end, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthRuleV2RetrieveReportParams{authRuleToken=$authRuleToken, begin=$begin, end=$end, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
