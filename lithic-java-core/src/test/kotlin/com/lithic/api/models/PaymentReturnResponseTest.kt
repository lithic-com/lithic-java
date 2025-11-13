// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentReturnResponseTest {

    @Test
    fun create() {
        val paymentReturnResponse =
            PaymentReturnResponse.builder()
                .result(PaymentReturnResponse.TransactionResult.APPROVED)
                .transactionGroupUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(paymentReturnResponse.result())
            .isEqualTo(PaymentReturnResponse.TransactionResult.APPROVED)
        assertThat(paymentReturnResponse.transactionGroupUuid())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentReturnResponse.transactionUuid())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentReturnResponse =
            PaymentReturnResponse.builder()
                .result(PaymentReturnResponse.TransactionResult.APPROVED)
                .transactionGroupUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPaymentReturnResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentReturnResponse),
                jacksonTypeRef<PaymentReturnResponse>(),
            )

        assertThat(roundtrippedPaymentReturnResponse).isEqualTo(paymentReturnResponse)
    }
}
