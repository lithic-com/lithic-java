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

class AccountHolderCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventType: JsonField<EventType>,
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val requiredDocuments: JsonField<List<RequiredDocument>>,
    private val status: JsonField<Status>,
    private val statusReason: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("required_documents")
        @ExcludeMissing
        requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_reason")
        @ExcludeMissing
        statusReason: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        eventType,
        token,
        accountToken,
        created,
        requiredDocuments,
        status,
        statusReason,
        mutableMapOf(),
    )

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The token of the account_holder that was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * The token of the account that was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

    /**
     * When the account_holder was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredDocuments(): Optional<List<RequiredDocument>> =
        requiredDocuments.getOptional("required_documents")

    /**
     * The status of the account_holder that was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusReason(): Optional<List<String>> = statusReason.getOptional("status_reason")

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [requiredDocuments].
     *
     * Unlike [requiredDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("required_documents")
    @ExcludeMissing
    fun _requiredDocuments(): JsonField<List<RequiredDocument>> = requiredDocuments

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusReason].
     *
     * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_reason")
    @ExcludeMissing
    fun _statusReason(): JsonField<List<String>> = statusReason

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
         * [AccountHolderCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var eventType: JsonField<EventType>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var requiredDocuments: JsonField<MutableList<RequiredDocument>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReason: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderCreatedWebhookEvent: AccountHolderCreatedWebhookEvent) =
            apply {
                eventType = accountHolderCreatedWebhookEvent.eventType
                token = accountHolderCreatedWebhookEvent.token
                accountToken = accountHolderCreatedWebhookEvent.accountToken
                created = accountHolderCreatedWebhookEvent.created
                requiredDocuments =
                    accountHolderCreatedWebhookEvent.requiredDocuments.map { it.toMutableList() }
                status = accountHolderCreatedWebhookEvent.status
                statusReason =
                    accountHolderCreatedWebhookEvent.statusReason.map { it.toMutableList() }
                additionalProperties =
                    accountHolderCreatedWebhookEvent.additionalProperties.toMutableMap()
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

        /** The token of the account_holder that was created. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The token of the account that was created. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** When the account_holder was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Sets [Builder.requiredDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredDocuments] with a well-typed
         * `List<RequiredDocument>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequiredDocument] to [requiredDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredDocument(requiredDocument: RequiredDocument) = apply {
            requiredDocuments =
                (requiredDocuments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredDocuments", it).add(requiredDocument)
                }
        }

        /** The status of the account_holder that was created. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun statusReason(statusReason: List<String>) = statusReason(JsonField.of(statusReason))

        /**
         * Sets [Builder.statusReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReason] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusReason(statusReason: JsonField<List<String>>) = apply {
            this.statusReason = statusReason.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.statusReason].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatusReason(statusReason: String) = apply {
            this.statusReason =
                (this.statusReason ?: JsonField.of(mutableListOf())).also {
                    checkKnown("statusReason", it).add(statusReason)
                }
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
         * Returns an immutable instance of [AccountHolderCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderCreatedWebhookEvent =
            AccountHolderCreatedWebhookEvent(
                checkRequired("eventType", eventType),
                token,
                accountToken,
                created,
                (requiredDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                (statusReason ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountHolderCreatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        eventType().validate()
        token()
        accountToken()
        created()
        requiredDocuments().ifPresent { it.forEach { it.validate() } }
        status().ifPresent { it.validate() }
        statusReason()
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
        (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (token.asKnown().isPresent) 1 else 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (requiredDocuments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (statusReason.asKnown().getOrNull()?.size ?: 0)

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

            @JvmField val ACCOUNT_HOLDER_CREATED = of("account_holder.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_HOLDER_CREATED
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
            ACCOUNT_HOLDER_CREATED,
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
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
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
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
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

    /** The status of the account_holder that was created. */
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

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val PENDING_REVIEW = of("PENDING_REVIEW")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACCEPTED,
            PENDING_REVIEW,
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
            ACCEPTED,
            PENDING_REVIEW,
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
                ACCEPTED -> Value.ACCEPTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
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
                ACCEPTED -> Known.ACCEPTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderCreatedWebhookEvent &&
            eventType == other.eventType &&
            token == other.token &&
            accountToken == other.accountToken &&
            created == other.created &&
            requiredDocuments == other.requiredDocuments &&
            status == other.status &&
            statusReason == other.statusReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventType,
            token,
            accountToken,
            created,
            requiredDocuments,
            status,
            statusReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderCreatedWebhookEvent{eventType=$eventType, token=$token, accountToken=$accountToken, created=$created, requiredDocuments=$requiredDocuments, status=$status, statusReason=$statusReason, additionalProperties=$additionalProperties}"
}
