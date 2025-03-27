// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.authrules.v2

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

/**
 * Updates a V2 authorization rule's properties
 *
 * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided, this
 * will replace existing associations with the provided list of entities.
 */
class V2UpdateParams
private constructor(
    private val authRuleToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): String = authRuleToken

    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2UpdateParams].
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2UpdateParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2UpdateParams: V2UpdateParams) = apply {
            authRuleToken = v2UpdateParams.authRuleToken
            body = v2UpdateParams.body
            additionalHeaders = v2UpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2UpdateParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

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
         * Returns an immutable instance of [V2UpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2UpdateParams =
            V2UpdateParams(
                checkRequired("authRuleToken", authRuleToken),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken
            else -> ""
        }

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

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                accountLevelRule != null -> visitor.visitAccountLevelRule(accountLevelRule)
                cardLevelRule != null -> visitor.visitCardLevelRule(cardLevelRule)
                programLevelRule != null -> visitor.visitProgramLevelRule(programLevelRule)
                else -> visitor.unknown(_json)
            }
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountLevelRule == other.accountLevelRule && cardLevelRule == other.cardLevelRule && programLevelRule == other.programLevelRule /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountLevelRule, cardLevelRule, programLevelRule) /* spotless:on */

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

                tryDeserialize(node, jacksonTypeRef<AccountLevelRule>()) { it.validate() }
                    ?.let {
                        return Body(accountLevelRule = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CardLevelRule>()) { it.validate() }
                    ?.let {
                        return Body(cardLevelRule = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ProgramLevelRule>()) { it.validate() }
                    ?.let {
                        return Body(programLevelRule = it, _json = json)
                    }

                return Body(_json = json)
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
        private constructor(
            private val accountTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val state: JsonField<State>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_tokens")
                @ExcludeMissing
                accountTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            ) : this(accountTokens, name, state, mutableMapOf())

            /**
             * Account tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountTokens(): Optional<List<String>> =
                Optional.ofNullable(accountTokens.getNullable("account_tokens"))

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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

                /** Returns a mutable builder for constructing an instance of [AccountLevelRule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccountLevelRule]. */
            class Builder internal constructor() {

                private var accountTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var state: JsonField<State> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountLevelRule: AccountLevelRule) = apply {
                    accountTokens = accountLevelRule.accountTokens.map { it.toMutableList() }
                    name = accountLevelRule.name
                    state = accountLevelRule.state
                    additionalProperties = accountLevelRule.additionalProperties.toMutableMap()
                }

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

                /**
                 * The desired state of the Auth Rule.
                 *
                 * Note that only deactivating an Auth Rule through this endpoint is supported at
                 * this time. If you need to (re-)activate an Auth Rule the /promote endpoint should
                 * be used to promote a draft to the currently active version.
                 */
                fun state(state: State) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [State] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<State>) = apply { this.state = state }

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
                 */
                fun build(): AccountLevelRule =
                    AccountLevelRule(
                        (accountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        state,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountLevelRule = apply {
                if (validated) {
                    return@apply
                }

                accountTokens()
                name()
                state()
                validated = true
            }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            class State @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INACTIVE = of("INACTIVE")

                    @JvmStatic fun of(value: String) = State(JsonField.of(value))
                }

                /** An enum containing [State]'s known values. */
                enum class Known {
                    INACTIVE
                }

                /**
                 * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [State] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INACTIVE,
                    /**
                     * An enum member indicating that [State] was instantiated with an unknown
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
                        INACTIVE -> Value.INACTIVE
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
                        INACTIVE -> Known.INACTIVE
                        else -> throw LithicInvalidDataException("Unknown State: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is State && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountLevelRule && accountTokens == other.accountTokens && name == other.name && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountTokens, name, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountLevelRule{accountTokens=$accountTokens, name=$name, state=$state, additionalProperties=$additionalProperties}"
        }

        class CardLevelRule
        private constructor(
            private val cardTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val state: JsonField<State>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_tokens")
                @ExcludeMissing
                cardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            ) : this(cardTokens, name, state, mutableMapOf())

            /**
             * Card tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardTokens(): Optional<List<String>> =
                Optional.ofNullable(cardTokens.getNullable("card_tokens"))

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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

                /** Returns a mutable builder for constructing an instance of [CardLevelRule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CardLevelRule]. */
            class Builder internal constructor() {

                private var cardTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var state: JsonField<State> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardLevelRule: CardLevelRule) = apply {
                    cardTokens = cardLevelRule.cardTokens.map { it.toMutableList() }
                    name = cardLevelRule.name
                    state = cardLevelRule.state
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

                /**
                 * The desired state of the Auth Rule.
                 *
                 * Note that only deactivating an Auth Rule through this endpoint is supported at
                 * this time. If you need to (re-)activate an Auth Rule the /promote endpoint should
                 * be used to promote a draft to the currently active version.
                 */
                fun state(state: State) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [State] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<State>) = apply { this.state = state }

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
                 */
                fun build(): CardLevelRule =
                    CardLevelRule(
                        (cardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        state,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CardLevelRule = apply {
                if (validated) {
                    return@apply
                }

                cardTokens()
                name()
                state()
                validated = true
            }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            class State @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INACTIVE = of("INACTIVE")

                    @JvmStatic fun of(value: String) = State(JsonField.of(value))
                }

                /** An enum containing [State]'s known values. */
                enum class Known {
                    INACTIVE
                }

                /**
                 * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [State] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INACTIVE,
                    /**
                     * An enum member indicating that [State] was instantiated with an unknown
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
                        INACTIVE -> Value.INACTIVE
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
                        INACTIVE -> Known.INACTIVE
                        else -> throw LithicInvalidDataException("Unknown State: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is State && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CardLevelRule && cardTokens == other.cardTokens && name == other.name && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(cardTokens, name, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardLevelRule{cardTokens=$cardTokens, name=$name, state=$state, additionalProperties=$additionalProperties}"
        }

        class ProgramLevelRule
        private constructor(
            private val excludedCardTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val programLevel: JsonField<Boolean>,
            private val state: JsonField<State>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("excluded_card_tokens")
                @ExcludeMissing
                excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("program_level")
                @ExcludeMissing
                programLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            ) : this(excludedCardTokens, name, programLevel, state, mutableMapOf())

            /**
             * Card tokens to which the Auth Rule does not apply.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludedCardTokens(): Optional<List<String>> =
                Optional.ofNullable(excludedCardTokens.getNullable("excluded_card_tokens"))

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Whether the Auth Rule applies to all authorizations on the card program.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun programLevel(): Optional<Boolean> =
                Optional.ofNullable(programLevel.getNullable("program_level"))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

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
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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

                /** Returns a mutable builder for constructing an instance of [ProgramLevelRule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProgramLevelRule]. */
            class Builder internal constructor() {

                private var excludedCardTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var programLevel: JsonField<Boolean> = JsonMissing.of()
                private var state: JsonField<State> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(programLevelRule: ProgramLevelRule) = apply {
                    excludedCardTokens =
                        programLevelRule.excludedCardTokens.map { it.toMutableList() }
                    name = programLevelRule.name
                    programLevel = programLevelRule.programLevel
                    state = programLevelRule.state
                    additionalProperties = programLevelRule.additionalProperties.toMutableMap()
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
                 * The desired state of the Auth Rule.
                 *
                 * Note that only deactivating an Auth Rule through this endpoint is supported at
                 * this time. If you need to (re-)activate an Auth Rule the /promote endpoint should
                 * be used to promote a draft to the currently active version.
                 */
                fun state(state: State) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [State] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<State>) = apply { this.state = state }

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
                 */
                fun build(): ProgramLevelRule =
                    ProgramLevelRule(
                        (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        programLevel,
                        state,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ProgramLevelRule = apply {
                if (validated) {
                    return@apply
                }

                excludedCardTokens()
                name()
                programLevel()
                state()
                validated = true
            }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            class State @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INACTIVE = of("INACTIVE")

                    @JvmStatic fun of(value: String) = State(JsonField.of(value))
                }

                /** An enum containing [State]'s known values. */
                enum class Known {
                    INACTIVE
                }

                /**
                 * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [State] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INACTIVE,
                    /**
                     * An enum member indicating that [State] was instantiated with an unknown
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
                        INACTIVE -> Value.INACTIVE
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
                        INACTIVE -> Known.INACTIVE
                        else -> throw LithicInvalidDataException("Unknown State: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is State && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProgramLevelRule && excludedCardTokens == other.excludedCardTokens && name == other.name && programLevel == other.programLevel && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(excludedCardTokens, name, programLevel, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProgramLevelRule{excludedCardTokens=$excludedCardTokens, name=$name, programLevel=$programLevel, state=$state, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2UpdateParams && authRuleToken == other.authRuleToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V2UpdateParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
