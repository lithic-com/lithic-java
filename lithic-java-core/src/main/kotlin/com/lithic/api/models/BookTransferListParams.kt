// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List book transfers */
class BookTransferListParams
private constructor(
    private val accountToken: String?,
    private val begin: OffsetDateTime?,
    private val businessAccountToken: String?,
    private val category: Category?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val financialAccountToken: String?,
    private val pageSize: Long?,
    private val result: Result?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun businessAccountToken(): Optional<String> = Optional.ofNullable(businessAccountToken)

    /** Book Transfer category to be returned. */
    fun category(): Optional<Category> = Optional.ofNullable(category)

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

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Book transfer result to be returned. */
    fun result(): Optional<Result> = Optional.ofNullable(result)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Book transfer status to be returned. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.begin?.let {
            queryParams.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.businessAccountToken?.let {
            queryParams.put("business_account_token", listOf(it.toString()))
        }
        this.category?.let { queryParams.put("category", listOf(it.toString())) }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.financialAccountToken?.let {
            queryParams.put("financial_account_token", listOf(it.toString()))
        }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.result?.let { queryParams.put("result", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BookTransferListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BookTransferListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookTransferListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var begin: OffsetDateTime? = null
        private var businessAccountToken: String? = null
        private var category: Category? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var financialAccountToken: String? = null
        private var pageSize: Long? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookTransferListParams: BookTransferListParams) = apply {
            accountToken = bookTransferListParams.accountToken
            begin = bookTransferListParams.begin
            businessAccountToken = bookTransferListParams.businessAccountToken
            category = bookTransferListParams.category
            end = bookTransferListParams.end
            endingBefore = bookTransferListParams.endingBefore
            financialAccountToken = bookTransferListParams.financialAccountToken
            pageSize = bookTransferListParams.pageSize
            result = bookTransferListParams.result
            startingAfter = bookTransferListParams.startingAfter
            status = bookTransferListParams.status
            additionalHeaders = bookTransferListParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookTransferListParams.additionalQueryParams.toBuilder()
        }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.getOrNull())

        fun businessAccountToken(businessAccountToken: String?) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /**
         * Alias for calling [Builder.businessAccountToken] with
         * `businessAccountToken.orElse(null)`.
         */
        fun businessAccountToken(businessAccountToken: Optional<String>) =
            businessAccountToken(businessAccountToken.getOrNull())

        /** Book Transfer category to be returned. */
        fun category(category: Category?) = apply { this.category = category }

        /** Alias for calling [Builder.category] with `category.orElse(null)`. */
        fun category(category: Optional<Category>) = category(category.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<OffsetDateTime>) = end(end.getOrNull())

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun financialAccountToken(financialAccountToken: String?) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Book transfer result to be returned. */
        fun result(result: Result?) = apply { this.result = result }

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

        /** Book transfer status to be returned. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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

        /**
         * Returns an immutable instance of [BookTransferListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BookTransferListParams =
            BookTransferListParams(
                accountToken,
                begin,
                businessAccountToken,
                category,
                end,
                endingBefore,
                financialAccountToken,
                pageSize,
                result,
                startingAfter,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Book Transfer category to be returned. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

            @JvmField val FEE = of("FEE")

            @JvmField val REWARD = of("REWARD")

            @JvmField val ADJUSTMENT = of("ADJUSTMENT")

            @JvmField val DERECOGNITION = of("DERECOGNITION")

            @JvmField val DISPUTE = of("DISPUTE")

            @JvmField val INTERNAL = of("INTERNAL")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            INTERNAL,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            INTERNAL,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                FEE -> Value.FEE
                REWARD -> Value.REWARD
                ADJUSTMENT -> Value.ADJUSTMENT
                DERECOGNITION -> Value.DERECOGNITION
                DISPUTE -> Value.DISPUTE
                INTERNAL -> Value.INTERNAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                FEE -> Known.FEE
                REWARD -> Known.REWARD
                ADJUSTMENT -> Known.ADJUSTMENT
                DERECOGNITION -> Known.DERECOGNITION
                DISPUTE -> Known.DISPUTE
                INTERNAL -> Known.INTERNAL
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Book transfer result to be returned. */
    class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        /** An enum containing [Result]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Result] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /** An enum member indicating that [Result] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Book transfer status to be returned. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DECLINED,
            SETTLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINED,
            SETTLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                SETTLED -> Value.SETTLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                SETTLED -> Known.SETTLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

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

        return /* spotless:off */ other is BookTransferListParams && accountToken == other.accountToken && begin == other.begin && businessAccountToken == other.businessAccountToken && category == other.category && end == other.end && endingBefore == other.endingBefore && financialAccountToken == other.financialAccountToken && pageSize == other.pageSize && result == other.result && startingAfter == other.startingAfter && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, begin, businessAccountToken, category, end, endingBefore, financialAccountToken, pageSize, result, startingAfter, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookTransferListParams{accountToken=$accountToken, begin=$begin, businessAccountToken=$businessAccountToken, category=$category, end=$end, endingBefore=$endingBefore, financialAccountToken=$financialAccountToken, pageSize=$pageSize, result=$result, startingAfter=$startingAfter, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
