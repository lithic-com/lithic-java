package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class DisputeListParams
constructor(
    private val transactionToken: String?,
    private val status: Status?,
    private val pageSize: Long?,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun transactionToken(): Optional<String> = Optional.ofNullable(transactionToken)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.transactionToken?.let { params.put("transaction_token", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeListParams &&
            this.transactionToken == other.transactionToken &&
            this.status == other.status &&
            this.pageSize == other.pageSize &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            transactionToken,
            status,
            pageSize,
            begin,
            end,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "DisputeListParams{transactionToken=$transactionToken, status=$status, pageSize=$pageSize, begin=$begin, end=$end, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var transactionToken: String? = null
        private var status: Status? = null
        private var pageSize: Long? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeListParams: DisputeListParams) = apply {
            this.transactionToken = disputeListParams.transactionToken
            this.status = disputeListParams.status
            this.pageSize = disputeListParams.pageSize
            this.begin = disputeListParams.begin
            this.end = disputeListParams.end
            this.startingAfter = disputeListParams.startingAfter
            this.endingBefore = disputeListParams.endingBefore
            additionalQueryParams(disputeListParams.additionalQueryParams)
            additionalHeaders(disputeListParams.additionalHeaders)
        }

        /** List disputes of a given transaction token. */
        fun transactionToken(transactionToken: String) = apply {
            this.transactionToken = transactionToken
        }

        /** List disputes of a specific status. */
        fun status(status: Status) = apply { this.status = status }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime) = apply { this.end = end }

        /**
         * The unique identifier of the last item in the previous page. Used to retrieve the next
         * page.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * The unique identifier of the first item in the previous page. Used to retrieve the
         * previous page.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): DisputeListParams =
            DisputeListParams(
                transactionToken,
                status,
                pageSize,
                begin,
                end,
                startingAfter,
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NEW = Status(JsonField.of("NEW"))

            @JvmField val PENDING_CUSTOMER = Status(JsonField.of("PENDING_CUSTOMER"))

            @JvmField val SUBMITTED = Status(JsonField.of("SUBMITTED"))

            @JvmField val REPRESENTMENT = Status(JsonField.of("REPRESENTMENT"))

            @JvmField val PREARBITRATION = Status(JsonField.of("PREARBITRATION"))

            @JvmField val ARBITRATION = Status(JsonField.of("ARBITRATION"))

            @JvmField val CASE_WON = Status(JsonField.of("CASE_WON"))

            @JvmField val CASE_CLOSED = Status(JsonField.of("CASE_CLOSED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
        }

        enum class Value {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NEW -> Value.NEW
                PENDING_CUSTOMER -> Value.PENDING_CUSTOMER
                SUBMITTED -> Value.SUBMITTED
                REPRESENTMENT -> Value.REPRESENTMENT
                PREARBITRATION -> Value.PREARBITRATION
                ARBITRATION -> Value.ARBITRATION
                CASE_WON -> Value.CASE_WON
                CASE_CLOSED -> Value.CASE_CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NEW -> Known.NEW
                PENDING_CUSTOMER -> Known.PENDING_CUSTOMER
                SUBMITTED -> Known.SUBMITTED
                REPRESENTMENT -> Known.REPRESENTMENT
                PREARBITRATION -> Known.PREARBITRATION
                ARBITRATION -> Known.ARBITRATION
                CASE_WON -> Known.CASE_WON
                CASE_CLOSED -> Known.CASE_CLOSED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
