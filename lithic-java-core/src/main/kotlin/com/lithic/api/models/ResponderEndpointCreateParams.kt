// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class ResponderEndpointCreateParams
constructor(
    private val type: Type?,
    private val url: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun url(): Optional<String> = Optional.ofNullable(url)

    @JvmSynthetic
    internal fun getBody(): ResponderEndpointCreateBody {
        return ResponderEndpointCreateBody(
            type,
            url,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ResponderEndpointCreateBody.Builder::class)
    @NoAutoDetect
    class ResponderEndpointCreateBody
    internal constructor(
        private val type: Type?,
        private val url: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of the endpoint. */
        @JsonProperty("type") fun type(): Type? = type

        /** The URL for the responder endpoint (must be http(s)). */
        @JsonProperty("url") fun url(): String? = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var url: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(responderEndpointCreateBody: ResponderEndpointCreateBody) = apply {
                this.type = responderEndpointCreateBody.type
                this.url = responderEndpointCreateBody.url
                additionalProperties(responderEndpointCreateBody.additionalProperties)
            }

            /** The type of the endpoint. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The URL for the responder endpoint (must be http(s)). */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ResponderEndpointCreateBody =
                ResponderEndpointCreateBody(
                    type,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponderEndpointCreateBody && this.type == other.type && this.url == other.url && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, url, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ResponderEndpointCreateBody{type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointCreateParams && this.type == other.type && this.url == other.url && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(type, url, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ResponderEndpointCreateParams{type=$type, url=$url, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var type: Type? = null
        private var url: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointCreateParams: ResponderEndpointCreateParams) = apply {
            this.type = responderEndpointCreateParams.type
            this.url = responderEndpointCreateParams.url
            additionalHeaders(responderEndpointCreateParams.additionalHeaders)
            additionalQueryParams(responderEndpointCreateParams.additionalQueryParams)
            additionalBodyProperties(responderEndpointCreateParams.additionalBodyProperties)
        }

        /** The type of the endpoint. */
        fun type(type: Type) = apply { this.type = type }

        /** The URL for the responder endpoint (must be http(s)). */
        fun url(url: String) = apply { this.url = url }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ResponderEndpointCreateParams =
            ResponderEndpointCreateParams(
                type,
                url,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTH_STREAM_ACCESS = Type(JsonField.of("AUTH_STREAM_ACCESS"))

            @JvmField val THREE_DS_DECISIONING = Type(JsonField.of("THREE_DS_DECISIONING"))

            @JvmField val TOKENIZATION_DECISIONING = Type(JsonField.of("TOKENIZATION_DECISIONING"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            AUTH_STREAM_ACCESS,
            THREE_DS_DECISIONING,
            TOKENIZATION_DECISIONING,
        }

        enum class Value {
            AUTH_STREAM_ACCESS,
            THREE_DS_DECISIONING,
            TOKENIZATION_DECISIONING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTH_STREAM_ACCESS -> Value.AUTH_STREAM_ACCESS
                THREE_DS_DECISIONING -> Value.THREE_DS_DECISIONING
                TOKENIZATION_DECISIONING -> Value.TOKENIZATION_DECISIONING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTH_STREAM_ACCESS -> Known.AUTH_STREAM_ACCESS
                THREE_DS_DECISIONING -> Known.THREE_DS_DECISIONING
                TOKENIZATION_DECISIONING -> Known.TOKENIZATION_DECISIONING
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
