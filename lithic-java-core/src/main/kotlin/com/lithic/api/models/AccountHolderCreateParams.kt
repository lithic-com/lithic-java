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
import com.lithic.api.core.Enum
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
 * Create an account holder and initiate the appropriate onboarding workflow. Account holders and
 * accounts have a 1:1 relationship. When an account holder is successfully created an associated
 * account is also created. All calls to this endpoint will return a synchronous response. The
 * response time will depend on the workflow. In some cases, the response may indicate the workflow
 * is under review or further action will be needed to complete the account creation process. This
 * endpoint can only be used on accounts that are part of the program that the calling API key
 * manages.
 */
class AccountHolderCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderCreateParams: AccountHolderCreateParams) = apply {
            body = accountHolderCreateParams.body
            additionalHeaders = accountHolderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountHolderCreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofKyb(kyb)`. */
        fun body(kyb: Kyb) = body(Body.ofKyb(kyb))

        /** Alias for calling [body] with `Body.ofKybDelegated(kybDelegated)`. */
        fun body(kybDelegated: Body.KybDelegated) = body(Body.ofKybDelegated(kybDelegated))

        /** Alias for calling [body] with `Body.ofKyc(kyc)`. */
        fun body(kyc: Kyc) = body(Body.ofKyc(kyc))

        /** Alias for calling [body] with `Body.ofKycExempt(kycExempt)`. */
        fun body(kycExempt: KycExempt) = body(Body.ofKycExempt(kycExempt))

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
         * Returns an immutable instance of [AccountHolderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderCreateParams =
            AccountHolderCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val kyb: Kyb? = null,
        private val kybDelegated: KybDelegated? = null,
        private val kyc: Kyc? = null,
        private val kycExempt: KycExempt? = null,
        private val _json: JsonValue? = null,
    ) {

        fun kyb(): Optional<Kyb> = Optional.ofNullable(kyb)

        fun kybDelegated(): Optional<KybDelegated> = Optional.ofNullable(kybDelegated)

        fun kyc(): Optional<Kyc> = Optional.ofNullable(kyc)

        fun kycExempt(): Optional<KycExempt> = Optional.ofNullable(kycExempt)

        fun isKyb(): Boolean = kyb != null

        fun isKybDelegated(): Boolean = kybDelegated != null

        fun isKyc(): Boolean = kyc != null

        fun isKycExempt(): Boolean = kycExempt != null

        fun asKyb(): Kyb = kyb.getOrThrow("kyb")

        fun asKybDelegated(): KybDelegated = kybDelegated.getOrThrow("kybDelegated")

        fun asKyc(): Kyc = kyc.getOrThrow("kyc")

        fun asKycExempt(): KycExempt = kycExempt.getOrThrow("kycExempt")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                kyb != null -> visitor.visitKyb(kyb)
                kybDelegated != null -> visitor.visitKybDelegated(kybDelegated)
                kyc != null -> visitor.visitKyc(kyc)
                kycExempt != null -> visitor.visitKycExempt(kycExempt)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitKyb(kyb: Kyb) {
                        kyb.validate()
                    }

                    override fun visitKybDelegated(kybDelegated: KybDelegated) {
                        kybDelegated.validate()
                    }

                    override fun visitKyc(kyc: Kyc) {
                        kyc.validate()
                    }

                    override fun visitKycExempt(kycExempt: KycExempt) {
                        kycExempt.validate()
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
                    override fun visitKyb(kyb: Kyb) = kyb.validity()

                    override fun visitKybDelegated(kybDelegated: KybDelegated) =
                        kybDelegated.validity()

                    override fun visitKyc(kyc: Kyc) = kyc.validity()

                    override fun visitKycExempt(kycExempt: KycExempt) = kycExempt.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                kyb == other.kyb &&
                kybDelegated == other.kybDelegated &&
                kyc == other.kyc &&
                kycExempt == other.kycExempt
        }

        override fun hashCode(): Int = Objects.hash(kyb, kybDelegated, kyc, kycExempt)

        override fun toString(): String =
            when {
                kyb != null -> "Body{kyb=$kyb}"
                kybDelegated != null -> "Body{kybDelegated=$kybDelegated}"
                kyc != null -> "Body{kyc=$kyc}"
                kycExempt != null -> "Body{kycExempt=$kycExempt}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic fun ofKyb(kyb: Kyb) = Body(kyb = kyb)

            @JvmStatic
            fun ofKybDelegated(kybDelegated: KybDelegated) = Body(kybDelegated = kybDelegated)

            @JvmStatic fun ofKyc(kyc: Kyc) = Body(kyc = kyc)

            @JvmStatic fun ofKycExempt(kycExempt: KycExempt) = Body(kycExempt = kycExempt)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitKyb(kyb: Kyb): T

            fun visitKybDelegated(kybDelegated: KybDelegated): T

            fun visitKyc(kyc: Kyc): T

            fun visitKycExempt(kycExempt: KycExempt): T

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
                            tryDeserialize(node, jacksonTypeRef<Kyb>())?.let {
                                Body(kyb = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<KybDelegated>())?.let {
                                Body(kybDelegated = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Kyc>())?.let {
                                Body(kyc = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<KycExempt>())?.let {
                                Body(kycExempt = it, _json = json)
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
                    value.kyb != null -> generator.writeObject(value.kyb)
                    value.kybDelegated != null -> generator.writeObject(value.kybDelegated)
                    value.kyc != null -> generator.writeObject(value.kyc)
                    value.kycExempt != null -> generator.writeObject(value.kycExempt)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class KybDelegated
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val businessEntity: JsonField<KybDelegatedBusinessEntity>,
            private val beneficialOwnerIndividuals: JsonField<List<KybIndividual>>,
            private val controlPerson: JsonField<KybIndividual>,
            private val externalId: JsonField<String>,
            private val natureOfBusiness: JsonField<String>,
            private val tosTimestamp: JsonField<String>,
            private val websiteUrl: JsonField<String>,
            private val workflow: JsonField<Workflow>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("business_entity")
                @ExcludeMissing
                businessEntity: JsonField<KybDelegatedBusinessEntity> = JsonMissing.of(),
                @JsonProperty("beneficial_owner_individuals")
                @ExcludeMissing
                beneficialOwnerIndividuals: JsonField<List<KybIndividual>> = JsonMissing.of(),
                @JsonProperty("control_person")
                @ExcludeMissing
                controlPerson: JsonField<KybIndividual> = JsonMissing.of(),
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nature_of_business")
                @ExcludeMissing
                natureOfBusiness: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tos_timestamp")
                @ExcludeMissing
                tosTimestamp: JsonField<String> = JsonMissing.of(),
                @JsonProperty("website_url")
                @ExcludeMissing
                websiteUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("workflow")
                @ExcludeMissing
                workflow: JsonField<Workflow> = JsonMissing.of(),
            ) : this(
                businessEntity,
                beneficialOwnerIndividuals,
                controlPerson,
                externalId,
                natureOfBusiness,
                tosTimestamp,
                websiteUrl,
                workflow,
                mutableMapOf(),
            )

            /**
             * Information for business for which the account is being opened.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessEntity(): KybDelegatedBusinessEntity =
                businessEntity.getRequired("business_entity")

            /**
             * You can submit a list of all direct and indirect individuals with 25% or more
             * ownership in the company. A maximum of 4 beneficial owners can be submitted. If no
             * individual owns 25% of the company you do not need to send beneficial owner
             * information. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section I) for more background on individuals that should be included.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun beneficialOwnerIndividuals(): Optional<List<KybIndividual>> =
                beneficialOwnerIndividuals.getOptional("beneficial_owner_individuals")

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
            fun controlPerson(): Optional<KybIndividual> =
                controlPerson.getOptional("control_person")

            /**
             * A user provided id that can be used to link an account holder with an external system
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalId(): Optional<String> = externalId.getOptional("external_id")

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun natureOfBusiness(): Optional<String> =
                natureOfBusiness.getOptional("nature_of_business")

            /**
             * An RFC 3339 timestamp indicating when the account holder accepted the applicable
             * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
             * implementation with Lithic.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tosTimestamp(): Optional<String> = tosTimestamp.getOptional("tos_timestamp")

            /**
             * Company website URL.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun websiteUrl(): Optional<String> = websiteUrl.getOptional("website_url")

            /**
             * Specifies the type of KYB workflow to run.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun workflow(): Optional<Workflow> = workflow.getOptional("workflow")

            /**
             * Returns the raw JSON value of [businessEntity].
             *
             * Unlike [businessEntity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_entity")
            @ExcludeMissing
            fun _businessEntity(): JsonField<KybDelegatedBusinessEntity> = businessEntity

            /**
             * Returns the raw JSON value of [beneficialOwnerIndividuals].
             *
             * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            fun _beneficialOwnerIndividuals(): JsonField<List<KybIndividual>> =
                beneficialOwnerIndividuals

            /**
             * Returns the raw JSON value of [controlPerson].
             *
             * Unlike [controlPerson], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("control_person")
            @ExcludeMissing
            fun _controlPerson(): JsonField<KybIndividual> = controlPerson

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
             * Returns the raw JSON value of [tosTimestamp].
             *
             * Unlike [tosTimestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tos_timestamp")
            @ExcludeMissing
            fun _tosTimestamp(): JsonField<String> = tosTimestamp

            /**
             * Returns the raw JSON value of [websiteUrl].
             *
             * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("website_url")
            @ExcludeMissing
            fun _websiteUrl(): JsonField<String> = websiteUrl

            /**
             * Returns the raw JSON value of [workflow].
             *
             * Unlike [workflow], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("workflow")
            @ExcludeMissing
            fun _workflow(): JsonField<Workflow> = workflow

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
                 * Returns a mutable builder for constructing an instance of [KybDelegated].
                 *
                 * The following fields are required:
                 * ```java
                 * .businessEntity()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [KybDelegated]. */
            class Builder internal constructor() {

