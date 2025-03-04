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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Clears an existing authorization, either debit or credit. After this event, the transaction
 * transitions from `PENDING` to `SETTLED` status.
 *
 * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
 * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
 */
class TransactionSimulateClearingParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The transaction token returned from the /v1/simulate/authorize response. */
    fun token(): String = body.token()

    /**
     * Amount (in cents) to clear. Typically this will match the amount in the original
     * authorization, but can be higher or lower. The sign of this amount will automatically match
     * the sign of the original authorization's amount. For example, entering 100 in this field will
     * result in a -100 amount in the transaction, if the original authorization is a credit
     * authorization.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    fun amount(): Optional<Long> = body.amount()

    /** The transaction token returned from the /v1/simulate/authorize response. */
    fun _token(): JsonField<String> = body._token()

    /**
     * Amount (in cents) to clear. Typically this will match the amount in the original
     * authorization, but can be higher or lower. The sign of this amount will automatically match
     * the sign of the original authorization's amount. For example, entering 100 in this field will
     * result in a -100 amount in the transaction, if the original authorization is a credit
     * authorization.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    fun _amount(): JsonField<Long> = body._amount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(): String = token.getRequired("token")

        /**
         * Amount (in cents) to clear. Typically this will match the amount in the original
         * authorization, but can be higher or lower. The sign of this amount will automatically
         * match the sign of the original authorization's amount. For example, entering 100 in this
         * field will result in a -100 amount in the transaction, if the original authorization is a
         * credit authorization.
         *
         * If `amount` is not set, the full amount of the transaction will be cleared. Transactions
         * that have already cleared, either partially or fully, cannot be cleared again using this
         * endpoint.
         */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Amount (in cents) to clear. Typically this will match the amount in the original
         * authorization, but can be higher or lower. The sign of this amount will automatically
         * match the sign of the original authorization's amount. For example, entering 100 in this
         * field will result in a -100 amount in the transaction, if the original authorization is a
         * credit authorization.
         *
         * If `amount` is not set, the full amount of the transaction will be cleared. Transactions
         * that have already cleared, either partially or fully, cannot be cleared again using this
         * endpoint.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .token()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                token = body.token
                amount = body.amount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            fun token(token: String) = token(JsonField.of(token))

            /** The transaction token returned from the /v1/simulate/authorize response. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Amount (in cents) to clear. Typically this will match the amount in the original
             * authorization, but can be higher or lower. The sign of this amount will automatically
             * match the sign of the original authorization's amount. For example, entering 100 in
             * this field will result in a -100 amount in the transaction, if the original
             * authorization is a credit authorization.
             *
             * If `amount` is not set, the full amount of the transaction will be cleared.
             * Transactions that have already cleared, either partially or fully, cannot be cleared
             * again using this endpoint.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount (in cents) to clear. Typically this will match the amount in the original
             * authorization, but can be higher or lower. The sign of this amount will automatically
             * match the sign of the original authorization's amount. For example, entering 100 in
             * this field will result in a -100 amount in the transaction, if the original
             * authorization is a credit authorization.
             *
             * If `amount` is not set, the full amount of the transaction will be cleared.
             * Transactions that have already cleared, either partially or fully, cannot be cleared
             * again using this endpoint.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

            fun build(): Body =
                Body(checkRequired("token", token), amount, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && token == other.token && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{token=$token, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateClearingParams].
         *
         * The following fields are required:
         * ```java
         * .token()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateClearingParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transactionSimulateClearingParams: TransactionSimulateClearingParams) =
            apply {
                body = transactionSimulateClearingParams.body.toBuilder()
                additionalHeaders = transactionSimulateClearingParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    transactionSimulateClearingParams.additionalQueryParams.toBuilder()
            }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply { body.token(token) }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /**
         * Amount (in cents) to clear. Typically this will match the amount in the original
         * authorization, but can be higher or lower. The sign of this amount will automatically
         * match the sign of the original authorization's amount. For example, entering 100 in this
         * field will result in a -100 amount in the transaction, if the original authorization is a
         * credit authorization.
         *
         * If `amount` is not set, the full amount of the transaction will be cleared. Transactions
         * that have already cleared, either partially or fully, cannot be cleared again using this
         * endpoint.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Amount (in cents) to clear. Typically this will match the amount in the original
         * authorization, but can be higher or lower. The sign of this amount will automatically
         * match the sign of the original authorization's amount. For example, entering 100 in this
         * field will result in a -100 amount in the transaction, if the original authorization is a
         * credit authorization.
         *
         * If `amount` is not set, the full amount of the transaction will be cleared. Transactions
         * that have already cleared, either partially or fully, cannot be cleared again using this
         * endpoint.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): TransactionSimulateClearingParams =
            TransactionSimulateClearingParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateClearingParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionSimulateClearingParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
