// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalPaymentTest {

    @Test
    fun createExternalPayment() {
        val externalPayment =
            ExternalPayment.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .status(ExternalPayment.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .build()
        assertThat(externalPayment).isNotNull
        assertThat(externalPayment.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPayment.category())
            .isEqualTo(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(externalPayment.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPayment.currency()).isEqualTo("currency")
        assertThat(externalPayment.events())
            .containsExactly(
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
        assertThat(externalPayment.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPayment.paymentType())
            .isEqualTo(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
        assertThat(externalPayment.pendingAmount()).isEqualTo(0L)
        assertThat(externalPayment.result()).isEqualTo(ExternalPayment.TransactionResult.APPROVED)
        assertThat(externalPayment.settledAmount()).isEqualTo(0L)
        assertThat(externalPayment.status()).isEqualTo(ExternalPayment.TransactionStatus.PENDING)
        assertThat(externalPayment.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPayment.userDefinedId()).contains("user_defined_id")
    }
}
