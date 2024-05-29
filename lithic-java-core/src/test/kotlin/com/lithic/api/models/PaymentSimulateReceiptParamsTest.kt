// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateReceiptParamsTest {

    @Test
    fun createPaymentSimulateReceiptParams() {
        PaymentSimulateReceiptParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(123L)
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
            .memo("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentSimulateReceiptParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                .memo("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receiptType())
            .isEqualTo(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
        assertThat(body.memo()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentSimulateReceiptParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receiptType())
            .isEqualTo(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
    }
}
