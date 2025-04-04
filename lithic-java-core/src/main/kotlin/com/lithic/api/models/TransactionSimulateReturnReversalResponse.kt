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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TransactionSimulateReturnReversalResponse
private constructor(
    private val debuggingRequestId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        debuggingRequestId: JsonField<String> = JsonMissing.of()
    ) : this(debuggingRequestId, mutableMapOf())

    /**
     * Debugging request ID to share with Lithic Support team.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debuggingRequestId(): Optional<String> =
        debuggingRequestId.getOptional("debugging_request_id")

    /**
     * Returns the raw JSON value of [debuggingRequestId].
     *
     * Unlike [debuggingRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId(): JsonField<String> = debuggingRequestId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateReturnReversalResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateReturnReversalResponse]. */
    class Builder internal constructor() {

        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateReturnReversalResponse: TransactionSimulateReturnReversalResponse
        ) = apply {
            debuggingRequestId = transactionSimulateReturnReversalResponse.debuggingRequestId
            additionalProperties =
                transactionSimulateReturnReversalResponse.additionalProperties.toMutableMap()
        }

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /**
         * Sets [Builder.debuggingRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debuggingRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [TransactionSimulateReturnReversalResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionSimulateReturnReversalResponse =
            TransactionSimulateReturnReversalResponse(
                debuggingRequestId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TransactionSimulateReturnReversalResponse = apply {
        if (validated) {
            return@apply
        }

        debuggingRequestId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int = (if (debuggingRequestId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateReturnReversalResponse && debuggingRequestId == other.debuggingRequestId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(debuggingRequestId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionSimulateReturnReversalResponse{debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"
}
