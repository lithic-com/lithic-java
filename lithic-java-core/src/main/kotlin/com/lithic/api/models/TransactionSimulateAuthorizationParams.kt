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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Simulates an authorization request from the card network as if it came from a merchant acquirer.
 * If you are configured for ASA, simulating authorizations requires your ASA client to be set up
 * properly, i.e. be able to respond to the ASA request with a valid JSON. For users that are not
 * configured for ASA, a daily transaction limit of $5000 USD is applied by default. You can update
 * this limit via the [update account](https://docs.lithic.com/reference/patchaccountbytoken)
 * endpoint.
 */
class TransactionSimulateAuthorizationParams
private constructor(
    private val body: TransactionSimulateAuthorizationBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Amount (in cents) to authorize. For credit authorizations and financial credit
     * authorizations, any value entered will be converted into a negative amount in the simulated
     * transaction. For example, entering 100 in this field will result in a -100 amount in the
     * transaction. For balance inquiries, this field must be set to 0.
     */
    fun amount(): Long = body.amount()

    /** Merchant descriptor. */
    fun descriptor(): String = body.descriptor()

    /** Sixteen digit card number. */
    fun pan(): String = body.pan()

    /**
     * Merchant category code for the transaction to be simulated. A four-digit number listed in
     * ISO 18245. Supported merchant category codes can be found
     * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
     */
    fun mcc(): Optional<String> = body.mcc()

    /** Unique identifier to identify the payment card acceptor. */
    fun merchantAcceptorId(): Optional<String> = body.merchantAcceptorId()

    /**
     * Amount of the transaction to be simulated in currency specified in merchant_currency,
     * including any acquirer fees.
     */
    fun merchantAmount(): Optional<Long> = body.merchantAmount()

    /**
     * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
     * defaults to GBP if another ISO 4217 code is provided
     */
    fun merchantCurrency(): Optional<String> = body.merchantCurrency()

    /**
     * Set to true if the terminal is capable of partial approval otherwise false. Partial approval
     * is when part of a transaction is approved and another payment must be used for the remainder.
     */
    fun partialApprovalCapable(): Optional<Boolean> = body.partialApprovalCapable()

    /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
    fun pin(): Optional<String> = body.pin()

    /**
     * Type of event to simulate.
     * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
     *   step is required to settle the transaction.
     * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
     *   most often observed when a cardholder requests to view a card's balance at an ATM.
     * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
     *   meaning a subsequent clearing step is required to settle the transaction.
     * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
     *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
     *   the transaction.
     * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
     *   funds immediately, and no subsequent clearing is required to settle the transaction.
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Amount (in cents) to authorize. For credit authorizations and financial credit
     * authorizations, any value entered will be converted into a negative amount in the simulated
     * transaction. For example, entering 100 in this field will result in a -100 amount in the
     * transaction. For balance inquiries, this field must be set to 0.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /** Merchant descriptor. */
    fun _descriptor(): JsonField<String> = body._descriptor()

    /** Sixteen digit card number. */
    fun _pan(): JsonField<String> = body._pan()

    /**
     * Merchant category code for the transaction to be simulated. A four-digit number listed in
     * ISO 18245. Supported merchant category codes can be found
     * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
     */
    fun _mcc(): JsonField<String> = body._mcc()

    /** Unique identifier to identify the payment card acceptor. */
    fun _merchantAcceptorId(): JsonField<String> = body._merchantAcceptorId()

    /**
     * Amount of the transaction to be simulated in currency specified in merchant_currency,
     * including any acquirer fees.
     */
    fun _merchantAmount(): JsonField<Long> = body._merchantAmount()

    /**
     * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
     * defaults to GBP if another ISO 4217 code is provided
     */
    fun _merchantCurrency(): JsonField<String> = body._merchantCurrency()

    /**
     * Set to true if the terminal is capable of partial approval otherwise false. Partial approval
     * is when part of a transaction is approved and another payment must be used for the remainder.
     */
    fun _partialApprovalCapable(): JsonField<Boolean> = body._partialApprovalCapable()

    /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
    fun _pin(): JsonField<String> = body._pin()

    /**
     * Type of event to simulate.
     * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
     *   step is required to settle the transaction.
     * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
     *   most often observed when a cardholder requests to view a card's balance at an ATM.
     * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
     *   meaning a subsequent clearing step is required to settle the transaction.
     * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
     *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
     *   the transaction.
     * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
     *   funds immediately, and no subsequent clearing is required to settle the transaction.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): TransactionSimulateAuthorizationBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransactionSimulateAuthorizationBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        private val descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan") @ExcludeMissing private val pan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing private val mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        private val merchantAcceptorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        private val merchantAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        private val merchantCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partial_approval_capable")
        @ExcludeMissing
        private val partialApprovalCapable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing private val pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Merchant descriptor. */
        fun descriptor(): String = descriptor.getRequired("descriptor")

        /** Sixteen digit card number. */
        fun pan(): String = pan.getRequired("pan")

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(): Optional<String> = Optional.ofNullable(mcc.getNullable("mcc"))

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(): Optional<String> =
            Optional.ofNullable(merchantAcceptorId.getNullable("merchant_acceptor_id"))

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(): Optional<Long> =
            Optional.ofNullable(merchantAmount.getNullable("merchant_amount"))

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(): Optional<String> =
            Optional.ofNullable(merchantCurrency.getNullable("merchant_currency"))

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(): Optional<Boolean> =
            Optional.ofNullable(partialApprovalCapable.getNullable("partial_approval_capable"))

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        fun pin(): Optional<String> = Optional.ofNullable(pin.getNullable("pin"))

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
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        fun _merchantAmount(): JsonField<Long> = merchantAmount

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        fun _merchantCurrency(): JsonField<String> = merchantCurrency

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        @JsonProperty("partial_approval_capable")
        @ExcludeMissing
        fun _partialApprovalCapable(): JsonField<Boolean> = partialApprovalCapable

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

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
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionSimulateAuthorizationBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            descriptor()
            pan()
            mcc()
            merchantAcceptorId()
            merchantAmount()
            merchantCurrency()
            partialApprovalCapable()
            pin()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionSimulateAuthorizationBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var descriptor: JsonField<String>? = null
            private var pan: JsonField<String>? = null
            private var mcc: JsonField<String> = JsonMissing.of()
            private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
            private var merchantAmount: JsonField<Long> = JsonMissing.of()
            private var merchantCurrency: JsonField<String> = JsonMissing.of()
            private var partialApprovalCapable: JsonField<Boolean> = JsonMissing.of()
            private var pin: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
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
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount (in cents) to authorize. For credit authorizations and financial credit
             * authorizations, any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will result in a -100
             * amount in the transaction. For balance inquiries, this field must be set to 0.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Merchant descriptor. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /** Merchant descriptor. */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            fun pan(pan: String) = pan(JsonField.of(pan))

            /** Sixteen digit card number. */
            fun pan(pan: JsonField<String>) = apply { this.pan = pan }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Unique identifier to identify the payment card acceptor. */
            fun merchantAcceptorId(merchantAcceptorId: String) =
                merchantAcceptorId(JsonField.of(merchantAcceptorId))

            /** Unique identifier to identify the payment card acceptor. */
            fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * Amount of the transaction to be simulated in currency specified in merchant_currency,
             * including any acquirer fees.
             */
            fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

            /**
             * Amount of the transaction to be simulated in currency specified in merchant_currency,
             * including any acquirer fees.
             */
            fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
                this.merchantAmount = merchantAmount
            }

            /**
             * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
             * and defaults to GBP if another ISO 4217 code is provided
             */
            fun merchantCurrency(merchantCurrency: String) =
                merchantCurrency(JsonField.of(merchantCurrency))

            /**
             * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
             * and defaults to GBP if another ISO 4217 code is provided
             */
            fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
                this.merchantCurrency = merchantCurrency
            }

            /**
             * Set to true if the terminal is capable of partial approval otherwise false. Partial
             * approval is when part of a transaction is approved and another payment must be used
             * for the remainder.
             */
            fun partialApprovalCapable(partialApprovalCapable: Boolean) =
                partialApprovalCapable(JsonField.of(partialApprovalCapable))

            /**
             * Set to true if the terminal is capable of partial approval otherwise false. Partial
             * approval is when part of a transaction is approved and another payment must be used
             * for the remainder.
             */
            fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
                this.partialApprovalCapable = partialApprovalCapable
            }

            /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
            fun pin(pin: String) = pin(JsonField.of(pin))

            /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
            fun pin(pin: JsonField<String>) = apply { this.pin = pin }

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
            fun status(status: Status) = status(JsonField.of(status))

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
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): TransactionSimulateAuthorizationBody =
                TransactionSimulateAuthorizationBody(
                    checkRequired("amount", amount),
                    checkRequired("descriptor", descriptor),
                    checkRequired("pan", pan),
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

    /** A builder for [TransactionSimulateAuthorizationParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: TransactionSimulateAuthorizationBody.Builder =
            TransactionSimulateAuthorizationBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionSimulateAuthorizationParams: TransactionSimulateAuthorizationParams
        ) = apply {
            body = transactionSimulateAuthorizationParams.body.toBuilder()
            additionalHeaders = transactionSimulateAuthorizationParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionSimulateAuthorizationParams.additionalQueryParams.toBuilder()
        }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { body.descriptor(descriptor) }

        /** Merchant descriptor. */
        fun descriptor(descriptor: JsonField<String>) = apply { body.descriptor(descriptor) }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /** Sixteen digit card number. */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply { body.mcc(mcc) }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: JsonField<String>) = apply { body.mcc(mcc) }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = apply { body.merchantAmount(merchantAmount) }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            body.merchantAmount(merchantAmount)
        }

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(merchantCurrency: String) = apply {
            body.merchantCurrency(merchantCurrency)
        }

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
            body.merchantCurrency(merchantCurrency)
        }

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
            body.partialApprovalCapable(partialApprovalCapable)
        }

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
            body.partialApprovalCapable(partialApprovalCapable)
        }

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        fun pin(pin: String) = apply { body.pin(pin) }

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        fun pin(pin: JsonField<String>) = apply { body.pin(pin) }

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
        fun status(status: Status) = apply { body.status(status) }

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
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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

        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Type of event to simulate.
     * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
     *   step is required to settle the transaction.
     * - `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
     *   most often observed when a cardholder requests to view a card's balance at an ATM.
     * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
     *   meaning a subsequent clearing step is required to settle the transaction.
     * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
     *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
     *   the transaction.
     * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
     *   funds immediately, and no subsequent clearing is required to settle the transaction.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val AUTHORIZATION = of("AUTHORIZATION")

            @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

            @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

            @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

            @JvmField val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                AUTHORIZATION -> Value.AUTHORIZATION
                BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
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

        return /* spotless:off */ other is TransactionSimulateAuthorizationParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionSimulateAuthorizationParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
