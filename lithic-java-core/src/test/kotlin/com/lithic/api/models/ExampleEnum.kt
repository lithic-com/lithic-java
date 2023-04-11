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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
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

class ExampleEnum @JsonCreator private constructor(private val value: JsonField<String>,) {

    @com.fasterxml.jackson.annotation.JsonValue
    fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ExampleEnum &&
          this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val CLOSED = ExampleEnum(JsonField.of("CLOSED"))

        @JvmField val OPEN = ExampleEnum(JsonField.of("OPEN"))

        @JvmField val PAUSED = ExampleEnum(JsonField.of("paused"))

        @JvmStatic fun of(value: String) = ExampleEnum(JsonField.of(value))
    }

    enum class Known {
        CLOSED,
        OPEN,
        PAUSED,
    }

    enum class Value {
        CLOSED,
        OPEN,
        PAUSED,
        _UNKNOWN,
    }

    fun value(): Value = when (this) {
        CLOSED -> Value.CLOSED
        OPEN -> Value.OPEN
        PAUSED -> Value.PAUSED
        else -> Value._UNKNOWN
    }

    fun known(): Known = when (this) {
        CLOSED -> Known.CLOSED
        OPEN -> Known.OPEN
        PAUSED -> Known.PAUSED
        else -> throw LithicInvalidDataException("Unknown ExampleEnum: $value")
    }

    fun asString(): String = _value().asStringOrThrow()
}
