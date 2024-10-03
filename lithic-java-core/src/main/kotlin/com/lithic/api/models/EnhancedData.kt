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
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = EnhancedData.Builder::class)
@NoAutoDetect
class EnhancedData
private constructor(
    private val token: JsonField<String>,
    private val transactionToken: JsonField<String>,
    private val eventToken: JsonField<String>,
    private val common: JsonField<CommonData>,
    private val fleet: JsonField<List<Fleet>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A unique identifier for the enhanced commercial data. */
    fun token(): String = token.getRequired("token")

    /** The token of the transaction that the enhanced data is associated with. */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /** The token of the event that the enhanced data is associated with. */
    fun eventToken(): String = eventToken.getRequired("event_token")

    fun common(): CommonData = common.getRequired("common")

    fun fleet(): List<Fleet> = fleet.getRequired("fleet")

    /** A unique identifier for the enhanced commercial data. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The token of the transaction that the enhanced data is associated with. */
    @JsonProperty("transaction_token") @ExcludeMissing fun _transactionToken() = transactionToken

    /** The token of the event that the enhanced data is associated with. */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken() = eventToken

    @JsonProperty("common") @ExcludeMissing fun _common() = common

    @JsonProperty("fleet") @ExcludeMissing fun _fleet() = fleet

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EnhancedData = apply {
        if (!validated) {
            token()
            transactionToken()
            eventToken()
            common().validate()
            fleet().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var transactionToken: JsonField<String> = JsonMissing.of()
        private var eventToken: JsonField<String> = JsonMissing.of()
        private var common: JsonField<CommonData> = JsonMissing.of()
        private var fleet: JsonField<List<Fleet>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enhancedData: EnhancedData) = apply {
            this.token = enhancedData.token
            this.transactionToken = enhancedData.transactionToken
            this.eventToken = enhancedData.eventToken
            this.common = enhancedData.common
            this.fleet = enhancedData.fleet
            additionalProperties(enhancedData.additionalProperties)
        }

        /** A unique identifier for the enhanced commercial data. */
        fun token(token: String) = token(JsonField.of(token))

        /** A unique identifier for the enhanced commercial data. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The token of the transaction that the enhanced data is associated with. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /** The token of the transaction that the enhanced data is associated with. */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
        }

        /** The token of the event that the enhanced data is associated with. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /** The token of the event that the enhanced data is associated with. */
        @JsonProperty("event_token")
        @ExcludeMissing
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        fun common(common: CommonData) = common(JsonField.of(common))

        @JsonProperty("common")
        @ExcludeMissing
        fun common(common: JsonField<CommonData>) = apply { this.common = common }

        fun fleet(fleet: List<Fleet>) = fleet(JsonField.of(fleet))

        @JsonProperty("fleet")
        @ExcludeMissing
        fun fleet(fleet: JsonField<List<Fleet>>) = apply { this.fleet = fleet }

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

        fun build(): EnhancedData =
            EnhancedData(
                token,
                transactionToken,
                eventToken,
                common,
                fleet.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CommonData.Builder::class)
    @NoAutoDetect
    class CommonData
    private constructor(
        private val customerReferenceNumber: JsonField<String>,
        private val merchantReferenceNumber: JsonField<String>,
        private val orderDate: JsonField<LocalDate>,
        private val tax: JsonField<TaxData>,
        private val lineItems: JsonField<List<LineItem>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** A customer identifier. */
        fun customerReferenceNumber(): Optional<String> =
            Optional.ofNullable(customerReferenceNumber.getNullable("customer_reference_number"))

        /** A merchant identifier. */
        fun merchantReferenceNumber(): Optional<String> =
            Optional.ofNullable(merchantReferenceNumber.getNullable("merchant_reference_number"))

        /** The date of the order. */
        fun orderDate(): Optional<LocalDate> =
            Optional.ofNullable(orderDate.getNullable("order_date"))

        fun tax(): TaxData = tax.getRequired("tax")

        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /** A customer identifier. */
        @JsonProperty("customer_reference_number")
        @ExcludeMissing
        fun _customerReferenceNumber() = customerReferenceNumber

        /** A merchant identifier. */
        @JsonProperty("merchant_reference_number")
        @ExcludeMissing
        fun _merchantReferenceNumber() = merchantReferenceNumber

        /** The date of the order. */
        @JsonProperty("order_date") @ExcludeMissing fun _orderDate() = orderDate

        @JsonProperty("tax") @ExcludeMissing fun _tax() = tax

        @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CommonData = apply {
            if (!validated) {
                customerReferenceNumber()
                merchantReferenceNumber()
                orderDate()
                tax().validate()
                lineItems().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerReferenceNumber: JsonField<String> = JsonMissing.of()
            private var merchantReferenceNumber: JsonField<String> = JsonMissing.of()
            private var orderDate: JsonField<LocalDate> = JsonMissing.of()
            private var tax: JsonField<TaxData> = JsonMissing.of()
            private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commonData: CommonData) = apply {
                this.customerReferenceNumber = commonData.customerReferenceNumber
                this.merchantReferenceNumber = commonData.merchantReferenceNumber
                this.orderDate = commonData.orderDate
                this.tax = commonData.tax
                this.lineItems = commonData.lineItems
                additionalProperties(commonData.additionalProperties)
            }

            /** A customer identifier. */
            fun customerReferenceNumber(customerReferenceNumber: String) =
                customerReferenceNumber(JsonField.of(customerReferenceNumber))

            /** A customer identifier. */
            @JsonProperty("customer_reference_number")
            @ExcludeMissing
            fun customerReferenceNumber(customerReferenceNumber: JsonField<String>) = apply {
                this.customerReferenceNumber = customerReferenceNumber
            }

            /** A merchant identifier. */
            fun merchantReferenceNumber(merchantReferenceNumber: String) =
                merchantReferenceNumber(JsonField.of(merchantReferenceNumber))

            /** A merchant identifier. */
            @JsonProperty("merchant_reference_number")
            @ExcludeMissing
            fun merchantReferenceNumber(merchantReferenceNumber: JsonField<String>) = apply {
                this.merchantReferenceNumber = merchantReferenceNumber
            }

            /** The date of the order. */
            fun orderDate(orderDate: LocalDate) = orderDate(JsonField.of(orderDate))

            /** The date of the order. */
            @JsonProperty("order_date")
            @ExcludeMissing
            fun orderDate(orderDate: JsonField<LocalDate>) = apply { this.orderDate = orderDate }

            fun tax(tax: TaxData) = tax(JsonField.of(tax))

            @JsonProperty("tax")
            @ExcludeMissing
            fun tax(tax: JsonField<TaxData>) = apply { this.tax = tax }

            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            @JsonProperty("line_items")
            @ExcludeMissing
            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems
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

            fun build(): CommonData =
                CommonData(
                    customerReferenceNumber,
                    merchantReferenceNumber,
                    orderDate,
                    tax,
                    lineItems.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** An L2/L3 enhanced commercial data line item. */
        @JsonDeserialize(builder = LineItem.Builder::class)
        @NoAutoDetect
        class LineItem
        private constructor(
            private val productCode: JsonField<String>,
            private val description: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val amount: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** An identifier for the item purchased. */
            fun productCode(): Optional<String> =
                Optional.ofNullable(productCode.getNullable("product_code"))

            /** A human-readable description of the item. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** The quantity of the item purchased. */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** The price of the item purchased in merchant currency. */
            fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

            /** An identifier for the item purchased. */
            @JsonProperty("product_code") @ExcludeMissing fun _productCode() = productCode

            /** A human-readable description of the item. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The quantity of the item purchased. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            /** The price of the item purchased in merchant currency. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LineItem = apply {
                if (!validated) {
                    productCode()
                    description()
                    quantity()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var productCode: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(lineItem: LineItem) = apply {
                    this.productCode = lineItem.productCode
                    this.description = lineItem.description
                    this.quantity = lineItem.quantity
                    this.amount = lineItem.amount
                    additionalProperties(lineItem.additionalProperties)
                }

                /** An identifier for the item purchased. */
                fun productCode(productCode: String) = productCode(JsonField.of(productCode))

                /** An identifier for the item purchased. */
                @JsonProperty("product_code")
                @ExcludeMissing
                fun productCode(productCode: JsonField<String>) = apply {
                    this.productCode = productCode
                }

                /** A human-readable description of the item. */
                fun description(description: String) = description(JsonField.of(description))

                /** A human-readable description of the item. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The quantity of the item purchased. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** The quantity of the item purchased. */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** The price of the item purchased in merchant currency. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /** The price of the item purchased in merchant currency. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LineItem =
                    LineItem(
                        productCode,
                        description,
                        quantity,
                        amount,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LineItem && this.productCode == other.productCode && this.description == other.description && this.quantity == other.quantity && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(productCode, description, quantity, amount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "LineItem{productCode=$productCode, description=$description, quantity=$quantity, amount=$amount, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TaxData.Builder::class)
        @NoAutoDetect
        class TaxData
        private constructor(
            private val amount: JsonField<Long>,
            private val exempt: JsonField<TaxExemptIndicator>,
            private val merchantTaxId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The amount of tax collected. */
            fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

            /** A flag indicating whether the transaction is tax exempt or not. */
            fun exempt(): Optional<TaxExemptIndicator> =
                Optional.ofNullable(exempt.getNullable("exempt"))

            /** The tax ID of the merchant. */
            fun merchantTaxId(): Optional<String> =
                Optional.ofNullable(merchantTaxId.getNullable("merchant_tax_id"))

            /** The amount of tax collected. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** A flag indicating whether the transaction is tax exempt or not. */
            @JsonProperty("exempt") @ExcludeMissing fun _exempt() = exempt

            /** The tax ID of the merchant. */
            @JsonProperty("merchant_tax_id") @ExcludeMissing fun _merchantTaxId() = merchantTaxId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TaxData = apply {
                if (!validated) {
                    amount()
                    exempt()
                    merchantTaxId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var exempt: JsonField<TaxExemptIndicator> = JsonMissing.of()
                private var merchantTaxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(taxData: TaxData) = apply {
                    this.amount = taxData.amount
                    this.exempt = taxData.exempt
                    this.merchantTaxId = taxData.merchantTaxId
                    additionalProperties(taxData.additionalProperties)
                }

                /** The amount of tax collected. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount of tax collected. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** A flag indicating whether the transaction is tax exempt or not. */
                fun exempt(exempt: TaxExemptIndicator) = exempt(JsonField.of(exempt))

                /** A flag indicating whether the transaction is tax exempt or not. */
                @JsonProperty("exempt")
                @ExcludeMissing
                fun exempt(exempt: JsonField<TaxExemptIndicator>) = apply { this.exempt = exempt }

                /** The tax ID of the merchant. */
                fun merchantTaxId(merchantTaxId: String) =
                    merchantTaxId(JsonField.of(merchantTaxId))

                /** The tax ID of the merchant. */
                @JsonProperty("merchant_tax_id")
                @ExcludeMissing
                fun merchantTaxId(merchantTaxId: JsonField<String>) = apply {
                    this.merchantTaxId = merchantTaxId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TaxData =
                    TaxData(
                        amount,
                        exempt,
                        merchantTaxId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class TaxExemptIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TaxExemptIndicator && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val TAX_INCLUDED = TaxExemptIndicator(JsonField.of("TAX_INCLUDED"))

                    @JvmField
                    val TAX_NOT_INCLUDED = TaxExemptIndicator(JsonField.of("TAX_NOT_INCLUDED"))

                    @JvmField val NOT_SUPPORTED = TaxExemptIndicator(JsonField.of("NOT_SUPPORTED"))

                    @JvmStatic fun of(value: String) = TaxExemptIndicator(JsonField.of(value))
                }

                enum class Known {
                    TAX_INCLUDED,
                    TAX_NOT_INCLUDED,
                    NOT_SUPPORTED,
                }

                enum class Value {
                    TAX_INCLUDED,
                    TAX_NOT_INCLUDED,
                    NOT_SUPPORTED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TAX_INCLUDED -> Value.TAX_INCLUDED
                        TAX_NOT_INCLUDED -> Value.TAX_NOT_INCLUDED
                        NOT_SUPPORTED -> Value.NOT_SUPPORTED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TAX_INCLUDED -> Known.TAX_INCLUDED
                        TAX_NOT_INCLUDED -> Known.TAX_NOT_INCLUDED
                        NOT_SUPPORTED -> Known.NOT_SUPPORTED
                        else ->
                            throw LithicInvalidDataException("Unknown TaxExemptIndicator: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxData && this.amount == other.amount && this.exempt == other.exempt && this.merchantTaxId == other.merchantTaxId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, exempt, merchantTaxId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TaxData{amount=$amount, exempt=$exempt, merchantTaxId=$merchantTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CommonData && this.customerReferenceNumber == other.customerReferenceNumber && this.merchantReferenceNumber == other.merchantReferenceNumber && this.orderDate == other.orderDate && this.tax == other.tax && this.lineItems == other.lineItems && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerReferenceNumber, merchantReferenceNumber, orderDate, tax, lineItems, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CommonData{customerReferenceNumber=$customerReferenceNumber, merchantReferenceNumber=$merchantReferenceNumber, orderDate=$orderDate, tax=$tax, lineItems=$lineItems, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Fleet.Builder::class)
    @NoAutoDetect
    class Fleet
    private constructor(
        private val serviceType: JsonField<ServiceType>,
        private val odometer: JsonField<Long>,
        private val vehicleNumber: JsonField<String>,
        private val driverNumber: JsonField<String>,
        private val fuel: JsonField<FuelData>,
        private val amountTotals: JsonField<AmountTotals>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The type of fuel service. */
        fun serviceType(): Optional<ServiceType> =
            Optional.ofNullable(serviceType.getNullable("service_type"))

        /** The odometer reading entered into the terminal at the time of sale. */
        fun odometer(): Optional<Long> = Optional.ofNullable(odometer.getNullable("odometer"))

        /**
         * The vehicle number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        fun vehicleNumber(): Optional<String> =
            Optional.ofNullable(vehicleNumber.getNullable("vehicle_number"))

        /**
         * The driver number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        fun driverNumber(): Optional<String> =
            Optional.ofNullable(driverNumber.getNullable("driver_number"))

        fun fuel(): FuelData = fuel.getRequired("fuel")

        fun amountTotals(): AmountTotals = amountTotals.getRequired("amount_totals")

        /** The type of fuel service. */
        @JsonProperty("service_type") @ExcludeMissing fun _serviceType() = serviceType

        /** The odometer reading entered into the terminal at the time of sale. */
        @JsonProperty("odometer") @ExcludeMissing fun _odometer() = odometer

        /**
         * The vehicle number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        @JsonProperty("vehicle_number") @ExcludeMissing fun _vehicleNumber() = vehicleNumber

        /**
         * The driver number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         */
        @JsonProperty("driver_number") @ExcludeMissing fun _driverNumber() = driverNumber

        @JsonProperty("fuel") @ExcludeMissing fun _fuel() = fuel

        @JsonProperty("amount_totals") @ExcludeMissing fun _amountTotals() = amountTotals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Fleet = apply {
            if (!validated) {
                serviceType()
                odometer()
                vehicleNumber()
                driverNumber()
                fuel().validate()
                amountTotals().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var serviceType: JsonField<ServiceType> = JsonMissing.of()
            private var odometer: JsonField<Long> = JsonMissing.of()
            private var vehicleNumber: JsonField<String> = JsonMissing.of()
            private var driverNumber: JsonField<String> = JsonMissing.of()
            private var fuel: JsonField<FuelData> = JsonMissing.of()
            private var amountTotals: JsonField<AmountTotals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fleet: Fleet) = apply {
                this.serviceType = fleet.serviceType
                this.odometer = fleet.odometer
                this.vehicleNumber = fleet.vehicleNumber
                this.driverNumber = fleet.driverNumber
                this.fuel = fleet.fuel
                this.amountTotals = fleet.amountTotals
                additionalProperties(fleet.additionalProperties)
            }

            /** The type of fuel service. */
            fun serviceType(serviceType: ServiceType) = serviceType(JsonField.of(serviceType))

            /** The type of fuel service. */
            @JsonProperty("service_type")
            @ExcludeMissing
            fun serviceType(serviceType: JsonField<ServiceType>) = apply {
                this.serviceType = serviceType
            }

            /** The odometer reading entered into the terminal at the time of sale. */
            fun odometer(odometer: Long) = odometer(JsonField.of(odometer))

            /** The odometer reading entered into the terminal at the time of sale. */
            @JsonProperty("odometer")
            @ExcludeMissing
            fun odometer(odometer: JsonField<Long>) = apply { this.odometer = odometer }

            /**
             * The vehicle number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun vehicleNumber(vehicleNumber: String) = vehicleNumber(JsonField.of(vehicleNumber))

            /**
             * The vehicle number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            @JsonProperty("vehicle_number")
            @ExcludeMissing
            fun vehicleNumber(vehicleNumber: JsonField<String>) = apply {
                this.vehicleNumber = vehicleNumber
            }

            /**
             * The driver number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun driverNumber(driverNumber: String) = driverNumber(JsonField.of(driverNumber))

            /**
             * The driver number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            @JsonProperty("driver_number")
            @ExcludeMissing
            fun driverNumber(driverNumber: JsonField<String>) = apply {
                this.driverNumber = driverNumber
            }

            fun fuel(fuel: FuelData) = fuel(JsonField.of(fuel))

            @JsonProperty("fuel")
            @ExcludeMissing
            fun fuel(fuel: JsonField<FuelData>) = apply { this.fuel = fuel }

            fun amountTotals(amountTotals: AmountTotals) = amountTotals(JsonField.of(amountTotals))

            @JsonProperty("amount_totals")
            @ExcludeMissing
            fun amountTotals(amountTotals: JsonField<AmountTotals>) = apply {
                this.amountTotals = amountTotals
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

            fun build(): Fleet =
                Fleet(
                    serviceType,
                    odometer,
                    vehicleNumber,
                    driverNumber,
                    fuel,
                    amountTotals,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = AmountTotals.Builder::class)
        @NoAutoDetect
        class AmountTotals
        private constructor(
            private val grossSale: JsonField<Long>,
            private val discount: JsonField<Long>,
            private val netSale: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The gross sale amount. */
            fun grossSale(): Optional<Long> =
                Optional.ofNullable(grossSale.getNullable("gross_sale"))

            /** The discount applied to the gross sale amount. */
            fun discount(): Optional<Long> = Optional.ofNullable(discount.getNullable("discount"))

            /** The amount after discount. */
            fun netSale(): Optional<Long> = Optional.ofNullable(netSale.getNullable("net_sale"))

            /** The gross sale amount. */
            @JsonProperty("gross_sale") @ExcludeMissing fun _grossSale() = grossSale

            /** The discount applied to the gross sale amount. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The amount after discount. */
            @JsonProperty("net_sale") @ExcludeMissing fun _netSale() = netSale

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AmountTotals = apply {
                if (!validated) {
                    grossSale()
                    discount()
                    netSale()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var grossSale: JsonField<Long> = JsonMissing.of()
                private var discount: JsonField<Long> = JsonMissing.of()
                private var netSale: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amountTotals: AmountTotals) = apply {
                    this.grossSale = amountTotals.grossSale
                    this.discount = amountTotals.discount
                    this.netSale = amountTotals.netSale
                    additionalProperties(amountTotals.additionalProperties)
                }

                /** The gross sale amount. */
                fun grossSale(grossSale: Long) = grossSale(JsonField.of(grossSale))

                /** The gross sale amount. */
                @JsonProperty("gross_sale")
                @ExcludeMissing
                fun grossSale(grossSale: JsonField<Long>) = apply { this.grossSale = grossSale }

                /** The discount applied to the gross sale amount. */
                fun discount(discount: Long) = discount(JsonField.of(discount))

                /** The discount applied to the gross sale amount. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

                /** The amount after discount. */
                fun netSale(netSale: Long) = netSale(JsonField.of(netSale))

                /** The amount after discount. */
                @JsonProperty("net_sale")
                @ExcludeMissing
                fun netSale(netSale: JsonField<Long>) = apply { this.netSale = netSale }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AmountTotals =
                    AmountTotals(
                        grossSale,
                        discount,
                        netSale,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountTotals && this.grossSale == other.grossSale && this.discount == other.discount && this.netSale == other.netSale && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(grossSale, discount, netSale, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AmountTotals{grossSale=$grossSale, discount=$discount, netSale=$netSale, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = FuelData.Builder::class)
        @NoAutoDetect
        class FuelData
        private constructor(
            private val type: JsonField<FuelType>,
            private val quantity: JsonField<Double>,
            private val unitPrice: JsonField<Long>,
            private val unitOfMeasure: JsonField<FuelUnitOfMeasure>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of fuel purchased. */
            fun type(): Optional<FuelType> = Optional.ofNullable(type.getNullable("type"))

            /** The quantity of fuel purchased. */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** The price per unit of fuel. */
            fun unitPrice(): Optional<Long> =
                Optional.ofNullable(unitPrice.getNullable("unit_price"))

            /** Unit of measure for fuel disbursement. */
            fun unitOfMeasure(): Optional<FuelUnitOfMeasure> =
                Optional.ofNullable(unitOfMeasure.getNullable("unit_of_measure"))

            /** The type of fuel purchased. */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** The quantity of fuel purchased. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            /** The price per unit of fuel. */
            @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

            /** Unit of measure for fuel disbursement. */
            @JsonProperty("unit_of_measure") @ExcludeMissing fun _unitOfMeasure() = unitOfMeasure

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FuelData = apply {
                if (!validated) {
                    type()
                    quantity()
                    unitPrice()
                    unitOfMeasure()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<FuelType> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var unitPrice: JsonField<Long> = JsonMissing.of()
                private var unitOfMeasure: JsonField<FuelUnitOfMeasure> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fuelData: FuelData) = apply {
                    this.type = fuelData.type
                    this.quantity = fuelData.quantity
                    this.unitPrice = fuelData.unitPrice
                    this.unitOfMeasure = fuelData.unitOfMeasure
                    additionalProperties(fuelData.additionalProperties)
                }

                /** The type of fuel purchased. */
                fun type(type: FuelType) = type(JsonField.of(type))

                /** The type of fuel purchased. */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<FuelType>) = apply { this.type = type }

                /** The quantity of fuel purchased. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** The quantity of fuel purchased. */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** The price per unit of fuel. */
                fun unitPrice(unitPrice: Long) = unitPrice(JsonField.of(unitPrice))

                /** The price per unit of fuel. */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun unitPrice(unitPrice: JsonField<Long>) = apply { this.unitPrice = unitPrice }

                /** Unit of measure for fuel disbursement. */
                fun unitOfMeasure(unitOfMeasure: FuelUnitOfMeasure) =
                    unitOfMeasure(JsonField.of(unitOfMeasure))

                /** Unit of measure for fuel disbursement. */
                @JsonProperty("unit_of_measure")
                @ExcludeMissing
                fun unitOfMeasure(unitOfMeasure: JsonField<FuelUnitOfMeasure>) = apply {
                    this.unitOfMeasure = unitOfMeasure
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FuelData =
                    FuelData(
                        type,
                        quantity,
                        unitPrice,
                        unitOfMeasure,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class FuelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FuelType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val UNKNOWN = FuelType(JsonField.of("UNKNOWN"))

                    @JvmField val REGULAR = FuelType(JsonField.of("REGULAR"))

                    @JvmField val MID_PLUS = FuelType(JsonField.of("MID_PLUS"))

                    @JvmField val PREMIUM_SUPER = FuelType(JsonField.of("PREMIUM_SUPER"))

                    @JvmField val MID_PLUS_2 = FuelType(JsonField.of("MID_PLUS_2"))

                    @JvmField val PREMIUM_SUPER_2 = FuelType(JsonField.of("PREMIUM_SUPER_2"))

                    @JvmField val ETHANOL_5_7_BLEND = FuelType(JsonField.of("ETHANOL_5_7_BLEND"))

                    @JvmField
                    val MID_PLUS_ETHANOL_5_7_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_ETHANOL_5_7_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_ETHANOL_5_7_PERCENT_BLEND"))

                    @JvmField
                    val ETHANOL_7_7_PERCENT_BLEND =
                        FuelType(JsonField.of("ETHANOL_7_7_PERCENT_BLEND"))

                    @JvmField
                    val MID_PLUS_ETHANOL_7_7_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_ETHANOL_7_7_PERCENT_BLEND"))

                    @JvmField
                    val GREEN_GASOLINE_REGULAR = FuelType(JsonField.of("GREEN_GASOLINE_REGULAR"))

                    @JvmField
                    val GREEN_GASOLINE_MID_PLUS = FuelType(JsonField.of("GREEN_GASOLINE_MID_PLUS"))

                    @JvmField
                    val GREEN_GASOLINE_PREMIUM_SUPER =
                        FuelType(JsonField.of("GREEN_GASOLINE_PREMIUM_SUPER"))

                    @JvmField val REGULAR_DIESEL_2 = FuelType(JsonField.of("REGULAR_DIESEL_2"))

                    @JvmField val PREMIUM_DIESEL_2 = FuelType(JsonField.of("PREMIUM_DIESEL_2"))

                    @JvmField val REGULAR_DIESEL_1 = FuelType(JsonField.of("REGULAR_DIESEL_1"))

                    @JvmField
                    val COMPRESSED_NATURAL_GAS = FuelType(JsonField.of("COMPRESSED_NATURAL_GAS"))

                    @JvmField val LIQUID_PROPANE_GAS = FuelType(JsonField.of("LIQUID_PROPANE_GAS"))

                    @JvmField val LIQUID_NATURAL_GAS = FuelType(JsonField.of("LIQUID_NATURAL_GAS"))

                    @JvmField val E_85 = FuelType(JsonField.of("E_85"))

                    @JvmField val REFORMULATED_1 = FuelType(JsonField.of("REFORMULATED_1"))

                    @JvmField val REFORMULATED_2 = FuelType(JsonField.of("REFORMULATED_2"))

                    @JvmField val REFORMULATED_3 = FuelType(JsonField.of("REFORMULATED_3"))

                    @JvmField val REFORMULATED_4 = FuelType(JsonField.of("REFORMULATED_4"))

                    @JvmField val REFORMULATED_5 = FuelType(JsonField.of("REFORMULATED_5"))

                    @JvmField
                    val DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_OFF_ROAD_1_AND_2_NON_TAXABLE"))

                    @JvmField
                    val DIESEL_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_OFF_ROAD_NON_TAXABLE"))

                    @JvmField val UNDEFINED_FUEL = FuelType(JsonField.of("UNDEFINED_FUEL"))

                    @JvmField val RACING_FUEL = FuelType(JsonField.of("RACING_FUEL"))

                    @JvmField
                    val MID_PLUS_2_10_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_2_10_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_2_10_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_2_10_PERCENT_BLEND"))

                    @JvmField
                    val MID_PLUS_ETHANOL_2_15_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_ETHANOL_2_15_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_ETHANOL_2_15_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_ETHANOL_7_7_PERCENT_BLEND"))

                    @JvmField
                    val REGULAR_ETHANOL_10_PERCENT_BLEND =
                        FuelType(JsonField.of("REGULAR_ETHANOL_10_PERCENT_BLEND"))

                    @JvmField
                    val MID_PLUS_ETHANOL_10_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_ETHANOL_10_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_ETHANOL_10_PERCENT_BLEND"))

                    @JvmField
                    val B2_DIESEL_BLEND_2_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B2_DIESEL_BLEND_2_PERCENT_BIODIESEL"))

                    @JvmField
                    val B5_DIESEL_BLEND_5_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B5_DIESEL_BLEND_5_PERCENT_BIODIESEL"))

                    @JvmField
                    val B10_DIESEL_BLEND_10_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B10_DIESEL_BLEND_10_PERCENT_BIODIESEL"))

                    @JvmField
                    val B11_DIESEL_BLEND_11_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B11_DIESEL_BLEND_11_PERCENT_BIODIESEL"))

                    @JvmField
                    val B15_DIESEL_BLEND_15_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B15_DIESEL_BLEND_15_PERCENT_BIODIESEL"))

                    @JvmField
                    val B20_DIESEL_BLEND_20_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B20_DIESEL_BLEND_20_PERCENT_BIODIESEL"))

                    @JvmField
                    val B100_DIESEL_BLEND_100_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B100_DIESEL_BLEND_100_PERCENT_BIODIESEL"))

                    @JvmField
                    val B1_DIESEL_BLEND_1_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B1_DIESEL_BLEND_1_PERCENT_BIODIESEL"))

                    @JvmField val ADDITIZED_DIESEL_2 = FuelType(JsonField.of("ADDITIZED_DIESEL_2"))

                    @JvmField val ADDITIZED_DIESEL_3 = FuelType(JsonField.of("ADDITIZED_DIESEL_3"))

                    @JvmField
                    val RENEWABLE_DIESEL_R95 = FuelType(JsonField.of("RENEWABLE_DIESEL_R95"))

                    @JvmField
                    val RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT =
                        FuelType(JsonField.of("RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT"))

                    @JvmField
                    val DIESEL_EXHAUST_FLUID = FuelType(JsonField.of("DIESEL_EXHAUST_FLUID"))

                    @JvmField val PREMIUM_DIESEL_1 = FuelType(JsonField.of("PREMIUM_DIESEL_1"))

                    @JvmField
                    val REGULAR_ETHANOL_15_PERCENT_BLEND =
                        FuelType(JsonField.of("REGULAR_ETHANOL_15_PERCENT_BLEND"))

                    @JvmField
                    val MID_PLUS_ETHANOL_15_PERCENT_BLEND =
                        FuelType(JsonField.of("MID_PLUS_ETHANOL_15_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND =
                        FuelType(JsonField.of("PREMIUM_SUPER_ETHANOL_15_PERCENT_BLEND"))

                    @JvmField
                    val PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL =
                        FuelType(
                            JsonField.of("PREMIUM_DIESEL_BLEND_LESS_THAN_20_PERCENT_BIODIESEL")
                        )

                    @JvmField
                    val PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL =
                        FuelType(
                            JsonField.of("PREMIUM_DIESEL_BLEND_GREATER_THAN_20_PERCENT_BIODIESEL")
                        )

                    @JvmField
                    val B75_DIESEL_BLEND_75_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B75_DIESEL_BLEND_75_PERCENT_BIODIESEL"))

                    @JvmField
                    val B99_DIESEL_BLEND_99_PERCENT_BIODIESEL =
                        FuelType(JsonField.of("B99_DIESEL_BLEND_99_PERCENT_BIODIESEL"))

                    @JvmField val MISCELLANEOUS_FUEL = FuelType(JsonField.of("MISCELLANEOUS_FUEL"))

                    @JvmField val JET_FUEL = FuelType(JsonField.of("JET_FUEL"))

                    @JvmField
                    val AVIATION_FUEL_REGULAR = FuelType(JsonField.of("AVIATION_FUEL_REGULAR"))

                    @JvmField
                    val AVIATION_FUEL_PREMIUM = FuelType(JsonField.of("AVIATION_FUEL_PREMIUM"))

                    @JvmField val AVIATION_FUEL_JP8 = FuelType(JsonField.of("AVIATION_FUEL_JP8"))

                    @JvmField val AVIATION_FUEL_4 = FuelType(JsonField.of("AVIATION_FUEL_4"))

                    @JvmField val AVIATION_FUEL_5 = FuelType(JsonField.of("AVIATION_FUEL_5"))

                    @JvmField val BIOJET_DIESEL = FuelType(JsonField.of("BIOJET_DIESEL"))

                    @JvmField
                    val AVIATION_BIOFUEL_GASOLINE =
                        FuelType(JsonField.of("AVIATION_BIOFUEL_GASOLINE"))

                    @JvmField
                    val MISCELLANEOUS_AVIATION_FUEL =
                        FuelType(JsonField.of("MISCELLANEOUS_AVIATION_FUEL"))

                    @JvmField val MARINE_FUEL_1 = FuelType(JsonField.of("MARINE_FUEL_1"))

                    @JvmField val MARINE_FUEL_2 = FuelType(JsonField.of("MARINE_FUEL_2"))

                    @JvmField val MARINE_FUEL_3 = FuelType(JsonField.of("MARINE_FUEL_3"))

                    @JvmField val MARINE_FUEL_4 = FuelType(JsonField.of("MARINE_FUEL_4"))

                    @JvmField val MARINE_FUEL_5 = FuelType(JsonField.of("MARINE_FUEL_5"))

                    @JvmField val MARINE_OTHER = FuelType(JsonField.of("MARINE_OTHER"))

                    @JvmField val MARINE_DIESEL = FuelType(JsonField.of("MARINE_DIESEL"))

                    @JvmField
                    val MISCELLANEOUS_MARINE_FUEL =
                        FuelType(JsonField.of("MISCELLANEOUS_MARINE_FUEL"))

                    @JvmField
                    val KEROSENE_LOW_SULFUR = FuelType(JsonField.of("KEROSENE_LOW_SULFUR"))

                    @JvmField val WHITE_GAS = FuelType(JsonField.of("WHITE_GAS"))

                    @JvmField val HEATING_OIL = FuelType(JsonField.of("HEATING_OIL"))

                    @JvmField
                    val OTHER_FUEL_NON_TAXABLE = FuelType(JsonField.of("OTHER_FUEL_NON_TAXABLE"))

                    @JvmField
                    val KEROSENE_ULTRA_LOW_SULFUR =
                        FuelType(JsonField.of("KEROSENE_ULTRA_LOW_SULFUR"))

                    @JvmField
                    val KEROSENE_LOW_SULFUR_NON_TAXABLE =
                        FuelType(JsonField.of("KEROSENE_LOW_SULFUR_NON_TAXABLE"))

                    @JvmField
                    val KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE =
                        FuelType(JsonField.of("KEROSENE_ULTRA_LOW_SULFUR_NON_TAXABLE"))

                    @JvmField
                    val EVC_1_LEVEL_1_CHARGE_110_V_15_AMP =
                        FuelType(JsonField.of("EVC_1_LEVEL_1_CHARGE_110V_15_AMP"))

                    @JvmField
                    val EVC_2_LEVEL_2_CHARGE_240_V_15_40_AMP =
                        FuelType(JsonField.of("EVC_2_LEVEL_2_CHARGE_240V_15_40_AMP"))

                    @JvmField
                    val EVC_3_LEVEL_3_CHARGE_480_V_3_PHASE_CHARGE =
                        FuelType(JsonField.of("EVC_3_LEVEL_3_CHARGE_480V_3_PHASE_CHARGE"))

                    @JvmField
                    val BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_2_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_5_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_10_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_11_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_15_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_20_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val DIESEL_1_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_1_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val DIESEL_2_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_2_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_1_PREMIUM_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("DIESEL_2_PREMIUM_OFF_ROAD_NON_TAXABLE"))

                    @JvmField val ADDITIVE_DOSAGE = FuelType(JsonField.of("ADDITIVE_DOSAGE"))

                    @JvmField
                    val ETHANOL_BLENDS_E16_E84 = FuelType(JsonField.of("ETHANOL_BLENDS_E16_E84"))

                    @JvmField val LOW_OCTANE_UNL = FuelType(JsonField.of("LOW_OCTANE_UNL"))

                    @JvmField
                    val BLENDED_DIESEL_1_AND_2 = FuelType(JsonField.of("BLENDED_DIESEL_1_AND_2"))

                    @JvmField
                    val OFF_ROAD_REGULAR_NON_TAXABLE =
                        FuelType(JsonField.of("OFF_ROAD_REGULAR_NON_TAXABLE"))

                    @JvmField
                    val OFF_ROAD_MID_PLUS_NON_TAXABLE =
                        FuelType(JsonField.of("OFF_ROAD_MID_PLUS_NON_TAXABLE"))

                    @JvmField
                    val OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE =
                        FuelType(JsonField.of("OFF_ROAD_PREMIUM_SUPER_NON_TAXABLE"))

                    @JvmField
                    val OFF_ROAD_MID_PLUS_2_NON_TAXABLE =
                        FuelType(JsonField.of("OFF_ROAD_MID_PLUS_2_NON_TAXABLE"))

                    @JvmField
                    val OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE =
                        FuelType(JsonField.of("OFF_ROAD_PREMIUM_SUPER_2_NON_TAXABLE"))

                    @JvmField
                    val RECREATIONAL_FUEL_90_OCTANE =
                        FuelType(JsonField.of("RECREATIONAL_FUEL_90_OCTANE"))

                    @JvmField val HYDROGEN_H35 = FuelType(JsonField.of("HYDROGEN_H35"))

                    @JvmField val HYDROGEN_H70 = FuelType(JsonField.of("HYDROGEN_H70"))

                    @JvmField
                    val RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("RENEWABLE_DIESEL_R95_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_1_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_75_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_99_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(JsonField.of("BIODIESEL_BLEND_100_PERCENT_OFF_ROAD_NON_TAXABLE"))

                    @JvmField
                    val RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE =
                        FuelType(
                            JsonField.of(
                                "RENEWABLE_DIESEL_BIODIESEL_6_20_PERCENT_OFF_ROAD_NON_TAXABLE"
                            )
                        )

                    @JvmField
                    val MISCELLANEOUS_OTHER_FUEL =
                        FuelType(JsonField.of("MISCELLANEOUS_OTHER_FUEL"))

                    @JvmStatic fun of(value: String) = FuelType(JsonField.of(value))
                }

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class FuelUnitOfMeasure
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FuelUnitOfMeasure && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val GALLONS = FuelUnitOfMeasure(JsonField.of("GALLONS"))

                    @JvmField val LITERS = FuelUnitOfMeasure(JsonField.of("LITERS"))

                    @JvmField val POUNDS = FuelUnitOfMeasure(JsonField.of("POUNDS"))

                    @JvmField val KILOGRAMS = FuelUnitOfMeasure(JsonField.of("KILOGRAMS"))

                    @JvmField
                    val IMPERIAL_GALLONS = FuelUnitOfMeasure(JsonField.of("IMPERIAL_GALLONS"))

                    @JvmField val NOT_APPLICABLE = FuelUnitOfMeasure(JsonField.of("NOT_APPLICABLE"))

                    @JvmField val UNKNOWN = FuelUnitOfMeasure(JsonField.of("UNKNOWN"))

                    @JvmStatic fun of(value: String) = FuelUnitOfMeasure(JsonField.of(value))
                }

                enum class Known {
                    GALLONS,
                    LITERS,
                    POUNDS,
                    KILOGRAMS,
                    IMPERIAL_GALLONS,
                    NOT_APPLICABLE,
                    UNKNOWN,
                }

                enum class Value {
                    GALLONS,
                    LITERS,
                    POUNDS,
                    KILOGRAMS,
                    IMPERIAL_GALLONS,
                    NOT_APPLICABLE,
                    UNKNOWN,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FuelData && this.type == other.type && this.quantity == other.quantity && this.unitPrice == other.unitPrice && this.unitOfMeasure == other.unitOfMeasure && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, quantity, unitPrice, unitOfMeasure, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "FuelData{type=$type, quantity=$quantity, unitPrice=$unitPrice, unitOfMeasure=$unitOfMeasure, additionalProperties=$additionalProperties}"
        }

        class ServiceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ServiceType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val UNKNOWN = ServiceType(JsonField.of("UNKNOWN"))

                @JvmField val UNDEFINED = ServiceType(JsonField.of("UNDEFINED"))

                @JvmField val SELF_SERVICE = ServiceType(JsonField.of("SELF_SERVICE"))

                @JvmField val FULL_SERVICE = ServiceType(JsonField.of("FULL_SERVICE"))

                @JvmField val NON_FUEL_ONLY = ServiceType(JsonField.of("NON_FUEL_ONLY"))

                @JvmStatic fun of(value: String) = ServiceType(JsonField.of(value))
            }

            enum class Known {
                UNKNOWN,
                UNDEFINED,
                SELF_SERVICE,
                FULL_SERVICE,
                NON_FUEL_ONLY,
            }

            enum class Value {
                UNKNOWN,
                UNDEFINED,
                SELF_SERVICE,
                FULL_SERVICE,
                NON_FUEL_ONLY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNKNOWN -> Value.UNKNOWN
                    UNDEFINED -> Value.UNDEFINED
                    SELF_SERVICE -> Value.SELF_SERVICE
                    FULL_SERVICE -> Value.FULL_SERVICE
                    NON_FUEL_ONLY -> Value.NON_FUEL_ONLY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNKNOWN -> Known.UNKNOWN
                    UNDEFINED -> Known.UNDEFINED
                    SELF_SERVICE -> Known.SELF_SERVICE
                    FULL_SERVICE -> Known.FULL_SERVICE
                    NON_FUEL_ONLY -> Known.NON_FUEL_ONLY
                    else -> throw LithicInvalidDataException("Unknown ServiceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Fleet && this.serviceType == other.serviceType && this.odometer == other.odometer && this.vehicleNumber == other.vehicleNumber && this.driverNumber == other.driverNumber && this.fuel == other.fuel && this.amountTotals == other.amountTotals && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(serviceType, odometer, vehicleNumber, driverNumber, fuel, amountTotals, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Fleet{serviceType=$serviceType, odometer=$odometer, vehicleNumber=$vehicleNumber, driverNumber=$driverNumber, fuel=$fuel, amountTotals=$amountTotals, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnhancedData && this.token == other.token && this.transactionToken == other.transactionToken && this.eventToken == other.eventToken && this.common == other.common && this.fleet == other.fleet && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, transactionToken, eventToken, common, fleet, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "EnhancedData{token=$token, transactionToken=$transactionToken, eventToken=$eventToken, common=$common, fleet=$fleet, additionalProperties=$additionalProperties}"
}
