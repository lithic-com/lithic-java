// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentSimulateActionResponse =
            PaymentSimulateActionResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateActionResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPaymentSimulateActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentSimulateActionResponse),
                jacksonTypeRef<PaymentSimulateActionResponse>(),
            )

        assertThat(roundtrippedPaymentSimulateActionResponse)
            .isEqualTo(paymentSimulateActionResponse)
    }
}
