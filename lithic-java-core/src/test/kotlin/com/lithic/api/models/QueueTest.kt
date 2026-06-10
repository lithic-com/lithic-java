// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueTest {

    @Test
    fun create() {
        val queue =
            Queue.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseCounts(
                    Queue.CaseCounts.builder()
                        .assigned(0L)
                        .closed(0L)
                        .escalated(0L)
                        .inReview(0L)
                        .open(0L)
                        .resolved(0L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(queue.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queue.caseCounts())
            .isEqualTo(
                Queue.CaseCounts.builder()
                    .assigned(0L)
                    .closed(0L)
                    .escalated(0L)
                    .inReview(0L)
                    .open(0L)
                    .resolved(0L)
                    .build()
            )
        assertThat(queue.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(queue.description()).contains("description")
        assertThat(queue.name()).isEqualTo("name")
        assertThat(queue.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queue =
            Queue.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseCounts(
                    Queue.CaseCounts.builder()
                        .assigned(0L)
                        .closed(0L)
                        .escalated(0L)
                        .inReview(0L)
                        .open(0L)
                        .resolved(0L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedQueue =
            jsonMapper.readValue(jsonMapper.writeValueAsString(queue), jacksonTypeRef<Queue>())

        assertThat(roundtrippedQueue).isEqualTo(queue)
    }
}
