// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** List card tokenizations */
class TokenizationListParams
constructor(
    private val accountToken: String?,
    private val begin: LocalDate?,
    private val cardToken: String?,
    private val end: LocalDate?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val tokenizationChannel: TokenizationChannel?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Filters for tokenizations associated with a specific account. */
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /** Filter for tokenizations created after this date. */
    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    /** Filters for tokenizations associated with a specific card. */
    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    /** Filter for tokenizations created before this date. */
    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

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

    /**
     * Filter for tokenizations by tokenization channel. If this is not specified, only
     * DIGITAL_WALLET tokenizations will be returned.
     */
    fun tokenizationChannel(): Optional<TokenizationChannel> =
        Optional.ofNullable(tokenizationChannel)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.begin?.let { queryParams.put("begin", listOf(it.toString())) }
        this.cardToken?.let { queryParams.put("card_token", listOf(it.toString())) }
        this.end?.let { queryParams.put("end", listOf(it.toString())) }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.tokenizationChannel?.let {
            queryParams.put("tokenization_channel", listOf(it.toString()))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var begin: LocalDate? = null
        private var cardToken: String? = null
        private var end: LocalDate? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var tokenizationChannel: TokenizationChannel? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenizationListParams: TokenizationListParams) = apply {
            accountToken = tokenizationListParams.accountToken
            begin = tokenizationListParams.begin
            cardToken = tokenizationListParams.cardToken
            end = tokenizationListParams.end
            endingBefore = tokenizationListParams.endingBefore
            pageSize = tokenizationListParams.pageSize
            startingAfter = tokenizationListParams.startingAfter
            tokenizationChannel = tokenizationListParams.tokenizationChannel
            additionalHeaders = tokenizationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenizationListParams.additionalQueryParams.toBuilder()
        }

        /** Filters for tokenizations associated with a specific account. */
        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Filters for tokenizations associated with a specific account. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.orElse(null))

        /** Filter for tokenizations created after this date. */
        fun begin(begin: LocalDate?) = apply { this.begin = begin }

        /** Filter for tokenizations created after this date. */
        fun begin(begin: Optional<LocalDate>) = begin(begin.orElse(null))

        /** Filters for tokenizations associated with a specific card. */
        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /** Filters for tokenizations associated with a specific card. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.orElse(null))

        /** Filter for tokenizations created before this date. */
        fun end(end: LocalDate?) = apply { this.end = end }

        /** Filter for tokenizations created before this date. */
        fun end(end: Optional<LocalDate>) = end(end.orElse(null))

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

        /**
         * Filter for tokenizations by tokenization channel. If this is not specified, only
         * DIGITAL_WALLET tokenizations will be returned.
         */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel?) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

        /**
         * Filter for tokenizations by tokenization channel. If this is not specified, only
         * DIGITAL_WALLET tokenizations will be returned.
         */
        fun tokenizationChannel(tokenizationChannel: Optional<TokenizationChannel>) =
            tokenizationChannel(tokenizationChannel.orElse(null))

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

        fun build(): TokenizationListParams =
            TokenizationListParams(
                accountToken,
                begin,
                cardToken,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                tokenizationChannel,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Filter for tokenizations by tokenization channel. If this is not specified, only
     * DIGITAL_WALLET tokenizations will be returned.
     */
    class TokenizationChannel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmField val ALL = of("ALL")

            @JvmStatic fun of(value: String) = TokenizationChannel(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_WALLET,
            MERCHANT,
            ALL,
        }

        enum class Value {
            DIGITAL_WALLET,
            MERCHANT,
            ALL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                MERCHANT -> Value.MERCHANT
                ALL -> Value.ALL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                MERCHANT -> Known.MERCHANT
                ALL -> Known.ALL
                else -> throw LithicInvalidDataException("Unknown TokenizationChannel: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationChannel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationListParams && accountToken == other.accountToken && begin == other.begin && cardToken == other.cardToken && end == other.end && endingBefore == other.endingBefore && pageSize == other.pageSize && startingAfter == other.startingAfter && tokenizationChannel == other.tokenizationChannel && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, begin, cardToken, end, endingBefore, pageSize, startingAfter, tokenizationChannel, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TokenizationListParams{accountToken=$accountToken, begin=$begin, cardToken=$cardToken, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, tokenizationChannel=$tokenizationChannel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
