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
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardProvisionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val provisioningPayload: JsonField<ProvisioningPayload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("provisioning_payload")
        @ExcludeMissing
        provisioningPayload: JsonField<ProvisioningPayload> = JsonMissing.of()
    ) : this(provisioningPayload, mutableMapOf())

    /**
     * Base64 encoded JSON payload representing a payment card that can be passed to a device's
     * digital wallet. Applies to Google and Samsung Pay wallets.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provisioningPayload(): Optional<ProvisioningPayload> =
        provisioningPayload.getOptional("provisioning_payload")

    /**
     * Returns the raw JSON value of [provisioningPayload].
     *
     * Unlike [provisioningPayload], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provisioning_payload")
    @ExcludeMissing
    fun _provisioningPayload(): JsonField<ProvisioningPayload> = provisioningPayload

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

        /** Returns a mutable builder for constructing an instance of [CardProvisionResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardProvisionResponse]. */
    class Builder internal constructor() {

        private var provisioningPayload: JsonField<ProvisioningPayload> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProvisionResponse: CardProvisionResponse) = apply {
            provisioningPayload = cardProvisionResponse.provisioningPayload
            additionalProperties = cardProvisionResponse.additionalProperties.toMutableMap()
        }

        /**
         * Base64 encoded JSON payload representing a payment card that can be passed to a device's
         * digital wallet. Applies to Google and Samsung Pay wallets.
         */
        fun provisioningPayload(provisioningPayload: ProvisioningPayload) =
            provisioningPayload(JsonField.of(provisioningPayload))

        /**
         * Sets [Builder.provisioningPayload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisioningPayload] with a well-typed
         * [ProvisioningPayload] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun provisioningPayload(provisioningPayload: JsonField<ProvisioningPayload>) = apply {
            this.provisioningPayload = provisioningPayload
        }

        /** Alias for calling [provisioningPayload] with `ProvisioningPayload.ofString(string)`. */
        fun provisioningPayload(string: String) =
            provisioningPayload(ProvisioningPayload.ofString(string))

        /**
         * Alias for calling [provisioningPayload] with
         * `ProvisioningPayload.ofProvisionResponse(provisionResponse)`.
         */
        fun provisioningPayload(provisionResponse: ProvisionResponse) =
            provisioningPayload(ProvisioningPayload.ofProvisionResponse(provisionResponse))

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
         * Returns an immutable instance of [CardProvisionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardProvisionResponse =
            CardProvisionResponse(provisioningPayload, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CardProvisionResponse = apply {
        if (validated) {
            return@apply
        }

        provisioningPayload().ifPresent { it.validate() }
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
    internal fun validity(): Int = (provisioningPayload.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Base64 encoded JSON payload representing a payment card that can be passed to a device's
     * digital wallet. Applies to Google and Samsung Pay wallets.
     */
    @JsonDeserialize(using = ProvisioningPayload.Deserializer::class)
    @JsonSerialize(using = ProvisioningPayload.Serializer::class)
    class ProvisioningPayload
    private constructor(
        private val string: String? = null,
        private val provisionResponse: ProvisionResponse? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Base64 encoded JSON payload representing a payment card that can be passed to a device's
         * digital wallet. Applies to Google and Samsung Pay wallets.
         */
        fun string(): Optional<String> = Optional.ofNullable(string)

        /**
         * Object containing the fields required to add a card to Apple Pay. Applies only to Apple
         * Pay wallet.
         */
        fun provisionResponse(): Optional<ProvisionResponse> =
            Optional.ofNullable(provisionResponse)

        fun isString(): Boolean = string != null

        fun isProvisionResponse(): Boolean = provisionResponse != null

        /**
         * Base64 encoded JSON payload representing a payment card that can be passed to a device's
         * digital wallet. Applies to Google and Samsung Pay wallets.
         */
        fun asString(): String = string.getOrThrow("string")

        /**
         * Object containing the fields required to add a card to Apple Pay. Applies only to Apple
         * Pay wallet.
         */
        fun asProvisionResponse(): ProvisionResponse =
            provisionResponse.getOrThrow("provisionResponse")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                provisionResponse != null -> visitor.visitProvisionResponse(provisionResponse)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ProvisioningPayload = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitProvisionResponse(provisionResponse: ProvisionResponse) {
                        provisionResponse.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitProvisionResponse(provisionResponse: ProvisionResponse) =
                        provisionResponse.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProvisioningPayload &&
                string == other.string &&
                provisionResponse == other.provisionResponse
        }

        override fun hashCode(): Int = Objects.hash(string, provisionResponse)

        override fun toString(): String =
            when {
                string != null -> "ProvisioningPayload{string=$string}"
                provisionResponse != null ->
                    "ProvisioningPayload{provisionResponse=$provisionResponse}"
                _json != null -> "ProvisioningPayload{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ProvisioningPayload")
            }

        companion object {

            /**
             * Base64 encoded JSON payload representing a payment card that can be passed to a
             * device's digital wallet. Applies to Google and Samsung Pay wallets.
             */
            @JvmStatic fun ofString(string: String) = ProvisioningPayload(string = string)

            /**
             * Object containing the fields required to add a card to Apple Pay. Applies only to
             * Apple Pay wallet.
             */
            @JvmStatic
            fun ofProvisionResponse(provisionResponse: ProvisionResponse) =
                ProvisioningPayload(provisionResponse = provisionResponse)
        }

        /**
         * An interface that defines how to map each variant of [ProvisioningPayload] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            /**
             * Base64 encoded JSON payload representing a payment card that can be passed to a
             * device's digital wallet. Applies to Google and Samsung Pay wallets.
             */
            fun visitString(string: String): T

            /**
             * Object containing the fields required to add a card to Apple Pay. Applies only to
             * Apple Pay wallet.
             */
            fun visitProvisionResponse(provisionResponse: ProvisionResponse): T

            /**
             * Maps an unknown variant of [ProvisioningPayload] to a value of type [T].
             *
             * An instance of [ProvisioningPayload] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown ProvisioningPayload: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ProvisioningPayload>(ProvisioningPayload::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ProvisioningPayload {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ProvisionResponse>())?.let {
                                ProvisioningPayload(provisionResponse = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ProvisioningPayload(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> ProvisioningPayload(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<ProvisioningPayload>(ProvisioningPayload::class) {

            override fun serialize(
                value: ProvisioningPayload,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.provisionResponse != null ->
                        generator.writeObject(value.provisionResponse)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ProvisioningPayload")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProvisionResponse &&
            provisioningPayload == other.provisioningPayload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(provisioningPayload, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardProvisionResponse{provisioningPayload=$provisioningPayload, additionalProperties=$additionalProperties}"
}
