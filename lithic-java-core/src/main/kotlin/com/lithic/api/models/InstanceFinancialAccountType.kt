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

        @JvmField val CHARGED_OFF_FEES = of("CHARGED_OFF_FEES")

        @JvmField val CHARGED_OFF_INTEREST = of("CHARGED_OFF_INTEREST")

        @JvmField val CHARGED_OFF_PRINCIPAL = of("CHARGED_OFF_PRINCIPAL")

        @JvmStatic fun of(value: String) = InstanceFinancialAccountType(JsonField.of(value))
    }

    /** An enum containing [InstanceFinancialAccountType]'s known values. */
    enum class Known {
        ISSUING,
        RESERVE,
        OPERATING,
        CHARGED_OFF_FEES,
        CHARGED_OFF_INTEREST,
        CHARGED_OFF_PRINCIPAL,
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
        CHARGED_OFF_FEES,
        CHARGED_OFF_INTEREST,
        CHARGED_OFF_PRINCIPAL,
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
            CHARGED_OFF_FEES -> Value.CHARGED_OFF_FEES
            CHARGED_OFF_INTEREST -> Value.CHARGED_OFF_INTEREST
            CHARGED_OFF_PRINCIPAL -> Value.CHARGED_OFF_PRINCIPAL
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
            CHARGED_OFF_FEES -> Known.CHARGED_OFF_FEES
            CHARGED_OFF_INTEREST -> Known.CHARGED_OFF_INTEREST
            CHARGED_OFF_PRINCIPAL -> Known.CHARGED_OFF_PRINCIPAL
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

    private var validated: Boolean = false

    fun validate(): InstanceFinancialAccountType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InstanceFinancialAccountType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
