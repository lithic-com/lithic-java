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

@JsonDeserialize(builder = EnhancedCommercialDataRetrieveResponse.Builder::class)
@NoAutoDetect
class EnhancedCommercialDataRetrieveResponse
private constructor(
    private val data: JsonField<List<EnhancedData>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<EnhancedData> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EnhancedCommercialDataRetrieveResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnhancedCommercialDataRetrieveResponse &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(data, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "EnhancedCommercialDataRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<EnhancedData>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            enhancedCommercialDataRetrieveResponse: EnhancedCommercialDataRetrieveResponse
        ) = apply {
            this.data = enhancedCommercialDataRetrieveResponse.data
            additionalProperties(enhancedCommercialDataRetrieveResponse.additionalProperties)
        }

        fun data(data: List<EnhancedData>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<EnhancedData>>) = apply { this.data = data }

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

        fun build(): EnhancedCommercialDataRetrieveResponse =
            EnhancedCommercialDataRetrieveResponse(
                data.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
