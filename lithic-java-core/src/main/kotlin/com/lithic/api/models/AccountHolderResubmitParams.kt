package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class AccountHolderResubmitParams
constructor(
    private val accountHolderToken: String,
    private val workflow: Workflow,
    private val tosTimestamp: String,
    private val individual: Individual,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {
    fun accountHolderToken(): String = accountHolderToken

    fun workflow(): Workflow = workflow

    fun tosTimestamp(): String = tosTimestamp

    fun individual(): Individual = individual

    @JvmSynthetic
    internal fun toBody(): AccountHolderResubmitBody =
        AccountHolderResubmitBody(workflow, tosTimestamp, individual, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountHolderResubmitBody
    internal constructor(
        private val workflow: Workflow?,
        private val tosTimestamp: String?,
        private val individual: Individual?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {
        private var hashCode: Int = 0

        @JsonProperty("workflow") fun workflow(): Workflow? = workflow

        /**
         * An ISO 8601 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        @JsonProperty("tos_timestamp") fun tosTimestamp(): String? = tosTimestamp

        /**
         * Information on individual for whom the account is being opened and KYC is being re-run.
         */
        @JsonProperty("individual") fun individual(): Individual? = individual

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderResubmitBody &&
                workflow == other.workflow &&
                tosTimestamp == other.tosTimestamp &&
                individual == other.individual &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        workflow,
                        tosTimestamp,
                        individual,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderResubmitBody{workflow=$workflow, tosTimestamp=$tosTimestamp, individual=$individual, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var workflow: Workflow? = null
            private var tosTimestamp: String? = null
            private var individual: Individual? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderResubmitBody: AccountHolderResubmitBody) = apply {
                this.workflow = accountHolderResubmitBody.workflow
                this.tosTimestamp = accountHolderResubmitBody.tosTimestamp
                this.individual = accountHolderResubmitBody.individual
                additionalProperties(accountHolderResubmitBody.additionalProperties)
            }

            @JsonProperty("workflow")
            fun workflow(workflow: Workflow) = apply { this.workflow = workflow }

            /**
             * An ISO 8601 timestamp indicating when the account holder accepted the applicable
             * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
             * implementation with Lithic.
             */
            @JsonProperty("tos_timestamp")
            fun tosTimestamp(tosTimestamp: String) = apply { this.tosTimestamp = tosTimestamp }

            /**
             * Information on individual for whom the account is being opened and KYC is being
             * re-run.
             */
            @JsonProperty("individual")
            fun individual(individual: Individual) = apply { this.individual = individual }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountHolderResubmitBody =
                AccountHolderResubmitBody(
                    workflow!!,
                    tosTimestamp!!,
                    individual!!,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderResubmitParams &&
            accountHolderToken == other.accountHolderToken &&
            workflow == other.workflow &&
            tosTimestamp == other.tosTimestamp &&
            individual == other.individual &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountHolderToken,
            workflow,
            tosTimestamp,
            individual,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountHolderResubmitParams{accountHolderToken=$accountHolderToken, workflow=$workflow, tosTimestamp=$tosTimestamp, individual=$individual, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var accountHolderToken: String? = null
        private var workflow: Workflow? = null
        private var tosTimestamp: String? = null
        private var individual: Individual? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderResubmitParams: AccountHolderResubmitParams) = apply {
            this.accountHolderToken = accountHolderResubmitParams.accountHolderToken
            this.workflow = accountHolderResubmitParams.workflow
            this.tosTimestamp = accountHolderResubmitParams.tosTimestamp
            this.individual = accountHolderResubmitParams.individual
            additionalQueryParams(accountHolderResubmitParams.additionalQueryParams)
            additionalHeaders(accountHolderResubmitParams.additionalHeaders)
            additionalBodyProperties(accountHolderResubmitParams.additionalBodyProperties)
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        fun workflow(workflow: Workflow) = apply { this.workflow = workflow }

        /**
         * An ISO 8601 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: String) = apply { this.tosTimestamp = tosTimestamp }

        /**
         * Information on individual for whom the account is being opened and KYC is being re-run.
         */
        fun individual(individual: Individual) = apply { this.individual = individual }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountHolderResubmitParams =
            AccountHolderResubmitParams(
                accountHolderToken!!,
                workflow!!,
                tosTimestamp!!,
                individual!!,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Workflow @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Workflow && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {
            @JvmField val KYC_ADVANCED = Workflow(JsonField.of("KYC_ADVANCED"))

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        enum class Known {
            KYC_ADVANCED,
        }

        enum class Value {
            KYC_ADVANCED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KYC_ADVANCED -> Value.KYC_ADVANCED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KYC_ADVANCED -> Known.KYC_ADVANCED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown AccountHolderResubmitBody.Workflow: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Information on individual for whom the account is being opened and KYC is being re-run. */
    @NoAutoDetect
    class Individual
    private constructor(
        private val address: Address?,
        private val dob: String?,
        private val email: String?,
        private val firstName: String?,
        private val governmentId: String?,
        private val lastName: String?,
        private val phoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {
        private var hashCode: Int = 0

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") fun address(): Address? = address

        /** Individual's date of birth, as an ISO 8601 date. */
        @JsonProperty("dob") fun dob(): String? = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") fun email(): String? = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id") fun governmentId(): String? = governmentId

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Individual &&
                address == other.address &&
                dob == other.dob &&
                email == other.email &&
                firstName == other.firstName &&
                governmentId == other.governmentId &&
                lastName == other.lastName &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        address,
                        dob,
                        email,
                        firstName,
                        governmentId,
                        lastName,
                        phoneNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var address: Address? = null
            private var dob: String? = null
            private var email: String? = null
            private var firstName: String? = null
            private var governmentId: String? = null
            private var lastName: String? = null
            private var phoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individual: Individual) = apply {
                this.address = individual.address
                this.dob = individual.dob
                this.email = individual.email
                this.firstName = individual.firstName
                this.governmentId = individual.governmentId
                this.lastName = individual.lastName
                this.phoneNumber = individual.phoneNumber
                additionalProperties(individual.additionalProperties)
            }

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /** Individual's date of birth, as an ISO 8601 date. */
            @JsonProperty("dob") fun dob(dob: String) = apply { this.dob = dob }

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            @JsonProperty("government_id")
            fun governmentId(governmentId: String) = apply { this.governmentId = governmentId }

            /** Individual's last name, as it appears on government-issued identity documents. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Individual =
                Individual(
                    address!!,
                    dob!!,
                    email!!,
                    firstName!!,
                    governmentId!!,
                    lastName!!,
                    phoneNumber!!,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @NoAutoDetect
        class Address
        private constructor(
            private val address1: String?,
            private val address2: String?,
            private val city: String?,
            private val country: String?,
            private val postalCode: String?,
            private val state: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {
            private var hashCode: Int = 0

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1") fun address1(): String? = address1

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2") fun address2(): String? = address2

            /** Name of city. */
            @JsonProperty("city") fun city(): String? = city

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            @JsonProperty("country") fun country(): String? = country

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state") fun state(): String? = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    address1 == other.address1 &&
                    address2 == other.address2 &&
                    city == other.city &&
                    country == other.country &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            address1,
                            address2,
                            city,
                            country,
                            postalCode,
                            state,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"

            companion object {
                @JvmStatic fun builder() = Builder()
            }

            class Builder {
                private var address1: String? = null
                private var address2: String? = null
                private var city: String? = null
                private var country: String? = null
                private var postalCode: String? = null
                private var state: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.address1 = address.address1
                    this.address2 = address.address2
                    this.city = address.city
                    this.country = address.country
                    this.postalCode = address.postalCode
                    this.state = address.state
                    additionalProperties(address.additionalProperties)
                }

                /** Valid deliverable address (no PO boxes). */
                @JsonProperty("address1")
                fun address1(address1: String) = apply { this.address1 = address1 }

                /** Unit or apartment number (if applicable). */
                @JsonProperty("address2")
                fun address2(address2: String) = apply { this.address2 = address2 }

                /** Name of city. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

                /**
                 * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                 * five-digit ZIP or nine-digit ZIP+4.
                 */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
                 */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address =
                    Address(
                        address1!!,
                        address2,
                        city!!,
                        country!!,
                        postalCode!!,
                        state!!,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
