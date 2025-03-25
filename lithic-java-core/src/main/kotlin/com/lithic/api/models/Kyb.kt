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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class Kyb
private constructor(
    private val beneficialOwnerEntities: JsonField<List<BusinessEntity>>,
    private val beneficialOwnerIndividuals: JsonField<List<KybIndividual>>,
    private val businessEntity: JsonField<BusinessEntity>,
    private val controlPerson: JsonField<KybIndividual>,
    private val natureOfBusiness: JsonField<String>,
    private val tosTimestamp: JsonField<String>,
    private val workflow: JsonField<Workflow>,
    private val externalId: JsonField<String>,
    private val kybPassedTimestamp: JsonField<String>,
    private val websiteUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("beneficial_owner_entities")
        @ExcludeMissing
        beneficialOwnerEntities: JsonField<List<BusinessEntity>> = JsonMissing.of(),
        @JsonProperty("beneficial_owner_individuals")
        @ExcludeMissing
        beneficialOwnerIndividuals: JsonField<List<KybIndividual>> = JsonMissing.of(),
        @JsonProperty("business_entity")
        @ExcludeMissing
        businessEntity: JsonField<BusinessEntity> = JsonMissing.of(),
        @JsonProperty("control_person")
        @ExcludeMissing
        controlPerson: JsonField<KybIndividual> = JsonMissing.of(),
        @JsonProperty("nature_of_business")
        @ExcludeMissing
        natureOfBusiness: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tos_timestamp")
        @ExcludeMissing
        tosTimestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workflow") @ExcludeMissing workflow: JsonField<Workflow> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kyb_passed_timestamp")
        @ExcludeMissing
        kybPassedTimestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website_url")
        @ExcludeMissing
        websiteUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        beneficialOwnerEntities,
        beneficialOwnerIndividuals,
        businessEntity,
        controlPerson,
        natureOfBusiness,
        tosTimestamp,
        workflow,
        externalId,
        kybPassedTimestamp,
        websiteUrl,
        mutableMapOf(),
    )

    /**
     * List of all entities with >25% ownership in the company. If no entity or individual owns >25%
     * of the company, and the largest shareholder is an entity, please identify them in this field.
     * See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section I) for more background. If no business owner is an entity, pass in an empty list.
     * However, either this parameter or `beneficial_owner_individuals` must be populated. on
     * entities that should be included.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficialOwnerIndividuals(): List<KybIndividual> =
        beneficialOwnerIndividuals.getRequired("beneficial_owner_individuals")

    /**
     * Information for business for which the account is being opened and KYB is being run.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessEntity(): BusinessEntity = businessEntity.getRequired("business_entity")

    /**
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing Member, General
     * Partner, President, Vice President, or Treasurer). This can be an executive, or someone who
     * will have program-wide access to the cards that Lithic will provide. In some cases, this
     * individual could also be a beneficial owner listed above. See
     * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
     * (Section II) for more background.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun controlPerson(): KybIndividual = controlPerson.getRequired("control_person")

    /**
     * Short description of the company's line of business (i.e., what does the company do?).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun natureOfBusiness(): String = natureOfBusiness.getRequired("nature_of_business")

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tosTimestamp(): String = tosTimestamp.getRequired("tos_timestamp")

    /**
     * Specifies the type of KYB workflow to run.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /**
     * A user provided id that can be used to link an account holder with an external system
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with a
     * pass result.
     *
     * This field is required only if workflow type is `KYB_BYO`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kybPassedTimestamp(): Optional<String> =
        Optional.ofNullable(kybPassedTimestamp.getNullable("kyb_passed_timestamp"))

    /**
     * Company website URL.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun websiteUrl(): Optional<String> = Optional.ofNullable(websiteUrl.getNullable("website_url"))

    /**
     * Returns the raw JSON value of [beneficialOwnerEntities].
     *
     * Unlike [beneficialOwnerEntities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities(): JsonField<List<BusinessEntity>> = beneficialOwnerEntities

    /**
     * Returns the raw JSON value of [beneficialOwnerIndividuals].
     *
     * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals(): JsonField<List<KybIndividual>> = beneficialOwnerIndividuals

    /**
     * Returns the raw JSON value of [businessEntity].
     *
     * Unlike [businessEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_entity")
    @ExcludeMissing
    fun _businessEntity(): JsonField<BusinessEntity> = businessEntity

    /**
     * Returns the raw JSON value of [controlPerson].
     *
     * Unlike [controlPerson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("control_person")
    @ExcludeMissing
    fun _controlPerson(): JsonField<KybIndividual> = controlPerson

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
     * Returns the raw JSON value of [tosTimestamp].
     *
     * Unlike [tosTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tos_timestamp")
    @ExcludeMissing
    fun _tosTimestamp(): JsonField<String> = tosTimestamp

    /**
     * Returns the raw JSON value of [workflow].
     *
     * Unlike [workflow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow(): JsonField<Workflow> = workflow

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [kybPassedTimestamp].
     *
     * Unlike [kybPassedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("kyb_passed_timestamp")
    @ExcludeMissing
    fun _kybPassedTimestamp(): JsonField<String> = kybPassedTimestamp

    /**
     * Returns the raw JSON value of [websiteUrl].
     *
     * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl(): JsonField<String> = websiteUrl

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Kyb].
         *
         * The following fields are required:
         * ```java
         * .beneficialOwnerEntities()
         * .beneficialOwnerIndividuals()
         * .businessEntity()
         * .controlPerson()
         * .natureOfBusiness()
         * .tosTimestamp()
         * .workflow()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Kyb]. */
    class Builder internal constructor() {

        private var beneficialOwnerEntities: JsonField<MutableList<BusinessEntity>>? = null
        private var beneficialOwnerIndividuals: JsonField<MutableList<KybIndividual>>? = null
        private var businessEntity: JsonField<BusinessEntity>? = null
        private var controlPerson: JsonField<KybIndividual>? = null
        private var natureOfBusiness: JsonField<String>? = null
        private var tosTimestamp: JsonField<String>? = null
        private var workflow: JsonField<Workflow>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var kybPassedTimestamp: JsonField<String> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kyb: Kyb) = apply {
            beneficialOwnerEntities = kyb.beneficialOwnerEntities.map { it.toMutableList() }
            beneficialOwnerIndividuals = kyb.beneficialOwnerIndividuals.map { it.toMutableList() }
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
         * Sets [Builder.beneficialOwnerEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwnerEntities] with a well-typed
         * `List<BusinessEntity>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: JsonField<List<BusinessEntity>>) =
            apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities.map { it.toMutableList() }
            }

        /**
         * Adds a single [BusinessEntity] to [beneficialOwnerEntities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeneficialOwnerEntity(beneficialOwnerEntity: BusinessEntity) = apply {
            beneficialOwnerEntities =
                (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("beneficialOwnerEntities", it).add(beneficialOwnerEntity)
                }
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
         * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
         * `List<KybIndividual>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: JsonField<List<KybIndividual>>) =
            apply {
                this.beneficialOwnerIndividuals =
                    beneficialOwnerIndividuals.map { it.toMutableList() }
            }

        /**
         * Adds a single [KybIndividual] to [beneficialOwnerIndividuals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: KybIndividual) = apply {
            beneficialOwnerIndividuals =
                (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("beneficialOwnerIndividuals", it).add(beneficialOwnerIndividual)
                }
        }

        /** Information for business for which the account is being opened and KYB is being run. */
        fun businessEntity(businessEntity: BusinessEntity) =
            businessEntity(JsonField.of(businessEntity))

        /**
         * Sets [Builder.businessEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessEntity] with a well-typed [BusinessEntity] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.controlPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controlPerson] with a well-typed [KybIndividual] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: String) = tosTimestamp(JsonField.of(tosTimestamp))

        /**
         * Sets [Builder.tosTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tosTimestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tosTimestamp(tosTimestamp: JsonField<String>) = apply {
            this.tosTimestamp = tosTimestamp
        }

        /** Specifies the type of KYB workflow to run. */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /**
         * Sets [Builder.workflow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflow] with a well-typed [Workflow] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

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

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the business with
         * a pass result.
         *
         * This field is required only if workflow type is `KYB_BYO`.
         */
        fun kybPassedTimestamp(kybPassedTimestamp: String) =
            kybPassedTimestamp(JsonField.of(kybPassedTimestamp))

        /**
         * Sets [Builder.kybPassedTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kybPassedTimestamp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun kybPassedTimestamp(kybPassedTimestamp: JsonField<String>) = apply {
            this.kybPassedTimestamp = kybPassedTimestamp
        }

        /** Company website URL. */
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

        /**
         * Returns an immutable instance of [Kyb].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .beneficialOwnerEntities()
         * .beneficialOwnerIndividuals()
         * .businessEntity()
         * .controlPerson()
         * .natureOfBusiness()
         * .tosTimestamp()
         * .workflow()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Kyb =
            Kyb(
                checkRequired("beneficialOwnerEntities", beneficialOwnerEntities).map {
                    it.toImmutable()
                },
                checkRequired("beneficialOwnerIndividuals", beneficialOwnerIndividuals).map {
                    it.toImmutable()
                },
                checkRequired("businessEntity", businessEntity),
                checkRequired("controlPerson", controlPerson),
                checkRequired("natureOfBusiness", natureOfBusiness),
                checkRequired("tosTimestamp", tosTimestamp),
                checkRequired("workflow", workflow),
                externalId,
                kybPassedTimestamp,
                websiteUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Kyb = apply {
        if (validated) {
            return@apply
        }

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

    class BusinessEntity
    private constructor(
        private val address: JsonField<Address>,
        private val governmentId: JsonField<String>,
        private val legalBusinessName: JsonField<String>,
        private val phoneNumbers: JsonField<List<String>>,
        private val dbaBusinessName: JsonField<String>,
        private val parentCompany: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("government_id")
            @ExcludeMissing
            governmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            legalBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dba_business_name")
            @ExcludeMissing
            dbaBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_company")
            @ExcludeMissing
            parentCompany: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            governmentId,
            legalBusinessName,
            phoneNumbers,
            dbaBusinessName,
            parentCompany,
            mutableMapOf(),
        )

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /**
         * Legal (formal) business name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

        /**
         * One or more of the business's phone number(s), entered as a list in E.164 format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dbaBusinessName(): Optional<String> =
            Optional.ofNullable(dbaBusinessName.getNullable("dba_business_name"))

        /**
         * Parent company name (if applicable).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentCompany(): Optional<String> =
            Optional.ofNullable(parentCompany.getNullable("parent_company"))

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

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
         * Returns the raw JSON value of [legalBusinessName].
         *
         * Unlike [legalBusinessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        fun _legalBusinessName(): JsonField<String> = legalBusinessName

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

        /**
         * Returns the raw JSON value of [dbaBusinessName].
         *
         * Unlike [dbaBusinessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

        /**
         * Returns the raw JSON value of [parentCompany].
         *
         * Unlike [parentCompany], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_company")
        @ExcludeMissing
        fun _parentCompany(): JsonField<String> = parentCompany

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [BusinessEntity].
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

        /** A builder for [BusinessEntity]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var governmentId: JsonField<String>? = null
            private var legalBusinessName: JsonField<String>? = null
            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var dbaBusinessName: JsonField<String> = JsonMissing.of()
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(businessEntity: BusinessEntity) = apply {
                address = businessEntity.address
                governmentId = businessEntity.governmentId
                legalBusinessName = businessEntity.legalBusinessName
                phoneNumbers = businessEntity.phoneNumbers.map { it.toMutableList() }
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
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
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

            /** Legal (formal) business name. */
            fun legalBusinessName(legalBusinessName: String) =
                legalBusinessName(JsonField.of(legalBusinessName))

            /**
             * Sets [Builder.legalBusinessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalBusinessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                this.legalBusinessName = legalBusinessName
            }

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
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
             * Sets [Builder.dbaBusinessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dbaBusinessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
                this.dbaBusinessName = dbaBusinessName
            }

            /** Parent company name (if applicable). */
            fun parentCompany(parentCompany: String) = parentCompany(JsonField.of(parentCompany))

            /**
             * Sets [Builder.parentCompany] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentCompany] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [BusinessEntity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .governmentId()
             * .legalBusinessName()
             * .phoneNumbers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BusinessEntity =
                BusinessEntity(
                    checkRequired("address", address),
                    checkRequired("governmentId", governmentId),
                    checkRequired("legalBusinessName", legalBusinessName),
                    checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                    dbaBusinessName,
                    parentCompany,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BusinessEntity = apply {
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
    class KybIndividual
    private constructor(
        private val address: JsonField<Address>,
        private val dob: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val governmentId: JsonField<String>,
        private val lastName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("government_id")
            @ExcludeMissing
            governmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            dob,
            email,
            firstName,
            governmentId,
            lastName,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Individual's date of birth, as an RFC 3339 date.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dob(): String = dob.getRequired("dob")

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Individual's first name, as it appears on government-issued identity documents.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /**
         * Individual's last name, as it appears on government-issued identity documents.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [KybIndividual].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .dob()
             * .email()
             * .firstName()
             * .governmentId()
             * .lastName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [KybIndividual]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dob: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var governmentId: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
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

            /**
             * Returns an immutable instance of [KybIndividual].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .dob()
             * .email()
             * .firstName()
             * .governmentId()
             * .lastName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): KybIndividual =
                KybIndividual(
                    checkRequired("address", address),
                    checkRequired("dob", dob),
                    checkRequired("email", email),
                    checkRequired("firstName", firstName),
                    checkRequired("governmentId", governmentId),
                    checkRequired("lastName", lastName),
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): KybIndividual = apply {
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

    /** Specifies the type of KYB workflow to run. */
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

            @JvmField val KYB_BASIC = of("KYB_BASIC")

            @JvmField val KYB_BYO = of("KYB_BYO")

            @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
        }

        /** An enum containing [Workflow]'s known values. */
        enum class Known {
            KYB_BASIC,
            KYB_BYO,
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
            KYB_BASIC,
            KYB_BYO,
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
                KYB_BASIC -> Value.KYB_BASIC
                KYB_BYO -> Value.KYB_BYO
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
                KYB_BASIC -> Known.KYB_BASIC
                KYB_BYO -> Known.KYB_BYO
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

        return /* spotless:off */ other is Kyb && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessEntity == other.businessEntity && controlPerson == other.controlPerson && natureOfBusiness == other.natureOfBusiness && tosTimestamp == other.tosTimestamp && workflow == other.workflow && externalId == other.externalId && kybPassedTimestamp == other.kybPassedTimestamp && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(beneficialOwnerEntities, beneficialOwnerIndividuals, businessEntity, controlPerson, natureOfBusiness, tosTimestamp, workflow, externalId, kybPassedTimestamp, websiteUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Kyb{beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessEntity=$businessEntity, controlPerson=$controlPerson, natureOfBusiness=$natureOfBusiness, tosTimestamp=$tosTimestamp, workflow=$workflow, externalId=$externalId, kybPassedTimestamp=$kybPassedTimestamp, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
