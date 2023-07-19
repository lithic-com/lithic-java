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

class EventListParams
constructor(
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val eventTypes: List<EventType>?,
    private val withContent: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun eventTypes(): Optional<List<EventType>> = Optional.ofNullable(eventTypes)

    fun withContent(): Optional<Boolean> = Optional.ofNullable(withContent)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.eventTypes?.let { params.put("event_types", listOf(it.joinToString(separator = ","))) }
        this.withContent?.let { params.put("with_content", listOf(it.toString())) }
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

        return other is EventListParams &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.eventTypes == other.eventTypes &&
            this.withContent == other.withContent &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            begin,
            end,
            pageSize,
            startingAfter,
            endingBefore,
            eventTypes,
            withContent,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "EventListParams{begin=$begin, end=$end, pageSize=$pageSize, startingAfter=$startingAfter, endingBefore=$endingBefore, eventTypes=$eventTypes, withContent=$withContent, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var eventTypes: List<EventType>? = null
        private var withContent: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            this.begin = eventListParams.begin
            this.end = eventListParams.end
            this.pageSize = eventListParams.pageSize
            this.startingAfter = eventListParams.startingAfter
            this.endingBefore = eventListParams.endingBefore
            this.eventTypes = eventListParams.eventTypes
            this.withContent = eventListParams.withContent
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
        }

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

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Event types to filter events by. */
        fun eventTypes(eventTypes: List<EventType>) = apply { this.eventTypes = eventTypes }

        /** Whether to include the event payload content in the response. */
        fun withContent(withContent: Boolean) = apply { this.withContent = withContent }

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

        fun build(): EventListParams =
            EventListParams(
                begin,
                end,
                pageSize,
                startingAfter,
                endingBefore,
                eventTypes?.toUnmodifiable(),
                withContent,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD_CREATED = EventType(JsonField.of("card.created"))

            @JvmField val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            @JvmField
            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT =
                EventType(JsonField.of("digital_wallet.tokenization_result"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmField
            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            @JvmField
            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            @JvmField
            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            TRANSFER_TRANSACTION_CREATED,
        }

        enum class Value {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            TRANSFER_TRANSACTION_CREATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_CREATED -> Value.CARD_CREATED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_CREATED -> Known.CARD_CREATED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
