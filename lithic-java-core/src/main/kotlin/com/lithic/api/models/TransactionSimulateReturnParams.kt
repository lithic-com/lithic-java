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

class TransactionSimulateReturnParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateReturnBody {
        return TransactionSimulateReturnBody(
            amount,
            descriptor,
            pan,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateReturnBody
    internal constructor(
        private val amount: Long?,
        private val descriptor: String?,
        private val pan: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Amount (in cents) to authorize. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor") fun descriptor(): String? = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateReturnBody &&
                this.amount == other.amount &&
                this.descriptor == other.descriptor &&
                this.pan == other.pan &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        descriptor,
                        pan,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateReturnBody{amount=$amount, descriptor=$descriptor, pan=$pan, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSimulateReturnBody: TransactionSimulateReturnBody) =
                apply {
                    this.amount = transactionSimulateReturnBody.amount
                    this.descriptor = transactionSimulateReturnBody.descriptor
                    this.pan = transactionSimulateReturnBody.pan
                    additionalProperties(transactionSimulateReturnBody.additionalProperties)
                }

            /** Amount (in cents) to authorize. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

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

            fun build(): TransactionSimulateReturnBody =
                TransactionSimulateReturnBody(
                    checkNotNull(amount) { "Property `amount` is required but was not set" },
                    checkNotNull(descriptor) {
                        "Property `descriptor` is required but was not set"
                    },
                    checkNotNull(pan) { "Property `pan` is required but was not set" },
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

        return other is TransactionSimulateReturnParams &&
            this.amount == other.amount &&
            this.descriptor == other.descriptor &&
            this.pan == other.pan &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            descriptor,
            pan,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateReturnParams{amount=$amount, descriptor=$descriptor, pan=$pan, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateReturnParams: TransactionSimulateReturnParams) =
            apply {
                this.amount = transactionSimulateReturnParams.amount
                this.descriptor = transactionSimulateReturnParams.descriptor
                this.pan = transactionSimulateReturnParams.pan
                additionalQueryParams(transactionSimulateReturnParams.additionalQueryParams)
                additionalHeaders(transactionSimulateReturnParams.additionalHeaders)
                additionalBodyProperties(transactionSimulateReturnParams.additionalBodyProperties)
            }

        /** Amount (in cents) to authorize. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

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

        fun build(): TransactionSimulateReturnParams =
            TransactionSimulateReturnParams(
                checkNotNull(amount) { "Property `amount` is required but was not set" },
                checkNotNull(descriptor) { "Property `descriptor` is required but was not set" },
                checkNotNull(pan) { "Property `pan` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
