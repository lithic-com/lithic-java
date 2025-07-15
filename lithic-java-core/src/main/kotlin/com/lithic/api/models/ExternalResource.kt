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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** External resource associated with the management operation */
class ExternalResource
private constructor(
    private val externalResourceToken: JsonField<String>,
    private val externalResourceType: JsonField<ExternalResourceType>,
    private val externalResourceSubToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("external_resource_token")
        @ExcludeMissing
        externalResourceToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_resource_type")
        @ExcludeMissing
        externalResourceType: JsonField<ExternalResourceType> = JsonMissing.of(),
        @JsonProperty("external_resource_sub_token")
        @ExcludeMissing
        externalResourceSubToken: JsonField<String> = JsonMissing.of(),
    ) : this(externalResourceToken, externalResourceType, externalResourceSubToken, mutableMapOf())

    /**
     * Token identifying the external resource
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalResourceToken(): String =
        externalResourceToken.getRequired("external_resource_token")

    /**
     * Type of external resource associated with the management operation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalResourceType(): ExternalResourceType =
        externalResourceType.getRequired("external_resource_type")

    /**
     * Token identifying the external resource sub-resource
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalResourceSubToken(): Optional<String> =
        externalResourceSubToken.getOptional("external_resource_sub_token")

    /**
     * Returns the raw JSON value of [externalResourceToken].
     *
     * Unlike [externalResourceToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_resource_token")
    @ExcludeMissing
    fun _externalResourceToken(): JsonField<String> = externalResourceToken

    /**
     * Returns the raw JSON value of [externalResourceType].
     *
     * Unlike [externalResourceType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_resource_type")
    @ExcludeMissing
    fun _externalResourceType(): JsonField<ExternalResourceType> = externalResourceType

    /**
     * Returns the raw JSON value of [externalResourceSubToken].
     *
     * Unlike [externalResourceSubToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_resource_sub_token")
    @ExcludeMissing
    fun _externalResourceSubToken(): JsonField<String> = externalResourceSubToken

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
         * Returns a mutable builder for constructing an instance of [ExternalResource].
         *
         * The following fields are required:
         * ```java
         * .externalResourceToken()
         * .externalResourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalResource]. */
    class Builder internal constructor() {

        private var externalResourceToken: JsonField<String>? = null
        private var externalResourceType: JsonField<ExternalResourceType>? = null
        private var externalResourceSubToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalResource: ExternalResource) = apply {
            externalResourceToken = externalResource.externalResourceToken
            externalResourceType = externalResource.externalResourceType
            externalResourceSubToken = externalResource.externalResourceSubToken
            additionalProperties = externalResource.additionalProperties.toMutableMap()
        }

        /** Token identifying the external resource */
        fun externalResourceToken(externalResourceToken: String) =
            externalResourceToken(JsonField.of(externalResourceToken))

        /**
         * Sets [Builder.externalResourceToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalResourceToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalResourceToken(externalResourceToken: JsonField<String>) = apply {
            this.externalResourceToken = externalResourceToken
        }

        /** Type of external resource associated with the management operation */
        fun externalResourceType(externalResourceType: ExternalResourceType) =
            externalResourceType(JsonField.of(externalResourceType))

        /**
         * Sets [Builder.externalResourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalResourceType] with a well-typed
         * [ExternalResourceType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun externalResourceType(externalResourceType: JsonField<ExternalResourceType>) = apply {
            this.externalResourceType = externalResourceType
        }

        /** Token identifying the external resource sub-resource */
        fun externalResourceSubToken(externalResourceSubToken: String) =
            externalResourceSubToken(JsonField.of(externalResourceSubToken))

        /**
         * Sets [Builder.externalResourceSubToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalResourceSubToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalResourceSubToken(externalResourceSubToken: JsonField<String>) = apply {
            this.externalResourceSubToken = externalResourceSubToken
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
         * Returns an immutable instance of [ExternalResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalResourceToken()
         * .externalResourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalResource =
            ExternalResource(
                checkRequired("externalResourceToken", externalResourceToken),
                checkRequired("externalResourceType", externalResourceType),
                externalResourceSubToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalResource = apply {
        if (validated) {
            return@apply
        }

        externalResourceToken()
        externalResourceType().validate()
        externalResourceSubToken()
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
        (if (externalResourceToken.asKnown().isPresent) 1 else 0) +
            (externalResourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalResourceSubToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalResource && externalResourceToken == other.externalResourceToken && externalResourceType == other.externalResourceType && externalResourceSubToken == other.externalResourceSubToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(externalResourceToken, externalResourceType, externalResourceSubToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalResource{externalResourceToken=$externalResourceToken, externalResourceType=$externalResourceType, externalResourceSubToken=$externalResourceSubToken, additionalProperties=$additionalProperties}"
}
