// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementTest {

    @Test
    fun create() {
        val statement =
            Statement.builder()
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
                    Statement.StatementTotals.builder()
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
                        .build()
                )
                .startingBalance(0L)
                .statementEndDate(LocalDate.parse("2019-12-27"))
                .statementStartDate(LocalDate.parse("2019-12-27"))
                .statementType(Statement.StatementType.INITIAL)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ytdTotals(
                    Statement.StatementTotals.builder()
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
                        .build()
                )
                .interestDetails(
                    Statement.InterestDetails.builder()
                        .actualInterestCharged(0L)
                        .dailyBalanceAmounts(
                            Statement.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .effectiveApr(
                            Statement.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .interestCalculationMethod(
                            Statement.InterestDetails.InterestCalculationMethod.DAILY
                        )
                        .interestForPeriod(
                            Statement.InterestDetails.CategoryDetails.builder()
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
                .build()

        assertThat(statement.token()).isEqualTo("token")
        assertThat(statement.accountStanding())
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
        assertThat(statement.amountDue())
            .isEqualTo(Statement.AmountDue.builder().amount(0L).pastDue(0L).build())
        assertThat(statement.availableCredit()).isEqualTo(0L)
        assertThat(statement.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statement.creditLimit()).isEqualTo(0L)
        assertThat(statement.creditProductToken()).isEqualTo("credit_product_token")
        assertThat(statement.daysInBillingCycle()).isEqualTo(0L)
        assertThat(statement.endingBalance()).isEqualTo(0L)
        assertThat(statement.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(statement.paymentDueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(statement.periodTotals())
            .isEqualTo(
                Statement.StatementTotals.builder()
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
                    .build()
            )
        assertThat(statement.startingBalance()).isEqualTo(0L)
        assertThat(statement.statementEndDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statement.statementStartDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statement.statementType()).isEqualTo(Statement.StatementType.INITIAL)
        assertThat(statement.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statement.ytdTotals())
            .isEqualTo(
                Statement.StatementTotals.builder()
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
                    .build()
            )
        assertThat(statement.interestDetails())
            .contains(
                Statement.InterestDetails.builder()
                    .actualInterestCharged(0L)
                    .dailyBalanceAmounts(
                        Statement.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .effectiveApr(
                        Statement.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .interestCalculationMethod(
                        Statement.InterestDetails.InterestCalculationMethod.DAILY
                    )
                    .interestForPeriod(
                        Statement.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .primeRate("prime_rate")
                    .minimumInterestCharged(0L)
                    .build()
            )
        assertThat(statement.nextPaymentDueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(statement.nextStatementEndDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statement =
            Statement.builder()
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
                    Statement.StatementTotals.builder()
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
                        .build()
                )
                .startingBalance(0L)
                .statementEndDate(LocalDate.parse("2019-12-27"))
                .statementStartDate(LocalDate.parse("2019-12-27"))
                .statementType(Statement.StatementType.INITIAL)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ytdTotals(
                    Statement.StatementTotals.builder()
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
                        .build()
                )
                .interestDetails(
                    Statement.InterestDetails.builder()
                        .actualInterestCharged(0L)
                        .dailyBalanceAmounts(
                            Statement.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .effectiveApr(
                            Statement.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .interestCalculationMethod(
                            Statement.InterestDetails.InterestCalculationMethod.DAILY
                        )
                        .interestForPeriod(
                            Statement.InterestDetails.CategoryDetails.builder()
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
                .build()

        val roundtrippedStatement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statement),
                jacksonTypeRef<Statement>(),
            )

        assertThat(roundtrippedStatement).isEqualTo(statement)
    }
}
