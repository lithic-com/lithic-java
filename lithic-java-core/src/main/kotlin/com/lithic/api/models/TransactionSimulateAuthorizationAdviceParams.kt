// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects

class TransactionSimulateAuthorizationAdviceParams
constructor(
    private val token: String,
    private val amount: Long,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun amount(): Long = amount

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateAuthorizationAdviceBody {
        return TransactionSimulateAuthorizationAdviceBody(
            token,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = TransactionSimulateAuthorizationAdviceBody.Builder::class)
    @NoAutoDetect
    class TransactionSimulateAuthorizationAdviceBody
    internal constructor(
        private val token: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token") fun token(): String? = token

        /**
         * Amount (in cents) to authorize. This amount will override the transaction's amount that
         * was originally set by /v1/simulate/authorize.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                transactionSimulateAuthorizationAdviceBody:
                    TransactionSimulateAuthorizationAdviceBody
            ) = apply {
                this.token = transactionSimulateAuthorizationAdviceBody.token
                this.amount = transactionSimulateAuthorizationAdviceBody.amount
                additionalProperties(
                    transactionSimulateAuthorizationAdviceBody.additionalProperties
                )
            }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /**
             * Amount (in cents) to authorize. This amount will override the transaction's amount
             * that was originally set by /v1/simulate/authorize.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

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

            fun build(): TransactionSimulateAuthorizationAdviceBody =
                TransactionSimulateAuthorizationAdviceBody(
                    checkNotNull(token) { "`token` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionSimulateAuthorizationAdviceBody && this.token == other.token && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(token, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateAuthorizationAdviceBody{token=$token, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateAuthorizationAdviceParams && this.token == other.token && this.amount == other.amount && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(token, amount, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "TransactionSimulateAuthorizationAdviceParams{token=$token, amount=$amount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var amount: Long? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateAuthorizationAdviceParams:
                TransactionSimulateAuthorizationAdviceParams
        ) = apply {
            this.token = transactionSimulateAuthorizationAdviceParams.token
            this.amount = transactionSimulateAuthorizationAdviceParams.amount
            additionalHeaders(transactionSimulateAuthorizationAdviceParams.additionalHeaders)
            additionalQueryParams(
                transactionSimulateAuthorizationAdviceParams.additionalQueryParams
            )
            additionalBodyProperties(
                transactionSimulateAuthorizationAdviceParams.additionalBodyProperties
            )
        }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply { this.token = token }

        /**
         * Amount (in cents) to authorize. This amount will override the transaction's amount that
         * was originally set by /v1/simulate/authorize.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

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

        fun build(): TransactionSimulateAuthorizationAdviceParams =
            TransactionSimulateAuthorizationAdviceParams(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
