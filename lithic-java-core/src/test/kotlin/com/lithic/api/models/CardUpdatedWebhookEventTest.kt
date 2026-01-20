// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdatedWebhookEventTest {

    @Test
    fun create() {
        val cardUpdatedWebhookEvent =
            CardUpdatedWebhookEvent.builder()
                .token("00000000-0000-0000-0000-000000000000")
                .eventType(CardUpdatedWebhookEvent.EventType.CARD_UPDATED)
                .previousFields(JsonValue.from(mapOf("state" to "PAUSED")))
                .state("OPEN")
                .build()

        assertThat(cardUpdatedWebhookEvent.token())
            .isEqualTo("00000000-0000-0000-0000-000000000000")
        assertThat(cardUpdatedWebhookEvent.eventType())
            .isEqualTo(CardUpdatedWebhookEvent.EventType.CARD_UPDATED)
        assertThat(cardUpdatedWebhookEvent._previousFields())
            .isEqualTo(JsonValue.from(mapOf("state" to "PAUSED")))
        assertThat(cardUpdatedWebhookEvent.state()).isEqualTo("OPEN")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardUpdatedWebhookEvent =
            CardUpdatedWebhookEvent.builder()
                .token("00000000-0000-0000-0000-000000000000")
                .eventType(CardUpdatedWebhookEvent.EventType.CARD_UPDATED)
                .previousFields(JsonValue.from(mapOf("state" to "PAUSED")))
                .state("OPEN")
                .build()

        val roundtrippedCardUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardUpdatedWebhookEvent),
                jacksonTypeRef<CardUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedCardUpdatedWebhookEvent).isEqualTo(cardUpdatedWebhookEvent)
    }
}
