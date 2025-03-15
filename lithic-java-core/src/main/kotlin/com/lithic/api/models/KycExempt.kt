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
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): Address = address.getRequired("address")

    /**
     * The KYC Exempt user's email
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The KYC Exempt user's first name
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("first_name")

    /**
     * Specifies the type of KYC Exempt user
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kycExemptionType(): KycExemptionType = kycExemptionType.getRequired("kyc_exemption_type")

    /**
     * The KYC Exempt user's last name
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("last_name")

    /**
     * The KYC Exempt user's phone number, entered in E.164 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

    /**
     * Specifies the workflow type. This must be 'KYC_EXEMPT'
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /**
     * A user provided id that can be used to link an account holder with an external system
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

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
     * Returns the raw JSON value of [kycExemptionType].
     *
     * Unlike [kycExemptionType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("kyc_exemption_type")
    @ExcludeMissing
    fun _kycExemptionType(): JsonField<KycExemptionType> = kycExemptionType

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
     * Returns the raw JSON value of [workflow].
     *
     * Unlike [workflow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow(): JsonField<Workflow> = workflow

    /**
     * Returns the raw JSON value of [businessAccountToken].
     *
     * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken(): JsonField<String> = businessAccountToken

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * Returns a mutable builder for constructing an instance of [KycExempt].
         *
         * The following fields are required:
         * ```java
         * .address()
         * .email()
         * .firstName()
         * .kycExemptionType()
         * .lastName()
         * .phoneNumber()
         * .workflow()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KycExempt]. */
    class Builder internal constructor() {

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
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** The KYC Exempt user's email */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The KYC Exempt user's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Specifies the type of KYC Exempt user */
        fun kycExemptionType(kycExemptionType: KycExemptionType) =
            kycExemptionType(JsonField.of(kycExemptionType))

        /**
         * Sets [Builder.kycExemptionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kycExemptionType] with a well-typed [KycExemptionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun kycExemptionType(kycExemptionType: JsonField<KycExemptionType>) = apply {
            this.kycExemptionType = kycExemptionType
        }

        /** The KYC Exempt user's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The KYC Exempt user's phone number, entered in E.164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /**
         * Sets [Builder.workflow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflow] with a well-typed [Workflow] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) =
            businessAccountToken(JsonField.of(businessAccountToken))

        /**
         * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
                checkRequired("address", address),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("kycExemptionType", kycExemptionType),
                checkRequired("lastName", lastName),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("workflow", workflow),
                businessAccountToken,
                externalId,
                additionalProperties.toImmutable(),
            )
    }

    /** Specifies the type of KYC Exempt user */
    class KycExemptionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AUTHORIZED_USER = of("AUTHORIZED_USER")

            @JvmField val PREPAID_CARD_USER = of("PREPAID_CARD_USER")

            @JvmStatic fun of(value: String) = KycExemptionType(JsonField.of(value))
        }

        /** An enum containing [KycExemptionType]'s known values. */
        enum class Known {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
        }

        /**
         * An enum containing [KycExemptionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [KycExemptionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
            /**
             * An enum member indicating that [KycExemptionType] was instantiated with an unknown
             * value.
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
                AUTHORIZED_USER -> Value.AUTHORIZED_USER
                PREPAID_CARD_USER -> Value.PREPAID_CARD_USER
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
                AUTHORIZED_USER -> Known.AUTHORIZED_USER
                PREPAID_CARD_USER -> Known.PREPAID_CARD_USER
                else -> throw LithicInvalidDataException("Unknown KycExemptionType: $value")
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

            return /* spotless:off */ other is KycExemptionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
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

            @JvmField val KYC_EXEMPT = of("KYC_EXEMPT")

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        /** An enum containing [Workflow]'s known values. */
        enum class Known {
            KYC_EXEMPT
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
            KYC_EXEMPT,
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
                KYC_EXEMPT -> Value.KYC_EXEMPT
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
                KYC_EXEMPT -> Known.KYC_EXEMPT
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

        return /* spotless:off */ other is KycExempt && address == other.address && email == other.email && firstName == other.firstName && kycExemptionType == other.kycExemptionType && lastName == other.lastName && phoneNumber == other.phoneNumber && workflow == other.workflow && businessAccountToken == other.businessAccountToken && externalId == other.externalId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address, email, firstName, kycExemptionType, lastName, phoneNumber, workflow, businessAccountToken, externalId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KycExempt{address=$address, email=$email, firstName=$firstName, kycExemptionType=$kycExemptionType, lastName=$lastName, phoneNumber=$phoneNumber, workflow=$workflow, businessAccountToken=$businessAccountToken, externalId=$externalId, additionalProperties=$additionalProperties}"
}
