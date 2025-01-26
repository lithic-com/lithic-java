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
class LoanTape
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_standing")
    @ExcludeMissing
    private val accountStanding: JsonField<AccountStanding> = JsonMissing.of(),
    @JsonProperty("available_credit")
    @ExcludeMissing
    private val availableCredit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("balances")
    @ExcludeMissing
    private val balances: JsonField<Balances> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_limit")
    @ExcludeMissing
    private val creditLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    private val creditProductToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date") @ExcludeMissing private val date: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("day_totals")
    @ExcludeMissing
    private val dayTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("excess_credits")
    @ExcludeMissing
    private val excessCredits: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interest_details")
    @ExcludeMissing
    private val interestDetails: JsonField<InterestDetails> = JsonMissing.of(),
    @JsonProperty("minimum_payment_balance")
    @ExcludeMissing
    private val minimumPaymentBalance: JsonField<BalanceDetails> = JsonMissing.of(),
    @JsonProperty("payment_allocation")
    @ExcludeMissing
    private val paymentAllocation: JsonField<CategoryBalances> = JsonMissing.of(),
    @JsonProperty("period_totals")
    @ExcludeMissing
    private val periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("previous_statement_balance")
    @ExcludeMissing
    private val previousStatementBalance: JsonField<BalanceDetails> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    private val ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
    @JsonProperty("tier") @ExcludeMissing private val tier: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for a loan tape */
    fun token(): String = token.getRequired("token")

    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    /** Amount of credit available to spend in cents */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    fun balances(): Balances = balances.getRequired("balances")

    /** Timestamp of when the loan tape was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Globally unique identifier for a credit product */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /** Date of transactions that this loan tape covers */
    fun date(): LocalDate = date.getRequired("date")

    fun dayTotals(): StatementTotals = dayTotals.getRequired("day_totals")

    /** Balance at the end of the day */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * Excess credits in the form of provisional credits, payments, or purchase refunds. If
     * positive, the account is in net credit state with no outstanding balances. An overpayment
     * could land an account in this state
     */
    fun excessCredits(): Long = excessCredits.getRequired("excess_credits")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun interestDetails(): Optional<InterestDetails> =
        Optional.ofNullable(interestDetails.getNullable("interest_details"))

    fun minimumPaymentBalance(): BalanceDetails =
        minimumPaymentBalance.getRequired("minimum_payment_balance")

    fun paymentAllocation(): CategoryBalances = paymentAllocation.getRequired("payment_allocation")

    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    fun previousStatementBalance(): BalanceDetails =
        previousStatementBalance.getRequired("previous_statement_balance")

    /** Balance at the start of the day */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /** Timestamp of when the loan tape was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Version number of the loan tape. This starts at 1 */
    fun version(): Long = version.getRequired("version")

    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /** Interest tier to which this account belongs to */
    fun tier(): Optional<String> = Optional.ofNullable(tier.getNullable("tier"))

    /** Globally unique identifier for a loan tape */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("account_standing")
    @ExcludeMissing
    fun _accountStanding(): JsonField<AccountStanding> = accountStanding

    /** Amount of credit available to spend in cents */
    @JsonProperty("available_credit")
    @ExcludeMissing
    fun _availableCredit(): JsonField<Long> = availableCredit

    @JsonProperty("balances") @ExcludeMissing fun _balances(): JsonField<Balances> = balances

    /** Timestamp of when the loan tape was created */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /** Globally unique identifier for a credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /** Date of transactions that this loan tape covers */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    @JsonProperty("day_totals")
    @ExcludeMissing
    fun _dayTotals(): JsonField<StatementTotals> = dayTotals

    /** Balance at the end of the day */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /**
     * Excess credits in the form of provisional credits, payments, or purchase refunds. If
     * positive, the account is in net credit state with no outstanding balances. An overpayment
     * could land an account in this state
     */
    @JsonProperty("excess_credits")
    @ExcludeMissing
    fun _excessCredits(): JsonField<Long> = excessCredits

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    @JsonProperty("interest_details")
    @ExcludeMissing
    fun _interestDetails(): JsonField<InterestDetails> = interestDetails

    @JsonProperty("minimum_payment_balance")
    @ExcludeMissing
    fun _minimumPaymentBalance(): JsonField<BalanceDetails> = minimumPaymentBalance

    @JsonProperty("payment_allocation")
    @ExcludeMissing
    fun _paymentAllocation(): JsonField<CategoryBalances> = paymentAllocation

    @JsonProperty("period_totals")
    @ExcludeMissing
    fun _periodTotals(): JsonField<StatementTotals> = periodTotals

    @JsonProperty("previous_statement_balance")
    @ExcludeMissing
    fun _previousStatementBalance(): JsonField<BalanceDetails> = previousStatementBalance

    /** Balance at the start of the day */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /** Timestamp of when the loan tape was updated */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /** Version number of the loan tape. This starts at 1 */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("ytd_totals")
    @ExcludeMissing
    fun _ytdTotals(): JsonField<StatementTotals> = ytdTotals

    /** Interest tier to which this account belongs to */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LoanTape = apply {
        if (validated) {
            return@apply
        }

        token()
        accountStanding().validate()
        availableCredit()
        balances().validate()
        created()
        creditLimit()
        creditProductToken()
        date()
        dayTotals().validate()
        endingBalance()
        excessCredits()
        financialAccountToken()
        interestDetails().ifPresent { it.validate() }
        minimumPaymentBalance().validate()
        paymentAllocation().validate()
        periodTotals().validate()
        previousStatementBalance().validate()
        startingBalance()
        updated()
        version()
        ytdTotals().validate()
        tier()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountStanding: JsonField<AccountStanding>? = null
        private var availableCredit: JsonField<Long>? = null
        private var balances: JsonField<Balances>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var date: JsonField<LocalDate>? = null
        private var dayTotals: JsonField<StatementTotals>? = null
        private var endingBalance: JsonField<Long>? = null
        private var excessCredits: JsonField<Long>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var interestDetails: JsonField<InterestDetails>? = null
        private var minimumPaymentBalance: JsonField<BalanceDetails>? = null
        private var paymentAllocation: JsonField<CategoryBalances>? = null
        private var periodTotals: JsonField<StatementTotals>? = null
        private var previousStatementBalance: JsonField<BalanceDetails>? = null
        private var startingBalance: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var version: JsonField<Long>? = null
        private var ytdTotals: JsonField<StatementTotals>? = null
        private var tier: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTape: LoanTape) = apply {
            token = loanTape.token
            accountStanding = loanTape.accountStanding
            availableCredit = loanTape.availableCredit
            balances = loanTape.balances
            created = loanTape.created
            creditLimit = loanTape.creditLimit
            creditProductToken = loanTape.creditProductToken
            date = loanTape.date
            dayTotals = loanTape.dayTotals
            endingBalance = loanTape.endingBalance
            excessCredits = loanTape.excessCredits
            financialAccountToken = loanTape.financialAccountToken
            interestDetails = loanTape.interestDetails
            minimumPaymentBalance = loanTape.minimumPaymentBalance
            paymentAllocation = loanTape.paymentAllocation
            periodTotals = loanTape.periodTotals
            previousStatementBalance = loanTape.previousStatementBalance
            startingBalance = loanTape.startingBalance
            updated = loanTape.updated
            version = loanTape.version
            ytdTotals = loanTape.ytdTotals
            tier = loanTape.tier
            additionalProperties = loanTape.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a loan tape */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a loan tape */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        fun balances(balances: Balances) = balances(JsonField.of(balances))

        fun balances(balances: JsonField<Balances>) = apply { this.balances = balances }

        /** Timestamp of when the loan tape was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the loan tape was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Date of transactions that this loan tape covers */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /** Date of transactions that this loan tape covers */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        fun dayTotals(dayTotals: StatementTotals) = dayTotals(JsonField.of(dayTotals))

        fun dayTotals(dayTotals: JsonField<StatementTotals>) = apply { this.dayTotals = dayTotals }

        /** Balance at the end of the day */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /** Balance at the end of the day */
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
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

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun interestDetails(interestDetails: InterestDetails?) =
            interestDetails(JsonField.ofNullable(interestDetails))

        fun interestDetails(interestDetails: Optional<InterestDetails>) =
            interestDetails(interestDetails.orElse(null))

        fun interestDetails(interestDetails: JsonField<InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        fun minimumPaymentBalance(minimumPaymentBalance: BalanceDetails) =
            minimumPaymentBalance(JsonField.of(minimumPaymentBalance))

        fun minimumPaymentBalance(minimumPaymentBalance: JsonField<BalanceDetails>) = apply {
            this.minimumPaymentBalance = minimumPaymentBalance
        }

        fun paymentAllocation(paymentAllocation: CategoryBalances) =
            paymentAllocation(JsonField.of(paymentAllocation))

        fun paymentAllocation(paymentAllocation: JsonField<CategoryBalances>) = apply {
            this.paymentAllocation = paymentAllocation
        }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        fun previousStatementBalance(previousStatementBalance: BalanceDetails) =
            previousStatementBalance(JsonField.of(previousStatementBalance))

        fun previousStatementBalance(previousStatementBalance: JsonField<BalanceDetails>) = apply {
            this.previousStatementBalance = previousStatementBalance
        }

        /** Balance at the start of the day */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** Balance at the start of the day */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

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

        /** Interest tier to which this account belongs to */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /** Interest tier to which this account belongs to */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

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
                checkRequired("token", token),
                checkRequired("accountStanding", accountStanding),
                checkRequired("availableCredit", availableCredit),
                checkRequired("balances", balances),
                checkRequired("created", created),
                checkRequired("creditLimit", creditLimit),
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("date", date),
                checkRequired("dayTotals", dayTotals),
                checkRequired("endingBalance", endingBalance),
                checkRequired("excessCredits", excessCredits),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("interestDetails", interestDetails),
                checkRequired("minimumPaymentBalance", minimumPaymentBalance),
                checkRequired("paymentAllocation", paymentAllocation),
                checkRequired("periodTotals", periodTotals),
                checkRequired("previousStatementBalance", previousStatementBalance),
                checkRequired("startingBalance", startingBalance),
                checkRequired("updated", updated),
                checkRequired("version", version),
                checkRequired("ytdTotals", ytdTotals),
                tier,
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

        class Builder internal constructor() {

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
    class Balances
    @JsonCreator
    private constructor(
        @JsonProperty("due")
        @ExcludeMissing
        private val due: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("next_statement_due")
        @ExcludeMissing
        private val nextStatementDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("past_due")
        @ExcludeMissing
        private val pastDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonProperty("past_statements_due")
        @ExcludeMissing
        private val pastStatementsDue: JsonField<CategoryBalances> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        fun due(): CategoryBalances = due.getRequired("due")

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        fun nextStatementDue(): CategoryBalances =
            nextStatementDue.getRequired("next_statement_due")

        /** Amount not paid off on previous due dates */
        fun pastDue(): CategoryBalances = pastDue.getRequired("past_due")

        /** Amount due for the past billing cycles. */
        fun pastStatementsDue(): CategoryBalances =
            pastStatementsDue.getRequired("past_statements_due")

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        @JsonProperty("due") @ExcludeMissing fun _due(): JsonField<CategoryBalances> = due

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        @JsonProperty("next_statement_due")
        @ExcludeMissing
        fun _nextStatementDue(): JsonField<CategoryBalances> = nextStatementDue

        /** Amount not paid off on previous due dates */
        @JsonProperty("past_due")
        @ExcludeMissing
        fun _pastDue(): JsonField<CategoryBalances> = pastDue

        /** Amount due for the past billing cycles. */
        @JsonProperty("past_statements_due")
        @ExcludeMissing
        fun _pastStatementsDue(): JsonField<CategoryBalances> = pastStatementsDue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Balances = apply {
            if (validated) {
                return@apply
            }

            due().validate()
            nextStatementDue().validate()
            pastDue().validate()
            pastStatementsDue().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var due: JsonField<CategoryBalances>? = null
            private var nextStatementDue: JsonField<CategoryBalances>? = null
            private var pastDue: JsonField<CategoryBalances>? = null
            private var pastStatementsDue: JsonField<CategoryBalances>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balances: Balances) = apply {
                due = balances.due
                nextStatementDue = balances.nextStatementDue
                pastDue = balances.pastDue
                pastStatementsDue = balances.pastStatementsDue
                additionalProperties = balances.additionalProperties.toMutableMap()
            }

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

            /** Amount not paid off on previous due dates */
            fun pastDue(pastDue: CategoryBalances) = pastDue(JsonField.of(pastDue))

            /** Amount not paid off on previous due dates */
            fun pastDue(pastDue: JsonField<CategoryBalances>) = apply { this.pastDue = pastDue }

            /** Amount due for the past billing cycles. */
            fun pastStatementsDue(pastStatementsDue: CategoryBalances) =
                pastStatementsDue(JsonField.of(pastStatementsDue))

            /** Amount due for the past billing cycles. */
            fun pastStatementsDue(pastStatementsDue: JsonField<CategoryBalances>) = apply {
                this.pastStatementsDue = pastStatementsDue
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
                    checkRequired("due", due),
                    checkRequired("nextStatementDue", nextStatementDue),
                    checkRequired("pastDue", pastDue),
                    checkRequired("pastStatementsDue", pastStatementsDue),
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
            @JsonProperty("fees")
            @ExcludeMissing
            private val fees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("interest")
            @ExcludeMissing
            private val interest: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("principal")
            @ExcludeMissing
            private val principal: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun fees(): Long = fees.getRequired("fees")

            fun interest(): Long = interest.getRequired("interest")

            fun principal(): Long = principal.getRequired("principal")

            @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

            @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

            @JsonProperty("principal") @ExcludeMissing fun _principal(): JsonField<Long> = principal

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CategoryBalances = apply {
                if (validated) {
                    return@apply
                }

                fees()
                interest()
                principal()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var fees: JsonField<Long>? = null
                private var interest: JsonField<Long>? = null
                private var principal: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(categoryBalances: CategoryBalances) = apply {
                    fees = categoryBalances.fees
                    interest = categoryBalances.interest
                    principal = categoryBalances.principal
                    additionalProperties = categoryBalances.additionalProperties.toMutableMap()
                }

                fun fees(fees: Long) = fees(JsonField.of(fees))

                fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

                fun interest(interest: Long) = interest(JsonField.of(interest))

                fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

                fun principal(principal: Long) = principal(JsonField.of(principal))

                fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

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
                        checkRequired("fees", fees),
                        checkRequired("interest", interest),
                        checkRequired("principal", principal),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CategoryBalances && fees == other.fees && interest == other.interest && principal == other.principal && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(fees, interest, principal, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CategoryBalances{fees=$fees, interest=$interest, principal=$principal, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && due == other.due && nextStatementDue == other.nextStatementDue && pastDue == other.pastDue && pastStatementsDue == other.pastStatementsDue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(due, nextStatementDue, pastDue, pastStatementsDue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{due=$due, nextStatementDue=$nextStatementDue, pastDue=$pastDue, pastStatementsDue=$pastStatementsDue, additionalProperties=$additionalProperties}"
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

        class Builder internal constructor() {

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

        class Builder internal constructor() {

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

            class Builder internal constructor() {

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

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("remaining") @ExcludeMissing fun _remaining(): JsonField<Long> = remaining

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BalanceDetails = apply {
            if (validated) {
                return@apply
            }

            amount()
            remaining()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var remaining: JsonField<Long>? = null
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
                    checkRequired("amount", amount),
                    checkRequired("remaining", remaining),
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
        @JsonProperty("fees") @ExcludeMissing private val fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interest")
        @ExcludeMissing
        private val interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("principal")
        @ExcludeMissing
        private val principal: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fees(): Long = fees.getRequired("fees")

        fun interest(): Long = interest.getRequired("interest")

        fun principal(): Long = principal.getRequired("principal")

        @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

        @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

        @JsonProperty("principal") @ExcludeMissing fun _principal(): JsonField<Long> = principal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CategoryBalances = apply {
            if (validated) {
                return@apply
            }

            fees()
            interest()
            principal()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var fees: JsonField<Long>? = null
            private var interest: JsonField<Long>? = null
            private var principal: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(categoryBalances: CategoryBalances) = apply {
                fees = categoryBalances.fees
                interest = categoryBalances.interest
                principal = categoryBalances.principal
                additionalProperties = categoryBalances.additionalProperties.toMutableMap()
            }

            fun fees(fees: Long) = fees(JsonField.of(fees))

            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            fun interest(interest: Long) = interest(JsonField.of(interest))

            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            fun principal(principal: Long) = principal(JsonField.of(principal))

            fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

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
                    checkRequired("fees", fees),
                    checkRequired("interest", interest),
                    checkRequired("principal", principal),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CategoryBalances && fees == other.fees && interest == other.interest && principal == other.principal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fees, interest, principal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CategoryBalances{fees=$fees, interest=$interest, principal=$principal, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LoanTape && token == other.token && accountStanding == other.accountStanding && availableCredit == other.availableCredit && balances == other.balances && created == other.created && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && date == other.date && dayTotals == other.dayTotals && endingBalance == other.endingBalance && excessCredits == other.excessCredits && financialAccountToken == other.financialAccountToken && interestDetails == other.interestDetails && minimumPaymentBalance == other.minimumPaymentBalance && paymentAllocation == other.paymentAllocation && periodTotals == other.periodTotals && previousStatementBalance == other.previousStatementBalance && startingBalance == other.startingBalance && updated == other.updated && version == other.version && ytdTotals == other.ytdTotals && tier == other.tier && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountStanding, availableCredit, balances, created, creditLimit, creditProductToken, date, dayTotals, endingBalance, excessCredits, financialAccountToken, interestDetails, minimumPaymentBalance, paymentAllocation, periodTotals, previousStatementBalance, startingBalance, updated, version, ytdTotals, tier, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LoanTape{token=$token, accountStanding=$accountStanding, availableCredit=$availableCredit, balances=$balances, created=$created, creditLimit=$creditLimit, creditProductToken=$creditProductToken, date=$date, dayTotals=$dayTotals, endingBalance=$endingBalance, excessCredits=$excessCredits, financialAccountToken=$financialAccountToken, interestDetails=$interestDetails, minimumPaymentBalance=$minimumPaymentBalance, paymentAllocation=$paymentAllocation, periodTotals=$periodTotals, previousStatementBalance=$previousStatementBalance, startingBalance=$startingBalance, updated=$updated, version=$version, ytdTotals=$ytdTotals, tier=$tier, additionalProperties=$additionalProperties}"
}
