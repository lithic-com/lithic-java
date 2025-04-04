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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Simulates a credit authorization advice from the card network. This message indicates that the
 * network approved a credit authorization on your behalf.
 */
class TransactionSimulateCreditAuthorizationParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Amount (in cents). Any value entered will be converted into a negative amount in the
     * simulated transaction. For example, entering 100 in this field will appear as a -100 amount
     * in the transaction.
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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateCreditAuthorizationParams].
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

    /** A builder for [TransactionSimulateCreditAuthorizationParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionSimulateCreditAuthorizationParams:
                TransactionSimulateCreditAuthorizationParams
        ) = apply {
            body = transactionSimulateCreditAuthorizationParams.body.toBuilder()
            additionalHeaders =
                transactionSimulateCreditAuthorizationParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionSimulateCreditAuthorizationParams.additionalQueryParams.toBuilder()
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
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
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
         * Returns an immutable instance of [TransactionSimulateCreditAuthorizationParams].
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
        fun build(): TransactionSimulateCreditAuthorizationParams =
            TransactionSimulateCreditAuthorizationParams(
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
        ) : this(amount, descriptor, pan, mcc, merchantAcceptorId, mutableMapOf())

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                descriptor = body.descriptor
                pan = body.pan
                mcc = body.mcc
                merchantAcceptorId = body.merchantAcceptorId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Amount (in cents). Any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction.
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
                (if (merchantAcceptorId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && descriptor == other.descriptor && pan == other.pan && mcc == other.mcc && merchantAcceptorId == other.merchantAcceptorId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, descriptor, pan, mcc, merchantAcceptorId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateCreditAuthorizationParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionSimulateCreditAuthorizationParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
