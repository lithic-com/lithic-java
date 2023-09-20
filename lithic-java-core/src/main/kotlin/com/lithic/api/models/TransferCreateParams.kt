package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TransferCreateParams
constructor(
    private val amount: Long,
    private val from: String,
    private val to: String,
    private val memo: String?,
    private val transactionToken: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun from(): String = from

    fun to(): String = to

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun transactionToken(): Optional<String> = Optional.ofNullable(transactionToken)

    @JvmSynthetic
    internal fun getBody(): TransferCreateBody {
        return TransferCreateBody(
            amount,
            from,
            to,
            memo,
            transactionToken,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransferCreateBody.Builder::class)
    @NoAutoDetect
    class TransferCreateBody
    internal constructor(
        private val amount: Long?,
        private val from: String?,
        private val to: String?,
        private val memo: String?,
        private val transactionToken: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Globally unique identifier for the financial account that will send the funds. */
        @JsonProperty("from") fun from(): String? = from

        /** Globally unique identifier for the financial account that will receive the funds. */
        @JsonProperty("to") fun to(): String? = to

        /** Optional descriptor for the transfer. */
        @JsonProperty("memo") fun memo(): String? = memo

        /** Customer-provided transaction_token that will serve as an idempotency token. */
        @JsonProperty("transaction_token") fun transactionToken(): String? = transactionToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransferCreateBody &&
                this.amount == other.amount &&
                this.from == other.from &&
                this.to == other.to &&
                this.memo == other.memo &&
                this.transactionToken == other.transactionToken &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        from,
                        to,
                        memo,
                        transactionToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransferCreateBody{amount=$amount, from=$from, to=$to, memo=$memo, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var from: String? = null
            private var to: String? = null
            private var memo: String? = null
            private var transactionToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferCreateBody: TransferCreateBody) = apply {
                this.amount = transferCreateBody.amount
                this.from = transferCreateBody.from
                this.to = transferCreateBody.to
                this.memo = transferCreateBody.memo
                this.transactionToken = transferCreateBody.transactionToken
                additionalProperties(transferCreateBody.additionalProperties)
            }

            /**
             * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
             * should always be a positive value.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Globally unique identifier for the financial account that will send the funds. */
            @JsonProperty("from") fun from(from: String) = apply { this.from = from }

            /** Globally unique identifier for the financial account that will receive the funds. */
            @JsonProperty("to") fun to(to: String) = apply { this.to = to }

            /** Optional descriptor for the transfer. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /** Customer-provided transaction_token that will serve as an idempotency token. */
            @JsonProperty("transaction_token")
            fun transactionToken(transactionToken: String) = apply {
                this.transactionToken = transactionToken
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TransferCreateBody =
                TransferCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(from) { "`from` is required but was not set" },
                    checkNotNull(to) { "`to` is required but was not set" },
                    memo,
                    transactionToken,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferCreateParams &&
            this.amount == other.amount &&
            this.from == other.from &&
            this.to == other.to &&
            this.memo == other.memo &&
            this.transactionToken == other.transactionToken &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            from,
            to,
            memo,
            transactionToken,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransferCreateParams{amount=$amount, from=$from, to=$to, memo=$memo, transactionToken=$transactionToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var from: String? = null
        private var to: String? = null
        private var memo: String? = null
        private var transactionToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferCreateParams: TransferCreateParams) = apply {
            this.amount = transferCreateParams.amount
            this.from = transferCreateParams.from
            this.to = transferCreateParams.to
            this.memo = transferCreateParams.memo
            this.transactionToken = transferCreateParams.transactionToken
            additionalQueryParams(transferCreateParams.additionalQueryParams)
            additionalHeaders(transferCreateParams.additionalHeaders)
            additionalBodyProperties(transferCreateParams.additionalBodyProperties)
        }

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Globally unique identifier for the financial account that will send the funds. */
        fun from(from: String) = apply { this.from = from }

        /** Globally unique identifier for the financial account that will receive the funds. */
        fun to(to: String) = apply { this.to = to }

        /** Optional descriptor for the transfer. */
        fun memo(memo: String) = apply { this.memo = memo }

        /** Customer-provided transaction_token that will serve as an idempotency token. */
        fun transactionToken(transactionToken: String) = apply {
            this.transactionToken = transactionToken
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): TransferCreateParams =
            TransferCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(from) { "`from` is required but was not set" },
                checkNotNull(to) { "`to` is required but was not set" },
                memo,
                transactionToken,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
