// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionListPageResponseTest {

    @Test
    fun create() {
        val eventSubscriptionListPageResponse =
            EventSubscriptionListPageResponse.builder()
                .addData(
                    EventSubscription.builder()
                        .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .description("description")
                        .disabled(true)
                        .url("https://example.com")
                        .addEventType(EventSubscription.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(eventSubscriptionListPageResponse.data())
            .containsExactly(
                EventSubscription.builder()
                    .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                    .description("description")
                    .disabled(true)
                    .url("https://example.com")
                    .addEventType(EventSubscription.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
                    .build()
            )
        assertThat(eventSubscriptionListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSubscriptionListPageResponse =
            EventSubscriptionListPageResponse.builder()
                .addData(
                    EventSubscription.builder()
                        .token("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .description("description")
                        .disabled(true)
                        .url("https://example.com")
                        .addEventType(EventSubscription.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedEventSubscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSubscriptionListPageResponse),
                jacksonTypeRef<EventSubscriptionListPageResponse>(),
            )

        assertThat(roundtrippedEventSubscriptionListPageResponse)
            .isEqualTo(eventSubscriptionListPageResponse)
    }
}
