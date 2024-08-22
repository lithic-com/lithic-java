// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CardBalanceListParams
constructor(
    private val cardToken: String,
    private val balanceDate: OffsetDateTime?,
    private val lastTransactionEventToken: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cardToken(): String = cardToken

    fun balanceDate(): Optional<OffsetDateTime> = Optional.ofNullable(balanceDate)

    fun lastTransactionEventToken(): Optional<String> =
        Optional.ofNullable(lastTransactionEventToken)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.balanceDate?.let {
            params.put("balance_date", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.lastTransactionEventToken?.let {
            params.put("last_transaction_event_token", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardBalanceListParams &&
            this.cardToken == other.cardToken &&
            this.balanceDate == other.balanceDate &&
            this.lastTransactionEventToken == other.lastTransactionEventToken &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardToken,
            balanceDate,
            lastTransactionEventToken,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardBalanceListParams{cardToken=$cardToken, balanceDate=$balanceDate, lastTransactionEventToken=$lastTransactionEventToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var balanceDate: OffsetDateTime? = null
        private var lastTransactionEventToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardBalanceListParams: CardBalanceListParams) = apply {
            this.cardToken = cardBalanceListParams.cardToken
            this.balanceDate = cardBalanceListParams.balanceDate
            this.lastTransactionEventToken = cardBalanceListParams.lastTransactionEventToken
            additionalQueryParams(cardBalanceListParams.additionalQueryParams)
            additionalHeaders(cardBalanceListParams.additionalHeaders)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** UTC date of the balance to retrieve. Defaults to latest available balance */
        fun balanceDate(balanceDate: OffsetDateTime) = apply { this.balanceDate = balanceDate }

        /**
         * Balance after a given financial event occured. For example, passing the event_token of a
         * $5 CARD_CLEARING financial event will return a balance decreased by $5
         */
        fun lastTransactionEventToken(lastTransactionEventToken: String) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
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

        fun build(): CardBalanceListParams =
            CardBalanceListParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                balanceDate,
                lastTransactionEventToken,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
