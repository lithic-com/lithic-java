// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class OwnerType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnerType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val INDIVIDUAL = OwnerType(JsonField.of("INDIVIDUAL"))

        @JvmField val BUSINESS = OwnerType(JsonField.of("BUSINESS"))

        @JvmStatic fun of(value: String) = OwnerType(JsonField.of(value))
    }

    enum class Known {
        INDIVIDUAL,
        BUSINESS,
    }

    enum class Value {
        INDIVIDUAL,
        BUSINESS,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            INDIVIDUAL -> Value.INDIVIDUAL
            BUSINESS -> Value.BUSINESS
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            INDIVIDUAL -> Known.INDIVIDUAL
            BUSINESS -> Known.BUSINESS
            else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
