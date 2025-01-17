// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * Spend limit duration values:
 * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
 * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the card.
 * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month. To
 *   support recurring monthly payments, which can occur on different day every month, the time
 *   window we consider for monthly velocity starts 6 days after the current calendar date one month
 *   prior.
 * - `TRANSACTION` - Card will authorize multiple transactions if each individual transaction is
 *   under the spend limit.
 */
class SpendLimitDuration
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ANNUALLY = of("ANNUALLY")

        @JvmField val FOREVER = of("FOREVER")

        @JvmField val MONTHLY = of("MONTHLY")

        @JvmField val TRANSACTION = of("TRANSACTION")

        @JvmStatic fun of(value: String) = SpendLimitDuration(JsonField.of(value))
    }

    enum class Known {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
    }

    enum class Value {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ANNUALLY -> Value.ANNUALLY
            FOREVER -> Value.FOREVER
            MONTHLY -> Value.MONTHLY
            TRANSACTION -> Value.TRANSACTION
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ANNUALLY -> Known.ANNUALLY
            FOREVER -> Known.FOREVER
            MONTHLY -> Known.MONTHLY
            TRANSACTION -> Known.TRANSACTION
            else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpendLimitDuration && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
