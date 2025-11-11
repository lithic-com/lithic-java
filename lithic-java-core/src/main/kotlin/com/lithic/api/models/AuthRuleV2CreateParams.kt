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
import com.lithic.api.core.Params
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new V2 Auth rule in draft mode */
class AuthRuleV2CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2CreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2CreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2CreateParams: AuthRuleV2CreateParams) = apply {
            body = authRuleV2CreateParams.body
            additionalHeaders = authRuleV2CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2CreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofAccountLevelRule(accountLevelRule)`. */
        fun body(accountLevelRule: Body.AccountLevelRule) =
            body(Body.ofAccountLevelRule(accountLevelRule))

        /** Alias for calling [body] with `Body.ofCardLevelRule(cardLevelRule)`. */
        fun body(cardLevelRule: Body.CardLevelRule) = body(Body.ofCardLevelRule(cardLevelRule))

        /** Alias for calling [body] with `Body.ofProgramLevelRule(programLevelRule)`. */
        fun body(programLevelRule: Body.ProgramLevelRule) =
            body(Body.ofProgramLevelRule(programLevelRule))

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
         * Returns an immutable instance of [AuthRuleV2CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2CreateParams =
            AuthRuleV2CreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val accountLevelRule: AccountLevelRule? = null,
        private val cardLevelRule: CardLevelRule? = null,
        private val programLevelRule: ProgramLevelRule? = null,
        private val _json: JsonValue? = null,
    ) {

        fun accountLevelRule(): Optional<AccountLevelRule> = Optional.ofNullable(accountLevelRule)

        fun cardLevelRule(): Optional<CardLevelRule> = Optional.ofNullable(cardLevelRule)

        fun programLevelRule(): Optional<ProgramLevelRule> = Optional.ofNullable(programLevelRule)

        fun isAccountLevelRule(): Boolean = accountLevelRule != null

        fun isCardLevelRule(): Boolean = cardLevelRule != null

        fun isProgramLevelRule(): Boolean = programLevelRule != null

        fun asAccountLevelRule(): AccountLevelRule = accountLevelRule.getOrThrow("accountLevelRule")

        fun asCardLevelRule(): CardLevelRule = cardLevelRule.getOrThrow("cardLevelRule")

        fun asProgramLevelRule(): ProgramLevelRule = programLevelRule.getOrThrow("programLevelRule")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                accountLevelRule != null -> visitor.visitAccountLevelRule(accountLevelRule)
                cardLevelRule != null -> visitor.visitCardLevelRule(cardLevelRule)
                programLevelRule != null -> visitor.visitProgramLevelRule(programLevelRule)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAccountLevelRule(accountLevelRule: AccountLevelRule) {
                        accountLevelRule.validate()
                    }

                    override fun visitCardLevelRule(cardLevelRule: CardLevelRule) {
                        cardLevelRule.validate()
                    }

                    override fun visitProgramLevelRule(programLevelRule: ProgramLevelRule) {
                        programLevelRule.validate()
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
                    override fun visitAccountLevelRule(accountLevelRule: AccountLevelRule) =
                        accountLevelRule.validity()

                    override fun visitCardLevelRule(cardLevelRule: CardLevelRule) =
                        cardLevelRule.validity()

                    override fun visitProgramLevelRule(programLevelRule: ProgramLevelRule) =
                        programLevelRule.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountLevelRule == other.accountLevelRule &&
                cardLevelRule == other.cardLevelRule &&
                programLevelRule == other.programLevelRule
        }

        override fun hashCode(): Int =
            Objects.hash(accountLevelRule, cardLevelRule, programLevelRule)

        override fun toString(): String =
            when {
                accountLevelRule != null -> "Body{accountLevelRule=$accountLevelRule}"
                cardLevelRule != null -> "Body{cardLevelRule=$cardLevelRule}"
                programLevelRule != null -> "Body{programLevelRule=$programLevelRule}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofAccountLevelRule(accountLevelRule: AccountLevelRule) =
                Body(accountLevelRule = accountLevelRule)

            @JvmStatic
            fun ofCardLevelRule(cardLevelRule: CardLevelRule) = Body(cardLevelRule = cardLevelRule)

            @JvmStatic
            fun ofProgramLevelRule(programLevelRule: ProgramLevelRule) =
                Body(programLevelRule = programLevelRule)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitAccountLevelRule(accountLevelRule: AccountLevelRule): T

            fun visitCardLevelRule(cardLevelRule: CardLevelRule): T

            fun visitProgramLevelRule(programLevelRule: ProgramLevelRule): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AccountLevelRule>())?.let {
                                Body(accountLevelRule = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CardLevelRule>())?.let {
                                Body(cardLevelRule = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProgramLevelRule>())?.let {
                                Body(programLevelRule = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.accountLevelRule != null -> generator.writeObject(value.accountLevelRule)
                    value.cardLevelRule != null -> generator.writeObject(value.cardLevelRule)
                    value.programLevelRule != null -> generator.writeObject(value.programLevelRule)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class AccountLevelRule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val parameters: JsonField<Parameters>,
            private val type: JsonField<AuthRuleType>,
            private val accountTokens: JsonField<List<String>>,
            private val businessAccountTokens: JsonField<List<String>>,
            private val eventStream: JsonField<EventStream>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
                @JsonProperty("account_tokens")
                @ExcludeMissing
                accountTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("business_account_tokens")
                @ExcludeMissing
                businessAccountTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("event_stream")
                @ExcludeMissing
                eventStream: JsonField<EventStream> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(
                parameters,
                type,
                accountTokens,
                businessAccountTokens,
                eventStream,
                name,
                mutableMapOf(),
            )

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parameters(): Parameters = parameters.getRequired("parameters")

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AuthRuleType = type.getRequired("type")

            /**
             * Account tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountTokens(): Optional<List<String>> =
                accountTokens.getOptional("account_tokens")

            /**
             * Business Account tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun businessAccountTokens(): Optional<List<String>> =
                businessAccountTokens.getOptional("business_account_tokens")

            /**
             * The event stream during which the rule will be evaluated.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventStream(): Optional<EventStream> = eventStream.getOptional("event_stream")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            /**
             * Returns the raw JSON value of [accountTokens].
             *
             * Unlike [accountTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_tokens")
            @ExcludeMissing
            fun _accountTokens(): JsonField<List<String>> = accountTokens

            /**
             * Returns the raw JSON value of [businessAccountTokens].
             *
             * Unlike [businessAccountTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_account_tokens")
            @ExcludeMissing
            fun _businessAccountTokens(): JsonField<List<String>> = businessAccountTokens

            /**
             * Returns the raw JSON value of [eventStream].
             *
             * Unlike [eventStream], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [AccountLevelRule].
                 *
                 * The following fields are required:
                 * ```java
                 * .parameters()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccountLevelRule]. */
            class Builder internal constructor() {

                private var parameters: JsonField<Parameters>? = null
                private var type: JsonField<AuthRuleType>? = null
                private var accountTokens: JsonField<MutableList<String>>? = null
                private var businessAccountTokens: JsonField<MutableList<String>>? = null
                private var eventStream: JsonField<EventStream> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountLevelRule: AccountLevelRule) = apply {
                    parameters = accountLevelRule.parameters
                    type = accountLevelRule.type
                    accountTokens = accountLevelRule.accountTokens.map { it.toMutableList() }
                    businessAccountTokens =
                        accountLevelRule.businessAccountTokens.map { it.toMutableList() }
                    eventStream = accountLevelRule.eventStream
                    name = accountLevelRule.name
                    additionalProperties = accountLevelRule.additionalProperties.toMutableMap()
                }

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
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
                 * The type of Auth Rule. For certain rule types, this determines the event stream
                 * during which it will be evaluated. For rules that can be applied to one of
                 * several event streams, the effective one is defined by the separate
                 * `event_stream` field.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
                 */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                /** Account tokens to which the Auth Rule applies. */
                fun accountTokens(accountTokens: List<String>) =
                    accountTokens(JsonField.of(accountTokens))

                /**
                 * Sets [Builder.accountTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountTokens] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.businessAccountTokens] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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

                /** The event stream during which the rule will be evaluated. */
                fun eventStream(eventStream: EventStream) = eventStream(JsonField.of(eventStream))

                /**
                 * Sets [Builder.eventStream] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventStream] with a well-typed [EventStream]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [AccountLevelRule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .parameters()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccountLevelRule =
                    AccountLevelRule(
                        checkRequired("parameters", parameters),
                        checkRequired("type", type),
                        (accountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        (businessAccountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        eventStream,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountLevelRule = apply {
                if (validated) {
                    return@apply
                }

                parameters().validate()
                type().validate()
                accountTokens()
                businessAccountTokens()
                eventStream().ifPresent { it.validate() }
                name()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (accountTokens.asKnown().getOrNull()?.size ?: 0) +
                    (businessAccountTokens.asKnown().getOrNull()?.size ?: 0) +
                    (eventStream.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val merchantLock: MerchantLockParameters? = null,
                private val conditional3dsAction: Conditional3dsActionParameters? = null,
                private val conditionalAuthorizationAction:
                    ConditionalAuthorizationActionParameters? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                    Optional.ofNullable(conditionalBlock)

                fun velocityLimitParams(): Optional<VelocityLimitParams> =
                    Optional.ofNullable(velocityLimitParams)

                fun merchantLock(): Optional<MerchantLockParameters> =
                    Optional.ofNullable(merchantLock)

                fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
                    Optional.ofNullable(conditional3dsAction)

                fun conditionalAuthorizationAction():
                    Optional<ConditionalAuthorizationActionParameters> =
                    Optional.ofNullable(conditionalAuthorizationAction)

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun isMerchantLock(): Boolean = merchantLock != null

                fun isConditional3dsAction(): Boolean = conditional3dsAction != null

                fun isConditionalAuthorizationAction(): Boolean =
                    conditionalAuthorizationAction != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

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
                            visitor.visitConditionalAuthorizationAction(
                                conditionalAuthorizationAction
                            )
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)

                    @JvmStatic
                    fun ofConditionalAuthorizationAction(
                        conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                    ) = Parameters(conditionalAuthorizationAction = conditionalAuthorizationAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
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
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
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
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<
                                                ConditionalAuthorizationActionParameters
                                            >(),
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
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
            }

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_ACTION,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
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
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Value.CONDITIONAL_ACTION
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
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Known.CONDITIONAL_ACTION
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
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

            /** The event stream during which the rule will be evaluated. */
            class EventStream
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTHORIZATION,
                    THREE_DS_AUTHENTICATION,
                    /**
                     * An enum member indicating that [EventStream] was instantiated with an unknown
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
                        AUTHORIZATION -> Value.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Value.THREE_DS_AUTHENTICATION
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
                        AUTHORIZATION -> Known.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Known.THREE_DS_AUTHENTICATION
                        else -> throw LithicInvalidDataException("Unknown EventStream: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountLevelRule &&
                    parameters == other.parameters &&
                    type == other.type &&
                    accountTokens == other.accountTokens &&
                    businessAccountTokens == other.businessAccountTokens &&
                    eventStream == other.eventStream &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    parameters,
                    type,
                    accountTokens,
                    businessAccountTokens,
                    eventStream,
                    name,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountLevelRule{parameters=$parameters, type=$type, accountTokens=$accountTokens, businessAccountTokens=$businessAccountTokens, eventStream=$eventStream, name=$name, additionalProperties=$additionalProperties}"
        }

        class CardLevelRule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cardTokens: JsonField<List<String>>,
            private val parameters: JsonField<Parameters>,
            private val type: JsonField<AuthRuleType>,
            private val eventStream: JsonField<EventStream>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_tokens")
                @ExcludeMissing
                cardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
                @JsonProperty("event_stream")
                @ExcludeMissing
                eventStream: JsonField<EventStream> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(cardTokens, parameters, type, eventStream, name, mutableMapOf())

            /**
             * Card tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parameters(): Parameters = parameters.getRequired("parameters")

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AuthRuleType = type.getRequired("type")

            /**
             * The event stream during which the rule will be evaluated.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventStream(): Optional<EventStream> = eventStream.getOptional("event_stream")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [cardTokens].
             *
             * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_tokens")
            @ExcludeMissing
            fun _cardTokens(): JsonField<List<String>> = cardTokens

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            /**
             * Returns the raw JSON value of [eventStream].
             *
             * Unlike [eventStream], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [CardLevelRule].
                 *
                 * The following fields are required:
                 * ```java
                 * .cardTokens()
                 * .parameters()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CardLevelRule]. */
            class Builder internal constructor() {

                private var cardTokens: JsonField<MutableList<String>>? = null
                private var parameters: JsonField<Parameters>? = null
                private var type: JsonField<AuthRuleType>? = null
                private var eventStream: JsonField<EventStream> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardLevelRule: CardLevelRule) = apply {
                    cardTokens = cardLevelRule.cardTokens.map { it.toMutableList() }
                    parameters = cardLevelRule.parameters
                    type = cardLevelRule.type
                    eventStream = cardLevelRule.eventStream
                    name = cardLevelRule.name
                    additionalProperties = cardLevelRule.additionalProperties.toMutableMap()
                }

                /** Card tokens to which the Auth Rule applies. */
                fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

                /**
                 * Sets [Builder.cardTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardTokens] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
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
                 * The type of Auth Rule. For certain rule types, this determines the event stream
                 * during which it will be evaluated. For rules that can be applied to one of
                 * several event streams, the effective one is defined by the separate
                 * `event_stream` field.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
                 */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                /** The event stream during which the rule will be evaluated. */
                fun eventStream(eventStream: EventStream) = eventStream(JsonField.of(eventStream))

                /**
                 * Sets [Builder.eventStream] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventStream] with a well-typed [EventStream]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [CardLevelRule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cardTokens()
                 * .parameters()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CardLevelRule =
                    CardLevelRule(
                        checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                        checkRequired("parameters", parameters),
                        checkRequired("type", type),
                        eventStream,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CardLevelRule = apply {
                if (validated) {
                    return@apply
                }

                cardTokens()
                parameters().validate()
                type().validate()
                eventStream().ifPresent { it.validate() }
                name()
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
                (cardTokens.asKnown().getOrNull()?.size ?: 0) +
                    (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (eventStream.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val merchantLock: MerchantLockParameters? = null,
                private val conditional3dsAction: Conditional3dsActionParameters? = null,
                private val conditionalAuthorizationAction:
                    ConditionalAuthorizationActionParameters? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                    Optional.ofNullable(conditionalBlock)

                fun velocityLimitParams(): Optional<VelocityLimitParams> =
                    Optional.ofNullable(velocityLimitParams)

                fun merchantLock(): Optional<MerchantLockParameters> =
                    Optional.ofNullable(merchantLock)

                fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
                    Optional.ofNullable(conditional3dsAction)

                fun conditionalAuthorizationAction():
                    Optional<ConditionalAuthorizationActionParameters> =
                    Optional.ofNullable(conditionalAuthorizationAction)

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun isMerchantLock(): Boolean = merchantLock != null

                fun isConditional3dsAction(): Boolean = conditional3dsAction != null

                fun isConditionalAuthorizationAction(): Boolean =
                    conditionalAuthorizationAction != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

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
                            visitor.visitConditionalAuthorizationAction(
                                conditionalAuthorizationAction
                            )
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)

                    @JvmStatic
                    fun ofConditionalAuthorizationAction(
                        conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                    ) = Parameters(conditionalAuthorizationAction = conditionalAuthorizationAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
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
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
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
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<
                                                ConditionalAuthorizationActionParameters
                                            >(),
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
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
            }

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_ACTION,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
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
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Value.CONDITIONAL_ACTION
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
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Known.CONDITIONAL_ACTION
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
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

            /** The event stream during which the rule will be evaluated. */
            class EventStream
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTHORIZATION,
                    THREE_DS_AUTHENTICATION,
                    /**
                     * An enum member indicating that [EventStream] was instantiated with an unknown
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
                        AUTHORIZATION -> Value.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Value.THREE_DS_AUTHENTICATION
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
                        AUTHORIZATION -> Known.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Known.THREE_DS_AUTHENTICATION
                        else -> throw LithicInvalidDataException("Unknown EventStream: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardLevelRule &&
                    cardTokens == other.cardTokens &&
                    parameters == other.parameters &&
                    type == other.type &&
                    eventStream == other.eventStream &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cardTokens, parameters, type, eventStream, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardLevelRule{cardTokens=$cardTokens, parameters=$parameters, type=$type, eventStream=$eventStream, name=$name, additionalProperties=$additionalProperties}"
        }

        class ProgramLevelRule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val parameters: JsonField<Parameters>,
            private val programLevel: JsonField<Boolean>,
            private val type: JsonField<AuthRuleType>,
            private val eventStream: JsonField<EventStream>,
            private val excludedCardTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("program_level")
                @ExcludeMissing
                programLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
                @JsonProperty("event_stream")
                @ExcludeMissing
                eventStream: JsonField<EventStream> = JsonMissing.of(),
                @JsonProperty("excluded_card_tokens")
                @ExcludeMissing
                excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(
                parameters,
                programLevel,
                type,
                eventStream,
                excludedCardTokens,
                name,
                mutableMapOf(),
            )

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parameters(): Parameters = parameters.getRequired("parameters")

            /**
             * Whether the Auth Rule applies to all authorizations on the card program.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun programLevel(): Boolean = programLevel.getRequired("program_level")

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AuthRuleType = type.getRequired("type")

            /**
             * The event stream during which the rule will be evaluated.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventStream(): Optional<EventStream> = eventStream.getOptional("event_stream")

            /**
             * Card tokens to which the Auth Rule does not apply.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludedCardTokens(): Optional<List<String>> =
                excludedCardTokens.getOptional("excluded_card_tokens")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [programLevel].
             *
             * Unlike [programLevel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("program_level")
            @ExcludeMissing
            fun _programLevel(): JsonField<Boolean> = programLevel

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            /**
             * Returns the raw JSON value of [eventStream].
             *
             * Unlike [eventStream], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_stream")
            @ExcludeMissing
            fun _eventStream(): JsonField<EventStream> = eventStream

            /**
             * Returns the raw JSON value of [excludedCardTokens].
             *
             * Unlike [excludedCardTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excluded_card_tokens")
            @ExcludeMissing
            fun _excludedCardTokens(): JsonField<List<String>> = excludedCardTokens

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [ProgramLevelRule].
                 *
                 * The following fields are required:
                 * ```java
                 * .parameters()
                 * .programLevel()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProgramLevelRule]. */
            class Builder internal constructor() {

                private var parameters: JsonField<Parameters>? = null
                private var programLevel: JsonField<Boolean>? = null
                private var type: JsonField<AuthRuleType>? = null
                private var eventStream: JsonField<EventStream> = JsonMissing.of()
                private var excludedCardTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(programLevelRule: ProgramLevelRule) = apply {
                    parameters = programLevelRule.parameters
                    programLevel = programLevelRule.programLevel
                    type = programLevelRule.type
                    eventStream = programLevelRule.eventStream
                    excludedCardTokens =
                        programLevelRule.excludedCardTokens.map { it.toMutableList() }
                    name = programLevelRule.name
                    additionalProperties = programLevelRule.additionalProperties.toMutableMap()
                }

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
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

                /** Whether the Auth Rule applies to all authorizations on the card program. */
                fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

                /**
                 * Sets [Builder.programLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.programLevel] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun programLevel(programLevel: JsonField<Boolean>) = apply {
                    this.programLevel = programLevel
                }

                /**
                 * The type of Auth Rule. For certain rule types, this determines the event stream
                 * during which it will be evaluated. For rules that can be applied to one of
                 * several event streams, the effective one is defined by the separate
                 * `event_stream` field.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
                 */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                /** The event stream during which the rule will be evaluated. */
                fun eventStream(eventStream: EventStream) = eventStream(JsonField.of(eventStream))

                /**
                 * Sets [Builder.eventStream] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventStream] with a well-typed [EventStream]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun eventStream(eventStream: JsonField<EventStream>) = apply {
                    this.eventStream = eventStream
                }

                /** Card tokens to which the Auth Rule does not apply. */
                fun excludedCardTokens(excludedCardTokens: List<String>) =
                    excludedCardTokens(JsonField.of(excludedCardTokens))

                /**
                 * Sets [Builder.excludedCardTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludedCardTokens] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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

                /** Auth Rule Name */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [ProgramLevelRule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .parameters()
                 * .programLevel()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProgramLevelRule =
                    ProgramLevelRule(
                        checkRequired("parameters", parameters),
                        checkRequired("programLevel", programLevel),
                        checkRequired("type", type),
                        eventStream,
                        (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ProgramLevelRule = apply {
                if (validated) {
                    return@apply
                }

                parameters().validate()
                programLevel()
                type().validate()
                eventStream().ifPresent { it.validate() }
                excludedCardTokens()
                name()
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
                    (if (programLevel.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (eventStream.asKnown().getOrNull()?.validity() ?: 0) +
                    (excludedCardTokens.asKnown().getOrNull()?.size ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val merchantLock: MerchantLockParameters? = null,
                private val conditional3dsAction: Conditional3dsActionParameters? = null,
                private val conditionalAuthorizationAction:
                    ConditionalAuthorizationActionParameters? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): Optional<ConditionalBlockParameters> =
                    Optional.ofNullable(conditionalBlock)

                fun velocityLimitParams(): Optional<VelocityLimitParams> =
                    Optional.ofNullable(velocityLimitParams)

                fun merchantLock(): Optional<MerchantLockParameters> =
                    Optional.ofNullable(merchantLock)

                fun conditional3dsAction(): Optional<Conditional3dsActionParameters> =
                    Optional.ofNullable(conditional3dsAction)

                fun conditionalAuthorizationAction():
                    Optional<ConditionalAuthorizationActionParameters> =
                    Optional.ofNullable(conditionalAuthorizationAction)

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun isMerchantLock(): Boolean = merchantLock != null

                fun isConditional3dsAction(): Boolean = conditional3dsAction != null

                fun isConditionalAuthorizationAction(): Boolean =
                    conditionalAuthorizationAction != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

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
                            visitor.visitConditionalAuthorizationAction(
                                conditionalAuthorizationAction
                            )
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                                conditionalAuthorizationAction:
                                    ConditionalAuthorizationActionParameters
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
                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)

                    @JvmStatic
                    fun ofConditionalAuthorizationAction(
                        conditionalAuthorizationAction: ConditionalAuthorizationActionParameters
                    ) = Parameters(conditionalAuthorizationAction = conditionalAuthorizationAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
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
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
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
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<
                                                ConditionalAuthorizationActionParameters
                                            >(),
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
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
            }

            /**
             * The type of Auth Rule. For certain rule types, this determines the event stream
             * during which it will be evaluated. For rules that can be applied to one of several
             * event streams, the effective one is defined by the separate `event_stream` field.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_ACTION`: AUTHORIZATION or THREE_DS_AUTHENTICATION event stream.
             */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_ACTION,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
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
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Value.CONDITIONAL_ACTION
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
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_ACTION -> Known.CONDITIONAL_ACTION
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
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

            /** The event stream during which the rule will be evaluated. */
            class EventStream
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTHORIZATION,
                    THREE_DS_AUTHENTICATION,
                    /**
                     * An enum member indicating that [EventStream] was instantiated with an unknown
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
                        AUTHORIZATION -> Value.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Value.THREE_DS_AUTHENTICATION
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
                        AUTHORIZATION -> Known.AUTHORIZATION
                        THREE_DS_AUTHENTICATION -> Known.THREE_DS_AUTHENTICATION
                        else -> throw LithicInvalidDataException("Unknown EventStream: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProgramLevelRule &&
                    parameters == other.parameters &&
                    programLevel == other.programLevel &&
                    type == other.type &&
                    eventStream == other.eventStream &&
                    excludedCardTokens == other.excludedCardTokens &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    parameters,
                    programLevel,
                    type,
                    eventStream,
                    excludedCardTokens,
                    name,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProgramLevelRule{parameters=$parameters, programLevel=$programLevel, type=$type, eventStream=$eventStream, excludedCardTokens=$excludedCardTokens, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleV2CreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthRuleV2CreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
