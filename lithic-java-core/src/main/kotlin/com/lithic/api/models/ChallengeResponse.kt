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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class ChallengeResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("challenge_response")
    @ExcludeMissing
    private val challengeResponse: JsonField<ChallengeResult> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            token = challengeResponse.token
            this.challengeResponse = challengeResponse.challengeResponse
            additionalProperties = challengeResponse.additionalProperties.toMutableMap()
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

        fun build(): ChallengeResponse =
            ChallengeResponse(
                token,
                challengeResponse,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChallengeResponse && token == other.token && challengeResponse == other.challengeResponse && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, challengeResponse, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChallengeResponse{token=$token, challengeResponse=$challengeResponse, additionalProperties=$additionalProperties}"
}
