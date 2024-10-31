// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class ResponderEndpointCheckStatusParams
constructor(
    private val type: Type,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun type(): Type = type

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.type.let { params.put("type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointCheckStatusParams && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(type, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ResponderEndpointCheckStatusParams{type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var type: Type? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responderEndpointCheckStatusParams: ResponderEndpointCheckStatusParams) =
            apply {
                this.type = responderEndpointCheckStatusParams.type
                additionalQueryParams(responderEndpointCheckStatusParams.additionalQueryParams)
                additionalHeaders(responderEndpointCheckStatusParams.additionalHeaders)
            }

        /** The type of the endpoint. */
        fun type(type: Type) = apply { this.type = type }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): ResponderEndpointCheckStatusParams =
            ResponderEndpointCheckStatusParams(
                checkNotNull(type) { "`type` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
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
