// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardConvertedWebhookEventTest {

    @Test
    fun create() {
        val cardConvertedWebhookEvent =
            CardConvertedWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardConvertedWebhookEvent.EventType.CARD_CONVERTED)
                .build()

        assertThat(cardConvertedWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(cardConvertedWebhookEvent.eventType())
            .isEqualTo(CardConvertedWebhookEvent.EventType.CARD_CONVERTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardConvertedWebhookEvent =
            CardConvertedWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardConvertedWebhookEvent.EventType.CARD_CONVERTED)
                .build()

        val roundtrippedCardConvertedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardConvertedWebhookEvent),
                jacksonTypeRef<CardConvertedWebhookEvent>(),
            )

        assertThat(roundtrippedCardConvertedWebhookEvent).isEqualTo(cardConvertedWebhookEvent)
    }
}
