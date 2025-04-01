// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetryResponseTest {

    @Test
    fun create() {
        val paymentRetryResponse =
            PaymentRetryResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Payment.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .direction(Payment.Direction.CREDIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.PaymentMethodAttributes.builder()
                        .companyId("company_id")
                        .receiptRoutingNumber("receipt_routing_number")
                        .retries(0L)
                        .returnReasonCode("return_reason_code")
                        .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .balance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(paymentRetryResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentRetryResponse.category()).isEqualTo(Payment.Category.ACH)
        assertThat(paymentRetryResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentRetryResponse.currency()).isEqualTo("currency")
        assertThat(paymentRetryResponse.descriptor()).isEqualTo("descriptor")
        assertThat(paymentRetryResponse.direction()).isEqualTo(Payment.Direction.CREDIT)
        assertThat(paymentRetryResponse.events())
            .containsExactly(
                Payment.PaymentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Payment.PaymentEvent.Result.APPROVED)
                    .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                    .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                    .build()
            )
        assertThat(paymentRetryResponse.externalBankAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentRetryResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentRetryResponse.method()).isEqualTo(Payment.Method.ACH_NEXT_DAY)
        assertThat(paymentRetryResponse.methodAttributes())
            .isEqualTo(
                Payment.PaymentMethodAttributes.builder()
                    .companyId("company_id")
                    .receiptRoutingNumber("receipt_routing_number")
                    .retries(0L)
                    .returnReasonCode("return_reason_code")
                    .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                    .addTraceNumber("string")
                    .build()
            )
        assertThat(paymentRetryResponse.pendingAmount()).isEqualTo(0L)
        assertThat(paymentRetryResponse.result()).isEqualTo(Payment.Result.APPROVED)
        assertThat(paymentRetryResponse.settledAmount()).isEqualTo(0L)
        assertThat(paymentRetryResponse.source()).isEqualTo(Payment.Source.CUSTOMER)
        assertThat(paymentRetryResponse.status()).isEqualTo(Payment.Status.DECLINED)
        assertThat(paymentRetryResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentRetryResponse.userDefinedId()).contains("user_defined_id")
        assertThat(paymentRetryResponse.balance())
            .contains(
                Balance.builder()
                    .availableAmount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .financialAccountType(Balance.FinancialAccountType.ISSUING)
                    .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .totalAmount(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentRetryResponse =
            PaymentRetryResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Payment.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .direction(Payment.Direction.CREDIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.PaymentMethodAttributes.builder()
                        .companyId("company_id")
                        .receiptRoutingNumber("receipt_routing_number")
                        .retries(0L)
                        .returnReasonCode("return_reason_code")
                        .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .balance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPaymentRetryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentRetryResponse),
                jacksonTypeRef<PaymentRetryResponse>(),
            )

        assertThat(roundtrippedPaymentRetryResponse).isEqualTo(paymentRetryResponse)
    }
}
