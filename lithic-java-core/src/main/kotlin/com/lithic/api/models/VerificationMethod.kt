// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

class VerificationMethod
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MANUAL = of("MANUAL")

        @JvmField val MICRO_DEPOSIT = of("MICRO_DEPOSIT")

        @JvmField val PLAID = of("PLAID")

        @JvmField val PRENOTE = of("PRENOTE")

        @JvmField val EXTERNALLY_VERIFIED = of("EXTERNALLY_VERIFIED")

        @JvmStatic fun of(value: String) = VerificationMethod(JsonField.of(value))
    }

    /** An enum containing [VerificationMethod]'s known values. */
    enum class Known {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
        EXTERNALLY_VERIFIED,
    }

    /**
     * An enum containing [VerificationMethod]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [VerificationMethod] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
        EXTERNALLY_VERIFIED,
        /**
         * An enum member indicating that [VerificationMethod] was instantiated with an unknown
         * value.
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
            MANUAL -> Value.MANUAL
            MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
            PLAID -> Value.PLAID
            PRENOTE -> Value.PRENOTE
            EXTERNALLY_VERIFIED -> Value.EXTERNALLY_VERIFIED
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
            MANUAL -> Known.MANUAL
            MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
            PLAID -> Known.PLAID
            PRENOTE -> Known.PRENOTE
            EXTERNALLY_VERIFIED -> Known.EXTERNALLY_VERIFIED
            else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VerificationMethod && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
