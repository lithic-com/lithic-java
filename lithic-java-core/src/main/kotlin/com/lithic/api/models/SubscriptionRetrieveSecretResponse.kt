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
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = SubscriptionRetrieveSecretResponse.Builder::class)
@NoAutoDetect
class SubscriptionRetrieveSecretResponse
private constructor(
    private val secret: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The secret for the event subscription. */
    fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

    /** The secret for the event subscription. */
    @JsonProperty("secret") @ExcludeMissing fun _secret() = secret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SubscriptionRetrieveSecretResponse = apply {
        if (!validated) {
            secret()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionRetrieveSecretResponse: SubscriptionRetrieveSecretResponse) =
            apply {
                this.secret = subscriptionRetrieveSecretResponse.secret
                additionalProperties(subscriptionRetrieveSecretResponse.additionalProperties)
            }

        /** The secret for the event subscription. */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /** The secret for the event subscription. */
        @JsonProperty("secret")
        @ExcludeMissing
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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

        fun build(): SubscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse(secret, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionRetrieveSecretResponse && this.secret == other.secret && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(secret, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SubscriptionRetrieveSecretResponse{secret=$secret, additionalProperties=$additionalProperties}"
}
