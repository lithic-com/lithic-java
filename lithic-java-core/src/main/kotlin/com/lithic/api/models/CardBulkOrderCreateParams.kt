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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new bulk order for physical card shipments **[BETA]**. Cards can be added to the order
 * via the POST /v1/cards endpoint by specifying the bulk_order_token. Lock the order via PATCH
 * /v1/card_bulk_orders/{bulk_order_token} to prepare for shipment. Please work with your Customer
 * Success Manager and card personalization bureau to ensure bulk shipping is supported for your
 * program.
 */
class CardBulkOrderCreateParams
private constructor(
    private val body: CreateBulkOrderRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Customer-specified product configuration for physical card manufacturing. This must be
     * configured with Lithic before use
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerProductId(): String = body.customerProductId()

    /**
     * Shipping address for all cards in this bulk order
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = cardBulkOrderCreateParams.shippingAddress().convert(MyClass.class);
     * ```
     */
    fun _shippingAddress(): JsonValue = body._shippingAddress()

    /**
     * Shipping method for all cards in this bulk order
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shippingMethod(): ShippingMethod = body.shippingMethod()

    /**
     * Returns the raw JSON value of [customerProductId].
     *
     * Unlike [customerProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerProductId(): JsonField<String> = body._customerProductId()

    /**
     * Returns the raw JSON value of [shippingMethod].
     *
     * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shippingMethod(): JsonField<ShippingMethod> = body._shippingMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBulkOrderCreateParams].
         *
         * The following fields are required:
         * ```java
         * .customerProductId()
         * .shippingAddress()
         * .shippingMethod()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardBulkOrderCreateParams]. */
    class Builder internal constructor() {

        private var body: CreateBulkOrderRequest.Builder = CreateBulkOrderRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardBulkOrderCreateParams: CardBulkOrderCreateParams) = apply {
            body = cardBulkOrderCreateParams.body.toBuilder()
            additionalHeaders = cardBulkOrderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardBulkOrderCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerProductId]
         * - [shippingAddress]
         * - [shippingMethod]
         */
        fun body(body: CreateBulkOrderRequest) = apply { this.body = body.toBuilder() }

        /**
         * Customer-specified product configuration for physical card manufacturing. This must be
         * configured with Lithic before use
         */
        fun customerProductId(customerProductId: String) = apply {
            body.customerProductId(customerProductId)
        }

        /**
         * Sets [Builder.customerProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerProductId(customerProductId: JsonField<String>) = apply {
            body.customerProductId(customerProductId)
        }

        /** Shipping address for all cards in this bulk order */
        fun shippingAddress(shippingAddress: JsonValue) = apply {
            body.shippingAddress(shippingAddress)
        }

        /** Shipping method for all cards in this bulk order */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            body.shippingMethod(shippingMethod)
        }

        /**
         * Sets [Builder.shippingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [CardBulkOrderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerProductId()
         * .shippingAddress()
         * .shippingMethod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardBulkOrderCreateParams =
            CardBulkOrderCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateBulkOrderRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request to create a new bulk order for physical card shipments. Please work with your
     * Customer Success Manager and card personalization bureau to ensure bulk shipping is supported
     * for your program.
     */
    class CreateBulkOrderRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerProductId: JsonField<String>,
        private val shippingAddress: JsonValue,
        private val shippingMethod: JsonField<ShippingMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_product_id")
            @ExcludeMissing
            customerProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipping_address")
            @ExcludeMissing
            shippingAddress: JsonValue = JsonMissing.of(),
            @JsonProperty("shipping_method")
            @ExcludeMissing
            shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        ) : this(customerProductId, shippingAddress, shippingMethod, mutableMapOf())

        /**
         * Customer-specified product configuration for physical card manufacturing. This must be
         * configured with Lithic before use
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerProductId(): String = customerProductId.getRequired("customer_product_id")

        /**
         * Shipping address for all cards in this bulk order
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = createBulkOrderRequest.shippingAddress().convert(MyClass.class);
         * ```
         */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonValue = shippingAddress

        /**
         * Shipping method for all cards in this bulk order
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shippingMethod(): ShippingMethod = shippingMethod.getRequired("shipping_method")

        /**
         * Returns the raw JSON value of [customerProductId].
         *
         * Unlike [customerProductId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_product_id")
        @ExcludeMissing
        fun _customerProductId(): JsonField<String> = customerProductId

        /**
         * Returns the raw JSON value of [shippingMethod].
         *
         * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

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
             * Returns a mutable builder for constructing an instance of [CreateBulkOrderRequest].
             *
             * The following fields are required:
             * ```java
             * .customerProductId()
             * .shippingAddress()
             * .shippingMethod()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateBulkOrderRequest]. */
        class Builder internal constructor() {

            private var customerProductId: JsonField<String>? = null
            private var shippingAddress: JsonValue? = null
            private var shippingMethod: JsonField<ShippingMethod>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createBulkOrderRequest: CreateBulkOrderRequest) = apply {
                customerProductId = createBulkOrderRequest.customerProductId
                shippingAddress = createBulkOrderRequest.shippingAddress
                shippingMethod = createBulkOrderRequest.shippingMethod
                additionalProperties = createBulkOrderRequest.additionalProperties.toMutableMap()
            }

            /**
             * Customer-specified product configuration for physical card manufacturing. This must
             * be configured with Lithic before use
             */
            fun customerProductId(customerProductId: String) =
                customerProductId(JsonField.of(customerProductId))

            /**
             * Sets [Builder.customerProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerProductId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerProductId(customerProductId: JsonField<String>) = apply {
                this.customerProductId = customerProductId
            }

            /** Shipping address for all cards in this bulk order */
            fun shippingAddress(shippingAddress: JsonValue) = apply {
                this.shippingAddress = shippingAddress
            }

            /** Shipping method for all cards in this bulk order */
            fun shippingMethod(shippingMethod: ShippingMethod) =
                shippingMethod(JsonField.of(shippingMethod))

            /**
             * Sets [Builder.shippingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Returns an immutable instance of [CreateBulkOrderRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerProductId()
             * .shippingAddress()
             * .shippingMethod()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateBulkOrderRequest =
                CreateBulkOrderRequest(
                    checkRequired("customerProductId", customerProductId),
                    checkRequired("shippingAddress", shippingAddress),
                    checkRequired("shippingMethod", shippingMethod),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreateBulkOrderRequest = apply {
            if (validated) {
                return@apply
            }

            customerProductId()
            shippingMethod().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (customerProductId.asKnown().isPresent) 1 else 0) +
                (shippingMethod.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateBulkOrderRequest &&
                customerProductId == other.customerProductId &&
                shippingAddress == other.shippingAddress &&
                shippingMethod == other.shippingMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerProductId, shippingAddress, shippingMethod, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateBulkOrderRequest{customerProductId=$customerProductId, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"
    }

    /** Shipping method for all cards in this bulk order */
    class ShippingMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BULK_EXPEDITED = of("BULK_EXPEDITED")

            @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        /** An enum containing [ShippingMethod]'s known values. */
        enum class Known {
            BULK_EXPEDITED
        }

        /**
         * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BULK_EXPEDITED,
            /**
             * An enum member indicating that [ShippingMethod] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BULK_EXPEDITED -> Value.BULK_EXPEDITED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BULK_EXPEDITED -> Known.BULK_EXPEDITED
                else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ShippingMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ShippingMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardBulkOrderCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardBulkOrderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
