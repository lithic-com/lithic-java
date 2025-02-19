// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionUpdateParamsTest {

    @Test
    fun create() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .addEventType(EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .addEventType(EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes())
            .contains(listOf(EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
