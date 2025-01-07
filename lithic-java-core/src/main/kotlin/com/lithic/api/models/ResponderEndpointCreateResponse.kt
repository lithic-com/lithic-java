// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ResponderEndpointCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("enrolled")
    @ExcludeMissing
    private val enrolled: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** True if the endpoint was enrolled successfully. */
    fun enrolled(): Optional<Boolean> = Optional.ofNullable(enrolled.getNullable("enrolled"))

    /** True if the endpoint was enrolled successfully. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled(): JsonField<Boolean> = enrolled

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
                enrolled = responderEndpointCreateResponse.enrolled
                additionalProperties =
                    responderEndpointCreateResponse.additionalProperties.toMutableMap()
            }

        /** True if the endpoint was enrolled successfully. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** True if the endpoint was enrolled successfully. */
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ResponderEndpointCreateResponse =
            ResponderEndpointCreateResponse(enrolled, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointCreateResponse && enrolled == other.enrolled && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enrolled, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponderEndpointCreateResponse{enrolled=$enrolled, additionalProperties=$additionalProperties}"
}
