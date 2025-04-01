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

class AddressUpdate
private constructor(
    private val address1: JsonField<String>,
    private val address2: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address1") @ExcludeMissing address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(address1, address2, city, country, postalCode, state, mutableMapOf())

    /**
     * Valid deliverable address (no PO boxes).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address1(): Optional<String> = Optional.ofNullable(address1.getNullable("address1"))

    /**
     * Unit or apartment number (if applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    /**
     * Name of city.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

    /**
     * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1 alpha-3
     * three-character format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    /**
     * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit ZIP or
     * nine-digit ZIP+4.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

    /**
     * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
     * 3166-2 two-character format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

    /**
     * Returns the raw JSON value of [address1].
     *
     * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    /**
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

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
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

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

        /** Returns a mutable builder for constructing an instance of [AddressUpdate]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AddressUpdate]. */
    class Builder internal constructor() {

        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(addressUpdate: AddressUpdate) = apply {
            address1 = addressUpdate.address1
            address2 = addressUpdate.address2
            city = addressUpdate.city
            country = addressUpdate.country
            postalCode = addressUpdate.postalCode
            state = addressUpdate.state
            additionalProperties = addressUpdate.additionalProperties.toMutableMap()
        }

        /** Valid deliverable address (no PO boxes). */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /**
         * Sets [Builder.address1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Unit or apartment number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /** Name of city. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
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
         * Returns an immutable instance of [AddressUpdate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AddressUpdate =
            AddressUpdate(
                address1,
                address2,
                city,
                country,
                postalCode,
                state,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AddressUpdate = apply {
        if (validated) {
            return@apply
        }

        address1()
        address2()
        city()
        country()
        postalCode()
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
        (if (address1.asKnown().isPresent) 1 else 0) +
            (if (address2.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddressUpdate && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddressUpdate{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
}
