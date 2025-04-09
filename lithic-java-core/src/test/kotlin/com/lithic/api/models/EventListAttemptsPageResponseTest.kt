// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListAttemptsPageResponseTest {

    @Test
    fun create() {
        val eventListAttemptsPageResponse =
            EventListAttemptsPageResponse.builder()
                .addData(
                    MessageAttempt.builder()
                        .token("atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventSubscriptionToken("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .eventToken("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .response("response")
                        .responseStatusCode(0L)
                        .status(MessageAttempt.Status.FAILED)
                        .url("https://example.com")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(eventListAttemptsPageResponse.data())
            .containsExactly(
                MessageAttempt.builder()
                    .token("atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventSubscriptionToken("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                    .eventToken("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                    .response("response")
                    .responseStatusCode(0L)
                    .status(MessageAttempt.Status.FAILED)
                    .url("https://example.com")
                    .build()
            )
        assertThat(eventListAttemptsPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListAttemptsPageResponse =
            EventListAttemptsPageResponse.builder()
                .addData(
                    MessageAttempt.builder()
                        .token("atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventSubscriptionToken("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .eventToken("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                        .response("response")
                        .responseStatusCode(0L)
                        .status(MessageAttempt.Status.FAILED)
                        .url("https://example.com")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedEventListAttemptsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListAttemptsPageResponse),
                jacksonTypeRef<EventListAttemptsPageResponse>(),
            )

        assertThat(roundtrippedEventListAttemptsPageResponse)
            .isEqualTo(eventListAttemptsPageResponse)
    }
}
