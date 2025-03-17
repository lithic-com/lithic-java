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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Carrier
@JsonCreator
private constructor(
    @JsonProperty("qr_code_url")
    @ExcludeMissing
    private val qrCodeUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * QR code url to display on the card carrier
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun qrCodeUrl(): Optional<String> = Optional.ofNullable(qrCodeUrl.getNullable("qr_code_url"))

    /**
     * Returns the raw JSON value of [qrCodeUrl].
     *
     * Unlike [qrCodeUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qr_code_url") @ExcludeMissing fun _qrCodeUrl(): JsonField<String> = qrCodeUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Carrier = apply {
        if (validated) {
            return@apply
        }

        qrCodeUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Carrier]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Carrier]. */
    class Builder internal constructor() {

        private var qrCodeUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(carrier: Carrier) = apply {
            qrCodeUrl = carrier.qrCodeUrl
            additionalProperties = carrier.additionalProperties.toMutableMap()
        }

        /** QR code url to display on the card carrier */
        fun qrCodeUrl(qrCodeUrl: String) = qrCodeUrl(JsonField.of(qrCodeUrl))

        /**
         * Sets [Builder.qrCodeUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qrCodeUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun qrCodeUrl(qrCodeUrl: JsonField<String>) = apply { this.qrCodeUrl = qrCodeUrl }

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

        /**
         * Returns an immutable instance of [Carrier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Carrier = Carrier(qrCodeUrl, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Carrier && qrCodeUrl == other.qrCodeUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(qrCodeUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Carrier{qrCodeUrl=$qrCodeUrl, additionalProperties=$additionalProperties}"
}
