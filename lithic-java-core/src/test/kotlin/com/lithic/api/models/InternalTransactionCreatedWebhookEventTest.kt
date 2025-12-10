// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalTransactionCreatedWebhookEventTest {

    @Test
    fun create() {
        val internalTransactionCreatedWebhookEvent =
            InternalTransactionCreatedWebhookEvent.builder()
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
                    InternalTransactionCreatedWebhookEvent.EventType.INTERNAL_TRANSACTION_CREATED
                )
                .build()

        assertThat(internalTransactionCreatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalTransactionCreatedWebhookEvent.category())
            .isEqualTo(InternalTransaction.Category.INTERNAL)
        assertThat(internalTransactionCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalTransactionCreatedWebhookEvent.currency()).isEqualTo("currency")
        assertThat(internalTransactionCreatedWebhookEvent.descriptor()).isEqualTo("descriptor")
        assertThat(internalTransactionCreatedWebhookEvent.events())
            .containsExactly(
                InternalTransaction.InternalAdjustmentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(InternalTransaction.InternalAdjustmentEvent.TransactionResult.APPROVED)
                    .type(InternalTransaction.InternalAdjustmentEvent.Type.INTERNAL_ADJUSTMENT)
                    .build()
            )
        assertThat(internalTransactionCreatedWebhookEvent.pendingAmount()).isEqualTo(0L)
        assertThat(internalTransactionCreatedWebhookEvent.result())
            .isEqualTo(InternalTransaction.TransactionResult.APPROVED)
        assertThat(internalTransactionCreatedWebhookEvent.settledAmount()).isEqualTo(0L)
        assertThat(internalTransactionCreatedWebhookEvent.status())
            .isEqualTo(InternalTransaction.TransactionStatus.PENDING)
        assertThat(internalTransactionCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalTransactionCreatedWebhookEvent.eventType())
            .isEqualTo(
                InternalTransactionCreatedWebhookEvent.EventType.INTERNAL_TRANSACTION_CREATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalTransactionCreatedWebhookEvent =
            InternalTransactionCreatedWebhookEvent.builder()
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
                    InternalTransactionCreatedWebhookEvent.EventType.INTERNAL_TRANSACTION_CREATED
                )
                .build()

        val roundtrippedInternalTransactionCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalTransactionCreatedWebhookEvent),
                jacksonTypeRef<InternalTransactionCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedInternalTransactionCreatedWebhookEvent)
            .isEqualTo(internalTransactionCreatedWebhookEvent)
    }
}
