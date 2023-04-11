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

class TransactionSimulateCreditAuthorizationParams constructor(private val amount: Long,private val descriptor: String,private val pan: String,private val merchantAcceptorId: String?,private val mcc: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

    fun mcc(): Optional<String> = Optional.ofNullable(mcc)

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateCreditAuthorizationBody {
      return TransactionSimulateCreditAuthorizationBody(
          amount,
          descriptor,
          pan,
          merchantAcceptorId,
          mcc,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionSimulateCreditAuthorizationBody.Builder::class)
    @NoAutoDetect
    class TransactionSimulateCreditAuthorizationBody internal constructor(private val amount: Long?,private val descriptor: String?,private val pan: String?,private val merchantAcceptorId: String?,private val mcc: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in
         * the simulated transaction. For example, entering 100 in this field will appear
         * as a -100 amount in the transaction.
         */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor")
        fun descriptor(): String? = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan")
        fun pan(): String? = pan

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id")
        fun merchantAcceptorId(): String? = merchantAcceptorId

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number
         * listed in ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc")
        fun mcc(): String? = mcc

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TransactionSimulateCreditAuthorizationBody &&
              this.amount == other.amount &&
              this.descriptor == other.descriptor &&
              this.pan == other.pan &&
              this.merchantAcceptorId == other.merchantAcceptorId &&
              this.mcc == other.mcc &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                descriptor,
                pan,
                merchantAcceptorId,
                mcc,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "TransactionSimulateCreditAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, merchantAcceptorId=$merchantAcceptorId, mcc=$mcc, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var merchantAcceptorId: String? = null
            private var mcc: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSimulateCreditAuthorizationBody: TransactionSimulateCreditAuthorizationBody) = apply {
                this.amount = transactionSimulateCreditAuthorizationBody.amount
                this.descriptor = transactionSimulateCreditAuthorizationBody.descriptor
                this.pan = transactionSimulateCreditAuthorizationBody.pan
                this.merchantAcceptorId = transactionSimulateCreditAuthorizationBody.merchantAcceptorId
                this.mcc = transactionSimulateCreditAuthorizationBody.mcc
                additionalProperties(transactionSimulateCreditAuthorizationBody.additionalProperties)
            }

            /**
             * Amount (in cents). Any value entered will be converted into a negative amount in
             * the simulated transaction. For example, entering 100 in this field will appear
             * as a -100 amount in the transaction.
             */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply {
                this.descriptor = descriptor
            }

            /** Sixteen digit card number. */
            @JsonProperty("pan")
            fun pan(pan: String) = apply {
                this.pan = pan
            }

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            @JsonProperty("mcc")
            fun mcc(mcc: String) = apply {
                this.mcc = mcc
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

            fun build(): TransactionSimulateCreditAuthorizationBody = TransactionSimulateCreditAuthorizationBody(
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                checkNotNull(descriptor) {
                    "`descriptor` is required but was not set"
                },
                checkNotNull(pan) {
                    "`pan` is required but was not set"
                },
                merchantAcceptorId,
                mcc,
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

      return other is TransactionSimulateCreditAuthorizationParams &&
          this.amount == other.amount &&
          this.descriptor == other.descriptor &&
          this.pan == other.pan &&
          this.merchantAcceptorId == other.merchantAcceptorId &&
          this.mcc == other.mcc &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          amount,
          descriptor,
          pan,
          merchantAcceptorId,
          mcc,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "TransactionSimulateCreditAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, merchantAcceptorId=$merchantAcceptorId, mcc=$mcc, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var merchantAcceptorId: String? = null
        private var mcc: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateCreditAuthorizationParams: TransactionSimulateCreditAuthorizationParams) = apply {
            this.amount = transactionSimulateCreditAuthorizationParams.amount
            this.descriptor = transactionSimulateCreditAuthorizationParams.descriptor
            this.pan = transactionSimulateCreditAuthorizationParams.pan
            this.merchantAcceptorId = transactionSimulateCreditAuthorizationParams.merchantAcceptorId
            this.mcc = transactionSimulateCreditAuthorizationParams.mcc
            additionalQueryParams(transactionSimulateCreditAuthorizationParams.additionalQueryParams)
            additionalHeaders(transactionSimulateCreditAuthorizationParams.additionalHeaders)
            additionalBodyProperties(transactionSimulateCreditAuthorizationParams.additionalBodyProperties)
        }

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in
         * the simulated transaction. For example, entering 100 in this field will appear
         * as a -100 amount in the transaction.
         */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply {
            this.descriptor = descriptor
        }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply {
            this.pan = pan
        }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number
         * listed in ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply {
            this.mcc = mcc
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

        fun build(): TransactionSimulateCreditAuthorizationParams = TransactionSimulateCreditAuthorizationParams(
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            checkNotNull(descriptor) {
                "`descriptor` is required but was not set"
            },
            checkNotNull(pan) {
                "`pan` is required but was not set"
            },
            merchantAcceptorId,
            mcc,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
