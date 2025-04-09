// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionListAttemptsPageResponseTest {

    @Test
    fun create() {
        val eventSubscriptionListAttemptsPageResponse =
            EventSubscriptionListAttemptsPageResponse.builder()
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

        assertThat(eventSubscriptionListAttemptsPageResponse.data())
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
        assertThat(eventSubscriptionListAttemptsPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSubscriptionListAttemptsPageResponse =
            EventSubscriptionListAttemptsPageResponse.builder()
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

        val roundtrippedEventSubscriptionListAttemptsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSubscriptionListAttemptsPageResponse),
                jacksonTypeRef<EventSubscriptionListAttemptsPageResponse>(),
            )

        assertThat(roundtrippedEventSubscriptionListAttemptsPageResponse)
            .isEqualTo(eventSubscriptionListAttemptsPageResponse)
    }
}
