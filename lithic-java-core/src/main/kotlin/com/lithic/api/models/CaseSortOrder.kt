// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * Sort order for listing cases. Defaults to `CREATED_DESC` (newest first):
 * - `CREATED_ASC` - Oldest first
 * - `CREATED_DESC` - Newest first
 * - `PRIORITY_DESC` - Highest priority first
 * - `PRIORITY_ASC` - Lowest priority first
 * - `STATUS_DESC` - Furthest workflow stage first
 * - `STATUS_ASC` - Earliest workflow stage first
 */
class CaseSortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val CREATED_ASC = of("CREATED_ASC")

        @JvmField val CREATED_DESC = of("CREATED_DESC")

        @JvmField val PRIORITY_DESC = of("PRIORITY_DESC")

        @JvmField val PRIORITY_ASC = of("PRIORITY_ASC")

        @JvmField val STATUS_DESC = of("STATUS_DESC")

        @JvmField val STATUS_ASC = of("STATUS_ASC")

        @JvmStatic fun of(value: String) = CaseSortOrder(JsonField.of(value))
    }

    /** An enum containing [CaseSortOrder]'s known values. */
    enum class Known {
        CREATED_ASC,
        CREATED_DESC,
        PRIORITY_DESC,
        PRIORITY_ASC,
        STATUS_DESC,
        STATUS_ASC,
    }

    /**
     * An enum containing [CaseSortOrder]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CaseSortOrder] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CREATED_ASC,
        CREATED_DESC,
        PRIORITY_DESC,
        PRIORITY_ASC,
        STATUS_DESC,
        STATUS_ASC,
        /**
         * An enum member indicating that [CaseSortOrder] was instantiated with an unknown value.
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
            CREATED_ASC -> Value.CREATED_ASC
            CREATED_DESC -> Value.CREATED_DESC
            PRIORITY_DESC -> Value.PRIORITY_DESC
            PRIORITY_ASC -> Value.PRIORITY_ASC
            STATUS_DESC -> Value.STATUS_DESC
            STATUS_ASC -> Value.STATUS_ASC
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
            CREATED_ASC -> Known.CREATED_ASC
            CREATED_DESC -> Known.CREATED_DESC
            PRIORITY_DESC -> Known.PRIORITY_DESC
            PRIORITY_ASC -> Known.PRIORITY_ASC
            STATUS_DESC -> Known.STATUS_DESC
            STATUS_ASC -> Known.STATUS_ASC
            else -> throw LithicInvalidDataException("Unknown CaseSortOrder: $value")
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CaseSortOrder = apply {
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

        return other is CaseSortOrder && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
