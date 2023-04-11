package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class AccountHolderCreateParams constructor(private val kyb: Kyb?,private val kyc: Kyc?,private val kycExempt: KycExempt?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,) {

    fun kyb(): Optional<Kyb> = Optional.ofNullable(kyb)

    fun kyc(): Optional<Kyc> = Optional.ofNullable(kyc)

    fun kycExempt(): Optional<KycExempt> = Optional.ofNullable(kycExempt)

    @JvmSynthetic
    internal fun getBody(): AccountHolderCreateBody {
      return AccountHolderCreateBody(
          kyb,
          kyc,
          kycExempt,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(using = AccountHolderCreateBody.Deserializer::class)
    @JsonSerialize(using = AccountHolderCreateBody.Serializer::class)
    class AccountHolderCreateBody internal constructor(private val kyb: Kyb? = null,private val kyc: Kyc? = null,private val kycExempt: KycExempt? = null,private val _json: JsonValue? = null,) {

        fun kyb(): Optional<Kyb> = Optional.ofNullable(kyb)
        fun kyc(): Optional<Kyc> = Optional.ofNullable(kyc)
        fun kycExempt(): Optional<KycExempt> = Optional.ofNullable(kycExempt)

        fun isKyb(): Boolean = kyb != null
        fun isKyc(): Boolean = kyc != null
        fun isKycExempt(): Boolean = kycExempt != null

        fun asKyb(): Kyb = kyb.getOrThrow("kyb")
        fun asKyc(): Kyc = kyc.getOrThrow("kyc")
        fun asKycExempt(): KycExempt = kycExempt.getOrThrow("kycExempt")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              kyb != null -> visitor.visitKyb(kyb)
              kyc != null -> visitor.visitKyc(kyc)
              kycExempt != null -> visitor.visitKycExempt(kycExempt)
              else -> visitor.unknown(_json)
          }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AccountHolderCreateBody &&
              this.kyb == other.kyb &&
              this.kyc == other.kyc &&
              this.kycExempt == other.kycExempt
        }

        override fun hashCode(): Int {
          return Objects.hash(
              kyb,
              kyc,
              kycExempt,
          )
        }

        override fun toString(): String {
          return when {
              kyb != null -> "AccountHolderCreateBody{kyb=$kyb}"
              kyc != null -> "AccountHolderCreateBody{kyc=$kyc}"
              kycExempt != null -> "AccountHolderCreateBody{kycExempt=$kycExempt}"
              _json != null -> "AccountHolderCreateBody{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid AccountHolderCreateBody")
          }
        }

        companion object {

            @JvmStatic
            fun ofKyb(kyb: Kyb) = AccountHolderCreateBody(kyb = kyb)

            @JvmStatic
            fun ofKyc(kyc: Kyc) = AccountHolderCreateBody(kyc = kyc)

            @JvmStatic
            fun ofKycExempt(kycExempt: KycExempt) = AccountHolderCreateBody(kycExempt = kycExempt)
        }

        interface Visitor<out T> {

            fun visitKyb(kyb: Kyb): T

            fun visitKyc(kyc: Kyc): T

            fun visitKycExempt(kycExempt: KycExempt): T

            fun unknown(json: JsonValue?): T {
              throw LithicInvalidDataException("Unknown AccountHolderCreateBody: $json")
            }
        }

        class Deserializer : BaseDeserializer<AccountHolderCreateBody>(AccountHolderCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountHolderCreateBody {
              val json = JsonValue.fromJsonNode(node)
              tryDeserialize(node, jacksonTypeRef<Kyb>())?.let {
                  return AccountHolderCreateBody(kyb = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Kyc>())?.let {
                  return AccountHolderCreateBody(kyc = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<KycExempt>())?.let {
                  return AccountHolderCreateBody(kycExempt = it, _json = json)
              }

              return AccountHolderCreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<AccountHolderCreateBody>(AccountHolderCreateBody::class) {

            override fun serialize(value: AccountHolderCreateBody, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.kyb != null -> generator.writeObject(value.kyb)
                  value.kyc != null -> generator.writeObject(value.kyc)
                  value.kycExempt != null -> generator.writeObject(value.kycExempt)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid AccountHolderCreateBody")
              }
            }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AccountHolderCreateParams &&
          this.kyb == other.kyb &&
          this.kyc == other.kyc &&
          this.kycExempt == other.kycExempt &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          kyb,
          kyc,
          kycExempt,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "AccountHolderCreateParams{kyb=$kyb, kyc=$kyc, kycExempt=$kycExempt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var kyb: Kyb? = null
        private var kyc: Kyc? = null
        private var kycExempt: KycExempt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderCreateParams: AccountHolderCreateParams) = apply {
            this.kyb = accountHolderCreateParams.kyb
            this.kyc = accountHolderCreateParams.kyc
            this.kycExempt = accountHolderCreateParams.kycExempt
            additionalQueryParams(accountHolderCreateParams.additionalQueryParams)
            additionalHeaders(accountHolderCreateParams.additionalHeaders)
        }

        fun forKyb(kyb: Kyb) = apply {
            this.kyb = kyb
            this.kyc = null
            this.kycExempt = null
        }
        fun forKyc(kyc: Kyc) = apply {
            this.kyb = null
            this.kyc = kyc
            this.kycExempt = null
        }
        fun forKycExempt(kycExempt: KycExempt) = apply {
            this.kyb = null
            this.kyc = null
            this.kycExempt = kycExempt
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun build(): AccountHolderCreateParams = AccountHolderCreateParams(
            kyb,
            kyc,
            kycExempt,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Kyb.Builder::class)
    @NoAutoDetect
    class Kyb private constructor(private val businessEntity: BusinessEntity?,private val beneficialOwnerEntities: List<BusinessEntity>?,private val beneficialOwnerIndividuals: List<Individual>?,private val controlPerson: Individual?,private val kybPassedTimestamp: String?,private val natureOfBusiness: String?,private val tosTimestamp: String?,private val websiteUrl: String?,private val workflow: Workflow?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Information for business for which the account is being opened and KYB is being
         * run.
         */
        @JsonProperty("business_entity")
        fun businessEntity(): BusinessEntity? = businessEntity

        /**
         * List of all entities with >25% ownership in the company. If no entity or
         * individual owns >25% of the company, and the largest shareholder is an entity,
         * please identify them in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background. If no business owner is an entity, pass in an
         * empty list. However, either this parameter or `beneficial_owner_individuals`
         * must be populated. on entities that should be included.
         */
        @JsonProperty("beneficial_owner_entities")
        fun beneficialOwnerEntities(): List<BusinessEntity>? = beneficialOwnerEntities

        /**
         * List of all individuals with >25% ownership in the company. If no entity or
         * individual owns >25% of the company, and the largest shareholder is an
         * individual, please identify them in this field. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section I) for more background on individuals that should be included. If no
         * individual is an entity, pass in an empty list. However, either this parameter
         * or `beneficial_owner_entities` must be populated.
         */
        @JsonProperty("beneficial_owner_individuals")
        fun beneficialOwnerIndividuals(): List<Individual>? = beneficialOwnerIndividuals

        /**
         * An individual with significant responsibility for managing the legal entity
         * (e.g., a Chief Executive Officer, Chief Financial Officer, Chief Operating
         * Officer, Managing Member, General Partner, President, Vice President, or
         * Treasurer). This can be an executive, or someone who will have program-wide
         * access to the cards that Lithic will provide. In some cases, this individual
         * could also be a beneficial owner listed above. See
         * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
         * (Section II) for more background.
         */
        @JsonProperty("control_person")
        fun controlPerson(): Individual? = controlPerson

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the
         * business with a pass result.
         *
         * This field is required only if workflow type is `KYB_BYO`.
         */
        @JsonProperty("kyb_passed_timestamp")
        fun kybPassedTimestamp(): String? = kybPassedTimestamp

        /**
         * Short description of the company's line of business (i.e., what does the company
         * do?).
         */
        @JsonProperty("nature_of_business")
        fun natureOfBusiness(): String? = natureOfBusiness

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable
         * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
         * implementation with Lithic.
         */
        @JsonProperty("tos_timestamp")
        fun tosTimestamp(): String? = tosTimestamp

        /** Company website URL. */
        @JsonProperty("website_url")
        fun websiteUrl(): String? = websiteUrl

        /** Specifies the type of KYB workflow to run. */
        @JsonProperty("workflow")
        fun workflow(): Workflow? = workflow

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Kyb &&
              this.businessEntity == other.businessEntity &&
              this.beneficialOwnerEntities == other.beneficialOwnerEntities &&
              this.beneficialOwnerIndividuals == other.beneficialOwnerIndividuals &&
              this.controlPerson == other.controlPerson &&
              this.kybPassedTimestamp == other.kybPassedTimestamp &&
              this.natureOfBusiness == other.natureOfBusiness &&
              this.tosTimestamp == other.tosTimestamp &&
              this.websiteUrl == other.websiteUrl &&
              this.workflow == other.workflow &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                businessEntity,
                beneficialOwnerEntities,
                beneficialOwnerIndividuals,
                controlPerson,
                kybPassedTimestamp,
                natureOfBusiness,
                tosTimestamp,
                websiteUrl,
                workflow,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Kyb{businessEntity=$businessEntity, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, controlPerson=$controlPerson, kybPassedTimestamp=$kybPassedTimestamp, natureOfBusiness=$natureOfBusiness, tosTimestamp=$tosTimestamp, websiteUrl=$websiteUrl, workflow=$workflow, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var businessEntity: BusinessEntity? = null
            private var beneficialOwnerEntities: List<BusinessEntity>? = null
            private var beneficialOwnerIndividuals: List<Individual>? = null
            private var controlPerson: Individual? = null
            private var kybPassedTimestamp: String? = null
            private var natureOfBusiness: String? = null
            private var tosTimestamp: String? = null
            private var websiteUrl: String? = null
            private var workflow: Workflow? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kyb: Kyb) = apply {
                this.businessEntity = kyb.businessEntity
                this.beneficialOwnerEntities = kyb.beneficialOwnerEntities
                this.beneficialOwnerIndividuals = kyb.beneficialOwnerIndividuals
                this.controlPerson = kyb.controlPerson
                this.kybPassedTimestamp = kyb.kybPassedTimestamp
                this.natureOfBusiness = kyb.natureOfBusiness
                this.tosTimestamp = kyb.tosTimestamp
                this.websiteUrl = kyb.websiteUrl
                this.workflow = kyb.workflow
                additionalProperties(kyb.additionalProperties)
            }

            /**
             * Information for business for which the account is being opened and KYB is being
             * run.
             */
            @JsonProperty("business_entity")
            fun businessEntity(businessEntity: BusinessEntity) = apply {
                this.businessEntity = businessEntity
            }

            /**
             * List of all entities with >25% ownership in the company. If no entity or
             * individual owns >25% of the company, and the largest shareholder is an entity,
             * please identify them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section I) for more background. If no business owner is an entity, pass in an
             * empty list. However, either this parameter or `beneficial_owner_individuals`
             * must be populated. on entities that should be included.
             */
            @JsonProperty("beneficial_owner_entities")
            fun beneficialOwnerEntities(beneficialOwnerEntities: List<BusinessEntity>) = apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities
            }

            /**
             * List of all individuals with >25% ownership in the company. If no entity or
             * individual owns >25% of the company, and the largest shareholder is an
             * individual, please identify them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section I) for more background on individuals that should be included. If no
             * individual is an entity, pass in an empty list. However, either this parameter
             * or `beneficial_owner_entities` must be populated.
             */
            @JsonProperty("beneficial_owner_individuals")
            fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<Individual>) = apply {
                this.beneficialOwnerIndividuals = beneficialOwnerIndividuals
            }

            /**
             * An individual with significant responsibility for managing the legal entity
             * (e.g., a Chief Executive Officer, Chief Financial Officer, Chief Operating
             * Officer, Managing Member, General Partner, President, Vice President, or
             * Treasurer). This can be an executive, or someone who will have program-wide
             * access to the cards that Lithic will provide. In some cases, this individual
             * could also be a beneficial owner listed above. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section II) for more background.
             */
            @JsonProperty("control_person")
            fun controlPerson(controlPerson: Individual) = apply {
                this.controlPerson = controlPerson
            }

            /**
             * An RFC 3339 timestamp indicating when precomputed KYC was completed on the
             * business with a pass result.
             *
             * This field is required only if workflow type is `KYB_BYO`.
             */
            @JsonProperty("kyb_passed_timestamp")
            fun kybPassedTimestamp(kybPassedTimestamp: String) = apply {
                this.kybPassedTimestamp = kybPassedTimestamp
            }

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             */
            @JsonProperty("nature_of_business")
            fun natureOfBusiness(natureOfBusiness: String) = apply {
                this.natureOfBusiness = natureOfBusiness
            }

            /**
             * An RFC 3339 timestamp indicating when the account holder accepted the applicable
             * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
             * implementation with Lithic.
             */
            @JsonProperty("tos_timestamp")
            fun tosTimestamp(tosTimestamp: String) = apply {
                this.tosTimestamp = tosTimestamp
            }

            /** Company website URL. */
            @JsonProperty("website_url")
            fun websiteUrl(websiteUrl: String) = apply {
                this.websiteUrl = websiteUrl
            }

            /** Specifies the type of KYB workflow to run. */
            @JsonProperty("workflow")
            fun workflow(workflow: Workflow) = apply {
                this.workflow = workflow
            }

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

            fun build(): Kyb = Kyb(
                checkNotNull(businessEntity) {
                    "`businessEntity` is required but was not set"
                },
                checkNotNull(beneficialOwnerEntities) {
                    "`beneficialOwnerEntities` is required but was not set"
                }.toUnmodifiable(),
                checkNotNull(beneficialOwnerIndividuals) {
                    "`beneficialOwnerIndividuals` is required but was not set"
                }.toUnmodifiable(),
                checkNotNull(controlPerson) {
                    "`controlPerson` is required but was not set"
                },
                kybPassedTimestamp,
                checkNotNull(natureOfBusiness) {
                    "`natureOfBusiness` is required but was not set"
                },
                checkNotNull(tosTimestamp) {
                    "`tosTimestamp` is required but was not set"
                },
                checkNotNull(websiteUrl) {
                    "`websiteUrl` is required but was not set"
                },
                checkNotNull(workflow) {
                    "`workflow` is required but was not set"
                },
                additionalProperties.toUnmodifiable(),
            )
        }

        /**
         * Information for business for which the account is being opened and KYB is being
         * run.
         */
        @JsonDeserialize(builder = BusinessEntity.Builder::class)
        @NoAutoDetect
        class BusinessEntity private constructor(private val address: Address?,private val dbaBusinessName: String?,private val governmentId: String?,private val legalBusinessName: String?,private val parentCompany: String?,private val phoneNumbers: List<String>?,private val additionalProperties: Map<String, JsonValue>,) {

            private var hashCode: Int = 0

            /**
             * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            @JsonProperty("address")
            fun address(): Address? = address

            /**
             * Any name that the business operates under that is not its legal business name
             * (if applicable).
             */
            @JsonProperty("dba_business_name")
            fun dbaBusinessName(): String? = dbaBusinessName

            /**
             * Government-issued identification number. US Federal Employer Identification
             * Numbers (EIN) are currently supported, entered as full nine-digits, with or
             * without hyphens.
             */
            @JsonProperty("government_id")
            fun governmentId(): String? = governmentId

            /** Legal (formal) business name. */
            @JsonProperty("legal_business_name")
            fun legalBusinessName(): String? = legalBusinessName

            /** Parent company name (if applicable). */
            @JsonProperty("parent_company")
            fun parentCompany(): String? = parentCompany

            /**
             * One or more of the business's phone number(s), entered as a list in E.164
             * format.
             */
            @JsonProperty("phone_numbers")
            fun phoneNumbers(): List<String>? = phoneNumbers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is BusinessEntity &&
                  this.address == other.address &&
                  this.dbaBusinessName == other.dbaBusinessName &&
                  this.governmentId == other.governmentId &&
                  this.legalBusinessName == other.legalBusinessName &&
                  this.parentCompany == other.parentCompany &&
                  this.phoneNumbers == other.phoneNumbers &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    address,
                    dbaBusinessName,
                    governmentId,
                    legalBusinessName,
                    parentCompany,
                    phoneNumbers,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "BusinessEntity{address=$address, dbaBusinessName=$dbaBusinessName, governmentId=$governmentId, legalBusinessName=$legalBusinessName, parentCompany=$parentCompany, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var address: Address? = null
                private var dbaBusinessName: String? = null
                private var governmentId: String? = null
                private var legalBusinessName: String? = null
                private var parentCompany: String? = null
                private var phoneNumbers: List<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(businessEntity: BusinessEntity) = apply {
                    this.address = businessEntity.address
                    this.dbaBusinessName = businessEntity.dbaBusinessName
                    this.governmentId = businessEntity.governmentId
                    this.legalBusinessName = businessEntity.legalBusinessName
                    this.parentCompany = businessEntity.parentCompany
                    this.phoneNumbers = businessEntity.phoneNumbers
                    additionalProperties(businessEntity.additionalProperties)
                }

                /**
                 * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable.
                 */
                @JsonProperty("address")
                fun address(address: Address) = apply {
                    this.address = address
                }

                /**
                 * Any name that the business operates under that is not its legal business name
                 * (if applicable).
                 */
                @JsonProperty("dba_business_name")
                fun dbaBusinessName(dbaBusinessName: String) = apply {
                    this.dbaBusinessName = dbaBusinessName
                }

                /**
                 * Government-issued identification number. US Federal Employer Identification
                 * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                 * without hyphens.
                 */
                @JsonProperty("government_id")
                fun governmentId(governmentId: String) = apply {
                    this.governmentId = governmentId
                }

                /** Legal (formal) business name. */
                @JsonProperty("legal_business_name")
                fun legalBusinessName(legalBusinessName: String) = apply {
                    this.legalBusinessName = legalBusinessName
                }

                /** Parent company name (if applicable). */
                @JsonProperty("parent_company")
                fun parentCompany(parentCompany: String) = apply {
                    this.parentCompany = parentCompany
                }

                /**
                 * One or more of the business's phone number(s), entered as a list in E.164
                 * format.
                 */
                @JsonProperty("phone_numbers")
                fun phoneNumbers(phoneNumbers: List<String>) = apply {
                    this.phoneNumbers = phoneNumbers
                }

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

                fun build(): BusinessEntity = BusinessEntity(
                    checkNotNull(address) {
                        "`address` is required but was not set"
                    },
                    dbaBusinessName,
                    checkNotNull(governmentId) {
                        "`governmentId` is required but was not set"
                    },
                    checkNotNull(legalBusinessName) {
                        "`legalBusinessName` is required but was not set"
                    },
                    parentCompany,
                    checkNotNull(phoneNumbers) {
                        "`phoneNumbers` is required but was not set"
                    }.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
            }
        }

        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual private constructor(private val address: Address?,private val dob: String?,private val email: String?,private val firstName: String?,private val governmentId: String?,private val lastName: String?,private val phoneNumber: String?,private val additionalProperties: Map<String, JsonValue>,) {

            private var hashCode: Int = 0

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            fun address(): Address? = address

            /** Individual's date of birth, as an RFC 3339 date. */
            @JsonProperty("dob")
            fun dob(): String? = dob

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            @JsonProperty("email")
            fun email(): String? = email

            /** Individual's first name, as it appears on government-issued identity documents. */
            @JsonProperty("first_name")
            fun firstName(): String? = firstName

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and
             * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
             * entered as full nine-digits, with or without hyphens
             */
            @JsonProperty("government_id")
            fun governmentId(): String? = governmentId

            /** Individual's last name, as it appears on government-issued identity documents. */
            @JsonProperty("last_name")
            fun lastName(): String? = lastName

            /** Individual's phone number, entered in E.164 format. */
            @JsonProperty("phone_number")
            fun phoneNumber(): String? = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Individual &&
                  this.address == other.address &&
                  this.dob == other.dob &&
                  this.email == other.email &&
                  this.firstName == other.firstName &&
                  this.governmentId == other.governmentId &&
                  this.lastName == other.lastName &&
                  this.phoneNumber == other.phoneNumber &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
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

            override fun toString() = "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
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
                fun address(address: Address) = apply {
                    this.address = address
                }

                /** Individual's date of birth, as an RFC 3339 date. */
                @JsonProperty("dob")
                fun dob(dob: String) = apply {
                    this.dob = dob
                }

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                @JsonProperty("email")
                fun email(email: String) = apply {
                    this.email = email
                }

                /** Individual's first name, as it appears on government-issued identity documents. */
                @JsonProperty("first_name")
                fun firstName(firstName: String) = apply {
                    this.firstName = firstName
                }

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                @JsonProperty("government_id")
                fun governmentId(governmentId: String) = apply {
                    this.governmentId = governmentId
                }

                /** Individual's last name, as it appears on government-issued identity documents. */
                @JsonProperty("last_name")
                fun lastName(lastName: String) = apply {
                    this.lastName = lastName
                }

                /** Individual's phone number, entered in E.164 format. */
                @JsonProperty("phone_number")
                fun phoneNumber(phoneNumber: String) = apply {
                    this.phoneNumber = phoneNumber
                }

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

                fun build(): Individual = Individual(
                    checkNotNull(address) {
                        "`address` is required but was not set"
                    },
                    checkNotNull(dob) {
                        "`dob` is required but was not set"
                    },
                    checkNotNull(email) {
                        "`email` is required but was not set"
                    },
                    checkNotNull(firstName) {
                        "`firstName` is required but was not set"
                    },
                    checkNotNull(governmentId) {
                        "`governmentId` is required but was not set"
                    },
                    checkNotNull(lastName) {
                        "`lastName` is required but was not set"
                    },
                    checkNotNull(phoneNumber) {
                        "`phoneNumber` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
            }
        }

        class Workflow @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Workflow &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val KYB_BASIC = Workflow(JsonField.of("KYB_BASIC"))

                @JvmField val KYB_BYO = Workflow(JsonField.of("KYB_BYO"))

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

            fun value(): Value = when (this) {
                KYB_BASIC -> Value.KYB_BASIC
                KYB_BYO -> Value.KYB_BYO
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                KYB_BASIC -> Known.KYB_BASIC
                KYB_BYO -> Known.KYB_BYO
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = Kyc.Builder::class)
    @NoAutoDetect
    class Kyc private constructor(private val individual: Individual?,private val kycPassedTimestamp: String?,private val tosTimestamp: String?,private val workflow: Workflow?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Information on individual for whom the account is being opened and KYC is being
         * run.
         */
        @JsonProperty("individual")
        fun individual(): Individual? = individual

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the
         * individual with a pass result.
         *
         * This field is required only if workflow type is `KYC_BYO`.
         */
        @JsonProperty("kyc_passed_timestamp")
        fun kycPassedTimestamp(): String? = kycPassedTimestamp

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable
         * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
         * implementation with Lithic.
         */
        @JsonProperty("tos_timestamp")
        fun tosTimestamp(): String? = tosTimestamp

        /** Specifies the type of KYC workflow to run. */
        @JsonProperty("workflow")
        fun workflow(): Workflow? = workflow

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Kyc &&
              this.individual == other.individual &&
              this.kycPassedTimestamp == other.kycPassedTimestamp &&
              this.tosTimestamp == other.tosTimestamp &&
              this.workflow == other.workflow &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                individual,
                kycPassedTimestamp,
                tosTimestamp,
                workflow,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Kyc{individual=$individual, kycPassedTimestamp=$kycPassedTimestamp, tosTimestamp=$tosTimestamp, workflow=$workflow, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var individual: Individual? = null
            private var kycPassedTimestamp: String? = null
            private var tosTimestamp: String? = null
            private var workflow: Workflow? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kyc: Kyc) = apply {
                this.individual = kyc.individual
                this.kycPassedTimestamp = kyc.kycPassedTimestamp
                this.tosTimestamp = kyc.tosTimestamp
                this.workflow = kyc.workflow
                additionalProperties(kyc.additionalProperties)
            }

            /**
             * Information on individual for whom the account is being opened and KYC is being
             * run.
             */
            @JsonProperty("individual")
            fun individual(individual: Individual) = apply {
                this.individual = individual
            }

            /**
             * An RFC 3339 timestamp indicating when precomputed KYC was completed on the
             * individual with a pass result.
             *
             * This field is required only if workflow type is `KYC_BYO`.
             */
            @JsonProperty("kyc_passed_timestamp")
            fun kycPassedTimestamp(kycPassedTimestamp: String) = apply {
                this.kycPassedTimestamp = kycPassedTimestamp
            }

            /**
             * An RFC 3339 timestamp indicating when the account holder accepted the applicable
             * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
             * implementation with Lithic.
             */
            @JsonProperty("tos_timestamp")
            fun tosTimestamp(tosTimestamp: String) = apply {
                this.tosTimestamp = tosTimestamp
            }

            /** Specifies the type of KYC workflow to run. */
            @JsonProperty("workflow")
            fun workflow(workflow: Workflow) = apply {
                this.workflow = workflow
            }

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

            fun build(): Kyc = Kyc(
                checkNotNull(individual) {
                    "`individual` is required but was not set"
                },
                kycPassedTimestamp,
                checkNotNull(tosTimestamp) {
                    "`tosTimestamp` is required but was not set"
                },
                checkNotNull(workflow) {
                    "`workflow` is required but was not set"
                },
                additionalProperties.toUnmodifiable(),
            )
        }

        /**
         * Information on individual for whom the account is being opened and KYC is being
         * run.
         */
        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual private constructor(private val address: Address?,private val dob: String?,private val email: String?,private val firstName: String?,private val governmentId: String?,private val lastName: String?,private val phoneNumber: String?,private val additionalProperties: Map<String, JsonValue>,) {

            private var hashCode: Int = 0

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            fun address(): Address? = address

            /** Individual's date of birth, as an RFC 3339 date. */
            @JsonProperty("dob")
            fun dob(): String? = dob

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            @JsonProperty("email")
            fun email(): String? = email

            /** Individual's first name, as it appears on government-issued identity documents. */
            @JsonProperty("first_name")
            fun firstName(): String? = firstName

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and
             * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
             * entered as full nine-digits, with or without hyphens
             */
            @JsonProperty("government_id")
            fun governmentId(): String? = governmentId

            /** Individual's last name, as it appears on government-issued identity documents. */
            @JsonProperty("last_name")
            fun lastName(): String? = lastName

            /** Individual's phone number, entered in E.164 format. */
            @JsonProperty("phone_number")
            fun phoneNumber(): String? = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Individual &&
                  this.address == other.address &&
                  this.dob == other.dob &&
                  this.email == other.email &&
                  this.firstName == other.firstName &&
                  this.governmentId == other.governmentId &&
                  this.lastName == other.lastName &&
                  this.phoneNumber == other.phoneNumber &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
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

            override fun toString() = "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
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
                fun address(address: Address) = apply {
                    this.address = address
                }

                /** Individual's date of birth, as an RFC 3339 date. */
                @JsonProperty("dob")
                fun dob(dob: String) = apply {
                    this.dob = dob
                }

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                @JsonProperty("email")
                fun email(email: String) = apply {
                    this.email = email
                }

                /** Individual's first name, as it appears on government-issued identity documents. */
                @JsonProperty("first_name")
                fun firstName(firstName: String) = apply {
                    this.firstName = firstName
                }

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                @JsonProperty("government_id")
                fun governmentId(governmentId: String) = apply {
                    this.governmentId = governmentId
                }

                /** Individual's last name, as it appears on government-issued identity documents. */
                @JsonProperty("last_name")
                fun lastName(lastName: String) = apply {
                    this.lastName = lastName
                }

                /** Individual's phone number, entered in E.164 format. */
                @JsonProperty("phone_number")
                fun phoneNumber(phoneNumber: String) = apply {
                    this.phoneNumber = phoneNumber
                }

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

                fun build(): Individual = Individual(
                    checkNotNull(address) {
                        "`address` is required but was not set"
                    },
                    checkNotNull(dob) {
                        "`dob` is required but was not set"
                    },
                    checkNotNull(email) {
                        "`email` is required but was not set"
                    },
                    checkNotNull(firstName) {
                        "`firstName` is required but was not set"
                    },
                    checkNotNull(governmentId) {
                        "`governmentId` is required but was not set"
                    },
                    checkNotNull(lastName) {
                        "`lastName` is required but was not set"
                    },
                    checkNotNull(phoneNumber) {
                        "`phoneNumber` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
            }
        }

        class Workflow @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Workflow &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val KYC_ADVANCED = Workflow(JsonField.of("KYC_ADVANCED"))

                @JvmField val KYC_BASIC = Workflow(JsonField.of("KYC_BASIC"))

                @JvmField val KYC_BYO = Workflow(JsonField.of("KYC_BYO"))

                @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
            }

            enum class Known {
                KYC_ADVANCED,
                KYC_BASIC,
                KYC_BYO,
            }

            enum class Value {
                KYC_ADVANCED,
                KYC_BASIC,
                KYC_BYO,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                KYC_ADVANCED -> Value.KYC_ADVANCED
                KYC_BASIC -> Value.KYC_BASIC
                KYC_BYO -> Value.KYC_BYO
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                KYC_ADVANCED -> Known.KYC_ADVANCED
                KYC_BASIC -> Known.KYC_BASIC
                KYC_BYO -> Known.KYC_BYO
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = KycExempt.Builder::class)
    @NoAutoDetect
    class KycExempt private constructor(private val workflow: Workflow?,private val kycExemptionType: KycExemptionType?,private val firstName: String?,private val lastName: String?,private val email: String?,private val phoneNumber: String?,private val businessAccountToken: String?,private val address: Address?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
        @JsonProperty("workflow")
        fun workflow(): Workflow? = workflow

        /** Specifies the type of KYC Exempt user */
        @JsonProperty("kyc_exemption_type")
        fun kycExemptionType(): KycExemptionType? = kycExemptionType

        /** The KYC Exempt user's first name */
        @JsonProperty("first_name")
        fun firstName(): String? = firstName

        /** The KYC Exempt user's last name */
        @JsonProperty("last_name")
        fun lastName(): String? = lastName

        /** The KYC Exempt user's email */
        @JsonProperty("email")
        fun email(): String? = email

        /** The KYC Exempt user's phone number */
        @JsonProperty("phone_number")
        fun phoneNumber(): String? = phoneNumber

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
         * users of businesses. Pass the account_token of the enrolled business associated
         * with the AUTHORIZED_USER in this field.
         */
        @JsonProperty("business_account_token")
        fun businessAccountToken(): String? = businessAccountToken

        /**
         * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not
         * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address")
        fun address(): Address? = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is KycExempt &&
              this.workflow == other.workflow &&
              this.kycExemptionType == other.kycExemptionType &&
              this.firstName == other.firstName &&
              this.lastName == other.lastName &&
              this.email == other.email &&
              this.phoneNumber == other.phoneNumber &&
              this.businessAccountToken == other.businessAccountToken &&
              this.address == other.address &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                workflow,
                kycExemptionType,
                firstName,
                lastName,
                email,
                phoneNumber,
                businessAccountToken,
                address,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "KycExempt{workflow=$workflow, kycExemptionType=$kycExemptionType, firstName=$firstName, lastName=$lastName, email=$email, phoneNumber=$phoneNumber, businessAccountToken=$businessAccountToken, address=$address, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var workflow: Workflow? = null
            private var kycExemptionType: KycExemptionType? = null
            private var firstName: String? = null
            private var lastName: String? = null
            private var email: String? = null
            private var phoneNumber: String? = null
            private var businessAccountToken: String? = null
            private var address: Address? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kycExempt: KycExempt) = apply {
                this.workflow = kycExempt.workflow
                this.kycExemptionType = kycExempt.kycExemptionType
                this.firstName = kycExempt.firstName
                this.lastName = kycExempt.lastName
                this.email = kycExempt.email
                this.phoneNumber = kycExempt.phoneNumber
                this.businessAccountToken = kycExempt.businessAccountToken
                this.address = kycExempt.address
                additionalProperties(kycExempt.additionalProperties)
            }

            /** Specifies the workflow type. This must be 'KYC_EXEMPT' */
            @JsonProperty("workflow")
            fun workflow(workflow: Workflow) = apply {
                this.workflow = workflow
            }

            /** Specifies the type of KYC Exempt user */
            @JsonProperty("kyc_exemption_type")
            fun kycExemptionType(kycExemptionType: KycExemptionType) = apply {
                this.kycExemptionType = kycExemptionType
            }

            /** The KYC Exempt user's first name */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply {
                this.firstName = firstName
            }

            /** The KYC Exempt user's last name */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply {
                this.lastName = lastName
            }

            /** The KYC Exempt user's email */
            @JsonProperty("email")
            fun email(email: String) = apply {
                this.email = email
            }

            /** The KYC Exempt user's phone number */
            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Pass the account_token of the enrolled business associated
             * with the AUTHORIZED_USER in this field.
             */
            @JsonProperty("business_account_token")
            fun businessAccountToken(businessAccountToken: String) = apply {
                this.businessAccountToken = businessAccountToken
            }

            /**
             * KYC Exempt user's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            fun address(address: Address) = apply {
                this.address = address
            }

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

            fun build(): KycExempt = KycExempt(
                checkNotNull(workflow) {
                    "`workflow` is required but was not set"
                },
                checkNotNull(kycExemptionType) {
                    "`kycExemptionType` is required but was not set"
                },
                checkNotNull(firstName) {
                    "`firstName` is required but was not set"
                },
                checkNotNull(lastName) {
                    "`lastName` is required but was not set"
                },
                checkNotNull(email) {
                    "`email` is required but was not set"
                },
                checkNotNull(phoneNumber) {
                    "`phoneNumber` is required but was not set"
                },
                businessAccountToken,
                address,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Workflow @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Workflow &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                KYC_EXEMPT -> Value.KYC_EXEMPT
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                KYC_EXEMPT -> Known.KYC_EXEMPT
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class KycExemptionType @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is KycExemptionType &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                AUTHORIZED_USER -> Value.AUTHORIZED_USER
                PREPAID_CARD_USER -> Value.PREPAID_CARD_USER
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                AUTHORIZED_USER -> Known.AUTHORIZED_USER
                PREPAID_CARD_USER -> Known.PREPAID_CARD_USER
                else -> throw LithicInvalidDataException("Unknown KycExemptionType: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
