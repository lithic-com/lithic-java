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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ClaimDocumentAcceptedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val downloadUrl: JsonField<String>,
    private val downloadUrlExpiresAt: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val failureReason: JsonField<FailureReason>,
    private val name: JsonField<String>,
    private val requirementId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updated: JsonField<OffsetDateTime>,
    private val uploadConstraints: JsonField<UploadConstraints2>,
    private val uploadUrl: JsonField<String>,
    private val uploadUrlExpiresAt: JsonField<OffsetDateTime>,
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
        @JsonProperty("download_url_expires_at")
        @ExcludeMissing
        downloadUrlExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<FailureReason> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirement_id")
        @ExcludeMissing
        requirementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("upload_constraints")
        @ExcludeMissing
        uploadConstraints: JsonField<UploadConstraints2> = JsonMissing.of(),
        @JsonProperty("upload_url") @ExcludeMissing uploadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upload_url_expires_at")
        @ExcludeMissing
        uploadUrlExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        created,
        downloadUrl,
        downloadUrlExpiresAt,
        eventType,
        failureReason,
        name,
        requirementId,
        status,
        updated,
        uploadConstraints,
        uploadUrl,
        uploadUrlExpiresAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the document, in UUID format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * When the document was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Presigned URL for downloading the uploaded document. Available once the document is being
     * validated or has been accepted (`VALIDATING` or `ACCEPTED`)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<String> = downloadUrl.getOptional("download_url")

    /**
     * When the download URL expires
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrlExpiresAt(): Optional<OffsetDateTime> =
        downloadUrlExpiresAt.getOptional("download_url_expires_at")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Reason the document failed validation. Null unless `status` is `REJECTED`
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<FailureReason> = failureReason.getOptional("failure_reason")

    /**
     * Name provided when the upload intent was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Identifier of the document requirement this document satisfies. Null for supplemental
     * documents not tied to a specific requirement
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

    /**
     * Current validation status of the document
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the document was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Constraints that an uploaded file must satisfy.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadConstraints(): Optional<UploadConstraints2> =
        uploadConstraints.getOptional("upload_constraints")

    /**
     * Presigned URL for uploading the file via HTTP PUT. Null after the upload window expires or
     * after the document has been validated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadUrl(): Optional<String> = uploadUrl.getOptional("upload_url")

    /**
     * When the upload URL expires
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadUrlExpiresAt(): Optional<OffsetDateTime> =
        uploadUrlExpiresAt.getOptional("upload_url_expires_at")

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
     * Returns the raw JSON value of [downloadUrlExpiresAt].
     *
     * Unlike [downloadUrlExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("download_url_expires_at")
    @ExcludeMissing
    fun _downloadUrlExpiresAt(): JsonField<OffsetDateTime> = downloadUrlExpiresAt

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<FailureReason> = failureReason

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [requirementId].
     *
     * Unlike [requirementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirement_id")
    @ExcludeMissing
    fun _requirementId(): JsonField<String> = requirementId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
    fun _uploadConstraints(): JsonField<UploadConstraints2> = uploadConstraints

    /**
     * Returns the raw JSON value of [uploadUrl].
     *
     * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

    /**
     * Returns the raw JSON value of [uploadUrlExpiresAt].
     *
     * Unlike [uploadUrlExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upload_url_expires_at")
    @ExcludeMissing
    fun _uploadUrlExpiresAt(): JsonField<OffsetDateTime> = uploadUrlExpiresAt

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
         * [ClaimDocumentAcceptedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .downloadUrl()
         * .downloadUrlExpiresAt()
         * .eventType()
         * .failureReason()
         * .name()
         * .requirementId()
         * .status()
         * .updated()
         * .uploadConstraints()
         * .uploadUrl()
         * .uploadUrlExpiresAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClaimDocumentAcceptedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var downloadUrl: JsonField<String>? = null
        private var downloadUrlExpiresAt: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var failureReason: JsonField<FailureReason>? = null
        private var name: JsonField<String>? = null
        private var requirementId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var uploadConstraints: JsonField<UploadConstraints2>? = null
        private var uploadUrl: JsonField<String>? = null
        private var uploadUrlExpiresAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(claimDocumentAcceptedWebhookEvent: ClaimDocumentAcceptedWebhookEvent) =
            apply {
                token = claimDocumentAcceptedWebhookEvent.token
                created = claimDocumentAcceptedWebhookEvent.created
                downloadUrl = claimDocumentAcceptedWebhookEvent.downloadUrl
                downloadUrlExpiresAt = claimDocumentAcceptedWebhookEvent.downloadUrlExpiresAt
                eventType = claimDocumentAcceptedWebhookEvent.eventType
                failureReason = claimDocumentAcceptedWebhookEvent.failureReason
                name = claimDocumentAcceptedWebhookEvent.name
                requirementId = claimDocumentAcceptedWebhookEvent.requirementId
                status = claimDocumentAcceptedWebhookEvent.status
                updated = claimDocumentAcceptedWebhookEvent.updated
                uploadConstraints = claimDocumentAcceptedWebhookEvent.uploadConstraints
                uploadUrl = claimDocumentAcceptedWebhookEvent.uploadUrl
                uploadUrlExpiresAt = claimDocumentAcceptedWebhookEvent.uploadUrlExpiresAt
                additionalProperties =
                    claimDocumentAcceptedWebhookEvent.additionalProperties.toMutableMap()
            }

        /** Unique identifier for the document, in UUID format */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** When the document was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Presigned URL for downloading the uploaded document. Available once the document is being
         * validated or has been accepted (`VALIDATING` or `ACCEPTED`)
         */
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

        /** When the download URL expires */
        fun downloadUrlExpiresAt(downloadUrlExpiresAt: OffsetDateTime?) =
            downloadUrlExpiresAt(JsonField.ofNullable(downloadUrlExpiresAt))

        /**
         * Alias for calling [Builder.downloadUrlExpiresAt] with
         * `downloadUrlExpiresAt.orElse(null)`.
         */
        fun downloadUrlExpiresAt(downloadUrlExpiresAt: Optional<OffsetDateTime>) =
            downloadUrlExpiresAt(downloadUrlExpiresAt.getOrNull())

        /**
         * Sets [Builder.downloadUrlExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrlExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun downloadUrlExpiresAt(downloadUrlExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.downloadUrlExpiresAt = downloadUrlExpiresAt
        }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** Reason the document failed validation. Null unless `status` is `REJECTED` */
        fun failureReason(failureReason: FailureReason?) =
            failureReason(JsonField.ofNullable(failureReason))

        /** Alias for calling [Builder.failureReason] with `failureReason.orElse(null)`. */
        fun failureReason(failureReason: Optional<FailureReason>) =
            failureReason(failureReason.getOrNull())

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [FailureReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureReason(failureReason: JsonField<FailureReason>) = apply {
            this.failureReason = failureReason
        }

        /** Name provided when the upload intent was created */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Identifier of the document requirement this document satisfies. Null for supplemental
         * documents not tied to a specific requirement
         */
        fun requirementId(requirementId: String?) =
            requirementId(JsonField.ofNullable(requirementId))

        /** Alias for calling [Builder.requirementId] with `requirementId.orElse(null)`. */
        fun requirementId(requirementId: Optional<String>) =
            requirementId(requirementId.getOrNull())

        /**
         * Sets [Builder.requirementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requirementId(requirementId: JsonField<String>) = apply {
            this.requirementId = requirementId
        }

        /** Current validation status of the document */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When the document was last updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Constraints that an uploaded file must satisfy. */
        fun uploadConstraints(uploadConstraints: UploadConstraints2?) =
            uploadConstraints(JsonField.ofNullable(uploadConstraints))

        /** Alias for calling [Builder.uploadConstraints] with `uploadConstraints.orElse(null)`. */
        fun uploadConstraints(uploadConstraints: Optional<UploadConstraints2>) =
            uploadConstraints(uploadConstraints.getOrNull())

        /**
         * Sets [Builder.uploadConstraints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadConstraints] with a well-typed
         * [UploadConstraints2] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun uploadConstraints(uploadConstraints: JsonField<UploadConstraints2>) = apply {
            this.uploadConstraints = uploadConstraints
        }

        /**
         * Presigned URL for uploading the file via HTTP PUT. Null after the upload window expires
         * or after the document has been validated
         */
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

        /** When the upload URL expires */
        fun uploadUrlExpiresAt(uploadUrlExpiresAt: OffsetDateTime?) =
            uploadUrlExpiresAt(JsonField.ofNullable(uploadUrlExpiresAt))

        /**
         * Alias for calling [Builder.uploadUrlExpiresAt] with `uploadUrlExpiresAt.orElse(null)`.
         */
        fun uploadUrlExpiresAt(uploadUrlExpiresAt: Optional<OffsetDateTime>) =
            uploadUrlExpiresAt(uploadUrlExpiresAt.getOrNull())

        /**
         * Sets [Builder.uploadUrlExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrlExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun uploadUrlExpiresAt(uploadUrlExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.uploadUrlExpiresAt = uploadUrlExpiresAt
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
         * Returns an immutable instance of [ClaimDocumentAcceptedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .downloadUrl()
         * .downloadUrlExpiresAt()
         * .eventType()
         * .failureReason()
         * .name()
         * .requirementId()
         * .status()
         * .updated()
         * .uploadConstraints()
         * .uploadUrl()
         * .uploadUrlExpiresAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClaimDocumentAcceptedWebhookEvent =
            ClaimDocumentAcceptedWebhookEvent(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("downloadUrl", downloadUrl),
                checkRequired("downloadUrlExpiresAt", downloadUrlExpiresAt),
                checkRequired("eventType", eventType),
                checkRequired("failureReason", failureReason),
                checkRequired("name", name),
                checkRequired("requirementId", requirementId),
                checkRequired("status", status),
                checkRequired("updated", updated),
                checkRequired("uploadConstraints", uploadConstraints),
                checkRequired("uploadUrl", uploadUrl),
                checkRequired("uploadUrlExpiresAt", uploadUrlExpiresAt),
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
    fun validate(): ClaimDocumentAcceptedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        downloadUrl()
        downloadUrlExpiresAt()
        eventType().validate()
        failureReason().ifPresent { it.validate() }
        name()
        requirementId()
        status().validate()
        updated()
        uploadConstraints().ifPresent { it.validate() }
        uploadUrl()
        uploadUrlExpiresAt()
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
            (if (downloadUrlExpiresAt.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (failureReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (requirementId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (uploadConstraints.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uploadUrl.asKnown().isPresent) 1 else 0) +
            (if (uploadUrlExpiresAt.asKnown().isPresent) 1 else 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CLAIM_DOCUMENT_ACCEPTED = of("claim_document.accepted")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CLAIM_DOCUMENT_ACCEPTED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLAIM_DOCUMENT_ACCEPTED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CLAIM_DOCUMENT_ACCEPTED -> Value.CLAIM_DOCUMENT_ACCEPTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CLAIM_DOCUMENT_ACCEPTED -> Known.CLAIM_DOCUMENT_ACCEPTED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Reason the document failed validation. Null unless `status` is `REJECTED` */
    class FailureReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INVALID_MIME_TYPE = of("INVALID_MIME_TYPE")

            @JvmField val FILE_TOO_LARGE = of("FILE_TOO_LARGE")

            @JvmField val FILE_EMPTY = of("FILE_EMPTY")

            @JvmField val CORRUPT_FILE = of("CORRUPT_FILE")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = FailureReason(JsonField.of(value))
        }

        /** An enum containing [FailureReason]'s known values. */
        enum class Known {
            INVALID_MIME_TYPE,
            FILE_TOO_LARGE,
            FILE_EMPTY,
            CORRUPT_FILE,
            OTHER,
        }

        /**
         * An enum containing [FailureReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FailureReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INVALID_MIME_TYPE,
            FILE_TOO_LARGE,
            FILE_EMPTY,
            CORRUPT_FILE,
            OTHER,
            /**
             * An enum member indicating that [FailureReason] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INVALID_MIME_TYPE -> Value.INVALID_MIME_TYPE
                FILE_TOO_LARGE -> Value.FILE_TOO_LARGE
                FILE_EMPTY -> Value.FILE_EMPTY
                CORRUPT_FILE -> Value.CORRUPT_FILE
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INVALID_MIME_TYPE -> Known.INVALID_MIME_TYPE
                FILE_TOO_LARGE -> Known.FILE_TOO_LARGE
                FILE_EMPTY -> Known.FILE_EMPTY
                CORRUPT_FILE -> Known.CORRUPT_FILE
                OTHER -> Known.OTHER
                else -> throw LithicInvalidDataException("Unknown FailureReason: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FailureReason = apply {
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

            return other is FailureReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current validation status of the document */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val VALIDATING = of("VALIDATING")

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            VALIDATING,
            ACCEPTED,
            REJECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            VALIDATING,
            ACCEPTED,
            REJECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                VALIDATING -> Value.VALIDATING
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                VALIDATING -> Known.VALIDATING
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Constraints that an uploaded file must satisfy. */
    class UploadConstraints2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val acceptedMimeTypes: JsonField<List<String>>,
        private val maxSizeBytes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_mime_types")
            @ExcludeMissing
            acceptedMimeTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("max_size_bytes")
            @ExcludeMissing
            maxSizeBytes: JsonField<Long> = JsonMissing.of(),
        ) : this(acceptedMimeTypes, maxSizeBytes, mutableMapOf())

        /**
         * MIME types accepted for upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedMimeTypes(): List<String> = acceptedMimeTypes.getRequired("accepted_mime_types")

        /**
         * Maximum file size in bytes. Null if there is no enforced size limit
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

        /**
         * Returns the raw JSON value of [acceptedMimeTypes].
         *
         * Unlike [acceptedMimeTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accepted_mime_types")
        @ExcludeMissing
        fun _acceptedMimeTypes(): JsonField<List<String>> = acceptedMimeTypes

        /**
         * Returns the raw JSON value of [maxSizeBytes].
         *
         * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_size_bytes")
        @ExcludeMissing
        fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

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
             * Returns a mutable builder for constructing an instance of [UploadConstraints2].
             *
             * The following fields are required:
             * ```java
             * .acceptedMimeTypes()
             * .maxSizeBytes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UploadConstraints2]. */
        class Builder internal constructor() {

            private var acceptedMimeTypes: JsonField<MutableList<String>>? = null
            private var maxSizeBytes: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(uploadConstraints2: UploadConstraints2) = apply {
                acceptedMimeTypes = uploadConstraints2.acceptedMimeTypes.map { it.toMutableList() }
                maxSizeBytes = uploadConstraints2.maxSizeBytes
                additionalProperties = uploadConstraints2.additionalProperties.toMutableMap()
            }

            /** MIME types accepted for upload */
            fun acceptedMimeTypes(acceptedMimeTypes: List<String>) =
                acceptedMimeTypes(JsonField.of(acceptedMimeTypes))

            /**
             * Sets [Builder.acceptedMimeTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedMimeTypes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun acceptedMimeTypes(acceptedMimeTypes: JsonField<List<String>>) = apply {
                this.acceptedMimeTypes = acceptedMimeTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [acceptedMimeTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcceptedMimeType(acceptedMimeType: String) = apply {
                acceptedMimeTypes =
                    (acceptedMimeTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acceptedMimeTypes", it).add(acceptedMimeType)
                    }
            }

            /** Maximum file size in bytes. Null if there is no enforced size limit */
            fun maxSizeBytes(maxSizeBytes: Long?) = maxSizeBytes(JsonField.ofNullable(maxSizeBytes))

            /**
             * Alias for [Builder.maxSizeBytes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(maxSizeBytes as Long?)

            /** Alias for calling [Builder.maxSizeBytes] with `maxSizeBytes.orElse(null)`. */
            fun maxSizeBytes(maxSizeBytes: Optional<Long>) = maxSizeBytes(maxSizeBytes.getOrNull())

            /**
             * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                this.maxSizeBytes = maxSizeBytes
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
             * Returns an immutable instance of [UploadConstraints2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .acceptedMimeTypes()
             * .maxSizeBytes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UploadConstraints2 =
                UploadConstraints2(
                    checkRequired("acceptedMimeTypes", acceptedMimeTypes).map { it.toImmutable() },
                    checkRequired("maxSizeBytes", maxSizeBytes),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UploadConstraints2 = apply {
            if (validated) {
                return@apply
            }

            acceptedMimeTypes()
            maxSizeBytes()
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
            (acceptedMimeTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (maxSizeBytes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UploadConstraints2 &&
                acceptedMimeTypes == other.acceptedMimeTypes &&
                maxSizeBytes == other.maxSizeBytes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(acceptedMimeTypes, maxSizeBytes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UploadConstraints2{acceptedMimeTypes=$acceptedMimeTypes, maxSizeBytes=$maxSizeBytes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClaimDocumentAcceptedWebhookEvent &&
            token == other.token &&
            created == other.created &&
            downloadUrl == other.downloadUrl &&
            downloadUrlExpiresAt == other.downloadUrlExpiresAt &&
            eventType == other.eventType &&
            failureReason == other.failureReason &&
            name == other.name &&
            requirementId == other.requirementId &&
            status == other.status &&
            updated == other.updated &&
            uploadConstraints == other.uploadConstraints &&
            uploadUrl == other.uploadUrl &&
            uploadUrlExpiresAt == other.uploadUrlExpiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            created,
            downloadUrl,
            downloadUrlExpiresAt,
            eventType,
            failureReason,
            name,
            requirementId,
            status,
            updated,
            uploadConstraints,
            uploadUrl,
            uploadUrlExpiresAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClaimDocumentAcceptedWebhookEvent{token=$token, created=$created, downloadUrl=$downloadUrl, downloadUrlExpiresAt=$downloadUrlExpiresAt, eventType=$eventType, failureReason=$failureReason, name=$name, requirementId=$requirementId, status=$status, updated=$updated, uploadConstraints=$uploadConstraints, uploadUrl=$uploadUrl, uploadUrlExpiresAt=$uploadUrlExpiresAt, additionalProperties=$additionalProperties}"
}
