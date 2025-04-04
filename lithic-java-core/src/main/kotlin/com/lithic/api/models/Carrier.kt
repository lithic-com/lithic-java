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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class Carrier
private constructor(
    private val qrCodeUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("qr_code_url") @ExcludeMissing qrCodeUrl: JsonField<String> = JsonMissing.of()
    ) : this(qrCodeUrl, mutableMapOf())

    /**
     * QR code url to display on the card carrier
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun qrCodeUrl(): Optional<String> = qrCodeUrl.getOptional("qr_code_url")

    /**
     * Returns the raw JSON value of [qrCodeUrl].
     *
     * Unlike [qrCodeUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qr_code_url") @ExcludeMissing fun _qrCodeUrl(): JsonField<String> = qrCodeUrl

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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
        fun build(): Carrier = Carrier(qrCodeUrl, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Carrier = apply {
        if (validated) {
            return@apply
        }

        qrCodeUrl()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (if (qrCodeUrl.asKnown().isPresent) 1 else 0)

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
