// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardWebProvisionResponse
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
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jws(): Optional<WebPushProvisioningResponseJws> = jws.getOptional("jws")

    /**
     * A unique identifier for the JWS object.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [jws].
     *
     * Unlike [jws], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jws") @ExcludeMissing fun _jws(): JsonField<WebPushProvisioningResponseJws> = jws

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

        /** Returns a mutable builder for constructing an instance of [CardWebProvisionResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardWebProvisionResponse]. */
    class Builder internal constructor() {

        private var jws: JsonField<WebPushProvisioningResponseJws> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardWebProvisionResponse: CardWebProvisionResponse) = apply {
            jws = cardWebProvisionResponse.jws
            state = cardWebProvisionResponse.state
            additionalProperties = cardWebProvisionResponse.additionalProperties.toMutableMap()
        }

        /** JWS object required for handoff to Apple's script. */
        fun jws(jws: WebPushProvisioningResponseJws) = jws(JsonField.of(jws))

        /**
         * Sets [Builder.jws] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jws] with a well-typed [WebPushProvisioningResponseJws]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jws(jws: JsonField<WebPushProvisioningResponseJws>) = apply { this.jws = jws }

        /** A unique identifier for the JWS object. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CardWebProvisionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardWebProvisionResponse =
            CardWebProvisionResponse(jws, state, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CardWebProvisionResponse = apply {
        if (validated) {
            return@apply
        }

        jws().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (jws.asKnown().getOrNull()?.validity() ?: 0) + (if (state.asKnown().isPresent) 1 else 0)

    /** JWS object required for handoff to Apple's script. */
    class WebPushProvisioningResponseJws
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
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<String> = JsonMissing.of(),
            @JsonProperty("protected")
            @ExcludeMissing
            protected_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<String> = JsonMissing.of(),
        ) : this(header, payload, protected_, signature, mutableMapOf())

        /**
         * JWS unprotected headers containing header parameters that aren't integrity-protected by
         * the JWS signature.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun header(): Optional<WebPushProvisioningResponseHeader> = header.getOptional("header")

        /**
         * Base64url encoded JSON object containing the provisioning payload.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payload(): Optional<String> = payload.getOptional("payload")

        /**
         * Base64url encoded JWS protected headers containing the header parameters that are
         * integrity-protected by the JWS signature.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun protected_(): Optional<String> = protected_.getOptional("protected")

        /**
         * Base64url encoded signature of the JWS object.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Unlike [protected_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("protected") @ExcludeMissing fun _protected_(): JsonField<String> = protected_

        /**
         * Returns the raw JSON value of [signature].
         *
         * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signature") @ExcludeMissing fun _signature(): JsonField<String> = signature

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
             * JWS unprotected headers containing header parameters that aren't integrity-protected
             * by the JWS signature.
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
             * You should usually call [Builder.payload] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun protected_(protected_: JsonField<String>) = apply { this.protected_ = protected_ }

            /** Base64url encoded signature of the JWS object. */
            fun signature(signature: String) = signature(JsonField.of(signature))

            /**
             * Sets [Builder.signature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signature] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signature(signature: JsonField<String>) = apply { this.signature = signature }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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
         * JWS unprotected headers containing header parameters that aren't integrity-protected by
         * the JWS signature.
         */
        class WebPushProvisioningResponseHeader
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
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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

                /** The ID for the JWS Public Key of the key pair used to generate the signature. */
                fun kid(kid: String) = kid(JsonField.of(kid))

                /**
                 * Sets [Builder.kid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kid(kid: JsonField<String>) = apply { this.kid = kid }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
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

        return other is CardWebProvisionResponse &&
            jws == other.jws &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(jws, state, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardWebProvisionResponse{jws=$jws, state=$state, additionalProperties=$additionalProperties}"
}
