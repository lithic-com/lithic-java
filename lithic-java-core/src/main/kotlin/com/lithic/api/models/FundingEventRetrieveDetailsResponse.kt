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

class FundingEventRetrieveDetailsResponse
private constructor(
    private val token: JsonField<String>,
    private val settlementDetailsUrl: JsonField<String>,
    private val settlementSummaryUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_details_url")
        @ExcludeMissing
        settlementDetailsUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_summary_url")
        @ExcludeMissing
        settlementSummaryUrl: JsonField<String> = JsonMissing.of(),
    ) : this(token, settlementDetailsUrl, settlementSummaryUrl, mutableMapOf())

    /**
     * Unique token ID
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * URL of the settlement details
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementDetailsUrl(): String = settlementDetailsUrl.getRequired("settlement_details_url")

    /**
     * URL of the settlement summary
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementSummaryUrl(): String = settlementSummaryUrl.getRequired("settlement_summary_url")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [settlementDetailsUrl].
     *
     * Unlike [settlementDetailsUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_details_url")
    @ExcludeMissing
    fun _settlementDetailsUrl(): JsonField<String> = settlementDetailsUrl

    /**
     * Returns the raw JSON value of [settlementSummaryUrl].
     *
     * Unlike [settlementSummaryUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_summary_url")
    @ExcludeMissing
    fun _settlementSummaryUrl(): JsonField<String> = settlementSummaryUrl

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
         * [FundingEventRetrieveDetailsResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .settlementDetailsUrl()
         * .settlementSummaryUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FundingEventRetrieveDetailsResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var settlementDetailsUrl: JsonField<String>? = null
        private var settlementSummaryUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            fundingEventRetrieveDetailsResponse: FundingEventRetrieveDetailsResponse
        ) = apply {
            token = fundingEventRetrieveDetailsResponse.token
            settlementDetailsUrl = fundingEventRetrieveDetailsResponse.settlementDetailsUrl
            settlementSummaryUrl = fundingEventRetrieveDetailsResponse.settlementSummaryUrl
            additionalProperties =
                fundingEventRetrieveDetailsResponse.additionalProperties.toMutableMap()
        }

        /** Unique token ID */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** URL of the settlement details */
        fun settlementDetailsUrl(settlementDetailsUrl: String) =
            settlementDetailsUrl(JsonField.of(settlementDetailsUrl))

        /**
         * Sets [Builder.settlementDetailsUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementDetailsUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementDetailsUrl(settlementDetailsUrl: JsonField<String>) = apply {
            this.settlementDetailsUrl = settlementDetailsUrl
        }

        /** URL of the settlement summary */
        fun settlementSummaryUrl(settlementSummaryUrl: String) =
            settlementSummaryUrl(JsonField.of(settlementSummaryUrl))

        /**
         * Sets [Builder.settlementSummaryUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementSummaryUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementSummaryUrl(settlementSummaryUrl: JsonField<String>) = apply {
            this.settlementSummaryUrl = settlementSummaryUrl
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
         * Returns an immutable instance of [FundingEventRetrieveDetailsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .settlementDetailsUrl()
         * .settlementSummaryUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FundingEventRetrieveDetailsResponse =
            FundingEventRetrieveDetailsResponse(
                checkRequired("token", token),
                checkRequired("settlementDetailsUrl", settlementDetailsUrl),
                checkRequired("settlementSummaryUrl", settlementSummaryUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FundingEventRetrieveDetailsResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        settlementDetailsUrl()
        settlementSummaryUrl()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (settlementDetailsUrl.asKnown().isPresent) 1 else 0) +
            (if (settlementSummaryUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FundingEventRetrieveDetailsResponse && token == other.token && settlementDetailsUrl == other.settlementDetailsUrl && settlementSummaryUrl == other.settlementSummaryUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, settlementDetailsUrl, settlementSummaryUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FundingEventRetrieveDetailsResponse{token=$token, settlementDetailsUrl=$settlementDetailsUrl, settlementSummaryUrl=$settlementSummaryUrl, additionalProperties=$additionalProperties}"
}
