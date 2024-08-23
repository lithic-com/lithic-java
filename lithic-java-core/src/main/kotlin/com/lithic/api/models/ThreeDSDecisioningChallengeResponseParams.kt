// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class ThreeDSDecisioningChallengeResponseParams
constructor(
    private val token: String,
    private val challengeResponse: ChallengeResponse,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun challengeResponse(): ChallengeResponse = challengeResponse

    @JvmSynthetic
    internal fun getBody(): ThreeDSDecisioningChallengeResponseBody {
        return ThreeDSDecisioningChallengeResponseBody(
            token,
            challengeResponse,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ThreeDSDecisioningChallengeResponseBody.Builder::class)
    @NoAutoDetect
    class ThreeDSDecisioningChallengeResponseBody
    internal constructor(
        private val token: String?,
        private val challengeResponse: ChallengeResponse?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        @JsonProperty("token") fun token(): String? = token

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        @JsonProperty("challenge_response")
        fun challengeResponse(): ChallengeResponse? = challengeResponse

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThreeDSDecisioningChallengeResponseBody &&
                this.token == other.token &&
                this.challengeResponse == other.challengeResponse &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        token,
                        challengeResponse,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ThreeDSDecisioningChallengeResponseBody{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: String? = null
            private var challengeResponse: ChallengeResponse? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                threeDSDecisioningChallengeResponseBody: ThreeDSDecisioningChallengeResponseBody
            ) = apply {
                this.token = threeDSDecisioningChallengeResponseBody.token
                this.challengeResponse = threeDSDecisioningChallengeResponseBody.challengeResponse
                additionalProperties(threeDSDecisioningChallengeResponseBody.additionalProperties)
            }

            /**
             * Globally unique identifier for the 3DS authentication. This token is sent as part of
             * the initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
             * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
             */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /** Whether the Cardholder has Approved or Declined the issued Challenge */
            @JsonProperty("challenge_response")
            fun challengeResponse(challengeResponse: ChallengeResponse) = apply {
                this.challengeResponse = challengeResponse
            }

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

            fun build(): ThreeDSDecisioningChallengeResponseBody =
                ThreeDSDecisioningChallengeResponseBody(
                    checkNotNull(token) { "`token` is required but was not set" },
                    checkNotNull(challengeResponse) {
                        "`challengeResponse` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreeDSDecisioningChallengeResponseParams &&
            this.token == other.token &&
            this.challengeResponse == other.challengeResponse &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            token,
            challengeResponse,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ThreeDSDecisioningChallengeResponseParams{token=$token, challengeResponse=$challengeResponse, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var challengeResponse: ChallengeResponse? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSDecisioningChallengeResponseParams: ThreeDSDecisioningChallengeResponseParams
        ) = apply {
            this.token = threeDSDecisioningChallengeResponseParams.token
            this.challengeResponse = threeDSDecisioningChallengeResponseParams.challengeResponse
            additionalQueryParams(threeDSDecisioningChallengeResponseParams.additionalQueryParams)
            additionalHeaders(threeDSDecisioningChallengeResponseParams.additionalHeaders)
            additionalBodyProperties(
                threeDSDecisioningChallengeResponseParams.additionalBodyProperties
            )
        }

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(token: String) = apply { this.token = token }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: ChallengeResponse) = apply {
            this.challengeResponse = challengeResponse
        }

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

        fun build(): ThreeDSDecisioningChallengeResponseParams =
            ThreeDSDecisioningChallengeResponseParams(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(challengeResponse) {
                    "`challengeResponse` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ChallengeResponse
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChallengeResponse && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVE = ChallengeResponse(JsonField.of("APPROVE"))

            @JvmField
            val DECLINE_BY_CUSTOMER = ChallengeResponse(JsonField.of("DECLINE_BY_CUSTOMER"))

            @JvmStatic fun of(value: String) = ChallengeResponse(JsonField.of(value))
        }

        enum class Known {
            APPROVE,
            DECLINE_BY_CUSTOMER,
        }

        enum class Value {
            APPROVE,
            DECLINE_BY_CUSTOMER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVE -> Value.APPROVE
                DECLINE_BY_CUSTOMER -> Value.DECLINE_BY_CUSTOMER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVE -> Known.APPROVE
                DECLINE_BY_CUSTOMER -> Known.DECLINE_BY_CUSTOMER
                else -> throw LithicInvalidDataException("Unknown ChallengeResponse: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
