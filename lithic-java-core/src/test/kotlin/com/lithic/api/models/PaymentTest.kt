// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentTest {

    @Test
    fun create() {
        val payment =
            Payment.builder()
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
                        .addenda("addenda")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(payment.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.category()).isEqualTo(Payment.Category.ACH)
        assertThat(payment.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payment.currency()).isEqualTo("currency")
        assertThat(payment.descriptor()).isEqualTo("descriptor")
        assertThat(payment.direction()).isEqualTo(Payment.Direction.CREDIT)
        assertThat(payment.events())
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
        assertThat(payment.externalBankAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.method()).isEqualTo(Payment.Method.ACH_NEXT_DAY)
        assertThat(payment.methodAttributes())
            .isEqualTo(
                Payment.PaymentMethodAttributes.builder()
                    .companyId("company_id")
                    .receiptRoutingNumber("receipt_routing_number")
                    .retries(0L)
                    .returnReasonCode("return_reason_code")
                    .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                    .addTraceNumber("string")
                    .addenda("addenda")
                    .build()
            )
        assertThat(payment.pendingAmount()).isEqualTo(0L)
        assertThat(payment.result()).isEqualTo(Payment.Result.APPROVED)
        assertThat(payment.settledAmount()).isEqualTo(0L)
        assertThat(payment.source()).isEqualTo(Payment.Source.CUSTOMER)
        assertThat(payment.status()).isEqualTo(Payment.Status.DECLINED)
        assertThat(payment.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payment.userDefinedId()).contains("user_defined_id")
        assertThat(payment.expectedReleaseDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payment =
            Payment.builder()
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
                        .addenda("addenda")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                .build()

        val roundtrippedPayment =
            jsonMapper.readValue(jsonMapper.writeValueAsString(payment), jacksonTypeRef<Payment>())

        assertThat(roundtrippedPayment).isEqualTo(payment)
    }
}
