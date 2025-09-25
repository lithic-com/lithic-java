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

class V2ReportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reportToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("report_token")
        @ExcludeMissing
        reportToken: JsonField<String> = JsonMissing.of()
    ) : this(reportToken, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportToken(): Optional<String> = reportToken.getOptional("report_token")

    /**
     * Returns the raw JSON value of [reportToken].
     *
     * Unlike [reportToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_token")
    @ExcludeMissing
    fun _reportToken(): JsonField<String> = reportToken

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

        /** Returns a mutable builder for constructing an instance of [V2ReportResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2ReportResponse]. */
    class Builder internal constructor() {

        private var reportToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2ReportResponse: V2ReportResponse) = apply {
            reportToken = v2ReportResponse.reportToken
            additionalProperties = v2ReportResponse.additionalProperties.toMutableMap()
        }

        fun reportToken(reportToken: String) = reportToken(JsonField.of(reportToken))

        /**
         * Sets [Builder.reportToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportToken(reportToken: JsonField<String>) = apply { this.reportToken = reportToken }

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
         * Returns an immutable instance of [V2ReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V2ReportResponse =
            V2ReportResponse(reportToken, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V2ReportResponse = apply {
        if (validated) {
            return@apply
        }

        reportToken()
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
    @JvmSynthetic internal fun validity(): Int = (if (reportToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ReportResponse &&
            reportToken == other.reportToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(reportToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2ReportResponse{reportToken=$reportToken, additionalProperties=$additionalProperties}"
}
