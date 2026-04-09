// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportStatsTest {

    @Test
    fun create() {
        val reportStats =
            ReportStats.builder()
                .actionCounts(
                    ReportStats.ActionCounts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    ReportStats.Example.builder()
                        .addAction(
                            ReportStats.Example.Action.DeclineActionAuthorization.builder()
                                .code(
                                    ReportStats.Example.Action.DeclineActionAuthorization
                                        .DetailedResult
                                        .APPROVED
                                )
                                .type(
                                    ReportStats.Example.Action.DeclineActionAuthorization.Type
                                        .DECLINE
                                )
                                .build()
                        )
                        .approved(true)
                        .decision(ReportStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(reportStats.actionCounts())
            .contains(
                ReportStats.ActionCounts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(reportStats.approved()).contains(0L)
        assertThat(reportStats.challenged()).contains(0L)
        assertThat(reportStats.declined()).contains(0L)
        assertThat(reportStats.examples().getOrNull())
            .containsExactly(
                ReportStats.Example.builder()
                    .addAction(
                        ReportStats.Example.Action.DeclineActionAuthorization.builder()
                            .code(
                                ReportStats.Example.Action.DeclineActionAuthorization.DetailedResult
                                    .APPROVED
                            )
                            .type(
                                ReportStats.Example.Action.DeclineActionAuthorization.Type.DECLINE
                            )
                            .build()
                    )
                    .approved(true)
                    .decision(ReportStats.Example.Decision.APPROVED)
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportStats =
            ReportStats.builder()
                .actionCounts(
                    ReportStats.ActionCounts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    ReportStats.Example.builder()
                        .addAction(
                            ReportStats.Example.Action.DeclineActionAuthorization.builder()
                                .code(
                                    ReportStats.Example.Action.DeclineActionAuthorization
                                        .DetailedResult
                                        .APPROVED
                                )
                                .type(
                                    ReportStats.Example.Action.DeclineActionAuthorization.Type
                                        .DECLINE
                                )
                                .build()
                        )
                        .approved(true)
                        .decision(ReportStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedReportStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportStats),
                jacksonTypeRef<ReportStats>(),
            )

        assertThat(roundtrippedReportStats).isEqualTo(reportStats)
    }
}
