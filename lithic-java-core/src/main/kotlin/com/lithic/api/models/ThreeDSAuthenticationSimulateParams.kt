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

/**
 * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
 * you're configured for 3DS Customer Decisioning, simulating authentications requires your customer
 * decisioning endpoint to be set up properly (respond with a valid JSON).
 */
class ThreeDSAuthenticationSimulateParams
private constructor(
    private val body: ThreeDSAuthenticationSimulateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun merchant(): Merchant = body.merchant()

    /** Sixteen digit card number. */
    fun pan(): String = body.pan()

    fun transaction(): Transaction = body.transaction()

    /**
     * When set will use the following values as part of the Simulated Authentication. When not set
     * defaults to MATCH
     */
    fun cardExpiryCheck(): Optional<CardExpiryCheck> = body.cardExpiryCheck()

    fun _merchant(): JsonField<Merchant> = body._merchant()

    /** Sixteen digit card number. */
    fun _pan(): JsonField<String> = body._pan()

    fun _transaction(): JsonField<Transaction> = body._transaction()

    /**
     * When set will use the following values as part of the Simulated Authentication. When not set
     * defaults to MATCH
     */
    fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = body._cardExpiryCheck()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ThreeDSAuthenticationSimulateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ThreeDSAuthenticationSimulateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("merchant")
        @ExcludeMissing
        private val merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("pan") @ExcludeMissing private val pan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        private val transaction: JsonField<Transaction> = JsonMissing.of(),
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        private val cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun merchant(): Merchant = merchant.getRequired("merchant")

        /** Sixteen digit card number. */
        fun pan(): String = pan.getRequired("pan")

        fun transaction(): Transaction = transaction.getRequired("transaction")

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        fun cardExpiryCheck(): Optional<CardExpiryCheck> =
            Optional.ofNullable(cardExpiryCheck.getNullable("card_expiry_check"))

        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        /** Sixteen digit card number. */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        @JsonProperty("transaction")
        @ExcludeMissing
        fun _transaction(): JsonField<Transaction> = transaction

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = cardExpiryCheck

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThreeDSAuthenticationSimulateBody = apply {
            if (validated) {
                return@apply
            }

            merchant().validate()
            pan()
            transaction().validate()
            cardExpiryCheck()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThreeDSAuthenticationSimulateBody]. */
        class Builder internal constructor() {

            private var merchant: JsonField<Merchant>? = null
            private var pan: JsonField<String>? = null
            private var transaction: JsonField<Transaction>? = null
            private var cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of()
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

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

            /** Sixteen digit card number. */
            fun pan(pan: String) = pan(JsonField.of(pan))

            /** Sixteen digit card number. */
            fun pan(pan: JsonField<String>) = apply { this.pan = pan }

            fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

            fun transaction(transaction: JsonField<Transaction>) = apply {
                this.transaction = transaction
            }

            /**
             * When set will use the following values as part of the Simulated Authentication. When
             * not set defaults to MATCH
             */
            fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) =
                cardExpiryCheck(JsonField.of(cardExpiryCheck))

            /**
             * When set will use the following values as part of the Simulated Authentication. When
             * not set defaults to MATCH
             */
            fun cardExpiryCheck(cardExpiryCheck: JsonField<CardExpiryCheck>) = apply {
                this.cardExpiryCheck = cardExpiryCheck
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

            fun build(): ThreeDSAuthenticationSimulateBody =
                ThreeDSAuthenticationSimulateBody(
                    checkRequired("merchant", merchant),
                    checkRequired("pan", pan),
                    checkRequired("transaction", transaction),
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

    /** A builder for [ThreeDSAuthenticationSimulateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ThreeDSAuthenticationSimulateBody.Builder =
            ThreeDSAuthenticationSimulateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            threeDSAuthenticationSimulateParams: ThreeDSAuthenticationSimulateParams
        ) = apply {
            body = threeDSAuthenticationSimulateParams.body.toBuilder()
            additionalHeaders = threeDSAuthenticationSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                threeDSAuthenticationSimulateParams.additionalQueryParams.toBuilder()
        }

        fun merchant(merchant: Merchant) = apply { body.merchant(merchant) }

        fun merchant(merchant: JsonField<Merchant>) = apply { body.merchant(merchant) }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /** Sixteen digit card number. */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        fun transaction(transaction: Transaction) = apply { body.transaction(transaction) }

        fun transaction(transaction: JsonField<Transaction>) = apply {
            body.transaction(transaction)
        }

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) = apply {
            body.cardExpiryCheck(cardExpiryCheck)
        }

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         */
        fun cardExpiryCheck(cardExpiryCheck: JsonField<CardExpiryCheck>) = apply {
            body.cardExpiryCheck(cardExpiryCheck)
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

        fun build(): ThreeDSAuthenticationSimulateParams =
            ThreeDSAuthenticationSimulateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Merchant
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing private val mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Unique identifier to identify the payment card acceptor. Corresponds to
         * `merchant_acceptor_id` in authorization.
         */
        fun id(): String = id.getRequired("id")

        /**
         * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g. USA)
         */
        fun country(): String = country.getRequired("country")

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /** Merchant descriptor, corresponds to `descriptor` in authorization. */
        fun name(): String = name.getRequired("name")

        /**
         * Unique identifier to identify the payment card acceptor. Corresponds to
         * `merchant_acceptor_id` in authorization.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g. USA)
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /** Merchant descriptor, corresponds to `descriptor` in authorization. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            mcc()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Merchant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var mcc: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                id = merchant.id
                country = merchant.country
                mcc = merchant.mcc
                name = merchant.name
                additionalProperties = merchant.additionalProperties.toMutableMap()
            }

            /**
             * Unique identifier to identify the payment card acceptor. Corresponds to
             * `merchant_acceptor_id` in authorization.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Unique identifier to identify the payment card acceptor. Corresponds to
             * `merchant_acceptor_id` in authorization.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            /** Merchant descriptor, corresponds to `descriptor` in authorization. */
            fun name(name: String) = name(JsonField.of(name))

            /** Merchant descriptor, corresponds to `descriptor` in authorization. */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Merchant =
                Merchant(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("mcc", mcc),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && id == other.id && country == other.country && mcc == other.mcc && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, mcc, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{id=$id, country=$country, mcc=$mcc, name=$name, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Transaction
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount (in cents) to authenticate. */
        fun amount(): Long = amount.getRequired("amount")

        /** 3-digit alphabetic ISO 4217 currency code. */
        fun currency(): String = currency.getRequired("currency")

        /** Amount (in cents) to authenticate. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** 3-digit alphabetic ISO 4217 currency code. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var currency: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transaction: Transaction) = apply {
                amount = transaction.amount
                currency = transaction.currency
                additionalProperties = transaction.additionalProperties.toMutableMap()
            }

            /** Amount (in cents) to authenticate. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount (in cents) to authenticate. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** 3-digit alphabetic ISO 4217 currency code. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** 3-digit alphabetic ISO 4217 currency code. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

            fun build(): Transaction =
                Transaction(
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
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

    /**
     * When set will use the following values as part of the Simulated Authentication. When not set
     * defaults to MATCH
     */
    class CardExpiryCheck @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MATCH = of("MATCH")

            @JvmField val MISMATCH = of("MISMATCH")

            @JvmField val NOT_PRESENT = of("NOT_PRESENT")

            @JvmStatic fun of(value: String) = CardExpiryCheck(JsonField.of(value))
        }

        /** An enum containing [CardExpiryCheck]'s known values. */
        enum class Known {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
        }

        /**
         * An enum containing [CardExpiryCheck]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CardExpiryCheck] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
            /**
             * An enum member indicating that [CardExpiryCheck] was instantiated with an unknown
             * value.
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
                MATCH -> Value.MATCH
                MISMATCH -> Value.MISMATCH
                NOT_PRESENT -> Value.NOT_PRESENT
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

        return /* spotless:off */ other is ThreeDSAuthenticationSimulateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ThreeDSAuthenticationSimulateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
