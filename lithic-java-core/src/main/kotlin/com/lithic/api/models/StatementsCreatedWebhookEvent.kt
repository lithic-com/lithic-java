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

class StatementsCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountStanding: JsonField<Statement.AccountStanding>,
    private val amountDue: JsonField<Statement.AmountDue>,
    private val availableCredit: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val creditLimit: JsonField<Long>,
    private val creditProductToken: JsonField<String>,
    private val daysInBillingCycle: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val paymentDueDate: JsonField<LocalDate>,
    private val periodTotals: JsonField<StatementTotals>,
    private val startingBalance: JsonField<Long>,
    private val statementEndDate: JsonField<LocalDate>,
    private val statementStartDate: JsonField<LocalDate>,
    private val statementType: JsonField<Statement.StatementType>,
    private val updated: JsonField<OffsetDateTime>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val interestDetails: JsonField<Statement.InterestDetails>,
    private val nextPaymentDueDate: JsonField<LocalDate>,
    private val nextStatementEndDate: JsonField<LocalDate>,
    private val payoffDetails: JsonField<Statement.PayoffDetails>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_standing")
        @ExcludeMissing
        accountStanding: JsonField<Statement.AccountStanding> = JsonMissing.of(),
        @JsonProperty("amount_due")
        @ExcludeMissing
        amountDue: JsonField<Statement.AmountDue> = JsonMissing.of(),
        @JsonProperty("available_credit")
        @ExcludeMissing
        availableCredit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_limit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("days_in_billing_cycle")
        @ExcludeMissing
        daysInBillingCycle: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        paymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period_totals")
        @ExcludeMissing
        periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statement_end_date")
        @ExcludeMissing
        statementEndDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statement_start_date")
        @ExcludeMissing
        statementStartDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statement_type")
        @ExcludeMissing
        statementType: JsonField<Statement.StatementType> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ytd_totals")
        @ExcludeMissing
        ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("interest_details")
        @ExcludeMissing
        interestDetails: JsonField<Statement.InterestDetails> = JsonMissing.of(),
        @JsonProperty("next_payment_due_date")
        @ExcludeMissing
        nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("next_statement_end_date")
        @ExcludeMissing
        nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("payoff_details")
        @ExcludeMissing
        payoffDetails: JsonField<Statement.PayoffDetails> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        accountStanding,
        amountDue,
        availableCredit,
        created,
        creditLimit,
        creditProductToken,
        daysInBillingCycle,
        endingBalance,
        financialAccountToken,
        paymentDueDate,
        periodTotals,
        startingBalance,
        statementEndDate,
        statementStartDate,
        statementType,
        updated,
        ytdTotals,
        interestDetails,
        nextPaymentDueDate,
        nextStatementEndDate,
        payoffDetails,
        eventType,
        mutableMapOf(),
    )

    fun toStatement(): Statement =
        Statement.builder()
            .token(token)
            .accountStanding(accountStanding)
            .amountDue(amountDue)
            .availableCredit(availableCredit)
            .created(created)
            .creditLimit(creditLimit)
            .creditProductToken(creditProductToken)
            .daysInBillingCycle(daysInBillingCycle)
            .endingBalance(endingBalance)
            .financialAccountToken(financialAccountToken)
            .paymentDueDate(paymentDueDate)
            .periodTotals(periodTotals)
            .startingBalance(startingBalance)
            .statementEndDate(statementEndDate)
            .statementStartDate(statementStartDate)
            .statementType(statementType)
            .updated(updated)
            .ytdTotals(ytdTotals)
            .interestDetails(interestDetails)
            .nextPaymentDueDate(nextPaymentDueDate)
            .nextStatementEndDate(nextStatementEndDate)
            .payoffDetails(payoffDetails)
            .build()

    /**
     * Globally unique identifier for a statement
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountStanding(): Statement.AccountStanding =
        accountStanding.getRequired("account_standing")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDue(): Statement.AmountDue = amountDue.getRequired("amount_due")

    /**
     * Amount of credit available to spend in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /**
     * Timestamp of when the statement was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * This is the maximum credit balance extended by the lender in cents
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
     * Number of days in the billing cycle
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * Globally unique identifier for a financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * Date when the payment is due
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentDueDate(): Optional<LocalDate> = paymentDueDate.getOptional("payment_due_date")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    /**
     * Balance at the start of the billing period
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * Date when the billing period ended
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /**
     * Date when the billing period began
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementType(): Statement.StatementType = statementType.getRequired("statement_type")

    /**
     * Timestamp of when the statement was updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestDetails(): Optional<Statement.InterestDetails> =
        interestDetails.getOptional("interest_details")

    /**
     * Date when the next payment is due
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPaymentDueDate(): Optional<LocalDate> =
        nextPaymentDueDate.getOptional("next_payment_due_date")

    /**
     * Date when the next billing period will end
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextStatementEndDate(): Optional<LocalDate> =
        nextStatementEndDate.getOptional("next_statement_end_date")

    /**
     * Details on number and size of payments to pay off balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payoffDetails(): Optional<Statement.PayoffDetails> =
        payoffDetails.getOptional("payoff_details")

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
    fun _accountStanding(): JsonField<Statement.AccountStanding> = accountStanding

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due")
    @ExcludeMissing
    fun _amountDue(): JsonField<Statement.AmountDue> = amountDue

    /**
     * Returns the raw JSON value of [availableCredit].
     *
     * Unlike [availableCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_credit")
    @ExcludeMissing
    fun _availableCredit(): JsonField<Long> = availableCredit

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
     * Returns the raw JSON value of [daysInBillingCycle].
     *
     * Unlike [daysInBillingCycle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle(): JsonField<Long> = daysInBillingCycle

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

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
     * Returns the raw JSON value of [paymentDueDate].
     *
     * Unlike [paymentDueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_due_date")
    @ExcludeMissing
    fun _paymentDueDate(): JsonField<LocalDate> = paymentDueDate

    /**
     * Returns the raw JSON value of [periodTotals].
     *
     * Unlike [periodTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_totals")
    @ExcludeMissing
    fun _periodTotals(): JsonField<StatementTotals> = periodTotals

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /**
     * Returns the raw JSON value of [statementEndDate].
     *
     * Unlike [statementEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_end_date")
    @ExcludeMissing
    fun _statementEndDate(): JsonField<LocalDate> = statementEndDate

    /**
     * Returns the raw JSON value of [statementStartDate].
     *
     * Unlike [statementStartDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    fun _statementStartDate(): JsonField<LocalDate> = statementStartDate

    /**
     * Returns the raw JSON value of [statementType].
     *
     * Unlike [statementType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statement_type")
    @ExcludeMissing
    fun _statementType(): JsonField<Statement.StatementType> = statementType

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [ytdTotals].
     *
     * Unlike [ytdTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    fun _ytdTotals(): JsonField<StatementTotals> = ytdTotals

    /**
     * Returns the raw JSON value of [interestDetails].
     *
     * Unlike [interestDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_details")
    @ExcludeMissing
    fun _interestDetails(): JsonField<Statement.InterestDetails> = interestDetails

    /**
     * Returns the raw JSON value of [nextPaymentDueDate].
     *
     * Unlike [nextPaymentDueDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("next_payment_due_date")
    @ExcludeMissing
    fun _nextPaymentDueDate(): JsonField<LocalDate> = nextPaymentDueDate

    /**
     * Returns the raw JSON value of [nextStatementEndDate].
     *
     * Unlike [nextStatementEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("next_statement_end_date")
    @ExcludeMissing
    fun _nextStatementEndDate(): JsonField<LocalDate> = nextStatementEndDate

    /**
     * Returns the raw JSON value of [payoffDetails].
     *
     * Unlike [payoffDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payoff_details")
    @ExcludeMissing
    fun _payoffDetails(): JsonField<Statement.PayoffDetails> = payoffDetails

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
         * Returns a mutable builder for constructing an instance of
         * [StatementsCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountStanding()
         * .amountDue()
         * .availableCredit()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .daysInBillingCycle()
         * .endingBalance()
         * .financialAccountToken()
         * .paymentDueDate()
         * .periodTotals()
         * .startingBalance()
         * .statementEndDate()
         * .statementStartDate()
         * .statementType()
         * .updated()
         * .ytdTotals()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementsCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountStanding: JsonField<Statement.AccountStanding>? = null
        private var amountDue: JsonField<Statement.AmountDue>? = null
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
        private var statementType: JsonField<Statement.StatementType>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var ytdTotals: JsonField<StatementTotals>? = null
        private var interestDetails: JsonField<Statement.InterestDetails> = JsonMissing.of()
        private var nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var payoffDetails: JsonField<Statement.PayoffDetails> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statementsCreatedWebhookEvent: StatementsCreatedWebhookEvent) = apply {
            token = statementsCreatedWebhookEvent.token
            accountStanding = statementsCreatedWebhookEvent.accountStanding
            amountDue = statementsCreatedWebhookEvent.amountDue
            availableCredit = statementsCreatedWebhookEvent.availableCredit
            created = statementsCreatedWebhookEvent.created
            creditLimit = statementsCreatedWebhookEvent.creditLimit
            creditProductToken = statementsCreatedWebhookEvent.creditProductToken
            daysInBillingCycle = statementsCreatedWebhookEvent.daysInBillingCycle
            endingBalance = statementsCreatedWebhookEvent.endingBalance
            financialAccountToken = statementsCreatedWebhookEvent.financialAccountToken
            paymentDueDate = statementsCreatedWebhookEvent.paymentDueDate
            periodTotals = statementsCreatedWebhookEvent.periodTotals
            startingBalance = statementsCreatedWebhookEvent.startingBalance
            statementEndDate = statementsCreatedWebhookEvent.statementEndDate
            statementStartDate = statementsCreatedWebhookEvent.statementStartDate
            statementType = statementsCreatedWebhookEvent.statementType
            updated = statementsCreatedWebhookEvent.updated
            ytdTotals = statementsCreatedWebhookEvent.ytdTotals
            interestDetails = statementsCreatedWebhookEvent.interestDetails
            nextPaymentDueDate = statementsCreatedWebhookEvent.nextPaymentDueDate
            nextStatementEndDate = statementsCreatedWebhookEvent.nextStatementEndDate
            payoffDetails = statementsCreatedWebhookEvent.payoffDetails
            eventType = statementsCreatedWebhookEvent.eventType
            additionalProperties = statementsCreatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a statement */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountStanding(accountStanding: Statement.AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        /**
         * Sets [Builder.accountStanding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStanding] with a well-typed
         * [Statement.AccountStanding] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountStanding(accountStanding: JsonField<Statement.AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        fun amountDue(amountDue: Statement.AmountDue) = amountDue(JsonField.of(amountDue))

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [Statement.AmountDue] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountDue(amountDue: JsonField<Statement.AmountDue>) = apply {
            this.amountDue = amountDue
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

        /** Timestamp of when the statement was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** This is the maximum credit balance extended by the lender in cents */
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

        /** Number of days in the billing cycle */
        fun daysInBillingCycle(daysInBillingCycle: Long) =
            daysInBillingCycle(JsonField.of(daysInBillingCycle))

        /**
         * Sets [Builder.daysInBillingCycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysInBillingCycle] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysInBillingCycle(daysInBillingCycle: JsonField<Long>) = apply {
            this.daysInBillingCycle = daysInBillingCycle
        }

        /**
         * Balance at the end of the billing period. For charge cards, this should be the same at
         * the statement amount due in cents
         */
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

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate?) =
            paymentDueDate(JsonField.ofNullable(paymentDueDate))

        /** Alias for calling [Builder.paymentDueDate] with `paymentDueDate.orElse(null)`. */
        fun paymentDueDate(paymentDueDate: Optional<LocalDate>) =
            paymentDueDate(paymentDueDate.getOrNull())

        /**
         * Sets [Builder.paymentDueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentDueDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
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

        /** Balance at the start of the billing period */
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

        /** Date when the billing period ended */
        fun statementEndDate(statementEndDate: LocalDate) =
            statementEndDate(JsonField.of(statementEndDate))

        /**
         * Sets [Builder.statementEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementEndDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementEndDate(statementEndDate: JsonField<LocalDate>) = apply {
            this.statementEndDate = statementEndDate
        }

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: LocalDate) =
            statementStartDate(JsonField.of(statementStartDate))

        /**
         * Sets [Builder.statementStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementStartDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementStartDate(statementStartDate: JsonField<LocalDate>) = apply {
            this.statementStartDate = statementStartDate
        }

        fun statementType(statementType: Statement.StatementType) =
            statementType(JsonField.of(statementType))

        /**
         * Sets [Builder.statementType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementType] with a well-typed
         * [Statement.StatementType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun statementType(statementType: JsonField<Statement.StatementType>) = apply {
            this.statementType = statementType
        }

        /** Timestamp of when the statement was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        /**
         * Sets [Builder.ytdTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ytdTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        fun interestDetails(interestDetails: Statement.InterestDetails?) =
            interestDetails(JsonField.ofNullable(interestDetails))

        /** Alias for calling [Builder.interestDetails] with `interestDetails.orElse(null)`. */
        fun interestDetails(interestDetails: Optional<Statement.InterestDetails>) =
            interestDetails(interestDetails.getOrNull())

        /**
         * Sets [Builder.interestDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestDetails] with a well-typed
         * [Statement.InterestDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun interestDetails(interestDetails: JsonField<Statement.InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        /** Date when the next payment is due */
        fun nextPaymentDueDate(nextPaymentDueDate: LocalDate) =
            nextPaymentDueDate(JsonField.of(nextPaymentDueDate))

        /**
         * Sets [Builder.nextPaymentDueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPaymentDueDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextPaymentDueDate(nextPaymentDueDate: JsonField<LocalDate>) = apply {
            this.nextPaymentDueDate = nextPaymentDueDate
        }

        /** Date when the next billing period will end */
        fun nextStatementEndDate(nextStatementEndDate: LocalDate) =
            nextStatementEndDate(JsonField.of(nextStatementEndDate))

        /**
         * Sets [Builder.nextStatementEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextStatementEndDate] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextStatementEndDate(nextStatementEndDate: JsonField<LocalDate>) = apply {
            this.nextStatementEndDate = nextStatementEndDate
        }

        /** Details on number and size of payments to pay off balance */
        fun payoffDetails(payoffDetails: Statement.PayoffDetails?) =
            payoffDetails(JsonField.ofNullable(payoffDetails))

        /** Alias for calling [Builder.payoffDetails] with `payoffDetails.orElse(null)`. */
        fun payoffDetails(payoffDetails: Optional<Statement.PayoffDetails>) =
            payoffDetails(payoffDetails.getOrNull())

        /**
         * Sets [Builder.payoffDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payoffDetails] with a well-typed
         * [Statement.PayoffDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun payoffDetails(payoffDetails: JsonField<Statement.PayoffDetails>) = apply {
            this.payoffDetails = payoffDetails
        }

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
         * Returns an immutable instance of [StatementsCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountStanding()
         * .amountDue()
         * .availableCredit()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .daysInBillingCycle()
         * .endingBalance()
         * .financialAccountToken()
         * .paymentDueDate()
         * .periodTotals()
         * .startingBalance()
         * .statementEndDate()
         * .statementStartDate()
         * .statementType()
         * .updated()
         * .ytdTotals()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatementsCreatedWebhookEvent =
            StatementsCreatedWebhookEvent(
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
                payoffDetails,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatementsCreatedWebhookEvent = apply {
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
        statementType().validate()
        updated()
        ytdTotals().validate()
        interestDetails().ifPresent { it.validate() }
        nextPaymentDueDate()
        nextStatementEndDate()
        payoffDetails().ifPresent { it.validate() }
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
            (amountDue.asKnown().getOrNull()?.validity() ?: 0) +
            (if (availableCredit.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (creditLimit.asKnown().isPresent) 1 else 0) +
            (if (creditProductToken.asKnown().isPresent) 1 else 0) +
            (if (daysInBillingCycle.asKnown().isPresent) 1 else 0) +
            (if (endingBalance.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (paymentDueDate.asKnown().isPresent) 1 else 0) +
            (periodTotals.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startingBalance.asKnown().isPresent) 1 else 0) +
            (if (statementEndDate.asKnown().isPresent) 1 else 0) +
            (if (statementStartDate.asKnown().isPresent) 1 else 0) +
            (statementType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (ytdTotals.asKnown().getOrNull()?.validity() ?: 0) +
            (interestDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (nextPaymentDueDate.asKnown().isPresent) 1 else 0) +
            (if (nextStatementEndDate.asKnown().isPresent) 1 else 0) +
            (payoffDetails.asKnown().getOrNull()?.validity() ?: 0) +
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

            @JvmField val STATEMENTS_CREATED = of("statements.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            STATEMENTS_CREATED
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
            STATEMENTS_CREATED,
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
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
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
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
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

        return other is StatementsCreatedWebhookEvent &&
            token == other.token &&
            accountStanding == other.accountStanding &&
            amountDue == other.amountDue &&
            availableCredit == other.availableCredit &&
            created == other.created &&
            creditLimit == other.creditLimit &&
            creditProductToken == other.creditProductToken &&
            daysInBillingCycle == other.daysInBillingCycle &&
            endingBalance == other.endingBalance &&
            financialAccountToken == other.financialAccountToken &&
            paymentDueDate == other.paymentDueDate &&
            periodTotals == other.periodTotals &&
            startingBalance == other.startingBalance &&
            statementEndDate == other.statementEndDate &&
            statementStartDate == other.statementStartDate &&
            statementType == other.statementType &&
            updated == other.updated &&
            ytdTotals == other.ytdTotals &&
            interestDetails == other.interestDetails &&
            nextPaymentDueDate == other.nextPaymentDueDate &&
            nextStatementEndDate == other.nextStatementEndDate &&
            payoffDetails == other.payoffDetails &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountStanding,
            amountDue,
            availableCredit,
            created,
            creditLimit,
            creditProductToken,
            daysInBillingCycle,
            endingBalance,
            financialAccountToken,
            paymentDueDate,
            periodTotals,
            startingBalance,
            statementEndDate,
            statementStartDate,
            statementType,
            updated,
            ytdTotals,
            interestDetails,
            nextPaymentDueDate,
            nextStatementEndDate,
            payoffDetails,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementsCreatedWebhookEvent{token=$token, accountStanding=$accountStanding, amountDue=$amountDue, availableCredit=$availableCredit, created=$created, creditLimit=$creditLimit, creditProductToken=$creditProductToken, daysInBillingCycle=$daysInBillingCycle, endingBalance=$endingBalance, financialAccountToken=$financialAccountToken, paymentDueDate=$paymentDueDate, periodTotals=$periodTotals, startingBalance=$startingBalance, statementEndDate=$statementEndDate, statementStartDate=$statementStartDate, statementType=$statementType, updated=$updated, ytdTotals=$ytdTotals, interestDetails=$interestDetails, nextPaymentDueDate=$nextPaymentDueDate, nextStatementEndDate=$nextStatementEndDate, payoffDetails=$payoffDetails, eventType=$eventType, additionalProperties=$additionalProperties}"
}
