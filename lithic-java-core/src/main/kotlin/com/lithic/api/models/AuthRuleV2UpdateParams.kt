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

class AuthRuleV2UpdateParams
constructor(
    private val authRuleToken: String,
    private val state: State?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun state(): Optional<State> = Optional.ofNullable(state)

    @JvmSynthetic
    internal fun getBody(): AuthRuleV2UpdateBody {
        return AuthRuleV2UpdateBody(state, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AuthRuleV2UpdateBody.Builder::class)
    @NoAutoDetect
    class AuthRuleV2UpdateBody
    internal constructor(
        private val state: State?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        @JsonProperty("state") fun state(): State? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleV2UpdateBody: AuthRuleV2UpdateBody) = apply {
                this.state = authRuleV2UpdateBody.state
                additionalProperties(authRuleV2UpdateBody.additionalProperties)
            }

            /**
             * The desired state of the Auth Rule.
             *
             * Note that only deactivating an Auth Rule through this endpoint is supported at this
             * time. If you need to (re-)activate an Auth Rule the /promote endpoint should be used
             * to promote a draft to the currently active version.
             */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

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

            fun build(): AuthRuleV2UpdateBody =
                AuthRuleV2UpdateBody(state, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2UpdateBody && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(state, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleV2UpdateBody{state=$state, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2UpdateParams && this.authRuleToken == other.authRuleToken && this.state == other.state && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(authRuleToken, state, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AuthRuleV2UpdateParams{authRuleToken=$authRuleToken, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var state: State? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleV2UpdateParams: AuthRuleV2UpdateParams) = apply {
            this.authRuleToken = authRuleV2UpdateParams.authRuleToken
            this.state = authRuleV2UpdateParams.state
            additionalHeaders(authRuleV2UpdateParams.additionalHeaders)
            additionalQueryParams(authRuleV2UpdateParams.additionalQueryParams)
            additionalBodyProperties(authRuleV2UpdateParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /**
         * The desired state of the Auth Rule.
         *
         * Note that only deactivating an Auth Rule through this endpoint is supported at this time.
         * If you need to (re-)activate an Auth Rule the /promote endpoint should be used to promote
         * a draft to the currently active version.
         */
        fun state(state: State) = apply { this.state = state }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): AuthRuleV2UpdateParams =
            AuthRuleV2UpdateParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                state,
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

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INACTIVE = State(JsonField.of("INACTIVE"))

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
    }
}
