package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateReturnResponseTest {

    @Test
    fun createPaymentSimulateReturnResponse() {
        val paymentSimulateReturnResponse =
            PaymentSimulateReturnResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateReturnResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(paymentSimulateReturnResponse).isNotNull
        assertThat(paymentSimulateReturnResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentSimulateReturnResponse.result())
            .contains(PaymentSimulateReturnResponse.Result.APPROVED)
        assertThat(paymentSimulateReturnResponse.transactionEventToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
