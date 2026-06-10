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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Constraints applied to a file upload, returned alongside the upload URL so clients can validate
 * before uploading
 */
class UploadConstraints
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedMimeTypes: JsonField<List<String>>,
    private val maxSizeBytes: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accepted_mime_types")
        @ExcludeMissing
        acceptedMimeTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("max_size_bytes")
        @ExcludeMissing
        maxSizeBytes: JsonField<Long> = JsonMissing.of(),
    ) : this(acceptedMimeTypes, maxSizeBytes, mutableMapOf())

    /**
     * MIME types accepted for the upload
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedMimeTypes(): List<String> = acceptedMimeTypes.getRequired("accepted_mime_types")

    /**
     * Maximum accepted file size, in bytes
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxSizeBytes(): Long = maxSizeBytes.getRequired("max_size_bytes")

    /**
     * Returns the raw JSON value of [acceptedMimeTypes].
     *
     * Unlike [acceptedMimeTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accepted_mime_types")
    @ExcludeMissing
    fun _acceptedMimeTypes(): JsonField<List<String>> = acceptedMimeTypes

    /**
     * Returns the raw JSON value of [maxSizeBytes].
     *
     * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_size_bytes")
    @ExcludeMissing
    fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

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

        /**
         * Returns a mutable builder for constructing an instance of [UploadConstraints].
         *
         * The following fields are required:
         * ```java
         * .acceptedMimeTypes()
         * .maxSizeBytes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadConstraints]. */
    class Builder internal constructor() {

        private var acceptedMimeTypes: JsonField<MutableList<String>>? = null
        private var maxSizeBytes: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadConstraints: UploadConstraints) = apply {
            acceptedMimeTypes = uploadConstraints.acceptedMimeTypes.map { it.toMutableList() }
            maxSizeBytes = uploadConstraints.maxSizeBytes
            additionalProperties = uploadConstraints.additionalProperties.toMutableMap()
        }

        /** MIME types accepted for the upload */
        fun acceptedMimeTypes(acceptedMimeTypes: List<String>) =
            acceptedMimeTypes(JsonField.of(acceptedMimeTypes))

        /**
         * Sets [Builder.acceptedMimeTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedMimeTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun acceptedMimeTypes(acceptedMimeTypes: JsonField<List<String>>) = apply {
            this.acceptedMimeTypes = acceptedMimeTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [acceptedMimeTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcceptedMimeType(acceptedMimeType: String) = apply {
            acceptedMimeTypes =
                (acceptedMimeTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("acceptedMimeTypes", it).add(acceptedMimeType)
                }
        }

        /** Maximum accepted file size, in bytes */
        fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

        /**
         * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply { this.maxSizeBytes = maxSizeBytes }

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
         * Returns an immutable instance of [UploadConstraints].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptedMimeTypes()
         * .maxSizeBytes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadConstraints =
            UploadConstraints(
                checkRequired("acceptedMimeTypes", acceptedMimeTypes).map { it.toImmutable() },
                checkRequired("maxSizeBytes", maxSizeBytes),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UploadConstraints = apply {
        if (validated) {
            return@apply
        }

        acceptedMimeTypes()
        maxSizeBytes()
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
        (acceptedMimeTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (maxSizeBytes.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadConstraints &&
            acceptedMimeTypes == other.acceptedMimeTypes &&
            maxSizeBytes == other.maxSizeBytes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(acceptedMimeTypes, maxSizeBytes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadConstraints{acceptedMimeTypes=$acceptedMimeTypes, maxSizeBytes=$maxSizeBytes, additionalProperties=$additionalProperties}"
}
