// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentSimulateReceiptParamsTest {

    @Test
    fun create() {
        PaymentSimulateReceiptParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(0L)
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
            .memo("memo")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentSimulateReceiptParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                .memo("memo")
                .build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receiptType())
            .isEqualTo(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
        assertThat(body.memo()).contains("memo")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentSimulateReceiptParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                .build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receiptType())
            .isEqualTo(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
    }
}
