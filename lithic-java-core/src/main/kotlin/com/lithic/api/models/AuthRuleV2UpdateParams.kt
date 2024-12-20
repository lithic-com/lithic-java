// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class AuthRuleV2UpdateParams
constructor(
    private val authRuleToken: String,
    private val name: String?,
    private val state: State?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun state(): Optional<State> = Optional.ofNullable(state)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): AuthRuleV2UpdateBody {
        return AuthRuleV2UpdateBody(
            name,
            state,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AuthRuleV2UpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String?,
        @JsonProperty("state") private val state: State?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Auth Rule Name */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        @JsonProperty("state") fun state(): Optional<State> = Optional.ofNullable(state)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleV2UpdateBody: AuthRuleV2UpdateBody) = apply {
                name = authRuleV2UpdateBody.name
                state = authRuleV2UpdateBody.state
                additionalProperties = authRuleV2UpdateBody.additionalProperties.toMutableMap()
            }

            /** Auth Rule Name */
            fun name(name: String) = apply { this.name = name }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            fun state(state: State) = apply { this.state = state }

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

            fun build(): AuthRuleV2UpdateBody =
                AuthRuleV2UpdateBody(
                    name,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2UpdateBody && name == other.name && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthRuleV2UpdateBody{name=$name, state=$state, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var name: String? = null
        private var state: State? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleV2UpdateParams: AuthRuleV2UpdateParams) = apply {
            authRuleToken = authRuleV2UpdateParams.authRuleToken
            name = authRuleV2UpdateParams.name
            state = authRuleV2UpdateParams.state
            additionalHeaders = authRuleV2UpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2UpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                authRuleV2UpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /** Auth Rule Name */
        fun name(name: String) = apply { this.name = name }

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        fun state(state: State) = apply { this.state = state }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AuthRuleV2UpdateParams =
            AuthRuleV2UpdateParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                name,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            INACTIVE,
        }

        enum class Value {
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is AuthRuleV2UpdateParams && authRuleToken == other.authRuleToken && name == other.name && state == other.state && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, name, state, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AuthRuleV2UpdateParams{authRuleToken=$authRuleToken, name=$name, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
