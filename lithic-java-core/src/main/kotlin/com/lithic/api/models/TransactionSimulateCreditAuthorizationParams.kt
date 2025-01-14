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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Simulates a credit authorization advice from the card network. This message indicates that the
 * network approved a credit authorization on your behalf.
 */
class TransactionSimulateCreditAuthorizationParams
constructor(
    private val body: TransactionSimulateCreditAuthorizationBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Amount (in cents). Any value entered will be converted into a negative amount in the
     * simulated transaction. For example, entering 100 in this field will appear as a -100 amount
     * in the transaction.
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
     * Amount (in cents). Any value entered will be converted into a negative amount in the
     * simulated transaction. For example, entering 100 in this field will appear as a -100 amount
     * in the transaction.
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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): TransactionSimulateCreditAuthorizationBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransactionSimulateCreditAuthorizationBody
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
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
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionSimulateCreditAuthorizationBody = apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var descriptor: JsonField<String>? = null
            private var pan: JsonField<String>? = null
            private var mcc: JsonField<String> = JsonMissing.of()
            private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                transactionSimulateCreditAuthorizationBody:
                    TransactionSimulateCreditAuthorizationBody
            ) = apply {
                amount = transactionSimulateCreditAuthorizationBody.amount
                descriptor = transactionSimulateCreditAuthorizationBody.descriptor
                pan = transactionSimulateCreditAuthorizationBody.pan
                mcc = transactionSimulateCreditAuthorizationBody.mcc
                merchantAcceptorId = transactionSimulateCreditAuthorizationBody.merchantAcceptorId
                additionalProperties =
                    transactionSimulateCreditAuthorizationBody.additionalProperties.toMutableMap()
            }

            /**
             * Amount (in cents). Any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount (in cents). Any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction.
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

            fun build(): TransactionSimulateCreditAuthorizationBody =
                TransactionSimulateCreditAuthorizationBody(
                    checkRequired("amount", amount),
                    checkRequired("descriptor", descriptor),
                    checkRequired("pan", pan),
                    mcc,
                    merchantAcceptorId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionSimulateCreditAuthorizationBody && amount == other.amount && descriptor == other.descriptor && pan == other.pan && mcc == other.mcc && merchantAcceptorId == other.merchantAcceptorId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, descriptor, pan, mcc, merchantAcceptorId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionSimulateCreditAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: TransactionSimulateCreditAuthorizationBody.Builder =
            TransactionSimulateCreditAuthorizationBody.builder()
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
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Amount (in cents). Any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction.
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

        fun build(): TransactionSimulateCreditAuthorizationParams =
            TransactionSimulateCreditAuthorizationParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
