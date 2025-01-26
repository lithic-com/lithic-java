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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AccountHolder
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    private val beneficialOwnerEntities: JsonField<List<AccountHolderBusinessResponse>> =
        JsonMissing.of(),
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    private val beneficialOwnerIndividuals: JsonField<List<AccountHolderIndividualResponse>> =
        JsonMissing.of(),
    @JsonProperty("business_account_token")
    @ExcludeMissing
    private val businessAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_entity")
    @ExcludeMissing
    private val businessEntity: JsonField<AccountHolderBusinessResponse> = JsonMissing.of(),
    @JsonProperty("control_person")
    @ExcludeMissing
    private val controlPerson: JsonField<AccountHolderIndividualResponse> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("exemption_type")
    @ExcludeMissing
    private val exemptionType: JsonField<ExemptionType> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual")
    @ExcludeMissing
    private val individual: JsonField<AccountHolderIndividualResponse> = JsonMissing.of(),
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
    private val statusReasons: JsonField<List<StatusReason>> = JsonMissing.of(),
    @JsonProperty("user_type")
    @ExcludeMissing
    private val userType: JsonField<UserType> = JsonMissing.of(),
    @JsonProperty("verification_application")
    @ExcludeMissing
    private val verificationApplication: JsonField<AccountHolderVerificationApplication> =
        JsonMissing.of(),
    @JsonProperty("website_url")
    @ExcludeMissing
    private val websiteUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account holder. */
    fun token(): String = token.getRequired("token")

    /** Timestamp of when the account holder was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Globally unique identifier for the account. */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    fun beneficialOwnerEntities(): Optional<List<AccountHolderBusinessResponse>> =
        Optional.ofNullable(beneficialOwnerEntities.getNullable("beneficial_owner_entities"))

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    fun beneficialOwnerIndividuals(): Optional<List<AccountHolderIndividualResponse>> =
        Optional.ofNullable(beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals"))

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    fun businessEntity(): Optional<AccountHolderBusinessResponse> =
        Optional.ofNullable(businessEntity.getNullable("business_entity"))

    /**
     * Only present when user_type == "BUSINESS". An individual with significant responsibility for
     * managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer, Chief
     * Operating Officer, Managing Member, General Partner, President, Vice President, or
     * Treasurer). This can be an executive, or someone who will have program-wide access to the
     * cards that Lithic will provide. In some cases, this individual could also be a beneficial
     * owner listed above.
     */
    fun controlPerson(): Optional<AccountHolderIndividualResponse> =
        Optional.ofNullable(controlPerson.getNullable("control_person"))

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /** The type of KYC exemption for a KYC-Exempt Account Holder. */
    fun exemptionType(): Optional<ExemptionType> =
        Optional.ofNullable(exemptionType.getNullable("exemption_type"))

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    fun individual(): Optional<AccountHolderIndividualResponse> =
        Optional.ofNullable(individual.getNullable("individual"))

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    fun natureOfBusiness(): Optional<String> =
        Optional.ofNullable(natureOfBusiness.getNullable("nature_of_business"))

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    fun phoneNumber(): Optional<String> =
        Optional.ofNullable(phoneNumber.getNullable("phone_number"))

    /**
     * Only present for "KYB_BASIC" workflow. A list of documents required for the account holder to
     * be approved.
     */
    fun requiredDocuments(): Optional<List<RequiredDocument>> =
        Optional.ofNullable(requiredDocuments.getNullable("required_documents"))

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    fun statusReasons(): Optional<List<StatusReason>> =
        Optional.ofNullable(statusReasons.getNullable("status_reasons"))

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present. If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
     * "website_url" attributes will be present.
     */
    fun userType(): Optional<UserType> = Optional.ofNullable(userType.getNullable("user_type"))

    /** Information about the most recent identity verification attempt */
    fun verificationApplication(): Optional<AccountHolderVerificationApplication> =
        Optional.ofNullable(verificationApplication.getNullable("verification_application"))

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    fun websiteUrl(): Optional<String> = Optional.ofNullable(websiteUrl.getNullable("website_url"))

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities(): JsonField<List<AccountHolderBusinessResponse>> =
        beneficialOwnerEntities

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals(): JsonField<List<AccountHolderIndividualResponse>> =
        beneficialOwnerIndividuals

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken(): JsonField<String> = businessAccountToken

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    @JsonProperty("business_entity")
    @ExcludeMissing
    fun _businessEntity(): JsonField<AccountHolderBusinessResponse> = businessEntity

    /**
     * Only present when user_type == "BUSINESS". An individual with significant responsibility for
     * managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer, Chief
     * Operating Officer, Managing Member, General Partner, President, Vice President, or
     * Treasurer). This can be an executive, or someone who will have program-wide access to the
     * cards that Lithic will provide. In some cases, this individual could also be a beneficial
     * owner listed above.
     */
    @JsonProperty("control_person")
    @ExcludeMissing
    fun _controlPerson(): JsonField<AccountHolderIndividualResponse> = controlPerson

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** The type of KYC exemption for a KYC-Exempt Account Holder. */
    @JsonProperty("exemption_type")
    @ExcludeMissing
    fun _exemptionType(): JsonField<ExemptionType> = exemptionType

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    @JsonProperty("individual")
    @ExcludeMissing
    fun _individual(): JsonField<AccountHolderIndividualResponse> = individual

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Only present for "KYB_BASIC" workflow. A list of documents required for the account holder to
     * be approved.
     */
    @JsonProperty("required_documents")
    @ExcludeMissing
    fun _requiredDocuments(): JsonField<List<RequiredDocument>> = requiredDocuments

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<StatusReason>> = statusReasons

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present. If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
     * "website_url" attributes will be present.
     */
    @JsonProperty("user_type") @ExcludeMissing fun _userType(): JsonField<UserType> = userType

    /** Information about the most recent identity verification attempt */
    @JsonProperty("verification_application")
    @ExcludeMissing
    fun _verificationApplication(): JsonField<AccountHolderVerificationApplication> =
        verificationApplication

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl(): JsonField<String> = websiteUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountHolder = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        accountToken()
        beneficialOwnerEntities().ifPresent { it.forEach { it.validate() } }
        beneficialOwnerIndividuals().ifPresent { it.forEach { it.validate() } }
        businessAccountToken()
        businessEntity().ifPresent { it.validate() }
        controlPerson().ifPresent { it.validate() }
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

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var beneficialOwnerEntities:
            JsonField<MutableList<AccountHolderBusinessResponse>>? =
            null
        private var beneficialOwnerIndividuals:
            JsonField<MutableList<AccountHolderIndividualResponse>>? =
            null
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var businessEntity: JsonField<AccountHolderBusinessResponse> = JsonMissing.of()
        private var controlPerson: JsonField<AccountHolderIndividualResponse> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var exemptionType: JsonField<ExemptionType> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var individual: JsonField<AccountHolderIndividualResponse> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var requiredDocuments: JsonField<MutableList<RequiredDocument>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<MutableList<StatusReason>>? = null
        private var userType: JsonField<UserType> = JsonMissing.of()
        private var verificationApplication: JsonField<AccountHolderVerificationApplication> =
            JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolder: AccountHolder) = apply {
            token = accountHolder.token
            created = accountHolder.created
            accountToken = accountHolder.accountToken
            beneficialOwnerEntities =
                accountHolder.beneficialOwnerEntities.map { it.toMutableList() }
            beneficialOwnerIndividuals =
                accountHolder.beneficialOwnerIndividuals.map { it.toMutableList() }
            businessAccountToken = accountHolder.businessAccountToken
            businessEntity = accountHolder.businessEntity
            controlPerson = accountHolder.controlPerson
            email = accountHolder.email
            exemptionType = accountHolder.exemptionType
            externalId = accountHolder.externalId
            individual = accountHolder.individual
            natureOfBusiness = accountHolder.natureOfBusiness
            phoneNumber = accountHolder.phoneNumber
            requiredDocuments = accountHolder.requiredDocuments.map { it.toMutableList() }
            status = accountHolder.status
            statusReasons = accountHolder.statusReasons.map { it.toMutableList() }
            userType = accountHolder.userType
            verificationApplication = accountHolder.verificationApplication
            websiteUrl = accountHolder.websiteUrl
            additionalProperties = accountHolder.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: List<AccountHolderBusinessResponse>) =
            beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun beneficialOwnerEntities(
            beneficialOwnerEntities: JsonField<List<AccountHolderBusinessResponse>>
        ) = apply {
            this.beneficialOwnerEntities = beneficialOwnerEntities.map { it.toMutableList() }
        }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun addBeneficialOwnerEntity(beneficialOwnerEntity: AccountHolderBusinessResponse) = apply {
            beneficialOwnerEntities =
                (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(beneficialOwnerEntity)
                }
        }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun beneficialOwnerIndividuals(
            beneficialOwnerIndividuals: List<AccountHolderIndividualResponse>
        ) = beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun beneficialOwnerIndividuals(
            beneficialOwnerIndividuals: JsonField<List<AccountHolderIndividualResponse>>
        ) = apply {
            this.beneficialOwnerIndividuals = beneficialOwnerIndividuals.map { it.toMutableList() }
        }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun addBeneficialOwnerIndividual(
            beneficialOwnerIndividual: AccountHolderIndividualResponse
        ) = apply {
            beneficialOwnerIndividuals =
                (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(beneficialOwnerIndividual)
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
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        fun businessEntity(businessEntity: AccountHolderBusinessResponse) =
            businessEntity(JsonField.of(businessEntity))

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        fun businessEntity(businessEntity: JsonField<AccountHolderBusinessResponse>) = apply {
            this.businessEntity = businessEntity
        }

        /**
         * Only present when user_type == "BUSINESS". An individual with significant responsibility
         * for managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer,
         * Chief Operating Officer, Managing Member, General Partner, President, Vice President, or
         * Treasurer). This can be an executive, or someone who will have program-wide access to the
         * cards that Lithic will provide. In some cases, this individual could also be a beneficial
         * owner listed above.
         */
        fun controlPerson(controlPerson: AccountHolderIndividualResponse) =
            controlPerson(JsonField.of(controlPerson))

        /**
         * Only present when user_type == "BUSINESS". An individual with significant responsibility
         * for managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer,
         * Chief Operating Officer, Managing Member, General Partner, President, Vice President, or
         * Treasurer). This can be an executive, or someone who will have program-wide access to the
         * cards that Lithic will provide. In some cases, this individual could also be a beneficial
         * owner listed above.
         */
        fun controlPerson(controlPerson: JsonField<AccountHolderIndividualResponse>) = apply {
            this.controlPerson = controlPerson
        }

        /**
         * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary email of Account Holder.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary email of Account Holder.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The type of KYC exemption for a KYC-Exempt Account Holder. */
        fun exemptionType(exemptionType: ExemptionType) = exemptionType(JsonField.of(exemptionType))

        /** The type of KYC exemption for a KYC-Exempt Account Holder. */
        fun exemptionType(exemptionType: JsonField<ExemptionType>) = apply {
            this.exemptionType = exemptionType
        }

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: AccountHolderIndividualResponse) =
            individual(JsonField.of(individual))

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: JsonField<AccountHolderIndividualResponse>) = apply {
            this.individual = individual
        }

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
        fun natureOfBusiness(natureOfBusiness: String) =
            natureOfBusiness(JsonField.of(natureOfBusiness))

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
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
         * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary phone of Account Holder, entered in E.164 format.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments.map { it.toMutableList() }
        }

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun addRequiredDocument(requiredDocument: RequiredDocument) = apply {
            requiredDocuments =
                (requiredDocuments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(requiredDocument)
                }
        }

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun statusReasons(statusReasons: List<StatusReason>) =
            statusReasons(JsonField.of(statusReasons))

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun addStatusReason(statusReason: StatusReason) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(statusReason)
                }
        }

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present. If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
         * "website_url" attributes will be present.
         */
        fun userType(userType: UserType) = userType(JsonField.of(userType))

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present. If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
         * "website_url" attributes will be present.
         */
        fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: AccountHolderVerificationApplication) =
            verificationApplication(JsonField.of(verificationApplication))

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(
            verificationApplication: JsonField<AccountHolderVerificationApplication>
        ) = apply { this.verificationApplication = verificationApplication }

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /** Only present when user_type == "BUSINESS". Business's primary website. */
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

        fun build(): AccountHolder =
            AccountHolder(
                checkRequired("token", token),
                checkRequired("created", created),
                accountToken,
                (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                businessAccountToken,
                businessEntity,
                controlPerson,
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
    class AccountHolderBusinessResponse
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        private val dbaBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        private val entityToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("government_id")
        @ExcludeMissing
        private val governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        private val legalBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("parent_company")
        @ExcludeMissing
        private val parentCompany: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(): String = dbaBusinessName.getRequired("dba_business_name")

        /** Globally unique identifier for the entity. */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /** Legal (formal) business name. */
        fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /** Parent company name (if applicable). */
        fun parentCompany(): Optional<String> =
            Optional.ofNullable(parentCompany.getNullable("parent_company"))

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun _entityToken(): JsonField<String> = entityToken

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
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

        /** Parent company name (if applicable). */
        @JsonProperty("parent_company")
        @ExcludeMissing
        fun _parentCompany(): JsonField<String> = parentCompany

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountHolderBusinessResponse = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            dbaBusinessName()
            entityToken()
            governmentId()
            legalBusinessName()
            phoneNumbers()
            parentCompany()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dbaBusinessName: JsonField<String>? = null
            private var entityToken: JsonField<String>? = null
            private var governmentId: JsonField<String>? = null
            private var legalBusinessName: JsonField<String>? = null
            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderBusinessResponse: AccountHolderBusinessResponse) =
                apply {
                    address = accountHolderBusinessResponse.address
                    dbaBusinessName = accountHolderBusinessResponse.dbaBusinessName
                    entityToken = accountHolderBusinessResponse.entityToken
                    governmentId = accountHolderBusinessResponse.governmentId
                    legalBusinessName = accountHolderBusinessResponse.legalBusinessName
                    phoneNumbers =
                        accountHolderBusinessResponse.phoneNumbers.map { it.toMutableList() }
                    parentCompany = accountHolderBusinessResponse.parentCompany
                    additionalProperties =
                        accountHolderBusinessResponse.additionalProperties.toMutableMap()
                }

            /**
             * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

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

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: JsonField<String>) = apply {
                this.entityToken = entityToken
            }

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
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
                    (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(phoneNumber)
                    }
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

            fun build(): AccountHolderBusinessResponse =
                AccountHolderBusinessResponse(
                    checkRequired("address", address),
                    checkRequired("dbaBusinessName", dbaBusinessName),
                    checkRequired("entityToken", entityToken),
                    checkRequired("governmentId", governmentId),
                    checkRequired("legalBusinessName", legalBusinessName),
                    checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                    parentCompany,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderBusinessResponse && address == other.address && dbaBusinessName == other.dbaBusinessName && entityToken == other.entityToken && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && phoneNumbers == other.phoneNumbers && parentCompany == other.parentCompany && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dbaBusinessName, entityToken, governmentId, legalBusinessName, phoneNumbers, parentCompany, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderBusinessResponse{address=$address, dbaBusinessName=$dbaBusinessName, entityToken=$entityToken, governmentId=$governmentId, legalBusinessName=$legalBusinessName, phoneNumbers=$phoneNumbers, parentCompany=$parentCompany, additionalProperties=$additionalProperties}"
    }

    /**
     * Information about an individual associated with an account holder. A subset of the
     * information provided via KYC. For example, we do not return the government id.
     */
    @NoAutoDetect
    class AccountHolderIndividualResponse
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        private val entityToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Individual's current address */
        fun address(): Address = address.getRequired("address")

        /** Individual's date of birth, as an RFC 3339 date. */
        fun dob(): String = dob.getRequired("dob")

        /** Individual's email address. */
        fun email(): String = email.getRequired("email")

        /** Globally unique identifier for the entity. */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /** Individual's first name, as it appears on government-issued identity documents. */
        fun firstName(): String = firstName.getRequired("first_name")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /** Individual's current address */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

        /** Individual's email address. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun _entityToken(): JsonField<String> = entityToken

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

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

        fun validate(): AccountHolderIndividualResponse = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            dob()
            email()
            entityToken()
            firstName()
            lastName()
            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dob: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var entityToken: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderIndividualResponse: AccountHolderIndividualResponse) =
                apply {
                    address = accountHolderIndividualResponse.address
                    dob = accountHolderIndividualResponse.dob
                    email = accountHolderIndividualResponse.email
                    entityToken = accountHolderIndividualResponse.entityToken
                    firstName = accountHolderIndividualResponse.firstName
                    lastName = accountHolderIndividualResponse.lastName
                    phoneNumber = accountHolderIndividualResponse.phoneNumber
                    additionalProperties =
                        accountHolderIndividualResponse.additionalProperties.toMutableMap()
                }

            /** Individual's current address */
            fun address(address: Address) = address(JsonField.of(address))

            /** Individual's current address */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /** Individual's email address. */
            fun email(email: String) = email(JsonField.of(email))

            /** Individual's email address. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: JsonField<String>) = apply {
                this.entityToken = entityToken
            }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

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

            fun build(): AccountHolderIndividualResponse =
                AccountHolderIndividualResponse(
                    checkRequired("address", address),
                    checkRequired("dob", dob),
                    checkRequired("email", email),
                    checkRequired("entityToken", entityToken),
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderIndividualResponse && address == other.address && dob == other.dob && email == other.email && entityToken == other.entityToken && firstName == other.firstName && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, entityToken, firstName, lastName, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderIndividualResponse{address=$address, dob=$dob, email=$email, entityToken=$entityToken, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** The type of KYC exemption for a KYC-Exempt Account Holder. */
    class ExemptionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AUTHORIZED_USER = of("AUTHORIZED_USER")

            @JvmField val PREPAID_CARD_USER = of("PREPAID_CARD_USER")

            @JvmStatic fun of(value: String) = ExemptionType(JsonField.of(value))
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
                else -> throw LithicInvalidDataException("Unknown ExemptionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val PENDING_REVIEW = of("PENDING_REVIEW")

            @JvmField val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

            @JvmField val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class StatusReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
        }

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
        }

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
            _UNKNOWN,
        }

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
                else -> Value._UNKNOWN
            }

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
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present. If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
     * "website_url" attributes will be present.
     */
    class UserType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS = of("BUSINESS")

            @JvmField val INDIVIDUAL = of("INDIVIDUAL")

            @JvmStatic fun of(value: String) = UserType(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown UserType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
    class AccountHolderVerificationApplication
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
        private val statusReasons: JsonField<List<StatusReason>> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Timestamp of when the application was created. */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /** Reason for the evaluation status. */
        fun statusReasons(): Optional<List<StatusReason>> =
            Optional.ofNullable(statusReasons.getNullable("status_reasons"))

        /** Timestamp of when the application was last updated. */
        fun updated(): Optional<OffsetDateTime> =
            Optional.ofNullable(updated.getNullable("updated"))

        /** Timestamp of when the application was created. */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** Reason for the evaluation status. */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<StatusReason>> = statusReasons

        /** Timestamp of when the application was last updated. */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountHolderVerificationApplication = apply {
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

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusReasons: JsonField<MutableList<StatusReason>>? = null
            private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountHolderVerificationApplication: AccountHolderVerificationApplication
            ) = apply {
                created = accountHolderVerificationApplication.created
                status = accountHolderVerificationApplication.status
                statusReasons =
                    accountHolderVerificationApplication.statusReasons.map { it.toMutableList() }
                updated = accountHolderVerificationApplication.updated
                additionalProperties =
                    accountHolderVerificationApplication.additionalProperties.toMutableMap()
            }

            /** Timestamp of when the application was created. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Timestamp of when the application was created. */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * KYC and KYB evaluation states.
             *
             * Note:
             * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * KYC and KYB evaluation states.
             *
             * Note:
             * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /** Reason for the evaluation status. */
            fun addStatusReason(statusReason: StatusReason) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(statusReason)
                    }
            }

            /** Timestamp of when the application was last updated. */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /** Timestamp of when the application was last updated. */
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

            fun build(): AccountHolderVerificationApplication =
                AccountHolderVerificationApplication(
                    created,
                    status,
                    (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    updated,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCEPTED = of("ACCEPTED")

                @JvmField val PENDING_REVIEW = of("PENDING_REVIEW")

                @JvmField val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

                @JvmField val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

                @JvmField val REJECTED = of("REJECTED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                PENDING_REVIEW,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
            }

            enum class Value {
                ACCEPTED,
                PENDING_REVIEW,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    PENDING_REVIEW -> Value.PENDING_REVIEW
                    PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                    REJECTED -> Value.REJECTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    PENDING_REVIEW -> Known.PENDING_REVIEW
                    PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                    REJECTED -> Known.REJECTED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StatusReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
            }

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
            }

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
                _UNKNOWN,
            }

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
                    else -> Value._UNKNOWN
                }

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
                    else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderVerificationApplication && created == other.created && status == other.status && statusReasons == other.statusReasons && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(created, status, statusReasons, updated, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderVerificationApplication{created=$created, status=$status, statusReasons=$statusReasons, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolder && token == other.token && created == other.created && accountToken == other.accountToken && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessAccountToken == other.businessAccountToken && businessEntity == other.businessEntity && controlPerson == other.controlPerson && email == other.email && exemptionType == other.exemptionType && externalId == other.externalId && individual == other.individual && natureOfBusiness == other.natureOfBusiness && phoneNumber == other.phoneNumber && requiredDocuments == other.requiredDocuments && status == other.status && statusReasons == other.statusReasons && userType == other.userType && verificationApplication == other.verificationApplication && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, accountToken, beneficialOwnerEntities, beneficialOwnerIndividuals, businessAccountToken, businessEntity, controlPerson, email, exemptionType, externalId, individual, natureOfBusiness, phoneNumber, requiredDocuments, status, statusReasons, userType, verificationApplication, websiteUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolder{token=$token, created=$created, accountToken=$accountToken, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessAccountToken=$businessAccountToken, businessEntity=$businessEntity, controlPerson=$controlPerson, email=$email, exemptionType=$exemptionType, externalId=$externalId, individual=$individual, natureOfBusiness=$natureOfBusiness, phoneNumber=$phoneNumber, requiredDocuments=$requiredDocuments, status=$status, statusReasons=$statusReasons, userType=$userType, verificationApplication=$verificationApplication, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
