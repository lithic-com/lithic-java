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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Transfer.Builder::class)
@NoAutoDetect
class Transfer
private constructor(
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<FinancialEvent>>,
    private val fromBalance: JsonField<List<Balance>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val toBalance: JsonField<List<Balance>>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Status types:
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    fun category(): Optional<Category> = Optional.ofNullable(category.getNullable("category"))

    /** Date and time when the transfer occurred. UTC time zone. */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** A string that provides a description of the transfer; may be useful to display to users. */
    fun descriptor(): Optional<String> = Optional.ofNullable(descriptor.getNullable("descriptor"))

    /** A list of all financial events that have modified this trasnfer. */
    fun events(): Optional<List<FinancialEvent>> = Optional.ofNullable(events.getNullable("events"))

    /** The updated balance of the sending financial account. */
    fun fromBalance(): Optional<List<Balance>> =
        Optional.ofNullable(fromBalance.getNullable("from_balance"))

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    fun pendingAmount(): Optional<Long> =
        Optional.ofNullable(pendingAmount.getNullable("pending_amount"))

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     */
    fun settledAmount(): Optional<Long> =
        Optional.ofNullable(settledAmount.getNullable("settled_amount"))

    /**
     * Status types:
     * - `DECLINED` - The transfer was declined.
     * - `EXPIRED` - The transfer was held in pending for too long and expired.
     * - `PENDING` - The transfer is pending release from a hold.
     * - `SETTLED` - The transfer is completed.
     * - `VOIDED` - The transfer was reversed before it settled.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /** The updated balance of the receiving financial account. */
    fun toBalance(): Optional<List<Balance>> =
        Optional.ofNullable(toBalance.getNullable("to_balance"))

    /** Globally unique identifier for the transfer event. */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): Optional<OffsetDateTime> = Optional.ofNullable(updated.getNullable("updated"))

    /**
     * Status types:
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the transfer occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the transfer; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all financial events that have modified this trasnfer. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /** The updated balance of the sending financial account. */
    @JsonProperty("from_balance") @ExcludeMissing fun _fromBalance() = fromBalance

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
     * Status types:
     * - `DECLINED` - The transfer was declined.
     * - `EXPIRED` - The transfer was held in pending for too long and expired.
     * - `PENDING` - The transfer is pending release from a hold.
     * - `SETTLED` - The transfer is completed.
     * - `VOIDED` - The transfer was reversed before it settled.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The updated balance of the receiving financial account. */
    @JsonProperty("to_balance") @ExcludeMissing fun _toBalance() = toBalance

    /** Globally unique identifier for the transfer event. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transfer = apply {
        if (!validated) {
            category()
            created()
            currency()
            descriptor()
            events().map { it.forEach { it.validate() } }
            fromBalance().map { it.forEach { it.validate() } }
            pendingAmount()
            result()
            settledAmount()
            status()
            toBalance().map { it.forEach { it.validate() } }
            token()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transfer &&
            this.category == other.category &&
            this.created == other.created &&
            this.currency == other.currency &&
            this.descriptor == other.descriptor &&
            this.events == other.events &&
            this.fromBalance == other.fromBalance &&
            this.pendingAmount == other.pendingAmount &&
            this.result == other.result &&
            this.settledAmount == other.settledAmount &&
            this.status == other.status &&
            this.toBalance == other.toBalance &&
            this.token == other.token &&
            this.updated == other.updated &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    category,
                    created,
                    currency,
                    descriptor,
                    events,
                    fromBalance,
                    pendingAmount,
                    result,
                    settledAmount,
                    status,
                    toBalance,
                    token,
                    updated,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transfer{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, fromBalance=$fromBalance, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, toBalance=$toBalance, token=$token, updated=$updated, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<FinancialEvent>> = JsonMissing.of()
        private var fromBalance: JsonField<List<Balance>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var toBalance: JsonField<List<Balance>> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transfer: Transfer) = apply {
            this.category = transfer.category
            this.created = transfer.created
            this.currency = transfer.currency
            this.descriptor = transfer.descriptor
            this.events = transfer.events
            this.fromBalance = transfer.fromBalance
            this.pendingAmount = transfer.pendingAmount
            this.result = transfer.result
            this.settledAmount = transfer.settledAmount
            this.status = transfer.status
            this.toBalance = transfer.toBalance
            this.token = transfer.token
            this.updated = transfer.updated
            additionalProperties(transfer.additionalProperties)
        }

        /**
         * Status types:
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Status types:
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
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

        /**
         * A string that provides a description of the transfer; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the transfer; may be useful to display to users.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all financial events that have modified this trasnfer. */
        fun events(events: List<FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this trasnfer. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<FinancialEvent>>) = apply { this.events = events }

        /** The updated balance of the sending financial account. */
        fun fromBalance(fromBalance: List<Balance>) = fromBalance(JsonField.of(fromBalance))

        /** The updated balance of the sending financial account. */
        @JsonProperty("from_balance")
        @ExcludeMissing
        fun fromBalance(fromBalance: JsonField<List<Balance>>) = apply {
            this.fromBalance = fromBalance
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
         * Status types:
         * - `DECLINED` - The transfer was declined.
         * - `EXPIRED` - The transfer was held in pending for too long and expired.
         * - `PENDING` - The transfer is pending release from a hold.
         * - `SETTLED` - The transfer is completed.
         * - `VOIDED` - The transfer was reversed before it settled.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The transfer was declined.
         * - `EXPIRED` - The transfer was held in pending for too long and expired.
         * - `PENDING` - The transfer is pending release from a hold.
         * - `SETTLED` - The transfer is completed.
         * - `VOIDED` - The transfer was reversed before it settled.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The updated balance of the receiving financial account. */
        fun toBalance(toBalance: List<Balance>) = toBalance(JsonField.of(toBalance))

        /** The updated balance of the receiving financial account. */
        @JsonProperty("to_balance")
        @ExcludeMissing
        fun toBalance(toBalance: JsonField<List<Balance>>) = apply { this.toBalance = toBalance }

        /** Globally unique identifier for the transfer event. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the transfer event. */
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

        fun build(): Transfer =
            Transfer(
                category,
                created,
                currency,
                descriptor,
                events.map { it.toUnmodifiable() },
                fromBalance.map { it.toUnmodifiable() },
                pendingAmount,
                result,
                settledAmount,
                status,
                toBalance.map { it.toUnmodifiable() },
                token,
                updated,
                additionalProperties.toUnmodifiable(),
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

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TRANSFER = Category(JsonField.of("TRANSFER"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            TRANSFER,
        }

        enum class Value {
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = FinancialEvent.Builder::class)
    @NoAutoDetect
    class FinancialEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<FinancialEventType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /** More detailed reasons for the event */
        fun detailedResults(): Optional<List<DetailedResult>> =
            Optional.ofNullable(detailedResults.getNullable("detailed_results"))

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        /** Globally unique identifier. */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         *   on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         *   by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         *   additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         *   funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         *   balance of the sender.
         */
        fun type(): Optional<FinancialEventType> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** More detailed reasons for the event */
        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         *   on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         *   by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         *   additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         *   funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         *   balance of the sender.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FinancialEvent = apply {
            if (!validated) {
                amount()
                created()
                detailedResults()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialEvent &&
                this.amount == other.amount &&
                this.created == other.created &&
                this.detailedResults == other.detailedResults &&
                this.result == other.result &&
                this.token == other.token &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        created,
                        detailedResults,
                        result,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FinancialEvent{amount=$amount, created=$created, detailedResults=$detailedResults, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<FinancialEventType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialEvent: FinancialEvent) = apply {
                this.amount = financialEvent.amount
                this.created = financialEvent.created
                this.detailedResults = financialEvent.detailedResults
                this.result = financialEvent.result
                this.token = financialEvent.token
                this.type = financialEvent.type
                additionalProperties(financialEvent.additionalProperties)
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

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /** More detailed reasons for the event */
            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

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

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * - `AUTHORIZATION` - Authorize a card transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
             * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has
             *   occurred on a card.
             * - `CLEARING` - Card Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             *   behalf by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
             *   additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             *   card funds without additional clearing.
             * - `RETURN` - A card refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses
             *   an incorrect refund).
             * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
             * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to
             *   insufficient balance of the sender.
             */
            fun type(type: FinancialEventType) = type(JsonField.of(type))

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * - `AUTHORIZATION` - Authorize a card transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
             * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has
             *   occurred on a card.
             * - `CLEARING` - Card Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             *   behalf by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
             *   additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             *   card funds without additional clearing.
             * - `RETURN` - A card refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses
             *   an incorrect refund).
             * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
             * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to
             *   insufficient balance of the sender.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<FinancialEventType>) = apply { this.type = type }

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

            fun build(): FinancialEvent =
                FinancialEvent(
                    amount,
                    created,
                    detailedResults.map { it.toUnmodifiable() },
                    result,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
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

                return other is DetailedResult && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = DetailedResult(JsonField.of("APPROVED"))

                @JvmField
                val FUNDS_INSUFFICIENT = DetailedResult(JsonField.of("FUNDS_INSUFFICIENT"))

                @JvmField val ACCOUNT_INVALID = DetailedResult(JsonField.of("ACCOUNT_INVALID"))

                @JvmField
                val PROGRAM_TRANSACTION_LIMITS_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_TRANSACTION_LIMITS_EXCEEDED"))

                @JvmField
                val PROGRAM_DAILY_LIMITS_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_DAILY_LIMITS_EXCEEDED"))

                @JvmField
                val PROGRAM_MONTHLY_LIMITS_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_MONTHLY_LIMITS_EXCEEDED"))

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMITS_EXCEEDED,
                PROGRAM_DAILY_LIMITS_EXCEEDED,
                PROGRAM_MONTHLY_LIMITS_EXCEEDED,
            }

            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMITS_EXCEEDED,
                PROGRAM_DAILY_LIMITS_EXCEEDED,
                PROGRAM_MONTHLY_LIMITS_EXCEEDED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMITS_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMITS_EXCEEDED
                    PROGRAM_DAILY_LIMITS_EXCEEDED -> Value.PROGRAM_DAILY_LIMITS_EXCEEDED
                    PROGRAM_MONTHLY_LIMITS_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMITS_EXCEEDED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMITS_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMITS_EXCEEDED
                    PROGRAM_DAILY_LIMITS_EXCEEDED -> Known.PROGRAM_DAILY_LIMITS_EXCEEDED
                    PROGRAM_MONTHLY_LIMITS_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMITS_EXCEEDED
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

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

                @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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

        class FinancialEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FinancialEventType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACH_ORIGINATION_CANCELLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_CANCELLED"))

                @JvmField
                val ACH_ORIGINATION_INITIATED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_INITIATED"))

                @JvmField
                val ACH_ORIGINATION_PROCESSED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_PROCESSED"))

                @JvmField
                val ACH_ORIGINATION_SETTLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_SETTLED"))

                @JvmField
                val ACH_ORIGINATION_RELEASED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_RELEASED"))

                @JvmField
                val ACH_ORIGINATION_REVIEWED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_REVIEWED"))

                @JvmField
                val ACH_RECEIPT_PROCESSED =
                    FinancialEventType(JsonField.of("ACH_RECEIPT_PROCESSED"))

                @JvmField
                val ACH_RECEIPT_SETTLED = FinancialEventType(JsonField.of("ACH_RECEIPT_SETTLED"))

                @JvmField
                val ACH_RETURN_INITIATED = FinancialEventType(JsonField.of("ACH_RETURN_INITIATED"))

                @JvmField
                val ACH_RETURN_PROCESSED = FinancialEventType(JsonField.of("ACH_RETURN_PROCESSED"))

                @JvmField val AUTHORIZATION = FinancialEventType(JsonField.of("AUTHORIZATION"))

                @JvmField
                val AUTHORIZATION_ADVICE = FinancialEventType(JsonField.of("AUTHORIZATION_ADVICE"))

                @JvmField
                val AUTHORIZATION_EXPIRY = FinancialEventType(JsonField.of("AUTHORIZATION_EXPIRY"))

                @JvmField
                val AUTHORIZATION_REVERSAL =
                    FinancialEventType(JsonField.of("AUTHORIZATION_REVERSAL"))

                @JvmField val BALANCE_INQUIRY = FinancialEventType(JsonField.of("BALANCE_INQUIRY"))

                @JvmField val CLEARING = FinancialEventType(JsonField.of("CLEARING"))

                @JvmField
                val CORRECTION_CREDIT = FinancialEventType(JsonField.of("CORRECTION_CREDIT"))

                @JvmField
                val CORRECTION_DEBIT = FinancialEventType(JsonField.of("CORRECTION_DEBIT"))

                @JvmField
                val CREDIT_AUTHORIZATION = FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION"))

                @JvmField
                val CREDIT_AUTHORIZATION_ADVICE =
                    FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION_ADVICE"))

                @JvmField
                val FINANCIAL_AUTHORIZATION =
                    FinancialEventType(JsonField.of("FINANCIAL_AUTHORIZATION"))

                @JvmField
                val FINANCIAL_CREDIT_AUTHORIZATION =
                    FinancialEventType(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

                @JvmField val RETURN = FinancialEventType(JsonField.of("RETURN"))

                @JvmField val RETURN_REVERSAL = FinancialEventType(JsonField.of("RETURN_REVERSAL"))

                @JvmField val TRANSFER = FinancialEventType(JsonField.of("TRANSFER"))

                @JvmField
                val TRANSFER_INSUFFICIENT_FUNDS =
                    FinancialEventType(JsonField.of("TRANSFER_INSUFFICIENT_FUNDS"))

                @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
            }

            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    AUTHORIZATION -> Value.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                    CLEARING -> Value.CLEARING
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    TRANSFER -> Value.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    AUTHORIZATION -> Known.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                    CLEARING -> Known.CLEARING
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    TRANSFER -> Known.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                    else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
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

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

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

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
