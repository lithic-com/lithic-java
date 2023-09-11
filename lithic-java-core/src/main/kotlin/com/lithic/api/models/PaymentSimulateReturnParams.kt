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

class PaymentSimulateReturnParams
constructor(
    private val paymentToken: String,
    private val returnReasonCode: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun paymentToken(): String = paymentToken

    fun returnReasonCode(): Optional<String> = Optional.ofNullable(returnReasonCode)

    @JvmSynthetic
    internal fun getBody(): PaymentSimulateReturnBody {
        return PaymentSimulateReturnBody(
            paymentToken,
            returnReasonCode,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PaymentSimulateReturnBody.Builder::class)
    @NoAutoDetect
    class PaymentSimulateReturnBody
    internal constructor(
        private val paymentToken: String?,
        private val returnReasonCode: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("payment_token") fun paymentToken(): String? = paymentToken

        @JsonProperty("return_reason_code") fun returnReasonCode(): String? = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentSimulateReturnBody &&
                this.paymentToken == other.paymentToken &&
                this.returnReasonCode == other.returnReasonCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        paymentToken,
                        returnReasonCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentSimulateReturnBody{paymentToken=$paymentToken, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paymentToken: String? = null
            private var returnReasonCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentSimulateReturnBody: PaymentSimulateReturnBody) = apply {
                this.paymentToken = paymentSimulateReturnBody.paymentToken
                this.returnReasonCode = paymentSimulateReturnBody.returnReasonCode
                additionalProperties(paymentSimulateReturnBody.additionalProperties)
            }

            @JsonProperty("payment_token")
            fun paymentToken(paymentToken: String) = apply { this.paymentToken = paymentToken }

            @JsonProperty("return_reason_code")
            fun returnReasonCode(returnReasonCode: String) = apply {
                this.returnReasonCode = returnReasonCode
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

            fun build(): PaymentSimulateReturnBody =
                PaymentSimulateReturnBody(
                    checkNotNull(paymentToken) { "`paymentToken` is required but was not set" },
                    returnReasonCode,
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

        return other is PaymentSimulateReturnParams &&
            this.paymentToken == other.paymentToken &&
            this.returnReasonCode == other.returnReasonCode &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            paymentToken,
            returnReasonCode,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentSimulateReturnParams{paymentToken=$paymentToken, returnReasonCode=$returnReasonCode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var paymentToken: String? = null
        private var returnReasonCode: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateReturnParams: PaymentSimulateReturnParams) = apply {
            this.paymentToken = paymentSimulateReturnParams.paymentToken
            this.returnReasonCode = paymentSimulateReturnParams.returnReasonCode
            additionalQueryParams(paymentSimulateReturnParams.additionalQueryParams)
            additionalHeaders(paymentSimulateReturnParams.additionalHeaders)
            additionalBodyProperties(paymentSimulateReturnParams.additionalBodyProperties)
        }

        fun paymentToken(paymentToken: String) = apply { this.paymentToken = paymentToken }

        fun returnReasonCode(returnReasonCode: String) = apply {
            this.returnReasonCode = returnReasonCode
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

        fun build(): PaymentSimulateReturnParams =
            PaymentSimulateReturnParams(
                checkNotNull(paymentToken) { "`paymentToken` is required but was not set" },
                returnReasonCode,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
