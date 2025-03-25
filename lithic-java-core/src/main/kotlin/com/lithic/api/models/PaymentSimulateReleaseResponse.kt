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

class PaymentSimulateReleaseResponse
private constructor(
    private val debuggingRequestId: JsonField<String>,
    private val result: JsonField<Result>,
    private val transactionEventToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        debuggingRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("transaction_event_token")
        @ExcludeMissing
        transactionEventToken: JsonField<String> = JsonMissing.of(),
    ) : this(debuggingRequestId, result, transactionEventToken, mutableMapOf())

    /**
     * Debugging Request Id
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debuggingRequestId(): String = debuggingRequestId.getRequired("debugging_request_id")

    /**
     * Request Result
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Transaction Event Token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionEventToken(): String =
        transactionEventToken.getRequired("transaction_event_token")

    /**
     * Returns the raw JSON value of [debuggingRequestId].
     *
     * Unlike [debuggingRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId(): JsonField<String> = debuggingRequestId

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [transactionEventToken].
     *
     * Unlike [transactionEventToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    fun _transactionEventToken(): JsonField<String> = transactionEventToken

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
         * Returns a mutable builder for constructing an instance of
         * [PaymentSimulateReleaseResponse].
         *
         * The following fields are required:
         * ```java
         * .debuggingRequestId()
         * .result()
         * .transactionEventToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentSimulateReleaseResponse]. */
    class Builder internal constructor() {

        private var debuggingRequestId: JsonField<String>? = null
        private var result: JsonField<Result>? = null
        private var transactionEventToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateReleaseResponse: PaymentSimulateReleaseResponse) = apply {
            debuggingRequestId = paymentSimulateReleaseResponse.debuggingRequestId
            result = paymentSimulateReleaseResponse.result
            transactionEventToken = paymentSimulateReleaseResponse.transactionEventToken
            additionalProperties =
                paymentSimulateReleaseResponse.additionalProperties.toMutableMap()
        }

        /** Debugging Request Id */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /**
         * Sets [Builder.debuggingRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debuggingRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

        /** Request Result */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Transaction Event Token */
        fun transactionEventToken(transactionEventToken: String) =
            transactionEventToken(JsonField.of(transactionEventToken))

        /**
         * Sets [Builder.transactionEventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionEventToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionEventToken(transactionEventToken: JsonField<String>) = apply {
            this.transactionEventToken = transactionEventToken
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
         * Returns an immutable instance of [PaymentSimulateReleaseResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .debuggingRequestId()
         * .result()
         * .transactionEventToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentSimulateReleaseResponse =
            PaymentSimulateReleaseResponse(
                checkRequired("debuggingRequestId", debuggingRequestId),
                checkRequired("result", result),
                checkRequired("transactionEventToken", transactionEventToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentSimulateReleaseResponse = apply {
        if (validated) {
            return@apply
        }

        debuggingRequestId()
        result()
        transactionEventToken()
        validated = true
    }

    /** Request Result */
    class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        /** An enum containing [Result]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Result] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /** An enum member indicating that [Result] was instantiated with an unknown value. */
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
                else -> throw LithicInvalidDataException("Unknown Result: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateReleaseResponse && debuggingRequestId == other.debuggingRequestId && result == other.result && transactionEventToken == other.transactionEventToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(debuggingRequestId, result, transactionEventToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentSimulateReleaseResponse{debuggingRequestId=$debuggingRequestId, result=$result, transactionEventToken=$transactionEventToken, additionalProperties=$additionalProperties}"
}
