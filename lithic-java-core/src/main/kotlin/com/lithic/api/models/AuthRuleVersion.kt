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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuthRuleVersion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val parameters: JsonField<Parameters>,
    private val state: JsonField<AuthRuleVersionState>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        state: JsonField<AuthRuleVersionState> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(created, parameters, state, version, mutableMapOf())

    /**
     * Timestamp of when this version was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Parameters for the Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = parameters.getRequired("parameters")

    /**
     * The current state of this version.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): AuthRuleVersionState = state.getRequired("state")

    /**
     * The version of the rule, this is incremented whenever the rule's parameters change.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<AuthRuleVersionState> = state

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
         * Returns a mutable builder for constructing an instance of [AuthRuleVersion].
         *
         * The following fields are required:
         * ```java
         * .created()
         * .parameters()
         * .state()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleVersion]. */
    class Builder internal constructor() {

        private var created: JsonField<OffsetDateTime>? = null
        private var parameters: JsonField<Parameters>? = null
        private var state: JsonField<AuthRuleVersionState>? = null
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleVersion: AuthRuleVersion) = apply {
            created = authRuleVersion.created
            parameters = authRuleVersion.parameters
            state = authRuleVersion.state
            version = authRuleVersion.version
            additionalProperties = authRuleVersion.additionalProperties.toMutableMap()
        }

        /** Timestamp of when this version was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Parameters for the Auth Rule */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        /**
         * Alias for calling [parameters] with `Parameters.ofConditionalBlock(conditionalBlock)`.
         */
        @Deprecated("deprecated")
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
        fun parameters(conditionalAuthorizationAction: ConditionalAuthorizationActionParameters) =
            parameters(Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction))

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditionalAchAction(conditionalAchAction)`.
         */
        fun parameters(conditionalAchAction: ConditionalAchActionParameters) =
            parameters(Parameters.ofConditionalAchAction(conditionalAchAction))

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditionalTokenizationAction(conditionalTokenizationAction)`.
         */
        fun parameters(conditionalTokenizationAction: ConditionalTokenizationActionParameters) =
            parameters(Parameters.ofConditionalTokenizationAction(conditionalTokenizationAction))

        /** Alias for calling [parameters] with `Parameters.ofTypescriptCode(typescriptCode)`. */
        fun parameters(typescriptCode: TypescriptCodeParameters) =
            parameters(Parameters.ofTypescriptCode(typescriptCode))

        /** The current state of this version. */
        fun state(state: AuthRuleVersionState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [AuthRuleVersionState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun state(state: JsonField<AuthRuleVersionState>) = apply { this.state = state }

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [AuthRuleVersion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .created()
         * .parameters()
         * .state()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleVersion =
            AuthRuleVersion(
                checkRequired("created", created),
                checkRequired("parameters", parameters),
                checkRequired("state", state),
                checkRequired("version", version),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRuleVersion = apply {
        if (validated) {
            return@apply
        }

        created()
        parameters().validate()
        state().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (created.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
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
        private val conditionalAchAction: ConditionalAchActionParameters? = null,
        private val conditionalTokenizationAction: ConditionalTokenizationActionParameters? = null,
        private val typescriptCode: TypescriptCodeParameters? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Deprecated: Use CONDITIONAL_ACTION instead. */
        @Deprecated("deprecated")
        fun conditionalBlock(): Optional<ConditionalBlockParameters> =
            Optional.ofNullable(conditionalBlock)

        fun velocityLimitParams(): Optional<VelocityLimitParams> =
            Optional.ofNullable(velocityLimitParams)

        fun merchantLock(): Optional<MerchantLockParameters> = Optional.ofNullable(merchantLock)

        fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
            Optional.ofNullable(conditional3dsAction)

        fun conditionalAuthorizationAction(): Optional<ConditionalAuthorizationActionParameters> =
            Optional.ofNullable(conditionalAuthorizationAction)

        fun conditionalAchAction(): Optional<ConditionalAchActionParameters> =
            Optional.ofNullable(conditionalAchAction)

        fun conditionalTokenizationAction(): Optional<ConditionalTokenizationActionParameters> =
            Optional.ofNullable(conditionalTokenizationAction)

        /** Parameters for defining a TypeScript code rule */
        fun typescriptCode(): Optional<TypescriptCodeParameters> =
            Optional.ofNullable(typescriptCode)

        @Deprecated("deprecated") fun isConditionalBlock(): Boolean = conditionalBlock != null

        fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

        fun isMerchantLock(): Boolean = merchantLock != null

        fun isConditional3dsAction(): Boolean = conditional3dsAction != null

        fun isConditionalAuthorizationAction(): Boolean = conditionalAuthorizationAction != null

        fun isConditionalAchAction(): Boolean = conditionalAchAction != null

        fun isConditionalTokenizationAction(): Boolean = conditionalTokenizationAction != null

        fun isTypescriptCode(): Boolean = typescriptCode != null

        /** Deprecated: Use CONDITIONAL_ACTION instead. */
        @Deprecated("deprecated")
        fun asConditionalBlock(): ConditionalBlockParameters =
            conditionalBlock.getOrThrow("conditionalBlock")

        fun asVelocityLimitParams(): VelocityLimitParams =
            velocityLimitParams.getOrThrow("velocityLimitParams")

        fun asMerchantLock(): MerchantLockParameters = merchantLock.getOrThrow("merchantLock")

        fun asConditional3dsAction(): Conditional3dsActionParameters =
            conditional3dsAction.getOrThrow("conditional3dsAction")

        fun asConditionalAuthorizationAction(): ConditionalAuthorizationActionParameters =
            conditionalAuthorizationAction.getOrThrow("conditionalAuthorizationAction")

        fun asConditionalAchAction(): ConditionalAchActionParameters =
            conditionalAchAction.getOrThrow("conditionalAchAction")

        fun asConditionalTokenizationAction(): ConditionalTokenizationActionParameters =
            conditionalTokenizationAction.getOrThrow("conditionalTokenizationAction")

        /** Parameters for defining a TypeScript code rule */
        fun asTypescriptCode(): TypescriptCodeParameters =
            typescriptCode.getOrThrow("typescriptCode")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                velocityLimitParams != null -> visitor.visitVelocityLimitParams(velocityLimitParams)
                merchantLock != null -> visitor.visitMerchantLock(merchantLock)
                conditional3dsAction != null ->
                    visitor.visitConditional3dsAction(conditional3dsAction)
                conditionalAuthorizationAction != null ->
                    visitor.visitConditionalAuthorizationAction(conditionalAuthorizationAction)
                conditionalAchAction != null ->
                    visitor.visitConditionalAchAction(conditionalAchAction)
                conditionalTokenizationAction != null ->
                    visitor.visitConditionalTokenizationAction(conditionalTokenizationAction)
                typescriptCode != null -> visitor.visitTypescriptCode(typescriptCode)
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

                    override fun visitConditionalAchAction(
                        conditionalAchAction: ConditionalAchActionParameters
                    ) {
                        conditionalAchAction.validate()
                    }

                    override fun visitConditionalTokenizationAction(
                        conditionalTokenizationAction: ConditionalTokenizationActionParameters
                    ) {
                        conditionalTokenizationAction.validate()
                    }

                    override fun visitTypescriptCode(typescriptCode: TypescriptCodeParameters) {
                        typescriptCode.validate()
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

                    override fun visitConditionalAchAction(
                        conditionalAchAction: ConditionalAchActionParameters
                    ) = conditionalAchAction.validity()

                    override fun visitConditionalTokenizationAction(
                        conditionalTokenizationAction: ConditionalTokenizationActionParameters
                    ) = conditionalTokenizationAction.validity()

                    override fun visitTypescriptCode(typescriptCode: TypescriptCodeParameters) =
                        typescriptCode.validity()

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
                conditionalAuthorizationAction == other.conditionalAuthorizationAction &&
                conditionalAchAction == other.conditionalAchAction &&
                conditionalTokenizationAction == other.conditionalTokenizationAction &&
                typescriptCode == other.typescriptCode
        }

        override fun hashCode(): Int =
            Objects.hash(
                conditionalBlock,
                velocityLimitParams,
                merchantLock,
                conditional3dsAction,
                conditionalAuthorizationAction,
                conditionalAchAction,
                conditionalTokenizationAction,
                typescriptCode,
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
                conditionalAchAction != null ->
                    "Parameters{conditionalAchAction=$conditionalAchAction}"
                conditionalTokenizationAction != null ->
                    "Parameters{conditionalTokenizationAction=$conditionalTokenizationAction}"
                typescriptCode != null -> "Parameters{typescriptCode=$typescriptCode}"
                _json != null -> "Parameters{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parameters")
            }

        companion object {

            /** Deprecated: Use CONDITIONAL_ACTION instead. */
            @Deprecated("deprecated")
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

            @JvmStatic
            fun ofConditionalAchAction(conditionalAchAction: ConditionalAchActionParameters) =
                Parameters(conditionalAchAction = conditionalAchAction)

            @JvmStatic
            fun ofConditionalTokenizationAction(
                conditionalTokenizationAction: ConditionalTokenizationActionParameters
            ) = Parameters(conditionalTokenizationAction = conditionalTokenizationAction)

            /** Parameters for defining a TypeScript code rule */
            @JvmStatic
            fun ofTypescriptCode(typescriptCode: TypescriptCodeParameters) =
                Parameters(typescriptCode = typescriptCode)
        }

        /**
         * An interface that defines how to map each variant of [Parameters] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Deprecated: Use CONDITIONAL_ACTION instead. */
            @Deprecated("deprecated")
            fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

            fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

            fun visitMerchantLock(merchantLock: MerchantLockParameters): T

            fun visitConditional3dsAction(conditional3dsAction: Conditional3dsActionParameters): T

            fun visitConditionalAuthorizationAction(
                conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
            ): T

            fun visitConditionalAchAction(conditionalAchAction: ConditionalAchActionParameters): T

            fun visitConditionalTokenizationAction(
                conditionalTokenizationAction: ConditionalTokenizationActionParameters
            ): T

            /** Parameters for defining a TypeScript code rule */
            fun visitTypescriptCode(typescriptCode: TypescriptCodeParameters): T

            /**
             * Maps an unknown variant of [Parameters] to a value of type [T].
             *
             * An instance of [Parameters] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
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
                            tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())?.let {
                                Parameters(merchantLock = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Conditional3dsActionParameters>())
                                ?.let { Parameters(conditional3dsAction = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ConditionalAuthorizationActionParameters>(),
                                )
                                ?.let {
                                    Parameters(conditionalAuthorizationAction = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<ConditionalAchActionParameters>())
                                ?.let { Parameters(conditionalAchAction = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ConditionalTokenizationActionParameters>(),
                                )
                                ?.let {
                                    Parameters(conditionalTokenizationAction = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<TypescriptCodeParameters>())?.let {
                                Parameters(typescriptCode = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Parameters(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
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
                    value.conditionalBlock != null -> generator.writeObject(value.conditionalBlock)
                    value.velocityLimitParams != null ->
                        generator.writeObject(value.velocityLimitParams)
                    value.merchantLock != null -> generator.writeObject(value.merchantLock)
                    value.conditional3dsAction != null ->
                        generator.writeObject(value.conditional3dsAction)
                    value.conditionalAuthorizationAction != null ->
                        generator.writeObject(value.conditionalAuthorizationAction)
                    value.conditionalAchAction != null ->
                        generator.writeObject(value.conditionalAchAction)
                    value.conditionalTokenizationAction != null ->
                        generator.writeObject(value.conditionalTokenizationAction)
                    value.typescriptCode != null -> generator.writeObject(value.typescriptCode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parameters")
                }
            }
        }
    }

    /** The current state of this version. */
    class AuthRuleVersionState
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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val SHADOW = of("SHADOW")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = AuthRuleVersionState(JsonField.of(value))
        }

        /** An enum containing [AuthRuleVersionState]'s known values. */
        enum class Known {
            ACTIVE,
            SHADOW,
            INACTIVE,
        }

        /**
         * An enum containing [AuthRuleVersionState]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthRuleVersionState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            SHADOW,
            INACTIVE,
            /**
             * An enum member indicating that [AuthRuleVersionState] was instantiated with an
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
                ACTIVE -> Value.ACTIVE
                SHADOW -> Value.SHADOW
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
                SHADOW -> Known.SHADOW
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown AuthRuleVersionState: $value")
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

        fun validate(): AuthRuleVersionState = apply {
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

            return other is AuthRuleVersionState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleVersion &&
            created == other.created &&
            parameters == other.parameters &&
            state == other.state &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(created, parameters, state, version, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRuleVersion{created=$created, parameters=$parameters, state=$state, version=$version, additionalProperties=$additionalProperties}"
}
