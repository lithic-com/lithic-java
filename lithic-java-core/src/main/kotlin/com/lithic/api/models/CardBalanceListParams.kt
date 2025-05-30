// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the balances for a given card. */
class CardBalanceListParams
private constructor(
    private val cardToken: String?,
    private val balanceDate: OffsetDateTime?,
    private val lastTransactionEventToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    /** UTC date of the balance to retrieve. Defaults to latest available balance */
    fun balanceDate(): Optional<OffsetDateTime> = Optional.ofNullable(balanceDate)

    /**
     * Balance after a given financial event occured. For example, passing the event_token of a $5
     * CARD_CLEARING financial event will return a balance decreased by $5
     */
    fun lastTransactionEventToken(): Optional<String> =
        Optional.ofNullable(lastTransactionEventToken)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardBalanceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardBalanceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardBalanceListParams]. */
    class Builder internal constructor() {

        private var cardToken: String? = null
        private var balanceDate: OffsetDateTime? = null
        private var lastTransactionEventToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardBalanceListParams: CardBalanceListParams) = apply {
            cardToken = cardBalanceListParams.cardToken
            balanceDate = cardBalanceListParams.balanceDate
            lastTransactionEventToken = cardBalanceListParams.lastTransactionEventToken
            additionalHeaders = cardBalanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardBalanceListParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /** Alias for calling [Builder.cardToken] with `cardToken.orElse(null)`. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.getOrNull())

        /** UTC date of the balance to retrieve. Defaults to latest available balance */
        fun balanceDate(balanceDate: OffsetDateTime?) = apply { this.balanceDate = balanceDate }

        /** Alias for calling [Builder.balanceDate] with `balanceDate.orElse(null)`. */
        fun balanceDate(balanceDate: Optional<OffsetDateTime>) =
            balanceDate(balanceDate.getOrNull())

        /**
         * Balance after a given financial event occured. For example, passing the event_token of a
         * $5 CARD_CLEARING financial event will return a balance decreased by $5
         */
        fun lastTransactionEventToken(lastTransactionEventToken: String?) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /**
         * Alias for calling [Builder.lastTransactionEventToken] with
         * `lastTransactionEventToken.orElse(null)`.
         */
        fun lastTransactionEventToken(lastTransactionEventToken: Optional<String>) =
            lastTransactionEventToken(lastTransactionEventToken.getOrNull())

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
         * Returns an immutable instance of [CardBalanceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardBalanceListParams =
            CardBalanceListParams(
                cardToken,
                balanceDate,
                lastTransactionEventToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                balanceDate?.let {
                    put("balance_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                lastTransactionEventToken?.let { put("last_transaction_event_token", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListParams && cardToken == other.cardToken && balanceDate == other.balanceDate && lastTransactionEventToken == other.lastTransactionEventToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, balanceDate, lastTransactionEventToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardBalanceListParams{cardToken=$cardToken, balanceDate=$balanceDate, lastTransactionEventToken=$lastTransactionEventToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
