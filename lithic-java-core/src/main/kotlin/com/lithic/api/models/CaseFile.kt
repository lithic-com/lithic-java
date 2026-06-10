// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A file attached to a case. Status-dependent fields are always present but may be `null`:
 * - `upload_url`, `upload_url_expires`, and `upload_constraints` are populated when `status` is
 *   `PENDING` or `REJECTED`
 * - `download_url` and `download_url_expires` are populated when `status` is `READY`
 * - `failure_reason` is populated when `status` is `REJECTED`
 */
class CaseFile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val downloadUrl: JsonField<String>,
    private val downloadUrlExpires: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<String>,
    private val mimeType: JsonField<String>,
    private val name: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val status: JsonField<FileStatus>,
    private val updated: JsonField<OffsetDateTime>,
    private val uploadConstraints: JsonField<UploadConstraints>,
    private val uploadUrl: JsonField<String>,
    private val uploadUrlExpires: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("download_url_expires")
        @ExcludeMissing
        downloadUrlExpires: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mime_type") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<FileStatus> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("upload_constraints")
        @ExcludeMissing
        uploadConstraints: JsonField<UploadConstraints> = JsonMissing.of(),
        @JsonProperty("upload_url") @ExcludeMissing uploadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upload_url_expires")
        @ExcludeMissing
        uploadUrlExpires: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        created,
        downloadUrl,
        downloadUrlExpires,
        failureReason,
        mimeType,
        name,
        sizeBytes,
        status,
        updated,
        uploadConstraints,
        uploadUrl,
        uploadUrlExpires,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the file
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Date and time at which the file record was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Presigned URL the client uses to download the file
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<String> = downloadUrl.getOptional("download_url")

    /**
     * Date and time at which the download URL expires
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrlExpires(): Optional<OffsetDateTime> =
        downloadUrlExpires.getOptional("download_url_expires")

    /**
     * Reason the file was rejected, when applicable
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failure_reason")

    /**
     * MIME type of the file, available once the file is ready
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimeType(): Optional<String> = mimeType.getOptional("mime_type")

    /**
     * Name of the file
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Size of the file in bytes, available once the file is ready
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

    /**
     * Lifecycle status of a case file:
     * - `PENDING` - An upload URL has been issued and the file is awaiting upload
     * - `READY` - The file has been uploaded and validated; a download URL is available
     * - `REJECTED` - File validation failed; see `failure_reason` for details
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): FileStatus = status.getRequired("status")

    /**
     * Date and time at which the file record was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Constraints applied to a file upload, returned alongside the upload URL so clients can
     * validate before uploading
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadConstraints(): Optional<UploadConstraints> =
        uploadConstraints.getOptional("upload_constraints")

    /**
     * Presigned URL the client uses to upload the file
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadUrl(): Optional<String> = uploadUrl.getOptional("upload_url")

    /**
     * Date and time at which the upload URL expires
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadUrlExpires(): Optional<OffsetDateTime> =
        uploadUrlExpires.getOptional("upload_url_expires")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [downloadUrlExpires].
     *
     * Unlike [downloadUrlExpires], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("download_url_expires")
    @ExcludeMissing
    fun _downloadUrlExpires(): JsonField<OffsetDateTime> = downloadUrlExpires

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<FileStatus> = status

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [uploadConstraints].
     *
     * Unlike [uploadConstraints], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upload_constraints")
    @ExcludeMissing
    fun _uploadConstraints(): JsonField<UploadConstraints> = uploadConstraints

    /**
     * Returns the raw JSON value of [uploadUrl].
     *
     * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

    /**
     * Returns the raw JSON value of [uploadUrlExpires].
     *
     * Unlike [uploadUrlExpires], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upload_url_expires")
    @ExcludeMissing
    fun _uploadUrlExpires(): JsonField<OffsetDateTime> = uploadUrlExpires

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
         * Returns a mutable builder for constructing an instance of [CaseFile].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .downloadUrl()
         * .downloadUrlExpires()
         * .failureReason()
         * .mimeType()
         * .name()
         * .sizeBytes()
         * .status()
         * .updated()
         * .uploadConstraints()
         * .uploadUrl()
         * .uploadUrlExpires()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CaseFile]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var downloadUrl: JsonField<String>? = null
        private var downloadUrlExpires: JsonField<OffsetDateTime>? = null
        private var failureReason: JsonField<String>? = null
        private var mimeType: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var sizeBytes: JsonField<Long>? = null
        private var status: JsonField<FileStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var uploadConstraints: JsonField<UploadConstraints>? = null
        private var uploadUrl: JsonField<String>? = null
        private var uploadUrlExpires: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(caseFile: CaseFile) = apply {
            token = caseFile.token
            created = caseFile.created
            downloadUrl = caseFile.downloadUrl
            downloadUrlExpires = caseFile.downloadUrlExpires
            failureReason = caseFile.failureReason
            mimeType = caseFile.mimeType
            name = caseFile.name
            sizeBytes = caseFile.sizeBytes
            status = caseFile.status
            updated = caseFile.updated
            uploadConstraints = caseFile.uploadConstraints
            uploadUrl = caseFile.uploadUrl
            uploadUrlExpires = caseFile.uploadUrlExpires
            additionalProperties = caseFile.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the file */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time at which the file record was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Presigned URL the client uses to download the file */
        fun downloadUrl(downloadUrl: String?) = downloadUrl(JsonField.ofNullable(downloadUrl))

        /** Alias for calling [Builder.downloadUrl] with `downloadUrl.orElse(null)`. */
        fun downloadUrl(downloadUrl: Optional<String>) = downloadUrl(downloadUrl.getOrNull())

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** Date and time at which the download URL expires */
        fun downloadUrlExpires(downloadUrlExpires: OffsetDateTime?) =
            downloadUrlExpires(JsonField.ofNullable(downloadUrlExpires))

        /**
         * Alias for calling [Builder.downloadUrlExpires] with `downloadUrlExpires.orElse(null)`.
         */
        fun downloadUrlExpires(downloadUrlExpires: Optional<OffsetDateTime>) =
            downloadUrlExpires(downloadUrlExpires.getOrNull())

        /**
         * Sets [Builder.downloadUrlExpires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrlExpires] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun downloadUrlExpires(downloadUrlExpires: JsonField<OffsetDateTime>) = apply {
            this.downloadUrlExpires = downloadUrlExpires
        }

        /** Reason the file was rejected, when applicable */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /** Alias for calling [Builder.failureReason] with `failureReason.orElse(null)`. */
        fun failureReason(failureReason: Optional<String>) =
            failureReason(failureReason.getOrNull())

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** MIME type of the file, available once the file is ready */
        fun mimeType(mimeType: String?) = mimeType(JsonField.ofNullable(mimeType))

        /** Alias for calling [Builder.mimeType] with `mimeType.orElse(null)`. */
        fun mimeType(mimeType: Optional<String>) = mimeType(mimeType.getOrNull())

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /** Name of the file */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Size of the file in bytes, available once the file is ready */
        fun sizeBytes(sizeBytes: Long?) = sizeBytes(JsonField.ofNullable(sizeBytes))

        /**
         * Alias for [Builder.sizeBytes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sizeBytes(sizeBytes: Long) = sizeBytes(sizeBytes as Long?)

        /** Alias for calling [Builder.sizeBytes] with `sizeBytes.orElse(null)`. */
        fun sizeBytes(sizeBytes: Optional<Long>) = sizeBytes(sizeBytes.getOrNull())

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        /**
         * Lifecycle status of a case file:
         * - `PENDING` - An upload URL has been issued and the file is awaiting upload
         * - `READY` - The file has been uploaded and validated; a download URL is available
         * - `REJECTED` - File validation failed; see `failure_reason` for details
         */
        fun status(status: FileStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [FileStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<FileStatus>) = apply { this.status = status }

        /** Date and time at which the file record was last updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /**
         * Constraints applied to a file upload, returned alongside the upload URL so clients can
         * validate before uploading
         */
        fun uploadConstraints(uploadConstraints: UploadConstraints?) =
            uploadConstraints(JsonField.ofNullable(uploadConstraints))

        /** Alias for calling [Builder.uploadConstraints] with `uploadConstraints.orElse(null)`. */
        fun uploadConstraints(uploadConstraints: Optional<UploadConstraints>) =
            uploadConstraints(uploadConstraints.getOrNull())

        /**
         * Sets [Builder.uploadConstraints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadConstraints] with a well-typed [UploadConstraints]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun uploadConstraints(uploadConstraints: JsonField<UploadConstraints>) = apply {
            this.uploadConstraints = uploadConstraints
        }

        /** Presigned URL the client uses to upload the file */
        fun uploadUrl(uploadUrl: String?) = uploadUrl(JsonField.ofNullable(uploadUrl))

        /** Alias for calling [Builder.uploadUrl] with `uploadUrl.orElse(null)`. */
        fun uploadUrl(uploadUrl: Optional<String>) = uploadUrl(uploadUrl.getOrNull())

        /**
         * Sets [Builder.uploadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

        /** Date and time at which the upload URL expires */
        fun uploadUrlExpires(uploadUrlExpires: OffsetDateTime?) =
            uploadUrlExpires(JsonField.ofNullable(uploadUrlExpires))

        /** Alias for calling [Builder.uploadUrlExpires] with `uploadUrlExpires.orElse(null)`. */
        fun uploadUrlExpires(uploadUrlExpires: Optional<OffsetDateTime>) =
            uploadUrlExpires(uploadUrlExpires.getOrNull())

        /**
         * Sets [Builder.uploadUrlExpires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrlExpires] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun uploadUrlExpires(uploadUrlExpires: JsonField<OffsetDateTime>) = apply {
            this.uploadUrlExpires = uploadUrlExpires
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

        /**
         * Returns an immutable instance of [CaseFile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .downloadUrl()
         * .downloadUrlExpires()
         * .failureReason()
         * .mimeType()
         * .name()
         * .sizeBytes()
         * .status()
         * .updated()
         * .uploadConstraints()
         * .uploadUrl()
         * .uploadUrlExpires()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CaseFile =
            CaseFile(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("downloadUrl", downloadUrl),
                checkRequired("downloadUrlExpires", downloadUrlExpires),
                checkRequired("failureReason", failureReason),
                checkRequired("mimeType", mimeType),
                checkRequired("name", name),
                checkRequired("sizeBytes", sizeBytes),
                checkRequired("status", status),
                checkRequired("updated", updated),
                checkRequired("uploadConstraints", uploadConstraints),
                checkRequired("uploadUrl", uploadUrl),
                checkRequired("uploadUrlExpires", uploadUrlExpires),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CaseFile = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        downloadUrl()
        downloadUrlExpires()
        failureReason()
        mimeType()
        name()
        sizeBytes()
        status().validate()
        updated()
        uploadConstraints().ifPresent { it.validate() }
        uploadUrl()
        uploadUrlExpires()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
            (if (downloadUrlExpires.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (uploadConstraints.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uploadUrl.asKnown().isPresent) 1 else 0) +
            (if (uploadUrlExpires.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseFile &&
            token == other.token &&
            created == other.created &&
            downloadUrl == other.downloadUrl &&
            downloadUrlExpires == other.downloadUrlExpires &&
            failureReason == other.failureReason &&
            mimeType == other.mimeType &&
            name == other.name &&
            sizeBytes == other.sizeBytes &&
            status == other.status &&
            updated == other.updated &&
            uploadConstraints == other.uploadConstraints &&
            uploadUrl == other.uploadUrl &&
            uploadUrlExpires == other.uploadUrlExpires &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            created,
            downloadUrl,
            downloadUrlExpires,
            failureReason,
            mimeType,
            name,
            sizeBytes,
            status,
            updated,
            uploadConstraints,
            uploadUrl,
            uploadUrlExpires,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CaseFile{token=$token, created=$created, downloadUrl=$downloadUrl, downloadUrlExpires=$downloadUrlExpires, failureReason=$failureReason, mimeType=$mimeType, name=$name, sizeBytes=$sizeBytes, status=$status, updated=$updated, uploadConstraints=$uploadConstraints, uploadUrl=$uploadUrl, uploadUrlExpires=$uploadUrlExpires, additionalProperties=$additionalProperties}"
}
