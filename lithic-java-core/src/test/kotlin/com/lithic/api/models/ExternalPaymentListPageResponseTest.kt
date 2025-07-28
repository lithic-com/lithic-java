// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentListPageResponseTest {

    @Test
    fun create() {
        val externalPaymentListPageResponse =
            ExternalPaymentListPageResponse.builder()
                .addData(
                    ExternalPayment.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .family(ExternalPayment.TransactionFamilyTypes.CARD)
                        .status(ExternalPayment.TransactionStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                        .currency("currency")
                        .addEvent(
                            ExternalPayment.ExternalPaymentEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    ExternalPayment.ExternalPaymentEvent.DetailedResults.APPROVED
                                )
                                .effectiveDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .result(
                                    ExternalPayment.ExternalPaymentEvent.TransactionResult.APPROVED
                                )
                                .type(
                                    ExternalPayment.ExternalPaymentEvent.ExternalPaymentEventType
                                        .EXTERNAL_WIRE_INITIATED
                                )
                                .build()
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                        .pendingAmount(0L)
                        .result(ExternalPayment.TransactionResult.APPROVED)
                        .settledAmount(0L)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(externalPaymentListPageResponse.data())
            .containsExactly(
                ExternalPayment.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .family(ExternalPayment.TransactionFamilyTypes.CARD)
                    .status(ExternalPayment.TransactionStatus.PENDING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                    .currency("currency")
                    .addEvent(
                        ExternalPayment.ExternalPaymentEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                ExternalPayment.ExternalPaymentEvent.DetailedResults.APPROVED
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .memo("memo")
                            .result(ExternalPayment.ExternalPaymentEvent.TransactionResult.APPROVED)
                            .type(
                                ExternalPayment.ExternalPaymentEvent.ExternalPaymentEventType
                                    .EXTERNAL_WIRE_INITIATED
                            )
                            .build()
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                    .pendingAmount(0L)
                    .result(ExternalPayment.TransactionResult.APPROVED)
                    .settledAmount(0L)
                    .userDefinedId("user_defined_id")
                    .build()
            )
        assertThat(externalPaymentListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalPaymentListPageResponse =
            ExternalPaymentListPageResponse.builder()
                .addData(
                    ExternalPayment.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .family(ExternalPayment.TransactionFamilyTypes.CARD)
                        .status(ExternalPayment.TransactionStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                        .currency("currency")
                        .addEvent(
                            ExternalPayment.ExternalPaymentEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    ExternalPayment.ExternalPaymentEvent.DetailedResults.APPROVED
                                )
                                .effectiveDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .result(
                                    ExternalPayment.ExternalPaymentEvent.TransactionResult.APPROVED
                                )
                                .type(
                                    ExternalPayment.ExternalPaymentEvent.ExternalPaymentEventType
                                        .EXTERNAL_WIRE_INITIATED
                                )
                                .build()
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                        .pendingAmount(0L)
                        .result(ExternalPayment.TransactionResult.APPROVED)
                        .settledAmount(0L)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedExternalPaymentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalPaymentListPageResponse),
                jacksonTypeRef<ExternalPaymentListPageResponse>(),
            )

        assertThat(roundtrippedExternalPaymentListPageResponse)
            .isEqualTo(externalPaymentListPageResponse)
    }
}
