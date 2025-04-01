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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class KybBusinessEntity
private constructor(
    private val address: JsonField<Address>,
    private val governmentId: JsonField<String>,
    private val legalBusinessName: JsonField<String>,
    private val phoneNumbers: JsonField<List<String>>,
    private val dbaBusinessName: JsonField<String>,
    private val parentCompany: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("government_id")
        @ExcludeMissing
        governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        legalBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        dbaBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_company")
        @ExcludeMissing
        parentCompany: JsonField<String> = JsonMissing.of(),
    ) : this(
        address,
        governmentId,
        legalBusinessName,
        phoneNumbers,
        dbaBusinessName,
        parentCompany,
        mutableMapOf(),
    )

    /**
     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): Address = address.getRequired("address")

    /**
     * Government-issued identification number. US Federal Employer Identification Numbers (EIN) are
     * currently supported, entered as full nine-digits, with or without hyphens.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun governmentId(): String = governmentId.getRequired("government_id")

    /**
     * Legal (formal) business name.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

    /**
     * One or more of the business's phone number(s), entered as a list in E.164 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

    /**
     * Any name that the business operates under that is not its legal business name (if
     * applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dbaBusinessName(): Optional<String> =
        Optional.ofNullable(dbaBusinessName.getNullable("dba_business_name"))

    /**
     * Parent company name (if applicable).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentCompany(): Optional<String> =
        Optional.ofNullable(parentCompany.getNullable("parent_company"))

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [governmentId].
     *
     * Unlike [governmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("government_id")
    @ExcludeMissing
    fun _governmentId(): JsonField<String> = governmentId

    /**
     * Returns the raw JSON value of [legalBusinessName].
     *
     * Unlike [legalBusinessName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legal_business_name")
    @ExcludeMissing
    fun _legalBusinessName(): JsonField<String> = legalBusinessName

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

    /**
     * Returns the raw JSON value of [dbaBusinessName].
     *
     * Unlike [dbaBusinessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dba_business_name")
    @ExcludeMissing
    fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

    /**
     * Returns the raw JSON value of [parentCompany].
     *
     * Unlike [parentCompany], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_company")
    @ExcludeMissing
    fun _parentCompany(): JsonField<String> = parentCompany

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
         * Returns a mutable builder for constructing an instance of [KybBusinessEntity].
         *
         * The following fields are required:
         * ```java
         * .address()
         * .governmentId()
         * .legalBusinessName()
         * .phoneNumbers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KybBusinessEntity]. */
    class Builder internal constructor() {

        private var address: JsonField<Address>? = null
        private var governmentId: JsonField<String>? = null
        private var legalBusinessName: JsonField<String>? = null
        private var phoneNumbers: JsonField<MutableList<String>>? = null
        private var dbaBusinessName: JsonField<String> = JsonMissing.of()
        private var parentCompany: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kybBusinessEntity: KybBusinessEntity) = apply {
            address = kybBusinessEntity.address
            governmentId = kybBusinessEntity.governmentId
            legalBusinessName = kybBusinessEntity.legalBusinessName
            phoneNumbers = kybBusinessEntity.phoneNumbers.map { it.toMutableList() }
            dbaBusinessName = kybBusinessEntity.dbaBusinessName
            parentCompany = kybBusinessEntity.parentCompany
            additionalProperties = kybBusinessEntity.additionalProperties.toMutableMap()
        }

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

        /**
         * Sets [Builder.governmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.governmentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun governmentId(governmentId: JsonField<String>) = apply {
            this.governmentId = governmentId
        }

        /** Legal (formal) business name. */
        fun legalBusinessName(legalBusinessName: String) =
            legalBusinessName(JsonField.of(legalBusinessName))

        /**
         * Sets [Builder.legalBusinessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBusinessName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
            this.legalBusinessName = legalBusinessName
        }

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(dbaBusinessName: String) =
            dbaBusinessName(JsonField.of(dbaBusinessName))

        /**
         * Sets [Builder.dbaBusinessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dbaBusinessName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
            this.dbaBusinessName = dbaBusinessName
        }

        /** Parent company name (if applicable). */
        fun parentCompany(parentCompany: String) = parentCompany(JsonField.of(parentCompany))

        /**
         * Sets [Builder.parentCompany] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentCompany] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentCompany(parentCompany: JsonField<String>) = apply {
            this.parentCompany = parentCompany
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
         * Returns an immutable instance of [KybBusinessEntity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .address()
         * .governmentId()
         * .legalBusinessName()
         * .phoneNumbers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KybBusinessEntity =
            KybBusinessEntity(
                checkRequired("address", address),
                checkRequired("governmentId", governmentId),
                checkRequired("legalBusinessName", legalBusinessName),
                checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                dbaBusinessName,
                parentCompany,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): KybBusinessEntity = apply {
        if (validated) {
            return@apply
        }

        address().validate()
        governmentId()
        legalBusinessName()
        phoneNumbers()
        dbaBusinessName()
        parentCompany()
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
        (address.asKnown().getOrNull()?.validity() ?: 0) +
            (if (governmentId.asKnown().isPresent) 1 else 0) +
            (if (legalBusinessName.asKnown().isPresent) 1 else 0) +
            (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
            (if (dbaBusinessName.asKnown().isPresent) 1 else 0) +
            (if (parentCompany.asKnown().isPresent) 1 else 0)

    /**
     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    class Address
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
        fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

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

            return /* spotless:off */ other is Address && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is KybBusinessEntity && address == other.address && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && phoneNumbers == other.phoneNumbers && dbaBusinessName == other.dbaBusinessName && parentCompany == other.parentCompany && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address, governmentId, legalBusinessName, phoneNumbers, dbaBusinessName, parentCompany, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KybBusinessEntity{address=$address, governmentId=$governmentId, legalBusinessName=$legalBusinessName, phoneNumbers=$phoneNumbers, dbaBusinessName=$dbaBusinessName, parentCompany=$parentCompany, additionalProperties=$additionalProperties}"
}
