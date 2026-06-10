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

/** A queue that groups transaction monitoring cases for review */
class Queue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val caseCounts: JsonField<CaseCounts>,
    private val created: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("case_counts")
        @ExcludeMissing
        caseCounts: JsonField<CaseCounts> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(token, caseCounts, created, description, name, updated, mutableMapOf())

    /**
     * Globally unique identifier for the queue
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Number of cases in the queue, broken down by status. A status is omitted when the queue has
     * no cases in that status
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun caseCounts(): CaseCounts = caseCounts.getRequired("case_counts")

    /**
     * Date and time at which the queue was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Optional description of the queue
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Human-readable name of the queue
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Date and time at which the queue was last updated
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
     * Returns the raw JSON value of [caseCounts].
     *
     * Unlike [caseCounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("case_counts")
    @ExcludeMissing
    fun _caseCounts(): JsonField<CaseCounts> = caseCounts

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [Queue].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .caseCounts()
         * .created()
         * .description()
         * .name()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Queue]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var caseCounts: JsonField<CaseCounts>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queue: Queue) = apply {
            token = queue.token
            caseCounts = queue.caseCounts
            created = queue.created
            description = queue.description
            name = queue.name
            updated = queue.updated
            additionalProperties = queue.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the queue */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Number of cases in the queue, broken down by status. A status is omitted when the queue
         * has no cases in that status
         */
        fun caseCounts(caseCounts: CaseCounts) = caseCounts(JsonField.of(caseCounts))

        /**
         * Sets [Builder.caseCounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseCounts] with a well-typed [CaseCounts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun caseCounts(caseCounts: JsonField<CaseCounts>) = apply { this.caseCounts = caseCounts }

        /** Date and time at which the queue was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Optional description of the queue */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Human-readable name of the queue */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Date and time at which the queue was last updated */
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
         * Returns an immutable instance of [Queue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .caseCounts()
         * .created()
         * .description()
         * .name()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Queue =
            Queue(
                checkRequired("token", token),
                checkRequired("caseCounts", caseCounts),
                checkRequired("created", created),
                checkRequired("description", description),
                checkRequired("name", name),
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
    fun validate(): Queue = apply {
        if (validated) {
            return@apply
        }

        token()
        caseCounts().validate()
        created()
        description()
        name()
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
            (caseCounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    /**
     * Number of cases in the queue, broken down by status. A status is omitted when the queue has
     * no cases in that status
     */
    class CaseCounts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assigned: JsonField<Long>,
        private val closed: JsonField<Long>,
        private val escalated: JsonField<Long>,
        private val inReview: JsonField<Long>,
        private val open: JsonField<Long>,
        private val resolved: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ASSIGNED") @ExcludeMissing assigned: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("CLOSED") @ExcludeMissing closed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("ESCALATED")
            @ExcludeMissing
            escalated: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("IN_REVIEW") @ExcludeMissing inReview: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("OPEN") @ExcludeMissing open: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("RESOLVED") @ExcludeMissing resolved: JsonField<Long> = JsonMissing.of(),
        ) : this(assigned, closed, escalated, inReview, open, resolved, mutableMapOf())

        /**
         * Number of cases in the queue with status `ASSIGNED`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assigned(): Optional<Long> = assigned.getOptional("ASSIGNED")

        /**
         * Number of cases in the queue with status `CLOSED`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun closed(): Optional<Long> = closed.getOptional("CLOSED")

        /**
         * Number of cases in the queue with status `ESCALATED`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun escalated(): Optional<Long> = escalated.getOptional("ESCALATED")

        /**
         * Number of cases in the queue with status `IN_REVIEW`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inReview(): Optional<Long> = inReview.getOptional("IN_REVIEW")

        /**
         * Number of cases in the queue with status `OPEN`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun open(): Optional<Long> = open.getOptional("OPEN")

        /**
         * Number of cases in the queue with status `RESOLVED`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resolved(): Optional<Long> = resolved.getOptional("RESOLVED")

        /**
         * Returns the raw JSON value of [assigned].
         *
         * Unlike [assigned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ASSIGNED") @ExcludeMissing fun _assigned(): JsonField<Long> = assigned

        /**
         * Returns the raw JSON value of [closed].
         *
         * Unlike [closed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("CLOSED") @ExcludeMissing fun _closed(): JsonField<Long> = closed

        /**
         * Returns the raw JSON value of [escalated].
         *
         * Unlike [escalated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ESCALATED") @ExcludeMissing fun _escalated(): JsonField<Long> = escalated

        /**
         * Returns the raw JSON value of [inReview].
         *
         * Unlike [inReview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("IN_REVIEW") @ExcludeMissing fun _inReview(): JsonField<Long> = inReview

        /**
         * Returns the raw JSON value of [open].
         *
         * Unlike [open], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("OPEN") @ExcludeMissing fun _open(): JsonField<Long> = open

        /**
         * Returns the raw JSON value of [resolved].
         *
         * Unlike [resolved], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("RESOLVED") @ExcludeMissing fun _resolved(): JsonField<Long> = resolved

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

            /** Returns a mutable builder for constructing an instance of [CaseCounts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CaseCounts]. */
        class Builder internal constructor() {

            private var assigned: JsonField<Long> = JsonMissing.of()
            private var closed: JsonField<Long> = JsonMissing.of()
            private var escalated: JsonField<Long> = JsonMissing.of()
            private var inReview: JsonField<Long> = JsonMissing.of()
            private var open: JsonField<Long> = JsonMissing.of()
            private var resolved: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(caseCounts: CaseCounts) = apply {
                assigned = caseCounts.assigned
                closed = caseCounts.closed
                escalated = caseCounts.escalated
                inReview = caseCounts.inReview
                open = caseCounts.open
                resolved = caseCounts.resolved
                additionalProperties = caseCounts.additionalProperties.toMutableMap()
            }

            /** Number of cases in the queue with status `ASSIGNED` */
            fun assigned(assigned: Long) = assigned(JsonField.of(assigned))

            /**
             * Sets [Builder.assigned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assigned] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assigned(assigned: JsonField<Long>) = apply { this.assigned = assigned }

            /** Number of cases in the queue with status `CLOSED` */
            fun closed(closed: Long) = closed(JsonField.of(closed))

            /**
             * Sets [Builder.closed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.closed] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun closed(closed: JsonField<Long>) = apply { this.closed = closed }

            /** Number of cases in the queue with status `ESCALATED` */
            fun escalated(escalated: Long) = escalated(JsonField.of(escalated))

            /**
             * Sets [Builder.escalated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.escalated] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun escalated(escalated: JsonField<Long>) = apply { this.escalated = escalated }

            /** Number of cases in the queue with status `IN_REVIEW` */
            fun inReview(inReview: Long) = inReview(JsonField.of(inReview))

            /**
             * Sets [Builder.inReview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inReview] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inReview(inReview: JsonField<Long>) = apply { this.inReview = inReview }

            /** Number of cases in the queue with status `OPEN` */
            fun open(open: Long) = open(JsonField.of(open))

            /**
             * Sets [Builder.open] to an arbitrary JSON value.
             *
             * You should usually call [Builder.open] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun open(open: JsonField<Long>) = apply { this.open = open }

            /** Number of cases in the queue with status `RESOLVED` */
            fun resolved(resolved: Long) = resolved(JsonField.of(resolved))

            /**
             * Sets [Builder.resolved] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolved] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resolved(resolved: JsonField<Long>) = apply { this.resolved = resolved }

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
             * Returns an immutable instance of [CaseCounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CaseCounts =
                CaseCounts(
                    assigned,
                    closed,
                    escalated,
                    inReview,
                    open,
                    resolved,
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
        fun validate(): CaseCounts = apply {
            if (validated) {
                return@apply
            }

            assigned()
            closed()
            escalated()
            inReview()
            open()
            resolved()
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
            (if (assigned.asKnown().isPresent) 1 else 0) +
                (if (closed.asKnown().isPresent) 1 else 0) +
                (if (escalated.asKnown().isPresent) 1 else 0) +
                (if (inReview.asKnown().isPresent) 1 else 0) +
                (if (open.asKnown().isPresent) 1 else 0) +
                (if (resolved.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CaseCounts &&
                assigned == other.assigned &&
                closed == other.closed &&
                escalated == other.escalated &&
                inReview == other.inReview &&
                open == other.open &&
                resolved == other.resolved &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assigned,
                closed,
                escalated,
                inReview,
                open,
                resolved,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CaseCounts{assigned=$assigned, closed=$closed, escalated=$escalated, inReview=$inReview, open=$open, resolved=$resolved, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Queue &&
            token == other.token &&
            caseCounts == other.caseCounts &&
            created == other.created &&
            description == other.description &&
            name == other.name &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(token, caseCounts, created, description, name, updated, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Queue{token=$token, caseCounts=$caseCounts, created=$created, description=$description, name=$name, updated=$updated, additionalProperties=$additionalProperties}"
}
