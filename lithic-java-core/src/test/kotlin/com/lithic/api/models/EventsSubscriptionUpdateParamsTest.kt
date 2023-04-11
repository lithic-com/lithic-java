package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventsSubscriptionUpdateParamsTest {

    @Test
    fun createEventsSubscriptionUpdateParams() {
        EventsSubscriptionUpdateParams.builder()
            .eventSubscriptionToken("string")
            .description("string")
            .disabled(true)
            .eventTypes(listOf(EventsSubscriptionUpdateParams.EventType.DISPUTE_UPDATED))
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventsSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("string")
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventsSubscriptionUpdateParams.EventType.DISPUTE_UPDATED))
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.eventTypes())
            .isEqualTo(listOf(EventsSubscriptionUpdateParams.EventType.DISPUTE_UPDATED))
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventsSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("string")
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getPathParam() {
        val params =
            EventsSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("string")
                .url("https://example.com")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
