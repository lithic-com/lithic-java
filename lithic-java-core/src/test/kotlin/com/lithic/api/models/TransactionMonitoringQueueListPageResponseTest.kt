// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringQueueListPageResponseTest {

    @Test
    fun create() {
        val transactionMonitoringQueueListPageResponse =
            TransactionMonitoringQueueListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(transactionMonitoringQueueListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(transactionMonitoringQueueListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionMonitoringQueueListPageResponse =
            TransactionMonitoringQueueListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionMonitoringQueueListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionMonitoringQueueListPageResponse),
                jacksonTypeRef<TransactionMonitoringQueueListPageResponse>(),
            )

        assertThat(roundtrippedTransactionMonitoringQueueListPageResponse)
            .isEqualTo(transactionMonitoringQueueListPageResponse)
    }
}
