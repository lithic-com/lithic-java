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

        @JvmField val BUSINESS = OwnerType(JsonField.of("BUSINESS"))

        @JvmField val INDIVIDUAL = OwnerType(JsonField.of("INDIVIDUAL"))

        @JvmStatic fun of(value: String) = OwnerType(JsonField.of(value))
    }

    enum class Known {
        BUSINESS,
        INDIVIDUAL,
    }

    enum class Value {
        BUSINESS,
        INDIVIDUAL,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            BUSINESS -> Value.BUSINESS
            INDIVIDUAL -> Value.INDIVIDUAL
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            BUSINESS -> Known.BUSINESS
            INDIVIDUAL -> Known.INDIVIDUAL
            else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
