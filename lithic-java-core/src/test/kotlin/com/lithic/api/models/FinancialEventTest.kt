// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialEventTest {

    @Test
    fun create() {
        val financialEvent =
            FinancialEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .result(FinancialEvent.Result.APPROVED)
                .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                .build()

        assertThat(financialEvent.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialEvent.amount()).contains(0L)
        assertThat(financialEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialEvent.result()).contains(FinancialEvent.Result.APPROVED)
        assertThat(financialEvent.type())
            .contains(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialEvent =
            FinancialEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .result(FinancialEvent.Result.APPROVED)
                .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                .build()

        val roundtrippedFinancialEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialEvent),
                jacksonTypeRef<FinancialEvent>(),
            )

        assertThat(roundtrippedFinancialEvent).isEqualTo(financialEvent)
    }
}
