// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRenewedWebhookEventTest {

    @Test
    fun create() {
        val cardRenewedWebhookEvent =
            CardRenewedWebhookEvent.builder()
                .eventType(CardRenewedWebhookEvent.EventType.CARD_RENEWED)
                .cardToken("00000000-0000-0000-0000-000000000001")
                .expMonth("01")
                .expYear("2030")
                .previousExpMonth("01")
                .previousExpYear("2024")
                .build()

        assertThat(cardRenewedWebhookEvent.eventType())
            .isEqualTo(CardRenewedWebhookEvent.EventType.CARD_RENEWED)
        assertThat(cardRenewedWebhookEvent.cardToken())
            .contains("00000000-0000-0000-0000-000000000001")
        assertThat(cardRenewedWebhookEvent.expMonth()).contains("01")
        assertThat(cardRenewedWebhookEvent.expYear()).contains("2030")
        assertThat(cardRenewedWebhookEvent.previousExpMonth()).contains("01")
        assertThat(cardRenewedWebhookEvent.previousExpYear()).contains("2024")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRenewedWebhookEvent =
            CardRenewedWebhookEvent.builder()
                .eventType(CardRenewedWebhookEvent.EventType.CARD_RENEWED)
                .cardToken("00000000-0000-0000-0000-000000000001")
                .expMonth("01")
                .expYear("2030")
                .previousExpMonth("01")
                .previousExpYear("2024")
                .build()

        val roundtrippedCardRenewedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRenewedWebhookEvent),
                jacksonTypeRef<CardRenewedWebhookEvent>(),
            )

        assertThat(roundtrippedCardRenewedWebhookEvent).isEqualTo(cardRenewedWebhookEvent)
    }
}
