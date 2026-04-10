// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
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
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .state(ReportStats.AuthRuleVersionState.ACTIVE)
                .version(0L)
                .build()

        assertThat(reportStats.actionCounts())
            .isEqualTo(
                ReportStats.ActionCounts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(reportStats.examples())
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
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(reportStats.state()).isEqualTo(ReportStats.AuthRuleVersionState.ACTIVE)
        assertThat(reportStats.version()).isEqualTo(0L)
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
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .state(ReportStats.AuthRuleVersionState.ACTIVE)
                .version(0L)
                .build()

        val roundtrippedReportStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportStats),
                jacksonTypeRef<ReportStats>(),
            )

        assertThat(roundtrippedReportStats).isEqualTo(reportStats)
    }
}
