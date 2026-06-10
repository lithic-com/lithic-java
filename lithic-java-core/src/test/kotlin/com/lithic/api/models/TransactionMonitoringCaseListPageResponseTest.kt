// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseListPageResponseTest {

    @Test
    fun create() {
        val transactionMonitoringCaseListPageResponse =
            TransactionMonitoringCaseListPageResponse.builder()
                .addData(
                    MonitoringCase.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assignee("assignee")
                        .collectionStopped(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entity(
                            CaseEntity.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .entityType(CaseEntity.EntityType2.CARD)
                                .build()
                        )
                        .pendingTransactions(true)
                        .priority(CasePriority.LOW)
                        .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resolution(ResolutionOutcome.CONFIRMED_FRAUD)
                        .resolutionNotes("resolution_notes")
                        .resolved(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ruleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .slaDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(CaseStatus.OPEN)
                        .tags(
                            MonitoringCase.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .title("title")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(transactionMonitoringCaseListPageResponse.data())
            .containsExactly(
                MonitoringCase.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assignee("assignee")
                    .collectionStopped(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entity(
                        CaseEntity.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .entityType(CaseEntity.EntityType2.CARD)
                            .build()
                    )
                    .pendingTransactions(true)
                    .priority(CasePriority.LOW)
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resolution(ResolutionOutcome.CONFIRMED_FRAUD)
                    .resolutionNotes("resolution_notes")
                    .resolved(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ruleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slaDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(CaseStatus.OPEN)
                    .tags(
                        MonitoringCase.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .title("title")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(transactionMonitoringCaseListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionMonitoringCaseListPageResponse =
            TransactionMonitoringCaseListPageResponse.builder()
                .addData(
                    MonitoringCase.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assignee("assignee")
                        .collectionStopped(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entity(
                            CaseEntity.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .entityType(CaseEntity.EntityType2.CARD)
                                .build()
                        )
                        .pendingTransactions(true)
                        .priority(CasePriority.LOW)
                        .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resolution(ResolutionOutcome.CONFIRMED_FRAUD)
                        .resolutionNotes("resolution_notes")
                        .resolved(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ruleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .slaDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(CaseStatus.OPEN)
                        .tags(
                            MonitoringCase.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .title("title")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionMonitoringCaseListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionMonitoringCaseListPageResponse),
                jacksonTypeRef<TransactionMonitoringCaseListPageResponse>(),
            )

        assertThat(roundtrippedTransactionMonitoringCaseListPageResponse)
            .isEqualTo(transactionMonitoringCaseListPageResponse)
    }
}
