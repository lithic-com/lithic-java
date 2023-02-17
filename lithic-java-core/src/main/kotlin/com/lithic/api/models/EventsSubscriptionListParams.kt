package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class EventsSubscriptionListParams
constructor(
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
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

        return other is EventsSubscriptionListParams &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            pageSize,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "EventsSubscriptionListParams{pageSize=$pageSize, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventsSubscriptionListParams: EventsSubscriptionListParams) = apply {
            this.pageSize = eventsSubscriptionListParams.pageSize
            this.startingAfter = eventsSubscriptionListParams.startingAfter
            this.endingBefore = eventsSubscriptionListParams.endingBefore
            additionalQueryParams(eventsSubscriptionListParams.additionalQueryParams)
            additionalHeaders(eventsSubscriptionListParams.additionalHeaders)
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

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

        fun build(): EventsSubscriptionListParams =
            EventsSubscriptionListParams(
                pageSize,
                startingAfter,
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
