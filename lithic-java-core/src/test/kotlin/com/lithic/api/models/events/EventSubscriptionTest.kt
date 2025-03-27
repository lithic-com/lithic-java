// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.events

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionTest {

    @Test
    fun create() {
        val eventSubscription =
            EventSubscription.builder()
                .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .description("description")
                .disabled(true)
                .url("https://example.com")
                .addEventType(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED)
                .build()

        assertThat(eventSubscription.token()).isEqualTo("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(eventSubscription.description()).isEqualTo("description")
        assertThat(eventSubscription.disabled()).isEqualTo(true)
        assertThat(eventSubscription.url()).isEqualTo("https://example.com")
        assertThat(eventSubscription.eventTypes().getOrNull())
            .containsExactly(EventSubscription.EventType.ACCOUNT_HOLDER_CREATED)
    }
}
