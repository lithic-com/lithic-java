// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun create() {
        EventSubscriptionCreateParams.builder()
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .addEventType(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .addEventType(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes())
            .contains(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
