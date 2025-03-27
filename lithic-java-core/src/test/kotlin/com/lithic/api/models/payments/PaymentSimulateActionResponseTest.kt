// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentSimulateActionResponseTest {

    @Test
    fun create() {
        val paymentSimulateActionResponse =
            PaymentSimulateActionResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateActionResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(paymentSimulateActionResponse.debuggingRequestId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentSimulateActionResponse.result())
            .isEqualTo(PaymentSimulateActionResponse.Result.APPROVED)
        assertThat(paymentSimulateActionResponse.transactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
