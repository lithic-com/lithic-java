// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class AccountHolderResubmitParams
constructor(
    private val accountHolderToken: String,
    private val individual: Individual,
    private val tosTimestamp: String,
    private val workflow: Workflow,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun individual(): Individual = individual

    fun tosTimestamp(): String = tosTimestamp

    fun workflow(): Workflow = workflow

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): AccountHolderResubmitBody {
        return AccountHolderResubmitBody(
            individual,
            tosTimestamp,
            workflow,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountHolderResubmitBody.Builder::class)
    @NoAutoDetect
    class AccountHolderResubmitBody
    internal constructor(
        private val individual: Individual?,
        private val tosTimestamp: String?,
        private val workflow: Workflow?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Information on individual for whom the account is being opened and KYC is being re-run.
         */
        @JsonProperty("individual") fun individual(): Individual? = individual

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        @JsonProperty("tos_timestamp") fun tosTimestamp(): String? = tosTimestamp

        @JsonProperty("workflow") fun workflow(): Workflow? = workflow

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individual: Individual? = null
            private var tosTimestamp: String? = null
            private var workflow: Workflow? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderResubmitBody: AccountHolderResubmitBody) = apply {
                this.individual = accountHolderResubmitBody.individual
                this.tosTimestamp = accountHolderResubmitBody.tosTimestamp
                this.workflow = accountHolderResubmitBody.workflow
                additionalProperties(accountHolderResubmitBody.additionalProperties)
            }

            /**
             * Information on individual for whom the account is being opened and KYC is being
             * re-run.
             */
            @JsonProperty("individual")
            fun individual(individual: Individual) = apply { this.individual = individual }

            /**
             * An RFC 3339 timestamp indicating when the account holder accepted the applicable
             * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
             * implementation with Lithic.
             */
            @JsonProperty("tos_timestamp")
            fun tosTimestamp(tosTimestamp: String) = apply { this.tosTimestamp = tosTimestamp }

            @JsonProperty("workflow")
            fun workflow(workflow: Workflow) = apply { this.workflow = workflow }

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
                    checkNotNull(individual) { "`individual` is required but was not set" },
                    checkNotNull(tosTimestamp) { "`tosTimestamp` is required but was not set" },
                    checkNotNull(workflow) { "`workflow` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderResubmitBody && individual == other.individual && tosTimestamp == other.tosTimestamp && workflow == other.workflow && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individual, tosTimestamp, workflow, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderResubmitBody{individual=$individual, tosTimestamp=$tosTimestamp, workflow=$workflow, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var individual: Individual? = null
        private var tosTimestamp: String? = null
        private var workflow: Workflow? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderResubmitParams: AccountHolderResubmitParams) = apply {
            accountHolderToken = accountHolderResubmitParams.accountHolderToken
            individual = accountHolderResubmitParams.individual
            tosTimestamp = accountHolderResubmitParams.tosTimestamp
            workflow = accountHolderResubmitParams.workflow
            additionalHeaders = accountHolderResubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountHolderResubmitParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                accountHolderResubmitParams.additionalBodyProperties.toMutableMap()
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /**
         * Information on individual for whom the account is being opened and KYC is being re-run.
         */
        fun individual(individual: Individual) = apply { this.individual = individual }

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: String) = apply { this.tosTimestamp = tosTimestamp }

        fun workflow(workflow: Workflow) = apply { this.workflow = workflow }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AccountHolderResubmitParams =
            AccountHolderResubmitParams(
                checkNotNull(accountHolderToken) {
                    "`accountHolderToken` is required but was not set"
                },
                checkNotNull(individual) { "`individual` is required but was not set" },
                checkNotNull(tosTimestamp) { "`tosTimestamp` is required but was not set" },
                checkNotNull(workflow) { "`workflow` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Information on individual for whom the account is being opened and KYC is being re-run. */
    @JsonDeserialize(builder = Individual.Builder::class)
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

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") fun address(): Address? = address

        /** Individual's date of birth, as an RFC 3339 date. */
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

            /** Individual's date of birth, as an RFC 3339 date. */
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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(dob) { "`dob` is required but was not set" },
                    checkNotNull(email) { "`email` is required but was not set" },
                    checkNotNull(firstName) { "`firstName` is required but was not set" },
                    checkNotNull(governmentId) { "`governmentId` is required but was not set" },
                    checkNotNull(lastName) { "`lastName` is required but was not set" },
                    checkNotNull(phoneNumber) { "`phoneNumber` is required but was not set" },
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

    class Workflow
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Workflow && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val KYC_ADVANCED = of("KYC_ADVANCED")

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
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderResubmitParams && accountHolderToken == other.accountHolderToken && individual == other.individual && tosTimestamp == other.tosTimestamp && workflow == other.workflow && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHolderToken, individual, tosTimestamp, workflow, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AccountHolderResubmitParams{accountHolderToken=$accountHolderToken, individual=$individual, tosTimestamp=$tosTimestamp, workflow=$workflow, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
