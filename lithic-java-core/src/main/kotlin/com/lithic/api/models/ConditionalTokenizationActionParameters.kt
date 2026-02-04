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

class ConditionalTokenizationActionParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Action>,
    private val conditions: JsonField<List<Condition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<Condition>> = JsonMissing.of(),
    ) : this(action, conditions, mutableMapOf())

    /**
     * The action to take if the conditions are met
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = action.getRequired("action")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conditions(): List<Condition> = conditions.getRequired("conditions")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
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
         * [ConditionalTokenizationActionParameters].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionalTokenizationActionParameters]. */
    class Builder internal constructor() {

        private var action: JsonField<Action>? = null
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conditionalTokenizationActionParameters: ConditionalTokenizationActionParameters
        ) = apply {
            action = conditionalTokenizationActionParameters.action
            conditions =
                conditionalTokenizationActionParameters.conditions.map { it.toMutableList() }
            additionalProperties =
                conditionalTokenizationActionParameters.additionalProperties.toMutableMap()
        }

        /** The action to take if the conditions are met */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        /** Alias for calling [action] with `Action.ofDecline(decline)`. */
        fun action(decline: Action.DeclineAction) = action(Action.ofDecline(decline))

        /** Alias for calling [action] with `Action.ofRequireTfa(requireTfa)`. */
        fun action(requireTfa: Action.RequireTfaAction) = action(Action.ofRequireTfa(requireTfa))

        fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<Condition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ConditionalTokenizationActionParameters].
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
        fun build(): ConditionalTokenizationActionParameters =
            ConditionalTokenizationActionParameters(
                checkRequired("action", action),
                checkRequired("conditions", conditions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConditionalTokenizationActionParameters = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The action to take if the conditions are met */
    @JsonDeserialize(using = Action.Deserializer::class)
    @JsonSerialize(using = Action.Serializer::class)
    class Action
    private constructor(
        private val decline: DeclineAction? = null,
        private val requireTfa: RequireTfaAction? = null,
        private val _json: JsonValue? = null,
    ) {

        fun decline(): Optional<DeclineAction> = Optional.ofNullable(decline)

        fun requireTfa(): Optional<RequireTfaAction> = Optional.ofNullable(requireTfa)

        fun isDecline(): Boolean = decline != null

        fun isRequireTfa(): Boolean = requireTfa != null

        fun asDecline(): DeclineAction = decline.getOrThrow("decline")

        fun asRequireTfa(): RequireTfaAction = requireTfa.getOrThrow("requireTfa")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                decline != null -> visitor.visitDecline(decline)
                requireTfa != null -> visitor.visitRequireTfa(requireTfa)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDecline(decline: DeclineAction) {
                        decline.validate()
                    }

                    override fun visitRequireTfa(requireTfa: RequireTfaAction) {
                        requireTfa.validate()
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
                    override fun visitDecline(decline: DeclineAction) = decline.validity()

                    override fun visitRequireTfa(requireTfa: RequireTfaAction) =
                        requireTfa.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action && decline == other.decline && requireTfa == other.requireTfa
        }

        override fun hashCode(): Int = Objects.hash(decline, requireTfa)

        override fun toString(): String =
            when {
                decline != null -> "Action{decline=$decline}"
                requireTfa != null -> "Action{requireTfa=$requireTfa}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic fun ofDecline(decline: DeclineAction) = Action(decline = decline)

            @JvmStatic
            fun ofRequireTfa(requireTfa: RequireTfaAction) = Action(requireTfa = requireTfa)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitDecline(decline: DeclineAction): T

            fun visitRequireTfa(requireTfa: RequireTfaAction): T

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
                            tryDeserialize(node, jacksonTypeRef<DeclineAction>())?.let {
                                Action(decline = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RequireTfaAction>())?.let {
                                Action(requireTfa = it, _json = json)
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
                    value.decline != null -> generator.writeObject(value.decline)
                    value.requireTfa != null -> generator.writeObject(value.requireTfa)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
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
    }

    class Condition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attribute: JsonField<Attribute>,
        private val operation: JsonField<ConditionalOperation>,
        private val value: JsonField<ConditionalValue>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute")
            @ExcludeMissing
            attribute: JsonField<Attribute> = JsonMissing.of(),
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<ConditionalOperation> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            value: JsonField<ConditionalValue> = JsonMissing.of(),
        ) : this(attribute, operation, value, mutableMapOf())

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * * `TIMESTAMP`: The timestamp of the tokenization request in ISO 8601 format.
         * * `TOKENIZATION_CHANNEL`: The channel through which the tokenization request was
         *   initiated. Valid values are `DIGITAL_WALLET`, `MERCHANT`.
         * * `TOKENIZATION_SOURCE`: The source of the tokenization request. Valid values are
         *   `ACCOUNT_ON_FILE`, `MANUAL_PROVISION`, `PUSH_PROVISION`, `CHIP_DIP`, `CONTACTLESS_TAP`,
         *   `TOKEN`, `UNKNOWN`.
         * * `TOKEN_REQUESTOR_NAME`: The name of the entity requesting the token. Valid values are
         *   `ALT_ID`, `AMAZON_ONE`, `AMERICAN_EXPRESS_TOKEN_SERVICE`, `ANDROID_PAY`, `APPLE_PAY`,
         *   `FACEBOOK`, `FITBIT_PAY`, `GARMIN_PAY`, `GOOGLE_PAY`, `GOOGLE_VCN`, `ISSUER_HCE`,
         *   `MICROSOFT_PAY`, `NETFLIX`, `SAMSUNG_PAY`, `UNKNOWN`, `VISA_CHECKOUT`.
         * * `WALLET_ACCOUNT_SCORE`: Risk score for the account in the digital wallet. Numeric value
         *   where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium risk).
         * * `WALLET_DEVICE_SCORE`: Risk score for the device in the digital wallet. Numeric value
         *   where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium risk).
         * * `WALLET_RECOMMENDED_DECISION`: The decision recommended by the digital wallet provider.
         *   Valid values include APPROVE, DECLINE, REQUIRE_ADDITIONAL_AUTHENTICATION.
         * * `WALLET_RECOMMENDATION_REASONS`: List of reasons provided by the digital wallet
         *   provider for the recommended decision. Valid values are `ACCOUNT_CARD_TOO_NEW`,
         *   `ACCOUNT_RECENTLY_CHANGED`, `ACCOUNT_TOO_NEW`, `ACCOUNT_TOO_NEW_SINCE_LAUNCH`,
         *   `DEVICE_RECENTLY_LOST`, `HAS_SUSPENDED_TOKENS`, `HIGH_RISK`, `INACTIVE_ACCOUNT`,
         *   `LOW_ACCOUNT_SCORE`, `LOW_DEVICE_SCORE`, `OUTSIDE_HOME_TERRITORY`,
         *   `SUSPICIOUS_ACTIVITY`, `TOO_MANY_DIFFERENT_CARDHOLDERS`, `TOO_MANY_RECENT_ATTEMPTS`,
         *   `TOO_MANY_RECENT_TOKENS`, `UNABLE_TO_ASSESS`.
         * * `TOKEN_REQUESTOR_ID`: Unique identifier for the entity requesting the token.
         * * `WALLET_TOKEN_STATUS`: The current status of the wallet token.
         * * `CARD_STATE`: The state of the card being tokenized. Valid values are `CLOSED`, `OPEN`,
         *   `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attribute(): Attribute = attribute.getRequired("attribute")

        /**
         * The operation to apply to the attribute
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operation(): ConditionalOperation = operation.getRequired("operation")

        /**
         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): ConditionalValue = value.getRequired("value")

        /**
         * Returns the raw JSON value of [attribute].
         *
         * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attribute")
        @ExcludeMissing
        fun _attribute(): JsonField<Attribute> = attribute

        /**
         * Returns the raw JSON value of [operation].
         *
         * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operation")
        @ExcludeMissing
        fun _operation(): JsonField<ConditionalOperation> = operation

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<ConditionalValue> = value

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
             *
             * The following fields are required:
             * ```java
             * .attribute()
             * .operation()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var attribute: JsonField<Attribute>? = null
            private var operation: JsonField<ConditionalOperation>? = null
            private var value: JsonField<ConditionalValue>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
             * * `TIMESTAMP`: The timestamp of the tokenization request in ISO 8601 format.
             * * `TOKENIZATION_CHANNEL`: The channel through which the tokenization request was
             *   initiated. Valid values are `DIGITAL_WALLET`, `MERCHANT`.
             * * `TOKENIZATION_SOURCE`: The source of the tokenization request. Valid values are
             *   `ACCOUNT_ON_FILE`, `MANUAL_PROVISION`, `PUSH_PROVISION`, `CHIP_DIP`,
             *   `CONTACTLESS_TAP`, `TOKEN`, `UNKNOWN`.
             * * `TOKEN_REQUESTOR_NAME`: The name of the entity requesting the token. Valid values
             *   are `ALT_ID`, `AMAZON_ONE`, `AMERICAN_EXPRESS_TOKEN_SERVICE`, `ANDROID_PAY`,
             *   `APPLE_PAY`, `FACEBOOK`, `FITBIT_PAY`, `GARMIN_PAY`, `GOOGLE_PAY`, `GOOGLE_VCN`,
             *   `ISSUER_HCE`, `MICROSOFT_PAY`, `NETFLIX`, `SAMSUNG_PAY`, `UNKNOWN`,
             *   `VISA_CHECKOUT`.
             * * `WALLET_ACCOUNT_SCORE`: Risk score for the account in the digital wallet. Numeric
             *   value where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium
             *   risk).
             * * `WALLET_DEVICE_SCORE`: Risk score for the device in the digital wallet. Numeric
             *   value where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium
             *   risk).
             * * `WALLET_RECOMMENDED_DECISION`: The decision recommended by the digital wallet
             *   provider. Valid values include APPROVE, DECLINE, REQUIRE_ADDITIONAL_AUTHENTICATION.
             * * `WALLET_RECOMMENDATION_REASONS`: List of reasons provided by the digital wallet
             *   provider for the recommended decision. Valid values are `ACCOUNT_CARD_TOO_NEW`,
             *   `ACCOUNT_RECENTLY_CHANGED`, `ACCOUNT_TOO_NEW`, `ACCOUNT_TOO_NEW_SINCE_LAUNCH`,
             *   `DEVICE_RECENTLY_LOST`, `HAS_SUSPENDED_TOKENS`, `HIGH_RISK`, `INACTIVE_ACCOUNT`,
             *   `LOW_ACCOUNT_SCORE`, `LOW_DEVICE_SCORE`, `OUTSIDE_HOME_TERRITORY`,
             *   `SUSPICIOUS_ACTIVITY`, `TOO_MANY_DIFFERENT_CARDHOLDERS`,
             *   `TOO_MANY_RECENT_ATTEMPTS`, `TOO_MANY_RECENT_TOKENS`, `UNABLE_TO_ASSESS`.
             * * `TOKEN_REQUESTOR_ID`: Unique identifier for the entity requesting the token.
             * * `WALLET_TOKEN_STATUS`: The current status of the wallet token.
             * * `CARD_STATE`: The state of the card being tokenized. Valid values are `CLOSED`,
             *   `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
             */
            fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

            /**
             * Sets [Builder.attribute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attribute] with a well-typed [Attribute] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attribute(attribute: JsonField<Attribute>) = apply { this.attribute = attribute }

            /** The operation to apply to the attribute */
            fun operation(operation: ConditionalOperation) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed [ConditionalOperation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun operation(operation: JsonField<ConditionalOperation>) = apply {
                this.operation = operation
            }

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun value(value: ConditionalValue) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [ConditionalValue] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<ConditionalValue>) = apply { this.value = value }

            /** Alias for calling [value] with `ConditionalValue.ofRegex(regex)`. */
            fun value(regex: String) = value(ConditionalValue.ofRegex(regex))

            /** Alias for calling [value] with `ConditionalValue.ofNumber(number)`. */
            fun value(number: Long) = value(ConditionalValue.ofNumber(number))

            /** Alias for calling [value] with `ConditionalValue.ofListOfStrings(listOfStrings)`. */
            fun valueOfListOfStrings(listOfStrings: List<String>) =
                value(ConditionalValue.ofListOfStrings(listOfStrings))

            /** Alias for calling [value] with `ConditionalValue.ofTimestamp(timestamp)`. */
            fun value(timestamp: OffsetDateTime) = value(ConditionalValue.ofTimestamp(timestamp))

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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attribute()
             * .operation()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Condition =
                Condition(
                    checkRequired("attribute", attribute),
                    checkRequired("operation", operation),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            attribute().validate()
            operation().validate()
            value().validate()
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
         * * `TIMESTAMP`: The timestamp of the tokenization request in ISO 8601 format.
         * * `TOKENIZATION_CHANNEL`: The channel through which the tokenization request was
         *   initiated. Valid values are `DIGITAL_WALLET`, `MERCHANT`.
         * * `TOKENIZATION_SOURCE`: The source of the tokenization request. Valid values are
         *   `ACCOUNT_ON_FILE`, `MANUAL_PROVISION`, `PUSH_PROVISION`, `CHIP_DIP`, `CONTACTLESS_TAP`,
         *   `TOKEN`, `UNKNOWN`.
         * * `TOKEN_REQUESTOR_NAME`: The name of the entity requesting the token. Valid values are
         *   `ALT_ID`, `AMAZON_ONE`, `AMERICAN_EXPRESS_TOKEN_SERVICE`, `ANDROID_PAY`, `APPLE_PAY`,
         *   `FACEBOOK`, `FITBIT_PAY`, `GARMIN_PAY`, `GOOGLE_PAY`, `GOOGLE_VCN`, `ISSUER_HCE`,
         *   `MICROSOFT_PAY`, `NETFLIX`, `SAMSUNG_PAY`, `UNKNOWN`, `VISA_CHECKOUT`.
         * * `WALLET_ACCOUNT_SCORE`: Risk score for the account in the digital wallet. Numeric value
         *   where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium risk).
         * * `WALLET_DEVICE_SCORE`: Risk score for the device in the digital wallet. Numeric value
         *   where lower numbers indicate higher risk (e.g., 1 = high risk, 2 = medium risk).
         * * `WALLET_RECOMMENDED_DECISION`: The decision recommended by the digital wallet provider.
         *   Valid values include APPROVE, DECLINE, REQUIRE_ADDITIONAL_AUTHENTICATION.
         * * `WALLET_RECOMMENDATION_REASONS`: List of reasons provided by the digital wallet
         *   provider for the recommended decision. Valid values are `ACCOUNT_CARD_TOO_NEW`,
         *   `ACCOUNT_RECENTLY_CHANGED`, `ACCOUNT_TOO_NEW`, `ACCOUNT_TOO_NEW_SINCE_LAUNCH`,
         *   `DEVICE_RECENTLY_LOST`, `HAS_SUSPENDED_TOKENS`, `HIGH_RISK`, `INACTIVE_ACCOUNT`,
         *   `LOW_ACCOUNT_SCORE`, `LOW_DEVICE_SCORE`, `OUTSIDE_HOME_TERRITORY`,
         *   `SUSPICIOUS_ACTIVITY`, `TOO_MANY_DIFFERENT_CARDHOLDERS`, `TOO_MANY_RECENT_ATTEMPTS`,
         *   `TOO_MANY_RECENT_TOKENS`, `UNABLE_TO_ASSESS`.
         * * `TOKEN_REQUESTOR_ID`: Unique identifier for the entity requesting the token.
         * * `WALLET_TOKEN_STATUS`: The current status of the wallet token.
         * * `CARD_STATE`: The state of the card being tokenized. Valid values are `CLOSED`, `OPEN`,
         *   `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
         */
        class Attribute @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val TIMESTAMP = of("TIMESTAMP")

                @JvmField val TOKENIZATION_CHANNEL = of("TOKENIZATION_CHANNEL")

                @JvmField val TOKENIZATION_SOURCE = of("TOKENIZATION_SOURCE")

                @JvmField val TOKEN_REQUESTOR_NAME = of("TOKEN_REQUESTOR_NAME")

                @JvmField val WALLET_ACCOUNT_SCORE = of("WALLET_ACCOUNT_SCORE")

                @JvmField val WALLET_DEVICE_SCORE = of("WALLET_DEVICE_SCORE")

                @JvmField val WALLET_RECOMMENDED_DECISION = of("WALLET_RECOMMENDED_DECISION")

                @JvmField val WALLET_RECOMMENDATION_REASONS = of("WALLET_RECOMMENDATION_REASONS")

                @JvmField val TOKEN_REQUESTOR_ID = of("TOKEN_REQUESTOR_ID")

                @JvmField val WALLET_TOKEN_STATUS = of("WALLET_TOKEN_STATUS")

                @JvmField val CARD_STATE = of("CARD_STATE")

                @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
            }

            /** An enum containing [Attribute]'s known values. */
            enum class Known {
                TIMESTAMP,
                TOKENIZATION_CHANNEL,
                TOKENIZATION_SOURCE,
                TOKEN_REQUESTOR_NAME,
                WALLET_ACCOUNT_SCORE,
                WALLET_DEVICE_SCORE,
                WALLET_RECOMMENDED_DECISION,
                WALLET_RECOMMENDATION_REASONS,
                TOKEN_REQUESTOR_ID,
                WALLET_TOKEN_STATUS,
                CARD_STATE,
            }

            /**
             * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Attribute] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TIMESTAMP,
                TOKENIZATION_CHANNEL,
                TOKENIZATION_SOURCE,
                TOKEN_REQUESTOR_NAME,
                WALLET_ACCOUNT_SCORE,
                WALLET_DEVICE_SCORE,
                WALLET_RECOMMENDED_DECISION,
                WALLET_RECOMMENDATION_REASONS,
                TOKEN_REQUESTOR_ID,
                WALLET_TOKEN_STATUS,
                CARD_STATE,
                /**
                 * An enum member indicating that [Attribute] was instantiated with an unknown
                 * value.
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
                    TIMESTAMP -> Value.TIMESTAMP
                    TOKENIZATION_CHANNEL -> Value.TOKENIZATION_CHANNEL
                    TOKENIZATION_SOURCE -> Value.TOKENIZATION_SOURCE
                    TOKEN_REQUESTOR_NAME -> Value.TOKEN_REQUESTOR_NAME
                    WALLET_ACCOUNT_SCORE -> Value.WALLET_ACCOUNT_SCORE
                    WALLET_DEVICE_SCORE -> Value.WALLET_DEVICE_SCORE
                    WALLET_RECOMMENDED_DECISION -> Value.WALLET_RECOMMENDED_DECISION
                    WALLET_RECOMMENDATION_REASONS -> Value.WALLET_RECOMMENDATION_REASONS
                    TOKEN_REQUESTOR_ID -> Value.TOKEN_REQUESTOR_ID
                    WALLET_TOKEN_STATUS -> Value.WALLET_TOKEN_STATUS
                    CARD_STATE -> Value.CARD_STATE
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
                    TIMESTAMP -> Known.TIMESTAMP
                    TOKENIZATION_CHANNEL -> Known.TOKENIZATION_CHANNEL
                    TOKENIZATION_SOURCE -> Known.TOKENIZATION_SOURCE
                    TOKEN_REQUESTOR_NAME -> Known.TOKEN_REQUESTOR_NAME
                    WALLET_ACCOUNT_SCORE -> Known.WALLET_ACCOUNT_SCORE
                    WALLET_DEVICE_SCORE -> Known.WALLET_DEVICE_SCORE
                    WALLET_RECOMMENDED_DECISION -> Known.WALLET_RECOMMENDED_DECISION
                    WALLET_RECOMMENDATION_REASONS -> Known.WALLET_RECOMMENDATION_REASONS
                    TOKEN_REQUESTOR_ID -> Known.TOKEN_REQUESTOR_ID
                    WALLET_TOKEN_STATUS -> Known.WALLET_TOKEN_STATUS
                    CARD_STATE -> Known.CARD_STATE
                    else -> throw LithicInvalidDataException("Unknown Attribute: $value")
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

                return other is Attribute && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

        return other is ConditionalTokenizationActionParameters &&
            action == other.action &&
            conditions == other.conditions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalTokenizationActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
