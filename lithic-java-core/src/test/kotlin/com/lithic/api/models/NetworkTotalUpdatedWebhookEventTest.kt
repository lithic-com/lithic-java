// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTotalUpdatedWebhookEventTest {

    @Test
    fun create() {
        val networkTotalUpdatedWebhookEvent =
            NetworkTotalUpdatedWebhookEvent.builder()
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
                .eventType(NetworkTotalUpdatedWebhookEvent.EventType.NETWORK_TOTAL_UPDATED)
                .build()

        assertThat(networkTotalUpdatedWebhookEvent.token())
            .isEqualTo("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
        assertThat(networkTotalUpdatedWebhookEvent.amounts())
            .isEqualTo(
                NetworkTotal.Amounts.builder()
                    .grossSettlement(100L)
                    .interchangeFees(-25L)
                    .netSettlement(85L)
                    .visaCharges(10L)
                    .build()
            )
        assertThat(networkTotalUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalUpdatedWebhookEvent.currency()).isEqualTo("CAD")
        assertThat(networkTotalUpdatedWebhookEvent.institutionId()).isEqualTo("1000000000")
        assertThat(networkTotalUpdatedWebhookEvent.isComplete()).isEqualTo(true)
        assertThat(networkTotalUpdatedWebhookEvent.network()).isEqualTo(NetworkTotal.Network.VISA)
        assertThat(networkTotalUpdatedWebhookEvent.reportDate())
            .isEqualTo(LocalDate.parse("2025-02-25"))
        assertThat(networkTotalUpdatedWebhookEvent.settlementInstitutionId())
            .isEqualTo("1000000001")
        assertThat(networkTotalUpdatedWebhookEvent.settlementService()).isEqualTo("015")
        assertThat(networkTotalUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalUpdatedWebhookEvent.cycle()).contains(0L)
        assertThat(networkTotalUpdatedWebhookEvent.eventType())
            .isEqualTo(NetworkTotalUpdatedWebhookEvent.EventType.NETWORK_TOTAL_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkTotalUpdatedWebhookEvent =
            NetworkTotalUpdatedWebhookEvent.builder()
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
                .eventType(NetworkTotalUpdatedWebhookEvent.EventType.NETWORK_TOTAL_UPDATED)
                .build()

        val roundtrippedNetworkTotalUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkTotalUpdatedWebhookEvent),
                jacksonTypeRef<NetworkTotalUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedNetworkTotalUpdatedWebhookEvent)
            .isEqualTo(networkTotalUpdatedWebhookEvent)
    }
}
