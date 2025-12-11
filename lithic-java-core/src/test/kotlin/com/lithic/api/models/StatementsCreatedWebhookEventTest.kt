// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementsCreatedWebhookEventTest {

    @Test
    fun create() {
        val statementsCreatedWebhookEvent =
            StatementsCreatedWebhookEvent.builder()
                .token("token")
                .accountStanding(
                    Statement.AccountStanding.builder()
                        .consecutiveFullPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMissed(0L)
                        .daysPastDue(0L)
                        .financialAccountState(
                            Statement.AccountStanding.FinancialAccountState.builder()
                                .status(
                                    Statement.AccountStanding.FinancialAccountState
                                        .FinancialAccountStatus
                                        .OPEN
                                )
                                .substatus(
                                    Statement.AccountStanding.FinancialAccountState
                                        .FinancialAccountSubstatus
                                        .CHARGED_OFF_DELINQUENT
                                )
                                .build()
                        )
                        .hasGrace(true)
                        .periodNumber(0L)
                        .periodState(Statement.AccountStanding.PeriodState.STANDARD)
                        .build()
                )
                .amountDue(Statement.AmountDue.builder().amount(0L).pastDue(0L).build())
                .availableCredit(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .daysInBillingCycle(0L)
                .endingBalance(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentDueDate(LocalDate.parse("2019-12-27"))
                .periodTotals(
                    StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .debits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .creditDetails(JsonValue.from(mapOf<String, Any>()))
                        .debitDetails(JsonValue.from(mapOf<String, Any>()))
                        .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .startingBalance(0L)
                .statementEndDate(LocalDate.parse("2019-12-27"))
                .statementStartDate(LocalDate.parse("2019-12-27"))
                .statementType(Statement.StatementType.INITIAL)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ytdTotals(
                    StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .debits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .creditDetails(JsonValue.from(mapOf<String, Any>()))
                        .debitDetails(JsonValue.from(mapOf<String, Any>()))
                        .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .interestDetails(
                    Statement.InterestDetails.builder()
                        .actualInterestCharged(0L)
                        .dailyBalanceAmounts(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .effectiveApr(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .interestCalculationMethod(
                            Statement.InterestDetails.InterestCalculationMethod.DAILY
                        )
                        .interestForPeriod(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .primeRate("prime_rate")
                        .minimumInterestCharged(0L)
                        .build()
                )
                .nextPaymentDueDate(LocalDate.parse("2019-12-27"))
                .nextStatementEndDate(LocalDate.parse("2019-12-27"))
                .payoffDetails(
                    Statement.PayoffDetails.builder()
                        .minimumPaymentMonths("minimum_payment_months")
                        .minimumPaymentTotal("minimum_payment_total")
                        .payoffPeriodLengthMonths(0L)
                        .payoffPeriodMonthlyPaymentAmount(0L)
                        .payoffPeriodPaymentTotal(0L)
                        .build()
                )
                .eventType(StatementsCreatedWebhookEvent.EventType.STATEMENTS_CREATED)
                .build()

        assertThat(statementsCreatedWebhookEvent.token()).isEqualTo("token")
        assertThat(statementsCreatedWebhookEvent.accountStanding())
            .isEqualTo(
                Statement.AccountStanding.builder()
                    .consecutiveFullPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMissed(0L)
                    .daysPastDue(0L)
                    .financialAccountState(
                        Statement.AccountStanding.FinancialAccountState.builder()
                            .status(
                                Statement.AccountStanding.FinancialAccountState
                                    .FinancialAccountStatus
                                    .OPEN
                            )
                            .substatus(
                                Statement.AccountStanding.FinancialAccountState
                                    .FinancialAccountSubstatus
                                    .CHARGED_OFF_DELINQUENT
                            )
                            .build()
                    )
                    .hasGrace(true)
                    .periodNumber(0L)
                    .periodState(Statement.AccountStanding.PeriodState.STANDARD)
                    .build()
            )
        assertThat(statementsCreatedWebhookEvent.amountDue())
            .isEqualTo(Statement.AmountDue.builder().amount(0L).pastDue(0L).build())
        assertThat(statementsCreatedWebhookEvent.availableCredit()).isEqualTo(0L)
        assertThat(statementsCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementsCreatedWebhookEvent.creditLimit()).isEqualTo(0L)
        assertThat(statementsCreatedWebhookEvent.creditProductToken())
            .isEqualTo("credit_product_token")
        assertThat(statementsCreatedWebhookEvent.daysInBillingCycle()).isEqualTo(0L)
        assertThat(statementsCreatedWebhookEvent.endingBalance()).isEqualTo(0L)
        assertThat(statementsCreatedWebhookEvent.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(statementsCreatedWebhookEvent.paymentDueDate())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(statementsCreatedWebhookEvent.periodTotals())
            .isEqualTo(
                StatementTotals.builder()
                    .balanceTransfers(0L)
                    .cashAdvances(0L)
                    .credits(0L)
                    .debits(0L)
                    .fees(0L)
                    .interest(0L)
                    .payments(0L)
                    .purchases(0L)
                    .creditDetails(JsonValue.from(mapOf<String, Any>()))
                    .debitDetails(JsonValue.from(mapOf<String, Any>()))
                    .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(statementsCreatedWebhookEvent.startingBalance()).isEqualTo(0L)
        assertThat(statementsCreatedWebhookEvent.statementEndDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statementsCreatedWebhookEvent.statementStartDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statementsCreatedWebhookEvent.statementType())
            .isEqualTo(Statement.StatementType.INITIAL)
        assertThat(statementsCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementsCreatedWebhookEvent.ytdTotals())
            .isEqualTo(
                StatementTotals.builder()
                    .balanceTransfers(0L)
                    .cashAdvances(0L)
                    .credits(0L)
                    .debits(0L)
                    .fees(0L)
                    .interest(0L)
                    .payments(0L)
                    .purchases(0L)
                    .creditDetails(JsonValue.from(mapOf<String, Any>()))
                    .debitDetails(JsonValue.from(mapOf<String, Any>()))
                    .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(statementsCreatedWebhookEvent.interestDetails())
            .contains(
                Statement.InterestDetails.builder()
                    .actualInterestCharged(0L)
                    .dailyBalanceAmounts(
                        CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .effectiveApr(
                        CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .interestCalculationMethod(
                        Statement.InterestDetails.InterestCalculationMethod.DAILY
                    )
                    .interestForPeriod(
                        CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .primeRate("prime_rate")
                    .minimumInterestCharged(0L)
                    .build()
            )
        assertThat(statementsCreatedWebhookEvent.nextPaymentDueDate())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(statementsCreatedWebhookEvent.nextStatementEndDate())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(statementsCreatedWebhookEvent.payoffDetails())
            .contains(
                Statement.PayoffDetails.builder()
                    .minimumPaymentMonths("minimum_payment_months")
                    .minimumPaymentTotal("minimum_payment_total")
                    .payoffPeriodLengthMonths(0L)
                    .payoffPeriodMonthlyPaymentAmount(0L)
                    .payoffPeriodPaymentTotal(0L)
                    .build()
            )
        assertThat(statementsCreatedWebhookEvent.eventType())
            .isEqualTo(StatementsCreatedWebhookEvent.EventType.STATEMENTS_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementsCreatedWebhookEvent =
            StatementsCreatedWebhookEvent.builder()
                .token("token")
                .accountStanding(
                    Statement.AccountStanding.builder()
                        .consecutiveFullPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMissed(0L)
                        .daysPastDue(0L)
                        .financialAccountState(
                            Statement.AccountStanding.FinancialAccountState.builder()
                                .status(
                                    Statement.AccountStanding.FinancialAccountState
                                        .FinancialAccountStatus
                                        .OPEN
                                )
                                .substatus(
                                    Statement.AccountStanding.FinancialAccountState
                                        .FinancialAccountSubstatus
                                        .CHARGED_OFF_DELINQUENT
                                )
                                .build()
                        )
                        .hasGrace(true)
                        .periodNumber(0L)
                        .periodState(Statement.AccountStanding.PeriodState.STANDARD)
                        .build()
                )
                .amountDue(Statement.AmountDue.builder().amount(0L).pastDue(0L).build())
                .availableCredit(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .daysInBillingCycle(0L)
                .endingBalance(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentDueDate(LocalDate.parse("2019-12-27"))
                .periodTotals(
                    StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .debits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .creditDetails(JsonValue.from(mapOf<String, Any>()))
                        .debitDetails(JsonValue.from(mapOf<String, Any>()))
                        .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .startingBalance(0L)
                .statementEndDate(LocalDate.parse("2019-12-27"))
                .statementStartDate(LocalDate.parse("2019-12-27"))
                .statementType(Statement.StatementType.INITIAL)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ytdTotals(
                    StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .debits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .creditDetails(JsonValue.from(mapOf<String, Any>()))
                        .debitDetails(JsonValue.from(mapOf<String, Any>()))
                        .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .interestDetails(
                    Statement.InterestDetails.builder()
                        .actualInterestCharged(0L)
                        .dailyBalanceAmounts(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .effectiveApr(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .interestCalculationMethod(
                            Statement.InterestDetails.InterestCalculationMethod.DAILY
                        )
                        .interestForPeriod(
                            CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .primeRate("prime_rate")
                        .minimumInterestCharged(0L)
                        .build()
                )
                .nextPaymentDueDate(LocalDate.parse("2019-12-27"))
                .nextStatementEndDate(LocalDate.parse("2019-12-27"))
                .payoffDetails(
                    Statement.PayoffDetails.builder()
                        .minimumPaymentMonths("minimum_payment_months")
                        .minimumPaymentTotal("minimum_payment_total")
                        .payoffPeriodLengthMonths(0L)
                        .payoffPeriodMonthlyPaymentAmount(0L)
                        .payoffPeriodPaymentTotal(0L)
                        .build()
                )
                .eventType(StatementsCreatedWebhookEvent.EventType.STATEMENTS_CREATED)
                .build()

        val roundtrippedStatementsCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementsCreatedWebhookEvent),
                jacksonTypeRef<StatementsCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedStatementsCreatedWebhookEvent)
            .isEqualTo(statementsCreatedWebhookEvent)
    }
}
