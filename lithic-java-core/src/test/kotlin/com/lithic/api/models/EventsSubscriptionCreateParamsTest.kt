package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventsSubscriptionCreateParamsTest {

    @Test
    fun createEventsSubscriptionCreateParams() {
        EventsSubscriptionCreateParams.builder()
            .description("string")
            .disabled(true)
            .eventTypes(listOf(EventsSubscriptionCreateParams.EventType.DISPUTE_UPDATED))
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventsSubscriptionCreateParams.builder()
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventsSubscriptionCreateParams.EventType.DISPUTE_UPDATED))
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.eventTypes())
            .isEqualTo(listOf(EventsSubscriptionCreateParams.EventType.DISPUTE_UPDATED))
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventsSubscriptionCreateParams.builder().url("https://example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
