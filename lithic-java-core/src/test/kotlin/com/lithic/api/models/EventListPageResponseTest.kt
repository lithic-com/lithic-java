// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListPageResponseTest {

    @Test
    fun create() {
        val eventListPageResponse =
            EventListPageResponse.builder()
                .addData(
                    Event.builder()
                        .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(Event.EventType.ACCOUNT_HOLDER_CREATED)
                        .payload(Event.Payload.builder().build())
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(eventListPageResponse.data())
            .containsExactly(
                Event.builder()
                    .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventType(Event.EventType.ACCOUNT_HOLDER_CREATED)
                    .payload(Event.Payload.builder().build())
                    .build()
            )
        assertThat(eventListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListPageResponse =
            EventListPageResponse.builder()
                .addData(
                    Event.builder()
                        .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(Event.EventType.ACCOUNT_HOLDER_CREATED)
                        .payload(Event.Payload.builder().build())
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListPageResponse),
                jacksonTypeRef<EventListPageResponse>(),
            )

        assertThat(roundtrippedEventListPageResponse).isEqualTo(eventListPageResponse)
    }
}
