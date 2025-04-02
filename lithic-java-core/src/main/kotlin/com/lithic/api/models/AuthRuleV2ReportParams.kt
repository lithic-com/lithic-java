// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Requests a performance report of an authorization rule to be asynchronously generated. Reports
 * can only be run on rules in draft or active mode and will included approved and declined
 * statistics as well as examples. The generated report will be delivered asynchronously through a
 * webhook with `event_type` = `auth_rules.performance_report.created`. See the docs on setting up
 * [webhook subscriptions](https://docs.lithic.com/docs/events-api).
 *
 * Reports are generated based on data collected by Lithic's authorization processing system in the
 * trailing week. The performance of the auth rule will be assessed on the configuration of the auth
 * rule at the time the report is requested. This implies that if a performance report is requested,
 * right after updating an auth rule, depending on the number of authorizations processed for a card
 * program, it may be the case that no data is available for the report. Therefore Lithic recommends
 * to decouple making updates to an Auth Rule, and requesting performance reports.
 *
 * To make this concrete, consider the following example:
 * 1. At time `t`, a new Auth Rule is created, and applies to all authorizations on a card program.
 *    The Auth Rule has not yet been promoted, causing the draft version of the rule to be applied
 *    in shadow mode.
 * 2. At time `t + 1 hour` a performance report is requested for the Auth Rule. This performance
 *    report will _only_ contain data for the Auth Rule being executed in the window between `t` and
 *    `t + 1 hour`. This is because Lithic's transaction processing system will only start capturing
 *    data for the Auth Rule at the time it is created.
 * 3. At time `t + 2 hours` the draft version of the Auth Rule is promoted to the active version of
 *    the Auth Rule by calling the `/v2/auth_rules/{auth_rule_token}/promote` endpoint. If a
 *    performance report is requested at this moment it will still only contain data for this
 *    version of the rule, but the window of available data will now span from `t` to `t + 2 hours`.
 * 4. At time `t + 3 hours` a new version of the rule is drafted by calling the
 *    `/v2/auth_rules/{auth_rule_token}/draft` endpoint. If a performance report is requested right
 *    at this moment, it will only contain data for authorizations to which both the active version
 *    and the draft version is applied. Lithic does this to ensure that performance reports
 *    represent a fair comparison between rules. Because there may be no authorizations in this
 *    window, and because there may be some lag before data is available in a performance report,
 *    the requested performance report could contain no to little data.
 * 5. At time `t + 4 hours` another performance report is requested: this time the performance
 *    report will contain data from the window between `t + 3 hours` and `t + 4 hours`, for any
 *    authorizations to which both the current version of the authorization rule (in enforcing mode)
 *    and the draft version of the authorization rule (in shadow mode) applied.
 *
 * Note that generating a report may take up to 15 minutes and that delivery is not guaranteed.
 * Customers are required to have created an event subscription to receive the webhook.
 * Additionally, there is a delay of approximately 15 minutes between when Lithic's transaction
 * processing systems have processed the transaction, and when a transaction will be included in the
 * report.
 */
class AuthRuleV2ReportParams
private constructor(
    private val authRuleToken: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun authRuleToken(): String = authRuleToken

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2ReportParams].
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2ReportParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleV2ReportParams: AuthRuleV2ReportParams) = apply {
            authRuleToken = authRuleV2ReportParams.authRuleToken
            additionalHeaders = authRuleV2ReportParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2ReportParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                authRuleV2ReportParams.additionalBodyProperties.toMutableMap()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [AuthRuleV2ReportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2ReportParams =
            AuthRuleV2ReportParams(
                checkRequired("authRuleToken", authRuleToken),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ReportParams && authRuleToken == other.authRuleToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ReportParams{authRuleToken=$authRuleToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
