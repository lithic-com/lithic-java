package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardRetrieveParams
constructor(
    private val cardToken: String,
    private val accountToken: String?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {
    fun cardToken(): String = cardToken

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        CardRetrieveQueryParams(accountToken, additionalQueryParams).toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    class CardRetrieveQueryParams
    internal constructor(
        private val accountToken: String?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {
        private var hashCode: Int = 0

        /**
         * Only required for multi-account users using account holder enrollment. Returns card
         * associated with this account. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(): String? = accountToken

        fun _additionalProperties(): ListMultimap<String, String> = additionalProperties

        fun toQueryParams(): ListMultimap<String, String> {
            val params = ArrayListMultimap.create<String, String>()
            this.accountToken()?.let { params.put("account_token", it.toString()) }
            params.putAll(additionalProperties)
            return Multimaps.unmodifiableListMultimap(params)
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardRetrieveQueryParams &&
                accountToken == other.accountToken &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(accountToken, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "CardRetrieveQueryParams{accountToken=$accountToken, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var accountToken: String? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(cardRetrieveQueryParams: CardRetrieveQueryParams) = apply {
                this.accountToken = cardRetrieveQueryParams.accountToken
                additionalProperties(cardRetrieveQueryParams.additionalProperties)
            }

            /**
             * Only required for multi-account users using account holder enrollment. Returns card
             * associated with this account. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
             * information.
             */
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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

            fun build(): CardRetrieveQueryParams =
                CardRetrieveQueryParams(accountToken, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardRetrieveParams &&
            cardToken == other.cardToken &&
            accountToken == other.accountToken &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardToken,
            accountToken,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardRetrieveParams{cardToken=$cardToken, accountToken=$accountToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var cardToken: String? = null
        private var accountToken: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(cardRetrieveParams: CardRetrieveParams) = apply {
            this.cardToken = cardRetrieveParams.cardToken
            this.accountToken = cardRetrieveParams.accountToken
            additionalQueryParams(cardRetrieveParams.additionalQueryParams)
            additionalHeaders(cardRetrieveParams.additionalHeaders)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only required for multi-account users using account holder enrollment. Returns card
         * associated with this account. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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

        fun build(): CardRetrieveParams =
            CardRetrieveParams(
                cardToken!!,
                accountToken,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
