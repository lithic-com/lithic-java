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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ChallengeResponse
private constructor(
    private val token: JsonField<String>,
    private val challengeResponse: JsonField<ChallengeResult>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("challenge_response")
        @ExcludeMissing
        challengeResponse: JsonField<ChallengeResult> = JsonMissing.of(),
    ) : this(token, challengeResponse, mutableMapOf())

    /**
     * Globally unique identifier for the 3DS authentication. This token is sent as part of the
     * initial 3DS Decisioning Request and as part of the 3DS Challenge Event in the
     * [ThreeDSAuthentication](#/components/schemas/ThreeDSAuthentication) object
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Whether the Cardholder has Approved or Declined the issued Challenge
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challengeResponse(): ChallengeResult = challengeResponse.getRequired("challenge_response")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [challengeResponse].
     *
     * Unlike [challengeResponse], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("challenge_response")
    @ExcludeMissing
    fun _challengeResponse(): JsonField<ChallengeResult> = challengeResponse

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChallengeResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .challengeResponse()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChallengeResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var challengeResponse: JsonField<ChallengeResult>? = null
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
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Whether the Cardholder has Approved or Declined the issued Challenge */
        fun challengeResponse(challengeResponse: ChallengeResult) =
            challengeResponse(JsonField.of(challengeResponse))

        /**
         * Sets [Builder.challengeResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeResponse] with a well-typed [ChallengeResult]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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

        /**
         * Returns an immutable instance of [ChallengeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .challengeResponse()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChallengeResponse =
            ChallengeResponse(
                checkRequired("token", token),
                checkRequired("challengeResponse", challengeResponse),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChallengeResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        challengeResponse().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (challengeResponse.asKnown().getOrNull()?.validity() ?: 0)

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
