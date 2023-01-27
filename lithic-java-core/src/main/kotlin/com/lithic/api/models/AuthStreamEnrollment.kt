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

@JsonDeserialize(builder = AuthStreamEnrollment.Builder::class)
@NoAutoDetect
class AuthStreamEnrollment
private constructor(
    private val enrolled: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Whether ASA is enrolled. */
    fun enrolled(): Optional<Boolean> = Optional.ofNullable(enrolled.getNullable("enrolled"))

    /** Whether ASA is enrolled. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled() = enrolled

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            enrolled()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthStreamEnrollment &&
            enrolled == other.enrolled &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(enrolled, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AuthStreamEnrollment{enrolled=$enrolled, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authStreamEnrollment: AuthStreamEnrollment) = apply {
            this.enrolled = authStreamEnrollment.enrolled
            additionalProperties(authStreamEnrollment.additionalProperties)
        }

        /** Whether ASA is enrolled. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** Whether ASA is enrolled. */
        @JsonProperty("enrolled")
        @ExcludeMissing
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

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

        fun build(): AuthStreamEnrollment =
            AuthStreamEnrollment(enrolled, additionalProperties.toUnmodifiable())
    }
}
