// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun tokenizationChannel(): Optional<TokenizationChannel> =
        Optional.ofNullable(tokenizationChannel)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.accountToken?.let { params.put("account_token", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.cardToken?.let { params.put("card_token", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.tokenizationChannel?.let { params.put("tokenization_channel", listOf(it.toString())) }
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

        return /* spotless:off */ other is TokenizationListParams && this.accountToken == other.accountToken && this.begin == other.begin && this.cardToken == other.cardToken && this.end == other.end && this.endingBefore == other.endingBefore && this.pageSize == other.pageSize && this.startingAfter == other.startingAfter && this.tokenizationChannel == other.tokenizationChannel && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountToken, begin, cardToken, end, endingBefore, pageSize, startingAfter, tokenizationChannel, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "TokenizationListParams{accountToken=$accountToken, begin=$begin, cardToken=$cardToken, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, tokenizationChannel=$tokenizationChannel, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenizationListParams: TokenizationListParams) = apply {
            this.accountToken = tokenizationListParams.accountToken
            this.begin = tokenizationListParams.begin
            this.cardToken = tokenizationListParams.cardToken
            this.end = tokenizationListParams.end
            this.endingBefore = tokenizationListParams.endingBefore
            this.pageSize = tokenizationListParams.pageSize
            this.startingAfter = tokenizationListParams.startingAfter
            this.tokenizationChannel = tokenizationListParams.tokenizationChannel
            additionalQueryParams(tokenizationListParams.additionalQueryParams)
            additionalHeaders(tokenizationListParams.additionalHeaders)
        }

        /** Filters for tokenizations associated with a specific account. */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /** Filter for tokenizations created after this date. */
        fun begin(begin: LocalDate) = apply { this.begin = begin }

        /** Filters for tokenizations associated with a specific card. */
        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** Filter for tokenizations created before this date. */
        fun end(end: LocalDate) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * Filter for tokenizations by tokenization channel. If this is not specified, only
         * DIGITAL_WALLET tokenizations will be returned.
         */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class TokenizationChannel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationChannel && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DIGITAL_WALLET = TokenizationChannel(JsonField.of("DIGITAL_WALLET"))

            @JvmField val MERCHANT = TokenizationChannel(JsonField.of("MERCHANT"))

            @JvmField val ALL = TokenizationChannel(JsonField.of("ALL"))

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
    }
}
