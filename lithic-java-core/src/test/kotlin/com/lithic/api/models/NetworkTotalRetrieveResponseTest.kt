// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTotalRetrieveResponseTest {

    @Test
    fun create() {
        val networkTotalRetrieveResponse =
            NetworkTotalRetrieveResponse.builder()
                .token("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
                .amounts(
                    NetworkTotalRetrieveResponse.Amounts.builder()
                        .grossSettlement(100L)
                        .interchangeFees(-25L)
                        .netSettlement(85L)
                        .visaCharges(10L)
                        .build()
                )
                .created(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .currency("CAD")
                .institutionId("1000000000")
                .network(NetworkTotalRetrieveResponse.Network.VISA)
                .reportDate(LocalDate.parse("2025-02-25"))
                .settlementInstitutionId("1000000001")
                .settlementService("015")
                .updated(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
                .cycle(0L)
                .build()

        assertThat(networkTotalRetrieveResponse.token())
            .isEqualTo("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
        assertThat(networkTotalRetrieveResponse.amounts())
            .isEqualTo(
                NetworkTotalRetrieveResponse.Amounts.builder()
                    .grossSettlement(100L)
                    .interchangeFees(-25L)
                    .netSettlement(85L)
                    .visaCharges(10L)
                    .build()
            )
        assertThat(networkTotalRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalRetrieveResponse.currency()).isEqualTo("CAD")
        assertThat(networkTotalRetrieveResponse.institutionId()).isEqualTo("1000000000")
        assertThat(networkTotalRetrieveResponse.network())
            .isEqualTo(NetworkTotalRetrieveResponse.Network.VISA)
        assertThat(networkTotalRetrieveResponse.reportDate())
            .isEqualTo(LocalDate.parse("2025-02-25"))
        assertThat(networkTotalRetrieveResponse.settlementInstitutionId()).isEqualTo("1000000001")
        assertThat(networkTotalRetrieveResponse.settlementService()).isEqualTo("015")
        assertThat(networkTotalRetrieveResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalRetrieveResponse.cycle()).contains(0L)
    }
}
