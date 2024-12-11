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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardToken(): String = cardToken

    fun shippingAddress(): ShippingAddress = shippingAddress

    fun carrier(): Optional<Carrier> = Optional.ofNullable(carrier)

    fun expMonth(): Optional<String> = Optional.ofNullable(expMonth)

    fun expYear(): Optional<String> = Optional.ofNullable(expYear)

    fun productId(): Optional<String> = Optional.ofNullable(productId)

    fun shippingMethod(): Optional<ShippingMethod> = Optional.ofNullable(shippingMethod)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
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
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             *   tracking
             * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
             * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
             * - `2_DAY` - FedEx 2-day shipping, with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             *   tracking
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardRenewBody && shippingAddress == other.shippingAddress && carrier == other.carrier && expMonth == other.expMonth && expYear == other.expYear && productId == other.productId && shippingMethod == other.shippingMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(shippingAddress, carrier, expMonth, expYear, productId, shippingMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardRenewBody{shippingAddress=$shippingAddress, carrier=$carrier, expMonth=$expMonth, expYear=$expYear, productId=$productId, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardRenewParams: CardRenewParams) = apply {
            cardToken = cardRenewParams.cardToken
            shippingAddress = cardRenewParams.shippingAddress
            carrier = cardRenewParams.carrier
            expMonth = cardRenewParams.expMonth
            expYear = cardRenewParams.expYear
            productId = cardRenewParams.productId
            shippingMethod = cardRenewParams.shippingMethod
            additionalHeaders = cardRenewParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardRenewParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = cardRenewParams.additionalBodyProperties.toMutableMap()
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
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            this.shippingMethod = shippingMethod
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ShippingMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val _2_DAY = of("2-DAY")

            @JvmField val EXPEDITED = of("EXPEDITED")

            @JvmField val EXPRESS = of("EXPRESS")

            @JvmField val PRIORITY = of("PRIORITY")

            @JvmField val STANDARD = of("STANDARD")

            @JvmField val STANDARD_WITH_TRACKING = of("STANDARD_WITH_TRACKING")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardRenewParams && cardToken == other.cardToken && shippingAddress == other.shippingAddress && carrier == other.carrier && expMonth == other.expMonth && expYear == other.expYear && productId == other.productId && shippingMethod == other.shippingMethod && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, shippingAddress, carrier, expMonth, expYear, productId, shippingMethod, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardRenewParams{cardToken=$cardToken, shippingAddress=$shippingAddress, carrier=$carrier, expMonth=$expMonth, expYear=$expYear, productId=$productId, shippingMethod=$shippingMethod, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
