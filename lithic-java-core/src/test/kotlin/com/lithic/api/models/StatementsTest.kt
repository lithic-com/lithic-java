// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StatementsTest {

    @Test
    fun createStatements() {
        val statements =
            Statements.builder()
                .data(
                    listOf(
                        Statement.builder()
                            .token("token")
                            .accountStanding(
                                Statement.AccountStanding.builder()
                                    .periodNumber(123L)
                                    .state(Statement.AccountStanding.AccountState2.STANDARD)
                                    .build()
                            )
                            .amountDue(123L)
                            .amountPastDue(123L)
                            .availableCredit(123L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .creditLimit(123L)
                            .creditProductToken("credit_product_token")
                            .daysInBillingCycle(123L)
                            .endingBalance(123L)
                            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .nextStatementDate(LocalDate.parse("2019-12-27"))
                            .paymentDueDate(LocalDate.parse("2019-12-27"))
                            .periodTotals(
                                Statement.StatementTotals.builder()
                                    .balanceTransfers(123L)
                                    .cashAdvances(123L)
                                    .credits(123L)
                                    .fees(123L)
                                    .interest(123L)
                                    .payments(123L)
                                    .purchases(123L)
                                    .build()
                            )
                            .startingBalance(123L)
                            .statementEndDate(LocalDate.parse("2019-12-27"))
                            .statementStartDate(LocalDate.parse("2019-12-27"))
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ytdTotals(
                                Statement.StatementTotals.builder()
                                    .balanceTransfers(123L)
                                    .cashAdvances(123L)
                                    .credits(123L)
                                    .fees(123L)
                                    .interest(123L)
                                    .payments(123L)
                                    .purchases(123L)
                                    .build()
                            )
                            .build()
                    )
                )
                .hasMore(true)
                .build()
        assertThat(statements).isNotNull
        assertThat(statements.data())
            .containsExactly(
                Statement.builder()
                    .token("token")
                    .accountStanding(
                        Statement.AccountStanding.builder()
                            .periodNumber(123L)
                            .state(Statement.AccountStanding.AccountState2.STANDARD)
                            .build()
                    )
                    .amountDue(123L)
                    .amountPastDue(123L)
                    .availableCredit(123L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditLimit(123L)
                    .creditProductToken("credit_product_token")
                    .daysInBillingCycle(123L)
                    .endingBalance(123L)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nextStatementDate(LocalDate.parse("2019-12-27"))
                    .paymentDueDate(LocalDate.parse("2019-12-27"))
                    .periodTotals(
                        Statement.StatementTotals.builder()
                            .balanceTransfers(123L)
                            .cashAdvances(123L)
                            .credits(123L)
                            .fees(123L)
                            .interest(123L)
                            .payments(123L)
                            .purchases(123L)
                            .build()
                    )
                    .startingBalance(123L)
                    .statementEndDate(LocalDate.parse("2019-12-27"))
                    .statementStartDate(LocalDate.parse("2019-12-27"))
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ytdTotals(
                        Statement.StatementTotals.builder()
                            .balanceTransfers(123L)
                            .cashAdvances(123L)
                            .credits(123L)
                            .fees(123L)
                            .interest(123L)
                            .payments(123L)
                            .purchases(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(statements.hasMore()).isEqualTo(true)
    }
}
