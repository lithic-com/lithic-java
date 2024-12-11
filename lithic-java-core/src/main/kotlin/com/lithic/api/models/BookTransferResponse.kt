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
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = BookTransferResponse.Builder::class)
@NoAutoDetect
class BookTransferResponse
private constructor(
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<BookTransferEvent>>,
    private val fromFinancialAccountToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val toFinancialAccountToken: JsonValue,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Category of the book transfer */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the transfer occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    fun currency(): String = currency.getRequired("currency")

    /** A list of all financial events that have modified this transfer. */
    fun events(): List<BookTransferEvent> = events.getRequired("events")

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    fun fromFinancialAccountToken(): String =
        fromFinancialAccountToken.getRequired("from_financial_account_token")

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types: _ `DECLINED` - The transfer was declined. _ `REVERSED` - The transfer was
     * reversed \* `SETTLED` - The transfer is completed.
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Category of the book transfer */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the transfer occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A list of all financial events that have modified this transfer. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    @JsonProperty("from_financial_account_token")
    @ExcludeMissing
    fun _fromFinancialAccountToken() = fromFinancialAccountToken

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types: _ `DECLINED` - The transfer was declined. _ `REVERSED` - The transfer was
     * reversed \* `SETTLED` - The transfer is completed.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * Globally unique identifier for the financial account or card that will receive the funds.
     * Accepted type dependent on the program's use case.
     */
    @JsonProperty("to_financial_account_token")
    @ExcludeMissing
    fun _toFinancialAccountToken() = toFinancialAccountToken

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BookTransferResponse = apply {
        if (!validated) {
            category()
            created()
            currency()
            events().forEach { it.validate() }
            fromFinancialAccountToken()
            pendingAmount()
            result()
            settledAmount()
            status()
            token()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<BookTransferEvent>> = JsonMissing.of()
        private var fromFinancialAccountToken: JsonField<String> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var toFinancialAccountToken: JsonValue = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookTransferResponse: BookTransferResponse) = apply {
            this.category = bookTransferResponse.category
            this.created = bookTransferResponse.created
            this.currency = bookTransferResponse.currency
            this.events = bookTransferResponse.events
            this.fromFinancialAccountToken = bookTransferResponse.fromFinancialAccountToken
            this.pendingAmount = bookTransferResponse.pendingAmount
            this.result = bookTransferResponse.result
            this.settledAmount = bookTransferResponse.settledAmount
            this.status = bookTransferResponse.status
            this.toFinancialAccountToken = bookTransferResponse.toFinancialAccountToken
            this.token = bookTransferResponse.token
            this.updated = bookTransferResponse.updated
            additionalProperties(bookTransferResponse.additionalProperties)
        }

        /** Category of the book transfer */
        fun category(category: Category) = category(JsonField.of(category))

        /** Category of the book transfer */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the transfer occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transfer occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A list of all financial events that have modified this transfer. */
        fun events(events: List<BookTransferEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this transfer. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<BookTransferEvent>>) = apply { this.events = events }

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun fromFinancialAccountToken(fromFinancialAccountToken: String) =
            fromFinancialAccountToken(JsonField.of(fromFinancialAccountToken))

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("from_financial_account_token")
        @ExcludeMissing
        fun fromFinancialAccountToken(fromFinancialAccountToken: JsonField<String>) = apply {
            this.fromFinancialAccountToken = fromFinancialAccountToken
        }

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types: _ `DECLINED` - The transfer was declined. _ `REVERSED` - The transfer was
         * reversed \* `SETTLED` - The transfer is completed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types: _ `DECLINED` - The transfer was declined. _ `REVERSED` - The transfer was
         * reversed \* `SETTLED` - The transfer is completed.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Globally unique identifier for the financial account or card that will receive the funds.
         * Accepted type dependent on the program's use case.
         */
        @JsonProperty("to_financial_account_token")
        @ExcludeMissing
        fun toFinancialAccountToken(toFinancialAccountToken: JsonValue) = apply {
            this.toFinancialAccountToken = toFinancialAccountToken
        }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

        fun build(): BookTransferResponse =
            BookTransferResponse(
                category,
                created,
                currency,
                events.map { it.toImmutable() },
                fromFinancialAccountToken,
                pendingAmount,
                result,
                settledAmount,
                status,
                toFinancialAccountToken,
                token,
                updated,
                additionalProperties.toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    @JsonDeserialize(builder = BookTransferEvent.Builder::class)
    @NoAutoDetect
    class BookTransferEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val type: JsonField<String>,
        private val result: JsonField<Result>,
        private val created: JsonField<OffsetDateTime>,
        private val token: JsonField<String>,
        private val subtype: JsonField<String>,
        private val memo: JsonField<String>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Type of the book transfer */
        fun type(): String = type.getRequired("type")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Result = result.getRequired("result")

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** Globally unique identifier. */
        fun token(): String = token.getRequired("token")

        /** The program specific subtype code for the specified category/type. */
        fun subtype(): String = subtype.getRequired("subtype")

        /** Memo for the transfer. */
        fun memo(): String = memo.getRequired("memo")

        /** Detailed Results */
        fun detailedResults(): List<DetailedResult> =
            detailedResults.getRequired("detailed_results")

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Type of the book transfer */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /** The program specific subtype code for the specified category/type. */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

        /** Memo for the transfer. */
        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        /** Detailed Results */
        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BookTransferEvent = apply {
            if (!validated) {
                amount()
                type()
                result()
                created()
                token()
                subtype()
                memo()
                detailedResults()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var subtype: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookTransferEvent: BookTransferEvent) = apply {
                this.amount = bookTransferEvent.amount
                this.type = bookTransferEvent.type
                this.result = bookTransferEvent.result
                this.created = bookTransferEvent.created
                this.token = bookTransferEvent.token
                this.subtype = bookTransferEvent.subtype
                this.memo = bookTransferEvent.memo
                this.detailedResults = bookTransferEvent.detailedResults
                additionalProperties(bookTransferEvent.additionalProperties)
            }

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Type of the book transfer */
            fun type(type: String) = type(JsonField.of(type))

            /** Type of the book transfer */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** The program specific subtype code for the specified category/type. */
            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            /** The program specific subtype code for the specified category/type. */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

            /** Memo for the transfer. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** Memo for the transfer. */
            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** Detailed Results */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /** Detailed Results */
            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

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

            fun build(): BookTransferEvent =
                BookTransferEvent(
                    amount,
                    type,
                    result,
                    created,
                    token,
                    subtype,
                    memo,
                    detailedResults.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
            }

            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                DECLINED,
            }

            enum class Value {
                APPROVED,
                DECLINED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookTransferEvent && amount == other.amount && type == other.type && result == other.result && created == other.created && token == other.token && subtype == other.subtype && memo == other.memo && detailedResults == other.detailedResults && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, type, result, created, token, subtype, memo, detailedResults, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookTransferEvent{amount=$amount, type=$type, result=$result, created=$created, token=$token, subtype=$subtype, memo=$memo, detailedResults=$detailedResults, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val REVERSED = of("REVERSED")

            @JvmField val SETTLED = of("SETTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            REVERSED,
            SETTLED,
        }

        enum class Value {
            DECLINED,
            REVERSED,
            SETTLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
                SETTLED -> Value.SETTLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
                SETTLED -> Known.SETTLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferResponse && category == other.category && created == other.created && currency == other.currency && events == other.events && fromFinancialAccountToken == other.fromFinancialAccountToken && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && toFinancialAccountToken == other.toFinancialAccountToken && token == other.token && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(category, created, currency, events, fromFinancialAccountToken, pendingAmount, result, settledAmount, status, toFinancialAccountToken, token, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookTransferResponse{category=$category, created=$created, currency=$currency, events=$events, fromFinancialAccountToken=$fromFinancialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, toFinancialAccountToken=$toFinancialAccountToken, token=$token, updated=$updated, additionalProperties=$additionalProperties}"
}
