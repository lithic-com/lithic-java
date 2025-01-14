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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Statement
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_standing")
    @ExcludeMissing
    private val accountStanding: JsonField<AccountStanding> = JsonMissing.of(),
    @JsonProperty("amount_due")
    @ExcludeMissing
    private val amountDue: JsonField<AmountDue> = JsonMissing.of(),
    @JsonProperty("available_credit")
    @ExcludeMissing
    private val availableCredit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_limit")
    @ExcludeMissing
    private val creditLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    private val creditProductToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    private val daysInBillingCycle: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_due_date")
    @ExcludeMissing
    private val paymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("period_totals")
    @ExcludeMissing
    private val periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("statement_end_date")
    @ExcludeMissing
    private val statementEndDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    private val statementStartDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("statement_type")
    @ExcludeMissing
    private val statementType: JsonField<StatementType> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    private val ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("interest_details")
    @ExcludeMissing
    private val interestDetails: JsonField<InterestDetails> = JsonMissing.of(),
    @JsonProperty("next_payment_due_date")
    @ExcludeMissing
    private val nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("next_statement_end_date")
    @ExcludeMissing
    private val nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for a statement */
    fun token(): String = token.getRequired("token")

    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    fun amountDue(): AmountDue = amountDue.getRequired("amount_due")

    /** Amount of credit available to spend in cents */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /** Timestamp of when the statement was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** This is the maximum credit balance extended by the lender in cents */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Globally unique identifier for a credit product */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /** Number of days in the billing cycle */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Date when the payment is due */
    fun paymentDueDate(): LocalDate = paymentDueDate.getRequired("payment_due_date")

    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    /** Balance at the start of the billing period */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /** Date when the billing period ended */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /** Date when the billing period began */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    fun statementType(): StatementType = statementType.getRequired("statement_type")

    /** Timestamp of when the statement was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    fun interestDetails(): Optional<InterestDetails> =
        Optional.ofNullable(interestDetails.getNullable("interest_details"))

    /** Date when the next payment is due */
    fun nextPaymentDueDate(): Optional<LocalDate> =
        Optional.ofNullable(nextPaymentDueDate.getNullable("next_payment_due_date"))

    /** Date when the next billing period will end */
    fun nextStatementEndDate(): Optional<LocalDate> =
        Optional.ofNullable(nextStatementEndDate.getNullable("next_statement_end_date"))

    /** Globally unique identifier for a statement */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("account_standing")
    @ExcludeMissing
    fun _accountStanding(): JsonField<AccountStanding> = accountStanding

    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<AmountDue> = amountDue

    /** Amount of credit available to spend in cents */
    @JsonProperty("available_credit")
    @ExcludeMissing
    fun _availableCredit(): JsonField<Long> = availableCredit

    /** Timestamp of when the statement was created */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** This is the maximum credit balance extended by the lender in cents */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /** Globally unique identifier for a credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /** Number of days in the billing cycle */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle(): JsonField<Long> = daysInBillingCycle

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /** Date when the payment is due */
    @JsonProperty("payment_due_date")
    @ExcludeMissing
    fun _paymentDueDate(): JsonField<LocalDate> = paymentDueDate

    @JsonProperty("period_totals")
    @ExcludeMissing
    fun _periodTotals(): JsonField<StatementTotals> = periodTotals

    /** Balance at the start of the billing period */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /** Date when the billing period ended */
    @JsonProperty("statement_end_date")
    @ExcludeMissing
    fun _statementEndDate(): JsonField<LocalDate> = statementEndDate

    /** Date when the billing period began */
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    fun _statementStartDate(): JsonField<LocalDate> = statementStartDate

    @JsonProperty("statement_type")
    @ExcludeMissing
    fun _statementType(): JsonField<StatementType> = statementType

    /** Timestamp of when the statement was updated */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonProperty("ytd_totals")
    @ExcludeMissing
    fun _ytdTotals(): JsonField<StatementTotals> = ytdTotals

    @JsonProperty("interest_details")
    @ExcludeMissing
    fun _interestDetails(): JsonField<InterestDetails> = interestDetails

    /** Date when the next payment is due */
    @JsonProperty("next_payment_due_date")
    @ExcludeMissing
    fun _nextPaymentDueDate(): JsonField<LocalDate> = nextPaymentDueDate

    /** Date when the next billing period will end */
    @JsonProperty("next_statement_end_date")
    @ExcludeMissing
    fun _nextStatementEndDate(): JsonField<LocalDate> = nextStatementEndDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Statement = apply {
        if (validated) {
            return@apply
        }

        token()
        accountStanding().validate()
        amountDue().validate()
        availableCredit()
        created()
        creditLimit()
        creditProductToken()
        daysInBillingCycle()
        endingBalance()
        financialAccountToken()
        paymentDueDate()
        periodTotals().validate()
        startingBalance()
        statementEndDate()
        statementStartDate()
        statementType()
        updated()
        ytdTotals().validate()
        interestDetails().ifPresent { it.validate() }
        nextPaymentDueDate()
        nextStatementEndDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var accountStanding: JsonField<AccountStanding>? = null
        private var amountDue: JsonField<AmountDue>? = null
        private var availableCredit: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var daysInBillingCycle: JsonField<Long>? = null
        private var endingBalance: JsonField<Long>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var paymentDueDate: JsonField<LocalDate>? = null
        private var periodTotals: JsonField<StatementTotals>? = null
        private var startingBalance: JsonField<Long>? = null
        private var statementEndDate: JsonField<LocalDate>? = null
        private var statementStartDate: JsonField<LocalDate>? = null
        private var statementType: JsonField<StatementType>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var ytdTotals: JsonField<StatementTotals>? = null
        private var interestDetails: JsonField<InterestDetails> = JsonMissing.of()
        private var nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statement: Statement) = apply {
            token = statement.token
            accountStanding = statement.accountStanding
            amountDue = statement.amountDue
            availableCredit = statement.availableCredit
            created = statement.created
            creditLimit = statement.creditLimit
            creditProductToken = statement.creditProductToken
            daysInBillingCycle = statement.daysInBillingCycle
            endingBalance = statement.endingBalance
            financialAccountToken = statement.financialAccountToken
            paymentDueDate = statement.paymentDueDate
            periodTotals = statement.periodTotals
            startingBalance = statement.startingBalance
            statementEndDate = statement.statementEndDate
            statementStartDate = statement.statementStartDate
            statementType = statement.statementType
            updated = statement.updated
            ytdTotals = statement.ytdTotals
            interestDetails = statement.interestDetails
            nextPaymentDueDate = statement.nextPaymentDueDate
            nextStatementEndDate = statement.nextStatementEndDate
            additionalProperties = statement.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a statement */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a statement */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        fun amountDue(amountDue: AmountDue) = amountDue(JsonField.of(amountDue))

        fun amountDue(amountDue: JsonField<AmountDue>) = apply { this.amountDue = amountDue }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        /** Timestamp of when the statement was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the statement was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** This is the maximum credit balance extended by the lender in cents */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /** This is the maximum credit balance extended by the lender in cents */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Number of days in the billing cycle */
        fun daysInBillingCycle(daysInBillingCycle: Long) =
            daysInBillingCycle(JsonField.of(daysInBillingCycle))

        /** Number of days in the billing cycle */
        fun daysInBillingCycle(daysInBillingCycle: JsonField<Long>) = apply {
            this.daysInBillingCycle = daysInBillingCycle
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
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate) = paymentDueDate(JsonField.of(paymentDueDate))

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
        }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        /** Balance at the start of the billing period */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** Balance at the start of the billing period */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /** Date when the billing period ended */
        fun statementEndDate(statementEndDate: LocalDate) =
            statementEndDate(JsonField.of(statementEndDate))

        /** Date when the billing period ended */
        fun statementEndDate(statementEndDate: JsonField<LocalDate>) = apply {
            this.statementEndDate = statementEndDate
        }

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: LocalDate) =
            statementStartDate(JsonField.of(statementStartDate))

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: JsonField<LocalDate>) = apply {
            this.statementStartDate = statementStartDate
        }

        fun statementType(statementType: StatementType) = statementType(JsonField.of(statementType))

        fun statementType(statementType: JsonField<StatementType>) = apply {
            this.statementType = statementType
        }

        /** Timestamp of when the statement was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Timestamp of when the statement was updated */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        fun interestDetails(interestDetails: InterestDetails?) =
            interestDetails(JsonField.ofNullable(interestDetails))

        fun interestDetails(interestDetails: Optional<InterestDetails>) =
            interestDetails(interestDetails.orElse(null))

        fun interestDetails(interestDetails: JsonField<InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        /** Date when the next payment is due */
        fun nextPaymentDueDate(nextPaymentDueDate: LocalDate) =
            nextPaymentDueDate(JsonField.of(nextPaymentDueDate))

        /** Date when the next payment is due */
        fun nextPaymentDueDate(nextPaymentDueDate: JsonField<LocalDate>) = apply {
            this.nextPaymentDueDate = nextPaymentDueDate
        }

        /** Date when the next billing period will end */
        fun nextStatementEndDate(nextStatementEndDate: LocalDate) =
            nextStatementEndDate(JsonField.of(nextStatementEndDate))

        /** Date when the next billing period will end */
        fun nextStatementEndDate(nextStatementEndDate: JsonField<LocalDate>) = apply {
            this.nextStatementEndDate = nextStatementEndDate
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

        fun build(): Statement =
            Statement(
                checkRequired("token", token),
                checkRequired("accountStanding", accountStanding),
                checkRequired("amountDue", amountDue),
                checkRequired("availableCredit", availableCredit),
                checkRequired("created", created),
                checkRequired("creditLimit", creditLimit),
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("daysInBillingCycle", daysInBillingCycle),
                checkRequired("endingBalance", endingBalance),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("paymentDueDate", paymentDueDate),
                checkRequired("periodTotals", periodTotals),
                checkRequired("startingBalance", startingBalance),
                checkRequired("statementEndDate", statementEndDate),
                checkRequired("statementStartDate", statementStartDate),
                checkRequired("statementType", statementType),
                checkRequired("updated", updated),
                checkRequired("ytdTotals", ytdTotals),
                interestDetails,
                nextPaymentDueDate,
                nextStatementEndDate,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AccountStanding
    @JsonCreator
    private constructor(
        @JsonProperty("consecutive_full_payments_made")
        @ExcludeMissing
        private val consecutiveFullPaymentsMade: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("consecutive_minimum_payments_made")
        @ExcludeMissing
        private val consecutiveMinimumPaymentsMade: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("consecutive_minimum_payments_missed")
        @ExcludeMissing
        private val consecutiveMinimumPaymentsMissed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("days_past_due")
        @ExcludeMissing
        private val daysPastDue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("has_grace")
        @ExcludeMissing
        private val hasGrace: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("period_number")
        @ExcludeMissing
        private val periodNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("period_state")
        @ExcludeMissing
        private val periodState: JsonField<PeriodState> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Number of consecutive full payments made */
        fun consecutiveFullPaymentsMade(): Long =
            consecutiveFullPaymentsMade.getRequired("consecutive_full_payments_made")

        /** Number of consecutive minimum payments made */
        fun consecutiveMinimumPaymentsMade(): Long =
            consecutiveMinimumPaymentsMade.getRequired("consecutive_minimum_payments_made")

        /** Number of consecutive minimum payments missed */
        fun consecutiveMinimumPaymentsMissed(): Long =
            consecutiveMinimumPaymentsMissed.getRequired("consecutive_minimum_payments_missed")

        /** Number of days past due */
        fun daysPastDue(): Long = daysPastDue.getRequired("days_past_due")

        /** Whether the account currently has grace or not */
        fun hasGrace(): Boolean = hasGrace.getRequired("has_grace")

        /** Current overall period number */
        fun periodNumber(): Long = periodNumber.getRequired("period_number")

        fun periodState(): PeriodState = periodState.getRequired("period_state")

        /** Number of consecutive full payments made */
        @JsonProperty("consecutive_full_payments_made")
        @ExcludeMissing
        fun _consecutiveFullPaymentsMade(): JsonField<Long> = consecutiveFullPaymentsMade

        /** Number of consecutive minimum payments made */
        @JsonProperty("consecutive_minimum_payments_made")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMade(): JsonField<Long> = consecutiveMinimumPaymentsMade

        /** Number of consecutive minimum payments missed */
        @JsonProperty("consecutive_minimum_payments_missed")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMissed(): JsonField<Long> = consecutiveMinimumPaymentsMissed

        /** Number of days past due */
        @JsonProperty("days_past_due")
        @ExcludeMissing
        fun _daysPastDue(): JsonField<Long> = daysPastDue

        /** Whether the account currently has grace or not */
        @JsonProperty("has_grace") @ExcludeMissing fun _hasGrace(): JsonField<Boolean> = hasGrace

        /** Current overall period number */
        @JsonProperty("period_number")
        @ExcludeMissing
        fun _periodNumber(): JsonField<Long> = periodNumber

        @JsonProperty("period_state")
        @ExcludeMissing
        fun _periodState(): JsonField<PeriodState> = periodState

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountStanding = apply {
            if (validated) {
                return@apply
            }

            consecutiveFullPaymentsMade()
            consecutiveMinimumPaymentsMade()
            consecutiveMinimumPaymentsMissed()
            daysPastDue()
            hasGrace()
            periodNumber()
            periodState()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var consecutiveFullPaymentsMade: JsonField<Long>? = null
            private var consecutiveMinimumPaymentsMade: JsonField<Long>? = null
            private var consecutiveMinimumPaymentsMissed: JsonField<Long>? = null
            private var daysPastDue: JsonField<Long>? = null
            private var hasGrace: JsonField<Boolean>? = null
            private var periodNumber: JsonField<Long>? = null
            private var periodState: JsonField<PeriodState>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStanding: AccountStanding) = apply {
                consecutiveFullPaymentsMade = accountStanding.consecutiveFullPaymentsMade
                consecutiveMinimumPaymentsMade = accountStanding.consecutiveMinimumPaymentsMade
                consecutiveMinimumPaymentsMissed = accountStanding.consecutiveMinimumPaymentsMissed
                daysPastDue = accountStanding.daysPastDue
                hasGrace = accountStanding.hasGrace
                periodNumber = accountStanding.periodNumber
                periodState = accountStanding.periodState
                additionalProperties = accountStanding.additionalProperties.toMutableMap()
            }

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: Long) =
                consecutiveFullPaymentsMade(JsonField.of(consecutiveFullPaymentsMade))

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: JsonField<Long>) = apply {
                this.consecutiveFullPaymentsMade = consecutiveFullPaymentsMade
            }

            /** Number of consecutive minimum payments made */
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: Long) =
                consecutiveMinimumPaymentsMade(JsonField.of(consecutiveMinimumPaymentsMade))

            /** Number of consecutive minimum payments made */
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: JsonField<Long>) =
                apply {
                    this.consecutiveMinimumPaymentsMade = consecutiveMinimumPaymentsMade
                }

            /** Number of consecutive minimum payments missed */
            fun consecutiveMinimumPaymentsMissed(consecutiveMinimumPaymentsMissed: Long) =
                consecutiveMinimumPaymentsMissed(JsonField.of(consecutiveMinimumPaymentsMissed))

            /** Number of consecutive minimum payments missed */
            fun consecutiveMinimumPaymentsMissed(
                consecutiveMinimumPaymentsMissed: JsonField<Long>
            ) = apply { this.consecutiveMinimumPaymentsMissed = consecutiveMinimumPaymentsMissed }

            /** Number of days past due */
            fun daysPastDue(daysPastDue: Long) = daysPastDue(JsonField.of(daysPastDue))

            /** Number of days past due */
            fun daysPastDue(daysPastDue: JsonField<Long>) = apply { this.daysPastDue = daysPastDue }

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: Boolean) = hasGrace(JsonField.of(hasGrace))

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: JsonField<Boolean>) = apply { this.hasGrace = hasGrace }

            /** Current overall period number */
            fun periodNumber(periodNumber: Long) = periodNumber(JsonField.of(periodNumber))

            /** Current overall period number */
            fun periodNumber(periodNumber: JsonField<Long>) = apply {
                this.periodNumber = periodNumber
            }

            fun periodState(periodState: PeriodState) = periodState(JsonField.of(periodState))

            fun periodState(periodState: JsonField<PeriodState>) = apply {
                this.periodState = periodState
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

            fun build(): AccountStanding =
                AccountStanding(
                    checkRequired("consecutiveFullPaymentsMade", consecutiveFullPaymentsMade),
                    checkRequired("consecutiveMinimumPaymentsMade", consecutiveMinimumPaymentsMade),
                    checkRequired(
                        "consecutiveMinimumPaymentsMissed",
                        consecutiveMinimumPaymentsMissed
                    ),
                    checkRequired("daysPastDue", daysPastDue),
                    checkRequired("hasGrace", hasGrace),
                    checkRequired("periodNumber", periodNumber),
                    checkRequired("periodState", periodState),
                    additionalProperties.toImmutable(),
                )
        }

        class PeriodState
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STANDARD = of("STANDARD")

                @JvmField val PROMO = of("PROMO")

                @JvmField val PENALTY = of("PENALTY")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PeriodState && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountStanding && consecutiveFullPaymentsMade == other.consecutiveFullPaymentsMade && consecutiveMinimumPaymentsMade == other.consecutiveMinimumPaymentsMade && consecutiveMinimumPaymentsMissed == other.consecutiveMinimumPaymentsMissed && daysPastDue == other.daysPastDue && hasGrace == other.hasGrace && periodNumber == other.periodNumber && periodState == other.periodState && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(consecutiveFullPaymentsMade, consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed, daysPastDue, hasGrace, periodNumber, periodState, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStanding{consecutiveFullPaymentsMade=$consecutiveFullPaymentsMade, consecutiveMinimumPaymentsMade=$consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed=$consecutiveMinimumPaymentsMissed, daysPastDue=$daysPastDue, hasGrace=$hasGrace, periodNumber=$periodNumber, periodState=$periodState, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AmountDue
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("past_due")
        @ExcludeMissing
        private val pastDue: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Amount past due for statement in cents */
        @JsonProperty("past_due") @ExcludeMissing fun _pastDue(): JsonField<Long> = pastDue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AmountDue = apply {
            if (validated) {
                return@apply
            }

            amount()
            pastDue()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var pastDue: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amountDue: AmountDue) = apply {
                amount = amountDue.amount
                pastDue = amountDue.pastDue
                additionalProperties = amountDue.additionalProperties.toMutableMap()
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
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Amount past due for statement in cents */
            fun pastDue(pastDue: Long) = pastDue(JsonField.of(pastDue))

            /** Amount past due for statement in cents */
            fun pastDue(pastDue: JsonField<Long>) = apply { this.pastDue = pastDue }

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

            fun build(): AmountDue =
                AmountDue(
                    checkRequired("amount", amount),
                    checkRequired("pastDue", pastDue),
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

    @NoAutoDetect
    class StatementTotals
    @JsonCreator
    private constructor(
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        private val balanceTransfers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cash_advances")
        @ExcludeMissing
        private val cashAdvances: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        private val credits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing private val fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interest")
        @ExcludeMissing
        private val interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payments")
        @ExcludeMissing
        private val payments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("purchases")
        @ExcludeMissing
        private val purchases: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Opening balance transferred from previous account in cents */
        fun balanceTransfers(): Long = balanceTransfers.getRequired("balance_transfers")

        /** ATM and cashback transactions in cents */
        fun cashAdvances(): Long = cashAdvances.getRequired("cash_advances")

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         */
        fun credits(): Long = credits.getRequired("credits")

        /** Volume of debit management operation transactions less any interest in cents */
        fun fees(): Long = fees.getRequired("fees")

        /** Interest accrued in cents */
        fun interest(): Long = interest.getRequired("interest")

        /** Any funds transfers which affective the balance in cents */
        fun payments(): Long = payments.getRequired("payments")

        /** Net card transaction volume less any cash advances in cents */
        fun purchases(): Long = purchases.getRequired("purchases")

        /** Opening balance transferred from previous account in cents */
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        fun _balanceTransfers(): JsonField<Long> = balanceTransfers

        /** ATM and cashback transactions in cents */
        @JsonProperty("cash_advances")
        @ExcludeMissing
        fun _cashAdvances(): JsonField<Long> = cashAdvances

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

        /** Volume of debit management operation transactions less any interest in cents */
        @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

        /** Interest accrued in cents */
        @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

        /** Any funds transfers which affective the balance in cents */
        @JsonProperty("payments") @ExcludeMissing fun _payments(): JsonField<Long> = payments

        /** Net card transaction volume less any cash advances in cents */
        @JsonProperty("purchases") @ExcludeMissing fun _purchases(): JsonField<Long> = purchases

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StatementTotals = apply {
            if (validated) {
                return@apply
            }

            balanceTransfers()
            cashAdvances()
            credits()
            fees()
            interest()
            payments()
            purchases()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var balanceTransfers: JsonField<Long>? = null
            private var cashAdvances: JsonField<Long>? = null
            private var credits: JsonField<Long>? = null
            private var fees: JsonField<Long>? = null
            private var interest: JsonField<Long>? = null
            private var payments: JsonField<Long>? = null
            private var purchases: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(statementTotals: StatementTotals) = apply {
                balanceTransfers = statementTotals.balanceTransfers
                cashAdvances = statementTotals.cashAdvances
                credits = statementTotals.credits
                fees = statementTotals.fees
                interest = statementTotals.interest
                payments = statementTotals.payments
                purchases = statementTotals.purchases
                additionalProperties = statementTotals.additionalProperties.toMutableMap()
            }

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: Long) =
                balanceTransfers(JsonField.of(balanceTransfers))

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: JsonField<Long>) = apply {
                this.balanceTransfers = balanceTransfers
            }

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: JsonField<Long>) = apply {
                this.cashAdvances = cashAdvances
            }

            /**
             * Volume of credit management operation transactions less any balance transfers in
             * cents
             */
            fun credits(credits: Long) = credits(JsonField.of(credits))

            /**
             * Volume of credit management operation transactions less any balance transfers in
             * cents
             */
            fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

            /** Volume of debit management operation transactions less any interest in cents */
            fun fees(fees: Long) = fees(JsonField.of(fees))

            /** Volume of debit management operation transactions less any interest in cents */
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            /** Interest accrued in cents */
            fun interest(interest: Long) = interest(JsonField.of(interest))

            /** Interest accrued in cents */
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: Long) = payments(JsonField.of(payments))

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

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

            fun build(): StatementTotals =
                StatementTotals(
                    checkRequired("balanceTransfers", balanceTransfers),
                    checkRequired("cashAdvances", cashAdvances),
                    checkRequired("credits", credits),
                    checkRequired("fees", fees),
                    checkRequired("interest", interest),
                    checkRequired("payments", payments),
                    checkRequired("purchases", purchases),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementTotals && balanceTransfers == other.balanceTransfers && cashAdvances == other.cashAdvances && credits == other.credits && fees == other.fees && interest == other.interest && payments == other.payments && purchases == other.purchases && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(balanceTransfers, cashAdvances, credits, fees, interest, payments, purchases, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StatementTotals{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, credits=$credits, fees=$fees, interest=$interest, payments=$payments, purchases=$purchases, additionalProperties=$additionalProperties}"
    }

    class StatementType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INITIAL = of("INITIAL")

            @JvmField val PERIOD_END = of("PERIOD_END")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class InterestDetails
    @JsonCreator
    private constructor(
        @JsonProperty("actual_interest_charged")
        @ExcludeMissing
        private val actualInterestCharged: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("daily_balance_amounts")
        @ExcludeMissing
        private val dailyBalanceAmounts: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("effective_apr")
        @ExcludeMissing
        private val effectiveApr: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("interest_calculation_method")
        @ExcludeMissing
        private val interestCalculationMethod: JsonField<InterestCalculationMethod> =
            JsonMissing.of(),
        @JsonProperty("interest_for_period")
        @ExcludeMissing
        private val interestForPeriod: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("prime_rate")
        @ExcludeMissing
        private val primeRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_interest_charged")
        @ExcludeMissing
        private val minimumInterestCharged: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun actualInterestCharged(): Optional<Long> =
            Optional.ofNullable(actualInterestCharged.getNullable("actual_interest_charged"))

        fun dailyBalanceAmounts(): CategoryDetails =
            dailyBalanceAmounts.getRequired("daily_balance_amounts")

        fun effectiveApr(): CategoryDetails = effectiveApr.getRequired("effective_apr")

        fun interestCalculationMethod(): InterestCalculationMethod =
            interestCalculationMethod.getRequired("interest_calculation_method")

        fun interestForPeriod(): CategoryDetails =
            interestForPeriod.getRequired("interest_for_period")

        fun primeRate(): Optional<String> = Optional.ofNullable(primeRate.getNullable("prime_rate"))

        fun minimumInterestCharged(): Optional<Long> =
            Optional.ofNullable(minimumInterestCharged.getNullable("minimum_interest_charged"))

        @JsonProperty("actual_interest_charged")
        @ExcludeMissing
        fun _actualInterestCharged(): JsonField<Long> = actualInterestCharged

        @JsonProperty("daily_balance_amounts")
        @ExcludeMissing
        fun _dailyBalanceAmounts(): JsonField<CategoryDetails> = dailyBalanceAmounts

        @JsonProperty("effective_apr")
        @ExcludeMissing
        fun _effectiveApr(): JsonField<CategoryDetails> = effectiveApr

        @JsonProperty("interest_calculation_method")
        @ExcludeMissing
        fun _interestCalculationMethod(): JsonField<InterestCalculationMethod> =
            interestCalculationMethod

        @JsonProperty("interest_for_period")
        @ExcludeMissing
        fun _interestForPeriod(): JsonField<CategoryDetails> = interestForPeriod

        @JsonProperty("prime_rate") @ExcludeMissing fun _primeRate(): JsonField<String> = primeRate

        @JsonProperty("minimum_interest_charged")
        @ExcludeMissing
        fun _minimumInterestCharged(): JsonField<Long> = minimumInterestCharged

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InterestDetails = apply {
            if (validated) {
                return@apply
            }

            actualInterestCharged()
            dailyBalanceAmounts().validate()
            effectiveApr().validate()
            interestCalculationMethod()
            interestForPeriod().validate()
            primeRate()
            minimumInterestCharged()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var actualInterestCharged: JsonField<Long>? = null
            private var dailyBalanceAmounts: JsonField<CategoryDetails>? = null
            private var effectiveApr: JsonField<CategoryDetails>? = null
            private var interestCalculationMethod: JsonField<InterestCalculationMethod>? = null
            private var interestForPeriod: JsonField<CategoryDetails>? = null
            private var primeRate: JsonField<String>? = null
            private var minimumInterestCharged: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interestDetails: InterestDetails) = apply {
                actualInterestCharged = interestDetails.actualInterestCharged
                dailyBalanceAmounts = interestDetails.dailyBalanceAmounts
                effectiveApr = interestDetails.effectiveApr
                interestCalculationMethod = interestDetails.interestCalculationMethod
                interestForPeriod = interestDetails.interestForPeriod
                primeRate = interestDetails.primeRate
                minimumInterestCharged = interestDetails.minimumInterestCharged
                additionalProperties = interestDetails.additionalProperties.toMutableMap()
            }

            fun actualInterestCharged(actualInterestCharged: Long?) =
                actualInterestCharged(JsonField.ofNullable(actualInterestCharged))

            fun actualInterestCharged(actualInterestCharged: Long) =
                actualInterestCharged(actualInterestCharged as Long?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun actualInterestCharged(actualInterestCharged: Optional<Long>) =
                actualInterestCharged(actualInterestCharged.orElse(null) as Long?)

            fun actualInterestCharged(actualInterestCharged: JsonField<Long>) = apply {
                this.actualInterestCharged = actualInterestCharged
            }

            fun dailyBalanceAmounts(dailyBalanceAmounts: CategoryDetails) =
                dailyBalanceAmounts(JsonField.of(dailyBalanceAmounts))

            fun dailyBalanceAmounts(dailyBalanceAmounts: JsonField<CategoryDetails>) = apply {
                this.dailyBalanceAmounts = dailyBalanceAmounts
            }

            fun effectiveApr(effectiveApr: CategoryDetails) =
                effectiveApr(JsonField.of(effectiveApr))

            fun effectiveApr(effectiveApr: JsonField<CategoryDetails>) = apply {
                this.effectiveApr = effectiveApr
            }

            fun interestCalculationMethod(interestCalculationMethod: InterestCalculationMethod) =
                interestCalculationMethod(JsonField.of(interestCalculationMethod))

            fun interestCalculationMethod(
                interestCalculationMethod: JsonField<InterestCalculationMethod>
            ) = apply { this.interestCalculationMethod = interestCalculationMethod }

            fun interestForPeriod(interestForPeriod: CategoryDetails) =
                interestForPeriod(JsonField.of(interestForPeriod))

            fun interestForPeriod(interestForPeriod: JsonField<CategoryDetails>) = apply {
                this.interestForPeriod = interestForPeriod
            }

            fun primeRate(primeRate: String?) = primeRate(JsonField.ofNullable(primeRate))

            fun primeRate(primeRate: Optional<String>) = primeRate(primeRate.orElse(null))

            fun primeRate(primeRate: JsonField<String>) = apply { this.primeRate = primeRate }

            fun minimumInterestCharged(minimumInterestCharged: Long?) =
                minimumInterestCharged(JsonField.ofNullable(minimumInterestCharged))

            fun minimumInterestCharged(minimumInterestCharged: Long) =
                minimumInterestCharged(minimumInterestCharged as Long?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun minimumInterestCharged(minimumInterestCharged: Optional<Long>) =
                minimumInterestCharged(minimumInterestCharged.orElse(null) as Long?)

            fun minimumInterestCharged(minimumInterestCharged: JsonField<Long>) = apply {
                this.minimumInterestCharged = minimumInterestCharged
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

            fun build(): InterestDetails =
                InterestDetails(
                    checkRequired("actualInterestCharged", actualInterestCharged),
                    checkRequired("dailyBalanceAmounts", dailyBalanceAmounts),
                    checkRequired("effectiveApr", effectiveApr),
                    checkRequired("interestCalculationMethod", interestCalculationMethod),
                    checkRequired("interestForPeriod", interestForPeriod),
                    checkRequired("primeRate", primeRate),
                    minimumInterestCharged,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CategoryDetails
        @JsonCreator
        private constructor(
            @JsonProperty("balance_transfers")
            @ExcludeMissing
            private val balanceTransfers: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cash_advances")
            @ExcludeMissing
            private val cashAdvances: JsonField<String> = JsonMissing.of(),
            @JsonProperty("purchases")
            @ExcludeMissing
            private val purchases: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun balanceTransfers(): String = balanceTransfers.getRequired("balance_transfers")

            fun cashAdvances(): String = cashAdvances.getRequired("cash_advances")

            fun purchases(): String = purchases.getRequired("purchases")

            @JsonProperty("balance_transfers")
            @ExcludeMissing
            fun _balanceTransfers(): JsonField<String> = balanceTransfers

            @JsonProperty("cash_advances")
            @ExcludeMissing
            fun _cashAdvances(): JsonField<String> = cashAdvances

            @JsonProperty("purchases")
            @ExcludeMissing
            fun _purchases(): JsonField<String> = purchases

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CategoryDetails = apply {
                if (validated) {
                    return@apply
                }

                balanceTransfers()
                cashAdvances()
                purchases()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var balanceTransfers: JsonField<String>? = null
                private var cashAdvances: JsonField<String>? = null
                private var purchases: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(categoryDetails: CategoryDetails) = apply {
                    balanceTransfers = categoryDetails.balanceTransfers
                    cashAdvances = categoryDetails.cashAdvances
                    purchases = categoryDetails.purchases
                    additionalProperties = categoryDetails.additionalProperties.toMutableMap()
                }

                fun balanceTransfers(balanceTransfers: String) =
                    balanceTransfers(JsonField.of(balanceTransfers))

                fun balanceTransfers(balanceTransfers: JsonField<String>) = apply {
                    this.balanceTransfers = balanceTransfers
                }

                fun cashAdvances(cashAdvances: String) = cashAdvances(JsonField.of(cashAdvances))

                fun cashAdvances(cashAdvances: JsonField<String>) = apply {
                    this.cashAdvances = cashAdvances
                }

                fun purchases(purchases: String) = purchases(JsonField.of(purchases))

                fun purchases(purchases: JsonField<String>) = apply { this.purchases = purchases }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CategoryDetails =
                    CategoryDetails(
                        checkRequired("balanceTransfers", balanceTransfers),
                        checkRequired("cashAdvances", cashAdvances),
                        checkRequired("purchases", purchases),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CategoryDetails && balanceTransfers == other.balanceTransfers && cashAdvances == other.cashAdvances && purchases == other.purchases && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(balanceTransfers, cashAdvances, purchases, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CategoryDetails{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, purchases=$purchases, additionalProperties=$additionalProperties}"
        }

        class InterestCalculationMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DAILY = of("DAILY")

                @JvmField val AVERAGE_DAILY = of("AVERAGE_DAILY")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InterestCalculationMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InterestDetails && actualInterestCharged == other.actualInterestCharged && dailyBalanceAmounts == other.dailyBalanceAmounts && effectiveApr == other.effectiveApr && interestCalculationMethod == other.interestCalculationMethod && interestForPeriod == other.interestForPeriod && primeRate == other.primeRate && minimumInterestCharged == other.minimumInterestCharged && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(actualInterestCharged, dailyBalanceAmounts, effectiveApr, interestCalculationMethod, interestForPeriod, primeRate, minimumInterestCharged, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestDetails{actualInterestCharged=$actualInterestCharged, dailyBalanceAmounts=$dailyBalanceAmounts, effectiveApr=$effectiveApr, interestCalculationMethod=$interestCalculationMethod, interestForPeriod=$interestForPeriod, primeRate=$primeRate, minimumInterestCharged=$minimumInterestCharged, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Statement && token == other.token && accountStanding == other.accountStanding && amountDue == other.amountDue && availableCredit == other.availableCredit && created == other.created && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && daysInBillingCycle == other.daysInBillingCycle && endingBalance == other.endingBalance && financialAccountToken == other.financialAccountToken && paymentDueDate == other.paymentDueDate && periodTotals == other.periodTotals && startingBalance == other.startingBalance && statementEndDate == other.statementEndDate && statementStartDate == other.statementStartDate && statementType == other.statementType && updated == other.updated && ytdTotals == other.ytdTotals && interestDetails == other.interestDetails && nextPaymentDueDate == other.nextPaymentDueDate && nextStatementEndDate == other.nextStatementEndDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountStanding, amountDue, availableCredit, created, creditLimit, creditProductToken, daysInBillingCycle, endingBalance, financialAccountToken, paymentDueDate, periodTotals, startingBalance, statementEndDate, statementStartDate, statementType, updated, ytdTotals, interestDetails, nextPaymentDueDate, nextStatementEndDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Statement{token=$token, accountStanding=$accountStanding, amountDue=$amountDue, availableCredit=$availableCredit, created=$created, creditLimit=$creditLimit, creditProductToken=$creditProductToken, daysInBillingCycle=$daysInBillingCycle, endingBalance=$endingBalance, financialAccountToken=$financialAccountToken, paymentDueDate=$paymentDueDate, periodTotals=$periodTotals, startingBalance=$startingBalance, statementEndDate=$statementEndDate, statementStartDate=$statementStartDate, statementType=$statementType, updated=$updated, ytdTotals=$ytdTotals, interestDetails=$interestDetails, nextPaymentDueDate=$nextPaymentDueDate, nextStatementEndDate=$nextStatementEndDate, additionalProperties=$additionalProperties}"
}
