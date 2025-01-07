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
import java.time.OffsetDateTime
import java.util.Objects

/** Describes the document and the required document image uploads required to re-run KYC */
@NoAutoDetect
class Document
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    private val accountHolderToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("document_type")
    @ExcludeMissing
    private val documentType: JsonField<DocumentType> = JsonMissing.of(),
    @JsonProperty("entity_token")
    @ExcludeMissing
    private val entityToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the document. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the account holder. */
    fun accountHolderToken(): String = accountHolderToken.getRequired("account_holder_token")

    /** Type of documentation to be submitted for verification of an account holder */
    fun documentType(): DocumentType = documentType.getRequired("document_type")

    /** Globally unique identifier for an entity. */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /** Represents a single image of the document to upload. */
    fun requiredDocumentUploads(): List<RequiredDocumentUpload> =
        requiredDocumentUploads.getRequired("required_document_uploads")

    /** Globally unique identifier for the document. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Globally unique identifier for the account holder. */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken(): JsonField<String> = accountHolderToken

    /** Type of documentation to be submitted for verification of an account holder */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /** Globally unique identifier for an entity. */
    @JsonProperty("entity_token")
    @ExcludeMissing
    fun _entityToken(): JsonField<String> = entityToken

    /** Represents a single image of the document to upload. */
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads(): JsonField<List<RequiredDocumentUpload>> =
        requiredDocumentUploads

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (!validated) {
            token()
            accountHolderToken()
            documentType()
            entityToken()
            requiredDocumentUploads().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var accountHolderToken: JsonField<String>? = null
        private var documentType: JsonField<DocumentType>? = null
        private var entityToken: JsonField<String>? = null
        private var requiredDocumentUploads: JsonField<MutableList<RequiredDocumentUpload>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            token = document.token
            accountHolderToken = document.accountHolderToken
            documentType = document.documentType
            entityToken = document.entityToken
            requiredDocumentUploads = document.requiredDocumentUploads.map { it.toMutableList() }
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the document. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of documentation to be submitted for verification of an account holder */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /** Type of documentation to be submitted for verification of an account holder */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /** Represents a single image of the document to upload. */
        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        /** Represents a single image of the document to upload. */
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply {
            this.requiredDocumentUploads = requiredDocumentUploads.map { it.toMutableList() }
        }

        /** Represents a single image of the document to upload. */
        fun addRequiredDocumentUpload(requiredDocumentUpload: RequiredDocumentUpload) = apply {
            requiredDocumentUploads =
                (requiredDocumentUploads ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(requiredDocumentUpload)
                }
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

        fun build(): Document =
            Document(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(accountHolderToken) {
                    "`accountHolderToken` is required but was not set"
                },
                checkNotNull(documentType) { "`documentType` is required but was not set" },
                checkNotNull(entityToken) { "`entityToken` is required but was not set" },
                checkNotNull(requiredDocumentUploads) {
                        "`requiredDocumentUploads` is required but was not set"
                    }
                    .map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

            @JvmField val PASSPORT = of("PASSPORT")

            @JvmField val PASSPORT_CARD = of("PASSPORT_CARD")

            @JvmField val EIN_LETTER = of("EIN_LETTER")

            @JvmField val TAX_RETURN = of("TAX_RETURN")

            @JvmField val OPERATING_AGREEMENT = of("OPERATING_AGREEMENT")

            @JvmField val CERTIFICATE_OF_FORMATION = of("CERTIFICATE_OF_FORMATION")

            @JvmField val CERTIFICATE_OF_GOOD_STANDING = of("CERTIFICATE_OF_GOOD_STANDING")

            @JvmField val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

            @JvmField val ARTICLES_OF_ORGANIZATION = of("ARTICLES_OF_ORGANIZATION")

            @JvmField val BYLAWS = of("BYLAWS")

            @JvmField val GOVERNMENT_BUSINESS_LICENSE = of("GOVERNMENT_BUSINESS_LICENSE")

            @JvmField val PARTNERSHIP_AGREEMENT = of("PARTNERSHIP_AGREEMENT")

            @JvmField val SS4_FORM = of("SS4_FORM")

            @JvmField val BANK_STATEMENT = of("BANK_STATEMENT")

            @JvmField val UTILITY_BILL_STATEMENT = of("UTILITY_BILL_STATEMENT")

            @JvmField val SSN_CARD = of("SSN_CARD")

            @JvmField val ITIN_LETTER = of("ITIN_LETTER")

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        enum class Known {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
        }

        enum class Value {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                EIN_LETTER -> Value.EIN_LETTER
                TAX_RETURN -> Value.TAX_RETURN
                OPERATING_AGREEMENT -> Value.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Value.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Value.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Value.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Value.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Value.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Value.SS4_FORM
                BANK_STATEMENT -> Value.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Value.UTILITY_BILL_STATEMENT
                SSN_CARD -> Value.SSN_CARD
                ITIN_LETTER -> Value.ITIN_LETTER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                EIN_LETTER -> Known.EIN_LETTER
                TAX_RETURN -> Known.TAX_RETURN
                OPERATING_AGREEMENT -> Known.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Known.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Known.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Known.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Known.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Known.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Known.SS4_FORM
                BANK_STATEMENT -> Known.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Known.UTILITY_BILL_STATEMENT
                SSN_CARD -> Known.SSN_CARD
                ITIN_LETTER -> Known.ITIN_LETTER
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents a single image of the document to upload. */
    @NoAutoDetect
    class RequiredDocumentUpload
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        private val acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("image_type")
        @ExcludeMissing
        private val imageType: JsonField<ImageType> = JsonMissing.of(),
        @JsonProperty("rejected_entity_status_reasons")
        @ExcludeMissing
        private val rejectedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<DocumentUploadStatus> = JsonMissing.of(),
        @JsonProperty("status_reasons")
        @ExcludeMissing
        private val statusReasons: JsonField<List<DocumentUploadStatusReasons>> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("upload_url")
        @ExcludeMissing
        private val uploadUrl: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Globally unique identifier for the document upload. */
        fun token(): String = token.getRequired("token")

        /**
         * A list of status reasons associated with a KYB account holder that have been satisfied by
         * the document upload
         */
        fun acceptedEntityStatusReasons(): List<String> =
            acceptedEntityStatusReasons.getRequired("accepted_entity_status_reasons")

        /** When the document upload was created */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** Type of image to upload. */
        fun imageType(): ImageType = imageType.getRequired("image_type")

        /**
         * A list of status reasons associated with a KYB account holder that have not been
         * satisfied by the document upload
         */
        fun rejectedEntityStatusReasons(): List<String> =
            rejectedEntityStatusReasons.getRequired("rejected_entity_status_reasons")

        /** Status of an account holder's document upload. */
        fun status(): DocumentUploadStatus = status.getRequired("status")

        /** Reasons for document image upload status. */
        fun statusReasons(): List<DocumentUploadStatusReasons> =
            statusReasons.getRequired("status_reasons")

        /** When the document upload was last updated */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        fun uploadUrl(): String = uploadUrl.getRequired("upload_url")

        /** Globally unique identifier for the document upload. */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * A list of status reasons associated with a KYB account holder that have been satisfied by
         * the document upload
         */
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        fun _acceptedEntityStatusReasons(): JsonField<List<String>> = acceptedEntityStatusReasons

        /** When the document upload was created */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /** Type of image to upload. */
        @JsonProperty("image_type")
        @ExcludeMissing
        fun _imageType(): JsonField<ImageType> = imageType

        /**
         * A list of status reasons associated with a KYB account holder that have not been
         * satisfied by the document upload
         */
        @JsonProperty("rejected_entity_status_reasons")
        @ExcludeMissing
        fun _rejectedEntityStatusReasons(): JsonField<List<String>> = rejectedEntityStatusReasons

        /** Status of an account holder's document upload. */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<DocumentUploadStatus> = status

        /** Reasons for document image upload status. */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<DocumentUploadStatusReasons>> = statusReasons

        /** When the document upload was last updated */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RequiredDocumentUpload = apply {
            if (!validated) {
                token()
                acceptedEntityStatusReasons()
                created()
                imageType()
                rejectedEntityStatusReasons()
                status()
                statusReasons()
                updated()
                uploadUrl()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String>? = null
            private var acceptedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var imageType: JsonField<ImageType>? = null
            private var rejectedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var status: JsonField<DocumentUploadStatus>? = null
            private var statusReasons: JsonField<MutableList<DocumentUploadStatusReasons>>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var uploadUrl: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                token = requiredDocumentUpload.token
                acceptedEntityStatusReasons =
                    requiredDocumentUpload.acceptedEntityStatusReasons.map { it.toMutableList() }
                created = requiredDocumentUpload.created
                imageType = requiredDocumentUpload.imageType
                rejectedEntityStatusReasons =
                    requiredDocumentUpload.rejectedEntityStatusReasons.map { it.toMutableList() }
                status = requiredDocumentUpload.status
                statusReasons = requiredDocumentUpload.statusReasons.map { it.toMutableList() }
                updated = requiredDocumentUpload.updated
                uploadUrl = requiredDocumentUpload.uploadUrl
                additionalProperties = requiredDocumentUpload.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the document upload. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for the document upload. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) =
                acceptedEntityStatusReasons(JsonField.of(acceptedEntityStatusReasons))

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.acceptedEntityStatusReasons =
                        acceptedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
                acceptedEntityStatusReasons =
                    (acceptedEntityStatusReasons ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(acceptedEntityStatusReason)
                    }
            }

            /** When the document upload was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** When the document upload was created */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Type of image to upload. */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /** Type of image to upload. */
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: List<String>) =
                rejectedEntityStatusReasons(JsonField.of(rejectedEntityStatusReasons))

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.rejectedEntityStatusReasons =
                        rejectedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            fun addRejectedEntityStatusReason(rejectedEntityStatusReason: String) = apply {
                rejectedEntityStatusReasons =
                    (rejectedEntityStatusReasons ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(rejectedEntityStatusReason)
                    }
            }

            /** Status of an account holder's document upload. */
            fun status(status: DocumentUploadStatus) = status(JsonField.of(status))

            /** Status of an account holder's document upload. */
            fun status(status: JsonField<DocumentUploadStatus>) = apply { this.status = status }

            /** Reasons for document image upload status. */
            fun statusReasons(statusReasons: List<DocumentUploadStatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reasons for document image upload status. */
            fun statusReasons(statusReasons: JsonField<List<DocumentUploadStatusReasons>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /** Reasons for document image upload status. */
            fun addStatusReason(statusReason: DocumentUploadStatusReasons) = apply {
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

            /** When the document upload was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /** When the document upload was last updated */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            /**
             * URL to upload document image to.
             *
             * Note that the upload URLs expire after 7 days. If an upload URL expires, you can
             * refresh the URLs by retrieving the document upload from `GET
             * /account_holders/{account_holder_token}/documents`.
             */
            fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

            /**
             * URL to upload document image to.
             *
             * Note that the upload URLs expire after 7 days. If an upload URL expires, you can
             * refresh the URLs by retrieving the document upload from `GET
             * /account_holders/{account_holder_token}/documents`.
             */
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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

            fun build(): RequiredDocumentUpload =
                RequiredDocumentUpload(
                    checkNotNull(token) { "`token` is required but was not set" },
                    checkNotNull(acceptedEntityStatusReasons) {
                            "`acceptedEntityStatusReasons` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(created) { "`created` is required but was not set" },
                    checkNotNull(imageType) { "`imageType` is required but was not set" },
                    checkNotNull(rejectedEntityStatusReasons) {
                            "`rejectedEntityStatusReasons` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(status) { "`status` is required but was not set" },
                    checkNotNull(statusReasons) { "`statusReasons` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(updated) { "`updated` is required but was not set" },
                    checkNotNull(uploadUrl) { "`uploadUrl` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class ImageType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FRONT = of("FRONT")

                @JvmField val BACK = of("BACK")

                @JvmStatic fun of(value: String) = ImageType(JsonField.of(value))
            }

            enum class Known {
                FRONT,
                BACK,
            }

            enum class Value {
                FRONT,
                BACK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FRONT -> Value.FRONT
                    BACK -> Value.BACK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FRONT -> Known.FRONT
                    BACK -> Known.BACK
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ImageType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DocumentUploadStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCEPTED = of("ACCEPTED")

                @JvmField val REJECTED = of("REJECTED")

                @JvmField val PENDING_UPLOAD = of("PENDING_UPLOAD")

                @JvmField val UPLOADED = of("UPLOADED")

                @JvmField val PARTIAL_APPROVAL = of("PARTIAL_APPROVAL")

                @JvmStatic fun of(value: String) = DocumentUploadStatus(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
            }

            enum class Value {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    REJECTED -> Value.REJECTED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    REJECTED -> Known.REJECTED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                    else -> throw LithicInvalidDataException("Unknown DocumentUploadStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentUploadStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DocumentUploadStatusReasons
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DOCUMENT_MISSING_REQUIRED_DATA = of("DOCUMENT_MISSING_REQUIRED_DATA")

                @JvmField val DOCUMENT_UPLOAD_TOO_BLURRY = of("DOCUMENT_UPLOAD_TOO_BLURRY")

                @JvmField val FILE_SIZE_TOO_LARGE = of("FILE_SIZE_TOO_LARGE")

                @JvmField val INVALID_DOCUMENT_TYPE = of("INVALID_DOCUMENT_TYPE")

                @JvmField val INVALID_DOCUMENT_UPLOAD = of("INVALID_DOCUMENT_UPLOAD")

                @JvmField val INVALID_ENTITY = of("INVALID_ENTITY")

                @JvmField val DOCUMENT_EXPIRED = of("DOCUMENT_EXPIRED")

                @JvmField
                val DOCUMENT_ISSUED_GREATER_THAN_30_DAYS =
                    of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS")

                @JvmField val DOCUMENT_TYPE_NOT_SUPPORTED = of("DOCUMENT_TYPE_NOT_SUPPORTED")

                @JvmField val UNKNOWN_FAILURE_REASON = of("UNKNOWN_FAILURE_REASON")

                @JvmField val UNKNOWN_ERROR = of("UNKNOWN_ERROR")

                @JvmStatic fun of(value: String) = DocumentUploadStatusReasons(JsonField.of(value))
            }

            enum class Known {
                DOCUMENT_MISSING_REQUIRED_DATA,
                DOCUMENT_UPLOAD_TOO_BLURRY,
                FILE_SIZE_TOO_LARGE,
                INVALID_DOCUMENT_TYPE,
                INVALID_DOCUMENT_UPLOAD,
                INVALID_ENTITY,
                DOCUMENT_EXPIRED,
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS,
                DOCUMENT_TYPE_NOT_SUPPORTED,
                UNKNOWN_FAILURE_REASON,
                UNKNOWN_ERROR,
            }

            enum class Value {
                DOCUMENT_MISSING_REQUIRED_DATA,
                DOCUMENT_UPLOAD_TOO_BLURRY,
                FILE_SIZE_TOO_LARGE,
                INVALID_DOCUMENT_TYPE,
                INVALID_DOCUMENT_UPLOAD,
                INVALID_ENTITY,
                DOCUMENT_EXPIRED,
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS,
                DOCUMENT_TYPE_NOT_SUPPORTED,
                UNKNOWN_FAILURE_REASON,
                UNKNOWN_ERROR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DOCUMENT_MISSING_REQUIRED_DATA -> Value.DOCUMENT_MISSING_REQUIRED_DATA
                    DOCUMENT_UPLOAD_TOO_BLURRY -> Value.DOCUMENT_UPLOAD_TOO_BLURRY
                    FILE_SIZE_TOO_LARGE -> Value.FILE_SIZE_TOO_LARGE
                    INVALID_DOCUMENT_TYPE -> Value.INVALID_DOCUMENT_TYPE
                    INVALID_DOCUMENT_UPLOAD -> Value.INVALID_DOCUMENT_UPLOAD
                    INVALID_ENTITY -> Value.INVALID_ENTITY
                    DOCUMENT_EXPIRED -> Value.DOCUMENT_EXPIRED
                    DOCUMENT_ISSUED_GREATER_THAN_30_DAYS ->
                        Value.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                    DOCUMENT_TYPE_NOT_SUPPORTED -> Value.DOCUMENT_TYPE_NOT_SUPPORTED
                    UNKNOWN_FAILURE_REASON -> Value.UNKNOWN_FAILURE_REASON
                    UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DOCUMENT_MISSING_REQUIRED_DATA -> Known.DOCUMENT_MISSING_REQUIRED_DATA
                    DOCUMENT_UPLOAD_TOO_BLURRY -> Known.DOCUMENT_UPLOAD_TOO_BLURRY
                    FILE_SIZE_TOO_LARGE -> Known.FILE_SIZE_TOO_LARGE
                    INVALID_DOCUMENT_TYPE -> Known.INVALID_DOCUMENT_TYPE
                    INVALID_DOCUMENT_UPLOAD -> Known.INVALID_DOCUMENT_UPLOAD
                    INVALID_ENTITY -> Known.INVALID_ENTITY
                    DOCUMENT_EXPIRED -> Known.DOCUMENT_EXPIRED
                    DOCUMENT_ISSUED_GREATER_THAN_30_DAYS ->
                        Known.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                    DOCUMENT_TYPE_NOT_SUPPORTED -> Known.DOCUMENT_TYPE_NOT_SUPPORTED
                    UNKNOWN_FAILURE_REASON -> Known.UNKNOWN_FAILURE_REASON
                    UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown DocumentUploadStatusReasons: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentUploadStatusReasons && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequiredDocumentUpload && token == other.token && acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && created == other.created && imageType == other.imageType && rejectedEntityStatusReasons == other.rejectedEntityStatusReasons && status == other.status && statusReasons == other.statusReasons && updated == other.updated && uploadUrl == other.uploadUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, acceptedEntityStatusReasons, created, imageType, rejectedEntityStatusReasons, status, statusReasons, updated, uploadUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequiredDocumentUpload{token=$token, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, created=$created, imageType=$imageType, rejectedEntityStatusReasons=$rejectedEntityStatusReasons, status=$status, statusReasons=$statusReasons, updated=$updated, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && token == other.token && accountHolderToken == other.accountHolderToken && documentType == other.documentType && entityToken == other.entityToken && requiredDocumentUploads == other.requiredDocumentUploads && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountHolderToken, documentType, entityToken, requiredDocumentUploads, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{token=$token, accountHolderToken=$accountHolderToken, documentType=$documentType, entityToken=$entityToken, requiredDocumentUploads=$requiredDocumentUploads, additionalProperties=$additionalProperties}"
}
