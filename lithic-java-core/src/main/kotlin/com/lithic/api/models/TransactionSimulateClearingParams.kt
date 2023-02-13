package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TransactionSimulateClearingParams
constructor(
    private val amount: Long?,
    private val token: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun token(): String = token

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateClearingBody {
        return TransactionSimulateClearingBody(
            amount,
            token,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateClearingBody
    internal constructor(
        private val amount: Long?,
        private val token: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents) to complete. Typically this will match the original authorization, but
         * may be more or less.
         *
         * If no amount is supplied to this endpoint, the amount of the transaction will be
         * captured. Any transaction that has any amount completed at all do not have access to this
         * behavior.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token") fun token(): String? = token

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateClearingBody &&
                this.amount == other.amount &&
                this.token == other.token &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        token,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateClearingBody{amount=$amount, token=$token, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var token: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSimulateClearingBody: TransactionSimulateClearingBody) =
                apply {
                    this.amount = transactionSimulateClearingBody.amount
                    this.token = transactionSimulateClearingBody.token
                    additionalProperties(transactionSimulateClearingBody.additionalProperties)
                }

            /**
             * Amount (in cents) to complete. Typically this will match the original authorization,
             * but may be more or less.
             *
             * If no amount is supplied to this endpoint, the amount of the transaction will be
             * captured. Any transaction that has any amount completed at all do not have access to
             * this behavior.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

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

            fun build(): TransactionSimulateClearingBody =
                TransactionSimulateClearingBody(
                    amount,
                    checkNotNull(token) { "Property `token` is required but was not set" },
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

        return other is TransactionSimulateClearingParams &&
            this.amount == other.amount &&
            this.token == other.token &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            token,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateClearingParams{amount=$amount, token=$token, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var token: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateClearingParams: TransactionSimulateClearingParams) =
            apply {
                this.amount = transactionSimulateClearingParams.amount
                this.token = transactionSimulateClearingParams.token
                additionalQueryParams(transactionSimulateClearingParams.additionalQueryParams)
                additionalHeaders(transactionSimulateClearingParams.additionalHeaders)
                additionalBodyProperties(transactionSimulateClearingParams.additionalBodyProperties)
            }

        /**
         * Amount (in cents) to complete. Typically this will match the original authorization, but
         * may be more or less.
         *
         * If no amount is supplied to this endpoint, the amount of the transaction will be
         * captured. Any transaction that has any amount completed at all do not have access to this
         * behavior.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply { this.token = token }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putQueryParam(key: String, value: List<String>) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParam)
        }

        fun removeQueryParam(key: String) = apply {
            this.additionalQueryParams.put(key, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(key: String, value: String) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putHeader(key: String, value: List<String>) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            additionalHeaders.forEach(this::putHeader)
        }

        fun removeHeader(key: String) = apply { this.additionalHeaders.put(key, mutableListOf()) }

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

        fun build(): TransactionSimulateClearingParams =
            TransactionSimulateClearingParams(
                amount,
                checkNotNull(token) { "Property `token` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
