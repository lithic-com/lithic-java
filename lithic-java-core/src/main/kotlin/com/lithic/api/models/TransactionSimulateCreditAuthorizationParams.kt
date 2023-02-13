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

class TransactionSimulateCreditAuthorizationParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val merchantAcceptorId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateCreditAuthorizationBody {
        return TransactionSimulateCreditAuthorizationBody(
            amount,
            descriptor,
            pan,
            merchantAcceptorId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateCreditAuthorizationBody
    internal constructor(
        private val amount: Long?,
        private val descriptor: String?,
        private val pan: String?,
        private val merchantAcceptorId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor") fun descriptor(): String? = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id") fun merchantAcceptorId(): String? = merchantAcceptorId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateCreditAuthorizationBody &&
                this.amount == other.amount &&
                this.descriptor == other.descriptor &&
                this.pan == other.pan &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        descriptor,
                        pan,
                        merchantAcceptorId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateCreditAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, merchantAcceptorId=$merchantAcceptorId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var merchantAcceptorId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                transactionSimulateCreditAuthorizationBody:
                    TransactionSimulateCreditAuthorizationBody
            ) = apply {
                this.amount = transactionSimulateCreditAuthorizationBody.amount
                this.descriptor = transactionSimulateCreditAuthorizationBody.descriptor
                this.pan = transactionSimulateCreditAuthorizationBody.pan
                this.merchantAcceptorId =
                    transactionSimulateCreditAuthorizationBody.merchantAcceptorId
                additionalProperties(
                    transactionSimulateCreditAuthorizationBody.additionalProperties
                )
            }

            /**
             * Amount (in cents). Any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
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

            fun build(): TransactionSimulateCreditAuthorizationBody =
                TransactionSimulateCreditAuthorizationBody(
                    checkNotNull(amount) { "Property `amount` is required but was not set" },
                    checkNotNull(descriptor) {
                        "Property `descriptor` is required but was not set"
                    },
                    checkNotNull(pan) { "Property `pan` is required but was not set" },
                    merchantAcceptorId,
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

        return other is TransactionSimulateCreditAuthorizationParams &&
            this.amount == other.amount &&
            this.descriptor == other.descriptor &&
            this.pan == other.pan &&
            this.merchantAcceptorId == other.merchantAcceptorId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            descriptor,
            pan,
            merchantAcceptorId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateCreditAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, merchantAcceptorId=$merchantAcceptorId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var merchantAcceptorId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateCreditAuthorizationParams:
                TransactionSimulateCreditAuthorizationParams
        ) = apply {
            this.amount = transactionSimulateCreditAuthorizationParams.amount
            this.descriptor = transactionSimulateCreditAuthorizationParams.descriptor
            this.pan = transactionSimulateCreditAuthorizationParams.pan
            this.merchantAcceptorId =
                transactionSimulateCreditAuthorizationParams.merchantAcceptorId
            additionalQueryParams(
                transactionSimulateCreditAuthorizationParams.additionalQueryParams
            )
            additionalHeaders(transactionSimulateCreditAuthorizationParams.additionalHeaders)
            additionalBodyProperties(
                transactionSimulateCreditAuthorizationParams.additionalBodyProperties
            )
        }

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

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

        fun build(): TransactionSimulateCreditAuthorizationParams =
            TransactionSimulateCreditAuthorizationParams(
                checkNotNull(amount) { "Property `amount` is required but was not set" },
                checkNotNull(descriptor) { "Property `descriptor` is required but was not set" },
                checkNotNull(pan) { "Property `pan` is required but was not set" },
                merchantAcceptorId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
