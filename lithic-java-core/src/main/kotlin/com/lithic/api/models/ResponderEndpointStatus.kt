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

@JsonDeserialize(builder = ResponderEndpointStatus.Builder::class)
@NoAutoDetect
class ResponderEndpointStatus
private constructor(
    private val enrolled: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** True if the instance has an endpoint enrolled. */
    fun enrolled(): Optional<Boolean> = Optional.ofNullable(enrolled.getNullable("enrolled"))

    /** The URL of the currently enrolled endpoint or null. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** True if the instance has an endpoint enrolled. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled() = enrolled

    /** The URL of the currently enrolled endpoint or null. */
    @JsonProperty("url") @ExcludeMissing fun _url() = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ResponderEndpointStatus = apply {
        if (!validated) {
            enrolled()
            url()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponderEndpointStatus &&
            this.enrolled == other.enrolled &&
            this.url == other.url &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    enrolled,
                    url,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ResponderEndpointStatus{enrolled=$enrolled, url=$url, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointStatus: ResponderEndpointStatus) = apply {
            this.enrolled = responderEndpointStatus.enrolled
            this.url = responderEndpointStatus.url
            additionalProperties(responderEndpointStatus.additionalProperties)
        }

        /** True if the instance has an endpoint enrolled. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** True if the instance has an endpoint enrolled. */
        @JsonProperty("enrolled")
        @ExcludeMissing
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

        /** The URL of the currently enrolled endpoint or null. */
        fun url(url: String) = url(JsonField.of(url))

        /** The URL of the currently enrolled endpoint or null. */
        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): ResponderEndpointStatus =
            ResponderEndpointStatus(
                enrolled,
                url,
                additionalProperties.toUnmodifiable(),
            )
    }
}
