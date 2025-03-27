// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.events.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionSendSimulatedExampleParamsTest {

    @Test
    fun create() {
        SubscriptionSendSimulatedExampleParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .eventType(SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()

        val body = params._body()

        assertThat(body.eventType())
            .contains(SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()

        val body = params._body()
    }
}
