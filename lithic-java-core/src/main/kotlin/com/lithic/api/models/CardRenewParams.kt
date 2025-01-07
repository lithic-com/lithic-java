// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Creates a new card with the same card token and PAN, but updated expiry and CVC2 code. The
 * original card will keep working for card-present transactions until the new card is activated.
 * For card-not-present transactions, the original card details (expiry, CVC2) will also keep
 * working until the new card is activated. Applies to card types `PHYSICAL` and `VIRTUAL`. A card
 * can be replaced or renewed a total of 8 times.
 */
class CardRenewParams
constructor(
    private val cardToken: String,
    private val body: CardRenewBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun cardToken(): String = cardToken

    /** The shipping address this card will be sent to. */
    fun shippingAddress(): ShippingAddress = body.shippingAddress()

    /** If omitted, the previous carrier will be used. */
    fun carrier(): Optional<Carrier> = body.carrier()

    /**
     * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an expiration
     * date six years in the future will be generated.
     */
    fun expMonth(): Optional<String> = body.expMonth()

    /**
     * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
     * expiration date six years in the future will be generated.
     */
    fun expYear(): Optional<String> = body.expYear()

    /**
     * Specifies the configuration (e.g. physical card art) that the card should be manufactured
     * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
     * before use.
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * Shipping method for the card. Use of options besides `STANDARD` require additional
     * permissions.
     * - `STANDARD` - USPS regular mail or similar international option, with no tracking
     * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with tracking
     * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
     * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
     * - `2_DAY` - FedEx 2-day shipping, with tracking
     * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
     */
    fun shippingMethod(): Optional<ShippingMethod> = body.shippingMethod()

    /** The shipping address this card will be sent to. */
    fun _shippingAddress(): JsonField<ShippingAddress> = body._shippingAddress()

    /** If omitted, the previous carrier will be used. */
    fun _carrier(): JsonField<Carrier> = body._carrier()

    /**
     * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an expiration
     * date six years in the future will be generated.
     */
    fun _expMonth(): JsonField<String> = body._expMonth()

    /**
     * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
     * expiration date six years in the future will be generated.
     */
    fun _expYear(): JsonField<String> = body._expYear()

    /**
     * Specifies the configuration (e.g. physical card art) that the card should be manufactured
     * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
     * before use.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Shipping method for the card. Use of options besides `STANDARD` require additional
     * permissions.
     * - `STANDARD` - USPS regular mail or similar international option, with no tracking
     * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with tracking
     * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
     * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
     * - `2_DAY` - FedEx 2-day shipping, with tracking
     * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
     */
    fun _shippingMethod(): JsonField<ShippingMethod> = body._shippingMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CardRenewBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @NoAutoDetect
    class CardRenewBody
    @JsonCreator
    internal constructor(
        @JsonProperty("shipping_address")
        @ExcludeMissing
        private val shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
        @JsonProperty("carrier")
        @ExcludeMissing
        private val carrier: JsonField<Carrier> = JsonMissing.of(),
        @JsonProperty("exp_month")
        @ExcludeMissing
        private val expMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_year")
        @ExcludeMissing
        private val expYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_method")
        @ExcludeMissing
        private val shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The shipping address this card will be sent to. */
        fun shippingAddress(): ShippingAddress = shippingAddress.getRequired("shipping_address")

        /** If omitted, the previous carrier will be used. */
        fun carrier(): Optional<Carrier> = Optional.ofNullable(carrier.getNullable("carrier"))

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expMonth(): Optional<String> = Optional.ofNullable(expMonth.getNullable("exp_month"))

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expYear(): Optional<String> = Optional.ofNullable(expYear.getNullable("exp_year"))

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

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
        fun shippingMethod(): Optional<ShippingMethod> =
            Optional.ofNullable(shippingMethod.getNullable("shipping_method"))

        /** The shipping address this card will be sent to. */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

        /** If omitted, the previous carrier will be used. */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<Carrier> = carrier

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        @JsonProperty("exp_month") @ExcludeMissing fun _expMonth(): JsonField<String> = expMonth

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        @JsonProperty("exp_year") @ExcludeMissing fun _expYear(): JsonField<String> = expYear

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardRenewBody = apply {
            if (!validated) {
                shippingAddress().validate()
                carrier().map { it.validate() }
                expMonth()
                expYear()
                productId()
                shippingMethod()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var shippingAddress: JsonField<ShippingAddress>? = null
            private var carrier: JsonField<Carrier> = JsonMissing.of()
            private var expMonth: JsonField<String> = JsonMissing.of()
            private var expYear: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var shippingMethod: JsonField<ShippingMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardRenewBody: CardRenewBody) = apply {
                shippingAddress = cardRenewBody.shippingAddress
                carrier = cardRenewBody.carrier
                expMonth = cardRenewBody.expMonth
                expYear = cardRenewBody.expYear
                productId = cardRenewBody.productId
                shippingMethod = cardRenewBody.shippingMethod
                additionalProperties = cardRenewBody.additionalProperties.toMutableMap()
            }

            /** The shipping address this card will be sent to. */
            fun shippingAddress(shippingAddress: ShippingAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            /** The shipping address this card will be sent to. */
            fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
                this.shippingAddress = shippingAddress
            }

            /** If omitted, the previous carrier will be used. */
            fun carrier(carrier: Carrier) = carrier(JsonField.of(carrier))

            /** If omitted, the previous carrier will be used. */
            fun carrier(carrier: JsonField<Carrier>) = apply { this.carrier = carrier }

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            fun expMonth(expMonth: String) = expMonth(JsonField.of(expMonth))

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            fun expMonth(expMonth: JsonField<String>) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            fun expYear(expYear: String) = expYear(JsonField.of(expYear))

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date six years in the future will be generated.
             */
            fun expYear(expYear: JsonField<String>) = apply { this.expYear = expYear }

            /**
             * Specifies the configuration (e.g. physical card art) that the card should be
             * manufactured with, and only applies to cards of type `PHYSICAL`. This must be
             * configured with Lithic before use.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Specifies the configuration (e.g. physical card art) that the card should be
             * manufactured with, and only applies to cards of type `PHYSICAL`. This must be
             * configured with Lithic before use.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
            fun shippingMethod(shippingMethod: ShippingMethod) =
                shippingMethod(JsonField.of(shippingMethod))

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
            fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                this.shippingMethod = shippingMethod
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
        private var body: CardRenewBody.Builder = CardRenewBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardRenewParams: CardRenewParams) = apply {
            cardToken = cardRenewParams.cardToken
            body = cardRenewParams.body.toBuilder()
            additionalHeaders = cardRenewParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardRenewParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** The shipping address this card will be sent to. */
        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            body.shippingAddress(shippingAddress)
        }

        /** The shipping address this card will be sent to. */
        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            body.shippingAddress(shippingAddress)
        }

        /** If omitted, the previous carrier will be used. */
        fun carrier(carrier: Carrier) = apply { body.carrier(carrier) }

        /** If omitted, the previous carrier will be used. */
        fun carrier(carrier: JsonField<Carrier>) = apply { body.carrier(carrier) }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expMonth(expMonth: String) = apply { body.expMonth(expMonth) }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expMonth(expMonth: JsonField<String>) = apply { body.expMonth(expMonth) }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expYear(expYear: String) = apply { body.expYear(expYear) }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date six years in the future will be generated.
         */
        fun expYear(expYear: JsonField<String>) = apply { body.expYear(expYear) }

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Specifies the configuration (e.g. physical card art) that the card should be manufactured
         * with, and only applies to cards of type `PHYSICAL`. This must be configured with Lithic
         * before use.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

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
            body.shippingMethod(shippingMethod)
        }

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
        fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
            body.shippingMethod(shippingMethod)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): CardRenewParams =
            CardRenewParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is CardRenewParams && cardToken == other.cardToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardRenewParams{cardToken=$cardToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
