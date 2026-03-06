// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldListPageResponseTest {

    @Test
    fun create() {
        val holdListPageResponse =
            HoldListPageResponse.builder()
                .addData(
                    Hold.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Hold.HoldStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .addEvent(
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
                        )
                        .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .family(Hold.Family.HOLD)
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(Hold.TransactionResult.APPROVED)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(holdListPageResponse.data())
            .containsExactly(
                Hold.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Hold.HoldStatus.PENDING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .addEvent(
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
                    )
                    .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .family(Hold.Family.HOLD)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .result(Hold.TransactionResult.APPROVED)
                    .userDefinedId("user_defined_id")
                    .build()
            )
        assertThat(holdListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdListPageResponse =
            HoldListPageResponse.builder()
                .addData(
                    Hold.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Hold.HoldStatus.PENDING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .addEvent(
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
                        )
                        .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .family(Hold.Family.HOLD)
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(Hold.TransactionResult.APPROVED)
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedHoldListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdListPageResponse),
                jacksonTypeRef<HoldListPageResponse>(),
            )

        assertThat(roundtrippedHoldListPageResponse).isEqualTo(holdListPageResponse)
    }
}
