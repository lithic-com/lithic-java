package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventListAttemptsParamsTest {

    @Test
    fun createEventListAttemptsParams() {
        EventListAttemptsParams.builder()
            .eventToken("string")
            .pageSize(123L)
            .startingAfter("string")
            .endingBefore("string")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status(EventListAttemptsParams.Status.FAILED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventListAttemptsParams.builder()
                .eventToken("string")
                .pageSize(123L)
                .startingAfter("string")
                .endingBefore("string")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventListAttemptsParams.Status.FAILED)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        expected.put("ending_before", listOf("string"))
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("status", listOf(EventListAttemptsParams.Status.FAILED.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListAttemptsParams.builder().eventToken("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = EventListAttemptsParams.builder().eventToken("string").build()
        assertThat(params).isNotNull
        // path param "eventToken"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
