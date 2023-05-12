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

class FinancialTransactionListParams
constructor(
    private val financialAccountToken: String,
    private val category: Category?,
    private val status: Status?,
    private val result: Result?,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun result(): Optional<Result> = Optional.ofNullable(result)

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.category?.let { params.put("category", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.result?.let { params.put("result", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialTransactionListParams &&
            this.financialAccountToken == other.financialAccountToken &&
            this.category == other.category &&
            this.status == other.status &&
            this.result == other.result &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            financialAccountToken,
            category,
            status,
            result,
            begin,
            end,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "FinancialTransactionListParams{financialAccountToken=$financialAccountToken, category=$category, status=$status, result=$result, begin=$begin, end=$end, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var category: Category? = null
        private var status: Status? = null
        private var result: Result? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialTransactionListParams: FinancialTransactionListParams) = apply {
            this.financialAccountToken = financialTransactionListParams.financialAccountToken
            this.category = financialTransactionListParams.category
            this.status = financialTransactionListParams.status
            this.result = financialTransactionListParams.result
            this.begin = financialTransactionListParams.begin
            this.end = financialTransactionListParams.end
            this.startingAfter = financialTransactionListParams.startingAfter
            this.endingBefore = financialTransactionListParams.endingBefore
            additionalQueryParams(financialTransactionListParams.additionalQueryParams)
            additionalHeaders(financialTransactionListParams.additionalHeaders)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Financial Transaction category to be returned. */
        fun category(category: Category) = apply { this.category = category }

        /** Financial Transaction status to be returned. */
        fun status(status: Status) = apply { this.status = status }

        /** Financial Transaction result to be returned. */
        fun result(result: Result) = apply { this.result = result }

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
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
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

        fun build(): FinancialTransactionListParams =
            FinancialTransactionListParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                category,
                status,
                result,
                begin,
                end,
                startingAfter,
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Category(JsonField.of("ACH"))

            @JvmField val CARD = Category(JsonField.of("CARD"))

            @JvmField val TRANSFER = Category(JsonField.of("TRANSFER"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACH,
            CARD,
            TRANSFER,
        }

        enum class Value {
            ACH,
            CARD,
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                CARD -> Value.CARD
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                CARD -> Known.CARD
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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
    }
}