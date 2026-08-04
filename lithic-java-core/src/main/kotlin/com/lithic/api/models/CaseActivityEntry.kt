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

/** A single entry in a case's activity feed */
class CaseActivityEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val actorToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val entryType: JsonField<CaseActivityType>,
    private val newValue: JsonField<String>,
    private val previousValue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actor_token")
        @ExcludeMissing
        actorToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        entryType: JsonField<CaseActivityType> = JsonMissing.of(),
        @JsonProperty("new_value") @ExcludeMissing newValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_value")
        @ExcludeMissing
        previousValue: JsonField<String> = JsonMissing.of(),
    ) : this(token, actorToken, created, entryType, newValue, previousValue, mutableMapOf())

    /**
     * Globally unique identifier for the activity entry
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Identifier of the actor that produced the activity entry
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorToken(): Optional<String> = actorToken.getOptional("actor_token")

    /**
     * Date and time at which the activity entry was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The case field that changed, or the action that was taken, in an activity entry:
     * - `STATUS` - The case status changed
     * - `TITLE` - The case title changed
     * - `ASSIGNED_TO` - The case assignee changed
     * - `RESOLUTION_OUTCOME` - The resolution outcome was set or changed
     * - `RESOLUTION_NOTES` - The resolution notes were set or changed
     * - `TAGS` - The case tags changed
     * - `PRIORITY` - The case priority changed
     * - `COMMENT` - A comment was added or edited
     * - `FILE` - A file was attached to the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entryType(): CaseActivityType = entryType.getRequired("entry_type")

    /**
     * New value of the changed field, when applicable
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newValue(): Optional<String> = newValue.getOptional("new_value")

    /**
     * Previous value of the changed field, when applicable
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousValue(): Optional<String> = previousValue.getOptional("previous_value")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [actorToken].
     *
     * Unlike [actorToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor_token") @ExcludeMissing fun _actorToken(): JsonField<String> = actorToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [entryType].
     *
     * Unlike [entryType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entry_type")
    @ExcludeMissing
    fun _entryType(): JsonField<CaseActivityType> = entryType

    /**
     * Returns the raw JSON value of [newValue].
     *
     * Unlike [newValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("new_value") @ExcludeMissing fun _newValue(): JsonField<String> = newValue

    /**
     * Returns the raw JSON value of [previousValue].
     *
     * Unlike [previousValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_value")
    @ExcludeMissing
    fun _previousValue(): JsonField<String> = previousValue

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
         * Returns a mutable builder for constructing an instance of [CaseActivityEntry].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .actorToken()
         * .created()
         * .entryType()
         * .newValue()
         * .previousValue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CaseActivityEntry]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var actorToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var entryType: JsonField<CaseActivityType>? = null
        private var newValue: JsonField<String>? = null
        private var previousValue: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(caseActivityEntry: CaseActivityEntry) = apply {
            token = caseActivityEntry.token
            actorToken = caseActivityEntry.actorToken
            created = caseActivityEntry.created
            entryType = caseActivityEntry.entryType
            newValue = caseActivityEntry.newValue
            previousValue = caseActivityEntry.previousValue
            additionalProperties = caseActivityEntry.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the activity entry */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Identifier of the actor that produced the activity entry */
        fun actorToken(actorToken: String?) = actorToken(JsonField.ofNullable(actorToken))

        /** Alias for calling [Builder.actorToken] with `actorToken.orElse(null)`. */
        fun actorToken(actorToken: Optional<String>) = actorToken(actorToken.getOrNull())

        /**
         * Sets [Builder.actorToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorToken(actorToken: JsonField<String>) = apply { this.actorToken = actorToken }

        /** Date and time at which the activity entry was created */
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
         * The case field that changed, or the action that was taken, in an activity entry:
         * - `STATUS` - The case status changed
         * - `TITLE` - The case title changed
         * - `ASSIGNED_TO` - The case assignee changed
         * - `RESOLUTION_OUTCOME` - The resolution outcome was set or changed
         * - `RESOLUTION_NOTES` - The resolution notes were set or changed
         * - `TAGS` - The case tags changed
         * - `PRIORITY` - The case priority changed
         * - `COMMENT` - A comment was added or edited
         * - `FILE` - A file was attached to the case
         */
        fun entryType(entryType: CaseActivityType) = entryType(JsonField.of(entryType))

        /**
         * Sets [Builder.entryType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entryType] with a well-typed [CaseActivityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entryType(entryType: JsonField<CaseActivityType>) = apply { this.entryType = entryType }

        /** New value of the changed field, when applicable */
        fun newValue(newValue: String?) = newValue(JsonField.ofNullable(newValue))

        /** Alias for calling [Builder.newValue] with `newValue.orElse(null)`. */
        fun newValue(newValue: Optional<String>) = newValue(newValue.getOrNull())

        /**
         * Sets [Builder.newValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newValue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun newValue(newValue: JsonField<String>) = apply { this.newValue = newValue }

        /** Previous value of the changed field, when applicable */
        fun previousValue(previousValue: String?) =
            previousValue(JsonField.ofNullable(previousValue))

        /** Alias for calling [Builder.previousValue] with `previousValue.orElse(null)`. */
        fun previousValue(previousValue: Optional<String>) =
            previousValue(previousValue.getOrNull())

        /**
         * Sets [Builder.previousValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previousValue(previousValue: JsonField<String>) = apply {
            this.previousValue = previousValue
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
         * Returns an immutable instance of [CaseActivityEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .actorToken()
         * .created()
         * .entryType()
         * .newValue()
         * .previousValue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CaseActivityEntry =
            CaseActivityEntry(
                checkRequired("token", token),
                checkRequired("actorToken", actorToken),
                checkRequired("created", created),
                checkRequired("entryType", entryType),
                checkRequired("newValue", newValue),
                checkRequired("previousValue", previousValue),
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
    fun validate(): CaseActivityEntry = apply {
        if (validated) {
            return@apply
        }

        token()
        actorToken()
        created()
        entryType().validate()
        newValue()
        previousValue()
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
            (if (actorToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (entryType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (newValue.asKnown().isPresent) 1 else 0) +
            (if (previousValue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseActivityEntry &&
            token == other.token &&
            actorToken == other.actorToken &&
            created == other.created &&
            entryType == other.entryType &&
            newValue == other.newValue &&
            previousValue == other.previousValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            actorToken,
            created,
            entryType,
            newValue,
            previousValue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CaseActivityEntry{token=$token, actorToken=$actorToken, created=$created, entryType=$entryType, newValue=$newValue, previousValue=$previousValue, additionalProperties=$additionalProperties}"
}
