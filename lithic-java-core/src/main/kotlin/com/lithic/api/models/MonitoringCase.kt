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
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A transaction monitoring case */
class MonitoringCase
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val assignee: JsonField<String>,
    private val collectionStopped: JsonField<OffsetDateTime>,
    private val created: JsonField<OffsetDateTime>,
    private val entity: JsonField<CaseEntity>,
    private val pendingTransactions: JsonField<Boolean>,
    private val priority: JsonField<CasePriority>,
    private val queueToken: JsonField<String>,
    private val resolution: JsonField<ResolutionOutcome>,
    private val resolutionNotes: JsonField<String>,
    private val resolved: JsonField<OffsetDateTime>,
    private val ruleToken: JsonField<String>,
    private val slaDeadline: JsonField<OffsetDateTime>,
    private val status: JsonField<CaseStatus>,
    private val tags: JsonField<Tags>,
    private val title: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assignee") @ExcludeMissing assignee: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_stopped")
        @ExcludeMissing
        collectionStopped: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<CaseEntity> = JsonMissing.of(),
        @JsonProperty("pending_transactions")
        @ExcludeMissing
        pendingTransactions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        priority: JsonField<CasePriority> = JsonMissing.of(),
        @JsonProperty("queue_token")
        @ExcludeMissing
        queueToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resolution")
        @ExcludeMissing
        resolution: JsonField<ResolutionOutcome> = JsonMissing.of(),
        @JsonProperty("resolution_notes")
        @ExcludeMissing
        resolutionNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resolved")
        @ExcludeMissing
        resolved: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rule_token") @ExcludeMissing ruleToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sla_deadline")
        @ExcludeMissing
        slaDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<CaseStatus> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        assignee,
        collectionStopped,
        created,
        entity,
        pendingTransactions,
        priority,
        queueToken,
        resolution,
        resolutionNotes,
        resolved,
        ruleToken,
        slaDeadline,
        status,
        tags,
        title,
        updated,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Identifier of the user the case is currently assigned to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignee(): Optional<String> = assignee.getOptional("assignee")

    /**
     * Date and time at which transaction collection stopped for the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collectionStopped(): Optional<OffsetDateTime> =
        collectionStopped.getOptional("collection_stopped")

    /**
     * Date and time at which the case was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The entity a case is associated with
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Optional<CaseEntity> = entity.getOptional("entity")

    /**
     * Whether the case still has transaction scopes pending resolution
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingTransactions(): Boolean = pendingTransactions.getRequired("pending_transactions")

    /**
     * Priority level of a case, controlling queue ordering and SLA urgency
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): CasePriority = priority.getRequired("priority")

    /**
     * Token of the queue the case belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queueToken(): String = queueToken.getRequired("queue_token")

    /**
     * Outcome recorded when a case is resolved:
     * - `CONFIRMED_FRAUD` - The reviewed activity was confirmed to be fraudulent
     * - `SUSPICIOUS_ACTIVITY` - The activity is suspicious but not confirmed fraud
     * - `FALSE_POSITIVE` - The activity was legitimate and the alert was a false positive
     * - `NO_ACTION_REQUIRED` - No further action is required
     * - `ESCALATED_EXTERNAL` - The case was escalated to an external party
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolution(): Optional<ResolutionOutcome> = resolution.getOptional("resolution")

    /**
     * Free-form notes describing the resolution
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolutionNotes(): Optional<String> = resolutionNotes.getOptional("resolution_notes")

    /**
     * Date and time at which the case was resolved
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolved(): Optional<OffsetDateTime> = resolved.getOptional("resolved")

    /**
     * Token of the transaction monitoring rule that triggered the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ruleToken(): Optional<String> = ruleToken.getOptional("rule_token")

    /**
     * Deadline by which the case is expected to be resolved
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slaDeadline(): Optional<OffsetDateTime> = slaDeadline.getOptional("sla_deadline")

    /**
     * Status of a case as it progresses through the review workflow:
     * - `OPEN` - The case has been created and is still collecting matching transactions
     * - `ASSIGNED` - An analyst has been assigned and transaction collection has stopped
     * - `IN_REVIEW` - The case is actively being investigated
     * - `ESCALATED` - The case has been reviewed and requires additional oversight
     * - `RESOLVED` - A determination has been made and a resolution recorded
     * - `CLOSED` - The case is finalized
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): CaseStatus = status.getRequired("status")

    /**
     * Arbitrary key-value metadata associated with the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): Tags = tags.getRequired("tags")

    /**
     * Short, human-readable summary of the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Date and time at which the case was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [assignee].
     *
     * Unlike [assignee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assignee") @ExcludeMissing fun _assignee(): JsonField<String> = assignee

    /**
     * Returns the raw JSON value of [collectionStopped].
     *
     * Unlike [collectionStopped], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collection_stopped")
    @ExcludeMissing
    fun _collectionStopped(): JsonField<OffsetDateTime> = collectionStopped

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<CaseEntity> = entity

    /**
     * Returns the raw JSON value of [pendingTransactions].
     *
     * Unlike [pendingTransactions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_transactions")
    @ExcludeMissing
    fun _pendingTransactions(): JsonField<Boolean> = pendingTransactions

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<CasePriority> = priority

    /**
     * Returns the raw JSON value of [queueToken].
     *
     * Unlike [queueToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_token") @ExcludeMissing fun _queueToken(): JsonField<String> = queueToken

    /**
     * Returns the raw JSON value of [resolution].
     *
     * Unlike [resolution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolution")
    @ExcludeMissing
    fun _resolution(): JsonField<ResolutionOutcome> = resolution

    /**
     * Returns the raw JSON value of [resolutionNotes].
     *
     * Unlike [resolutionNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolution_notes")
    @ExcludeMissing
    fun _resolutionNotes(): JsonField<String> = resolutionNotes

    /**
     * Returns the raw JSON value of [resolved].
     *
     * Unlike [resolved], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolved") @ExcludeMissing fun _resolved(): JsonField<OffsetDateTime> = resolved

    /**
     * Returns the raw JSON value of [ruleToken].
     *
     * Unlike [ruleToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rule_token") @ExcludeMissing fun _ruleToken(): JsonField<String> = ruleToken

    /**
     * Returns the raw JSON value of [slaDeadline].
     *
     * Unlike [slaDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sla_deadline")
    @ExcludeMissing
    fun _slaDeadline(): JsonField<OffsetDateTime> = slaDeadline

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<CaseStatus> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [MonitoringCase].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .assignee()
         * .collectionStopped()
         * .created()
         * .entity()
         * .pendingTransactions()
         * .priority()
         * .queueToken()
         * .resolution()
         * .resolutionNotes()
         * .resolved()
         * .ruleToken()
         * .slaDeadline()
         * .status()
         * .tags()
         * .title()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MonitoringCase]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var assignee: JsonField<String>? = null
        private var collectionStopped: JsonField<OffsetDateTime>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var entity: JsonField<CaseEntity>? = null
        private var pendingTransactions: JsonField<Boolean>? = null
        private var priority: JsonField<CasePriority>? = null
        private var queueToken: JsonField<String>? = null
        private var resolution: JsonField<ResolutionOutcome>? = null
        private var resolutionNotes: JsonField<String>? = null
        private var resolved: JsonField<OffsetDateTime>? = null
        private var ruleToken: JsonField<String>? = null
        private var slaDeadline: JsonField<OffsetDateTime>? = null
        private var status: JsonField<CaseStatus>? = null
        private var tags: JsonField<Tags>? = null
        private var title: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(monitoringCase: MonitoringCase) = apply {
            token = monitoringCase.token
            assignee = monitoringCase.assignee
            collectionStopped = monitoringCase.collectionStopped
            created = monitoringCase.created
            entity = monitoringCase.entity
            pendingTransactions = monitoringCase.pendingTransactions
            priority = monitoringCase.priority
            queueToken = monitoringCase.queueToken
            resolution = monitoringCase.resolution
            resolutionNotes = monitoringCase.resolutionNotes
            resolved = monitoringCase.resolved
            ruleToken = monitoringCase.ruleToken
            slaDeadline = monitoringCase.slaDeadline
            status = monitoringCase.status
            tags = monitoringCase.tags
            title = monitoringCase.title
            updated = monitoringCase.updated
            additionalProperties = monitoringCase.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the case */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Identifier of the user the case is currently assigned to */
        fun assignee(assignee: String?) = assignee(JsonField.ofNullable(assignee))

        /** Alias for calling [Builder.assignee] with `assignee.orElse(null)`. */
        fun assignee(assignee: Optional<String>) = assignee(assignee.getOrNull())

        /**
         * Sets [Builder.assignee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignee] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun assignee(assignee: JsonField<String>) = apply { this.assignee = assignee }

        /** Date and time at which transaction collection stopped for the case */
        fun collectionStopped(collectionStopped: OffsetDateTime?) =
            collectionStopped(JsonField.ofNullable(collectionStopped))

        /** Alias for calling [Builder.collectionStopped] with `collectionStopped.orElse(null)`. */
        fun collectionStopped(collectionStopped: Optional<OffsetDateTime>) =
            collectionStopped(collectionStopped.getOrNull())

        /**
         * Sets [Builder.collectionStopped] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionStopped] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun collectionStopped(collectionStopped: JsonField<OffsetDateTime>) = apply {
            this.collectionStopped = collectionStopped
        }

        /** Date and time at which the case was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The entity a case is associated with */
        fun entity(entity: CaseEntity?) = entity(JsonField.ofNullable(entity))

        /** Alias for calling [Builder.entity] with `entity.orElse(null)`. */
        fun entity(entity: Optional<CaseEntity>) = entity(entity.getOrNull())

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [CaseEntity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entity(entity: JsonField<CaseEntity>) = apply { this.entity = entity }

        /** Whether the case still has transaction scopes pending resolution */
        fun pendingTransactions(pendingTransactions: Boolean) =
            pendingTransactions(JsonField.of(pendingTransactions))

        /**
         * Sets [Builder.pendingTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTransactions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingTransactions(pendingTransactions: JsonField<Boolean>) = apply {
            this.pendingTransactions = pendingTransactions
        }

        /** Priority level of a case, controlling queue ordering and SLA urgency */
        fun priority(priority: CasePriority) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [CasePriority] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priority(priority: JsonField<CasePriority>) = apply { this.priority = priority }

        /** Token of the queue the case belongs to */
        fun queueToken(queueToken: String) = queueToken(JsonField.of(queueToken))

        /**
         * Sets [Builder.queueToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queueToken(queueToken: JsonField<String>) = apply { this.queueToken = queueToken }

        /**
         * Outcome recorded when a case is resolved:
         * - `CONFIRMED_FRAUD` - The reviewed activity was confirmed to be fraudulent
         * - `SUSPICIOUS_ACTIVITY` - The activity is suspicious but not confirmed fraud
         * - `FALSE_POSITIVE` - The activity was legitimate and the alert was a false positive
         * - `NO_ACTION_REQUIRED` - No further action is required
         * - `ESCALATED_EXTERNAL` - The case was escalated to an external party
         */
        fun resolution(resolution: ResolutionOutcome?) =
            resolution(JsonField.ofNullable(resolution))

        /** Alias for calling [Builder.resolution] with `resolution.orElse(null)`. */
        fun resolution(resolution: Optional<ResolutionOutcome>) = resolution(resolution.getOrNull())

        /**
         * Sets [Builder.resolution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolution] with a well-typed [ResolutionOutcome] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolution(resolution: JsonField<ResolutionOutcome>) = apply {
            this.resolution = resolution
        }

        /** Free-form notes describing the resolution */
        fun resolutionNotes(resolutionNotes: String?) =
            resolutionNotes(JsonField.ofNullable(resolutionNotes))

        /** Alias for calling [Builder.resolutionNotes] with `resolutionNotes.orElse(null)`. */
        fun resolutionNotes(resolutionNotes: Optional<String>) =
            resolutionNotes(resolutionNotes.getOrNull())

        /**
         * Sets [Builder.resolutionNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionNotes(resolutionNotes: JsonField<String>) = apply {
            this.resolutionNotes = resolutionNotes
        }

        /** Date and time at which the case was resolved */
        fun resolved(resolved: OffsetDateTime?) = resolved(JsonField.ofNullable(resolved))

        /** Alias for calling [Builder.resolved] with `resolved.orElse(null)`. */
        fun resolved(resolved: Optional<OffsetDateTime>) = resolved(resolved.getOrNull())

        /**
         * Sets [Builder.resolved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolved] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolved(resolved: JsonField<OffsetDateTime>) = apply { this.resolved = resolved }

        /** Token of the transaction monitoring rule that triggered the case */
        fun ruleToken(ruleToken: String?) = ruleToken(JsonField.ofNullable(ruleToken))

        /** Alias for calling [Builder.ruleToken] with `ruleToken.orElse(null)`. */
        fun ruleToken(ruleToken: Optional<String>) = ruleToken(ruleToken.getOrNull())

        /**
         * Sets [Builder.ruleToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ruleToken(ruleToken: JsonField<String>) = apply { this.ruleToken = ruleToken }

        /** Deadline by which the case is expected to be resolved */
        fun slaDeadline(slaDeadline: OffsetDateTime?) =
            slaDeadline(JsonField.ofNullable(slaDeadline))

        /** Alias for calling [Builder.slaDeadline] with `slaDeadline.orElse(null)`. */
        fun slaDeadline(slaDeadline: Optional<OffsetDateTime>) =
            slaDeadline(slaDeadline.getOrNull())

        /**
         * Sets [Builder.slaDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slaDeadline] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun slaDeadline(slaDeadline: JsonField<OffsetDateTime>) = apply {
            this.slaDeadline = slaDeadline
        }

        /**
         * Status of a case as it progresses through the review workflow:
         * - `OPEN` - The case has been created and is still collecting matching transactions
         * - `ASSIGNED` - An analyst has been assigned and transaction collection has stopped
         * - `IN_REVIEW` - The case is actively being investigated
         * - `ESCALATED` - The case has been reviewed and requires additional oversight
         * - `RESOLVED` - A determination has been made and a resolution recorded
         * - `CLOSED` - The case is finalized
         */
        fun status(status: CaseStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [CaseStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<CaseStatus>) = apply { this.status = status }

        /** Arbitrary key-value metadata associated with the case */
        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

        /** Short, human-readable summary of the case */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Date and time at which the case was last updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [MonitoringCase].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .assignee()
         * .collectionStopped()
         * .created()
         * .entity()
         * .pendingTransactions()
         * .priority()
         * .queueToken()
         * .resolution()
         * .resolutionNotes()
         * .resolved()
         * .ruleToken()
         * .slaDeadline()
         * .status()
         * .tags()
         * .title()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MonitoringCase =
            MonitoringCase(
                checkRequired("token", token),
                checkRequired("assignee", assignee),
                checkRequired("collectionStopped", collectionStopped),
                checkRequired("created", created),
                checkRequired("entity", entity),
                checkRequired("pendingTransactions", pendingTransactions),
                checkRequired("priority", priority),
                checkRequired("queueToken", queueToken),
                checkRequired("resolution", resolution),
                checkRequired("resolutionNotes", resolutionNotes),
                checkRequired("resolved", resolved),
                checkRequired("ruleToken", ruleToken),
                checkRequired("slaDeadline", slaDeadline),
                checkRequired("status", status),
                checkRequired("tags", tags),
                checkRequired("title", title),
                checkRequired("updated", updated),
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
    fun validate(): MonitoringCase = apply {
        if (validated) {
            return@apply
        }

        token()
        assignee()
        collectionStopped()
        created()
        entity().ifPresent { it.validate() }
        pendingTransactions()
        priority().validate()
        queueToken()
        resolution().ifPresent { it.validate() }
        resolutionNotes()
        resolved()
        ruleToken()
        slaDeadline()
        status().validate()
        tags().validate()
        title()
        updated()
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
            (if (assignee.asKnown().isPresent) 1 else 0) +
            (if (collectionStopped.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pendingTransactions.asKnown().isPresent) 1 else 0) +
            (priority.asKnown().getOrNull()?.validity() ?: 0) +
            (if (queueToken.asKnown().isPresent) 1 else 0) +
            (resolution.asKnown().getOrNull()?.validity() ?: 0) +
            (if (resolutionNotes.asKnown().isPresent) 1 else 0) +
            (if (resolved.asKnown().isPresent) 1 else 0) +
            (if (ruleToken.asKnown().isPresent) 1 else 0) +
            (if (slaDeadline.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    /** Arbitrary key-value metadata associated with the case */
    class Tags
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Tags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tags]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tags: Tags) = apply {
                additionalProperties = tags.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Tags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tags = Tags(additionalProperties.toImmutable())
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
        fun validate(): Tags = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tags && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tags{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MonitoringCase &&
            token == other.token &&
            assignee == other.assignee &&
            collectionStopped == other.collectionStopped &&
            created == other.created &&
            entity == other.entity &&
            pendingTransactions == other.pendingTransactions &&
            priority == other.priority &&
            queueToken == other.queueToken &&
            resolution == other.resolution &&
            resolutionNotes == other.resolutionNotes &&
            resolved == other.resolved &&
            ruleToken == other.ruleToken &&
            slaDeadline == other.slaDeadline &&
            status == other.status &&
            tags == other.tags &&
            title == other.title &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            assignee,
            collectionStopped,
            created,
            entity,
            pendingTransactions,
            priority,
            queueToken,
            resolution,
            resolutionNotes,
            resolved,
            ruleToken,
            slaDeadline,
            status,
            tags,
            title,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MonitoringCase{token=$token, assignee=$assignee, collectionStopped=$collectionStopped, created=$created, entity=$entity, pendingTransactions=$pendingTransactions, priority=$priority, queueToken=$queueToken, resolution=$resolution, resolutionNotes=$resolutionNotes, resolved=$resolved, ruleToken=$ruleToken, slaDeadline=$slaDeadline, status=$status, tags=$tags, title=$title, updated=$updated, additionalProperties=$additionalProperties}"
}
