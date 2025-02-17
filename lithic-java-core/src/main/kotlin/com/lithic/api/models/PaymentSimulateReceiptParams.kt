// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** Simulates a receipt of a Payment. */
class PaymentSimulateReceiptParams
private constructor(
    private val body: PaymentSimulateReceiptBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Payment token */
    fun token(): String = body.token()

    /** Amount */
    fun amount(): Long = body.amount()

    /** Financial Account Token */
    fun financialAccountToken(): String = body.financialAccountToken()

    /** Receipt Type */
    fun receiptType(): ReceiptType = body.receiptType()

    /** Memo */
    fun memo(): Optional<String> = body.memo()

    /** Payment token */
    fun _token(): JsonField<String> = body._token()

    /** Amount */
    fun _amount(): JsonField<Long> = body._amount()

    /** Financial Account Token */
    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    /** Receipt Type */
    fun _receiptType(): JsonField<ReceiptType> = body._receiptType()

    /** Memo */
    fun _memo(): JsonField<String> = body._memo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): PaymentSimulateReceiptBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PaymentSimulateReceiptBody
    @JsonCreator
    internal constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receipt_type")
        @ExcludeMissing
        private val receiptType: JsonField<ReceiptType> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Payment token */
        fun token(): String = token.getRequired("token")

        /** Amount */
        fun amount(): Long = amount.getRequired("amount")

        /** Financial Account Token */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /** Receipt Type */
        fun receiptType(): ReceiptType = receiptType.getRequired("receipt_type")

        /** Memo */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /** Payment token */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /** Amount */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Financial Account Token */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /** Receipt Type */
        @JsonProperty("receipt_type")
        @ExcludeMissing
        fun _receiptType(): JsonField<ReceiptType> = receiptType

        /** Memo */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentSimulateReceiptBody = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            financialAccountToken()
            receiptType()
            memo()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentSimulateReceiptBody]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var receiptType: JsonField<ReceiptType>? = null
            private var memo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentSimulateReceiptBody: PaymentSimulateReceiptBody) = apply {
                token = paymentSimulateReceiptBody.token
                amount = paymentSimulateReceiptBody.amount
                financialAccountToken = paymentSimulateReceiptBody.financialAccountToken
                receiptType = paymentSimulateReceiptBody.receiptType
                memo = paymentSimulateReceiptBody.memo
                additionalProperties =
                    paymentSimulateReceiptBody.additionalProperties.toMutableMap()
            }

            /** Payment token */
            fun token(token: String) = token(JsonField.of(token))

            /** Payment token */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Amount */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Financial Account Token */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /** Financial Account Token */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /** Receipt Type */
            fun receiptType(receiptType: ReceiptType) = receiptType(JsonField.of(receiptType))

            /** Receipt Type */
            fun receiptType(receiptType: JsonField<ReceiptType>) = apply {
                this.receiptType = receiptType
            }

            /** Memo */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** Memo */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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

            fun build(): PaymentSimulateReceiptBody =
                PaymentSimulateReceiptBody(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("receiptType", receiptType),
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentSimulateReceiptBody && token == other.token && amount == other.amount && financialAccountToken == other.financialAccountToken && receiptType == other.receiptType && memo == other.memo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, financialAccountToken, receiptType, memo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentSimulateReceiptBody{token=$token, amount=$amount, financialAccountToken=$financialAccountToken, receiptType=$receiptType, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentSimulateReceiptParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: PaymentSimulateReceiptBody.Builder = PaymentSimulateReceiptBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentSimulateReceiptParams: PaymentSimulateReceiptParams) = apply {
            body = paymentSimulateReceiptParams.body.toBuilder()
            additionalHeaders = paymentSimulateReceiptParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentSimulateReceiptParams.additionalQueryParams.toBuilder()
        }

        /** Payment token */
        fun token(token: String) = apply { body.token(token) }

        /** Payment token */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /** Amount */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Amount */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Financial Account Token */
        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /** Financial Account Token */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /** Receipt Type */
        fun receiptType(receiptType: ReceiptType) = apply { body.receiptType(receiptType) }

        /** Receipt Type */
        fun receiptType(receiptType: JsonField<ReceiptType>) = apply {
            body.receiptType(receiptType)
        }

        /** Memo */
        fun memo(memo: String) = apply { body.memo(memo) }

        /** Memo */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

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

        fun build(): PaymentSimulateReceiptParams =
            PaymentSimulateReceiptParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Receipt Type */
    class ReceiptType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val RECEIPT_CREDIT = of("RECEIPT_CREDIT")

            @JvmField val RECEIPT_DEBIT = of("RECEIPT_DEBIT")

            @JvmStatic fun of(value: String) = ReceiptType(JsonField.of(value))
        }

        /** An enum containing [ReceiptType]'s known values. */
        enum class Known {
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
        }

        /**
         * An enum containing [ReceiptType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReceiptType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
            /**
             * An enum member indicating that [ReceiptType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                RECEIPT_CREDIT -> Value.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Value.RECEIPT_DEBIT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                RECEIPT_CREDIT -> Known.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Known.RECEIPT_DEBIT
                else -> throw LithicInvalidDataException("Unknown ReceiptType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceiptType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateReceiptParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentSimulateReceiptParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
