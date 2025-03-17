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
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create external payment */
class ExternalPaymentCreateParams
private constructor(
    private val body: CreateExternalPaymentRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): ExternalPaymentCategory = body.category()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = body.effectiveDate()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String = body.financialAccountToken()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentType(): ExternalPaymentDirection = body.paymentType()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = body.token()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressTo(): Optional<ExternalPaymentProgressTo> = body.progressTo()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = body.userDefinedId()

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
    fun _category(): JsonField<ExternalPaymentCategory> = body._category()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    /**
     * Returns the raw JSON value of [paymentType].
     *
     * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentType(): JsonField<ExternalPaymentDirection> = body._paymentType()

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

    /**
     * Returns the raw JSON value of [progressTo].
     *
     * Unlike [progressTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _progressTo(): JsonField<ExternalPaymentProgressTo> = body._progressTo()

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): CreateExternalPaymentRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreateExternalPaymentRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<ExternalPaymentCategory> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_type")
        @ExcludeMissing
        private val paymentType: JsonField<ExternalPaymentDirection> = JsonMissing.of(),
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("progress_to")
        @ExcludeMissing
        private val progressTo: JsonField<ExternalPaymentProgressTo> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): ExternalPaymentCategory = category.getRequired("category")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentType(): ExternalPaymentDirection = paymentType.getRequired("payment_type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun progressTo(): Optional<ExternalPaymentProgressTo> =
            Optional.ofNullable(progressTo.getNullable("progress_to"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

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
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<ExternalPaymentCategory> = category

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

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
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<ExternalPaymentDirection> = paymentType

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

        /**
         * Returns the raw JSON value of [progressTo].
         *
         * Unlike [progressTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("progress_to")
        @ExcludeMissing
        fun _progressTo(): JsonField<ExternalPaymentProgressTo> = progressTo

        /**
         * Returns the raw JSON value of [userDefinedId].
         *
         * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreateExternalPaymentRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            category()
            effectiveDate()
            financialAccountToken()
            paymentType()
            token()
            memo()
            progressTo()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CreateExternalPaymentRequest].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .category()
             * .effectiveDate()
             * .financialAccountToken()
             * .paymentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateExternalPaymentRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var category: JsonField<ExternalPaymentCategory>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var paymentType: JsonField<ExternalPaymentDirection>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var progressTo: JsonField<ExternalPaymentProgressTo> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createExternalPaymentRequest: CreateExternalPaymentRequest) = apply {
                amount = createExternalPaymentRequest.amount
                category = createExternalPaymentRequest.category
                effectiveDate = createExternalPaymentRequest.effectiveDate
                financialAccountToken = createExternalPaymentRequest.financialAccountToken
                paymentType = createExternalPaymentRequest.paymentType
                token = createExternalPaymentRequest.token
                memo = createExternalPaymentRequest.memo
                progressTo = createExternalPaymentRequest.progressTo
                userDefinedId = createExternalPaymentRequest.userDefinedId
                additionalProperties =
                    createExternalPaymentRequest.additionalProperties.toMutableMap()
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun category(category: ExternalPaymentCategory) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed
             * [ExternalPaymentCategory] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun category(category: JsonField<ExternalPaymentCategory>) = apply {
                this.category = category
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

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

            fun paymentType(paymentType: ExternalPaymentDirection) =
                paymentType(JsonField.of(paymentType))

            /**
             * Sets [Builder.paymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentType] with a well-typed
             * [ExternalPaymentDirection] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
                this.paymentType = paymentType
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun progressTo(progressTo: ExternalPaymentProgressTo) =
                progressTo(JsonField.of(progressTo))

            /**
             * Sets [Builder.progressTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.progressTo] with a well-typed
             * [ExternalPaymentProgressTo] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
                this.progressTo = progressTo
            }

            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /**
             * Sets [Builder.userDefinedId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userDefinedId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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
             * Returns an immutable instance of [CreateExternalPaymentRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .category()
             * .effectiveDate()
             * .financialAccountToken()
             * .paymentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateExternalPaymentRequest =
                CreateExternalPaymentRequest(
                    checkRequired("amount", amount),
                    checkRequired("category", category),
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("paymentType", paymentType),
                    token,
                    memo,
                    progressTo,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreateExternalPaymentRequest && amount == other.amount && category == other.category && effectiveDate == other.effectiveDate && financialAccountToken == other.financialAccountToken && paymentType == other.paymentType && token == other.token && memo == other.memo && progressTo == other.progressTo && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, effectiveDate, financialAccountToken, paymentType, token, memo, progressTo, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateExternalPaymentRequest{amount=$amount, category=$category, effectiveDate=$effectiveDate, financialAccountToken=$financialAccountToken, paymentType=$paymentType, token=$token, memo=$memo, progressTo=$progressTo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalPaymentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .category()
         * .effectiveDate()
         * .financialAccountToken()
         * .paymentType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: CreateExternalPaymentRequest.Builder =
            CreateExternalPaymentRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalPaymentCreateParams: ExternalPaymentCreateParams) = apply {
            body = externalPaymentCreateParams.body.toBuilder()
            additionalHeaders = externalPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun category(category: ExternalPaymentCategory) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [ExternalPaymentCategory]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun category(category: JsonField<ExternalPaymentCategory>) = apply {
            body.category(category)
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

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

        fun paymentType(paymentType: ExternalPaymentDirection) = apply {
            body.paymentType(paymentType)
        }

        /**
         * Sets [Builder.paymentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentType] with a well-typed
         * [ExternalPaymentDirection] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
            body.paymentType(paymentType)
        }

        fun token(token: String) = apply { body.token(token) }

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        fun progressTo(progressTo: ExternalPaymentProgressTo) = apply {
            body.progressTo(progressTo)
        }

        /**
         * Sets [Builder.progressTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressTo] with a well-typed
         * [ExternalPaymentProgressTo] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
            body.progressTo(progressTo)
        }

        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

        /**
         * Sets [Builder.userDefinedId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            body.userDefinedId(userDefinedId)
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
         * Returns an immutable instance of [ExternalPaymentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .category()
         * .effectiveDate()
         * .financialAccountToken()
         * .paymentType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalPaymentCreateParams =
            ExternalPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ExternalPaymentCategory
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

            @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

            @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

            @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

            @JvmStatic fun of(value: String) = ExternalPaymentCategory(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentCategory]'s known values. */
        enum class Known {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
        }

        /**
         * An enum containing [ExternalPaymentCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentCategory] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
            /**
             * An enum member indicating that [ExternalPaymentCategory] was instantiated with an
             * unknown value.
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
                EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                EXTERNAL_ACH -> Value.EXTERNAL_ACH
                EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
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
                EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                EXTERNAL_ACH -> Known.EXTERNAL_ACH
                EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentCategory: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalPaymentDirection
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEPOSIT = of("DEPOSIT")

            @JvmField val WITHDRAWAL = of("WITHDRAWAL")

            @JvmStatic fun of(value: String) = ExternalPaymentDirection(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentDirection]'s known values. */
        enum class Known {
            DEPOSIT,
            WITHDRAWAL,
        }

        /**
         * An enum containing [ExternalPaymentDirection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEPOSIT,
            WITHDRAWAL,
            /**
             * An enum member indicating that [ExternalPaymentDirection] was instantiated with an
             * unknown value.
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
                DEPOSIT -> Value.DEPOSIT
                WITHDRAWAL -> Value.WITHDRAWAL
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
                DEPOSIT -> Known.DEPOSIT
                WITHDRAWAL -> Known.WITHDRAWAL
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentDirection: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalPaymentProgressTo
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val RELEASED = of("RELEASED")

            @JvmStatic fun of(value: String) = ExternalPaymentProgressTo(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentProgressTo]'s known values. */
        enum class Known {
            SETTLED,
            RELEASED,
        }

        /**
         * An enum containing [ExternalPaymentProgressTo]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentProgressTo] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SETTLED,
            RELEASED,
            /**
             * An enum member indicating that [ExternalPaymentProgressTo] was instantiated with an
             * unknown value.
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
                SETTLED -> Value.SETTLED
                RELEASED -> Value.RELEASED
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
                SETTLED -> Known.SETTLED
                RELEASED -> Known.RELEASED
                else ->
                    throw LithicInvalidDataException("Unknown ExternalPaymentProgressTo: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentProgressTo && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
