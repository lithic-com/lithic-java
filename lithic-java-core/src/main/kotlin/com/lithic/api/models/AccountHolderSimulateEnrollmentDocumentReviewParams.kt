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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountHolderSimulateEnrollmentDocumentReviewParams
constructor(
    private val documentUploadToken: String?,
    private val status: Status?,
    private val statusReasons: List<StatusReason>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun documentUploadToken(): Optional<String> = Optional.ofNullable(documentUploadToken)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun statusReasons(): Optional<List<StatusReason>> = Optional.ofNullable(statusReasons)

    @JvmSynthetic
    internal fun getBody(): AccountHolderSimulateEnrollmentDocumentReviewBody {
        return AccountHolderSimulateEnrollmentDocumentReviewBody(
            documentUploadToken,
            status,
            statusReasons,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AccountHolderSimulateEnrollmentDocumentReviewBody.Builder::class)
    @NoAutoDetect
    class AccountHolderSimulateEnrollmentDocumentReviewBody
    internal constructor(
        private val documentUploadToken: String?,
        private val status: Status?,
        private val statusReasons: List<StatusReason>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The account holder document upload which to perform the simulation upon. */
        @JsonProperty("document_upload_token")
        fun documentUploadToken(): String? = documentUploadToken

        /** An account holder document's upload status for use within the simulation. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        @JsonProperty("status_reasons") fun statusReasons(): List<StatusReason>? = statusReasons

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderSimulateEnrollmentDocumentReviewBody &&
                this.documentUploadToken == other.documentUploadToken &&
                this.status == other.status &&
                this.statusReasons == other.statusReasons &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        documentUploadToken,
                        status,
                        statusReasons,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderSimulateEnrollmentDocumentReviewBody{documentUploadToken=$documentUploadToken, status=$status, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var documentUploadToken: String? = null
            private var status: Status? = null
            private var statusReasons: List<StatusReason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountHolderSimulateEnrollmentDocumentReviewBody:
                    AccountHolderSimulateEnrollmentDocumentReviewBody
            ) = apply {
                this.documentUploadToken =
                    accountHolderSimulateEnrollmentDocumentReviewBody.documentUploadToken
                this.status = accountHolderSimulateEnrollmentDocumentReviewBody.status
                this.statusReasons = accountHolderSimulateEnrollmentDocumentReviewBody.statusReasons
                additionalProperties(
                    accountHolderSimulateEnrollmentDocumentReviewBody.additionalProperties
                )
            }

            /** The account holder document upload which to perform the simulation upon. */
            @JsonProperty("document_upload_token")
            fun documentUploadToken(documentUploadToken: String) = apply {
                this.documentUploadToken = documentUploadToken
            }

            /** An account holder document's upload status for use within the simulation. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status.
             */
            @JsonProperty("status_reasons")
            fun statusReasons(statusReasons: List<StatusReason>) = apply {
                this.statusReasons = statusReasons
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

            fun build(): AccountHolderSimulateEnrollmentDocumentReviewBody =
                AccountHolderSimulateEnrollmentDocumentReviewBody(
                    documentUploadToken,
                    status,
                    statusReasons?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderSimulateEnrollmentDocumentReviewParams &&
            this.documentUploadToken == other.documentUploadToken &&
            this.status == other.status &&
            this.statusReasons == other.statusReasons &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            documentUploadToken,
            status,
            statusReasons,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountHolderSimulateEnrollmentDocumentReviewParams{documentUploadToken=$documentUploadToken, status=$status, statusReasons=$statusReasons, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var documentUploadToken: String? = null
        private var status: Status? = null
        private var statusReasons: MutableList<StatusReason> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountHolderSimulateEnrollmentDocumentReviewParams:
                AccountHolderSimulateEnrollmentDocumentReviewParams
        ) = apply {
            this.documentUploadToken =
                accountHolderSimulateEnrollmentDocumentReviewParams.documentUploadToken
            this.status = accountHolderSimulateEnrollmentDocumentReviewParams.status
            this.statusReasons(
                accountHolderSimulateEnrollmentDocumentReviewParams.statusReasons ?: listOf()
            )
            additionalQueryParams(
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalQueryParams
            )
            additionalHeaders(accountHolderSimulateEnrollmentDocumentReviewParams.additionalHeaders)
            additionalBodyProperties(
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalBodyProperties
            )
        }

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(documentUploadToken: String) = apply {
            this.documentUploadToken = documentUploadToken
        }

        /** An account holder document's upload status for use within the simulation. */
        fun status(status: Status) = apply { this.status = status }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun statusReasons(statusReasons: List<StatusReason>) = apply {
            this.statusReasons.clear()
            this.statusReasons.addAll(statusReasons)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun addStatusReason(statusReason: StatusReason) = apply {
            this.statusReasons.add(statusReason)
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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountHolderSimulateEnrollmentDocumentReviewParams =
            AccountHolderSimulateEnrollmentDocumentReviewParams(
                documentUploadToken,
                status,
                if (statusReasons.size == 0) null else statusReasons.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val UPLOADED = Status(JsonField.of("UPLOADED"))

            @JvmField val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            @JvmField val REJECTED = Status(JsonField.of("REJECTED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            UPLOADED,
            ACCEPTED,
            REJECTED,
        }

        enum class Value {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UPLOADED -> Value.UPLOADED
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UPLOADED -> Known.UPLOADED
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
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

            return other is StatusReason && this.value == other.value
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
            val INVALID_DOCUMENT_TYPE = StatusReason(JsonField.of("INVALID_DOCUMENT_TYPE"))

            @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
        }

        enum class Known {
            DOCUMENT_MISSING_REQUIRED_DATA,
            DOCUMENT_UPLOAD_TOO_BLURRY,
            INVALID_DOCUMENT_TYPE,
        }

        enum class Value {
            DOCUMENT_MISSING_REQUIRED_DATA,
            DOCUMENT_UPLOAD_TOO_BLURRY,
            INVALID_DOCUMENT_TYPE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DOCUMENT_MISSING_REQUIRED_DATA -> Value.DOCUMENT_MISSING_REQUIRED_DATA
                DOCUMENT_UPLOAD_TOO_BLURRY -> Value.DOCUMENT_UPLOAD_TOO_BLURRY
                INVALID_DOCUMENT_TYPE -> Value.INVALID_DOCUMENT_TYPE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DOCUMENT_MISSING_REQUIRED_DATA -> Known.DOCUMENT_MISSING_REQUIRED_DATA
                DOCUMENT_UPLOAD_TOO_BLURRY -> Known.DOCUMENT_UPLOAD_TOO_BLURRY
                INVALID_DOCUMENT_TYPE -> Known.INVALID_DOCUMENT_TYPE
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