                private var businessEntity: JsonField<KybDelegatedBusinessEntity>? = null
                private var beneficialOwnerIndividuals: JsonField<MutableList<KybIndividual>>? =
                    null
                private var controlPerson: JsonField<KybIndividual> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var natureOfBusiness: JsonField<String> = JsonMissing.of()
                private var tosTimestamp: JsonField<String> = JsonMissing.of()
                private var websiteUrl: JsonField<String> = JsonMissing.of()
                private var workflow: JsonField<Workflow> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(kybDelegated: KybDelegated) = apply {
                    businessEntity = kybDelegated.businessEntity
                    beneficialOwnerIndividuals =
                        kybDelegated.beneficialOwnerIndividuals.map { it.toMutableList() }
                    controlPerson = kybDelegated.controlPerson
                    externalId = kybDelegated.externalId
                    natureOfBusiness = kybDelegated.natureOfBusiness
                    tosTimestamp = kybDelegated.tosTimestamp
                    websiteUrl = kybDelegated.websiteUrl
                    workflow = kybDelegated.workflow
                    additionalProperties = kybDelegated.additionalProperties.toMutableMap()
                }

                /** Information for business for which the account is being opened. */
                fun businessEntity(businessEntity: KybDelegatedBusinessEntity) =
                    businessEntity(JsonField.of(businessEntity))

