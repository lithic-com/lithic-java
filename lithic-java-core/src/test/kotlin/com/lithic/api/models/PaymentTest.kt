// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentTest {

    @Test
    fun create() {
        val payment =
            Payment.builder()
                .token("cb35759d-8c18-4b7f-bb91-7c37936662c2")
                .category(Payment.TransactionCategory.ACH)
                .created(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
                .descriptor("ach_origination_debit")
                .direction(Payment.Direction.DEBIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("38dc6bc5-d18f-594e-9ab9-ef1cfdcfbf82")
                        .amount(1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_INITIATED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("e466f34a-d648-5a8f-8bc7-1d4d1e703db3")
                        .amount(1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_REVIEWED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .family(Payment.Family.PAYMENT)
                .financialAccountToken("f012262b-d18f-5c26-ad63-a09a11e633a6")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.MethodAttributes.AchMethodAttributes.builder()
                        .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                        .addenda(null)
                        .companyId("1111111111")
                        .receiptRoutingNumber(null)
                        .retries(0L)
                        .returnReasonCode(null)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(1588L)
                .relatedAccountTokens(
                    Payment.RelatedAccountTokens.builder()
                        .accountToken("d11bca22-39e2-475c-bbb3-6ba21e38b0d3")
                        .businessAccountToken(null)
                        .build()
                )
                .result(Payment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.LITHIC)
                .status(Payment.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
                .currency("USD")
                .expectedReleaseDate(null)
                .externalBankAccountToken("feb4fee1-2414-4c38-a5f6-9deac293c8f4")
                .type(Payment.TransferType.ORIGINATION_DEBIT)
                .userDefinedId(null)
                .build()

        assertThat(payment.token()).isEqualTo("cb35759d-8c18-4b7f-bb91-7c37936662c2")
        assertThat(payment.category()).isEqualTo(Payment.TransactionCategory.ACH)
        assertThat(payment.created()).isEqualTo(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
        assertThat(payment.descriptor()).isEqualTo("ach_origination_debit")
        assertThat(payment.direction()).isEqualTo(Payment.Direction.DEBIT)
        assertThat(payment.events())
            .containsExactly(
                Payment.PaymentEvent.builder()
                    .token("38dc6bc5-d18f-594e-9ab9-ef1cfdcfbf82")
                    .amount(1588L)
                    .created(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
                    .result(Payment.PaymentEvent.Result.APPROVED)
                    .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_INITIATED)
                    .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                    .build(),
                Payment.PaymentEvent.builder()
                    .token("e466f34a-d648-5a8f-8bc7-1d4d1e703db3")
                    .amount(1588L)
                    .created(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
                    .result(Payment.PaymentEvent.Result.APPROVED)
                    .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_REVIEWED)
                    .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                    .build(),
            )
        assertThat(payment.family()).isEqualTo(Payment.Family.PAYMENT)
        assertThat(payment.financialAccountToken())
            .isEqualTo("f012262b-d18f-5c26-ad63-a09a11e633a6")
        assertThat(payment.method()).isEqualTo(Payment.Method.ACH_NEXT_DAY)
        assertThat(payment.methodAttributes())
            .isEqualTo(
                Payment.MethodAttributes.ofAch(
                    Payment.MethodAttributes.AchMethodAttributes.builder()
                        .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                        .addenda(null)
                        .companyId("1111111111")
                        .receiptRoutingNumber(null)
                        .retries(0L)
                        .returnReasonCode(null)
                        .addTraceNumber("string")
                        .build()
                )
            )
        assertThat(payment.pendingAmount()).isEqualTo(1588L)
        assertThat(payment.relatedAccountTokens())
            .isEqualTo(
                Payment.RelatedAccountTokens.builder()
                    .accountToken("d11bca22-39e2-475c-bbb3-6ba21e38b0d3")
                    .businessAccountToken(null)
                    .build()
            )
        assertThat(payment.result()).isEqualTo(Payment.TransactionResult.APPROVED)
        assertThat(payment.settledAmount()).isEqualTo(0L)
        assertThat(payment.source()).isEqualTo(Payment.Source.LITHIC)
        assertThat(payment.status()).isEqualTo(Payment.TransactionStatus.PENDING)
        assertThat(payment.updated()).isEqualTo(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
        assertThat(payment.currency()).contains("USD")
        assertThat(payment.expectedReleaseDate()).isEmpty
        assertThat(payment.externalBankAccountToken())
            .contains("feb4fee1-2414-4c38-a5f6-9deac293c8f4")
        assertThat(payment.type()).contains(Payment.TransferType.ORIGINATION_DEBIT)
        assertThat(payment.userDefinedId()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payment =
            Payment.builder()
                .token("cb35759d-8c18-4b7f-bb91-7c37936662c2")
                .category(Payment.TransactionCategory.ACH)
                .created(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
                .descriptor("ach_origination_debit")
                .direction(Payment.Direction.DEBIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("38dc6bc5-d18f-594e-9ab9-ef1cfdcfbf82")
                        .amount(1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:15Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_INITIATED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("e466f34a-d648-5a8f-8bc7-1d4d1e703db3")
                        .amount(1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_REVIEWED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .family(Payment.Family.PAYMENT)
                .financialAccountToken("f012262b-d18f-5c26-ad63-a09a11e633a6")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.MethodAttributes.AchMethodAttributes.builder()
                        .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                        .addenda(null)
                        .companyId("1111111111")
                        .receiptRoutingNumber(null)
                        .retries(0L)
                        .returnReasonCode(null)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(1588L)
                .relatedAccountTokens(
                    Payment.RelatedAccountTokens.builder()
                        .accountToken("d11bca22-39e2-475c-bbb3-6ba21e38b0d3")
                        .businessAccountToken(null)
                        .build()
                )
                .result(Payment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.LITHIC)
                .status(Payment.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2025-10-27T20:12:18Z"))
                .currency("USD")
                .expectedReleaseDate(null)
                .externalBankAccountToken("feb4fee1-2414-4c38-a5f6-9deac293c8f4")
                .type(Payment.TransferType.ORIGINATION_DEBIT)
                .userDefinedId(null)
                .build()

        val roundtrippedPayment =
            jsonMapper.readValue(jsonMapper.writeValueAsString(payment), jacksonTypeRef<Payment>())

        assertThat(roundtrippedPayment).isEqualTo(payment)
    }
}
