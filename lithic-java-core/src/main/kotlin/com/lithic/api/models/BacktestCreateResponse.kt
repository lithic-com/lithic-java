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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BacktestCreateResponse
private constructor(
    private val backtestToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backtest_token")
        @ExcludeMissing
        backtestToken: JsonField<String> = JsonMissing.of()
    ) : this(backtestToken, mutableMapOf())

    /**
     * Auth Rule Backtest Token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backtestToken(): Optional<String> = backtestToken.getOptional("backtest_token")

    /**
     * Returns the raw JSON value of [backtestToken].
     *
     * Unlike [backtestToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backtest_token")
    @ExcludeMissing
    fun _backtestToken(): JsonField<String> = backtestToken

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

        /** Returns a mutable builder for constructing an instance of [BacktestCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BacktestCreateResponse]. */
    class Builder internal constructor() {

        private var backtestToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backtestCreateResponse: BacktestCreateResponse) = apply {
            backtestToken = backtestCreateResponse.backtestToken
            additionalProperties = backtestCreateResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Backtest Token */
        fun backtestToken(backtestToken: String) = backtestToken(JsonField.of(backtestToken))

        /**
         * Sets [Builder.backtestToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backtestToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [BacktestCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BacktestCreateResponse =
            BacktestCreateResponse(backtestToken, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BacktestCreateResponse = apply {
        if (validated) {
            return@apply
        }

        backtestToken()
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
    @JvmSynthetic internal fun validity(): Int = (if (backtestToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BacktestCreateResponse &&
            backtestToken == other.backtestToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(backtestToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BacktestCreateResponse{backtestToken=$backtestToken, additionalProperties=$additionalProperties}"
}
