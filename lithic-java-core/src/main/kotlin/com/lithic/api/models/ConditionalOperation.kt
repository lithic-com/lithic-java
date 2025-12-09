// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** The operation to apply to the attribute */
class ConditionalOperation @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val IS_ONE_OF = of("IS_ONE_OF")

        @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

        @JvmField val MATCHES = of("MATCHES")

        @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

        @JvmField val IS_EQUAL_TO = of("IS_EQUAL_TO")

        @JvmField val IS_NOT_EQUAL_TO = of("IS_NOT_EQUAL_TO")

        @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

        @JvmField val IS_GREATER_THAN_OR_EQUAL_TO = of("IS_GREATER_THAN_OR_EQUAL_TO")

        @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

        @JvmField val IS_LESS_THAN_OR_EQUAL_TO = of("IS_LESS_THAN_OR_EQUAL_TO")

        @JvmField val IS_AFTER = of("IS_AFTER")

        @JvmField val IS_BEFORE = of("IS_BEFORE")

        @JvmField val CONTAINS_ANY = of("CONTAINS_ANY")

        @JvmField val CONTAINS_ALL = of("CONTAINS_ALL")

        @JvmField val CONTAINS_NONE = of("CONTAINS_NONE")

        @JvmStatic fun of(value: String) = ConditionalOperation(JsonField.of(value))
    }

    /** An enum containing [ConditionalOperation]'s known values. */
    enum class Known {
        IS_ONE_OF,
        IS_NOT_ONE_OF,
        MATCHES,
        DOES_NOT_MATCH,
        IS_EQUAL_TO,
        IS_NOT_EQUAL_TO,
        IS_GREATER_THAN,
        IS_GREATER_THAN_OR_EQUAL_TO,
        IS_LESS_THAN,
        IS_LESS_THAN_OR_EQUAL_TO,
        IS_AFTER,
        IS_BEFORE,
        CONTAINS_ANY,
        CONTAINS_ALL,
        CONTAINS_NONE,
    }

    /**
     * An enum containing [ConditionalOperation]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ConditionalOperation] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        IS_ONE_OF,
        IS_NOT_ONE_OF,
        MATCHES,
        DOES_NOT_MATCH,
        IS_EQUAL_TO,
        IS_NOT_EQUAL_TO,
        IS_GREATER_THAN,
        IS_GREATER_THAN_OR_EQUAL_TO,
        IS_LESS_THAN,
        IS_LESS_THAN_OR_EQUAL_TO,
        IS_AFTER,
        IS_BEFORE,
        CONTAINS_ANY,
        CONTAINS_ALL,
        CONTAINS_NONE,
        /**
         * An enum member indicating that [ConditionalOperation] was instantiated with an unknown
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
            IS_ONE_OF -> Value.IS_ONE_OF
            IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
            MATCHES -> Value.MATCHES
            DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
            IS_EQUAL_TO -> Value.IS_EQUAL_TO
            IS_NOT_EQUAL_TO -> Value.IS_NOT_EQUAL_TO
            IS_GREATER_THAN -> Value.IS_GREATER_THAN
            IS_GREATER_THAN_OR_EQUAL_TO -> Value.IS_GREATER_THAN_OR_EQUAL_TO
            IS_LESS_THAN -> Value.IS_LESS_THAN
            IS_LESS_THAN_OR_EQUAL_TO -> Value.IS_LESS_THAN_OR_EQUAL_TO
            IS_AFTER -> Value.IS_AFTER
            IS_BEFORE -> Value.IS_BEFORE
            CONTAINS_ANY -> Value.CONTAINS_ANY
            CONTAINS_ALL -> Value.CONTAINS_ALL
            CONTAINS_NONE -> Value.CONTAINS_NONE
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
            IS_ONE_OF -> Known.IS_ONE_OF
            IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
            MATCHES -> Known.MATCHES
            DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
            IS_EQUAL_TO -> Known.IS_EQUAL_TO
            IS_NOT_EQUAL_TO -> Known.IS_NOT_EQUAL_TO
            IS_GREATER_THAN -> Known.IS_GREATER_THAN
            IS_GREATER_THAN_OR_EQUAL_TO -> Known.IS_GREATER_THAN_OR_EQUAL_TO
            IS_LESS_THAN -> Known.IS_LESS_THAN
            IS_LESS_THAN_OR_EQUAL_TO -> Known.IS_LESS_THAN_OR_EQUAL_TO
            IS_AFTER -> Known.IS_AFTER
            IS_BEFORE -> Known.IS_BEFORE
            CONTAINS_ANY -> Known.CONTAINS_ANY
            CONTAINS_ALL -> Known.CONTAINS_ALL
            CONTAINS_NONE -> Known.CONTAINS_NONE
            else -> throw LithicInvalidDataException("Unknown ConditionalOperation: $value")
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

    fun validate(): ConditionalOperation = apply {
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

        return other is ConditionalOperation && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
