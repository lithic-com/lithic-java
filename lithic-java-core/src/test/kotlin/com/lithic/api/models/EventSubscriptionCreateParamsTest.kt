// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionCreateParamsTest {

    @Test
    fun create() {
        EventSubscriptionCreateParams.builder()
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .addEventType(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .addEventType(
                    EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                )
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(
                EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
