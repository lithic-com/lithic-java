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

/** Book transfer funds between two financial accounts or between a financial account and card */
class BookTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This should
     * always be a positive value.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Category of the book transfer
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = body.category()

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromFinancialAccountToken(): String = body.fromFinancialAccountToken()

    /**
     * The program specific subtype code for the specified category/type.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtype(): String = body.subtype()

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toFinancialAccountToken(): String = body.toFinancialAccountToken()

    /**
     * Type of book_transfer
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = body.token()

    /**
     * Optional descriptor for the transfer.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [fromFinancialAccountToken].
     *
     * Unlike [fromFinancialAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _fromFinancialAccountToken(): JsonField<String> = body._fromFinancialAccountToken()

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subtype(): JsonField<String> = body._subtype()

    /**
     * Returns the raw JSON value of [toFinancialAccountToken].
     *
     * Unlike [toFinancialAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _toFinancialAccountToken(): JsonField<String> = body._toFinancialAccountToken()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _token(): JsonField<String> = body._token()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .category()
         * .fromFinancialAccountToken()
         * .subtype()
         * .toFinancialAccountToken()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookTransferCreateParams: BookTransferCreateParams) = apply {
            body = bookTransferCreateParams.body.toBuilder()
            additionalHeaders = bookTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [category]
         * - [fromFinancialAccountToken]
         * - [subtype]
         * - [toFinancialAccountToken]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Category of the book transfer */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: String) = apply {
            body.fromFinancialAccountToken(fromFinancialAccountToken)
        }

        /**
         * Sets [Builder.fromFinancialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromFinancialAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: JsonField<String>) = apply {
            body.fromFinancialAccountToken(fromFinancialAccountToken)
        }

        /** The program specific subtype code for the specified category/type. */
        fun subtype(subtype: String) = apply { body.subtype(subtype) }

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtype(subtype: JsonField<String>) = apply { body.subtype(subtype) }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        fun toFinancialAccountToken(toFinancialAccountToken: String) = apply {
            body.toFinancialAccountToken(toFinancialAccountToken)
        }

        /**
         * Sets [Builder.toFinancialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toFinancialAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toFinancialAccountToken(toFinancialAccountToken: JsonField<String>) = apply {
            body.toFinancialAccountToken(toFinancialAccountToken)
        }

        /** Type of book_transfer */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = apply { body.token(token) }

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /** Optional descriptor for the transfer. */
        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

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
         * Returns an immutable instance of [BookTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .category()
         * .fromFinancialAccountToken()
         * .subtype()
         * .toFinancialAccountToken()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookTransferCreateParams =
            BookTransferCreateParams(
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
        private val category: JsonField<Category>,
        private val fromFinancialAccountToken: JsonField<String>,
        private val subtype: JsonField<String>,
        private val toFinancialAccountToken: JsonField<String>,
        private val type: JsonField<Type>,
        private val token: JsonField<String>,
        private val memo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("from_financial_account_token")
            @ExcludeMissing
            fromFinancialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_financial_account_token")
            @ExcludeMissing
            toFinancialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            category,
            fromFinancialAccountToken,
            subtype,
            toFinancialAccountToken,
            type,
            token,
            memo,
            mutableMapOf(),
        )

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Category of the book transfer
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fromFinancialAccountToken(): String =
            fromFinancialAccountToken.getRequired("from_financial_account_token")

        /**
         * The program specific subtype code for the specified category/type.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtype(): String = subtype.getRequired("subtype")

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toFinancialAccountToken(): String =
            toFinancialAccountToken.getRequired("to_financial_account_token")

        /**
         * Type of book_transfer
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * Optional descriptor for the transfer.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [fromFinancialAccountToken].
         *
         * Unlike [fromFinancialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("from_financial_account_token")
        @ExcludeMissing
        fun _fromFinancialAccountToken(): JsonField<String> = fromFinancialAccountToken

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

        /**
         * Returns the raw JSON value of [toFinancialAccountToken].
         *
         * Unlike [toFinancialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("to_financial_account_token")
        @ExcludeMissing
        fun _toFinancialAccountToken(): JsonField<String> = toFinancialAccountToken

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

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
             * .category()
             * .fromFinancialAccountToken()
             * .subtype()
             * .toFinancialAccountToken()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var category: JsonField<Category>? = null
            private var fromFinancialAccountToken: JsonField<String>? = null
            private var subtype: JsonField<String>? = null
            private var toFinancialAccountToken: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                category = body.category
                fromFinancialAccountToken = body.fromFinancialAccountToken
                subtype = body.subtype
                toFinancialAccountToken = body.toFinancialAccountToken
                type = body.type
                token = body.token
                memo = body.memo
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
             * should always be a positive value.
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

            /** Category of the book transfer */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Globally unique identifier for the financial account or card that will send the
             * funds. Accepted type dependent on the program's use case.
             */
            fun fromFinancialAccountToken(fromFinancialAccountToken: String) =
                fromFinancialAccountToken(JsonField.of(fromFinancialAccountToken))

            /**
             * Sets [Builder.fromFinancialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromFinancialAccountToken] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun fromFinancialAccountToken(fromFinancialAccountToken: JsonField<String>) = apply {
                this.fromFinancialAccountToken = fromFinancialAccountToken
            }

            /** The program specific subtype code for the specified category/type. */
            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

            /**
             * Globally unique identifier for the financial account or card that will receive the
             * funds. Accepted type dependent on the program's use case.
             */
            fun toFinancialAccountToken(toFinancialAccountToken: String) =
                toFinancialAccountToken(JsonField.of(toFinancialAccountToken))

            /**
             * Sets [Builder.toFinancialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toFinancialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun toFinancialAccountToken(toFinancialAccountToken: JsonField<String>) = apply {
                this.toFinancialAccountToken = toFinancialAccountToken
            }

            /** Type of book_transfer */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Optional descriptor for the transfer. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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
             * .category()
             * .fromFinancialAccountToken()
             * .subtype()
             * .toFinancialAccountToken()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("category", category),
                    checkRequired("fromFinancialAccountToken", fromFinancialAccountToken),
                    checkRequired("subtype", subtype),
                    checkRequired("toFinancialAccountToken", toFinancialAccountToken),
                    checkRequired("type", type),
                    token,
                    memo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            category().validate()
            fromFinancialAccountToken()
            subtype()
            toFinancialAccountToken()
            type().validate()
            token()
            memo()
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fromFinancialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (subtype.asKnown().isPresent) 1 else 0) +
                (if (toFinancialAccountToken.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (token.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && category == other.category && fromFinancialAccountToken == other.fromFinancialAccountToken && subtype == other.subtype && toFinancialAccountToken == other.toFinancialAccountToken && type == other.type && token == other.token && memo == other.memo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, fromFinancialAccountToken, subtype, toFinancialAccountToken, type, token, memo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, category=$category, fromFinancialAccountToken=$fromFinancialAccountToken, subtype=$subtype, toFinancialAccountToken=$toFinancialAccountToken, type=$type, token=$token, memo=$memo, additionalProperties=$additionalProperties}"
    }

    /** Category of the book transfer */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ADJUSTMENT = of("ADJUSTMENT")

            @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

            @JvmField val DERECOGNITION = of("DERECOGNITION")

            @JvmField val DISPUTE = of("DISPUTE")

            @JvmField val FEE = of("FEE")

            @JvmField val REWARD = of("REWARD")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                ADJUSTMENT -> Value.ADJUSTMENT
                BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                DERECOGNITION -> Value.DERECOGNITION
                DISPUTE -> Value.DISPUTE
                FEE -> Value.FEE
                REWARD -> Value.REWARD
                TRANSFER -> Value.TRANSFER
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
                ADJUSTMENT -> Known.ADJUSTMENT
                BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                DERECOGNITION -> Known.DERECOGNITION
                DISPUTE -> Known.DISPUTE
                FEE -> Known.FEE
                REWARD -> Known.REWARD
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
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

        fun validate(): Category = apply {
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of book_transfer */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ATM_WITHDRAWAL = of("ATM_WITHDRAWAL")

            @JvmField val ATM_DECLINE = of("ATM_DECLINE")

            @JvmField val INTERNATIONAL_ATM_WITHDRAWAL = of("INTERNATIONAL_ATM_WITHDRAWAL")

            @JvmField val INACTIVITY = of("INACTIVITY")

            @JvmField val STATEMENT = of("STATEMENT")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val QUARTERLY = of("QUARTERLY")

            @JvmField val ANNUAL = of("ANNUAL")

            @JvmField val CUSTOMER_SERVICE = of("CUSTOMER_SERVICE")

            @JvmField val ACCOUNT_MAINTENANCE = of("ACCOUNT_MAINTENANCE")

            @JvmField val ACCOUNT_ACTIVATION = of("ACCOUNT_ACTIVATION")

            @JvmField val ACCOUNT_CLOSURE = of("ACCOUNT_CLOSURE")

            @JvmField val CARD_REPLACEMENT = of("CARD_REPLACEMENT")

            @JvmField val CARD_DELIVERY = of("CARD_DELIVERY")

            @JvmField val CARD_CREATE = of("CARD_CREATE")

            @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

            @JvmField val INTEREST = of("INTEREST")

            @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

            @JvmField val BILL_PAYMENT = of("BILL_PAYMENT")

            @JvmField val CASH_BACK = of("CASH_BACK")

            @JvmField val ACCOUNT_TO_ACCOUNT = of("ACCOUNT_TO_ACCOUNT")

            @JvmField val CARD_TO_CARD = of("CARD_TO_CARD")

            @JvmField val DISBURSE = of("DISBURSE")

            @JvmField val BILLING_ERROR = of("BILLING_ERROR")

            @JvmField val LOSS_WRITE_OFF = of("LOSS_WRITE_OFF")

            @JvmField val EXPIRED_CARD = of("EXPIRED_CARD")

            @JvmField val EARLY_DERECOGNITION = of("EARLY_DERECOGNITION")

            @JvmField val ESCHEATMENT = of("ESCHEATMENT")

            @JvmField val INACTIVITY_FEE_DOWN = of("INACTIVITY_FEE_DOWN")

            @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

            @JvmField val DISPUTE_WON = of("DISPUTE_WON")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ATM_WITHDRAWAL,
            ATM_DECLINE,
            INTERNATIONAL_ATM_WITHDRAWAL,
            INACTIVITY,
            STATEMENT,
            MONTHLY,
            QUARTERLY,
            ANNUAL,
            CUSTOMER_SERVICE,
            ACCOUNT_MAINTENANCE,
            ACCOUNT_ACTIVATION,
            ACCOUNT_CLOSURE,
            CARD_REPLACEMENT,
            CARD_DELIVERY,
            CARD_CREATE,
            CURRENCY_CONVERSION,
            INTEREST,
            LATE_PAYMENT,
            BILL_PAYMENT,
            CASH_BACK,
            ACCOUNT_TO_ACCOUNT,
            CARD_TO_CARD,
            DISBURSE,
            BILLING_ERROR,
            LOSS_WRITE_OFF,
            EXPIRED_CARD,
            EARLY_DERECOGNITION,
            ESCHEATMENT,
            INACTIVITY_FEE_DOWN,
            PROVISIONAL_CREDIT,
            DISPUTE_WON,
            SERVICE,
            TRANSFER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ATM_WITHDRAWAL,
            ATM_DECLINE,
            INTERNATIONAL_ATM_WITHDRAWAL,
            INACTIVITY,
            STATEMENT,
            MONTHLY,
            QUARTERLY,
            ANNUAL,
            CUSTOMER_SERVICE,
            ACCOUNT_MAINTENANCE,
            ACCOUNT_ACTIVATION,
            ACCOUNT_CLOSURE,
            CARD_REPLACEMENT,
            CARD_DELIVERY,
            CARD_CREATE,
            CURRENCY_CONVERSION,
            INTEREST,
            LATE_PAYMENT,
            BILL_PAYMENT,
            CASH_BACK,
            ACCOUNT_TO_ACCOUNT,
            CARD_TO_CARD,
            DISBURSE,
            BILLING_ERROR,
            LOSS_WRITE_OFF,
            EXPIRED_CARD,
            EARLY_DERECOGNITION,
            ESCHEATMENT,
            INACTIVITY_FEE_DOWN,
            PROVISIONAL_CREDIT,
            DISPUTE_WON,
            SERVICE,
            TRANSFER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ATM_WITHDRAWAL -> Value.ATM_WITHDRAWAL
                ATM_DECLINE -> Value.ATM_DECLINE
                INTERNATIONAL_ATM_WITHDRAWAL -> Value.INTERNATIONAL_ATM_WITHDRAWAL
                INACTIVITY -> Value.INACTIVITY
                STATEMENT -> Value.STATEMENT
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                ANNUAL -> Value.ANNUAL
                CUSTOMER_SERVICE -> Value.CUSTOMER_SERVICE
                ACCOUNT_MAINTENANCE -> Value.ACCOUNT_MAINTENANCE
                ACCOUNT_ACTIVATION -> Value.ACCOUNT_ACTIVATION
                ACCOUNT_CLOSURE -> Value.ACCOUNT_CLOSURE
                CARD_REPLACEMENT -> Value.CARD_REPLACEMENT
                CARD_DELIVERY -> Value.CARD_DELIVERY
                CARD_CREATE -> Value.CARD_CREATE
                CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                INTEREST -> Value.INTEREST
                LATE_PAYMENT -> Value.LATE_PAYMENT
                BILL_PAYMENT -> Value.BILL_PAYMENT
                CASH_BACK -> Value.CASH_BACK
                ACCOUNT_TO_ACCOUNT -> Value.ACCOUNT_TO_ACCOUNT
                CARD_TO_CARD -> Value.CARD_TO_CARD
                DISBURSE -> Value.DISBURSE
                BILLING_ERROR -> Value.BILLING_ERROR
                LOSS_WRITE_OFF -> Value.LOSS_WRITE_OFF
                EXPIRED_CARD -> Value.EXPIRED_CARD
                EARLY_DERECOGNITION -> Value.EARLY_DERECOGNITION
                ESCHEATMENT -> Value.ESCHEATMENT
                INACTIVITY_FEE_DOWN -> Value.INACTIVITY_FEE_DOWN
                PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                DISPUTE_WON -> Value.DISPUTE_WON
                SERVICE -> Value.SERVICE
                TRANSFER -> Value.TRANSFER
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
                ATM_WITHDRAWAL -> Known.ATM_WITHDRAWAL
                ATM_DECLINE -> Known.ATM_DECLINE
                INTERNATIONAL_ATM_WITHDRAWAL -> Known.INTERNATIONAL_ATM_WITHDRAWAL
                INACTIVITY -> Known.INACTIVITY
                STATEMENT -> Known.STATEMENT
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                ANNUAL -> Known.ANNUAL
                CUSTOMER_SERVICE -> Known.CUSTOMER_SERVICE
                ACCOUNT_MAINTENANCE -> Known.ACCOUNT_MAINTENANCE
                ACCOUNT_ACTIVATION -> Known.ACCOUNT_ACTIVATION
                ACCOUNT_CLOSURE -> Known.ACCOUNT_CLOSURE
                CARD_REPLACEMENT -> Known.CARD_REPLACEMENT
                CARD_DELIVERY -> Known.CARD_DELIVERY
                CARD_CREATE -> Known.CARD_CREATE
                CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                INTEREST -> Known.INTEREST
                LATE_PAYMENT -> Known.LATE_PAYMENT
                BILL_PAYMENT -> Known.BILL_PAYMENT
                CASH_BACK -> Known.CASH_BACK
                ACCOUNT_TO_ACCOUNT -> Known.ACCOUNT_TO_ACCOUNT
                CARD_TO_CARD -> Known.CARD_TO_CARD
                DISBURSE -> Known.DISBURSE
                BILLING_ERROR -> Known.BILLING_ERROR
                LOSS_WRITE_OFF -> Known.LOSS_WRITE_OFF
                EXPIRED_CARD -> Known.EXPIRED_CARD
                EARLY_DERECOGNITION -> Known.EARLY_DERECOGNITION
                ESCHEATMENT -> Known.ESCHEATMENT
                INACTIVITY_FEE_DOWN -> Known.INACTIVITY_FEE_DOWN
                PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                DISPUTE_WON -> Known.DISPUTE_WON
                SERVICE -> Known.SERVICE
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
