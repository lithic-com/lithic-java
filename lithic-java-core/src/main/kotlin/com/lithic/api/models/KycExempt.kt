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
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = KycExempt.Builder::class)
@NoAutoDetect
class KycExempt
private constructor(
    private val address: JsonField<Address>,
    private val businessAccountToken: JsonField<String>,
    private val email: JsonField<String>,
    private val externalId: JsonField<String>,
    private val firstName: JsonField<String>,
    private val kycExemptionType: JsonField<KycExemptionType>,
    private val lastName: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val workflow: JsonField<Workflow>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    fun address(): Address = address.getRequired("address")

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /** The KYC Exempt user's email */
    fun email(): String = email.getRequired("email")

    /** A user provided id that can be used to link an account holder with an external system */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

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
     * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
     * APO/FPO are acceptable.
     */
    @JsonProperty("address") @ExcludeMissing fun _address() = address

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken() = businessAccountToken

    /** The KYC Exempt user's email */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** A user provided id that can be used to link an account holder with an external system */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /** The KYC Exempt user's first name */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /** Specifies the type of KYC Exempt user */
    @JsonProperty("kyc_exemption_type") @ExcludeMissing fun _kycExemptionType() = kycExemptionType

    /** The KYC Exempt user's last name */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /** The KYC Exempt user's phone number */
    @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

    /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow() = workflow

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): KycExempt = apply {
        if (!validated) {
            address().validate()
            businessAccountToken()
            email()
            externalId()
            firstName()
            kycExemptionType()
            lastName()
            phoneNumber()
            workflow()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KycExempt &&
            this.address == other.address &&
            this.businessAccountToken == other.businessAccountToken &&
            this.email == other.email &&
            this.externalId == other.externalId &&
            this.firstName == other.firstName &&
            this.kycExemptionType == other.kycExemptionType &&
            this.lastName == other.lastName &&
            this.phoneNumber == other.phoneNumber &&
            this.workflow == other.workflow &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    address,
                    businessAccountToken,
                    email,
                    externalId,
                    firstName,
                    kycExemptionType,
                    lastName,
                    phoneNumber,
                    workflow,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "KycExempt{address=$address, businessAccountToken=$businessAccountToken, email=$email, externalId=$externalId, firstName=$firstName, kycExemptionType=$kycExemptionType, lastName=$lastName, phoneNumber=$phoneNumber, workflow=$workflow, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var address: JsonField<Address> = JsonMissing.of()
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var kycExemptionType: JsonField<KycExemptionType> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var workflow: JsonField<Workflow> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kycExempt: KycExempt) = apply {
            this.address = kycExempt.address
            this.businessAccountToken = kycExempt.businessAccountToken
            this.email = kycExempt.email
            this.externalId = kycExempt.externalId
            this.firstName = kycExempt.firstName
            this.kycExemptionType = kycExempt.kycExemptionType
            this.lastName = kycExempt.lastName
            this.phoneNumber = kycExempt.phoneNumber
            this.workflow = kycExempt.workflow
            additionalProperties(kycExempt.additionalProperties)
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
        @JsonProperty("address")
        @ExcludeMissing
        fun address(address: JsonField<Address>) = apply { this.address = address }

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
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** The KYC Exempt user's email */
        fun email(email: String) = email(JsonField.of(email))

        /** The KYC Exempt user's email */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** A user provided id that can be used to link an account holder with an external system */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The KYC Exempt user's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The KYC Exempt user's first name */
        @JsonProperty("first_name")
        @ExcludeMissing
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Specifies the type of KYC Exempt user */
        fun kycExemptionType(kycExemptionType: KycExemptionType) =
            kycExemptionType(JsonField.of(kycExemptionType))

        /** Specifies the type of KYC Exempt user */
        @JsonProperty("kyc_exemption_type")
        @ExcludeMissing
        fun kycExemptionType(kycExemptionType: JsonField<KycExemptionType>) = apply {
            this.kycExemptionType = kycExemptionType
        }

        /** The KYC Exempt user's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The KYC Exempt user's last name */
        @JsonProperty("last_name")
        @ExcludeMissing
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The KYC Exempt user's phone number */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /** The KYC Exempt user's phone number */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        @JsonProperty("workflow")
        @ExcludeMissing
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

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

        fun build(): KycExempt =
            KycExempt(
                address,
                businessAccountToken,
                email,
                externalId,
                firstName,
                kycExemptionType,
                lastName,
                phoneNumber,
                workflow,
                additionalProperties.toUnmodifiable(),
            )
    }

    class KycExemptionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KycExemptionType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTHORIZED_USER = KycExemptionType(JsonField.of("AUTHORIZED_USER"))

            @JvmField val PREPAID_CARD_USER = KycExemptionType(JsonField.of("PREPAID_CARD_USER"))

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

            return other is Workflow && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val KYC_EXEMPT = Workflow(JsonField.of("KYC_EXEMPT"))

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
    }
}
