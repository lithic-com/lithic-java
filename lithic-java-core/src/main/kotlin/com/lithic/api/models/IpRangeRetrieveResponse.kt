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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class IpRangeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val responders: JsonField<List<String>>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("responders")
        @ExcludeMissing
        responders: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(responders, updated, mutableMapOf())

    /**
     * IP ranges that responder requests are sent from, in CIDR notation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun responders(): List<String> = responders.getRequired("responders")

    /**
     * Date and time the IP ranges were last changed
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [responders].
     *
     * Unlike [responders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("responders")
    @ExcludeMissing
    fun _responders(): JsonField<List<String>> = responders

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [IpRangeRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .responders()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpRangeRetrieveResponse]. */
    class Builder internal constructor() {

        private var responders: JsonField<MutableList<String>>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipRangeRetrieveResponse: IpRangeRetrieveResponse) = apply {
            responders = ipRangeRetrieveResponse.responders.map { it.toMutableList() }
            updated = ipRangeRetrieveResponse.updated
            additionalProperties = ipRangeRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** IP ranges that responder requests are sent from, in CIDR notation */
        fun responders(responders: List<String>) = responders(JsonField.of(responders))

        /**
         * Sets [Builder.responders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responders] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responders(responders: JsonField<List<String>>) = apply {
            this.responders = responders.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [responders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponder(responder: String) = apply {
            responders =
                (responders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("responders", it).add(responder)
                }
        }

        /** Date and time the IP ranges were last changed */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [IpRangeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .responders()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpRangeRetrieveResponse =
            IpRangeRetrieveResponse(
                checkRequired("responders", responders).map { it.toImmutable() },
                checkRequired("updated", updated),
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
    fun validate(): IpRangeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        responders()
        updated()
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
        (responders.asKnown().getOrNull()?.size ?: 0) + (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpRangeRetrieveResponse &&
            responders == other.responders &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(responders, updated, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IpRangeRetrieveResponse{responders=$responders, updated=$updated, additionalProperties=$additionalProperties}"
}
