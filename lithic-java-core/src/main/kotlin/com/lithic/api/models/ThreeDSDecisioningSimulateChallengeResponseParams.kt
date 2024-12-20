// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import java.util.Objects

class ThreeDSDecisioningSimulateChallengeResponseParams
constructor(
    private val token: String,
    private val challengeResponse: ChallengeResult,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun challengeResponse(): ChallengeResult = challengeResponse

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ThreeDSDecisioningSimulateChallengeResponseBody {
        return ThreeDSDecisioningSimulateChallengeResponseBody(
            token,
            challengeResponse,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ThreeDSDecisioningSimulateChallengeResponseBody.Builder::class)
    @NoAutoDetect
    class ThreeDSDecisioningSimulateChallengeResponseBody
    internal constructor(
        private val token: String,
        private val challengeResponse: ChallengeResult,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        @JsonProperty("token") fun token(): String = token

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        @JsonProperty("challenge_response")
        fun challengeResponse(): ChallengeResult = challengeResponse

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
                token = threeDSDecisioningSimulateChallengeResponseBody.token
                challengeResponse =
                    threeDSDecisioningSimulateChallengeResponseBody.challengeResponse
                additionalProperties =
                    threeDSDecisioningSimulateChallengeResponseBody.additionalProperties
                        .toMutableMap()
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            return /* spotless:off */ other is ThreeDSDecisioningSimulateChallengeResponseBody && token == other.token && challengeResponse == other.challengeResponse && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, challengeResponse, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThreeDSDecisioningSimulateChallengeResponseBody{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var challengeResponse: ChallengeResult? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSDecisioningSimulateChallengeResponseParams:
                ThreeDSDecisioningSimulateChallengeResponseParams
        ) = apply {
            token = threeDSDecisioningSimulateChallengeResponseParams.token
            challengeResponse = threeDSDecisioningSimulateChallengeResponseParams.challengeResponse
            additionalHeaders =
                threeDSDecisioningSimulateChallengeResponseParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                threeDSDecisioningSimulateChallengeResponseParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                threeDSDecisioningSimulateChallengeResponseParams.additionalBodyProperties
                    .toMutableMap()
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

        fun build(): ThreeDSDecisioningSimulateChallengeResponseParams =
            ThreeDSDecisioningSimulateChallengeResponseParams(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(challengeResponse) {
                    "`challengeResponse` is required but was not set"
                },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSDecisioningSimulateChallengeResponseParams && token == other.token && challengeResponse == other.challengeResponse && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(token, challengeResponse, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ThreeDSDecisioningSimulateChallengeResponseParams{token=$token, challengeResponse=$challengeResponse, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
