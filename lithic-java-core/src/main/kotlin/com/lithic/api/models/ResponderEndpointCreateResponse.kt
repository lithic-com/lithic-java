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

class ResponderEndpointCreateResponse
private constructor(
    private val enrolled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enrolled") @ExcludeMissing enrolled: JsonField<Boolean> = JsonMissing.of()
    ) : this(enrolled, mutableMapOf())

    /**
     * True if the endpoint was enrolled successfully.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enrolled(): Optional<Boolean> = enrolled.getOptional("enrolled")

    /**
     * Returns the raw JSON value of [enrolled].
     *
     * Unlike [enrolled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled(): JsonField<Boolean> = enrolled

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
         * Returns a mutable builder for constructing an instance of
         * [ResponderEndpointCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResponderEndpointCreateResponse]. */
    class Builder internal constructor() {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointCreateResponse: ResponderEndpointCreateResponse) =
            apply {
                enrolled = responderEndpointCreateResponse.enrolled
                additionalProperties =
                    responderEndpointCreateResponse.additionalProperties.toMutableMap()
            }

        /** True if the endpoint was enrolled successfully. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /**
         * Sets [Builder.enrolled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrolled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

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
         * Returns an immutable instance of [ResponderEndpointCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResponderEndpointCreateResponse =
            ResponderEndpointCreateResponse(enrolled, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ResponderEndpointCreateResponse = apply {
        if (validated) {
            return@apply
        }

        enrolled()
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
    @JvmSynthetic internal fun validity(): Int = (if (enrolled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointCreateResponse && enrolled == other.enrolled && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enrolled, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponderEndpointCreateResponse{enrolled=$enrolled, additionalProperties=$additionalProperties}"
}
