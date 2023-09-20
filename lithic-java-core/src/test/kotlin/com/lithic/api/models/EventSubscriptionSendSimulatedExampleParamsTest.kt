package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionSendSimulatedExampleParamsTest {

    @Test
    fun createEventSubscriptionSendSimulatedExampleParams() {
        EventSubscriptionSendSimulatedExampleParams.builder()
            .eventSubscriptionToken("string")
            .eventType(EventSubscriptionSendSimulatedExampleParams.EventType.CARD_CREATED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("string")
                .eventType(EventSubscriptionSendSimulatedExampleParams.EventType.CARD_CREATED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventType())
            .isEqualTo(EventSubscriptionSendSimulatedExampleParams.EventType.CARD_CREATED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("string")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
