// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

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
