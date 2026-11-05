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

class ConditionalAuthorizationActionParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Action>,
    private val conditions: JsonField<List<AuthRuleCondition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<AuthRuleCondition>> = JsonMissing.of(),
    ) : this(action, conditions, mutableMapOf())

    /**
     * The action to take if the conditions are met.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = action.getRequired("action")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conditions(): List<AuthRuleCondition> = conditions.getRequired("conditions")

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
    fun _conditions(): JsonField<List<AuthRuleCondition>> = conditions

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
        private var conditions: JsonField<MutableList<AuthRuleCondition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conditionalAuthorizationActionParameters: ConditionalAuthorizationActionParameters
        ) = apply {
            action = conditionalAuthorizationActionParameters.action
            conditions =
                conditionalAuthorizationActionParameters.conditions.map { it.toMutableList() }
            additionalProperties =
                conditionalAuthorizationActionParameters.additionalProperties.toMutableMap()
        }

        /** The action to take if the conditions are met. */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        /** Alias for calling [action] with `Action.ofAuthorization(authorization)`. */
        fun action(authorization: Action.AuthorizationAction) =
            action(Action.ofAuthorization(authorization))

        /** Alias for calling [action] with `Action.ofHoldAdjustment(holdAdjustment)`. */
        fun action(holdAdjustment: Action.HoldAdjustmentAction) =
            action(Action.ofHoldAdjustment(holdAdjustment))

        fun conditions(conditions: List<AuthRuleCondition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<AuthRuleCondition>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conditions(conditions: JsonField<List<AuthRuleCondition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AuthRuleCondition] to [conditions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCondition(condition: AuthRuleCondition) = apply {
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The action to take if the conditions are met. */
    @JsonDeserialize(using = Action.Deserializer::class)
    @JsonSerialize(using = Action.Serializer::class)
    class Action
    private constructor(
        private val authorization: AuthorizationAction? = null,
        private val holdAdjustment: HoldAdjustmentAction? = null,
        private val _json: JsonValue? = null,
    ) {

        fun authorization(): Optional<AuthorizationAction> = Optional.ofNullable(authorization)

        /** The hold adjustment to apply if the conditions are met. */
        fun holdAdjustment(): Optional<HoldAdjustmentAction> = Optional.ofNullable(holdAdjustment)

        fun isAuthorization(): Boolean = authorization != null

        fun isHoldAdjustment(): Boolean = holdAdjustment != null

        fun asAuthorization(): AuthorizationAction = authorization.getOrThrow("authorization")

        /** The hold adjustment to apply if the conditions are met. */
        fun asHoldAdjustment(): HoldAdjustmentAction = holdAdjustment.getOrThrow("holdAdjustment")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.lithic.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = action.accept(new Action.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitAuthorization(AuthorizationAction authorization) {
         *         return Optional.of(authorization.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LithicInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                authorization != null -> visitor.visitAuthorization(authorization)
                holdAdjustment != null -> visitor.visitHoldAdjustment(holdAdjustment)
                else -> visitor.unknown(_json)
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
        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAuthorization(authorization: AuthorizationAction) {
                        authorization.validate()
                    }

                    override fun visitHoldAdjustment(holdAdjustment: HoldAdjustmentAction) {
                        holdAdjustment.validate()
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

                    override fun visitHoldAdjustment(holdAdjustment: HoldAdjustmentAction) =
                        holdAdjustment.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                authorization == other.authorization &&
                holdAdjustment == other.holdAdjustment
        }

        override fun hashCode(): Int = Objects.hash(authorization, holdAdjustment)

        override fun toString(): String =
            when {
                authorization != null -> "Action{authorization=$authorization}"
                holdAdjustment != null -> "Action{holdAdjustment=$holdAdjustment}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic
            fun ofAuthorization(authorization: AuthorizationAction) =
                Action(authorization = authorization)

            /** The hold adjustment to apply if the conditions are met. */
            @JvmStatic
            fun ofHoldAdjustment(holdAdjustment: HoldAdjustmentAction) =
                Action(holdAdjustment = holdAdjustment)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitAuthorization(authorization: AuthorizationAction): T

            /** The hold adjustment to apply if the conditions are met. */
            fun visitHoldAdjustment(holdAdjustment: HoldAdjustmentAction): T

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
                            tryDeserialize(node, jacksonTypeRef<HoldAdjustmentAction>())?.let {
                                Action(holdAdjustment = it, _json = json)
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
                    value.holdAdjustment != null -> generator.writeObject(value.holdAdjustment)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
        }

        class AuthorizationAction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DECLINE = of("DECLINE")

                @JvmField val CHALLENGE = of("CHALLENGE")

                @JvmStatic fun of(value: String) = AuthorizationAction(JsonField.of(value))
            }

            /** An enum containing [AuthorizationAction]'s known values. */
            enum class Known {
                DECLINE,
                CHALLENGE,
            }

            /**
             * An enum containing [AuthorizationAction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AuthorizationAction] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DECLINE,
                CHALLENGE,
                /**
                 * An enum member indicating that [AuthorizationAction] was instantiated with an
                 * unknown value.
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
                    DECLINE -> Value.DECLINE
                    CHALLENGE -> Value.CHALLENGE
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
                    DECLINE -> Known.DECLINE
                    CHALLENGE -> Known.CHALLENGE
                    else -> throw LithicInvalidDataException("Unknown AuthorizationAction: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): AuthorizationAction = apply {
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

                return other is AuthorizationAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The hold adjustment to apply if the conditions are met. */
        class HoldAdjustmentAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mode: JsonField<Mode>,
            private val type: JsonField<Type>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(mode, type, value, mutableMapOf())

            /**
             * The mode of the hold adjustment, determining how the value is interpreted:
             * * `REPLACE_WITH_AMOUNT`: The value is the approved hold amount in cents.
             * * `ADD_PERCENTAGE`: The value adjusts the hold amount by a percentage. 1000
             *   represents a 10% increase, 0 represents no change.
             * * `ADD_AMOUNT`: The value is added to the hold amount in cents.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mode(): Mode = mode.getRequired("mode")

            /**
             * The type of adjustment to apply
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The value used for the hold adjustment, interpreted based on the mode
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
                 * Returns a mutable builder for constructing an instance of [HoldAdjustmentAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .mode()
                 * .type()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [HoldAdjustmentAction]. */
            class Builder internal constructor() {

                private var mode: JsonField<Mode>? = null
                private var type: JsonField<Type>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(holdAdjustmentAction: HoldAdjustmentAction) = apply {
                    mode = holdAdjustmentAction.mode
                    type = holdAdjustmentAction.type
                    value = holdAdjustmentAction.value
                    additionalProperties = holdAdjustmentAction.additionalProperties.toMutableMap()
                }

                /**
                 * The mode of the hold adjustment, determining how the value is interpreted:
                 * * `REPLACE_WITH_AMOUNT`: The value is the approved hold amount in cents.
                 * * `ADD_PERCENTAGE`: The value adjusts the hold amount by a percentage. 1000
                 *   represents a 10% increase, 0 represents no change.
                 * * `ADD_AMOUNT`: The value is added to the hold amount in cents.
                 */
                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                /** The type of adjustment to apply */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** The value used for the hold adjustment, interpreted based on the mode */
                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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
                 * Returns an immutable instance of [HoldAdjustmentAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .mode()
                 * .type()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HoldAdjustmentAction =
                    HoldAdjustmentAction(
                        checkRequired("mode", mode),
                        checkRequired("type", type),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): HoldAdjustmentAction = apply {
                if (validated) {
                    return@apply
                }

                mode().validate()
                type().validate()
                value()
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
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            /**
             * The mode of the hold adjustment, determining how the value is interpreted:
             * * `REPLACE_WITH_AMOUNT`: The value is the approved hold amount in cents.
             * * `ADD_PERCENTAGE`: The value adjusts the hold amount by a percentage. 1000
             *   represents a 10% increase, 0 represents no change.
             * * `ADD_AMOUNT`: The value is added to the hold amount in cents.
             */
            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val REPLACE_WITH_AMOUNT = of("REPLACE_WITH_AMOUNT")

                    @JvmField val ADD_PERCENTAGE = of("ADD_PERCENTAGE")

                    @JvmField val ADD_AMOUNT = of("ADD_AMOUNT")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    REPLACE_WITH_AMOUNT,
                    ADD_PERCENTAGE,
                    ADD_AMOUNT,
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REPLACE_WITH_AMOUNT,
                    ADD_PERCENTAGE,
                    ADD_AMOUNT,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
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
                        REPLACE_WITH_AMOUNT -> Value.REPLACE_WITH_AMOUNT
                        ADD_PERCENTAGE -> Value.ADD_PERCENTAGE
                        ADD_AMOUNT -> Value.ADD_AMOUNT
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
                        REPLACE_WITH_AMOUNT -> Known.REPLACE_WITH_AMOUNT
                        ADD_PERCENTAGE -> Known.ADD_PERCENTAGE
                        ADD_AMOUNT -> Known.ADD_AMOUNT
                        else -> throw LithicInvalidDataException("Unknown Mode: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Mode = apply {
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

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The type of adjustment to apply */
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

                    @JvmField val HOLD_ADJUSTMENT = of("HOLD_ADJUSTMENT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    HOLD_ADJUSTMENT
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
                    HOLD_ADJUSTMENT,
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
                        HOLD_ADJUSTMENT -> Value.HOLD_ADJUSTMENT
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
                        HOLD_ADJUSTMENT -> Known.HOLD_ADJUSTMENT
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is HoldAdjustmentAction &&
                    mode == other.mode &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(mode, type, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HoldAdjustmentAction{mode=$mode, type=$type, value=$value, additionalProperties=$additionalProperties}"
        }
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

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalAuthorizationActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
