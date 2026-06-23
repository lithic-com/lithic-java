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

class ClaimUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardTokens: JsonField<List<String>>,
    private val created: JsonField<OffsetDateTime>,
    private val disputedTransactions: JsonField<List<DisputedTransaction>>,
    private val eventType: JsonField<EventType>,
    private val outstandingRequirements: JsonField<List<OutstandingRequirement>>,
    private val reason: JsonField<Reason>,
    private val status: JsonField<Status>,
    private val submitted: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        accountHolderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_tokens")
        @ExcludeMissing
        cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("disputed_transactions")
        @ExcludeMissing
        disputedTransactions: JsonField<List<DisputedTransaction>> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("outstanding_requirements")
        @ExcludeMissing
        outstandingRequirements: JsonField<List<OutstandingRequirement>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submitted")
        @ExcludeMissing
        submitted: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        accountHolderToken,
        accountToken,
        cardTokens,
        created,
        disputedTransactions,
        eventType,
        outstandingRequirements,
        reason,
        status,
        submitted,
        updated,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the claim, in UUID format
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Token for the account holder that filed the claim
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountHolderToken(): Optional<String> =
        accountHolderToken.getOptional("account_holder_token")

    /**
     * Token for the account associated with the claim
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

    /**
     * Tokens for the cards associated with the disputed transactions
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /**
     * When the claim was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Transactions included in this claim
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputedTransactions(): List<DisputedTransaction> =
        disputedTransactions.getRequired("disputed_transactions")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Requirements that must be fulfilled before the claim can be submitted
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outstandingRequirements(): List<OutstandingRequirement> =
        outstandingRequirements.getRequired("outstanding_requirements")

    /**
     * Dispute reason code provided when creating the claim
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): Reason = reason.getRequired("reason")

    /**
     * Current lifecycle status of the claim
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the claim was submitted. Null until the claim reaches `SUBMITTED` status
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submitted(): Optional<OffsetDateTime> = submitted.getOptional("submitted")

    /**
     * When the claim was last updated
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
     * Returns the raw JSON value of [accountHolderToken].
     *
     * Unlike [accountHolderToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken(): JsonField<String> = accountHolderToken

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [cardTokens].
     *
     * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [disputedTransactions].
     *
     * Unlike [disputedTransactions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("disputed_transactions")
    @ExcludeMissing
    fun _disputedTransactions(): JsonField<List<DisputedTransaction>> = disputedTransactions

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [outstandingRequirements].
     *
     * Unlike [outstandingRequirements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("outstanding_requirements")
    @ExcludeMissing
    fun _outstandingRequirements(): JsonField<List<OutstandingRequirement>> =
        outstandingRequirements

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submitted].
     *
     * Unlike [submitted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted")
    @ExcludeMissing
    fun _submitted(): JsonField<OffsetDateTime> = submitted

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
         * Returns a mutable builder for constructing an instance of [ClaimUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountHolderToken()
         * .accountToken()
         * .cardTokens()
         * .created()
         * .disputedTransactions()
         * .eventType()
         * .outstandingRequirements()
         * .reason()
         * .status()
         * .submitted()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClaimUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountHolderToken: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var disputedTransactions: JsonField<MutableList<DisputedTransaction>>? = null
        private var eventType: JsonField<EventType>? = null
        private var outstandingRequirements: JsonField<MutableList<OutstandingRequirement>>? = null
        private var reason: JsonField<Reason>? = null
        private var status: JsonField<Status>? = null
        private var submitted: JsonField<OffsetDateTime>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(claimUpdatedWebhookEvent: ClaimUpdatedWebhookEvent) = apply {
            token = claimUpdatedWebhookEvent.token
            accountHolderToken = claimUpdatedWebhookEvent.accountHolderToken
            accountToken = claimUpdatedWebhookEvent.accountToken
            cardTokens = claimUpdatedWebhookEvent.cardTokens.map { it.toMutableList() }
            created = claimUpdatedWebhookEvent.created
            disputedTransactions =
                claimUpdatedWebhookEvent.disputedTransactions.map { it.toMutableList() }
            eventType = claimUpdatedWebhookEvent.eventType
            outstandingRequirements =
                claimUpdatedWebhookEvent.outstandingRequirements.map { it.toMutableList() }
            reason = claimUpdatedWebhookEvent.reason
            status = claimUpdatedWebhookEvent.status
            submitted = claimUpdatedWebhookEvent.submitted
            updated = claimUpdatedWebhookEvent.updated
            additionalProperties = claimUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the claim, in UUID format */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Token for the account holder that filed the claim */
        fun accountHolderToken(accountHolderToken: String?) =
            accountHolderToken(JsonField.ofNullable(accountHolderToken))

        /**
         * Alias for calling [Builder.accountHolderToken] with `accountHolderToken.orElse(null)`.
         */
        fun accountHolderToken(accountHolderToken: Optional<String>) =
            accountHolderToken(accountHolderToken.getOrNull())

        /**
         * Sets [Builder.accountHolderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Token for the account associated with the claim */
        fun accountToken(accountToken: String?) = accountToken(JsonField.ofNullable(accountToken))

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

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

        /** Tokens for the cards associated with the disputed transactions */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Sets [Builder.cardTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
            this.cardTokens = cardTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [cardTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCardToken(cardToken: String) = apply {
            cardTokens =
                (cardTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cardTokens", it).add(cardToken)
                }
        }

        /** When the claim was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Transactions included in this claim */
        fun disputedTransactions(disputedTransactions: List<DisputedTransaction>) =
            disputedTransactions(JsonField.of(disputedTransactions))

        /**
         * Sets [Builder.disputedTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputedTransactions] with a well-typed
         * `List<DisputedTransaction>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun disputedTransactions(disputedTransactions: JsonField<List<DisputedTransaction>>) =
            apply {
                this.disputedTransactions = disputedTransactions.map { it.toMutableList() }
            }

        /**
         * Adds a single [DisputedTransaction] to [disputedTransactions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDisputedTransaction(disputedTransaction: DisputedTransaction) = apply {
            disputedTransactions =
                (disputedTransactions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("disputedTransactions", it).add(disputedTransaction)
                }
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

        /** Requirements that must be fulfilled before the claim can be submitted */
        fun outstandingRequirements(outstandingRequirements: List<OutstandingRequirement>) =
            outstandingRequirements(JsonField.of(outstandingRequirements))

        /**
         * Sets [Builder.outstandingRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outstandingRequirements] with a well-typed
         * `List<OutstandingRequirement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun outstandingRequirements(
            outstandingRequirements: JsonField<List<OutstandingRequirement>>
        ) = apply {
            this.outstandingRequirements = outstandingRequirements.map { it.toMutableList() }
        }

        /**
         * Adds a single [OutstandingRequirement] to [outstandingRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutstandingRequirement(outstandingRequirement: OutstandingRequirement) = apply {
            outstandingRequirements =
                (outstandingRequirements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outstandingRequirements", it).add(outstandingRequirement)
                }
        }

        /** Dispute reason code provided when creating the claim */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** Current lifecycle status of the claim */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When the claim was submitted. Null until the claim reaches `SUBMITTED` status */
        fun submitted(submitted: OffsetDateTime?) = submitted(JsonField.ofNullable(submitted))

        /** Alias for calling [Builder.submitted] with `submitted.orElse(null)`. */
        fun submitted(submitted: Optional<OffsetDateTime>) = submitted(submitted.getOrNull())

        /**
         * Sets [Builder.submitted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitted] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submitted(submitted: JsonField<OffsetDateTime>) = apply { this.submitted = submitted }

        /** When the claim was last updated */
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
         * Returns an immutable instance of [ClaimUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountHolderToken()
         * .accountToken()
         * .cardTokens()
         * .created()
         * .disputedTransactions()
         * .eventType()
         * .outstandingRequirements()
         * .reason()
         * .status()
         * .submitted()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClaimUpdatedWebhookEvent =
            ClaimUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("accountHolderToken", accountHolderToken),
                checkRequired("accountToken", accountToken),
                checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("disputedTransactions", disputedTransactions).map {
                    it.toImmutable()
                },
                checkRequired("eventType", eventType),
                checkRequired("outstandingRequirements", outstandingRequirements).map {
                    it.toImmutable()
                },
                checkRequired("reason", reason),
                checkRequired("status", status),
                checkRequired("submitted", submitted),
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
    fun validate(): ClaimUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        accountHolderToken()
        accountToken()
        cardTokens()
        created()
        disputedTransactions().forEach { it.validate() }
        eventType().validate()
        outstandingRequirements().forEach { it.validate() }
        reason().validate()
        status().validate()
        submitted()
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
            (if (accountHolderToken.asKnown().isPresent) 1 else 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (cardTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (disputedTransactions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (outstandingRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submitted.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    /** A transaction included in a claim, along with the specific events being disputed. */
    class DisputedTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventTokens: JsonField<List<String>>,
        private val transactionToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_tokens")
            @ExcludeMissing
            eventTokens: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transaction_token")
            @ExcludeMissing
            transactionToken: JsonField<String> = JsonMissing.of(),
        ) : this(eventTokens, transactionToken, mutableMapOf())

        /**
         * Tokens for the specific events within the transaction being disputed. Lithic creates one
         * dispute per event token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventTokens(): List<String> = eventTokens.getRequired("event_tokens")

        /**
         * Token for the transaction being disputed, in UUID format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionToken(): String = transactionToken.getRequired("transaction_token")

        /**
         * Returns the raw JSON value of [eventTokens].
         *
         * Unlike [eventTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_tokens")
        @ExcludeMissing
        fun _eventTokens(): JsonField<List<String>> = eventTokens

        /**
         * Returns the raw JSON value of [transactionToken].
         *
         * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun _transactionToken(): JsonField<String> = transactionToken

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
             * Returns a mutable builder for constructing an instance of [DisputedTransaction].
             *
             * The following fields are required:
             * ```java
             * .eventTokens()
             * .transactionToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DisputedTransaction]. */
        class Builder internal constructor() {

            private var eventTokens: JsonField<MutableList<String>>? = null
            private var transactionToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(disputedTransaction: DisputedTransaction) = apply {
                eventTokens = disputedTransaction.eventTokens.map { it.toMutableList() }
                transactionToken = disputedTransaction.transactionToken
                additionalProperties = disputedTransaction.additionalProperties.toMutableMap()
            }

            /**
             * Tokens for the specific events within the transaction being disputed. Lithic creates
             * one dispute per event token
             */
            fun eventTokens(eventTokens: List<String>) = eventTokens(JsonField.of(eventTokens))

            /**
             * Sets [Builder.eventTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTokens] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventTokens(eventTokens: JsonField<List<String>>) = apply {
                this.eventTokens = eventTokens.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [eventTokens].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEventToken(eventToken: String) = apply {
                eventTokens =
                    (eventTokens ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eventTokens", it).add(eventToken)
                    }
            }

            /** Token for the transaction being disputed, in UUID format */
            fun transactionToken(transactionToken: String) =
                transactionToken(JsonField.of(transactionToken))

            /**
             * Sets [Builder.transactionToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionToken(transactionToken: JsonField<String>) = apply {
                this.transactionToken = transactionToken
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
             * Returns an immutable instance of [DisputedTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventTokens()
             * .transactionToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DisputedTransaction =
                DisputedTransaction(
                    checkRequired("eventTokens", eventTokens).map { it.toImmutable() },
                    checkRequired("transactionToken", transactionToken),
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
        fun validate(): DisputedTransaction = apply {
            if (validated) {
                return@apply
            }

            eventTokens()
            transactionToken()
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
            (eventTokens.asKnown().getOrNull()?.size ?: 0) +
                (if (transactionToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DisputedTransaction &&
                eventTokens == other.eventTokens &&
                transactionToken == other.transactionToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventTokens, transactionToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisputedTransaction{eventTokens=$eventTokens, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
    }

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

            @JvmField val CLAIM_UPDATED = of("claim.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CLAIM_UPDATED
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
            CLAIM_UPDATED,
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
                CLAIM_UPDATED -> Value.CLAIM_UPDATED
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
                CLAIM_UPDATED -> Known.CLAIM_UPDATED
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

    class OutstandingRequirement
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUESTIONNAIRE = of("QUESTIONNAIRE")

            @JvmField val DOCUMENTS = of("DOCUMENTS")

            @JvmStatic fun of(value: String) = OutstandingRequirement(JsonField.of(value))
        }

        /** An enum containing [OutstandingRequirement]'s known values. */
        enum class Known {
            QUESTIONNAIRE,
            DOCUMENTS,
        }

        /**
         * An enum containing [OutstandingRequirement]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [OutstandingRequirement] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUESTIONNAIRE,
            DOCUMENTS,
            /**
             * An enum member indicating that [OutstandingRequirement] was instantiated with an
             * unknown value.
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
                QUESTIONNAIRE -> Value.QUESTIONNAIRE
                DOCUMENTS -> Value.DOCUMENTS
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
                QUESTIONNAIRE -> Known.QUESTIONNAIRE
                DOCUMENTS -> Known.DOCUMENTS
                else -> throw LithicInvalidDataException("Unknown OutstandingRequirement: $value")
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
        fun validate(): OutstandingRequirement = apply {
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

            return other is OutstandingRequirement && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Dispute reason code provided when creating the claim */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CARD_NOT_PRESENT = of("CARD_NOT_PRESENT")

            @JvmField val CARD_LOST = of("CARD_LOST")

            @JvmField val CARD_STOLEN = of("CARD_STOLEN")

            @JvmField val CARD_NEVER_RECEIVED = of("CARD_NEVER_RECEIVED")

            @JvmField val COUNTERFEIT = of("COUNTERFEIT")

            @JvmField val ACCOUNT_TAKEOVER = of("ACCOUNT_TAKEOVER")

            @JvmField val PRODUCT_NOT_RECEIVED = of("PRODUCT_NOT_RECEIVED")

            @JvmField val NOT_AS_DESCRIBED = of("NOT_AS_DESCRIBED")

            @JvmField val CREDIT_NOT_PROCESSED = of("CREDIT_NOT_PROCESSED")

            @JvmField val CANCELLED_RECURRING = of("CANCELLED_RECURRING")

            @JvmField val PAID_BY_OTHER_MEANS = of("PAID_BY_OTHER_MEANS")

            @JvmField val DUPLICATE_CHARGE = of("DUPLICATE_CHARGE")

            @JvmField val LATE_PRESENTMENT = of("LATE_PRESENTMENT")

            @JvmField val INCORRECT_TRANSACTION_CODE = of("INCORRECT_TRANSACTION_CODE")

            @JvmField val NO_AUTHORIZATION = of("NO_AUTHORIZATION")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val INCORRECT_AMOUNT = of("INCORRECT_AMOUNT")

            @JvmField val ATM_CASH_NOT_DISPENSED = of("ATM_CASH_NOT_DISPENSED")

            @JvmField val ATM_DEPOSIT_WRONG_AMOUNT = of("ATM_DEPOSIT_WRONG_AMOUNT")

            @JvmField val ATM_DEPOSIT_MISSING = of("ATM_DEPOSIT_MISSING")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            CARD_NOT_PRESENT,
            CARD_LOST,
            CARD_STOLEN,
            CARD_NEVER_RECEIVED,
            COUNTERFEIT,
            ACCOUNT_TAKEOVER,
            PRODUCT_NOT_RECEIVED,
            NOT_AS_DESCRIBED,
            CREDIT_NOT_PROCESSED,
            CANCELLED_RECURRING,
            PAID_BY_OTHER_MEANS,
            DUPLICATE_CHARGE,
            LATE_PRESENTMENT,
            INCORRECT_TRANSACTION_CODE,
            NO_AUTHORIZATION,
            DECLINED,
            INCORRECT_AMOUNT,
            ATM_CASH_NOT_DISPENSED,
            ATM_DEPOSIT_WRONG_AMOUNT,
            ATM_DEPOSIT_MISSING,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD_NOT_PRESENT,
            CARD_LOST,
            CARD_STOLEN,
            CARD_NEVER_RECEIVED,
            COUNTERFEIT,
            ACCOUNT_TAKEOVER,
            PRODUCT_NOT_RECEIVED,
            NOT_AS_DESCRIBED,
            CREDIT_NOT_PROCESSED,
            CANCELLED_RECURRING,
            PAID_BY_OTHER_MEANS,
            DUPLICATE_CHARGE,
            LATE_PRESENTMENT,
            INCORRECT_TRANSACTION_CODE,
            NO_AUTHORIZATION,
            DECLINED,
            INCORRECT_AMOUNT,
            ATM_CASH_NOT_DISPENSED,
            ATM_DEPOSIT_WRONG_AMOUNT,
            ATM_DEPOSIT_MISSING,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                CARD_NOT_PRESENT -> Value.CARD_NOT_PRESENT
                CARD_LOST -> Value.CARD_LOST
                CARD_STOLEN -> Value.CARD_STOLEN
                CARD_NEVER_RECEIVED -> Value.CARD_NEVER_RECEIVED
                COUNTERFEIT -> Value.COUNTERFEIT
                ACCOUNT_TAKEOVER -> Value.ACCOUNT_TAKEOVER
                PRODUCT_NOT_RECEIVED -> Value.PRODUCT_NOT_RECEIVED
                NOT_AS_DESCRIBED -> Value.NOT_AS_DESCRIBED
                CREDIT_NOT_PROCESSED -> Value.CREDIT_NOT_PROCESSED
                CANCELLED_RECURRING -> Value.CANCELLED_RECURRING
                PAID_BY_OTHER_MEANS -> Value.PAID_BY_OTHER_MEANS
                DUPLICATE_CHARGE -> Value.DUPLICATE_CHARGE
                LATE_PRESENTMENT -> Value.LATE_PRESENTMENT
                INCORRECT_TRANSACTION_CODE -> Value.INCORRECT_TRANSACTION_CODE
                NO_AUTHORIZATION -> Value.NO_AUTHORIZATION
                DECLINED -> Value.DECLINED
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                ATM_CASH_NOT_DISPENSED -> Value.ATM_CASH_NOT_DISPENSED
                ATM_DEPOSIT_WRONG_AMOUNT -> Value.ATM_DEPOSIT_WRONG_AMOUNT
                ATM_DEPOSIT_MISSING -> Value.ATM_DEPOSIT_MISSING
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
                CARD_NOT_PRESENT -> Known.CARD_NOT_PRESENT
                CARD_LOST -> Known.CARD_LOST
                CARD_STOLEN -> Known.CARD_STOLEN
                CARD_NEVER_RECEIVED -> Known.CARD_NEVER_RECEIVED
                COUNTERFEIT -> Known.COUNTERFEIT
                ACCOUNT_TAKEOVER -> Known.ACCOUNT_TAKEOVER
                PRODUCT_NOT_RECEIVED -> Known.PRODUCT_NOT_RECEIVED
                NOT_AS_DESCRIBED -> Known.NOT_AS_DESCRIBED
                CREDIT_NOT_PROCESSED -> Known.CREDIT_NOT_PROCESSED
                CANCELLED_RECURRING -> Known.CANCELLED_RECURRING
                PAID_BY_OTHER_MEANS -> Known.PAID_BY_OTHER_MEANS
                DUPLICATE_CHARGE -> Known.DUPLICATE_CHARGE
                LATE_PRESENTMENT -> Known.LATE_PRESENTMENT
                INCORRECT_TRANSACTION_CODE -> Known.INCORRECT_TRANSACTION_CODE
                NO_AUTHORIZATION -> Known.NO_AUTHORIZATION
                DECLINED -> Known.DECLINED
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                ATM_CASH_NOT_DISPENSED -> Known.ATM_CASH_NOT_DISPENSED
                ATM_DEPOSIT_WRONG_AMOUNT -> Known.ATM_DEPOSIT_WRONG_AMOUNT
                ATM_DEPOSIT_MISSING -> Known.ATM_DEPOSIT_MISSING
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
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
        fun validate(): Reason = apply {
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

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current lifecycle status of the claim */
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

            @JvmField val INITIALIZING = of("INITIALIZING")

            @JvmField val AWAITING_INFO = of("AWAITING_INFO")

            @JvmField val SUBMITTED = of("SUBMITTED")

            @JvmField val RESOLVED = of("RESOLVED")

            @JvmField val ABANDONED = of("ABANDONED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            INITIALIZING,
            AWAITING_INFO,
            SUBMITTED,
            RESOLVED,
            ABANDONED,
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
            INITIALIZING,
            AWAITING_INFO,
            SUBMITTED,
            RESOLVED,
            ABANDONED,
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
                INITIALIZING -> Value.INITIALIZING
                AWAITING_INFO -> Value.AWAITING_INFO
                SUBMITTED -> Value.SUBMITTED
                RESOLVED -> Value.RESOLVED
                ABANDONED -> Value.ABANDONED
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
                INITIALIZING -> Known.INITIALIZING
                AWAITING_INFO -> Known.AWAITING_INFO
                SUBMITTED -> Known.SUBMITTED
                RESOLVED -> Known.RESOLVED
                ABANDONED -> Known.ABANDONED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClaimUpdatedWebhookEvent &&
            token == other.token &&
            accountHolderToken == other.accountHolderToken &&
            accountToken == other.accountToken &&
            cardTokens == other.cardTokens &&
            created == other.created &&
            disputedTransactions == other.disputedTransactions &&
            eventType == other.eventType &&
            outstandingRequirements == other.outstandingRequirements &&
            reason == other.reason &&
            status == other.status &&
            submitted == other.submitted &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountHolderToken,
            accountToken,
            cardTokens,
            created,
            disputedTransactions,
            eventType,
            outstandingRequirements,
            reason,
            status,
            submitted,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClaimUpdatedWebhookEvent{token=$token, accountHolderToken=$accountHolderToken, accountToken=$accountToken, cardTokens=$cardTokens, created=$created, disputedTransactions=$disputedTransactions, eventType=$eventType, outstandingRequirements=$outstandingRequirements, reason=$reason, status=$status, submitted=$submitted, updated=$updated, additionalProperties=$additionalProperties}"
}
