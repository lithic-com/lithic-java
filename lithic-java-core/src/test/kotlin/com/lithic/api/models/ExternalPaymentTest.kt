// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentTest {

    @Test
    fun create() {
        val externalPayment =
            ExternalPayment.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .family(ExternalPayment.Family.EXTERNAL_PAYMENT)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                .pendingAmount(0L)
                .result(ExternalPayment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .userDefinedId("user_defined_id")
                .build()

        assertThat(externalPayment.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPayment.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPayment.status()).isEqualTo(ExternalPayment.TransactionStatus.PENDING)
        assertThat(externalPayment.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPayment.category())
            .contains(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(externalPayment.currency()).contains("currency")
        assertThat(externalPayment.events().getOrNull())
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
        assertThat(externalPayment.family()).contains(ExternalPayment.Family.EXTERNAL_PAYMENT)
        assertThat(externalPayment.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPayment.paymentType())
            .contains(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
        assertThat(externalPayment.pendingAmount()).contains(0L)
        assertThat(externalPayment.result()).contains(ExternalPayment.TransactionResult.APPROVED)
        assertThat(externalPayment.settledAmount()).contains(0L)
        assertThat(externalPayment.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalPayment =
            ExternalPayment.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .family(ExternalPayment.Family.EXTERNAL_PAYMENT)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                .pendingAmount(0L)
                .result(ExternalPayment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .userDefinedId("user_defined_id")
                .build()

        val roundtrippedExternalPayment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalPayment),
                jacksonTypeRef<ExternalPayment>(),
            )

        assertThat(roundtrippedExternalPayment).isEqualTo(externalPayment)
    }
}
