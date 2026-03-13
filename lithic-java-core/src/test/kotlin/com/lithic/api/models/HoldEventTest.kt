// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldEventTest {

    @Test
    fun create() {
        val holdEvent =
            HoldEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDetailedResult(HoldEvent.DetailedResults.APPROVED)
                .memo("memo")
                .result(HoldEvent.TransactionResult.APPROVED)
                .settlingTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(HoldEvent.HoldEventType.HOLD_INITIATED)
                .build()

        assertThat(holdEvent.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdEvent.amount()).isEqualTo(0L)
        assertThat(holdEvent.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdEvent.detailedResults()).containsExactly(HoldEvent.DetailedResults.APPROVED)
        assertThat(holdEvent.memo()).contains("memo")
        assertThat(holdEvent.result()).isEqualTo(HoldEvent.TransactionResult.APPROVED)
        assertThat(holdEvent.settlingTransactionToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdEvent.type()).isEqualTo(HoldEvent.HoldEventType.HOLD_INITIATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdEvent =
            HoldEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDetailedResult(HoldEvent.DetailedResults.APPROVED)
                .memo("memo")
                .result(HoldEvent.TransactionResult.APPROVED)
                .settlingTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(HoldEvent.HoldEventType.HOLD_INITIATED)
                .build()

        val roundtrippedHoldEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdEvent),
                jacksonTypeRef<HoldEvent>(),
            )

        assertThat(roundtrippedHoldEvent).isEqualTo(holdEvent)
    }
}
