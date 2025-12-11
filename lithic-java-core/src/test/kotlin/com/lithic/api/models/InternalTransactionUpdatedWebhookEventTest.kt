// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalTransactionUpdatedWebhookEventTest {

    @Test
    fun create() {
        val internalTransactionUpdatedWebhookEvent =
            InternalTransactionUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(InternalTransaction.Category.INTERNAL)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .addEvent(
                    InternalTransaction.InternalAdjustmentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(
                            InternalTransaction.InternalAdjustmentEvent.TransactionResult.APPROVED
                        )
                        .type(InternalTransaction.InternalAdjustmentEvent.Type.INTERNAL_ADJUSTMENT)
                        .build()
                )
                .pendingAmount(0L)
                .result(InternalTransaction.TransactionResult.APPROVED)
                .settledAmount(0L)
                .status(InternalTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(
                    InternalTransactionUpdatedWebhookEvent.EventType.INTERNAL_TRANSACTION_UPDATED
                )
                .build()

        assertThat(internalTransactionUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalTransactionUpdatedWebhookEvent.category())
            .isEqualTo(InternalTransaction.Category.INTERNAL)
        assertThat(internalTransactionUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalTransactionUpdatedWebhookEvent.currency()).isEqualTo("currency")
        assertThat(internalTransactionUpdatedWebhookEvent.descriptor()).isEqualTo("descriptor")
        assertThat(internalTransactionUpdatedWebhookEvent.events())
            .containsExactly(
                InternalTransaction.InternalAdjustmentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(InternalTransaction.InternalAdjustmentEvent.TransactionResult.APPROVED)
                    .type(InternalTransaction.InternalAdjustmentEvent.Type.INTERNAL_ADJUSTMENT)
                    .build()
            )
        assertThat(internalTransactionUpdatedWebhookEvent.pendingAmount()).isEqualTo(0L)
        assertThat(internalTransactionUpdatedWebhookEvent.result())
            .isEqualTo(InternalTransaction.TransactionResult.APPROVED)
        assertThat(internalTransactionUpdatedWebhookEvent.settledAmount()).isEqualTo(0L)
        assertThat(internalTransactionUpdatedWebhookEvent.status())
            .isEqualTo(InternalTransaction.TransactionStatus.PENDING)
        assertThat(internalTransactionUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalTransactionUpdatedWebhookEvent.eventType())
            .isEqualTo(
                InternalTransactionUpdatedWebhookEvent.EventType.INTERNAL_TRANSACTION_UPDATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalTransactionUpdatedWebhookEvent =
            InternalTransactionUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(InternalTransaction.Category.INTERNAL)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .addEvent(
                    InternalTransaction.InternalAdjustmentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(
                            InternalTransaction.InternalAdjustmentEvent.TransactionResult.APPROVED
                        )
                        .type(InternalTransaction.InternalAdjustmentEvent.Type.INTERNAL_ADJUSTMENT)
                        .build()
                )
                .pendingAmount(0L)
                .result(InternalTransaction.TransactionResult.APPROVED)
                .settledAmount(0L)
                .status(InternalTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(
                    InternalTransactionUpdatedWebhookEvent.EventType.INTERNAL_TRANSACTION_UPDATED
                )
                .build()

        val roundtrippedInternalTransactionUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalTransactionUpdatedWebhookEvent),
                jacksonTypeRef<InternalTransactionUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedInternalTransactionUpdatedWebhookEvent)
            .isEqualTo(internalTransactionUpdatedWebhookEvent)
    }
}
