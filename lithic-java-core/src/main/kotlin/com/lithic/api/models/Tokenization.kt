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

class Tokenization
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dpan: JsonField<String>,
    private val status: JsonField<Status>,
    private val tokenRequestorName: JsonField<TokenRequestorName>,
    private val tokenUniqueReference: JsonField<String>,
    private val tokenizationChannel: JsonField<TokenizationChannel>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val digitalCardArtToken: JsonField<String>,
    private val events: JsonField<List<TokenizationEvent>>,
    private val paymentAccountReferenceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dpan") @ExcludeMissing dpan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("token_requestor_name")
        @ExcludeMissing
        tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of(),
        @JsonProperty("token_unique_reference")
        @ExcludeMissing
        tokenUniqueReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokenization_channel")
        @ExcludeMissing
        tokenizationChannel: JsonField<TokenizationChannel> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<TokenizationEvent>> = JsonMissing.of(),
        @JsonProperty("payment_account_reference_id")
        @ExcludeMissing
        paymentAccountReferenceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        cardToken,
        createdAt,
        dpan,
        status,
        tokenRequestorName,
        tokenUniqueReference,
        tokenizationChannel,
        updatedAt,
        digitalCardArtToken,
        events,
        paymentAccountReferenceId,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for a Tokenization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The account token associated with the card being tokenized.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * The card token associated with the card being tokenized.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Date and time when the tokenization first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The dynamic pan assigned to the token by the network.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dpan(): Optional<String> = dpan.getOptional("dpan")

    /**
     * The status of the tokenization request
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The entity that requested the tokenization. Represents a Digital Wallet or merchant.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenRequestorName(): TokenRequestorName =
        tokenRequestorName.getRequired("token_requestor_name")

    /**
     * The network's unique reference for the tokenization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenUniqueReference(): String = tokenUniqueReference.getRequired("token_unique_reference")

    /**
     * The channel through which the tokenization was made.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationChannel(): TokenizationChannel =
        tokenizationChannel.getRequired("tokenization_channel")

    /**
     * Latest date and time when the tokenization was updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
     * This will be null if the tokenization was created without an associated digital card art. See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalCardArtToken(): Optional<String> =
        digitalCardArtToken.getOptional("digital_card_art_token")

    /**
     * A list of events related to the tokenization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<TokenizationEvent>> = events.getOptional("events")

    /**
     * The network's unique reference for the card that is tokenized.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentAccountReferenceId(): Optional<String> =
        paymentAccountReferenceId.getOptional("payment_account_reference_id")

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
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dpan].
     *
     * Unlike [dpan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dpan") @ExcludeMissing fun _dpan(): JsonField<String> = dpan

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tokenRequestorName].
     *
     * Unlike [tokenRequestorName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    fun _tokenRequestorName(): JsonField<TokenRequestorName> = tokenRequestorName

    /**
     * Returns the raw JSON value of [tokenUniqueReference].
     *
     * Unlike [tokenUniqueReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_unique_reference")
    @ExcludeMissing
    fun _tokenUniqueReference(): JsonField<String> = tokenUniqueReference

    /**
     * Returns the raw JSON value of [tokenizationChannel].
     *
     * Unlike [tokenizationChannel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_channel")
    @ExcludeMissing
    fun _tokenizationChannel(): JsonField<TokenizationChannel> = tokenizationChannel

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [digitalCardArtToken].
     *
     * Unlike [digitalCardArtToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken(): JsonField<String> = digitalCardArtToken

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<TokenizationEvent>> = events

    /**
     * Returns the raw JSON value of [paymentAccountReferenceId].
     *
     * Unlike [paymentAccountReferenceId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("payment_account_reference_id")
    @ExcludeMissing
    fun _paymentAccountReferenceId(): JsonField<String> = paymentAccountReferenceId

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
         * Returns a mutable builder for constructing an instance of [Tokenization].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardToken()
         * .createdAt()
         * .dpan()
         * .status()
         * .tokenRequestorName()
         * .tokenUniqueReference()
         * .tokenizationChannel()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Tokenization]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dpan: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var tokenRequestorName: JsonField<TokenRequestorName>? = null
        private var tokenUniqueReference: JsonField<String>? = null
        private var tokenizationChannel: JsonField<TokenizationChannel>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<TokenizationEvent>>? = null
        private var paymentAccountReferenceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenization: Tokenization) = apply {
            token = tokenization.token
            accountToken = tokenization.accountToken
            cardToken = tokenization.cardToken
            createdAt = tokenization.createdAt
            dpan = tokenization.dpan
            status = tokenization.status
            tokenRequestorName = tokenization.tokenRequestorName
            tokenUniqueReference = tokenization.tokenUniqueReference
            tokenizationChannel = tokenization.tokenizationChannel
            updatedAt = tokenization.updatedAt
            digitalCardArtToken = tokenization.digitalCardArtToken
            events = tokenization.events.map { it.toMutableList() }
            paymentAccountReferenceId = tokenization.paymentAccountReferenceId
            additionalProperties = tokenization.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a Tokenization */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The account token associated with the card being tokenized. */
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

        /** The card token associated with the card being tokenized. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time when the tokenization first occurred. UTC time zone. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The dynamic pan assigned to the token by the network. */
        fun dpan(dpan: String?) = dpan(JsonField.ofNullable(dpan))

        /** Alias for calling [Builder.dpan] with `dpan.orElse(null)`. */
        fun dpan(dpan: Optional<String>) = dpan(dpan.getOrNull())

        /**
         * Sets [Builder.dpan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dpan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dpan(dpan: JsonField<String>) = apply { this.dpan = dpan }

        /** The status of the tokenization request */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
        fun tokenRequestorName(tokenRequestorName: TokenRequestorName) =
            tokenRequestorName(JsonField.of(tokenRequestorName))

        /**
         * Sets [Builder.tokenRequestorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestorName] with a well-typed
         * [TokenRequestorName] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenRequestorName(tokenRequestorName: JsonField<TokenRequestorName>) = apply {
            this.tokenRequestorName = tokenRequestorName
        }

        /** The network's unique reference for the tokenization. */
        fun tokenUniqueReference(tokenUniqueReference: String) =
            tokenUniqueReference(JsonField.of(tokenUniqueReference))

        /**
         * Sets [Builder.tokenUniqueReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUniqueReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenUniqueReference(tokenUniqueReference: JsonField<String>) = apply {
            this.tokenUniqueReference = tokenUniqueReference
        }

        /** The channel through which the tokenization was made. */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel) =
            tokenizationChannel(JsonField.of(tokenizationChannel))

        /**
         * Sets [Builder.tokenizationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationChannel] with a well-typed
         * [TokenizationChannel] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenizationChannel(tokenizationChannel: JsonField<TokenizationChannel>) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
         * This will be null if the tokenization was created without an associated digital card art.
         * See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Sets [Builder.digitalCardArtToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalCardArtToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** A list of events related to the tokenization. */
        fun events(events: List<TokenizationEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<TokenizationEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun events(events: JsonField<List<TokenizationEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [TokenizationEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: TokenizationEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** The network's unique reference for the card that is tokenized. */
        fun paymentAccountReferenceId(paymentAccountReferenceId: String?) =
            paymentAccountReferenceId(JsonField.ofNullable(paymentAccountReferenceId))

        /**
         * Alias for calling [Builder.paymentAccountReferenceId] with
         * `paymentAccountReferenceId.orElse(null)`.
         */
        fun paymentAccountReferenceId(paymentAccountReferenceId: Optional<String>) =
            paymentAccountReferenceId(paymentAccountReferenceId.getOrNull())

        /**
         * Sets [Builder.paymentAccountReferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAccountReferenceId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentAccountReferenceId(paymentAccountReferenceId: JsonField<String>) = apply {
            this.paymentAccountReferenceId = paymentAccountReferenceId
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
         * Returns an immutable instance of [Tokenization].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .cardToken()
         * .createdAt()
         * .dpan()
         * .status()
         * .tokenRequestorName()
         * .tokenUniqueReference()
         * .tokenizationChannel()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Tokenization =
            Tokenization(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("cardToken", cardToken),
                checkRequired("createdAt", createdAt),
                checkRequired("dpan", dpan),
                checkRequired("status", status),
                checkRequired("tokenRequestorName", tokenRequestorName),
                checkRequired("tokenUniqueReference", tokenUniqueReference),
                checkRequired("tokenizationChannel", tokenizationChannel),
                checkRequired("updatedAt", updatedAt),
                digitalCardArtToken,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                paymentAccountReferenceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Tokenization = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        cardToken()
        createdAt()
        dpan()
        status().validate()
        tokenRequestorName().validate()
        tokenUniqueReference()
        tokenizationChannel().validate()
        updatedAt()
        digitalCardArtToken()
        events().ifPresent { it.forEach { it.validate() } }
        paymentAccountReferenceId()
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
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dpan.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenRequestorName.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenUniqueReference.asKnown().isPresent) 1 else 0) +
            (tokenizationChannel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (digitalCardArtToken.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentAccountReferenceId.asKnown().isPresent) 1 else 0)

    /** The status of the tokenization request */
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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val DEACTIVATED = of("DEACTIVATED")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmField val PAUSED = of("PAUSED")

            @JvmField val PENDING_2_FA = of("PENDING_2FA")

            @JvmField val PENDING_ACTIVATION = of("PENDING_ACTIVATION")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
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
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
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
                ACTIVE -> Value.ACTIVE
                DEACTIVATED -> Value.DEACTIVATED
                INACTIVE -> Value.INACTIVE
                PAUSED -> Value.PAUSED
                PENDING_2_FA -> Value.PENDING_2_FA
                PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                UNKNOWN -> Value.UNKNOWN
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
                ACTIVE -> Known.ACTIVE
                DEACTIVATED -> Known.DEACTIVATED
                INACTIVE -> Known.INACTIVE
                PAUSED -> Known.PAUSED
                PENDING_2_FA -> Known.PENDING_2_FA
                PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                UNKNOWN -> Known.UNKNOWN
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    class TokenRequestorName
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

            @JvmField val AMAZON_ONE = of("AMAZON_ONE")

            @JvmField val ANDROID_PAY = of("ANDROID_PAY")

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val FACEBOOK = of("FACEBOOK")

            @JvmField val FITBIT_PAY = of("FITBIT_PAY")

            @JvmField val GARMIN_PAY = of("GARMIN_PAY")

            @JvmField val MICROSOFT_PAY = of("MICROSOFT_PAY")

            @JvmField val NETFLIX = of("NETFLIX")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA_CHECKOUT = of("VISA_CHECKOUT")

            @JvmStatic fun of(value: String) = TokenRequestorName(JsonField.of(value))
        }

        /** An enum containing [TokenRequestorName]'s known values. */
        enum class Known {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
        }

        /**
         * An enum containing [TokenRequestorName]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenRequestorName] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
            /**
             * An enum member indicating that [TokenRequestorName] was instantiated with an unknown
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
                AMAZON_ONE -> Value.AMAZON_ONE
                ANDROID_PAY -> Value.ANDROID_PAY
                APPLE_PAY -> Value.APPLE_PAY
                FACEBOOK -> Value.FACEBOOK
                FITBIT_PAY -> Value.FITBIT_PAY
                GARMIN_PAY -> Value.GARMIN_PAY
                MICROSOFT_PAY -> Value.MICROSOFT_PAY
                NETFLIX -> Value.NETFLIX
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                UNKNOWN -> Value.UNKNOWN
                VISA_CHECKOUT -> Value.VISA_CHECKOUT
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
                AMAZON_ONE -> Known.AMAZON_ONE
                ANDROID_PAY -> Known.ANDROID_PAY
                APPLE_PAY -> Known.APPLE_PAY
                FACEBOOK -> Known.FACEBOOK
                FITBIT_PAY -> Known.FITBIT_PAY
                GARMIN_PAY -> Known.GARMIN_PAY
                MICROSOFT_PAY -> Known.MICROSOFT_PAY
                NETFLIX -> Known.NETFLIX
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                UNKNOWN -> Known.UNKNOWN
                VISA_CHECKOUT -> Known.VISA_CHECKOUT
                else -> throw LithicInvalidDataException("Unknown TokenRequestorName: $value")
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

        fun validate(): TokenRequestorName = apply {
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

            return /* spotless:off */ other is TokenRequestorName && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The channel through which the tokenization was made. */
    class TokenizationChannel
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

            @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmStatic fun of(value: String) = TokenizationChannel(JsonField.of(value))
        }

        /** An enum containing [TokenizationChannel]'s known values. */
        enum class Known {
            DIGITAL_WALLET,
            MERCHANT,
        }

        /**
         * An enum containing [TokenizationChannel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenizationChannel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIGITAL_WALLET,
            MERCHANT,
            /**
             * An enum member indicating that [TokenizationChannel] was instantiated with an unknown
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
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                MERCHANT -> Value.MERCHANT
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
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationChannel: $value")
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

        fun validate(): TokenizationChannel = apply {
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

            return /* spotless:off */ other is TokenizationChannel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TokenizationEvent
    private constructor(
        private val token: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(token, createdAt, result, type, mutableMapOf())

        /**
         * Globally unique identifier for a Tokenization Event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * Date and time when the tokenization event first occurred. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Enum representing the result of the tokenization event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun result(): Optional<Result> = result.getOptional("result")

        /**
         * Enum representing the type of tokenization event that occurred
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [TokenizationEvent]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenizationEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenizationEvent: TokenizationEvent) = apply {
                token = tokenizationEvent.token
                createdAt = tokenizationEvent.createdAt
                result = tokenizationEvent.result
                type = tokenizationEvent.type
                additionalProperties = tokenizationEvent.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for a Tokenization Event */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Date and time when the tokenization event first occurred. UTC time zone. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Enum representing the result of the tokenization event */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Enum representing the type of tokenization event that occurred */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [TokenizationEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TokenizationEvent =
                TokenizationEvent(
                    token,
                    createdAt,
                    result,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TokenizationEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            createdAt()
            result().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Enum representing the result of the tokenization event */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val NOTIFICATION_DELIVERED = of("NOTIFICATION_DELIVERED")

                @JvmField
                val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

                @JvmField val TOKEN_ACTIVATED = of("TOKEN_ACTIVATED")

                @JvmField val TOKEN_CREATED = of("TOKEN_CREATED")

                @JvmField val TOKEN_DEACTIVATED = of("TOKEN_DEACTIVATED")

                @JvmField val TOKEN_INACTIVE = of("TOKEN_INACTIVE")

                @JvmField val TOKEN_STATE_UNKNOWN = of("TOKEN_STATE_UNKNOWN")

                @JvmField val TOKEN_SUSPENDED = of("TOKEN_SUSPENDED")

                @JvmField val TOKEN_UPDATED = of("TOKEN_UPDATED")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    NOTIFICATION_DELIVERED -> Value.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Value.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Value.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Value.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Value.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Value.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Value.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Value.TOKEN_UPDATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    NOTIFICATION_DELIVERED -> Known.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Known.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Known.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Known.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Known.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Known.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Known.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Known.TOKEN_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Result = apply {
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

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Enum representing the type of tokenization event that occurred */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TOKENIZATION_2_FA = of("TOKENIZATION_2FA")

                @JvmField val TOKENIZATION_AUTHORIZATION = of("TOKENIZATION_AUTHORIZATION")

                @JvmField val TOKENIZATION_DECISIONING = of("TOKENIZATION_DECISIONING")

                @JvmField val TOKENIZATION_ELIGIBILITY_CHECK = of("TOKENIZATION_ELIGIBILITY_CHECK")

                @JvmField val TOKENIZATION_UPDATED = of("TOKENIZATION_UPDATED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TOKENIZATION_2_FA -> Value.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Value.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Value.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Value.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TOKENIZATION_2_FA -> Known.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Known.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Known.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Known.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationEvent && token == other.token && createdAt == other.createdAt && result == other.result && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, createdAt, result, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationEvent{token=$token, createdAt=$createdAt, result=$result, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tokenization && token == other.token && accountToken == other.accountToken && cardToken == other.cardToken && createdAt == other.createdAt && dpan == other.dpan && status == other.status && tokenRequestorName == other.tokenRequestorName && tokenUniqueReference == other.tokenUniqueReference && tokenizationChannel == other.tokenizationChannel && updatedAt == other.updatedAt && digitalCardArtToken == other.digitalCardArtToken && events == other.events && paymentAccountReferenceId == other.paymentAccountReferenceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, cardToken, createdAt, dpan, status, tokenRequestorName, tokenUniqueReference, tokenizationChannel, updatedAt, digitalCardArtToken, events, paymentAccountReferenceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tokenization{token=$token, accountToken=$accountToken, cardToken=$cardToken, createdAt=$createdAt, dpan=$dpan, status=$status, tokenRequestorName=$tokenRequestorName, tokenUniqueReference=$tokenUniqueReference, tokenizationChannel=$tokenizationChannel, updatedAt=$updatedAt, digitalCardArtToken=$digitalCardArtToken, events=$events, paymentAccountReferenceId=$paymentAccountReferenceId, additionalProperties=$additionalProperties}"
}
