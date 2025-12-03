// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTotalTest {

    @Test
    fun create() {
        val networkTotal =
            NetworkTotal.builder()
                .token("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
                .amounts(
                    NetworkTotal.Amounts.builder()
                        .grossSettlement(100L)
                        .interchangeFees(-25L)
                        .netSettlement(85L)
                        .visaCharges(10L)
                        .build()
                )
                .created(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .currency("CAD")
                .institutionId("1000000000")
                .isComplete(true)
                .network(NetworkTotal.Network.VISA)
                .reportDate(LocalDate.parse("2025-02-25"))
                .settlementInstitutionId("1000000001")
                .settlementService("015")
                .updated(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .cycle(0L)
                .build()

        assertThat(networkTotal.token()).isEqualTo("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
        assertThat(networkTotal.amounts())
            .isEqualTo(
                NetworkTotal.Amounts.builder()
                    .grossSettlement(100L)
                    .interchangeFees(-25L)
                    .netSettlement(85L)
                    .visaCharges(10L)
                    .build()
            )
        assertThat(networkTotal.created())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotal.currency()).isEqualTo("CAD")
        assertThat(networkTotal.institutionId()).isEqualTo("1000000000")
        assertThat(networkTotal.isComplete()).isEqualTo(true)
        assertThat(networkTotal.network()).isEqualTo(NetworkTotal.Network.VISA)
        assertThat(networkTotal.reportDate()).isEqualTo(LocalDate.parse("2025-02-25"))
        assertThat(networkTotal.settlementInstitutionId()).isEqualTo("1000000001")
        assertThat(networkTotal.settlementService()).isEqualTo("015")
        assertThat(networkTotal.updated())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotal.cycle()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkTotal =
            NetworkTotal.builder()
                .token("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
                .amounts(
                    NetworkTotal.Amounts.builder()
                        .grossSettlement(100L)
                        .interchangeFees(-25L)
                        .netSettlement(85L)
                        .visaCharges(10L)
                        .build()
                )
                .created(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .currency("CAD")
                .institutionId("1000000000")
                .isComplete(true)
                .network(NetworkTotal.Network.VISA)
                .reportDate(LocalDate.parse("2025-02-25"))
                .settlementInstitutionId("1000000001")
                .settlementService("015")
                .updated(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .cycle(0L)
                .build()

        val roundtrippedNetworkTotal =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkTotal),
                jacksonTypeRef<NetworkTotal>(),
            )

        assertThat(roundtrippedNetworkTotal).isEqualTo(networkTotal)
    }
}
