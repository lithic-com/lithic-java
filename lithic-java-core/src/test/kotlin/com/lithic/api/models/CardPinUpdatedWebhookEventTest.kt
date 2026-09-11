// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPinUpdatedWebhookEventTest {

    @Test
    fun create() {
        val cardPinUpdatedWebhookEvent =
            CardPinUpdatedWebhookEvent.builder()
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .eventType(CardPinUpdatedWebhookEvent.EventType.CARD_PIN_UPDATED)
                .pinStatus(CardPinUpdatedWebhookEvent.PinStatus.OK)
                .statusReason(CardPinUpdatedWebhookEvent.StatusReason.PIN_SET)
                .build()

        assertThat(cardPinUpdatedWebhookEvent.cardToken())
            .isEqualTo("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
        assertThat(cardPinUpdatedWebhookEvent.eventType())
            .isEqualTo(CardPinUpdatedWebhookEvent.EventType.CARD_PIN_UPDATED)
        assertThat(cardPinUpdatedWebhookEvent.pinStatus())
            .isEqualTo(CardPinUpdatedWebhookEvent.PinStatus.OK)
        assertThat(cardPinUpdatedWebhookEvent.statusReason())
            .isEqualTo(CardPinUpdatedWebhookEvent.StatusReason.PIN_SET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPinUpdatedWebhookEvent =
            CardPinUpdatedWebhookEvent.builder()
                .cardToken("4df9a19c-9e1e-40d1-b27a-05e01152ee07")
                .eventType(CardPinUpdatedWebhookEvent.EventType.CARD_PIN_UPDATED)
                .pinStatus(CardPinUpdatedWebhookEvent.PinStatus.OK)
                .statusReason(CardPinUpdatedWebhookEvent.StatusReason.PIN_SET)
                .build()

        val roundtrippedCardPinUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPinUpdatedWebhookEvent),
                jacksonTypeRef<CardPinUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedCardPinUpdatedWebhookEvent).isEqualTo(cardPinUpdatedWebhookEvent)
    }
}
