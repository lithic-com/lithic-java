// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionUpdateParamsTest {

    @Test
    fun create() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .addEventType(EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .addEventType(
                    EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                )
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(
                EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
