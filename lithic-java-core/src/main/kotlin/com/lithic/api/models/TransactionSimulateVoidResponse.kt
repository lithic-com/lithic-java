package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = TransactionSimulateVoidResponse.Builder::class)
@NoAutoDetect
class TransactionSimulateVoidResponse
private constructor(
    private val debuggingRequestId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {
    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Debugging request ID to share with Lithic Support team. */
    fun debuggingRequestId(): Optional<String> =
        Optional.ofNullable(debuggingRequestId.getNullable("debugging_request_id"))

    /** Debugging request ID to share with Lithic Support team. */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId() = debuggingRequestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            debuggingRequestId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSimulateVoidResponse &&
            debuggingRequestId == other.debuggingRequestId &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(debuggingRequestId, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "TransactionSimulateVoidResponse{debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateVoidResponse: TransactionSimulateVoidResponse) =
            apply {
                this.debuggingRequestId = transactionSimulateVoidResponse.debuggingRequestId
                additionalProperties(transactionSimulateVoidResponse.additionalProperties)
            }

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging request ID to share with Lithic Support team. */
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperties(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): TransactionSimulateVoidResponse =
            TransactionSimulateVoidResponse(
                debuggingRequestId,
                additionalProperties.toUnmodifiable()
            )
    }
}
