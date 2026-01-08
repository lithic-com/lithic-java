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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LoanTapeCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountStanding: JsonField<LoanTape.AccountStanding>,
    private val availableCredit: JsonField<Long>,
    private val balances: JsonField<LoanTape.Balances>,
    private val created: JsonField<OffsetDateTime>,
    private val creditLimit: JsonField<Long>,
    private val creditProductToken: JsonField<String>,
    private val date: JsonField<LocalDate>,
    private val dayTotals: JsonField<StatementTotals>,
    private val endingBalance: JsonField<Long>,
    private val excessCredits: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val interestDetails: JsonField<LoanTape.InterestDetails>,
    private val minimumPaymentBalance: JsonField<LoanTape.BalanceDetails>,
    private val paymentAllocation: JsonField<LoanTape.PaymentAllocation>,
    private val periodTotals: JsonField<StatementTotals>,
    private val previousStatementBalance: JsonField<LoanTape.BalanceDetails>,
    private val startingBalance: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val version: JsonField<Long>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val tier: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_standing")
        @ExcludeMissing
        accountStanding: JsonField<LoanTape.AccountStanding> = JsonMissing.of(),
        @JsonProperty("available_credit")
        @ExcludeMissing
        availableCredit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("balances")
        @ExcludeMissing
        balances: JsonField<LoanTape.Balances> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_limit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("day_totals")
        @ExcludeMissing
        dayTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("excess_credits")
        @ExcludeMissing
        excessCredits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_details")
        @ExcludeMissing
        interestDetails: JsonField<LoanTape.InterestDetails> = JsonMissing.of(),
        @JsonProperty("minimum_payment_balance")
        @ExcludeMissing
        minimumPaymentBalance: JsonField<LoanTape.BalanceDetails> = JsonMissing.of(),
        @JsonProperty("payment_allocation")
        @ExcludeMissing
        paymentAllocation: JsonField<LoanTape.PaymentAllocation> = JsonMissing.of(),
        @JsonProperty("period_totals")
        @ExcludeMissing
        periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("previous_statement_balance")
        @ExcludeMissing
        previousStatementBalance: JsonField<LoanTape.BalanceDetails> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ytd_totals")
        @ExcludeMissing
        ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        accountStanding,
        availableCredit,
        balances,
        created,
        creditLimit,
        creditProductToken,
        date,
        dayTotals,
        endingBalance,
        excessCredits,
        financialAccountToken,
        interestDetails,
        minimumPaymentBalance,
        paymentAllocation,
        periodTotals,
        previousStatementBalance,
        startingBalance,
        updated,
        version,
        ytdTotals,
        tier,
        eventType,
        mutableMapOf(),
    )

    fun toLoanTape(): LoanTape =
        LoanTape.builder()
            .token(token)
            .accountStanding(accountStanding)
            .availableCredit(availableCredit)
            .balances(balances)
            .created(created)
            .creditLimit(creditLimit)
            .creditProductToken(creditProductToken)
            .date(date)
            .dayTotals(dayTotals)
            .endingBalance(endingBalance)
            .excessCredits(excessCredits)
            .financialAccountToken(financialAccountToken)
            .interestDetails(interestDetails)
            .minimumPaymentBalance(minimumPaymentBalance)
            .paymentAllocation(paymentAllocation)
            .periodTotals(periodTotals)
            .previousStatementBalance(previousStatementBalance)
            .startingBalance(startingBalance)
            .updated(updated)
            .version(version)
            .ytdTotals(ytdTotals)
            .tier(tier)
            .build()

    /**
     * Globally unique identifier for a loan tape
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountStanding(): LoanTape.AccountStanding =
        accountStanding.getRequired("account_standing")

    /**
     * Amount of credit available to spend in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balances(): LoanTape.Balances = balances.getRequired("balances")

    /**
     * Timestamp of when the loan tape was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /**
     * Globally unique identifier for a credit product
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /**
     * Date of transactions that this loan tape covers
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayTotals(): StatementTotals = dayTotals.getRequired("day_totals")

    /**
     * Balance at the end of the day
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * Excess credits in the form of provisional credits, payments, or purchase refunds. If
     * positive, the account is in net credit state with no outstanding balances. An overpayment
     * could land an account in this state
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun excessCredits(): Long = excessCredits.getRequired("excess_credits")

    /**
     * Globally unique identifier for a financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestDetails(): Optional<LoanTape.InterestDetails> =
        interestDetails.getOptional("interest_details")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minimumPaymentBalance(): LoanTape.BalanceDetails =
        minimumPaymentBalance.getRequired("minimum_payment_balance")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentAllocation(): LoanTape.PaymentAllocation =
        paymentAllocation.getRequired("payment_allocation")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousStatementBalance(): LoanTape.BalanceDetails =
        previousStatementBalance.getRequired("previous_statement_balance")

    /**
     * Balance at the start of the day
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * Timestamp of when the loan tape was updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Version number of the loan tape. This starts at 1
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /**
     * Interest tier to which this account belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<String> = tier.getOptional("tier")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountStanding].
     *
     * Unlike [accountStanding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_standing")
    @ExcludeMissing
    fun _accountStanding(): JsonField<LoanTape.AccountStanding> = accountStanding

    /**
     * Returns the raw JSON value of [availableCredit].
     *
     * Unlike [availableCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_credit")
    @ExcludeMissing
    fun _availableCredit(): JsonField<Long> = availableCredit

    /**
     * Returns the raw JSON value of [balances].
     *
     * Unlike [balances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balances")
    @ExcludeMissing
    fun _balances(): JsonField<LoanTape.Balances> = balances

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /**
     * Returns the raw JSON value of [creditProductToken].
     *
     * Unlike [creditProductToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [dayTotals].
     *
     * Unlike [dayTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_totals")
    @ExcludeMissing
    fun _dayTotals(): JsonField<StatementTotals> = dayTotals

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /**
     * Returns the raw JSON value of [excessCredits].
     *
     * Unlike [excessCredits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("excess_credits")
    @ExcludeMissing
    fun _excessCredits(): JsonField<Long> = excessCredits

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [interestDetails].
     *
     * Unlike [interestDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_details")
    @ExcludeMissing
    fun _interestDetails(): JsonField<LoanTape.InterestDetails> = interestDetails

    /**
     * Returns the raw JSON value of [minimumPaymentBalance].
     *
     * Unlike [minimumPaymentBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minimum_payment_balance")
    @ExcludeMissing
    fun _minimumPaymentBalance(): JsonField<LoanTape.BalanceDetails> = minimumPaymentBalance

    /**
     * Returns the raw JSON value of [paymentAllocation].
     *
     * Unlike [paymentAllocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_allocation")
    @ExcludeMissing
    fun _paymentAllocation(): JsonField<LoanTape.PaymentAllocation> = paymentAllocation

    /**
     * Returns the raw JSON value of [periodTotals].
     *
     * Unlike [periodTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_totals")
    @ExcludeMissing
    fun _periodTotals(): JsonField<StatementTotals> = periodTotals

    /**
     * Returns the raw JSON value of [previousStatementBalance].
     *
     * Unlike [previousStatementBalance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("previous_statement_balance")
    @ExcludeMissing
    fun _previousStatementBalance(): JsonField<LoanTape.BalanceDetails> = previousStatementBalance

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [ytdTotals].
     *
     * Unlike [ytdTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    fun _ytdTotals(): JsonField<StatementTotals> = ytdTotals

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LoanTapeCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountStanding()
         * .availableCredit()
         * .balances()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .date()
         * .dayTotals()
         * .endingBalance()
         * .excessCredits()
         * .financialAccountToken()
         * .interestDetails()
         * .minimumPaymentBalance()
         * .paymentAllocation()
         * .periodTotals()
         * .previousStatementBalance()
         * .startingBalance()
         * .updated()
         * .version()
         * .ytdTotals()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoanTapeCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountStanding: JsonField<LoanTape.AccountStanding>? = null
        private var availableCredit: JsonField<Long>? = null
        private var balances: JsonField<LoanTape.Balances>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var date: JsonField<LocalDate>? = null
        private var dayTotals: JsonField<StatementTotals>? = null
        private var endingBalance: JsonField<Long>? = null
        private var excessCredits: JsonField<Long>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var interestDetails: JsonField<LoanTape.InterestDetails>? = null
        private var minimumPaymentBalance: JsonField<LoanTape.BalanceDetails>? = null
        private var paymentAllocation: JsonField<LoanTape.PaymentAllocation>? = null
        private var periodTotals: JsonField<StatementTotals>? = null
        private var previousStatementBalance: JsonField<LoanTape.BalanceDetails>? = null
        private var startingBalance: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var version: JsonField<Long>? = null
        private var ytdTotals: JsonField<StatementTotals>? = null
        private var tier: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTapeCreatedWebhookEvent: LoanTapeCreatedWebhookEvent) = apply {
            token = loanTapeCreatedWebhookEvent.token
            accountStanding = loanTapeCreatedWebhookEvent.accountStanding
            availableCredit = loanTapeCreatedWebhookEvent.availableCredit
            balances = loanTapeCreatedWebhookEvent.balances
            created = loanTapeCreatedWebhookEvent.created
            creditLimit = loanTapeCreatedWebhookEvent.creditLimit
            creditProductToken = loanTapeCreatedWebhookEvent.creditProductToken
            date = loanTapeCreatedWebhookEvent.date
            dayTotals = loanTapeCreatedWebhookEvent.dayTotals
            endingBalance = loanTapeCreatedWebhookEvent.endingBalance
            excessCredits = loanTapeCreatedWebhookEvent.excessCredits
            financialAccountToken = loanTapeCreatedWebhookEvent.financialAccountToken
            interestDetails = loanTapeCreatedWebhookEvent.interestDetails
            minimumPaymentBalance = loanTapeCreatedWebhookEvent.minimumPaymentBalance
            paymentAllocation = loanTapeCreatedWebhookEvent.paymentAllocation
            periodTotals = loanTapeCreatedWebhookEvent.periodTotals
            previousStatementBalance = loanTapeCreatedWebhookEvent.previousStatementBalance
            startingBalance = loanTapeCreatedWebhookEvent.startingBalance
            updated = loanTapeCreatedWebhookEvent.updated
            version = loanTapeCreatedWebhookEvent.version
            ytdTotals = loanTapeCreatedWebhookEvent.ytdTotals
            tier = loanTapeCreatedWebhookEvent.tier
            eventType = loanTapeCreatedWebhookEvent.eventType
            additionalProperties = loanTapeCreatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a loan tape */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountStanding(accountStanding: LoanTape.AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        /**
         * Sets [Builder.accountStanding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStanding] with a well-typed
         * [LoanTape.AccountStanding] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountStanding(accountStanding: JsonField<LoanTape.AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /**
         * Sets [Builder.availableCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableCredit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        fun balances(balances: LoanTape.Balances) = balances(JsonField.of(balances))

        /**
         * Sets [Builder.balances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balances] with a well-typed [LoanTape.Balances] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balances(balances: JsonField<LoanTape.Balances>) = apply { this.balances = balances }

        /** Timestamp of when the loan tape was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * For prepay accounts, this is the minimum prepay balance that must be maintained. For
         * charge card accounts, this is the maximum credit balance extended by a lender
         */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /**
         * Sets [Builder.creditProductToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditProductToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Date of transactions that this loan tape covers */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        fun dayTotals(dayTotals: StatementTotals) = dayTotals(JsonField.of(dayTotals))

        /**
         * Sets [Builder.dayTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dayTotals(dayTotals: JsonField<StatementTotals>) = apply { this.dayTotals = dayTotals }

        /** Balance at the end of the day */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.excessCredits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excessCredits] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun excessCredits(excessCredits: JsonField<Long>) = apply {
            this.excessCredits = excessCredits
        }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun interestDetails(interestDetails: LoanTape.InterestDetails?) =
            interestDetails(JsonField.ofNullable(interestDetails))

        /** Alias for calling [Builder.interestDetails] with `interestDetails.orElse(null)`. */
        fun interestDetails(interestDetails: Optional<LoanTape.InterestDetails>) =
            interestDetails(interestDetails.getOrNull())

        /**
         * Sets [Builder.interestDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestDetails] with a well-typed
         * [LoanTape.InterestDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun interestDetails(interestDetails: JsonField<LoanTape.InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        fun minimumPaymentBalance(minimumPaymentBalance: LoanTape.BalanceDetails) =
            minimumPaymentBalance(JsonField.of(minimumPaymentBalance))

        /**
         * Sets [Builder.minimumPaymentBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumPaymentBalance] with a well-typed
         * [LoanTape.BalanceDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun minimumPaymentBalance(minimumPaymentBalance: JsonField<LoanTape.BalanceDetails>) =
            apply {
                this.minimumPaymentBalance = minimumPaymentBalance
            }

        fun paymentAllocation(paymentAllocation: LoanTape.PaymentAllocation) =
            paymentAllocation(JsonField.of(paymentAllocation))

        /**
         * Sets [Builder.paymentAllocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAllocation] with a well-typed
         * [LoanTape.PaymentAllocation] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun paymentAllocation(paymentAllocation: JsonField<LoanTape.PaymentAllocation>) = apply {
            this.paymentAllocation = paymentAllocation
        }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        /**
         * Sets [Builder.periodTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        fun previousStatementBalance(previousStatementBalance: LoanTape.BalanceDetails) =
            previousStatementBalance(JsonField.of(previousStatementBalance))

        /**
         * Sets [Builder.previousStatementBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousStatementBalance] with a well-typed
         * [LoanTape.BalanceDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun previousStatementBalance(previousStatementBalance: JsonField<LoanTape.BalanceDetails>) =
            apply {
                this.previousStatementBalance = previousStatementBalance
            }

        /** Balance at the start of the day */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /** Timestamp of when the loan tape was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Version number of the loan tape. This starts at 1 */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        /**
         * Sets [Builder.ytdTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ytdTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        /** Interest tier to which this account belongs to */
        fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<String>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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

        /**
         * Returns an immutable instance of [LoanTapeCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountStanding()
         * .availableCredit()
         * .balances()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .date()
         * .dayTotals()
         * .endingBalance()
         * .excessCredits()
         * .financialAccountToken()
         * .interestDetails()
         * .minimumPaymentBalance()
         * .paymentAllocation()
         * .periodTotals()
         * .previousStatementBalance()
         * .startingBalance()
         * .updated()
         * .version()
         * .ytdTotals()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LoanTapeCreatedWebhookEvent =
            LoanTapeCreatedWebhookEvent(
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
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LoanTapeCreatedWebhookEvent = apply {
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
        eventType().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (accountStanding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (availableCredit.asKnown().isPresent) 1 else 0) +
            (balances.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (creditLimit.asKnown().isPresent) 1 else 0) +
            (if (creditProductToken.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (dayTotals.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endingBalance.asKnown().isPresent) 1 else 0) +
            (if (excessCredits.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (interestDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (minimumPaymentBalance.asKnown().getOrNull()?.validity() ?: 0) +
            (paymentAllocation.asKnown().getOrNull()?.validity() ?: 0) +
            (periodTotals.asKnown().getOrNull()?.validity() ?: 0) +
            (previousStatementBalance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startingBalance.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (ytdTotals.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tier.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOAN_TAPE_CREATED = of("loan_tape.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            LOAN_TAPE_CREATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOAN_TAPE_CREATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                LOAN_TAPE_CREATED -> Value.LOAN_TAPE_CREATED
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
                LOAN_TAPE_CREATED -> Known.LOAN_TAPE_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): EventType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoanTapeCreatedWebhookEvent &&
            token == other.token &&
            accountStanding == other.accountStanding &&
            availableCredit == other.availableCredit &&
            balances == other.balances &&
            created == other.created &&
            creditLimit == other.creditLimit &&
            creditProductToken == other.creditProductToken &&
            date == other.date &&
            dayTotals == other.dayTotals &&
            endingBalance == other.endingBalance &&
            excessCredits == other.excessCredits &&
            financialAccountToken == other.financialAccountToken &&
            interestDetails == other.interestDetails &&
            minimumPaymentBalance == other.minimumPaymentBalance &&
            paymentAllocation == other.paymentAllocation &&
            periodTotals == other.periodTotals &&
            previousStatementBalance == other.previousStatementBalance &&
            startingBalance == other.startingBalance &&
            updated == other.updated &&
            version == other.version &&
            ytdTotals == other.ytdTotals &&
            tier == other.tier &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountStanding,
            availableCredit,
            balances,
            created,
            creditLimit,
            creditProductToken,
            date,
            dayTotals,
            endingBalance,
            excessCredits,
            financialAccountToken,
            interestDetails,
            minimumPaymentBalance,
            paymentAllocation,
            periodTotals,
            previousStatementBalance,
            startingBalance,
            updated,
            version,
            ytdTotals,
            tier,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LoanTapeCreatedWebhookEvent{token=$token, accountStanding=$accountStanding, availableCredit=$availableCredit, balances=$balances, created=$created, creditLimit=$creditLimit, creditProductToken=$creditProductToken, date=$date, dayTotals=$dayTotals, endingBalance=$endingBalance, excessCredits=$excessCredits, financialAccountToken=$financialAccountToken, interestDetails=$interestDetails, minimumPaymentBalance=$minimumPaymentBalance, paymentAllocation=$paymentAllocation, periodTotals=$periodTotals, previousStatementBalance=$previousStatementBalance, startingBalance=$startingBalance, updated=$updated, version=$version, ytdTotals=$ytdTotals, tier=$tier, eventType=$eventType, additionalProperties=$additionalProperties}"
}
