// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTotalListResponseTest {

    @Test
    fun create() {
        val networkTotalListResponse =
            NetworkTotalListResponse.builder()
                .token("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
                .amounts(
                    NetworkTotalListResponse.Amounts.builder()
                        .grossSettlement(100L)
                        .interchangeFees(-25L)
                        .netSettlement(85L)
                        .visaCharges(10L)
                        .build()
                )
                .created(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .currency("CAD")
                .institutionId("1000000000")
                .network(NetworkTotalListResponse.Network.VISA)
                .reportDate(LocalDate.parse("2025-02-25"))
                .settlementInstitutionId("1000000001")
                .settlementService("015")
                .updated(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .cycle(0L)
                .build()

        assertThat(networkTotalListResponse.token())
            .isEqualTo("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
        assertThat(networkTotalListResponse.amounts())
            .isEqualTo(
                NetworkTotalListResponse.Amounts.builder()
                    .grossSettlement(100L)
                    .interchangeFees(-25L)
                    .netSettlement(85L)
                    .visaCharges(10L)
                    .build()
            )
        assertThat(networkTotalListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalListResponse.currency()).isEqualTo("CAD")
        assertThat(networkTotalListResponse.institutionId()).isEqualTo("1000000000")
        assertThat(networkTotalListResponse.network())
            .isEqualTo(NetworkTotalListResponse.Network.VISA)
        assertThat(networkTotalListResponse.reportDate()).isEqualTo(LocalDate.parse("2025-02-25"))
        assertThat(networkTotalListResponse.settlementInstitutionId()).isEqualTo("1000000001")
        assertThat(networkTotalListResponse.settlementService()).isEqualTo("015")
        assertThat(networkTotalListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalListResponse.cycle()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkTotalListResponse =
            NetworkTotalListResponse.builder()
                .token("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
                .amounts(
                    NetworkTotalListResponse.Amounts.builder()
                        .grossSettlement(100L)
                        .interchangeFees(-25L)
                        .netSettlement(85L)
                        .visaCharges(10L)
                        .build()
                )
                .created(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .currency("CAD")
                .institutionId("1000000000")
                .network(NetworkTotalListResponse.Network.VISA)
                .reportDate(LocalDate.parse("2025-02-25"))
                .settlementInstitutionId("1000000001")
                .settlementService("015")
                .updated(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .cycle(0L)
                .build()

        val roundtrippedNetworkTotalListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkTotalListResponse),
                jacksonTypeRef<NetworkTotalListResponse>(),
            )

        assertThat(roundtrippedNetworkTotalListResponse).isEqualTo(networkTotalListResponse)
    }
}
