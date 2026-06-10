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
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates a transaction monitoring case. */
class TransactionMonitoringCaseUpdateParams
private constructor(
    private val caseToken: String?,
    private val body: UpdateCaseRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun caseToken(): Optional<String> = Optional.ofNullable(caseToken)

    /**
     * Optional client-provided identifier for the actor performing this action, recorded on the
     * resulting activity entry. This value is supplied by the client (for example, your own
     * internal user ID) and is not authenticated by Lithic
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorToken(): Optional<String> = body.actorToken()

    /**
     * New assignee for the case, or `null` to unassign
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignee(): Optional<String> = body.assignee()

    /**
     * Priority level of a case, controlling queue ordering and SLA urgency
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<CasePriority> = body.priority()

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
    fun resolution(): Optional<ResolutionOutcome> = body.resolution()

    /**
     * Notes describing the resolution
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolutionNotes(): Optional<String> = body.resolutionNotes()

    /**
     * New SLA deadline for the case, or `null` to clear it
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slaDeadline(): Optional<OffsetDateTime> = body.slaDeadline()

    /**
     * Status of a case as it progresses through the review workflow:
     * - `OPEN` - The case has been created and is still collecting matching transactions
     * - `ASSIGNED` - An analyst has been assigned and transaction collection has stopped
     * - `IN_REVIEW` - The case is actively being investigated
     * - `ESCALATED` - The case has been reviewed and requires additional oversight
     * - `RESOLVED` - A determination has been made and a resolution recorded
     * - `CLOSED` - The case is finalized
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<CaseStatus> = body.status()

    /**
     * Arbitrary key-value metadata to set on the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<Tags> = body.tags()

    /**
     * New title for the case, or `null` to clear it
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * Returns the raw JSON value of [actorToken].
     *
     * Unlike [actorToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actorToken(): JsonField<String> = body._actorToken()

    /**
     * Returns the raw JSON value of [assignee].
     *
     * Unlike [assignee], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignee(): JsonField<String> = body._assignee()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<CasePriority> = body._priority()

    /**
     * Returns the raw JSON value of [resolution].
     *
     * Unlike [resolution], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resolution(): JsonField<ResolutionOutcome> = body._resolution()

    /**
     * Returns the raw JSON value of [resolutionNotes].
     *
     * Unlike [resolutionNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resolutionNotes(): JsonField<String> = body._resolutionNotes()

    /**
     * Returns the raw JSON value of [slaDeadline].
     *
     * Unlike [slaDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _slaDeadline(): JsonField<OffsetDateTime> = body._slaDeadline()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<CaseStatus> = body._status()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<Tags> = body._tags()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TransactionMonitoringCaseUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionMonitoringCaseUpdateParams]. */
    class Builder internal constructor() {

        private var caseToken: String? = null
        private var body: UpdateCaseRequest.Builder = UpdateCaseRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseUpdateParams: TransactionMonitoringCaseUpdateParams
        ) = apply {
            caseToken = transactionMonitoringCaseUpdateParams.caseToken
            body = transactionMonitoringCaseUpdateParams.body.toBuilder()
            additionalHeaders = transactionMonitoringCaseUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionMonitoringCaseUpdateParams.additionalQueryParams.toBuilder()
        }

        fun caseToken(caseToken: String?) = apply { this.caseToken = caseToken }

        /** Alias for calling [Builder.caseToken] with `caseToken.orElse(null)`. */
        fun caseToken(caseToken: Optional<String>) = caseToken(caseToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actorToken]
         * - [assignee]
         * - [priority]
         * - [resolution]
         * - [resolutionNotes]
         * - etc.
         */
        fun body(body: UpdateCaseRequest) = apply { this.body = body.toBuilder() }

        /**
         * Optional client-provided identifier for the actor performing this action, recorded on the
         * resulting activity entry. This value is supplied by the client (for example, your own
         * internal user ID) and is not authenticated by Lithic
         */
        fun actorToken(actorToken: String) = apply { body.actorToken(actorToken) }

        /**
         * Sets [Builder.actorToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorToken(actorToken: JsonField<String>) = apply { body.actorToken(actorToken) }

        /** New assignee for the case, or `null` to unassign */
        fun assignee(assignee: String?) = apply { body.assignee(assignee) }

        /** Alias for calling [Builder.assignee] with `assignee.orElse(null)`. */
        fun assignee(assignee: Optional<String>) = assignee(assignee.getOrNull())

        /**
         * Sets [Builder.assignee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignee] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun assignee(assignee: JsonField<String>) = apply { body.assignee(assignee) }

        /** Priority level of a case, controlling queue ordering and SLA urgency */
        fun priority(priority: CasePriority) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [CasePriority] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priority(priority: JsonField<CasePriority>) = apply { body.priority(priority) }

        /**
         * Outcome recorded when a case is resolved:
         * - `CONFIRMED_FRAUD` - The reviewed activity was confirmed to be fraudulent
         * - `SUSPICIOUS_ACTIVITY` - The activity is suspicious but not confirmed fraud
         * - `FALSE_POSITIVE` - The activity was legitimate and the alert was a false positive
         * - `NO_ACTION_REQUIRED` - No further action is required
         * - `ESCALATED_EXTERNAL` - The case was escalated to an external party
         */
        fun resolution(resolution: ResolutionOutcome) = apply { body.resolution(resolution) }

        /**
         * Sets [Builder.resolution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolution] with a well-typed [ResolutionOutcome] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolution(resolution: JsonField<ResolutionOutcome>) = apply {
            body.resolution(resolution)
        }

        /** Notes describing the resolution */
        fun resolutionNotes(resolutionNotes: String) = apply {
            body.resolutionNotes(resolutionNotes)
        }

        /**
         * Sets [Builder.resolutionNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionNotes(resolutionNotes: JsonField<String>) = apply {
            body.resolutionNotes(resolutionNotes)
        }

        /** New SLA deadline for the case, or `null` to clear it */
        fun slaDeadline(slaDeadline: OffsetDateTime?) = apply { body.slaDeadline(slaDeadline) }

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
            body.slaDeadline(slaDeadline)
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
        fun status(status: CaseStatus) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [CaseStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<CaseStatus>) = apply { body.status(status) }

        /** Arbitrary key-value metadata to set on the case */
        fun tags(tags: Tags) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<Tags>) = apply { body.tags(tags) }

        /** New title for the case, or `null` to clear it */
        fun title(title: String?) = apply { body.title(title) }

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

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

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionMonitoringCaseUpdateParams =
            TransactionMonitoringCaseUpdateParams(
                caseToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateCaseRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> caseToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Parameters for updating a case. All fields are optional; omitted fields are left unchanged.
     * The nullable fields `title`, `assignee`, and `sla_deadline` can be cleared by sending `null`.
     */
    class UpdateCaseRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actorToken: JsonField<String>,
        private val assignee: JsonField<String>,
        private val priority: JsonField<CasePriority>,
        private val resolution: JsonField<ResolutionOutcome>,
        private val resolutionNotes: JsonField<String>,
        private val slaDeadline: JsonField<OffsetDateTime>,
        private val status: JsonField<CaseStatus>,
        private val tags: JsonField<Tags>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actor_token")
            @ExcludeMissing
            actorToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assignee")
            @ExcludeMissing
            assignee: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<CasePriority> = JsonMissing.of(),
            @JsonProperty("resolution")
            @ExcludeMissing
            resolution: JsonField<ResolutionOutcome> = JsonMissing.of(),
            @JsonProperty("resolution_notes")
            @ExcludeMissing
            resolutionNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sla_deadline")
            @ExcludeMissing
            slaDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<CaseStatus> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            actorToken,
            assignee,
            priority,
            resolution,
            resolutionNotes,
            slaDeadline,
            status,
            tags,
            title,
            mutableMapOf(),
        )

        /**
         * Optional client-provided identifier for the actor performing this action, recorded on the
         * resulting activity entry. This value is supplied by the client (for example, your own
         * internal user ID) and is not authenticated by Lithic
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actorToken(): Optional<String> = actorToken.getOptional("actor_token")

        /**
         * New assignee for the case, or `null` to unassign
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignee(): Optional<String> = assignee.getOptional("assignee")

        /**
         * Priority level of a case, controlling queue ordering and SLA urgency
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priority(): Optional<CasePriority> = priority.getOptional("priority")

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
         * Notes describing the resolution
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resolutionNotes(): Optional<String> = resolutionNotes.getOptional("resolution_notes")

        /**
         * New SLA deadline for the case, or `null` to clear it
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
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<CaseStatus> = status.getOptional("status")

        /**
         * Arbitrary key-value metadata to set on the case
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<Tags> = tags.getOptional("tags")

        /**
         * New title for the case, or `null` to clear it
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [actorToken].
         *
         * Unlike [actorToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor_token")
        @ExcludeMissing
        fun _actorToken(): JsonField<String> = actorToken

        /**
         * Returns the raw JSON value of [assignee].
         *
         * Unlike [assignee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignee") @ExcludeMissing fun _assignee(): JsonField<String> = assignee

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority")
        @ExcludeMissing
        fun _priority(): JsonField<CasePriority> = priority

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
         * Unlike [resolutionNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resolution_notes")
        @ExcludeMissing
        fun _resolutionNotes(): JsonField<String> = resolutionNotes

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

            /** Returns a mutable builder for constructing an instance of [UpdateCaseRequest]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdateCaseRequest]. */
        class Builder internal constructor() {

            private var actorToken: JsonField<String> = JsonMissing.of()
            private var assignee: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<CasePriority> = JsonMissing.of()
            private var resolution: JsonField<ResolutionOutcome> = JsonMissing.of()
            private var resolutionNotes: JsonField<String> = JsonMissing.of()
            private var slaDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<CaseStatus> = JsonMissing.of()
            private var tags: JsonField<Tags> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updateCaseRequest: UpdateCaseRequest) = apply {
                actorToken = updateCaseRequest.actorToken
                assignee = updateCaseRequest.assignee
                priority = updateCaseRequest.priority
                resolution = updateCaseRequest.resolution
                resolutionNotes = updateCaseRequest.resolutionNotes
                slaDeadline = updateCaseRequest.slaDeadline
                status = updateCaseRequest.status
                tags = updateCaseRequest.tags
                title = updateCaseRequest.title
                additionalProperties = updateCaseRequest.additionalProperties.toMutableMap()
            }

            /**
             * Optional client-provided identifier for the actor performing this action, recorded on
             * the resulting activity entry. This value is supplied by the client (for example, your
             * own internal user ID) and is not authenticated by Lithic
             */
            fun actorToken(actorToken: String) = actorToken(JsonField.of(actorToken))

            /**
             * Sets [Builder.actorToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actorToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actorToken(actorToken: JsonField<String>) = apply { this.actorToken = actorToken }

            /** New assignee for the case, or `null` to unassign */
            fun assignee(assignee: String?) = assignee(JsonField.ofNullable(assignee))

            /** Alias for calling [Builder.assignee] with `assignee.orElse(null)`. */
            fun assignee(assignee: Optional<String>) = assignee(assignee.getOrNull())

            /**
             * Sets [Builder.assignee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignee] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignee(assignee: JsonField<String>) = apply { this.assignee = assignee }

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

            /**
             * Outcome recorded when a case is resolved:
             * - `CONFIRMED_FRAUD` - The reviewed activity was confirmed to be fraudulent
             * - `SUSPICIOUS_ACTIVITY` - The activity is suspicious but not confirmed fraud
             * - `FALSE_POSITIVE` - The activity was legitimate and the alert was a false positive
             * - `NO_ACTION_REQUIRED` - No further action is required
             * - `ESCALATED_EXTERNAL` - The case was escalated to an external party
             */
            fun resolution(resolution: ResolutionOutcome) = resolution(JsonField.of(resolution))

            /**
             * Sets [Builder.resolution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolution] with a well-typed [ResolutionOutcome]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resolution(resolution: JsonField<ResolutionOutcome>) = apply {
                this.resolution = resolution
            }

            /** Notes describing the resolution */
            fun resolutionNotes(resolutionNotes: String) =
                resolutionNotes(JsonField.of(resolutionNotes))

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

            /** New SLA deadline for the case, or `null` to clear it */
            fun slaDeadline(slaDeadline: OffsetDateTime?) =
                slaDeadline(JsonField.ofNullable(slaDeadline))

            /** Alias for calling [Builder.slaDeadline] with `slaDeadline.orElse(null)`. */
            fun slaDeadline(slaDeadline: Optional<OffsetDateTime>) =
                slaDeadline(slaDeadline.getOrNull())

            /**
             * Sets [Builder.slaDeadline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slaDeadline] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.status] with a well-typed [CaseStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<CaseStatus>) = apply { this.status = status }

            /** Arbitrary key-value metadata to set on the case */
            fun tags(tags: Tags) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

            /** New title for the case, or `null` to clear it */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [UpdateCaseRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdateCaseRequest =
                UpdateCaseRequest(
                    actorToken,
                    assignee,
                    priority,
                    resolution,
                    resolutionNotes,
                    slaDeadline,
                    status,
                    tags,
                    title,
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
        fun validate(): UpdateCaseRequest = apply {
            if (validated) {
                return@apply
            }

            actorToken()
            assignee()
            priority().ifPresent { it.validate() }
            resolution().ifPresent { it.validate() }
            resolutionNotes()
            slaDeadline()
            status().ifPresent { it.validate() }
            tags().ifPresent { it.validate() }
            title()
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
            (if (actorToken.asKnown().isPresent) 1 else 0) +
                (if (assignee.asKnown().isPresent) 1 else 0) +
                (priority.asKnown().getOrNull()?.validity() ?: 0) +
                (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                (if (resolutionNotes.asKnown().isPresent) 1 else 0) +
                (if (slaDeadline.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdateCaseRequest &&
                actorToken == other.actorToken &&
                assignee == other.assignee &&
                priority == other.priority &&
                resolution == other.resolution &&
                resolutionNotes == other.resolutionNotes &&
                slaDeadline == other.slaDeadline &&
                status == other.status &&
                tags == other.tags &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actorToken,
                assignee,
                priority,
                resolution,
                resolutionNotes,
                slaDeadline,
                status,
                tags,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdateCaseRequest{actorToken=$actorToken, assignee=$assignee, priority=$priority, resolution=$resolution, resolutionNotes=$resolutionNotes, slaDeadline=$slaDeadline, status=$status, tags=$tags, title=$title, additionalProperties=$additionalProperties}"
    }

    /** Arbitrary key-value metadata to set on the case */
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

        return other is TransactionMonitoringCaseUpdateParams &&
            caseToken == other.caseToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(caseToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionMonitoringCaseUpdateParams{caseToken=$caseToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
