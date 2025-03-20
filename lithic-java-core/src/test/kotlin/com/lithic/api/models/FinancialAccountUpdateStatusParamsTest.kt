// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountUpdateStatusParamsTest {

    @Test
    fun create() {
        FinancialAccountUpdateStatusParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
            .statusChangeReason(
                FinancialAccountUpdateStatusParams.UpdateFinancialAccountStatusChangeReason
                    .CHARGED_OFF_FRAUD
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountUpdateStatusParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
                .statusChangeReason(
                    FinancialAccountUpdateStatusParams.UpdateFinancialAccountStatusChangeReason
                        .CHARGED_OFF_FRAUD
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
                .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
                .statusChangeReason(
                    FinancialAccountUpdateStatusParams.UpdateFinancialAccountStatusChangeReason
                        .CHARGED_OFF_FRAUD
                )
                .build()

        val body = params._body()

        assertThat(body.status())
            .isEqualTo(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
        assertThat(body.statusChangeReason())
            .contains(
                FinancialAccountUpdateStatusParams.UpdateFinancialAccountStatusChangeReason
                    .CHARGED_OFF_FRAUD
            )
    }
}
