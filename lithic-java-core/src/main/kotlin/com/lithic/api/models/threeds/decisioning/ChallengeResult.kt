// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.threeds.decisioning

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** Whether the Cardholder has Approved or Declined the issued Challenge */
class ChallengeResult @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val APPROVE = of("APPROVE")

        @JvmField val DECLINE_BY_CUSTOMER = of("DECLINE_BY_CUSTOMER")

        @JvmStatic fun of(value: String) = ChallengeResult(JsonField.of(value))
    }

    /** An enum containing [ChallengeResult]'s known values. */
    enum class Known {
        APPROVE,
        DECLINE_BY_CUSTOMER,
    }

    /**
     * An enum containing [ChallengeResult]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ChallengeResult] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        APPROVE,
        DECLINE_BY_CUSTOMER,
        /**
         * An enum member indicating that [ChallengeResult] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            APPROVE -> Value.APPROVE
            DECLINE_BY_CUSTOMER -> Value.DECLINE_BY_CUSTOMER
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LithicInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            APPROVE -> Known.APPROVE
            DECLINE_BY_CUSTOMER -> Known.DECLINE_BY_CUSTOMER
            else -> throw LithicInvalidDataException("Unknown ChallengeResult: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LithicInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChallengeResult && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
