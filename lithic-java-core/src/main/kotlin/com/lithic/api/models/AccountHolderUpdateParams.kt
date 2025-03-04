// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Update the information associated with a particular account holder (including business owners and
 * control persons associated to a business account). If Lithic is performing KYB or KYC and
 * additional verification is required we will run the individual's or business's updated
 * information again and return whether the status is accepted or pending (i.e., further action
 * required). All calls to this endpoint will return an immediate response - though in some cases,
 * the response may indicate the workflow is under review or further action will be needed to
 * complete the evaluation process. This endpoint can only be used on existing accounts that are
 * part of the program that the calling API key manages.
 */
class AccountHolderUpdateParams
private constructor(
    private val accountHolderToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountHolderToken(): String = accountHolderToken

    /** The KYB request payload for updating a business. */
    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    /** The KYB request payload for updating a business. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val kybPatchRequest: KybPatchRequest? = null,
        private val kycPatchRequest: KycPatchRequest? = null,
        private val patchRequest: PatchRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        /** The KYB request payload for updating a business. */
        fun kybPatchRequest(): Optional<KybPatchRequest> = Optional.ofNullable(kybPatchRequest)

        /** The KYC request payload for updating an account holder. */
        fun kycPatchRequest(): Optional<KycPatchRequest> = Optional.ofNullable(kycPatchRequest)

        /** The legacy request for updating an account holder. */
        fun patchRequest(): Optional<PatchRequest> = Optional.ofNullable(patchRequest)

        fun isKybPatchRequest(): Boolean = kybPatchRequest != null

        fun isKycPatchRequest(): Boolean = kycPatchRequest != null

        fun isPatchRequest(): Boolean = patchRequest != null

        /** The KYB request payload for updating a business. */
        fun asKybPatchRequest(): KybPatchRequest = kybPatchRequest.getOrThrow("kybPatchRequest")

        /** The KYC request payload for updating an account holder. */
        fun asKycPatchRequest(): KycPatchRequest = kycPatchRequest.getOrThrow("kycPatchRequest")

        /** The legacy request for updating an account holder. */
        fun asPatchRequest(): PatchRequest = patchRequest.getOrThrow("patchRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                kybPatchRequest != null -> visitor.visitKybPatchRequest(kybPatchRequest)
                kycPatchRequest != null -> visitor.visitKycPatchRequest(kycPatchRequest)
                patchRequest != null -> visitor.visitPatchRequest(patchRequest)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitKybPatchRequest(kybPatchRequest: KybPatchRequest) {
                        kybPatchRequest.validate()
                    }

                    override fun visitKycPatchRequest(kycPatchRequest: KycPatchRequest) {
                        kycPatchRequest.validate()
                    }

                    override fun visitPatchRequest(patchRequest: PatchRequest) {
                        patchRequest.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && kybPatchRequest == other.kybPatchRequest && kycPatchRequest == other.kycPatchRequest && patchRequest == other.patchRequest /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(kybPatchRequest, kycPatchRequest, patchRequest) /* spotless:on */

        override fun toString(): String =
            when {
                kybPatchRequest != null -> "Body{kybPatchRequest=$kybPatchRequest}"
                kycPatchRequest != null -> "Body{kycPatchRequest=$kycPatchRequest}"
                patchRequest != null -> "Body{patchRequest=$patchRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** The KYB request payload for updating a business. */
            @JvmStatic
            fun ofKybPatchRequest(kybPatchRequest: KybPatchRequest) =
                Body(kybPatchRequest = kybPatchRequest)

            /** The KYC request payload for updating an account holder. */
            @JvmStatic
            fun ofKycPatchRequest(kycPatchRequest: KycPatchRequest) =
                Body(kycPatchRequest = kycPatchRequest)

            /** The legacy request for updating an account holder. */
            @JvmStatic
            fun ofPatchRequest(patchRequest: PatchRequest) = Body(patchRequest = patchRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** The KYB request payload for updating a business. */
            fun visitKybPatchRequest(kybPatchRequest: KybPatchRequest): T

            /** The KYC request payload for updating an account holder. */
            fun visitKycPatchRequest(kycPatchRequest: KycPatchRequest): T

            /** The legacy request for updating an account holder. */
            fun visitPatchRequest(patchRequest: PatchRequest): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<KybPatchRequest>()) { it.validate() }
                    ?.let {
                        return Body(kybPatchRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KycPatchRequest>()) { it.validate() }
                    ?.let {
                        return Body(kycPatchRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PatchRequest>()) { it.validate() }
                    ?.let {
                        return Body(patchRequest = it, _json = json)
                    }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.kybPatchRequest != null -> generator.writeObject(value.kybPatchRequest)
                    value.kycPatchRequest != null -> generator.writeObject(value.kycPatchRequest)
                    value.patchRequest != null -> generator.writeObject(value.patchRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /** The KYB request payload for updating a business. */
        @NoAutoDetect
        class KybPatchRequest
        @JsonCreator
        private constructor(
            @JsonProperty("beneficial_owner_entities")
            @ExcludeMissing
            private val beneficialOwnerEntities: JsonField<List<KybBusinessEntityPatch>> =
                JsonMissing.of(),
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            private val beneficialOwnerIndividuals: JsonField<List<IndividualPatch>> =
                JsonMissing.of(),
            @JsonProperty("business_entity")
            @ExcludeMissing
            private val businessEntity: JsonField<KybBusinessEntityPatch> = JsonMissing.of(),
            @JsonProperty("control_person")
            @ExcludeMissing
            private val controlPerson: JsonField<IndividualPatch> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            private val externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nature_of_business")
            @ExcludeMissing
            private val natureOfBusiness: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website_url")
            @ExcludeMissing
            private val websiteUrl: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * List of all entities with >25% ownership in the company. If no entity or individual
             * owns >25% of the company, and the largest shareholder is an entity, please identify
             * them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
             * I) for more background. If no business owner is an entity, pass in an empty list.
             * However, either this parameter or `beneficial_owner_individuals` must be populated.
             * on entities that should be included.
             */
            fun beneficialOwnerEntities(): Optional<List<KybBusinessEntityPatch>> =
                Optional.ofNullable(
                    beneficialOwnerEntities.getNullable("beneficial_owner_entities")
                )

            /**
             * List of all individuals with >25% ownership in the company. If no entity or
             * individual owns >25% of the company, and the largest shareholder is an individual,
             * please identify them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
             * I) for more background on individuals that should be included. If no individual is an
             * entity, pass in an empty list. However, either this parameter or
             * `beneficial_owner_entities` must be populated.
             */
            fun beneficialOwnerIndividuals(): Optional<List<IndividualPatch>> =
                Optional.ofNullable(
                    beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals")
                )

            /**
             * Information for business for which the account is being opened and KYB is being run.
             */
            fun businessEntity(): Optional<KybBusinessEntityPatch> =
                Optional.ofNullable(businessEntity.getNullable("business_entity"))

            /**
             * An individual with significant responsibility for managing the legal entity (e.g., a
             * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing
             * Member, General Partner, President, Vice President, or Treasurer). This can be an
             * executive, or someone who will have program-wide access to the cards that Lithic will
             * provide. In some cases, this individual could also be a beneficial owner listed
             * above. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section II) for more background.
             */
            fun controlPerson(): Optional<IndividualPatch> =
                Optional.ofNullable(controlPerson.getNullable("control_person"))

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            fun externalId(): Optional<String> =
                Optional.ofNullable(externalId.getNullable("external_id"))

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             */
            fun natureOfBusiness(): Optional<String> =
                Optional.ofNullable(natureOfBusiness.getNullable("nature_of_business"))

            /** Company website URL. */
            fun websiteUrl(): Optional<String> =
                Optional.ofNullable(websiteUrl.getNullable("website_url"))

            /**
             * List of all entities with >25% ownership in the company. If no entity or individual
             * owns >25% of the company, and the largest shareholder is an entity, please identify
             * them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
             * I) for more background. If no business owner is an entity, pass in an empty list.
             * However, either this parameter or `beneficial_owner_individuals` must be populated.
             * on entities that should be included.
             */
            @JsonProperty("beneficial_owner_entities")
            @ExcludeMissing
            fun _beneficialOwnerEntities(): JsonField<List<KybBusinessEntityPatch>> =
                beneficialOwnerEntities

            /**
             * List of all individuals with >25% ownership in the company. If no entity or
             * individual owns >25% of the company, and the largest shareholder is an individual,
             * please identify them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
             * I) for more background on individuals that should be included. If no individual is an
             * entity, pass in an empty list. However, either this parameter or
             * `beneficial_owner_entities` must be populated.
             */
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            fun _beneficialOwnerIndividuals(): JsonField<List<IndividualPatch>> =
                beneficialOwnerIndividuals

            /**
             * Information for business for which the account is being opened and KYB is being run.
             */
            @JsonProperty("business_entity")
            @ExcludeMissing
            fun _businessEntity(): JsonField<KybBusinessEntityPatch> = businessEntity

            /**
             * An individual with significant responsibility for managing the legal entity (e.g., a
             * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing
             * Member, General Partner, President, Vice President, or Treasurer). This can be an
             * executive, or someone who will have program-wide access to the cards that Lithic will
             * provide. In some cases, this individual could also be a beneficial owner listed
             * above. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section II) for more background.
             */
            @JsonProperty("control_person")
            @ExcludeMissing
            fun _controlPerson(): JsonField<IndividualPatch> = controlPerson

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             */
            @JsonProperty("nature_of_business")
            @ExcludeMissing
            fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

            /** Company website URL. */
            @JsonProperty("website_url")
            @ExcludeMissing
            fun _websiteUrl(): JsonField<String> = websiteUrl

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): KybPatchRequest = apply {
                if (validated) {
                    return@apply
                }

                beneficialOwnerEntities().ifPresent { it.forEach { it.validate() } }
                beneficialOwnerIndividuals().ifPresent { it.forEach { it.validate() } }
                businessEntity().ifPresent { it.validate() }
                controlPerson().ifPresent { it.validate() }
                externalId()
                natureOfBusiness()
                websiteUrl()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [KybPatchRequest]. */
            class Builder internal constructor() {

                private var beneficialOwnerEntities:
                    JsonField<MutableList<KybBusinessEntityPatch>>? =
                    null
                private var beneficialOwnerIndividuals: JsonField<MutableList<IndividualPatch>>? =
                    null
                private var businessEntity: JsonField<KybBusinessEntityPatch> = JsonMissing.of()
                private var controlPerson: JsonField<IndividualPatch> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var natureOfBusiness: JsonField<String> = JsonMissing.of()
                private var websiteUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(kybPatchRequest: KybPatchRequest) = apply {
                    beneficialOwnerEntities =
                        kybPatchRequest.beneficialOwnerEntities.map { it.toMutableList() }
                    beneficialOwnerIndividuals =
                        kybPatchRequest.beneficialOwnerIndividuals.map { it.toMutableList() }
                    businessEntity = kybPatchRequest.businessEntity
                    controlPerson = kybPatchRequest.controlPerson
                    externalId = kybPatchRequest.externalId
                    natureOfBusiness = kybPatchRequest.natureOfBusiness
                    websiteUrl = kybPatchRequest.websiteUrl
                    additionalProperties = kybPatchRequest.additionalProperties.toMutableMap()
                }

                /**
                 * List of all entities with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an entity,
                 * please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background. If no business owner is an entity, pass in an empty list.
                 * However, either this parameter or `beneficial_owner_individuals` must be
                 * populated. on entities that should be included.
                 */
                fun beneficialOwnerEntities(beneficialOwnerEntities: List<KybBusinessEntityPatch>) =
                    beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

                /**
                 * List of all entities with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an entity,
                 * please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background. If no business owner is an entity, pass in an empty list.
                 * However, either this parameter or `beneficial_owner_individuals` must be
                 * populated. on entities that should be included.
                 */
                fun beneficialOwnerEntities(
                    beneficialOwnerEntities: JsonField<List<KybBusinessEntityPatch>>
                ) = apply {
                    this.beneficialOwnerEntities =
                        beneficialOwnerEntities.map { it.toMutableList() }
                }

                /**
                 * List of all entities with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an entity,
                 * please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background. If no business owner is an entity, pass in an empty list.
                 * However, either this parameter or `beneficial_owner_individuals` must be
                 * populated. on entities that should be included.
                 */
                fun addBeneficialOwnerEntity(beneficialOwnerEntity: KybBusinessEntityPatch) =
                    apply {
                        beneficialOwnerEntities =
                            (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).also {
                                checkKnown("beneficialOwnerEntities", it).add(beneficialOwnerEntity)
                            }
                    }

                /**
                 * List of all individuals with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an
                 * individual, please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background on individuals that should be included. If no individual
                 * is an entity, pass in an empty list. However, either this parameter or
                 * `beneficial_owner_entities` must be populated.
                 */
                fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<IndividualPatch>) =
                    beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

                /**
                 * List of all individuals with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an
                 * individual, please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background on individuals that should be included. If no individual
                 * is an entity, pass in an empty list. However, either this parameter or
                 * `beneficial_owner_entities` must be populated.
                 */
                fun beneficialOwnerIndividuals(
                    beneficialOwnerIndividuals: JsonField<List<IndividualPatch>>
                ) = apply {
                    this.beneficialOwnerIndividuals =
                        beneficialOwnerIndividuals.map { it.toMutableList() }
                }

                /**
                 * List of all individuals with >25% ownership in the company. If no entity or
                 * individual owns >25% of the company, and the largest shareholder is an
                 * individual, please identify them in this field. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
                 * I) for more background on individuals that should be included. If no individual
                 * is an entity, pass in an empty list. However, either this parameter or
                 * `beneficial_owner_entities` must be populated.
                 */
                fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: IndividualPatch) =
                    apply {
                        beneficialOwnerIndividuals =
                            (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).also {
                                checkKnown("beneficialOwnerIndividuals", it)
                                    .add(beneficialOwnerIndividual)
                            }
                    }

                /**
                 * Information for business for which the account is being opened and KYB is being
                 * run.
                 */
                fun businessEntity(businessEntity: KybBusinessEntityPatch) =
                    businessEntity(JsonField.of(businessEntity))

                /**
                 * Information for business for which the account is being opened and KYB is being
                 * run.
                 */
                fun businessEntity(businessEntity: JsonField<KybBusinessEntityPatch>) = apply {
                    this.businessEntity = businessEntity
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
                fun controlPerson(controlPerson: IndividualPatch) =
                    controlPerson(JsonField.of(controlPerson))

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
                fun controlPerson(controlPerson: JsonField<IndividualPatch>) = apply {
                    this.controlPerson = controlPerson
                }

                /**
                 * A user provided id that can be used to link an account holder with an external
                 * system
                 */
                fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                /**
                 * A user provided id that can be used to link an account holder with an external
                 * system
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /**
                 * Short description of the company's line of business (i.e., what does the company
                 * do?).
                 */
                fun natureOfBusiness(natureOfBusiness: String) =
                    natureOfBusiness(JsonField.of(natureOfBusiness))

                /**
                 * Short description of the company's line of business (i.e., what does the company
                 * do?).
                 */
                fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
                    this.natureOfBusiness = natureOfBusiness
                }

                /** Company website URL. */
                fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

                /** Company website URL. */
                fun websiteUrl(websiteUrl: JsonField<String>) = apply {
                    this.websiteUrl = websiteUrl
                }

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

                fun build(): KybPatchRequest =
                    KybPatchRequest(
                        (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                        (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                        businessEntity,
                        controlPerson,
                        externalId,
                        natureOfBusiness,
                        websiteUrl,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class KybBusinessEntityPatch
            @JsonCreator
            private constructor(
                @JsonProperty("entity_token")
                @ExcludeMissing
                private val entityToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                private val address: JsonField<AddressUpdate> = JsonMissing.of(),
                @JsonProperty("dba_business_name")
                @ExcludeMissing
                private val dbaBusinessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("government_id")
                @ExcludeMissing
                private val governmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legal_business_name")
                @ExcludeMissing
                private val legalBusinessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent_company")
                @ExcludeMissing
                private val parentCompany: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                private val phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Globally unique identifier for an entity. */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable.
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /**
                 * Any name that the business operates under that is not its legal business name (if
                 * applicable).
                 */
                fun dbaBusinessName(): Optional<String> =
                    Optional.ofNullable(dbaBusinessName.getNullable("dba_business_name"))

                /**
                 * Government-issued identification number. US Federal Employer Identification
                 * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                 * without hyphens.
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /** Legal (formal) business name. */
                fun legalBusinessName(): Optional<String> =
                    Optional.ofNullable(legalBusinessName.getNullable("legal_business_name"))

                /** Parent company name (if applicable). */
                fun parentCompany(): Optional<String> =
                    Optional.ofNullable(parentCompany.getNullable("parent_company"))

                /**
                 * One or more of the business's phone number(s), entered as a list in E.164 format.
                 */
                fun phoneNumbers(): Optional<List<String>> =
                    Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

                /** Globally unique identifier for an entity. */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /**
                 * Any name that the business operates under that is not its legal business name (if
                 * applicable).
                 */
                @JsonProperty("dba_business_name")
                @ExcludeMissing
                fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

                /**
                 * Government-issued identification number. US Federal Employer Identification
                 * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                 * without hyphens.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /** Legal (formal) business name. */
                @JsonProperty("legal_business_name")
                @ExcludeMissing
                fun _legalBusinessName(): JsonField<String> = legalBusinessName

                /** Parent company name (if applicable). */
                @JsonProperty("parent_company")
                @ExcludeMissing
                fun _parentCompany(): JsonField<String> = parentCompany

                /**
                 * One or more of the business's phone number(s), entered as a list in E.164 format.
                 */
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): KybBusinessEntityPatch = apply {
                    if (validated) {
                        return@apply
                    }

                    entityToken()
                    address().ifPresent { it.validate() }
                    dbaBusinessName()
                    governmentId()
                    legalBusinessName()
                    parentCompany()
                    phoneNumbers()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [KybBusinessEntityPatch]. */
                class Builder internal constructor() {

                    private var entityToken: JsonField<String>? = null
                    private var address: JsonField<AddressUpdate> = JsonMissing.of()
                    private var dbaBusinessName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var legalBusinessName: JsonField<String> = JsonMissing.of()
                    private var parentCompany: JsonField<String> = JsonMissing.of()
                    private var phoneNumbers: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(kybBusinessEntityPatch: KybBusinessEntityPatch) = apply {
                        entityToken = kybBusinessEntityPatch.entityToken
                        address = kybBusinessEntityPatch.address
                        dbaBusinessName = kybBusinessEntityPatch.dbaBusinessName
                        governmentId = kybBusinessEntityPatch.governmentId
                        legalBusinessName = kybBusinessEntityPatch.legalBusinessName
                        parentCompany = kybBusinessEntityPatch.parentCompany
                        phoneNumbers =
                            kybBusinessEntityPatch.phoneNumbers.map { it.toMutableList() }
                        additionalProperties =
                            kybBusinessEntityPatch.additionalProperties.toMutableMap()
                    }

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: JsonField<String>) = apply {
                        this.entityToken = entityToken
                    }

                    /**
                     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable.
                     */
                    fun address(address: AddressUpdate) = address(JsonField.of(address))

                    /**
                     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable.
                     */
                    fun address(address: JsonField<AddressUpdate>) = apply {
                        this.address = address
                    }

                    /**
                     * Any name that the business operates under that is not its legal business name
                     * (if applicable).
                     */
                    fun dbaBusinessName(dbaBusinessName: String) =
                        dbaBusinessName(JsonField.of(dbaBusinessName))

                    /**
                     * Any name that the business operates under that is not its legal business name
                     * (if applicable).
                     */
                    fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
                        this.dbaBusinessName = dbaBusinessName
                    }

                    /**
                     * Government-issued identification number. US Federal Employer Identification
                     * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                     * without hyphens.
                     */
                    fun governmentId(governmentId: String) =
                        governmentId(JsonField.of(governmentId))

                    /**
                     * Government-issued identification number. US Federal Employer Identification
                     * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                     * without hyphens.
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

                    /** Parent company name (if applicable). */
                    fun parentCompany(parentCompany: String) =
                        parentCompany(JsonField.of(parentCompany))

                    /** Parent company name (if applicable). */
                    fun parentCompany(parentCompany: JsonField<String>) = apply {
                        this.parentCompany = parentCompany
                    }

                    /**
                     * One or more of the business's phone number(s), entered as a list in E.164
                     * format.
                     */
                    fun phoneNumbers(phoneNumbers: List<String>) =
                        phoneNumbers(JsonField.of(phoneNumbers))

                    /**
                     * One or more of the business's phone number(s), entered as a list in E.164
                     * format.
                     */
                    fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                        this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
                    }

                    /**
                     * One or more of the business's phone number(s), entered as a list in E.164
                     * format.
                     */
                    fun addPhoneNumber(phoneNumber: String) = apply {
                        phoneNumbers =
                            (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("phoneNumbers", it).add(phoneNumber)
                            }
                    }

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

                    fun build(): KybBusinessEntityPatch =
                        KybBusinessEntityPatch(
                            checkRequired("entityToken", entityToken),
                            address,
                            dbaBusinessName,
                            governmentId,
                            legalBusinessName,
                            parentCompany,
                            (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is KybBusinessEntityPatch && entityToken == other.entityToken && address == other.address && dbaBusinessName == other.dbaBusinessName && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && parentCompany == other.parentCompany && phoneNumbers == other.phoneNumbers && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(entityToken, address, dbaBusinessName, governmentId, legalBusinessName, parentCompany, phoneNumbers, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KybBusinessEntityPatch{entityToken=$entityToken, address=$address, dbaBusinessName=$dbaBusinessName, governmentId=$governmentId, legalBusinessName=$legalBusinessName, parentCompany=$parentCompany, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
            }

            /** Individuals associated with a KYB application. Phone number is optional. */
            @NoAutoDetect
            class IndividualPatch
            @JsonCreator
            private constructor(
                @JsonProperty("entity_token")
                @ExcludeMissing
                private val entityToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                private val address: JsonField<AddressUpdate> = JsonMissing.of(),
                @JsonProperty("dob")
                @ExcludeMissing
                private val dob: JsonField<String> = JsonMissing.of(),
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

                /** Globally unique identifier for an entity. */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /** Individual's date of birth, as an RFC 3339 date. */
                fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 */
                fun firstName(): Optional<String> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 */
                fun lastName(): Optional<String> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                /** Individual's phone number, entered in E.164 format. */
                fun phoneNumber(): Optional<String> =
                    Optional.ofNullable(phoneNumber.getNullable("phone_number"))

                /** Globally unique identifier for an entity. */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /** Individual's date of birth, as an RFC 3339 date. */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /** Individual's phone number, entered in E.164 format. */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): IndividualPatch = apply {
                    if (validated) {
                        return@apply
                    }

                    entityToken()
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

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [IndividualPatch]. */
                class Builder internal constructor() {

                    private var entityToken: JsonField<String>? = null
                    private var address: JsonField<AddressUpdate> = JsonMissing.of()
                    private var dob: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individualPatch: IndividualPatch) = apply {
                        entityToken = individualPatch.entityToken
                        address = individualPatch.address
                        dob = individualPatch.dob
                        email = individualPatch.email
                        firstName = individualPatch.firstName
                        governmentId = individualPatch.governmentId
                        lastName = individualPatch.lastName
                        phoneNumber = individualPatch.phoneNumber
                        additionalProperties = individualPatch.additionalProperties.toMutableMap()
                    }

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: JsonField<String>) = apply {
                        this.entityToken = entityToken
                    }

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: AddressUpdate) = address(JsonField.of(address))

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: JsonField<AddressUpdate>) = apply {
                        this.address = address
                    }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: String) =
                        governmentId(JsonField.of(governmentId))

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: JsonField<String>) = apply {
                        this.governmentId = governmentId
                    }

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
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

                    fun build(): IndividualPatch =
                        IndividualPatch(
                            checkRequired("entityToken", entityToken),
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

                    return /* spotless:off */ other is IndividualPatch && entityToken == other.entityToken && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(entityToken, address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "IndividualPatch{entityToken=$entityToken, address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KybPatchRequest && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessEntity == other.businessEntity && controlPerson == other.controlPerson && externalId == other.externalId && natureOfBusiness == other.natureOfBusiness && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(beneficialOwnerEntities, beneficialOwnerIndividuals, businessEntity, controlPerson, externalId, natureOfBusiness, websiteUrl, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KybPatchRequest{beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessEntity=$businessEntity, controlPerson=$controlPerson, externalId=$externalId, natureOfBusiness=$natureOfBusiness, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
        }

        /** The KYC request payload for updating an account holder. */
        @NoAutoDetect
        class KycPatchRequest
        @JsonCreator
        private constructor(
            @JsonProperty("external_id")
            @ExcludeMissing
            private val externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individual")
            @ExcludeMissing
            private val individual: JsonField<IndividualPatch> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            fun externalId(): Optional<String> =
                Optional.ofNullable(externalId.getNullable("external_id"))

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             */
            fun individual(): Optional<IndividualPatch> =
                Optional.ofNullable(individual.getNullable("individual"))

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<IndividualPatch> = individual

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): KycPatchRequest = apply {
                if (validated) {
                    return@apply
                }

                externalId()
                individual().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [KycPatchRequest]. */
            class Builder internal constructor() {

                private var externalId: JsonField<String> = JsonMissing.of()
                private var individual: JsonField<IndividualPatch> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(kycPatchRequest: KycPatchRequest) = apply {
                    externalId = kycPatchRequest.externalId
                    individual = kycPatchRequest.individual
                    additionalProperties = kycPatchRequest.additionalProperties.toMutableMap()
                }

                /**
                 * A user provided id that can be used to link an account holder with an external
                 * system
                 */
                fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                /**
                 * A user provided id that can be used to link an account holder with an external
                 * system
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /**
                 * Information on the individual for whom the account is being opened and KYC is
                 * being run.
                 */
                fun individual(individual: IndividualPatch) = individual(JsonField.of(individual))

                /**
                 * Information on the individual for whom the account is being opened and KYC is
                 * being run.
                 */
                fun individual(individual: JsonField<IndividualPatch>) = apply {
                    this.individual = individual
                }

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

                fun build(): KycPatchRequest =
                    KycPatchRequest(externalId, individual, additionalProperties.toImmutable())
            }

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             */
            @NoAutoDetect
            class IndividualPatch
            @JsonCreator
            private constructor(
                @JsonProperty("entity_token")
                @ExcludeMissing
                private val entityToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                private val address: JsonField<AddressUpdate> = JsonMissing.of(),
                @JsonProperty("dob")
                @ExcludeMissing
                private val dob: JsonField<String> = JsonMissing.of(),
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

                /** Globally unique identifier for an entity. */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /** Individual's date of birth, as an RFC 3339 date. */
                fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 */
                fun firstName(): Optional<String> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 */
                fun lastName(): Optional<String> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                /** Individual's phone number, entered in E.164 format. */
                fun phoneNumber(): Optional<String> =
                    Optional.ofNullable(phoneNumber.getNullable("phone_number"))

                /** Globally unique identifier for an entity. */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /** Individual's date of birth, as an RFC 3339 date. */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /** Individual's phone number, entered in E.164 format. */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): IndividualPatch = apply {
                    if (validated) {
                        return@apply
                    }

                    entityToken()
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

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [IndividualPatch]. */
                class Builder internal constructor() {

                    private var entityToken: JsonField<String>? = null
                    private var address: JsonField<AddressUpdate> = JsonMissing.of()
                    private var dob: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individualPatch: IndividualPatch) = apply {
                        entityToken = individualPatch.entityToken
                        address = individualPatch.address
                        dob = individualPatch.dob
                        email = individualPatch.email
                        firstName = individualPatch.firstName
                        governmentId = individualPatch.governmentId
                        lastName = individualPatch.lastName
                        phoneNumber = individualPatch.phoneNumber
                        additionalProperties = individualPatch.additionalProperties.toMutableMap()
                    }

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

                    /** Globally unique identifier for an entity. */
                    fun entityToken(entityToken: JsonField<String>) = apply {
                        this.entityToken = entityToken
                    }

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: AddressUpdate) = address(JsonField.of(address))

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: JsonField<AddressUpdate>) = apply {
                        this.address = address
                    }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: String) =
                        governmentId(JsonField.of(governmentId))

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: JsonField<String>) = apply {
                        this.governmentId = governmentId
                    }

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
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

                    fun build(): IndividualPatch =
                        IndividualPatch(
                            checkRequired("entityToken", entityToken),
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

                    return /* spotless:off */ other is IndividualPatch && entityToken == other.entityToken && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(entityToken, address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "IndividualPatch{entityToken=$entityToken, address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KycPatchRequest && externalId == other.externalId && individual == other.individual && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(externalId, individual, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KycPatchRequest{externalId=$externalId, individual=$individual, additionalProperties=$additionalProperties}"
        }

        /** The legacy request for updating an account holder. */
        @NoAutoDetect
        class PatchRequest
        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            private val address: JsonField<AddressUpdate> = JsonMissing.of(),
            @JsonProperty("business_account_token")
            @ExcludeMissing
            private val businessAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            private val firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            private val lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            private val legalBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            private val phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Allowed for: KYC-Exempt, BYO-KYC, BYO-KYB. */
            fun address(): Optional<AddressUpdate> =
                Optional.ofNullable(address.getNullable("address"))

            /**
             * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
             * account holder is associated.
             */
            fun businessAccountToken(): Optional<String> =
                Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

            /**
             * Allowed for all Account Holders. Account holder's email address. The primary purpose
             * of this field is for cardholder identification and verification during the digital
             * wallet tokenization process.
             */
            fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

            /** Allowed for KYC-Exempt, BYO-KYC. Account holder's first name. */
            fun firstName(): Optional<String> =
                Optional.ofNullable(firstName.getNullable("first_name"))

            /** Allowed for KYC-Exempt, BYO-KYC. Account holder's last name. */
            fun lastName(): Optional<String> =
                Optional.ofNullable(lastName.getNullable("last_name"))

            /** Allowed for BYO-KYB. Legal business name of the account holder. */
            fun legalBusinessName(): Optional<String> =
                Optional.ofNullable(legalBusinessName.getNullable("legal_business_name"))

            /**
             * Allowed for all Account Holders. Account holder's phone number, entered in E.164
             * format. The primary purpose of this field is for cardholder identification and
             * verification during the digital wallet tokenization process.
             */
            fun phoneNumber(): Optional<String> =
                Optional.ofNullable(phoneNumber.getNullable("phone_number"))

            /** Allowed for: KYC-Exempt, BYO-KYC, BYO-KYB. */
            @JsonProperty("address")
            @ExcludeMissing
            fun _address(): JsonField<AddressUpdate> = address

            /**
             * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
             * account holder is associated.
             */
            @JsonProperty("business_account_token")
            @ExcludeMissing
            fun _businessAccountToken(): JsonField<String> = businessAccountToken

            /**
             * Allowed for all Account Holders. Account holder's email address. The primary purpose
             * of this field is for cardholder identification and verification during the digital
             * wallet tokenization process.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /** Allowed for KYC-Exempt, BYO-KYC. Account holder's first name. */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /** Allowed for KYC-Exempt, BYO-KYC. Account holder's last name. */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /** Allowed for BYO-KYB. Legal business name of the account holder. */
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            fun _legalBusinessName(): JsonField<String> = legalBusinessName

            /**
             * Allowed for all Account Holders. Account holder's phone number, entered in E.164
             * format. The primary purpose of this field is for cardholder identification and
             * verification during the digital wallet tokenization process.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PatchRequest = apply {
                if (validated) {
                    return@apply
                }

                address().ifPresent { it.validate() }
                businessAccountToken()
                email()
                firstName()
                lastName()
                legalBusinessName()
                phoneNumber()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PatchRequest]. */
            class Builder internal constructor() {

                private var address: JsonField<AddressUpdate> = JsonMissing.of()
                private var businessAccountToken: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var firstName: JsonField<String> = JsonMissing.of()
                private var lastName: JsonField<String> = JsonMissing.of()
                private var legalBusinessName: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(patchRequest: PatchRequest) = apply {
                    address = patchRequest.address
                    businessAccountToken = patchRequest.businessAccountToken
                    email = patchRequest.email
                    firstName = patchRequest.firstName
                    lastName = patchRequest.lastName
                    legalBusinessName = patchRequest.legalBusinessName
                    phoneNumber = patchRequest.phoneNumber
                    additionalProperties = patchRequest.additionalProperties.toMutableMap()
                }

                /** Allowed for: KYC-Exempt, BYO-KYC, BYO-KYB. */
                fun address(address: AddressUpdate) = address(JsonField.of(address))

                /** Allowed for: KYC-Exempt, BYO-KYC, BYO-KYB. */
                fun address(address: JsonField<AddressUpdate>) = apply { this.address = address }

                /**
                 * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
                 * account holder is associated.
                 */
                fun businessAccountToken(businessAccountToken: String) =
                    businessAccountToken(JsonField.of(businessAccountToken))

                /**
                 * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
                 * account holder is associated.
                 */
                fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                    this.businessAccountToken = businessAccountToken
                }

                /**
                 * Allowed for all Account Holders. Account holder's email address. The primary
                 * purpose of this field is for cardholder identification and verification during
                 * the digital wallet tokenization process.
                 */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Allowed for all Account Holders. Account holder's email address. The primary
                 * purpose of this field is for cardholder identification and verification during
                 * the digital wallet tokenization process.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's first name. */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's first name. */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's last name. */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's last name. */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** Allowed for BYO-KYB. Legal business name of the account holder. */
                fun legalBusinessName(legalBusinessName: String) =
                    legalBusinessName(JsonField.of(legalBusinessName))

                /** Allowed for BYO-KYB. Legal business name of the account holder. */
                fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                    this.legalBusinessName = legalBusinessName
                }

                /**
                 * Allowed for all Account Holders. Account holder's phone number, entered in E.164
                 * format. The primary purpose of this field is for cardholder identification and
                 * verification during the digital wallet tokenization process.
                 */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Allowed for all Account Holders. Account holder's phone number, entered in E.164
                 * format. The primary purpose of this field is for cardholder identification and
                 * verification during the digital wallet tokenization process.
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

                fun build(): PatchRequest =
                    PatchRequest(
                        address,
                        businessAccountToken,
                        email,
                        firstName,
                        lastName,
                        legalBusinessName,
                        phoneNumber,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PatchRequest && address == other.address && businessAccountToken == other.businessAccountToken && email == other.email && firstName == other.firstName && lastName == other.lastName && legalBusinessName == other.legalBusinessName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, businessAccountToken, email, firstName, lastName, legalBusinessName, phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PatchRequest{address=$address, businessAccountToken=$businessAccountToken, email=$email, firstName=$firstName, lastName=$lastName, legalBusinessName=$legalBusinessName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountHolderToken: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderUpdateParams: AccountHolderUpdateParams) = apply {
            accountHolderToken = accountHolderUpdateParams.accountHolderToken
            body = accountHolderUpdateParams.body
            additionalHeaders = accountHolderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountHolderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** The KYB request payload for updating a business. */
        fun body(body: Body) = apply { this.body = body }

        /** The KYB request payload for updating a business. */
        fun body(kybPatchRequest: Body.KybPatchRequest) =
            body(Body.ofKybPatchRequest(kybPatchRequest))

        /** The KYC request payload for updating an account holder. */
        fun body(kycPatchRequest: Body.KycPatchRequest) =
            body(Body.ofKycPatchRequest(kycPatchRequest))

        /** The legacy request for updating an account holder. */
        fun body(patchRequest: Body.PatchRequest) = body(Body.ofPatchRequest(patchRequest))

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

        fun build(): AccountHolderUpdateParams =
            AccountHolderUpdateParams(
                checkRequired("accountHolderToken", accountHolderToken),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderUpdateParams && accountHolderToken == other.accountHolderToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHolderToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderUpdateParams{accountHolderToken=$accountHolderToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
