// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

class AccountFinancialAccountType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ISSUING = of("ISSUING")

        @JvmField val OPERATING = of("OPERATING")

        @JvmStatic fun of(value: String) = AccountFinancialAccountType(JsonField.of(value))
    }

    enum class Known {
        ISSUING,
        OPERATING,
    }

    enum class Value {
        ISSUING,
        OPERATING,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ISSUING -> Value.ISSUING
            OPERATING -> Value.OPERATING
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ISSUING -> Known.ISSUING
            OPERATING -> Known.OPERATING
            else -> throw LithicInvalidDataException("Unknown AccountFinancialAccountType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountFinancialAccountType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
