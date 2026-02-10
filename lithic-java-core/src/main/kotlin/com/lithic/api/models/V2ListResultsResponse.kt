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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Result of an Auth Rule evaluation */
class V2ListResultsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val actions: JsonField<List<Action>>,
    private val authRuleToken: JsonField<String>,
    private val evaluationTime: JsonField<OffsetDateTime>,
    private val eventStream: JsonField<EventStream>,
    private val eventToken: JsonField<String>,
    private val mode: JsonField<AuthRuleState>,
    private val ruleVersion: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("auth_rule_token")
        @ExcludeMissing
        authRuleToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluation_time")
        @ExcludeMissing
        evaluationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_stream")
        @ExcludeMissing
        eventStream: JsonField<EventStream> = JsonMissing.of(),
        @JsonProperty("event_token")
        @ExcludeMissing
        eventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<AuthRuleState> = JsonMissing.of(),
        @JsonProperty("rule_version")
        @ExcludeMissing
        ruleVersion: JsonField<Long> = JsonMissing.of(),
    ) : this(
        token,
        actions,
        authRuleToken,
        evaluationTime,
        eventStream,
        eventToken,
        mode,
        ruleVersion,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the evaluation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Actions returned by the rule evaluation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * The Auth Rule token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authRuleToken(): String = authRuleToken.getRequired("auth_rule_token")

    /**
     * Timestamp of the rule evaluation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evaluationTime(): OffsetDateTime = evaluationTime.getRequired("evaluation_time")

    /**
     * The event stream during which the rule was evaluated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventStream(): EventStream = eventStream.getRequired("event_stream")

    /**
     * Token of the event that triggered the evaluation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventToken(): String = eventToken.getRequired("event_token")

    /**
     * The state of the Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mode(): AuthRuleState = mode.getRequired("mode")

    /**
     * Version of the rule that was evaluated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleVersion(): Long = ruleVersion.getRequired("rule_version")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [authRuleToken].
     *
     * Unlike [authRuleToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_rule_token")
    @ExcludeMissing
    fun _authRuleToken(): JsonField<String> = authRuleToken

    /**
     * Returns the raw JSON value of [evaluationTime].
     *
     * Unlike [evaluationTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluation_time")
    @ExcludeMissing
    fun _evaluationTime(): JsonField<OffsetDateTime> = evaluationTime

    /**
     * Returns the raw JSON value of [eventStream].
     *
     * Unlike [eventStream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_stream")
    @ExcludeMissing
    fun _eventStream(): JsonField<EventStream> = eventStream

    /**
     * Returns the raw JSON value of [eventToken].
     *
     * Unlike [eventToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<AuthRuleState> = mode

    /**
     * Returns the raw JSON value of [ruleVersion].
     *
     * Unlike [ruleVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rule_version") @ExcludeMissing fun _ruleVersion(): JsonField<Long> = ruleVersion

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
         * Returns a mutable builder for constructing an instance of [V2ListResultsResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .actions()
         * .authRuleToken()
         * .evaluationTime()
         * .eventStream()
         * .eventToken()
         * .mode()
         * .ruleVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2ListResultsResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var actions: JsonField<MutableList<Action>>? = null
        private var authRuleToken: JsonField<String>? = null
        private var evaluationTime: JsonField<OffsetDateTime>? = null
        private var eventStream: JsonField<EventStream>? = null
        private var eventToken: JsonField<String>? = null
        private var mode: JsonField<AuthRuleState>? = null
        private var ruleVersion: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2ListResultsResponse: V2ListResultsResponse) = apply {
            token = v2ListResultsResponse.token
            actions = v2ListResultsResponse.actions.map { it.toMutableList() }
            authRuleToken = v2ListResultsResponse.authRuleToken
            evaluationTime = v2ListResultsResponse.evaluationTime
            eventStream = v2ListResultsResponse.eventStream
            eventToken = v2ListResultsResponse.eventToken
            mode = v2ListResultsResponse.mode
            ruleVersion = v2ListResultsResponse.ruleVersion
            additionalProperties = v2ListResultsResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the evaluation */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Actions returned by the rule evaluation */
        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        /** Alias for calling [addAction] with `Action.ofAuthorization(authorization)`. */
        fun addAction(authorization: Action.AuthorizationAction) =
            addAction(Action.ofAuthorization(authorization))

        /** Alias for calling [addAction] with `Action.ofAuthentication3ds(authentication3ds)`. */
        fun addAction(authentication3ds: Action.Authentication3dsAction) =
            addAction(Action.ofAuthentication3ds(authentication3ds))

        /** Alias for calling [addAction] with `Action.ofDecline(decline)`. */
        fun addAction(decline: Action.DeclineAction) = addAction(Action.ofDecline(decline))

        /** Alias for calling [addAction] with `Action.ofRequireTfa(requireTfa)`. */
        fun addAction(requireTfa: Action.RequireTfaAction) =
            addAction(Action.ofRequireTfa(requireTfa))

        /** Alias for calling [addAction] with `Action.ofApprove(approve)`. */
        fun addAction(approve: Action.ApproveAction) = addAction(Action.ofApprove(approve))

        /** Alias for calling [addAction] with `Action.ofReturnAction(returnAction)`. */
        fun addAction(returnAction: Action.ReturnAction) =
            addAction(Action.ofReturnAction(returnAction))

        /** The Auth Rule token */
        fun authRuleToken(authRuleToken: String) = authRuleToken(JsonField.of(authRuleToken))

        /**
         * Sets [Builder.authRuleToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authRuleToken(authRuleToken: JsonField<String>) = apply {
            this.authRuleToken = authRuleToken
        }

        /** Timestamp of the rule evaluation */
        fun evaluationTime(evaluationTime: OffsetDateTime) =
            evaluationTime(JsonField.of(evaluationTime))

        /**
         * Sets [Builder.evaluationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluationTime(evaluationTime: JsonField<OffsetDateTime>) = apply {
            this.evaluationTime = evaluationTime
        }

        /** The event stream during which the rule was evaluated */
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

        /** Token of the event that triggered the evaluation */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /**
         * Sets [Builder.eventToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        /** The state of the Auth Rule */
        fun mode(mode: AuthRuleState) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [AuthRuleState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mode(mode: JsonField<AuthRuleState>) = apply { this.mode = mode }

        /** Version of the rule that was evaluated */
        fun ruleVersion(ruleVersion: Long) = ruleVersion(JsonField.of(ruleVersion))

        /**
         * Sets [Builder.ruleVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleVersion] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ruleVersion(ruleVersion: JsonField<Long>) = apply { this.ruleVersion = ruleVersion }

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
         * Returns an immutable instance of [V2ListResultsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .actions()
         * .authRuleToken()
         * .evaluationTime()
         * .eventStream()
         * .eventToken()
         * .mode()
         * .ruleVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2ListResultsResponse =
            V2ListResultsResponse(
                checkRequired("token", token),
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("authRuleToken", authRuleToken),
                checkRequired("evaluationTime", evaluationTime),
                checkRequired("eventStream", eventStream),
                checkRequired("eventToken", eventToken),
                checkRequired("mode", mode),
                checkRequired("ruleVersion", ruleVersion),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2ListResultsResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        actions().forEach { it.validate() }
        authRuleToken()
        evaluationTime()
        eventStream().validate()
        eventToken()
        mode().validate()
        ruleVersion()
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
            (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (authRuleToken.asKnown().isPresent) 1 else 0) +
            (if (evaluationTime.asKnown().isPresent) 1 else 0) +
            (eventStream.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventToken.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ruleVersion.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Action.Deserializer::class)
    @JsonSerialize(using = Action.Serializer::class)
    class Action
    private constructor(
        private val authorization: AuthorizationAction? = null,
        private val authentication3ds: Authentication3dsAction? = null,
        private val decline: DeclineAction? = null,
        private val requireTfa: RequireTfaAction? = null,
        private val approve: ApproveAction? = null,
        private val returnAction: ReturnAction? = null,
        private val _json: JsonValue? = null,
    ) {

        fun authorization(): Optional<AuthorizationAction> = Optional.ofNullable(authorization)

        fun authentication3ds(): Optional<Authentication3dsAction> =
            Optional.ofNullable(authentication3ds)

        fun decline(): Optional<DeclineAction> = Optional.ofNullable(decline)

        fun requireTfa(): Optional<RequireTfaAction> = Optional.ofNullable(requireTfa)

        fun approve(): Optional<ApproveAction> = Optional.ofNullable(approve)

        fun returnAction(): Optional<ReturnAction> = Optional.ofNullable(returnAction)

        fun isAuthorization(): Boolean = authorization != null

        fun isAuthentication3ds(): Boolean = authentication3ds != null

        fun isDecline(): Boolean = decline != null

        fun isRequireTfa(): Boolean = requireTfa != null

        fun isApprove(): Boolean = approve != null

        fun isReturnAction(): Boolean = returnAction != null

        fun asAuthorization(): AuthorizationAction = authorization.getOrThrow("authorization")

        fun asAuthentication3ds(): Authentication3dsAction =
            authentication3ds.getOrThrow("authentication3ds")

        fun asDecline(): DeclineAction = decline.getOrThrow("decline")

        fun asRequireTfa(): RequireTfaAction = requireTfa.getOrThrow("requireTfa")

        fun asApprove(): ApproveAction = approve.getOrThrow("approve")

        fun asReturnAction(): ReturnAction = returnAction.getOrThrow("returnAction")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                authorization != null -> visitor.visitAuthorization(authorization)
                authentication3ds != null -> visitor.visitAuthentication3ds(authentication3ds)
                decline != null -> visitor.visitDecline(decline)
                requireTfa != null -> visitor.visitRequireTfa(requireTfa)
                approve != null -> visitor.visitApprove(approve)
                returnAction != null -> visitor.visitReturnAction(returnAction)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAuthorization(authorization: AuthorizationAction) {
                        authorization.validate()
                    }

                    override fun visitAuthentication3ds(
                        authentication3ds: Authentication3dsAction
                    ) {
                        authentication3ds.validate()
                    }

                    override fun visitDecline(decline: DeclineAction) {
                        decline.validate()
                    }

                    override fun visitRequireTfa(requireTfa: RequireTfaAction) {
                        requireTfa.validate()
                    }

                    override fun visitApprove(approve: ApproveAction) {
                        approve.validate()
                    }

                    override fun visitReturnAction(returnAction: ReturnAction) {
                        returnAction.validate()
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
                    override fun visitAuthorization(authorization: AuthorizationAction) =
                        authorization.validity()

                    override fun visitAuthentication3ds(
                        authentication3ds: Authentication3dsAction
                    ) = authentication3ds.validity()

                    override fun visitDecline(decline: DeclineAction) = decline.validity()

                    override fun visitRequireTfa(requireTfa: RequireTfaAction) =
                        requireTfa.validity()

                    override fun visitApprove(approve: ApproveAction) = approve.validity()

                    override fun visitReturnAction(returnAction: ReturnAction) =
                        returnAction.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                authorization == other.authorization &&
                authentication3ds == other.authentication3ds &&
                decline == other.decline &&
                requireTfa == other.requireTfa &&
                approve == other.approve &&
                returnAction == other.returnAction
        }

        override fun hashCode(): Int =
            Objects.hash(
                authorization,
                authentication3ds,
                decline,
                requireTfa,
                approve,
                returnAction,
            )

        override fun toString(): String =
            when {
                authorization != null -> "Action{authorization=$authorization}"
                authentication3ds != null -> "Action{authentication3ds=$authentication3ds}"
                decline != null -> "Action{decline=$decline}"
                requireTfa != null -> "Action{requireTfa=$requireTfa}"
                approve != null -> "Action{approve=$approve}"
                returnAction != null -> "Action{returnAction=$returnAction}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic
            fun ofAuthorization(authorization: AuthorizationAction) =
                Action(authorization = authorization)

            @JvmStatic
            fun ofAuthentication3ds(authentication3ds: Authentication3dsAction) =
                Action(authentication3ds = authentication3ds)

            @JvmStatic fun ofDecline(decline: DeclineAction) = Action(decline = decline)

            @JvmStatic
            fun ofRequireTfa(requireTfa: RequireTfaAction) = Action(requireTfa = requireTfa)

            @JvmStatic fun ofApprove(approve: ApproveAction) = Action(approve = approve)

            @JvmStatic
            fun ofReturnAction(returnAction: ReturnAction) = Action(returnAction = returnAction)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitAuthorization(authorization: AuthorizationAction): T

            fun visitAuthentication3ds(authentication3ds: Authentication3dsAction): T

            fun visitDecline(decline: DeclineAction): T

            fun visitRequireTfa(requireTfa: RequireTfaAction): T

            fun visitApprove(approve: ApproveAction): T

            fun visitReturnAction(returnAction: ReturnAction): T

            /**
             * Maps an unknown variant of [Action] to a value of type [T].
             *
             * An instance of [Action] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Action: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Action>(Action::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Action {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AuthorizationAction>())?.let {
                                Action(authorization = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Authentication3dsAction>())?.let {
                                Action(authentication3ds = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DeclineAction>())?.let {
                                Action(decline = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RequireTfaAction>())?.let {
                                Action(requireTfa = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApproveAction>())?.let {
                                Action(approve = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ReturnAction>())?.let {
                                Action(returnAction = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Action(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Action>(Action::class) {

            override fun serialize(
                value: Action,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.authorization != null -> generator.writeObject(value.authorization)
                    value.authentication3ds != null ->
                        generator.writeObject(value.authentication3ds)
                    value.decline != null -> generator.writeObject(value.decline)
                    value.requireTfa != null -> generator.writeObject(value.requireTfa)
                    value.approve != null -> generator.writeObject(value.approve)
                    value.returnAction != null -> generator.writeObject(value.returnAction)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
        }

        class AuthorizationAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val explanation: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("explanation")
                @ExcludeMissing
                explanation: JsonField<String> = JsonMissing.of()
            ) : this(explanation, mutableMapOf())

            /**
             * Optional explanation for why this action was taken
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun explanation(): Optional<String> = explanation.getOptional("explanation")

            /**
             * Returns the raw JSON value of [explanation].
             *
             * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("explanation")
            @ExcludeMissing
            fun _explanation(): JsonField<String> = explanation

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
                 * Returns a mutable builder for constructing an instance of [AuthorizationAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthorizationAction]. */
            class Builder internal constructor() {

                private var explanation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizationAction: AuthorizationAction) = apply {
                    explanation = authorizationAction.explanation
                    additionalProperties = authorizationAction.additionalProperties.toMutableMap()
                }

                /** Optional explanation for why this action was taken */
                fun explanation(explanation: String) = explanation(JsonField.of(explanation))

                /**
                 * Sets [Builder.explanation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.explanation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
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
                 * Returns an immutable instance of [AuthorizationAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AuthorizationAction =
                    AuthorizationAction(explanation, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): AuthorizationAction = apply {
                if (validated) {
                    return@apply
                }

                explanation()
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
            internal fun validity(): Int = (if (explanation.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthorizationAction &&
                    explanation == other.explanation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(explanation, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizationAction{explanation=$explanation, additionalProperties=$additionalProperties}"
        }

        class Authentication3dsAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val explanation: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("explanation")
                @ExcludeMissing
                explanation: JsonField<String> = JsonMissing.of()
            ) : this(explanation, mutableMapOf())

            /**
             * Optional explanation for why this action was taken
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun explanation(): Optional<String> = explanation.getOptional("explanation")

            /**
             * Returns the raw JSON value of [explanation].
             *
             * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("explanation")
            @ExcludeMissing
            fun _explanation(): JsonField<String> = explanation

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
                 * [Authentication3dsAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Authentication3dsAction]. */
            class Builder internal constructor() {

                private var explanation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authentication3dsAction: Authentication3dsAction) = apply {
                    explanation = authentication3dsAction.explanation
                    additionalProperties =
                        authentication3dsAction.additionalProperties.toMutableMap()
                }

                /** Optional explanation for why this action was taken */
                fun explanation(explanation: String) = explanation(JsonField.of(explanation))

                /**
                 * Sets [Builder.explanation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.explanation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
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
                 * Returns an immutable instance of [Authentication3dsAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Authentication3dsAction =
                    Authentication3dsAction(explanation, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Authentication3dsAction = apply {
                if (validated) {
                    return@apply
                }

                explanation()
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
            internal fun validity(): Int = (if (explanation.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Authentication3dsAction &&
                    explanation == other.explanation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(explanation, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authentication3dsAction{explanation=$explanation, additionalProperties=$additionalProperties}"
        }

        class DeclineAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            ) : this(type, reason, mutableMapOf())

            /**
             * Decline the tokenization request
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Reason code for declining the tokenization request
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<Reason> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * Returns a mutable builder for constructing an instance of [DeclineAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DeclineAction]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(declineAction: DeclineAction) = apply {
                    type = declineAction.type
                    reason = declineAction.reason
                    additionalProperties = declineAction.additionalProperties.toMutableMap()
                }

                /** Decline the tokenization request */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Reason code for declining the tokenization request */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [DeclineAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DeclineAction =
                    DeclineAction(
                        checkRequired("type", type),
                        reason,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DeclineAction = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                reason().ifPresent { it.validate() }
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0)

            /** Decline the tokenization request */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DECLINE = of("DECLINE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    DECLINE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DECLINE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DECLINE -> Value.DECLINE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DECLINE -> Known.DECLINE
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Reason code for declining the tokenization request */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT_SCORE_1 = of("ACCOUNT_SCORE_1")

                    @JvmField val DEVICE_SCORE_1 = of("DEVICE_SCORE_1")

                    @JvmField
                    val ALL_WALLET_DECLINE_REASONS_PRESENT =
                        of("ALL_WALLET_DECLINE_REASONS_PRESENT")

                    @JvmField
                    val WALLET_RECOMMENDED_DECISION_RED = of("WALLET_RECOMMENDED_DECISION_RED")

                    @JvmField val CVC_MISMATCH = of("CVC_MISMATCH")

                    @JvmField val CARD_EXPIRY_MONTH_MISMATCH = of("CARD_EXPIRY_MONTH_MISMATCH")

                    @JvmField val CARD_EXPIRY_YEAR_MISMATCH = of("CARD_EXPIRY_YEAR_MISMATCH")

                    @JvmField val CARD_INVALID_STATE = of("CARD_INVALID_STATE")

                    @JvmField val CUSTOMER_RED_PATH = of("CUSTOMER_RED_PATH")

                    @JvmField val INVALID_CUSTOMER_RESPONSE = of("INVALID_CUSTOMER_RESPONSE")

                    @JvmField val NETWORK_FAILURE = of("NETWORK_FAILURE")

                    @JvmField val GENERIC_DECLINE = of("GENERIC_DECLINE")

                    @JvmField val DIGITAL_CARD_ART_REQUIRED = of("DIGITAL_CARD_ART_REQUIRED")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    ACCOUNT_SCORE_1,
                    DEVICE_SCORE_1,
                    ALL_WALLET_DECLINE_REASONS_PRESENT,
                    WALLET_RECOMMENDED_DECISION_RED,
                    CVC_MISMATCH,
                    CARD_EXPIRY_MONTH_MISMATCH,
                    CARD_EXPIRY_YEAR_MISMATCH,
                    CARD_INVALID_STATE,
                    CUSTOMER_RED_PATH,
                    INVALID_CUSTOMER_RESPONSE,
                    NETWORK_FAILURE,
                    GENERIC_DECLINE,
                    DIGITAL_CARD_ART_REQUIRED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT_SCORE_1,
                    DEVICE_SCORE_1,
                    ALL_WALLET_DECLINE_REASONS_PRESENT,
                    WALLET_RECOMMENDED_DECISION_RED,
                    CVC_MISMATCH,
                    CARD_EXPIRY_MONTH_MISMATCH,
                    CARD_EXPIRY_YEAR_MISMATCH,
                    CARD_INVALID_STATE,
                    CUSTOMER_RED_PATH,
                    INVALID_CUSTOMER_RESPONSE,
                    NETWORK_FAILURE,
                    GENERIC_DECLINE,
                    DIGITAL_CARD_ART_REQUIRED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT_SCORE_1 -> Value.ACCOUNT_SCORE_1
                        DEVICE_SCORE_1 -> Value.DEVICE_SCORE_1
                        ALL_WALLET_DECLINE_REASONS_PRESENT ->
                            Value.ALL_WALLET_DECLINE_REASONS_PRESENT
                        WALLET_RECOMMENDED_DECISION_RED -> Value.WALLET_RECOMMENDED_DECISION_RED
                        CVC_MISMATCH -> Value.CVC_MISMATCH
                        CARD_EXPIRY_MONTH_MISMATCH -> Value.CARD_EXPIRY_MONTH_MISMATCH
                        CARD_EXPIRY_YEAR_MISMATCH -> Value.CARD_EXPIRY_YEAR_MISMATCH
                        CARD_INVALID_STATE -> Value.CARD_INVALID_STATE
                        CUSTOMER_RED_PATH -> Value.CUSTOMER_RED_PATH
                        INVALID_CUSTOMER_RESPONSE -> Value.INVALID_CUSTOMER_RESPONSE
                        NETWORK_FAILURE -> Value.NETWORK_FAILURE
                        GENERIC_DECLINE -> Value.GENERIC_DECLINE
                        DIGITAL_CARD_ART_REQUIRED -> Value.DIGITAL_CARD_ART_REQUIRED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT_SCORE_1 -> Known.ACCOUNT_SCORE_1
                        DEVICE_SCORE_1 -> Known.DEVICE_SCORE_1
                        ALL_WALLET_DECLINE_REASONS_PRESENT ->
                            Known.ALL_WALLET_DECLINE_REASONS_PRESENT
                        WALLET_RECOMMENDED_DECISION_RED -> Known.WALLET_RECOMMENDED_DECISION_RED
                        CVC_MISMATCH -> Known.CVC_MISMATCH
                        CARD_EXPIRY_MONTH_MISMATCH -> Known.CARD_EXPIRY_MONTH_MISMATCH
                        CARD_EXPIRY_YEAR_MISMATCH -> Known.CARD_EXPIRY_YEAR_MISMATCH
                        CARD_INVALID_STATE -> Known.CARD_INVALID_STATE
                        CUSTOMER_RED_PATH -> Known.CUSTOMER_RED_PATH
                        INVALID_CUSTOMER_RESPONSE -> Known.INVALID_CUSTOMER_RESPONSE
                        NETWORK_FAILURE -> Known.NETWORK_FAILURE
                        GENERIC_DECLINE -> Known.GENERIC_DECLINE
                        DIGITAL_CARD_ART_REQUIRED -> Known.DIGITAL_CARD_ART_REQUIRED
                        else -> throw LithicInvalidDataException("Unknown Reason: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DeclineAction &&
                    type == other.type &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DeclineAction{type=$type, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class RequireTfaAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            ) : this(type, reason, mutableMapOf())

            /**
             * Require two-factor authentication for the tokenization request
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Reason code for requiring two-factor authentication
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<Reason> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * Returns a mutable builder for constructing an instance of [RequireTfaAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequireTfaAction]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requireTfaAction: RequireTfaAction) = apply {
                    type = requireTfaAction.type
                    reason = requireTfaAction.reason
                    additionalProperties = requireTfaAction.additionalProperties.toMutableMap()
                }

                /** Require two-factor authentication for the tokenization request */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Reason code for requiring two-factor authentication */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [RequireTfaAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RequireTfaAction =
                    RequireTfaAction(
                        checkRequired("type", type),
                        reason,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RequireTfaAction = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                reason().ifPresent { it.validate() }
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0)

            /** Require two-factor authentication for the tokenization request */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val REQUIRE_TFA = of("REQUIRE_TFA")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    REQUIRE_TFA
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REQUIRE_TFA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        REQUIRE_TFA -> Value.REQUIRE_TFA
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        REQUIRE_TFA -> Known.REQUIRE_TFA
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Reason code for requiring two-factor authentication */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WALLET_RECOMMENDED_TFA = of("WALLET_RECOMMENDED_TFA")

                    @JvmField val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

                    @JvmField val DEVICE_RECENTLY_LOST = of("DEVICE_RECENTLY_LOST")

                    @JvmField val TOO_MANY_RECENT_ATTEMPTS = of("TOO_MANY_RECENT_ATTEMPTS")

                    @JvmField val TOO_MANY_RECENT_TOKENS = of("TOO_MANY_RECENT_TOKENS")

                    @JvmField
                    val TOO_MANY_DIFFERENT_CARDHOLDERS = of("TOO_MANY_DIFFERENT_CARDHOLDERS")

                    @JvmField val OUTSIDE_HOME_TERRITORY = of("OUTSIDE_HOME_TERRITORY")

                    @JvmField val HAS_SUSPENDED_TOKENS = of("HAS_SUSPENDED_TOKENS")

                    @JvmField val HIGH_RISK = of("HIGH_RISK")

                    @JvmField val ACCOUNT_SCORE_LOW = of("ACCOUNT_SCORE_LOW")

                    @JvmField val DEVICE_SCORE_LOW = of("DEVICE_SCORE_LOW")

                    @JvmField val CARD_STATE_TFA = of("CARD_STATE_TFA")

                    @JvmField val HARDCODED_TFA = of("HARDCODED_TFA")

                    @JvmField val CUSTOMER_RULE_TFA = of("CUSTOMER_RULE_TFA")

                    @JvmField val DEVICE_HOST_CARD_EMULATION = of("DEVICE_HOST_CARD_EMULATION")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    WALLET_RECOMMENDED_TFA,
                    SUSPICIOUS_ACTIVITY,
                    DEVICE_RECENTLY_LOST,
                    TOO_MANY_RECENT_ATTEMPTS,
                    TOO_MANY_RECENT_TOKENS,
                    TOO_MANY_DIFFERENT_CARDHOLDERS,
                    OUTSIDE_HOME_TERRITORY,
                    HAS_SUSPENDED_TOKENS,
                    HIGH_RISK,
                    ACCOUNT_SCORE_LOW,
                    DEVICE_SCORE_LOW,
                    CARD_STATE_TFA,
                    HARDCODED_TFA,
                    CUSTOMER_RULE_TFA,
                    DEVICE_HOST_CARD_EMULATION,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WALLET_RECOMMENDED_TFA,
                    SUSPICIOUS_ACTIVITY,
                    DEVICE_RECENTLY_LOST,
                    TOO_MANY_RECENT_ATTEMPTS,
                    TOO_MANY_RECENT_TOKENS,
                    TOO_MANY_DIFFERENT_CARDHOLDERS,
                    OUTSIDE_HOME_TERRITORY,
                    HAS_SUSPENDED_TOKENS,
                    HIGH_RISK,
                    ACCOUNT_SCORE_LOW,
                    DEVICE_SCORE_LOW,
                    CARD_STATE_TFA,
                    HARDCODED_TFA,
                    CUSTOMER_RULE_TFA,
                    DEVICE_HOST_CARD_EMULATION,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WALLET_RECOMMENDED_TFA -> Value.WALLET_RECOMMENDED_TFA
                        SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
                        DEVICE_RECENTLY_LOST -> Value.DEVICE_RECENTLY_LOST
                        TOO_MANY_RECENT_ATTEMPTS -> Value.TOO_MANY_RECENT_ATTEMPTS
                        TOO_MANY_RECENT_TOKENS -> Value.TOO_MANY_RECENT_TOKENS
                        TOO_MANY_DIFFERENT_CARDHOLDERS -> Value.TOO_MANY_DIFFERENT_CARDHOLDERS
                        OUTSIDE_HOME_TERRITORY -> Value.OUTSIDE_HOME_TERRITORY
                        HAS_SUSPENDED_TOKENS -> Value.HAS_SUSPENDED_TOKENS
                        HIGH_RISK -> Value.HIGH_RISK
                        ACCOUNT_SCORE_LOW -> Value.ACCOUNT_SCORE_LOW
                        DEVICE_SCORE_LOW -> Value.DEVICE_SCORE_LOW
                        CARD_STATE_TFA -> Value.CARD_STATE_TFA
                        HARDCODED_TFA -> Value.HARDCODED_TFA
                        CUSTOMER_RULE_TFA -> Value.CUSTOMER_RULE_TFA
                        DEVICE_HOST_CARD_EMULATION -> Value.DEVICE_HOST_CARD_EMULATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WALLET_RECOMMENDED_TFA -> Known.WALLET_RECOMMENDED_TFA
                        SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
                        DEVICE_RECENTLY_LOST -> Known.DEVICE_RECENTLY_LOST
                        TOO_MANY_RECENT_ATTEMPTS -> Known.TOO_MANY_RECENT_ATTEMPTS
                        TOO_MANY_RECENT_TOKENS -> Known.TOO_MANY_RECENT_TOKENS
                        TOO_MANY_DIFFERENT_CARDHOLDERS -> Known.TOO_MANY_DIFFERENT_CARDHOLDERS
                        OUTSIDE_HOME_TERRITORY -> Known.OUTSIDE_HOME_TERRITORY
                        HAS_SUSPENDED_TOKENS -> Known.HAS_SUSPENDED_TOKENS
                        HIGH_RISK -> Known.HIGH_RISK
                        ACCOUNT_SCORE_LOW -> Known.ACCOUNT_SCORE_LOW
                        DEVICE_SCORE_LOW -> Known.DEVICE_SCORE_LOW
                        CARD_STATE_TFA -> Known.CARD_STATE_TFA
                        HARDCODED_TFA -> Known.HARDCODED_TFA
                        CUSTOMER_RULE_TFA -> Known.CUSTOMER_RULE_TFA
                        DEVICE_HOST_CARD_EMULATION -> Known.DEVICE_HOST_CARD_EMULATION
                        else -> throw LithicInvalidDataException("Unknown Reason: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequireTfaAction &&
                    type == other.type &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequireTfaAction{type=$type, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class ApproveAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
            ) : this(type, mutableMapOf())

            /**
             * Approve the ACH transaction
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

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

                /**
                 * Returns a mutable builder for constructing an instance of [ApproveAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApproveAction]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(approveAction: ApproveAction) = apply {
                    type = approveAction.type
                    additionalProperties = approveAction.additionalProperties.toMutableMap()
                }

                /** Approve the ACH transaction */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [ApproveAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApproveAction =
                    ApproveAction(checkRequired("type", type), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ApproveAction = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
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
            internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Approve the ACH transaction */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val APPROVE = of("APPROVE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    APPROVE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        APPROVE -> Value.APPROVE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        APPROVE -> Known.APPROVE
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApproveAction &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApproveAction{type=$type, additionalProperties=$additionalProperties}"
        }

        class ReturnAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<Code>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(code, type, mutableMapOf())

            /**
             * NACHA return code to use when returning the transaction. Note that the list of
             * available return codes is subject to an allowlist configured at the program level
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): Code = code.getRequired("code")

            /**
             * Return the ACH transaction
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

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

                /**
                 * Returns a mutable builder for constructing an instance of [ReturnAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ReturnAction]. */
            class Builder internal constructor() {

                private var code: JsonField<Code>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAction: ReturnAction) = apply {
                    code = returnAction.code
                    type = returnAction.type
                    additionalProperties = returnAction.additionalProperties.toMutableMap()
                }

                /**
                 * NACHA return code to use when returning the transaction. Note that the list of
                 * available return codes is subject to an allowlist configured at the program level
                 */
                fun code(code: Code) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [Code] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<Code>) = apply { this.code = code }

                /** Return the ACH transaction */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [ReturnAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReturnAction =
                    ReturnAction(
                        checkRequired("code", code),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ReturnAction = apply {
                if (validated) {
                    return@apply
                }

                code().validate()
                type().validate()
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
                (code.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * NACHA return code to use when returning the transaction. Note that the list of
             * available return codes is subject to an allowlist configured at the program level
             */
            class Code @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val R01 = of("R01")

                    @JvmField val R02 = of("R02")

                    @JvmField val R03 = of("R03")

                    @JvmField val R04 = of("R04")

                    @JvmField val R05 = of("R05")

                    @JvmField val R06 = of("R06")

                    @JvmField val R07 = of("R07")

                    @JvmField val R08 = of("R08")

                    @JvmField val R09 = of("R09")

                    @JvmField val R10 = of("R10")

                    @JvmField val R11 = of("R11")

                    @JvmField val R12 = of("R12")

                    @JvmField val R13 = of("R13")

                    @JvmField val R14 = of("R14")

                    @JvmField val R15 = of("R15")

                    @JvmField val R16 = of("R16")

                    @JvmField val R17 = of("R17")

                    @JvmField val R18 = of("R18")

                    @JvmField val R19 = of("R19")

                    @JvmField val R20 = of("R20")

                    @JvmField val R21 = of("R21")

                    @JvmField val R22 = of("R22")

                    @JvmField val R23 = of("R23")

                    @JvmField val R24 = of("R24")

                    @JvmField val R25 = of("R25")

                    @JvmField val R26 = of("R26")

                    @JvmField val R27 = of("R27")

                    @JvmField val R28 = of("R28")

                    @JvmField val R29 = of("R29")

                    @JvmField val R30 = of("R30")

                    @JvmField val R31 = of("R31")

                    @JvmField val R32 = of("R32")

                    @JvmField val R33 = of("R33")

                    @JvmField val R34 = of("R34")

                    @JvmField val R35 = of("R35")

                    @JvmField val R36 = of("R36")

                    @JvmField val R37 = of("R37")

                    @JvmField val R38 = of("R38")

                    @JvmField val R39 = of("R39")

                    @JvmField val R40 = of("R40")

                    @JvmField val R41 = of("R41")

                    @JvmField val R42 = of("R42")

                    @JvmField val R43 = of("R43")

                    @JvmField val R44 = of("R44")

                    @JvmField val R45 = of("R45")

                    @JvmField val R46 = of("R46")

                    @JvmField val R47 = of("R47")

                    @JvmField val R50 = of("R50")

                    @JvmField val R51 = of("R51")

                    @JvmField val R52 = of("R52")

                    @JvmField val R53 = of("R53")

                    @JvmField val R61 = of("R61")

                    @JvmField val R62 = of("R62")

                    @JvmField val R67 = of("R67")

                    @JvmField val R68 = of("R68")

                    @JvmField val R69 = of("R69")

                    @JvmField val R70 = of("R70")

                    @JvmField val R71 = of("R71")

                    @JvmField val R72 = of("R72")

                    @JvmField val R73 = of("R73")

                    @JvmField val R74 = of("R74")

                    @JvmField val R75 = of("R75")

                    @JvmField val R76 = of("R76")

                    @JvmField val R77 = of("R77")

                    @JvmField val R80 = of("R80")

                    @JvmField val R81 = of("R81")

                    @JvmField val R82 = of("R82")

                    @JvmField val R83 = of("R83")

                    @JvmField val R84 = of("R84")

                    @JvmField val R85 = of("R85")

                    @JvmStatic fun of(value: String) = Code(JsonField.of(value))
                }

                /** An enum containing [Code]'s known values. */
                enum class Known {
                    R01,
                    R02,
                    R03,
                    R04,
                    R05,
                    R06,
                    R07,
                    R08,
                    R09,
                    R10,
                    R11,
                    R12,
                    R13,
                    R14,
                    R15,
                    R16,
                    R17,
                    R18,
                    R19,
                    R20,
                    R21,
                    R22,
                    R23,
                    R24,
                    R25,
                    R26,
                    R27,
                    R28,
                    R29,
                    R30,
                    R31,
                    R32,
                    R33,
                    R34,
                    R35,
                    R36,
                    R37,
                    R38,
                    R39,
                    R40,
                    R41,
                    R42,
                    R43,
                    R44,
                    R45,
                    R46,
                    R47,
                    R50,
                    R51,
                    R52,
                    R53,
                    R61,
                    R62,
                    R67,
                    R68,
                    R69,
                    R70,
                    R71,
                    R72,
                    R73,
                    R74,
                    R75,
                    R76,
                    R77,
                    R80,
                    R81,
                    R82,
                    R83,
                    R84,
                    R85,
                }

                /**
                 * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Code] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    R01,
                    R02,
                    R03,
                    R04,
                    R05,
                    R06,
                    R07,
                    R08,
                    R09,
                    R10,
                    R11,
                    R12,
                    R13,
                    R14,
                    R15,
                    R16,
                    R17,
                    R18,
                    R19,
                    R20,
                    R21,
                    R22,
                    R23,
                    R24,
                    R25,
                    R26,
                    R27,
                    R28,
                    R29,
                    R30,
                    R31,
                    R32,
                    R33,
                    R34,
                    R35,
                    R36,
                    R37,
                    R38,
                    R39,
                    R40,
                    R41,
                    R42,
                    R43,
                    R44,
                    R45,
                    R46,
                    R47,
                    R50,
                    R51,
                    R52,
                    R53,
                    R61,
                    R62,
                    R67,
                    R68,
                    R69,
                    R70,
                    R71,
                    R72,
                    R73,
                    R74,
                    R75,
                    R76,
                    R77,
                    R80,
                    R81,
                    R82,
                    R83,
                    R84,
                    R85,
                    /**
                     * An enum member indicating that [Code] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        R01 -> Value.R01
                        R02 -> Value.R02
                        R03 -> Value.R03
                        R04 -> Value.R04
                        R05 -> Value.R05
                        R06 -> Value.R06
                        R07 -> Value.R07
                        R08 -> Value.R08
                        R09 -> Value.R09
                        R10 -> Value.R10
                        R11 -> Value.R11
                        R12 -> Value.R12
                        R13 -> Value.R13
                        R14 -> Value.R14
                        R15 -> Value.R15
                        R16 -> Value.R16
                        R17 -> Value.R17
                        R18 -> Value.R18
                        R19 -> Value.R19
                        R20 -> Value.R20
                        R21 -> Value.R21
                        R22 -> Value.R22
                        R23 -> Value.R23
                        R24 -> Value.R24
                        R25 -> Value.R25
                        R26 -> Value.R26
                        R27 -> Value.R27
                        R28 -> Value.R28
                        R29 -> Value.R29
                        R30 -> Value.R30
                        R31 -> Value.R31
                        R32 -> Value.R32
                        R33 -> Value.R33
                        R34 -> Value.R34
                        R35 -> Value.R35
                        R36 -> Value.R36
                        R37 -> Value.R37
                        R38 -> Value.R38
                        R39 -> Value.R39
                        R40 -> Value.R40
                        R41 -> Value.R41
                        R42 -> Value.R42
                        R43 -> Value.R43
                        R44 -> Value.R44
                        R45 -> Value.R45
                        R46 -> Value.R46
                        R47 -> Value.R47
                        R50 -> Value.R50
                        R51 -> Value.R51
                        R52 -> Value.R52
                        R53 -> Value.R53
                        R61 -> Value.R61
                        R62 -> Value.R62
                        R67 -> Value.R67
                        R68 -> Value.R68
                        R69 -> Value.R69
                        R70 -> Value.R70
                        R71 -> Value.R71
                        R72 -> Value.R72
                        R73 -> Value.R73
                        R74 -> Value.R74
                        R75 -> Value.R75
                        R76 -> Value.R76
                        R77 -> Value.R77
                        R80 -> Value.R80
                        R81 -> Value.R81
                        R82 -> Value.R82
                        R83 -> Value.R83
                        R84 -> Value.R84
                        R85 -> Value.R85
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        R01 -> Known.R01
                        R02 -> Known.R02
                        R03 -> Known.R03
                        R04 -> Known.R04
                        R05 -> Known.R05
                        R06 -> Known.R06
                        R07 -> Known.R07
                        R08 -> Known.R08
                        R09 -> Known.R09
                        R10 -> Known.R10
                        R11 -> Known.R11
                        R12 -> Known.R12
                        R13 -> Known.R13
                        R14 -> Known.R14
                        R15 -> Known.R15
                        R16 -> Known.R16
                        R17 -> Known.R17
                        R18 -> Known.R18
                        R19 -> Known.R19
                        R20 -> Known.R20
                        R21 -> Known.R21
                        R22 -> Known.R22
                        R23 -> Known.R23
                        R24 -> Known.R24
                        R25 -> Known.R25
                        R26 -> Known.R26
                        R27 -> Known.R27
                        R28 -> Known.R28
                        R29 -> Known.R29
                        R30 -> Known.R30
                        R31 -> Known.R31
                        R32 -> Known.R32
                        R33 -> Known.R33
                        R34 -> Known.R34
                        R35 -> Known.R35
                        R36 -> Known.R36
                        R37 -> Known.R37
                        R38 -> Known.R38
                        R39 -> Known.R39
                        R40 -> Known.R40
                        R41 -> Known.R41
                        R42 -> Known.R42
                        R43 -> Known.R43
                        R44 -> Known.R44
                        R45 -> Known.R45
                        R46 -> Known.R46
                        R47 -> Known.R47
                        R50 -> Known.R50
                        R51 -> Known.R51
                        R52 -> Known.R52
                        R53 -> Known.R53
                        R61 -> Known.R61
                        R62 -> Known.R62
                        R67 -> Known.R67
                        R68 -> Known.R68
                        R69 -> Known.R69
                        R70 -> Known.R70
                        R71 -> Known.R71
                        R72 -> Known.R72
                        R73 -> Known.R73
                        R74 -> Known.R74
                        R75 -> Known.R75
                        R76 -> Known.R76
                        R77 -> Known.R77
                        R80 -> Known.R80
                        R81 -> Known.R81
                        R82 -> Known.R82
                        R83 -> Known.R83
                        R84 -> Known.R84
                        R85 -> Known.R85
                        else -> throw LithicInvalidDataException("Unknown Code: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Code = apply {
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

                    return other is Code && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Return the ACH transaction */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val RETURN = of("RETURN")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    RETURN
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RETURN,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RETURN -> Value.RETURN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        RETURN -> Known.RETURN
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnAction &&
                    code == other.code &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(code, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReturnAction{code=$code, type=$type, additionalProperties=$additionalProperties}"
        }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ListResultsResponse &&
            token == other.token &&
            actions == other.actions &&
            authRuleToken == other.authRuleToken &&
            evaluationTime == other.evaluationTime &&
            eventStream == other.eventStream &&
            eventToken == other.eventToken &&
            mode == other.mode &&
            ruleVersion == other.ruleVersion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            actions,
            authRuleToken,
            evaluationTime,
            eventStream,
            eventToken,
            mode,
            ruleVersion,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2ListResultsResponse{token=$token, actions=$actions, authRuleToken=$authRuleToken, evaluationTime=$evaluationTime, eventStream=$eventStream, eventToken=$eventToken, mode=$mode, ruleVersion=$ruleVersion, additionalProperties=$additionalProperties}"
}
