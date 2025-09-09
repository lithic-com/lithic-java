// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V2RetrieveResponse
private constructor(
    private val token: JsonField<String>,
    private val accountTokens: JsonField<List<String>>,
    private val businessAccountTokens: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val currentVersion: JsonField<CurrentVersion>,
    private val draftVersion: JsonField<DraftVersion>,
    private val eventStream: JsonField<EventStream>,
    private val name: JsonField<String>,
    private val programLevel: JsonField<Boolean>,
    private val state: JsonField<AuthRuleState>,
    private val type: JsonField<AuthRuleType>,
    private val excludedCardTokens: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_tokens")
        @ExcludeMissing
        accountTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("business_account_tokens")
        @ExcludeMissing
        businessAccountTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("card_tokens")
        @ExcludeMissing
        cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("current_version")
        @ExcludeMissing
        currentVersion: JsonField<CurrentVersion> = JsonMissing.of(),
        @JsonProperty("draft_version")
        @ExcludeMissing
        draftVersion: JsonField<DraftVersion> = JsonMissing.of(),
        @JsonProperty("event_stream")
        @ExcludeMissing
        eventStream: JsonField<EventStream> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("program_level")
        @ExcludeMissing
        programLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<AuthRuleState> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<AuthRuleType> = JsonMissing.of(),
        @JsonProperty("excluded_card_tokens")
        @ExcludeMissing
        excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        token,
        accountTokens,
        businessAccountTokens,
        cardTokens,
        currentVersion,
        draftVersion,
        eventStream,
        name,
        programLevel,
        state,
        type,
        excludedCardTokens,
        mutableMapOf(),
    )

    /**
     * Auth Rule Token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Account tokens to which the Auth Rule applies.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

    /**
     * Business Account tokens to which the Auth Rule applies.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessAccountTokens(): List<String> =
        businessAccountTokens.getRequired("business_account_tokens")

    /**
     * Card tokens to which the Auth Rule applies.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentVersion(): Optional<CurrentVersion> = currentVersion.getOptional("current_version")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun draftVersion(): Optional<DraftVersion> = draftVersion.getOptional("draft_version")

    /**
     * The event stream during which the rule will be evaluated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventStream(): EventStream = eventStream.getRequired("event_stream")

    /**
     * Auth Rule Name
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Whether the Auth Rule applies to all authorizations on the card program.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programLevel(): Boolean = programLevel.getRequired("program_level")

    /**
     * The state of the Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): AuthRuleState = state.getRequired("state")

    /**
     * The type of Auth Rule. For certain rule types, this determines the event stream during which
     * it will be evaluated. For rules that can be applied to one of several event streams, the
     * effective one is defined by the separate `event_stream` field.
     * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
     * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
     * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
     * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AuthRuleType = type.getRequired("type")

    /**
     * Card tokens to which the Auth Rule does not apply.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedCardTokens(): Optional<List<String>> =
        excludedCardTokens.getOptional("excluded_card_tokens")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountTokens].
     *
     * Unlike [accountTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_tokens")
    @ExcludeMissing
    fun _accountTokens(): JsonField<List<String>> = accountTokens

    /**
     * Returns the raw JSON value of [businessAccountTokens].
     *
     * Unlike [businessAccountTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("business_account_tokens")
    @ExcludeMissing
    fun _businessAccountTokens(): JsonField<List<String>> = businessAccountTokens

    /**
     * Returns the raw JSON value of [cardTokens].
     *
     * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    /**
     * Returns the raw JSON value of [currentVersion].
     *
     * Unlike [currentVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_version")
    @ExcludeMissing
    fun _currentVersion(): JsonField<CurrentVersion> = currentVersion

    /**
     * Returns the raw JSON value of [draftVersion].
     *
     * Unlike [draftVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("draft_version")
    @ExcludeMissing
    fun _draftVersion(): JsonField<DraftVersion> = draftVersion

    /**
     * Returns the raw JSON value of [eventStream].
     *
     * Unlike [eventStream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_stream")
    @ExcludeMissing
    fun _eventStream(): JsonField<EventStream> = eventStream

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [programLevel].
     *
     * Unlike [programLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("program_level")
    @ExcludeMissing
    fun _programLevel(): JsonField<Boolean> = programLevel

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<AuthRuleState> = state

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

    /**
     * Returns the raw JSON value of [excludedCardTokens].
     *
     * Unlike [excludedCardTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("excluded_card_tokens")
    @ExcludeMissing
    fun _excludedCardTokens(): JsonField<List<String>> = excludedCardTokens

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
         * Returns a mutable builder for constructing an instance of [V2RetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountTokens()
         * .businessAccountTokens()
         * .cardTokens()
         * .currentVersion()
         * .draftVersion()
         * .eventStream()
         * .name()
         * .programLevel()
         * .state()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2RetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountTokens: JsonField<MutableList<String>>? = null
        private var businessAccountTokens: JsonField<MutableList<String>>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var currentVersion: JsonField<CurrentVersion>? = null
        private var draftVersion: JsonField<DraftVersion>? = null
        private var eventStream: JsonField<EventStream>? = null
        private var name: JsonField<String>? = null
        private var programLevel: JsonField<Boolean>? = null
        private var state: JsonField<AuthRuleState>? = null
        private var type: JsonField<AuthRuleType>? = null
        private var excludedCardTokens: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2RetrieveResponse: V2RetrieveResponse) = apply {
            token = v2RetrieveResponse.token
            accountTokens = v2RetrieveResponse.accountTokens.map { it.toMutableList() }
            businessAccountTokens =
                v2RetrieveResponse.businessAccountTokens.map { it.toMutableList() }
            cardTokens = v2RetrieveResponse.cardTokens.map { it.toMutableList() }
            currentVersion = v2RetrieveResponse.currentVersion
            draftVersion = v2RetrieveResponse.draftVersion
            eventStream = v2RetrieveResponse.eventStream
            name = v2RetrieveResponse.name
            programLevel = v2RetrieveResponse.programLevel
            state = v2RetrieveResponse.state
            type = v2RetrieveResponse.type
            excludedCardTokens = v2RetrieveResponse.excludedCardTokens.map { it.toMutableList() }
            additionalProperties = v2RetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Token */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /**
         * Sets [Builder.accountTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accountTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountToken(accountToken: String) = apply {
            accountTokens =
                (accountTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountTokens", it).add(accountToken)
                }
        }

        /** Business Account tokens to which the Auth Rule applies. */
        fun businessAccountTokens(businessAccountTokens: List<String>) =
            businessAccountTokens(JsonField.of(businessAccountTokens))

        /**
         * Sets [Builder.businessAccountTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessAccountTokens] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessAccountTokens(businessAccountTokens: JsonField<List<String>>) = apply {
            this.businessAccountTokens = businessAccountTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [businessAccountTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBusinessAccountToken(businessAccountToken: String) = apply {
            businessAccountTokens =
                (businessAccountTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("businessAccountTokens", it).add(businessAccountToken)
                }
        }

        /** Card tokens to which the Auth Rule applies. */
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

        fun currentVersion(currentVersion: CurrentVersion?) =
            currentVersion(JsonField.ofNullable(currentVersion))

        /** Alias for calling [Builder.currentVersion] with `currentVersion.orElse(null)`. */
        fun currentVersion(currentVersion: Optional<CurrentVersion>) =
            currentVersion(currentVersion.getOrNull())

        /**
         * Sets [Builder.currentVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentVersion] with a well-typed [CurrentVersion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentVersion(currentVersion: JsonField<CurrentVersion>) = apply {
            this.currentVersion = currentVersion
        }

        fun draftVersion(draftVersion: DraftVersion?) =
            draftVersion(JsonField.ofNullable(draftVersion))

        /** Alias for calling [Builder.draftVersion] with `draftVersion.orElse(null)`. */
        fun draftVersion(draftVersion: Optional<DraftVersion>) =
            draftVersion(draftVersion.getOrNull())

        /**
         * Sets [Builder.draftVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.draftVersion] with a well-typed [DraftVersion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun draftVersion(draftVersion: JsonField<DraftVersion>) = apply {
            this.draftVersion = draftVersion
        }

        /** The event stream during which the rule will be evaluated. */
        fun eventStream(eventStream: EventStream) = eventStream(JsonField.of(eventStream))

        /**
         * Sets [Builder.eventStream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventStream] with a well-typed [EventStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventStream(eventStream: JsonField<EventStream>) = apply {
            this.eventStream = eventStream
        }

        /** Auth Rule Name */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /**
         * Sets [Builder.programLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programLevel] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        /** The state of the Auth Rule */
        fun state(state: AuthRuleState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [AuthRuleState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun state(state: JsonField<AuthRuleState>) = apply { this.state = state }

        /**
         * The type of Auth Rule. For certain rule types, this determines the event stream during
         * which it will be evaluated. For rules that can be applied to one of several event
         * streams, the effective one is defined by the separate `event_stream` field.
         * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
         * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
         * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
         * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
         */
        fun type(type: AuthRuleType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AuthRuleType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

        /** Card tokens to which the Auth Rule does not apply. */
        fun excludedCardTokens(excludedCardTokens: List<String>) =
            excludedCardTokens(JsonField.of(excludedCardTokens))

        /**
         * Sets [Builder.excludedCardTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedCardTokens] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun excludedCardTokens(excludedCardTokens: JsonField<List<String>>) = apply {
            this.excludedCardTokens = excludedCardTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedCardTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedCardToken(excludedCardToken: String) = apply {
            excludedCardTokens =
                (excludedCardTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedCardTokens", it).add(excludedCardToken)
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
         * Returns an immutable instance of [V2RetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountTokens()
         * .businessAccountTokens()
         * .cardTokens()
         * .currentVersion()
         * .draftVersion()
         * .eventStream()
         * .name()
         * .programLevel()
         * .state()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2RetrieveResponse =
            V2RetrieveResponse(
                checkRequired("token", token),
                checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                checkRequired("businessAccountTokens", businessAccountTokens).map {
                    it.toImmutable()
                },
                checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                checkRequired("currentVersion", currentVersion),
                checkRequired("draftVersion", draftVersion),
                checkRequired("eventStream", eventStream),
                checkRequired("name", name),
                checkRequired("programLevel", programLevel),
                checkRequired("state", state),
                checkRequired("type", type),
                (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2RetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountTokens()
        businessAccountTokens()
        cardTokens()
        currentVersion().ifPresent { it.validate() }
        draftVersion().ifPresent { it.validate() }
        eventStream().validate()
        name()
        programLevel()
        state().validate()
        type().validate()
        excludedCardTokens()
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
            (accountTokens.asKnown().getOrNull()?.size ?: 0) +
            (businessAccountTokens.asKnown().getOrNull()?.size ?: 0) +
            (cardTokens.asKnown().getOrNull()?.size ?: 0) +
            (currentVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (draftVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (eventStream.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (programLevel.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (excludedCardTokens.asKnown().getOrNull()?.size ?: 0)

    class CurrentVersion
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(parameters, version, mutableMapOf())

        /**
         * Parameters for the Auth Rule
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /**
         * The version of the rule, this is incremented whenever the rule's parameters change.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Long = version.getRequired("version")

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
             * Returns a mutable builder for constructing an instance of [CurrentVersion].
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CurrentVersion]. */
        class Builder internal constructor() {

            private var parameters: JsonField<Parameters>? = null
            private var version: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentVersion: CurrentVersion) = apply {
                parameters = currentVersion.parameters
                version = currentVersion.version
                additionalProperties = currentVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditionalBlock(conditionalBlock)`.
             */
            fun parameters(conditionalBlock: ConditionalBlockParameters) =
                parameters(Parameters.ofConditionalBlock(conditionalBlock))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
             */
            fun parameters(velocityLimitParams: VelocityLimitParams) =
                parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

            /** Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`. */
            fun parameters(merchantLock: MerchantLockParameters) =
                parameters(Parameters.ofMerchantLock(merchantLock))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
             */
            fun parameters(conditional3dsAction: Conditional3dsActionParameters) =
                parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)`.
             */
            fun parameters(
                conditionalAuthorizationAction: Parameters.ConditionalAuthorizationActionParameters
            ) =
                parameters(
                    Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)
                )

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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
             * Returns an immutable instance of [CurrentVersion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CurrentVersion =
                CurrentVersion(
                    checkRequired("parameters", parameters),
                    checkRequired("version", version),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CurrentVersion = apply {
            if (validated) {
                return@apply
            }

            parameters().validate()
            version()
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
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        /** Parameters for the Auth Rule */
        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlock: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val merchantLock: MerchantLockParameters? = null,
            private val conditional3dsAction: Conditional3dsActionParameters? = null,
            private val conditionalAuthorizationAction: ConditionalAuthorizationActionParameters? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlock)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun merchantLock(): Optional<MerchantLockParameters> = Optional.ofNullable(merchantLock)

            fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
                Optional.ofNullable(conditional3dsAction)

            fun conditionalAuthorizationAction():
                Optional<ConditionalAuthorizationActionParameters> =
                Optional.ofNullable(conditionalAuthorizationAction)

            fun isConditionalBlock(): Boolean = conditionalBlock != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun isMerchantLock(): Boolean = merchantLock != null

            fun isConditional3dsAction(): Boolean = conditional3dsAction != null

            fun isConditionalAuthorizationAction(): Boolean = conditionalAuthorizationAction != null

            fun asConditionalBlock(): ConditionalBlockParameters =
                conditionalBlock.getOrThrow("conditionalBlock")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun asMerchantLock(): MerchantLockParameters = merchantLock.getOrThrow("merchantLock")

            fun asConditional3dsAction(): Conditional3dsActionParameters =
                conditional3dsAction.getOrThrow("conditional3dsAction")

            fun asConditionalAuthorizationAction(): ConditionalAuthorizationActionParameters =
                conditionalAuthorizationAction.getOrThrow("conditionalAuthorizationAction")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    merchantLock != null -> visitor.visitMerchantLock(merchantLock)
                    conditional3dsAction != null ->
                        visitor.visitConditional3dsAction(conditional3dsAction)
                    conditionalAuthorizationAction != null ->
                        visitor.visitConditionalAuthorizationAction(conditionalAuthorizationAction)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitConditionalBlock(
                            conditionalBlock: ConditionalBlockParameters
                        ) {
                            conditionalBlock.validate()
                        }

                        override fun visitVelocityLimitParams(
                            velocityLimitParams: VelocityLimitParams
                        ) {
                            velocityLimitParams.validate()
                        }

                        override fun visitMerchantLock(merchantLock: MerchantLockParameters) {
                            merchantLock.validate()
                        }

                        override fun visitConditional3dsAction(
                            conditional3dsAction: Conditional3dsActionParameters
                        ) {
                            conditional3dsAction.validate()
                        }

                        override fun visitConditionalAuthorizationAction(
                            conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                        ) {
                            conditionalAuthorizationAction.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitConditionalBlock(
                            conditionalBlock: ConditionalBlockParameters
                        ) = conditionalBlock.validity()

                        override fun visitVelocityLimitParams(
                            velocityLimitParams: VelocityLimitParams
                        ) = velocityLimitParams.validity()

                        override fun visitMerchantLock(merchantLock: MerchantLockParameters) =
                            merchantLock.validity()

                        override fun visitConditional3dsAction(
                            conditional3dsAction: Conditional3dsActionParameters
                        ) = conditional3dsAction.validity()

                        override fun visitConditionalAuthorizationAction(
                            conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                        ) = conditionalAuthorizationAction.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameters &&
                    conditionalBlock == other.conditionalBlock &&
                    velocityLimitParams == other.velocityLimitParams &&
                    merchantLock == other.merchantLock &&
                    conditional3dsAction == other.conditional3dsAction &&
                    conditionalAuthorizationAction == other.conditionalAuthorizationAction
            }

            override fun hashCode(): Int =
                Objects.hash(
                    conditionalBlock,
                    velocityLimitParams,
                    merchantLock,
                    conditional3dsAction,
                    conditionalAuthorizationAction,
                )

            override fun toString(): String =
                when {
                    conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    merchantLock != null -> "Parameters{merchantLock=$merchantLock}"
                    conditional3dsAction != null ->
                        "Parameters{conditional3dsAction=$conditional3dsAction}"
                    conditionalAuthorizationAction != null ->
                        "Parameters{conditionalAuthorizationAction=$conditionalAuthorizationAction}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                @JvmStatic
                fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                    Parameters(conditionalBlock = conditionalBlock)

                @JvmStatic
                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)

                @JvmStatic
                fun ofMerchantLock(merchantLock: MerchantLockParameters) =
                    Parameters(merchantLock = merchantLock)

                @JvmStatic
                fun ofConditional3dsAction(conditional3dsAction: Conditional3dsActionParameters) =
                    Parameters(conditional3dsAction = conditional3dsAction)

                @JvmStatic
                fun ofConditionalAuthorizationAction(
                    conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                ) = Parameters(conditionalAuthorizationAction = conditionalAuthorizationAction)
            }

            /**
             * An interface that defines how to map each variant of [Parameters] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun visitMerchantLock(merchantLock: MerchantLockParameters): T

                fun visitConditional3dsAction(
                    conditional3dsAction: Conditional3dsActionParameters
                ): T

                fun visitConditionalAuthorizationAction(
                    conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                ): T

                /**
                 * Maps an unknown variant of [Parameters] to a value of type [T].
                 *
                 * An instance of [Parameters] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LithicInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>())
                                    ?.let { Parameters(conditionalBlock = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())?.let {
                                    Parameters(velocityLimitParams = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                    ?.let { Parameters(merchantLock = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<Conditional3dsActionParameters>(),
                                    )
                                    ?.let { Parameters(conditional3dsAction = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<ConditionalAuthorizationActionParameters>(),
                                    )
                                    ?.let {
                                        Parameters(
                                            conditionalAuthorizationAction = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Parameters(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.conditionalBlock != null ->
                            generator.writeObject(value.conditionalBlock)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value.merchantLock != null -> generator.writeObject(value.merchantLock)
                        value.conditional3dsAction != null ->
                            generator.writeObject(value.conditional3dsAction)
                        value.conditionalAuthorizationAction != null ->
                            generator.writeObject(value.conditionalAuthorizationAction)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }

            class ConditionalAuthorizationActionParameters
            private constructor(
                private val action: JsonField<Action>,
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("conditions")
                    @ExcludeMissing
                    conditions: JsonField<List<Condition>> = JsonMissing.of(),
                ) : this(action, conditions, mutableMapOf())

                /**
                 * The action to take if the conditions are met.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [conditions].
                 *
                 * Unlike [conditions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conditions")
                @ExcludeMissing
                fun _conditions(): JsonField<List<Condition>> = conditions

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
                     * [ConditionalAuthorizationActionParameters].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .conditions()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ConditionalAuthorizationActionParameters]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var conditions: JsonField<MutableList<Condition>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        conditionalAuthorizationActionParameters:
                            ConditionalAuthorizationActionParameters
                    ) = apply {
                        action = conditionalAuthorizationActionParameters.action
                        conditions =
                            conditionalAuthorizationActionParameters.conditions.map {
                                it.toMutableList()
                            }
                        additionalProperties =
                            conditionalAuthorizationActionParameters.additionalProperties
                                .toMutableMap()
                    }

                    /** The action to take if the conditions are met. */
                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    /**
                     * Sets [Builder.conditions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conditions] with a well-typed
                     * `List<Condition>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Condition] to [conditions].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCondition(condition: Condition) = apply {
                        conditions =
                            (conditions ?: JsonField.of(mutableListOf())).also {
                                checkKnown("conditions", it).add(condition)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ConditionalAuthorizationActionParameters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .conditions()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ConditionalAuthorizationActionParameters =
                        ConditionalAuthorizationActionParameters(
                            checkRequired("action", action),
                            checkRequired("conditions", conditions).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ConditionalAuthorizationActionParameters = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    conditions().forEach { it.validate() }
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** The action to take if the conditions are met. */
                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DECLINE = of("DECLINE")

                        @JvmField val CHALLENGE = of("CHALLENGE")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        DECLINE,
                        CHALLENGE,
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DECLINE,
                        CHALLENGE,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DECLINE -> Value.DECLINE
                            CHALLENGE -> Value.CHALLENGE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DECLINE -> Known.DECLINE
                            CHALLENGE -> Known.CHALLENGE
                            else -> throw LithicInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        attribute: JsonField<Attribute> = JsonMissing.of(),
                        @JsonProperty("operation")
                        @ExcludeMissing
                        operation: JsonField<Operation> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Value> = JsonMissing.of(),
                    ) : this(attribute, operation, value, mutableMapOf())

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency
                     *   of the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the
                     *   trailing 15 minutes before the authorization.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     * - `CARD_STATE`: The current state of the card associated with the
                     *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                     *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                     * - `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction.
                     *   Valid values are `TRUE`, `FALSE`.
                     * - `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`,
                     *   `OK`, `BLOCKED`.
                     * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates the
                     *   source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                     *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                     * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                     *   indicates the source of the token. Valid values are `CARDHOLDER`,
                     *   `MERCHANT`, `UNKNOWN`.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun attribute(): Optional<Attribute> = attribute.getOptional("attribute")

                    /**
                     * The operation to apply to the attribute
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun operation(): Optional<Operation> = operation.getOptional("operation")

                    /**
                     * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Value> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [attribute].
                     *
                     * Unlike [attribute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /**
                     * Returns the raw JSON value of [operation].
                     *
                     * Unlike [operation], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operation")
                    @ExcludeMissing
                    fun _operation(): JsonField<Operation> = operation

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                         * Returns a mutable builder for constructing an instance of [Condition].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Condition]. */
                    class Builder internal constructor() {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(condition: Condition) = apply {
                            attribute = condition.attribute
                            operation = condition.operation
                            value = condition.value
                            additionalProperties = condition.additionalProperties.toMutableMap()
                        }

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in
                         *   the trailing 15 minutes before the authorization.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         * - `CARD_STATE`: The current state of the card associated with the
                         *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                         *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                         * - `PIN_ENTERED`: Indicates whether a PIN was entered during the
                         *   transaction. Valid values are `TRUE`, `FALSE`.
                         * - `PIN_STATUS`: The current state of card's PIN. Valid values are
                         *   `NOT_SET`, `OK`, `BLOCKED`.
                         * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates
                         *   the source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                         *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                         * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                         *   indicates the source of the token. Valid values are `CARDHOLDER`,
                         *   `MERCHANT`, `UNKNOWN`.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * Sets [Builder.attribute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attribute] with a well-typed [Attribute]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /**
                         * Sets [Builder.operation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operation] with a well-typed [Operation]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Value] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** Alias for calling [value] with `Value.ofRegex(regex)`. */
                        fun value(regex: String) = value(Value.ofRegex(regex))

                        /** Alias for calling [value] with `Value.ofNumber(number)`. */
                        fun value(number: Long) = value(Value.ofNumber(number))

                        /**
                         * Alias for calling [value] with `Value.ofListOfStrings(listOfStrings)`.
                         */
                        fun valueOfListOfStrings(listOfStrings: List<String>) =
                            value(Value.ofListOfStrings(listOfStrings))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Condition].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute().ifPresent { it.validate() }
                        operation().ifPresent { it.validate() }
                        value().ifPresent { it.validate() }
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
                        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                            (operation.asKnown().getOrNull()?.validity() ?: 0) +
                            (value.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency
                     *   of the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the
                     *   trailing 15 minutes before the authorization.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     * - `CARD_STATE`: The current state of the card associated with the
                     *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                     *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                     * - `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction.
                     *   Valid values are `TRUE`, `FALSE`.
                     * - `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`,
                     *   `OK`, `BLOCKED`.
                     * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates the
                     *   source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                     *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                     * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                     *   indicates the source of the token. Valid values are `CARDHOLDER`,
                     *   `MERCHANT`, `UNKNOWN`.
                     */
                    class Attribute
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val MCC = of("MCC")

                            @JvmField val COUNTRY = of("COUNTRY")

                            @JvmField val CURRENCY = of("CURRENCY")

                            @JvmField val MERCHANT_ID = of("MERCHANT_ID")

                            @JvmField val DESCRIPTOR = of("DESCRIPTOR")

                            @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            @JvmField val RISK_SCORE = of("RISK_SCORE")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_15_M = of("CARD_TRANSACTION_COUNT_15M")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

                            @JvmField val CARD_STATE = of("CARD_STATE")

                            @JvmField val PIN_ENTERED = of("PIN_ENTERED")

                            @JvmField val PIN_STATUS = of("PIN_STATUS")

                            @JvmField val WALLET_TYPE = of("WALLET_TYPE")

                            @JvmField val TRANSACTION_INITIATOR = of("TRANSACTION_INITIATOR")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        /** An enum containing [Attribute]'s known values. */
                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_15_M,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            CARD_STATE,
                            PIN_ENTERED,
                            PIN_STATUS,
                            WALLET_TYPE,
                            TRANSACTION_INITIATOR,
                        }

                        /**
                         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Attribute] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_15_M,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            CARD_STATE,
                            PIN_ENTERED,
                            PIN_STATUS,
                            WALLET_TYPE,
                            TRANSACTION_INITIATOR,
                            /**
                             * An enum member indicating that [Attribute] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                CARD_TRANSACTION_COUNT_15_M -> Value.CARD_TRANSACTION_COUNT_15_M
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
                                CARD_STATE -> Value.CARD_STATE
                                PIN_ENTERED -> Value.PIN_ENTERED
                                PIN_STATUS -> Value.PIN_STATUS
                                WALLET_TYPE -> Value.WALLET_TYPE
                                TRANSACTION_INITIATOR -> Value.TRANSACTION_INITIATOR
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                CARD_TRANSACTION_COUNT_15_M -> Known.CARD_TRANSACTION_COUNT_15_M
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
                                CARD_STATE -> Known.CARD_STATE
                                PIN_ENTERED -> Known.PIN_ENTERED
                                PIN_STATUS -> Known.PIN_STATUS
                                WALLET_TYPE -> Known.WALLET_TYPE
                                TRANSACTION_INITIATOR -> Known.TRANSACTION_INITIATOR
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LithicInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Attribute = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Attribute && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** The operation to apply to the attribute */
                    class Operation
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val IS_ONE_OF = of("IS_ONE_OF")

                            @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

                            @JvmField val MATCHES = of("MATCHES")

                            @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

                            @JvmField val IS_EQUAL_TO = of("IS_EQUAL_TO")

                            @JvmField val IS_NOT_EQUAL_TO = of("IS_NOT_EQUAL_TO")

                            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

                            @JvmField
                            val IS_GREATER_THAN_OR_EQUAL_TO = of("IS_GREATER_THAN_OR_EQUAL_TO")

                            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

                            @JvmField val IS_LESS_THAN_OR_EQUAL_TO = of("IS_LESS_THAN_OR_EQUAL_TO")

                            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
                        }

                        /** An enum containing [Operation]'s known values. */
                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_EQUAL_TO,
                            IS_NOT_EQUAL_TO,
                            IS_GREATER_THAN,
                            IS_GREATER_THAN_OR_EQUAL_TO,
                            IS_LESS_THAN,
                            IS_LESS_THAN_OR_EQUAL_TO,
                        }

                        /**
                         * An enum containing [Operation]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operation] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_EQUAL_TO,
                            IS_NOT_EQUAL_TO,
                            IS_GREATER_THAN,
                            IS_GREATER_THAN_OR_EQUAL_TO,
                            IS_LESS_THAN,
                            IS_LESS_THAN_OR_EQUAL_TO,
                            /**
                             * An enum member indicating that [Operation] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                IS_ONE_OF -> Value.IS_ONE_OF
                                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                                MATCHES -> Value.MATCHES
                                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                                IS_EQUAL_TO -> Value.IS_EQUAL_TO
                                IS_NOT_EQUAL_TO -> Value.IS_NOT_EQUAL_TO
                                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                                IS_GREATER_THAN_OR_EQUAL_TO -> Value.IS_GREATER_THAN_OR_EQUAL_TO
                                IS_LESS_THAN -> Value.IS_LESS_THAN
                                IS_LESS_THAN_OR_EQUAL_TO -> Value.IS_LESS_THAN_OR_EQUAL_TO
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_EQUAL_TO -> Known.IS_EQUAL_TO
                                IS_NOT_EQUAL_TO -> Known.IS_NOT_EQUAL_TO
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_GREATER_THAN_OR_EQUAL_TO -> Known.IS_GREATER_THAN_OR_EQUAL_TO
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                IS_LESS_THAN_OR_EQUAL_TO -> Known.IS_LESS_THAN_OR_EQUAL_TO
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LithicInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operation = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Operation && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val regex: String? = null,
                        private val number: Long? = null,
                        private val listOfStrings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun regex(): Optional<String> = Optional.ofNullable(regex)

                        /**
                         * A number, to be used with `IS_GREATER_THAN`,
                         * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                         * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                         */
                        fun number(): Optional<Long> = Optional.ofNullable(number)

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun listOfStrings(): Optional<List<String>> =
                            Optional.ofNullable(listOfStrings)

                        fun isRegex(): Boolean = regex != null

                        fun isNumber(): Boolean = number != null

                        fun isListOfStrings(): Boolean = listOfStrings != null

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun asRegex(): String = regex.getOrThrow("regex")

                        /**
                         * A number, to be used with `IS_GREATER_THAN`,
                         * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                         * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                         */
                        fun asNumber(): Long = number.getOrThrow("number")

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun asListOfStrings(): List<String> =
                            listOfStrings.getOrThrow("listOfStrings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                regex != null -> visitor.visitRegex(regex)
                                number != null -> visitor.visitNumber(number)
                                listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitRegex(regex: String) {}

                                    override fun visitNumber(number: Long) {}

                                    override fun visitListOfStrings(listOfStrings: List<String>) {}
                                }
                            )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitRegex(regex: String) = 1

                                    override fun visitNumber(number: Long) = 1

                                    override fun visitListOfStrings(listOfStrings: List<String>) =
                                        listOfStrings.size

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Value &&
                                regex == other.regex &&
                                number == other.number &&
                                listOfStrings == other.listOfStrings
                        }

                        override fun hashCode(): Int = Objects.hash(regex, number, listOfStrings)

                        override fun toString(): String =
                            when {
                                regex != null -> "Value{regex=$regex}"
                                number != null -> "Value{number=$number}"
                                listOfStrings != null -> "Value{listOfStrings=$listOfStrings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            @JvmStatic fun ofRegex(regex: String) = Value(regex = regex)

                            /**
                             * A number, to be used with `IS_GREATER_THAN`,
                             * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                             * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                             */
                            @JvmStatic fun ofNumber(number: Long) = Value(number = number)

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            @JvmStatic
                            fun ofListOfStrings(listOfStrings: List<String>) =
                                Value(listOfStrings = listOfStrings.toImmutable())
                        }

                        /**
                         * An interface that defines how to map each variant of [Value] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun visitRegex(regex: String): T

                            /**
                             * A number, to be used with `IS_GREATER_THAN`,
                             * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                             * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                             */
                            fun visitNumber(number: Long): T

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun visitListOfStrings(listOfStrings: List<String>): T

                            /**
                             * Maps an unknown variant of [Value] to a value of type [T].
                             *
                             * An instance of [Value] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws LithicInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Value(regex = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                                Value(number = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<List<String>>())
                                                ?.let { Value(listOfStrings = it, _json = json) },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from object).
                                    0 -> Value(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.regex != null -> generator.writeObject(value.regex)
                                    value.number != null -> generator.writeObject(value.number)
                                    value.listOfStrings != null ->
                                        generator.writeObject(value.listOfStrings)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Value")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Condition &&
                            attribute == other.attribute &&
                            operation == other.operation &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(attribute, operation, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ConditionalAuthorizationActionParameters &&
                        action == other.action &&
                        conditions == other.conditions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, conditions, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalAuthorizationActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentVersion &&
                parameters == other.parameters &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(parameters, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    class DraftVersion
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(parameters, version, mutableMapOf())

        /**
         * Parameters for the Auth Rule
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /**
         * The version of the rule, this is incremented whenever the rule's parameters change.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Long = version.getRequired("version")

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
             * Returns a mutable builder for constructing an instance of [DraftVersion].
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DraftVersion]. */
        class Builder internal constructor() {

            private var parameters: JsonField<Parameters>? = null
            private var version: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(draftVersion: DraftVersion) = apply {
                parameters = draftVersion.parameters
                version = draftVersion.version
                additionalProperties = draftVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditionalBlock(conditionalBlock)`.
             */
            fun parameters(conditionalBlock: ConditionalBlockParameters) =
                parameters(Parameters.ofConditionalBlock(conditionalBlock))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
             */
            fun parameters(velocityLimitParams: VelocityLimitParams) =
                parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

            /** Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`. */
            fun parameters(merchantLock: MerchantLockParameters) =
                parameters(Parameters.ofMerchantLock(merchantLock))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
             */
            fun parameters(conditional3dsAction: Conditional3dsActionParameters) =
                parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)`.
             */
            fun parameters(
                conditionalAuthorizationAction: Parameters.ConditionalAuthorizationActionParameters
            ) =
                parameters(
                    Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)
                )

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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
             * Returns an immutable instance of [DraftVersion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DraftVersion =
                DraftVersion(
                    checkRequired("parameters", parameters),
                    checkRequired("version", version),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DraftVersion = apply {
            if (validated) {
                return@apply
            }

            parameters().validate()
            version()
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
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        /** Parameters for the Auth Rule */
        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlock: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val merchantLock: MerchantLockParameters? = null,
            private val conditional3dsAction: Conditional3dsActionParameters? = null,
            private val conditionalAuthorizationAction: ConditionalAuthorizationActionParameters? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlock)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun merchantLock(): Optional<MerchantLockParameters> = Optional.ofNullable(merchantLock)

            fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
                Optional.ofNullable(conditional3dsAction)

            fun conditionalAuthorizationAction():
                Optional<ConditionalAuthorizationActionParameters> =
                Optional.ofNullable(conditionalAuthorizationAction)

            fun isConditionalBlock(): Boolean = conditionalBlock != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun isMerchantLock(): Boolean = merchantLock != null

            fun isConditional3dsAction(): Boolean = conditional3dsAction != null

            fun isConditionalAuthorizationAction(): Boolean = conditionalAuthorizationAction != null

            fun asConditionalBlock(): ConditionalBlockParameters =
                conditionalBlock.getOrThrow("conditionalBlock")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun asMerchantLock(): MerchantLockParameters = merchantLock.getOrThrow("merchantLock")

            fun asConditional3dsAction(): Conditional3dsActionParameters =
                conditional3dsAction.getOrThrow("conditional3dsAction")

            fun asConditionalAuthorizationAction(): ConditionalAuthorizationActionParameters =
                conditionalAuthorizationAction.getOrThrow("conditionalAuthorizationAction")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    merchantLock != null -> visitor.visitMerchantLock(merchantLock)
                    conditional3dsAction != null ->
                        visitor.visitConditional3dsAction(conditional3dsAction)
                    conditionalAuthorizationAction != null ->
                        visitor.visitConditionalAuthorizationAction(conditionalAuthorizationAction)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitConditionalBlock(
                            conditionalBlock: ConditionalBlockParameters
                        ) {
                            conditionalBlock.validate()
                        }

                        override fun visitVelocityLimitParams(
                            velocityLimitParams: VelocityLimitParams
                        ) {
                            velocityLimitParams.validate()
                        }

                        override fun visitMerchantLock(merchantLock: MerchantLockParameters) {
                            merchantLock.validate()
                        }

                        override fun visitConditional3dsAction(
                            conditional3dsAction: Conditional3dsActionParameters
                        ) {
                            conditional3dsAction.validate()
                        }

                        override fun visitConditionalAuthorizationAction(
                            conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                        ) {
                            conditionalAuthorizationAction.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitConditionalBlock(
                            conditionalBlock: ConditionalBlockParameters
                        ) = conditionalBlock.validity()

                        override fun visitVelocityLimitParams(
                            velocityLimitParams: VelocityLimitParams
                        ) = velocityLimitParams.validity()

                        override fun visitMerchantLock(merchantLock: MerchantLockParameters) =
                            merchantLock.validity()

                        override fun visitConditional3dsAction(
                            conditional3dsAction: Conditional3dsActionParameters
                        ) = conditional3dsAction.validity()

                        override fun visitConditionalAuthorizationAction(
                            conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                        ) = conditionalAuthorizationAction.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameters &&
                    conditionalBlock == other.conditionalBlock &&
                    velocityLimitParams == other.velocityLimitParams &&
                    merchantLock == other.merchantLock &&
                    conditional3dsAction == other.conditional3dsAction &&
                    conditionalAuthorizationAction == other.conditionalAuthorizationAction
            }

            override fun hashCode(): Int =
                Objects.hash(
                    conditionalBlock,
                    velocityLimitParams,
                    merchantLock,
                    conditional3dsAction,
                    conditionalAuthorizationAction,
                )

            override fun toString(): String =
                when {
                    conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    merchantLock != null -> "Parameters{merchantLock=$merchantLock}"
                    conditional3dsAction != null ->
                        "Parameters{conditional3dsAction=$conditional3dsAction}"
                    conditionalAuthorizationAction != null ->
                        "Parameters{conditionalAuthorizationAction=$conditionalAuthorizationAction}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                @JvmStatic
                fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                    Parameters(conditionalBlock = conditionalBlock)

                @JvmStatic
                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)

                @JvmStatic
                fun ofMerchantLock(merchantLock: MerchantLockParameters) =
                    Parameters(merchantLock = merchantLock)

                @JvmStatic
                fun ofConditional3dsAction(conditional3dsAction: Conditional3dsActionParameters) =
                    Parameters(conditional3dsAction = conditional3dsAction)

                @JvmStatic
                fun ofConditionalAuthorizationAction(
                    conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                ) = Parameters(conditionalAuthorizationAction = conditionalAuthorizationAction)
            }

            /**
             * An interface that defines how to map each variant of [Parameters] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun visitMerchantLock(merchantLock: MerchantLockParameters): T

                fun visitConditional3dsAction(
                    conditional3dsAction: Conditional3dsActionParameters
                ): T

                fun visitConditionalAuthorizationAction(
                    conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                ): T

                /**
                 * Maps an unknown variant of [Parameters] to a value of type [T].
                 *
                 * An instance of [Parameters] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LithicInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>())
                                    ?.let { Parameters(conditionalBlock = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())?.let {
                                    Parameters(velocityLimitParams = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                    ?.let { Parameters(merchantLock = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<Conditional3dsActionParameters>(),
                                    )
                                    ?.let { Parameters(conditional3dsAction = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<ConditionalAuthorizationActionParameters>(),
                                    )
                                    ?.let {
                                        Parameters(
                                            conditionalAuthorizationAction = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Parameters(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.conditionalBlock != null ->
                            generator.writeObject(value.conditionalBlock)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value.merchantLock != null -> generator.writeObject(value.merchantLock)
                        value.conditional3dsAction != null ->
                            generator.writeObject(value.conditional3dsAction)
                        value.conditionalAuthorizationAction != null ->
                            generator.writeObject(value.conditionalAuthorizationAction)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }

            class ConditionalAuthorizationActionParameters
            private constructor(
                private val action: JsonField<Action>,
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("conditions")
                    @ExcludeMissing
                    conditions: JsonField<List<Condition>> = JsonMissing.of(),
                ) : this(action, conditions, mutableMapOf())

                /**
                 * The action to take if the conditions are met.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [conditions].
                 *
                 * Unlike [conditions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conditions")
                @ExcludeMissing
                fun _conditions(): JsonField<List<Condition>> = conditions

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
                     * [ConditionalAuthorizationActionParameters].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .conditions()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ConditionalAuthorizationActionParameters]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var conditions: JsonField<MutableList<Condition>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        conditionalAuthorizationActionParameters:
                            ConditionalAuthorizationActionParameters
                    ) = apply {
                        action = conditionalAuthorizationActionParameters.action
                        conditions =
                            conditionalAuthorizationActionParameters.conditions.map {
                                it.toMutableList()
                            }
                        additionalProperties =
                            conditionalAuthorizationActionParameters.additionalProperties
                                .toMutableMap()
                    }

                    /** The action to take if the conditions are met. */
                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    /**
                     * Sets [Builder.conditions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conditions] with a well-typed
                     * `List<Condition>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Condition] to [conditions].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCondition(condition: Condition) = apply {
                        conditions =
                            (conditions ?: JsonField.of(mutableListOf())).also {
                                checkKnown("conditions", it).add(condition)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ConditionalAuthorizationActionParameters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .conditions()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ConditionalAuthorizationActionParameters =
                        ConditionalAuthorizationActionParameters(
                            checkRequired("action", action),
                            checkRequired("conditions", conditions).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ConditionalAuthorizationActionParameters = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    conditions().forEach { it.validate() }
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** The action to take if the conditions are met. */
                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DECLINE = of("DECLINE")

                        @JvmField val CHALLENGE = of("CHALLENGE")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        DECLINE,
                        CHALLENGE,
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DECLINE,
                        CHALLENGE,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DECLINE -> Value.DECLINE
                            CHALLENGE -> Value.CHALLENGE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DECLINE -> Known.DECLINE
                            CHALLENGE -> Known.CHALLENGE
                            else -> throw LithicInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        attribute: JsonField<Attribute> = JsonMissing.of(),
                        @JsonProperty("operation")
                        @ExcludeMissing
                        operation: JsonField<Operation> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Value> = JsonMissing.of(),
                    ) : this(attribute, operation, value, mutableMapOf())

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency
                     *   of the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the
                     *   trailing 15 minutes before the authorization.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     * - `CARD_STATE`: The current state of the card associated with the
                     *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                     *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                     * - `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction.
                     *   Valid values are `TRUE`, `FALSE`.
                     * - `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`,
                     *   `OK`, `BLOCKED`.
                     * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates the
                     *   source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                     *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                     * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                     *   indicates the source of the token. Valid values are `CARDHOLDER`,
                     *   `MERCHANT`, `UNKNOWN`.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun attribute(): Optional<Attribute> = attribute.getOptional("attribute")

                    /**
                     * The operation to apply to the attribute
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun operation(): Optional<Operation> = operation.getOptional("operation")

                    /**
                     * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Value> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [attribute].
                     *
                     * Unlike [attribute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /**
                     * Returns the raw JSON value of [operation].
                     *
                     * Unlike [operation], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operation")
                    @ExcludeMissing
                    fun _operation(): JsonField<Operation> = operation

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                         * Returns a mutable builder for constructing an instance of [Condition].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Condition]. */
                    class Builder internal constructor() {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(condition: Condition) = apply {
                            attribute = condition.attribute
                            operation = condition.operation
                            value = condition.value
                            additionalProperties = condition.additionalProperties.toMutableMap()
                        }

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in
                         *   the trailing 15 minutes before the authorization.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         * - `CARD_STATE`: The current state of the card associated with the
                         *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                         *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                         * - `PIN_ENTERED`: Indicates whether a PIN was entered during the
                         *   transaction. Valid values are `TRUE`, `FALSE`.
                         * - `PIN_STATUS`: The current state of card's PIN. Valid values are
                         *   `NOT_SET`, `OK`, `BLOCKED`.
                         * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates
                         *   the source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                         *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                         * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                         *   indicates the source of the token. Valid values are `CARDHOLDER`,
                         *   `MERCHANT`, `UNKNOWN`.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * Sets [Builder.attribute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attribute] with a well-typed [Attribute]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /**
                         * Sets [Builder.operation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operation] with a well-typed [Operation]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Value] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** Alias for calling [value] with `Value.ofRegex(regex)`. */
                        fun value(regex: String) = value(Value.ofRegex(regex))

                        /** Alias for calling [value] with `Value.ofNumber(number)`. */
                        fun value(number: Long) = value(Value.ofNumber(number))

                        /**
                         * Alias for calling [value] with `Value.ofListOfStrings(listOfStrings)`.
                         */
                        fun valueOfListOfStrings(listOfStrings: List<String>) =
                            value(Value.ofListOfStrings(listOfStrings))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Condition].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute().ifPresent { it.validate() }
                        operation().ifPresent { it.validate() }
                        value().ifPresent { it.validate() }
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
                        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                            (operation.asKnown().getOrNull()?.validity() ?: 0) +
                            (value.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency
                     *   of the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the
                     *   trailing 15 minutes before the authorization.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     * - `CARD_STATE`: The current state of the card associated with the
                     *   transaction. Valid values are `CLOSED`, `OPEN`, `PAUSED`,
                     *   `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
                     * - `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction.
                     *   Valid values are `TRUE`, `FALSE`.
                     * - `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`,
                     *   `OK`, `BLOCKED`.
                     * - `WALLET_TYPE`: For transactions using a digital wallet token, indicates the
                     *   source of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`,
                     *   `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
                     * - `TRANSACTION_INITIATOR`: The entity that initiated the transaction
                     *   indicates the source of the token. Valid values are `CARDHOLDER`,
                     *   `MERCHANT`, `UNKNOWN`.
                     */
                    class Attribute
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val MCC = of("MCC")

                            @JvmField val COUNTRY = of("COUNTRY")

                            @JvmField val CURRENCY = of("CURRENCY")

                            @JvmField val MERCHANT_ID = of("MERCHANT_ID")

                            @JvmField val DESCRIPTOR = of("DESCRIPTOR")

                            @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            @JvmField val RISK_SCORE = of("RISK_SCORE")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_15_M = of("CARD_TRANSACTION_COUNT_15M")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

                            @JvmField val CARD_STATE = of("CARD_STATE")

                            @JvmField val PIN_ENTERED = of("PIN_ENTERED")

                            @JvmField val PIN_STATUS = of("PIN_STATUS")

                            @JvmField val WALLET_TYPE = of("WALLET_TYPE")

                            @JvmField val TRANSACTION_INITIATOR = of("TRANSACTION_INITIATOR")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        /** An enum containing [Attribute]'s known values. */
                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_15_M,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            CARD_STATE,
                            PIN_ENTERED,
                            PIN_STATUS,
                            WALLET_TYPE,
                            TRANSACTION_INITIATOR,
                        }

                        /**
                         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Attribute] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_15_M,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            CARD_STATE,
                            PIN_ENTERED,
                            PIN_STATUS,
                            WALLET_TYPE,
                            TRANSACTION_INITIATOR,
                            /**
                             * An enum member indicating that [Attribute] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                CARD_TRANSACTION_COUNT_15_M -> Value.CARD_TRANSACTION_COUNT_15_M
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
                                CARD_STATE -> Value.CARD_STATE
                                PIN_ENTERED -> Value.PIN_ENTERED
                                PIN_STATUS -> Value.PIN_STATUS
                                WALLET_TYPE -> Value.WALLET_TYPE
                                TRANSACTION_INITIATOR -> Value.TRANSACTION_INITIATOR
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                CARD_TRANSACTION_COUNT_15_M -> Known.CARD_TRANSACTION_COUNT_15_M
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
                                CARD_STATE -> Known.CARD_STATE
                                PIN_ENTERED -> Known.PIN_ENTERED
                                PIN_STATUS -> Known.PIN_STATUS
                                WALLET_TYPE -> Known.WALLET_TYPE
                                TRANSACTION_INITIATOR -> Known.TRANSACTION_INITIATOR
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LithicInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Attribute = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Attribute && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** The operation to apply to the attribute */
                    class Operation
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val IS_ONE_OF = of("IS_ONE_OF")

                            @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

                            @JvmField val MATCHES = of("MATCHES")

                            @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

                            @JvmField val IS_EQUAL_TO = of("IS_EQUAL_TO")

                            @JvmField val IS_NOT_EQUAL_TO = of("IS_NOT_EQUAL_TO")

                            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

                            @JvmField
                            val IS_GREATER_THAN_OR_EQUAL_TO = of("IS_GREATER_THAN_OR_EQUAL_TO")

                            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

                            @JvmField val IS_LESS_THAN_OR_EQUAL_TO = of("IS_LESS_THAN_OR_EQUAL_TO")

                            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
                        }

                        /** An enum containing [Operation]'s known values. */
                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_EQUAL_TO,
                            IS_NOT_EQUAL_TO,
                            IS_GREATER_THAN,
                            IS_GREATER_THAN_OR_EQUAL_TO,
                            IS_LESS_THAN,
                            IS_LESS_THAN_OR_EQUAL_TO,
                        }

                        /**
                         * An enum containing [Operation]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operation] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_EQUAL_TO,
                            IS_NOT_EQUAL_TO,
                            IS_GREATER_THAN,
                            IS_GREATER_THAN_OR_EQUAL_TO,
                            IS_LESS_THAN,
                            IS_LESS_THAN_OR_EQUAL_TO,
                            /**
                             * An enum member indicating that [Operation] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                IS_ONE_OF -> Value.IS_ONE_OF
                                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                                MATCHES -> Value.MATCHES
                                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                                IS_EQUAL_TO -> Value.IS_EQUAL_TO
                                IS_NOT_EQUAL_TO -> Value.IS_NOT_EQUAL_TO
                                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                                IS_GREATER_THAN_OR_EQUAL_TO -> Value.IS_GREATER_THAN_OR_EQUAL_TO
                                IS_LESS_THAN -> Value.IS_LESS_THAN
                                IS_LESS_THAN_OR_EQUAL_TO -> Value.IS_LESS_THAN_OR_EQUAL_TO
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_EQUAL_TO -> Known.IS_EQUAL_TO
                                IS_NOT_EQUAL_TO -> Known.IS_NOT_EQUAL_TO
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_GREATER_THAN_OR_EQUAL_TO -> Known.IS_GREATER_THAN_OR_EQUAL_TO
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                IS_LESS_THAN_OR_EQUAL_TO -> Known.IS_LESS_THAN_OR_EQUAL_TO
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LithicInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operation = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Operation && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val regex: String? = null,
                        private val number: Long? = null,
                        private val listOfStrings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun regex(): Optional<String> = Optional.ofNullable(regex)

                        /**
                         * A number, to be used with `IS_GREATER_THAN`,
                         * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                         * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                         */
                        fun number(): Optional<Long> = Optional.ofNullable(number)

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun listOfStrings(): Optional<List<String>> =
                            Optional.ofNullable(listOfStrings)

                        fun isRegex(): Boolean = regex != null

                        fun isNumber(): Boolean = number != null

                        fun isListOfStrings(): Boolean = listOfStrings != null

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun asRegex(): String = regex.getOrThrow("regex")

                        /**
                         * A number, to be used with `IS_GREATER_THAN`,
                         * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                         * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                         */
                        fun asNumber(): Long = number.getOrThrow("number")

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun asListOfStrings(): List<String> =
                            listOfStrings.getOrThrow("listOfStrings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                regex != null -> visitor.visitRegex(regex)
                                number != null -> visitor.visitNumber(number)
                                listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitRegex(regex: String) {}

                                    override fun visitNumber(number: Long) {}

                                    override fun visitListOfStrings(listOfStrings: List<String>) {}
                                }
                            )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitRegex(regex: String) = 1

                                    override fun visitNumber(number: Long) = 1

                                    override fun visitListOfStrings(listOfStrings: List<String>) =
                                        listOfStrings.size

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Value &&
                                regex == other.regex &&
                                number == other.number &&
                                listOfStrings == other.listOfStrings
                        }

                        override fun hashCode(): Int = Objects.hash(regex, number, listOfStrings)

                        override fun toString(): String =
                            when {
                                regex != null -> "Value{regex=$regex}"
                                number != null -> "Value{number=$number}"
                                listOfStrings != null -> "Value{listOfStrings=$listOfStrings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            @JvmStatic fun ofRegex(regex: String) = Value(regex = regex)

                            /**
                             * A number, to be used with `IS_GREATER_THAN`,
                             * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                             * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                             */
                            @JvmStatic fun ofNumber(number: Long) = Value(number = number)

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            @JvmStatic
                            fun ofListOfStrings(listOfStrings: List<String>) =
                                Value(listOfStrings = listOfStrings.toImmutable())
                        }

                        /**
                         * An interface that defines how to map each variant of [Value] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun visitRegex(regex: String): T

                            /**
                             * A number, to be used with `IS_GREATER_THAN`,
                             * `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
                             * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                             */
                            fun visitNumber(number: Long): T

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun visitListOfStrings(listOfStrings: List<String>): T

                            /**
                             * Maps an unknown variant of [Value] to a value of type [T].
                             *
                             * An instance of [Value] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws LithicInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Value(regex = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                                Value(number = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<List<String>>())
                                                ?.let { Value(listOfStrings = it, _json = json) },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from object).
                                    0 -> Value(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.regex != null -> generator.writeObject(value.regex)
                                    value.number != null -> generator.writeObject(value.number)
                                    value.listOfStrings != null ->
                                        generator.writeObject(value.listOfStrings)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Value")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Condition &&
                            attribute == other.attribute &&
                            operation == other.operation &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(attribute, operation, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ConditionalAuthorizationActionParameters &&
                        action == other.action &&
                        conditions == other.conditions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, conditions, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalAuthorizationActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DraftVersion &&
                parameters == other.parameters &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(parameters, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    /** The event stream during which the rule will be evaluated. */
    class EventStream @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AUTHORIZATION = of("AUTHORIZATION")

            @JvmField val THREE_DS_AUTHENTICATION = of("THREE_DS_AUTHENTICATION")

            @JvmStatic fun of(value: String) = EventStream(JsonField.of(value))
        }

        /** An enum containing [EventStream]'s known values. */
        enum class Known {
            AUTHORIZATION,
            THREE_DS_AUTHENTICATION,
        }

        /**
         * An enum containing [EventStream]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventStream] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZATION,
            THREE_DS_AUTHENTICATION,
            /**
             * An enum member indicating that [EventStream] was instantiated with an unknown value.
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
                AUTHORIZATION -> Value.AUTHORIZATION
                THREE_DS_AUTHENTICATION -> Value.THREE_DS_AUTHENTICATION
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
                AUTHORIZATION -> Known.AUTHORIZATION
                THREE_DS_AUTHENTICATION -> Known.THREE_DS_AUTHENTICATION
                else -> throw LithicInvalidDataException("Unknown EventStream: $value")
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

        fun validate(): EventStream = apply {
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

            return other is EventStream && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The state of the Auth Rule */
    class AuthRuleState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = AuthRuleState(JsonField.of(value))
        }

        /** An enum containing [AuthRuleState]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [AuthRuleState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthRuleState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /**
             * An enum member indicating that [AuthRuleState] was instantiated with an unknown
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
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
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown AuthRuleState: $value")
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

        fun validate(): AuthRuleState = apply {
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

            return other is AuthRuleState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of Auth Rule. For certain rule types, this determines the event stream during which
     * it will be evaluated. For rules that can be applied to one of several event streams, the
     * effective one is defined by the separate `event_stream` field.
     * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
     * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
     * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
     * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
     */
    class AuthRuleType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

            @JvmField val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

            @JvmField val MERCHANT_LOCK = of("MERCHANT_LOCK")

            @JvmField val CONDITIONAL_ACTION = of("CONDITIONAL_ACTION")

            @JvmStatic fun of(value: String) = AuthRuleType(JsonField.of(value))
        }

        /** An enum containing [AuthRuleType]'s known values. */
        enum class Known {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
            MERCHANT_LOCK,
            CONDITIONAL_ACTION,
        }

        /**
         * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
            MERCHANT_LOCK,
            CONDITIONAL_ACTION,
            /**
             * An enum member indicating that [AuthRuleType] was instantiated with an unknown value.
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
                CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                MERCHANT_LOCK -> Value.MERCHANT_LOCK
                CONDITIONAL_ACTION -> Value.CONDITIONAL_ACTION
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
                CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                MERCHANT_LOCK -> Known.MERCHANT_LOCK
                CONDITIONAL_ACTION -> Known.CONDITIONAL_ACTION
                else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
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

        fun validate(): AuthRuleType = apply {
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

            return other is AuthRuleType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2RetrieveResponse &&
            token == other.token &&
            accountTokens == other.accountTokens &&
            businessAccountTokens == other.businessAccountTokens &&
            cardTokens == other.cardTokens &&
            currentVersion == other.currentVersion &&
            draftVersion == other.draftVersion &&
            eventStream == other.eventStream &&
            name == other.name &&
            programLevel == other.programLevel &&
            state == other.state &&
            type == other.type &&
            excludedCardTokens == other.excludedCardTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountTokens,
            businessAccountTokens,
            cardTokens,
            currentVersion,
            draftVersion,
            eventStream,
            name,
            programLevel,
            state,
            type,
            excludedCardTokens,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveResponse{token=$token, accountTokens=$accountTokens, businessAccountTokens=$businessAccountTokens, cardTokens=$cardTokens, currentVersion=$currentVersion, draftVersion=$draftVersion, eventStream=$eventStream, name=$name, programLevel=$programLevel, state=$state, type=$type, excludedCardTokens=$excludedCardTokens, additionalProperties=$additionalProperties}"
}
