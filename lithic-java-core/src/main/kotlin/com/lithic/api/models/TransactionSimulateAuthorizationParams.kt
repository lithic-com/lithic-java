// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class TransactionSimulateAuthorizationParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val mcc: String?,
    private val merchantAcceptorId: String?,
    private val merchantAmount: Long?,
    private val merchantCurrency: String?,
    private val partialApprovalCapable: Boolean?,
    private val pin: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun mcc(): Optional<String> = Optional.ofNullable(mcc)

    fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

    fun merchantAmount(): Optional<Long> = Optional.ofNullable(merchantAmount)

    fun merchantCurrency(): Optional<String> = Optional.ofNullable(merchantCurrency)

    fun partialApprovalCapable(): Optional<Boolean> = Optional.ofNullable(partialApprovalCapable)

    fun pin(): Optional<String> = Optional.ofNullable(pin)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateAuthorizationBody {
        return TransactionSimulateAuthorizationBody(
            amount,
            descriptor,
            pan,
            mcc,
            merchantAcceptorId,
            merchantAmount,
            merchantCurrency,
            partialApprovalCapable,
            pin,
            status,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = TransactionSimulateAuthorizationBody.Builder::class)
    @NoAutoDetect
    class TransactionSimulateAuthorizationBody
    internal constructor(
        private val amount: Long,
        private val descriptor: String,
        private val pan: String,
        private val mcc: String?,
        private val merchantAcceptorId: String?,
        private val merchantAmount: Long?,
        private val merchantCurrency: String?,
        private val partialApprovalCapable: Boolean?,
        private val pin: String?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        @JsonProperty("amount") fun amount(): Long = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor") fun descriptor(): String = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String = pan

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") fun mcc(): Optional<String> = Optional.ofNullable(mcc)

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id")
        fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        @JsonProperty("merchant_amount")
        fun merchantAmount(): Optional<Long> = Optional.ofNullable(merchantAmount)

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        @JsonProperty("merchant_currency")
        fun merchantCurrency(): Optional<String> = Optional.ofNullable(merchantCurrency)

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        @JsonProperty("partial_approval_capable")
        fun partialApprovalCapable(): Optional<Boolean> =
            Optional.ofNullable(partialApprovalCapable)

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        @JsonProperty("pin") fun pin(): Optional<String> = Optional.ofNullable(pin)

        /**
         * Type of event to simulate.
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
         *   most often observed when a cardholder requests to view a card's balance at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
         *   meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var mcc: String? = null
            private var merchantAcceptorId: String? = null
            private var merchantAmount: Long? = null
            private var merchantCurrency: String? = null
            private var partialApprovalCapable: Boolean? = null
            private var pin: String? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                transactionSimulateAuthorizationBody: TransactionSimulateAuthorizationBody
            ) = apply {
                amount = transactionSimulateAuthorizationBody.amount
                descriptor = transactionSimulateAuthorizationBody.descriptor
                pan = transactionSimulateAuthorizationBody.pan
                mcc = transactionSimulateAuthorizationBody.mcc
                merchantAcceptorId = transactionSimulateAuthorizationBody.merchantAcceptorId
                merchantAmount = transactionSimulateAuthorizationBody.merchantAmount
                merchantCurrency = transactionSimulateAuthorizationBody.merchantCurrency
                partialApprovalCapable = transactionSimulateAuthorizationBody.partialApprovalCapable
                pin = transactionSimulateAuthorizationBody.pin
                status = transactionSimulateAuthorizationBody.status
                additionalProperties =
                    transactionSimulateAuthorizationBody.additionalProperties.toMutableMap()
            }

            /**
             * Amount (in cents) to authorize. For credit authorizations and financial credit
             * authorizations, any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will result in a -100
             * amount in the transaction. For balance inquiries, this field must be set to 0.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            @JsonProperty("mcc") fun mcc(mcc: String) = apply { this.mcc = mcc }

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * Amount of the transaction to be simulated in currency specified in merchant_currency,
             * including any acquirer fees.
             */
            @JsonProperty("merchant_amount")
            fun merchantAmount(merchantAmount: Long) = apply {
                this.merchantAmount = merchantAmount
            }

            /**
             * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
             * and defaults to GBP if another ISO 4217 code is provided
             */
            @JsonProperty("merchant_currency")
            fun merchantCurrency(merchantCurrency: String) = apply {
                this.merchantCurrency = merchantCurrency
            }

            /**
             * Set to true if the terminal is capable of partial approval otherwise false. Partial
             * approval is when part of a transaction is approved and another payment must be used
             * for the remainder.
             */
            @JsonProperty("partial_approval_capable")
            fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
                this.partialApprovalCapable = partialApprovalCapable
            }

            /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
            @JsonProperty("pin") fun pin(pin: String) = apply { this.pin = pin }

            /**
             * Type of event to simulate.
             * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent
             *   clearing step is required to settle the transaction.
             * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card,
             *   and is most often observed when a cardholder requests to view a card's balance at
             *   an ATM.
             * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a
             *   refund, meaning a subsequent clearing step is required to settle the transaction.
             * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit
             *   funds immediately (such as an ATM withdrawal), and no subsequent clearing is
             *   required to settle the transaction.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to
             *   credit funds immediately, and no subsequent clearing is required to settle the
             *   transaction.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): TransactionSimulateAuthorizationBody =
                TransactionSimulateAuthorizationBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    mcc,
                    merchantAcceptorId,
                    merchantAmount,
                    merchantCurrency,
                    partialApprovalCapable,
                    pin,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionSimulateAuthorizationBody && amount == other.amount && descriptor == other.descriptor && pan == other.pan && mcc == other.mcc && merchantAcceptorId == other.merchantAcceptorId && merchantAmount == other.merchantAmount && merchantCurrency == other.merchantCurrency && partialApprovalCapable == other.partialApprovalCapable && pin == other.pin && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, descriptor, pan, mcc, merchantAcceptorId, merchantAmount, merchantCurrency, partialApprovalCapable, pin, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionSimulateAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, partialApprovalCapable=$partialApprovalCapable, pin=$pin, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var mcc: String? = null
        private var merchantAcceptorId: String? = null
        private var merchantAmount: Long? = null
        private var merchantCurrency: String? = null
        private var partialApprovalCapable: Boolean? = null
        private var pin: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateAuthorizationParams: TransactionSimulateAuthorizationParams
        ) = apply {
            amount = transactionSimulateAuthorizationParams.amount
            descriptor = transactionSimulateAuthorizationParams.descriptor
            pan = transactionSimulateAuthorizationParams.pan
            mcc = transactionSimulateAuthorizationParams.mcc
            merchantAcceptorId = transactionSimulateAuthorizationParams.merchantAcceptorId
            merchantAmount = transactionSimulateAuthorizationParams.merchantAmount
            merchantCurrency = transactionSimulateAuthorizationParams.merchantCurrency
            partialApprovalCapable = transactionSimulateAuthorizationParams.partialApprovalCapable
            pin = transactionSimulateAuthorizationParams.pin
            status = transactionSimulateAuthorizationParams.status
            additionalHeaders = transactionSimulateAuthorizationParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionSimulateAuthorizationParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                transactionSimulateAuthorizationParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply { this.mcc = mcc }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = apply { this.merchantAmount = merchantAmount }

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(merchantCurrency: String) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
            this.partialApprovalCapable = partialApprovalCapable
        }

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        fun pin(pin: String) = apply { this.pin = pin }

        /**
         * Type of event to simulate.
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
         *   most often observed when a cardholder requests to view a card's balance at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
         *   meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        fun status(status: Status) = apply { this.status = status }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                mcc,
                merchantAcceptorId,
                merchantAmount,
                merchantCurrency,
                partialApprovalCapable,
                pin,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AUTHORIZATION = of("AUTHORIZATION")

            @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

            @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

            @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

            @JvmField val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
        }

        enum class Value {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZATION -> Value.AUTHORIZATION
                BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZATION -> Known.AUTHORIZATION
                BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateAuthorizationParams && amount == other.amount && descriptor == other.descriptor && pan == other.pan && mcc == other.mcc && merchantAcceptorId == other.merchantAcceptorId && merchantAmount == other.merchantAmount && merchantCurrency == other.merchantCurrency && partialApprovalCapable == other.partialApprovalCapable && pin == other.pin && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, descriptor, pan, mcc, merchantAcceptorId, merchantAmount, merchantCurrency, partialApprovalCapable, pin, status, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "TransactionSimulateAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, partialApprovalCapable=$partialApprovalCapable, pin=$pin, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
