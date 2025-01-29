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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects

/** Card program's response to a 3DS Challenge Request (CReq) */
class ThreeDSDecisioningChallengeResponseParams
private constructor(
    private val body: ThreeDSDecisioningChallengeResponseBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Globally unique identifier for the 3DS authentication. This token is sent as part of the
     * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
     * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
     */
    fun token(): String = body.token()

    /** Whether the Cardholder has Approved or Declined the issued Challenge */
    fun challengeResponse(): ChallengeResult = body.challengeResponse()

    /**
     * Globally unique identifier for the 3DS authentication. This token is sent as part of the
     * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
     * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
     */
    fun _token(): JsonField<String> = body._token()

    /** Whether the Cardholder has Approved or Declined the issued Challenge */
    fun _challengeResponse(): JsonField<ChallengeResult> = body._challengeResponse()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ThreeDSDecisioningChallengeResponseBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ThreeDSDecisioningChallengeResponseBody
    @JsonCreator
    internal constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("challenge_response")
        @ExcludeMissing
        private val challengeResponse: JsonField<ChallengeResult> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(): String = token.getRequired("token")

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(): ChallengeResult =
            challengeResponse.getRequired("challenge_response")

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        @JsonProperty("challenge_response")
        @ExcludeMissing
        fun _challengeResponse(): JsonField<ChallengeResult> = challengeResponse

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThreeDSDecisioningChallengeResponseBody = apply {
            if (validated) {
                return@apply
            }

            token()
            challengeResponse()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThreeDSDecisioningChallengeResponseBody]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var challengeResponse: JsonField<ChallengeResult>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                threeDSDecisioningChallengeResponseBody: ThreeDSDecisioningChallengeResponseBody
            ) = apply {
                token = threeDSDecisioningChallengeResponseBody.token
                challengeResponse = threeDSDecisioningChallengeResponseBody.challengeResponse
                additionalProperties =
                    threeDSDecisioningChallengeResponseBody.additionalProperties.toMutableMap()
            }

            /**
             * Globally unique identifier for the 3DS authentication. This token is sent as part of
             * the initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
             * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
             */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Globally unique identifier for the 3DS authentication. This token is sent as part of
             * the initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
             * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Whether the Cardholder has Approved or Declined the issued Challenge */
            fun challengeResponse(challengeResponse: ChallengeResult) =
                challengeResponse(JsonField.of(challengeResponse))

            /** Whether the Cardholder has Approved or Declined the issued Challenge */
            fun challengeResponse(challengeResponse: JsonField<ChallengeResult>) = apply {
                this.challengeResponse = challengeResponse
            }

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

            fun build(): ThreeDSDecisioningChallengeResponseBody =
                ThreeDSDecisioningChallengeResponseBody(
                    checkRequired("token", token),
                    checkRequired("challengeResponse", challengeResponse),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeDSDecisioningChallengeResponseBody && token == other.token && challengeResponse == other.challengeResponse && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, challengeResponse, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThreeDSDecisioningChallengeResponseBody{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreeDSDecisioningChallengeResponseParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ThreeDSDecisioningChallengeResponseBody.Builder =
            ThreeDSDecisioningChallengeResponseBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            threeDSDecisioningChallengeResponseParams: ThreeDSDecisioningChallengeResponseParams
        ) = apply {
            body = threeDSDecisioningChallengeResponseParams.body.toBuilder()
            additionalHeaders =
                threeDSDecisioningChallengeResponseParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                threeDSDecisioningChallengeResponseParams.additionalQueryParams.toBuilder()
        }

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(token: String) = apply { body.token(token) }

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: ChallengeResult) = apply {
            body.challengeResponse(challengeResponse)
        }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: JsonField<ChallengeResult>) = apply {
            body.challengeResponse(challengeResponse)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): ThreeDSDecisioningChallengeResponseParams =
            ThreeDSDecisioningChallengeResponseParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSDecisioningChallengeResponseParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ThreeDSDecisioningChallengeResponseParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
