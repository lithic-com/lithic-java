// File generated from our OpenAPI spec by Stainless.

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

@JsonDeserialize(builder = ResponderEndpointCreateResponse.Builder::class)
@NoAutoDetect
class ResponderEndpointCreateResponse
private constructor(
    private val enrolled: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** True if the endpoint was enrolled successfully. */
    fun enrolled(): Optional<Boolean> = Optional.ofNullable(enrolled.getNullable("enrolled"))

    /** True if the endpoint was enrolled successfully. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled() = enrolled

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ResponderEndpointCreateResponse = apply {
        if (!validated) {
            enrolled()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointCreateResponse: ResponderEndpointCreateResponse) =
            apply {
                this.enrolled = responderEndpointCreateResponse.enrolled
                additionalProperties(responderEndpointCreateResponse.additionalProperties)
            }

        /** True if the endpoint was enrolled successfully. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** True if the endpoint was enrolled successfully. */
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

        fun build(): ResponderEndpointCreateResponse =
            ResponderEndpointCreateResponse(enrolled, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointCreateResponse && this.enrolled == other.enrolled && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(enrolled, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ResponderEndpointCreateResponse{enrolled=$enrolled, additionalProperties=$additionalProperties}"
}
