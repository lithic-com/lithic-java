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
import java.util.Optional

@NoAutoDetect
class TokenizationSecret
@JsonCreator
private constructor(
    @JsonProperty("secret")
    @ExcludeMissing
    private val secret: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Tokenization Decisioning HMAC secret */
    fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

    /** The Tokenization Decisioning HMAC secret */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TokenizationSecret = apply {
        if (validated) {
            return@apply
        }

        secret()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationSecret]. */
    class Builder internal constructor() {

        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenizationSecret: TokenizationSecret) = apply {
            secret = tokenizationSecret.secret
            additionalProperties = tokenizationSecret.additionalProperties.toMutableMap()
        }

        /** The Tokenization Decisioning HMAC secret */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /** The Tokenization Decisioning HMAC secret */
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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

        fun build(): TokenizationSecret =
            TokenizationSecret(secret, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationSecret && secret == other.secret && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(secret, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenizationSecret{secret=$secret, additionalProperties=$additionalProperties}"
}
