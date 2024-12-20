// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = PaymentSimulateReceiptResponse.Builder::class)
@NoAutoDetect
class PaymentSimulateReceiptResponse
private constructor(
    private val result: JsonField<Result>,
    private val transactionEventToken: JsonField<String>,
    private val debuggingRequestId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Request Result */
    fun result(): Result = result.getRequired("result")

    /** Transaction Event Token */
    fun transactionEventToken(): String =
        transactionEventToken.getRequired("transaction_event_token")

    /** Debugging Request Id */
    fun debuggingRequestId(): String = debuggingRequestId.getRequired("debugging_request_id")

    /** Request Result */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /** Transaction Event Token */
    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    fun _transactionEventToken() = transactionEventToken

    /** Debugging Request Id */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId() = debuggingRequestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentSimulateReceiptResponse = apply {
        if (!validated) {
            result()
            transactionEventToken()
            debuggingRequestId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var result: JsonField<Result> = JsonMissing.of()
        private var transactionEventToken: JsonField<String> = JsonMissing.of()
        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateReceiptResponse: PaymentSimulateReceiptResponse) = apply {
            result = paymentSimulateReceiptResponse.result
            transactionEventToken = paymentSimulateReceiptResponse.transactionEventToken
            debuggingRequestId = paymentSimulateReceiptResponse.debuggingRequestId
            additionalProperties =
                paymentSimulateReceiptResponse.additionalProperties.toMutableMap()
        }

        /** Request Result */
        fun result(result: Result) = result(JsonField.of(result))

        /** Request Result */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Transaction Event Token */
        fun transactionEventToken(transactionEventToken: String) =
            transactionEventToken(JsonField.of(transactionEventToken))

        /** Transaction Event Token */
        @JsonProperty("transaction_event_token")
        @ExcludeMissing
        fun transactionEventToken(transactionEventToken: JsonField<String>) = apply {
            this.transactionEventToken = transactionEventToken
        }

        /** Debugging Request Id */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging Request Id */
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): PaymentSimulateReceiptResponse =
            PaymentSimulateReceiptResponse(
                result,
                transactionEventToken,
                debuggingRequestId,
                additionalProperties.toImmutable(),
            )
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateReceiptResponse && result == other.result && transactionEventToken == other.transactionEventToken && debuggingRequestId == other.debuggingRequestId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(result, transactionEventToken, debuggingRequestId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentSimulateReceiptResponse{result=$result, transactionEventToken=$transactionEventToken, debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"
}
