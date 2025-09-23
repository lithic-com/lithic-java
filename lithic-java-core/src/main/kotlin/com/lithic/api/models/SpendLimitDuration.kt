// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * Spend limit duration values:
 * * `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
 * * `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
 * * `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month. To
 *   support recurring monthly payments, which can occur on different day every month, the time
 *   window we consider for monthly velocity starts 6 days after the current calendar date one month
 *   prior.
 * * `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
 *   under the spend limit.
 */
class SpendLimitDuration @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val ANNUALLY = of("ANNUALLY")

        @JvmField val FOREVER = of("FOREVER")

        @JvmField val MONTHLY = of("MONTHLY")

        @JvmField val TRANSACTION = of("TRANSACTION")

        @JvmStatic fun of(value: String) = SpendLimitDuration(JsonField.of(value))
    }

    /** An enum containing [SpendLimitDuration]'s known values. */
    enum class Known {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
    }

    /**
     * An enum containing [SpendLimitDuration]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SpendLimitDuration] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
        /**
         * An enum member indicating that [SpendLimitDuration] was instantiated with an unknown
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
            ANNUALLY -> Value.ANNUALLY
            FOREVER -> Value.FOREVER
            MONTHLY -> Value.MONTHLY
            TRANSACTION -> Value.TRANSACTION
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
            ANNUALLY -> Known.ANNUALLY
            FOREVER -> Known.FOREVER
            MONTHLY -> Known.MONTHLY
            TRANSACTION -> Known.TRANSACTION
            else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
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

    fun validate(): SpendLimitDuration = apply {
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

        return other is SpendLimitDuration && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
