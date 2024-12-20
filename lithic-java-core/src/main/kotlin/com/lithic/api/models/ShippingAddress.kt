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
class ShippingAddress
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
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line2_text")
    @ExcludeMissing
    private val line2Text: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Valid USPS routable address. */
    fun address1(): String = address1.getRequired("address1")

    /** Unit number (if applicable). */
    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    /** City */
    fun city(): String = city.getRequired("city")

    /** Uppercase ISO 3166-1 alpha-3 three character abbreviation. */
    fun country(): String = country.getRequired("country")

    /**
     * Email address to be contacted for expedited shipping process purposes. Required if
     * `shipping_method` is `EXPEDITED`.
     */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /**
     * Customer's first name. This will be the first name printed on the physical card. The combined
     * length of `first_name` and `last_name` may not exceed 25 characters.
     */
    fun firstName(): String = firstName.getRequired("first_name")

    /**
     * Customer's surname (family name). This will be the last name printed on the physical card.
     * The combined length of `first_name` and `last_name` may not exceed 25 characters.
     */
    fun lastName(): String = lastName.getRequired("last_name")

    /**
     * Text to be printed on line two of the physical card. Use of this field requires additional
     * permissions.
     */
    fun line2Text(): Optional<String> = Optional.ofNullable(line2Text.getNullable("line2_text"))

    /**
     * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
     * purposes. Required if `shipping_method` is `EXPEDITED`.
     */
    fun phoneNumber(): Optional<String> =
        Optional.ofNullable(phoneNumber.getNullable("phone_number"))

    /**
     * Postal code (formerly zipcode). For US addresses, either five-digit postal code or nine-digit
     * postal code (ZIP+4) using the format 12345-1234.
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of 24
     * characters for other countries.
     */
    fun state(): String = state.getRequired("state")

    /** Valid USPS routable address. */
    @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

    /** Unit number (if applicable). */
    @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

    /** City */
    @JsonProperty("city") @ExcludeMissing fun _city() = city

    /** Uppercase ISO 3166-1 alpha-3 three character abbreviation. */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    /**
     * Email address to be contacted for expedited shipping process purposes. Required if
     * `shipping_method` is `EXPEDITED`.
     */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /**
     * Customer's first name. This will be the first name printed on the physical card. The combined
     * length of `first_name` and `last_name` may not exceed 25 characters.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /**
     * Customer's surname (family name). This will be the last name printed on the physical card.
     * The combined length of `first_name` and `last_name` may not exceed 25 characters.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /**
     * Text to be printed on line two of the physical card. Use of this field requires additional
     * permissions.
     */
    @JsonProperty("line2_text") @ExcludeMissing fun _line2Text() = line2Text

    /**
     * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
     * purposes. Required if `shipping_method` is `EXPEDITED`.
     */
    @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

    /**
     * Postal code (formerly zipcode). For US addresses, either five-digit postal code or nine-digit
     * postal code (ZIP+4) using the format 12345-1234.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

    /**
     * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of 24
     * characters for other countries.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ShippingAddress = apply {
        if (!validated) {
            address1()
            address2()
            city()
            country()
            email()
            firstName()
            lastName()
            line2Text()
            phoneNumber()
            postalCode()
            state()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var line2Text: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(shippingAddress: ShippingAddress) = apply {
            address1 = shippingAddress.address1
            address2 = shippingAddress.address2
            city = shippingAddress.city
            country = shippingAddress.country
            email = shippingAddress.email
            firstName = shippingAddress.firstName
            lastName = shippingAddress.lastName
            line2Text = shippingAddress.line2Text
            phoneNumber = shippingAddress.phoneNumber
            postalCode = shippingAddress.postalCode
            state = shippingAddress.state
            additionalProperties = shippingAddress.additionalProperties.toMutableMap()
        }

        /** Valid USPS routable address. */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /** Valid USPS routable address. */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Unit number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /** Unit number (if applicable). */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /** City */
        fun city(city: String) = city(JsonField.of(city))

        /** City */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Uppercase ISO 3166-1 alpha-3 three character abbreviation. */
        fun country(country: String) = country(JsonField.of(country))

        /** Uppercase ISO 3166-1 alpha-3 three character abbreviation. */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Email address to be contacted for expedited shipping process purposes. Required if
         * `shipping_method` is `EXPEDITED`.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Email address to be contacted for expedited shipping process purposes. Required if
         * `shipping_method` is `EXPEDITED`.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * Customer's first name. This will be the first name printed on the physical card. The
         * combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Customer's first name. This will be the first name printed on the physical card. The
         * combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /**
         * Customer's surname (family name). This will be the last name printed on the physical
         * card. The combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Customer's surname (family name). This will be the last name printed on the physical
         * card. The combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * Text to be printed on line two of the physical card. Use of this field requires
         * additional permissions.
         */
        fun line2Text(line2Text: String) = line2Text(JsonField.of(line2Text))

        /**
         * Text to be printed on line two of the physical card. Use of this field requires
         * additional permissions.
         */
        fun line2Text(line2Text: JsonField<String>) = apply { this.line2Text = line2Text }

        /**
         * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
         * purposes. Required if `shipping_method` is `EXPEDITED`.
         */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
         * purposes. Required if `shipping_method` is `EXPEDITED`.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /**
         * Postal code (formerly zipcode). For US addresses, either five-digit postal code or
         * nine-digit postal code (ZIP+4) using the format 12345-1234.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Postal code (formerly zipcode). For US addresses, either five-digit postal code or
         * nine-digit postal code (ZIP+4) using the format 12345-1234.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /**
         * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of
         * 24 characters for other countries.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of
         * 24 characters for other countries.
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

        fun build(): ShippingAddress =
            ShippingAddress(
                address1,
                address2,
                city,
                country,
                email,
                firstName,
                lastName,
                line2Text,
                phoneNumber,
                postalCode,
                state,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShippingAddress && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && email == other.email && firstName == other.firstName && lastName == other.lastName && line2Text == other.line2Text && phoneNumber == other.phoneNumber && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, email, firstName, lastName, line2Text, phoneNumber, postalCode, state, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShippingAddress{address1=$address1, address2=$address2, city=$city, country=$country, email=$email, firstName=$firstName, lastName=$lastName, line2Text=$line2Text, phoneNumber=$phoneNumber, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
}
