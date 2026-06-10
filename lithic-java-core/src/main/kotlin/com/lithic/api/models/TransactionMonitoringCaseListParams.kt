// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Lists transaction monitoring cases, optionally filtered. */
class TransactionMonitoringCaseListParams
private constructor(
    private val accountToken: String?,
    private val assignee: String?,
    private val begin: OffsetDateTime?,
    private val cardToken: String?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val entityToken: String?,
    private val pageSize: Long?,
    private val queueToken: String?,
    private val ruleToken: String?,
    private val sortBy: CaseSortOrder?,
    private val startingAfter: String?,
    private val status: CaseStatus?,
    private val transactionToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Only return cases that include transactions on the provided account. */
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /**
     * Only return cases assigned to the provided value. Pass an empty string to return only
     * unassigned cases.
     */
    fun assignee(): Optional<String> = Optional.ofNullable(assignee)

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    /** Only return cases that include transactions on the provided card. */
    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    /**
     * Date string in RFC 3339 format. Only entries created before the specified time will be
     * included. UTC time zone.
     */
    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /** Only return cases associated with the provided entity. */
    fun entityToken(): Optional<String> = Optional.ofNullable(entityToken)

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Only return cases belonging to the provided queue. */
    fun queueToken(): Optional<String> = Optional.ofNullable(queueToken)

    /** Only return cases triggered by the provided transaction monitoring rule. */
    fun ruleToken(): Optional<String> = Optional.ofNullable(ruleToken)

    /** Sort order for the returned cases. */
    fun sortBy(): Optional<CaseSortOrder> = Optional.ofNullable(sortBy)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Only return cases with the provided status. */
    fun status(): Optional<CaseStatus> = Optional.ofNullable(status)

    /** Only return cases that include the provided transaction. */
    fun transactionToken(): Optional<String> = Optional.ofNullable(transactionToken)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TransactionMonitoringCaseListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionMonitoringCaseListParams]. */
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var assignee: String? = null
        private var begin: OffsetDateTime? = null
        private var cardToken: String? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var entityToken: String? = null
        private var pageSize: Long? = null
        private var queueToken: String? = null
        private var ruleToken: String? = null
        private var sortBy: CaseSortOrder? = null
        private var startingAfter: String? = null
        private var status: CaseStatus? = null
        private var transactionToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseListParams: TransactionMonitoringCaseListParams
        ) = apply {
            accountToken = transactionMonitoringCaseListParams.accountToken
            assignee = transactionMonitoringCaseListParams.assignee
            begin = transactionMonitoringCaseListParams.begin
            cardToken = transactionMonitoringCaseListParams.cardToken
            end = transactionMonitoringCaseListParams.end
            endingBefore = transactionMonitoringCaseListParams.endingBefore
            entityToken = transactionMonitoringCaseListParams.entityToken
            pageSize = transactionMonitoringCaseListParams.pageSize
            queueToken = transactionMonitoringCaseListParams.queueToken
            ruleToken = transactionMonitoringCaseListParams.ruleToken
            sortBy = transactionMonitoringCaseListParams.sortBy
            startingAfter = transactionMonitoringCaseListParams.startingAfter
            status = transactionMonitoringCaseListParams.status
            transactionToken = transactionMonitoringCaseListParams.transactionToken
            additionalHeaders = transactionMonitoringCaseListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionMonitoringCaseListParams.additionalQueryParams.toBuilder()
        }

        /** Only return cases that include transactions on the provided account. */
        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        /**
         * Only return cases assigned to the provided value. Pass an empty string to return only
         * unassigned cases.
         */
        fun assignee(assignee: String?) = apply { this.assignee = assignee }

        /** Alias for calling [Builder.assignee] with `assignee.orElse(null)`. */
        fun assignee(assignee: Optional<String>) = assignee(assignee.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.getOrNull())

        /** Only return cases that include transactions on the provided card. */
        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /** Alias for calling [Builder.cardToken] with `cardToken.orElse(null)`. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<OffsetDateTime>) = end(end.getOrNull())

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /** Only return cases associated with the provided entity. */
        fun entityToken(entityToken: String?) = apply { this.entityToken = entityToken }

        /** Alias for calling [Builder.entityToken] with `entityToken.orElse(null)`. */
        fun entityToken(entityToken: Optional<String>) = entityToken(entityToken.getOrNull())

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Only return cases belonging to the provided queue. */
        fun queueToken(queueToken: String?) = apply { this.queueToken = queueToken }

        /** Alias for calling [Builder.queueToken] with `queueToken.orElse(null)`. */
        fun queueToken(queueToken: Optional<String>) = queueToken(queueToken.getOrNull())

        /** Only return cases triggered by the provided transaction monitoring rule. */
        fun ruleToken(ruleToken: String?) = apply { this.ruleToken = ruleToken }

        /** Alias for calling [Builder.ruleToken] with `ruleToken.orElse(null)`. */
        fun ruleToken(ruleToken: Optional<String>) = ruleToken(ruleToken.getOrNull())

        /** Sort order for the returned cases. */
        fun sortBy(sortBy: CaseSortOrder?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<CaseSortOrder>) = sortBy(sortBy.getOrNull())

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

        /** Only return cases with the provided status. */
        fun status(status: CaseStatus?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<CaseStatus>) = status(status.getOrNull())

        /** Only return cases that include the provided transaction. */
        fun transactionToken(transactionToken: String?) = apply {
            this.transactionToken = transactionToken
        }

        /** Alias for calling [Builder.transactionToken] with `transactionToken.orElse(null)`. */
        fun transactionToken(transactionToken: Optional<String>) =
            transactionToken(transactionToken.getOrNull())

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
         * Returns an immutable instance of [TransactionMonitoringCaseListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionMonitoringCaseListParams =
            TransactionMonitoringCaseListParams(
                accountToken,
                assignee,
                begin,
                cardToken,
                end,
                endingBefore,
                entityToken,
                pageSize,
                queueToken,
                ruleToken,
                sortBy,
                startingAfter,
                status,
                transactionToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountToken?.let { put("account_token", it) }
                assignee?.let { put("assignee", it) }
                begin?.let { put("begin", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                cardToken?.let { put("card_token", it) }
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                endingBefore?.let { put("ending_before", it) }
                entityToken?.let { put("entity_token", it) }
                pageSize?.let { put("page_size", it.toString()) }
                queueToken?.let { put("queue_token", it) }
                ruleToken?.let { put("rule_token", it) }
                sortBy?.let { put("sort_by", it.toString()) }
                startingAfter?.let { put("starting_after", it) }
                status?.let { put("status", it.toString()) }
                transactionToken?.let { put("transaction_token", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListParams &&
            accountToken == other.accountToken &&
            assignee == other.assignee &&
            begin == other.begin &&
            cardToken == other.cardToken &&
            end == other.end &&
            endingBefore == other.endingBefore &&
            entityToken == other.entityToken &&
            pageSize == other.pageSize &&
            queueToken == other.queueToken &&
            ruleToken == other.ruleToken &&
            sortBy == other.sortBy &&
            startingAfter == other.startingAfter &&
            status == other.status &&
            transactionToken == other.transactionToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountToken,
            assignee,
            begin,
            cardToken,
            end,
            endingBefore,
            entityToken,
            pageSize,
            queueToken,
            ruleToken,
            sortBy,
            startingAfter,
            status,
            transactionToken,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TransactionMonitoringCaseListParams{accountToken=$accountToken, assignee=$assignee, begin=$begin, cardToken=$cardToken, end=$end, endingBefore=$endingBefore, entityToken=$entityToken, pageSize=$pageSize, queueToken=$queueToken, ruleToken=$ruleToken, sortBy=$sortBy, startingAfter=$startingAfter, status=$status, transactionToken=$transactionToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
