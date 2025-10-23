// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentListPageResponseTest {

    @Test
    fun create() {
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addData(
                    Payment.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(Payment.TransactionCategory.ACH)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .descriptor("descriptor")
                        .direction(Payment.Direction.CREDIT)
                        .addEvent(
                            Payment.PaymentEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(Payment.PaymentEvent.Result.APPROVED)
                                .type(Payment.PaymentEvent.Type.ACH_ORIGINATION_CANCELLED)
                                .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                                .build()
                        )
                        .family(Payment.Family.PAYMENT)
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .method(Payment.Method.ACH_NEXT_DAY)
                        .methodAttributes(
                            Payment.MethodAttributes.AchMethodAttributes.builder()
                                .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                                .addenda("addenda")
                                .companyId("company_id")
                                .receiptRoutingNumber("receipt_routing_number")
                                .retries(0L)
                                .returnReasonCode("return_reason_code")
                                .addTraceNumber("string")
                                .build()
                        )
                        .pendingAmount(200L)
                        .relatedAccountTokens(
                            Payment.RelatedAccountTokens.builder()
                                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .result(Payment.TransactionResult.APPROVED)
                        .settledAmount(500L)
                        .source(Payment.Source.LITHIC)
                        .status(Payment.TransactionStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("USD")
                        .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                        .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Payment.TransferType.ORIGINATION_CREDIT)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(paymentListPageResponse.data())
            .containsExactly(
                Payment.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(Payment.TransactionCategory.ACH)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .descriptor("descriptor")
                    .direction(Payment.Direction.CREDIT)
                    .addEvent(
                        Payment.PaymentEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(Payment.PaymentEvent.Result.APPROVED)
                            .type(Payment.PaymentEvent.Type.ACH_ORIGINATION_CANCELLED)
                            .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                            .build()
                    )
                    .family(Payment.Family.PAYMENT)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(Payment.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        Payment.MethodAttributes.AchMethodAttributes.builder()
                            .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                            .addenda("addenda")
                            .companyId("company_id")
                            .receiptRoutingNumber("receipt_routing_number")
                            .retries(0L)
                            .returnReasonCode("return_reason_code")
                            .addTraceNumber("string")
                            .build()
                    )
                    .pendingAmount(200L)
                    .relatedAccountTokens(
                        Payment.RelatedAccountTokens.builder()
                            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .result(Payment.TransactionResult.APPROVED)
                    .settledAmount(500L)
                    .source(Payment.Source.LITHIC)
                    .status(Payment.TransactionStatus.PENDING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("USD")
                    .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(Payment.TransferType.ORIGINATION_CREDIT)
                    .userDefinedId("user_defined_id")
                    .build()
            )
        assertThat(paymentListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addData(
                    Payment.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(Payment.TransactionCategory.ACH)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .descriptor("descriptor")
                        .direction(Payment.Direction.CREDIT)
                        .addEvent(
                            Payment.PaymentEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(Payment.PaymentEvent.Result.APPROVED)
                                .type(Payment.PaymentEvent.Type.ACH_ORIGINATION_CANCELLED)
                                .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                                .build()
                        )
                        .family(Payment.Family.PAYMENT)
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .method(Payment.Method.ACH_NEXT_DAY)
                        .methodAttributes(
                            Payment.MethodAttributes.AchMethodAttributes.builder()
                                .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                                .addenda("addenda")
                                .companyId("company_id")
                                .receiptRoutingNumber("receipt_routing_number")
                                .retries(0L)
                                .returnReasonCode("return_reason_code")
                                .addTraceNumber("string")
                                .build()
                        )
                        .pendingAmount(200L)
                        .relatedAccountTokens(
                            Payment.RelatedAccountTokens.builder()
                                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .result(Payment.TransactionResult.APPROVED)
                        .settledAmount(500L)
                        .source(Payment.Source.LITHIC)
                        .status(Payment.TransactionStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("USD")
                        .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                        .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Payment.TransferType.ORIGINATION_CREDIT)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedPaymentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentListPageResponse),
                jacksonTypeRef<PaymentListPageResponse>(),
            )

        assertThat(roundtrippedPaymentListPageResponse).isEqualTo(paymentListPageResponse)
    }
}
