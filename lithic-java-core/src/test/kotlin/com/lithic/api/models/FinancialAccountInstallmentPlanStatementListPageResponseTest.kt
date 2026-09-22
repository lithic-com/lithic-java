// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountInstallmentPlanStatementListPageResponseTest {

    @Test
    fun create() {
        val financialAccountInstallmentPlanStatementListPageResponse =
            FinancialAccountInstallmentPlanStatementListPageResponse.builder()
                .addData(
                    InstallmentPlanStatement.builder()
                        .token("token")
                        .feeAmount(0L)
                        .installmentPlanToken("installment_plan_token")
                        .installmentPlanTotal(0L)
                        .addInstallment(
                            InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                                .amountDue(0L)
                                .amountDueDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
                                )
                                .amountOutstanding(0L)
                                .amountOutstandingDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
                                )
                                .amountPaid(0L)
                                .amountPaidDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
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
                )
                .hasMore(true)
                .build()

        assertThat(financialAccountInstallmentPlanStatementListPageResponse.data())
            .containsExactly(
                InstallmentPlanStatement.builder()
                    .token("token")
                    .feeAmount(0L)
                    .installmentPlanToken("installment_plan_token")
                    .installmentPlanTotal(0L)
                    .addInstallment(
                        InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                            .amountDue(0L)
                            .amountDueDetails(
                                CategoryBalances.builder()
                                    .fees(0L)
                                    .interest(0L)
                                    .principal(0L)
                                    .build()
                            )
                            .amountOutstanding(0L)
                            .amountOutstandingDetails(
                                CategoryBalances.builder()
                                    .fees(0L)
                                    .interest(0L)
                                    .principal(0L)
                                    .build()
                            )
                            .amountPaid(0L)
                            .amountPaidDetails(
                                CategoryBalances.builder()
                                    .fees(0L)
                                    .interest(0L)
                                    .principal(0L)
                                    .build()
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
            )
        assertThat(financialAccountInstallmentPlanStatementListPageResponse.hasMore())
            .isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountInstallmentPlanStatementListPageResponse =
            FinancialAccountInstallmentPlanStatementListPageResponse.builder()
                .addData(
                    InstallmentPlanStatement.builder()
                        .token("token")
                        .feeAmount(0L)
                        .installmentPlanToken("installment_plan_token")
                        .installmentPlanTotal(0L)
                        .addInstallment(
                            InstallmentPlanStatement.InstallmentPlanStatementInstallment.builder()
                                .amountDue(0L)
                                .amountDueDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
                                )
                                .amountOutstanding(0L)
                                .amountOutstandingDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
                                )
                                .amountPaid(0L)
                                .amountPaidDetails(
                                    CategoryBalances.builder()
                                        .fees(0L)
                                        .interest(0L)
                                        .principal(0L)
                                        .build()
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
                )
                .hasMore(true)
                .build()

        val roundtrippedFinancialAccountInstallmentPlanStatementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    financialAccountInstallmentPlanStatementListPageResponse
                ),
                jacksonTypeRef<FinancialAccountInstallmentPlanStatementListPageResponse>(),
            )

        assertThat(roundtrippedFinancialAccountInstallmentPlanStatementListPageResponse)
            .isEqualTo(financialAccountInstallmentPlanStatementListPageResponse)
    }
}
