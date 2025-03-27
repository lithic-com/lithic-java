// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.threeds.decisioning

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class DecisioningSimulateChallengeResponse
private constructor(
    private val token: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of()
    ) : this(token, mutableMapOf())

    /**
     * A unique token to reference this transaction with later calls to void or clear the
     * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response to
     * Approve or Decline the authentication
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
         * Returns a mutable builder for constructing an instance of
         * [DecisioningSimulateChallengeResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DecisioningSimulateChallengeResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            decisioningSimulateChallengeResponse: DecisioningSimulateChallengeResponse
        ) = apply {
            token = decisioningSimulateChallengeResponse.token
            additionalProperties =
                decisioningSimulateChallengeResponse.additionalProperties.toMutableMap()
        }

        /**
         * A unique token to reference this transaction with later calls to void or clear the
         * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response
         * to Approve or Decline the authentication
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

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
         * Returns an immutable instance of [DecisioningSimulateChallengeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DecisioningSimulateChallengeResponse =
            DecisioningSimulateChallengeResponse(token, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): DecisioningSimulateChallengeResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DecisioningSimulateChallengeResponse && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DecisioningSimulateChallengeResponse{token=$token, additionalProperties=$additionalProperties}"
}
