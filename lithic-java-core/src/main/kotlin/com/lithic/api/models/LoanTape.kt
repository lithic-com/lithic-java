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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class LoanTape
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date") @ExcludeMissing private val date: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    private val ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("period_totals")
    @ExcludeMissing
    private val periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("day_totals")
    @ExcludeMissing
    private val dayTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("balances")
    @ExcludeMissing
    private val balances: JsonField<Balances> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("credit_limit")
    @ExcludeMissing
    private val creditLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("available_credit")
    @ExcludeMissing
    private val availableCredit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("excess_credits")
    @ExcludeMissing
    private val excessCredits: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("account_standing")
    @ExcludeMissing
    private val accountStanding: JsonField<AccountStanding> = JsonMissing.of(),
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    private val creditProductToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tier") @ExcludeMissing private val tier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_allocation")
    @ExcludeMissing
    private val paymentAllocation: JsonField<CategoryBalances> = JsonMissing.of(),
    @JsonProperty("minimum_payment_balance")
    @ExcludeMissing
    private val minimumPaymentBalance: JsonField<BalanceDetails> = JsonMissing.of(),
    @JsonProperty("previous_statement_balance")
    @ExcludeMissing
    private val previousStatementBalance: JsonField<BalanceDetails> = JsonMissing.of(),
    @JsonProperty("interest_details")
    @ExcludeMissing
    private val interestDetails: JsonField<InterestDetails> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for a loan tape */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Date of transactions that this loan tape covers */
    fun date(): LocalDate = date.getRequired("date")

    /** Timestamp of when the loan tape was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Timestamp of when the loan tape was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Version number of the loan tape. This starts at 1 */
    fun version(): Long = version.getRequired("version")

    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    fun dayTotals(): StatementTotals = dayTotals.getRequired("day_totals")

    fun balances(): Balances = balances.getRequired("balances")

    /** Balance at the start of the day */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /** Balance at the end of the day */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Amount of credit available to spend in cents */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /**
     * Excess credits in the form of provisional credits, payments, or purchase refunds. If
     * positive, the account is in net credit state with no outstanding balances. An overpayment
     * could land an account in this state
     */
    fun excessCredits(): Long = excessCredits.getRequired("excess_credits")

    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    /** Globally unique identifier for a credit product */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /** Interest tier to which this account belongs to */
    fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

    fun paymentAllocation(): CategoryBalances = paymentAllocation.getRequired("payment_allocation")

    fun minimumPaymentBalance(): BalanceDetails =
        minimumPaymentBalance.getRequired("minimum_payment_balance")

    fun previousStatementBalance(): BalanceDetails =
        previousStatementBalance.getRequired("previous_statement_balance")

    fun interestDetails(): Optional<InterestDetails> =
        Optional.ofNullable(interestDetails.getNullable("interest_details"))

    /** Globally unique identifier for a loan tape */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Date of transactions that this loan tape covers */
    @JsonProperty("date") @ExcludeMissing fun _date() = date

    /** Timestamp of when the loan tape was created */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Timestamp of when the loan tape was updated */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    /** Version number of the loan tape. This starts at 1 */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("ytd_totals") @ExcludeMissing fun _ytdTotals() = ytdTotals

    @JsonProperty("period_totals") @ExcludeMissing fun _periodTotals() = periodTotals

    @JsonProperty("day_totals") @ExcludeMissing fun _dayTotals() = dayTotals

    @JsonProperty("balances") @ExcludeMissing fun _balances() = balances

    /** Balance at the start of the day */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /** Balance at the end of the day */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    /** Amount of credit available to spend in cents */
    @JsonProperty("available_credit") @ExcludeMissing fun _availableCredit() = availableCredit

    /**
     * Excess credits in the form of provisional credits, payments, or purchase refunds. If
     * positive, the account is in net credit state with no outstanding balances. An overpayment
     * could land an account in this state
     */
    @JsonProperty("excess_credits") @ExcludeMissing fun _excessCredits() = excessCredits

    @JsonProperty("account_standing") @ExcludeMissing fun _accountStanding() = accountStanding

    /** Globally unique identifier for a credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken() = creditProductToken

    /** Interest tier to which this account belongs to */
    @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

    @JsonProperty("payment_allocation") @ExcludeMissing fun _paymentAllocation() = paymentAllocation

    @JsonProperty("minimum_payment_balance")
    @ExcludeMissing
    fun _minimumPaymentBalance() = minimumPaymentBalance

    @JsonProperty("previous_statement_balance")
    @ExcludeMissing
    fun _previousStatementBalance() = previousStatementBalance

    @JsonProperty("interest_details") @ExcludeMissing fun _interestDetails() = interestDetails

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LoanTape = apply {
        if (!validated) {
            token()
            financialAccountToken()
            date()
            created()
            updated()
            version()
            ytdTotals().validate()
            periodTotals().validate()
            dayTotals().validate()
            balances().validate()
            startingBalance()
            endingBalance()
            creditLimit()
            availableCredit()
            excessCredits()
            accountStanding().validate()
            creditProductToken()
            tier()
            paymentAllocation().validate()
            minimumPaymentBalance().validate()
            previousStatementBalance().validate()
            interestDetails().map { it.validate() }
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
        private var date: JsonField<LocalDate> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var ytdTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var periodTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var dayTotals: JsonField<StatementTotals> = JsonMissing.of()
        private var balances: JsonField<Balances> = JsonMissing.of()
        private var startingBalance: JsonField<Long> = JsonMissing.of()
        private var endingBalance: JsonField<Long> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var availableCredit: JsonField<Long> = JsonMissing.of()
        private var excessCredits: JsonField<Long> = JsonMissing.of()
        private var accountStanding: JsonField<AccountStanding> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<String> = JsonMissing.of()
        private var paymentAllocation: JsonField<CategoryBalances> = JsonMissing.of()
        private var minimumPaymentBalance: JsonField<BalanceDetails> = JsonMissing.of()
        private var previousStatementBalance: JsonField<BalanceDetails> = JsonMissing.of()
        private var interestDetails: JsonField<InterestDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTape: LoanTape) = apply {
            token = loanTape.token
            financialAccountToken = loanTape.financialAccountToken
            date = loanTape.date
            created = loanTape.created
            updated = loanTape.updated
            version = loanTape.version
            ytdTotals = loanTape.ytdTotals
            periodTotals = loanTape.periodTotals
            dayTotals = loanTape.dayTotals
            balances = loanTape.balances
            startingBalance = loanTape.startingBalance
            endingBalance = loanTape.endingBalance
            creditLimit = loanTape.creditLimit
            availableCredit = loanTape.availableCredit
            excessCredits = loanTape.excessCredits
            accountStanding = loanTape.accountStanding
            creditProductToken = loanTape.creditProductToken
            tier = loanTape.tier
            paymentAllocation = loanTape.paymentAllocation
            minimumPaymentBalance = loanTape.minimumPaymentBalance
            previousStatementBalance = loanTape.previousStatementBalance
            interestDetails = loanTape.interestDetails
            additionalProperties = loanTape.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a loan tape */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a loan tape */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Date of transactions that this loan tape covers */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /** Date of transactions that this loan tape covers */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** Timestamp of when the loan tape was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the loan tape was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Timestamp of when the loan tape was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Timestamp of when the loan tape was updated */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Version number of the loan tape. This starts at 1 */
        fun version(version: Long) = version(JsonField.of(version))

        /** Version number of the loan tape. This starts at 1 */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        fun dayTotals(dayTotals: StatementTotals) = dayTotals(JsonField.of(dayTotals))

        fun dayTotals(dayTotals: JsonField<StatementTotals>) = apply { this.dayTotals = dayTotals }

        fun balances(balances: Balances) = balances(JsonField.of(balances))

        fun balances(balances: JsonField<Balances>) = apply { this.balances = balances }

        /** Balance at the start of the day */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** Balance at the start of the day */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /** Balance at the end of the day */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /** Balance at the end of the day */
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /**
         * For prepay accounts, this is the minimum prepay balance that must be maintained. For
         * charge card accounts, this is the maximum credit balance extended by a lender
         */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /**
         * For prepay accounts, this is the minimum prepay balance that must be maintained. For
         * charge card accounts, this is the maximum credit balance extended by a lender
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        /**
         * Excess credits in the form of provisional credits, payments, or purchase refunds. If
         * positive, the account is in net credit state with no outstanding balances. An overpayment
         * could land an account in this state
         */
        fun excessCredits(excessCredits: Long) = excessCredits(JsonField.of(excessCredits))

        /**
         * Excess credits in the form of provisional credits, payments, or purchase refunds. If
         * positive, the account is in net credit state with no outstanding balances. An overpayment
         * could land an account in this state
         */
        fun excessCredits(excessCredits: JsonField<Long>) = apply {
            this.excessCredits = excessCredits
        }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Interest tier to which this account belongs to */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /** Interest tier to which this account belongs to */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        fun paymentAllocation(paymentAllocation: CategoryBalances) =
            paymentAllocation(JsonField.of(paymentAllocation))

        fun paymentAllocation(paymentAllocation: JsonField<CategoryBalances>) = apply {
            this.paymentAllocation = paymentAllocation
        }

        fun minimumPaymentBalance(minimumPaymentBalance: BalanceDetails) =
            minimumPaymentBalance(JsonField.of(minimumPaymentBalance))

        fun minimumPaymentBalance(minimumPaymentBalance: JsonField<BalanceDetails>) = apply {
            this.minimumPaymentBalance = minimumPaymentBalance
        }

        fun previousStatementBalance(previousStatementBalance: BalanceDetails) =
            previousStatementBalance(JsonField.of(previousStatementBalance))

        fun previousStatementBalance(previousStatementBalance: JsonField<BalanceDetails>) = apply {
            this.previousStatementBalance = previousStatementBalance
        }

        fun interestDetails(interestDetails: InterestDetails) =
            interestDetails(JsonField.of(interestDetails))

        fun interestDetails(interestDetails: JsonField<InterestDetails>) = apply {
            this.interestDetails = interestDetails
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

        fun build(): LoanTape =
            LoanTape(
                token,
                financialAccountToken,
                date,
                created,
                updated,
                version,
                ytdTotals,
                periodTotals,
                dayTotals,
                balances,
                startingBalance,
                endingBalance,
                creditLimit,
                availableCredit,
                excessCredits,
                accountStanding,
                creditProductToken,
                tier,
                paymentAllocation,
                minimumPaymentBalance,
                previousStatementBalance,
                interestDetails,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AccountStanding
    @JsonCreator
    private constructor(
        @JsonProperty("period_state")
        @ExcludeMissing
        private val periodState: JsonField<PeriodState> = JsonMissing.of(),
        @JsonProperty("period_number")
        @ExcludeMissing
        private val periodNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("consecutive_minimum_payments_made")
        @ExcludeMissing
        private val consecutiveMinimumPaymentsMade: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("consecutive_minimum_payments_missed")
        @ExcludeMissing
        private val consecutiveMinimumPaymentsMissed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("consecutive_full_payments_made")
        @ExcludeMissing
        private val consecutiveFullPaymentsMade: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("days_past_due")
        @ExcludeMissing
        private val daysPastDue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("has_grace")
        @ExcludeMissing
        private val hasGrace: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                periodState = accountStanding.periodState
                periodNumber = accountStanding.periodNumber
                consecutiveMinimumPaymentsMade = accountStanding.consecutiveMinimumPaymentsMade
                consecutiveMinimumPaymentsMissed = accountStanding.consecutiveMinimumPaymentsMissed
                consecutiveFullPaymentsMade = accountStanding.consecutiveFullPaymentsMade
                daysPastDue = accountStanding.daysPastDue
                hasGrace = accountStanding.hasGrace
                additionalProperties = accountStanding.additionalProperties.toMutableMap()
            }

            fun periodState(periodState: PeriodState) = periodState(JsonField.of(periodState))

            fun periodState(periodState: JsonField<PeriodState>) = apply {
                this.periodState = periodState
            }

            /** Current overall period number */
            fun periodNumber(periodNumber: Long) = periodNumber(JsonField.of(periodNumber))

            /** Current overall period number */
            fun periodNumber(periodNumber: JsonField<Long>) = apply {
                this.periodNumber = periodNumber
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

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: Long) =
                consecutiveFullPaymentsMade(JsonField.of(consecutiveFullPaymentsMade))

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: JsonField<Long>) = apply {
                this.consecutiveFullPaymentsMade = consecutiveFullPaymentsMade
            }

            /** Number of days past due */
            fun daysPastDue(daysPastDue: Long) = daysPastDue(JsonField.of(daysPastDue))

            /** Number of days past due */
            fun daysPastDue(daysPastDue: JsonField<Long>) = apply { this.daysPastDue = daysPastDue }

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: Boolean) = hasGrace(JsonField.of(hasGrace))

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: JsonField<Boolean>) = apply { this.hasGrace = hasGrace }

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

            return /* spotless:off */ other is AccountStanding && periodState == other.periodState && periodNumber == other.periodNumber && consecutiveMinimumPaymentsMade == other.consecutiveMinimumPaymentsMade && consecutiveMinimumPaymentsMissed == other.consecutiveMinimumPaymentsMissed && consecutiveFullPaymentsMade == other.consecutiveFullPaymentsMade && daysPastDue == other.daysPastDue && hasGrace == other.hasGrace && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(periodState, periodNumber, consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed, consecutiveFullPaymentsMade, daysPastDue, hasGrace, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStanding{periodState=$periodState, periodNumber=$periodNumber, consecutiveMinimumPaymentsMade=$consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed=$consecutiveMinimumPaymentsMissed, consecutiveFullPaymentsMade=$consecutiveFullPaymentsMade, daysPastDue=$daysPastDue, hasGrace=$hasGrace, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Balances
    @JsonCreator
    private constructor(
        @JsonProperty("past_due")
        @ExcludeMissing
        private val pastDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("due")
        @ExcludeMissing
        private val due: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("past_statements_due")
        @ExcludeMissing
        private val pastStatementsDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("next_statement_due")
        @ExcludeMissing
        private val nextStatementDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount not paid off on previous due dates */
        fun pastDue(): CategoryBalances = pastDue.getRequired("past_due")

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        fun due(): CategoryBalances = due.getRequired("due")

        /** Amount due for the past billing cycles. */
        fun pastStatementsDue(): CategoryBalances =
            pastStatementsDue.getRequired("past_statements_due")

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        fun nextStatementDue(): CategoryBalances =
            nextStatementDue.getRequired("next_statement_due")

        /** Amount not paid off on previous due dates */
        @JsonProperty("past_due") @ExcludeMissing fun _pastDue() = pastDue

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        @JsonProperty("due") @ExcludeMissing fun _due() = due

        /** Amount due for the past billing cycles. */
        @JsonProperty("past_statements_due")
        @ExcludeMissing
        fun _pastStatementsDue() = pastStatementsDue

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        @JsonProperty("next_statement_due")
        @ExcludeMissing
        fun _nextStatementDue() = nextStatementDue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Balances = apply {
            if (!validated) {
                pastDue().validate()
                due().validate()
                pastStatementsDue().validate()
                nextStatementDue().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var pastDue: JsonField<CategoryBalances> = JsonMissing.of()
            private var due: JsonField<CategoryBalances> = JsonMissing.of()
            private var pastStatementsDue: JsonField<CategoryBalances> = JsonMissing.of()
            private var nextStatementDue: JsonField<CategoryBalances> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balances: Balances) = apply {
                pastDue = balances.pastDue
                due = balances.due
                pastStatementsDue = balances.pastStatementsDue
                nextStatementDue = balances.nextStatementDue
                additionalProperties = balances.additionalProperties.toMutableMap()
            }

            /** Amount not paid off on previous due dates */
            fun pastDue(pastDue: CategoryBalances) = pastDue(JsonField.of(pastDue))

            /** Amount not paid off on previous due dates */
            fun pastDue(pastDue: JsonField<CategoryBalances>) = apply { this.pastDue = pastDue }

            /**
             * Amount due for the prior billing cycle. Any amounts not fully paid off on this due
             * date will be considered past due the next day
             */
            fun due(due: CategoryBalances) = due(JsonField.of(due))

            /**
             * Amount due for the prior billing cycle. Any amounts not fully paid off on this due
             * date will be considered past due the next day
             */
            fun due(due: JsonField<CategoryBalances>) = apply { this.due = due }

            /** Amount due for the past billing cycles. */
            fun pastStatementsDue(pastStatementsDue: CategoryBalances) =
                pastStatementsDue(JsonField.of(pastStatementsDue))

            /** Amount due for the past billing cycles. */
            fun pastStatementsDue(pastStatementsDue: JsonField<CategoryBalances>) = apply {
                this.pastStatementsDue = pastStatementsDue
            }

            /**
             * Amount due for the current billing cycle. Any amounts not paid off by early payments
             * or credits will be considered due at the end of the current billing period
             */
            fun nextStatementDue(nextStatementDue: CategoryBalances) =
                nextStatementDue(JsonField.of(nextStatementDue))

            /**
             * Amount due for the current billing cycle. Any amounts not paid off by early payments
             * or credits will be considered due at the end of the current billing period
             */
            fun nextStatementDue(nextStatementDue: JsonField<CategoryBalances>) = apply {
                this.nextStatementDue = nextStatementDue
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

            fun build(): Balances =
                Balances(
                    pastDue,
                    due,
                    pastStatementsDue,
                    nextStatementDue,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        @NoAutoDetect
        class CategoryBalances
        @JsonCreator
        private constructor(
            @JsonProperty("interest")
            @ExcludeMissing
            private val interest: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("principal")
            @ExcludeMissing
            private val principal: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fees")
            @ExcludeMissing
            private val fees: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun interest(): Long = interest.getRequired("interest")

            fun principal(): Long = principal.getRequired("principal")

            fun fees(): Long = fees.getRequired("fees")

            @JsonProperty("interest") @ExcludeMissing fun _interest() = interest

            @JsonProperty("principal") @ExcludeMissing fun _principal() = principal

            @JsonProperty("fees") @ExcludeMissing fun _fees() = fees

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CategoryBalances = apply {
                if (!validated) {
                    interest()
                    principal()
                    fees()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var interest: JsonField<Long> = JsonMissing.of()
                private var principal: JsonField<Long> = JsonMissing.of()
                private var fees: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(categoryBalances: CategoryBalances) = apply {
                    interest = categoryBalances.interest
                    principal = categoryBalances.principal
                    fees = categoryBalances.fees
                    additionalProperties = categoryBalances.additionalProperties.toMutableMap()
                }

                fun interest(interest: Long) = interest(JsonField.of(interest))

                fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

                fun principal(principal: Long) = principal(JsonField.of(principal))

                fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

                fun fees(fees: Long) = fees(JsonField.of(fees))

                fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

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

                fun build(): CategoryBalances =
                    CategoryBalances(
                        interest,
                        principal,
                        fees,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CategoryBalances && interest == other.interest && principal == other.principal && fees == other.fees && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(interest, principal, fees, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CategoryBalances{interest=$interest, principal=$principal, fees=$fees, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && pastDue == other.pastDue && due == other.due && pastStatementsDue == other.pastStatementsDue && nextStatementDue == other.nextStatementDue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(pastDue, due, pastStatementsDue, nextStatementDue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{pastDue=$pastDue, due=$due, pastStatementsDue=$pastStatementsDue, nextStatementDue=$nextStatementDue, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class StatementTotals
    @JsonCreator
    private constructor(
        @JsonProperty("payments")
        @ExcludeMissing
        private val payments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("purchases")
        @ExcludeMissing
        private val purchases: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing private val fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        private val credits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interest")
        @ExcludeMissing
        private val interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cash_advances")
        @ExcludeMissing
        private val cashAdvances: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        private val balanceTransfers: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                payments = statementTotals.payments
                purchases = statementTotals.purchases
                fees = statementTotals.fees
                credits = statementTotals.credits
                interest = statementTotals.interest
                cashAdvances = statementTotals.cashAdvances
                balanceTransfers = statementTotals.balanceTransfers
                additionalProperties = statementTotals.additionalProperties.toMutableMap()
            }

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: Long) = payments(JsonField.of(payments))

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

            /** Volume of debit management operation transactions less any interest in cents */
            fun fees(fees: Long) = fees(JsonField.of(fees))

            /** Volume of debit management operation transactions less any interest in cents */
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
            fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

            /** Interest accrued in cents */
            fun interest(interest: Long) = interest(JsonField.of(interest))

            /** Interest accrued in cents */
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: JsonField<Long>) = apply {
                this.cashAdvances = cashAdvances
            }

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: Long) =
                balanceTransfers(JsonField.of(balanceTransfers))

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: JsonField<Long>) = apply {
                this.balanceTransfers = balanceTransfers
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

    @NoAutoDetect
    class InterestDetails
    @JsonCreator
    private constructor(
        @JsonProperty("prime_rate")
        @ExcludeMissing
        private val primeRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_calculation_method")
        @ExcludeMissing
        private val interestCalculationMethod: JsonField<InterestCalculationMethod> =
            JsonMissing.of(),
        @JsonProperty("effective_apr")
        @ExcludeMissing
        private val effectiveApr: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("interest_for_period")
        @ExcludeMissing
        private val interestForPeriod: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("daily_balance_amounts")
        @ExcludeMissing
        private val dailyBalanceAmounts: JsonField<CategoryDetails> = JsonMissing.of(),
        @JsonProperty("minimum_interest_charged")
        @ExcludeMissing
        private val minimumInterestCharged: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actual_interest_charged")
        @ExcludeMissing
        private val actualInterestCharged: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                primeRate = interestDetails.primeRate
                interestCalculationMethod = interestDetails.interestCalculationMethod
                effectiveApr = interestDetails.effectiveApr
                interestForPeriod = interestDetails.interestForPeriod
                dailyBalanceAmounts = interestDetails.dailyBalanceAmounts
                minimumInterestCharged = interestDetails.minimumInterestCharged
                actualInterestCharged = interestDetails.actualInterestCharged
                additionalProperties = interestDetails.additionalProperties.toMutableMap()
            }

            fun primeRate(primeRate: String) = primeRate(JsonField.of(primeRate))

            fun primeRate(primeRate: JsonField<String>) = apply { this.primeRate = primeRate }

            fun interestCalculationMethod(interestCalculationMethod: InterestCalculationMethod) =
                interestCalculationMethod(JsonField.of(interestCalculationMethod))

            fun interestCalculationMethod(
                interestCalculationMethod: JsonField<InterestCalculationMethod>
            ) = apply { this.interestCalculationMethod = interestCalculationMethod }

            fun effectiveApr(effectiveApr: CategoryDetails) =
                effectiveApr(JsonField.of(effectiveApr))

            fun effectiveApr(effectiveApr: JsonField<CategoryDetails>) = apply {
                this.effectiveApr = effectiveApr
            }

            fun interestForPeriod(interestForPeriod: CategoryDetails) =
                interestForPeriod(JsonField.of(interestForPeriod))

            fun interestForPeriod(interestForPeriod: JsonField<CategoryDetails>) = apply {
                this.interestForPeriod = interestForPeriod
            }

            fun dailyBalanceAmounts(dailyBalanceAmounts: CategoryDetails) =
                dailyBalanceAmounts(JsonField.of(dailyBalanceAmounts))

            fun dailyBalanceAmounts(dailyBalanceAmounts: JsonField<CategoryDetails>) = apply {
                this.dailyBalanceAmounts = dailyBalanceAmounts
            }

            fun minimumInterestCharged(minimumInterestCharged: Long) =
                minimumInterestCharged(JsonField.of(minimumInterestCharged))

            fun minimumInterestCharged(minimumInterestCharged: JsonField<Long>) = apply {
                this.minimumInterestCharged = minimumInterestCharged
            }

            fun actualInterestCharged(actualInterestCharged: Long) =
                actualInterestCharged(JsonField.of(actualInterestCharged))

            fun actualInterestCharged(actualInterestCharged: JsonField<Long>) = apply {
                this.actualInterestCharged = actualInterestCharged
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

        @NoAutoDetect
        class CategoryDetails
        @JsonCreator
        private constructor(
            @JsonProperty("purchases")
            @ExcludeMissing
            private val purchases: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cash_advances")
            @ExcludeMissing
            private val cashAdvances: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance_transfers")
            @ExcludeMissing
            private val balanceTransfers: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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

            private var validated: Boolean = false

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
                    purchases = categoryDetails.purchases
                    cashAdvances = categoryDetails.cashAdvances
                    balanceTransfers = categoryDetails.balanceTransfers
                    additionalProperties = categoryDetails.additionalProperties.toMutableMap()
                }

                fun purchases(purchases: String) = purchases(JsonField.of(purchases))

                fun purchases(purchases: JsonField<String>) = apply { this.purchases = purchases }

                fun cashAdvances(cashAdvances: String) = cashAdvances(JsonField.of(cashAdvances))

                fun cashAdvances(cashAdvances: JsonField<String>) = apply {
                    this.cashAdvances = cashAdvances
                }

                fun balanceTransfers(balanceTransfers: String) =
                    balanceTransfers(JsonField.of(balanceTransfers))

                fun balanceTransfers(balanceTransfers: JsonField<String>) = apply {
                    this.balanceTransfers = balanceTransfers
                }

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

            return /* spotless:off */ other is InterestDetails && primeRate == other.primeRate && interestCalculationMethod == other.interestCalculationMethod && effectiveApr == other.effectiveApr && interestForPeriod == other.interestForPeriod && dailyBalanceAmounts == other.dailyBalanceAmounts && minimumInterestCharged == other.minimumInterestCharged && actualInterestCharged == other.actualInterestCharged && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(primeRate, interestCalculationMethod, effectiveApr, interestForPeriod, dailyBalanceAmounts, minimumInterestCharged, actualInterestCharged, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestDetails{primeRate=$primeRate, interestCalculationMethod=$interestCalculationMethod, effectiveApr=$effectiveApr, interestForPeriod=$interestForPeriod, dailyBalanceAmounts=$dailyBalanceAmounts, minimumInterestCharged=$minimumInterestCharged, actualInterestCharged=$actualInterestCharged, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class BalanceDetails
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("remaining")
        @ExcludeMissing
        private val remaining: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Long = amount.getRequired("amount")

        fun remaining(): Long = remaining.getRequired("remaining")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("remaining") @ExcludeMissing fun _remaining() = remaining

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BalanceDetails = apply {
            if (!validated) {
                amount()
                remaining()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var remaining: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceDetails: BalanceDetails) = apply {
                amount = balanceDetails.amount
                remaining = balanceDetails.remaining
                additionalProperties = balanceDetails.additionalProperties.toMutableMap()
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun remaining(remaining: Long) = remaining(JsonField.of(remaining))

            fun remaining(remaining: JsonField<Long>) = apply { this.remaining = remaining }

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

            fun build(): BalanceDetails =
                BalanceDetails(
                    amount,
                    remaining,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceDetails && amount == other.amount && remaining == other.remaining && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, remaining, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceDetails{amount=$amount, remaining=$remaining, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CategoryBalances
    @JsonCreator
    private constructor(
        @JsonProperty("interest")
        @ExcludeMissing
        private val interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("principal")
        @ExcludeMissing
        private val principal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing private val fees: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun interest(): Long = interest.getRequired("interest")

        fun principal(): Long = principal.getRequired("principal")

        fun fees(): Long = fees.getRequired("fees")

        @JsonProperty("interest") @ExcludeMissing fun _interest() = interest

        @JsonProperty("principal") @ExcludeMissing fun _principal() = principal

        @JsonProperty("fees") @ExcludeMissing fun _fees() = fees

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CategoryBalances = apply {
            if (!validated) {
                interest()
                principal()
                fees()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var interest: JsonField<Long> = JsonMissing.of()
            private var principal: JsonField<Long> = JsonMissing.of()
            private var fees: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(categoryBalances: CategoryBalances) = apply {
                interest = categoryBalances.interest
                principal = categoryBalances.principal
                fees = categoryBalances.fees
                additionalProperties = categoryBalances.additionalProperties.toMutableMap()
            }

            fun interest(interest: Long) = interest(JsonField.of(interest))

            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            fun principal(principal: Long) = principal(JsonField.of(principal))

            fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

            fun fees(fees: Long) = fees(JsonField.of(fees))

            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

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

            fun build(): CategoryBalances =
                CategoryBalances(
                    interest,
                    principal,
                    fees,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CategoryBalances && interest == other.interest && principal == other.principal && fees == other.fees && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(interest, principal, fees, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CategoryBalances{interest=$interest, principal=$principal, fees=$fees, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LoanTape && token == other.token && financialAccountToken == other.financialAccountToken && date == other.date && created == other.created && updated == other.updated && version == other.version && ytdTotals == other.ytdTotals && periodTotals == other.periodTotals && dayTotals == other.dayTotals && balances == other.balances && startingBalance == other.startingBalance && endingBalance == other.endingBalance && creditLimit == other.creditLimit && availableCredit == other.availableCredit && excessCredits == other.excessCredits && accountStanding == other.accountStanding && creditProductToken == other.creditProductToken && tier == other.tier && paymentAllocation == other.paymentAllocation && minimumPaymentBalance == other.minimumPaymentBalance && previousStatementBalance == other.previousStatementBalance && interestDetails == other.interestDetails && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, financialAccountToken, date, created, updated, version, ytdTotals, periodTotals, dayTotals, balances, startingBalance, endingBalance, creditLimit, availableCredit, excessCredits, accountStanding, creditProductToken, tier, paymentAllocation, minimumPaymentBalance, previousStatementBalance, interestDetails, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LoanTape{token=$token, financialAccountToken=$financialAccountToken, date=$date, created=$created, updated=$updated, version=$version, ytdTotals=$ytdTotals, periodTotals=$periodTotals, dayTotals=$dayTotals, balances=$balances, startingBalance=$startingBalance, endingBalance=$endingBalance, creditLimit=$creditLimit, availableCredit=$availableCredit, excessCredits=$excessCredits, accountStanding=$accountStanding, creditProductToken=$creditProductToken, tier=$tier, paymentAllocation=$paymentAllocation, minimumPaymentBalance=$minimumPaymentBalance, previousStatementBalance=$previousStatementBalance, interestDetails=$interestDetails, additionalProperties=$additionalProperties}"
}
