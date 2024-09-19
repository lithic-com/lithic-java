// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class InstanceFinancialAccountType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceFinancialAccountType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ISSUING = InstanceFinancialAccountType(JsonField.of("ISSUING"))

        @JvmField val RESERVE = InstanceFinancialAccountType(JsonField.of("RESERVE"))

        @JvmField val OPERATING = InstanceFinancialAccountType(JsonField.of("OPERATING"))

        @JvmStatic fun of(value: String) = InstanceFinancialAccountType(JsonField.of(value))
    }

    enum class Known {
        ISSUING,
        RESERVE,
        OPERATING,
    }

    enum class Value {
        ISSUING,
        RESERVE,
        OPERATING,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ISSUING -> Value.ISSUING
            RESERVE -> Value.RESERVE
            OPERATING -> Value.OPERATING
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ISSUING -> Known.ISSUING
            RESERVE -> Known.RESERVE
            OPERATING -> Known.OPERATING
            else -> throw LithicInvalidDataException("Unknown InstanceFinancialAccountType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
