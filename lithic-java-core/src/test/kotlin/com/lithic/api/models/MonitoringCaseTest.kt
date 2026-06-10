// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonitoringCaseTest {

    @Test
    fun create() {
        val monitoringCase =
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

        assertThat(monitoringCase.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(monitoringCase.assignee()).contains("assignee")
        assertThat(monitoringCase.collectionStopped())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(monitoringCase.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(monitoringCase.entity())
            .contains(
                CaseEntity.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .entityType(CaseEntity.EntityType2.CARD)
                    .build()
            )
        assertThat(monitoringCase.pendingTransactions()).isEqualTo(true)
        assertThat(monitoringCase.priority()).isEqualTo(CasePriority.LOW)
        assertThat(monitoringCase.queueToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(monitoringCase.resolution()).contains(ResolutionOutcome.CONFIRMED_FRAUD)
        assertThat(monitoringCase.resolutionNotes()).contains("resolution_notes")
        assertThat(monitoringCase.resolved())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(monitoringCase.ruleToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(monitoringCase.slaDeadline())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(monitoringCase.status()).isEqualTo(CaseStatus.OPEN)
        assertThat(monitoringCase.tags())
            .isEqualTo(
                MonitoringCase.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(monitoringCase.title()).contains("title")
        assertThat(monitoringCase.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monitoringCase =
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

        val roundtrippedMonitoringCase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monitoringCase),
                jacksonTypeRef<MonitoringCase>(),
            )

        assertThat(roundtrippedMonitoringCase).isEqualTo(monitoringCase)
    }
}
