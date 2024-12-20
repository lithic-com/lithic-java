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
class CardProvisionResponse
@JsonCreator
private constructor(
    @JsonProperty("provisioning_payload")
    @ExcludeMissing
    private val provisioningPayload: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun provisioningPayload(): Optional<String> =
        Optional.ofNullable(provisioningPayload.getNullable("provisioning_payload"))

    @JsonProperty("provisioning_payload")
    @ExcludeMissing
    fun _provisioningPayload() = provisioningPayload

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardProvisionResponse = apply {
        if (!validated) {
            provisioningPayload()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var provisioningPayload: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProvisionResponse: CardProvisionResponse) = apply {
            provisioningPayload = cardProvisionResponse.provisioningPayload
            additionalProperties = cardProvisionResponse.additionalProperties.toMutableMap()
        }

        fun provisioningPayload(provisioningPayload: String) =
            provisioningPayload(JsonField.of(provisioningPayload))

        fun provisioningPayload(provisioningPayload: JsonField<String>) = apply {
            this.provisioningPayload = provisioningPayload
        }

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

        fun build(): CardProvisionResponse =
            CardProvisionResponse(provisioningPayload, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProvisionResponse && provisioningPayload == other.provisioningPayload && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(provisioningPayload, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardProvisionResponse{provisioningPayload=$provisioningPayload, additionalProperties=$additionalProperties}"
}
