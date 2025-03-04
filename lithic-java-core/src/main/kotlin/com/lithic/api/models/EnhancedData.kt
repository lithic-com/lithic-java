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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class EnhancedData
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("common")
    @ExcludeMissing
    private val common: JsonField<CommonData> = JsonMissing.of(),
    @JsonProperty("event_token")
    @ExcludeMissing
    private val eventToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fleet")
    @ExcludeMissing
    private val fleet: JsonField<List<Fleet>> = JsonMissing.of(),
    @JsonProperty("transaction_token")
    @ExcludeMissing
    private val transactionToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A unique identifier for the enhanced commercial data. */
    fun token(): String = token.getRequired("token")

    fun common(): CommonData = common.getRequired("common")

    /** The token of the event that the enhanced data is associated with. */
    fun eventToken(): String = eventToken.getRequired("event_token")

    fun fleet(): List<Fleet> = fleet.getRequired("fleet")

    /** The token of the transaction that the enhanced data is associated with. */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /** A unique identifier for the enhanced commercial data. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("common") @ExcludeMissing fun _common(): JsonField<CommonData> = common

    /** The token of the event that the enhanced data is associated with. */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    @JsonProperty("fleet") @ExcludeMissing fun _fleet(): JsonField<List<Fleet>> = fleet

    /** The token of the transaction that the enhanced data is associated with. */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EnhancedData = apply {
        if (validated) {
            return@apply
        }

        token()
        common().validate()
        eventToken()
        fleet().forEach { it.validate() }
        transactionToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EnhancedData].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .common()
         * .eventToken()
         * .fleet()
         * .transactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnhancedData]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var common: JsonField<CommonData>? = null
        private var eventToken: JsonField<String>? = null
        private var fleet: JsonField<MutableList<Fleet>>? = null
        private var transactionToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enhancedData: EnhancedData) = apply {
            token = enhancedData.token
            common = enhancedData.common
            eventToken = enhancedData.eventToken
            fleet = enhancedData.fleet.map { it.toMutableList() }
            transactionToken = enhancedData.transactionToken
            additionalProperties = enhancedData.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the enhanced commercial data. */
        fun token(token: String) = token(JsonField.of(token))

        /** A unique identifier for the enhanced commercial data. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun common(common: CommonData) = common(JsonField.of(common))

        fun common(common: JsonField<CommonData>) = apply { this.common = common }

        /** The token of the event that the enhanced data is associated with. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /** The token of the event that the enhanced data is associated with. */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        fun fleet(fleet: List<Fleet>) = fleet(JsonField.of(fleet))

        fun fleet(fleet: JsonField<List<Fleet>>) = apply {
            this.fleet = fleet.map { it.toMutableList() }
        }

        fun addFleet(fleet: Fleet) = apply {
            this.fleet =
                (this.fleet ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fleet", it).add(fleet)
                }
        }

        /** The token of the transaction that the enhanced data is associated with. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /** The token of the transaction that the enhanced data is associated with. */
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
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

        fun build(): EnhancedData =
            EnhancedData(
                checkRequired("token", token),
                checkRequired("common", common),
                checkRequired("eventToken", eventToken),
                checkRequired("fleet", fleet).map { it.toImmutable() },
                checkRequired("transactionToken", transactionToken),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CommonData
    @JsonCreator
    private constructor(
        @JsonProperty("line_items")
        @ExcludeMissing
        private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing private val tax: JsonField<TaxData> = JsonMissing.of(),
        @JsonProperty("customer_reference_number")
        @ExcludeMissing
        private val customerReferenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_reference_number")
        @ExcludeMissing
        private val merchantReferenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_date")
        @ExcludeMissing
        private val orderDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        fun tax(): TaxData = tax.getRequired("tax")

        /** A customer identifier. */
        fun customerReferenceNumber(): Optional<String> =
            Optional.ofNullable(customerReferenceNumber.getNullable("customer_reference_number"))

        /** A merchant identifier. */
        fun merchantReferenceNumber(): Optional<String> =
            Optional.ofNullable(merchantReferenceNumber.getNullable("merchant_reference_number"))

        /** The date of the order. */
        fun orderDate(): Optional<LocalDate> =
            Optional.ofNullable(orderDate.getNullable("order_date"))

        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<TaxData> = tax

        /** A customer identifier. */
        @JsonProperty("customer_reference_number")
        @ExcludeMissing
        fun _customerReferenceNumber(): JsonField<String> = customerReferenceNumber

        /** A merchant identifier. */
        @JsonProperty("merchant_reference_number")
        @ExcludeMissing
        fun _merchantReferenceNumber(): JsonField<String> = merchantReferenceNumber

        /** The date of the order. */
        @JsonProperty("order_date")
        @ExcludeMissing
        fun _orderDate(): JsonField<LocalDate> = orderDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CommonData = apply {
            if (validated) {
                return@apply
            }

            lineItems().forEach { it.validate() }
            tax().validate()
            customerReferenceNumber()
            merchantReferenceNumber()
            orderDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CommonData].
             *
             * The following fields are required:
             * ```java
             * .lineItems()
             * .tax()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CommonData]. */
        class Builder internal constructor() {

            private var lineItems: JsonField<MutableList<LineItem>>? = null
            private var tax: JsonField<TaxData>? = null
            private var customerReferenceNumber: JsonField<String> = JsonMissing.of()
            private var merchantReferenceNumber: JsonField<String> = JsonMissing.of()
            private var orderDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commonData: CommonData) = apply {
                lineItems = commonData.lineItems.map { it.toMutableList() }
                tax = commonData.tax
                customerReferenceNumber = commonData.customerReferenceNumber
                merchantReferenceNumber = commonData.merchantReferenceNumber
                orderDate = commonData.orderDate
                additionalProperties = commonData.additionalProperties.toMutableMap()
            }

            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            fun tax(tax: TaxData) = tax(JsonField.of(tax))

            fun tax(tax: JsonField<TaxData>) = apply { this.tax = tax }

            /** A customer identifier. */
            fun customerReferenceNumber(customerReferenceNumber: String) =
                customerReferenceNumber(JsonField.of(customerReferenceNumber))

            /** A customer identifier. */
            fun customerReferenceNumber(customerReferenceNumber: JsonField<String>) = apply {
                this.customerReferenceNumber = customerReferenceNumber
            }

            /** A merchant identifier. */
            fun merchantReferenceNumber(merchantReferenceNumber: String) =
                merchantReferenceNumber(JsonField.of(merchantReferenceNumber))

            /** A merchant identifier. */
            fun merchantReferenceNumber(merchantReferenceNumber: JsonField<String>) = apply {
                this.merchantReferenceNumber = merchantReferenceNumber
            }

            /** The date of the order. */
            fun orderDate(orderDate: LocalDate) = orderDate(JsonField.of(orderDate))

            /** The date of the order. */
            fun orderDate(orderDate: JsonField<LocalDate>) = apply { this.orderDate = orderDate }

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

            fun build(): CommonData =
                CommonData(
                    checkRequired("lineItems", lineItems).map { it.toImmutable() },
                    checkRequired("tax", tax),
                    customerReferenceNumber,
                    merchantReferenceNumber,
                    orderDate,
                    additionalProperties.toImmutable(),
                )
        }

        /** An L2/L3 enhanced commercial data line item. */
        @NoAutoDetect
        class LineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_code")
            @ExcludeMissing
            private val productCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price of the item purchased in merchant currency. */
            fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

            /** A human-readable description of the item. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** An identifier for the item purchased. */
            fun productCode(): Optional<String> =
                Optional.ofNullable(productCode.getNullable("product_code"))

            /** The quantity of the item purchased. */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** The price of the item purchased in merchant currency. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /** A human-readable description of the item. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** An identifier for the item purchased. */
            @JsonProperty("product_code")
            @ExcludeMissing
            fun _productCode(): JsonField<String> = productCode

            /** The quantity of the item purchased. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                description()
                productCode()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [LineItem]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LineItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var productCode: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(lineItem: LineItem) = apply {
                    amount = lineItem.amount
                    description = lineItem.description
                    productCode = lineItem.productCode
                    quantity = lineItem.quantity
                    additionalProperties = lineItem.additionalProperties.toMutableMap()
                }

                /** The price of the item purchased in merchant currency. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /** The price of the item purchased in merchant currency. */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** A human-readable description of the item. */
                fun description(description: String) = description(JsonField.of(description))

                /** A human-readable description of the item. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** An identifier for the item purchased. */
                fun productCode(productCode: String) = productCode(JsonField.of(productCode))

                /** An identifier for the item purchased. */
                fun productCode(productCode: JsonField<String>) = apply {
                    this.productCode = productCode
                }

                /** The quantity of the item purchased. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** The quantity of the item purchased. */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LineItem =
                    LineItem(
                        amount,
                        description,
                        productCode,
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LineItem && amount == other.amount && description == other.description && productCode == other.productCode && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, description, productCode, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LineItem{amount=$amount, description=$description, productCode=$productCode, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TaxData
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("exempt")
            @ExcludeMissing
            private val exempt: JsonField<TaxExemptIndicator> = JsonMissing.of(),
            @JsonProperty("merchant_tax_id")
            @ExcludeMissing
            private val merchantTaxId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The amount of tax collected. */
            fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

            /** A flag indicating whether the transaction is tax exempt or not. */
            fun exempt(): Optional<TaxExemptIndicator> =
                Optional.ofNullable(exempt.getNullable("exempt"))

            /** The tax ID of the merchant. */
            fun merchantTaxId(): Optional<String> =
                Optional.ofNullable(merchantTaxId.getNullable("merchant_tax_id"))

            /** The amount of tax collected. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** A flag indicating whether the transaction is tax exempt or not. */
            @JsonProperty("exempt")
            @ExcludeMissing
            fun _exempt(): JsonField<TaxExemptIndicator> = exempt

            /** The tax ID of the merchant. */
            @JsonProperty("merchant_tax_id")
            @ExcludeMissing
            fun _merchantTaxId(): JsonField<String> = merchantTaxId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TaxData = apply {
                if (validated) {
                    return@apply
                }

                amount()
                exempt()
                merchantTaxId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [TaxData]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TaxData]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var exempt: JsonField<TaxExemptIndicator> = JsonMissing.of()
                private var merchantTaxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(taxData: TaxData) = apply {
                    amount = taxData.amount
                    exempt = taxData.exempt
                    merchantTaxId = taxData.merchantTaxId
                    additionalProperties = taxData.additionalProperties.toMutableMap()
                }

                /** The amount of tax collected. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount of tax collected. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** A flag indicating whether the transaction is tax exempt or not. */
                fun exempt(exempt: TaxExemptIndicator) = exempt(JsonField.of(exempt))

                /** A flag indicating whether the transaction is tax exempt or not. */
                fun exempt(exempt: JsonField<TaxExemptIndicator>) = apply { this.exempt = exempt }

                /** The tax ID of the merchant. */
                fun merchantTaxId(merchantTaxId: String) =
                    merchantTaxId(JsonField.of(merchantTaxId))

                /** The tax ID of the merchant. */
                fun merchantTaxId(merchantTaxId: JsonField<String>) = apply {
                    this.merchantTaxId = merchantTaxId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TaxData =
                    TaxData(amount, exempt, merchantTaxId, additionalProperties.toImmutable())
            }

            /** A flag indicating whether the transaction is tax exempt or not. */
            class TaxExemptIndicator
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TAX_INCLUDED = of("TAX_INCLUDED")

                    @JvmField val TAX_NOT_INCLUDED = of("TAX_NOT_INCLUDED")

                    @JvmField val NOT_SUPPORTED = of("NOT_SUPPORTED")

                    @JvmStatic fun of(value: String) = TaxExemptIndicator(JsonField.of(value))
                }

                /** An enum containing [TaxExemptIndicator]'s known values. */
                enum class Known {
                    TAX_INCLUDED,
                    TAX_NOT_INCLUDED,
                    NOT_SUPPORTED,
                }

                /**
                 * An enum containing [TaxExemptIndicator]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TaxExemptIndicator] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TAX_INCLUDED,
                    TAX_NOT_INCLUDED,
                    NOT_SUPPORTED,
                    /**
                     * An enum member indicating that [TaxExemptIndicator] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TAX_INCLUDED -> Value.TAX_INCLUDED
                        TAX_NOT_INCLUDED -> Value.TAX_NOT_INCLUDED
                        NOT_SUPPORTED -> Value.NOT_SUPPORTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TAX_INCLUDED -> Known.TAX_INCLUDED
                        TAX_NOT_INCLUDED -> Known.TAX_NOT_INCLUDED
                        NOT_SUPPORTED -> Known.NOT_SUPPORTED
                        else ->
                            throw LithicInvalidDataException("Unknown TaxExemptIndicator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TaxExemptIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxData && amount == other.amount && exempt == other.exempt && merchantTaxId == other.merchantTaxId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, exempt, merchantTaxId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxData{amount=$amount, exempt=$exempt, merchantTaxId=$merchantTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CommonData && lineItems == other.lineItems && tax == other.tax && customerReferenceNumber == other.customerReferenceNumber && merchantReferenceNumber == other.merchantReferenceNumber && orderDate == other.orderDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lineItems, tax, customerReferenceNumber, merchantReferenceNumber, orderDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CommonData{lineItems=$lineItems, tax=$tax, customerReferenceNumber=$customerReferenceNumber, merchantReferenceNumber=$merchantReferenceNumber, orderDate=$orderDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Fleet
    @JsonCreator
    private constructor(
        @JsonProperty("amount_totals")
        @ExcludeMissing
        private val amountTotals: JsonField<AmountTotals> = JsonMissing.of(),
        @JsonProperty("fuel")
        @ExcludeMissing
        private val fuel: JsonField<FuelData> = JsonMissing.of(),
        @JsonProperty("driver_number")
        @ExcludeMissing
        private val driverNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("odometer")
        @ExcludeMissing
        private val odometer: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("service_type")
        @ExcludeMissing
        private val serviceType: JsonField<ServiceType> = JsonMissing.of(),
        @JsonProperty("vehicle_number")
        @ExcludeMissing
        private val vehicleNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amountTotals(): AmountTotals = amountTotals.getRequired("amount_totals")

        fun fuel(): FuelData = fuel.getRequired("fuel")

        /**
         * The driver number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        fun driverNumber(): Optional<String> =
            Optional.ofNullable(driverNumber.getNullable("driver_number"))

        /** The odometer reading entered into the terminal at the time of sale. */
        fun odometer(): Optional<Long> = Optional.ofNullable(odometer.getNullable("odometer"))

        /** The type of fuel service. */
        fun serviceType(): Optional<ServiceType> =
            Optional.ofNullable(serviceType.getNullable("service_type"))

        /**
         * The vehicle number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        fun vehicleNumber(): Optional<String> =
            Optional.ofNullable(vehicleNumber.getNullable("vehicle_number"))

        @JsonProperty("amount_totals")
        @ExcludeMissing
        fun _amountTotals(): JsonField<AmountTotals> = amountTotals

        @JsonProperty("fuel") @ExcludeMissing fun _fuel(): JsonField<FuelData> = fuel

        /**
         * The driver number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        @JsonProperty("driver_number")
        @ExcludeMissing
        fun _driverNumber(): JsonField<String> = driverNumber

        /** The odometer reading entered into the terminal at the time of sale. */
        @JsonProperty("odometer") @ExcludeMissing fun _odometer(): JsonField<Long> = odometer

        /** The type of fuel service. */
        @JsonProperty("service_type")
        @ExcludeMissing
        fun _serviceType(): JsonField<ServiceType> = serviceType

        /**
         * The vehicle number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        @JsonProperty("vehicle_number")
        @ExcludeMissing
        fun _vehicleNumber(): JsonField<String> = vehicleNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Fleet = apply {
            if (validated) {
                return@apply
            }

            amountTotals().validate()
            fuel().validate()
            driverNumber()
            odometer()
            serviceType()
            vehicleNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Fleet].
             *
             * The following fields are required:
             * ```java
             * .amountTotals()
             * .fuel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Fleet]. */
        class Builder internal constructor() {

            private var amountTotals: JsonField<AmountTotals>? = null
            private var fuel: JsonField<FuelData>? = null
            private var driverNumber: JsonField<String> = JsonMissing.of()
            private var odometer: JsonField<Long> = JsonMissing.of()
            private var serviceType: JsonField<ServiceType> = JsonMissing.of()
            private var vehicleNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fleet: Fleet) = apply {
                amountTotals = fleet.amountTotals
                fuel = fleet.fuel
                driverNumber = fleet.driverNumber
                odometer = fleet.odometer
                serviceType = fleet.serviceType
                vehicleNumber = fleet.vehicleNumber
                additionalProperties = fleet.additionalProperties.toMutableMap()
            }

            fun amountTotals(amountTotals: AmountTotals) = amountTotals(JsonField.of(amountTotals))

            fun amountTotals(amountTotals: JsonField<AmountTotals>) = apply {
                this.amountTotals = amountTotals
            }

            fun fuel(fuel: FuelData) = fuel(JsonField.of(fuel))

            fun fuel(fuel: JsonField<FuelData>) = apply { this.fuel = fuel }

            /**
             * The driver number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun driverNumber(driverNumber: String) = driverNumber(JsonField.of(driverNumber))

            /**
             * The driver number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun driverNumber(driverNumber: JsonField<String>) = apply {
                this.driverNumber = driverNumber
            }

            /** The odometer reading entered into the terminal at the time of sale. */
            fun odometer(odometer: Long) = odometer(JsonField.of(odometer))

            /** The odometer reading entered into the terminal at the time of sale. */
            fun odometer(odometer: JsonField<Long>) = apply { this.odometer = odometer }

            /** The type of fuel service. */
            fun serviceType(serviceType: ServiceType) = serviceType(JsonField.of(serviceType))

            /** The type of fuel service. */
            fun serviceType(serviceType: JsonField<ServiceType>) = apply {
                this.serviceType = serviceType
            }

            /**
             * The vehicle number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun vehicleNumber(vehicleNumber: String) = vehicleNumber(JsonField.of(vehicleNumber))

            /**
             * The vehicle number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun vehicleNumber(vehicleNumber: JsonField<String>) = apply {
                this.vehicleNumber = vehicleNumber
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

            fun build(): Fleet =
                Fleet(
                    checkRequired("amountTotals", amountTotals),
                    checkRequired("fuel", fuel),
                    driverNumber,
                    odometer,
                    serviceType,
                    vehicleNumber,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AmountTotals
        @JsonCreator
        private constructor(
            @JsonProperty("discount")
            @ExcludeMissing
            private val discount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("gross_sale")
            @ExcludeMissing
            private val grossSale: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("net_sale")
            @ExcludeMissing
            private val netSale: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The discount applied to the gross sale amount. */
            fun discount(): Optional<Long> = Optional.ofNullable(discount.getNullable("discount"))

            /** The gross sale amount. */
            fun grossSale(): Optional<Long> =
                Optional.ofNullable(grossSale.getNullable("gross_sale"))

            /** The amount after discount. */
            fun netSale(): Optional<Long> = Optional.ofNullable(netSale.getNullable("net_sale"))

            /** The discount applied to the gross sale amount. */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Long> = discount

            /** The gross sale amount. */
            @JsonProperty("gross_sale")
            @ExcludeMissing
            fun _grossSale(): JsonField<Long> = grossSale

            /** The amount after discount. */
            @JsonProperty("net_sale") @ExcludeMissing fun _netSale(): JsonField<Long> = netSale

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AmountTotals = apply {
                if (validated) {
                    return@apply
                }

                discount()
                grossSale()
                netSale()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AmountTotals]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AmountTotals]. */
            class Builder internal constructor() {

                private var discount: JsonField<Long> = JsonMissing.of()
                private var grossSale: JsonField<Long> = JsonMissing.of()
                private var netSale: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amountTotals: AmountTotals) = apply {
                    discount = amountTotals.discount
                    grossSale = amountTotals.grossSale
                    netSale = amountTotals.netSale
                    additionalProperties = amountTotals.additionalProperties.toMutableMap()
                }

                /** The discount applied to the gross sale amount. */
                fun discount(discount: Long) = discount(JsonField.of(discount))

                /** The discount applied to the gross sale amount. */
                fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

                /** The gross sale amount. */
                fun grossSale(grossSale: Long) = grossSale(JsonField.of(grossSale))

                /** The gross sale amount. */
                fun grossSale(grossSale: JsonField<Long>) = apply { this.grossSale = grossSale }

                /** The amount after discount. */
                fun netSale(netSale: Long) = netSale(JsonField.of(netSale))

                /** The amount after discount. */
                fun netSale(netSale: JsonField<Long>) = apply { this.netSale = netSale }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AmountTotals =
                    AmountTotals(discount, grossSale, netSale, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountTotals && discount == other.discount && grossSale == other.grossSale && netSale == other.netSale && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(discount, grossSale, netSale, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountTotals{discount=$discount, grossSale=$grossSale, netSale=$netSale, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class FuelData
        @JsonCreator
        private constructor(
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<FuelType> = JsonMissing.of(),
            @JsonProperty("unit_of_measure")
            @ExcludeMissing
            private val unitOfMeasure: JsonField<FuelUnitOfMeasure> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The quantity of fuel purchased. */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** The type of fuel purchased. */
            fun type(): Optional<FuelType> = Optional.ofNullable(type.getNullable("type"))

            /** Unit of measure for fuel disbursement. */
            fun unitOfMeasure(): Optional<FuelUnitOfMeasure> =
                Optional.ofNullable(unitOfMeasure.getNullable("unit_of_measure"))

            /** The price per unit of fuel. */
            fun unitPrice(): Optional<Long> =
                Optional.ofNullable(unitPrice.getNullable("unit_price"))

            /** The quantity of fuel purchased. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /** The type of fuel purchased. */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FuelType> = type

            /** Unit of measure for fuel disbursement. */
            @JsonProperty("unit_of_measure")
            @ExcludeMissing
            fun _unitOfMeasure(): JsonField<FuelUnitOfMeasure> = unitOfMeasure

            /** The price per unit of fuel. */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Long> = unitPrice

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FuelData = apply {
                if (validated) {
                    return@apply
                }

                quantity()
                type()
                unitOfMeasure()
                unitPrice()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [FuelData]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FuelData]. */
            class Builder internal constructor() {

                private var quantity: JsonField<Double> = JsonMissing.of()
                private var type: JsonField<FuelType> = JsonMissing.of()
                private var unitOfMeasure: JsonField<FuelUnitOfMeasure> = JsonMissing.of()
                private var unitPrice: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fuelData: FuelData) = apply {
                    quantity = fuelData.quantity
                    type = fuelData.type
                    unitOfMeasure = fuelData.unitOfMeasure
                    unitPrice = fuelData.unitPrice
                    additionalProperties = fuelData.additionalProperties.toMutableMap()
                }

                /** The quantity of fuel purchased. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** The quantity of fuel purchased. */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** The type of fuel purchased. */
                fun type(type: FuelType) = type(JsonField.of(type))

                /** The type of fuel purchased. */
                fun type(type: JsonField<FuelType>) = apply { this.type = type }

                /** Unit of measure for fuel disbursement. */
                fun unitOfMeasure(unitOfMeasure: FuelUnitOfMeasure) =
                    unitOfMeasure(JsonField.of(unitOfMeasure))

                /** Unit of measure for fuel disbursement. */
                fun unitOfMeasure(unitOfMeasure: JsonField<FuelUnitOfMeasure>) = apply {
                    this.unitOfMeasure = unitOfMeasure
                }

                /** The price per unit of fuel. */
                fun unitPrice(unitPrice: Long) = unitPrice(JsonField.of(unitPrice))

                /** The price per unit of fuel. */
                fun unitPrice(unitPrice: JsonField<Long>) = apply { this.unitPrice = unitPrice }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): FuelData =
                    FuelData(
                        quantity,
                        type,
                        unitOfMeasure,
                        unitPrice,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The type of fuel purchased. */
            class FuelType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmField val REGULAR = of("REGULAR")

                    @JvmField val MID_PLUS = of("MID_PLUS")

                    @JvmField val PREMIUM_SUPER = of("PREMIUM_SUPER")

                    @JvmField val MID_PLUS_2 = of("MID_PLUS_2")

                    @JvmField val PREMIUM_SUPER_2 = of("PREMIUM_SUPER_2")

                    @JvmField val ETHANOL_5_7_BLEND = of("ETHANOL_5_7_BLEND")

                    @JvmField
                    val MID_PLUS_ETHANOL_5_7_PERCENT_BLEND =
                        of("MID_PLUS_ETHANOL_5_7_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND =
                        of("PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND")

                    @JvmField val ETHANOL_7_7_PERCENT_BLEND = of("ETHANOL_7_7_PERCENT_BLEND")

                    @JvmField
                    val MID_PLUS_ETHANOL_7_7_PERCENT_BLEND =
                        of("MID_PLUS_ETHANOL_7_7_PERCENT_BLEND")

                    @JvmField val GREEN_GASOLINE_REGULAR = of("GREEN_GASOLINE_REGULAR")

                    @JvmField val GREEN_GASOLINE_MID_PLUS = of("GREEN_GASOLINE_MID_PLUS")

                    @JvmField val GREEN_GASOLINE_PREMIUM_SUPER = of("GREEN_GASOLINE_PREMIUM_SUPER")

                    @JvmField val REGULAR_DIESEL_2 = of("REGULAR_DIESEL_2")

                    @JvmField val PREMIUM_DIESEL_2 = of("PREMIUM_DIESEL_2")

                    @JvmField val REGULAR_DIESEL_1 = of("REGULAR_DIESEL_1")

                    @JvmField val COMPRESSED_NATURAL_GAS = of("COMPRESSED_NATURAL_GAS")

                    @JvmField val LIQUID_PROPANE_GAS = of("LIQUID_PROPANE_GAS")

                    @JvmField val LIQUID_NATURAL_GAS = of("LIQUID_NATURAL_GAS")

                    @JvmField val E_85 = of("E_85")

                    @JvmField val REFORMULATED_1 = of("REFORMULATED_1")

                    @JvmField val REFORMULATED_2 = of("REFORMULATED_2")

                    @JvmField val REFORMULATED_3 = of("REFORMULATED_3")

                    @JvmField val REFORMULATED_4 = of("REFORMULATED_4")

                    @JvmField val REFORMULATED_5 = of("REFORMULATED_5")

                    @JvmField
                    val DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE =
                        of("DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE")

                    @JvmField val DIESEL_OFF_ROAD_NON_TAXABLE = of("DIESEL_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE")

                    @JvmField val UNDEFINED_FUEL = of("UNDEFINED_FUEL")

                    @JvmField val RACING_FUEL = of("RACING_FUEL")

                    @JvmField val MID_PLUS_2_10_PERCENT_BLEND = of("MID_PLUS_2_10_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_2_10_PERCENT_BLEND = of("PREMIUM_SUPER_2_10_PERCENT_BLEND")

                    @JvmField
                    val MID_PLUS_ETHANOL_2_15_PERCENT_BLEND =
                        of("MID_PLUS_ETHANOL_2_15_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND =
                        of("PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND =
                        of("PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND")

                    @JvmField
                    val REGULAR_ETHANOL_10_PERCENT_BLEND = of("REGULAR_ETHANOL_10_PERCENT_BLEND")

                    @JvmField
                    val MID_PLUS_ETHANOL_10_PERCENT_BLEND = of("MID_PLUS_ETHANOL_10_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND =
                        of("PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND")

                    @JvmField
                    val B2_DIESEL_BLEND_2_PERCENT_BIODIESEL =
                        of("B2_DIESEL_BLEND_2_PERCENT_BIODIESEL")

                    @JvmField
                    val B5_DIESEL_BLEND_5_PERCENT_BIODIESEL =
                        of("B5_DIESEL_BLEND_5_PERCENT_BIODIESEL")

                    @JvmField
                    val B10_DIESEL_BLEND_10_PERCENT_BIODIESEL =
                        of("B10_DIESEL_BLEND_10_PERCENT_BIODIESEL")

                    @JvmField
                    val B11_DIESEL_BLEND_11_PERCENT_BIODIESEL =
                        of("B11_DIESEL_BLEND_11_PERCENT_BIODIESEL")

                    @JvmField
                    val B15_DIESEL_BLEND_15_PERCENT_BIODIESEL =
                        of("B15_DIESEL_BLEND_15_PERCENT_BIODIESEL")

                    @JvmField
                    val B20_DIESEL_BLEND_20_PERCENT_BIODIESEL =
                        of("B20_DIESEL_BLEND_20_PERCENT_BIODIESEL")

                    @JvmField
                    val B100_DIESEL_BLEND_100_PERCENT_BIODIESEL =
                        of("B100_DIESEL_BLEND_100_PERCENT_BIODIESEL")

                    @JvmField
                    val B1_DIESEL_BLEND_1_PERCENT_BIODIESEL =
                        of("B1_DIESEL_BLEND_1_PERCENT_BIODIESEL")

                    @JvmField val ADDITIZED_DIESEL_2 = of("ADDITIZED_DIESEL_2")

                    @JvmField val ADDITIZED_DIESEL_3 = of("ADDITIZED_DIESEL_3")

                    @JvmField val RENEWABLE_DIESEL_R95 = of("RENEWABLE_DIESEL_R95")

                    @JvmField
                    val RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT =
                        of("RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT")

                    @JvmField val DIESEL_EXHAUST_FLUID = of("DIESEL_EXHAUST_FLUID")

                    @JvmField val PREMIUM_DIESEL_1 = of("PREMIUM_DIESEL_1")

                    @JvmField
                    val REGULAR_ETHANOL_15_PERCENT_BLEND = of("REGULAR_ETHANOL_15_PERCENT_BLEND")

                    @JvmField
                    val MID_PLUS_ETHANOL_15_PERCENT_BLEND = of("MID_PLUS_ETHANOL_15_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND =
                        of("PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND")

                    @JvmField
                    val PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL =
                        of("PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL")

                    @JvmField
                    val PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL =
                        of("PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL")

                    @JvmField
                    val B75_DIESEL_BLEND_75_PERCENT_BIODIESEL =
                        of("B75_DIESEL_BLEND_75_PERCENT_BIODIESEL")

                    @JvmField
                    val B99_DIESEL_BLEND_99_PERCENT_BIODIESEL =
                        of("B99_DIESEL_BLEND_99_PERCENT_BIODIESEL")

                    @JvmField val MISCELLANEOUS_FUEL = of("MISCELLANEOUS_FUEL")

                    @JvmField val JET_FUEL = of("JET_FUEL")

                    @JvmField val AVIATION_FUEL_REGULAR = of("AVIATION_FUEL_REGULAR")

                    @JvmField val AVIATION_FUEL_PREMIUM = of("AVIATION_FUEL_PREMIUM")

                    @JvmField val AVIATION_FUEL_JP8 = of("AVIATION_FUEL_JP8")

                    @JvmField val AVIATION_FUEL_4 = of("AVIATION_FUEL_4")

                    @JvmField val AVIATION_FUEL_5 = of("AVIATION_FUEL_5")

                    @JvmField val BIOJET_DIESEL = of("BIOJET_DIESEL")

                    @JvmField val AVIATION_BIOFUEL_GASOLINE = of("AVIATION_BIOFUEL_GASOLINE")

                    @JvmField val MISCELLANEOUS_AVIATION_FUEL = of("MISCELLANEOUS_AVIATION_FUEL")

                    @JvmField val MARINE_FUEL_1 = of("MARINE_FUEL_1")

                    @JvmField val MARINE_FUEL_2 = of("MARINE_FUEL_2")

                    @JvmField val MARINE_FUEL_3 = of("MARINE_FUEL_3")

                    @JvmField val MARINE_FUEL_4 = of("MARINE_FUEL_4")

                    @JvmField val MARINE_FUEL_5 = of("MARINE_FUEL_5")

                    @JvmField val MARINE_OTHER = of("MARINE_OTHER")

                    @JvmField val MARINE_DIESEL = of("MARINE_DIESEL")

                    @JvmField val MISCELLANEOUS_MARINE_FUEL = of("MISCELLANEOUS_MARINE_FUEL")

                    @JvmField val KEROSENE_LOW_SULFUR = of("KEROSENE_LOW_SULFUR")

                    @JvmField val WHITE_GAS = of("WHITE_GAS")

                    @JvmField val HEATING_OIL = of("HEATING_OIL")

                    @JvmField val OTHER_FUEL_NON_TAXABLE = of("OTHER_FUEL_NON_TAXABLE")

                    @JvmField val KEROSENE_ULTRA_LOW_SULFUR = of("KEROSENE_ULTRA_LOW_SULFUR")

                    @JvmField
                    val KEROSENE_LOW_SULFUR_NON_TAXABLE = of("KEROSENE_LOW_SULFUR_NON_TAXABLE")

                    @JvmField
                    val KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE =
                        of("KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE")

                    @JvmField
                    val EVC_1_LEVEL_1_CHARGE_110_V_15_AMP = of("EVC_1_LEVEL_1_CHARGE_110V_15_AMP")

                    @JvmField
                    val EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP =
                        of("EVC_2_LEVEL_2_CHARGE_240V_15_40_AMP")

                    @JvmField
                    val EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE =
                        of("EVC_3_LEVEL_3_CHARGE_480V_3_PHASE_CHARGE")

                    @JvmField
                    val BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val DIESEL_1_OFF_ROAD_NON_TAXABLE = of("DIESEL_1_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val DIESEL_2_OFF_ROAD_NON_TAXABLE = of("DIESEL_2_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE =
                        of("DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE =
                        of("DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE")

                    @JvmField val ADDITIVE_DOSAGE = of("ADDITIVE_DOSAGE")

                    @JvmField val ETHANOL_BLENDS_E16_E84 = of("ETHANOL_BLENDS_E16_E84")

                    @JvmField val LOW_OCTANE_UNL = of("LOW_OCTANE_UNL")

                    @JvmField val BLENDED_DIESEL_1_AND_2 = of("BLENDED_DIESEL_1_AND_2")

                    @JvmField val OFF_ROAD_REGULAR_NON_TAXABLE = of("OFF_ROAD_REGULAR_NON_TAXABLE")

                    @JvmField
                    val OFF_ROAD_MID_PLUS_NON_TAXABLE = of("OFF_ROAD_MID_PLUS_NON_TAXABLE")

                    @JvmField
                    val OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE =
                        of("OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE")

                    @JvmField
                    val OFF_ROAD_MID_PLUS_2_NON_TAXABLE = of("OFF_ROAD_MID_PLUS_2_NON_TAXABLE")

                    @JvmField
                    val OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE =
                        of("OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE")

                    @JvmField val RECREATIONAL_FUEL_90_OCTANE = of("RECREATIONAL_FUEL_90_OCTANE")

                    @JvmField val HYDROGEN_H35 = of("HYDROGEN_H35")

                    @JvmField val HYDROGEN_H70 = of("HYDROGEN_H70")

                    @JvmField
                    val RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE =
                        of("RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField
                    val RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE =
                        of("RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE")

                    @JvmField val MISCELLANEOUS_OTHER_FUEL = of("MISCELLANEOUS_OTHER_FUEL")

                    @JvmStatic fun of(value: String) = FuelType(JsonField.of(value))
                }

                /** An enum containing [FuelType]'s known values. */
                enum class Known {
                    UNKNOWN,
                    REGULAR,
                    MID_PLUS,
                    PREMIUM_SUPER,
                    MID_PLUS_2,
                    PREMIUM_SUPER_2,
                    ETHANOL_5_7_BLEND,
                    MID_PLUS_ETHANOL_5_7_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND,
                    ETHANOL_7_7_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_7_7_PERCENT_BLEND,
                    GREEN_GASOLINE_REGULAR,
                    GREEN_GASOLINE_MID_PLUS,
                    GREEN_GASOLINE_PREMIUM_SUPER,
                    REGULAR_DIESEL_2,
                    PREMIUM_DIESEL_2,
                    REGULAR_DIESEL_1,
                    COMPRESSED_NATURAL_GAS,
                    LIQUID_PROPANE_GAS,
                    LIQUID_NATURAL_GAS,
                    E_85,
                    REFORMULATED_1,
                    REFORMULATED_2,
                    REFORMULATED_3,
                    REFORMULATED_4,
                    REFORMULATED_5,
                    DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE,
                    DIESEL_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE,
                    UNDEFINED_FUEL,
                    RACING_FUEL,
                    MID_PLUS_2_10_PERCENT_BLEND,
                    PREMIUM_SUPER_2_10_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_2_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND,
                    REGULAR_ETHANOL_10_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_10_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND,
                    B2_DIESEL_BLEND_2_PERCENT_BIODIESEL,
                    B5_DIESEL_BLEND_5_PERCENT_BIODIESEL,
                    B10_DIESEL_BLEND_10_PERCENT_BIODIESEL,
                    B11_DIESEL_BLEND_11_PERCENT_BIODIESEL,
                    B15_DIESEL_BLEND_15_PERCENT_BIODIESEL,
                    B20_DIESEL_BLEND_20_PERCENT_BIODIESEL,
                    B100_DIESEL_BLEND_100_PERCENT_BIODIESEL,
                    B1_DIESEL_BLEND_1_PERCENT_BIODIESEL,
                    ADDITIZED_DIESEL_2,
                    ADDITIZED_DIESEL_3,
                    RENEWABLE_DIESEL_R95,
                    RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT,
                    DIESEL_EXHAUST_FLUID,
                    PREMIUM_DIESEL_1,
                    REGULAR_ETHANOL_15_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND,
                    PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL,
                    PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL,
                    B75_DIESEL_BLEND_75_PERCENT_BIODIESEL,
                    B99_DIESEL_BLEND_99_PERCENT_BIODIESEL,
                    MISCELLANEOUS_FUEL,
                    JET_FUEL,
                    AVIATION_FUEL_REGULAR,
                    AVIATION_FUEL_PREMIUM,
                    AVIATION_FUEL_JP8,
                    AVIATION_FUEL_4,
                    AVIATION_FUEL_5,
                    BIOJET_DIESEL,
                    AVIATION_BIOFUEL_GASOLINE,
                    MISCELLANEOUS_AVIATION_FUEL,
                    MARINE_FUEL_1,
                    MARINE_FUEL_2,
                    MARINE_FUEL_3,
                    MARINE_FUEL_4,
                    MARINE_FUEL_5,
                    MARINE_OTHER,
                    MARINE_DIESEL,
                    MISCELLANEOUS_MARINE_FUEL,
                    KEROSENE_LOW_SULFUR,
                    WHITE_GAS,
                    HEATING_OIL,
                    OTHER_FUEL_NON_TAXABLE,
                    KEROSENE_ULTRA_LOW_SULFUR,
                    KEROSENE_LOW_SULFUR_NON_TAXABLE,
                    KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE,
                    EVC_1_LEVEL_1_CHARGE_110_V_15_AMP,
                    EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP,
                    EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE,
                    BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE,
                    DIESEL_1_OFF_ROAD_NON_TAXABLE,
                    DIESEL_2_OFF_ROAD_NON_TAXABLE,
                    DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE,
                    DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE,
                    ADDITIVE_DOSAGE,
                    ETHANOL_BLENDS_E16_E84,
                    LOW_OCTANE_UNL,
                    BLENDED_DIESEL_1_AND_2,
                    OFF_ROAD_REGULAR_NON_TAXABLE,
                    OFF_ROAD_MID_PLUS_NON_TAXABLE,
                    OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE,
                    OFF_ROAD_MID_PLUS_2_NON_TAXABLE,
                    OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE,
                    RECREATIONAL_FUEL_90_OCTANE,
                    HYDROGEN_H35,
                    HYDROGEN_H70,
                    RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE,
                    RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE,
                    MISCELLANEOUS_OTHER_FUEL,
                }

                /**
                 * An enum containing [FuelType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FuelType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UNKNOWN,
                    REGULAR,
                    MID_PLUS,
                    PREMIUM_SUPER,
                    MID_PLUS_2,
                    PREMIUM_SUPER_2,
                    ETHANOL_5_7_BLEND,
                    MID_PLUS_ETHANOL_5_7_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND,
                    ETHANOL_7_7_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_7_7_PERCENT_BLEND,
                    GREEN_GASOLINE_REGULAR,
                    GREEN_GASOLINE_MID_PLUS,
                    GREEN_GASOLINE_PREMIUM_SUPER,
                    REGULAR_DIESEL_2,
                    PREMIUM_DIESEL_2,
                    REGULAR_DIESEL_1,
                    COMPRESSED_NATURAL_GAS,
                    LIQUID_PROPANE_GAS,
                    LIQUID_NATURAL_GAS,
                    E_85,
                    REFORMULATED_1,
                    REFORMULATED_2,
                    REFORMULATED_3,
                    REFORMULATED_4,
                    REFORMULATED_5,
                    DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE,
                    DIESEL_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE,
                    UNDEFINED_FUEL,
                    RACING_FUEL,
                    MID_PLUS_2_10_PERCENT_BLEND,
                    PREMIUM_SUPER_2_10_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_2_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND,
                    REGULAR_ETHANOL_10_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_10_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND,
                    B2_DIESEL_BLEND_2_PERCENT_BIODIESEL,
                    B5_DIESEL_BLEND_5_PERCENT_BIODIESEL,
                    B10_DIESEL_BLEND_10_PERCENT_BIODIESEL,
                    B11_DIESEL_BLEND_11_PERCENT_BIODIESEL,
                    B15_DIESEL_BLEND_15_PERCENT_BIODIESEL,
                    B20_DIESEL_BLEND_20_PERCENT_BIODIESEL,
                    B100_DIESEL_BLEND_100_PERCENT_BIODIESEL,
                    B1_DIESEL_BLEND_1_PERCENT_BIODIESEL,
                    ADDITIZED_DIESEL_2,
                    ADDITIZED_DIESEL_3,
                    RENEWABLE_DIESEL_R95,
                    RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT,
                    DIESEL_EXHAUST_FLUID,
                    PREMIUM_DIESEL_1,
                    REGULAR_ETHANOL_15_PERCENT_BLEND,
                    MID_PLUS_ETHANOL_15_PERCENT_BLEND,
                    PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND,
                    PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL,
                    PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL,
                    B75_DIESEL_BLEND_75_PERCENT_BIODIESEL,
                    B99_DIESEL_BLEND_99_PERCENT_BIODIESEL,
                    MISCELLANEOUS_FUEL,
                    JET_FUEL,
                    AVIATION_FUEL_REGULAR,
                    AVIATION_FUEL_PREMIUM,
                    AVIATION_FUEL_JP8,
                    AVIATION_FUEL_4,
                    AVIATION_FUEL_5,
                    BIOJET_DIESEL,
                    AVIATION_BIOFUEL_GASOLINE,
                    MISCELLANEOUS_AVIATION_FUEL,
                    MARINE_FUEL_1,
                    MARINE_FUEL_2,
                    MARINE_FUEL_3,
                    MARINE_FUEL_4,
                    MARINE_FUEL_5,
                    MARINE_OTHER,
                    MARINE_DIESEL,
                    MISCELLANEOUS_MARINE_FUEL,
                    KEROSENE_LOW_SULFUR,
                    WHITE_GAS,
                    HEATING_OIL,
                    OTHER_FUEL_NON_TAXABLE,
                    KEROSENE_ULTRA_LOW_SULFUR,
                    KEROSENE_LOW_SULFUR_NON_TAXABLE,
                    KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE,
                    EVC_1_LEVEL_1_CHARGE_110_V_15_AMP,
                    EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP,
                    EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE,
                    BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE,
                    DIESEL_1_OFF_ROAD_NON_TAXABLE,
                    DIESEL_2_OFF_ROAD_NON_TAXABLE,
                    DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE,
                    DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE,
                    ADDITIVE_DOSAGE,
                    ETHANOL_BLENDS_E16_E84,
                    LOW_OCTANE_UNL,
                    BLENDED_DIESEL_1_AND_2,
                    OFF_ROAD_REGULAR_NON_TAXABLE,
                    OFF_ROAD_MID_PLUS_NON_TAXABLE,
                    OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE,
                    OFF_ROAD_MID_PLUS_2_NON_TAXABLE,
                    OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE,
                    RECREATIONAL_FUEL_90_OCTANE,
                    HYDROGEN_H35,
                    HYDROGEN_H70,
                    RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE,
                    BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE,
                    RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE,
                    MISCELLANEOUS_OTHER_FUEL,
                    /**
                     * An enum member indicating that [FuelType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UNKNOWN -> Value.UNKNOWN
                        REGULAR -> Value.REGULAR
                        MID_PLUS -> Value.MID_PLUS
                        PREMIUM_SUPER -> Value.PREMIUM_SUPER
                        MID_PLUS_2 -> Value.MID_PLUS_2
                        PREMIUM_SUPER_2 -> Value.PREMIUM_SUPER_2
                        ETHANOL_5_7_BLEND -> Value.ETHANOL_5_7_BLEND
                        MID_PLUS_ETHANOL_5_7_PERCENT_BLEND ->
                            Value.MID_PLUS_ETHANOL_5_7_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND ->
                            Value.PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND
                        ETHANOL_7_7_PERCENT_BLEND -> Value.ETHANOL_7_7_PERCENT_BLEND
                        MID_PLUS_ETHANOL_7_7_PERCENT_BLEND ->
                            Value.MID_PLUS_ETHANOL_7_7_PERCENT_BLEND
                        GREEN_GASOLINE_REGULAR -> Value.GREEN_GASOLINE_REGULAR
                        GREEN_GASOLINE_MID_PLUS -> Value.GREEN_GASOLINE_MID_PLUS
                        GREEN_GASOLINE_PREMIUM_SUPER -> Value.GREEN_GASOLINE_PREMIUM_SUPER
                        REGULAR_DIESEL_2 -> Value.REGULAR_DIESEL_2
                        PREMIUM_DIESEL_2 -> Value.PREMIUM_DIESEL_2
                        REGULAR_DIESEL_1 -> Value.REGULAR_DIESEL_1
                        COMPRESSED_NATURAL_GAS -> Value.COMPRESSED_NATURAL_GAS
                        LIQUID_PROPANE_GAS -> Value.LIQUID_PROPANE_GAS
                        LIQUID_NATURAL_GAS -> Value.LIQUID_NATURAL_GAS
                        E_85 -> Value.E_85
                        REFORMULATED_1 -> Value.REFORMULATED_1
                        REFORMULATED_2 -> Value.REFORMULATED_2
                        REFORMULATED_3 -> Value.REFORMULATED_3
                        REFORMULATED_4 -> Value.REFORMULATED_4
                        REFORMULATED_5 -> Value.REFORMULATED_5
                        DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE ->
                            Value.DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE
                        DIESEL_OFF_ROAD_NON_TAXABLE -> Value.DIESEL_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE
                        UNDEFINED_FUEL -> Value.UNDEFINED_FUEL
                        RACING_FUEL -> Value.RACING_FUEL
                        MID_PLUS_2_10_PERCENT_BLEND -> Value.MID_PLUS_2_10_PERCENT_BLEND
                        PREMIUM_SUPER_2_10_PERCENT_BLEND -> Value.PREMIUM_SUPER_2_10_PERCENT_BLEND
                        MID_PLUS_ETHANOL_2_15_PERCENT_BLEND ->
                            Value.MID_PLUS_ETHANOL_2_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND ->
                            Value.PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND ->
                            Value.PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND
                        REGULAR_ETHANOL_10_PERCENT_BLEND -> Value.REGULAR_ETHANOL_10_PERCENT_BLEND
                        MID_PLUS_ETHANOL_10_PERCENT_BLEND -> Value.MID_PLUS_ETHANOL_10_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND ->
                            Value.PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND
                        B2_DIESEL_BLEND_2_PERCENT_BIODIESEL ->
                            Value.B2_DIESEL_BLEND_2_PERCENT_BIODIESEL
                        B5_DIESEL_BLEND_5_PERCENT_BIODIESEL ->
                            Value.B5_DIESEL_BLEND_5_PERCENT_BIODIESEL
                        B10_DIESEL_BLEND_10_PERCENT_BIODIESEL ->
                            Value.B10_DIESEL_BLEND_10_PERCENT_BIODIESEL
                        B11_DIESEL_BLEND_11_PERCENT_BIODIESEL ->
                            Value.B11_DIESEL_BLEND_11_PERCENT_BIODIESEL
                        B15_DIESEL_BLEND_15_PERCENT_BIODIESEL ->
                            Value.B15_DIESEL_BLEND_15_PERCENT_BIODIESEL
                        B20_DIESEL_BLEND_20_PERCENT_BIODIESEL ->
                            Value.B20_DIESEL_BLEND_20_PERCENT_BIODIESEL
                        B100_DIESEL_BLEND_100_PERCENT_BIODIESEL ->
                            Value.B100_DIESEL_BLEND_100_PERCENT_BIODIESEL
                        B1_DIESEL_BLEND_1_PERCENT_BIODIESEL ->
                            Value.B1_DIESEL_BLEND_1_PERCENT_BIODIESEL
                        ADDITIZED_DIESEL_2 -> Value.ADDITIZED_DIESEL_2
                        ADDITIZED_DIESEL_3 -> Value.ADDITIZED_DIESEL_3
                        RENEWABLE_DIESEL_R95 -> Value.RENEWABLE_DIESEL_R95
                        RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT ->
                            Value.RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT
                        DIESEL_EXHAUST_FLUID -> Value.DIESEL_EXHAUST_FLUID
                        PREMIUM_DIESEL_1 -> Value.PREMIUM_DIESEL_1
                        REGULAR_ETHANOL_15_PERCENT_BLEND -> Value.REGULAR_ETHANOL_15_PERCENT_BLEND
                        MID_PLUS_ETHANOL_15_PERCENT_BLEND -> Value.MID_PLUS_ETHANOL_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND ->
                            Value.PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND
                        PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL ->
                            Value.PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL
                        PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL ->
                            Value.PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL
                        B75_DIESEL_BLEND_75_PERCENT_BIODIESEL ->
                            Value.B75_DIESEL_BLEND_75_PERCENT_BIODIESEL
                        B99_DIESEL_BLEND_99_PERCENT_BIODIESEL ->
                            Value.B99_DIESEL_BLEND_99_PERCENT_BIODIESEL
                        MISCELLANEOUS_FUEL -> Value.MISCELLANEOUS_FUEL
                        JET_FUEL -> Value.JET_FUEL
                        AVIATION_FUEL_REGULAR -> Value.AVIATION_FUEL_REGULAR
                        AVIATION_FUEL_PREMIUM -> Value.AVIATION_FUEL_PREMIUM
                        AVIATION_FUEL_JP8 -> Value.AVIATION_FUEL_JP8
                        AVIATION_FUEL_4 -> Value.AVIATION_FUEL_4
                        AVIATION_FUEL_5 -> Value.AVIATION_FUEL_5
                        BIOJET_DIESEL -> Value.BIOJET_DIESEL
                        AVIATION_BIOFUEL_GASOLINE -> Value.AVIATION_BIOFUEL_GASOLINE
                        MISCELLANEOUS_AVIATION_FUEL -> Value.MISCELLANEOUS_AVIATION_FUEL
                        MARINE_FUEL_1 -> Value.MARINE_FUEL_1
                        MARINE_FUEL_2 -> Value.MARINE_FUEL_2
                        MARINE_FUEL_3 -> Value.MARINE_FUEL_3
                        MARINE_FUEL_4 -> Value.MARINE_FUEL_4
                        MARINE_FUEL_5 -> Value.MARINE_FUEL_5
                        MARINE_OTHER -> Value.MARINE_OTHER
                        MARINE_DIESEL -> Value.MARINE_DIESEL
                        MISCELLANEOUS_MARINE_FUEL -> Value.MISCELLANEOUS_MARINE_FUEL
                        KEROSENE_LOW_SULFUR -> Value.KEROSENE_LOW_SULFUR
                        WHITE_GAS -> Value.WHITE_GAS
                        HEATING_OIL -> Value.HEATING_OIL
                        OTHER_FUEL_NON_TAXABLE -> Value.OTHER_FUEL_NON_TAXABLE
                        KEROSENE_ULTRA_LOW_SULFUR -> Value.KEROSENE_ULTRA_LOW_SULFUR
                        KEROSENE_LOW_SULFUR_NON_TAXABLE -> Value.KEROSENE_LOW_SULFUR_NON_TAXABLE
                        KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE ->
                            Value.KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE
                        EVC_1_LEVEL_1_CHARGE_110_V_15_AMP -> Value.EVC_1_LEVEL_1_CHARGE_110_V_15_AMP
                        EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP ->
                            Value.EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP
                        EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE ->
                            Value.EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE
                        BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE
                        DIESEL_1_OFF_ROAD_NON_TAXABLE -> Value.DIESEL_1_OFF_ROAD_NON_TAXABLE
                        DIESEL_2_OFF_ROAD_NON_TAXABLE -> Value.DIESEL_2_OFF_ROAD_NON_TAXABLE
                        DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE ->
                            Value.DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE
                        DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE ->
                            Value.DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE
                        ADDITIVE_DOSAGE -> Value.ADDITIVE_DOSAGE
                        ETHANOL_BLENDS_E16_E84 -> Value.ETHANOL_BLENDS_E16_E84
                        LOW_OCTANE_UNL -> Value.LOW_OCTANE_UNL
                        BLENDED_DIESEL_1_AND_2 -> Value.BLENDED_DIESEL_1_AND_2
                        OFF_ROAD_REGULAR_NON_TAXABLE -> Value.OFF_ROAD_REGULAR_NON_TAXABLE
                        OFF_ROAD_MID_PLUS_NON_TAXABLE -> Value.OFF_ROAD_MID_PLUS_NON_TAXABLE
                        OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE ->
                            Value.OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE
                        OFF_ROAD_MID_PLUS_2_NON_TAXABLE -> Value.OFF_ROAD_MID_PLUS_2_NON_TAXABLE
                        OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE ->
                            Value.OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE
                        RECREATIONAL_FUEL_90_OCTANE -> Value.RECREATIONAL_FUEL_90_OCTANE
                        HYDROGEN_H35 -> Value.HYDROGEN_H35
                        HYDROGEN_H70 -> Value.HYDROGEN_H70
                        RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE ->
                            Value.RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE
                        RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Value.RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE
                        MISCELLANEOUS_OTHER_FUEL -> Value.MISCELLANEOUS_OTHER_FUEL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        UNKNOWN -> Known.UNKNOWN
                        REGULAR -> Known.REGULAR
                        MID_PLUS -> Known.MID_PLUS
                        PREMIUM_SUPER -> Known.PREMIUM_SUPER
                        MID_PLUS_2 -> Known.MID_PLUS_2
                        PREMIUM_SUPER_2 -> Known.PREMIUM_SUPER_2
                        ETHANOL_5_7_BLEND -> Known.ETHANOL_5_7_BLEND
                        MID_PLUS_ETHANOL_5_7_PERCENT_BLEND ->
                            Known.MID_PLUS_ETHANOL_5_7_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND ->
                            Known.PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND
                        ETHANOL_7_7_PERCENT_BLEND -> Known.ETHANOL_7_7_PERCENT_BLEND
                        MID_PLUS_ETHANOL_7_7_PERCENT_BLEND ->
                            Known.MID_PLUS_ETHANOL_7_7_PERCENT_BLEND
                        GREEN_GASOLINE_REGULAR -> Known.GREEN_GASOLINE_REGULAR
                        GREEN_GASOLINE_MID_PLUS -> Known.GREEN_GASOLINE_MID_PLUS
                        GREEN_GASOLINE_PREMIUM_SUPER -> Known.GREEN_GASOLINE_PREMIUM_SUPER
                        REGULAR_DIESEL_2 -> Known.REGULAR_DIESEL_2
                        PREMIUM_DIESEL_2 -> Known.PREMIUM_DIESEL_2
                        REGULAR_DIESEL_1 -> Known.REGULAR_DIESEL_1
                        COMPRESSED_NATURAL_GAS -> Known.COMPRESSED_NATURAL_GAS
                        LIQUID_PROPANE_GAS -> Known.LIQUID_PROPANE_GAS
                        LIQUID_NATURAL_GAS -> Known.LIQUID_NATURAL_GAS
                        E_85 -> Known.E_85
                        REFORMULATED_1 -> Known.REFORMULATED_1
                        REFORMULATED_2 -> Known.REFORMULATED_2
                        REFORMULATED_3 -> Known.REFORMULATED_3
                        REFORMULATED_4 -> Known.REFORMULATED_4
                        REFORMULATED_5 -> Known.REFORMULATED_5
                        DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE ->
                            Known.DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE
                        DIESEL_OFF_ROAD_NON_TAXABLE -> Known.DIESEL_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE
                        UNDEFINED_FUEL -> Known.UNDEFINED_FUEL
                        RACING_FUEL -> Known.RACING_FUEL
                        MID_PLUS_2_10_PERCENT_BLEND -> Known.MID_PLUS_2_10_PERCENT_BLEND
                        PREMIUM_SUPER_2_10_PERCENT_BLEND -> Known.PREMIUM_SUPER_2_10_PERCENT_BLEND
                        MID_PLUS_ETHANOL_2_15_PERCENT_BLEND ->
                            Known.MID_PLUS_ETHANOL_2_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND ->
                            Known.PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND ->
                            Known.PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND
                        REGULAR_ETHANOL_10_PERCENT_BLEND -> Known.REGULAR_ETHANOL_10_PERCENT_BLEND
                        MID_PLUS_ETHANOL_10_PERCENT_BLEND -> Known.MID_PLUS_ETHANOL_10_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND ->
                            Known.PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND
                        B2_DIESEL_BLEND_2_PERCENT_BIODIESEL ->
                            Known.B2_DIESEL_BLEND_2_PERCENT_BIODIESEL
                        B5_DIESEL_BLEND_5_PERCENT_BIODIESEL ->
                            Known.B5_DIESEL_BLEND_5_PERCENT_BIODIESEL
                        B10_DIESEL_BLEND_10_PERCENT_BIODIESEL ->
                            Known.B10_DIESEL_BLEND_10_PERCENT_BIODIESEL
                        B11_DIESEL_BLEND_11_PERCENT_BIODIESEL ->
                            Known.B11_DIESEL_BLEND_11_PERCENT_BIODIESEL
                        B15_DIESEL_BLEND_15_PERCENT_BIODIESEL ->
                            Known.B15_DIESEL_BLEND_15_PERCENT_BIODIESEL
                        B20_DIESEL_BLEND_20_PERCENT_BIODIESEL ->
                            Known.B20_DIESEL_BLEND_20_PERCENT_BIODIESEL
                        B100_DIESEL_BLEND_100_PERCENT_BIODIESEL ->
                            Known.B100_DIESEL_BLEND_100_PERCENT_BIODIESEL
                        B1_DIESEL_BLEND_1_PERCENT_BIODIESEL ->
                            Known.B1_DIESEL_BLEND_1_PERCENT_BIODIESEL
                        ADDITIZED_DIESEL_2 -> Known.ADDITIZED_DIESEL_2
                        ADDITIZED_DIESEL_3 -> Known.ADDITIZED_DIESEL_3
                        RENEWABLE_DIESEL_R95 -> Known.RENEWABLE_DIESEL_R95
                        RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT ->
                            Known.RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT
                        DIESEL_EXHAUST_FLUID -> Known.DIESEL_EXHAUST_FLUID
                        PREMIUM_DIESEL_1 -> Known.PREMIUM_DIESEL_1
                        REGULAR_ETHANOL_15_PERCENT_BLEND -> Known.REGULAR_ETHANOL_15_PERCENT_BLEND
                        MID_PLUS_ETHANOL_15_PERCENT_BLEND -> Known.MID_PLUS_ETHANOL_15_PERCENT_BLEND
                        PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND ->
                            Known.PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND
                        PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL ->
                            Known.PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL
                        PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL ->
                            Known.PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL
                        B75_DIESEL_BLEND_75_PERCENT_BIODIESEL ->
                            Known.B75_DIESEL_BLEND_75_PERCENT_BIODIESEL
                        B99_DIESEL_BLEND_99_PERCENT_BIODIESEL ->
                            Known.B99_DIESEL_BLEND_99_PERCENT_BIODIESEL
                        MISCELLANEOUS_FUEL -> Known.MISCELLANEOUS_FUEL
                        JET_FUEL -> Known.JET_FUEL
                        AVIATION_FUEL_REGULAR -> Known.AVIATION_FUEL_REGULAR
                        AVIATION_FUEL_PREMIUM -> Known.AVIATION_FUEL_PREMIUM
                        AVIATION_FUEL_JP8 -> Known.AVIATION_FUEL_JP8
                        AVIATION_FUEL_4 -> Known.AVIATION_FUEL_4
                        AVIATION_FUEL_5 -> Known.AVIATION_FUEL_5
                        BIOJET_DIESEL -> Known.BIOJET_DIESEL
                        AVIATION_BIOFUEL_GASOLINE -> Known.AVIATION_BIOFUEL_GASOLINE
                        MISCELLANEOUS_AVIATION_FUEL -> Known.MISCELLANEOUS_AVIATION_FUEL
                        MARINE_FUEL_1 -> Known.MARINE_FUEL_1
                        MARINE_FUEL_2 -> Known.MARINE_FUEL_2
                        MARINE_FUEL_3 -> Known.MARINE_FUEL_3
                        MARINE_FUEL_4 -> Known.MARINE_FUEL_4
                        MARINE_FUEL_5 -> Known.MARINE_FUEL_5
                        MARINE_OTHER -> Known.MARINE_OTHER
                        MARINE_DIESEL -> Known.MARINE_DIESEL
                        MISCELLANEOUS_MARINE_FUEL -> Known.MISCELLANEOUS_MARINE_FUEL
                        KEROSENE_LOW_SULFUR -> Known.KEROSENE_LOW_SULFUR
                        WHITE_GAS -> Known.WHITE_GAS
                        HEATING_OIL -> Known.HEATING_OIL
                        OTHER_FUEL_NON_TAXABLE -> Known.OTHER_FUEL_NON_TAXABLE
                        KEROSENE_ULTRA_LOW_SULFUR -> Known.KEROSENE_ULTRA_LOW_SULFUR
                        KEROSENE_LOW_SULFUR_NON_TAXABLE -> Known.KEROSENE_LOW_SULFUR_NON_TAXABLE
                        KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE ->
                            Known.KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE
                        EVC_1_LEVEL_1_CHARGE_110_V_15_AMP -> Known.EVC_1_LEVEL_1_CHARGE_110_V_15_AMP
                        EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP ->
                            Known.EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP
                        EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE ->
                            Known.EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE
                        BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE
                        DIESEL_1_OFF_ROAD_NON_TAXABLE -> Known.DIESEL_1_OFF_ROAD_NON_TAXABLE
                        DIESEL_2_OFF_ROAD_NON_TAXABLE -> Known.DIESEL_2_OFF_ROAD_NON_TAXABLE
                        DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE ->
                            Known.DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE
                        DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE ->
                            Known.DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE
                        ADDITIVE_DOSAGE -> Known.ADDITIVE_DOSAGE
                        ETHANOL_BLENDS_E16_E84 -> Known.ETHANOL_BLENDS_E16_E84
                        LOW_OCTANE_UNL -> Known.LOW_OCTANE_UNL
                        BLENDED_DIESEL_1_AND_2 -> Known.BLENDED_DIESEL_1_AND_2
                        OFF_ROAD_REGULAR_NON_TAXABLE -> Known.OFF_ROAD_REGULAR_NON_TAXABLE
                        OFF_ROAD_MID_PLUS_NON_TAXABLE -> Known.OFF_ROAD_MID_PLUS_NON_TAXABLE
                        OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE ->
                            Known.OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE
                        OFF_ROAD_MID_PLUS_2_NON_TAXABLE -> Known.OFF_ROAD_MID_PLUS_2_NON_TAXABLE
                        OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE ->
                            Known.OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE
                        RECREATIONAL_FUEL_90_OCTANE -> Known.RECREATIONAL_FUEL_90_OCTANE
                        HYDROGEN_H35 -> Known.HYDROGEN_H35
                        HYDROGEN_H70 -> Known.HYDROGEN_H70
                        RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE ->
                            Known.RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE
                        BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE
                        RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE ->
                            Known.RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE
                        MISCELLANEOUS_OTHER_FUEL -> Known.MISCELLANEOUS_OTHER_FUEL
                        else -> throw LithicInvalidDataException("Unknown FuelType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FuelType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Unit of measure for fuel disbursement. */
            class FuelUnitOfMeasure
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GALLONS = of("GALLONS")

                    @JvmField val LITERS = of("LITERS")

                    @JvmField val POUNDS = of("POUNDS")

                    @JvmField val KILOGRAMS = of("KILOGRAMS")

                    @JvmField val IMPERIAL_GALLONS = of("IMPERIAL_GALLONS")

                    @JvmField val NOT_APPLICABLE = of("NOT_APPLICABLE")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = FuelUnitOfMeasure(JsonField.of(value))
                }

                /** An enum containing [FuelUnitOfMeasure]'s known values. */
                enum class Known {
                    GALLONS,
                    LITERS,
                    POUNDS,
                    KILOGRAMS,
                    IMPERIAL_GALLONS,
                    NOT_APPLICABLE,
                    UNKNOWN,
                }

                /**
                 * An enum containing [FuelUnitOfMeasure]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [FuelUnitOfMeasure] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GALLONS,
                    LITERS,
                    POUNDS,
                    KILOGRAMS,
                    IMPERIAL_GALLONS,
                    NOT_APPLICABLE,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [FuelUnitOfMeasure] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GALLONS -> Value.GALLONS
                        LITERS -> Value.LITERS
                        POUNDS -> Value.POUNDS
                        KILOGRAMS -> Value.KILOGRAMS
                        IMPERIAL_GALLONS -> Value.IMPERIAL_GALLONS
                        NOT_APPLICABLE -> Value.NOT_APPLICABLE
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GALLONS -> Known.GALLONS
                        LITERS -> Known.LITERS
                        POUNDS -> Known.POUNDS
                        KILOGRAMS -> Known.KILOGRAMS
                        IMPERIAL_GALLONS -> Known.IMPERIAL_GALLONS
                        NOT_APPLICABLE -> Known.NOT_APPLICABLE
                        UNKNOWN -> Known.UNKNOWN
                        else ->
                            throw LithicInvalidDataException("Unknown FuelUnitOfMeasure: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FuelUnitOfMeasure && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FuelData && quantity == other.quantity && type == other.type && unitOfMeasure == other.unitOfMeasure && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(quantity, type, unitOfMeasure, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FuelData{quantity=$quantity, type=$type, unitOfMeasure=$unitOfMeasure, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        /** The type of fuel service. */
        class ServiceType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmField val UNDEFINED = of("UNDEFINED")

                @JvmField val SELF_SERVICE = of("SELF_SERVICE")

                @JvmField val FULL_SERVICE = of("FULL_SERVICE")

                @JvmField val NON_FUEL_ONLY = of("NON_FUEL_ONLY")

                @JvmStatic fun of(value: String) = ServiceType(JsonField.of(value))
            }

            /** An enum containing [ServiceType]'s known values. */
            enum class Known {
                UNKNOWN,
                UNDEFINED,
                SELF_SERVICE,
                FULL_SERVICE,
                NON_FUEL_ONLY,
            }

            /**
             * An enum containing [ServiceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ServiceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNKNOWN,
                UNDEFINED,
                SELF_SERVICE,
                FULL_SERVICE,
                NON_FUEL_ONLY,
                /**
                 * An enum member indicating that [ServiceType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNKNOWN -> Value.UNKNOWN
                    UNDEFINED -> Value.UNDEFINED
                    SELF_SERVICE -> Value.SELF_SERVICE
                    FULL_SERVICE -> Value.FULL_SERVICE
                    NON_FUEL_ONLY -> Value.NON_FUEL_ONLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    UNKNOWN -> Known.UNKNOWN
                    UNDEFINED -> Known.UNDEFINED
                    SELF_SERVICE -> Known.SELF_SERVICE
                    FULL_SERVICE -> Known.FULL_SERVICE
                    NON_FUEL_ONLY -> Known.NON_FUEL_ONLY
                    else -> throw LithicInvalidDataException("Unknown ServiceType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ServiceType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Fleet && amountTotals == other.amountTotals && fuel == other.fuel && driverNumber == other.driverNumber && odometer == other.odometer && serviceType == other.serviceType && vehicleNumber == other.vehicleNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountTotals, fuel, driverNumber, odometer, serviceType, vehicleNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Fleet{amountTotals=$amountTotals, fuel=$fuel, driverNumber=$driverNumber, odometer=$odometer, serviceType=$serviceType, vehicleNumber=$vehicleNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnhancedData && token == other.token && common == other.common && eventToken == other.eventToken && fleet == other.fleet && transactionToken == other.transactionToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, common, eventToken, fleet, transactionToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnhancedData{token=$token, common=$common, eventToken=$eventToken, fleet=$fleet, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
}
