// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateReturnParamsTest {

    @Test
    fun create() {
        PaymentSimulateReturnParams.builder()
            .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnReasonCode("R12")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentSimulateReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnReasonCode("R12")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnReasonCode()).contains("R12")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentSimulateReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
