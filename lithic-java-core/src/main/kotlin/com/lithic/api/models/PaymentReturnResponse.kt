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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response from ACH operations including returns */
class PaymentReturnResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val result: JsonField<TransactionResult>,
    private val transactionGroupUuid: JsonField<String>,
    private val transactionUuid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<TransactionResult> = JsonMissing.of(),
        @JsonProperty("transaction_group_uuid")
        @ExcludeMissing
        transactionGroupUuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_uuid")
        @ExcludeMissing
        transactionUuid: JsonField<String> = JsonMissing.of(),
    ) : this(result, transactionGroupUuid, transactionUuid, mutableMapOf())

    /**
     * Transaction result
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): TransactionResult = result.getRequired("result")

    /**
     * Globally unique identifier for the transaction group
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionGroupUuid(): String = transactionGroupUuid.getRequired("transaction_group_uuid")

    /**
     * Globally unique identifier for the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionUuid(): String = transactionUuid.getRequired("transaction_uuid")

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

    /**
     * Returns the raw JSON value of [transactionGroupUuid].
     *
     * Unlike [transactionGroupUuid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_group_uuid")
    @ExcludeMissing
    fun _transactionGroupUuid(): JsonField<String> = transactionGroupUuid

    /**
     * Returns the raw JSON value of [transactionUuid].
     *
     * Unlike [transactionUuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_uuid")
    @ExcludeMissing
    fun _transactionUuid(): JsonField<String> = transactionUuid

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
         * Returns a mutable builder for constructing an instance of [PaymentReturnResponse].
         *
         * The following fields are required:
         * ```java
         * .result()
         * .transactionGroupUuid()
         * .transactionUuid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentReturnResponse]. */
    class Builder internal constructor() {

        private var result: JsonField<TransactionResult>? = null
        private var transactionGroupUuid: JsonField<String>? = null
        private var transactionUuid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentReturnResponse: PaymentReturnResponse) = apply {
            result = paymentReturnResponse.result
            transactionGroupUuid = paymentReturnResponse.transactionGroupUuid
            transactionUuid = paymentReturnResponse.transactionUuid
            additionalProperties = paymentReturnResponse.additionalProperties.toMutableMap()
        }

        /** Transaction result */
        fun result(result: TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [TransactionResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        /** Globally unique identifier for the transaction group */
        fun transactionGroupUuid(transactionGroupUuid: String) =
            transactionGroupUuid(JsonField.of(transactionGroupUuid))

        /**
         * Sets [Builder.transactionGroupUuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionGroupUuid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionGroupUuid(transactionGroupUuid: JsonField<String>) = apply {
            this.transactionGroupUuid = transactionGroupUuid
        }

        /** Globally unique identifier for the transaction */
        fun transactionUuid(transactionUuid: String) =
            transactionUuid(JsonField.of(transactionUuid))

        /**
         * Sets [Builder.transactionUuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionUuid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionUuid(transactionUuid: JsonField<String>) = apply {
            this.transactionUuid = transactionUuid
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
         * Returns an immutable instance of [PaymentReturnResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .result()
         * .transactionGroupUuid()
         * .transactionUuid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentReturnResponse =
            PaymentReturnResponse(
                checkRequired("result", result),
                checkRequired("transactionGroupUuid", transactionGroupUuid),
                checkRequired("transactionUuid", transactionUuid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentReturnResponse = apply {
        if (validated) {
            return@apply
        }

        result().validate()
        transactionGroupUuid()
        transactionUuid()
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
        (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionGroupUuid.asKnown().isPresent) 1 else 0) +
            (if (transactionUuid.asKnown().isPresent) 1 else 0)

    /** Transaction result */
    class TransactionResult @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
        }

        /** An enum containing [TransactionResult]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /**
             * An enum member indicating that [TransactionResult] was instantiated with an unknown
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
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
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
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

        fun validate(): TransactionResult = apply {
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

            return other is TransactionResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentReturnResponse &&
            result == other.result &&
            transactionGroupUuid == other.transactionGroupUuid &&
            transactionUuid == other.transactionUuid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(result, transactionGroupUuid, transactionUuid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentReturnResponse{result=$result, transactionGroupUuid=$transactionGroupUuid, transactionUuid=$transactionUuid, additionalProperties=$additionalProperties}"
}
