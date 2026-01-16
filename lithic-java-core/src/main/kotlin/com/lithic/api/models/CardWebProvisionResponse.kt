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
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = CardWebProvisionResponse.Deserializer::class)
@JsonSerialize(using = CardWebProvisionResponse.Serializer::class)
class CardWebProvisionResponse
private constructor(
    private val appleWebPushProvisioning: AppleWebPushProvisioningResponse? = null,
    private val googleWebPushProvisioning: GoogleWebPushProvisioningResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun appleWebPushProvisioning(): Optional<AppleWebPushProvisioningResponse> =
        Optional.ofNullable(appleWebPushProvisioning)

    fun googleWebPushProvisioning(): Optional<GoogleWebPushProvisioningResponse> =
        Optional.ofNullable(googleWebPushProvisioning)

    fun isAppleWebPushProvisioning(): Boolean = appleWebPushProvisioning != null

    fun isGoogleWebPushProvisioning(): Boolean = googleWebPushProvisioning != null

    fun asAppleWebPushProvisioning(): AppleWebPushProvisioningResponse =
        appleWebPushProvisioning.getOrThrow("appleWebPushProvisioning")

    fun asGoogleWebPushProvisioning(): GoogleWebPushProvisioningResponse =
        googleWebPushProvisioning.getOrThrow("googleWebPushProvisioning")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            appleWebPushProvisioning != null ->
                visitor.visitAppleWebPushProvisioning(appleWebPushProvisioning)
            googleWebPushProvisioning != null ->
                visitor.visitGoogleWebPushProvisioning(googleWebPushProvisioning)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CardWebProvisionResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAppleWebPushProvisioning(
                    appleWebPushProvisioning: AppleWebPushProvisioningResponse
                ) {
                    appleWebPushProvisioning.validate()
                }

                override fun visitGoogleWebPushProvisioning(
                    googleWebPushProvisioning: GoogleWebPushProvisioningResponse
                ) {
                    googleWebPushProvisioning.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAppleWebPushProvisioning(
                    appleWebPushProvisioning: AppleWebPushProvisioningResponse
                ) = appleWebPushProvisioning.validity()

                override fun visitGoogleWebPushProvisioning(
                    googleWebPushProvisioning: GoogleWebPushProvisioningResponse
                ) = googleWebPushProvisioning.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardWebProvisionResponse &&
            appleWebPushProvisioning == other.appleWebPushProvisioning &&
            googleWebPushProvisioning == other.googleWebPushProvisioning
    }

    override fun hashCode(): Int = Objects.hash(appleWebPushProvisioning, googleWebPushProvisioning)

    override fun toString(): String =
        when {
            appleWebPushProvisioning != null ->
                "CardWebProvisionResponse{appleWebPushProvisioning=$appleWebPushProvisioning}"
            googleWebPushProvisioning != null ->
                "CardWebProvisionResponse{googleWebPushProvisioning=$googleWebPushProvisioning}"
            _json != null -> "CardWebProvisionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CardWebProvisionResponse")
        }

    companion object {

        @JvmStatic
        fun ofAppleWebPushProvisioning(appleWebPushProvisioning: AppleWebPushProvisioningResponse) =
            CardWebProvisionResponse(appleWebPushProvisioning = appleWebPushProvisioning)

        @JvmStatic
        fun ofGoogleWebPushProvisioning(
            googleWebPushProvisioning: GoogleWebPushProvisioningResponse
        ) = CardWebProvisionResponse(googleWebPushProvisioning = googleWebPushProvisioning)
    }

    /**
     * An interface that defines how to map each variant of [CardWebProvisionResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitAppleWebPushProvisioning(
            appleWebPushProvisioning: AppleWebPushProvisioningResponse
        ): T

        fun visitGoogleWebPushProvisioning(
            googleWebPushProvisioning: GoogleWebPushProvisioningResponse
        ): T

        /**
         * Maps an unknown variant of [CardWebProvisionResponse] to a value of type [T].
         *
         * An instance of [CardWebProvisionResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown CardWebProvisionResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CardWebProvisionResponse>(CardWebProvisionResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CardWebProvisionResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AppleWebPushProvisioningResponse>())
                            ?.let {
                                CardWebProvisionResponse(
                                    appleWebPushProvisioning = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<GoogleWebPushProvisioningResponse>())
                            ?.let {
                                CardWebProvisionResponse(
                                    googleWebPushProvisioning = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CardWebProvisionResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CardWebProvisionResponse>(CardWebProvisionResponse::class) {

        override fun serialize(
            value: CardWebProvisionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.appleWebPushProvisioning != null ->
                    generator.writeObject(value.appleWebPushProvisioning)
                value.googleWebPushProvisioning != null ->
                    generator.writeObject(value.googleWebPushProvisioning)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CardWebProvisionResponse")
            }
        }
    }

    class AppleWebPushProvisioningResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jws: JsonField<WebPushProvisioningResponseJws>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("jws")
            @ExcludeMissing
            jws: JsonField<WebPushProvisioningResponseJws> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(jws, state, mutableMapOf())

        /**
         * JWS object required for handoff to Apple's script.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jws(): WebPushProvisioningResponseJws = jws.getRequired("jws")

        /**
         * A unique identifier for the JWS object.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Returns the raw JSON value of [jws].
         *
         * Unlike [jws], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jws")
        @ExcludeMissing
        fun _jws(): JsonField<WebPushProvisioningResponseJws> = jws

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
             * [AppleWebPushProvisioningResponse].
             *
             * The following fields are required:
             * ```java
             * .jws()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AppleWebPushProvisioningResponse]. */
        class Builder internal constructor() {

            private var jws: JsonField<WebPushProvisioningResponseJws>? = null
            private var state: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(appleWebPushProvisioningResponse: AppleWebPushProvisioningResponse) =
                apply {
                    jws = appleWebPushProvisioningResponse.jws
                    state = appleWebPushProvisioningResponse.state
                    additionalProperties =
                        appleWebPushProvisioningResponse.additionalProperties.toMutableMap()
                }

            /** JWS object required for handoff to Apple's script. */
            fun jws(jws: WebPushProvisioningResponseJws) = jws(JsonField.of(jws))

            /**
             * Sets [Builder.jws] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jws] with a well-typed
             * [WebPushProvisioningResponseJws] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun jws(jws: JsonField<WebPushProvisioningResponseJws>) = apply { this.jws = jws }

            /** A unique identifier for the JWS object. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [AppleWebPushProvisioningResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .jws()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AppleWebPushProvisioningResponse =
                AppleWebPushProvisioningResponse(
                    checkRequired("jws", jws),
                    checkRequired("state", state),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AppleWebPushProvisioningResponse = apply {
            if (validated) {
                return@apply
            }

            jws().validate()
            state()
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
            (jws.asKnown().getOrNull()?.validity() ?: 0) + (if (state.asKnown().isPresent) 1 else 0)

        /** JWS object required for handoff to Apple's script. */
        class WebPushProvisioningResponseJws
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val header: JsonField<WebPushProvisioningResponseHeader>,
            private val payload: JsonField<String>,
            private val protected_: JsonField<String>,
            private val signature: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("header")
                @ExcludeMissing
                header: JsonField<WebPushProvisioningResponseHeader> = JsonMissing.of(),
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<String> = JsonMissing.of(),
                @JsonProperty("protected")
                @ExcludeMissing
                protected_: JsonField<String> = JsonMissing.of(),
                @JsonProperty("signature")
                @ExcludeMissing
                signature: JsonField<String> = JsonMissing.of(),
            ) : this(header, payload, protected_, signature, mutableMapOf())

            /**
             * JWS unprotected headers containing header parameters that aren't integrity-protected
             * by the JWS signature.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun header(): Optional<WebPushProvisioningResponseHeader> = header.getOptional("header")

            /**
             * Base64url encoded JSON object containing the provisioning payload.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<String> = payload.getOptional("payload")

            /**
             * Base64url encoded JWS protected headers containing the header parameters that are
             * integrity-protected by the JWS signature.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun protected_(): Optional<String> = protected_.getOptional("protected")

            /**
             * Base64url encoded signature of the JWS object.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun signature(): Optional<String> = signature.getOptional("signature")

            /**
             * Returns the raw JSON value of [header].
             *
             * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("header")
            @ExcludeMissing
            fun _header(): JsonField<WebPushProvisioningResponseHeader> = header

            /**
             * Returns the raw JSON value of [payload].
             *
             * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<String> = payload

            /**
             * Returns the raw JSON value of [protected_].
             *
             * Unlike [protected_], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("protected")
            @ExcludeMissing
            fun _protected_(): JsonField<String> = protected_

            /**
             * Returns the raw JSON value of [signature].
             *
             * Unlike [signature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("signature")
            @ExcludeMissing
            fun _signature(): JsonField<String> = signature

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
                 * [WebPushProvisioningResponseJws].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WebPushProvisioningResponseJws]. */
            class Builder internal constructor() {

                private var header: JsonField<WebPushProvisioningResponseHeader> = JsonMissing.of()
                private var payload: JsonField<String> = JsonMissing.of()
                private var protected_: JsonField<String> = JsonMissing.of()
                private var signature: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webPushProvisioningResponseJws: WebPushProvisioningResponseJws) =
                    apply {
                        header = webPushProvisioningResponseJws.header
                        payload = webPushProvisioningResponseJws.payload
                        protected_ = webPushProvisioningResponseJws.protected_
                        signature = webPushProvisioningResponseJws.signature
                        additionalProperties =
                            webPushProvisioningResponseJws.additionalProperties.toMutableMap()
                    }

                /**
                 * JWS unprotected headers containing header parameters that aren't
                 * integrity-protected by the JWS signature.
                 */
                fun header(header: WebPushProvisioningResponseHeader) = header(JsonField.of(header))

                /**
                 * Sets [Builder.header] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.header] with a well-typed
                 * [WebPushProvisioningResponseHeader] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun header(header: JsonField<WebPushProvisioningResponseHeader>) = apply {
                    this.header = header
                }

                /** Base64url encoded JSON object containing the provisioning payload. */
                fun payload(payload: String) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<String>) = apply { this.payload = payload }

                /**
                 * Base64url encoded JWS protected headers containing the header parameters that are
                 * integrity-protected by the JWS signature.
                 */
                fun protected_(protected_: String) = protected_(JsonField.of(protected_))

                /**
                 * Sets [Builder.protected_] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.protected_] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun protected_(protected_: JsonField<String>) = apply {
                    this.protected_ = protected_
                }

                /** Base64url encoded signature of the JWS object. */
                fun signature(signature: String) = signature(JsonField.of(signature))

                /**
                 * Sets [Builder.signature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.signature] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun signature(signature: JsonField<String>) = apply { this.signature = signature }

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
                 * Returns an immutable instance of [WebPushProvisioningResponseJws].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WebPushProvisioningResponseJws =
                    WebPushProvisioningResponseJws(
                        header,
                        payload,
                        protected_,
                        signature,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WebPushProvisioningResponseJws = apply {
                if (validated) {
                    return@apply
                }

                header().ifPresent { it.validate() }
                payload()
                protected_()
                signature()
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
                (header.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (payload.asKnown().isPresent) 1 else 0) +
                    (if (protected_.asKnown().isPresent) 1 else 0) +
                    (if (signature.asKnown().isPresent) 1 else 0)

            /**
             * JWS unprotected headers containing header parameters that aren't integrity-protected
             * by the JWS signature.
             */
            class WebPushProvisioningResponseHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kid: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kid") @ExcludeMissing kid: JsonField<String> = JsonMissing.of()
                ) : this(kid, mutableMapOf())

                /**
                 * The ID for the JWS Public Key of the key pair used to generate the signature.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun kid(): Optional<String> = kid.getOptional("kid")

                /**
                 * Returns the raw JSON value of [kid].
                 *
                 * Unlike [kid], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("kid") @ExcludeMissing fun _kid(): JsonField<String> = kid

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
                     * [WebPushProvisioningResponseHeader].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebPushProvisioningResponseHeader]. */
                class Builder internal constructor() {

                    private var kid: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webPushProvisioningResponseHeader: WebPushProvisioningResponseHeader
                    ) = apply {
                        kid = webPushProvisioningResponseHeader.kid
                        additionalProperties =
                            webPushProvisioningResponseHeader.additionalProperties.toMutableMap()
                    }

                    /**
                     * The ID for the JWS Public Key of the key pair used to generate the signature.
                     */
                    fun kid(kid: String) = kid(JsonField.of(kid))

                    /**
                     * Sets [Builder.kid] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kid] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kid(kid: JsonField<String>) = apply { this.kid = kid }

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
                     * Returns an immutable instance of [WebPushProvisioningResponseHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebPushProvisioningResponseHeader =
                        WebPushProvisioningResponseHeader(kid, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): WebPushProvisioningResponseHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    kid()
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
                @JvmSynthetic internal fun validity(): Int = (if (kid.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebPushProvisioningResponseHeader &&
                        kid == other.kid &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kid, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebPushProvisioningResponseHeader{kid=$kid, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WebPushProvisioningResponseJws &&
                    header == other.header &&
                    payload == other.payload &&
                    protected_ == other.protected_ &&
                    signature == other.signature &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(header, payload, protected_, signature, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WebPushProvisioningResponseJws{header=$header, payload=$payload, protected_=$protected_, signature=$signature, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AppleWebPushProvisioningResponse &&
                jws == other.jws &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(jws, state, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AppleWebPushProvisioningResponse{jws=$jws, state=$state, additionalProperties=$additionalProperties}"
    }

    class GoogleWebPushProvisioningResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val googleOpc: JsonField<String>,
        private val tspOpc: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("google_opc")
            @ExcludeMissing
            googleOpc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tsp_opc") @ExcludeMissing tspOpc: JsonField<String> = JsonMissing.of(),
        ) : this(googleOpc, tspOpc, mutableMapOf())

        /**
         * A base64 encoded and encrypted payload representing card data for the Google Pay UWPP
         * FPAN flow.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun googleOpc(): Optional<String> = googleOpc.getOptional("google_opc")

        /**
         * A base64 encoded and encrypted payload representing card data for the Google Pay UWPP
         * tokenization flow.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tspOpc(): Optional<String> = tspOpc.getOptional("tsp_opc")

        /**
         * Returns the raw JSON value of [googleOpc].
         *
         * Unlike [googleOpc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("google_opc") @ExcludeMissing fun _googleOpc(): JsonField<String> = googleOpc

        /**
         * Returns the raw JSON value of [tspOpc].
         *
         * Unlike [tspOpc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tsp_opc") @ExcludeMissing fun _tspOpc(): JsonField<String> = tspOpc

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
             * [GoogleWebPushProvisioningResponse].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GoogleWebPushProvisioningResponse]. */
        class Builder internal constructor() {

            private var googleOpc: JsonField<String> = JsonMissing.of()
            private var tspOpc: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                googleWebPushProvisioningResponse: GoogleWebPushProvisioningResponse
            ) = apply {
                googleOpc = googleWebPushProvisioningResponse.googleOpc
                tspOpc = googleWebPushProvisioningResponse.tspOpc
                additionalProperties =
                    googleWebPushProvisioningResponse.additionalProperties.toMutableMap()
            }

            /**
             * A base64 encoded and encrypted payload representing card data for the Google Pay UWPP
             * FPAN flow.
             */
            fun googleOpc(googleOpc: String) = googleOpc(JsonField.of(googleOpc))

            /**
             * Sets [Builder.googleOpc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.googleOpc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun googleOpc(googleOpc: JsonField<String>) = apply { this.googleOpc = googleOpc }

            /**
             * A base64 encoded and encrypted payload representing card data for the Google Pay UWPP
             * tokenization flow.
             */
            fun tspOpc(tspOpc: String) = tspOpc(JsonField.of(tspOpc))

            /**
             * Sets [Builder.tspOpc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tspOpc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tspOpc(tspOpc: JsonField<String>) = apply { this.tspOpc = tspOpc }

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
             * Returns an immutable instance of [GoogleWebPushProvisioningResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GoogleWebPushProvisioningResponse =
                GoogleWebPushProvisioningResponse(
                    googleOpc,
                    tspOpc,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GoogleWebPushProvisioningResponse = apply {
            if (validated) {
                return@apply
            }

            googleOpc()
            tspOpc()
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
            (if (googleOpc.asKnown().isPresent) 1 else 0) +
                (if (tspOpc.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GoogleWebPushProvisioningResponse &&
                googleOpc == other.googleOpc &&
                tspOpc == other.tspOpc &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(googleOpc, tspOpc, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GoogleWebPushProvisioningResponse{googleOpc=$googleOpc, tspOpc=$tspOpc, additionalProperties=$additionalProperties}"
    }
}
