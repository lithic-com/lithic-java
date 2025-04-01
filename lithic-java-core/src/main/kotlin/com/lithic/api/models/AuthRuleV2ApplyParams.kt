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
 * Associates a V2 authorization rule with a card program, the provided account(s) or card(s).
 *
 * Prefer using the `PATCH` method for this operation.
 */
class AuthRuleV2ApplyParams
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
         * Returns a mutable builder for constructing an instance of [AuthRuleV2ApplyParams].
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2ApplyParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authRuleV2ApplyParams: AuthRuleV2ApplyParams) = apply {
            authRuleToken = authRuleV2ApplyParams.authRuleToken
            body = authRuleV2ApplyParams.body
            additionalHeaders = authRuleV2ApplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2ApplyParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofApplyAuthRuleRequestAccountTokens(applyAuthRuleRequestAccountTokens)`.
         */
        fun body(applyAuthRuleRequestAccountTokens: Body.ApplyAuthRuleRequestAccountTokens) =
            body(Body.ofApplyAuthRuleRequestAccountTokens(applyAuthRuleRequestAccountTokens))

        /**
         * Alias for calling [body] with
         * `Body.ofApplyAuthRuleRequestCardTokens(applyAuthRuleRequestCardTokens)`.
         */
        fun body(applyAuthRuleRequestCardTokens: Body.ApplyAuthRuleRequestCardTokens) =
            body(Body.ofApplyAuthRuleRequestCardTokens(applyAuthRuleRequestCardTokens))

        /**
         * Alias for calling [body] with
         * `Body.ofApplyAuthRuleRequestProgramLevel(applyAuthRuleRequestProgramLevel)`.
         */
        fun body(applyAuthRuleRequestProgramLevel: Body.ApplyAuthRuleRequestProgramLevel) =
            body(Body.ofApplyAuthRuleRequestProgramLevel(applyAuthRuleRequestProgramLevel))

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
         * Returns an immutable instance of [AuthRuleV2ApplyParams].
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
        fun build(): AuthRuleV2ApplyParams =
            AuthRuleV2ApplyParams(
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
        private val applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens? = null,
        private val applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens? = null,
        private val applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel? = null,
        private val _json: JsonValue? = null,
    ) {

        fun applyAuthRuleRequestAccountTokens(): Optional<ApplyAuthRuleRequestAccountTokens> =
            Optional.ofNullable(applyAuthRuleRequestAccountTokens)

        fun applyAuthRuleRequestCardTokens(): Optional<ApplyAuthRuleRequestCardTokens> =
            Optional.ofNullable(applyAuthRuleRequestCardTokens)

        fun applyAuthRuleRequestProgramLevel(): Optional<ApplyAuthRuleRequestProgramLevel> =
            Optional.ofNullable(applyAuthRuleRequestProgramLevel)

        fun isApplyAuthRuleRequestAccountTokens(): Boolean =
            applyAuthRuleRequestAccountTokens != null

        fun isApplyAuthRuleRequestCardTokens(): Boolean = applyAuthRuleRequestCardTokens != null

        fun isApplyAuthRuleRequestProgramLevel(): Boolean = applyAuthRuleRequestProgramLevel != null

        fun asApplyAuthRuleRequestAccountTokens(): ApplyAuthRuleRequestAccountTokens =
            applyAuthRuleRequestAccountTokens.getOrThrow("applyAuthRuleRequestAccountTokens")

        fun asApplyAuthRuleRequestCardTokens(): ApplyAuthRuleRequestCardTokens =
            applyAuthRuleRequestCardTokens.getOrThrow("applyAuthRuleRequestCardTokens")

        fun asApplyAuthRuleRequestProgramLevel(): ApplyAuthRuleRequestProgramLevel =
            applyAuthRuleRequestProgramLevel.getOrThrow("applyAuthRuleRequestProgramLevel")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                applyAuthRuleRequestAccountTokens != null ->
                    visitor.visitApplyAuthRuleRequestAccountTokens(
                        applyAuthRuleRequestAccountTokens
                    )
                applyAuthRuleRequestCardTokens != null ->
                    visitor.visitApplyAuthRuleRequestCardTokens(applyAuthRuleRequestCardTokens)
                applyAuthRuleRequestProgramLevel != null ->
                    visitor.visitApplyAuthRuleRequestProgramLevel(applyAuthRuleRequestProgramLevel)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApplyAuthRuleRequestAccountTokens(
                        applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
                    ) {
                        applyAuthRuleRequestAccountTokens.validate()
                    }

                    override fun visitApplyAuthRuleRequestCardTokens(
                        applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
                    ) {
                        applyAuthRuleRequestCardTokens.validate()
                    }

                    override fun visitApplyAuthRuleRequestProgramLevel(
                        applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
                    ) {
                        applyAuthRuleRequestProgramLevel.validate()
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
                    override fun visitApplyAuthRuleRequestAccountTokens(
                        applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
                    ) = applyAuthRuleRequestAccountTokens.validity()

                    override fun visitApplyAuthRuleRequestCardTokens(
                        applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
                    ) = applyAuthRuleRequestCardTokens.validity()

                    override fun visitApplyAuthRuleRequestProgramLevel(
                        applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
                    ) = applyAuthRuleRequestProgramLevel.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && applyAuthRuleRequestAccountTokens == other.applyAuthRuleRequestAccountTokens && applyAuthRuleRequestCardTokens == other.applyAuthRuleRequestCardTokens && applyAuthRuleRequestProgramLevel == other.applyAuthRuleRequestProgramLevel /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(applyAuthRuleRequestAccountTokens, applyAuthRuleRequestCardTokens, applyAuthRuleRequestProgramLevel) /* spotless:on */

        override fun toString(): String =
            when {
                applyAuthRuleRequestAccountTokens != null ->
                    "Body{applyAuthRuleRequestAccountTokens=$applyAuthRuleRequestAccountTokens}"
                applyAuthRuleRequestCardTokens != null ->
                    "Body{applyAuthRuleRequestCardTokens=$applyAuthRuleRequestCardTokens}"
                applyAuthRuleRequestProgramLevel != null ->
                    "Body{applyAuthRuleRequestProgramLevel=$applyAuthRuleRequestProgramLevel}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofApplyAuthRuleRequestAccountTokens(
                applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
            ) = Body(applyAuthRuleRequestAccountTokens = applyAuthRuleRequestAccountTokens)

            @JvmStatic
            fun ofApplyAuthRuleRequestCardTokens(
                applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
            ) = Body(applyAuthRuleRequestCardTokens = applyAuthRuleRequestCardTokens)

            @JvmStatic
            fun ofApplyAuthRuleRequestProgramLevel(
                applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
            ) = Body(applyAuthRuleRequestProgramLevel = applyAuthRuleRequestProgramLevel)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitApplyAuthRuleRequestAccountTokens(
                applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
            ): T

            fun visitApplyAuthRuleRequestCardTokens(
                applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
            ): T

            fun visitApplyAuthRuleRequestProgramLevel(
                applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
            ): T

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
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApplyAuthRuleRequestAccountTokens>(),
                                )
                                ?.let {
                                    Body(applyAuthRuleRequestAccountTokens = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<ApplyAuthRuleRequestCardTokens>())
                                ?.let { Body(applyAuthRuleRequestCardTokens = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApplyAuthRuleRequestProgramLevel>())
                                ?.let { Body(applyAuthRuleRequestProgramLevel = it, _json = json) },
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
                    value.applyAuthRuleRequestAccountTokens != null ->
                        generator.writeObject(value.applyAuthRuleRequestAccountTokens)
                    value.applyAuthRuleRequestCardTokens != null ->
                        generator.writeObject(value.applyAuthRuleRequestCardTokens)
                    value.applyAuthRuleRequestProgramLevel != null ->
                        generator.writeObject(value.applyAuthRuleRequestProgramLevel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class ApplyAuthRuleRequestAccountTokens
        private constructor(
            private val accountTokens: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_tokens")
                @ExcludeMissing
                accountTokens: JsonField<List<String>> = JsonMissing.of()
            ) : this(accountTokens, mutableMapOf())

            /**
             * Account tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

            /**
             * Returns the raw JSON value of [accountTokens].
             *
             * Unlike [accountTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_tokens")
            @ExcludeMissing
            fun _accountTokens(): JsonField<List<String>> = accountTokens

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
                 * [ApplyAuthRuleRequestAccountTokens].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountTokens()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplyAuthRuleRequestAccountTokens]. */
            class Builder internal constructor() {

                private var accountTokens: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
                ) = apply {
                    accountTokens =
                        applyAuthRuleRequestAccountTokens.accountTokens.map { it.toMutableList() }
                    additionalProperties =
                        applyAuthRuleRequestAccountTokens.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ApplyAuthRuleRequestAccountTokens].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountTokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApplyAuthRuleRequestAccountTokens =
                    ApplyAuthRuleRequestAccountTokens(
                        checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApplyAuthRuleRequestAccountTokens = apply {
                if (validated) {
                    return@apply
                }

                accountTokens()
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
            internal fun validity(): Int = (accountTokens.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApplyAuthRuleRequestAccountTokens && accountTokens == other.accountTokens && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountTokens, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplyAuthRuleRequestAccountTokens{accountTokens=$accountTokens, additionalProperties=$additionalProperties}"
        }

        class ApplyAuthRuleRequestCardTokens
        private constructor(
            private val cardTokens: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_tokens")
                @ExcludeMissing
                cardTokens: JsonField<List<String>> = JsonMissing.of()
            ) : this(cardTokens, mutableMapOf())

            /**
             * Card tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

            /**
             * Returns the raw JSON value of [cardTokens].
             *
             * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_tokens")
            @ExcludeMissing
            fun _cardTokens(): JsonField<List<String>> = cardTokens

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
                 * [ApplyAuthRuleRequestCardTokens].
                 *
                 * The following fields are required:
                 * ```java
                 * .cardTokens()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplyAuthRuleRequestCardTokens]. */
            class Builder internal constructor() {

                private var cardTokens: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens) =
                    apply {
                        cardTokens =
                            applyAuthRuleRequestCardTokens.cardTokens.map { it.toMutableList() }
                        additionalProperties =
                            applyAuthRuleRequestCardTokens.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ApplyAuthRuleRequestCardTokens].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cardTokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApplyAuthRuleRequestCardTokens =
                    ApplyAuthRuleRequestCardTokens(
                        checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApplyAuthRuleRequestCardTokens = apply {
                if (validated) {
                    return@apply
                }

                cardTokens()
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
            internal fun validity(): Int = (cardTokens.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApplyAuthRuleRequestCardTokens && cardTokens == other.cardTokens && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(cardTokens, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplyAuthRuleRequestCardTokens{cardTokens=$cardTokens, additionalProperties=$additionalProperties}"
        }

        class ApplyAuthRuleRequestProgramLevel
        private constructor(
            private val programLevel: JsonField<Boolean>,
            private val excludedCardTokens: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("program_level")
                @ExcludeMissing
                programLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("excluded_card_tokens")
                @ExcludeMissing
                excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
            ) : this(programLevel, excludedCardTokens, mutableMapOf())

            /**
             * Whether the Auth Rule applies to all authorizations on the card program.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun programLevel(): Boolean = programLevel.getRequired("program_level")

            /**
             * Card tokens to which the Auth Rule does not apply.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludedCardTokens(): Optional<List<String>> =
                Optional.ofNullable(excludedCardTokens.getNullable("excluded_card_tokens"))

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
             * Returns the raw JSON value of [excludedCardTokens].
             *
             * Unlike [excludedCardTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [ApplyAuthRuleRequestProgramLevel].
                 *
                 * The following fields are required:
                 * ```java
                 * .programLevel()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplyAuthRuleRequestProgramLevel]. */
            class Builder internal constructor() {

                private var programLevel: JsonField<Boolean>? = null
                private var excludedCardTokens: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
                ) = apply {
                    programLevel = applyAuthRuleRequestProgramLevel.programLevel
                    excludedCardTokens =
                        applyAuthRuleRequestProgramLevel.excludedCardTokens.map {
                            it.toMutableList()
                        }
                    additionalProperties =
                        applyAuthRuleRequestProgramLevel.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [ApplyAuthRuleRequestProgramLevel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .programLevel()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApplyAuthRuleRequestProgramLevel =
                    ApplyAuthRuleRequestProgramLevel(
                        checkRequired("programLevel", programLevel),
                        (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApplyAuthRuleRequestProgramLevel = apply {
                if (validated) {
                    return@apply
                }

                programLevel()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (programLevel.asKnown().isPresent) 1 else 0) +
                    (excludedCardTokens.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApplyAuthRuleRequestProgramLevel && programLevel == other.programLevel && excludedCardTokens == other.excludedCardTokens && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(programLevel, excludedCardTokens, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplyAuthRuleRequestProgramLevel{programLevel=$programLevel, excludedCardTokens=$excludedCardTokens, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ApplyParams && authRuleToken == other.authRuleToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ApplyParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
