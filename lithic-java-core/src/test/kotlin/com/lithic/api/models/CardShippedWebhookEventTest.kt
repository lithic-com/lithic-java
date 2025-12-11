// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardShippedWebhookEventTest {

    @Test
    fun create() {
        val cardShippedWebhookEvent =
            CardShippedWebhookEvent.builder()
                .bulkOrderToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardShippedWebhookEvent.EventType.CARD_SHIPPED)
                .shippingMethod(
                    CardShippedWebhookEvent.ShippingMethod.USPS_WITHOUT_TRACKING_ENVELOPE
                )
                .trackingNumber("1Z9999999999999999")
                .build()

        assertThat(cardShippedWebhookEvent.bulkOrderToken())
            .contains("00000000-0000-0000-0000-000000000002")
        assertThat(cardShippedWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(cardShippedWebhookEvent.eventType())
            .isEqualTo(CardShippedWebhookEvent.EventType.CARD_SHIPPED)
        assertThat(cardShippedWebhookEvent.shippingMethod())
            .isEqualTo(CardShippedWebhookEvent.ShippingMethod.USPS_WITHOUT_TRACKING_ENVELOPE)
        assertThat(cardShippedWebhookEvent.trackingNumber()).contains("1Z9999999999999999")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardShippedWebhookEvent =
            CardShippedWebhookEvent.builder()
                .bulkOrderToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .eventType(CardShippedWebhookEvent.EventType.CARD_SHIPPED)
                .shippingMethod(
                    CardShippedWebhookEvent.ShippingMethod.USPS_WITHOUT_TRACKING_ENVELOPE
                )
                .trackingNumber("1Z9999999999999999")
                .build()

        val roundtrippedCardShippedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardShippedWebhookEvent),
                jacksonTypeRef<CardShippedWebhookEvent>(),
            )

        assertThat(roundtrippedCardShippedWebhookEvent).isEqualTo(cardShippedWebhookEvent)
    }
}
