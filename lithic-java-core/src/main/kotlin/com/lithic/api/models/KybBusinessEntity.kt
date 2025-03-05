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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class KybBusinessEntity
@JsonCreator
private constructor(
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("government_id")
    @ExcludeMissing
    private val governmentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legal_business_name")
    @ExcludeMissing
    private val legalBusinessName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    private val phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("dba_business_name")
    @ExcludeMissing
    private val dbaBusinessName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("parent_company")
    @ExcludeMissing
    private val parentCompany: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    fun address(): Address = address.getRequired("address")

    /**
     * Government-issued identification number. US Federal Employer Identification Numbers (EIN) are
     * currently supported, entered as full nine-digits, with or without hyphens.
     */
    fun governmentId(): String = governmentId.getRequired("government_id")

    /** Legal (formal) business name. */
    fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

    /** One or more of the business's phone number(s), entered as a list in E.164 format. */
    fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

    /**
     * Any name that the business operates under that is not its legal business name (if
     * applicable).
     */
    fun dbaBusinessName(): Optional<String> =
        Optional.ofNullable(dbaBusinessName.getNullable("dba_business_name"))

    /** Parent company name (if applicable). */
    fun parentCompany(): Optional<String> =
        Optional.ofNullable(parentCompany.getNullable("parent_company"))

    /**
     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Government-issued identification number. US Federal Employer Identification Numbers (EIN) are
     * currently supported, entered as full nine-digits, with or without hyphens.
     */
    @JsonProperty("government_id")
    @ExcludeMissing
    fun _governmentId(): JsonField<String> = governmentId

    /** Legal (formal) business name. */
    @JsonProperty("legal_business_name")
    @ExcludeMissing
    fun _legalBusinessName(): JsonField<String> = legalBusinessName

    /** One or more of the business's phone number(s), entered as a list in E.164 format. */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

    /**
     * Any name that the business operates under that is not its legal business name (if
     * applicable).
     */
    @JsonProperty("dba_business_name")
    @ExcludeMissing
    fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

    /** Parent company name (if applicable). */
    @JsonProperty("parent_company")
    @ExcludeMissing
    fun _parentCompany(): JsonField<String> = parentCompany

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(governmentId: JsonField<String>) = apply {
            this.governmentId = governmentId
        }

        /** Legal (formal) business name. */
        fun legalBusinessName(legalBusinessName: String) =
            legalBusinessName(JsonField.of(legalBusinessName))

        /** Legal (formal) business name. */
        fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
            this.legalBusinessName = legalBusinessName
        }

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
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
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
            this.dbaBusinessName = dbaBusinessName
        }

        /** Parent company name (if applicable). */
        fun parentCompany(parentCompany: String) = parentCompany(JsonField.of(parentCompany))

        /** Parent company name (if applicable). */
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

        fun build(): KybBusinessEntity =
            KybBusinessEntity(
                checkRequired("address", address),
                checkRequired("governmentId", governmentId),
                checkRequired("legalBusinessName", legalBusinessName),
                checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                dbaBusinessName,
                parentCompany,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("address1")
        @ExcludeMissing
        private val address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2")
        @ExcludeMissing
        private val address2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Valid deliverable address (no PO boxes). */
        fun address1(): String = address1.getRequired("address1")

        /** Name of city. */
        fun city(): String = city.getRequired("city")

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         */
        fun country(): String = country.getRequired("country")

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
        fun state(): String = state.getRequired("state")

        /** Unit or apartment number (if applicable). */
        fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

        /** Valid deliverable address (no PO boxes). */
        @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /** Name of city. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
         * alpha-3 three-character format.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a five-digit
         * ZIP or nine-digit ZIP+4.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /** Unit or apartment number (if applicable). */
        @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** Valid deliverable address (no PO boxes). */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

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
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
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
                    checkRequired("address1", address1),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
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
