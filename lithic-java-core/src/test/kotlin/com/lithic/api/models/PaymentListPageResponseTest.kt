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
                                .type(
                                    Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED
                                )
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
                )
                .hasMore(true)
                .build()

        assertThat(paymentListPageResponse.data())
            .containsExactly(
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
                                .type(
                                    Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED
                                )
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
