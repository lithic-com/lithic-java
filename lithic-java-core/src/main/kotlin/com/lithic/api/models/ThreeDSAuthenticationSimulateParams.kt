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

class ThreeDSAuthenticationSimulateParams
constructor(
    private val merchant: Merchant,
    private val pan: String,
    private val transaction: Transaction,
    private val cardExpiryCheck: CardExpiryCheck?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun merchant(): Merchant = merchant

    fun pan(): String = pan

    fun transaction(): Transaction = transaction

    fun cardExpiryCheck(): Optional<CardExpiryCheck> = Optional.ofNullable(cardExpiryCheck)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ThreeDSAuthenticationSimulateBody {
        return ThreeDSAuthenticationSimulateBody(
            merchant,
            pan,
            transaction,
            cardExpiryCheck,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ThreeDSAuthenticationSimulateBody.Builder::class)
    @NoAutoDetect
    class ThreeDSAuthenticationSimulateBody
    internal constructor(
        private val merchant: Merchant,
        private val pan: String,
        private val transaction: Transaction,
        private val cardExpiryCheck: CardExpiryCheck?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("merchant") fun merchant(): Merchant = merchant

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String = pan

        @JsonProperty("transaction") fun transaction(): Transaction = transaction

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        @JsonProperty("card_expiry_check")
        fun cardExpiryCheck(): Optional<CardExpiryCheck> = Optional.ofNullable(cardExpiryCheck)

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
            private var cardExpiryCheck: CardExpiryCheck? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                threeDSAuthenticationSimulateBody: ThreeDSAuthenticationSimulateBody
            ) = apply {
                merchant = threeDSAuthenticationSimulateBody.merchant
                pan = threeDSAuthenticationSimulateBody.pan
                transaction = threeDSAuthenticationSimulateBody.transaction
                cardExpiryCheck = threeDSAuthenticationSimulateBody.cardExpiryCheck
                additionalProperties =
                    threeDSAuthenticationSimulateBody.additionalProperties.toMutableMap()
            }

            @JsonProperty("merchant")
            fun merchant(merchant: Merchant) = apply { this.merchant = merchant }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            @JsonProperty("transaction")
            fun transaction(transaction: Transaction) = apply { this.transaction = transaction }

            /**
             * When set will use the following values as part of the Simulated Authentication. When
             * not set defaults to MATCH
             */
            @JsonProperty("card_expiry_check")
            fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) = apply {
                this.cardExpiryCheck = cardExpiryCheck
            }

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

            fun build(): ThreeDSAuthenticationSimulateBody =
                ThreeDSAuthenticationSimulateBody(
                    checkNotNull(merchant) { "`merchant` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    checkNotNull(transaction) { "`transaction` is required but was not set" },
                    cardExpiryCheck,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeDSAuthenticationSimulateBody && merchant == other.merchant && pan == other.pan && transaction == other.transaction && cardExpiryCheck == other.cardExpiryCheck && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(merchant, pan, transaction, cardExpiryCheck, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThreeDSAuthenticationSimulateBody{merchant=$merchant, pan=$pan, transaction=$transaction, cardExpiryCheck=$cardExpiryCheck, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var merchant: Merchant? = null
        private var pan: String? = null
        private var transaction: Transaction? = null
        private var cardExpiryCheck: CardExpiryCheck? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSAuthenticationSimulateParams: ThreeDSAuthenticationSimulateParams
        ) = apply {
            merchant = threeDSAuthenticationSimulateParams.merchant
            pan = threeDSAuthenticationSimulateParams.pan
            transaction = threeDSAuthenticationSimulateParams.transaction
            cardExpiryCheck = threeDSAuthenticationSimulateParams.cardExpiryCheck
            additionalHeaders = threeDSAuthenticationSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                threeDSAuthenticationSimulateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                threeDSAuthenticationSimulateParams.additionalBodyProperties.toMutableMap()
        }

        fun merchant(merchant: Merchant) = apply { this.merchant = merchant }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        fun transaction(transaction: Transaction) = apply { this.transaction = transaction }

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) = apply {
            this.cardExpiryCheck = cardExpiryCheck
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

        fun build(): ThreeDSAuthenticationSimulateParams =
            ThreeDSAuthenticationSimulateParams(
                checkNotNull(merchant) { "`merchant` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                checkNotNull(transaction) { "`transaction` is required but was not set" },
                cardExpiryCheck,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Merchant.Builder::class)
    @NoAutoDetect
    class Merchant
    private constructor(
        private val country: String,
        private val id: String,
        private val mcc: String,
        private val name: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g. USA)
         */
        @JsonProperty("country") fun country(): String = country

        /**
         * Unique identifier to identify the payment card acceptor. Corresponds to
         * `merchant_acceptor_id` in authorization.
         */
        @JsonProperty("id") fun id(): String = id

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") fun mcc(): String = mcc

        /** Merchant descriptor, corresponds to `descriptor` in authorization. */
        @JsonProperty("name") fun name(): String = name

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
                country = merchant.country
                id = merchant.id
                mcc = merchant.mcc
                name = merchant.name
                additionalProperties = merchant.additionalProperties.toMutableMap()
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

            fun build(): Merchant =
                Merchant(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(mcc) { "`mcc` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && country == other.country && id == other.id && mcc == other.mcc && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, id, mcc, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{country=$country, id=$id, mcc=$mcc, name=$name, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Transaction.Builder::class)
    @NoAutoDetect
    class Transaction
    private constructor(
        private val amount: Long,
        private val currency: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Amount (in cents) to authenticate. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** 3-digit alphabetic ISO 4217 currency code. */
        @JsonProperty("currency") fun currency(): String = currency

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
                amount = transaction.amount
                currency = transaction.currency
                additionalProperties = transaction.additionalProperties.toMutableMap()
            }

            /** Amount (in cents) to authenticate. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** 3-digit alphabetic ISO 4217 currency code. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): Transaction =
                Transaction(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transaction && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    class CardExpiryCheck
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MATCH = of("MATCH")

            @JvmField val MISMATCH = of("MISMATCH")

            @JvmField val NOT_PRESENT = of("NOT_PRESENT")

            @JvmStatic fun of(value: String) = CardExpiryCheck(JsonField.of(value))
        }

        enum class Known {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
        }

        enum class Value {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MATCH -> Value.MATCH
                MISMATCH -> Value.MISMATCH
                NOT_PRESENT -> Value.NOT_PRESENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MATCH -> Known.MATCH
                MISMATCH -> Known.MISMATCH
                NOT_PRESENT -> Known.NOT_PRESENT
                else -> throw LithicInvalidDataException("Unknown CardExpiryCheck: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardExpiryCheck && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSAuthenticationSimulateParams && merchant == other.merchant && pan == other.pan && transaction == other.transaction && cardExpiryCheck == other.cardExpiryCheck && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(merchant, pan, transaction, cardExpiryCheck, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ThreeDSAuthenticationSimulateParams{merchant=$merchant, pan=$pan, transaction=$transaction, cardExpiryCheck=$cardExpiryCheck, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
