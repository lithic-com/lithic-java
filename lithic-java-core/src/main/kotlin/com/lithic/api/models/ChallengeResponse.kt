// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = ChallengeResponse.Builder::class)
@NoAutoDetect
class ChallengeResponse
private constructor(
    private val token: JsonField<String>,
    private val challengeResponse: JsonField<ChallengeResult>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * Globally unique identifier for the 3DS authentication. This token is sent as part of the
     * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
     * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
     */
    fun token(): String = token.getRequired("token")

    /** Whether the Cardholder has Approved or Declined the issued Challenge */
    fun challengeResponse(): ChallengeResult = challengeResponse.getRequired("challenge_response")

    /**
     * Globally unique identifier for the 3DS authentication. This token is sent as part of the
     * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
     * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Whether the Cardholder has Approved or Declined the issued Challenge */
    @JsonProperty("challenge_response") @ExcludeMissing fun _challengeResponse() = challengeResponse

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChallengeResponse = apply {
        if (!validated) {
            token()
            challengeResponse()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var challengeResponse: JsonField<ChallengeResult> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(challengeResponse: ChallengeResponse) = apply {
            this.token = challengeResponse.token
            this.challengeResponse = challengeResponse.challengeResponse
            additionalProperties(challengeResponse.additionalProperties)
        }

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Globally unique identifier for the 3DS authentication. This token is sent as part of the
         * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
         * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: ChallengeResult) =
            challengeResponse(JsonField.of(challengeResponse))

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        @JsonProperty("challenge_response")
        @ExcludeMissing
        fun challengeResponse(challengeResponse: JsonField<ChallengeResult>) = apply {
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

        fun build(): ChallengeResponse =
            ChallengeResponse(
                token,
                challengeResponse,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChallengeResponse && this.token == other.token && this.challengeResponse == other.challengeResponse && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, challengeResponse, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ChallengeResponse{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"
}
