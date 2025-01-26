// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@NoAutoDetect
class PaymentSimulateReleaseResponse
@JsonCreator
private constructor(
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    private val debuggingRequestId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<Result> = JsonMissing.of(),
    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    private val transactionEventToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Debugging Request Id */
    fun debuggingRequestId(): String = debuggingRequestId.getRequired("debugging_request_id")

    /** Request Result */
    fun result(): Result = result.getRequired("result")

    /** Transaction Event Token */
    fun transactionEventToken(): String =
        transactionEventToken.getRequired("transaction_event_token")

    /** Debugging Request Id */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId(): JsonField<String> = debuggingRequestId

    /** Request Result */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /** Transaction Event Token */
    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    fun _transactionEventToken(): JsonField<String> = transactionEventToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentSimulateReleaseResponse = apply {
        if (validated) {
            return@apply
        }

        debuggingRequestId()
        result()
        transactionEventToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var debuggingRequestId: JsonField<String>? = null
        private var result: JsonField<Result>? = null
        private var transactionEventToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateReleaseResponse: PaymentSimulateReleaseResponse) = apply {
            debuggingRequestId = paymentSimulateReleaseResponse.debuggingRequestId
            result = paymentSimulateReleaseResponse.result
            transactionEventToken = paymentSimulateReleaseResponse.transactionEventToken
            additionalProperties =
                paymentSimulateReleaseResponse.additionalProperties.toMutableMap()
        }

        /** Debugging Request Id */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging Request Id */
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        /** Request Result */
        fun result(result: Result) = result(JsonField.of(result))

        /** Request Result */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Transaction Event Token */
        fun transactionEventToken(transactionEventToken: String) =
            transactionEventToken(JsonField.of(transactionEventToken))

        /** Transaction Event Token */
        fun transactionEventToken(transactionEventToken: JsonField<String>) = apply {
            this.transactionEventToken = transactionEventToken
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

        fun build(): PaymentSimulateReleaseResponse =
            PaymentSimulateReleaseResponse(
                checkRequired("debuggingRequestId", debuggingRequestId),
                checkRequired("result", result),
                checkRequired("transactionEventToken", transactionEventToken),
                additionalProperties.toImmutable(),
            )
    }

    /** Request Result */
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

        return /* spotless:off */ other is PaymentSimulateReleaseResponse && debuggingRequestId == other.debuggingRequestId && result == other.result && transactionEventToken == other.transactionEventToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(debuggingRequestId, result, transactionEventToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentSimulateReleaseResponse{debuggingRequestId=$debuggingRequestId, result=$result, transactionEventToken=$transactionEventToken, additionalProperties=$additionalProperties}"
}
