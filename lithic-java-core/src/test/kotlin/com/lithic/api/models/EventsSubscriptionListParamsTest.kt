package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventsSubscriptionListParamsTest {

    @Test
    fun createEventsSubscriptionListParams() {
        EventsSubscriptionListParams.builder()
            .pageSize(123L)
            .startingAfter("string")
            .endingBefore("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventsSubscriptionListParams.builder()
                .pageSize(123L)
                .startingAfter("string")
                .endingBefore("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        expected.put("ending_before", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventsSubscriptionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
