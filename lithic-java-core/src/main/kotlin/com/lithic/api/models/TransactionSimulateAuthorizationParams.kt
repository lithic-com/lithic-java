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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Amount (in cents) to authorize. For credit authorizations and financial credit
     * authorizations, any value entered will be converted into a negative amount in the simulated
     * transaction. For example, entering 100 in this field will result in a -100 amount in the
     * transaction. For balance inquiries, this field must be set to 0.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Merchant descriptor.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun descriptor(): String = body.descriptor()

    /**
     * Sixteen digit card number.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pan(): String = body.pan()

    /**
     * Merchant category code for the transaction to be simulated. A four-digit number listed in
     * ISO 18245. Supported merchant category codes can be found
     * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcc(): Optional<String> = body.mcc()

    /**
     * Unique identifier to identify the payment card acceptor.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun merchantAcceptorId(): Optional<String> = body.merchantAcceptorId()

    /**
     * Amount of the transaction to be simulated in currency specified in merchant_currency,
     * including any acquirer fees.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun merchantAmount(): Optional<Long> = body.merchantAmount()

    /**
     * 3-character alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
     * defaults to GBP if another ISO 4217 code is provided
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun merchantCurrency(): Optional<String> = body.merchantCurrency()

    /**
     * Set to true if the terminal is capable of partial approval otherwise false. Partial approval
     * is when part of a transaction is approved and another payment must be used for the remainder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partialApprovalCapable(): Optional<Boolean> = body.partialApprovalCapable()

    /**
     * Simulate entering a PIN. If omitted, PIN check will not be performed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pin(): Optional<String> = body.pin()

    /**
     * Type of event to simulate.
     * * `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
     *   step is required to settle the transaction.
     * * `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
     *   most often observed when a cardholder requests to view a card's balance at an ATM.
     * * `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
     *   meaning a subsequent clearing step is required to settle the transaction.
     * * `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
     *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
     *   the transaction.
     * * `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
     *   funds immediately, and no subsequent clearing is required to settle the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _descriptor(): JsonField<String> = body._descriptor()

    /**
     * Returns the raw JSON value of [pan].
     *
     * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pan(): JsonField<String> = body._pan()

    /**
     * Returns the raw JSON value of [mcc].
     *
     * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mcc(): JsonField<String> = body._mcc()

    /**
     * Returns the raw JSON value of [merchantAcceptorId].
     *
     * Unlike [merchantAcceptorId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantAcceptorId(): JsonField<String> = body._merchantAcceptorId()

    /**
     * Returns the raw JSON value of [merchantAmount].
     *
     * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _merchantAmount(): JsonField<Long> = body._merchantAmount()

    /**
     * Returns the raw JSON value of [merchantCurrency].
     *
     * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantCurrency(): JsonField<String> = body._merchantCurrency()

    /**
     * Returns the raw JSON value of [partialApprovalCapable].
     *
     * Unlike [partialApprovalCapable], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _partialApprovalCapable(): JsonField<Boolean> = body._partialApprovalCapable()

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pin(): JsonField<String> = body._pin()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateAuthorizationParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .descriptor()
         * .pan()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateAuthorizationParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [descriptor]
         * - [pan]
         * - [mcc]
         * - [merchantAcceptorId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { body.descriptor(descriptor) }

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { body.descriptor(descriptor) }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /**
         * Sets [Builder.pan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply { body.mcc(mcc) }

        /**
         * Sets [Builder.mcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcc(mcc: JsonField<String>) = apply { body.mcc(mcc) }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * Sets [Builder.merchantAcceptorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAcceptorId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = apply { body.merchantAmount(merchantAmount) }

        /**
         * Sets [Builder.merchantAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            body.merchantAmount(merchantAmount)
        }

        /**
         * 3-character alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
         * and defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(merchantCurrency: String) = apply {
            body.merchantCurrency(merchantCurrency)
        }

        /**
         * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.partialApprovalCapable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partialApprovalCapable] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
            body.partialApprovalCapable(partialApprovalCapable)
        }

        /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
        fun pin(pin: String) = apply { body.pin(pin) }

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { body.pin(pin) }

        /**
         * Type of event to simulate.
         * * `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * * `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
         *   most often observed when a cardholder requests to view a card's balance at an ATM.
         * * `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
         *   meaning a subsequent clearing step is required to settle the transaction.
         * * `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * * `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [TransactionSimulateAuthorizationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .descriptor()
         * .pan()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val amount: JsonField<Long>,
        private val descriptor: JsonField<String>,
        private val pan: JsonField<String>,
        private val mcc: JsonField<String>,
        private val merchantAcceptorId: JsonField<String>,
        private val merchantAmount: JsonField<Long>,
        private val merchantCurrency: JsonField<String>,
        private val partialApprovalCapable: JsonField<Boolean>,
        private val pin: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("descriptor")
            @ExcludeMissing
            descriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pan") @ExcludeMissing pan: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            merchantAcceptorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_amount")
            @ExcludeMissing
            merchantAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("merchant_currency")
            @ExcludeMissing
            merchantCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            partialApprovalCapable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
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
            mutableMapOf(),
        )

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will result in a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Merchant descriptor.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun descriptor(): String = descriptor.getRequired("descriptor")

        /**
         * Sixteen digit card number.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pan(): String = pan.getRequired("pan")

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcc(): Optional<String> = mcc.getOptional("mcc")

        /**
         * Unique identifier to identify the payment card acceptor.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun merchantAcceptorId(): Optional<String> =
            merchantAcceptorId.getOptional("merchant_acceptor_id")

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun merchantAmount(): Optional<Long> = merchantAmount.getOptional("merchant_amount")

        /**
         * 3-character alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
         * and defaults to GBP if another ISO 4217 code is provided
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun merchantCurrency(): Optional<String> = merchantCurrency.getOptional("merchant_currency")

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun partialApprovalCapable(): Optional<Boolean> =
            partialApprovalCapable.getOptional("partial_approval_capable")

        /**
         * Simulate entering a PIN. If omitted, PIN check will not be performed.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pin(): Optional<String> = pin.getOptional("pin")

        /**
         * Type of event to simulate.
         * * `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * * `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
         *   most often observed when a cardholder requests to view a card's balance at an ATM.
         * * `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
         *   meaning a subsequent clearing step is required to settle the transaction.
         * * `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * * `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [pan].
         *
         * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [merchantAcceptorId].
         *
         * Unlike [merchantAcceptorId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

        /**
         * Returns the raw JSON value of [merchantAmount].
         *
         * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        fun _merchantAmount(): JsonField<Long> = merchantAmount

        /**
         * Returns the raw JSON value of [merchantCurrency].
         *
         * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        fun _merchantCurrency(): JsonField<String> = merchantCurrency

        /**
         * Returns the raw JSON value of [partialApprovalCapable].
         *
         * Unlike [partialApprovalCapable], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("partial_approval_capable")
        @ExcludeMissing
        fun _partialApprovalCapable(): JsonField<Boolean> = partialApprovalCapable

        /**
         * Returns the raw JSON value of [pin].
         *
         * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .descriptor()
             * .pan()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            internal fun from(body: Body) = apply {
                amount = body.amount
                descriptor = body.descriptor
                pan = body.pan
                mcc = body.mcc
                merchantAcceptorId = body.merchantAcceptorId
                merchantAmount = body.merchantAmount
                merchantCurrency = body.merchantCurrency
                partialApprovalCapable = body.partialApprovalCapable
                pin = body.pin
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Amount (in cents) to authorize. For credit authorizations and financial credit
             * authorizations, any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will result in a -100
             * amount in the transaction. For balance inquiries, this field must be set to 0.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Merchant descriptor. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            fun pan(pan: String) = pan(JsonField.of(pan))

            /**
             * Sets [Builder.pan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pan] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pan(pan: JsonField<String>) = apply { this.pan = pan }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Unique identifier to identify the payment card acceptor. */
            fun merchantAcceptorId(merchantAcceptorId: String) =
                merchantAcceptorId(JsonField.of(merchantAcceptorId))

            /**
             * Sets [Builder.merchantAcceptorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAcceptorId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * Amount of the transaction to be simulated in currency specified in merchant_currency,
             * including any acquirer fees.
             */
            fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

            /**
             * Sets [Builder.merchantAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
                this.merchantAmount = merchantAmount
            }

            /**
             * 3-character alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP,
             * EUR and defaults to GBP if another ISO 4217 code is provided
             */
            fun merchantCurrency(merchantCurrency: String) =
                merchantCurrency(JsonField.of(merchantCurrency))

            /**
             * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.partialApprovalCapable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partialApprovalCapable] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
                this.partialApprovalCapable = partialApprovalCapable
            }

            /** Simulate entering a PIN. If omitted, PIN check will not be performed. */
            fun pin(pin: String) = pin(JsonField.of(pin))

            /**
             * Sets [Builder.pin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pin] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pin(pin: JsonField<String>) = apply { this.pin = pin }

            /**
             * Type of event to simulate.
             * * `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent
             *   clearing step is required to settle the transaction.
             * * `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card,
             *   and is most often observed when a cardholder requests to view a card's balance at
             *   an ATM.
             * * `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a
             *   refund, meaning a subsequent clearing step is required to settle the transaction.
             * * `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit
             *   funds immediately (such as an ATM withdrawal), and no subsequent clearing is
             *   required to settle the transaction.
             * * `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to
             *   credit funds immediately, and no subsequent clearing is required to settle the
             *   transaction.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .descriptor()
             * .pan()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            status().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (descriptor.asKnown().isPresent) 1 else 0) +
                (if (pan.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (if (merchantAcceptorId.asKnown().isPresent) 1 else 0) +
                (if (merchantAmount.asKnown().isPresent) 1 else 0) +
                (if (merchantCurrency.asKnown().isPresent) 1 else 0) +
                (if (partialApprovalCapable.asKnown().isPresent) 1 else 0) +
                (if (pin.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                descriptor == other.descriptor &&
                pan == other.pan &&
                mcc == other.mcc &&
                merchantAcceptorId == other.merchantAcceptorId &&
                merchantAmount == other.merchantAmount &&
                merchantCurrency == other.merchantCurrency &&
                partialApprovalCapable == other.partialApprovalCapable &&
                pin == other.pin &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, partialApprovalCapable=$partialApprovalCapable, pin=$pin, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * Type of event to simulate.
     * * `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
     *   step is required to settle the transaction.
     * * `BALANCE_INQUIRY` is a $0 authorization requesting the balance held on the card, and is
     *   most often observed when a cardholder requests to view a card's balance at an ATM.
     * * `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund,
     *   meaning a subsequent clearing step is required to settle the transaction.
     * * `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
     *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to settle
     *   the transaction.
     * * `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
     *   funds immediately, and no subsequent clearing is required to settle the transaction.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSimulateAuthorizationParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionSimulateAuthorizationParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
