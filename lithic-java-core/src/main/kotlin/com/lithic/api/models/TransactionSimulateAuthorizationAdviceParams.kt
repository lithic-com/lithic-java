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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class TransactionSimulateAuthorizationAdviceParams constructor(private val amount: Long,private val token: String,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun amount(): Long = amount

    fun token(): String = token

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateAuthorizationAdviceBody {
      return TransactionSimulateAuthorizationAdviceBody(
          amount,
          token,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionSimulateAuthorizationAdviceBody.Builder::class)
    @NoAutoDetect
    class TransactionSimulateAuthorizationAdviceBody internal constructor(private val amount: Long?,private val token: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents) to authorize. This amount will override the transaction's
         * amount that was originally set by /v1/simulate/authorize.
         */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token")
        fun token(): String? = token

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TransactionSimulateAuthorizationAdviceBody &&
              this.amount == other.amount &&
              this.token == other.token &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                token,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "TransactionSimulateAuthorizationAdviceBody{amount=$amount, token=$token, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var token: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSimulateAuthorizationAdviceBody: TransactionSimulateAuthorizationAdviceBody) = apply {
                this.amount = transactionSimulateAuthorizationAdviceBody.amount
                this.token = transactionSimulateAuthorizationAdviceBody.token
                additionalProperties(transactionSimulateAuthorizationAdviceBody.additionalProperties)
            }

            /**
             * Amount (in cents) to authorize. This amount will override the transaction's
             * amount that was originally set by /v1/simulate/authorize.
             */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            @JsonProperty("token")
            fun token(token: String) = apply {
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

            fun build(): TransactionSimulateAuthorizationAdviceBody = TransactionSimulateAuthorizationAdviceBody(
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                checkNotNull(token) {
                    "`token` is required but was not set"
                },
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

      return other is TransactionSimulateAuthorizationAdviceParams &&
          this.amount == other.amount &&
          this.token == other.token &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          amount,
          token,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "TransactionSimulateAuthorizationAdviceParams{amount=$amount, token=$token, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var token: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateAuthorizationAdviceParams: TransactionSimulateAuthorizationAdviceParams) = apply {
            this.amount = transactionSimulateAuthorizationAdviceParams.amount
            this.token = transactionSimulateAuthorizationAdviceParams.token
            additionalQueryParams(transactionSimulateAuthorizationAdviceParams.additionalQueryParams)
            additionalHeaders(transactionSimulateAuthorizationAdviceParams.additionalHeaders)
            additionalBodyProperties(transactionSimulateAuthorizationAdviceParams.additionalBodyProperties)
        }

        /**
         * Amount (in cents) to authorize. This amount will override the transaction's
         * amount that was originally set by /v1/simulate/authorize.
         */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply {
            this.token = token
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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): TransactionSimulateAuthorizationAdviceParams = TransactionSimulateAuthorizationAdviceParams(
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            checkNotNull(token) {
                "`token` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
