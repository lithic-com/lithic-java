// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentTest {

    @Test
    fun createPayment() {
        val payment =
            Payment.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Payment.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .descriptor("string")
                .direction(Payment.Direction.CREDIT)
                .events(
                    listOf(
                        Payment.PaymentEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(Payment.PaymentEvent.Result.APPROVED)
                            .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                            .detailedResults(listOf(Payment.PaymentEvent.DetailedResult.APPROVED))
                            .build()
                    )
                )
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.PaymentMethodAttributes.builder()
                        .companyId("string")
                        .receiptRoutingNumber("string")
                        .retries(123L)
                        .returnReasonCode("string")
                        .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                        .build()
                )
                .pendingAmount(123L)
                .result(Payment.Result.APPROVED)
                .settledAmount(123L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("string")
                .build()
        assertThat(payment).isNotNull
        assertThat(payment.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.category()).isEqualTo(Payment.Category.ACH)
        assertThat(payment.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payment.currency()).isEqualTo("string")
        assertThat(payment.descriptor()).isEqualTo("string")
        assertThat(payment.direction()).isEqualTo(Payment.Direction.CREDIT)
        assertThat(payment.events())
            .containsExactly(
                Payment.PaymentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Payment.PaymentEvent.Result.APPROVED)
                    .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                    .detailedResults(listOf(Payment.PaymentEvent.DetailedResult.APPROVED))
                    .build()
            )
        assertThat(payment.externalBankAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.method()).isEqualTo(Payment.Method.ACH_NEXT_DAY)
        assertThat(payment.methodAttributes())
            .isEqualTo(
                Payment.PaymentMethodAttributes.builder()
                    .companyId("string")
                    .receiptRoutingNumber("string")
                    .retries(123L)
                    .returnReasonCode("string")
                    .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                    .build()
            )
        assertThat(payment.pendingAmount()).isEqualTo(123L)
        assertThat(payment.result()).isEqualTo(Payment.Result.APPROVED)
        assertThat(payment.settledAmount()).isEqualTo(123L)
        assertThat(payment.source()).isEqualTo(Payment.Source.CUSTOMER)
        assertThat(payment.status()).isEqualTo(Payment.Status.DECLINED)
        assertThat(payment.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payment.userDefinedId()).contains("string")
    }
}
