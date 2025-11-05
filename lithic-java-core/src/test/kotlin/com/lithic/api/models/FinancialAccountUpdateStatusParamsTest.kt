// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountUpdateStatusParamsTest {

    @Test
    fun create() {
        FinancialAccountUpdateStatusParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.CLOSED)
            .substatus(
                FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus.END_USER_REQUEST
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountUpdateStatusParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.CLOSED)
                .substatus(
                    FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus
                        .END_USER_REQUEST
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FinancialAccountUpdateStatusParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.CLOSED)
                .substatus(
                    FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus
                        .END_USER_REQUEST
                )
                .build()

        val body = params._body()

        assertThat(body.status())
            .isEqualTo(FinancialAccountUpdateStatusParams.FinancialAccountStatus.CLOSED)
        assertThat(body.substatus())
            .contains(
                FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus.END_USER_REQUEST
            )
    }
}
