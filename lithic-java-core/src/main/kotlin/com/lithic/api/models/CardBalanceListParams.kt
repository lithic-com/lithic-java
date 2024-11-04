// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun cardToken(): String = cardToken

    fun balanceDate(): Optional<OffsetDateTime> = Optional.ofNullable(balanceDate)

    fun lastTransactionEventToken(): Optional<String> =
        Optional.ofNullable(lastTransactionEventToken)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListParams && this.cardToken == other.cardToken && this.balanceDate == other.balanceDate && this.lastTransactionEventToken == other.lastTransactionEventToken && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cardToken, balanceDate, lastTransactionEventToken, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CardBalanceListParams{cardToken=$cardToken, balanceDate=$balanceDate, lastTransactionEventToken=$lastTransactionEventToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var balanceDate: OffsetDateTime? = null
        private var lastTransactionEventToken: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(cardBalanceListParams: CardBalanceListParams) = apply {
            this.cardToken = cardBalanceListParams.cardToken
            this.balanceDate = cardBalanceListParams.balanceDate
            this.lastTransactionEventToken = cardBalanceListParams.lastTransactionEventToken
            additionalHeaders(cardBalanceListParams.additionalHeaders)
            additionalQueryParams(cardBalanceListParams.additionalQueryParams)
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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): CardBalanceListParams =
            CardBalanceListParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                balanceDate,
                lastTransactionEventToken,
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
}
