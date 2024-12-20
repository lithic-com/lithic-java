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
class BacktestCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("backtest_token")
    @ExcludeMissing
    private val backtestToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Auth Rule Backtest Token */
    fun backtestToken(): Optional<String> =
        Optional.ofNullable(backtestToken.getNullable("backtest_token"))

    /** Auth Rule Backtest Token */
    @JsonProperty("backtest_token") @ExcludeMissing fun _backtestToken() = backtestToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BacktestCreateResponse = apply {
        if (!validated) {
            backtestToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var backtestToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backtestCreateResponse: BacktestCreateResponse) = apply {
            backtestToken = backtestCreateResponse.backtestToken
            additionalProperties = backtestCreateResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: String) = backtestToken(JsonField.of(backtestToken))

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: JsonField<String>) = apply {
            this.backtestToken = backtestToken
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

        fun build(): BacktestCreateResponse =
            BacktestCreateResponse(backtestToken, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BacktestCreateResponse && backtestToken == other.backtestToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(backtestToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BacktestCreateResponse{backtestToken=$backtestToken, additionalProperties=$additionalProperties}"
}
