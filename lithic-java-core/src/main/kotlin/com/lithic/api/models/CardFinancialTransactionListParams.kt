// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CardFinancialTransactionListParams
constructor(
    private val cardToken: String,
    private val begin: OffsetDateTime?,
    private val category: Category?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val result: Result?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun cardToken(): String = cardToken

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun result(): Optional<Result> = Optional.ofNullable(result)

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
        this.category?.let { queryParams.put("category", listOf(it.toString())) }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.result?.let { queryParams.put("result", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var begin: OffsetDateTime? = null
        private var category: Category? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardFinancialTransactionListParams: CardFinancialTransactionListParams) =
            apply {
                cardToken = cardFinancialTransactionListParams.cardToken
                begin = cardFinancialTransactionListParams.begin
                category = cardFinancialTransactionListParams.category
                end = cardFinancialTransactionListParams.end
                endingBefore = cardFinancialTransactionListParams.endingBefore
                result = cardFinancialTransactionListParams.result
                startingAfter = cardFinancialTransactionListParams.startingAfter
                status = cardFinancialTransactionListParams.status
                additionalHeaders = cardFinancialTransactionListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    cardFinancialTransactionListParams.additionalQueryParams.toBuilder()
            }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /** Financial Transaction category to be returned. */
        fun category(category: Category) = apply { this.category = category }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Financial Transaction result to be returned. */
        fun result(result: Result) = apply { this.result = result }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /** Financial Transaction status to be returned. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): CardFinancialTransactionListParams =
            CardFinancialTransactionListParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                begin,
                category,
                end,
                endingBefore,
                result,
                startingAfter,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CARD = of("CARD")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            CARD,
            TRANSFER,
        }

        enum class Value {
            CARD,
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val RETURNED = of("RETURNED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val VOIDED = of("VOIDED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            RETURNED,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            RETURNED,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
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

        return /* spotless:off */ other is CardFinancialTransactionListParams && cardToken == other.cardToken && begin == other.begin && category == other.category && end == other.end && endingBefore == other.endingBefore && result == other.result && startingAfter == other.startingAfter && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, begin, category, end, endingBefore, result, startingAfter, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListParams{cardToken=$cardToken, begin=$begin, category=$category, end=$end, endingBefore=$endingBefore, result=$result, startingAfter=$startingAfter, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
