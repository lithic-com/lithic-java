// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountInstallmentPlanRetrieveParamsTest {

    @Test
    fun create() {
        FinancialAccountInstallmentPlanRetrieveParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .installmentPlanToken("installment_plan_token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountInstallmentPlanRetrieveParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .installmentPlanToken("installment_plan_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("installment_plan_token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
