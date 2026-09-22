// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountInstallmentPlanStatementListParamsTest {

    @Test
    fun create() {
        FinancialAccountInstallmentPlanStatementListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .installmentPlanToken("installment_plan_token")
            .begin(LocalDate.parse("2019-12-27"))
            .end(LocalDate.parse("2019-12-27"))
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .state(FinancialAccountInstallmentPlanStatementListParams.InstallmentPlanState.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountInstallmentPlanStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .installmentPlanToken("installment_plan_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("installment_plan_token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FinancialAccountInstallmentPlanStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .installmentPlanToken("installment_plan_token")
                .begin(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .state(
                    FinancialAccountInstallmentPlanStatementListParams.InstallmentPlanState.PENDING
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27")
                    .put("end", "2019-12-27")
                    .put("ending_before", "ending_before")
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .put("state", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountInstallmentPlanStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .installmentPlanToken("installment_plan_token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
