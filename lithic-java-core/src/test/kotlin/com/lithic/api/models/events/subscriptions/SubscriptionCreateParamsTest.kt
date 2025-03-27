// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.events.subscriptions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .url("https://example.com")
            .description("description")
            .disabled(true)
            .addEventType(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .url("https://example.com")
                .description("description")
                .disabled(true)
                .addEventType(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.disabled()).contains(true)
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionCreateParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
