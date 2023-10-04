// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class PaymentListParams
constructor(
    private val financialAccountToken: String?,
    private val status: Status?,
    private val result: Result?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun result(): Optional<Result> = Optional.ofNullable(result)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.financialAccountToken?.let {
            params.put("financial_account_token", listOf(it.toString()))
        }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.result?.let { params.put("result", listOf(it.toString())) }
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

        return other is PaymentListParams &&
            this.financialAccountToken == other.financialAccountToken &&
            this.status == other.status &&
            this.result == other.result &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            financialAccountToken,
            status,
            result,
            pageSize,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "PaymentListParams{financialAccountToken=$financialAccountToken, status=$status, result=$result, pageSize=$pageSize, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var status: Status? = null
        private var result: Result? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentListParams: PaymentListParams) = apply {
            this.financialAccountToken = paymentListParams.financialAccountToken
            this.status = paymentListParams.status
            this.result = paymentListParams.result
            this.pageSize = paymentListParams.pageSize
            this.startingAfter = paymentListParams.startingAfter
            this.endingBefore = paymentListParams.endingBefore
            additionalQueryParams(paymentListParams.additionalQueryParams)
            additionalHeaders(paymentListParams.additionalHeaders)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun status(status: Status) = apply { this.status = status }

        fun result(result: Result) = apply { this.result = result }

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

        fun build(): PaymentListParams =
            PaymentListParams(
                financialAccountToken,
                status,
                result,
                pageSize,
                startingAfter,
                endingBefore,
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

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            VOIDED,
            SETTLED,
            DECLINED,
            EXPIRED,
        }

        enum class Value {
            PENDING,
            VOIDED,
            SETTLED,
            DECLINED,
            EXPIRED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                VOIDED -> Value.VOIDED
                SETTLED -> Value.SETTLED
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                VOIDED -> Known.VOIDED
                SETTLED -> Known.SETTLED
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
