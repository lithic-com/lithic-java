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

        return /* spotless:off */ other is VerificationMethod && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val MANUAL = VerificationMethod(JsonField.of("MANUAL"))

        @JvmField val MICRO_DEPOSIT = VerificationMethod(JsonField.of("MICRO_DEPOSIT"))

        @JvmField val PLAID = VerificationMethod(JsonField.of("PLAID"))

        @JvmField val PRENOTE = VerificationMethod(JsonField.of("PRENOTE"))

        @JvmField val EXTERNALLY_VERIFIED = VerificationMethod(JsonField.of("EXTERNALLY_VERIFIED"))

        @JvmStatic fun of(value: String) = VerificationMethod(JsonField.of(value))
    }

    enum class Known {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
        EXTERNALLY_VERIFIED,
    }

    enum class Value {
        MANUAL,
        MICRO_DEPOSIT,
        PLAID,
        PRENOTE,
        EXTERNALLY_VERIFIED,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            MANUAL -> Value.MANUAL
            MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
            PLAID -> Value.PLAID
            PRENOTE -> Value.PRENOTE
            EXTERNALLY_VERIFIED -> Value.EXTERNALLY_VERIFIED
            else -> Value._UNKNOWN
        }

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
}
