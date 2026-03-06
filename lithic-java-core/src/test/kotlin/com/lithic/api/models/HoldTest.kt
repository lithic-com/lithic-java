// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldTest {

    @Test
    fun create() {
        val hold =
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

        assertThat(hold.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(hold.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hold.status()).isEqualTo(Hold.HoldStatus.PENDING)
        assertThat(hold.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hold.currency()).contains("currency")
        assertThat(hold.events().getOrNull())
            .containsExactly(
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
        assertThat(hold.expirationDatetime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hold.family()).contains(Hold.Family.HOLD)
        assertThat(hold.financialAccountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(hold.pendingAmount()).contains(0L)
        assertThat(hold.result()).contains(Hold.TransactionResult.APPROVED)
        assertThat(hold.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hold =
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

        val roundtrippedHold =
            jsonMapper.readValue(jsonMapper.writeValueAsString(hold), jacksonTypeRef<Hold>())

        assertThat(roundtrippedHold).isEqualTo(hold)
    }
}
