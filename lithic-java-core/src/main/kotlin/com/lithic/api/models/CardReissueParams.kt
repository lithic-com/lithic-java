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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class CardReissueParams constructor(private val cardToken: String,private val shippingAddress: ShippingAddress?,private val shippingMethod: ShippingMethod?,private val productId: String?,private val additionalQueryParams: ListMultimap<String, String>,private val additionalHeaders: ListMultimap<String, String>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun cardToken(): String = cardToken

    fun shippingAddress(): Optional<ShippingAddress> = Optional.ofNullable(shippingAddress)

    fun shippingMethod(): Optional<ShippingMethod> = Optional.ofNullable(shippingMethod)

    fun productId(): Optional<String> = Optional.ofNullable(productId)

    @JvmSynthetic
    internal fun toBody(): CardReissueBody = CardReissueBody(
        shippingAddress,
        shippingMethod,
        productId,
        additionalBodyProperties
    )

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic
    internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> cardToken
          else -> ""
      }
    }

    @NoAutoDetect
    class CardReissueBody internal constructor(private val shippingAddress: ShippingAddress?,private val shippingMethod: ShippingMethod?,private val productId: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** If omitted, the previous shipping address will be used. */
        @JsonProperty("shipping_address")
        fun shippingAddress(): ShippingAddress? = shippingAddress

        /**
         * Shipping method for the card. Use of options besides `STANDARD` require
         * additional permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no
         *   tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option,
         *   with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
         *   tracking
         */
        @JsonProperty("shipping_method")
        fun shippingMethod(): ShippingMethod? = shippingMethod

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be
         * manufactured with, and only applies to cards of type `PHYSICAL` [beta]. This
         * must be configured with Lithic before use.
         */
        @JsonProperty("product_id")
        fun productId(): String? = productId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CardReissueBody &&
              shippingAddress == other.shippingAddress &&
              shippingMethod == other.shippingMethod &&
              productId == other.productId &&
              additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                shippingAddress,
                shippingMethod,
                productId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CardReissueBody{shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, productId=$productId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var shippingAddress: ShippingAddress? = null
            private var shippingMethod: ShippingMethod? = null
            private var productId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardReissueBody: CardReissueBody) = apply {
                this.shippingAddress = cardReissueBody.shippingAddress
                this.shippingMethod = cardReissueBody.shippingMethod
                this.productId = cardReissueBody.productId
                additionalProperties(cardReissueBody.additionalProperties)
            }

            /** If omitted, the previous shipping address will be used. */
            @JsonProperty("shipping_address")
            fun shippingAddress(shippingAddress: ShippingAddress) = apply {
                this.shippingAddress = shippingAddress
            }

            /**
             * Shipping method for the card. Use of options besides `STANDARD` require
             * additional permissions.
             *
             * - `STANDARD` - USPS regular mail or similar international option, with no
             *   tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option,
             *   with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             *   tracking
             */
            @JsonProperty("shipping_method")
            fun shippingMethod(shippingMethod: ShippingMethod) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * Specifies the configuration (e.g. physical card art) that the card should be
             * manufactured with, and only applies to cards of type `PHYSICAL` [beta]. This
             * must be configured with Lithic before use.
             */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply {
                this.productId = productId
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

            fun build(): CardReissueBody = CardReissueBody(
                shippingAddress,
                shippingMethod,
                productId,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CardReissueParams &&
          cardToken == other.cardToken &&
          shippingAddress == other.shippingAddress &&
          shippingMethod == other.shippingMethod &&
          productId == other.productId &&
          additionalQueryParams == other.additionalQueryParams &&
          additionalHeaders == other.additionalHeaders &&
          additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cardToken,
          shippingAddress,
          shippingMethod,
          productId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CardReissueParams{cardToken=$cardToken, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, productId=$productId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var shippingAddress: ShippingAddress? = null
        private var shippingMethod: ShippingMethod? = null
        private var productId: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardReissueParams: CardReissueParams) = apply {
            this.cardToken = cardReissueParams.cardToken
            this.shippingAddress = cardReissueParams.shippingAddress
            this.shippingMethod = cardReissueParams.shippingMethod
            this.productId = cardReissueParams.productId
            additionalQueryParams(cardReissueParams.additionalQueryParams)
            additionalHeaders(cardReissueParams.additionalHeaders)
            additionalBodyProperties(cardReissueParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** If omitted, the previous shipping address will be used. */
        fun shippingAddress(shippingAddress: ShippingAddress) = apply { this.shippingAddress = shippingAddress }

        /**
         * Shipping method for the card. Use of options besides `STANDARD` require
         * additional permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no
         *   tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option,
         *   with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
         *   tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply { this.shippingMethod = shippingMethod }

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be
         * manufactured with, and only applies to cards of type `PHYSICAL` [beta]. This
         * must be configured with Lithic before use.
         */
        fun productId(productId: String) = apply { this.productId = productId }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply { this.additionalQueryParams.put(key, value) }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply { this.additionalHeaders.put(key, value) }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply { this.additionalBodyProperties.put(key, value) }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): CardReissueParams = CardReissueParams(
            checkNotNull(cardToken) { "Property `cardToken` is required but was not set" },
            shippingAddress,
            shippingMethod,
            productId,
            additionalQueryParams.toUnmodifiable(),
            additionalHeaders.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class ShippingMethod @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ShippingMethod &&
              value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val STANDARD = ShippingMethod(JsonField.of("STANDARD"))

            @JvmField val STANDARD_WITH_TRACKING = ShippingMethod(JsonField.of("STANDARD_WITH_TRACKING"))

            @JvmField val EXPEDITED = ShippingMethod(JsonField.of("EXPEDITED"))

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        enum class Known {
            STANDARD,
            STANDARD_WITH_TRACKING,
            EXPEDITED,
        }

        enum class Value {
            STANDARD,
            STANDARD_WITH_TRACKING,
            EXPEDITED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            STANDARD -> Value.STANDARD
            STANDARD_WITH_TRACKING -> Value.STANDARD_WITH_TRACKING
            EXPEDITED -> Value.EXPEDITED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            STANDARD -> Known.STANDARD
            STANDARD_WITH_TRACKING -> Known.STANDARD_WITH_TRACKING
            EXPEDITED -> Known.EXPEDITED
            else -> throw LithicInvalidDataException("Unknown CardReissueBody.ShippingMethod: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
