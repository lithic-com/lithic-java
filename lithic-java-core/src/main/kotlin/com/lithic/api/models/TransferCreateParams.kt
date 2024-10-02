// File generated from our OpenAPI spec by Stainless.

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
    private val token: String?,
    private val memo: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun from(): String = from

    fun to(): String = to

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    @JvmSynthetic
    internal fun getBody(): TransferCreateBody {
        return TransferCreateBody(
            amount,
            from,
            to,
            token,
            memo,
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
        private val token: String?,
        private val memo: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("from") fun from(): String? = from

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("to") fun to(): String? = to

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") fun token(): String? = token

        /** Optional descriptor for the transfer. */
        @JsonProperty("memo") fun memo(): String? = memo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var from: String? = null
            private var to: String? = null
            private var token: String? = null
            private var memo: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferCreateBody: TransferCreateBody) = apply {
                this.amount = transferCreateBody.amount
                this.from = transferCreateBody.from
                this.to = transferCreateBody.to
                this.token = transferCreateBody.token
                this.memo = transferCreateBody.memo
                additionalProperties(transferCreateBody.additionalProperties)
            }

            /**
             * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
             * should always be a positive value.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Globally unique identifier for the financial account or card that will send the
             * funds. Accepted type dependent on the program's use case.
             */
            @JsonProperty("from") fun from(from: String) = apply { this.from = from }

            /**
             * Globally unique identifier for the financial account or card that will receive the
             * funds. Accepted type dependent on the program's use case.
             */
            @JsonProperty("to") fun to(to: String) = apply { this.to = to }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /** Optional descriptor for the transfer. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

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
                    token,
                    memo,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransferCreateBody &&
                this.amount == other.amount &&
                this.from == other.from &&
                this.to == other.to &&
                this.token == other.token &&
                this.memo == other.memo &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        from,
                        to,
                        token,
                        memo,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransferCreateBody{amount=$amount, from=$from, to=$to, token=$token, memo=$memo, additionalProperties=$additionalProperties}"
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
            this.token == other.token &&
            this.memo == other.memo &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            from,
            to,
            token,
            memo,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransferCreateParams{amount=$amount, from=$from, to=$to, token=$token, memo=$memo, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var from: String? = null
        private var to: String? = null
        private var token: String? = null
        private var memo: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferCreateParams: TransferCreateParams) = apply {
            this.amount = transferCreateParams.amount
            this.from = transferCreateParams.from
            this.to = transferCreateParams.to
            this.token = transferCreateParams.token
            this.memo = transferCreateParams.memo
            additionalQueryParams(transferCreateParams.additionalQueryParams)
            additionalHeaders(transferCreateParams.additionalHeaders)
            additionalBodyProperties(transferCreateParams.additionalBodyProperties)
        }

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun from(from: String) = apply { this.from = from }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        fun to(to: String) = apply { this.to = to }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = apply { this.token = token }

        /** Optional descriptor for the transfer. */
        fun memo(memo: String) = apply { this.memo = memo }

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
                token,
                memo,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
