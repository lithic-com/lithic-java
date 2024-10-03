// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/** Describes the document and the required document image uploads required to re-run KYC */
@JsonDeserialize(builder = Document.Builder::class)
@NoAutoDetect
class Document
private constructor(
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val entityToken: JsonField<String>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for the document. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the account holder. */
    fun accountHolderToken(): String = accountHolderToken.getRequired("account_holder_token")

    /** Type of documentation to be submitted for verification. */
    fun documentType(): DocumentType = documentType.getRequired("document_type")

    /** Globally unique identifier for an entity. */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /** Represents a single image of the document to upload. */
    fun requiredDocumentUploads(): List<RequiredDocumentUpload> =
        requiredDocumentUploads.getRequired("required_document_uploads")

    /** Globally unique identifier for the document. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for the account holder. */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken() = accountHolderToken

    /** Type of documentation to be submitted for verification. */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    /** Globally unique identifier for an entity. */
    @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

    /** Represents a single image of the document to upload. */
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads() = requiredDocumentUploads

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        private var token: JsonField<String> = JsonMissing.of()
        private var accountHolderToken: JsonField<String> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var entityToken: JsonField<String> = JsonMissing.of()
        private var requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            this.token = document.token
            this.accountHolderToken = document.accountHolderToken
            this.documentType = document.documentType
            this.entityToken = document.entityToken
            this.requiredDocumentUploads = document.requiredDocumentUploads
            additionalProperties(document.additionalProperties)
        }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the document. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of documentation to be submitted for verification. */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /** Type of documentation to be submitted for verification. */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for an entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /** Represents a single image of the document to upload. */
        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        /** Represents a single image of the document to upload. */
        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply { this.requiredDocumentUploads = requiredDocumentUploads }

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

        fun build(): Document =
            Document(
                token,
                accountHolderToken,
                documentType,
                entityToken,
                requiredDocumentUploads.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DRIVERS_LICENSE = DocumentType(JsonField.of("DRIVERS_LICENSE"))

            @JvmField val PASSPORT = DocumentType(JsonField.of("PASSPORT"))

            @JvmField val PASSPORT_CARD = DocumentType(JsonField.of("PASSPORT_CARD"))

            @JvmField val EIN_LETTER = DocumentType(JsonField.of("EIN_LETTER"))

            @JvmField val TAX_RETURN = DocumentType(JsonField.of("TAX_RETURN"))

            @JvmField val OPERATING_AGREEMENT = DocumentType(JsonField.of("OPERATING_AGREEMENT"))

            @JvmField
            val CERTIFICATE_OF_FORMATION = DocumentType(JsonField.of("CERTIFICATE_OF_FORMATION"))

            @JvmField
            val CERTIFICATE_OF_GOOD_STANDING =
                DocumentType(JsonField.of("CERTIFICATE_OF_GOOD_STANDING"))

            @JvmField
            val ARTICLES_OF_INCORPORATION = DocumentType(JsonField.of("ARTICLES_OF_INCORPORATION"))

            @JvmField
            val ARTICLES_OF_ORGANIZATION = DocumentType(JsonField.of("ARTICLES_OF_ORGANIZATION"))

            @JvmField val BYLAWS = DocumentType(JsonField.of("BYLAWS"))

            @JvmField
            val GOVERNMENT_BUSINESS_LICENSE =
                DocumentType(JsonField.of("GOVERNMENT_BUSINESS_LICENSE"))

            @JvmField
            val PARTNERSHIP_AGREEMENT = DocumentType(JsonField.of("PARTNERSHIP_AGREEMENT"))

            @JvmField val SS4_FORM = DocumentType(JsonField.of("SS4_FORM"))

            @JvmField val BANK_STATEMENT = DocumentType(JsonField.of("BANK_STATEMENT"))

            @JvmField
            val UTILITY_BILL_STATEMENT = DocumentType(JsonField.of("UTILITY_BILL_STATEMENT"))

            @JvmField val SSN_CARD = DocumentType(JsonField.of("SSN_CARD"))

            @JvmField val ITIN_LETTER = DocumentType(JsonField.of("ITIN_LETTER"))

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
    }

    /** Represents a single image of the document to upload. */
    @JsonDeserialize(builder = RequiredDocumentUpload.Builder::class)
    @NoAutoDetect
    class RequiredDocumentUpload
    private constructor(
        private val imageType: JsonField<ImageType>,
        private val status: JsonField<Status>,
        private val statusReasons: JsonField<List<StatusReason>>,
        private val uploadUrl: JsonField<String>,
        private val token: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Type of image to upload. */
        fun imageType(): ImageType = imageType.getRequired("image_type")

        /** Status of document image upload. */
        fun status(): Status = status.getRequired("status")

        /** Reasons for document image upload status. */
        fun statusReasons(): List<StatusReason> = statusReasons.getRequired("status_reasons")

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        fun uploadUrl(): String = uploadUrl.getRequired("upload_url")

        /** Globally unique identifier for the document upload. */
        fun token(): String = token.getRequired("token")

        /** Type of image to upload. */
        @JsonProperty("image_type") @ExcludeMissing fun _imageType() = imageType

        /** Status of document image upload. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Reasons for document image upload status. */
        @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl() = uploadUrl

        /** Globally unique identifier for the document upload. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RequiredDocumentUpload = apply {
            if (!validated) {
                imageType()
                status()
                statusReasons()
                uploadUrl()
                token()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var imageType: JsonField<ImageType> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                this.imageType = requiredDocumentUpload.imageType
                this.status = requiredDocumentUpload.status
                this.statusReasons = requiredDocumentUpload.statusReasons
                this.uploadUrl = requiredDocumentUpload.uploadUrl
                this.token = requiredDocumentUpload.token
                additionalProperties(requiredDocumentUpload.additionalProperties)
            }

            /** Type of image to upload. */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /** Type of image to upload. */
            @JsonProperty("image_type")
            @ExcludeMissing
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            /** Status of document image upload. */
            fun status(status: Status) = status(JsonField.of(status))

            /** Status of document image upload. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reasons for document image upload status. */
            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reasons for document image upload status. */
            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
                this.statusReasons = statusReasons
            }

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
            @JsonProperty("upload_url")
            @ExcludeMissing
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

            /** Globally unique identifier for the document upload. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for the document upload. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

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

            fun build(): RequiredDocumentUpload =
                RequiredDocumentUpload(
                    imageType,
                    status,
                    statusReasons.map { it.toUnmodifiable() },
                    uploadUrl,
                    token,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ImageType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ImageType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FRONT = ImageType(JsonField.of("FRONT"))

                @JvmField val BACK = ImageType(JsonField.of("BACK"))

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
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACCEPTED = Status(JsonField.of("ACCEPTED"))

                @JvmField val REJECTED = Status(JsonField.of("REJECTED"))

                @JvmField val PENDING_UPLOAD = Status(JsonField.of("PENDING_UPLOAD"))

                @JvmField val UPLOADED = Status(JsonField.of("UPLOADED"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
            }

            enum class Value {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    REJECTED -> Value.REJECTED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    REJECTED -> Known.REJECTED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class StatusReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val DOCUMENT_MISSING_REQUIRED_DATA =
                    StatusReason(JsonField.of("DOCUMENT_MISSING_REQUIRED_DATA"))

                @JvmField
                val DOCUMENT_UPLOAD_TOO_BLURRY =
                    StatusReason(JsonField.of("DOCUMENT_UPLOAD_TOO_BLURRY"))

                @JvmField
                val FILE_SIZE_TOO_LARGE = StatusReason(JsonField.of("FILE_SIZE_TOO_LARGE"))

                @JvmField
                val INVALID_DOCUMENT_TYPE = StatusReason(JsonField.of("INVALID_DOCUMENT_TYPE"))

                @JvmField
                val INVALID_DOCUMENT_UPLOAD = StatusReason(JsonField.of("INVALID_DOCUMENT_UPLOAD"))

                @JvmField val UNKNOWN_ERROR = StatusReason(JsonField.of("UNKNOWN_ERROR"))

                @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
            }

            enum class Known {
                DOCUMENT_MISSING_REQUIRED_DATA,
                DOCUMENT_UPLOAD_TOO_BLURRY,
                FILE_SIZE_TOO_LARGE,
                INVALID_DOCUMENT_TYPE,
                INVALID_DOCUMENT_UPLOAD,
                UNKNOWN_ERROR,
            }

            enum class Value {
                DOCUMENT_MISSING_REQUIRED_DATA,
                DOCUMENT_UPLOAD_TOO_BLURRY,
                FILE_SIZE_TOO_LARGE,
                INVALID_DOCUMENT_TYPE,
                INVALID_DOCUMENT_UPLOAD,
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
                    UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                    else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequiredDocumentUpload && this.imageType == other.imageType && this.status == other.status && this.statusReasons == other.statusReasons && this.uploadUrl == other.uploadUrl && this.token == other.token && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(imageType, status, statusReasons, uploadUrl, token, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RequiredDocumentUpload{imageType=$imageType, status=$status, statusReasons=$statusReasons, uploadUrl=$uploadUrl, token=$token, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && this.token == other.token && this.accountHolderToken == other.accountHolderToken && this.documentType == other.documentType && this.entityToken == other.entityToken && this.requiredDocumentUploads == other.requiredDocumentUploads && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, accountHolderToken, documentType, entityToken, requiredDocumentUploads, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Document{token=$token, accountHolderToken=$accountHolderToken, documentType=$documentType, entityToken=$entityToken, requiredDocumentUploads=$requiredDocumentUploads, additionalProperties=$additionalProperties}"
}
