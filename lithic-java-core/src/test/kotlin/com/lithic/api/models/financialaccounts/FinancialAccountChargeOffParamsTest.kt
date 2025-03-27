// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.financialaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountChargeOffParamsTest {

    @Test
    fun create() {
        FinancialAccountChargeOffParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountChargeOffParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FinancialAccountChargeOffParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                .build()

        val body = params._body()

        assertThat(body.reason())
            .isEqualTo(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
    }
}
