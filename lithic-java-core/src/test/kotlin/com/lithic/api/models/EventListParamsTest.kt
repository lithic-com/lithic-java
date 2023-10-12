// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventListParamsTest {

    @Test
    fun createEventListParams() {
        EventListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("string")
            .eventTypes(listOf(EventListParams.EventType.ACCOUNT_HOLDER_CREATED))
            .pageSize(123L)
            .startingAfter("string")
            .withContent(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("string")
                .eventTypes(listOf(EventListParams.EventType.ACCOUNT_HOLDER_CREATED))
                .pageSize(123L)
                .startingAfter("string")
                .withContent(true)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("string"))
        expected.put(
            "event_types",
            listOf(EventListParams.EventType.ACCOUNT_HOLDER_CREATED.toString())
        )
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        expected.put("with_content", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
