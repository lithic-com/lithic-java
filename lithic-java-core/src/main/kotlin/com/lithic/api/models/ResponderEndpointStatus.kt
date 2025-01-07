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
class ResponderEndpointStatus
@JsonCreator
private constructor(
    @JsonProperty("enrolled")
    @ExcludeMissing
    private val enrolled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** True if the instance has an endpoint enrolled. */
    fun enrolled(): Optional<Boolean> = Optional.ofNullable(enrolled.getNullable("enrolled"))

    /** The URL of the currently enrolled endpoint or null. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** True if the instance has an endpoint enrolled. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled(): JsonField<Boolean> = enrolled

    /** The URL of the currently enrolled endpoint or null. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ResponderEndpointStatus = apply {
        if (!validated) {
            enrolled()
            url()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointStatus: ResponderEndpointStatus) = apply {
            enrolled = responderEndpointStatus.enrolled
            url = responderEndpointStatus.url
            additionalProperties = responderEndpointStatus.additionalProperties.toMutableMap()
        }

        /** True if the instance has an endpoint enrolled. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** True if the instance has an endpoint enrolled. */
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

        /** The URL of the currently enrolled endpoint or null. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The URL of the currently enrolled endpoint or null. */
        fun url(url: Optional<String>) = url(url.orElse(null))

        /** The URL of the currently enrolled endpoint or null. */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): ResponderEndpointStatus =
            ResponderEndpointStatus(
                enrolled,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointStatus && enrolled == other.enrolled && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enrolled, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponderEndpointStatus{enrolled=$enrolled, url=$url, additionalProperties=$additionalProperties}"
}
