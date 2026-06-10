// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * The case field that changed, or the action that was taken, in an activity entry:
 * - `STATUS` - The case status changed
 * - `TITLE` - The case title changed
 * - `ASSIGNED_TO` - The case assignee changed
 * - `RESOLUTION_OUTCOME` - The resolution outcome was set or changed
 * - `RESOLUTION_NOTES` - The resolution notes were set or changed
 * - `TAGS` - The case tags changed
 * - `PRIORITY` - The case priority changed
 * - `COMMENT` - A comment was added or edited
 * - `FILE` - A file was attached to the case
 */
class CaseActivityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val STATUS = of("STATUS")

        @JvmField val TITLE = of("TITLE")

        @JvmField val ASSIGNED_TO = of("ASSIGNED_TO")

        @JvmField val RESOLUTION_OUTCOME = of("RESOLUTION_OUTCOME")

        @JvmField val RESOLUTION_NOTES = of("RESOLUTION_NOTES")

        @JvmField val TAGS = of("TAGS")

        @JvmField val PRIORITY = of("PRIORITY")

        @JvmField val COMMENT = of("COMMENT")

        @JvmField val FILE = of("FILE")

        @JvmStatic fun of(value: String) = CaseActivityType(JsonField.of(value))
    }

    /** An enum containing [CaseActivityType]'s known values. */
    enum class Known {
        STATUS,
        TITLE,
        ASSIGNED_TO,
        RESOLUTION_OUTCOME,
        RESOLUTION_NOTES,
        TAGS,
        PRIORITY,
        COMMENT,
        FILE,
    }

    /**
     * An enum containing [CaseActivityType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CaseActivityType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        STATUS,
        TITLE,
        ASSIGNED_TO,
        RESOLUTION_OUTCOME,
        RESOLUTION_NOTES,
        TAGS,
        PRIORITY,
        COMMENT,
        FILE,
        /**
         * An enum member indicating that [CaseActivityType] was instantiated with an unknown value.
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
            STATUS -> Value.STATUS
            TITLE -> Value.TITLE
            ASSIGNED_TO -> Value.ASSIGNED_TO
            RESOLUTION_OUTCOME -> Value.RESOLUTION_OUTCOME
            RESOLUTION_NOTES -> Value.RESOLUTION_NOTES
            TAGS -> Value.TAGS
            PRIORITY -> Value.PRIORITY
            COMMENT -> Value.COMMENT
            FILE -> Value.FILE
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
            STATUS -> Known.STATUS
            TITLE -> Known.TITLE
            ASSIGNED_TO -> Known.ASSIGNED_TO
            RESOLUTION_OUTCOME -> Known.RESOLUTION_OUTCOME
            RESOLUTION_NOTES -> Known.RESOLUTION_NOTES
            TAGS -> Known.TAGS
            PRIORITY -> Known.PRIORITY
            COMMENT -> Known.COMMENT
            FILE -> Known.FILE
            else -> throw LithicInvalidDataException("Unknown CaseActivityType: $value")
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
    fun validate(): CaseActivityType = apply {
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

        return other is CaseActivityType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
