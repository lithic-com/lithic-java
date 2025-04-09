// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportSettlementNetworkTotalListPageResponseTest {

    @Test
    fun create() {
        val reportSettlementNetworkTotalListPageResponse =
            ReportSettlementNetworkTotalListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(reportSettlementNetworkTotalListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(reportSettlementNetworkTotalListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportSettlementNetworkTotalListPageResponse =
            ReportSettlementNetworkTotalListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedReportSettlementNetworkTotalListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportSettlementNetworkTotalListPageResponse),
                jacksonTypeRef<ReportSettlementNetworkTotalListPageResponse>(),
            )

        assertThat(roundtrippedReportSettlementNetworkTotalListPageResponse)
            .isEqualTo(reportSettlementNetworkTotalListPageResponse)
    }
}
