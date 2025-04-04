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

class ShippingAddress
private constructor(
    private val address1: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val address2: JsonField<String>,
    private val email: JsonField<String>,
    private val line2Text: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address1") @ExcludeMissing address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2_text") @ExcludeMissing line2Text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        address1,
        city,
        country,
        firstName,
        lastName,
        postalCode,
        state,
        address2,
        email,
        line2Text,
        phoneNumber,
        mutableMapOf(),
    )

    /**
     * Valid USPS routable address.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address1(): String = address1.getRequired("address1")

    /**
     * City
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * Uppercase ISO 3166-1 alpha-3 three character abbreviation.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Customer's first name. This will be the first name printed on the physical card. The combined
     * length of `first_name` and `last_name` may not exceed 25 characters.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("first_name")

    /**
     * Customer's surname (family name). This will be the last name printed on the physical card.
     * The combined length of `first_name` and `last_name` may not exceed 25 characters.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("last_name")

    /**
     * Postal code (formerly zipcode). For US addresses, either five-digit postal code or nine-digit
     * postal code (ZIP+4) using the format 12345-1234.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of 24
     * characters for other countries.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): String = state.getRequired("state")

    /**
     * Unit number (if applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address2(): Optional<String> = address2.getOptional("address2")

    /**
     * Email address to be contacted for expedited shipping process purposes. Required if
     * `shipping_method` is `EXPEDITED`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Text to be printed on line two of the physical card. Use of this field requires additional
     * permissions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line2Text(): Optional<String> = line2Text.getOptional("line2_text")

    /**
     * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
     * purposes. Required if `shipping_method` is `EXPEDITED`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

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
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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

    /**
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [line2Text].
     *
     * Unlike [line2Text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2_text") @ExcludeMissing fun _line2Text(): JsonField<String> = line2Text

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns a mutable builder for constructing an instance of [ShippingAddress].
         *
         * The following fields are required:
         * ```java
         * .address1()
         * .city()
         * .country()
         * .firstName()
         * .lastName()
         * .postalCode()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ShippingAddress]. */
    class Builder internal constructor() {

        private var address1: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var address2: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var line2Text: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(shippingAddress: ShippingAddress) = apply {
            address1 = shippingAddress.address1
            city = shippingAddress.city
            country = shippingAddress.country
            firstName = shippingAddress.firstName
            lastName = shippingAddress.lastName
            postalCode = shippingAddress.postalCode
            state = shippingAddress.state
            address2 = shippingAddress.address2
            email = shippingAddress.email
            line2Text = shippingAddress.line2Text
            phoneNumber = shippingAddress.phoneNumber
            additionalProperties = shippingAddress.additionalProperties.toMutableMap()
        }

        /** Valid USPS routable address. */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /**
         * Sets [Builder.address1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** City */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Uppercase ISO 3166-1 alpha-3 three character abbreviation. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Customer's first name. This will be the first name printed on the physical card. The
         * combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /**
         * Customer's surname (family name). This will be the last name printed on the physical
         * card. The combined length of `first_name` and `last_name` may not exceed 25 characters.
         */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * Postal code (formerly zipcode). For US addresses, either five-digit postal code or
         * nine-digit postal code (ZIP+4) using the format 12345-1234.
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
         * Uppercase ISO 3166-2 two character abbreviation for US and CA. Optional with a limit of
         * 24 characters for other countries.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Unit number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /**
         * Email address to be contacted for expedited shipping process purposes. Required if
         * `shipping_method` is `EXPEDITED`.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * Text to be printed on line two of the physical card. Use of this field requires
         * additional permissions.
         */
        fun line2Text(line2Text: String) = line2Text(JsonField.of(line2Text))

        /**
         * Sets [Builder.line2Text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2Text] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun line2Text(line2Text: JsonField<String>) = apply { this.line2Text = line2Text }

        /**
         * Cardholder's phone number in E.164 format to be contacted for expedited shipping process
         * purposes. Required if `shipping_method` is `EXPEDITED`.
         */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [ShippingAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .address1()
         * .city()
         * .country()
         * .firstName()
         * .lastName()
         * .postalCode()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ShippingAddress =
            ShippingAddress(
                checkRequired("address1", address1),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("firstName", firstName),
                checkRequired("lastName", lastName),
                checkRequired("postalCode", postalCode),
                checkRequired("state", state),
                address2,
                email,
                line2Text,
                phoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ShippingAddress = apply {
        if (validated) {
            return@apply
        }

        address1()
        city()
        country()
        firstName()
        lastName()
        postalCode()
        state()
        address2()
        email()
        line2Text()
        phoneNumber()
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
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (address2.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (line2Text.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShippingAddress && address1 == other.address1 && city == other.city && country == other.country && firstName == other.firstName && lastName == other.lastName && postalCode == other.postalCode && state == other.state && address2 == other.address2 && email == other.email && line2Text == other.line2Text && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, city, country, firstName, lastName, postalCode, state, address2, email, line2Text, phoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShippingAddress{address1=$address1, city=$city, country=$country, firstName=$firstName, lastName=$lastName, postalCode=$postalCode, state=$state, address2=$address2, email=$email, line2Text=$line2Text, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
