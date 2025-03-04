// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Simulates a return of a Payment. */
class PaymentSimulateReturnParams
private constructor(
    private val body: SimulateOriginationReturnRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Payment Token */
    fun paymentToken(): String = body.paymentToken()

    /** Return Reason Code */
    fun returnReasonCode(): Optional<String> = body.returnReasonCode()

    /** Payment Token */
    fun _paymentToken(): JsonField<String> = body._paymentToken()

    /** Return Reason Code */
    fun _returnReasonCode(): JsonField<String> = body._returnReasonCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SimulateOriginationReturnRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulateOriginationReturnRequest
    @JsonCreator
    private constructor(
        @JsonProperty("payment_token")
        @ExcludeMissing
        private val paymentToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        private val returnReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Payment Token */
        fun paymentToken(): String = paymentToken.getRequired("payment_token")

        /** Return Reason Code */
        fun returnReasonCode(): Optional<String> =
            Optional.ofNullable(returnReasonCode.getNullable("return_reason_code"))

        /** Payment Token */
        @JsonProperty("payment_token")
        @ExcludeMissing
        fun _paymentToken(): JsonField<String> = paymentToken

        /** Return Reason Code */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<String> = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulateOriginationReturnRequest = apply {
            if (validated) {
                return@apply
            }

            paymentToken()
            returnReasonCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [SimulateOriginationReturnRequest].
             *
             * The following fields are required:
             * ```java
             * .paymentToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulateOriginationReturnRequest]. */
        class Builder internal constructor() {

            private var paymentToken: JsonField<String>? = null
            private var returnReasonCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulateOriginationReturnRequest: SimulateOriginationReturnRequest) =
                apply {
                    paymentToken = simulateOriginationReturnRequest.paymentToken
                    returnReasonCode = simulateOriginationReturnRequest.returnReasonCode
                    additionalProperties =
                        simulateOriginationReturnRequest.additionalProperties.toMutableMap()
                }

            /** Payment Token */
            fun paymentToken(paymentToken: String) = paymentToken(JsonField.of(paymentToken))

            /** Payment Token */
            fun paymentToken(paymentToken: JsonField<String>) = apply {
                this.paymentToken = paymentToken
            }

            /** Return Reason Code */
            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /** Return Reason Code */
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

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

            fun build(): SimulateOriginationReturnRequest =
                SimulateOriginationReturnRequest(
                    checkRequired("paymentToken", paymentToken),
                    returnReasonCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulateOriginationReturnRequest && paymentToken == other.paymentToken && returnReasonCode == other.returnReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentToken, returnReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulateOriginationReturnRequest{paymentToken=$paymentToken, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentSimulateReturnParams].
         *
         * The following fields are required:
         * ```java
         * .paymentToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentSimulateReturnParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SimulateOriginationReturnRequest.Builder =
            SimulateOriginationReturnRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentSimulateReturnParams: PaymentSimulateReturnParams) = apply {
            body = paymentSimulateReturnParams.body.toBuilder()
            additionalHeaders = paymentSimulateReturnParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentSimulateReturnParams.additionalQueryParams.toBuilder()
        }

        /** Payment Token */
        fun paymentToken(paymentToken: String) = apply { body.paymentToken(paymentToken) }

        /** Payment Token */
        fun paymentToken(paymentToken: JsonField<String>) = apply {
            body.paymentToken(paymentToken)
        }

        /** Return Reason Code */
        fun returnReasonCode(returnReasonCode: String) = apply {
            body.returnReasonCode(returnReasonCode)
        }

        /** Return Reason Code */
        fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
            body.returnReasonCode(returnReasonCode)
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

        fun build(): PaymentSimulateReturnParams =
            PaymentSimulateReturnParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateReturnParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentSimulateReturnParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
