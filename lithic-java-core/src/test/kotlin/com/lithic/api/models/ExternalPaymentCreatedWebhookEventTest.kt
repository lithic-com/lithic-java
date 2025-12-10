// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentCreatedWebhookEventTest {

    @Test
    fun create() {
        val externalPaymentCreatedWebhookEvent =
            ExternalPaymentCreatedWebhookEvent.builder()
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
                .eventType(ExternalPaymentCreatedWebhookEvent.EventType.EXTERNAL_PAYMENT_CREATED)
                .build()

        assertThat(externalPaymentCreatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPaymentCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPaymentCreatedWebhookEvent.status())
            .isEqualTo(ExternalPayment.TransactionStatus.PENDING)
        assertThat(externalPaymentCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalPaymentCreatedWebhookEvent.category())
            .contains(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(externalPaymentCreatedWebhookEvent.currency()).contains("currency")
        assertThat(externalPaymentCreatedWebhookEvent.events().getOrNull())
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
        assertThat(externalPaymentCreatedWebhookEvent.family())
            .contains(ExternalPayment.Family.EXTERNAL_PAYMENT)
        assertThat(externalPaymentCreatedWebhookEvent.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalPaymentCreatedWebhookEvent.paymentType())
            .contains(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
        assertThat(externalPaymentCreatedWebhookEvent.pendingAmount()).contains(0L)
        assertThat(externalPaymentCreatedWebhookEvent.result())
            .contains(ExternalPayment.TransactionResult.APPROVED)
        assertThat(externalPaymentCreatedWebhookEvent.settledAmount()).contains(0L)
        assertThat(externalPaymentCreatedWebhookEvent.userDefinedId()).contains("user_defined_id")
        assertThat(externalPaymentCreatedWebhookEvent.eventType())
            .isEqualTo(ExternalPaymentCreatedWebhookEvent.EventType.EXTERNAL_PAYMENT_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalPaymentCreatedWebhookEvent =
            ExternalPaymentCreatedWebhookEvent.builder()
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
                .eventType(ExternalPaymentCreatedWebhookEvent.EventType.EXTERNAL_PAYMENT_CREATED)
                .build()

        val roundtrippedExternalPaymentCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalPaymentCreatedWebhookEvent),
                jacksonTypeRef<ExternalPaymentCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedExternalPaymentCreatedWebhookEvent)
            .isEqualTo(externalPaymentCreatedWebhookEvent)
    }
}
