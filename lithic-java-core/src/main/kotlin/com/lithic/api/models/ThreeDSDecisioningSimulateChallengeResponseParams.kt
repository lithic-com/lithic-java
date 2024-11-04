// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects

class ThreeDSDecisioningSimulateChallengeResponseParams
constructor(
    private val token: String,
    private val challengeResponse: ChallengeResult,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun challengeResponse(): ChallengeResult = challengeResponse

    @JvmSynthetic
    internal fun getBody(): ThreeDSDecisioningSimulateChallengeResponseBody {
        return ThreeDSDecisioningSimulateChallengeResponseBody(
            token,
            challengeResponse,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ThreeDSDecisioningSimulateChallengeResponseBody.Builder::class)
    @NoAutoDetect
    class ThreeDSDecisioningSimulateChallengeResponseBody
    internal constructor(
        private val token: String?,
        private val challengeResponse: ChallengeResult?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        @JsonProperty("token") fun token(): String? = token

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        @JsonProperty("challenge_response")
        fun challengeResponse(): ChallengeResult? = challengeResponse

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: String? = null
            private var challengeResponse: ChallengeResult? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                threeDSDecisioningSimulateChallengeResponseBody:
                    ThreeDSDecisioningSimulateChallengeResponseBody
            ) = apply {
                this.token = threeDSDecisioningSimulateChallengeResponseBody.token
                this.challengeResponse =
                    threeDSDecisioningSimulateChallengeResponseBody.challengeResponse
                additionalProperties(
                    threeDSDecisioningSimulateChallengeResponseBody.additionalProperties
                )
            }

            /**
             * Globally unique identifier for the 3DS authentication. This token is sent as part of
             * the initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
             * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
             */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /** Whether the Cardholder has Approved or Declined the issued Challenge */
            @JsonProperty("challenge_response")
            fun challengeResponse(challengeResponse: ChallengeResult) = apply {
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

            fun build(): ThreeDSDecisioningSimulateChallengeResponseBody =
                ThreeDSDecisioningSimulateChallengeResponseBody(
                    checkNotNull(token) { "`token` is required but was not set" },
                    checkNotNull(challengeResponse) {
                        "`challengeResponse` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeDSDecisioningSimulateChallengeResponseBody && this.token == other.token && this.challengeResponse == other.challengeResponse && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(token, challengeResponse, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ThreeDSDecisioningSimulateChallengeResponseBody{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSDecisioningSimulateChallengeResponseParams && this.token == other.token && this.challengeResponse == other.challengeResponse && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(token, challengeResponse, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ThreeDSDecisioningSimulateChallengeResponseParams{token=$token, challengeResponse=$challengeResponse, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var challengeResponse: ChallengeResult? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSDecisioningSimulateChallengeResponseParams:
                ThreeDSDecisioningSimulateChallengeResponseParams
        ) = apply {
            this.token = threeDSDecisioningSimulateChallengeResponseParams.token
            this.challengeResponse =
                threeDSDecisioningSimulateChallengeResponseParams.challengeResponse
            additionalHeaders(threeDSDecisioningSimulateChallengeResponseParams.additionalHeaders)
            additionalQueryParams(
                threeDSDecisioningSimulateChallengeResponseParams.additionalQueryParams
            )
            additionalBodyProperties(
                threeDSDecisioningSimulateChallengeResponseParams.additionalBodyProperties
            )
        }

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(token: String) = apply { this.token = token }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: ChallengeResult) = apply {
            this.challengeResponse = challengeResponse
        }

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

        fun build(): ThreeDSDecisioningSimulateChallengeResponseParams =
            ThreeDSDecisioningSimulateChallengeResponseParams(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(challengeResponse) {
                    "`challengeResponse` is required but was not set"
                },
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
}
