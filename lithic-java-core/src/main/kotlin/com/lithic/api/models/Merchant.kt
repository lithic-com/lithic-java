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

class Merchant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptorId: JsonField<String>,
    private val acquiringInstitutionId: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val mcc: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptor_id")
        @ExcludeMissing
        acceptorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquiring_institution_id")
        @ExcludeMissing
        acquiringInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(
        acceptorId,
        acquiringInstitutionId,
        city,
        country,
        descriptor,
        mcc,
        state,
        mutableMapOf(),
    )

    /**
     * Unique alphanumeric identifier for the payment card acceptor (merchant).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptorId(): String = acceptorId.getRequired("acceptor_id")

    /**
     * Unique numeric identifier of the acquiring institution.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acquiringInstitutionId(): String =
        acquiringInstitutionId.getRequired("acquiring_institution_id")

    /**
     * City of card acceptor. Note that in many cases, particularly in card-not-present
     * transactions, merchants may send through a phone number or URL in this field.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3 country
     * codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Short description of card acceptor.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /**
     * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
     * classify a business by the types of goods or services it provides.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mcc(): String = mcc.getRequired("mcc")

    /**
     * Geographic state of card acceptor.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): String = state.getRequired("state")

    /**
     * Returns the raw JSON value of [acceptorId].
     *
     * Unlike [acceptorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptor_id") @ExcludeMissing fun _acceptorId(): JsonField<String> = acceptorId

    /**
     * Returns the raw JSON value of [acquiringInstitutionId].
     *
     * Unlike [acquiringInstitutionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("acquiring_institution_id")
    @ExcludeMissing
    fun _acquiringInstitutionId(): JsonField<String> = acquiringInstitutionId

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [mcc].
     *
     * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
         * Returns a mutable builder for constructing an instance of [Merchant].
         *
         * The following fields are required:
         * ```java
         * .acceptorId()
         * .acquiringInstitutionId()
         * .city()
         * .country()
         * .descriptor()
         * .mcc()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Merchant]. */
    class Builder internal constructor() {

        private var acceptorId: JsonField<String>? = null
        private var acquiringInstitutionId: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var descriptor: JsonField<String>? = null
        private var mcc: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(merchant: Merchant) = apply {
            acceptorId = merchant.acceptorId
            acquiringInstitutionId = merchant.acquiringInstitutionId
            city = merchant.city
            country = merchant.country
            descriptor = merchant.descriptor
            mcc = merchant.mcc
            state = merchant.state
            additionalProperties = merchant.additionalProperties.toMutableMap()
        }

        /** Unique alphanumeric identifier for the payment card acceptor (merchant). */
        fun acceptorId(acceptorId: String) = acceptorId(JsonField.of(acceptorId))

        /**
         * Sets [Builder.acceptorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acceptorId(acceptorId: JsonField<String>) = apply { this.acceptorId = acceptorId }

        /** Unique numeric identifier of the acquiring institution. */
        fun acquiringInstitutionId(acquiringInstitutionId: String) =
            acquiringInstitutionId(JsonField.of(acquiringInstitutionId))

        /**
         * Sets [Builder.acquiringInstitutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquiringInstitutionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acquiringInstitutionId(acquiringInstitutionId: JsonField<String>) = apply {
            this.acquiringInstitutionId = acquiringInstitutionId
        }

        /**
         * City of card acceptor. Note that in many cases, particularly in card-not-present
         * transactions, merchants may send through a phone number or URL in this field.
         */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /**
         * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
         * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Short description of card acceptor. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        fun mcc(mcc: String) = mcc(JsonField.of(mcc))

        /**
         * Sets [Builder.mcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

        /** Geographic state of card acceptor. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

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
         * Returns an immutable instance of [Merchant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptorId()
         * .acquiringInstitutionId()
         * .city()
         * .country()
         * .descriptor()
         * .mcc()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Merchant =
            Merchant(
                checkRequired("acceptorId", acceptorId),
                checkRequired("acquiringInstitutionId", acquiringInstitutionId),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("descriptor", descriptor),
                checkRequired("mcc", mcc),
                checkRequired("state", state),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Merchant = apply {
        if (validated) {
            return@apply
        }

        acceptorId()
        acquiringInstitutionId()
        city()
        country()
        descriptor()
        mcc()
        state()
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
        (if (acceptorId.asKnown().isPresent) 1 else 0) +
            (if (acquiringInstitutionId.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (mcc.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Merchant &&
            acceptorId == other.acceptorId &&
            acquiringInstitutionId == other.acquiringInstitutionId &&
            city == other.city &&
            country == other.country &&
            descriptor == other.descriptor &&
            mcc == other.mcc &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptorId,
            acquiringInstitutionId,
            city,
            country,
            descriptor,
            mcc,
            state,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Merchant{acceptorId=$acceptorId, acquiringInstitutionId=$acquiringInstitutionId, city=$city, country=$country, descriptor=$descriptor, mcc=$mcc, state=$state, additionalProperties=$additionalProperties}"
}
