package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Objects
import java.util.Optional
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException

@JsonDeserialize(builder = TransactionSimulateAuthorizationResponse.Builder::class)
@NoAutoDetect
class TransactionSimulateAuthorizationResponse private constructor(private val debuggingRequestId: JsonField<String>,private val token: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Debugging request ID to share with Lithic Support team. */
    fun debuggingRequestId(): Optional<String> = Optional.ofNullable(debuggingRequestId.getNullable("debugging_request_id"))

    /**
     * A unique token to reference this transaction with later calls to void or clear
     * the authorization.
     */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** Debugging request ID to share with Lithic Support team. */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId() = debuggingRequestId

    /**
     * A unique token to reference this transaction with later calls to void or clear
     * the authorization.
     */
    @JsonProperty("token")
    @ExcludeMissing
    fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          debuggingRequestId()
          token()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is TransactionSimulateAuthorizationResponse &&
          debuggingRequestId == other.debuggingRequestId &&
          token == other.token &&
          additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            debuggingRequestId,
            token,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "TransactionSimulateAuthorizationResponse{debuggingRequestId=$debuggingRequestId, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateAuthorizationResponse: TransactionSimulateAuthorizationResponse) = apply {
            this.debuggingRequestId = transactionSimulateAuthorizationResponse.debuggingRequestId
            this.token = transactionSimulateAuthorizationResponse.token
            additionalProperties(transactionSimulateAuthorizationResponse.additionalProperties)
        }

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: String) = debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging request ID to share with Lithic Support team. */
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        /**
         * A unique token to reference this transaction with later calls to void or clear
         * the authorization.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A unique token to reference this transaction with later calls to void or clear
         * the authorization.
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply {
            this.token = token
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

        fun build(): TransactionSimulateAuthorizationResponse = TransactionSimulateAuthorizationResponse(
            debuggingRequestId,
            token,
            additionalProperties.toUnmodifiable(),
        )
    }
}
