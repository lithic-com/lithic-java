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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Dispute evidence. */
@JsonDeserialize(builder = DisputeEvidence.Builder::class)
@NoAutoDetect
class DisputeEvidence
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val disputeToken: JsonField<String>,
    private val downloadUrl: JsonField<String>,
    private val filename: JsonField<String>,
    private val token: JsonField<String>,
    private val uploadStatus: JsonField<UploadStatus>,
    private val uploadUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Timestamp of when dispute evidence was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Dispute token evidence is attached to. */
    fun disputeToken(): String = disputeToken.getRequired("dispute_token")

    /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
    fun downloadUrl(): Optional<String> =
        Optional.ofNullable(downloadUrl.getNullable("download_url"))

    /**
     * File name of evidence. Recommended to give the dispute evidence a human-readable identifier.
     */
    fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * Upload status types:
     * - `DELETED` - Evidence was deleted.
     * - `ERROR` - Evidence upload failed.
     * - `PENDING` - Evidence is pending upload.
     * - `REJECTED` - Evidence was rejected.
     * - `UPLOADED` - Evidence was uploaded.
     */
    fun uploadStatus(): UploadStatus = uploadStatus.getRequired("upload_status")

    /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
    fun uploadUrl(): Optional<String> = Optional.ofNullable(uploadUrl.getNullable("upload_url"))

    /** Timestamp of when dispute evidence was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Dispute token evidence is attached to. */
    @JsonProperty("dispute_token") @ExcludeMissing fun _disputeToken() = disputeToken

    /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
    @JsonProperty("download_url") @ExcludeMissing fun _downloadUrl() = downloadUrl

    /**
     * File name of evidence. Recommended to give the dispute evidence a human-readable identifier.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename() = filename

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Upload status types:
     * - `DELETED` - Evidence was deleted.
     * - `ERROR` - Evidence upload failed.
     * - `PENDING` - Evidence is pending upload.
     * - `REJECTED` - Evidence was rejected.
     * - `UPLOADED` - Evidence was uploaded.
     */
    @JsonProperty("upload_status") @ExcludeMissing fun _uploadStatus() = uploadStatus

    /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl() = uploadUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DisputeEvidence = apply {
        if (!validated) {
            created()
            disputeToken()
            downloadUrl()
            filename()
            token()
            uploadStatus()
            uploadUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeEvidence &&
            this.created == other.created &&
            this.disputeToken == other.disputeToken &&
            this.downloadUrl == other.downloadUrl &&
            this.filename == other.filename &&
            this.token == other.token &&
            this.uploadStatus == other.uploadStatus &&
            this.uploadUrl == other.uploadUrl &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    created,
                    disputeToken,
                    downloadUrl,
                    filename,
                    token,
                    uploadStatus,
                    uploadUrl,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DisputeEvidence{created=$created, disputeToken=$disputeToken, downloadUrl=$downloadUrl, filename=$filename, token=$token, uploadStatus=$uploadStatus, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var disputeToken: JsonField<String> = JsonMissing.of()
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var uploadStatus: JsonField<UploadStatus> = JsonMissing.of()
        private var uploadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeEvidence: DisputeEvidence) = apply {
            this.created = disputeEvidence.created
            this.disputeToken = disputeEvidence.disputeToken
            this.downloadUrl = disputeEvidence.downloadUrl
            this.filename = disputeEvidence.filename
            this.token = disputeEvidence.token
            this.uploadStatus = disputeEvidence.uploadStatus
            this.uploadUrl = disputeEvidence.uploadUrl
            additionalProperties(disputeEvidence.additionalProperties)
        }

        /** Timestamp of when dispute evidence was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when dispute evidence was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Dispute token evidence is attached to. */
        fun disputeToken(disputeToken: String) = disputeToken(JsonField.of(disputeToken))

        /** Dispute token evidence is attached to. */
        @JsonProperty("dispute_token")
        @ExcludeMissing
        fun disputeToken(disputeToken: JsonField<String>) = apply {
            this.disputeToken = disputeToken
        }

        /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
        @JsonProperty("download_url")
        @ExcludeMissing
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /**
         * File name of evidence. Recommended to give the dispute evidence a human-readable
         * identifier.
         */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * File name of evidence. Recommended to give the dispute evidence a human-readable
         * identifier.
         */
        @JsonProperty("filename")
        @ExcludeMissing
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Upload status types:
         * - `DELETED` - Evidence was deleted.
         * - `ERROR` - Evidence upload failed.
         * - `PENDING` - Evidence is pending upload.
         * - `REJECTED` - Evidence was rejected.
         * - `UPLOADED` - Evidence was uploaded.
         */
        fun uploadStatus(uploadStatus: UploadStatus) = uploadStatus(JsonField.of(uploadStatus))

        /**
         * Upload status types:
         * - `DELETED` - Evidence was deleted.
         * - `ERROR` - Evidence upload failed.
         * - `PENDING` - Evidence is pending upload.
         * - `REJECTED` - Evidence was rejected.
         * - `UPLOADED` - Evidence was uploaded.
         */
        @JsonProperty("upload_status")
        @ExcludeMissing
        fun uploadStatus(uploadStatus: JsonField<UploadStatus>) = apply {
            this.uploadStatus = uploadStatus
        }

        /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
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

        fun build(): DisputeEvidence =
            DisputeEvidence(
                created,
                disputeToken,
                downloadUrl,
                filename,
                token,
                uploadStatus,
                uploadUrl,
                additionalProperties.toUnmodifiable(),
            )
    }

    class UploadStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UploadStatus && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DELETED = UploadStatus(JsonField.of("DELETED"))

            @JvmField val ERROR = UploadStatus(JsonField.of("ERROR"))

            @JvmField val PENDING = UploadStatus(JsonField.of("PENDING"))

            @JvmField val REJECTED = UploadStatus(JsonField.of("REJECTED"))

            @JvmField val UPLOADED = UploadStatus(JsonField.of("UPLOADED"))

            @JvmStatic fun of(value: String) = UploadStatus(JsonField.of(value))
        }

        enum class Known {
            DELETED,
            ERROR,
            PENDING,
            REJECTED,
            UPLOADED,
        }

        enum class Value {
            DELETED,
            ERROR,
            PENDING,
            REJECTED,
            UPLOADED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DELETED -> Value.DELETED
                ERROR -> Value.ERROR
                PENDING -> Value.PENDING
                REJECTED -> Value.REJECTED
                UPLOADED -> Value.UPLOADED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DELETED -> Known.DELETED
                ERROR -> Known.ERROR
                PENDING -> Known.PENDING
                REJECTED -> Known.REJECTED
                UPLOADED -> Known.UPLOADED
                else -> throw LithicInvalidDataException("Unknown UploadStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
