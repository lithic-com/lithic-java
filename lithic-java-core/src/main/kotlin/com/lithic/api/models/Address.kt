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
class Address
@JsonCreator
private constructor(
    @JsonProperty("address1")
    @ExcludeMissing
    private val address1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address2")
    @ExcludeMissing
    private val address2: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Valid deliverable address (no PO boxes). */
    fun address1(): String = address1.getRequired("address1")

    /** Name of city. */
    fun city(): String = city.getRequired("city")

    /**
     * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. Only USA
     * is currently supported for all workflows. KYC_EXEMPT supports CAN additionally.
     */
    fun country(): String = country.getRequired("country")

    /**
     * Valid postal code. USA postal codes (ZIP codes) are supported, entered as a five-digit postal
     * code or nine-digit postal code (ZIP+4) using the format 12345-1234. KYC_EXEMPT supports
     * Canadian postal codes.
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * Valid state code. USA state codes are supported, entered in uppercase ISO 3166-2
     * two-character format. KYC_EXEMPT supports Canadian province codes.
     */
    fun state(): String = state.getRequired("state")

    /** Unit or apartment number (if applicable). */
    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    /** Valid deliverable address (no PO boxes). */
    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    /** Name of city. */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. Only USA
     * is currently supported for all workflows. KYC_EXEMPT supports CAN additionally.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Valid postal code. USA postal codes (ZIP codes) are supported, entered as a five-digit postal
     * code or nine-digit postal code (ZIP+4) using the format 12345-1234. KYC_EXEMPT supports
     * Canadian postal codes.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Valid state code. USA state codes are supported, entered in uppercase ISO 3166-2
     * two-character format. KYC_EXEMPT supports Canadian province codes.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /** Unit or apartment number (if applicable). */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Address = apply {
        if (!validated) {
            address1()
            city()
            country()
            postalCode()
            state()
            address2()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var address1: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var address2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(address: Address) = apply {
            address1 = address.address1
            city = address.city
            country = address.country
            postalCode = address.postalCode
            state = address.state
            address2 = address.address2
            additionalProperties = address.additionalProperties.toMutableMap()
        }

        /** Valid deliverable address (no PO boxes). */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /** Valid deliverable address (no PO boxes). */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Name of city. */
        fun city(city: String) = city(JsonField.of(city))

        /** Name of city. */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /**
         * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. Only
         * USA is currently supported for all workflows. KYC_EXEMPT supports CAN additionally.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Valid country code, entered in uppercase ISO 3166-1 alpha-3 three-character format. Only
         * USA is currently supported for all workflows. KYC_EXEMPT supports CAN additionally.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Valid postal code. USA postal codes (ZIP codes) are supported, entered as a five-digit
         * postal code or nine-digit postal code (ZIP+4) using the format 12345-1234. KYC_EXEMPT
         * supports Canadian postal codes.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Valid postal code. USA postal codes (ZIP codes) are supported, entered as a five-digit
         * postal code or nine-digit postal code (ZIP+4) using the format 12345-1234. KYC_EXEMPT
         * supports Canadian postal codes.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * Valid state code. USA state codes are supported, entered in uppercase ISO 3166-2
         * two-character format. KYC_EXEMPT supports Canadian province codes.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Valid state code. USA state codes are supported, entered in uppercase ISO 3166-2
         * two-character format. KYC_EXEMPT supports Canadian province codes.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Unit or apartment number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /** Unit or apartment number (if applicable). */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

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

        fun build(): Address =
            Address(
                checkNotNull(address1) { "`address1` is required but was not set" },
                checkNotNull(city) { "`city` is required but was not set" },
                checkNotNull(country) { "`country` is required but was not set" },
                checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                checkNotNull(state) { "`state` is required but was not set" },
                address2,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Address && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
}
