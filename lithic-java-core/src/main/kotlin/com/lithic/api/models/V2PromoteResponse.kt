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

class V2PromoteResponse
private constructor(
    private val token: JsonField<String>,
    private val accountTokens: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val currentVersion: JsonField<CurrentVersion>,
    private val draftVersion: JsonField<DraftVersion>,
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
        @JsonProperty("card_tokens")
        @ExcludeMissing
        cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("current_version")
        @ExcludeMissing
        currentVersion: JsonField<CurrentVersion> = JsonMissing.of(),
        @JsonProperty("draft_version")
        @ExcludeMissing
        draftVersion: JsonField<DraftVersion> = JsonMissing.of(),
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
        cardTokens,
        currentVersion,
        draftVersion,
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
    fun currentVersion(): Optional<CurrentVersion> =
        Optional.ofNullable(currentVersion.getNullable("current_version"))

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun draftVersion(): Optional<DraftVersion> =
        Optional.ofNullable(draftVersion.getNullable("draft_version"))

    /**
     * Auth Rule Name
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

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
     * The type of Auth Rule
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
        Optional.ofNullable(excludedCardTokens.getNullable("excluded_card_tokens"))

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
         * Returns a mutable builder for constructing an instance of [V2PromoteResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountTokens()
         * .cardTokens()
         * .currentVersion()
         * .draftVersion()
         * .name()
         * .programLevel()
         * .state()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2PromoteResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountTokens: JsonField<MutableList<String>>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var currentVersion: JsonField<CurrentVersion>? = null
        private var draftVersion: JsonField<DraftVersion>? = null
        private var name: JsonField<String>? = null
        private var programLevel: JsonField<Boolean>? = null
        private var state: JsonField<AuthRuleState>? = null
        private var type: JsonField<AuthRuleType>? = null
        private var excludedCardTokens: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2PromoteResponse: V2PromoteResponse) = apply {
            token = v2PromoteResponse.token
            accountTokens = v2PromoteResponse.accountTokens.map { it.toMutableList() }
            cardTokens = v2PromoteResponse.cardTokens.map { it.toMutableList() }
            currentVersion = v2PromoteResponse.currentVersion
            draftVersion = v2PromoteResponse.draftVersion
            name = v2PromoteResponse.name
            programLevel = v2PromoteResponse.programLevel
            state = v2PromoteResponse.state
            type = v2PromoteResponse.type
            excludedCardTokens = v2PromoteResponse.excludedCardTokens.map { it.toMutableList() }
            additionalProperties = v2PromoteResponse.additionalProperties.toMutableMap()
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

        /** The type of Auth Rule */
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
         * Returns an immutable instance of [V2PromoteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountTokens()
         * .cardTokens()
         * .currentVersion()
         * .draftVersion()
         * .name()
         * .programLevel()
         * .state()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2PromoteResponse =
            V2PromoteResponse(
                checkRequired("token", token),
                checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                checkRequired("currentVersion", currentVersion),
                checkRequired("draftVersion", draftVersion),
                checkRequired("name", name),
                checkRequired("programLevel", programLevel),
                checkRequired("state", state),
                checkRequired("type", type),
                (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2PromoteResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountTokens()
        cardTokens()
        currentVersion().ifPresent { it.validate() }
        draftVersion().ifPresent { it.validate() }
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
            (cardTokens.asKnown().getOrNull()?.size ?: 0) +
            (currentVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (draftVersion.asKnown().getOrNull()?.validity() ?: 0) +
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
            private val _json: JsonValue? = null,
        ) {

            fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlock)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun isConditionalBlock(): Boolean = conditionalBlock != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlock(): ConditionalBlockParameters =
                conditionalBlock.getOrThrow("conditionalBlock")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
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

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
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
            }

            /**
             * An interface that defines how to map each variant of [Parameters] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

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
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

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
            private val _json: JsonValue? = null,
        ) {

            fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlock)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun isConditionalBlock(): Boolean = conditionalBlock != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlock(): ConditionalBlockParameters =
                conditionalBlock.getOrThrow("conditionalBlock")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
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

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
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
            }

            /**
             * An interface that defines how to map each variant of [Parameters] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

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
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DraftVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is AuthRuleState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of Auth Rule */
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

            @JvmStatic fun of(value: String) = AuthRuleType(JsonField.of(value))
        }

        /** An enum containing [AuthRuleType]'s known values. */
        enum class Known {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
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

            return /* spotless:off */ other is AuthRuleType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2PromoteResponse && token == other.token && accountTokens == other.accountTokens && cardTokens == other.cardTokens && currentVersion == other.currentVersion && draftVersion == other.draftVersion && name == other.name && programLevel == other.programLevel && state == other.state && type == other.type && excludedCardTokens == other.excludedCardTokens && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountTokens, cardTokens, currentVersion, draftVersion, name, programLevel, state, type, excludedCardTokens, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2PromoteResponse{token=$token, accountTokens=$accountTokens, cardTokens=$cardTokens, currentVersion=$currentVersion, draftVersion=$draftVersion, name=$name, programLevel=$programLevel, state=$state, type=$type, excludedCardTokens=$excludedCardTokens, additionalProperties=$additionalProperties}"
}
