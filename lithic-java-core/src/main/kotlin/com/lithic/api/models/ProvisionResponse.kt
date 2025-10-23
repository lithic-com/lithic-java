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

/**
 * Object containing the fields required to add a card to Apple Pay. Applies only to Apple Pay
 * wallet.
 */
class ProvisionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activationData: JsonField<String>,
    private val encryptedData: JsonField<String>,
    private val ephemeralPublicKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activationData")
        @ExcludeMissing
        activationData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("encryptedData")
        @ExcludeMissing
        encryptedData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ephemeralPublicKey")
        @ExcludeMissing
        ephemeralPublicKey: JsonField<String> = JsonMissing.of(),
    ) : this(activationData, encryptedData, ephemeralPublicKey, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationData(): Optional<String> = activationData.getOptional("activationData")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encryptedData(): Optional<String> = encryptedData.getOptional("encryptedData")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ephemeralPublicKey(): Optional<String> =
        ephemeralPublicKey.getOptional("ephemeralPublicKey")

    /**
     * Returns the raw JSON value of [activationData].
     *
     * Unlike [activationData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activationData")
    @ExcludeMissing
    fun _activationData(): JsonField<String> = activationData

    /**
     * Returns the raw JSON value of [encryptedData].
     *
     * Unlike [encryptedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encryptedData")
    @ExcludeMissing
    fun _encryptedData(): JsonField<String> = encryptedData

    /**
     * Returns the raw JSON value of [ephemeralPublicKey].
     *
     * Unlike [ephemeralPublicKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ephemeralPublicKey")
    @ExcludeMissing
    fun _ephemeralPublicKey(): JsonField<String> = ephemeralPublicKey

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

        /** Returns a mutable builder for constructing an instance of [ProvisionResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProvisionResponse]. */
    class Builder internal constructor() {

        private var activationData: JsonField<String> = JsonMissing.of()
        private var encryptedData: JsonField<String> = JsonMissing.of()
        private var ephemeralPublicKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(provisionResponse: ProvisionResponse) = apply {
            activationData = provisionResponse.activationData
            encryptedData = provisionResponse.encryptedData
            ephemeralPublicKey = provisionResponse.ephemeralPublicKey
            additionalProperties = provisionResponse.additionalProperties.toMutableMap()
        }

        fun activationData(activationData: String) = activationData(JsonField.of(activationData))

        /**
         * Sets [Builder.activationData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationData] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activationData(activationData: JsonField<String>) = apply {
            this.activationData = activationData
        }

        fun encryptedData(encryptedData: String) = encryptedData(JsonField.of(encryptedData))

        /**
         * Sets [Builder.encryptedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedData] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun encryptedData(encryptedData: JsonField<String>) = apply {
            this.encryptedData = encryptedData
        }

        fun ephemeralPublicKey(ephemeralPublicKey: String) =
            ephemeralPublicKey(JsonField.of(ephemeralPublicKey))

        /**
         * Sets [Builder.ephemeralPublicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ephemeralPublicKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ephemeralPublicKey(ephemeralPublicKey: JsonField<String>) = apply {
            this.ephemeralPublicKey = ephemeralPublicKey
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

        /**
         * Returns an immutable instance of [ProvisionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProvisionResponse =
            ProvisionResponse(
                activationData,
                encryptedData,
                ephemeralPublicKey,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProvisionResponse = apply {
        if (validated) {
            return@apply
        }

        activationData()
        encryptedData()
        ephemeralPublicKey()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (activationData.asKnown().isPresent) 1 else 0) +
            (if (encryptedData.asKnown().isPresent) 1 else 0) +
            (if (ephemeralPublicKey.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProvisionResponse &&
            activationData == other.activationData &&
            encryptedData == other.encryptedData &&
            ephemeralPublicKey == other.ephemeralPublicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(activationData, encryptedData, ephemeralPublicKey, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProvisionResponse{activationData=$activationData, encryptedData=$encryptedData, ephemeralPublicKey=$ephemeralPublicKey, additionalProperties=$additionalProperties}"
}
