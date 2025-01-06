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
class Kyb
@JsonCreator
private constructor(
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    private val beneficialOwnerEntities: JsonField<List<BusinessEntity>> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    private val beneficialOwnerIndividuals: JsonField<List<KybIndividual>> = JsonMissing.of(),
    @JsonProperty("business_entity")
    @ExcludeMissing
    private val businessEntity: JsonField<BusinessEntity> = JsonMissing.of(),
    @JsonProperty("control_person")
    @ExcludeMissing
    private val controlPerson: JsonField<KybIndividual> = JsonMissing.of(),
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    private val natureOfBusiness: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tos_timestamp")
    @ExcludeMissing
    private val tosTimestamp: JsonField<String> = JsonMissing.of(),
    @JsonProperty("workflow")
    @ExcludeMissing
    private val workflow: JsonField<Workflow> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("kyb_passed_timestamp")
    @ExcludeMissing
    private val kybPassedTimestamp: JsonField<String> = JsonMissing.of(),
    @JsonProperty("website_url")
    @ExcludeMissing
    private val websiteUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * List of all entities with >25% ownership in the company. If no entity or individual owns >25%
     * of the company, and the largest shareholder is an entity, please identify them in this field.
     * See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section I) for more background. If no business owner is an entity, pass in an empty list.
     * However, either this parameter or `beneficial_owner_individuals` must be populated. on
     * entities that should be included.
     */
    fun beneficialOwnerEntities(): List<BusinessEntity> =
        beneficialOwnerEntities.getRequired("beneficial_owner_entities")

    /**
     * List of all direct and indirect individuals with >25% ownership in the company. If no entity
     * or individual owns >25% of the company, and the largest shareholder is an individual, please
     * identify them in this field. See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section I) for more background on individuals that should be included. If no individual is
     * an entity, pass in an empty list. However, either this parameter or
     * `beneficial_owner_entities` must be populated.
     */
    fun beneficialOwnerIndividuals(): List<KybIndividual> =
        beneficialOwnerIndividuals.getRequired("beneficial_owner_individuals")

    /** Information for business for which the account is being opened and KYB is being run. */
    fun businessEntity(): BusinessEntity = businessEntity.getRequired("business_entity")

    /**
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing Member, General
     * Partner, President, Vice President, or Treasurer). This can be an executive, or someone who
     * will have program-wide access to the cards that Lithic will provide. In some cases, this
     * individual could also be a beneficial owner listed above. See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section II) for more background.
     */
    fun controlPerson(): KybIndividual = controlPerson.getRequired("control_person")

    /** Short description of the company's line of business (i.e., what does the company do?). */
    fun natureOfBusiness(): String = natureOfBusiness.getRequired("nature_of_business")

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    fun tosTimestamp(): String = tosTimestamp.getRequired("tos_timestamp")

    /** Specifies the type of KYB workflow to run. */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /** A user provided id that can be used to link an account holder with an external system */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with a
     * pass result.
     *
     * This field is required only if workflow type is `KYB_BYO`.
     */
    fun kybPassedTimestamp(): Optional<String> =
        Optional.ofNullable(kybPassedTimestamp.getNullable("kyb_passed_timestamp"))

    /** Company website URL. */
    fun websiteUrl(): Optional<String> = Optional.ofNullable(websiteUrl.getNullable("website_url"))

    /**
     * List of all entities with >25% ownership in the company. If no entity or individual owns >25%
     * of the company, and the largest shareholder is an entity, please identify them in this field.
     * See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section I) for more background. If no business owner is an entity, pass in an empty list.
     * However, either this parameter or `beneficial_owner_individuals` must be populated. on
     * entities that should be included.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities() = beneficialOwnerEntities

    /**
     * List of all direct and indirect individuals with >25% ownership in the company. If no entity
     * or individual owns >25% of the company, and the largest shareholder is an individual, please
     * identify them in this field. See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section I) for more background on individuals that should be included. If no individual is
     * an entity, pass in an empty list. However, either this parameter or
     * `beneficial_owner_entities` must be populated.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals() = beneficialOwnerIndividuals

    /** Information for business for which the account is being opened and KYB is being run. */
    @JsonProperty("business_entity") @ExcludeMissing fun _businessEntity() = businessEntity

    /**
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing Member, General
     * Partner, President, Vice President, or Treasurer). This can be an executive, or someone who
     * will have program-wide access to the cards that Lithic will provide. In some cases, this
     * individual could also be a beneficial owner listed above. See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section II) for more background.
     */
    @JsonProperty("control_person") @ExcludeMissing fun _controlPerson() = controlPerson

    /** Short description of the company's line of business (i.e., what does the company do?). */
    @JsonProperty("nature_of_business") @ExcludeMissing fun _natureOfBusiness() = natureOfBusiness

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    @JsonProperty("tos_timestamp") @ExcludeMissing fun _tosTimestamp() = tosTimestamp

    /** Specifies the type of KYB workflow to run. */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow() = workflow

    /** A user provided id that can be used to link an account holder with an external system */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with a
     * pass result.
     *
     * This field is required only if workflow type is `KYB_BYO`.
     */
    @JsonProperty("kyb_passed_timestamp")
    @ExcludeMissing
    fun _kybPassedTimestamp() = kybPassedTimestamp

    /** Company website URL. */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl() = websiteUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Kyb = apply {
        if (!validated) {
            beneficialOwnerEntities().forEach { it.validate() }
            beneficialOwnerIndividuals().forEach { it.validate() }
            businessEntity().validate()
            controlPerson().validate()
            natureOfBusiness()
            tosTimestamp()
            workflow()
            externalId()
            kybPassedTimestamp()
            websiteUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var beneficialOwnerEntities: JsonField<List<BusinessEntity>> = JsonMissing.of()
        private var beneficialOwnerIndividuals: JsonField<List<KybIndividual>> = JsonMissing.of()
        private var businessEntity: JsonField<BusinessEntity> = JsonMissing.of()
        private var controlPerson: JsonField<KybIndividual> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var tosTimestamp: JsonField<String> = JsonMissing.of()
        private var workflow: JsonField<Workflow> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var kybPassedTimestamp: JsonField<String> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kyb: Kyb) = apply {
            beneficialOwnerEntities = kyb.beneficialOwnerEntities
            beneficialOwnerIndividuals = kyb.beneficialOwnerIndividuals
            businessEntity = kyb.businessEntity
            controlPerson = kyb.controlPerson
            natureOfBusiness = kyb.natureOfBusiness
            tosTimestamp = kyb.tosTimestamp
            workflow = kyb.workflow
            externalId = kyb.externalId
            kybPassedTimestamp = kyb.kybPassedTimestamp
            websiteUrl = kyb.websiteUrl
            additionalProperties = kyb.additionalProperties.toMutableMap()
        }

        /**
         * List of all entities with >25% ownership in the company. If no entity or individual
         * owns >25% of the company, and the largest shareholder is an entity, please identify them
         * in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background. If no business owner is an entity, pass in an empty
         * list. However, either this parameter or `beneficial_owner_individuals` must be populated.
         * on entities that should be included.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: List<BusinessEntity>) =
            beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

        /**
         * List of all entities with >25% ownership in the company. If no entity or individual
         * owns >25% of the company, and the largest shareholder is an entity, please identify them
         * in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background. If no business owner is an entity, pass in an empty
         * list. However, either this parameter or `beneficial_owner_individuals` must be populated.
         * on entities that should be included.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: JsonField<List<BusinessEntity>>) =
            apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities
            }

        /**
         * List of all direct and indirect individuals with >25% ownership in the company. If no
         * entity or individual owns >25% of the company, and the largest shareholder is an
         * individual, please identify them in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background on individuals that should be included. If no individual
         * is an entity, pass in an empty list. However, either this parameter or
         * `beneficial_owner_entities` must be populated.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<KybIndividual>) =
            beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

        /**
         * List of all direct and indirect individuals with >25% ownership in the company. If no
         * entity or individual owns >25% of the company, and the largest shareholder is an
         * individual, please identify them in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background on individuals that should be included. If no individual
         * is an entity, pass in an empty list. However, either this parameter or
         * `beneficial_owner_entities` must be populated.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: JsonField<List<KybIndividual>>) =
            apply {
                this.beneficialOwnerIndividuals = beneficialOwnerIndividuals
            }

        /** Information for business for which the account is being opened and KYB is being run. */
        fun businessEntity(businessEntity: BusinessEntity) =
            businessEntity(JsonField.of(businessEntity))

        /** Information for business for which the account is being opened and KYB is being run. */
        fun businessEntity(businessEntity: JsonField<BusinessEntity>) = apply {
            this.businessEntity = businessEntity
        }

        /**
         * An individual with significant responsibility for managing the legal entity (e.g., a
         * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing
         * Member, General Partner, President, Vice President, or Treasurer). This can be an
         * executive, or someone who will have program-wide access to the cards that Lithic will
         * provide. In some cases, this individual could also be a beneficial owner listed above.
         * See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section II) for more background.
         */
        fun controlPerson(controlPerson: KybIndividual) = controlPerson(JsonField.of(controlPerson))

        /**
         * An individual with significant responsibility for managing the legal entity (e.g., a
         * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing
         * Member, General Partner, President, Vice President, or Treasurer). This can be an
         * executive, or someone who will have program-wide access to the cards that Lithic will
         * provide. In some cases, this individual could also be a beneficial owner listed above.
         * See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section II) for more background.
         */
        fun controlPerson(controlPerson: JsonField<KybIndividual>) = apply {
            this.controlPerson = controlPerson
        }

        /**
         * Short description of the company's line of business (i.e., what does the company do?).
         */
        fun natureOfBusiness(natureOfBusiness: String) =
            natureOfBusiness(JsonField.of(natureOfBusiness))

        /**
         * Short description of the company's line of business (i.e., what does the company do?).
         */
        fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
            this.natureOfBusiness = natureOfBusiness
        }

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

        /** Specifies the type of KYB workflow to run. */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /** Specifies the type of KYB workflow to run. */
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** A user provided id that can be used to link an account holder with an external system */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with
         * a pass result.
         *
         * This field is required only if workflow type is `KYB_BYO`.
         */
        fun kybPassedTimestamp(kybPassedTimestamp: String) =
            kybPassedTimestamp(JsonField.of(kybPassedTimestamp))

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with
         * a pass result.
         *
         * This field is required only if workflow type is `KYB_BYO`.
         */
        fun kybPassedTimestamp(kybPassedTimestamp: JsonField<String>) = apply {
            this.kybPassedTimestamp = kybPassedTimestamp
        }

        /** Company website URL. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /** Company website URL. */
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

        fun build(): Kyb =
            Kyb(
                beneficialOwnerEntities.map { it.toImmutable() },
                beneficialOwnerIndividuals.map { it.toImmutable() },
                businessEntity,
                controlPerson,
                natureOfBusiness,
                tosTimestamp,
                workflow,
                externalId,
                kybPassedTimestamp,
                websiteUrl,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class BusinessEntity
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
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
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        @JsonProperty("government_id") @ExcludeMissing fun _governmentId() = governmentId

        /** Legal (formal) business name. */
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        fun _legalBusinessName() = legalBusinessName

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        @JsonProperty("dba_business_name") @ExcludeMissing fun _dbaBusinessName() = dbaBusinessName

        /** Parent company name (if applicable). */
        @JsonProperty("parent_company") @ExcludeMissing fun _parentCompany() = parentCompany

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BusinessEntity = apply {
            if (!validated) {
                address().validate()
                governmentId()
                legalBusinessName()
                phoneNumbers()
                dbaBusinessName()
                parentCompany()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var legalBusinessName: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<List<String>> = JsonMissing.of()
            private var dbaBusinessName: JsonField<String> = JsonMissing.of()
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(businessEntity: BusinessEntity) = apply {
                address = businessEntity.address
                governmentId = businessEntity.governmentId
                legalBusinessName = businessEntity.legalBusinessName
                phoneNumbers = businessEntity.phoneNumbers
                dbaBusinessName = businessEntity.dbaBusinessName
                parentCompany = businessEntity.parentCompany
                additionalProperties = businessEntity.additionalProperties.toMutableMap()
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
                this.phoneNumbers = phoneNumbers
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

            fun build(): BusinessEntity =
                BusinessEntity(
                    address,
                    governmentId,
                    legalBusinessName,
                    phoneNumbers.map { it.toImmutable() },
                    dbaBusinessName,
                    parentCompany,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BusinessEntity && address == other.address && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && phoneNumbers == other.phoneNumbers && dbaBusinessName == other.dbaBusinessName && parentCompany == other.parentCompany && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, governmentId, legalBusinessName, phoneNumbers, dbaBusinessName, parentCompany, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessEntity{address=$address, governmentId=$governmentId, legalBusinessName=$legalBusinessName, phoneNumbers=$phoneNumbers, dbaBusinessName=$dbaBusinessName, parentCompany=$parentCompany, additionalProperties=$additionalProperties}"
    }

    /** Individuals associated with a KYB application. Phone number is optional. */
    @NoAutoDetect
    class KybIndividual
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
        fun phoneNumber(): Optional<String> =
            Optional.ofNullable(phoneNumber.getNullable("phone_number"))

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id") @ExcludeMissing fun _governmentId() = governmentId

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KybIndividual = apply {
            if (!validated) {
                address().validate()
                dob()
                email()
                firstName()
                governmentId()
                lastName()
                phoneNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kybIndividual: KybIndividual) = apply {
                address = kybIndividual.address
                dob = kybIndividual.dob
                email = kybIndividual.email
                firstName = kybIndividual.firstName
                governmentId = kybIndividual.governmentId
                lastName = kybIndividual.lastName
                phoneNumber = kybIndividual.phoneNumber
                additionalProperties = kybIndividual.additionalProperties.toMutableMap()
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

            fun build(): KybIndividual =
                KybIndividual(
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is KybIndividual && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KybIndividual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class Workflow
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val KYB_BASIC = of("KYB_BASIC")

            @JvmField val KYB_BYO = of("KYB_BYO")

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        enum class Known {
            KYB_BASIC,
            KYB_BYO,
        }

        enum class Value {
            KYB_BASIC,
            KYB_BYO,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KYB_BASIC -> Value.KYB_BASIC
                KYB_BYO -> Value.KYB_BYO
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KYB_BASIC -> Known.KYB_BASIC
                KYB_BYO -> Known.KYB_BYO
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

        return /* spotless:off */ other is Kyb && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessEntity == other.businessEntity && controlPerson == other.controlPerson && natureOfBusiness == other.natureOfBusiness && tosTimestamp == other.tosTimestamp && workflow == other.workflow && externalId == other.externalId && kybPassedTimestamp == other.kybPassedTimestamp && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(beneficialOwnerEntities, beneficialOwnerIndividuals, businessEntity, controlPerson, natureOfBusiness, tosTimestamp, workflow, externalId, kybPassedTimestamp, websiteUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Kyb{beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessEntity=$businessEntity, controlPerson=$controlPerson, natureOfBusiness=$natureOfBusiness, tosTimestamp=$tosTimestamp, workflow=$workflow, externalId=$externalId, kybPassedTimestamp=$kybPassedTimestamp, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
