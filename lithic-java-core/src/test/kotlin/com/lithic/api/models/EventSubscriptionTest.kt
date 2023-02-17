package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventSubscription.EventType.DISPUTE_UPDATED))
                .url("https://example.com")
                .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.description()).isEqualTo("string")
        assertThat(eventSubscription.disabled()).isEqualTo(true)
        assertThat(eventSubscription.eventTypes().get())
            .containsExactly(EventSubscription.EventType.DISPUTE_UPDATED)
        assertThat(eventSubscription.url()).isEqualTo("https://example.com")
        assertThat(eventSubscription.token()).isEqualTo("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
    }
}
