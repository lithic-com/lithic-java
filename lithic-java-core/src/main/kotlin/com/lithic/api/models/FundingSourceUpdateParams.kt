package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FundingSourceUpdateParams
constructor(
    private val fundingSourceToken: String,
    private val accountToken: String?,
    private val state: State?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun fundingSourceToken(): String = fundingSourceToken

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun state(): Optional<State> = Optional.ofNullable(state)

    @JvmSynthetic
    internal fun toBody(): FundingSourceUpdateBody =
        FundingSourceUpdateBody(accountToken, state, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> fundingSourceToken
            else -> ""
        }
    }

    @NoAutoDetect
    class FundingSourceUpdateBody
    internal constructor(
        private val accountToken: String?,
        private val state: State?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Only required for multi-account users. Token identifying the account that the bank
         * account will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /**
         * The desired state of the bank account.
         *
         * If a bank account is set to `DELETED`, all cards linked to this account will no longer be
         * associated with it. If there are no other bank accounts in state `ENABLED` on the
         * account, authorizations will not be accepted on the card until a new funding account is
         * added.
         */
        @JsonProperty("state") fun state(): State? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingSourceUpdateBody &&
                accountToken == other.accountToken &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        state,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FundingSourceUpdateBody{accountToken=$accountToken, state=$state, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountToken: String? = null
            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingSourceUpdateBody: FundingSourceUpdateBody) = apply {
                this.accountToken = fundingSourceUpdateBody.accountToken
                this.state = fundingSourceUpdateBody.state
                additionalProperties(fundingSourceUpdateBody.additionalProperties)
            }

            /**
             * Only required for multi-account users. Token identifying the account that the bank
             * account will be associated with. Only applicable if using account holder enrollment.
             * See [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
             * more information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /**
             * The desired state of the bank account.
             *
             * If a bank account is set to `DELETED`, all cards linked to this account will no
             * longer be associated with it. If there are no other bank accounts in state `ENABLED`
             * on the account, authorizations will not be accepted on the card until a new funding
             * account is added.
             */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

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

            fun build(): FundingSourceUpdateBody =
                FundingSourceUpdateBody(
                    accountToken,
                    state,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSourceUpdateParams &&
            fundingSourceToken == other.fundingSourceToken &&
            accountToken == other.accountToken &&
            state == other.state &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            fundingSourceToken,
            accountToken,
            state,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FundingSourceUpdateParams{fundingSourceToken=$fundingSourceToken, accountToken=$accountToken, state=$state, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var fundingSourceToken: String? = null
        private var accountToken: String? = null
        private var state: State? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingSourceUpdateParams: FundingSourceUpdateParams) = apply {
            this.fundingSourceToken = fundingSourceUpdateParams.fundingSourceToken
            this.accountToken = fundingSourceUpdateParams.accountToken
            this.state = fundingSourceUpdateParams.state
            additionalQueryParams(fundingSourceUpdateParams.additionalQueryParams)
            additionalHeaders(fundingSourceUpdateParams.additionalHeaders)
            additionalBodyProperties(fundingSourceUpdateParams.additionalBodyProperties)
        }

        fun fundingSourceToken(fundingSourceToken: String) = apply {
            this.fundingSourceToken = fundingSourceToken
        }

        /**
         * Only required for multi-account users. Token identifying the account that the bank
         * account will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * The desired state of the bank account.
         *
         * If a bank account is set to `DELETED`, all cards linked to this account will no longer be
         * associated with it. If there are no other bank accounts in state `ENABLED` on the
         * account, authorizations will not be accepted on the card until a new funding account is
         * added.
         */
        fun state(state: State) = apply { this.state = state }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FundingSourceUpdateParams =
            FundingSourceUpdateParams(
                fundingSourceToken!!,
                accountToken,
                state,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DELETED = State(JsonField.of("DELETED"))

            @JvmField val ENABLED = State(JsonField.of("ENABLED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            DELETED,
            ENABLED,
        }

        enum class Value {
            DELETED,
            ENABLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DELETED -> Value.DELETED
                ENABLED -> Value.ENABLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DELETED -> Known.DELETED
                ENABLED -> Known.ENABLED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown FundingSourceUpdateBody.State: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
