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

@JsonDeserialize(using = ExampleOneOf.Deserializer::class)
@JsonSerialize(using = ExampleOneOf.Serializer::class)
class ExampleOneOf private constructor(private val cat: Cat? = null,private val dog: Dog? = null,private val cats: List<Cat>? = null,private val petName: String? = null,private val _json: JsonValue? = null,) {

    private var validated: Boolean = false

    fun cat(): Optional<Cat> = Optional.ofNullable(cat)
    fun dog(): Optional<Dog> = Optional.ofNullable(dog)
    fun cats(): Optional<List<Cat>> = Optional.ofNullable(cats)
    fun petName(): Optional<String> = Optional.ofNullable(petName)

    fun isCat(): Boolean = cat != null
    fun isDog(): Boolean = dog != null
    fun isCats(): Boolean = cats != null
    fun isPetName(): Boolean = petName != null

    fun asCat(): Cat = cat.getOrThrow("cat")
    fun asDog(): Dog = dog.getOrThrow("dog")
    fun asCats(): List<Cat> = cats.getOrThrow("cats")
    fun asPetName(): String = petName.getOrThrow("petName")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
      return when {
          cat != null -> visitor.visitCat(cat)
          dog != null -> visitor.visitDog(dog)
          cats != null -> visitor.visitCats(cats)
          petName != null -> visitor.visitPetName(petName)
          else -> visitor.unknown(_json)
      }
    }

    fun validate() = apply {
        if (!validated) {
          if (cat == null && dog == null && cats == null && petName == null) {
            throw LithicInvalidDataException("Unknown ExampleOneOf: $_json")
          }
          cat?.validate()
          dog?.validate()
          cats?.forEach { it.validate() }
          validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ExampleOneOf &&
          this.cat == other.cat &&
          this.dog == other.dog &&
          this.cats == other.cats &&
          this.petName == other.petName
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cat,
          dog,
          cats,
          petName,
      )
    }

    override fun toString(): String {
      return when {
          cat != null -> "ExampleOneOf{cat=$cat}"
          dog != null -> "ExampleOneOf{dog=$dog}"
          cats != null -> "ExampleOneOf{cats=$cats}"
          petName != null -> "ExampleOneOf{petName=$petName}"
          _json != null -> "ExampleOneOf{_unknown=$_json}"
          else -> throw IllegalStateException("Invalid ExampleOneOf")
      }
    }

    companion object {

        @JvmStatic
        fun ofCat(cat: Cat) = ExampleOneOf(cat = cat)

        @JvmStatic
        fun ofDog(dog: Dog) = ExampleOneOf(dog = dog)

        @JvmStatic
        fun ofCats(cats: List<Cat>) = ExampleOneOf(cats = cats)

        @JvmStatic
        fun ofPetName(petName: String) = ExampleOneOf(petName = petName)
    }

    interface Visitor<out T> {

        fun visitCat(cat: Cat): T

        fun visitDog(dog: Dog): T

        fun visitCats(cats: List<@JvmSuppressWildcards Cat>): T

        fun visitPetName(petName: String): T

        fun unknown(json: JsonValue?): T {
          throw LithicInvalidDataException("Unknown ExampleOneOf: $json")
        }
    }

    class Deserializer : BaseDeserializer<ExampleOneOf>(ExampleOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExampleOneOf {
          val json = JsonValue.fromJsonNode(node)
          tryDeserialize(node, jacksonTypeRef<Cat>()){ it.validate() }?.let {
              return ExampleOneOf(cat = it, _json = json)
          }
          tryDeserialize(node, jacksonTypeRef<Dog>()){ it.validate() }?.let {
              return ExampleOneOf(dog = it, _json = json)
          }
          tryDeserialize(node, jacksonTypeRef<List<Cat>>()){ it.forEach { it.validate() } }?.let {
              return ExampleOneOf(cats = it, _json = json)
          }
          tryDeserialize(node, jacksonTypeRef<String>())?.let {
              return ExampleOneOf(petName = it, _json = json)
          }

          return ExampleOneOf(_json = json)
        }
    }

    class Serializer : BaseSerializer<ExampleOneOf>(ExampleOneOf::class) {

        override fun serialize(value: ExampleOneOf, generator: JsonGenerator, provider: SerializerProvider) {
          when {
              value.cat != null -> generator.writeObject(value.cat)
              value.dog != null -> generator.writeObject(value.dog)
              value.cats != null -> generator.writeObject(value.cats)
              value.petName != null -> generator.writeObject(value.petName)
              value._json != null -> generator.writeObject(value._json)
              else -> throw IllegalStateException("Invalid ExampleOneOf")
          }
        }
    }

    @JsonDeserialize(builder = Cat.Builder::class)
    @NoAutoDetect
    class Cat private constructor(private val name: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun name(): String = name.getRequired("name")

        @JsonProperty("name")
        @ExcludeMissing
        fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              name()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Cat &&
              this.name == other.name &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(name, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Cat{name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cat: Cat) = apply {
                this.name = cat.name
                additionalProperties(cat.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply {
                this.name = name
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Cat = Cat(name, additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = Dog.Builder::class)
    @NoAutoDetect
    class Dog private constructor(private val breed: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun breed(): String = breed.getRequired("breed")

        @JsonProperty("breed")
        @ExcludeMissing
        fun _breed() = breed

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              breed()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Dog &&
              this.breed == other.breed &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(breed, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Dog{breed=$breed, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var breed: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dog: Dog) = apply {
                this.breed = dog.breed
                additionalProperties(dog.additionalProperties)
            }

            fun breed(breed: String) = breed(JsonField.of(breed))

            @JsonProperty("breed")
            @ExcludeMissing
            fun breed(breed: JsonField<String>) = apply {
                this.breed = breed
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Dog = Dog(breed, additionalProperties.toUnmodifiable())
        }
    }
}
