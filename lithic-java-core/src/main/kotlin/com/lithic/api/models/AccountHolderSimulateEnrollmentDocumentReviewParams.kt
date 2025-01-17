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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** Simulates a review for an account holder document upload. */
class AccountHolderSimulateEnrollmentDocumentReviewParams
constructor(
    private val body: AccountHolderSimulateEnrollmentDocumentReviewBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The account holder document upload which to perform the simulation upon. */
    fun documentUploadToken(): String = body.documentUploadToken()

    /** An account holder document's upload status for use within the simulation. */
    fun status(): Status = body.status()

    /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
    fun acceptedEntityStatusReasons(): Optional<List<String>> = body.acceptedEntityStatusReasons()

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status or `PARTIAL_APPROVAL` status.
     */
    fun statusReason(): Optional<DocumentUploadStatusReasons> = body.statusReason()

    /** The account holder document upload which to perform the simulation upon. */
    fun _documentUploadToken(): JsonField<String> = body._documentUploadToken()

    /** An account holder document's upload status for use within the simulation. */
    fun _status(): JsonField<Status> = body._status()

    /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
    fun _acceptedEntityStatusReasons(): JsonField<List<String>> =
        body._acceptedEntityStatusReasons()

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status or `PARTIAL_APPROVAL` status.
     */
    fun _statusReason(): JsonField<DocumentUploadStatusReasons> = body._statusReason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AccountHolderSimulateEnrollmentDocumentReviewBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccountHolderSimulateEnrollmentDocumentReviewBody
    @JsonCreator
    internal constructor(
        @JsonProperty("document_upload_token")
        @ExcludeMissing
        private val documentUploadToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        private val acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status_reason")
        @ExcludeMissing
        private val statusReason: JsonField<DocumentUploadStatusReasons> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(): String = documentUploadToken.getRequired("document_upload_token")

        /** An account holder document's upload status for use within the simulation. */
        fun status(): Status = status.getRequired("status")

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun acceptedEntityStatusReasons(): Optional<List<String>> =
            Optional.ofNullable(
                acceptedEntityStatusReasons.getNullable("accepted_entity_status_reasons")
            )

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        fun statusReason(): Optional<DocumentUploadStatusReasons> =
            Optional.ofNullable(statusReason.getNullable("status_reason"))

        /** The account holder document upload which to perform the simulation upon. */
        @JsonProperty("document_upload_token")
        @ExcludeMissing
        fun _documentUploadToken(): JsonField<String> = documentUploadToken

        /** An account holder document's upload status for use within the simulation. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        fun _acceptedEntityStatusReasons(): JsonField<List<String>> = acceptedEntityStatusReasons

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        @JsonProperty("status_reason")
        @ExcludeMissing
        fun _statusReason(): JsonField<DocumentUploadStatusReasons> = statusReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountHolderSimulateEnrollmentDocumentReviewBody = apply {
            if (validated) {
                return@apply
            }

            documentUploadToken()
            status()
            acceptedEntityStatusReasons()
            statusReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var documentUploadToken: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var acceptedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var statusReason: JsonField<DocumentUploadStatusReasons> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountHolderSimulateEnrollmentDocumentReviewBody:
                    AccountHolderSimulateEnrollmentDocumentReviewBody
            ) = apply {
                documentUploadToken =
                    accountHolderSimulateEnrollmentDocumentReviewBody.documentUploadToken
                status = accountHolderSimulateEnrollmentDocumentReviewBody.status
                acceptedEntityStatusReasons =
                    accountHolderSimulateEnrollmentDocumentReviewBody.acceptedEntityStatusReasons
                        .map { it.toMutableList() }
                statusReason = accountHolderSimulateEnrollmentDocumentReviewBody.statusReason
                additionalProperties =
                    accountHolderSimulateEnrollmentDocumentReviewBody.additionalProperties
                        .toMutableMap()
            }

            /** The account holder document upload which to perform the simulation upon. */
            fun documentUploadToken(documentUploadToken: String) =
                documentUploadToken(JsonField.of(documentUploadToken))

            /** The account holder document upload which to perform the simulation upon. */
            fun documentUploadToken(documentUploadToken: JsonField<String>) = apply {
                this.documentUploadToken = documentUploadToken
            }

            /** An account holder document's upload status for use within the simulation. */
            fun status(status: Status) = status(JsonField.of(status))

            /** An account holder document's upload status for use within the simulation. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) =
                acceptedEntityStatusReasons(JsonField.of(acceptedEntityStatusReasons))

            /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.acceptedEntityStatusReasons =
                        acceptedEntityStatusReasons.map { it.toMutableList() }
                }

            /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
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

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
             */
            fun statusReason(statusReason: DocumentUploadStatusReasons) =
                statusReason(JsonField.of(statusReason))

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
             */
            fun statusReason(statusReason: JsonField<DocumentUploadStatusReasons>) = apply {
                this.statusReason = statusReason
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

            fun build(): AccountHolderSimulateEnrollmentDocumentReviewBody =
                AccountHolderSimulateEnrollmentDocumentReviewBody(
                    checkRequired("documentUploadToken", documentUploadToken),
                    checkRequired("status", status),
                    (acceptedEntityStatusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    statusReason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderSimulateEnrollmentDocumentReviewBody && documentUploadToken == other.documentUploadToken && status == other.status && acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && statusReason == other.statusReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentUploadToken, status, acceptedEntityStatusReasons, statusReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderSimulateEnrollmentDocumentReviewBody{documentUploadToken=$documentUploadToken, status=$status, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, statusReason=$statusReason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AccountHolderSimulateEnrollmentDocumentReviewBody.Builder =
            AccountHolderSimulateEnrollmentDocumentReviewBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            accountHolderSimulateEnrollmentDocumentReviewParams:
                AccountHolderSimulateEnrollmentDocumentReviewParams
        ) = apply {
            body = accountHolderSimulateEnrollmentDocumentReviewParams.body.toBuilder()
            additionalHeaders =
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalQueryParams
                    .toBuilder()
        }

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(documentUploadToken: String) = apply {
            body.documentUploadToken(documentUploadToken)
        }

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(documentUploadToken: JsonField<String>) = apply {
            body.documentUploadToken(documentUploadToken)
        }

        /** An account holder document's upload status for use within the simulation. */
        fun status(status: Status) = apply { body.status(status) }

        /** An account holder document's upload status for use within the simulation. */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) = apply {
            body.acceptedEntityStatusReasons(acceptedEntityStatusReasons)
        }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
            apply {
                body.acceptedEntityStatusReasons(acceptedEntityStatusReasons)
            }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
            body.addAcceptedEntityStatusReason(acceptedEntityStatusReason)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        fun statusReason(statusReason: DocumentUploadStatusReasons) = apply {
            body.statusReason(statusReason)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        fun statusReason(statusReason: JsonField<DocumentUploadStatusReasons>) = apply {
            body.statusReason(statusReason)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): AccountHolderSimulateEnrollmentDocumentReviewParams =
            AccountHolderSimulateEnrollmentDocumentReviewParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** An account holder document's upload status for use within the simulation. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val UPLOADED = of("UPLOADED")

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val PARTIAL_APPROVAL = of("PARTIAL_APPROVAL")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
        }

        enum class Value {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UPLOADED -> Value.UPLOADED
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UPLOADED -> Known.UPLOADED
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
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

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status or `PARTIAL_APPROVAL` status.
     */
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
            val DOCUMENT_ISSUED_GREATER_THAN_30_DAYS = of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS")

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
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS -> Value.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
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
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS -> Known.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                DOCUMENT_TYPE_NOT_SUPPORTED -> Known.DOCUMENT_TYPE_NOT_SUPPORTED
                UNKNOWN_FAILURE_REASON -> Known.UNKNOWN_FAILURE_REASON
                UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                else ->
                    throw LithicInvalidDataException("Unknown DocumentUploadStatusReasons: $value")
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

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentDocumentReviewParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderSimulateEnrollmentDocumentReviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
