// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects

class ThreeDSAuthenticationSimulateParams
constructor(
    private val merchant: Merchant,
    private val pan: String,
    private val transaction: Transaction,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun merchant(): Merchant = merchant

    fun pan(): String = pan

    fun transaction(): Transaction = transaction

    @JvmSynthetic
    internal fun getBody(): ThreeDSAuthenticationSimulateBody {
        return ThreeDSAuthenticationSimulateBody(
            merchant,
            pan,
            transaction,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ThreeDSAuthenticationSimulateBody.Builder::class)
    @NoAutoDetect
    class ThreeDSAuthenticationSimulateBody
    internal constructor(
        private val merchant: Merchant?,
        private val pan: String?,
        private val transaction: Transaction?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("merchant") fun merchant(): Merchant? = merchant

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        @JsonProperty("transaction") fun transaction(): Transaction? = transaction

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var merchant: Merchant? = null
            private var pan: String? = null
            private var transaction: Transaction? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                threeDSAuthenticationSimulateBody: ThreeDSAuthenticationSimulateBody
            ) = apply {
                this.merchant = threeDSAuthenticationSimulateBody.merchant
                this.pan = threeDSAuthenticationSimulateBody.pan
                this.transaction = threeDSAuthenticationSimulateBody.transaction
                additionalProperties(threeDSAuthenticationSimulateBody.additionalProperties)
            }

            @JsonProperty("merchant")
            fun merchant(merchant: Merchant) = apply { this.merchant = merchant }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            @JsonProperty("transaction")
            fun transaction(transaction: Transaction) = apply { this.transaction = transaction }

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

            fun build(): ThreeDSAuthenticationSimulateBody =
                ThreeDSAuthenticationSimulateBody(
                    checkNotNull(merchant) { "`merchant` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    checkNotNull(transaction) { "`transaction` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeDSAuthenticationSimulateBody && this.merchant == other.merchant && this.pan == other.pan && this.transaction == other.transaction && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(merchant, pan, transaction, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ThreeDSAuthenticationSimulateBody{merchant=$merchant, pan=$pan, transaction=$transaction, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSAuthenticationSimulateParams && this.merchant == other.merchant && this.pan == other.pan && this.transaction == other.transaction && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(merchant, pan, transaction, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ThreeDSAuthenticationSimulateParams{merchant=$merchant, pan=$pan, transaction=$transaction, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var merchant: Merchant? = null
        private var pan: String? = null
        private var transaction: Transaction? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSAuthenticationSimulateParams: ThreeDSAuthenticationSimulateParams
        ) = apply {
            this.merchant = threeDSAuthenticationSimulateParams.merchant
            this.pan = threeDSAuthenticationSimulateParams.pan
            this.transaction = threeDSAuthenticationSimulateParams.transaction
            additionalQueryParams(threeDSAuthenticationSimulateParams.additionalQueryParams)
            additionalHeaders(threeDSAuthenticationSimulateParams.additionalHeaders)
            additionalBodyProperties(threeDSAuthenticationSimulateParams.additionalBodyProperties)
        }

        fun merchant(merchant: Merchant) = apply { this.merchant = merchant }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        fun transaction(transaction: Transaction) = apply { this.transaction = transaction }

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

        fun build(): ThreeDSAuthenticationSimulateParams =
            ThreeDSAuthenticationSimulateParams(
                checkNotNull(merchant) { "`merchant` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                checkNotNull(transaction) { "`transaction` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Merchant.Builder::class)
    @NoAutoDetect
    class Merchant
    private constructor(
        private val country: String?,
        private val id: String?,
        private val mcc: String?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g. USA)
         */
        @JsonProperty("country") fun country(): String? = country

        /**
         * Unique identifier to identify the payment card acceptor. Corresponds to
         * `merchant_acceptor_id` in authorization.
         */
        @JsonProperty("id") fun id(): String? = id

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") fun mcc(): String? = mcc

        /** Merchant descriptor, corresponds to `descriptor` in authorization. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var country: String? = null
            private var id: String? = null
            private var mcc: String? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                this.country = merchant.country
                this.id = merchant.id
                this.mcc = merchant.mcc
                this.name = merchant.name
                additionalProperties(merchant.additionalProperties)
            }

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            /**
             * Unique identifier to identify the payment card acceptor. Corresponds to
             * `merchant_acceptor_id` in authorization.
             */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            @JsonProperty("mcc") fun mcc(mcc: String) = apply { this.mcc = mcc }

            /** Merchant descriptor, corresponds to `descriptor` in authorization. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): Merchant =
                Merchant(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(mcc) { "`mcc` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && this.country == other.country && this.id == other.id && this.mcc == other.mcc && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(country, id, mcc, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Merchant{country=$country, id=$id, mcc=$mcc, name=$name, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Transaction.Builder::class)
    @NoAutoDetect
    class Transaction
    private constructor(
        private val amount: Long?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Amount (in cents) to authenticate. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** 3-digit alphabetic ISO 4217 currency code. */
        @JsonProperty("currency") fun currency(): String? = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transaction: Transaction) = apply {
                this.amount = transaction.amount
                this.currency = transaction.currency
                additionalProperties(transaction.additionalProperties)
            }

            /** Amount (in cents) to authenticate. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** 3-digit alphabetic ISO 4217 currency code. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): Transaction =
                Transaction(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transaction && this.amount == other.amount && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Transaction{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }
}
