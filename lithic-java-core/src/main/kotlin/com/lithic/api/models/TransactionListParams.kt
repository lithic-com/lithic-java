package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TransactionListParams
constructor(
    private val accountToken: String?,
    private val cardToken: String?,
    private val result: Result?,
    private val begin: String?,
    private val end: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    fun result(): Optional<Result> = Optional.ofNullable(result)

    fun begin(): Optional<String> = Optional.ofNullable(begin)

    fun end(): Optional<String> = Optional.ofNullable(end)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        TransactionListQueryParams(
                accountToken,
                cardToken,
                result,
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams
            )
            .toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    class TransactionListQueryParams
    internal constructor(
        private val accountToken: String?,
        private val cardToken: String?,
        private val result: Result?,
        private val begin: String?,
        private val end: String?,
        private val page: Long?,
        private val pageSize: Long?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {
        private var hashCode: Int = 0

        /** Filters for transactions associated with a specific account. */
        fun accountToken(): String? = accountToken

        /** Filters for transactions associated with a specific card. */
        fun cardToken(): String? = cardToken

        /**
         * Filters for transactions using transaction result field. Can filter by `APPROVED`, and
         * `DECLINED`.
         */
        fun result(): Result? = result

        /**
         * Date string in 8601 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(): String? = begin

        /**
         * Date string in 8601 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(): String? = end

        /** Page (for pagination). */
        fun page(): Long? = page

        /** Page size (for pagination). */
        fun pageSize(): Long? = pageSize

        fun _additionalProperties(): ListMultimap<String, String> = additionalProperties

        fun toQueryParams(): ListMultimap<String, String> {
            val params = ArrayListMultimap.create<String, String>()
            this.accountToken()?.let { params.put("account_token", it.toString()) }
            this.cardToken()?.let { params.put("card_token", it.toString()) }
            this.result()?.let { params.put("result", it.toString()) }
            this.begin()?.let { params.put("begin", it.toString()) }
            this.end()?.let { params.put("end", it.toString()) }
            this.page()?.let { params.put("page", it.toString()) }
            this.pageSize()?.let { params.put("page_size", it.toString()) }
            params.putAll(additionalProperties)
            return Multimaps.unmodifiableListMultimap(params)
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionListQueryParams &&
                accountToken == other.accountToken &&
                cardToken == other.cardToken &&
                result == other.result &&
                begin == other.begin &&
                end == other.end &&
                page == other.page &&
                pageSize == other.pageSize &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        cardToken,
                        result,
                        begin,
                        end,
                        page,
                        pageSize,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionListQueryParams{accountToken=$accountToken, cardToken=$cardToken, result=$result, begin=$begin, end=$end, page=$page, pageSize=$pageSize, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var accountToken: String? = null
            private var cardToken: String? = null
            private var result: Result? = null
            private var begin: String? = null
            private var end: String? = null
            private var page: Long? = null
            private var pageSize: Long? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(transactionListQueryParams: TransactionListQueryParams) = apply {
                this.accountToken = transactionListQueryParams.accountToken
                this.cardToken = transactionListQueryParams.cardToken
                this.result = transactionListQueryParams.result
                this.begin = transactionListQueryParams.begin
                this.end = transactionListQueryParams.end
                this.page = transactionListQueryParams.page
                this.pageSize = transactionListQueryParams.pageSize
                additionalProperties(transactionListQueryParams.additionalProperties)
            }

            /** Filters for transactions associated with a specific account. */
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** Filters for transactions associated with a specific card. */
            fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

            /**
             * Filters for transactions using transaction result field. Can filter by `APPROVED`,
             * and `DECLINED`.
             */
            fun result(result: Result) = apply { this.result = result }

            /**
             * Date string in 8601 format. Only entries created after the specified date will be
             * included. UTC time zone.
             */
            fun begin(begin: String) = apply { this.begin = begin }

            /**
             * Date string in 8601 format. Only entries created before the specified date will be
             * included. UTC time zone.
             */
            fun end(end: String) = apply { this.end = end }

            /** Page (for pagination). */
            fun page(page: Long) = apply { this.page = page }

            /** Page size (for pagination). */
            fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

            fun additionalProperties(additionalProperties: ListMultimap<String, String>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperties(key: String, value: String) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: ListMultimap<String, String>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): TransactionListQueryParams =
                TransactionListQueryParams(
                    accountToken,
                    cardToken,
                    result,
                    begin,
                    end,
                    page,
                    pageSize,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionListParams &&
            accountToken == other.accountToken &&
            cardToken == other.cardToken &&
            result == other.result &&
            begin == other.begin &&
            end == other.end &&
            page == other.page &&
            pageSize == other.pageSize &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
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
        private var begin: String? = null
        private var end: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

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
         * Date string in 8601 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(begin: String) = apply { this.begin = begin }

        /**
         * Date string in 8601 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(end: String) = apply { this.end = end }

        /** Page (for pagination). */
        fun page(page: Long) = apply { this.page = page }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun build(): TransactionListParams =
            TransactionListParams(
                accountToken,
                cardToken,
                result,
                begin,
                end,
                page,
                pageSize,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }

    class Result @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && value == other.value
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
                else ->
                    throw IllegalArgumentException(
                        "Unknown TransactionListQueryParams.Result: $value"
                    )
            }
    }
}
