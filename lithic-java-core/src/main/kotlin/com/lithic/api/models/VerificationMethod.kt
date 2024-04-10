// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class VerificationMethod
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationMethod && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val MANUAL = VerificationMethod(JsonField.of("MANUAL"))

        @JvmField val MICRO_DEPOSIT = VerificationMethod(JsonField.of("MICRO_DEPOSIT"))

        @JvmField val PLAID = VerificationMethod(JsonField.of("PLAID"))

        @JvmField val PRENOTE = VerificationMethod(JsonField.of("PRENOTE"))

        @JvmStatic fun of(value: String) = VerificationMethod(JsonField.of(value))
    }

    enum class Known {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
    }

    enum class Value {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            MANUAL -> Value.MANUAL
            MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
            PLAID -> Value.PLAID
            PRENOTE -> Value.PRENOTE
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            MANUAL -> Known.MANUAL
            MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
            PLAID -> Known.PLAID
            PRENOTE -> Known.PRENOTE
            else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
