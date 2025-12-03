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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a bulk order for physical card shipments */
class CardBulkOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val cardTokens: JsonField<List<String>>,
    private val created: JsonField<OffsetDateTime>,
    private val customerProductId: JsonField<String>,
    private val shippingAddress: JsonValue,
    private val shippingMethod: JsonField<ShippingMethod>,
    private val status: JsonField<Status>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_tokens")
        @ExcludeMissing
        cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_product_id")
        @ExcludeMissing
        customerProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        shippingAddress: JsonValue = JsonMissing.of(),
        @JsonProperty("shipping_method")
        @ExcludeMissing
        shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        cardTokens,
        created,
        customerProductId,
        shippingAddress,
        shippingMethod,
        status,
        updated,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the bulk order
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * List of card tokens associated with this bulk order
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /**
     * An RFC 3339 timestamp for when the bulk order was created. UTC time zone
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Customer-specified product configuration for physical card manufacturing. This must be
     * configured with Lithic before use
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerProductId(): Optional<String> = customerProductId.getOptional("customer_product_id")

    /** Shipping address for all cards in this bulk order */
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
     * Status of the bulk order. OPEN indicates the order is accepting cards. LOCKED indicates the
     * order is finalized and no more cards can be added
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * An RFC 3339 timestamp for when the bulk order was last updated. UTC time zone
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [cardTokens].
     *
     * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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
     * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_method")
    @ExcludeMissing
    fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [CardBulkOrder].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .cardTokens()
         * .created()
         * .customerProductId()
         * .shippingAddress()
         * .shippingMethod()
         * .status()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardBulkOrder]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var customerProductId: JsonField<String>? = null
        private var shippingAddress: JsonValue? = null
        private var shippingMethod: JsonField<ShippingMethod>? = null
        private var status: JsonField<Status>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardBulkOrder: CardBulkOrder) = apply {
            token = cardBulkOrder.token
            cardTokens = cardBulkOrder.cardTokens.map { it.toMutableList() }
            created = cardBulkOrder.created
            customerProductId = cardBulkOrder.customerProductId
            shippingAddress = cardBulkOrder.shippingAddress
            shippingMethod = cardBulkOrder.shippingMethod
            status = cardBulkOrder.status
            updated = cardBulkOrder.updated
            additionalProperties = cardBulkOrder.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the bulk order */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** List of card tokens associated with this bulk order */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Sets [Builder.cardTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
            this.cardTokens = cardTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [cardTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCardToken(cardToken: String) = apply {
            cardTokens =
                (cardTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cardTokens", it).add(cardToken)
                }
        }

        /** An RFC 3339 timestamp for when the bulk order was created. UTC time zone */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Customer-specified product configuration for physical card manufacturing. This must be
         * configured with Lithic before use
         */
        fun customerProductId(customerProductId: String?) =
            customerProductId(JsonField.ofNullable(customerProductId))

        /** Alias for calling [Builder.customerProductId] with `customerProductId.orElse(null)`. */
        fun customerProductId(customerProductId: Optional<String>) =
            customerProductId(customerProductId.getOrNull())

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
         * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
            this.shippingMethod = shippingMethod
        }

        /**
         * Status of the bulk order. OPEN indicates the order is accepting cards. LOCKED indicates
         * the order is finalized and no more cards can be added
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** An RFC 3339 timestamp for when the bulk order was last updated. UTC time zone */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [CardBulkOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .cardTokens()
         * .created()
         * .customerProductId()
         * .shippingAddress()
         * .shippingMethod()
         * .status()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardBulkOrder =
            CardBulkOrder(
                checkRequired("token", token),
                checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("customerProductId", customerProductId),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("shippingMethod", shippingMethod),
                checkRequired("status", status),
                checkRequired("updated", updated),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardBulkOrder = apply {
        if (validated) {
            return@apply
        }

        token()
        cardTokens()
        created()
        customerProductId()
        shippingMethod().validate()
        status().validate()
        updated()
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
            (cardTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (customerProductId.asKnown().isPresent) 1 else 0) +
            (shippingMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

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

    /**
     * Status of the bulk order. OPEN indicates the order is accepting cards. LOCKED indicates the
     * order is finalized and no more cards can be added
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPEN = of("OPEN")

            @JvmField val LOCKED = of("LOCKED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            LOCKED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            LOCKED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                OPEN -> Value.OPEN
                LOCKED -> Value.LOCKED
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
                OPEN -> Known.OPEN
                LOCKED -> Known.LOCKED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardBulkOrder &&
            token == other.token &&
            cardTokens == other.cardTokens &&
            created == other.created &&
            customerProductId == other.customerProductId &&
            shippingAddress == other.shippingAddress &&
            shippingMethod == other.shippingMethod &&
            status == other.status &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            cardTokens,
            created,
            customerProductId,
            shippingAddress,
            shippingMethod,
            status,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardBulkOrder{token=$token, cardTokens=$cardTokens, created=$created, customerProductId=$customerProductId, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, status=$status, updated=$updated, additionalProperties=$additionalProperties}"
}
