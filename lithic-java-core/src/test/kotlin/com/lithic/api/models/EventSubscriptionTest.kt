// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED))
                .url("https://example.com")
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.token()).isEqualTo("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(eventSubscription.description()).isEqualTo("string")
        assertThat(eventSubscription.disabled()).isEqualTo(true)
        assertThat(eventSubscription.eventTypes().get())
            .containsExactly(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED)
        assertThat(eventSubscription.url()).isEqualTo("https://example.com")
    }
}
