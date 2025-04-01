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
import com.lithic.api.core.Params
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .accountHolderToken()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderUpdateParams]. */
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

        /** Alias for calling [body] with `Body.ofKybPatchRequest(kybPatchRequest)`. */
        fun body(kybPatchRequest: Body.KybPatchRequest) =
            body(Body.ofKybPatchRequest(kybPatchRequest))

        /** Alias for calling [body] with `Body.ofKycPatchRequest(kycPatchRequest)`. */
        fun body(kycPatchRequest: Body.KycPatchRequest) =
            body(Body.ofKycPatchRequest(kycPatchRequest))

        /** Alias for calling [body] with `Body.ofPatchRequest(patchRequest)`. */
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

        /**
         * Returns an immutable instance of [AccountHolderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountHolderToken()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderUpdateParams =
            AccountHolderUpdateParams(
                checkRequired("accountHolderToken", accountHolderToken),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountHolderToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                kybPatchRequest != null -> visitor.visitKybPatchRequest(kybPatchRequest)
                kycPatchRequest != null -> visitor.visitKycPatchRequest(kycPatchRequest)
                patchRequest != null -> visitor.visitPatchRequest(patchRequest)
                else -> visitor.unknown(_json)
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitKybPatchRequest(kybPatchRequest: KybPatchRequest) =
                        kybPatchRequest.validity()

                    override fun visitKycPatchRequest(kycPatchRequest: KycPatchRequest) =
                        kycPatchRequest.validity()

                    override fun visitPatchRequest(patchRequest: PatchRequest) =
                        patchRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<KybPatchRequest>())?.let {
                                Body(kybPatchRequest = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<KycPatchRequest>())?.let {
                                Body(kycPatchRequest = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PatchRequest>())?.let {
                                Body(patchRequest = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
        class KybPatchRequest
        private constructor(
            private val beneficialOwnerEntities: JsonField<List<KybBusinessEntityPatch>>,
            private val beneficialOwnerIndividuals: JsonField<List<IndividualPatch>>,
            private val businessEntity: JsonField<KybBusinessEntityPatch>,
            private val controlPerson: JsonField<IndividualPatch>,
            private val externalId: JsonField<String>,
            private val natureOfBusiness: JsonField<String>,
            private val websiteUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("beneficial_owner_entities")
                @ExcludeMissing
                beneficialOwnerEntities: JsonField<List<KybBusinessEntityPatch>> = JsonMissing.of(),
                @JsonProperty("beneficial_owner_individuals")
                @ExcludeMissing
                beneficialOwnerIndividuals: JsonField<List<IndividualPatch>> = JsonMissing.of(),
                @JsonProperty("business_entity")
                @ExcludeMissing
                businessEntity: JsonField<KybBusinessEntityPatch> = JsonMissing.of(),
                @JsonProperty("control_person")
                @ExcludeMissing
                controlPerson: JsonField<IndividualPatch> = JsonMissing.of(),
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nature_of_business")
                @ExcludeMissing
                natureOfBusiness: JsonField<String> = JsonMissing.of(),
                @JsonProperty("website_url")
                @ExcludeMissing
                websiteUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                beneficialOwnerEntities,
                beneficialOwnerIndividuals,
                businessEntity,
                controlPerson,
                externalId,
                natureOfBusiness,
                websiteUrl,
                mutableMapOf(),
            )

            /**
             * List of all entities with >25% ownership in the company. If no entity or individual
             * owns >25% of the company, and the largest shareholder is an entity, please identify
             * them in this field. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)(Section
             * I) for more background. If no business owner is an entity, pass in an empty list.
             * However, either this parameter or `beneficial_owner_individuals` must be populated.
             * on entities that should be included.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun beneficialOwnerIndividuals(): Optional<List<IndividualPatch>> =
                Optional.ofNullable(
                    beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals")
                )

            /**
             * Information for business for which the account is being opened and KYB is being run.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun controlPerson(): Optional<IndividualPatch> =
                Optional.ofNullable(controlPerson.getNullable("control_person"))

            /**
             * A user provided id that can be used to link an account holder with an external system
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalId(): Optional<String> =
                Optional.ofNullable(externalId.getNullable("external_id"))

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun natureOfBusiness(): Optional<String> =
                Optional.ofNullable(natureOfBusiness.getNullable("nature_of_business"))

            /**
             * Company website URL.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun websiteUrl(): Optional<String> =
                Optional.ofNullable(websiteUrl.getNullable("website_url"))

            /**
             * Returns the raw JSON value of [beneficialOwnerEntities].
             *
             * Unlike [beneficialOwnerEntities], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("beneficial_owner_entities")
            @ExcludeMissing
            fun _beneficialOwnerEntities(): JsonField<List<KybBusinessEntityPatch>> =
                beneficialOwnerEntities

            /**
             * Returns the raw JSON value of [beneficialOwnerIndividuals].
             *
             * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            fun _beneficialOwnerIndividuals(): JsonField<List<IndividualPatch>> =
                beneficialOwnerIndividuals

            /**
             * Returns the raw JSON value of [businessEntity].
             *
             * Unlike [businessEntity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_entity")
            @ExcludeMissing
            fun _businessEntity(): JsonField<KybBusinessEntityPatch> = businessEntity

            /**
             * Returns the raw JSON value of [controlPerson].
             *
             * Unlike [controlPerson], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("control_person")
            @ExcludeMissing
            fun _controlPerson(): JsonField<IndividualPatch> = controlPerson

            /**
             * Returns the raw JSON value of [externalId].
             *
             * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Returns the raw JSON value of [natureOfBusiness].
             *
             * Unlike [natureOfBusiness], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("nature_of_business")
            @ExcludeMissing
            fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

            /**
             * Returns the raw JSON value of [websiteUrl].
             *
             * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("website_url")
            @ExcludeMissing
            fun _websiteUrl(): JsonField<String> = websiteUrl

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

                /** Returns a mutable builder for constructing an instance of [KybPatchRequest]. */
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
                 * Sets [Builder.beneficialOwnerEntities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerEntities] with a well-typed
                 * `List<KybBusinessEntityPatch>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun beneficialOwnerEntities(
                    beneficialOwnerEntities: JsonField<List<KybBusinessEntityPatch>>
                ) = apply {
                    this.beneficialOwnerEntities =
                        beneficialOwnerEntities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [KybBusinessEntityPatch] to [beneficialOwnerEntities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
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
                 * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
                 * `List<IndividualPatch>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun beneficialOwnerIndividuals(
                    beneficialOwnerIndividuals: JsonField<List<IndividualPatch>>
                ) = apply {
                    this.beneficialOwnerIndividuals =
                        beneficialOwnerIndividuals.map { it.toMutableList() }
                }

                /**
                 * Adds a single [IndividualPatch] to [beneficialOwnerIndividuals].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
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
                 * Sets [Builder.businessEntity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessEntity] with a well-typed
                 * [KybBusinessEntityPatch] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                 * Sets [Builder.controlPerson] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.controlPerson] with a well-typed
                 * [IndividualPatch] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * Sets [Builder.externalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Sets [Builder.natureOfBusiness] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.natureOfBusiness] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
                    this.natureOfBusiness = natureOfBusiness
                }

                /** Company website URL. */
                fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

                /**
                 * Sets [Builder.websiteUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.websiteUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [KybPatchRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): KybPatchRequest =
                    KybPatchRequest(
                        (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                        (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                        businessEntity,
                        controlPerson,
                        externalId,
                        natureOfBusiness,
                        websiteUrl,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (beneficialOwnerEntities.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                    (beneficialOwnerIndividuals.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (businessEntity.asKnown().getOrNull()?.validity() ?: 0) +
                    (controlPerson.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (externalId.asKnown().isPresent) 1 else 0) +
                    (if (natureOfBusiness.asKnown().isPresent) 1 else 0) +
                    (if (websiteUrl.asKnown().isPresent) 1 else 0)

            class KybBusinessEntityPatch
            private constructor(
                private val entityToken: JsonField<String>,
                private val address: JsonField<AddressUpdate>,
                private val dbaBusinessName: JsonField<String>,
                private val governmentId: JsonField<String>,
                private val legalBusinessName: JsonField<String>,
                private val parentCompany: JsonField<String>,
                private val phoneNumbers: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("entity_token")
                    @ExcludeMissing
                    entityToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<AddressUpdate> = JsonMissing.of(),
                    @JsonProperty("dba_business_name")
                    @ExcludeMissing
                    dbaBusinessName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("government_id")
                    @ExcludeMissing
                    governmentId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("legal_business_name")
                    @ExcludeMissing
                    legalBusinessName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parent_company")
                    @ExcludeMissing
                    parentCompany: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
                ) : this(
                    entityToken,
                    address,
                    dbaBusinessName,
                    governmentId,
                    legalBusinessName,
                    parentCompany,
                    phoneNumbers,
                    mutableMapOf(),
                )

                /**
                 * Globally unique identifier for an entity.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /**
                 * Any name that the business operates under that is not its legal business name (if
                 * applicable).
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dbaBusinessName(): Optional<String> =
                    Optional.ofNullable(dbaBusinessName.getNullable("dba_business_name"))

                /**
                 * Government-issued identification number. US Federal Employer Identification
                 * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                 * without hyphens.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /**
                 * Legal (formal) business name.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun legalBusinessName(): Optional<String> =
                    Optional.ofNullable(legalBusinessName.getNullable("legal_business_name"))

                /**
                 * Parent company name (if applicable).
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun parentCompany(): Optional<String> =
                    Optional.ofNullable(parentCompany.getNullable("parent_company"))

                /**
                 * One or more of the business's phone number(s), entered as a list in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumbers(): Optional<List<String>> =
                    Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

                /**
                 * Returns the raw JSON value of [entityToken].
                 *
                 * Unlike [entityToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /**
                 * Returns the raw JSON value of [dbaBusinessName].
                 *
                 * Unlike [dbaBusinessName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dba_business_name")
                @ExcludeMissing
                fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

                /**
                 * Returns the raw JSON value of [governmentId].
                 *
                 * Unlike [governmentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Returns the raw JSON value of [legalBusinessName].
                 *
                 * Unlike [legalBusinessName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("legal_business_name")
                @ExcludeMissing
                fun _legalBusinessName(): JsonField<String> = legalBusinessName

                /**
                 * Returns the raw JSON value of [parentCompany].
                 *
                 * Unlike [parentCompany], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parent_company")
                @ExcludeMissing
                fun _parentCompany(): JsonField<String> = parentCompany

                /**
                 * Returns the raw JSON value of [phoneNumbers].
                 *
                 * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

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
                     * Returns a mutable builder for constructing an instance of
                     * [KybBusinessEntityPatch].
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.entityToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun entityToken(entityToken: JsonField<String>) = apply {
                        this.entityToken = entityToken
                    }

                    /**
                     * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable.
                     */
                    fun address(address: AddressUpdate) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [AddressUpdate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.dbaBusinessName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dbaBusinessName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.governmentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.governmentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.legalBusinessName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                        this.legalBusinessName = legalBusinessName
                    }

                    /** Parent company name (if applicable). */
                    fun parentCompany(parentCompany: String) =
                        parentCompany(JsonField.of(parentCompany))

                    /**
                     * Sets [Builder.parentCompany] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parentCompany] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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
                     * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumbers] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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

                    /**
                     * Returns an immutable instance of [KybBusinessEntityPatch].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): KybBusinessEntityPatch =
                        KybBusinessEntityPatch(
                            checkRequired("entityToken", entityToken),
                            address,
                            dbaBusinessName,
                            governmentId,
                            legalBusinessName,
                            parentCompany,
                            (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

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

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (entityToken.asKnown().isPresent) 1 else 0) +
                        (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (dbaBusinessName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (legalBusinessName.asKnown().isPresent) 1 else 0) +
                        (if (parentCompany.asKnown().isPresent) 1 else 0) +
                        (phoneNumbers.asKnown().getOrNull()?.size ?: 0)

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
            class IndividualPatch
            private constructor(
                private val entityToken: JsonField<String>,
                private val address: JsonField<AddressUpdate>,
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
                    @JsonProperty("entity_token")
                    @ExcludeMissing
                    entityToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<AddressUpdate> = JsonMissing.of(),
                    @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
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
                    entityToken,
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
                 * Globally unique identifier for an entity.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /**
                 * Individual's date of birth, as an RFC 3339 date.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                /**
                 * Individual's phone number, entered in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> =
                    Optional.ofNullable(phoneNumber.getNullable("phone_number"))

                /**
                 * Returns the raw JSON value of [entityToken].
                 *
                 * Unlike [entityToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /**
                 * Returns the raw JSON value of [dob].
                 *
                 * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [governmentId].
                 *
                 * Unlike [governmentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [IndividualPatch].
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.entityToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [AddressUpdate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun address(address: JsonField<AddressUpdate>) = apply {
                        this.address = address
                    }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /**
                     * Sets [Builder.dob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dob] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Sets [Builder.governmentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.governmentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Individual's phone number, entered in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    /**
                     * Returns an immutable instance of [IndividualPatch].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
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
                            additionalProperties.toMutableMap(),
                        )
                }

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

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (entityToken.asKnown().isPresent) 1 else 0) +
                        (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (dob.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0) +
                        (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (phoneNumber.asKnown().isPresent) 1 else 0)

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
        class KycPatchRequest
        private constructor(
            private val externalId: JsonField<String>,
            private val individual: JsonField<IndividualPatch>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<IndividualPatch> = JsonMissing.of(),
            ) : this(externalId, individual, mutableMapOf())

            /**
             * A user provided id that can be used to link an account holder with an external system
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalId(): Optional<String> =
                Optional.ofNullable(externalId.getNullable("external_id"))

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun individual(): Optional<IndividualPatch> =
                Optional.ofNullable(individual.getNullable("individual"))

            /**
             * Returns the raw JSON value of [externalId].
             *
             * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Returns the raw JSON value of [individual].
             *
             * Unlike [individual], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<IndividualPatch> = individual

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

                /** Returns a mutable builder for constructing an instance of [KycPatchRequest]. */
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
                 * Sets [Builder.externalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Sets [Builder.individual] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.individual] with a well-typed [IndividualPatch]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [KycPatchRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): KycPatchRequest =
                    KycPatchRequest(externalId, individual, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): KycPatchRequest = apply {
                if (validated) {
                    return@apply
                }

                externalId()
                individual().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (externalId.asKnown().isPresent) 1 else 0) +
                    (individual.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             */
            class IndividualPatch
            private constructor(
                private val entityToken: JsonField<String>,
                private val address: JsonField<AddressUpdate>,
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
                    @JsonProperty("entity_token")
                    @ExcludeMissing
                    entityToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<AddressUpdate> = JsonMissing.of(),
                    @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
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
                    entityToken,
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
                 * Globally unique identifier for an entity.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun entityToken(): String = entityToken.getRequired("entity_token")

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun address(): Optional<AddressUpdate> =
                    Optional.ofNullable(address.getNullable("address"))

                /**
                 * Individual's date of birth, as an RFC 3339 date.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> =
                    Optional.ofNullable(governmentId.getNullable("government_id"))

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                /**
                 * Individual's phone number, entered in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> =
                    Optional.ofNullable(phoneNumber.getNullable("phone_number"))

                /**
                 * Returns the raw JSON value of [entityToken].
                 *
                 * Unlike [entityToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("entity_token")
                @ExcludeMissing
                fun _entityToken(): JsonField<String> = entityToken

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<AddressUpdate> = address

                /**
                 * Returns the raw JSON value of [dob].
                 *
                 * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [governmentId].
                 *
                 * Unlike [governmentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [IndividualPatch].
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.entityToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [AddressUpdate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun address(address: JsonField<AddressUpdate>) = apply {
                        this.address = address
                    }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /**
                     * Sets [Builder.dob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dob] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Sets [Builder.governmentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.governmentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Individual's phone number, entered in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    /**
                     * Returns an immutable instance of [IndividualPatch].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .entityToken()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
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
                            additionalProperties.toMutableMap(),
                        )
                }

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

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (entityToken.asKnown().isPresent) 1 else 0) +
                        (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (dob.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0) +
                        (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (phoneNumber.asKnown().isPresent) 1 else 0)

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
        class PatchRequest
        private constructor(
            private val address: JsonField<AddressUpdate>,
            private val businessAccountToken: JsonField<String>,
            private val email: JsonField<String>,
            private val firstName: JsonField<String>,
            private val lastName: JsonField<String>,
            private val legalBusinessName: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<AddressUpdate> = JsonMissing.of(),
                @JsonProperty("business_account_token")
                @ExcludeMissing
                businessAccountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legal_business_name")
                @ExcludeMissing
                legalBusinessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                address,
                businessAccountToken,
                email,
                firstName,
                lastName,
                legalBusinessName,
                phoneNumber,
                mutableMapOf(),
            )

            /**
             * Allowed for: KYC-Exempt, BYO-KYC, BYO-KYB.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<AddressUpdate> =
                Optional.ofNullable(address.getNullable("address"))

            /**
             * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
             * account holder is associated.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun businessAccountToken(): Optional<String> =
                Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

            /**
             * Allowed for all Account Holders. Account holder's email address. The primary purpose
             * of this field is for cardholder identification and verification during the digital
             * wallet tokenization process.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

            /**
             * Allowed for KYC-Exempt, BYO-KYC. Account holder's first name.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun firstName(): Optional<String> =
                Optional.ofNullable(firstName.getNullable("first_name"))

            /**
             * Allowed for KYC-Exempt, BYO-KYC. Account holder's last name.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastName(): Optional<String> =
                Optional.ofNullable(lastName.getNullable("last_name"))

            /**
             * Allowed for BYO-KYB. Legal business name of the account holder.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun legalBusinessName(): Optional<String> =
                Optional.ofNullable(legalBusinessName.getNullable("legal_business_name"))

            /**
             * Allowed for all Account Holders. Account holder's phone number, entered in E.164
             * format. The primary purpose of this field is for cardholder identification and
             * verification during the digital wallet tokenization process.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> =
                Optional.ofNullable(phoneNumber.getNullable("phone_number"))

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun _address(): JsonField<AddressUpdate> = address

            /**
             * Returns the raw JSON value of [businessAccountToken].
             *
             * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_account_token")
            @ExcludeMissing
            fun _businessAccountToken(): JsonField<String> = businessAccountToken

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [legalBusinessName].
             *
             * Unlike [legalBusinessName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            fun _legalBusinessName(): JsonField<String> = legalBusinessName

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [PatchRequest]. */
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

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [AddressUpdate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<AddressUpdate>) = apply { this.address = address }

                /**
                 * Allowed for: KYC-Exempt, BYO-KYC. The token of the business account to which the
                 * account holder is associated.
                 */
                fun businessAccountToken(businessAccountToken: String) =
                    businessAccountToken(JsonField.of(businessAccountToken))

                /**
                 * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessAccountToken] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's first name. */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** Allowed for KYC-Exempt, BYO-KYC. Account holder's last name. */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** Allowed for BYO-KYB. Legal business name of the account holder. */
                fun legalBusinessName(legalBusinessName: String) =
                    legalBusinessName(JsonField.of(legalBusinessName))

                /**
                 * Sets [Builder.legalBusinessName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legalBusinessName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [PatchRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PatchRequest =
                    PatchRequest(
                        address,
                        businessAccountToken,
                        email,
                        firstName,
                        lastName,
                        legalBusinessName,
                        phoneNumber,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (businessAccountToken.asKnown().isPresent) 1 else 0) +
                    (if (email.asKnown().isPresent) 1 else 0) +
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                    (if (lastName.asKnown().isPresent) 1 else 0) +
                    (if (legalBusinessName.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0)

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
