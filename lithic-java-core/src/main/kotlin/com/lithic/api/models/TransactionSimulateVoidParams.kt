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
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TransactionSimulateVoidParams
constructor(
    private val amount: Long?,
    private val token: String,
    private val type: Type?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {
    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun token(): String = token

    fun type(): Optional<Type> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun toBody(): TransactionSimulateVoidBody =
        TransactionSimulateVoidBody(amount, token, type, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateVoidBody
    internal constructor(
        private val amount: Long?,
        private val token: String?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {
        private var hashCode: Int = 0

        /**
         * Amount (in cents) to void. Typically this will match the original authorization, but may
         * be less.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token") fun token(): String? = token

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         *
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateVoidBody &&
                amount == other.amount &&
                token == other.token &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateVoidBody{amount=$amount, token=$token, type=$type, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var amount: Long? = null
            private var token: String? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionSimulateVoidBody: TransactionSimulateVoidBody) = apply {
                this.amount = transactionSimulateVoidBody.amount
                this.token = transactionSimulateVoidBody.token
                this.type = transactionSimulateVoidBody.type
                additionalProperties(transactionSimulateVoidBody.additionalProperties)
            }

            /**
             * Amount (in cents) to void. Typically this will match the original authorization, but
             * may be less.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /**
             * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
             *
             * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by
             * Lithic.
             * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
             */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperties(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TransactionSimulateVoidBody =
                TransactionSimulateVoidBody(
                    amount,
                    token!!,
                    type,
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

        return other is TransactionSimulateVoidParams &&
            amount == other.amount &&
            token == other.token &&
            type == other.type &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            token,
            type,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateVoidParams{amount=$amount, token=$token, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var amount: Long? = null
        private var token: String? = null
        private var type: Type? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionSimulateVoidParams: TransactionSimulateVoidParams) = apply {
            this.amount = transactionSimulateVoidParams.amount
            this.token = transactionSimulateVoidParams.token
            this.type = transactionSimulateVoidParams.type
            additionalQueryParams(transactionSimulateVoidParams.additionalQueryParams)
            additionalHeaders(transactionSimulateVoidParams.additionalHeaders)
            additionalBodyProperties(transactionSimulateVoidParams.additionalBodyProperties)
        }

        /**
         * Amount (in cents) to void. Typically this will match the original authorization, but may
         * be less.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply { this.token = token }

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         *
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        fun type(type: Type) = apply { this.type = type }

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

        fun build(): TransactionSimulateVoidParams =
            TransactionSimulateVoidParams(
                amount,
                token!!,
                type,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {
            @JvmField val AUTHORIZATION_EXPIRY = Type(JsonField.of("AUTHORIZATION_EXPIRY"))

            @JvmField val AUTHORIZATION_REVERSAL = Type(JsonField.of("AUTHORIZATION_REVERSAL"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
        }

        enum class Value {
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                else ->
                    throw IllegalArgumentException(
                        "Unknown TransactionSimulateVoidBody.Type: $value"
                    )
            }
    }
}
