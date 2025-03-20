// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentSettleParamsTest {

    @Test
    fun create() {
        ExternalPaymentSettleParams.builder()
            .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .memo("memo")
            .progressTo(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalPaymentSettleParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalPaymentSettleParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .memo("memo")
                .progressTo(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
                .build()

        val body = params._body()

        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.memo()).contains("memo")
        assertThat(body.progressTo())
            .contains(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalPaymentSettleParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }
}
