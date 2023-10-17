// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StatementTest {

    @Test
    fun createStatement() {
        val statement =
            Statement.builder()
                .token("string")
                .achPeriodTotal(123L)
                .achYtdTotal(123L)
                .adjustmentsPeriodTotal(123L)
                .adjustmentsYtdTotal(123L)
                .amountDue(123L)
                .availableCredit(123L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(123L)
                .daysInBillingCycle(123L)
                .endingBalance(123L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentDueDate(LocalDate.parse("2019-12-27"))
                .purchasesPeriodTotal(123L)
                .purchasesYtdTotal(123L)
                .startingBalance(123L)
                .statementEndDate(LocalDate.parse("2019-12-27"))
                .statementStartDate(LocalDate.parse("2019-12-27"))
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(statement).isNotNull
        assertThat(statement.token()).isEqualTo("string")
        assertThat(statement.achPeriodTotal()).isEqualTo(123L)
        assertThat(statement.achYtdTotal()).isEqualTo(123L)
        assertThat(statement.adjustmentsPeriodTotal()).isEqualTo(123L)
        assertThat(statement.adjustmentsYtdTotal()).isEqualTo(123L)
        assertThat(statement.amountDue()).isEqualTo(123L)
        assertThat(statement.availableCredit()).isEqualTo(123L)
        assertThat(statement.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statement.creditLimit()).isEqualTo(123L)
        assertThat(statement.daysInBillingCycle()).isEqualTo(123L)
        assertThat(statement.endingBalance()).isEqualTo(123L)
        assertThat(statement.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(statement.paymentDueDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statement.purchasesPeriodTotal()).isEqualTo(123L)
        assertThat(statement.purchasesYtdTotal()).isEqualTo(123L)
        assertThat(statement.startingBalance()).isEqualTo(123L)
        assertThat(statement.statementEndDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statement.statementStartDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(statement.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
