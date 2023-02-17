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
import java.util.Optional

@JsonDeserialize(builder = SubscriptionRetrieveSecretResponse.Builder::class)
@NoAutoDetect
class SubscriptionRetrieveSecretResponse
private constructor(
    private val key: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun key(): Optional<String> = Optional.ofNullable(key.getNullable("key"))

    @JsonProperty("key") @ExcludeMissing fun _key() = key

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            key()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveSecretResponse &&
            this.key == other.key &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(key, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "SubscriptionRetrieveSecretResponse{key=$key, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var key: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionRetrieveSecretResponse: SubscriptionRetrieveSecretResponse) =
            apply {
                this.key = subscriptionRetrieveSecretResponse.key
                additionalProperties(subscriptionRetrieveSecretResponse.additionalProperties)
            }

        fun key(key: String) = key(JsonField.of(key))

        @JsonProperty("key")
        @ExcludeMissing
        fun key(key: JsonField<String>) = apply { this.key = key }

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
            SubscriptionRetrieveSecretResponse(key, additionalProperties.toUnmodifiable())
    }
}
