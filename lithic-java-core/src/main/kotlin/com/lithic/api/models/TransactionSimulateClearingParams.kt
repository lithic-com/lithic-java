package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
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
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun token(): String = token

    @JvmSynthetic
    internal fun toBody(): TransactionSimulateClearingBody =
        TransactionSimulateClearingBody(amount, token, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

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
                amount == other.amount &&
                token == other.token &&
                additionalProperties == other.additionalProperties
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

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSimulateClearingParams &&
            amount == other.amount &&
            token == other.token &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
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
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
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
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
