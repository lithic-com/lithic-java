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
 * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
 * you're configured for 3DS Customer Decisioning, simulating authentications requires your customer
 * decisioning endpoint to be set up properly (respond with a valid JSON).
 */
class ThreeDSAuthenticationSimulateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): Merchant = body.merchant()

    /**
     * Sixteen digit card number.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pan(): String = body.pan()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transaction(): Transaction = body.transaction()

    /**
     * When set will use the following values as part of the Simulated Authentication. When not set
     * defaults to MATCH
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardExpiryCheck(): Optional<CardExpiryCheck> = body.cardExpiryCheck()

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _merchant(): JsonField<Merchant> = body._merchant()

    /**
     * Returns the raw JSON value of [pan].
     *
     * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pan(): JsonField<String> = body._pan()

    /**
     * Returns the raw JSON value of [transaction].
     *
     * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transaction(): JsonField<Transaction> = body._transaction()

    /**
     * Returns the raw JSON value of [cardExpiryCheck].
     *
     * Unlike [cardExpiryCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = body._cardExpiryCheck()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ThreeDSAuthenticationSimulateParams].
         *
         * The following fields are required:
         * ```java
         * .merchant()
         * .pan()
         * .transaction()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreeDSAuthenticationSimulateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [merchant]
         * - [pan]
         * - [transaction]
         * - [cardExpiryCheck]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun merchant(merchant: Merchant) = apply { body.merchant(merchant) }

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [Merchant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchant(merchant: JsonField<Merchant>) = apply { body.merchant(merchant) }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /**
         * Sets [Builder.pan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        fun transaction(transaction: Transaction) = apply { body.transaction(transaction) }

        /**
         * Sets [Builder.transaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transaction] with a well-typed [Transaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.cardExpiryCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardExpiryCheck] with a well-typed [CardExpiryCheck]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /**
         * Returns an immutable instance of [ThreeDSAuthenticationSimulateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .merchant()
         * .pan()
         * .transaction()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreeDSAuthenticationSimulateParams =
            ThreeDSAuthenticationSimulateParams(
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
        private val merchant: JsonField<Merchant>,
        private val pan: JsonField<String>,
        private val transaction: JsonField<Transaction>,
        private val cardExpiryCheck: JsonField<CardExpiryCheck>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Merchant> = JsonMissing.of(),
            @JsonProperty("pan") @ExcludeMissing pan: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction")
            @ExcludeMissing
            transaction: JsonField<Transaction> = JsonMissing.of(),
            @JsonProperty("card_expiry_check")
            @ExcludeMissing
            cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of(),
        ) : this(merchant, pan, transaction, cardExpiryCheck, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchant(): Merchant = merchant.getRequired("merchant")

        /**
         * Sixteen digit card number.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pan(): String = pan.getRequired("pan")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transaction(): Transaction = transaction.getRequired("transaction")

        /**
         * When set will use the following values as part of the Simulated Authentication. When not
         * set defaults to MATCH
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardExpiryCheck(): Optional<CardExpiryCheck> =
            Optional.ofNullable(cardExpiryCheck.getNullable("card_expiry_check"))

        /**
         * Returns the raw JSON value of [merchant].
         *
         * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        /**
         * Returns the raw JSON value of [pan].
         *
         * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        /**
         * Returns the raw JSON value of [transaction].
         *
         * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transaction")
        @ExcludeMissing
        fun _transaction(): JsonField<Transaction> = transaction

        /**
         * Returns the raw JSON value of [cardExpiryCheck].
         *
         * Unlike [cardExpiryCheck], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = cardExpiryCheck

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
             * .merchant()
             * .pan()
             * .transaction()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var merchant: JsonField<Merchant>? = null
            private var pan: JsonField<String>? = null
            private var transaction: JsonField<Transaction>? = null
            private var cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                merchant = body.merchant
                pan = body.pan
                transaction = body.transaction
                cardExpiryCheck = body.cardExpiryCheck
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Merchant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

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

            fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

            /**
             * Sets [Builder.transaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transaction] with a well-typed [Transaction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.cardExpiryCheck] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardExpiryCheck] with a well-typed [CardExpiryCheck]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .merchant()
             * .pan()
             * .transaction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("merchant", merchant),
                    checkRequired("pan", pan),
                    checkRequired("transaction", transaction),
                    cardExpiryCheck,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            merchant().validate()
            pan()
            transaction().validate()
            cardExpiryCheck().ifPresent { it.validate() }
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
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (pan.asKnown().isPresent) 1 else 0) +
                (transaction.asKnown().getOrNull()?.validity() ?: 0) +
                (cardExpiryCheck.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && merchant == other.merchant && pan == other.pan && transaction == other.transaction && cardExpiryCheck == other.cardExpiryCheck && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(merchant, pan, transaction, cardExpiryCheck, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{merchant=$merchant, pan=$pan, transaction=$transaction, cardExpiryCheck=$cardExpiryCheck, additionalProperties=$additionalProperties}"
    }

    class Merchant
    private constructor(
        private val id: JsonField<String>,
        private val country: JsonField<String>,
        private val mcc: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, country, mcc, name, mutableMapOf())

        /**
         * Unique identifier to identify the payment card acceptor. Corresponds to
         * `merchant_acceptor_id` in authorization.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g. USA)
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /**
         * Merchant descriptor, corresponds to `descriptor` in authorization. If CHALLENGE keyword
         * is included, Lithic will trigger a challenge.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Merchant].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .country()
             * .mcc()
             * .name()
             * ```
             */
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
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            /**
             * Merchant descriptor, corresponds to `descriptor` in authorization. If CHALLENGE
             * keyword is included, Lithic will trigger a challenge.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Merchant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .country()
             * .mcc()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Merchant =
                Merchant(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("mcc", mcc),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

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

    class Transaction
    private constructor(
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * Amount (in cents) to authenticate.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * 3-character alphabetic ISO 4217 currency code.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
             * Returns a mutable builder for constructing an instance of [Transaction].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             */
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

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** 3-character alphabetic ISO 4217 currency code. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Transaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transaction =
                Transaction(
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
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
                (if (currency.asKnown().isPresent) 1 else 0)

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

        fun validate(): CardExpiryCheck = apply {
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
