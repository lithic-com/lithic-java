// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
        EventSubscriptionCreateParams.builder()
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .eventTypes(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .eventTypes(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes())
            .contains(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("https://example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
