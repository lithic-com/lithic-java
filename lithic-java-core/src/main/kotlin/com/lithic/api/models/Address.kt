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

class Address
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val address1: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val address2: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address1") @ExcludeMissing address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(address1, city, country, address2, postalCode, state, mutableMapOf())

    /**
     * Valid deliverable address (no PO boxes).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address1(): String = address1.getRequired("address1")

    /**
     * Name of city.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. The
     * KYB_DELEGATED and KYC_EXEMPT workflows support all countries except BLR, CUB, IRN, PRK, RUS,
     * SDN, SYR, and UKR. Other workflows support USA only.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Unit or apartment number (if applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address2(): Optional<String> = address2.getOptional("address2")

    /**
     * Valid postal code. For USA addresses, enter either a five-digit postal code or a nine-digit
     * postal code (ZIP+4) using the format 12345-1234. Required for all countries except the
     * following, which do not use postal codes: ABW, AGO, ARE, ATG, BDI, BEN, BFA, BHS, BLZ, BOL,
     * BWA, CIV, CMR, COD, COG, COK, COM, DJI, DMA, ERI, FJI, GAB, GMB, GNQ, GRD, GUY, HKG, KIR,
     * MAC, MLI, MRT, NIU, NRU, QAT, RWA, SLB, SLE, SSD, SUR, SXM, SYC, TGO, TKL, TLS, TON, TUV,
     * UGA, VUT, YEM, ZWE
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

    /**
     * Valid state, province, or subdivision code, entered as the uppercase ISO 3166-2 code for the
     * country without the country prefix. For example, `CA` for California. Optional unless the
     * address is in one of the following countries, where it is required:
     * - `USA`
     * - `CAN`
     * - `AUS`
     * - `CHN`
     * - `KOR`
     * - `MEX`
     * - `MYS`
     * - `NZL`
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [address1].
     *
     * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

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
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

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

        /**
         * Returns a mutable builder for constructing an instance of [Address].
         *
         * The following fields are required:
         * ```java
         * .address1()
         * .city()
         * .country()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Address]. */
    class Builder internal constructor() {

        private var address1: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var address2: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(address: Address) = apply {
            address1 = address.address1
            city = address.city
            country = address.country
            address2 = address.address2
            postalCode = address.postalCode
            state = address.state
            additionalProperties = address.additionalProperties.toMutableMap()
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
         * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. The
         * KYB_DELEGATED and KYC_EXEMPT workflows support all countries except BLR, CUB, IRN, PRK,
         * RUS, SDN, SYR, and UKR. Other workflows support USA only.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Unit or apartment number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /**
         * Valid postal code. For USA addresses, enter either a five-digit postal code or a
         * nine-digit postal code (ZIP+4) using the format 12345-1234. Required for all countries
         * except the following, which do not use postal codes: ABW, AGO, ARE, ATG, BDI, BEN, BFA,
         * BHS, BLZ, BOL, BWA, CIV, CMR, COD, COG, COK, COM, DJI, DMA, ERI, FJI, GAB, GMB, GNQ, GRD,
         * GUY, HKG, KIR, MAC, MLI, MRT, NIU, NRU, QAT, RWA, SLB, SLE, SSD, SUR, SXM, SYC, TGO, TKL,
         * TLS, TON, TUV, UGA, VUT, YEM, ZWE
         */
        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
        fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * Valid state, province, or subdivision code, entered as the uppercase ISO 3166-2 code for
         * the country without the country prefix. For example, `CA` for California. Optional unless
         * the address is in one of the following countries, where it is required:
         * - `USA`
         * - `CAN`
         * - `AUS`
         * - `CHN`
         * - `KOR`
         * - `MEX`
         * - `MYS`
         * - `NZL`
         */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

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
         * Returns an immutable instance of [Address].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .address1()
         * .city()
         * .country()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Address =
            Address(
                checkRequired("address1", address1),
                checkRequired("city", city),
                checkRequired("country", country),
                address2,
                postalCode,
                state,
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
    fun validate(): Address = apply {
        if (validated) {
            return@apply
        }

        address1()
        city()
        country()
        address2()
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
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (address2.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Address &&
            address1 == other.address1 &&
            city == other.city &&
            country == other.country &&
            address2 == other.address2 &&
            postalCode == other.postalCode &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(address1, city, country, address2, postalCode, state, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{address1=$address1, city=$city, country=$country, address2=$address2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
}
