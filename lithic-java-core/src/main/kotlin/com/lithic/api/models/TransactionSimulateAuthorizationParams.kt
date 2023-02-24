package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TransactionSimulateAuthorizationParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val status: Status?,
    private val merchantAcceptorId: String?,
    private val merchantCurrency: String?,
    private val merchantAmount: Long?,
    private val mcc: String?,
    private val partialApprovalCapable: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

    fun merchantCurrency(): Optional<String> = Optional.ofNullable(merchantCurrency)

    fun merchantAmount(): Optional<Long> = Optional.ofNullable(merchantAmount)

    fun mcc(): Optional<String> = Optional.ofNullable(mcc)

    fun partialApprovalCapable(): Optional<Boolean> = Optional.ofNullable(partialApprovalCapable)

    @JvmSynthetic
    internal fun getBody(): TransactionSimulateAuthorizationBody {
        return TransactionSimulateAuthorizationBody(
            amount,
            descriptor,
            pan,
            status,
            merchantAcceptorId,
            merchantCurrency,
            merchantAmount,
            mcc,
            partialApprovalCapable,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateAuthorizationBody
    internal constructor(
        private val amount: Long?,
        private val descriptor: String?,
        private val pan: String?,
        private val status: Status?,
        private val merchantAcceptorId: String?,
        private val merchantCurrency: String?,
        private val merchantAmount: Long?,
        private val mcc: String?,
        private val partialApprovalCapable: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor") fun descriptor(): String? = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        /**
         * Type of event to simulate.
         *
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         * step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance held on
         * the card, and is most typically seen when a cardholder requests to view a card's balance
         * at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund
         * or credit, meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         * immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
         * the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         * funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        @JsonProperty("status") fun status(): Status? = status

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id") fun merchantAcceptorId(): String? = merchantAcceptorId

        /** 3-digit alphabetic ISO 4217 currency code. */
        @JsonProperty("merchant_currency") fun merchantCurrency(): String? = merchantCurrency

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        @JsonProperty("merchant_amount") fun merchantAmount(): Long? = merchantAmount

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") fun mcc(): String? = mcc

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        @JsonProperty("partial_approval_capable")
        fun partialApprovalCapable(): Boolean? = partialApprovalCapable

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateAuthorizationBody &&
                this.amount == other.amount &&
                this.descriptor == other.descriptor &&
                this.pan == other.pan &&
                this.status == other.status &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.merchantCurrency == other.merchantCurrency &&
                this.merchantAmount == other.merchantAmount &&
                this.mcc == other.mcc &&
                this.partialApprovalCapable == other.partialApprovalCapable &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        descriptor,
                        pan,
                        status,
                        merchantAcceptorId,
                        merchantCurrency,
                        merchantAmount,
                        mcc,
                        partialApprovalCapable,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, status=$status, merchantAcceptorId=$merchantAcceptorId, merchantCurrency=$merchantCurrency, merchantAmount=$merchantAmount, mcc=$mcc, partialApprovalCapable=$partialApprovalCapable, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var status: Status? = null
            private var merchantAcceptorId: String? = null
            private var merchantCurrency: String? = null
            private var merchantAmount: Long? = null
            private var mcc: String? = null
            private var partialApprovalCapable: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                transactionSimulateAuthorizationBody: TransactionSimulateAuthorizationBody
            ) = apply {
                this.amount = transactionSimulateAuthorizationBody.amount
                this.descriptor = transactionSimulateAuthorizationBody.descriptor
                this.pan = transactionSimulateAuthorizationBody.pan
                this.status = transactionSimulateAuthorizationBody.status
                this.merchantAcceptorId = transactionSimulateAuthorizationBody.merchantAcceptorId
                this.merchantCurrency = transactionSimulateAuthorizationBody.merchantCurrency
                this.merchantAmount = transactionSimulateAuthorizationBody.merchantAmount
                this.mcc = transactionSimulateAuthorizationBody.mcc
                this.partialApprovalCapable =
                    transactionSimulateAuthorizationBody.partialApprovalCapable
                additionalProperties(transactionSimulateAuthorizationBody.additionalProperties)
            }

            /**
             * Amount (in cents) to authorize. For credit authorizations and financial credit
             * authorizations, any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction. For balance inquiries, this field must be set to 0.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            /**
             * Type of event to simulate.
             *
             * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent
             * clearing step is required to settle the transaction.
             * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance
             * held on the card, and is most typically seen when a cardholder requests to view a
             * card's balance at an ATM.
             * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a
             * refund or credit, meaning a subsequent clearing step is required to settle the
             * transaction.
             * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit
             * funds immediately (such as an ATM withdrawal), and no subsequent clearing is required
             * to settle the transaction.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to
             * credit funds immediately, and no subsequent clearing is required to settle the
             * transaction.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /** 3-digit alphabetic ISO 4217 currency code. */
            @JsonProperty("merchant_currency")
            fun merchantCurrency(merchantCurrency: String) = apply {
                this.merchantCurrency = merchantCurrency
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
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            @JsonProperty("mcc") fun mcc(mcc: String) = apply { this.mcc = mcc }

            /**
             * Set to true if the terminal is capable of partial approval otherwise false. Partial
             * approval is when part of a transaction is approved and another payment must be used
             * for the remainder.
             */
            @JsonProperty("partial_approval_capable")
            fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
                this.partialApprovalCapable = partialApprovalCapable
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

            fun build(): TransactionSimulateAuthorizationBody =
                TransactionSimulateAuthorizationBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    status,
                    merchantAcceptorId,
                    merchantCurrency,
                    merchantAmount,
                    mcc,
                    partialApprovalCapable,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSimulateAuthorizationParams &&
            this.amount == other.amount &&
            this.descriptor == other.descriptor &&
            this.pan == other.pan &&
            this.status == other.status &&
            this.merchantAcceptorId == other.merchantAcceptorId &&
            this.merchantCurrency == other.merchantCurrency &&
            this.merchantAmount == other.merchantAmount &&
            this.mcc == other.mcc &&
            this.partialApprovalCapable == other.partialApprovalCapable &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            descriptor,
            pan,
            status,
            merchantAcceptorId,
            merchantCurrency,
            merchantAmount,
            mcc,
            partialApprovalCapable,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, status=$status, merchantAcceptorId=$merchantAcceptorId, merchantCurrency=$merchantCurrency, merchantAmount=$merchantAmount, mcc=$mcc, partialApprovalCapable=$partialApprovalCapable, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var status: Status? = null
        private var merchantAcceptorId: String? = null
        private var merchantCurrency: String? = null
        private var merchantAmount: Long? = null
        private var mcc: String? = null
        private var partialApprovalCapable: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateAuthorizationParams: TransactionSimulateAuthorizationParams
        ) = apply {
            this.amount = transactionSimulateAuthorizationParams.amount
            this.descriptor = transactionSimulateAuthorizationParams.descriptor
            this.pan = transactionSimulateAuthorizationParams.pan
            this.status = transactionSimulateAuthorizationParams.status
            this.merchantAcceptorId = transactionSimulateAuthorizationParams.merchantAcceptorId
            this.merchantCurrency = transactionSimulateAuthorizationParams.merchantCurrency
            this.merchantAmount = transactionSimulateAuthorizationParams.merchantAmount
            this.mcc = transactionSimulateAuthorizationParams.mcc
            this.partialApprovalCapable =
                transactionSimulateAuthorizationParams.partialApprovalCapable
            additionalQueryParams(transactionSimulateAuthorizationParams.additionalQueryParams)
            additionalHeaders(transactionSimulateAuthorizationParams.additionalHeaders)
            additionalBodyProperties(
                transactionSimulateAuthorizationParams.additionalBodyProperties
            )
        }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        /**
         * Type of event to simulate.
         *
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         * step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance held on
         * the card, and is most typically seen when a cardholder requests to view a card's balance
         * at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund
         * or credit, meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         * immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
         * the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         * funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        fun status(status: Status) = apply { this.status = status }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /** 3-digit alphabetic ISO 4217 currency code. */
        fun merchantCurrency(merchantCurrency: String) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = apply { this.merchantAmount = merchantAmount }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply { this.mcc = mcc }

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
            this.partialApprovalCapable = partialApprovalCapable
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                status,
                merchantAcceptorId,
                merchantCurrency,
                merchantAmount,
                mcc,
                partialApprovalCapable,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTHORIZATION = Status(JsonField.of("AUTHORIZATION"))

            @JvmField val BALANCE_INQUIRY = Status(JsonField.of("BALANCE_INQUIRY"))

            @JvmField val CREDIT_AUTHORIZATION = Status(JsonField.of("CREDIT_AUTHORIZATION"))

            @JvmField val FINANCIAL_AUTHORIZATION = Status(JsonField.of("FINANCIAL_AUTHORIZATION"))

            @JvmField
            val FINANCIAL_CREDIT_AUTHORIZATION =
                Status(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

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
                else ->
                    throw LithicInvalidDataException(
                        "Unknown TransactionSimulateAuthorizationBody.Status: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
