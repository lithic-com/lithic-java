// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstallmentPlanStatementTest {

    @Test
    fun create() {
        val installmentPlanStatement =
            InstallmentPlanStatement.builder()
                .token("token")
                .feeAmount(0L)
                .installmentPlanToken("installment_plan_token")
                .installmentPlanTotal(0L)
                .addInstallment(
                    InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                        .amountDue(0L)
                        .amountDueDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .amountOutstanding(0L)
                        .amountOutstandingDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .amountPaid(0L)
                        .amountPaidDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .dateAssessed(LocalDate.parse("2019-12-27"))
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .installmentNum(0L)
                        .paymentDueDate(LocalDate.parse("2019-12-27"))
                        .addPayment(
                            InstallmentPlanStatement.InstallmentPlanStatementInstallment
                                .InstallmentPlanStatementPayment
                                .builder()
                                .amount(0L)
                                .date(LocalDate.parse("2019-12-27"))
                                .build()
                        )
                        .build()
                )
                .installmentsOutstanding(0L)
                .installmentsPaid(0L)
                .numInstallments(0L)
                .principalAmount(0L)
                .sourceType(InstallmentPlanStatement.InstallmentPlanSource.UNPAID_BALANCE)
                .startDate(LocalDate.parse("2019-12-27"))
                .state(InstallmentPlanStatement.InstallmentPlanState.PENDING)
                .totalPaid(0L)
                .build()

        assertThat(installmentPlanStatement.token()).isEqualTo("token")
        assertThat(installmentPlanStatement.feeAmount()).isEqualTo(0L)
        assertThat(installmentPlanStatement.installmentPlanToken())
            .isEqualTo("installment_plan_token")
        assertThat(installmentPlanStatement.installmentPlanTotal()).isEqualTo(0L)
        assertThat(installmentPlanStatement.installments())
            .containsExactly(
                InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                    .amountDue(0L)
                    .amountDueDetails(
                        CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                    )
                    .amountOutstanding(0L)
                    .amountOutstandingDetails(
                        CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                    )
                    .amountPaid(0L)
                    .amountPaidDetails(
                        CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                    )
                    .dateAssessed(LocalDate.parse("2019-12-27"))
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .installmentNum(0L)
                    .paymentDueDate(LocalDate.parse("2019-12-27"))
                    .addPayment(
                        InstallmentPlanStatement.InstallmentPlanStatementInstallment
                            .InstallmentPlanStatementPayment
                            .builder()
                            .amount(0L)
                            .date(LocalDate.parse("2019-12-27"))
                            .build()
                    )
                    .build()
            )
        assertThat(installmentPlanStatement.installmentsOutstanding()).isEqualTo(0L)
        assertThat(installmentPlanStatement.installmentsPaid()).isEqualTo(0L)
        assertThat(installmentPlanStatement.numInstallments()).isEqualTo(0L)
        assertThat(installmentPlanStatement.principalAmount()).isEqualTo(0L)
        assertThat(installmentPlanStatement.sourceType())
            .isEqualTo(InstallmentPlanStatement.InstallmentPlanSource.UNPAID_BALANCE)
        assertThat(installmentPlanStatement.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(installmentPlanStatement.state())
            .isEqualTo(InstallmentPlanStatement.InstallmentPlanState.PENDING)
        assertThat(installmentPlanStatement.totalPaid()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val installmentPlanStatement =
            InstallmentPlanStatement.builder()
                .token("token")
                .feeAmount(0L)
                .installmentPlanToken("installment_plan_token")
                .installmentPlanTotal(0L)
                .addInstallment(
                    InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                        .amountDue(0L)
                        .amountDueDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .amountOutstanding(0L)
                        .amountOutstandingDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .amountPaid(0L)
                        .amountPaidDetails(
                            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                        )
                        .dateAssessed(LocalDate.parse("2019-12-27"))
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .installmentNum(0L)
                        .paymentDueDate(LocalDate.parse("2019-12-27"))
                        .addPayment(
                            InstallmentPlanStatement.InstallmentPlanStatementInstallment
                                .InstallmentPlanStatementPayment
                                .builder()
                                .amount(0L)
                                .date(LocalDate.parse("2019-12-27"))
                                .build()
                        )
                        .build()
                )
                .installmentsOutstanding(0L)
                .installmentsPaid(0L)
                .numInstallments(0L)
                .principalAmount(0L)
                .sourceType(InstallmentPlanStatement.InstallmentPlanSource.UNPAID_BALANCE)
                .startDate(LocalDate.parse("2019-12-27"))
                .state(InstallmentPlanStatement.InstallmentPlanState.PENDING)
                .totalPaid(0L)
                .build()

        val roundtrippedInstallmentPlanStatement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(installmentPlanStatement),
                jacksonTypeRef<InstallmentPlanStatement>(),
            )

        assertThat(roundtrippedInstallmentPlanStatement).isEqualTo(installmentPlanStatement)
    }
}