                /**
                 * Sets [Builder.businessEntity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessEntity] with a well-typed
                 * [KybDelegatedBusinessEntity] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun businessEntity(businessEntity: JsonField<KybDelegatedBusinessEntity>) = apply {
                    this.businessEntity = businessEntity
                }

                /**
                 * You can submit a list of all direct and indirect individuals with 25% or more
                 * ownership in the company. A maximum of 4 beneficial owners can be submitted. If
                 * no individual owns 25% of the company you do not need to send beneficial owner
                 * information. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
                 * (Section I) for more background on individuals that should be included.
                 */
                fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<KybIndividual>) =
                    beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

                /**
                 * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
                 * `List<KybIndividual>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun beneficialOwnerIndividuals(
                    beneficialOwnerIndividuals: JsonField<List<KybIndividual>>
                ) = apply {
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
                            checkKnown("beneficialOwnerIndividuals", it)
                                .add(beneficialOwnerIndividual)
                        }
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
                fun controlPerson(controlPerson: KybIndividual) =
                    controlPerson(JsonField.of(controlPerson))

                /**
                 * Sets [Builder.controlPerson] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.controlPerson] with a well-typed [KybIndividual]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun controlPerson(controlPerson: JsonField<KybIndividual>) = apply {
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

                /**
                 * An RFC 3339 timestamp indicating when the account holder accepted the applicable
                 * legal agreements (e.g., cardholder terms) as agreed upon during API customer's
                 * implementation with Lithic.
                 */
                fun tosTimestamp(tosTimestamp: String) = tosTimestamp(JsonField.of(tosTimestamp))

