// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTotalCreatedWebhookEventTest {

    @Test
    fun create() {
        val networkTotalCreatedWebhookEvent =
            NetworkTotalCreatedWebhookEvent.builder()
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
                .eventType(NetworkTotalCreatedWebhookEvent.EventType.NETWORK_TOTAL_CREATED)
                .build()

        assertThat(networkTotalCreatedWebhookEvent.token())
            .isEqualTo("12cf7505-06a8-435e-b1c7-4c430d02f6c3")
        assertThat(networkTotalCreatedWebhookEvent.amounts())
            .isEqualTo(
                NetworkTotal.Amounts.builder()
                    .grossSettlement(100L)
                    .interchangeFees(-25L)
                    .netSettlement(85L)
                    .visaCharges(10L)
                    .build()
            )
        assertThat(networkTotalCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalCreatedWebhookEvent.currency()).isEqualTo("CAD")
        assertThat(networkTotalCreatedWebhookEvent.institutionId()).isEqualTo("1000000000")
        assertThat(networkTotalCreatedWebhookEvent.isComplete()).isEqualTo(true)
        assertThat(networkTotalCreatedWebhookEvent.network()).isEqualTo(NetworkTotal.Network.VISA)
        assertThat(networkTotalCreatedWebhookEvent.reportDate())
            .isEqualTo(LocalDate.parse("2025-02-25"))
        assertThat(networkTotalCreatedWebhookEvent.settlementInstitutionId())
            .isEqualTo("1000000001")
        assertThat(networkTotalCreatedWebhookEvent.settlementService()).isEqualTo("015")
        assertThat(networkTotalCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2025-02-25T13:07:31.419631Z"))
        assertThat(networkTotalCreatedWebhookEvent.cycle()).contains(0L)
        assertThat(networkTotalCreatedWebhookEvent.eventType())
            .isEqualTo(NetworkTotalCreatedWebhookEvent.EventType.NETWORK_TOTAL_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkTotalCreatedWebhookEvent =
            NetworkTotalCreatedWebhookEvent.builder()
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
                .eventType(NetworkTotalCreatedWebhookEvent.EventType.NETWORK_TOTAL_CREATED)
                .build()

        val roundtrippedNetworkTotalCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkTotalCreatedWebhookEvent),
                jacksonTypeRef<NetworkTotalCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedNetworkTotalCreatedWebhookEvent)
            .isEqualTo(networkTotalCreatedWebhookEvent)
    }
}
