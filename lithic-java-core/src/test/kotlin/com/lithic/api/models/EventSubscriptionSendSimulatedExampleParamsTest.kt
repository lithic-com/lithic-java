// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionSendSimulatedExampleParamsTest {

    @Test
    fun create() {
        EventSubscriptionSendSimulatedExampleParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .eventType(EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(
                    EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.eventType())
            .contains(EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
