// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
        EventSubscriptionCreateParams.builder()
            .url("https://example.com")
            .description("string")
            .disabled(true)
            .eventTypes(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("https://example.com")
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.eventTypes())
            .isEqualTo(listOf(EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("https://example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
