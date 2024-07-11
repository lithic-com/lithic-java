// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventListAttemptsParamsTest {

    @Test
    fun createEventListAttemptsParams() {
        EventListAttemptsParams.builder()
            .eventToken("event_token")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(100L)
            .startingAfter("starting_after")
            .status(EventListAttemptsParams.Status.FAILED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventListAttemptsParams.builder()
                .eventToken("event_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(100L)
                .startingAfter("starting_after")
                .status(EventListAttemptsParams.Status.FAILED)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("starting_after"))
        expected.put("status", listOf(EventListAttemptsParams.Status.FAILED.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListAttemptsParams.builder().eventToken("event_token").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = EventListAttemptsParams.builder().eventToken("event_token").build()
        assertThat(params).isNotNull
        // path param "eventToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
