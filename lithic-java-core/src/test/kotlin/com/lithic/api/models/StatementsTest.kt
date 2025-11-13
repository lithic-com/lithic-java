// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementsTest {

    @Test
    fun create() {
        val statements =
            Statements.builder()
                .addData(
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
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(statements.data())
            .containsExactly(
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
                    .build()
            )
        assertThat(statements.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statements =
            Statements.builder()
                .addData(
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
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedStatements =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statements),
                jacksonTypeRef<Statements>(),
            )

        assertThat(roundtrippedStatements).isEqualTo(statements)
    }
}
