// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoanTapeCreatedWebhookEventTest {

    @Test
    fun create() {
        val loanTapeCreatedWebhookEvent =
            LoanTapeCreatedWebhookEvent.builder()
                .token("token")
                .accountStanding(
                    LoanTape.AccountStanding.builder()
                        .consecutiveFullPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMissed(0L)
                        .daysPastDue(0L)
                        .financialAccountState(
                            LoanTape.AccountStanding.FinancialAccountState.builder()
                                .status(
                                    LoanTape.AccountStanding.FinancialAccountState
                                        .FinancialAccountStatus
                                        .OPEN
                                )
                                .substatus(
                                    LoanTape.AccountStanding.FinancialAccountState
                                        .FinancialAccountSubstatus
                                        .CHARGED_OFF_DELINQUENT
                                )
                                .build()
                        )
                        .hasGrace(true)
                        .periodNumber(0L)
                        .periodState(LoanTape.AccountStanding.PeriodState.STANDARD)
                        .build()
                )
                .availableCredit(0L)
                .balances(
                    LoanTape.Balances.builder()
                        .due(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                        .nextStatementDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .pastDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .pastStatementsDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .date(LocalDate.parse("2019-12-27"))
                .dayTotals(
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
                .endingBalance(0L)
                .excessCredits(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .interestDetails(
                    LoanTape.InterestDetails.builder()
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
                            LoanTape.InterestDetails.InterestCalculationMethod.DAILY
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
                .minimumPaymentBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .paymentAllocation(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
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
                .previousStatementBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .startingBalance(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
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
                .tier("tier")
                .eventType(LoanTapeCreatedWebhookEvent.EventType.LOAN_TAPE_CREATED)
                .build()

        assertThat(loanTapeCreatedWebhookEvent.token()).isEqualTo("token")
        assertThat(loanTapeCreatedWebhookEvent.accountStanding())
            .isEqualTo(
                LoanTape.AccountStanding.builder()
                    .consecutiveFullPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMissed(0L)
                    .daysPastDue(0L)
                    .financialAccountState(
                        LoanTape.AccountStanding.FinancialAccountState.builder()
                            .status(
                                LoanTape.AccountStanding.FinancialAccountState
                                    .FinancialAccountStatus
                                    .OPEN
                            )
                            .substatus(
                                LoanTape.AccountStanding.FinancialAccountState
                                    .FinancialAccountSubstatus
                                    .CHARGED_OFF_DELINQUENT
                            )
                            .build()
                    )
                    .hasGrace(true)
                    .periodNumber(0L)
                    .periodState(LoanTape.AccountStanding.PeriodState.STANDARD)
                    .build()
            )
        assertThat(loanTapeCreatedWebhookEvent.availableCredit()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.balances())
            .isEqualTo(
                LoanTape.Balances.builder()
                    .due(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                    .nextStatementDue(
                        CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                    )
                    .pastDue(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                    .pastStatementsDue(
                        CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                    )
                    .build()
            )
        assertThat(loanTapeCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTapeCreatedWebhookEvent.creditLimit()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.creditProductToken())
            .isEqualTo("credit_product_token")
        assertThat(loanTapeCreatedWebhookEvent.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(loanTapeCreatedWebhookEvent.dayTotals())
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
        assertThat(loanTapeCreatedWebhookEvent.endingBalance()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.excessCredits()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(loanTapeCreatedWebhookEvent.interestDetails())
            .contains(
                LoanTape.InterestDetails.builder()
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
                        LoanTape.InterestDetails.InterestCalculationMethod.DAILY
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
        assertThat(loanTapeCreatedWebhookEvent.minimumPaymentBalance())
            .isEqualTo(LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build())
        assertThat(loanTapeCreatedWebhookEvent.paymentAllocation())
            .isEqualTo(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
        assertThat(loanTapeCreatedWebhookEvent.periodTotals())
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
        assertThat(loanTapeCreatedWebhookEvent.previousStatementBalance())
            .isEqualTo(LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build())
        assertThat(loanTapeCreatedWebhookEvent.startingBalance()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTapeCreatedWebhookEvent.version()).isEqualTo(0L)
        assertThat(loanTapeCreatedWebhookEvent.ytdTotals())
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
        assertThat(loanTapeCreatedWebhookEvent.tier()).contains("tier")
        assertThat(loanTapeCreatedWebhookEvent.eventType())
            .isEqualTo(LoanTapeCreatedWebhookEvent.EventType.LOAN_TAPE_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val loanTapeCreatedWebhookEvent =
            LoanTapeCreatedWebhookEvent.builder()
                .token("token")
                .accountStanding(
                    LoanTape.AccountStanding.builder()
                        .consecutiveFullPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMissed(0L)
                        .daysPastDue(0L)
                        .financialAccountState(
                            LoanTape.AccountStanding.FinancialAccountState.builder()
                                .status(
                                    LoanTape.AccountStanding.FinancialAccountState
                                        .FinancialAccountStatus
                                        .OPEN
                                )
                                .substatus(
                                    LoanTape.AccountStanding.FinancialAccountState
                                        .FinancialAccountSubstatus
                                        .CHARGED_OFF_DELINQUENT
                                )
                                .build()
                        )
                        .hasGrace(true)
                        .periodNumber(0L)
                        .periodState(LoanTape.AccountStanding.PeriodState.STANDARD)
                        .build()
                )
                .availableCredit(0L)
                .balances(
                    LoanTape.Balances.builder()
                        .due(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                        .nextStatementDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .pastDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .pastStatementsDue(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .date(LocalDate.parse("2019-12-27"))
                .dayTotals(
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
                .endingBalance(0L)
                .excessCredits(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .interestDetails(
                    LoanTape.InterestDetails.builder()
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
                            LoanTape.InterestDetails.InterestCalculationMethod.DAILY
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
                .minimumPaymentBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .paymentAllocation(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
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
                .previousStatementBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .startingBalance(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
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
                .tier("tier")
                .eventType(LoanTapeCreatedWebhookEvent.EventType.LOAN_TAPE_CREATED)
                .build()

        val roundtrippedLoanTapeCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loanTapeCreatedWebhookEvent),
                jacksonTypeRef<LoanTapeCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedLoanTapeCreatedWebhookEvent).isEqualTo(loanTapeCreatedWebhookEvent)
    }
}
