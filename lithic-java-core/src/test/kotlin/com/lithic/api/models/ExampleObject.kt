package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ExampleObject.Builder::class)
@NoAutoDetect
class ExampleObject
private constructor(
    private val stringField: JsonField<String>,
    private val numberField: JsonField<Double>,
    private val integerField: JsonField<Long>,
    private val requiredField: JsonField<String>,
    private val nestedObject: JsonField<NestedObject>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun stringField(): Optional<String> =
        Optional.ofNullable(stringField.getNullable("string_field"))

    fun numberField(): Optional<Double> =
        Optional.ofNullable(numberField.getNullable("number_field"))

    fun integerField(): Optional<Long> =
        Optional.ofNullable(integerField.getNullable("integer_field"))

    fun requiredField(): String = requiredField.getRequired("required_field")

    fun nestedObject(): Optional<NestedObject> =
        Optional.ofNullable(nestedObject.getNullable("nested_object"))

    @JsonProperty("string_field") @ExcludeMissing fun _stringField() = stringField

    @JsonProperty("number_field") @ExcludeMissing fun _numberField() = numberField

    @JsonProperty("integer_field") @ExcludeMissing fun _integerField() = integerField

    @JsonProperty("required_field") @ExcludeMissing fun _requiredField() = requiredField

    @JsonProperty("nested_object") @ExcludeMissing fun _nestedObject() = nestedObject

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExampleObject = apply {
        if (!validated) {
            stringField()
            numberField()
            integerField()
            requiredField()
            nestedObject().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleObject &&
            this.stringField == other.stringField &&
            this.numberField == other.numberField &&
            this.integerField == other.integerField &&
            this.requiredField == other.requiredField &&
            this.nestedObject == other.nestedObject &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    stringField,
                    numberField,
                    integerField,
                    requiredField,
                    nestedObject,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ExampleObject{stringField=$stringField, numberField=$numberField, integerField=$integerField, requiredField=$requiredField, nestedObject=$nestedObject, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var stringField: JsonField<String> = JsonMissing.of()
        private var numberField: JsonField<Double> = JsonMissing.of()
        private var integerField: JsonField<Long> = JsonMissing.of()
        private var requiredField: JsonField<String> = JsonMissing.of()
        private var nestedObject: JsonField<NestedObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleObject: ExampleObject) = apply {
            this.stringField = exampleObject.stringField
            this.numberField = exampleObject.numberField
            this.integerField = exampleObject.integerField
            this.requiredField = exampleObject.requiredField
            this.nestedObject = exampleObject.nestedObject
            additionalProperties(exampleObject.additionalProperties)
        }

        fun stringField(stringField: String) = stringField(JsonField.of(stringField))

        @JsonProperty("string_field")
        @ExcludeMissing
        fun stringField(stringField: JsonField<String>) = apply { this.stringField = stringField }

        fun numberField(numberField: Double) = numberField(JsonField.of(numberField))

        @JsonProperty("number_field")
        @ExcludeMissing
        fun numberField(numberField: JsonField<Double>) = apply { this.numberField = numberField }

        fun integerField(integerField: Long) = integerField(JsonField.of(integerField))

        @JsonProperty("integer_field")
        @ExcludeMissing
        fun integerField(integerField: JsonField<Long>) = apply { this.integerField = integerField }

        fun requiredField(requiredField: String) = requiredField(JsonField.of(requiredField))

        @JsonProperty("required_field")
        @ExcludeMissing
        fun requiredField(requiredField: JsonField<String>) = apply {
            this.requiredField = requiredField
        }

        fun nestedObject(nestedObject: NestedObject) = nestedObject(JsonField.of(nestedObject))

        @JsonProperty("nested_object")
        @ExcludeMissing
        fun nestedObject(nestedObject: JsonField<NestedObject>) = apply {
            this.nestedObject = nestedObject
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

        fun build(): ExampleObject =
            ExampleObject(
                stringField,
                numberField,
                integerField,
                requiredField,
                nestedObject,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = NestedObject.Builder::class)
    @NoAutoDetect
    class NestedObject
    private constructor(
        private val a: JsonField<String>,
        private val b: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun a(): Optional<String> = Optional.ofNullable(a.getNullable("a"))

        fun b(): Optional<String> = Optional.ofNullable(b.getNullable("b"))

        @JsonProperty("a") @ExcludeMissing fun _a() = a

        @JsonProperty("b") @ExcludeMissing fun _b() = b

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NestedObject = apply {
            if (!validated) {
                a()
                b()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NestedObject &&
                this.a == other.a &&
                this.b == other.b &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        a,
                        b,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NestedObject{a=$a, b=$b, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var a: JsonField<String> = JsonMissing.of()
            private var b: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(nestedObject: NestedObject) = apply {
                this.a = nestedObject.a
                this.b = nestedObject.b
                additionalProperties(nestedObject.additionalProperties)
            }

            fun a(a: String) = a(JsonField.of(a))

            @JsonProperty("a") @ExcludeMissing fun a(a: JsonField<String>) = apply { this.a = a }

            fun b(b: String) = b(JsonField.of(b))

            @JsonProperty("b") @ExcludeMissing fun b(b: JsonField<String>) = apply { this.b = b }

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

            fun build(): NestedObject =
                NestedObject(
                    a,
                    b,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
