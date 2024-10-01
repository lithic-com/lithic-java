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
import java.util.Optional

@JsonDeserialize(builder = LoanTape.Builder::class)
@NoAutoDetect
class LoanTape
private constructor(
    private val token: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val date: JsonField<LocalDate>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val version: JsonField<Long>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val periodTotals: JsonField<StatementTotals>,
    private val dayTotals: JsonField<StatementTotals>,
    private val balancePastDue: JsonField<CategoryBalances>,
    private val balanceDue: JsonField<CategoryBalances>,
    private val balanceNextDue: JsonField<CategoryBalances>,
    private val creditLimit: JsonField<Long>,
    private val excessCredits: JsonField<Long>,
    private val accountStanding: JsonField<AccountStanding>,
    private val creditProductToken: JsonField<String>,
    private val tier: JsonField<String>,
    private val paymentAllocation: JsonField<CategoryBalances>,
    private val minimumPaymentBalance: JsonField<BalanceDetails>,
    private val statementBalance: JsonField<BalanceDetails>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    /** Amount not paid off on previous due dates */
    fun balancePastDue(): CategoryBalances = balancePastDue.getRequired("balance_past_due")

    /**
     * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date will
     * be considered past due the next day
     */
    fun balanceDue(): CategoryBalances = balanceDue.getRequired("balance_due")

    /**
     * Amount due for the current billing cycle. Any amounts not paid off by early payments or
     * credits will be considered due at the end of the current billing period
     */
    fun balanceNextDue(): CategoryBalances = balanceNextDue.getRequired("balance_next_due")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

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

    fun statementBalance(): BalanceDetails = statementBalance.getRequired("statement_balance")

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

    /** Amount not paid off on previous due dates */
    @JsonProperty("balance_past_due") @ExcludeMissing fun _balancePastDue() = balancePastDue

    /**
     * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date will
     * be considered past due the next day
     */
    @JsonProperty("balance_due") @ExcludeMissing fun _balanceDue() = balanceDue

    /**
     * Amount due for the current billing cycle. Any amounts not paid off by early payments or
     * credits will be considered due at the end of the current billing period
     */
    @JsonProperty("balance_next_due") @ExcludeMissing fun _balanceNextDue() = balanceNextDue

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

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

    @JsonProperty("statement_balance") @ExcludeMissing fun _statementBalance() = statementBalance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            balancePastDue().validate()
            balanceDue().validate()
            balanceNextDue().validate()
            creditLimit()
            excessCredits()
            accountStanding().validate()
            creditProductToken()
            tier()
            paymentAllocation().validate()
            minimumPaymentBalance().validate()
            statementBalance().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoanTape &&
            this.token == other.token &&
            this.financialAccountToken == other.financialAccountToken &&
            this.date == other.date &&
            this.created == other.created &&
            this.updated == other.updated &&
            this.version == other.version &&
            this.ytdTotals == other.ytdTotals &&
            this.periodTotals == other.periodTotals &&
            this.dayTotals == other.dayTotals &&
            this.balancePastDue == other.balancePastDue &&
            this.balanceDue == other.balanceDue &&
            this.balanceNextDue == other.balanceNextDue &&
            this.creditLimit == other.creditLimit &&
            this.excessCredits == other.excessCredits &&
            this.accountStanding == other.accountStanding &&
            this.creditProductToken == other.creditProductToken &&
            this.tier == other.tier &&
            this.paymentAllocation == other.paymentAllocation &&
            this.minimumPaymentBalance == other.minimumPaymentBalance &&
            this.statementBalance == other.statementBalance &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    financialAccountToken,
                    date,
                    created,
                    updated,
                    version,
                    ytdTotals,
                    periodTotals,
                    dayTotals,
                    balancePastDue,
                    balanceDue,
                    balanceNextDue,
                    creditLimit,
                    excessCredits,
                    accountStanding,
                    creditProductToken,
                    tier,
                    paymentAllocation,
                    minimumPaymentBalance,
                    statementBalance,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LoanTape{token=$token, financialAccountToken=$financialAccountToken, date=$date, created=$created, updated=$updated, version=$version, ytdTotals=$ytdTotals, periodTotals=$periodTotals, dayTotals=$dayTotals, balancePastDue=$balancePastDue, balanceDue=$balanceDue, balanceNextDue=$balanceNextDue, creditLimit=$creditLimit, excessCredits=$excessCredits, accountStanding=$accountStanding, creditProductToken=$creditProductToken, tier=$tier, paymentAllocation=$paymentAllocation, minimumPaymentBalance=$minimumPaymentBalance, statementBalance=$statementBalance, additionalProperties=$additionalProperties}"

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
        private var balancePastDue: JsonField<CategoryBalances> = JsonMissing.of()
        private var balanceDue: JsonField<CategoryBalances> = JsonMissing.of()
        private var balanceNextDue: JsonField<CategoryBalances> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var excessCredits: JsonField<Long> = JsonMissing.of()
        private var accountStanding: JsonField<AccountStanding> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<String> = JsonMissing.of()
        private var paymentAllocation: JsonField<CategoryBalances> = JsonMissing.of()
        private var minimumPaymentBalance: JsonField<BalanceDetails> = JsonMissing.of()
        private var statementBalance: JsonField<BalanceDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTape: LoanTape) = apply {
            this.token = loanTape.token
            this.financialAccountToken = loanTape.financialAccountToken
            this.date = loanTape.date
            this.created = loanTape.created
            this.updated = loanTape.updated
            this.version = loanTape.version
            this.ytdTotals = loanTape.ytdTotals
            this.periodTotals = loanTape.periodTotals
            this.dayTotals = loanTape.dayTotals
            this.balancePastDue = loanTape.balancePastDue
            this.balanceDue = loanTape.balanceDue
            this.balanceNextDue = loanTape.balanceNextDue
            this.creditLimit = loanTape.creditLimit
            this.excessCredits = loanTape.excessCredits
            this.accountStanding = loanTape.accountStanding
            this.creditProductToken = loanTape.creditProductToken
            this.tier = loanTape.tier
            this.paymentAllocation = loanTape.paymentAllocation
            this.minimumPaymentBalance = loanTape.minimumPaymentBalance
            this.statementBalance = loanTape.statementBalance
            additionalProperties(loanTape.additionalProperties)
        }

        /** Globally unique identifier for a loan tape */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a loan tape */
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

        /** Date of transactions that this loan tape covers */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /** Date of transactions that this loan tape covers */
        @JsonProperty("date")
        @ExcludeMissing
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** Timestamp of when the loan tape was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the loan tape was created */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Timestamp of when the loan tape was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Timestamp of when the loan tape was updated */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Version number of the loan tape. This starts at 1 */
        fun version(version: Long) = version(JsonField.of(version))

        /** Version number of the loan tape. This starts at 1 */
        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        @JsonProperty("ytd_totals")
        @ExcludeMissing
        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        @JsonProperty("period_totals")
        @ExcludeMissing
        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        fun dayTotals(dayTotals: StatementTotals) = dayTotals(JsonField.of(dayTotals))

        @JsonProperty("day_totals")
        @ExcludeMissing
        fun dayTotals(dayTotals: JsonField<StatementTotals>) = apply { this.dayTotals = dayTotals }

        /** Amount not paid off on previous due dates */
        fun balancePastDue(balancePastDue: CategoryBalances) =
            balancePastDue(JsonField.of(balancePastDue))

        /** Amount not paid off on previous due dates */
        @JsonProperty("balance_past_due")
        @ExcludeMissing
        fun balancePastDue(balancePastDue: JsonField<CategoryBalances>) = apply {
            this.balancePastDue = balancePastDue
        }

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        fun balanceDue(balanceDue: CategoryBalances) = balanceDue(JsonField.of(balanceDue))

        /**
         * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date
         * will be considered past due the next day
         */
        @JsonProperty("balance_due")
        @ExcludeMissing
        fun balanceDue(balanceDue: JsonField<CategoryBalances>) = apply {
            this.balanceDue = balanceDue
        }

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        fun balanceNextDue(balanceNextDue: CategoryBalances) =
            balanceNextDue(JsonField.of(balanceNextDue))

        /**
         * Amount due for the current billing cycle. Any amounts not paid off by early payments or
         * credits will be considered due at the end of the current billing period
         */
        @JsonProperty("balance_next_due")
        @ExcludeMissing
        fun balanceNextDue(balanceNextDue: JsonField<CategoryBalances>) = apply {
            this.balanceNextDue = balanceNextDue
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
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

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
        @JsonProperty("excess_credits")
        @ExcludeMissing
        fun excessCredits(excessCredits: JsonField<Long>) = apply {
            this.excessCredits = excessCredits
        }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        @JsonProperty("account_standing")
        @ExcludeMissing
        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for a credit product */
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Interest tier to which this account belongs to */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /** Interest tier to which this account belongs to */
        @JsonProperty("tier")
        @ExcludeMissing
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        fun paymentAllocation(paymentAllocation: CategoryBalances) =
            paymentAllocation(JsonField.of(paymentAllocation))

        @JsonProperty("payment_allocation")
        @ExcludeMissing
        fun paymentAllocation(paymentAllocation: JsonField<CategoryBalances>) = apply {
            this.paymentAllocation = paymentAllocation
        }

        fun minimumPaymentBalance(minimumPaymentBalance: BalanceDetails) =
            minimumPaymentBalance(JsonField.of(minimumPaymentBalance))

        @JsonProperty("minimum_payment_balance")
        @ExcludeMissing
        fun minimumPaymentBalance(minimumPaymentBalance: JsonField<BalanceDetails>) = apply {
            this.minimumPaymentBalance = minimumPaymentBalance
        }

        fun statementBalance(statementBalance: BalanceDetails) =
            statementBalance(JsonField.of(statementBalance))

        @JsonProperty("statement_balance")
        @ExcludeMissing
        fun statementBalance(statementBalance: JsonField<BalanceDetails>) = apply {
            this.statementBalance = statementBalance
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
                balancePastDue,
                balanceDue,
                balanceNextDue,
                creditLimit,
                excessCredits,
                accountStanding,
                creditProductToken,
                tier,
                paymentAllocation,
                minimumPaymentBalance,
                statementBalance,
                additionalProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountStanding &&
                this.periodState == other.periodState &&
                this.periodNumber == other.periodNumber &&
                this.consecutiveMinimumPaymentsMade == other.consecutiveMinimumPaymentsMade &&
                this.consecutiveMinimumPaymentsMissed == other.consecutiveMinimumPaymentsMissed &&
                this.consecutiveFullPaymentsMade == other.consecutiveFullPaymentsMade &&
                this.daysPastDue == other.daysPastDue &&
                this.hasGrace == other.hasGrace &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        periodState,
                        periodNumber,
                        consecutiveMinimumPaymentsMade,
                        consecutiveMinimumPaymentsMissed,
                        consecutiveFullPaymentsMade,
                        daysPastDue,
                        hasGrace,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountStanding{periodState=$periodState, periodNumber=$periodNumber, consecutiveMinimumPaymentsMade=$consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed=$consecutiveMinimumPaymentsMissed, consecutiveFullPaymentsMade=$consecutiveFullPaymentsMade, daysPastDue=$daysPastDue, hasGrace=$hasGrace, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is PeriodState && this.value == other.value
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
    }

    /**
     * Amount due for the prior billing cycle. Any amounts not fully paid off on this due date will
     * be considered past due the next day
     */
    @JsonDeserialize(builder = CategoryBalances.Builder::class)
    @NoAutoDetect
    class CategoryBalances
    private constructor(
        private val interest: JsonField<Long>,
        private val principal: JsonField<Long>,
        private val fees: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun interest(): Long = interest.getRequired("interest")

        fun principal(): Long = principal.getRequired("principal")

        fun fees(): Long = fees.getRequired("fees")

        @JsonProperty("interest") @ExcludeMissing fun _interest() = interest

        @JsonProperty("principal") @ExcludeMissing fun _principal() = principal

        @JsonProperty("fees") @ExcludeMissing fun _fees() = fees

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CategoryBalances = apply {
            if (!validated) {
                interest()
                principal()
                fees()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CategoryBalances &&
                this.interest == other.interest &&
                this.principal == other.principal &&
                this.fees == other.fees &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        interest,
                        principal,
                        fees,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CategoryBalances{interest=$interest, principal=$principal, fees=$fees, additionalProperties=$additionalProperties}"

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
                this.interest = categoryBalances.interest
                this.principal = categoryBalances.principal
                this.fees = categoryBalances.fees
                additionalProperties(categoryBalances.additionalProperties)
            }

            fun interest(interest: Long) = interest(JsonField.of(interest))

            @JsonProperty("interest")
            @ExcludeMissing
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            fun principal(principal: Long) = principal(JsonField.of(principal))

            @JsonProperty("principal")
            @ExcludeMissing
            fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

            fun fees(fees: Long) = fees(JsonField.of(fees))

            @JsonProperty("fees")
            @ExcludeMissing
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

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

            fun build(): CategoryBalances =
                CategoryBalances(
                    interest,
                    principal,
                    fees,
                    additionalProperties.toUnmodifiable(),
                )
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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = BalanceDetails.Builder::class)
    @NoAutoDetect
    class BalanceDetails
    private constructor(
        private val amount: JsonField<Long>,
        private val remaining: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun amount(): Long = amount.getRequired("amount")

        fun remaining(): Long = remaining.getRequired("remaining")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("remaining") @ExcludeMissing fun _remaining() = remaining

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BalanceDetails = apply {
            if (!validated) {
                amount()
                remaining()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceDetails &&
                this.amount == other.amount &&
                this.remaining == other.remaining &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        remaining,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BalanceDetails{amount=$amount, remaining=$remaining, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var remaining: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceDetails: BalanceDetails) = apply {
                this.amount = balanceDetails.amount
                this.remaining = balanceDetails.remaining
                additionalProperties(balanceDetails.additionalProperties)
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun remaining(remaining: Long) = remaining(JsonField.of(remaining))

            @JsonProperty("remaining")
            @ExcludeMissing
            fun remaining(remaining: JsonField<Long>) = apply { this.remaining = remaining }

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

            fun build(): BalanceDetails =
                BalanceDetails(
                    amount,
                    remaining,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}