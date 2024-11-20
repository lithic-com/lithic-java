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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Statement.Builder::class)
@NoAutoDetect
class Statement
private constructor(
    private val token: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val statementStartDate: JsonField<LocalDate>,
    private val statementEndDate: JsonField<LocalDate>,
    private val nextStatementEndDate: JsonField<LocalDate>,
    private val paymentDueDate: JsonField<LocalDate>,
    private val nextPaymentDueDate: JsonField<LocalDate>,
    private val daysInBillingCycle: JsonField<Long>,
    private val creditLimit: JsonField<Long>,
    private val availableCredit: JsonField<Long>,
    private val startingBalance: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val periodTotals: JsonField<StatementTotals>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val creditProductToken: JsonField<String>,
    private val accountStanding: JsonField<AccountStanding>,
    private val amountDue: JsonField<AmountDue>,
    private val interestDetails: JsonField<InterestDetails>,
    private val statementType: JsonField<StatementType>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for a statement */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Date when the billing period began */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    /** Date when the billing period ended */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /** Date when the next billing period will end */
    fun nextStatementEndDate(): Optional<LocalDate> =
        Optional.ofNullable(nextStatementEndDate.getNullable("next_statement_end_date"))

    /** Date when the payment is due */
    fun paymentDueDate(): LocalDate = paymentDueDate.getRequired("payment_due_date")

    /** Date when the next payment is due */
    fun nextPaymentDueDate(): Optional<LocalDate> =
        Optional.ofNullable(nextPaymentDueDate.getNullable("next_payment_due_date"))

    /** Number of days in the billing cycle */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /** This is the maximum credit balance extended by the lender in cents */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Amount of credit available to spend in cents */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /** Balance at the start of the billing period */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /** Timestamp of when the statement was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Timestamp of when the statement was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Globally unique identifier for a credit product */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    fun amountDue(): AmountDue = amountDue.getRequired("amount_due")

    fun interestDetails(): Optional<InterestDetails> =
        Optional.ofNullable(interestDetails.getNullable("interest_details"))

    fun statementType(): StatementType = statementType.getRequired("statement_type")

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

    /** Date when the next billing period will end */
    @JsonProperty("next_statement_end_date")
    @ExcludeMissing
    fun _nextStatementEndDate() = nextStatementEndDate

    /** Date when the payment is due */
    @JsonProperty("payment_due_date") @ExcludeMissing fun _paymentDueDate() = paymentDueDate

    /** Date when the next payment is due */
    @JsonProperty("next_payment_due_date")
    @ExcludeMissing
    fun _nextPaymentDueDate() = nextPaymentDueDate

    /** Number of days in the billing cycle */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle() = daysInBillingCycle

    /** This is the maximum credit balance extended by the lender in cents */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    /** Amount of credit available to spend in cents */
    @JsonProperty("available_credit") @ExcludeMissing fun _availableCredit() = availableCredit

    /** Balance at the start of the billing period */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

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

    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue() = amountDue

    @JsonProperty("interest_details") @ExcludeMissing fun _interestDetails() = interestDetails

    @JsonProperty("statement_type") @ExcludeMissing fun _statementType() = statementType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Statement = apply {
        if (!validated) {
            token()
            financialAccountToken()
            statementStartDate()
            statementEndDate()
            nextStatementEndDate()
            paymentDueDate()
            nextPaymentDueDate()
            daysInBillingCycle()
            creditLimit()
            availableCredit()
            startingBalance()
            endingBalance()
            periodTotals().validate()
            ytdTotals().validate()
            created()
            updated()
            creditProductToken()
            accountStanding().validate()
            amountDue().validate()
            interestDetails().map { it.validate() }
            statementType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var statementStartDate: JsonField<LocalDate> = JsonMissing.of()
        private var statementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var paymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var daysInBillingCycle: JsonField<Long> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var availableCredit: JsonField<Long> = JsonMissing.of()
        private var startingBalance: JsonField<Long> = JsonMissing.of()
        private var endingBalance: JsonField<Long> = JsonMissing.of()
        private var periodTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var ytdTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var accountStanding: JsonField<AccountStanding> = JsonMissing.of()
        private var amountDue: JsonField<AmountDue> = JsonMissing.of()
        private var interestDetails: JsonField<InterestDetails> = JsonMissing.of()
        private var statementType: JsonField<StatementType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statement: Statement) = apply {
            this.token = statement.token
            this.financialAccountToken = statement.financialAccountToken
            this.statementStartDate = statement.statementStartDate
            this.statementEndDate = statement.statementEndDate
            this.nextStatementEndDate = statement.nextStatementEndDate
            this.paymentDueDate = statement.paymentDueDate
            this.nextPaymentDueDate = statement.nextPaymentDueDate
            this.daysInBillingCycle = statement.daysInBillingCycle
            this.creditLimit = statement.creditLimit
            this.availableCredit = statement.availableCredit
            this.startingBalance = statement.startingBalance
            this.endingBalance = statement.endingBalance
            this.periodTotals = statement.periodTotals
            this.ytdTotals = statement.ytdTotals
            this.created = statement.created
            this.updated = statement.updated
            this.creditProductToken = statement.creditProductToken
            this.accountStanding = statement.accountStanding
            this.amountDue = statement.amountDue
            this.interestDetails = statement.interestDetails
            this.statementType = statement.statementType
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

        /** Date when the next billing period will end */
        fun nextStatementEndDate(nextStatementEndDate: LocalDate) =
            nextStatementEndDate(JsonField.of(nextStatementEndDate))

        /** Date when the next billing period will end */
        @JsonProperty("next_statement_end_date")
        @ExcludeMissing
        fun nextStatementEndDate(nextStatementEndDate: JsonField<LocalDate>) = apply {
            this.nextStatementEndDate = nextStatementEndDate
        }

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate) = paymentDueDate(JsonField.of(paymentDueDate))

        /** Date when the payment is due */
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
        }

        /** Date when the next payment is due */
        fun nextPaymentDueDate(nextPaymentDueDate: LocalDate) =
            nextPaymentDueDate(JsonField.of(nextPaymentDueDate))

        /** Date when the next payment is due */
        @JsonProperty("next_payment_due_date")
        @ExcludeMissing
        fun nextPaymentDueDate(nextPaymentDueDate: JsonField<LocalDate>) = apply {
            this.nextPaymentDueDate = nextPaymentDueDate
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

        /** This is the maximum credit balance extended by the lender in cents */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /** This is the maximum credit balance extended by the lender in cents */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend in cents */
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
         * the statement amount due in cents
         */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Balance at the end of the billing period. For charge cards, this should be the same at
         * the statement amount due in cents
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
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

        fun amountDue(amountDue: AmountDue) = amountDue(JsonField.of(amountDue))

        @JsonProperty("amount_due")
        @ExcludeMissing
        fun amountDue(amountDue: JsonField<AmountDue>) = apply { this.amountDue = amountDue }

        fun interestDetails(interestDetails: InterestDetails) =
            interestDetails(JsonField.of(interestDetails))

        @JsonProperty("interest_details")
        @ExcludeMissing
        fun interestDetails(interestDetails: JsonField<InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        fun statementType(statementType: StatementType) = statementType(JsonField.of(statementType))

        @JsonProperty("statement_type")
        @ExcludeMissing
        fun statementType(statementType: JsonField<StatementType>) = apply {
            this.statementType = statementType
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
                nextStatementEndDate,
                paymentDueDate,
                nextPaymentDueDate,
                daysInBillingCycle,
                creditLimit,
                availableCredit,
                startingBalance,
                endingBalance,
                periodTotals,
                ytdTotals,
                created,
                updated,
                creditProductToken,
                accountStanding,
                amountDue,
                interestDetails,
                statementType,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AccountStanding.Builder::class)
    @NoAutoDetect
    class AccountStanding
    private constructor(
        private val periodState: JsonField<PeriodState>,
        private val periodNumber: JsonField<Long>,
        private val consecutiveMinimumPaymentsMade: JsonField<Long>,
        private val consecutiveMinimumPaymentsMissed: JsonField<Long>,
        private val consecutiveFullPaymentsMade: JsonField<Long>,
        private val daysPastDue: JsonField<Long>,
        private val hasGrace: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun periodState(): PeriodState = periodState.getRequired("period_state")

        /** Current overall period number */
        fun periodNumber(): Long = periodNumber.getRequired("period_number")

        /** Number of consecutive minimum payments made */
        fun consecutiveMinimumPaymentsMade(): Long =
            consecutiveMinimumPaymentsMade.getRequired("consecutive_minimum_payments_made")

        /** Number of consecutive minimum payments missed */
        fun consecutiveMinimumPaymentsMissed(): Long =
            consecutiveMinimumPaymentsMissed.getRequired("consecutive_minimum_payments_missed")

        /** Number of consecutive full payments made */
        fun consecutiveFullPaymentsMade(): Long =
            consecutiveFullPaymentsMade.getRequired("consecutive_full_payments_made")

        /** Number of days past due */
        fun daysPastDue(): Long = daysPastDue.getRequired("days_past_due")

        /** Whether the account currently has grace or not */
        fun hasGrace(): Boolean = hasGrace.getRequired("has_grace")

        @JsonProperty("period_state") @ExcludeMissing fun _periodState() = periodState

        /** Current overall period number */
        @JsonProperty("period_number") @ExcludeMissing fun _periodNumber() = periodNumber

        /** Number of consecutive minimum payments made */
        @JsonProperty("consecutive_minimum_payments_made")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMade() = consecutiveMinimumPaymentsMade

        /** Number of consecutive minimum payments missed */
        @JsonProperty("consecutive_minimum_payments_missed")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMissed() = consecutiveMinimumPaymentsMissed

        /** Number of consecutive full payments made */
        @JsonProperty("consecutive_full_payments_made")
        @ExcludeMissing
        fun _consecutiveFullPaymentsMade() = consecutiveFullPaymentsMade

        /** Number of days past due */
        @JsonProperty("days_past_due") @ExcludeMissing fun _daysPastDue() = daysPastDue

        /** Whether the account currently has grace or not */
        @JsonProperty("has_grace") @ExcludeMissing fun _hasGrace() = hasGrace

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountStanding = apply {
            if (!validated) {
                periodState()
                periodNumber()
                consecutiveMinimumPaymentsMade()
                consecutiveMinimumPaymentsMissed()
                consecutiveFullPaymentsMade()
                daysPastDue()
                hasGrace()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var periodState: JsonField<PeriodState> = JsonMissing.of()
            private var periodNumber: JsonField<Long> = JsonMissing.of()
            private var consecutiveMinimumPaymentsMade: JsonField<Long> = JsonMissing.of()
            private var consecutiveMinimumPaymentsMissed: JsonField<Long> = JsonMissing.of()
            private var consecutiveFullPaymentsMade: JsonField<Long> = JsonMissing.of()
            private var daysPastDue: JsonField<Long> = JsonMissing.of()
            private var hasGrace: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStanding: AccountStanding) = apply {
                this.periodState = accountStanding.periodState
                this.periodNumber = accountStanding.periodNumber
                this.consecutiveMinimumPaymentsMade = accountStanding.consecutiveMinimumPaymentsMade
                this.consecutiveMinimumPaymentsMissed =
                    accountStanding.consecutiveMinimumPaymentsMissed
                this.consecutiveFullPaymentsMade = accountStanding.consecutiveFullPaymentsMade
                this.daysPastDue = accountStanding.daysPastDue
                this.hasGrace = accountStanding.hasGrace
                additionalProperties(accountStanding.additionalProperties)
            }

            fun periodState(periodState: PeriodState) = periodState(JsonField.of(periodState))

            @JsonProperty("period_state")
            @ExcludeMissing
            fun periodState(periodState: JsonField<PeriodState>) = apply {
                this.periodState = periodState
            }

            /** Current overall period number */
            fun periodNumber(periodNumber: Long) = periodNumber(JsonField.of(periodNumber))

            /** Current overall period number */
            @JsonProperty("period_number")
            @ExcludeMissing
            fun periodNumber(periodNumber: JsonField<Long>) = apply {
                this.periodNumber = periodNumber
            }

            /** Number of consecutive minimum payments made */
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: Long) =
                consecutiveMinimumPaymentsMade(JsonField.of(consecutiveMinimumPaymentsMade))

            /** Number of consecutive minimum payments made */
            @JsonProperty("consecutive_minimum_payments_made")
            @ExcludeMissing
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: JsonField<Long>) =
                apply {
                    this.consecutiveMinimumPaymentsMade = consecutiveMinimumPaymentsMade
                }

            /** Number of consecutive minimum payments missed */
            fun consecutiveMinimumPaymentsMissed(consecutiveMinimumPaymentsMissed: Long) =
                consecutiveMinimumPaymentsMissed(JsonField.of(consecutiveMinimumPaymentsMissed))

            /** Number of consecutive minimum payments missed */
            @JsonProperty("consecutive_minimum_payments_missed")
            @ExcludeMissing
            fun consecutiveMinimumPaymentsMissed(
                consecutiveMinimumPaymentsMissed: JsonField<Long>
            ) = apply { this.consecutiveMinimumPaymentsMissed = consecutiveMinimumPaymentsMissed }

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: Long) =
                consecutiveFullPaymentsMade(JsonField.of(consecutiveFullPaymentsMade))

            /** Number of consecutive full payments made */
            @JsonProperty("consecutive_full_payments_made")
            @ExcludeMissing
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: JsonField<Long>) = apply {
                this.consecutiveFullPaymentsMade = consecutiveFullPaymentsMade
            }

            /** Number of days past due */
            fun daysPastDue(daysPastDue: Long) = daysPastDue(JsonField.of(daysPastDue))

            /** Number of days past due */
            @JsonProperty("days_past_due")
            @ExcludeMissing
            fun daysPastDue(daysPastDue: JsonField<Long>) = apply { this.daysPastDue = daysPastDue }

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: Boolean) = hasGrace(JsonField.of(hasGrace))

            /** Whether the account currently has grace or not */
            @JsonProperty("has_grace")
            @ExcludeMissing
            fun hasGrace(hasGrace: JsonField<Boolean>) = apply { this.hasGrace = hasGrace }

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
                    periodState,
                    periodNumber,
                    consecutiveMinimumPaymentsMade,
                    consecutiveMinimumPaymentsMissed,
                    consecutiveFullPaymentsMade,
                    daysPastDue,
                    hasGrace,
                    additionalProperties.toImmutable(),
                )
        }

        class PeriodState
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PeriodState && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val STANDARD = PeriodState(JsonField.of("STANDARD"))

                @JvmField val PROMO = PeriodState(JsonField.of("PROMO"))

                @JvmField val PENALTY = PeriodState(JsonField.of("PENALTY"))

                @JvmStatic fun of(value: String) = PeriodState(JsonField.of(value))
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
                    else -> throw LithicInvalidDataException("Unknown PeriodState: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountStanding && periodState == other.periodState && periodNumber == other.periodNumber && consecutiveMinimumPaymentsMade == other.consecutiveMinimumPaymentsMade && consecutiveMinimumPaymentsMissed == other.consecutiveMinimumPaymentsMissed && consecutiveFullPaymentsMade == other.consecutiveFullPaymentsMade && daysPastDue == other.daysPastDue && hasGrace == other.hasGrace && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(periodState, periodNumber, consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed, consecutiveFullPaymentsMade, daysPastDue, hasGrace, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStanding{periodState=$periodState, periodNumber=$periodNumber, consecutiveMinimumPaymentsMade=$consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed=$consecutiveMinimumPaymentsMissed, consecutiveFullPaymentsMade=$consecutiveFullPaymentsMade, daysPastDue=$daysPastDue, hasGrace=$hasGrace, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = AmountDue.Builder::class)
    @NoAutoDetect
    class AmountDue
    private constructor(
        private val amount: JsonField<Long>,
        private val pastDue: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Payment due at the end of the billing period in cents. Negative amount indicates
         * something is owed. If the amount owed is positive there was a net credit. If
         * auto-collections are enabled this is the amount that will be requested on the payment due
         * date
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Amount past due for statement in cents */
        fun pastDue(): Long = pastDue.getRequired("past_due")

        /**
         * Payment due at the end of the billing period in cents. Negative amount indicates
         * something is owed. If the amount owed is positive there was a net credit. If
         * auto-collections are enabled this is the amount that will be requested on the payment due
         * date
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Amount past due for statement in cents */
        @JsonProperty("past_due") @ExcludeMissing fun _pastDue() = pastDue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AmountDue = apply {
            if (!validated) {
                amount()
                pastDue()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var pastDue: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amountDue: AmountDue) = apply {
                this.amount = amountDue.amount
                this.pastDue = amountDue.pastDue
                additionalProperties(amountDue.additionalProperties)
            }

            /**
             * Payment due at the end of the billing period in cents. Negative amount indicates
             * something is owed. If the amount owed is positive there was a net credit. If
             * auto-collections are enabled this is the amount that will be requested on the payment
             * due date
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Payment due at the end of the billing period in cents. Negative amount indicates
             * something is owed. If the amount owed is positive there was a net credit. If
             * auto-collections are enabled this is the amount that will be requested on the payment
             * due date
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Amount past due for statement in cents */
            fun pastDue(pastDue: Long) = pastDue(JsonField.of(pastDue))

            /** Amount past due for statement in cents */
            @JsonProperty("past_due")
            @ExcludeMissing
            fun pastDue(pastDue: JsonField<Long>) = apply { this.pastDue = pastDue }

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

            fun build(): AmountDue =
                AmountDue(
                    amount,
                    pastDue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AmountDue && amount == other.amount && pastDue == other.pastDue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, pastDue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmountDue{amount=$amount, pastDue=$pastDue, additionalProperties=$additionalProperties}"
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

        /** Any funds transfers which affective the balance in cents */
        fun payments(): Long = payments.getRequired("payments")

        /** Net card transaction volume less any cash advances in cents */
        fun purchases(): Long = purchases.getRequired("purchases")

        /** Volume of debit management operation transactions less any interest in cents */
        fun fees(): Long = fees.getRequired("fees")

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         */
        fun credits(): Long = credits.getRequired("credits")

        /** Interest accrued in cents */
        fun interest(): Long = interest.getRequired("interest")

        /** ATM and cashback transactions in cents */
        fun cashAdvances(): Long = cashAdvances.getRequired("cash_advances")

        /** Opening balance transferred from previous account in cents */
        fun balanceTransfers(): Long = balanceTransfers.getRequired("balance_transfers")

        /** Any funds transfers which affective the balance in cents */
        @JsonProperty("payments") @ExcludeMissing fun _payments() = payments

        /** Net card transaction volume less any cash advances in cents */
        @JsonProperty("purchases") @ExcludeMissing fun _purchases() = purchases

        /** Volume of debit management operation transactions less any interest in cents */
        @JsonProperty("fees") @ExcludeMissing fun _fees() = fees

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits() = credits

        /** Interest accrued in cents */
        @JsonProperty("interest") @ExcludeMissing fun _interest() = interest

        /** ATM and cashback transactions in cents */
        @JsonProperty("cash_advances") @ExcludeMissing fun _cashAdvances() = cashAdvances

        /** Opening balance transferred from previous account in cents */
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

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: Long) = payments(JsonField.of(payments))

            /** Any funds transfers which affective the balance in cents */
            @JsonProperty("payments")
            @ExcludeMissing
            fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

            /** Net card transaction volume less any cash advances in cents */
            @JsonProperty("purchases")
            @ExcludeMissing
            fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

            /** Volume of debit management operation transactions less any interest in cents */
            fun fees(fees: Long) = fees(JsonField.of(fees))

            /** Volume of debit management operation transactions less any interest in cents */
            @JsonProperty("fees")
            @ExcludeMissing
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            /**
             * Volume of credit management operation transactions less any balance transfers in
             * cents
             */
            fun credits(credits: Long) = credits(JsonField.of(credits))

            /**
             * Volume of credit management operation transactions less any balance transfers in
             * cents
             */
            @JsonProperty("credits")
            @ExcludeMissing
            fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

            /** Interest accrued in cents */
            fun interest(interest: Long) = interest(JsonField.of(interest))

            /** Interest accrued in cents */
            @JsonProperty("interest")
            @ExcludeMissing
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

            /** ATM and cashback transactions in cents */
            @JsonProperty("cash_advances")
            @ExcludeMissing
            fun cashAdvances(cashAdvances: JsonField<Long>) = apply {
                this.cashAdvances = cashAdvances
            }

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: Long) =
                balanceTransfers(JsonField.of(balanceTransfers))

            /** Opening balance transferred from previous account in cents */
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementTotals && payments == other.payments && purchases == other.purchases && fees == other.fees && credits == other.credits && interest == other.interest && cashAdvances == other.cashAdvances && balanceTransfers == other.balanceTransfers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(payments, purchases, fees, credits, interest, cashAdvances, balanceTransfers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StatementTotals{payments=$payments, purchases=$purchases, fees=$fees, credits=$credits, interest=$interest, cashAdvances=$cashAdvances, balanceTransfers=$balanceTransfers, additionalProperties=$additionalProperties}"
    }

    class StatementType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INITIAL = StatementType(JsonField.of("INITIAL"))

            @JvmField val PERIOD_END = StatementType(JsonField.of("PERIOD_END"))

            @JvmStatic fun of(value: String) = StatementType(JsonField.of(value))
        }

        enum class Known {
            INITIAL,
            PERIOD_END,
        }

        enum class Value {
            INITIAL,
            PERIOD_END,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INITIAL -> Value.INITIAL
                PERIOD_END -> Value.PERIOD_END
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INITIAL -> Known.INITIAL
                PERIOD_END -> Known.PERIOD_END
                else -> throw LithicInvalidDataException("Unknown StatementType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = InterestDetails.Builder::class)
    @NoAutoDetect
    class InterestDetails
    private constructor(
        private val primeRate: JsonField<String>,
        private val interestCalculationMethod: JsonField<InterestCalculationMethod>,
        private val effectiveApr: JsonField<CategoryDetails>,
        private val interestForPeriod: JsonField<CategoryDetails>,
        private val dailyBalanceAmounts: JsonField<CategoryDetails>,
        private val minimumInterestCharged: JsonField<Long>,
        private val actualInterestCharged: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun primeRate(): Optional<String> = Optional.ofNullable(primeRate.getNullable("prime_rate"))

        fun interestCalculationMethod(): InterestCalculationMethod =
            interestCalculationMethod.getRequired("interest_calculation_method")

        fun effectiveApr(): CategoryDetails = effectiveApr.getRequired("effective_apr")

        fun interestForPeriod(): CategoryDetails =
            interestForPeriod.getRequired("interest_for_period")

        fun dailyBalanceAmounts(): CategoryDetails =
            dailyBalanceAmounts.getRequired("daily_balance_amounts")

        fun minimumInterestCharged(): Optional<Long> =
            Optional.ofNullable(minimumInterestCharged.getNullable("minimum_interest_charged"))

        fun actualInterestCharged(): Optional<Long> =
            Optional.ofNullable(actualInterestCharged.getNullable("actual_interest_charged"))

        @JsonProperty("prime_rate") @ExcludeMissing fun _primeRate() = primeRate

        @JsonProperty("interest_calculation_method")
        @ExcludeMissing
        fun _interestCalculationMethod() = interestCalculationMethod

        @JsonProperty("effective_apr") @ExcludeMissing fun _effectiveApr() = effectiveApr

        @JsonProperty("interest_for_period")
        @ExcludeMissing
        fun _interestForPeriod() = interestForPeriod

        @JsonProperty("daily_balance_amounts")
        @ExcludeMissing
        fun _dailyBalanceAmounts() = dailyBalanceAmounts

        @JsonProperty("minimum_interest_charged")
        @ExcludeMissing
        fun _minimumInterestCharged() = minimumInterestCharged

        @JsonProperty("actual_interest_charged")
        @ExcludeMissing
        fun _actualInterestCharged() = actualInterestCharged

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InterestDetails = apply {
            if (!validated) {
                primeRate()
                interestCalculationMethod()
                effectiveApr().validate()
                interestForPeriod().validate()
                dailyBalanceAmounts().validate()
                minimumInterestCharged()
                actualInterestCharged()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var primeRate: JsonField<String> = JsonMissing.of()
            private var interestCalculationMethod: JsonField<InterestCalculationMethod> =
                JsonMissing.of()
            private var effectiveApr: JsonField<CategoryDetails> = JsonMissing.of()
            private var interestForPeriod: JsonField<CategoryDetails> = JsonMissing.of()
            private var dailyBalanceAmounts: JsonField<CategoryDetails> = JsonMissing.of()
            private var minimumInterestCharged: JsonField<Long> = JsonMissing.of()
            private var actualInterestCharged: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interestDetails: InterestDetails) = apply {
                this.primeRate = interestDetails.primeRate
                this.interestCalculationMethod = interestDetails.interestCalculationMethod
                this.effectiveApr = interestDetails.effectiveApr
                this.interestForPeriod = interestDetails.interestForPeriod
                this.dailyBalanceAmounts = interestDetails.dailyBalanceAmounts
                this.minimumInterestCharged = interestDetails.minimumInterestCharged
                this.actualInterestCharged = interestDetails.actualInterestCharged
                additionalProperties(interestDetails.additionalProperties)
            }

            fun primeRate(primeRate: String) = primeRate(JsonField.of(primeRate))

            @JsonProperty("prime_rate")
            @ExcludeMissing
            fun primeRate(primeRate: JsonField<String>) = apply { this.primeRate = primeRate }

            fun interestCalculationMethod(interestCalculationMethod: InterestCalculationMethod) =
                interestCalculationMethod(JsonField.of(interestCalculationMethod))

            @JsonProperty("interest_calculation_method")
            @ExcludeMissing
            fun interestCalculationMethod(
                interestCalculationMethod: JsonField<InterestCalculationMethod>
            ) = apply { this.interestCalculationMethod = interestCalculationMethod }

            fun effectiveApr(effectiveApr: CategoryDetails) =
                effectiveApr(JsonField.of(effectiveApr))

            @JsonProperty("effective_apr")
            @ExcludeMissing
            fun effectiveApr(effectiveApr: JsonField<CategoryDetails>) = apply {
                this.effectiveApr = effectiveApr
            }

            fun interestForPeriod(interestForPeriod: CategoryDetails) =
                interestForPeriod(JsonField.of(interestForPeriod))

            @JsonProperty("interest_for_period")
            @ExcludeMissing
            fun interestForPeriod(interestForPeriod: JsonField<CategoryDetails>) = apply {
                this.interestForPeriod = interestForPeriod
            }

            fun dailyBalanceAmounts(dailyBalanceAmounts: CategoryDetails) =
                dailyBalanceAmounts(JsonField.of(dailyBalanceAmounts))

            @JsonProperty("daily_balance_amounts")
            @ExcludeMissing
            fun dailyBalanceAmounts(dailyBalanceAmounts: JsonField<CategoryDetails>) = apply {
                this.dailyBalanceAmounts = dailyBalanceAmounts
            }

            fun minimumInterestCharged(minimumInterestCharged: Long) =
                minimumInterestCharged(JsonField.of(minimumInterestCharged))

            @JsonProperty("minimum_interest_charged")
            @ExcludeMissing
            fun minimumInterestCharged(minimumInterestCharged: JsonField<Long>) = apply {
                this.minimumInterestCharged = minimumInterestCharged
            }

            fun actualInterestCharged(actualInterestCharged: Long) =
                actualInterestCharged(JsonField.of(actualInterestCharged))

            @JsonProperty("actual_interest_charged")
            @ExcludeMissing
            fun actualInterestCharged(actualInterestCharged: JsonField<Long>) = apply {
                this.actualInterestCharged = actualInterestCharged
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

            fun build(): InterestDetails =
                InterestDetails(
                    primeRate,
                    interestCalculationMethod,
                    effectiveApr,
                    interestForPeriod,
                    dailyBalanceAmounts,
                    minimumInterestCharged,
                    actualInterestCharged,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = CategoryDetails.Builder::class)
        @NoAutoDetect
        class CategoryDetails
        private constructor(
            private val purchases: JsonField<String>,
            private val cashAdvances: JsonField<String>,
            private val balanceTransfers: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun purchases(): String = purchases.getRequired("purchases")

            fun cashAdvances(): String = cashAdvances.getRequired("cash_advances")

            fun balanceTransfers(): String = balanceTransfers.getRequired("balance_transfers")

            @JsonProperty("purchases") @ExcludeMissing fun _purchases() = purchases

            @JsonProperty("cash_advances") @ExcludeMissing fun _cashAdvances() = cashAdvances

            @JsonProperty("balance_transfers")
            @ExcludeMissing
            fun _balanceTransfers() = balanceTransfers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CategoryDetails = apply {
                if (!validated) {
                    purchases()
                    cashAdvances()
                    balanceTransfers()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var purchases: JsonField<String> = JsonMissing.of()
                private var cashAdvances: JsonField<String> = JsonMissing.of()
                private var balanceTransfers: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(categoryDetails: CategoryDetails) = apply {
                    this.purchases = categoryDetails.purchases
                    this.cashAdvances = categoryDetails.cashAdvances
                    this.balanceTransfers = categoryDetails.balanceTransfers
                    additionalProperties(categoryDetails.additionalProperties)
                }

                fun purchases(purchases: String) = purchases(JsonField.of(purchases))

                @JsonProperty("purchases")
                @ExcludeMissing
                fun purchases(purchases: JsonField<String>) = apply { this.purchases = purchases }

                fun cashAdvances(cashAdvances: String) = cashAdvances(JsonField.of(cashAdvances))

                @JsonProperty("cash_advances")
                @ExcludeMissing
                fun cashAdvances(cashAdvances: JsonField<String>) = apply {
                    this.cashAdvances = cashAdvances
                }

                fun balanceTransfers(balanceTransfers: String) =
                    balanceTransfers(JsonField.of(balanceTransfers))

                @JsonProperty("balance_transfers")
                @ExcludeMissing
                fun balanceTransfers(balanceTransfers: JsonField<String>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CategoryDetails =
                    CategoryDetails(
                        purchases,
                        cashAdvances,
                        balanceTransfers,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CategoryDetails && purchases == other.purchases && cashAdvances == other.cashAdvances && balanceTransfers == other.balanceTransfers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(purchases, cashAdvances, balanceTransfers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CategoryDetails{purchases=$purchases, cashAdvances=$cashAdvances, balanceTransfers=$balanceTransfers, additionalProperties=$additionalProperties}"
        }

        class InterestCalculationMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InterestCalculationMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DAILY = InterestCalculationMethod(JsonField.of("DAILY"))

                @JvmField
                val AVERAGE_DAILY = InterestCalculationMethod(JsonField.of("AVERAGE_DAILY"))

                @JvmStatic fun of(value: String) = InterestCalculationMethod(JsonField.of(value))
            }

            enum class Known {
                DAILY,
                AVERAGE_DAILY,
            }

            enum class Value {
                DAILY,
                AVERAGE_DAILY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DAILY -> Value.DAILY
                    AVERAGE_DAILY -> Value.AVERAGE_DAILY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DAILY -> Known.DAILY
                    AVERAGE_DAILY -> Known.AVERAGE_DAILY
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown InterestCalculationMethod: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InterestDetails && primeRate == other.primeRate && interestCalculationMethod == other.interestCalculationMethod && effectiveApr == other.effectiveApr && interestForPeriod == other.interestForPeriod && dailyBalanceAmounts == other.dailyBalanceAmounts && minimumInterestCharged == other.minimumInterestCharged && actualInterestCharged == other.actualInterestCharged && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(primeRate, interestCalculationMethod, effectiveApr, interestForPeriod, dailyBalanceAmounts, minimumInterestCharged, actualInterestCharged, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestDetails{primeRate=$primeRate, interestCalculationMethod=$interestCalculationMethod, effectiveApr=$effectiveApr, interestForPeriod=$interestForPeriod, dailyBalanceAmounts=$dailyBalanceAmounts, minimumInterestCharged=$minimumInterestCharged, actualInterestCharged=$actualInterestCharged, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Statement && token == other.token && financialAccountToken == other.financialAccountToken && statementStartDate == other.statementStartDate && statementEndDate == other.statementEndDate && nextStatementEndDate == other.nextStatementEndDate && paymentDueDate == other.paymentDueDate && nextPaymentDueDate == other.nextPaymentDueDate && daysInBillingCycle == other.daysInBillingCycle && creditLimit == other.creditLimit && availableCredit == other.availableCredit && startingBalance == other.startingBalance && endingBalance == other.endingBalance && periodTotals == other.periodTotals && ytdTotals == other.ytdTotals && created == other.created && updated == other.updated && creditProductToken == other.creditProductToken && accountStanding == other.accountStanding && amountDue == other.amountDue && interestDetails == other.interestDetails && statementType == other.statementType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, financialAccountToken, statementStartDate, statementEndDate, nextStatementEndDate, paymentDueDate, nextPaymentDueDate, daysInBillingCycle, creditLimit, availableCredit, startingBalance, endingBalance, periodTotals, ytdTotals, created, updated, creditProductToken, accountStanding, amountDue, interestDetails, statementType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Statement{token=$token, financialAccountToken=$financialAccountToken, statementStartDate=$statementStartDate, statementEndDate=$statementEndDate, nextStatementEndDate=$nextStatementEndDate, paymentDueDate=$paymentDueDate, nextPaymentDueDate=$nextPaymentDueDate, daysInBillingCycle=$daysInBillingCycle, creditLimit=$creditLimit, availableCredit=$availableCredit, startingBalance=$startingBalance, endingBalance=$endingBalance, periodTotals=$periodTotals, ytdTotals=$ytdTotals, created=$created, updated=$updated, creditProductToken=$creditProductToken, accountStanding=$accountStanding, amountDue=$amountDue, interestDetails=$interestDetails, statementType=$statementType, additionalProperties=$additionalProperties}"
}
