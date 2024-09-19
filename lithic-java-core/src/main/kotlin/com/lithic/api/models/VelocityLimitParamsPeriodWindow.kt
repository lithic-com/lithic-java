// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class VelocityLimitParamsPeriodWindow
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VelocityLimitParamsPeriodWindow && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val DAY = VelocityLimitParamsPeriodWindow(JsonField.of("DAY"))

        @JvmField val MONTH = VelocityLimitParamsPeriodWindow(JsonField.of("MONTH"))

        @JvmStatic fun of(value: String) = VelocityLimitParamsPeriodWindow(JsonField.of(value))
    }

    enum class Known {
        DAY,
        MONTH,
    }

    enum class Value {
        DAY,
        MONTH,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            DAY -> Value.DAY
            MONTH -> Value.MONTH
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            DAY -> Known.DAY
            MONTH -> Known.MONTH
            else ->
                throw LithicInvalidDataException("Unknown VelocityLimitParamsPeriodWindow: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
