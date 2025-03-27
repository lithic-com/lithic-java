// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentSimulateReleaseResponseTest {

    @Test
    fun create() {
        val paymentSimulateReleaseResponse =
            PaymentSimulateReleaseResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateReleaseResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(paymentSimulateReleaseResponse.debuggingRequestId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentSimulateReleaseResponse.result())
            .isEqualTo(PaymentSimulateReleaseResponse.Result.APPROVED)
        assertThat(paymentSimulateReleaseResponse.transactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
