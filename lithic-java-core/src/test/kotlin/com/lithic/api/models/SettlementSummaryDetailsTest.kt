// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettlementSummaryDetailsTest {

    @Test
    fun create() {
        val settlementSummaryDetails =
            SettlementSummaryDetails.builder()
                .currency("USD")
                .disputesGrossAmount(0L)
                .institution("00001")
                .interchangeGrossAmount(-7L)
                .network(SettlementSummaryDetails.Network.MASTERCARD)
                .otherFeesGrossAmount(0L)
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .build()

        assertThat(settlementSummaryDetails.currency()).contains("USD")
        assertThat(settlementSummaryDetails.disputesGrossAmount()).contains(0L)
        assertThat(settlementSummaryDetails.institution()).contains("00001")
        assertThat(settlementSummaryDetails.interchangeGrossAmount()).contains(-7L)
        assertThat(settlementSummaryDetails.network())
            .contains(SettlementSummaryDetails.Network.MASTERCARD)
        assertThat(settlementSummaryDetails.otherFeesGrossAmount()).contains(0L)
        assertThat(settlementSummaryDetails.settledNetAmount()).contains(1893L)
        assertThat(settlementSummaryDetails.transactionsGrossAmount()).contains(1900L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settlementSummaryDetails =
            SettlementSummaryDetails.builder()
                .currency("USD")
                .disputesGrossAmount(0L)
                .institution("00001")
                .interchangeGrossAmount(-7L)
                .network(SettlementSummaryDetails.Network.MASTERCARD)
                .otherFeesGrossAmount(0L)
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .build()

        val roundtrippedSettlementSummaryDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settlementSummaryDetails),
                jacksonTypeRef<SettlementSummaryDetails>(),
            )

        assertThat(roundtrippedSettlementSummaryDetails).isEqualTo(settlementSummaryDetails)
    }
}
