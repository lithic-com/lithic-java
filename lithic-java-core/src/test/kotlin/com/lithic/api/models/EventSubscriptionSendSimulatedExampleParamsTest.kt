// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionSendSimulatedExampleParamsTest {

    @Test
    fun createEventSubscriptionSendSimulatedExampleParams() {
        EventSubscriptionSendSimulatedExampleParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .eventType(EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(
                    EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventType())
            .isEqualTo(EventSubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
