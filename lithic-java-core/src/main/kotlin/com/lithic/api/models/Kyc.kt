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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Kyc
@JsonCreator
private constructor(
    @JsonProperty("individual")
    @ExcludeMissing
    private val individual: JsonField<Individual> = JsonMissing.of(),
    @JsonProperty("tos_timestamp")
    @ExcludeMissing
    private val tosTimestamp: JsonField<String> = JsonMissing.of(),
    @JsonProperty("workflow")
    @ExcludeMissing
    private val workflow: JsonField<Workflow> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("kyc_passed_timestamp")
    @ExcludeMissing
    private val kycPassedTimestamp: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Information on individual for whom the account is being opened and KYC is being run. */
    fun individual(): Individual = individual.getRequired("individual")

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    fun tosTimestamp(): String = tosTimestamp.getRequired("tos_timestamp")

    /** Specifies the type of KYC workflow to run. */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /** A user provided id that can be used to link an account holder with an external system */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual with a
     * pass result.
     *
     * This field is required only if workflow type is `KYC_BYO`.
     */
    fun kycPassedTimestamp(): Optional<String> =
        Optional.ofNullable(kycPassedTimestamp.getNullable("kyc_passed_timestamp"))

    /** Information on individual for whom the account is being opened and KYC is being run. */
    @JsonProperty("individual")
    @ExcludeMissing
    fun _individual(): JsonField<Individual> = individual

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    @JsonProperty("tos_timestamp")
    @ExcludeMissing
    fun _tosTimestamp(): JsonField<String> = tosTimestamp

    /** Specifies the type of KYC workflow to run. */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow(): JsonField<Workflow> = workflow

    /** A user provided id that can be used to link an account holder with an external system */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual with a
     * pass result.
     *
     * This field is required only if workflow type is `KYC_BYO`.
     */
    @JsonProperty("kyc_passed_timestamp")
    @ExcludeMissing
    fun _kycPassedTimestamp(): JsonField<String> = kycPassedTimestamp

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Kyc = apply {
        if (validated) {
            return@apply
        }

        individual().validate()
        tosTimestamp()
        workflow()
        externalId()
        kycPassedTimestamp()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Kyc].
         *
         * The following fields are required:
         * ```java
         * .individual()
         * .tosTimestamp()
         * .workflow()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Kyc]. */
    class Builder internal constructor() {

        private var individual: JsonField<Individual>? = null
        private var tosTimestamp: JsonField<String>? = null
        private var workflow: JsonField<Workflow>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var kycPassedTimestamp: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kyc: Kyc) = apply {
            individual = kyc.individual
            tosTimestamp = kyc.tosTimestamp
            workflow = kyc.workflow
            externalId = kyc.externalId
            kycPassedTimestamp = kyc.kycPassedTimestamp
            additionalProperties = kyc.additionalProperties.toMutableMap()
        }

        /** Information on individual for whom the account is being opened and KYC is being run. */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /** Information on individual for whom the account is being opened and KYC is being run. */
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: String) = tosTimestamp(JsonField.of(tosTimestamp))

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: JsonField<String>) = apply {
            this.tosTimestamp = tosTimestamp
        }

        /** Specifies the type of KYC workflow to run. */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /** Specifies the type of KYC workflow to run. */
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual
         * with a pass result.
         *
         * This field is required only if workflow type is `KYC_BYO`.
         */
        fun kycPassedTimestamp(kycPassedTimestamp: String) =
            kycPassedTimestamp(JsonField.of(kycPassedTimestamp))

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual
         * with a pass result.
         *
         * This field is required only if workflow type is `KYC_BYO`.
         */
        fun kycPassedTimestamp(kycPassedTimestamp: JsonField<String>) = apply {
            this.kycPassedTimestamp = kycPassedTimestamp
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

        fun build(): Kyc =
            Kyc(
                checkRequired("individual", individual),
                checkRequired("tosTimestamp", tosTimestamp),
                checkRequired("workflow", workflow),
                externalId,
                kycPassedTimestamp,
                additionalProperties.toImmutable(),
            )
    }

    /** Information on individual for whom the account is being opened and KYC is being run. */
    @NoAutoDetect
    class Individual
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("government_id")
        @ExcludeMissing
        private val governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        fun address(): Address = address.getRequired("address")

        /** Individual's date of birth, as an RFC 3339 date. */
        fun dob(): String = dob.getRequired("dob")

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        fun email(): String = email.getRequired("email")

        /** Individual's first name, as it appears on government-issued identity documents. */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id")
        @ExcludeMissing
        fun _governmentId(): JsonField<String> = governmentId

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            dob()
            email()
            firstName()
            governmentId()
            lastName()
            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Individual].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .dob()
             * .email()
             * .firstName()
             * .governmentId()
             * .lastName()
             * .phoneNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Individual]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dob: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var governmentId: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individual: Individual) = apply {
                address = individual.address
                dob = individual.dob
                email = individual.email
                firstName = individual.firstName
                governmentId = individual.governmentId
                lastName = individual.lastName
                phoneNumber = individual.phoneNumber
                additionalProperties = individual.additionalProperties.toMutableMap()
            }

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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

            fun build(): Individual =
                Individual(
                    checkRequired("address", address),
                    checkRequired("dob", dob),
                    checkRequired("email", email),
                    checkRequired("firstName", firstName),
                    checkRequired("governmentId", governmentId),
                    checkRequired("lastName", lastName),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Individual && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Specifies the type of KYC workflow to run. */
    class Workflow @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val KYC_BASIC = of("KYC_BASIC")

            @JvmField val KYC_BYO = of("KYC_BYO")

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        /** An enum containing [Workflow]'s known values. */
        enum class Known {
            KYC_BASIC,
            KYC_BYO,
        }

        /**
         * An enum containing [Workflow]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Workflow] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KYC_BASIC,
            KYC_BYO,
            /** An enum member indicating that [Workflow] was instantiated with an unknown value. */
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
                KYC_BASIC -> Value.KYC_BASIC
                KYC_BYO -> Value.KYC_BYO
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
                KYC_BASIC -> Known.KYC_BASIC
                KYC_BYO -> Known.KYC_BYO
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Workflow && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Kyc && individual == other.individual && tosTimestamp == other.tosTimestamp && workflow == other.workflow && externalId == other.externalId && kycPassedTimestamp == other.kycPassedTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(individual, tosTimestamp, workflow, externalId, kycPassedTimestamp, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Kyc{individual=$individual, tosTimestamp=$tosTimestamp, workflow=$workflow, externalId=$externalId, kycPassedTimestamp=$kycPassedTimestamp, additionalProperties=$additionalProperties}"
}
