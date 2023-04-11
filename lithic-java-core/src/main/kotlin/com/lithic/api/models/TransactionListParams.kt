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

class TransactionListParams
constructor(
    private val accountToken: String?,
    private val cardToken: String?,
    private val result: Result?,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    fun result(): Optional<Result> = Optional.ofNullable(result)

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.accountToken?.let { params.put("account_token", listOf(it.toString())) }
        this.cardToken?.let { params.put("card_token", listOf(it.toString())) }
        this.result?.let { params.put("result", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.page?.let { params.put("page", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
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

        return other is TransactionListParams &&
            this.accountToken == other.accountToken &&
            this.cardToken == other.cardToken &&
            this.result == other.result &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.page == other.page &&
            this.pageSize == other.pageSize &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            cardToken,
            result,
            begin,
            end,
            page,
            pageSize,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "TransactionListParams{accountToken=$accountToken, cardToken=$cardToken, result=$result, begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var cardToken: String? = null
        private var result: Result? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionListParams: TransactionListParams) = apply {
            this.accountToken = transactionListParams.accountToken
            this.cardToken = transactionListParams.cardToken
            this.result = transactionListParams.result
            this.begin = transactionListParams.begin
            this.end = transactionListParams.end
            this.page = transactionListParams.page
            this.pageSize = transactionListParams.pageSize
            additionalQueryParams(transactionListParams.additionalQueryParams)
            additionalHeaders(transactionListParams.additionalHeaders)
        }

        /** Filters for transactions associated with a specific account. */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /** Filters for transactions associated with a specific card. */
        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Filters for transactions using transaction result field. Can filter by `APPROVED`, and
         * `DECLINED`.
         */
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

        /** Page (for pagination). */
        fun page(page: Long) = apply { this.page = page }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

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

        fun build(): TransactionListParams =
            TransactionListParams(
                accountToken,
                cardToken,
                result,
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
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
