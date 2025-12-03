// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalTransactionTest {

    @Test
    fun create() {
        val internalTransaction =
            InternalTransaction.builder()
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
                .build()

        assertThat(internalTransaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalTransaction.category()).isEqualTo(InternalTransaction.Category.INTERNAL)
        assertThat(internalTransaction.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalTransaction.currency()).isEqualTo("currency")
        assertThat(internalTransaction.descriptor()).isEqualTo("descriptor")
        assertThat(internalTransaction.events())
            .containsExactly(
                InternalTransaction.InternalAdjustmentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(InternalTransaction.InternalAdjustmentEvent.TransactionResult.APPROVED)
                    .type(InternalTransaction.InternalAdjustmentEvent.Type.INTERNAL_ADJUSTMENT)
                    .build()
            )
        assertThat(internalTransaction.pendingAmount()).isEqualTo(0L)
        assertThat(internalTransaction.result())
            .isEqualTo(InternalTransaction.TransactionResult.APPROVED)
        assertThat(internalTransaction.settledAmount()).isEqualTo(0L)
        assertThat(internalTransaction.status())
            .isEqualTo(InternalTransaction.TransactionStatus.PENDING)
        assertThat(internalTransaction.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalTransaction =
            InternalTransaction.builder()
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
                .build()

        val roundtrippedInternalTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalTransaction),
                jacksonTypeRef<InternalTransaction>(),
            )

        assertThat(roundtrippedInternalTransaction).isEqualTo(internalTransaction)
    }
}
