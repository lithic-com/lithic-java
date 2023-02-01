package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Objects
import java.util.Optional
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException

class SpendLimitDuration @JsonCreator private constructor(private val value: JsonField<String>,) {

    @com.fasterxml.jackson.annotation.JsonValue
    fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SpendLimitDuration &&
          value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ANNUALLY = SpendLimitDuration(JsonField.of("ANNUALLY"))

        @JvmField val FOREVER = SpendLimitDuration(JsonField.of("FOREVER"))

        @JvmField val MONTHLY = SpendLimitDuration(JsonField.of("MONTHLY"))

        @JvmField val TRANSACTION = SpendLimitDuration(JsonField.of("TRANSACTION"))

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

    fun value(): Value = when (this) {
        ANNUALLY -> Value.ANNUALLY
        FOREVER -> Value.FOREVER
        MONTHLY -> Value.MONTHLY
        TRANSACTION -> Value.TRANSACTION
        else -> Value._UNKNOWN
    }

    fun known(): Known = when (this) {
        ANNUALLY -> Known.ANNUALLY
        FOREVER -> Known.FOREVER
        MONTHLY -> Known.MONTHLY
        TRANSACTION -> Known.TRANSACTION
        else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
    }

    fun asString(): String = _value().asStringOrThrow()
}
