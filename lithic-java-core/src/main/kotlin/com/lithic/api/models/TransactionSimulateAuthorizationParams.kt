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

class TransactionSimulateAuthorizationParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val status: Status?,
    private val merchantCurrency: String?,
    private val merchantAmount: Long?,
    private val partialApprovalCapable: Boolean?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun merchantCurrency(): Optional<String> = Optional.ofNullable(merchantCurrency)

    fun merchantAmount(): Optional<Long> = Optional.ofNullable(merchantAmount)

    fun partialApprovalCapable(): Optional<Boolean> = Optional.ofNullable(partialApprovalCapable)

    @JvmSynthetic
    internal fun toBody(): TransactionSimulateAuthorizationBody =
        TransactionSimulateAuthorizationBody(
            amount,
            descriptor,
            pan,
            status,
            merchantCurrency,
            merchantAmount,
            partialApprovalCapable,
            additionalBodyProperties
        )

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @NoAutoDetect
    class TransactionSimulateAuthorizationBody
    internal constructor(
        private val amount: Long?,
        private val descriptor: String?,
        private val pan: String?,
        private val status: Status?,
        private val merchantCurrency: String?,
        private val merchantAmount: Long?,
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

        /** 3-digit alphabetic ISO 4217 currency code. */
        @JsonProperty("merchant_currency") fun merchantCurrency(): String? = merchantCurrency

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        @JsonProperty("merchant_amount") fun merchantAmount(): Long? = merchantAmount

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
                amount == other.amount &&
                descriptor == other.descriptor &&
                pan == other.pan &&
                status == other.status &&
                merchantCurrency == other.merchantCurrency &&
                merchantAmount == other.merchantAmount &&
                partialApprovalCapable == other.partialApprovalCapable &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        descriptor,
                        pan,
                        status,
                        merchantCurrency,
                        merchantAmount,
                        partialApprovalCapable,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, status=$status, merchantCurrency=$merchantCurrency, merchantAmount=$merchantAmount, partialApprovalCapable=$partialApprovalCapable, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var status: Status? = null
            private var merchantCurrency: String? = null
            private var merchantAmount: Long? = null
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
                this.merchantCurrency = transactionSimulateAuthorizationBody.merchantCurrency
                this.merchantAmount = transactionSimulateAuthorizationBody.merchantAmount
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
                    checkNotNull(amount) { "Property `amount` is required but was not set" },
                    checkNotNull(descriptor) {
                        "Property `descriptor` is required but was not set"
                    },
                    checkNotNull(pan) { "Property `pan` is required but was not set" },
                    status,
                    merchantCurrency,
                    merchantAmount,
                    partialApprovalCapable,
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

        return other is TransactionSimulateAuthorizationParams &&
            amount == other.amount &&
            descriptor == other.descriptor &&
            pan == other.pan &&
            status == other.status &&
            merchantCurrency == other.merchantCurrency &&
            merchantAmount == other.merchantAmount &&
            partialApprovalCapable == other.partialApprovalCapable &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            descriptor,
            pan,
            status,
            merchantCurrency,
            merchantAmount,
            partialApprovalCapable,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, status=$status, merchantCurrency=$merchantCurrency, merchantAmount=$merchantAmount, partialApprovalCapable=$partialApprovalCapable, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var merchantCurrency: String? = null
        private var merchantAmount: Long? = null
        private var partialApprovalCapable: Boolean? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transactionSimulateAuthorizationParams: TransactionSimulateAuthorizationParams
        ) = apply {
            this.amount = transactionSimulateAuthorizationParams.amount
            this.descriptor = transactionSimulateAuthorizationParams.descriptor
            this.pan = transactionSimulateAuthorizationParams.pan
            this.status = transactionSimulateAuthorizationParams.status
            this.merchantCurrency = transactionSimulateAuthorizationParams.merchantCurrency
            this.merchantAmount = transactionSimulateAuthorizationParams.merchantAmount
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
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
            this.partialApprovalCapable = partialApprovalCapable
        }

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

        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                checkNotNull(amount) { "Property `amount` is required but was not set" },
                checkNotNull(descriptor) { "Property `descriptor` is required but was not set" },
                checkNotNull(pan) { "Property `pan` is required but was not set" },
                status,
                merchantCurrency,
                merchantAmount,
                partialApprovalCapable,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
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

            return other is Status && value == other.value
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
