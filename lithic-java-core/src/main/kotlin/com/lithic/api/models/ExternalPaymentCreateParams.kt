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
    private val body: ExternalPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun amount(): Long = body.amount()

    fun category(): ExternalPaymentCategory = body.category()

    fun effectiveDate(): LocalDate = body.effectiveDate()

    fun financialAccountToken(): String = body.financialAccountToken()

    fun paymentType(): ExternalPaymentDirection = body.paymentType()

    fun token(): Optional<String> = body.token()

    fun memo(): Optional<String> = body.memo()

    fun progressTo(): Optional<ExternalPaymentProgressTo> = body.progressTo()

    fun userDefinedId(): Optional<String> = body.userDefinedId()

    fun _amount(): JsonField<Long> = body._amount()

    fun _category(): JsonField<ExternalPaymentCategory> = body._category()

    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    fun _paymentType(): JsonField<ExternalPaymentDirection> = body._paymentType()

    fun _token(): JsonField<String> = body._token()

    fun _memo(): JsonField<String> = body._memo()

    fun _progressTo(): JsonField<ExternalPaymentProgressTo> = body._progressTo()

    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ExternalPaymentCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ExternalPaymentCreateBody
    @JsonCreator
    internal constructor(
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

        fun amount(): Long = amount.getRequired("amount")

        fun category(): ExternalPaymentCategory = category.getRequired("category")

        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        fun paymentType(): ExternalPaymentDirection = paymentType.getRequired("payment_type")

        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        fun progressTo(): Optional<ExternalPaymentProgressTo> =
            Optional.ofNullable(progressTo.getNullable("progress_to"))

        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<ExternalPaymentCategory> = category

        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<ExternalPaymentDirection> = paymentType

        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonProperty("progress_to")
        @ExcludeMissing
        fun _progressTo(): JsonField<ExternalPaymentProgressTo> = progressTo

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalPaymentCreateBody = apply {
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

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalPaymentCreateBody]. */
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
            internal fun from(externalPaymentCreateBody: ExternalPaymentCreateBody) = apply {
                amount = externalPaymentCreateBody.amount
                category = externalPaymentCreateBody.category
                effectiveDate = externalPaymentCreateBody.effectiveDate
                financialAccountToken = externalPaymentCreateBody.financialAccountToken
                paymentType = externalPaymentCreateBody.paymentType
                token = externalPaymentCreateBody.token
                memo = externalPaymentCreateBody.memo
                progressTo = externalPaymentCreateBody.progressTo
                userDefinedId = externalPaymentCreateBody.userDefinedId
                additionalProperties = externalPaymentCreateBody.additionalProperties.toMutableMap()
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun category(category: ExternalPaymentCategory) = category(JsonField.of(category))

            fun category(category: JsonField<ExternalPaymentCategory>) = apply {
                this.category = category
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            fun paymentType(paymentType: ExternalPaymentDirection) =
                paymentType(JsonField.of(paymentType))

            fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
                this.paymentType = paymentType
            }

            fun token(token: String) = token(JsonField.of(token))

            fun token(token: JsonField<String>) = apply { this.token = token }

            fun memo(memo: String) = memo(JsonField.of(memo))

            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun progressTo(progressTo: ExternalPaymentProgressTo) =
                progressTo(JsonField.of(progressTo))

            fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
                this.progressTo = progressTo
            }

            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

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

            fun build(): ExternalPaymentCreateBody =
                ExternalPaymentCreateBody(
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

            return /* spotless:off */ other is ExternalPaymentCreateBody && amount == other.amount && category == other.category && effectiveDate == other.effectiveDate && financialAccountToken == other.financialAccountToken && paymentType == other.paymentType && token == other.token && memo == other.memo && progressTo == other.progressTo && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, effectiveDate, financialAccountToken, paymentType, token, memo, progressTo, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalPaymentCreateBody{amount=$amount, category=$category, effectiveDate=$effectiveDate, financialAccountToken=$financialAccountToken, paymentType=$paymentType, token=$token, memo=$memo, progressTo=$progressTo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ExternalPaymentCreateBody.Builder = ExternalPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalPaymentCreateParams: ExternalPaymentCreateParams) = apply {
            body = externalPaymentCreateParams.body.toBuilder()
            additionalHeaders = externalPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun amount(amount: Long) = apply { body.amount(amount) }

        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun category(category: ExternalPaymentCategory) = apply { body.category(category) }

        fun category(category: JsonField<ExternalPaymentCategory>) = apply {
            body.category(category)
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun paymentType(paymentType: ExternalPaymentDirection) = apply {
            body.paymentType(paymentType)
        }

        fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
            body.paymentType(paymentType)
        }

        fun token(token: String) = apply { body.token(token) }

        fun token(token: JsonField<String>) = apply { body.token(token) }

        fun memo(memo: String) = apply { body.memo(memo) }

        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        fun progressTo(progressTo: ExternalPaymentProgressTo) = apply {
            body.progressTo(progressTo)
        }

        fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
            body.progressTo(progressTo)
        }

        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

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

        fun build(): ExternalPaymentCreateParams =
            ExternalPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ExternalPaymentCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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
