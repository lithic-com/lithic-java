// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class BookTransferCreateParams
constructor(
    private val body: BookTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This should
     * always be a positive value.
     */
    fun amount(): Long = body.amount()

    /** Category of the book transfer */
    fun category(): Category = body.category()

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    fun fromFinancialAccountToken(): String = body.fromFinancialAccountToken()

    /** The program specific subtype code for the specified category/type. */
    fun subtype(): String = body.subtype()

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case.
     */
    fun toFinancialAccountToken(): String = body.toFinancialAccountToken()

    /** Type of book_transfer */
    fun type(): Type = body.type()

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    fun token(): Optional<String> = body.token()

    /** Optional descriptor for the transfer. */
    fun memo(): Optional<String> = body.memo()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): BookTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BookTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("category") private val category: Category,
        @JsonProperty("from_financial_account_token") private val fromFinancialAccountToken: String,
        @JsonProperty("subtype") private val subtype: String,
        @JsonProperty("to_financial_account_token") private val toFinancialAccountToken: String,
        @JsonProperty("type") private val type: Type,
        @JsonProperty("token") private val token: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        @JsonProperty("amount") fun amount(): Long = amount

        /** Category of the book transfer */
        @JsonProperty("category") fun category(): Category = category

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("from_financial_account_token")
        fun fromFinancialAccountToken(): String = fromFinancialAccountToken

        /** The program specific subtype code for the specified category/type. */
        @JsonProperty("subtype") fun subtype(): String = subtype

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("to_financial_account_token")
        fun toFinancialAccountToken(): String = toFinancialAccountToken

        /** Type of book_transfer */
        @JsonProperty("type") fun type(): Type = type

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") fun token(): Optional<String> = Optional.ofNullable(token)

        /** Optional descriptor for the transfer. */
        @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var category: Category? = null
            private var fromFinancialAccountToken: String? = null
            private var subtype: String? = null
            private var toFinancialAccountToken: String? = null
            private var type: Type? = null
            private var token: String? = null
            private var memo: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookTransferCreateBody: BookTransferCreateBody) = apply {
                amount = bookTransferCreateBody.amount
                category = bookTransferCreateBody.category
                fromFinancialAccountToken = bookTransferCreateBody.fromFinancialAccountToken
                subtype = bookTransferCreateBody.subtype
                toFinancialAccountToken = bookTransferCreateBody.toFinancialAccountToken
                type = bookTransferCreateBody.type
                token = bookTransferCreateBody.token
                memo = bookTransferCreateBody.memo
                additionalProperties = bookTransferCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
             * should always be a positive value.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /** Category of the book transfer */
            fun category(category: Category) = apply { this.category = category }

            /**
             * Globally unique identifier for the financial account or card that will send the
             * funds. Accepted type dependent on the program's use case.
             */
            fun fromFinancialAccountToken(fromFinancialAccountToken: String) = apply {
                this.fromFinancialAccountToken = fromFinancialAccountToken
            }

            /** The program specific subtype code for the specified category/type. */
            fun subtype(subtype: String) = apply { this.subtype = subtype }

            /**
             * Globally unique identifier for the financial account or card that will receive the
             * funds. Accepted type dependent on the program's use case.
             */
            fun toFinancialAccountToken(toFinancialAccountToken: String) = apply {
                this.toFinancialAccountToken = toFinancialAccountToken
            }

            /** Type of book_transfer */
            fun type(type: Type) = apply { this.type = type }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: String) = apply { this.token = token }

            /** Optional descriptor for the transfer. */
            fun memo(memo: String) = apply { this.memo = memo }

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

            fun build(): BookTransferCreateBody =
                BookTransferCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(fromFinancialAccountToken) {
                        "`fromFinancialAccountToken` is required but was not set"
                    },
                    checkNotNull(subtype) { "`subtype` is required but was not set" },
                    checkNotNull(toFinancialAccountToken) {
                        "`toFinancialAccountToken` is required but was not set"
                    },
                    checkNotNull(type) { "`type` is required but was not set" },
                    token,
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookTransferCreateBody && amount == other.amount && category == other.category && fromFinancialAccountToken == other.fromFinancialAccountToken && subtype == other.subtype && toFinancialAccountToken == other.toFinancialAccountToken && type == other.type && token == other.token && memo == other.memo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, fromFinancialAccountToken, subtype, toFinancialAccountToken, type, token, memo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookTransferCreateBody{amount=$amount, category=$category, fromFinancialAccountToken=$fromFinancialAccountToken, subtype=$subtype, toFinancialAccountToken=$toFinancialAccountToken, type=$type, token=$token, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: BookTransferCreateBody.Builder = BookTransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookTransferCreateParams: BookTransferCreateParams) = apply {
            body = bookTransferCreateParams.body.toBuilder()
            additionalHeaders = bookTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Amount to be transferred in the currency’s smallest unit (e.g., cents for USD). This
         * should always be a positive value.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Category of the book transfer */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: String) = apply {
            body.fromFinancialAccountToken(fromFinancialAccountToken)
        }

        /** The program specific subtype code for the specified category/type. */
        fun subtype(subtype: String) = apply { body.subtype(subtype) }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        fun toFinancialAccountToken(toFinancialAccountToken: String) = apply {
            body.toFinancialAccountToken(toFinancialAccountToken)
        }

        /** Type of book_transfer */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = apply { body.token(token) }

        /** Optional descriptor for the transfer. */
        fun memo(memo: String) = apply { body.memo(memo) }

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

        fun build(): BookTransferCreateParams =
            BookTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        enum class Known {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
        }

        enum class Value {
            ADJUSTMENT,
            BALANCE_OR_FUNDING,
            DERECOGNITION,
            DISPUTE,
            FEE,
            REWARD,
            TRANSFER,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val TRANSFER = of("TRANSFER")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

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
            TRANSFER,
        }

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
            TRANSFER,
            _UNKNOWN,
        }

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
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

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
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
