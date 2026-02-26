// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
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

/** Information about an entity associated with an account holder */
class AccountHolderEntity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val address: JsonField<Address>,
    private val dob: JsonField<String>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val status: JsonField<EntityStatus>,
    private val type: JsonField<EntityType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        accountHolderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<EntityStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<EntityType> = JsonMissing.of(),
    ) : this(
        token,
        accountHolderToken,
        address,
        dob,
        email,
        firstName,
        lastName,
        phoneNumber,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the entity
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Globally unique identifier for the account holder
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountHolderToken(): String = accountHolderToken.getRequired("account_holder_token")

    /**
     * Individual's current address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): Address = address.getRequired("address")

    /**
     * Individual's date of birth, as an RFC 3339 date
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dob(): Optional<String> = dob.getOptional("dob")

    /**
     * Individual's email address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Individual's first name, as it appears on government-issued identity documents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * Individual's last name, as it appears on government-issued identity documents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * Individual's phone number, entered in E.164 format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * The status of the entity
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): EntityStatus = status.getRequired("status")

    /**
     * The type of entity
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): EntityType = type.getRequired("type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountHolderToken].
     *
     * Unlike [accountHolderToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken(): JsonField<String> = accountHolderToken

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [dob].
     *
     * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<EntityStatus> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<EntityType> = type

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
         * Returns a mutable builder for constructing an instance of [AccountHolderEntity].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountHolderToken()
         * .address()
         * .dob()
         * .email()
         * .firstName()
         * .lastName()
         * .phoneNumber()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderEntity]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountHolderToken: JsonField<String>? = null
        private var address: JsonField<Address>? = null
        private var dob: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var status: JsonField<EntityStatus>? = null
        private var type: JsonField<EntityType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderEntity: AccountHolderEntity) = apply {
            token = accountHolderEntity.token
            accountHolderToken = accountHolderEntity.accountHolderToken
            address = accountHolderEntity.address
            dob = accountHolderEntity.dob
            email = accountHolderEntity.email
            firstName = accountHolderEntity.firstName
            lastName = accountHolderEntity.lastName
            phoneNumber = accountHolderEntity.phoneNumber
            status = accountHolderEntity.status
            type = accountHolderEntity.type
            additionalProperties = accountHolderEntity.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the entity */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account holder */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /**
         * Sets [Builder.accountHolderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Individual's current address */
        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** Individual's date of birth, as an RFC 3339 date */
        fun dob(dob: String?) = dob(JsonField.ofNullable(dob))

        /** Alias for calling [Builder.dob] with `dob.orElse(null)`. */
        fun dob(dob: Optional<String>) = dob(dob.getOrNull())

        /**
         * Sets [Builder.dob] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dob] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dob(dob: JsonField<String>) = apply { this.dob = dob }

        /** Individual's email address */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Individual's first name, as it appears on government-issued identity documents */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Individual's last name, as it appears on government-issued identity documents */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Individual's phone number, entered in E.164 format */
        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** The status of the entity */
        fun status(status: EntityStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EntityStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<EntityStatus>) = apply { this.status = status }

        /** The type of entity */
        fun type(type: EntityType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [EntityType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<EntityType>) = apply { this.type = type }

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
         * Returns an immutable instance of [AccountHolderEntity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountHolderToken()
         * .address()
         * .dob()
         * .email()
         * .firstName()
         * .lastName()
         * .phoneNumber()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderEntity =
            AccountHolderEntity(
                checkRequired("token", token),
                checkRequired("accountHolderToken", accountHolderToken),
                checkRequired("address", address),
                checkRequired("dob", dob),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("lastName", lastName),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountHolderEntity = apply {
        if (validated) {
            return@apply
        }

        token()
        accountHolderToken()
        address().validate()
        dob()
        email()
        firstName()
        lastName()
        phoneNumber()
        status().validate()
        type().validate()
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
            (if (accountHolderToken.asKnown().isPresent) 1 else 0) +
            (address.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dob.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Individual's current address */
    class Address
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address1: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val address2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        ) : this(address1, city, country, postalCode, state, address2, mutableMapOf())

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
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Unit or apartment number (if applicable).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address2(): Optional<String> = address2.getOptional("address2")

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
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

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
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** Name of city. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Unit or apartment number (if applicable). */
            fun address2(address2: String) = address2(JsonField.of(address2))

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Address =
                Address(
                    checkRequired("address1", address1),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    address2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            address1()
            city()
            country()
            postalCode()
            state()
            address2()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (address1.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (address2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                address1 == other.address1 &&
                city == other.city &&
                country == other.country &&
                postalCode == other.postalCode &&
                state == other.state &&
                address2 == other.address2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
    }

    /** The status of the entity */
    class EntityStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmField val PENDING_REVIEW = of("PENDING_REVIEW")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = EntityStatus(JsonField.of(value))
        }

        /** An enum containing [EntityStatus]'s known values. */
        enum class Known {
            ACCEPTED,
            INACTIVE,
            PENDING_REVIEW,
            REJECTED,
        }

        /**
         * An enum containing [EntityStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCEPTED,
            INACTIVE,
            PENDING_REVIEW,
            REJECTED,
            /**
             * An enum member indicating that [EntityStatus] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                INACTIVE -> Value.INACTIVE
                PENDING_REVIEW -> Value.PENDING_REVIEW
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                INACTIVE -> Known.INACTIVE
                PENDING_REVIEW -> Known.PENDING_REVIEW
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown EntityStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): EntityStatus = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of entity */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BENEFICIAL_OWNER_INDIVIDUAL = of("BENEFICIAL_OWNER_INDIVIDUAL")

            @JvmField val CONTROL_PERSON = of("CONTROL_PERSON")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            BENEFICIAL_OWNER_INDIVIDUAL,
            CONTROL_PERSON,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BENEFICIAL_OWNER_INDIVIDUAL,
            CONTROL_PERSON,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BENEFICIAL_OWNER_INDIVIDUAL -> Value.BENEFICIAL_OWNER_INDIVIDUAL
                CONTROL_PERSON -> Value.CONTROL_PERSON
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BENEFICIAL_OWNER_INDIVIDUAL -> Known.BENEFICIAL_OWNER_INDIVIDUAL
                CONTROL_PERSON -> Known.CONTROL_PERSON
                else -> throw LithicInvalidDataException("Unknown EntityType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): EntityType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderEntity &&
            token == other.token &&
            accountHolderToken == other.accountHolderToken &&
            address == other.address &&
            dob == other.dob &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            phoneNumber == other.phoneNumber &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountHolderToken,
            address,
            dob,
            email,
            firstName,
            lastName,
            phoneNumber,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderEntity{token=$token, accountHolderToken=$accountHolderToken, address=$address, dob=$dob, email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
