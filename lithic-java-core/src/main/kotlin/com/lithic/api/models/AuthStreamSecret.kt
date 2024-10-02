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
import java.util.Optional

@JsonDeserialize(builder = AuthStreamSecret.Builder::class)
@NoAutoDetect
class AuthStreamSecret
private constructor(
    private val secret: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The shared HMAC ASA secret */
    fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

    /** The shared HMAC ASA secret */
    @JsonProperty("secret") @ExcludeMissing fun _secret() = secret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AuthStreamSecret = apply {
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
        internal fun from(authStreamSecret: AuthStreamSecret) = apply {
            this.secret = authStreamSecret.secret
            additionalProperties(authStreamSecret.additionalProperties)
        }

        /** The shared HMAC ASA secret */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /** The shared HMAC ASA secret */
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

        fun build(): AuthStreamSecret =
            AuthStreamSecret(secret, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthStreamSecret &&
            this.secret == other.secret &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(secret, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AuthStreamSecret{secret=$secret, additionalProperties=$additionalProperties}"
}
