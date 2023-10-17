// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Statement.Builder::class)
@NoAutoDetect
class Statement
private constructor(
    private val achPeriodTotal: JsonField<Long>,
    private val achYtdTotal: JsonField<Long>,
    private val adjustmentsPeriodTotal: JsonField<Long>,
    private val adjustmentsYtdTotal: JsonField<Long>,
    private val amountDue: JsonField<Long>,
    private val availableCredit: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val creditLimit: JsonField<Long>,
    private val daysInBillingCycle: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val paymentDueDate: JsonField<LocalDate>,
    private val purchasesPeriodTotal: JsonField<Long>,
    private val purchasesYtdTotal: JsonField<Long>,
    private val startingBalance: JsonField<Long>,
    private val statementEndDate: JsonField<LocalDate>,
    private val statementStartDate: JsonField<LocalDate>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Total payments during this billing period. */
    fun achPeriodTotal(): Long = achPeriodTotal.getRequired("ach_period_total")

    /** Year-to-date settled payment total */
    fun achYtdTotal(): Long = achYtdTotal.getRequired("ach_ytd_total")

    /** Total adjustments during this billing period. */
    fun adjustmentsPeriodTotal(): Long =
        adjustmentsPeriodTotal.getRequired("adjustments_period_total")

    /** Year-to-date settled adjustments total */
    fun adjustmentsYtdTotal(): Long = adjustmentsYtdTotal.getRequired("adjustments_ytd_total")

    /**
     * Payment due at the end of the billing period. Negative amount indicates something is owed. If
     * the amount owed is positive (e.g., there was a net credit), then payment should be returned
     * to the cardholder via ACH.
     */
    fun amountDue(): Long = amountDue.getRequired("amount_due")

    /** Amount of credit available to spend */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /** Timestamp of when the statement was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender.
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** Number of days in the billing cycle */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due.
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Date when the payment is due */
    fun paymentDueDate(): LocalDate = paymentDueDate.getRequired("payment_due_date")

    /** Total settled card transactions during this billing period, determined by liability date. */
    fun purchasesPeriodTotal(): Long = purchasesPeriodTotal.getRequired("purchases_period_total")

    /** Year-to-date settled card transaction total */
    fun purchasesYtdTotal(): Long = purchasesYtdTotal.getRequired("purchases_ytd_total")

    /** Balance at the start of the billing period */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /** Date when the billing period ended */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /** Date when the billing period began */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    /** Globally unique identifier for a statement */
    fun token(): String = token.getRequired("token")

    /** Timestamp of when the statement was updated */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Total payments during this billing period. */
    @JsonProperty("ach_period_total") @ExcludeMissing fun _achPeriodTotal() = achPeriodTotal

    /** Year-to-date settled payment total */
    @JsonProperty("ach_ytd_total") @ExcludeMissing fun _achYtdTotal() = achYtdTotal

    /** Total adjustments during this billing period. */
    @JsonProperty("adjustments_period_total")
    @ExcludeMissing
    fun _adjustmentsPeriodTotal() = adjustmentsPeriodTotal

    /** Year-to-date settled adjustments total */
    @JsonProperty("adjustments_ytd_total")
    @ExcludeMissing
    fun _adjustmentsYtdTotal() = adjustmentsYtdTotal

    /**
     * Payment due at the end of the billing period. Negative amount indicates something is owed. If
     * the amount owed is positive (e.g., there was a net credit), then payment should be returned
     * to the cardholder via ACH.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue() = amountDue

    /** Amount of credit available to spend */
    @JsonProperty("available_credit") @ExcludeMissing fun _availableCredit() = availableCredit

    /** Timestamp of when the statement was created */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * For prepay accounts, this is the minimum prepay balance that must be maintained. For charge
     * card accounts, this is the maximum credit balance extended by a lender.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    /** Number of days in the billing cycle */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle() = daysInBillingCycle

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due.
     */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Date when the payment is due */
    @JsonProperty("payment_due_date") @ExcludeMissing fun _paymentDueDate() = paymentDueDate

    /** Total settled card transactions during this billing period, determined by liability date. */
    @JsonProperty("purchases_period_total")
    @ExcludeMissing
    fun _purchasesPeriodTotal() = purchasesPeriodTotal

    /** Year-to-date settled card transaction total */
    @JsonProperty("purchases_ytd_total")
    @ExcludeMissing
    fun _purchasesYtdTotal() = purchasesYtdTotal

    /** Balance at the start of the billing period */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /** Date when the billing period ended */
    @JsonProperty("statement_end_date") @ExcludeMissing fun _statementEndDate() = statementEndDate

    /** Date when the billing period began */
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    fun _statementStartDate() = statementStartDate

    /** Globally unique identifier for a statement */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Timestamp of when the statement was updated */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Statement = apply {
        if (!validated) {
            achPeriodTotal()
            achYtdTotal()
            adjustmentsPeriodTotal()
            adjustmentsYtdTotal()
            amountDue()
            availableCredit()
            created()
            creditLimit()
            daysInBillingCycle()
            endingBalance()
            financialAccountToken()
            paymentDueDate()
            purchasesPeriodTotal()
            purchasesYtdTotal()
            startingBalance()
            statementEndDate()
            statementStartDate()
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

        return other is Statement &&
            this.achPeriodTotal == other.achPeriodTotal &&
            this.achYtdTotal == other.achYtdTotal &&
            this.adjustmentsPeriodTotal == other.adjustmentsPeriodTotal &&
            this.adjustmentsYtdTotal == other.adjustmentsYtdTotal &&
            this.amountDue == other.amountDue &&
            this.availableCredit == other.availableCredit &&
            this.created == other.created &&
            this.creditLimit == other.creditLimit &&
            this.daysInBillingCycle == other.daysInBillingCycle &&
            this.endingBalance == other.endingBalance &&
            this.financialAccountToken == other.financialAccountToken &&
            this.paymentDueDate == other.paymentDueDate &&
            this.purchasesPeriodTotal == other.purchasesPeriodTotal &&
            this.purchasesYtdTotal == other.purchasesYtdTotal &&
            this.startingBalance == other.startingBalance &&
            this.statementEndDate == other.statementEndDate &&
            this.statementStartDate == other.statementStartDate &&
            this.token == other.token &&
            this.updated == other.updated &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    achPeriodTotal,
                    achYtdTotal,
                    adjustmentsPeriodTotal,
                    adjustmentsYtdTotal,
                    amountDue,
                    availableCredit,
                    created,
                    creditLimit,
                    daysInBillingCycle,
                    endingBalance,
                    financialAccountToken,
                    paymentDueDate,
                    purchasesPeriodTotal,
                    purchasesYtdTotal,
                    startingBalance,
                    statementEndDate,
                    statementStartDate,
                    token,
                    updated,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Statement{achPeriodTotal=$achPeriodTotal, achYtdTotal=$achYtdTotal, adjustmentsPeriodTotal=$adjustmentsPeriodTotal, adjustmentsYtdTotal=$adjustmentsYtdTotal, amountDue=$amountDue, availableCredit=$availableCredit, created=$created, creditLimit=$creditLimit, daysInBillingCycle=$daysInBillingCycle, endingBalance=$endingBalance, financialAccountToken=$financialAccountToken, paymentDueDate=$paymentDueDate, purchasesPeriodTotal=$purchasesPeriodTotal, purchasesYtdTotal=$purchasesYtdTotal, startingBalance=$startingBalance, statementEndDate=$statementEndDate, statementStartDate=$statementStartDate, token=$token, updated=$updated, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var achPeriodTotal: JsonField<Long> = JsonMissing.of()
        private var achYtdTotal: JsonField<Long> = JsonMissing.of()
        private var adjustmentsPeriodTotal: JsonField<Long> = JsonMissing.of()
        private var adjustmentsYtdTotal: JsonField<Long> = JsonMissing.of()
        private var amountDue: JsonField<Long> = JsonMissing.of()
        private var availableCredit: JsonField<Long> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var daysInBillingCycle: JsonField<Long> = JsonMissing.of()
        private var endingBalance: JsonField<Long> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var paymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var purchasesPeriodTotal: JsonField<Long> = JsonMissing.of()
        private var purchasesYtdTotal: JsonField<Long> = JsonMissing.of()
        private var startingBalance: JsonField<Long> = JsonMissing.of()
        private var statementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var statementStartDate: JsonField<LocalDate> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statement: Statement) = apply {
            this.achPeriodTotal = statement.achPeriodTotal
            this.achYtdTotal = statement.achYtdTotal
            this.adjustmentsPeriodTotal = statement.adjustmentsPeriodTotal
            this.adjustmentsYtdTotal = statement.adjustmentsYtdTotal
            this.amountDue = statement.amountDue
            this.availableCredit = statement.availableCredit
            this.created = statement.created
            this.creditLimit = statement.creditLimit
            this.daysInBillingCycle = statement.daysInBillingCycle
            this.endingBalance = statement.endingBalance
            this.financialAccountToken = statement.financialAccountToken
            this.paymentDueDate = statement.paymentDueDate
            this.purchasesPeriodTotal = statement.purchasesPeriodTotal
            this.purchasesYtdTotal = statement.purchasesYtdTotal
            this.startingBalance = statement.startingBalance
            this.statementEndDate = statement.statementEndDate
            this.statementStartDate = statement.statementStartDate
            this.token = statement.token
            this.updated = statement.updated
            additionalProperties(statement.additionalProperties)
        }

        /** Total payments during this billing period. */
        fun achPeriodTotal(achPeriodTotal: Long) = achPeriodTotal(JsonField.of(achPeriodTotal))

        /** Total payments during this billing period. */
        @JsonProperty("ach_period_total")
        @ExcludeMissing
        fun achPeriodTotal(achPeriodTotal: JsonField<Long>) = apply {
            this.achPeriodTotal = achPeriodTotal
        }

        /** Year-to-date settled payment total */
        fun achYtdTotal(achYtdTotal: Long) = achYtdTotal(JsonField.of(achYtdTotal))

        /** Year-to-date settled payment total */
        @JsonProperty("ach_ytd_total")
        @ExcludeMissing
        fun achYtdTotal(achYtdTotal: JsonField<Long>) = apply { this.achYtdTotal = achYtdTotal }

        /** Total adjustments during this billing period. */
        fun adjustmentsPeriodTotal(adjustmentsPeriodTotal: Long) =
            adjustmentsPeriodTotal(JsonField.of(adjustmentsPeriodTotal))

        /** Total adjustments during this billing period. */
        @JsonProperty("adjustments_period_total")
        @ExcludeMissing
        fun adjustmentsPeriodTotal(adjustmentsPeriodTotal: JsonField<Long>) = apply {
            this.adjustmentsPeriodTotal = adjustmentsPeriodTotal
        }

        /** Year-to-date settled adjustments total */
        fun adjustmentsYtdTotal(adjustmentsYtdTotal: Long) =
            adjustmentsYtdTotal(JsonField.of(adjustmentsYtdTotal))

        /** Year-to-date settled adjustments total */
        @JsonProperty("adjustments_ytd_total")
        @ExcludeMissing
        fun adjustmentsYtdTotal(adjustmentsYtdTotal: JsonField<Long>) = apply {
            this.adjustmentsYtdTotal = adjustmentsYtdTotal
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

        /** Amount of credit available to spend */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /** Amount of credit available to spend */
        @JsonProperty("available_credit")
        @ExcludeMissing
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        /** Timestamp of when the statement was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the statement was created */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate) = paymentDueDate(JsonField.of(paymentDueDate))

        /** Date when the payment is due */
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
        }

        /**
         * Total settled card transactions during this billing period, determined by liability date.
         */
        fun purchasesPeriodTotal(purchasesPeriodTotal: Long) =
            purchasesPeriodTotal(JsonField.of(purchasesPeriodTotal))

        /**
         * Total settled card transactions during this billing period, determined by liability date.
         */
        @JsonProperty("purchases_period_total")
        @ExcludeMissing
        fun purchasesPeriodTotal(purchasesPeriodTotal: JsonField<Long>) = apply {
            this.purchasesPeriodTotal = purchasesPeriodTotal
        }

        /** Year-to-date settled card transaction total */
        fun purchasesYtdTotal(purchasesYtdTotal: Long) =
            purchasesYtdTotal(JsonField.of(purchasesYtdTotal))

        /** Year-to-date settled card transaction total */
        @JsonProperty("purchases_ytd_total")
        @ExcludeMissing
        fun purchasesYtdTotal(purchasesYtdTotal: JsonField<Long>) = apply {
            this.purchasesYtdTotal = purchasesYtdTotal
        }

        /** Balance at the start of the billing period */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** Balance at the start of the billing period */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
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

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: LocalDate) =
            statementStartDate(JsonField.of(statementStartDate))

        /** Date when the billing period began */
        @JsonProperty("statement_start_date")
        @ExcludeMissing
        fun statementStartDate(statementStartDate: JsonField<LocalDate>) = apply {
            this.statementStartDate = statementStartDate
        }

        /** Globally unique identifier for a statement */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a statement */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when the statement was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Timestamp of when the statement was updated */
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

        fun build(): Statement =
            Statement(
                achPeriodTotal,
                achYtdTotal,
                adjustmentsPeriodTotal,
                adjustmentsYtdTotal,
                amountDue,
                availableCredit,
                created,
                creditLimit,
                daysInBillingCycle,
                endingBalance,
                financialAccountToken,
                paymentDueDate,
                purchasesPeriodTotal,
                purchasesYtdTotal,
                startingBalance,
                statementEndDate,
                statementStartDate,
                token,
                updated,
                additionalProperties.toUnmodifiable(),
            )
    }
}
