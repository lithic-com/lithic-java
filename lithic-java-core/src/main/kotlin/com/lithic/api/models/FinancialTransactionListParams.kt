// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class FinancialTransactionListParams
constructor(
    private val financialAccountToken: String,
    private val begin: OffsetDateTime?,
    private val category: Category?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val result: Result?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun result(): Optional<Result> = Optional.ofNullable(result)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let {
            params.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.category?.let { params.put("category", listOf(it.toString())) }
        this.end?.let {
            params.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.result?.let { params.put("result", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionListParams && this.financialAccountToken == other.financialAccountToken && this.begin == other.begin && this.category == other.category && this.end == other.end && this.endingBefore == other.endingBefore && this.result == other.result && this.startingAfter == other.startingAfter && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(financialAccountToken, begin, category, end, endingBefore, result, startingAfter, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "FinancialTransactionListParams{financialAccountToken=$financialAccountToken, begin=$begin, category=$category, end=$end, endingBefore=$endingBefore, result=$result, startingAfter=$startingAfter, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var begin: OffsetDateTime? = null
        private var category: Category? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(financialTransactionListParams: FinancialTransactionListParams) = apply {
            this.financialAccountToken = financialTransactionListParams.financialAccountToken
            this.begin = financialTransactionListParams.begin
            this.category = financialTransactionListParams.category
            this.end = financialTransactionListParams.end
            this.endingBefore = financialTransactionListParams.endingBefore
            this.result = financialTransactionListParams.result
            this.startingAfter = financialTransactionListParams.startingAfter
            this.status = financialTransactionListParams.status
            additionalHeaders(financialTransactionListParams.additionalHeaders)
            additionalQueryParams(financialTransactionListParams.additionalQueryParams)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): FinancialTransactionListParams =
            FinancialTransactionListParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                begin,
                category,
                end,
                endingBefore,
                result,
                startingAfter,
                status,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
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

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val RETURNED = Status(JsonField.of("RETURNED"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

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
    }
}
