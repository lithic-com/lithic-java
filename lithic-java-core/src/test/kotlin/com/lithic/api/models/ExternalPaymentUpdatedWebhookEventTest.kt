// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentUpdatedWebhookEventTest {

    @Test
    fun create() {
        val externalPaymentUpdatedWebhookEvent =
            ExternalPaymentUpdatedWebhookEvent.builder()
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
                .eventType(ExternalPaymentUpdatedWebhookEvent.EventType.EXTERNAL_PAYMENT_UPDATED)
                .build()

        assertThat(externalPaymentUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPaymentUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPaymentUpdatedWebhookEvent.status())
            .isEqualTo(ExternalPayment.TransactionStatus.PENDING)
        assertThat(externalPaymentUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPaymentUpdatedWebhookEvent.category())
            .contains(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(externalPaymentUpdatedWebhookEvent.currency()).contains("currency")
        assertThat(externalPaymentUpdatedWebhookEvent.events().getOrNull())
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
        assertThat(externalPaymentUpdatedWebhookEvent.family())
            .contains(ExternalPayment.Family.EXTERNAL_PAYMENT)
        assertThat(externalPaymentUpdatedWebhookEvent.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPaymentUpdatedWebhookEvent.paymentType())
            .contains(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
        assertThat(externalPaymentUpdatedWebhookEvent.pendingAmount()).contains(0L)
        assertThat(externalPaymentUpdatedWebhookEvent.result())
            .contains(ExternalPayment.TransactionResult.APPROVED)
        assertThat(externalPaymentUpdatedWebhookEvent.settledAmount()).contains(0L)
        assertThat(externalPaymentUpdatedWebhookEvent.userDefinedId()).contains("user_defined_id")
        assertThat(externalPaymentUpdatedWebhookEvent.eventType())
            .isEqualTo(ExternalPaymentUpdatedWebhookEvent.EventType.EXTERNAL_PAYMENT_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalPaymentUpdatedWebhookEvent =
            ExternalPaymentUpdatedWebhookEvent.builder()
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
                .eventType(ExternalPaymentUpdatedWebhookEvent.EventType.EXTERNAL_PAYMENT_UPDATED)
                .build()

        val roundtrippedExternalPaymentUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalPaymentUpdatedWebhookEvent),
                jacksonTypeRef<ExternalPaymentUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedExternalPaymentUpdatedWebhookEvent)
            .isEqualTo(externalPaymentUpdatedWebhookEvent)
    }
}
