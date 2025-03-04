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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AddressUpdate
@JsonCreator
private constructor(
    @JsonProperty("address1")
    @ExcludeMissing
    private val address1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address2")
    @ExcludeMissing
    private val address2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Valid deliverable address (no PO boxes). */
    fun address1(): Optional<String> = Optional.ofNullable(address1.getNullable("address1"))

    /** Unit or apartment number (if applicable). */
    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    /** Name of city. */
    fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

    /**
     * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1 alpha-3
     * three-character format.
     */
    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    /**
     * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit ZIP or
     * nine-digit ZIP+4.
     */
    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

    /**
     * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
     * 3166-2 two-character format.
     */
    fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

    /** Valid deliverable address (no PO boxes). */
    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    /** Unit or apartment number (if applicable). */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    /** Name of city. */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1 alpha-3
     * three-character format.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit ZIP or
     * nine-digit ZIP+4.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
     * 3166-2 two-character format.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** Valid deliverable address (no PO boxes). */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Unit or apartment number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /** Unit or apartment number (if applicable). */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /** Name of city. */
        fun city(city: String) = city(JsonField.of(city))

        /** Name of city. */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
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

        fun build(): AddressUpdate =
            AddressUpdate(
                address1,
                address2,
                city,
                country,
                postalCode,
                state,
                additionalProperties.toImmutable(),
            )
    }

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
