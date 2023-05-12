package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
        EventSubscriptionCreateParams.builder()
            .description("string")
            .disabled(true)
            .eventTypes(listOf(EventSubscriptionCreateParams.EventType.CARD_CREATED))
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionCreateParams.builder()
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventSubscriptionCreateParams.EventType.CARD_CREATED))
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.eventTypes())
            .isEqualTo(listOf(EventSubscriptionCreateParams.EventType.CARD_CREATED))
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("https://example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
