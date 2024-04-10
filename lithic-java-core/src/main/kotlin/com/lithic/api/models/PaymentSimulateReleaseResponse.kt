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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PaymentSimulateReleaseResponse.Builder::class)
@NoAutoDetect
class PaymentSimulateReleaseResponse
private constructor(
    private val debuggingRequestId: JsonField<String>,
    private val result: JsonField<Result>,
    private val transactionEventToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun debuggingRequestId(): Optional<String> =
        Optional.ofNullable(debuggingRequestId.getNullable("debugging_request_id"))

    fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

    fun transactionEventToken(): Optional<String> =
        Optional.ofNullable(transactionEventToken.getNullable("transaction_event_token"))

    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId() = debuggingRequestId

    @JsonProperty("result") @ExcludeMissing fun _result() = result

    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    fun _transactionEventToken() = transactionEventToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentSimulateReleaseResponse = apply {
        if (!validated) {
            debuggingRequestId()
            result()
            transactionEventToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentSimulateReleaseResponse &&
            this.debuggingRequestId == other.debuggingRequestId &&
            this.result == other.result &&
            this.transactionEventToken == other.transactionEventToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    debuggingRequestId,
                    result,
                    transactionEventToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaymentSimulateReleaseResponse{debuggingRequestId=$debuggingRequestId, result=$result, transactionEventToken=$transactionEventToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var transactionEventToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateReleaseResponse: PaymentSimulateReleaseResponse) = apply {
            this.debuggingRequestId = paymentSimulateReleaseResponse.debuggingRequestId
            this.result = paymentSimulateReleaseResponse.result
            this.transactionEventToken = paymentSimulateReleaseResponse.transactionEventToken
            additionalProperties(paymentSimulateReleaseResponse.additionalProperties)
        }

        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        fun result(result: Result) = result(JsonField.of(result))

        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        fun transactionEventToken(transactionEventToken: String) =
            transactionEventToken(JsonField.of(transactionEventToken))

        @JsonProperty("transaction_event_token")
        @ExcludeMissing
        fun transactionEventToken(transactionEventToken: JsonField<String>) = apply {
            this.transactionEventToken = transactionEventToken
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

        fun build(): PaymentSimulateReleaseResponse =
            PaymentSimulateReleaseResponse(
                debuggingRequestId,
                result,
                transactionEventToken,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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
    }
}
