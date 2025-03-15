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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AccountHolderSimulateEnrollmentReviewResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    private val beneficialOwnerEntities: JsonField<List<KybBusinessEntity>> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    private val beneficialOwnerIndividuals: JsonField<List<Individual>> = JsonMissing.of(),
    @JsonProperty("business_account_token")
    @ExcludeMissing
    private val businessAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_entity")
    @ExcludeMissing
    private val businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of(),
    @JsonProperty("control_person")
    @ExcludeMissing
    private val controlPerson: JsonField<Individual> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("exemption_type")
    @ExcludeMissing
    private val exemptionType: JsonField<ExemptionType> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual")
    @ExcludeMissing
    private val individual: JsonField<Individual> = JsonMissing.of(),
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    private val natureOfBusiness: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("required_documents")
    @ExcludeMissing
    private val requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("status_reasons")
    @ExcludeMissing
    private val statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of(),
    @JsonProperty("user_type")
    @ExcludeMissing
    private val userType: JsonField<UserType> = JsonMissing.of(),
    @JsonProperty("verification_application")
    @ExcludeMissing
    private val verificationApplication: JsonField<VerificationApplication> = JsonMissing.of(),
    @JsonProperty("website_url")
    @ExcludeMissing
    private val websiteUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Globally unique identifier for the account holder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /**
     * Globally unique identifier for the account.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficialOwnerEntities(): Optional<List<KybBusinessEntity>> =
        Optional.ofNullable(beneficialOwnerEntities.getNullable("beneficial_owner_entities"))

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficialOwnerIndividuals(): Optional<List<Individual>> =
        Optional.ofNullable(beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals"))

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
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessEntity(): Optional<KybBusinessEntity> =
        Optional.ofNullable(businessEntity.getNullable("business_entity"))

    /**
     * Only present when user_type == "BUSINESS".
     *
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer,
     *
     * Managing Member, General Partner, President, Vice President, or Treasurer). This can be an
     * executive, or someone who will have program-wide access
     *
     * to the cards that Lithic will provide. In some cases, this individual could also be a
     * beneficial owner listed above.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun controlPerson(): Optional<Individual> =
        Optional.ofNullable(controlPerson.getNullable("control_person"))

    /**
     * Timestamp of when the account holder was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /**
     * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder is
     * not KYC-Exempt.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exemptionType(): Optional<ExemptionType> =
        Optional.ofNullable(exemptionType.getNullable("exemption_type"))

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individual(): Optional<Individual> =
        Optional.ofNullable(individual.getNullable("individual"))

    /**
     * Only present when user_type == "BUSINESS". User-submitted description of the business.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun natureOfBusiness(): Optional<String> =
        Optional.ofNullable(natureOfBusiness.getNullable("nature_of_business"))

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> =
        Optional.ofNullable(phoneNumber.getNullable("phone_number"))

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredDocuments(): Optional<List<RequiredDocument>> =
        Optional.ofNullable(requiredDocuments.getNullable("required_documents"))

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusReasons(): Optional<List<StatusReasons>> =
        Optional.ofNullable(statusReasons.getNullable("status_reasons"))

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present.
     *
     * If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities",
     *
     * "nature_of_business", and "website_url" attributes will be present.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userType(): Optional<UserType> = Optional.ofNullable(userType.getNullable("user_type"))

    /**
     * Information about the most recent identity verification attempt
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verificationApplication(): Optional<VerificationApplication> =
        Optional.ofNullable(verificationApplication.getNullable("verification_application"))

    /**
     * Only present when user_type == "BUSINESS". Business's primary website.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun websiteUrl(): Optional<String> = Optional.ofNullable(websiteUrl.getNullable("website_url"))

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [beneficialOwnerEntities].
     *
     * Unlike [beneficialOwnerEntities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities(): JsonField<List<KybBusinessEntity>> = beneficialOwnerEntities

    /**
     * Returns the raw JSON value of [beneficialOwnerIndividuals].
     *
     * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals(): JsonField<List<Individual>> = beneficialOwnerIndividuals

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
     * Returns the raw JSON value of [businessEntity].
     *
     * Unlike [businessEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_entity")
    @ExcludeMissing
    fun _businessEntity(): JsonField<KybBusinessEntity> = businessEntity

    /**
     * Returns the raw JSON value of [controlPerson].
     *
     * Unlike [controlPerson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("control_person")
    @ExcludeMissing
    fun _controlPerson(): JsonField<Individual> = controlPerson

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [exemptionType].
     *
     * Unlike [exemptionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exemption_type")
    @ExcludeMissing
    fun _exemptionType(): JsonField<ExemptionType> = exemptionType

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [individual].
     *
     * Unlike [individual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual")
    @ExcludeMissing
    fun _individual(): JsonField<Individual> = individual

    /**
     * Returns the raw JSON value of [natureOfBusiness].
     *
     * Unlike [natureOfBusiness], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [requiredDocuments].
     *
     * Unlike [requiredDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("required_documents")
    @ExcludeMissing
    fun _requiredDocuments(): JsonField<List<RequiredDocument>> = requiredDocuments

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusReasons].
     *
     * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<StatusReasons>> = statusReasons

    /**
     * Returns the raw JSON value of [userType].
     *
     * Unlike [userType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_type") @ExcludeMissing fun _userType(): JsonField<UserType> = userType

    /**
     * Returns the raw JSON value of [verificationApplication].
     *
     * Unlike [verificationApplication], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("verification_application")
    @ExcludeMissing
    fun _verificationApplication(): JsonField<VerificationApplication> = verificationApplication

    /**
     * Returns the raw JSON value of [websiteUrl].
     *
     * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl(): JsonField<String> = websiteUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountHolderSimulateEnrollmentReviewResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        beneficialOwnerEntities().ifPresent { it.forEach { it.validate() } }
        beneficialOwnerIndividuals().ifPresent { it.forEach { it.validate() } }
        businessAccountToken()
        businessEntity().ifPresent { it.validate() }
        controlPerson().ifPresent { it.validate() }
        created()
        email()
        exemptionType()
        externalId()
        individual().ifPresent { it.validate() }
        natureOfBusiness()
        phoneNumber()
        requiredDocuments().ifPresent { it.forEach { it.validate() } }
        status()
        statusReasons()
        userType()
        verificationApplication().ifPresent { it.validate() }
        websiteUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountHolderSimulateEnrollmentReviewResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderSimulateEnrollmentReviewResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var beneficialOwnerEntities: JsonField<MutableList<KybBusinessEntity>>? = null
        private var beneficialOwnerIndividuals: JsonField<MutableList<Individual>>? = null
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of()
        private var controlPerson: JsonField<Individual> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var exemptionType: JsonField<ExemptionType> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var individual: JsonField<Individual> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var requiredDocuments: JsonField<MutableList<RequiredDocument>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<MutableList<StatusReasons>>? = null
        private var userType: JsonField<UserType> = JsonMissing.of()
        private var verificationApplication: JsonField<VerificationApplication> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountHolderSimulateEnrollmentReviewResponse:
                AccountHolderSimulateEnrollmentReviewResponse
        ) = apply {
            token = accountHolderSimulateEnrollmentReviewResponse.token
            accountToken = accountHolderSimulateEnrollmentReviewResponse.accountToken
            beneficialOwnerEntities =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities.map {
                    it.toMutableList()
                }
            beneficialOwnerIndividuals =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals.map {
                    it.toMutableList()
                }
            businessAccountToken =
                accountHolderSimulateEnrollmentReviewResponse.businessAccountToken
            businessEntity = accountHolderSimulateEnrollmentReviewResponse.businessEntity
            controlPerson = accountHolderSimulateEnrollmentReviewResponse.controlPerson
            created = accountHolderSimulateEnrollmentReviewResponse.created
            email = accountHolderSimulateEnrollmentReviewResponse.email
            exemptionType = accountHolderSimulateEnrollmentReviewResponse.exemptionType
            externalId = accountHolderSimulateEnrollmentReviewResponse.externalId
            individual = accountHolderSimulateEnrollmentReviewResponse.individual
            natureOfBusiness = accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness
            phoneNumber = accountHolderSimulateEnrollmentReviewResponse.phoneNumber
            requiredDocuments =
                accountHolderSimulateEnrollmentReviewResponse.requiredDocuments.map {
                    it.toMutableList()
                }
            status = accountHolderSimulateEnrollmentReviewResponse.status
            statusReasons =
                accountHolderSimulateEnrollmentReviewResponse.statusReasons.map {
                    it.toMutableList()
                }
            userType = accountHolderSimulateEnrollmentReviewResponse.userType
            verificationApplication =
                accountHolderSimulateEnrollmentReviewResponse.verificationApplication
            websiteUrl = accountHolderSimulateEnrollmentReviewResponse.websiteUrl
            additionalProperties =
                accountHolderSimulateEnrollmentReviewResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: List<KybBusinessEntity>) =
            beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

        /**
         * Sets [Builder.beneficialOwnerEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwnerEntities] with a well-typed
         * `List<KybBusinessEntity>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>) =
            apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities.map { it.toMutableList() }
            }

        /**
         * Adds a single [KybBusinessEntity] to [beneficialOwnerEntities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeneficialOwnerEntity(beneficialOwnerEntity: KybBusinessEntity) = apply {
            beneficialOwnerEntities =
                (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("beneficialOwnerEntities", it).add(beneficialOwnerEntity)
                }
        }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<Individual>) =
            beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

        /**
         * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
         * `List<Individual>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: JsonField<List<Individual>>) =
            apply {
                this.beneficialOwnerIndividuals =
                    beneficialOwnerIndividuals.map { it.toMutableList() }
            }

        /**
         * Adds a single [Individual] to [beneficialOwnerIndividuals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: Individual) = apply {
            beneficialOwnerIndividuals =
                (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("beneficialOwnerIndividuals", it).add(beneficialOwnerIndividual)
                }
        }

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

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        fun businessEntity(businessEntity: KybBusinessEntity) =
            businessEntity(JsonField.of(businessEntity))

        /**
         * Sets [Builder.businessEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessEntity] with a well-typed [KybBusinessEntity]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessEntity(businessEntity: JsonField<KybBusinessEntity>) = apply {
            this.businessEntity = businessEntity
        }

        /**
         * Only present when user_type == "BUSINESS".
         *
         * An individual with significant responsibility for managing the legal entity (e.g., a
         * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer,
         *
         * Managing Member, General Partner, President, Vice President, or Treasurer). This can be
         * an executive, or someone who will have program-wide access
         *
         * to the cards that Lithic will provide. In some cases, this individual could also be a
         * beneficial owner listed above.
         */
        fun controlPerson(controlPerson: Individual) = controlPerson(JsonField.of(controlPerson))

        /**
         * Sets [Builder.controlPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controlPerson] with a well-typed [Individual] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controlPerson(controlPerson: JsonField<Individual>) = apply {
            this.controlPerson = controlPerson
        }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary email of Account Holder.
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
         * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder
         * is not KYC-Exempt.
         */
        fun exemptionType(exemptionType: ExemptionType) = exemptionType(JsonField.of(exemptionType))

        /**
         * Sets [Builder.exemptionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exemptionType] with a well-typed [ExemptionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exemptionType(exemptionType: JsonField<ExemptionType>) = apply {
            this.exemptionType = exemptionType
        }

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /**
         * Sets [Builder.individual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individual] with a well-typed [Individual] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
        fun natureOfBusiness(natureOfBusiness: String) =
            natureOfBusiness(JsonField.of(natureOfBusiness))

        /**
         * Sets [Builder.natureOfBusiness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.natureOfBusiness] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
            this.natureOfBusiness = natureOfBusiness
        }

        /**
         * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary phone of Account Holder, entered in E.164 format.
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

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Sets [Builder.requiredDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredDocuments] with a well-typed
         * `List<RequiredDocument>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequiredDocument] to [requiredDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredDocument(requiredDocument: RequiredDocument) = apply {
            requiredDocuments =
                (requiredDocuments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredDocuments", it).add(requiredDocument)
                }
        }

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun statusReasons(statusReasons: List<StatusReasons>) =
            statusReasons(JsonField.of(statusReasons))

        /**
         * Sets [Builder.statusReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReasons] with a well-typed `List<StatusReasons>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [StatusReasons] to [statusReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatusReason(statusReason: StatusReasons) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("statusReasons", it).add(statusReason)
                }
        }

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present.
         *
         * If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities",
         *
         * "nature_of_business", and "website_url" attributes will be present.
         */
        fun userType(userType: UserType) = userType(JsonField.of(userType))

        /**
         * Sets [Builder.userType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userType] with a well-typed [UserType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: VerificationApplication) =
            verificationApplication(JsonField.of(verificationApplication))

        /**
         * Sets [Builder.verificationApplication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationApplication] with a well-typed
         * [VerificationApplication] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun verificationApplication(verificationApplication: JsonField<VerificationApplication>) =
            apply {
                this.verificationApplication = verificationApplication
            }

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /**
         * Sets [Builder.websiteUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websiteUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

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

        fun build(): AccountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse(
                token,
                accountToken,
                (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                businessAccountToken,
                businessEntity,
                controlPerson,
                created,
                email,
                exemptionType,
                externalId,
                individual,
                natureOfBusiness,
                phoneNumber,
                (requiredDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                userType,
                verificationApplication,
                websiteUrl,
                additionalProperties.toImmutable(),
            )
    }

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
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address(): Optional<Address> = Optional.ofNullable(address.getNullable("address"))

        /**
         * Individual's date of birth, as an RFC 3339 date.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /**
         * Individual's first name, as it appears on government-issued identity documents.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun governmentId(): Optional<String> =
            Optional.ofNullable(governmentId.getNullable("government_id"))

        /**
         * Individual's last name, as it appears on government-issued identity documents.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

        /**
         * Individual's phone number, entered in E.164 format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> =
            Optional.ofNullable(phoneNumber.getNullable("phone_number"))

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
         * Returns the raw JSON value of [governmentId].
         *
         * Unlike [governmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("government_id")
        @ExcludeMissing
        fun _governmentId(): JsonField<String> = governmentId

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
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

            /** Returns a mutable builder for constructing an instance of [Individual]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Individual]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
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
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /**
             * Sets [Builder.dob] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dob] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Sets [Builder.governmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.governmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
                    address,
                    dob,
                    email,
                    firstName,
                    governmentId,
                    lastName,
                    phoneNumber,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
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

            /**
             * Valid deliverable address (no PO boxes).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address1(): String = address1.getRequired("address1")

            /**
             * Name of city.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * Unit or apartment number (if applicable).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

            /**
             * Returns the raw JSON value of [address1].
             *
             * Unlike [address1], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [address2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
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

                /**
                 * Sets [Builder.address1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address1] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Name of city. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
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
                 * You should usually call [Builder.address2] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

            return /* spotless:off */ other is Individual && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder is
     * not KYC-Exempt.
     */
    class ExemptionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmStatic fun of(value: String) = ExemptionType(JsonField.of(value))
        }

        /** An enum containing [ExemptionType]'s known values. */
        enum class Known {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
        }

        /**
         * An enum containing [ExemptionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExemptionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
            /**
             * An enum member indicating that [ExemptionType] was instantiated with an unknown
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
                else -> throw LithicInvalidDataException("Unknown ExemptionType: $value")
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

            return /* spotless:off */ other is ExemptionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

            @JvmField val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACCEPTED,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCEPTED,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
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
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status Reasons for KYC/KYB enrollment states */
    class StatusReasons @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ADDRESS_VERIFICATION_FAILURE = of("ADDRESS_VERIFICATION_FAILURE")

            @JvmField val AGE_THRESHOLD_FAILURE = of("AGE_THRESHOLD_FAILURE")

            @JvmField val COMPLETE_VERIFICATION_FAILURE = of("COMPLETE_VERIFICATION_FAILURE")

            @JvmField val DOB_VERIFICATION_FAILURE = of("DOB_VERIFICATION_FAILURE")

            @JvmField val ID_VERIFICATION_FAILURE = of("ID_VERIFICATION_FAILURE")

            @JvmField val MAX_DOCUMENT_ATTEMPTS = of("MAX_DOCUMENT_ATTEMPTS")

            @JvmField val MAX_RESUBMISSION_ATTEMPTS = of("MAX_RESUBMISSION_ATTEMPTS")

            @JvmField val NAME_VERIFICATION_FAILURE = of("NAME_VERIFICATION_FAILURE")

            @JvmField val OTHER_VERIFICATION_FAILURE = of("OTHER_VERIFICATION_FAILURE")

            @JvmField val RISK_THRESHOLD_FAILURE = of("RISK_THRESHOLD_FAILURE")

            @JvmField val WATCHLIST_ALERT_FAILURE = of("WATCHLIST_ALERT_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE = of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

            @JvmField
            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

            @JvmField
            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

            @JvmField
            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

            @JvmField
            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

            @JvmStatic fun of(value: String) = StatusReasons(JsonField.of(value))
        }

        /** An enum containing [StatusReasons]'s known values. */
        enum class Known {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
        }

        /**
         * An enum containing [StatusReasons]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusReasons] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
            /**
             * An enum member indicating that [StatusReasons] was instantiated with an unknown
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
                ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
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
                ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReasons: $value")
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

            return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present.
     *
     * If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities",
     *
     * "nature_of_business", and "website_url" attributes will be present.
     */
    class UserType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BUSINESS = of("BUSINESS")

            @JvmField val INDIVIDUAL = of("INDIVIDUAL")

            @JvmStatic fun of(value: String) = UserType(JsonField.of(value))
        }

        /** An enum containing [UserType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [UserType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UserType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /** An enum member indicating that [UserType] was instantiated with an unknown value. */
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown UserType: $value")
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

            return /* spotless:off */ other is UserType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Information about the most recent identity verification attempt */
    @NoAutoDetect
    class VerificationApplication
    @JsonCreator
    private constructor(
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_reasons")
        @ExcludeMissing
        private val statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Timestamp of when the application was created.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Reason for the evaluation status.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statusReasons(): List<StatusReasons> = statusReasons.getRequired("status_reasons")

        /**
         * Timestamp of when the application was last updated.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [statusReasons].
         *
         * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<StatusReasons>> = statusReasons

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VerificationApplication = apply {
            if (validated) {
                return@apply
            }

            created()
            status()
            statusReasons()
            updated()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [VerificationApplication].
             *
             * The following fields are required:
             * ```java
             * .created()
             * .status()
             * .statusReasons()
             * .updated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VerificationApplication]. */
        class Builder internal constructor() {

            private var created: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var statusReasons: JsonField<MutableList<StatusReasons>>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationApplication: VerificationApplication) = apply {
                created = verificationApplication.created
                status = verificationApplication.status
                statusReasons = verificationApplication.statusReasons.map { it.toMutableList() }
                updated = verificationApplication.updated
                additionalProperties = verificationApplication.additionalProperties.toMutableMap()
            }

            /** Timestamp of when the application was created. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * KYC and KYB evaluation states.
             *
             * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the
             * `ADVANCED` workflow.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: List<StatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /**
             * Sets [Builder.statusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusReasons] with a well-typed
             * `List<StatusReasons>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [StatusReasons] to [statusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusReason(statusReason: StatusReasons) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusReasons", it).add(statusReason)
                    }
            }

            /** Timestamp of when the application was last updated. */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

            fun build(): VerificationApplication =
                VerificationApplication(
                    checkRequired("created", created),
                    checkRequired("status", status),
                    checkRequired("statusReasons", statusReasons).map { it.toImmutable() },
                    checkRequired("updated", updated),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCEPTED = of("ACCEPTED")

                @JvmField val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

                @JvmField val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

                @JvmField val REJECTED = of("REJECTED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACCEPTED,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCEPTED,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                    REJECTED -> Value.REJECTED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                    REJECTED -> Known.REJECTED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Status Reasons for KYC/KYB enrollment states */
        class StatusReasons @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADDRESS_VERIFICATION_FAILURE = of("ADDRESS_VERIFICATION_FAILURE")

                @JvmField val AGE_THRESHOLD_FAILURE = of("AGE_THRESHOLD_FAILURE")

                @JvmField val COMPLETE_VERIFICATION_FAILURE = of("COMPLETE_VERIFICATION_FAILURE")

                @JvmField val DOB_VERIFICATION_FAILURE = of("DOB_VERIFICATION_FAILURE")

                @JvmField val ID_VERIFICATION_FAILURE = of("ID_VERIFICATION_FAILURE")

                @JvmField val MAX_DOCUMENT_ATTEMPTS = of("MAX_DOCUMENT_ATTEMPTS")

                @JvmField val MAX_RESUBMISSION_ATTEMPTS = of("MAX_RESUBMISSION_ATTEMPTS")

                @JvmField val NAME_VERIFICATION_FAILURE = of("NAME_VERIFICATION_FAILURE")

                @JvmField val OTHER_VERIFICATION_FAILURE = of("OTHER_VERIFICATION_FAILURE")

                @JvmField val RISK_THRESHOLD_FAILURE = of("RISK_THRESHOLD_FAILURE")

                @JvmField val WATCHLIST_ALERT_FAILURE = of("WATCHLIST_ALERT_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                    of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                    of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                    of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

                @JvmField
                val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

                @JvmField
                val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                    of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

                @JvmField
                val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

                @JvmField
                val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

                @JvmField
                val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

                @JvmStatic fun of(value: String) = StatusReasons(JsonField.of(value))
            }

            /** An enum containing [StatusReasons]'s known values. */
            enum class Known {
                ADDRESS_VERIFICATION_FAILURE,
                AGE_THRESHOLD_FAILURE,
                COMPLETE_VERIFICATION_FAILURE,
                DOB_VERIFICATION_FAILURE,
                ID_VERIFICATION_FAILURE,
                MAX_DOCUMENT_ATTEMPTS,
                MAX_RESUBMISSION_ATTEMPTS,
                NAME_VERIFICATION_FAILURE,
                OTHER_VERIFICATION_FAILURE,
                RISK_THRESHOLD_FAILURE,
                WATCHLIST_ALERT_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
                CONTROL_PERSON_ID_VERIFICATION_FAILURE,
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
            }

            /**
             * An enum containing [StatusReasons]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StatusReasons] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADDRESS_VERIFICATION_FAILURE,
                AGE_THRESHOLD_FAILURE,
                COMPLETE_VERIFICATION_FAILURE,
                DOB_VERIFICATION_FAILURE,
                ID_VERIFICATION_FAILURE,
                MAX_DOCUMENT_ATTEMPTS,
                MAX_RESUBMISSION_ATTEMPTS,
                NAME_VERIFICATION_FAILURE,
                OTHER_VERIFICATION_FAILURE,
                RISK_THRESHOLD_FAILURE,
                WATCHLIST_ALERT_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
                CONTROL_PERSON_ID_VERIFICATION_FAILURE,
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
                /**
                 * An enum member indicating that [StatusReasons] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                    AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                    COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                    DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                    ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                    MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                    MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                    NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                    OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                    RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                    WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                        Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                        Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                    PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                        Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                    PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                    PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                    CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                        Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                    CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                    CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                    CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                    AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                    COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                    DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                    ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                    MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                    MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                    NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                    OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                    RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                    WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                        Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                        Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                    PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                        Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                    PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                    PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                    CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                        Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                    CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                    CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                    CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                    else -> throw LithicInvalidDataException("Unknown StatusReasons: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationApplication && created == other.created && status == other.status && statusReasons == other.statusReasons && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(created, status, statusReasons, updated, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationApplication{created=$created, status=$status, statusReasons=$statusReasons, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewResponse && token == other.token && accountToken == other.accountToken && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessAccountToken == other.businessAccountToken && businessEntity == other.businessEntity && controlPerson == other.controlPerson && created == other.created && email == other.email && exemptionType == other.exemptionType && externalId == other.externalId && individual == other.individual && natureOfBusiness == other.natureOfBusiness && phoneNumber == other.phoneNumber && requiredDocuments == other.requiredDocuments && status == other.status && statusReasons == other.statusReasons && userType == other.userType && verificationApplication == other.verificationApplication && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, beneficialOwnerEntities, beneficialOwnerIndividuals, businessAccountToken, businessEntity, controlPerson, created, email, exemptionType, externalId, individual, natureOfBusiness, phoneNumber, requiredDocuments, status, statusReasons, userType, verificationApplication, websiteUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderSimulateEnrollmentReviewResponse{token=$token, accountToken=$accountToken, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessAccountToken=$businessAccountToken, businessEntity=$businessEntity, controlPerson=$controlPerson, created=$created, email=$email, exemptionType=$exemptionType, externalId=$externalId, individual=$individual, natureOfBusiness=$natureOfBusiness, phoneNumber=$phoneNumber, requiredDocuments=$requiredDocuments, status=$status, statusReasons=$statusReasons, userType=$userType, verificationApplication=$verificationApplication, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
