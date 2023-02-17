package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventsSubscriptionReplayMissingParamsTest {

    @Test
    fun createEventsSubscriptionReplayMissingParams() {
        EventsSubscriptionReplayMissingParams.builder()
            .eventSubscriptionToken("string")
            .begin("2019-12-27T18:11:19.117Z")
            .end("2019-12-27T18:11:19.117Z")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventsSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("string")
                .begin("2019-12-27T18:11:19.117Z")
                .end("2019-12-27T18:11:19.117Z")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            EventsSubscriptionReplayMissingParams.builder().eventSubscriptionToken("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            EventsSubscriptionReplayMissingParams.builder().eventSubscriptionToken("string").build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
