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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EnhancedData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val common: JsonField<CommonData>,
    private val eventToken: JsonField<String>,
    private val fleet: JsonField<List<Fleet>>,
    private val transactionToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common") @ExcludeMissing common: JsonField<CommonData> = JsonMissing.of(),
        @JsonProperty("event_token")
        @ExcludeMissing
        eventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fleet") @ExcludeMissing fleet: JsonField<List<Fleet>> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
    ) : this(token, common, eventToken, fleet, transactionToken, mutableMapOf())

    /**
     * A unique identifier for the enhanced commercial data.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun common(): CommonData = common.getRequired("common")

    /**
     * The token of the event that the enhanced data is associated with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventToken(): String = eventToken.getRequired("event_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fleet(): List<Fleet> = fleet.getRequired("fleet")

    /**
     * The token of the transaction that the enhanced data is associated with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [common].
     *
     * Unlike [common], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("common") @ExcludeMissing fun _common(): JsonField<CommonData> = common

    /**
     * Returns the raw JSON value of [eventToken].
     *
     * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /**
     * Returns the raw JSON value of [fleet].
     *
     * Unlike [fleet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleet") @ExcludeMissing fun _fleet(): JsonField<List<Fleet>> = fleet

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

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

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun common(common: CommonData) = common(JsonField.of(common))

        /**
         * Sets [Builder.common] to an arbitrary JSON value.
         *
         * You should usually call [Builder.common] with a well-typed [CommonData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun common(common: JsonField<CommonData>) = apply { this.common = common }

        /** The token of the event that the enhanced data is associated with. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /**
         * Sets [Builder.eventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        fun fleet(fleet: List<Fleet>) = fleet(JsonField.of(fleet))

        /**
         * Sets [Builder.fleet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleet] with a well-typed `List<Fleet>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fleet(fleet: JsonField<List<Fleet>>) = apply {
            this.fleet = fleet.map { it.toMutableList() }
        }

        /**
         * Adds a single [Fleet] to [Builder.fleet].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFleet(fleet: Fleet) = apply {
            this.fleet =
                (this.fleet ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fleet", it).add(fleet)
                }
        }

        /** The token of the transaction that the enhanced data is associated with. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * Sets [Builder.transactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [EnhancedData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .common()
         * .eventToken()
         * .fleet()
         * .transactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EnhancedData =
            EnhancedData(
                checkRequired("token", token),
                checkRequired("common", common),
                checkRequired("eventToken", eventToken),
                checkRequired("fleet", fleet).map { it.toImmutable() },
                checkRequired("transactionToken", transactionToken),
                additionalProperties.toMutableMap(),
            )
    }

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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (common.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventToken.asKnown().isPresent) 1 else 0) +
            (fleet.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0)

    class CommonData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lineItems: JsonField<List<LineItem>>,
        private val tax: JsonField<TaxData>,
        private val customerReferenceNumber: JsonField<String>,
        private val merchantReferenceNumber: JsonField<String>,
        private val orderDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("line_items")
            @ExcludeMissing
            lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<TaxData> = JsonMissing.of(),
            @JsonProperty("customer_reference_number")
            @ExcludeMissing
            customerReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_reference_number")
            @ExcludeMissing
            merchantReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order_date")
            @ExcludeMissing
            orderDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            lineItems,
            tax,
            customerReferenceNumber,
            merchantReferenceNumber,
            orderDate,
            mutableMapOf(),
        )

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tax(): TaxData = tax.getRequired("tax")

        /**
         * A customer identifier.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReferenceNumber(): Optional<String> =
            customerReferenceNumber.getOptional("customer_reference_number")

        /**
         * A merchant identifier.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun merchantReferenceNumber(): Optional<String> =
            merchantReferenceNumber.getOptional("merchant_reference_number")

        /**
         * The date of the order.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orderDate(): Optional<LocalDate> = orderDate.getOptional("order_date")

        /**
         * Returns the raw JSON value of [lineItems].
         *
         * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<TaxData> = tax

        /**
         * Returns the raw JSON value of [customerReferenceNumber].
         *
         * Unlike [customerReferenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_reference_number")
        @ExcludeMissing
        fun _customerReferenceNumber(): JsonField<String> = customerReferenceNumber

        /**
         * Returns the raw JSON value of [merchantReferenceNumber].
         *
         * Unlike [merchantReferenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_reference_number")
        @ExcludeMissing
        fun _merchantReferenceNumber(): JsonField<String> = merchantReferenceNumber

        /**
         * Returns the raw JSON value of [orderDate].
         *
         * Unlike [orderDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_date")
        @ExcludeMissing
        fun _orderDate(): JsonField<LocalDate> = orderDate

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

            /**
             * Sets [Builder.lineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItem] to [lineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            fun tax(tax: TaxData) = tax(JsonField.of(tax))

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [TaxData] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<TaxData>) = apply { this.tax = tax }

            /** A customer identifier. */
            fun customerReferenceNumber(customerReferenceNumber: String?) =
                customerReferenceNumber(JsonField.ofNullable(customerReferenceNumber))

            /**
             * Alias for calling [Builder.customerReferenceNumber] with
             * `customerReferenceNumber.orElse(null)`.
             */
            fun customerReferenceNumber(customerReferenceNumber: Optional<String>) =
                customerReferenceNumber(customerReferenceNumber.getOrNull())

            /**
             * Sets [Builder.customerReferenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReferenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customerReferenceNumber(customerReferenceNumber: JsonField<String>) = apply {
                this.customerReferenceNumber = customerReferenceNumber
            }

            /** A merchant identifier. */
            fun merchantReferenceNumber(merchantReferenceNumber: String?) =
                merchantReferenceNumber(JsonField.ofNullable(merchantReferenceNumber))

            /**
             * Alias for calling [Builder.merchantReferenceNumber] with
             * `merchantReferenceNumber.orElse(null)`.
             */
            fun merchantReferenceNumber(merchantReferenceNumber: Optional<String>) =
                merchantReferenceNumber(merchantReferenceNumber.getOrNull())

            /**
             * Sets [Builder.merchantReferenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantReferenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun merchantReferenceNumber(merchantReferenceNumber: JsonField<String>) = apply {
                this.merchantReferenceNumber = merchantReferenceNumber
            }

            /** The date of the order. */
            fun orderDate(orderDate: LocalDate?) = orderDate(JsonField.ofNullable(orderDate))

            /** Alias for calling [Builder.orderDate] with `orderDate.orElse(null)`. */
            fun orderDate(orderDate: Optional<LocalDate>) = orderDate(orderDate.getOrNull())

            /**
             * Sets [Builder.orderDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [CommonData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .lineItems()
             * .tax()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CommonData =
                CommonData(
                    checkRequired("lineItems", lineItems).map { it.toImmutable() },
                    checkRequired("tax", tax),
                    customerReferenceNumber,
                    merchantReferenceNumber,
                    orderDate,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (tax.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customerReferenceNumber.asKnown().isPresent) 1 else 0) +
                (if (merchantReferenceNumber.asKnown().isPresent) 1 else 0) +
                (if (orderDate.asKnown().isPresent) 1 else 0)

        /** An L2/L3 enhanced commercial data line item. */
        class LineItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val description: JsonField<String>,
            private val productCode: JsonField<String>,
            private val quantity: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_code")
                @ExcludeMissing
                productCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<String> = JsonMissing.of(),
            ) : this(amount, description, productCode, quantity, mutableMapOf())

            /**
             * The price of the item purchased in merchant currency.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * A human-readable description of the item.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * An identifier for the item purchased.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun productCode(): Optional<String> = productCode.getOptional("product_code")

            /**
             * The quantity of the item purchased.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun quantity(): Optional<String> = quantity.getOptional("quantity")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [productCode].
             *
             * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_code")
            @ExcludeMissing
            fun _productCode(): JsonField<String> = productCode

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

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

                /** Returns a mutable builder for constructing an instance of [LineItem]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LineItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var productCode: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<String> = JsonMissing.of()
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
                fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

                /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                fun amount(amount: Optional<String>) = amount(amount.getOrNull())

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** A human-readable description of the item. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** An identifier for the item purchased. */
                fun productCode(productCode: String?) =
                    productCode(JsonField.ofNullable(productCode))

                /** Alias for calling [Builder.productCode] with `productCode.orElse(null)`. */
                fun productCode(productCode: Optional<String>) =
                    productCode(productCode.getOrNull())

                /**
                 * Sets [Builder.productCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productCode(productCode: JsonField<String>) = apply {
                    this.productCode = productCode
                }

                /** The quantity of the item purchased. */
                fun quantity(quantity: String?) = quantity(JsonField.ofNullable(quantity))

                /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
                fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

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

                /**
                 * Returns an immutable instance of [LineItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LineItem =
                    LineItem(
                        amount,
                        description,
                        productCode,
                        quantity,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (productCode.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LineItem &&
                    amount == other.amount &&
                    description == other.description &&
                    productCode == other.productCode &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, description, productCode, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LineItem{amount=$amount, description=$description, productCode=$productCode, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        class TaxData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val exempt: JsonField<TaxExemptIndicator>,
            private val merchantTaxId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("exempt")
                @ExcludeMissing
                exempt: JsonField<TaxExemptIndicator> = JsonMissing.of(),
                @JsonProperty("merchant_tax_id")
                @ExcludeMissing
                merchantTaxId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, exempt, merchantTaxId, mutableMapOf())

            /**
             * The amount of tax collected.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * A flag indicating whether the transaction is tax exempt or not.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun exempt(): Optional<TaxExemptIndicator> = exempt.getOptional("exempt")

            /**
             * The tax ID of the merchant.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun merchantTaxId(): Optional<String> = merchantTaxId.getOptional("merchant_tax_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [exempt].
             *
             * Unlike [exempt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("exempt")
            @ExcludeMissing
            fun _exempt(): JsonField<TaxExemptIndicator> = exempt

            /**
             * Returns the raw JSON value of [merchantTaxId].
             *
             * Unlike [merchantTaxId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchant_tax_id")
            @ExcludeMissing
            fun _merchantTaxId(): JsonField<String> = merchantTaxId

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
                fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

                /**
                 * Alias for [Builder.amount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amount(amount: Long) = amount(amount as Long?)

                /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                fun amount(amount: Optional<Long>) = amount(amount.getOrNull())

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** A flag indicating whether the transaction is tax exempt or not. */
                fun exempt(exempt: TaxExemptIndicator?) = exempt(JsonField.ofNullable(exempt))

                /** Alias for calling [Builder.exempt] with `exempt.orElse(null)`. */
                fun exempt(exempt: Optional<TaxExemptIndicator>) = exempt(exempt.getOrNull())

                /**
                 * Sets [Builder.exempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exempt] with a well-typed [TaxExemptIndicator]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun exempt(exempt: JsonField<TaxExemptIndicator>) = apply { this.exempt = exempt }

                /** The tax ID of the merchant. */
                fun merchantTaxId(merchantTaxId: String?) =
                    merchantTaxId(JsonField.ofNullable(merchantTaxId))

                /** Alias for calling [Builder.merchantTaxId] with `merchantTaxId.orElse(null)`. */
                fun merchantTaxId(merchantTaxId: Optional<String>) =
                    merchantTaxId(merchantTaxId.getOrNull())

                /**
                 * Sets [Builder.merchantTaxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantTaxId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [TaxData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TaxData =
                    TaxData(amount, exempt, merchantTaxId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): TaxData = apply {
                if (validated) {
                    return@apply
                }

                amount()
                exempt().ifPresent { it.validate() }
                merchantTaxId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (exempt.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (merchantTaxId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                fun validate(): TaxExemptIndicator = apply {
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

                    return other is TaxExemptIndicator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TaxData &&
                    amount == other.amount &&
                    exempt == other.exempt &&
                    merchantTaxId == other.merchantTaxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, exempt, merchantTaxId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxData{amount=$amount, exempt=$exempt, merchantTaxId=$merchantTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CommonData &&
                lineItems == other.lineItems &&
                tax == other.tax &&
                customerReferenceNumber == other.customerReferenceNumber &&
                merchantReferenceNumber == other.merchantReferenceNumber &&
                orderDate == other.orderDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                lineItems,
                tax,
                customerReferenceNumber,
                merchantReferenceNumber,
                orderDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CommonData{lineItems=$lineItems, tax=$tax, customerReferenceNumber=$customerReferenceNumber, merchantReferenceNumber=$merchantReferenceNumber, orderDate=$orderDate, additionalProperties=$additionalProperties}"
    }

    class Fleet
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amountTotals: JsonField<AmountTotals>,
        private val fuel: JsonField<FuelData>,
        private val driverNumber: JsonField<String>,
        private val odometer: JsonField<Long>,
        private val serviceType: JsonField<ServiceType>,
        private val vehicleNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_totals")
            @ExcludeMissing
            amountTotals: JsonField<AmountTotals> = JsonMissing.of(),
            @JsonProperty("fuel") @ExcludeMissing fuel: JsonField<FuelData> = JsonMissing.of(),
            @JsonProperty("driver_number")
            @ExcludeMissing
            driverNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("odometer") @ExcludeMissing odometer: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service_type")
            @ExcludeMissing
            serviceType: JsonField<ServiceType> = JsonMissing.of(),
            @JsonProperty("vehicle_number")
            @ExcludeMissing
            vehicleNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            amountTotals,
            fuel,
            driverNumber,
            odometer,
            serviceType,
            vehicleNumber,
            mutableMapOf(),
        )

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountTotals(): AmountTotals = amountTotals.getRequired("amount_totals")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fuel(): FuelData = fuel.getRequired("fuel")

        /**
         * The driver number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun driverNumber(): Optional<String> = driverNumber.getOptional("driver_number")

        /**
         * The odometer reading entered into the terminal at the time of sale.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun odometer(): Optional<Long> = odometer.getOptional("odometer")

        /**
         * The type of fuel service.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceType(): Optional<ServiceType> = serviceType.getOptional("service_type")

        /**
         * The vehicle number entered into the terminal at the time of sale, with leading zeros
         * stripped.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vehicleNumber(): Optional<String> = vehicleNumber.getOptional("vehicle_number")

        /**
         * Returns the raw JSON value of [amountTotals].
         *
         * Unlike [amountTotals], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_totals")
        @ExcludeMissing
        fun _amountTotals(): JsonField<AmountTotals> = amountTotals

        /**
         * Returns the raw JSON value of [fuel].
         *
         * Unlike [fuel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuel") @ExcludeMissing fun _fuel(): JsonField<FuelData> = fuel

        /**
         * Returns the raw JSON value of [driverNumber].
         *
         * Unlike [driverNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("driver_number")
        @ExcludeMissing
        fun _driverNumber(): JsonField<String> = driverNumber

        /**
         * Returns the raw JSON value of [odometer].
         *
         * Unlike [odometer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("odometer") @ExcludeMissing fun _odometer(): JsonField<Long> = odometer

        /**
         * Returns the raw JSON value of [serviceType].
         *
         * Unlike [serviceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service_type")
        @ExcludeMissing
        fun _serviceType(): JsonField<ServiceType> = serviceType

        /**
         * Returns the raw JSON value of [vehicleNumber].
         *
         * Unlike [vehicleNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vehicle_number")
        @ExcludeMissing
        fun _vehicleNumber(): JsonField<String> = vehicleNumber

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

            /**
             * Sets [Builder.amountTotals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountTotals] with a well-typed [AmountTotals] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountTotals(amountTotals: JsonField<AmountTotals>) = apply {
                this.amountTotals = amountTotals
            }

            fun fuel(fuel: FuelData) = fuel(JsonField.of(fuel))

            /**
             * Sets [Builder.fuel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuel] with a well-typed [FuelData] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuel(fuel: JsonField<FuelData>) = apply { this.fuel = fuel }

            /**
             * The driver number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun driverNumber(driverNumber: String?) =
                driverNumber(JsonField.ofNullable(driverNumber))

            /** Alias for calling [Builder.driverNumber] with `driverNumber.orElse(null)`. */
            fun driverNumber(driverNumber: Optional<String>) =
                driverNumber(driverNumber.getOrNull())

            /**
             * Sets [Builder.driverNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.driverNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun driverNumber(driverNumber: JsonField<String>) = apply {
                this.driverNumber = driverNumber
            }

            /** The odometer reading entered into the terminal at the time of sale. */
            fun odometer(odometer: Long?) = odometer(JsonField.ofNullable(odometer))

            /**
             * Alias for [Builder.odometer].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun odometer(odometer: Long) = odometer(odometer as Long?)

            /** Alias for calling [Builder.odometer] with `odometer.orElse(null)`. */
            fun odometer(odometer: Optional<Long>) = odometer(odometer.getOrNull())

            /**
             * Sets [Builder.odometer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.odometer] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun odometer(odometer: JsonField<Long>) = apply { this.odometer = odometer }

            /** The type of fuel service. */
            fun serviceType(serviceType: ServiceType) = serviceType(JsonField.of(serviceType))

            /**
             * Sets [Builder.serviceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceType] with a well-typed [ServiceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceType(serviceType: JsonField<ServiceType>) = apply {
                this.serviceType = serviceType
            }

            /**
             * The vehicle number entered into the terminal at the time of sale, with leading zeros
             * stripped.
             */
            fun vehicleNumber(vehicleNumber: String?) =
                vehicleNumber(JsonField.ofNullable(vehicleNumber))

            /** Alias for calling [Builder.vehicleNumber] with `vehicleNumber.orElse(null)`. */
            fun vehicleNumber(vehicleNumber: Optional<String>) =
                vehicleNumber(vehicleNumber.getOrNull())

            /**
             * Sets [Builder.vehicleNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Fleet].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amountTotals()
             * .fuel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Fleet =
                Fleet(
                    checkRequired("amountTotals", amountTotals),
                    checkRequired("fuel", fuel),
                    driverNumber,
                    odometer,
                    serviceType,
                    vehicleNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Fleet = apply {
            if (validated) {
                return@apply
            }

            amountTotals().validate()
            fuel().validate()
            driverNumber()
            odometer()
            serviceType().ifPresent { it.validate() }
            vehicleNumber()
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
            (amountTotals.asKnown().getOrNull()?.validity() ?: 0) +
                (fuel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (driverNumber.asKnown().isPresent) 1 else 0) +
                (if (odometer.asKnown().isPresent) 1 else 0) +
                (serviceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (vehicleNumber.asKnown().isPresent) 1 else 0)

        class AmountTotals
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val discount: JsonField<Long>,
            private val grossSale: JsonField<Long>,
            private val netSale: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("discount")
                @ExcludeMissing
                discount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("gross_sale")
                @ExcludeMissing
                grossSale: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("net_sale")
                @ExcludeMissing
                netSale: JsonField<Long> = JsonMissing.of(),
            ) : this(discount, grossSale, netSale, mutableMapOf())

            /**
             * The discount applied to the gross sale amount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discount(): Optional<Long> = discount.getOptional("discount")

            /**
             * The gross sale amount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun grossSale(): Optional<Long> = grossSale.getOptional("gross_sale")

            /**
             * The amount after discount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun netSale(): Optional<Long> = netSale.getOptional("net_sale")

            /**
             * Returns the raw JSON value of [discount].
             *
             * Unlike [discount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Long> = discount

            /**
             * Returns the raw JSON value of [grossSale].
             *
             * Unlike [grossSale], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gross_sale")
            @ExcludeMissing
            fun _grossSale(): JsonField<Long> = grossSale

            /**
             * Returns the raw JSON value of [netSale].
             *
             * Unlike [netSale], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("net_sale") @ExcludeMissing fun _netSale(): JsonField<Long> = netSale

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
                fun discount(discount: Long?) = discount(JsonField.ofNullable(discount))

                /**
                 * Alias for [Builder.discount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun discount(discount: Long) = discount(discount as Long?)

                /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
                fun discount(discount: Optional<Long>) = discount(discount.getOrNull())

                /**
                 * Sets [Builder.discount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

                /** The gross sale amount. */
                fun grossSale(grossSale: Long?) = grossSale(JsonField.ofNullable(grossSale))

                /**
                 * Alias for [Builder.grossSale].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun grossSale(grossSale: Long) = grossSale(grossSale as Long?)

                /** Alias for calling [Builder.grossSale] with `grossSale.orElse(null)`. */
                fun grossSale(grossSale: Optional<Long>) = grossSale(grossSale.getOrNull())

                /**
                 * Sets [Builder.grossSale] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grossSale] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grossSale(grossSale: JsonField<Long>) = apply { this.grossSale = grossSale }

                /** The amount after discount. */
                fun netSale(netSale: Long?) = netSale(JsonField.ofNullable(netSale))

                /**
                 * Alias for [Builder.netSale].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun netSale(netSale: Long) = netSale(netSale as Long?)

                /** Alias for calling [Builder.netSale] with `netSale.orElse(null)`. */
                fun netSale(netSale: Optional<Long>) = netSale(netSale.getOrNull())

                /**
                 * Sets [Builder.netSale] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.netSale] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [AmountTotals].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AmountTotals =
                    AmountTotals(discount, grossSale, netSale, additionalProperties.toMutableMap())
            }

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
                (if (discount.asKnown().isPresent) 1 else 0) +
                    (if (grossSale.asKnown().isPresent) 1 else 0) +
                    (if (netSale.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AmountTotals &&
                    discount == other.discount &&
                    grossSale == other.grossSale &&
                    netSale == other.netSale &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(discount, grossSale, netSale, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountTotals{discount=$discount, grossSale=$grossSale, netSale=$netSale, additionalProperties=$additionalProperties}"
        }

        class FuelData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val quantity: JsonField<String>,
            private val type: JsonField<FuelType>,
            private val unitOfMeasure: JsonField<FuelUnitOfMeasure>,
            private val unitPrice: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<FuelType> = JsonMissing.of(),
                @JsonProperty("unit_of_measure")
                @ExcludeMissing
                unitOfMeasure: JsonField<FuelUnitOfMeasure> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Long> = JsonMissing.of(),
            ) : this(quantity, type, unitOfMeasure, unitPrice, mutableMapOf())

            /**
             * The quantity of fuel purchased.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun quantity(): Optional<String> = quantity.getOptional("quantity")

            /**
             * The type of fuel purchased.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<FuelType> = type.getOptional("type")

            /**
             * Unit of measure for fuel disbursement.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitOfMeasure(): Optional<FuelUnitOfMeasure> =
                unitOfMeasure.getOptional("unit_of_measure")

            /**
             * The price per unit of fuel.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitPrice(): Optional<Long> = unitPrice.getOptional("unit_price")

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FuelType> = type

            /**
             * Returns the raw JSON value of [unitOfMeasure].
             *
             * Unlike [unitOfMeasure], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_of_measure")
            @ExcludeMissing
            fun _unitOfMeasure(): JsonField<FuelUnitOfMeasure> = unitOfMeasure

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Long> = unitPrice

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

                /** Returns a mutable builder for constructing an instance of [FuelData]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FuelData]. */
            class Builder internal constructor() {

                private var quantity: JsonField<String> = JsonMissing.of()
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
                fun quantity(quantity: String?) = quantity(JsonField.ofNullable(quantity))

                /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
                fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

                /** The type of fuel purchased. */
                fun type(type: FuelType?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<FuelType>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [FuelType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<FuelType>) = apply { this.type = type }

                /** Unit of measure for fuel disbursement. */
                fun unitOfMeasure(unitOfMeasure: FuelUnitOfMeasure?) =
                    unitOfMeasure(JsonField.ofNullable(unitOfMeasure))

                /** Alias for calling [Builder.unitOfMeasure] with `unitOfMeasure.orElse(null)`. */
                fun unitOfMeasure(unitOfMeasure: Optional<FuelUnitOfMeasure>) =
                    unitOfMeasure(unitOfMeasure.getOrNull())

                /**
                 * Sets [Builder.unitOfMeasure] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitOfMeasure] with a well-typed
                 * [FuelUnitOfMeasure] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun unitOfMeasure(unitOfMeasure: JsonField<FuelUnitOfMeasure>) = apply {
                    this.unitOfMeasure = unitOfMeasure
                }

                /** The price per unit of fuel. */
                fun unitPrice(unitPrice: Long?) = unitPrice(JsonField.ofNullable(unitPrice))

                /**
                 * Alias for [Builder.unitPrice].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun unitPrice(unitPrice: Long) = unitPrice(unitPrice as Long?)

                /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
                fun unitPrice(unitPrice: Optional<Long>) = unitPrice(unitPrice.getOrNull())

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [FuelData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FuelData =
                    FuelData(
                        quantity,
                        type,
                        unitOfMeasure,
                        unitPrice,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FuelData = apply {
                if (validated) {
                    return@apply
                }

                quantity()
                type().ifPresent { it.validate() }
                unitOfMeasure().ifPresent { it.validate() }
                unitPrice()
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
                (if (quantity.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (unitOfMeasure.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                fun validate(): FuelType = apply {
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

                    return other is FuelType && value == other.value
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

                private var validated: Boolean = false

                fun validate(): FuelUnitOfMeasure = apply {
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

                    return other is FuelUnitOfMeasure && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FuelData &&
                    quantity == other.quantity &&
                    type == other.type &&
                    unitOfMeasure == other.unitOfMeasure &&
                    unitPrice == other.unitPrice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(quantity, type, unitOfMeasure, unitPrice, additionalProperties)
            }

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

            private var validated: Boolean = false

            fun validate(): ServiceType = apply {
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

                return other is ServiceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Fleet &&
                amountTotals == other.amountTotals &&
                fuel == other.fuel &&
                driverNumber == other.driverNumber &&
                odometer == other.odometer &&
                serviceType == other.serviceType &&
                vehicleNumber == other.vehicleNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amountTotals,
                fuel,
                driverNumber,
                odometer,
                serviceType,
                vehicleNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Fleet{amountTotals=$amountTotals, fuel=$fuel, driverNumber=$driverNumber, odometer=$odometer, serviceType=$serviceType, vehicleNumber=$vehicleNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnhancedData &&
            token == other.token &&
            common == other.common &&
            eventToken == other.eventToken &&
            fleet == other.fleet &&
            transactionToken == other.transactionToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(token, common, eventToken, fleet, transactionToken, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnhancedData{token=$token, common=$common, eventToken=$eventToken, fleet=$fleet, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
}
