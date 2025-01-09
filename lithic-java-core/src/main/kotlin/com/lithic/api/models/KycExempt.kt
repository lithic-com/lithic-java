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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class KycExempt
@JsonCreator
private constructor(
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("kyc_exemption_type")
    @ExcludeMissing
    private val kycExemptionType: JsonField<KycExemptionType> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("workflow")
    @ExcludeMissing
    private val workflow: JsonField<Workflow> = JsonMissing.of(),
    @JsonProperty("business_account_token")
    @ExcludeMissing
    private val businessAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    fun address(): Address = address.getRequired("address")

    /** The KYC Exempt user's email */
    fun email(): String = email.getRequired("email")

    /** The KYC Exempt user's first name */
    fun firstName(): String = firstName.getRequired("first_name")

    /** Specifies the type of KYC Exempt user */
    fun kycExemptionType(): KycExemptionType = kycExemptionType.getRequired("kyc_exemption_type")

    /** The KYC Exempt user's last name */
    fun lastName(): String = lastName.getRequired("last_name")

    /** The KYC Exempt user's phone number */
    fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

    /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /** A user provided id that can be used to link an account holder with an external system */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /** The KYC Exempt user's email */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** The KYC Exempt user's first name */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /** Specifies the type of KYC Exempt user */
    @JsonProperty("kyc_exemption_type")
    @ExcludeMissing
    fun _kycExemptionType(): JsonField<KycExemptionType> = kycExemptionType

    /** The KYC Exempt user's last name */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /** The KYC Exempt user's phone number */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow(): JsonField<Workflow> = workflow

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken(): JsonField<String> = businessAccountToken

    /** A user provided id that can be used to link an account holder with an external system */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): KycExempt = apply {
        if (validated) {
            return@apply
        }

        address().validate()
        email()
        firstName()
        kycExemptionType()
        lastName()
        phoneNumber()
        workflow()
        businessAccountToken()
        externalId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var address: JsonField<Address>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var kycExemptionType: JsonField<KycExemptionType>? = null
        private var lastName: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var workflow: JsonField<Workflow>? = null
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kycExempt: KycExempt) = apply {
            address = kycExempt.address
            email = kycExempt.email
            firstName = kycExempt.firstName
            kycExemptionType = kycExempt.kycExemptionType
            lastName = kycExempt.lastName
            phoneNumber = kycExempt.phoneNumber
            workflow = kycExempt.workflow
            businessAccountToken = kycExempt.businessAccountToken
            externalId = kycExempt.externalId
            additionalProperties = kycExempt.additionalProperties.toMutableMap()
        }

        /**
         * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not
         * acceptable; APO/FPO are acceptable.
         */
        fun address(address: Address) = address(JsonField.of(address))

        /**
         * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not
         * acceptable; APO/FPO are acceptable.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** The KYC Exempt user's email */
        fun email(email: String) = email(JsonField.of(email))

        /** The KYC Exempt user's email */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The KYC Exempt user's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The KYC Exempt user's first name */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Specifies the type of KYC Exempt user */
        fun kycExemptionType(kycExemptionType: KycExemptionType) =
            kycExemptionType(JsonField.of(kycExemptionType))

        /** Specifies the type of KYC Exempt user */
        fun kycExemptionType(kycExemptionType: JsonField<KycExemptionType>) = apply {
            this.kycExemptionType = kycExemptionType
        }

        /** The KYC Exempt user's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The KYC Exempt user's last name */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The KYC Exempt user's phone number */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /** The KYC Exempt user's phone number */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) =
            businessAccountToken(JsonField.of(businessAccountToken))

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

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

        fun build(): KycExempt =
            KycExempt(
                checkNotNull(address) { "`address` is required but was not set" },
                checkNotNull(email) { "`email` is required but was not set" },
                checkNotNull(firstName) { "`firstName` is required but was not set" },
                checkNotNull(kycExemptionType) { "`kycExemptionType` is required but was not set" },
                checkNotNull(lastName) { "`lastName` is required but was not set" },
                checkNotNull(phoneNumber) { "`phoneNumber` is required but was not set" },
                checkNotNull(workflow) { "`workflow` is required but was not set" },
                businessAccountToken,
                externalId,
                additionalProperties.toImmutable(),
            )
    }

    class KycExemptionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AUTHORIZED_USER = of("AUTHORIZED_USER")

            @JvmField val PREPAID_CARD_USER = of("PREPAID_CARD_USER")

            @JvmStatic fun of(value: String) = KycExemptionType(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
        }

        enum class Value {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZED_USER -> Value.AUTHORIZED_USER
                PREPAID_CARD_USER -> Value.PREPAID_CARD_USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZED_USER -> Known.AUTHORIZED_USER
                PREPAID_CARD_USER -> Known.PREPAID_CARD_USER
                else -> throw LithicInvalidDataException("Unknown KycExemptionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is KycExemptionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Workflow
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val KYC_EXEMPT = of("KYC_EXEMPT")

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        enum class Known {
            KYC_EXEMPT,
        }

        enum class Value {
            KYC_EXEMPT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KYC_EXEMPT -> Value.KYC_EXEMPT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KYC_EXEMPT -> Known.KYC_EXEMPT
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is KycExempt && address == other.address && email == other.email && firstName == other.firstName && kycExemptionType == other.kycExemptionType && lastName == other.lastName && phoneNumber == other.phoneNumber && workflow == other.workflow && businessAccountToken == other.businessAccountToken && externalId == other.externalId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address, email, firstName, kycExemptionType, lastName, phoneNumber, workflow, businessAccountToken, externalId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KycExempt{address=$address, email=$email, firstName=$firstName, kycExemptionType=$kycExemptionType, lastName=$lastName, phoneNumber=$phoneNumber, workflow=$workflow, businessAccountToken=$businessAccountToken, externalId=$externalId, additionalProperties=$additionalProperties}"
}
