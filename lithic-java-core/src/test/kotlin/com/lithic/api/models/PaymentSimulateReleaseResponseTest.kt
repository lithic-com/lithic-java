package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateReleaseResponseTest {

    @Test
    fun createPaymentSimulateReleaseResponse() {
        val paymentSimulateReleaseResponse =
            PaymentSimulateReleaseResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateReleaseResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(paymentSimulateReleaseResponse).isNotNull
        assertThat(paymentSimulateReleaseResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentSimulateReleaseResponse.result())
            .contains(PaymentSimulateReleaseResponse.Result.APPROVED)
        assertThat(paymentSimulateReleaseResponse.transactionEventToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
