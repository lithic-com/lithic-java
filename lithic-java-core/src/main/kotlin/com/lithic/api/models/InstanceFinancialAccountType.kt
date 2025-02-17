// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** Type of instance financial account */
class InstanceFinancialAccountType
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ISSUING = of("ISSUING")

        @JvmField val RESERVE = of("RESERVE")

        @JvmField val OPERATING = of("OPERATING")

        @JvmStatic fun of(value: String) = InstanceFinancialAccountType(JsonField.of(value))
    }

    /** An enum containing [InstanceFinancialAccountType]'s known values. */
    enum class Known {
        ISSUING,
        RESERVE,
        OPERATING,
    }

    /**
     * An enum containing [InstanceFinancialAccountType]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [InstanceFinancialAccountType] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ISSUING,
        RESERVE,
        OPERATING,
        /**
         * An enum member indicating that [InstanceFinancialAccountType] was instantiated with an
         * unknown value.
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
            ISSUING -> Value.ISSUING
            RESERVE -> Value.RESERVE
            OPERATING -> Value.OPERATING
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
            ISSUING -> Known.ISSUING
            RESERVE -> Known.RESERVE
            OPERATING -> Known.OPERATING
            else -> throw LithicInvalidDataException("Unknown InstanceFinancialAccountType: $value")
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

        return /* spotless:off */ other is InstanceFinancialAccountType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
