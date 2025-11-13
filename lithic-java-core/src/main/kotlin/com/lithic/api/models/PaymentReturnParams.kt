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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Return an ACH payment with a specified return reason code. Returns must be initiated within the
 * time window specified by NACHA rules for each return code (typically 2 banking days for most
 * codes, 60 calendar days for unauthorized debits). For a complete list of return codes and their
 * meanings, see the
 * [ACH Return Reasons documentation](https://docs.lithic.com/docs/ach-overview#ach-return-reasons).
 *
 * Note:
 * * This endpoint does not modify the state of the financial account associated with the payment.
 *   If you would like to change the account state, use the
 *   [Update financial account status](https://docs.lithic.com/reference/updatefinancialaccountstatus)
 *   endpoint.
 * * By default this endpoint is not enabled for your account. Please contact your implementations
 *   manager to enable this feature.
 */
class PaymentReturnParams
private constructor(
    private val paymentToken: String?,
    private val body: PaymentReturnRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun paymentToken(): Optional<String> = Optional.ofNullable(paymentToken)

    /**
     * Globally unique identifier for the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String = body.financialAccountToken()

    /**
     * ACH return reason code indicating the reason for returning the payment. Supported codes
     * include R01-R53 and R80-R85. For a complete list of return codes and their meanings, see
     * [ACH Return Reasons](https://docs.lithic.com/docs/ach-overview#ach-return-reasons)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun returnReasonCode(): String = body.returnReasonCode()

    /**
     * Optional additional information about the return. Limited to 44 characters
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addenda(): Optional<String> = body.addenda()

    /**
     * Date of death in YYYY-MM-DD format. Required when using return codes **R14** (representative
     * payee deceased) or **R15** (beneficiary or account holder deceased)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfDeath(): Optional<LocalDate> = body.dateOfDeath()

    /**
     * Optional memo for the return. Limited to 10 characters
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    /**
     * Returns the raw JSON value of [returnReasonCode].
     *
     * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _returnReasonCode(): JsonField<String> = body._returnReasonCode()

    /**
     * Returns the raw JSON value of [addenda].
     *
     * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addenda(): JsonField<String> = body._addenda()

    /**
     * Returns the raw JSON value of [dateOfDeath].
     *
     * Unlike [dateOfDeath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateOfDeath(): JsonField<LocalDate> = body._dateOfDeath()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentReturnParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .returnReasonCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentReturnParams]. */
    class Builder internal constructor() {

        private var paymentToken: String? = null
        private var body: PaymentReturnRequest.Builder = PaymentReturnRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentReturnParams: PaymentReturnParams) = apply {
            paymentToken = paymentReturnParams.paymentToken
            body = paymentReturnParams.body.toBuilder()
            additionalHeaders = paymentReturnParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentReturnParams.additionalQueryParams.toBuilder()
        }

        fun paymentToken(paymentToken: String?) = apply { this.paymentToken = paymentToken }

        /** Alias for calling [Builder.paymentToken] with `paymentToken.orElse(null)`. */
        fun paymentToken(paymentToken: Optional<String>) = paymentToken(paymentToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [financialAccountToken]
         * - [returnReasonCode]
         * - [addenda]
         * - [dateOfDeath]
         * - [memo]
         * - etc.
         */
        fun body(body: PaymentReturnRequest) = apply { this.body = body.toBuilder() }

        /** Globally unique identifier for the financial account */
        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /**
         * ACH return reason code indicating the reason for returning the payment. Supported codes
         * include R01-R53 and R80-R85. For a complete list of return codes and their meanings, see
         * [ACH Return Reasons](https://docs.lithic.com/docs/ach-overview#ach-return-reasons)
         */
        fun returnReasonCode(returnReasonCode: String) = apply {
            body.returnReasonCode(returnReasonCode)
        }

        /**
         * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
            body.returnReasonCode(returnReasonCode)
        }

        /** Optional additional information about the return. Limited to 44 characters */
        fun addenda(addenda: String?) = apply { body.addenda(addenda) }

        /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
        fun addenda(addenda: Optional<String>) = addenda(addenda.getOrNull())

        /**
         * Sets [Builder.addenda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addenda] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addenda(addenda: JsonField<String>) = apply { body.addenda(addenda) }

        /**
         * Date of death in YYYY-MM-DD format. Required when using return codes **R14**
         * (representative payee deceased) or **R15** (beneficiary or account holder deceased)
         */
        fun dateOfDeath(dateOfDeath: LocalDate?) = apply { body.dateOfDeath(dateOfDeath) }

        /** Alias for calling [Builder.dateOfDeath] with `dateOfDeath.orElse(null)`. */
        fun dateOfDeath(dateOfDeath: Optional<LocalDate>) = dateOfDeath(dateOfDeath.getOrNull())

        /**
         * Sets [Builder.dateOfDeath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfDeath] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply { body.dateOfDeath(dateOfDeath) }

        /** Optional memo for the return. Limited to 10 characters */
        fun memo(memo: String?) = apply { body.memo(memo) }

        /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
        fun memo(memo: Optional<String>) = memo(memo.getOrNull())

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
         * Returns an immutable instance of [PaymentReturnParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .returnReasonCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentReturnParams =
            PaymentReturnParams(
                paymentToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PaymentReturnRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> paymentToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to return an ACH payment */
    class PaymentReturnRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val financialAccountToken: JsonField<String>,
        private val returnReasonCode: JsonField<String>,
        private val addenda: JsonField<String>,
        private val dateOfDeath: JsonField<LocalDate>,
        private val memo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            returnReasonCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addenda") @ExcludeMissing addenda: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_of_death")
            @ExcludeMissing
            dateOfDeath: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        ) : this(
            financialAccountToken,
            returnReasonCode,
            addenda,
            dateOfDeath,
            memo,
            mutableMapOf(),
        )

        /**
         * Globally unique identifier for the financial account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * ACH return reason code indicating the reason for returning the payment. Supported codes
         * include R01-R53 and R80-R85. For a complete list of return codes and their meanings, see
         * [ACH Return Reasons](https://docs.lithic.com/docs/ach-overview#ach-return-reasons)
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnReasonCode(): String = returnReasonCode.getRequired("return_reason_code")

        /**
         * Optional additional information about the return. Limited to 44 characters
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addenda(): Optional<String> = addenda.getOptional("addenda")

        /**
         * Date of death in YYYY-MM-DD format. Required when using return codes **R14**
         * (representative payee deceased) or **R15** (beneficiary or account holder deceased)
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateOfDeath(): Optional<LocalDate> = dateOfDeath.getOptional("date_of_death")

        /**
         * Optional memo for the return. Limited to 10 characters
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * Returns the raw JSON value of [financialAccountToken].
         *
         * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /**
         * Returns the raw JSON value of [returnReasonCode].
         *
         * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<String> = returnReasonCode

        /**
         * Returns the raw JSON value of [addenda].
         *
         * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<String> = addenda

        /**
         * Returns the raw JSON value of [dateOfDeath].
         *
         * Unlike [dateOfDeath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_death")
        @ExcludeMissing
        fun _dateOfDeath(): JsonField<LocalDate> = dateOfDeath

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
             * Returns a mutable builder for constructing an instance of [PaymentReturnRequest].
             *
             * The following fields are required:
             * ```java
             * .financialAccountToken()
             * .returnReasonCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentReturnRequest]. */
        class Builder internal constructor() {

            private var financialAccountToken: JsonField<String>? = null
            private var returnReasonCode: JsonField<String>? = null
            private var addenda: JsonField<String> = JsonMissing.of()
            private var dateOfDeath: JsonField<LocalDate> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentReturnRequest: PaymentReturnRequest) = apply {
                financialAccountToken = paymentReturnRequest.financialAccountToken
                returnReasonCode = paymentReturnRequest.returnReasonCode
                addenda = paymentReturnRequest.addenda
                dateOfDeath = paymentReturnRequest.dateOfDeath
                memo = paymentReturnRequest.memo
                additionalProperties = paymentReturnRequest.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the financial account */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /**
             * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /**
             * ACH return reason code indicating the reason for returning the payment. Supported
             * codes include R01-R53 and R80-R85. For a complete list of return codes and their
             * meanings, see
             * [ACH Return Reasons](https://docs.lithic.com/docs/ach-overview#ach-return-reasons)
             */
            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /**
             * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            /** Optional additional information about the return. Limited to 44 characters */
            fun addenda(addenda: String?) = addenda(JsonField.ofNullable(addenda))

            /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
            fun addenda(addenda: Optional<String>) = addenda(addenda.getOrNull())

            /**
             * Sets [Builder.addenda] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addenda] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addenda(addenda: JsonField<String>) = apply { this.addenda = addenda }

            /**
             * Date of death in YYYY-MM-DD format. Required when using return codes **R14**
             * (representative payee deceased) or **R15** (beneficiary or account holder deceased)
             */
            fun dateOfDeath(dateOfDeath: LocalDate?) =
                dateOfDeath(JsonField.ofNullable(dateOfDeath))

            /** Alias for calling [Builder.dateOfDeath] with `dateOfDeath.orElse(null)`. */
            fun dateOfDeath(dateOfDeath: Optional<LocalDate>) = dateOfDeath(dateOfDeath.getOrNull())

            /**
             * Sets [Builder.dateOfDeath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfDeath] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
                this.dateOfDeath = dateOfDeath
            }

            /** Optional memo for the return. Limited to 10 characters */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
            fun memo(memo: Optional<String>) = memo(memo.getOrNull())

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
             * Returns an immutable instance of [PaymentReturnRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .financialAccountToken()
             * .returnReasonCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentReturnRequest =
                PaymentReturnRequest(
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("returnReasonCode", returnReasonCode),
                    addenda,
                    dateOfDeath,
                    memo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentReturnRequest = apply {
            if (validated) {
                return@apply
            }

            financialAccountToken()
            returnReasonCode()
            addenda()
            dateOfDeath()
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
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (returnReasonCode.asKnown().isPresent) 1 else 0) +
                (if (addenda.asKnown().isPresent) 1 else 0) +
                (if (dateOfDeath.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentReturnRequest &&
                financialAccountToken == other.financialAccountToken &&
                returnReasonCode == other.returnReasonCode &&
                addenda == other.addenda &&
                dateOfDeath == other.dateOfDeath &&
                memo == other.memo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                financialAccountToken,
                returnReasonCode,
                addenda,
                dateOfDeath,
                memo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentReturnRequest{financialAccountToken=$financialAccountToken, returnReasonCode=$returnReasonCode, addenda=$addenda, dateOfDeath=$dateOfDeath, memo=$memo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentReturnParams &&
            paymentToken == other.paymentToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(paymentToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentReturnParams{paymentToken=$paymentToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
