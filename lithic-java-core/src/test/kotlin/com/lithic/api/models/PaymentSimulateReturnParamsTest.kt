// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateReturnParamsTest {

    @Test
    fun createPaymentSimulateReturnParams() {
        PaymentSimulateReturnParams.builder()
            .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnReasonCode("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentSimulateReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnReasonCode("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.paymentToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnReasonCode()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentSimulateReturnParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.paymentToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
