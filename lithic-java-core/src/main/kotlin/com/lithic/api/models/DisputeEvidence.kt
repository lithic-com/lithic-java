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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Dispute evidence. */
@NoAutoDetect
class DisputeEvidence
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dispute_token")
    @ExcludeMissing
    private val disputeToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("upload_status")
    @ExcludeMissing
    private val uploadStatus: JsonField<UploadStatus> = JsonMissing.of(),
    @JsonProperty("download_url")
    @ExcludeMissing
    private val downloadUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("filename")
    @ExcludeMissing
    private val filename: JsonField<String> = JsonMissing.of(),
    @JsonProperty("upload_url")
    @ExcludeMissing
    private val uploadUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Timestamp of when dispute evidence was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Dispute token evidence is attached to. */
    fun disputeToken(): String = disputeToken.getRequired("dispute_token")

    /**
     * Upload status types:
     * - `DELETED` - Evidence was deleted.
     * - `ERROR` - Evidence upload failed.
     * - `PENDING` - Evidence is pending upload.
     * - `REJECTED` - Evidence was rejected.
     * - `UPLOADED` - Evidence was uploaded.
     */
    fun uploadStatus(): UploadStatus = uploadStatus.getRequired("upload_status")

    /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
    fun downloadUrl(): Optional<String> =
        Optional.ofNullable(downloadUrl.getNullable("download_url"))

    /**
     * File name of evidence. Recommended to give the dispute evidence a human-readable identifier.
     */
    fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

    /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
    fun uploadUrl(): Optional<String> = Optional.ofNullable(uploadUrl.getNullable("upload_url"))

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Timestamp of when dispute evidence was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Dispute token evidence is attached to. */
    @JsonProperty("dispute_token")
    @ExcludeMissing
    fun _disputeToken(): JsonField<String> = disputeToken

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
    fun _uploadStatus(): JsonField<UploadStatus> = uploadStatus

    /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * File name of evidence. Recommended to give the dispute evidence a human-readable identifier.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DisputeEvidence = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        disputeToken()
        uploadStatus()
        downloadUrl()
        filename()
        uploadUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var disputeToken: JsonField<String>? = null
        private var uploadStatus: JsonField<UploadStatus>? = null
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var uploadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeEvidence: DisputeEvidence) = apply {
            token = disputeEvidence.token
            created = disputeEvidence.created
            disputeToken = disputeEvidence.disputeToken
            uploadStatus = disputeEvidence.uploadStatus
            downloadUrl = disputeEvidence.downloadUrl
            filename = disputeEvidence.filename
            uploadUrl = disputeEvidence.uploadUrl
            additionalProperties = disputeEvidence.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when dispute evidence was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when dispute evidence was created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Dispute token evidence is attached to. */
        fun disputeToken(disputeToken: String) = disputeToken(JsonField.of(disputeToken))

        /** Dispute token evidence is attached to. */
        fun disputeToken(disputeToken: JsonField<String>) = apply {
            this.disputeToken = disputeToken
        }

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
        fun uploadStatus(uploadStatus: JsonField<UploadStatus>) = apply {
            this.uploadStatus = uploadStatus
        }

        /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /** URL to download evidence. Only shown when `upload_status` is `UPLOADED`. */
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
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        /** URL to upload evidence. Only shown when `upload_status` is `PENDING`. */
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

        fun build(): DisputeEvidence =
            DisputeEvidence(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("disputeToken", disputeToken),
                checkRequired("uploadStatus", uploadStatus),
                downloadUrl,
                filename,
                uploadUrl,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Upload status types:
     * - `DELETED` - Evidence was deleted.
     * - `ERROR` - Evidence upload failed.
     * - `PENDING` - Evidence is pending upload.
     * - `REJECTED` - Evidence was rejected.
     * - `UPLOADED` - Evidence was uploaded.
     */
    class UploadStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DELETED = of("DELETED")

            @JvmField val ERROR = of("ERROR")

            @JvmField val PENDING = of("PENDING")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val UPLOADED = of("UPLOADED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UploadStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeEvidence && token == other.token && created == other.created && disputeToken == other.disputeToken && uploadStatus == other.uploadStatus && downloadUrl == other.downloadUrl && filename == other.filename && uploadUrl == other.uploadUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, disputeToken, uploadStatus, downloadUrl, filename, uploadUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DisputeEvidence{token=$token, created=$created, disputeToken=$disputeToken, uploadStatus=$uploadStatus, downloadUrl=$downloadUrl, filename=$filename, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
}
