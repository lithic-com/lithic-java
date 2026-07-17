// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbedSessionGeneratedWebhookEventTest {

    @Test
    fun create() {
        val embedSessionGeneratedWebhookEvent =
            EmbedSessionGeneratedWebhookEvent.builder()
                .accountToken("9a352526-4e69-469a-80b8-e22c71ba3cf0")
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .deviceDetails(
                    EmbedSessionGeneratedWebhookEvent.EmbedDeviceDetails.builder()
                        .ipAddress("192.0.2.1")
                        .build()
                )
                .eventType(EmbedSessionGeneratedWebhookEvent.EventType.EMBED_SESSION_GENERATED)
                .sessionId("4273ff06-3ce4-4092-8a1f-0340e33b6375")
                .sessionType(EmbedSessionGeneratedWebhookEvent.SessionType.CARD_EMBED)
                .build()

        assertThat(embedSessionGeneratedWebhookEvent.accountToken())
            .isEqualTo("9a352526-4e69-469a-80b8-e22c71ba3cf0")
        assertThat(embedSessionGeneratedWebhookEvent.cardToken())
            .isEqualTo("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
        assertThat(embedSessionGeneratedWebhookEvent.deviceDetails())
            .isEqualTo(
                EmbedSessionGeneratedWebhookEvent.EmbedDeviceDetails.builder()
                    .ipAddress("192.0.2.1")
                    .build()
            )
        assertThat(embedSessionGeneratedWebhookEvent.eventType())
            .isEqualTo(EmbedSessionGeneratedWebhookEvent.EventType.EMBED_SESSION_GENERATED)
        assertThat(embedSessionGeneratedWebhookEvent.sessionId())
            .isEqualTo("4273ff06-3ce4-4092-8a1f-0340e33b6375")
        assertThat(embedSessionGeneratedWebhookEvent.sessionType())
            .isEqualTo(EmbedSessionGeneratedWebhookEvent.SessionType.CARD_EMBED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embedSessionGeneratedWebhookEvent =
            EmbedSessionGeneratedWebhookEvent.builder()
                .accountToken("9a352526-4e69-469a-80b8-e22c71ba3cf0")
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .deviceDetails(
                    EmbedSessionGeneratedWebhookEvent.EmbedDeviceDetails.builder()
                        .ipAddress("192.0.2.1")
                        .build()
                )
                .eventType(EmbedSessionGeneratedWebhookEvent.EventType.EMBED_SESSION_GENERATED)
                .sessionId("4273ff06-3ce4-4092-8a1f-0340e33b6375")
                .sessionType(EmbedSessionGeneratedWebhookEvent.SessionType.CARD_EMBED)
                .build()

        val roundtrippedEmbedSessionGeneratedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embedSessionGeneratedWebhookEvent),
                jacksonTypeRef<EmbedSessionGeneratedWebhookEvent>(),
            )

        assertThat(roundtrippedEmbedSessionGeneratedWebhookEvent)
            .isEqualTo(embedSessionGeneratedWebhookEvent)
    }
}
