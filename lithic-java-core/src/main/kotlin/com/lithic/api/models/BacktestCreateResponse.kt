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

@JsonDeserialize(builder = BacktestCreateResponse.Builder::class)
@NoAutoDetect
class BacktestCreateResponse
private constructor(
    private val backtestToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Auth Rule Backtest Token */
    fun backtestToken(): Optional<String> =
        Optional.ofNullable(backtestToken.getNullable("backtest_token"))

    /** Auth Rule Backtest Token */
    @JsonProperty("backtest_token") @ExcludeMissing fun _backtestToken() = backtestToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            this.backtestToken = backtestCreateResponse.backtestToken
            additionalProperties(backtestCreateResponse.additionalProperties)
        }

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: String) = backtestToken(JsonField.of(backtestToken))

        /** Auth Rule Backtest Token */
        @JsonProperty("backtest_token")
        @ExcludeMissing
        fun backtestToken(backtestToken: JsonField<String>) = apply {
            this.backtestToken = backtestToken
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
