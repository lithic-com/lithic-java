// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardRenewParams
constructor(
    private val cardToken: String,
    private val shippingAddress: ShippingAddress,
    private val carrier: Carrier?,
    private val expMonth: String?,
    private val expYear: String?,
    private val productId: String?,
    private val shippingMethod: ShippingMethod?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardToken(): String = cardToken

    fun shippingAddress(): ShippingAddress = shippingAddress

    fun carrier(): Optional<Carrier> = Optional.ofNullable(carrier)

    fun expMonth(): Optional<String> = Optional.ofNullable(expMonth)

    fun expYear(): Optional<String> = Optional.ofNullable(expYear)

    fun productId(): Optional<String> = Optional.ofNullable(productId)

    fun shippingMethod(): Optional<ShippingMethod> = Optional.ofNullable(shippingMethod)

    @JvmSynthetic
    internal fun getBody(): CardRenewBody {
        return CardRenewBody(
            shippingAddress,
            carrier,
            expMonth,
            expYear,
            productId,
            shippingMethod,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = CardRenewBody.Builder::class)
    @NoAutoDetect
    class CardRenewBody
    internal constructor(
        private val shippingAddress: ShippingAddress?,
        private val carrier: Carrier?,
        private val expMonth: String?,
        private val expYear: String?,
        private val productId: String?,
        private val shippingMethod: ShippingMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The shipping address this card will be sent to. */
        @JsonProperty("shipping_address") fun shippingAddress(): ShippingAddress? = shippingAddress

        /** If omitted, the previous carrier will be used. */
        @JsonProperty("carrier") fun carrier(): Carrier? = carrier

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        @JsonProperty("exp_month") fun expMonth(): String? = expMonth

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        @JsonProperty("exp_year") fun expYear(): String? = expYear

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Shipping method for the card. Use of options besides `STANDARD` require additional
         * permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         * tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        @JsonProperty("shipping_method") fun shippingMethod(): ShippingMethod? = shippingMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardRenewBody &&
                this.shippingAddress == other.shippingAddress &&
                this.carrier == other.carrier &&
                this.expMonth == other.expMonth &&
                this.expYear == other.expYear &&
                this.productId == other.productId &&
                this.shippingMethod == other.shippingMethod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        shippingAddress,
                        carrier,
                        expMonth,
                        expYear,
                        productId,
                        shippingMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardRenewBody{shippingAddress=$shippingAddress, carrier=$carrier, expMonth=$expMonth, expYear=$expYear, productId=$productId, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var shippingAddress: ShippingAddress? = null
            private var carrier: Carrier? = null
            private var expMonth: String? = null
            private var expYear: String? = null
            private var productId: String? = null
            private var shippingMethod: ShippingMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardRenewBody: CardRenewBody) = apply {
                this.shippingAddress = cardRenewBody.shippingAddress
                this.carrier = cardRenewBody.carrier
                this.expMonth = cardRenewBody.expMonth
                this.expYear = cardRenewBody.expYear
                this.productId = cardRenewBody.productId
                this.shippingMethod = cardRenewBody.shippingMethod
                additionalProperties(cardRenewBody.additionalProperties)
            }

            /** The shipping address this card will be sent to. */
            @JsonProperty("shipping_address")
            fun shippingAddress(shippingAddress: ShippingAddress) = apply {
                this.shippingAddress = shippingAddress
            }

            /** If omitted, the previous carrier will be used. */
            @JsonProperty("carrier")
            fun carrier(carrier: Carrier) = apply { this.carrier = carrier }

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            @JsonProperty("exp_month")
            fun expMonth(expMonth: String) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            @JsonProperty("exp_year")
            fun expYear(expYear: String) = apply { this.expYear = expYear }

            /**
             * Specifies the configuration (e.g. physical card art) that the card should be
             * manufactured with, and only applies to cards of type `PHYSICAL`. This must be
             * configured with Lithic before use.
             */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Shipping method for the card. Use of options besides `STANDARD` require additional
             * permissions.
             *
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             * tracking
             * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
             * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
             * - `2_DAY` - FedEx 2-day shipping, with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             * tracking
             */
            @JsonProperty("shipping_method")
            fun shippingMethod(shippingMethod: ShippingMethod) = apply {
                this.shippingMethod = shippingMethod
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

            fun build(): CardRenewBody =
                CardRenewBody(
                    checkNotNull(shippingAddress) {
                        "`shippingAddress` is required but was not set"
                    },
                    carrier,
                    expMonth,
                    expYear,
                    productId,
                    shippingMethod,
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

        return other is CardRenewParams &&
            this.cardToken == other.cardToken &&
            this.shippingAddress == other.shippingAddress &&
            this.carrier == other.carrier &&
            this.expMonth == other.expMonth &&
            this.expYear == other.expYear &&
            this.productId == other.productId &&
            this.shippingMethod == other.shippingMethod &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardToken,
            shippingAddress,
            carrier,
            expMonth,
            expYear,
            productId,
            shippingMethod,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardRenewParams{cardToken=$cardToken, shippingAddress=$shippingAddress, carrier=$carrier, expMonth=$expMonth, expYear=$expYear, productId=$productId, shippingMethod=$shippingMethod, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var shippingAddress: ShippingAddress? = null
        private var carrier: Carrier? = null
        private var expMonth: String? = null
        private var expYear: String? = null
        private var productId: String? = null
        private var shippingMethod: ShippingMethod? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardRenewParams: CardRenewParams) = apply {
            this.cardToken = cardRenewParams.cardToken
            this.shippingAddress = cardRenewParams.shippingAddress
            this.carrier = cardRenewParams.carrier
            this.expMonth = cardRenewParams.expMonth
            this.expYear = cardRenewParams.expYear
            this.productId = cardRenewParams.productId
            this.shippingMethod = cardRenewParams.shippingMethod
            additionalQueryParams(cardRenewParams.additionalQueryParams)
            additionalHeaders(cardRenewParams.additionalHeaders)
            additionalBodyProperties(cardRenewParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** The shipping address this card will be sent to. */
        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            this.shippingAddress = shippingAddress
        }

        /** If omitted, the previous carrier will be used. */
        fun carrier(carrier: Carrier) = apply { this.carrier = carrier }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expMonth(expMonth: String) = apply { this.expMonth = expMonth }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expYear(expYear: String) = apply { this.expYear = expYear }

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        fun productId(productId: String) = apply { this.productId = productId }

        /**
         * Shipping method for the card. Use of options besides `STANDARD` require additional
         * permissions.
         *
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         * tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            this.shippingMethod = shippingMethod
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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CardRenewParams =
            CardRenewParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                checkNotNull(shippingAddress) { "`shippingAddress` is required but was not set" },
                carrier,
                expMonth,
                expYear,
                productId,
                shippingMethod,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ShippingMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ShippingMethod && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val _2_DAY = ShippingMethod(JsonField.of("2-DAY"))

            @JvmField val EXPEDITED = ShippingMethod(JsonField.of("EXPEDITED"))

            @JvmField val EXPRESS = ShippingMethod(JsonField.of("EXPRESS"))

            @JvmField val PRIORITY = ShippingMethod(JsonField.of("PRIORITY"))

            @JvmField val STANDARD = ShippingMethod(JsonField.of("STANDARD"))

            @JvmField
            val STANDARD_WITH_TRACKING = ShippingMethod(JsonField.of("STANDARD_WITH_TRACKING"))

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        enum class Known {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
        }

        enum class Value {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                _2_DAY -> Value._2_DAY
                EXPEDITED -> Value.EXPEDITED
                EXPRESS -> Value.EXPRESS
                PRIORITY -> Value.PRIORITY
                STANDARD -> Value.STANDARD
                STANDARD_WITH_TRACKING -> Value.STANDARD_WITH_TRACKING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                _2_DAY -> Known._2_DAY
                EXPEDITED -> Known.EXPEDITED
                EXPRESS -> Known.EXPRESS
                PRIORITY -> Known.PRIORITY
                STANDARD -> Known.STANDARD
                STANDARD_WITH_TRACKING -> Known.STANDARD_WITH_TRACKING
                else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
