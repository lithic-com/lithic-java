// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbedViewedWebhookEventTest {

    @Test
    fun create() {
        val embedViewedWebhookEvent =
            EmbedViewedWebhookEvent.builder()
                .accountToken("9a352526-4e69-469a-80b8-e22c71ba3cf0")
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .deviceDetails(
                    EmbedViewedWebhookEvent.EmbedDeviceDetails.builder()
                        .ipAddress("192.0.2.1")
                        .build()
                )
                .embedType(EmbedViewedWebhookEvent.EmbedType.PAN)
                .eventType(EmbedViewedWebhookEvent.EventType.EMBED_VIEWED)
                .sessionId("4273ff06-3ce4-4092-8a1f-0340e33b6375")
                .build()

        assertThat(embedViewedWebhookEvent.accountToken())
            .isEqualTo("9a352526-4e69-469a-80b8-e22c71ba3cf0")
        assertThat(embedViewedWebhookEvent.cardToken())
            .isEqualTo("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
        assertThat(embedViewedWebhookEvent.deviceDetails())
            .isEqualTo(
                EmbedViewedWebhookEvent.EmbedDeviceDetails.builder().ipAddress("192.0.2.1").build()
            )
        assertThat(embedViewedWebhookEvent.embedType())
            .isEqualTo(EmbedViewedWebhookEvent.EmbedType.PAN)
        assertThat(embedViewedWebhookEvent.eventType())
            .isEqualTo(EmbedViewedWebhookEvent.EventType.EMBED_VIEWED)
        assertThat(embedViewedWebhookEvent.sessionId())
            .isEqualTo("4273ff06-3ce4-4092-8a1f-0340e33b6375")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embedViewedWebhookEvent =
            EmbedViewedWebhookEvent.builder()
                .accountToken("9a352526-4e69-469a-80b8-e22c71ba3cf0")
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .deviceDetails(
                    EmbedViewedWebhookEvent.EmbedDeviceDetails.builder()
                        .ipAddress("192.0.2.1")
                        .build()
                )
                .embedType(EmbedViewedWebhookEvent.EmbedType.PAN)
                .eventType(EmbedViewedWebhookEvent.EventType.EMBED_VIEWED)
                .sessionId("4273ff06-3ce4-4092-8a1f-0340e33b6375")
                .build()

        val roundtrippedEmbedViewedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embedViewedWebhookEvent),
                jacksonTypeRef<EmbedViewedWebhookEvent>(),
            )

        assertThat(roundtrippedEmbedViewedWebhookEvent).isEqualTo(embedViewedWebhookEvent)
    }
}
