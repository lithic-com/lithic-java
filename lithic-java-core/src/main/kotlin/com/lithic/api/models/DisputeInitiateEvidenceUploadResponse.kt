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

/** URL to upload document image to. The URL will expire in 5 minutes. */
@JsonDeserialize(builder = DisputeInitiateEvidenceUploadResponse.Builder::class)
@NoAutoDetect
class DisputeInitiateEvidenceUploadResponse
private constructor(
    private val uploadUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun uploadUrl(): Optional<String> = Optional.ofNullable(uploadUrl.getNullable("upload_url"))

    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl() = uploadUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            uploadUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeInitiateEvidenceUploadResponse &&
            this.uploadUrl == other.uploadUrl &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(uploadUrl, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "DisputeInitiateEvidenceUploadResponse{uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var uploadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            disputeInitiateEvidenceUploadResponse: DisputeInitiateEvidenceUploadResponse
        ) = apply {
            this.uploadUrl = disputeInitiateEvidenceUploadResponse.uploadUrl
            additionalProperties(disputeInitiateEvidenceUploadResponse.additionalProperties)
        }

        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        @JsonProperty("upload_url")
        @ExcludeMissing
        fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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

        fun build(): DisputeInitiateEvidenceUploadResponse =
            DisputeInitiateEvidenceUploadResponse(uploadUrl, additionalProperties.toUnmodifiable())
    }
}