                /**
                 * Sets [Builder.tosTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tosTimestamp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tosTimestamp(tosTimestamp: JsonField<String>) = apply {
                    this.tosTimestamp = tosTimestamp
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

                /** Specifies the type of KYB workflow to run. */
                fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

                /**
                 * Sets [Builder.workflow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workflow] with a well-typed [Workflow] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

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
                 * Returns an immutable instance of [KybDelegated].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .businessEntity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): KybDelegated =
                    KybDelegated(
                        checkRequired("businessEntity", businessEntity),
                        (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                        controlPerson,
                        externalId,
                        natureOfBusiness,
                        tosTimestamp,
                        websiteUrl,
                        workflow,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): KybDelegated = apply {
                if (validated) {
                    return@apply
                }

                businessEntity().validate()
                beneficialOwnerIndividuals().ifPresent { it.forEach { it.validate() } }
                controlPerson().ifPresent { it.validate() }
                externalId()
                natureOfBusiness()
                tosTimestamp()
                websiteUrl()
                workflow().ifPresent { it.validate() }
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
                (businessEntity.asKnown().getOrNull()?.validity() ?: 0) +
                    (beneficialOwnerIndividuals.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (controlPerson.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (externalId.asKnown().isPresent) 1 else 0) +
                    (if (natureOfBusiness.asKnown().isPresent) 1 else 0) +
                    (if (tosTimestamp.asKnown().isPresent) 1 else 0) +
                    (if (websiteUrl.asKnown().isPresent) 1 else 0) +
                    (workflow.asKnown().getOrNull()?.validity() ?: 0)

            /** Information for business for which the account is being opened. */
            class KybDelegatedBusinessEntity
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val legalBusinessName: JsonField<String>,
                private val dbaBusinessName: JsonField<String>,
                private val governmentId: JsonField<String>,
                private val parentCompany: JsonField<String>,
                private val phoneNumbers: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("legal_business_name")
                    @ExcludeMissing
                    legalBusinessName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dba_business_name")
                    @ExcludeMissing
                    dbaBusinessName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("government_id")
                    @ExcludeMissing
                    governmentId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parent_company")
                    @ExcludeMissing
                    parentCompany: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
                ) : this(
                    address,
                    legalBusinessName,
                    dbaBusinessName,
                    governmentId,
                    parentCompany,
                    phoneNumbers,
                    mutableMapOf(),
                )

                /**
                 * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun address(): Address = address.getRequired("address")

                /**
                 * Legal (formal) business name.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun legalBusinessName(): String =
                    legalBusinessName.getRequired("legal_business_name")

                /**
                 * Any name that the business operates under that is not its legal business name (if
                 * applicable).
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dbaBusinessName(): Optional<String> =
                    dbaBusinessName.getOptional("dba_business_name")

                /**
                 * Government-issued identification number. US Federal Employer Identification
                 * Numbers (EIN) are currently supported, entered as full nine-digits, with or
                 * without hyphens.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> = governmentId.getOptional("government_id")

                /**
                 * Parent company name (if applicable).
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun parentCompany(): Optional<String> = parentCompany.getOptional("parent_company")

                /**
                 * One or more of the business's phone number(s), entered as a list in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumbers(): Optional<List<String>> =
                    phoneNumbers.getOptional("phone_numbers")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * [KybDelegatedBusinessEntity].
                     *
                     * The following fields are required:
                     * ```java
                     * .address()
                     * .legalBusinessName()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [KybDelegatedBusinessEntity]. */
                class Builder internal constructor() {

                    private var address: JsonField<Address>? = null
                    private var legalBusinessName: JsonField<String>? = null
                    private var dbaBusinessName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var parentCompany: JsonField<String> = JsonMissing.of()
                    private var phoneNumbers: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(kybDelegatedBusinessEntity: KybDelegatedBusinessEntity) =
                        apply {
                            address = kybDelegatedBusinessEntity.address
                            legalBusinessName = kybDelegatedBusinessEntity.legalBusinessName
                            dbaBusinessName = kybDelegatedBusinessEntity.dbaBusinessName
                            governmentId = kybDelegatedBusinessEntity.governmentId
                            parentCompany = kybDelegatedBusinessEntity.parentCompany
                            phoneNumbers =
                                kybDelegatedBusinessEntity.phoneNumbers.map { it.toMutableList() }
                            additionalProperties =
                                kybDelegatedBusinessEntity.additionalProperties.toMutableMap()
                        }

                    /**
                     * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable.
                     */
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [KybDelegatedBusinessEntity].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .address()
                     * .legalBusinessName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): KybDelegatedBusinessEntity =
                        KybDelegatedBusinessEntity(
                            checkRequired("address", address),
                            checkRequired("legalBusinessName", legalBusinessName),
                            dbaBusinessName,
                            governmentId,
                            parentCompany,
                            (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): KybDelegatedBusinessEntity = apply {
                    if (validated) {
                        return@apply
                    }

                    address().validate()
                    legalBusinessName()
                    dbaBusinessName()
                    governmentId()
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
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (legalBusinessName.asKnown().isPresent) 1 else 0) +
                        (if (dbaBusinessName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (parentCompany.asKnown().isPresent) 1 else 0) +
                        (phoneNumbers.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is KybDelegatedBusinessEntity &&
                        address == other.address &&
                        legalBusinessName == other.legalBusinessName &&
                        dbaBusinessName == other.dbaBusinessName &&
                        governmentId == other.governmentId &&
                        parentCompany == other.parentCompany &&
                        phoneNumbers == other.phoneNumbers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        legalBusinessName,
                        dbaBusinessName,
                        governmentId,
                        parentCompany,
                        phoneNumbers,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KybDelegatedBusinessEntity{address=$address, legalBusinessName=$legalBusinessName, dbaBusinessName=$dbaBusinessName, governmentId=$governmentId, parentCompany=$parentCompany, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
            }

            /** Individuals associated with a KYB application. Phone number is optional. */
            class KybIndividual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
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
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun address(): Address = address.getRequired("address")

                /**
                 * Individual's date of birth, as an RFC 3339 date.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun dob(): String = dob.getRequired("dob")

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun firstName(): String = firstName.getRequired("first_name")

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun governmentId(): String = governmentId.getRequired("government_id")

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun lastName(): String = lastName.getRequired("last_name")

                /**
                 * Individual's phone number, entered in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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

                    return other is KybIndividual &&
                        address == other.address &&
                        dob == other.dob &&
                        email == other.email &&
                        firstName == other.firstName &&
                        governmentId == other.governmentId &&
                        lastName == other.lastName &&
                        phoneNumber == other.phoneNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
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

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KybIndividual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            /** Specifies the type of KYB workflow to run. */
            class Workflow @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val KYB_DELEGATED = of("KYB_DELEGATED")

                    @JvmStatic fun of(value: String) = Workflow(JsonField.of(value))
                }

                /** An enum containing [Workflow]'s known values. */
                enum class Known {
                    KYB_DELEGATED
                }

                /**
                 * An enum containing [Workflow]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Workflow] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    KYB_DELEGATED,
                    /**
                     * An enum member indicating that [Workflow] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        KYB_DELEGATED -> Value.KYB_DELEGATED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        KYB_DELEGATED -> Known.KYB_DELEGATED
                        else -> throw LithicInvalidDataException("Unknown Workflow: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Workflow = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Workflow && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is KybDelegated &&
                    businessEntity == other.businessEntity &&
                    beneficialOwnerIndividuals == other.beneficialOwnerIndividuals &&
                    controlPerson == other.controlPerson &&
                    externalId == other.externalId &&
                    natureOfBusiness == other.natureOfBusiness &&
                    tosTimestamp == other.tosTimestamp &&
                    websiteUrl == other.websiteUrl &&
                    workflow == other.workflow &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    businessEntity,
                    beneficialOwnerIndividuals,
                    controlPerson,
                    externalId,
                    natureOfBusiness,
                    tosTimestamp,
                    websiteUrl,
                    workflow,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KybDelegated{businessEntity=$businessEntity, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, controlPerson=$controlPerson, externalId=$externalId, natureOfBusiness=$natureOfBusiness, tosTimestamp=$tosTimestamp, websiteUrl=$websiteUrl, workflow=$workflow, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountHolderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
