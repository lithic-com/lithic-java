// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/** List all the message attempts for a given event subscription. */
class EventSubscriptionListAttemptsParams
private constructor(
    private val eventSubscriptionToken: String,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun eventSubscriptionToken(): String = eventSubscriptionToken

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

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

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.begin?.let {
            queryParams.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventSubscriptionToken
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var eventSubscriptionToken: String? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            eventSubscriptionListAttemptsParams: EventSubscriptionListAttemptsParams
        ) = apply {
            eventSubscriptionToken = eventSubscriptionListAttemptsParams.eventSubscriptionToken
            begin = eventSubscriptionListAttemptsParams.begin
            end = eventSubscriptionListAttemptsParams.end
            endingBefore = eventSubscriptionListAttemptsParams.endingBefore
            pageSize = eventSubscriptionListAttemptsParams.pageSize
            startingAfter = eventSubscriptionListAttemptsParams.startingAfter
            status = eventSubscriptionListAttemptsParams.status
            additionalHeaders = eventSubscriptionListAttemptsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                eventSubscriptionListAttemptsParams.additionalQueryParams.toBuilder()
        }

        fun eventSubscriptionToken(eventSubscriptionToken: String) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.orElse(null))

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: Optional<OffsetDateTime>) = end(end.orElse(null))

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.orElse(null))

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Page size (for pagination). */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.orElse(null))

        fun status(status: Status?) = apply { this.status = status }

        fun status(status: Optional<Status>) = status(status.orElse(null))

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

        fun build(): EventSubscriptionListAttemptsParams =
            EventSubscriptionListAttemptsParams(
                checkRequired("eventSubscriptionToken", eventSubscriptionToken),
                begin,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAILED = of("FAILED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SENDING = of("SENDING")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            FAILED,
            PENDING,
            SENDING,
            SUCCESS,
        }

        enum class Value {
            FAILED,
            PENDING,
            SENDING,
            SUCCESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                SENDING -> Value.SENDING
                SUCCESS -> Value.SUCCESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                SENDING -> Known.SENDING
                SUCCESS -> Known.SUCCESS
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListAttemptsParams && eventSubscriptionToken == other.eventSubscriptionToken && begin == other.begin && end == other.end && endingBefore == other.endingBefore && pageSize == other.pageSize && startingAfter == other.startingAfter && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventSubscriptionToken, begin, end, endingBefore, pageSize, startingAfter, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsParams{eventSubscriptionToken=$eventSubscriptionToken, begin=$begin, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
