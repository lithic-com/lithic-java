// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class TransferCreateParams
constructor(
    private val body: TransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This should
     * always be a positive value.
     */
    fun amount(): Long = body.amount()

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    fun from(): String = body.from()

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case.
     */
    fun to(): String = body.to()

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    fun token(): Optional<String> = body.token()

    /** Optional descriptor for the transfer. */
    fun memo(): Optional<String> = body.memo()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): TransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("from") private val from: String,
        @JsonProperty("to") private val to: String,
        @JsonProperty("token") private val token: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("from") fun from(): String = from

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("to") fun to(): String = to

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") fun token(): Optional<String> = Optional.ofNullable(token)

        /** Optional descriptor for the transfer. */
        @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

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
                amount = transferCreateBody.amount
                from = transferCreateBody.from
                to = transferCreateBody.to
                token = transferCreateBody.token
                memo = transferCreateBody.memo
                additionalProperties = transferCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
             * should always be a positive value.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Globally unique identifier for the financial account or card that will send the
             * funds. Accepted type dependent on the program's use case.
             */
            fun from(from: String) = apply { this.from = from }

            /**
             * Globally unique identifier for the financial account or card that will receive the
             * funds. Accepted type dependent on the program's use case.
             */
            fun to(to: String) = apply { this.to = to }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: String?) = apply { this.token = token }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: Optional<String>) = token(token.orElse(null))

            /** Optional descriptor for the transfer. */
            fun memo(memo: String?) = apply { this.memo = memo }

            /** Optional descriptor for the transfer. */
            fun memo(memo: Optional<String>) = memo(memo.orElse(null))

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): TransferCreateBody =
                TransferCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(from) { "`from` is required but was not set" },
                    checkNotNull(to) { "`to` is required but was not set" },
                    token,
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransferCreateBody && amount == other.amount && from == other.from && to == other.to && token == other.token && memo == other.memo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, from, to, token, memo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransferCreateBody{amount=$amount, from=$from, to=$to, token=$token, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: TransferCreateBody.Builder = TransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transferCreateParams: TransferCreateParams) = apply {
            body = transferCreateParams.body.toBuilder()
            additionalHeaders = transferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String?) = apply { body.token(token) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: Optional<String>) = token(token.orElse(null))

        /** Optional descriptor for the transfer. */
        fun memo(memo: String?) = apply { body.memo(memo) }

        /** Optional descriptor for the transfer. */
        fun memo(memo: Optional<String>) = memo(memo.orElse(null))

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): TransferCreateParams =
            TransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
