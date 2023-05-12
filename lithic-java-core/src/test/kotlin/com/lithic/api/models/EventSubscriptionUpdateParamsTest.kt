package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionUpdateParamsTest {

    @Test
    fun createEventSubscriptionUpdateParams() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionToken("string")
            .description("string")
            .disabled(true)
            .eventTypes(listOf(EventSubscriptionUpdateParams.EventType.CARD_CREATED))
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionToken("string")
                .description("string")
                .disabled(true)
                .eventTypes(listOf(EventSubscriptionUpdateParams.EventType.CARD_CREATED))
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.eventTypes())
            .isEqualTo(listOf(EventSubscriptionUpdateParams.EventType.CARD_CREATED))
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
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
            EventSubscriptionUpdateParams.builder()
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
