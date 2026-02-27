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
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new draft version of a rule that will be ran in shadow mode.
 *
 * This can also be utilized to reset the draft parameters, causing a draft version to no longer be
 * ran in shadow mode.
 */
class AuthRuleV2DraftParams
private constructor(
    private val authRuleToken: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): Optional<String> = Optional.ofNullable(authRuleToken)

    /**
     * Parameters for the Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<Parameters> = body.parameters()

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parameters(): JsonField<Parameters> = body._parameters()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuthRuleV2DraftParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuthRuleV2DraftParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2DraftParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2DraftParams: AuthRuleV2DraftParams) = apply {
            authRuleToken = authRuleV2DraftParams.authRuleToken
            body = authRuleV2DraftParams.body.toBuilder()
            additionalHeaders = authRuleV2DraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2DraftParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String?) = apply { this.authRuleToken = authRuleToken }

        /** Alias for calling [Builder.authRuleToken] with `authRuleToken.orElse(null)`. */
        fun authRuleToken(authRuleToken: Optional<String>) =
            authRuleToken(authRuleToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [parameters]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Parameters for the Auth Rule */
        fun parameters(parameters: Parameters?) = apply { body.parameters(parameters) }

        /** Alias for calling [Builder.parameters] with `parameters.orElse(null)`. */
        fun parameters(parameters: Optional<Parameters>) = parameters(parameters.getOrNull())

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { body.parameters(parameters) }

        /**
         * Alias for calling [parameters] with `Parameters.ofConditionalBlock(conditionalBlock)`.
         */
        @Deprecated("deprecated")
        fun parameters(conditionalBlock: ConditionalBlockParameters) = apply {
            body.parameters(conditionalBlock)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
         */
        fun parameters(velocityLimitParams: VelocityLimitParams) = apply {
            body.parameters(velocityLimitParams)
        }

        /** Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`. */
        fun parameters(merchantLock: MerchantLockParameters) = apply {
            body.parameters(merchantLock)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
         */
        fun parameters(conditional3dsAction: Conditional3dsActionParameters) = apply {
            body.parameters(conditional3dsAction)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)`.
         */
        fun parameters(conditionalAuthorizationAction: ConditionalAuthorizationActionParameters) =
            apply {
                body.parameters(conditionalAuthorizationAction)
            }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditionalAchAction(conditionalAchAction)`.
         */
        fun parameters(conditionalAchAction: ConditionalAchActionParameters) = apply {
            body.parameters(conditionalAchAction)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditionalTokenizationAction(conditionalTokenizationAction)`.
         */
        fun parameters(conditionalTokenizationAction: ConditionalTokenizationActionParameters) =
            apply {
                body.parameters(conditionalTokenizationAction)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AuthRuleV2DraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRuleV2DraftParams =
            AuthRuleV2DraftParams(
                authRuleToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of()
        ) : this(parameters, mutableMapOf())

        /**
         * Parameters for the Auth Rule
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                parameters = body.parameters
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Parameters for the Auth Rule */
            fun parameters(parameters: Parameters?) = parameters(JsonField.ofNullable(parameters))

            /** Alias for calling [Builder.parameters] with `parameters.orElse(null)`. */
            fun parameters(parameters: Optional<Parameters>) = parameters(parameters.getOrNull())

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
            fun parameters(
                conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
            ) =
                parameters(
                    Parameters.ofConditionalAuthorizationAction(conditionalAuthorizationAction)
                )

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
                parameters(
                    Parameters.ofConditionalTokenizationAction(conditionalTokenizationAction)
                )

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(parameters, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            parameters().ifPresent { it.validate() }
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
        internal fun validity(): Int = (parameters.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                parameters == other.parameters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(parameters, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

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

        @Deprecated("deprecated") fun isConditionalBlock(): Boolean = conditionalBlock != null

        fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

        fun isMerchantLock(): Boolean = merchantLock != null

        fun isConditional3dsAction(): Boolean = conditional3dsAction != null

        fun isConditionalAuthorizationAction(): Boolean = conditionalAuthorizationAction != null

        fun isConditionalAchAction(): Boolean = conditionalAchAction != null

        fun isConditionalTokenizationAction(): Boolean = conditionalTokenizationAction != null

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
                conditionalTokenizationAction == other.conditionalTokenizationAction
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

        return other is AuthRuleV2DraftParams &&
            authRuleToken == other.authRuleToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthRuleV2DraftParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
