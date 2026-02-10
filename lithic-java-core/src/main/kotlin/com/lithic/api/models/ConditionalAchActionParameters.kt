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

class ConditionalAchActionParameters
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
         * [ConditionalAchActionParameters].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionalAchActionParameters]. */
    class Builder internal constructor() {

        private var action: JsonField<Action>? = null
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conditionalAchActionParameters: ConditionalAchActionParameters) = apply {
            action = conditionalAchActionParameters.action
            conditions = conditionalAchActionParameters.conditions.map { it.toMutableList() }
            additionalProperties =
                conditionalAchActionParameters.additionalProperties.toMutableMap()
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

        /** Alias for calling [action] with `Action.ofApprove(approve)`. */
        fun action(approve: Action.ApproveAction) = action(Action.ofApprove(approve))

        /** Alias for calling [action] with `Action.ofReturnAction(returnAction)`. */
        fun action(returnAction: Action.ReturnAction) = action(Action.ofReturnAction(returnAction))

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
         * Returns an immutable instance of [ConditionalAchActionParameters].
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
        fun build(): ConditionalAchActionParameters =
            ConditionalAchActionParameters(
                checkRequired("action", action),
                checkRequired("conditions", conditions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConditionalAchActionParameters = apply {
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
        private val approve: ApproveAction? = null,
        private val returnAction: ReturnAction? = null,
        private val _json: JsonValue? = null,
    ) {

        fun approve(): Optional<ApproveAction> = Optional.ofNullable(approve)

        fun returnAction(): Optional<ReturnAction> = Optional.ofNullable(returnAction)

        fun isApprove(): Boolean = approve != null

        fun isReturnAction(): Boolean = returnAction != null

        fun asApprove(): ApproveAction = approve.getOrThrow("approve")

        fun asReturnAction(): ReturnAction = returnAction.getOrThrow("returnAction")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
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

            return other is Action && approve == other.approve && returnAction == other.returnAction
        }

        override fun hashCode(): Int = Objects.hash(approve, returnAction)

        override fun toString(): String =
            when {
                approve != null -> "Action{approve=$approve}"
                returnAction != null -> "Action{returnAction=$returnAction}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic fun ofApprove(approve: ApproveAction) = Action(approve = approve)

            @JvmStatic
            fun ofReturnAction(returnAction: ReturnAction) = Action(returnAction = returnAction)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

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
                    value.approve != null -> generator.writeObject(value.approve)
                    value.returnAction != null -> generator.writeObject(value.returnAction)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
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
         * * `COMPANY_NAME`: The name of the company initiating the ACH transaction.
         * * `COMPANY_ID`: The company ID (also known as Standard Entry Class (SEC) Company ID) of
         *   the entity initiating the ACH transaction.
         * * `TIMESTAMP`: The timestamp of the ACH transaction in ISO 8601 format.
         * * `TRANSACTION_AMOUNT`: The amount of the ACH transaction in minor units (cents).
         * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
         *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit or
         *   Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated Entry),
         *   and others.
         * * `MEMO`: Optional memo or description field included with the ACH transaction.
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
             * * `COMPANY_NAME`: The name of the company initiating the ACH transaction.
             * * `COMPANY_ID`: The company ID (also known as Standard Entry Class (SEC) Company ID)
             *   of the entity initiating the ACH transaction.
             * * `TIMESTAMP`: The timestamp of the ACH transaction in ISO 8601 format.
             * * `TRANSACTION_AMOUNT`: The amount of the ACH transaction in minor units (cents).
             * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
             *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit
             *   or Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated
             *   Entry), and others.
             * * `MEMO`: Optional memo or description field included with the ACH transaction.
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
         * * `COMPANY_NAME`: The name of the company initiating the ACH transaction.
         * * `COMPANY_ID`: The company ID (also known as Standard Entry Class (SEC) Company ID) of
         *   the entity initiating the ACH transaction.
         * * `TIMESTAMP`: The timestamp of the ACH transaction in ISO 8601 format.
         * * `TRANSACTION_AMOUNT`: The amount of the ACH transaction in minor units (cents).
         * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
         *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit or
         *   Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated Entry),
         *   and others.
         * * `MEMO`: Optional memo or description field included with the ACH transaction.
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

                @JvmField val COMPANY_NAME = of("COMPANY_NAME")

                @JvmField val COMPANY_ID = of("COMPANY_ID")

                @JvmField val TIMESTAMP = of("TIMESTAMP")

                @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                @JvmField val SEC_CODE = of("SEC_CODE")

                @JvmField val MEMO = of("MEMO")

                @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
            }

            /** An enum containing [Attribute]'s known values. */
            enum class Known {
                COMPANY_NAME,
                COMPANY_ID,
                TIMESTAMP,
                TRANSACTION_AMOUNT,
                SEC_CODE,
                MEMO,
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
                COMPANY_NAME,
                COMPANY_ID,
                TIMESTAMP,
                TRANSACTION_AMOUNT,
                SEC_CODE,
                MEMO,
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
                    COMPANY_NAME -> Value.COMPANY_NAME
                    COMPANY_ID -> Value.COMPANY_ID
                    TIMESTAMP -> Value.TIMESTAMP
                    TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                    SEC_CODE -> Value.SEC_CODE
                    MEMO -> Value.MEMO
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
                    COMPANY_NAME -> Known.COMPANY_NAME
                    COMPANY_ID -> Known.COMPANY_ID
                    TIMESTAMP -> Known.TIMESTAMP
                    TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                    SEC_CODE -> Known.SEC_CODE
                    MEMO -> Known.MEMO
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

        return other is ConditionalAchActionParameters &&
            action == other.action &&
            conditions == other.conditions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalAchActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
