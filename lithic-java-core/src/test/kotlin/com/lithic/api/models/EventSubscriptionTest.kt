// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .description("description")
                .disabled(true)
                .url("https://example.com")
                .addEventType(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED)
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.token()).isEqualTo("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(eventSubscription.description()).isEqualTo("description")
        assertThat(eventSubscription.disabled()).isEqualTo(true)
        assertThat(eventSubscription.url()).isEqualTo("https://example.com")
        assertThat(eventSubscription.eventTypes().get())
            .containsExactly(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED)
    }
}
