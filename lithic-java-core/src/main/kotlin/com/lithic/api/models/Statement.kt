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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Statement.Builder::class)
@NoAutoDetect
class Statement
private constructor(
    private val token: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val statementStartDate: JsonField<LocalDate>,
    private val statementEndDate: JsonField<LocalDate>,
    private val paymentDueDate: JsonField<LocalDate>,
    private val daysInBillingCycle: JsonField<Long>,
    private val creditLimit: JsonField<Long>,
    private val availableCredit: JsonField<Long>,
    private val startingBalance: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val amountDue: JsonField<Long>,
    private val amountPastDue: JsonField<Long>,
    private val periodTotals: JsonField<StatementTotals>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val creditProductToken: JsonField<String>,
    private val accountStanding: JsonField<AccountStanding>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for a statement */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Date when the billing period began */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    /** Date when the billing period ended */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /** Date when the payment is due */
    fun paymentDueDate(): LocalDate = paymentDueDate.getRequired("payment_due_date")

    /** Number of days in the billing cycle */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender.
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Amount of credit available to spend */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /** Balance at the start of the billing period */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due.
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * Payment due at the end of the billing period. Negative amount indicates something is owed. If
     * the amount owed is positive (e.g., there was a net credit), then payment should be returned
     * to the cardholder via ACH.
     */
    fun amountDue(): Long = amountDue.getRequired("amount_due")

    /** Payment past due at the end of the billing period. */
    fun amountPastDue(): Long = amountPastDue.getRequired("amount_past_due")

    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /** Timestamp of when the statement was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Timestamp of when the statement was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Globally unique identifier for a credit product */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    /** Globally unique identifier for a statement */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Date when the billing period began */
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    fun _statementStartDate() = statementStartDate

    /** Date when the billing period ended */
    @JsonProperty("statement_end_date") @ExcludeMissing fun _statementEndDate() = statementEndDate

    /** Date when the payment is due */
    @JsonProperty("payment_due_date") @ExcludeMissing fun _paymentDueDate() = paymentDueDate

    /** Number of days in the billing cycle */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle() = daysInBillingCycle

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    /** Amount of credit available to spend */
    @JsonProperty("available_credit") @ExcludeMissing fun _availableCredit() = availableCredit

    /** Balance at the start of the billing period */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due.
     */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    /**
     * Payment due at the end of the billing period. Negative amount indicates something is owed. If
     * the amount owed is positive (e.g., there was a net credit), then payment should be returned
     * to the cardholder via ACH.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue() = amountDue

    /** Payment past due at the end of the billing period. */
    @JsonProperty("amount_past_due") @ExcludeMissing fun _amountPastDue() = amountPastDue

    @JsonProperty("period_totals") @ExcludeMissing fun _periodTotals() = periodTotals

    @JsonProperty("ytd_totals") @ExcludeMissing fun _ytdTotals() = ytdTotals

    /** Timestamp of when the statement was created */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Timestamp of when the statement was updated */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    /** Globally unique identifier for a credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken() = creditProductToken

    @JsonProperty("account_standing") @ExcludeMissing fun _accountStanding() = accountStanding

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Statement = apply {
        if (!validated) {
            token()
            financialAccountToken()
            statementStartDate()
            statementEndDate()
            paymentDueDate()
            daysInBillingCycle()
            creditLimit()
            availableCredit()
            startingBalance()
            endingBalance()
            amountDue()
            amountPastDue()
            periodTotals().validate()
            ytdTotals().validate()
            created()
            updated()
            creditProductToken()
            accountStanding().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Statement &&
            this.token == other.token &&
            this.financialAccountToken == other.financialAccountToken &&
            this.statementStartDate == other.statementStartDate &&
            this.statementEndDate == other.statementEndDate &&
            this.paymentDueDate == other.paymentDueDate &&
            this.daysInBillingCycle == other.daysInBillingCycle &&
            this.creditLimit == other.creditLimit &&
            this.availableCredit == other.availableCredit &&
            this.startingBalance == other.startingBalance &&
            this.endingBalance == other.endingBalance &&
            this.amountDue == other.amountDue &&
            this.amountPastDue == other.amountPastDue &&
            this.periodTotals == other.periodTotals &&
            this.ytdTotals == other.ytdTotals &&
            this.created == other.created &&
            this.updated == other.updated &&
            this.creditProductToken == other.creditProductToken &&
            this.accountStanding == other.accountStanding &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    financialAccountToken,
                    statementStartDate,
                    statementEndDate,
                    paymentDueDate,
                    daysInBillingCycle,
                    creditLimit,
                    availableCredit,
                    startingBalance,
                    endingBalance,
                    amountDue,
                    amountPastDue,
                    periodTotals,
                    ytdTotals,
                    created,
                    updated,
                    creditProductToken,
                    accountStanding,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Statement{token=$token, financialAccountToken=$financialAccountToken, statementStartDate=$statementStartDate, statementEndDate=$statementEndDate, paymentDueDate=$paymentDueDate, daysInBillingCycle=$daysInBillingCycle, creditLimit=$creditLimit, availableCredit=$availableCredit, startingBalance=$startingBalance, endingBalance=$endingBalance, amountDue=$amountDue, amountPastDue=$amountPastDue, periodTotals=$periodTotals, ytdTotals=$ytdTotals, created=$created, updated=$updated, creditProductToken=$creditProductToken, accountStanding=$accountStanding, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var statementStartDate: JsonField<LocalDate> = JsonMissing.of()
        private var statementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var paymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var daysInBillingCycle: JsonField<Long> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var availableCredit: JsonField<Long> = JsonMissing.of()
        private var startingBalance: JsonField<Long> = JsonMissing.of()
        private var endingBalance: JsonField<Long> = JsonMissing.of()
        private var amountDue: JsonField<Long> = JsonMissing.of()
        private var amountPastDue: JsonField<Long> = JsonMissing.of()
        private var periodTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var ytdTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var accountStanding: JsonField<AccountStanding> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statement: Statement) = apply {
            this.token = statement.token
            this.financialAccountToken = statement.financialAccountToken
            this.statementStartDate = statement.statementStartDate
            this.statementEndDate = statement.statementEndDate
            this.paymentDueDate = statement.paymentDueDate
            this.daysInBillingCycle = statement.daysInBillingCycle
            this.creditLimit = statement.creditLimit
            this.availableCredit = statement.availableCredit
            this.startingBalance = statement.startingBalance
            this.endingBalance = statement.endingBalance
            this.amountDue = statement.amountDue
            this.amountPastDue = statement.amountPastDue
            this.periodTotals = statement.periodTotals
            this.ytdTotals = statement.ytdTotals
            this.created = statement.created
            this.updated = statement.updated
            this.creditProductToken = statement.creditProductToken
            this.accountStanding = statement.accountStanding
            additionalProperties(statement.additionalProperties)
        }

        /** Globally unique identifier for a statement */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a statement */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: LocalDate) =
            statementStartDate(JsonField.of(statementStartDate))

        /** Date when the billing period began */
        @JsonProperty("statement_start_date")
        @ExcludeMissing
        fun statementStartDate(statementStartDate: JsonField<LocalDate>) = apply {
            this.statementStartDate = statementStartDate
        }

        /** Date when the billing period ended */
        fun statementEndDate(statementEndDate: LocalDate) =
            statementEndDate(JsonField.of(statementEndDate))

        /** Date when the billing period ended */
        @JsonProperty("statement_end_date")
        @ExcludeMissing
        fun statementEndDate(statementEndDate: JsonField<LocalDate>) = apply {
            this.statementEndDate = statementEndDate
        }

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate) = paymentDueDate(JsonField.of(paymentDueDate))

        /** Date when the payment is due */
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
        }

        /** Number of days in the billing cycle */
        fun daysInBillingCycle(daysInBillingCycle: Long) =
            daysInBillingCycle(JsonField.of(daysInBillingCycle))

        /** Number of days in the billing cycle */
        @JsonProperty("days_in_billing_cycle")
        @ExcludeMissing
        fun daysInBillingCycle(daysInBillingCycle: JsonField<Long>) = apply {
            this.daysInBillingCycle = daysInBillingCycle
        }

        /**
         * For prepay accounts, this is the minimum prepay balance that must be maintained. For
         * charge card accounts, this is the maximum credit balance extended by a lender.
         */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /**
         * For prepay accounts, this is the minimum prepay balance that must be maintained. For
         * charge card accounts, this is the maximum credit balance extended by a lender.
         */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Amount of credit available to spend */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend */
        @JsonProperty("available_credit")
        @ExcludeMissing
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        /** Balance at the start of the billing period */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** Balance at the start of the billing period */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /**
         * Balance at the end of the billing period. For charge cards, this should be the same at
         * the statement amount due.
         */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Balance at the end of the billing period. For charge cards, this should be the same at
         * the statement amount due.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /**
         * Payment due at the end of the billing period. Negative amount indicates something is
         * owed. If the amount owed is positive (e.g., there was a net credit), then payment should
         * be returned to the cardholder via ACH.
         */
        fun amountDue(amountDue: Long) = amountDue(JsonField.of(amountDue))

        /**
         * Payment due at the end of the billing period. Negative amount indicates something is
         * owed. If the amount owed is positive (e.g., there was a net credit), then payment should
         * be returned to the cardholder via ACH.
         */
        @JsonProperty("amount_due")
        @ExcludeMissing
        fun amountDue(amountDue: JsonField<Long>) = apply { this.amountDue = amountDue }

        /** Payment past due at the end of the billing period. */
        fun amountPastDue(amountPastDue: Long) = amountPastDue(JsonField.of(amountPastDue))

        /** Payment past due at the end of the billing period. */
        @JsonProperty("amount_past_due")
        @ExcludeMissing
        fun amountPastDue(amountPastDue: JsonField<Long>) = apply {
            this.amountPastDue = amountPastDue
        }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        @JsonProperty("period_totals")
        @ExcludeMissing
        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        @JsonProperty("ytd_totals")
        @ExcludeMissing
        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        /** Timestamp of when the statement was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the statement was created */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Timestamp of when the statement was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Timestamp of when the statement was updated */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for a credit product */
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        @JsonProperty("account_standing")
        @ExcludeMissing
        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
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

        fun build(): Statement =
            Statement(
                token,
                financialAccountToken,
                statementStartDate,
                statementEndDate,
                paymentDueDate,
                daysInBillingCycle,
                creditLimit,
                availableCredit,
                startingBalance,
                endingBalance,
                amountDue,
                amountPastDue,
                periodTotals,
                ytdTotals,
                created,
                updated,
                creditProductToken,
                accountStanding,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AccountStanding.Builder::class)
    @NoAutoDetect
    class AccountStanding
    private constructor(
        private val state: JsonField<AccountState2>,
        private val periodNumber: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun state(): AccountState2 = state.getRequired("state")

        /** Current overall period number */
        fun periodNumber(): Long = periodNumber.getRequired("period_number")

        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /** Current overall period number */
        @JsonProperty("period_number") @ExcludeMissing fun _periodNumber() = periodNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountStanding = apply {
            if (!validated) {
                state()
                periodNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountStanding &&
                this.state == other.state &&
                this.periodNumber == other.periodNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        state,
                        periodNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountStanding{state=$state, periodNumber=$periodNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var state: JsonField<AccountState2> = JsonMissing.of()
            private var periodNumber: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStanding: AccountStanding) = apply {
                this.state = accountStanding.state
                this.periodNumber = accountStanding.periodNumber
                additionalProperties(accountStanding.additionalProperties)
            }

            fun state(state: AccountState2) = state(JsonField.of(state))

            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<AccountState2>) = apply { this.state = state }

            /** Current overall period number */
            fun periodNumber(periodNumber: Long) = periodNumber(JsonField.of(periodNumber))

            /** Current overall period number */
            @JsonProperty("period_number")
            @ExcludeMissing
            fun periodNumber(periodNumber: JsonField<Long>) = apply {
                this.periodNumber = periodNumber
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

            fun build(): AccountStanding =
                AccountStanding(
                    state,
                    periodNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AccountState2
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountState2 && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val STANDARD = AccountState2(JsonField.of("STANDARD"))

                @JvmField val PROMO = AccountState2(JsonField.of("PROMO"))

                @JvmField val PENALTY = AccountState2(JsonField.of("PENALTY"))

                @JvmStatic fun of(value: String) = AccountState2(JsonField.of(value))
            }

            enum class Known {
                STANDARD,
                PROMO,
                PENALTY,
            }

            enum class Value {
                STANDARD,
                PROMO,
                PENALTY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STANDARD -> Value.STANDARD
                    PROMO -> Value.PROMO
                    PENALTY -> Value.PENALTY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STANDARD -> Known.STANDARD
                    PROMO -> Known.PROMO
                    PENALTY -> Known.PENALTY
                    else -> throw LithicInvalidDataException("Unknown AccountState2: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = StatementTotals.Builder::class)
    @NoAutoDetect
    class StatementTotals
    private constructor(
        private val payments: JsonField<Long>,
        private val purchases: JsonField<Long>,
        private val fees: JsonField<Long>,
        private val credits: JsonField<Long>,
        private val interest: JsonField<Long>,
        private val cashAdvances: JsonField<Long>,
        private val balanceTransfers: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun payments(): Long = payments.getRequired("payments")

        fun purchases(): Long = purchases.getRequired("purchases")

        fun fees(): Long = fees.getRequired("fees")

        fun credits(): Long = credits.getRequired("credits")

        fun interest(): Long = interest.getRequired("interest")

        fun cashAdvances(): Long = cashAdvances.getRequired("cash_advances")

        fun balanceTransfers(): Long = balanceTransfers.getRequired("balance_transfers")

        @JsonProperty("payments") @ExcludeMissing fun _payments() = payments

        @JsonProperty("purchases") @ExcludeMissing fun _purchases() = purchases

        @JsonProperty("fees") @ExcludeMissing fun _fees() = fees

        @JsonProperty("credits") @ExcludeMissing fun _credits() = credits

        @JsonProperty("interest") @ExcludeMissing fun _interest() = interest

        @JsonProperty("cash_advances") @ExcludeMissing fun _cashAdvances() = cashAdvances

        @JsonProperty("balance_transfers")
        @ExcludeMissing
        fun _balanceTransfers() = balanceTransfers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): StatementTotals = apply {
            if (!validated) {
                payments()
                purchases()
                fees()
                credits()
                interest()
                cashAdvances()
                balanceTransfers()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StatementTotals &&
                this.payments == other.payments &&
                this.purchases == other.purchases &&
                this.fees == other.fees &&
                this.credits == other.credits &&
                this.interest == other.interest &&
                this.cashAdvances == other.cashAdvances &&
                this.balanceTransfers == other.balanceTransfers &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        payments,
                        purchases,
                        fees,
                        credits,
                        interest,
                        cashAdvances,
                        balanceTransfers,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "StatementTotals{payments=$payments, purchases=$purchases, fees=$fees, credits=$credits, interest=$interest, cashAdvances=$cashAdvances, balanceTransfers=$balanceTransfers, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var payments: JsonField<Long> = JsonMissing.of()
            private var purchases: JsonField<Long> = JsonMissing.of()
            private var fees: JsonField<Long> = JsonMissing.of()
            private var credits: JsonField<Long> = JsonMissing.of()
            private var interest: JsonField<Long> = JsonMissing.of()
            private var cashAdvances: JsonField<Long> = JsonMissing.of()
            private var balanceTransfers: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(statementTotals: StatementTotals) = apply {
                this.payments = statementTotals.payments
                this.purchases = statementTotals.purchases
                this.fees = statementTotals.fees
                this.credits = statementTotals.credits
                this.interest = statementTotals.interest
                this.cashAdvances = statementTotals.cashAdvances
                this.balanceTransfers = statementTotals.balanceTransfers
                additionalProperties(statementTotals.additionalProperties)
            }

            fun payments(payments: Long) = payments(JsonField.of(payments))

            @JsonProperty("payments")
            @ExcludeMissing
            fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

            fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

            @JsonProperty("purchases")
            @ExcludeMissing
            fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

            fun fees(fees: Long) = fees(JsonField.of(fees))

            @JsonProperty("fees")
            @ExcludeMissing
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            fun credits(credits: Long) = credits(JsonField.of(credits))

            @JsonProperty("credits")
            @ExcludeMissing
            fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

            fun interest(interest: Long) = interest(JsonField.of(interest))

            @JsonProperty("interest")
            @ExcludeMissing
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

            @JsonProperty("cash_advances")
            @ExcludeMissing
            fun cashAdvances(cashAdvances: JsonField<Long>) = apply {
                this.cashAdvances = cashAdvances
            }

            fun balanceTransfers(balanceTransfers: Long) =
                balanceTransfers(JsonField.of(balanceTransfers))

            @JsonProperty("balance_transfers")
            @ExcludeMissing
            fun balanceTransfers(balanceTransfers: JsonField<Long>) = apply {
                this.balanceTransfers = balanceTransfers
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

            fun build(): StatementTotals =
                StatementTotals(
                    payments,
                    purchases,
                    fees,
                    credits,
                    interest,
                    cashAdvances,
                    balanceTransfers,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
