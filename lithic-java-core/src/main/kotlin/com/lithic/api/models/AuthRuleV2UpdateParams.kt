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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Updates a V2 authorization rule's properties
 *
 * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided, this
 * will replace existing associations with the provided list of entities.
 */
class AuthRuleV2UpdateParams
private constructor(
    private val authRuleToken: String,
    private val body: AuthRuleV2UpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): String = authRuleToken

    fun accountLevelRule(): Optional<AccountLevelRule> = body.accountLevelRule()

    fun cardLevelRule(): Optional<CardLevelRule> = body.cardLevelRule()

    fun programLevelRule(): Optional<ProgramLevelRule> = body.programLevelRule()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): AuthRuleV2UpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @JsonDeserialize(using = AuthRuleV2UpdateBody.Deserializer::class)
    @JsonSerialize(using = AuthRuleV2UpdateBody.Serializer::class)
    class AuthRuleV2UpdateBody
    internal constructor(
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2UpdateBody && accountLevelRule == other.accountLevelRule && cardLevelRule == other.cardLevelRule && programLevelRule == other.programLevelRule /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountLevelRule, cardLevelRule, programLevelRule) /* spotless:on */

        override fun toString(): String =
            when {
                accountLevelRule != null ->
                    "AuthRuleV2UpdateBody{accountLevelRule=$accountLevelRule}"
                cardLevelRule != null -> "AuthRuleV2UpdateBody{cardLevelRule=$cardLevelRule}"
                programLevelRule != null ->
                    "AuthRuleV2UpdateBody{programLevelRule=$programLevelRule}"
                _json != null -> "AuthRuleV2UpdateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthRuleV2UpdateBody")
            }

        companion object {

            @JvmStatic
            fun ofAccountLevelRule(accountLevelRule: AccountLevelRule) =
                AuthRuleV2UpdateBody(accountLevelRule = accountLevelRule)

            @JvmStatic
            fun ofCardLevelRule(cardLevelRule: CardLevelRule) =
                AuthRuleV2UpdateBody(cardLevelRule = cardLevelRule)

            @JvmStatic
            fun ofProgramLevelRule(programLevelRule: ProgramLevelRule) =
                AuthRuleV2UpdateBody(programLevelRule = programLevelRule)
        }

        /**
         * An interface that defines how to map each variant of [AuthRuleV2UpdateBody] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAccountLevelRule(accountLevelRule: AccountLevelRule): T

            fun visitCardLevelRule(cardLevelRule: CardLevelRule): T

            fun visitProgramLevelRule(programLevelRule: ProgramLevelRule): T

            /**
             * Maps an unknown variant of [AuthRuleV2UpdateBody] to a value of type [T].
             *
             * An instance of [AuthRuleV2UpdateBody] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown AuthRuleV2UpdateBody: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<AuthRuleV2UpdateBody>(AuthRuleV2UpdateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleV2UpdateBody {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<AccountLevelRule>())?.let {
                    return AuthRuleV2UpdateBody(accountLevelRule = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<CardLevelRule>())?.let {
                    return AuthRuleV2UpdateBody(cardLevelRule = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ProgramLevelRule>())?.let {
                    return AuthRuleV2UpdateBody(programLevelRule = it, _json = json)
                }

                return AuthRuleV2UpdateBody(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<AuthRuleV2UpdateBody>(AuthRuleV2UpdateBody::class) {

            override fun serialize(
                value: AuthRuleV2UpdateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.accountLevelRule != null -> generator.writeObject(value.accountLevelRule)
                    value.cardLevelRule != null -> generator.writeObject(value.cardLevelRule)
                    value.programLevelRule != null -> generator.writeObject(value.programLevelRule)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthRuleV2UpdateBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2UpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: AuthRuleV2UpdateBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2UpdateParams: AuthRuleV2UpdateParams) = apply {
            authRuleToken = authRuleV2UpdateParams.authRuleToken
            body = authRuleV2UpdateParams.body
            additionalHeaders = authRuleV2UpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2UpdateParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        fun forAccountLevelRule(accountLevelRule: AccountLevelRule) = apply {
            body = AuthRuleV2UpdateBody.ofAccountLevelRule(accountLevelRule)
        }

        fun forCardLevelRule(cardLevelRule: CardLevelRule) = apply {
            body = AuthRuleV2UpdateBody.ofCardLevelRule(cardLevelRule)
        }

        fun forProgramLevelRule(programLevelRule: ProgramLevelRule) = apply {
            body = AuthRuleV2UpdateBody.ofProgramLevelRule(programLevelRule)
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

        fun build(): AuthRuleV2UpdateParams =
            AuthRuleV2UpdateParams(
                checkRequired("authRuleToken", authRuleToken),
                body ?: AuthRuleV2UpdateBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AccountLevelRule
    @JsonCreator
    private constructor(
        @JsonProperty("account_tokens")
        @ExcludeMissing
        private val accountTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<State> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(): Optional<List<String>> =
            Optional.ofNullable(accountTokens.getNullable("account_tokens"))

        /** Auth Rule Name */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

        /** Account tokens to which the Auth Rule applies. */
        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun _accountTokens(): JsonField<List<String>> = accountTokens

        /** Auth Rule Name */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Account tokens to which the Auth Rule applies. */
            fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
                this.accountTokens = accountTokens.map { it.toMutableList() }
            }

            /** Account tokens to which the Auth Rule applies. */
            fun addAccountToken(accountToken: String) = apply {
                accountTokens =
                    (accountTokens ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(accountToken)
                    }
            }

            /** Auth Rule Name */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Auth Rule Name */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Auth Rule Name */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

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

            fun build(): AccountLevelRule =
                AccountLevelRule(
                    (accountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        class State
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val INACTIVE = of("INACTIVE")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                INACTIVE,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INACTIVE,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
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
                    INACTIVE -> Value.INACTIVE
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
                    INACTIVE -> Known.INACTIVE
                    else -> throw LithicInvalidDataException("Unknown State: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

    @NoAutoDetect
    class CardLevelRule
    @JsonCreator
    private constructor(
        @JsonProperty("card_tokens")
        @ExcludeMissing
        private val cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<State> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Card tokens to which the Auth Rule applies. */
        fun cardTokens(): Optional<List<String>> =
            Optional.ofNullable(cardTokens.getNullable("card_tokens"))

        /** Auth Rule Name */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

        /** Card tokens to which the Auth Rule applies. */
        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun _cardTokens(): JsonField<List<String>> = cardTokens

        /** Auth Rule Name */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Card tokens to which the Auth Rule applies. */
            fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
                this.cardTokens = cardTokens.map { it.toMutableList() }
            }

            /** Card tokens to which the Auth Rule applies. */
            fun addCardToken(cardToken: String) = apply {
                cardTokens =
                    (cardTokens ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(cardToken)
                    }
            }

            /** Auth Rule Name */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Auth Rule Name */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Auth Rule Name */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

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

            fun build(): CardLevelRule =
                CardLevelRule(
                    (cardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        class State
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val INACTIVE = of("INACTIVE")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                INACTIVE,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INACTIVE,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
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
                    INACTIVE -> Value.INACTIVE
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
                    INACTIVE -> Known.INACTIVE
                    else -> throw LithicInvalidDataException("Unknown State: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

    @NoAutoDetect
    class ProgramLevelRule
    @JsonCreator
    private constructor(
        @JsonProperty("excluded_card_tokens")
        @ExcludeMissing
        private val excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("program_level")
        @ExcludeMissing
        private val programLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<State> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Card tokens to which the Auth Rule does not apply. */
        fun excludedCardTokens(): Optional<List<String>> =
            Optional.ofNullable(excludedCardTokens.getNullable("excluded_card_tokens"))

        /** Auth Rule Name */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(): Optional<Boolean> =
            Optional.ofNullable(programLevel.getNullable("program_level"))

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

        /** Card tokens to which the Auth Rule does not apply. */
        @JsonProperty("excluded_card_tokens")
        @ExcludeMissing
        fun _excludedCardTokens(): JsonField<List<String>> = excludedCardTokens

        /** Auth Rule Name */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        @JsonProperty("program_level")
        @ExcludeMissing
        fun _programLevel(): JsonField<Boolean> = programLevel

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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
                excludedCardTokens = programLevelRule.excludedCardTokens.map { it.toMutableList() }
                name = programLevelRule.name
                programLevel = programLevelRule.programLevel
                state = programLevelRule.state
                additionalProperties = programLevelRule.additionalProperties.toMutableMap()
            }

            /** Card tokens to which the Auth Rule does not apply. */
            fun excludedCardTokens(excludedCardTokens: List<String>) =
                excludedCardTokens(JsonField.of(excludedCardTokens))

            /** Card tokens to which the Auth Rule does not apply. */
            fun excludedCardTokens(excludedCardTokens: JsonField<List<String>>) = apply {
                this.excludedCardTokens = excludedCardTokens.map { it.toMutableList() }
            }

            /** Card tokens to which the Auth Rule does not apply. */
            fun addExcludedCardToken(excludedCardToken: String) = apply {
                excludedCardTokens =
                    (excludedCardTokens ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(excludedCardToken)
                    }
            }

            /** Auth Rule Name */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Auth Rule Name */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Auth Rule Name */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Whether the Auth Rule applies to all authorizations on the card program. */
            fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

            /** Whether the Auth Rule applies to all authorizations on the card program. */
            fun programLevel(programLevel: JsonField<Boolean>) = apply {
                this.programLevel = programLevel
            }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

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

            fun build(): ProgramLevelRule =
                ProgramLevelRule(
                    (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    programLevel,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        class State
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val INACTIVE = of("INACTIVE")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                INACTIVE,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INACTIVE,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
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
                    INACTIVE -> Value.INACTIVE
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
                    INACTIVE -> Known.INACTIVE
                    else -> throw LithicInvalidDataException("Unknown State: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2UpdateParams && authRuleToken == other.authRuleToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2UpdateParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
