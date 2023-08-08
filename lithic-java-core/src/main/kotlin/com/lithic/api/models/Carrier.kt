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

@JsonDeserialize(builder = Carrier.Builder::class)
@NoAutoDetect
class Carrier
private constructor(
    private val qrCodeUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** QR code url to display on the card carrier */
    fun qrCodeUrl(): Optional<String> = Optional.ofNullable(qrCodeUrl.getNullable("qr_code_url"))

    /** QR code url to display on the card carrier */
    @JsonProperty("qr_code_url") @ExcludeMissing fun _qrCodeUrl() = qrCodeUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Carrier = apply {
        if (!validated) {
            qrCodeUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Carrier &&
            this.qrCodeUrl == other.qrCodeUrl &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(qrCodeUrl, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "Carrier{qrCodeUrl=$qrCodeUrl, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var qrCodeUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(carrier: Carrier) = apply {
            this.qrCodeUrl = carrier.qrCodeUrl
            additionalProperties(carrier.additionalProperties)
        }

        /** QR code url to display on the card carrier */
        fun qrCodeUrl(qrCodeUrl: String) = qrCodeUrl(JsonField.of(qrCodeUrl))

        /** QR code url to display on the card carrier */
        @JsonProperty("qr_code_url")
        @ExcludeMissing
        fun qrCodeUrl(qrCodeUrl: JsonField<String>) = apply { this.qrCodeUrl = qrCodeUrl }

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

        fun build(): Carrier = Carrier(qrCodeUrl, additionalProperties.toUnmodifiable())
    }
}
