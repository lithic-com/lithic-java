// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** Whether the Cardholder has Approved or Declined the issued Challenge */
class ChallengeResult
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val APPROVE = of("APPROVE")

        @JvmField val DECLINE_BY_CUSTOMER = of("DECLINE_BY_CUSTOMER")

        @JvmStatic fun of(value: String) = ChallengeResult(JsonField.of(value))
    }

    enum class Known {
        APPROVE,
        DECLINE_BY_CUSTOMER,
    }

    enum class Value {
        APPROVE,
        DECLINE_BY_CUSTOMER,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            APPROVE -> Value.APPROVE
            DECLINE_BY_CUSTOMER -> Value.DECLINE_BY_CUSTOMER
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            APPROVE -> Known.APPROVE
            DECLINE_BY_CUSTOMER -> Known.DECLINE_BY_CUSTOMER
            else -> throw LithicInvalidDataException("Unknown ChallengeResult: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChallengeResult && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
