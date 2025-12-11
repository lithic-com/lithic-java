// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardReissuedWebhookEventTest {

    @Test
    fun create() {
        val cardReissuedWebhookEvent =
            CardReissuedWebhookEvent.builder()
                .eventType(CardReissuedWebhookEvent.EventType.CARD_REISSUED)
                .cardToken("00000000-0000-0000-0000-000000000001")
                .build()

        assertThat(cardReissuedWebhookEvent.eventType())
            .isEqualTo(CardReissuedWebhookEvent.EventType.CARD_REISSUED)
        assertThat(cardReissuedWebhookEvent.cardToken())
            .contains("00000000-0000-0000-0000-000000000001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardReissuedWebhookEvent =
            CardReissuedWebhookEvent.builder()
                .eventType(CardReissuedWebhookEvent.EventType.CARD_REISSUED)
                .cardToken("00000000-0000-0000-0000-000000000001")
                .build()

        val roundtrippedCardReissuedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardReissuedWebhookEvent),
                jacksonTypeRef<CardReissuedWebhookEvent>(),
            )

        assertThat(roundtrippedCardReissuedWebhookEvent).isEqualTo(cardReissuedWebhookEvent)
    }
}
