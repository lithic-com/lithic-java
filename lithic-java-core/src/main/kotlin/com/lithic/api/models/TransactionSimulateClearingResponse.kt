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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class TransactionSimulateClearingResponse
@JsonCreator
private constructor(
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    private val debuggingRequestId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Debugging request ID to share with Lithic Support team. */
    fun debuggingRequestId(): Optional<String> =
        Optional.ofNullable(debuggingRequestId.getNullable("debugging_request_id"))

    /** Debugging request ID to share with Lithic Support team. */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId(): JsonField<String> = debuggingRequestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionSimulateClearingResponse = apply {
        if (validated) {
            return@apply
        }

        debuggingRequestId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateClearingResponse]. */
    class Builder internal constructor() {

        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateClearingResponse: TransactionSimulateClearingResponse
        ) = apply {
            debuggingRequestId = transactionSimulateClearingResponse.debuggingRequestId
            additionalProperties =
                transactionSimulateClearingResponse.additionalProperties.toMutableMap()
        }

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
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

        fun build(): TransactionSimulateClearingResponse =
            TransactionSimulateClearingResponse(
                debuggingRequestId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateClearingResponse && debuggingRequestId == other.debuggingRequestId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(debuggingRequestId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionSimulateClearingResponse{debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"
}
