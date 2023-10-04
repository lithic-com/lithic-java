// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** Describes the document and the required document image uploads required to re-run KYC. */
@JsonDeserialize(builder = AccountHolderDocument.Builder::class)
@NoAutoDetect
class AccountHolderDocument
private constructor(
    private val accountHolderToken: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account holder. */
    fun accountHolderToken(): Optional<String> =
        Optional.ofNullable(accountHolderToken.getNullable("account_holder_token"))

    /** Type of documentation to be submitted for verification. */
    fun documentType(): Optional<DocumentType> =
        Optional.ofNullable(documentType.getNullable("document_type"))

    fun requiredDocumentUploads(): Optional<List<RequiredDocumentUpload>> =
        Optional.ofNullable(requiredDocumentUploads.getNullable("required_document_uploads"))

    /** Globally unique identifier for the document. */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** Globally unique identifier for the account holder. */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken() = accountHolderToken

    /** Type of documentation to be submitted for verification. */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads() = requiredDocumentUploads

    /** Globally unique identifier for the document. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolderDocument = apply {
        if (!validated) {
            accountHolderToken()
            documentType()
            requiredDocumentUploads().map { it.forEach { it.validate() } }
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderDocument &&
            this.accountHolderToken == other.accountHolderToken &&
            this.documentType == other.documentType &&
            this.requiredDocumentUploads == other.requiredDocumentUploads &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountHolderToken,
                    documentType,
                    requiredDocumentUploads,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolderDocument{accountHolderToken=$accountHolderToken, documentType=$documentType, requiredDocumentUploads=$requiredDocumentUploads, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountHolderToken: JsonField<String> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> =
            JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderDocument: AccountHolderDocument) = apply {
            this.accountHolderToken = accountHolderDocument.accountHolderToken
            this.documentType = accountHolderDocument.documentType
            this.requiredDocumentUploads = accountHolderDocument.requiredDocumentUploads
            this.token = accountHolderDocument.token
            additionalProperties(accountHolderDocument.additionalProperties)
        }

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

        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply { this.requiredDocumentUploads = requiredDocumentUploads }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the document. */
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

        fun build(): AccountHolderDocument =
            AccountHolderDocument(
                accountHolderToken,
                documentType,
                requiredDocumentUploads.map { it.toUnmodifiable() },
                token,
                additionalProperties.toUnmodifiable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMMERCIAL_LICENSE = DocumentType(JsonField.of("commercial_license"))

            @JvmField val DRIVERS_LICENSE = DocumentType(JsonField.of("drivers_license"))

            @JvmField val PASSPORT = DocumentType(JsonField.of("passport"))

            @JvmField val PASSPORT_CARD = DocumentType(JsonField.of("passport_card"))

            @JvmField val VISA = DocumentType(JsonField.of("visa"))

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        enum class Known {
            COMMERCIAL_LICENSE,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            VISA,
        }

        enum class Value {
            COMMERCIAL_LICENSE,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMERCIAL_LICENSE -> Value.COMMERCIAL_LICENSE
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMERCIAL_LICENSE -> Known.COMMERCIAL_LICENSE
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                VISA -> Known.VISA
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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Type of image to upload. */
        fun imageType(): Optional<ImageType> =
            Optional.ofNullable(imageType.getNullable("image_type"))

        /** Status of document image upload. */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        fun statusReasons(): Optional<List<StatusReason>> =
            Optional.ofNullable(statusReasons.getNullable("status_reasons"))

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        fun uploadUrl(): Optional<String> = Optional.ofNullable(uploadUrl.getNullable("upload_url"))

        /** Type of image to upload. */
        @JsonProperty("image_type") @ExcludeMissing fun _imageType() = imageType

        /** Status of document image upload. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl() = uploadUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RequiredDocumentUpload = apply {
            if (!validated) {
                imageType()
                status()
                statusReasons()
                uploadUrl()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequiredDocumentUpload &&
                this.imageType == other.imageType &&
                this.status == other.status &&
                this.statusReasons == other.statusReasons &&
                this.uploadUrl == other.uploadUrl &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        imageType,
                        status,
                        statusReasons,
                        uploadUrl,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RequiredDocumentUpload{imageType=$imageType, status=$status, statusReasons=$statusReasons, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var imageType: JsonField<ImageType> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                this.imageType = requiredDocumentUpload.imageType
                this.status = requiredDocumentUpload.status
                this.statusReasons = requiredDocumentUpload.statusReasons
                this.uploadUrl = requiredDocumentUpload.uploadUrl
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

            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ImageType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ImageType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BACK = ImageType(JsonField.of("back"))

                @JvmField val FRONT = ImageType(JsonField.of("front"))

                @JvmStatic fun of(value: String) = ImageType(JsonField.of(value))
            }

            enum class Known {
                BACK,
                FRONT,
            }

            enum class Value {
                BACK,
                FRONT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BACK -> Value.BACK
                    FRONT -> Value.FRONT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BACK -> Known.BACK
                    FRONT -> Known.FRONT
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val COMPLETED = Status(JsonField.of("COMPLETED"))

                @JvmField val FAILED = Status(JsonField.of("FAILED"))

                @JvmField val PENDING = Status(JsonField.of("PENDING"))

                @JvmField val UPLOADED = Status(JsonField.of("UPLOADED"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                COMPLETED,
                FAILED,
                PENDING,
                UPLOADED,
            }

            enum class Value {
                COMPLETED,
                FAILED,
                PENDING,
                UPLOADED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    PENDING -> Value.PENDING
                    UPLOADED -> Value.UPLOADED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    PENDING -> Known.PENDING
                    UPLOADED -> Known.UPLOADED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class StatusReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StatusReason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BACK_IMAGE_BLURRY = StatusReason(JsonField.of("BACK_IMAGE_BLURRY"))

                @JvmField
                val FILE_SIZE_TOO_LARGE = StatusReason(JsonField.of("FILE_SIZE_TOO_LARGE"))

                @JvmField val FRONT_IMAGE_BLURRY = StatusReason(JsonField.of("FRONT_IMAGE_BLURRY"))

                @JvmField val FRONT_IMAGE_GLARE = StatusReason(JsonField.of("FRONT_IMAGE_GLARE"))

                @JvmField val INVALID_FILE_TYPE = StatusReason(JsonField.of("INVALID_FILE_TYPE"))

                @JvmField val UNKNOWN_ERROR = StatusReason(JsonField.of("UNKNOWN_ERROR"))

                @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
            }

            enum class Known {
                BACK_IMAGE_BLURRY,
                FILE_SIZE_TOO_LARGE,
                FRONT_IMAGE_BLURRY,
                FRONT_IMAGE_GLARE,
                INVALID_FILE_TYPE,
                UNKNOWN_ERROR,
            }

            enum class Value {
                BACK_IMAGE_BLURRY,
                FILE_SIZE_TOO_LARGE,
                FRONT_IMAGE_BLURRY,
                FRONT_IMAGE_GLARE,
                INVALID_FILE_TYPE,
                UNKNOWN_ERROR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BACK_IMAGE_BLURRY -> Value.BACK_IMAGE_BLURRY
                    FILE_SIZE_TOO_LARGE -> Value.FILE_SIZE_TOO_LARGE
                    FRONT_IMAGE_BLURRY -> Value.FRONT_IMAGE_BLURRY
                    FRONT_IMAGE_GLARE -> Value.FRONT_IMAGE_GLARE
                    INVALID_FILE_TYPE -> Value.INVALID_FILE_TYPE
                    UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BACK_IMAGE_BLURRY -> Known.BACK_IMAGE_BLURRY
                    FILE_SIZE_TOO_LARGE -> Known.FILE_SIZE_TOO_LARGE
                    FRONT_IMAGE_BLURRY -> Known.FRONT_IMAGE_BLURRY
                    FRONT_IMAGE_GLARE -> Known.FRONT_IMAGE_GLARE
                    INVALID_FILE_TYPE -> Known.INVALID_FILE_TYPE
                    UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                    else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
