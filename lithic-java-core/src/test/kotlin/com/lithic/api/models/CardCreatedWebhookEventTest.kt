// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreatedWebhookEventTest {

    @Test
    fun create() {
        val cardCreatedWebhookEvent =
            CardCreatedWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardCreatedWebhookEvent.EventType.CARD_CREATED)
                .replacementFor("00000000-0000-0000-0000-000000000000")
                .build()

        assertThat(cardCreatedWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(cardCreatedWebhookEvent.eventType())
            .isEqualTo(CardCreatedWebhookEvent.EventType.CARD_CREATED)
        assertThat(cardCreatedWebhookEvent.replacementFor())
            .contains("00000000-0000-0000-0000-000000000000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreatedWebhookEvent =
            CardCreatedWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardCreatedWebhookEvent.EventType.CARD_CREATED)
                .replacementFor("00000000-0000-0000-0000-000000000000")
                .build()

        val roundtrippedCardCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreatedWebhookEvent),
                jacksonTypeRef<CardCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedCardCreatedWebhookEvent).isEqualTo(cardCreatedWebhookEvent)
    }
}
