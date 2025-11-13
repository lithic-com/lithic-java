// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentReturnParamsTest {

    @Test
    fun create() {
        PaymentReturnParams.builder()
            .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnReasonCode("R01")
            .addenda("addenda")
            .dateOfDeath(LocalDate.parse("2025-01-15"))
            .memo("memo")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnReasonCode("R01")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnReasonCode("R01")
                .addenda("addenda")
                .dateOfDeath(LocalDate.parse("2025-01-15"))
                .memo("memo")
                .build()

        val body = params._body()

        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnReasonCode()).isEqualTo("R01")
        assertThat(body.addenda()).contains("addenda")
        assertThat(body.dateOfDeath()).contains(LocalDate.parse("2025-01-15"))
        assertThat(body.memo()).contains("memo")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnReasonCode("R01")
                .build()

        val body = params._body()

        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnReasonCode()).isEqualTo("R01")
    }
}
