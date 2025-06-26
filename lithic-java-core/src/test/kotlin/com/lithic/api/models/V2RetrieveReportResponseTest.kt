// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2RetrieveReportResponseTest {

    @Test
    fun create() {
        val v2RetrieveReportResponse =
            V2RetrieveReportResponse.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .addDailyStatistic(
                    V2RetrieveReportResponse.DailyStatistic.builder()
                        .currentVersionStatistics(
                            RuleStats.builder()
                                .approved(0L)
                                .challenged(0L)
                                .declined(0L)
                                .addExample(
                                    RuleStats.Example.builder()
                                        .approved(true)
                                        .decision(RuleStats.Example.Decision.APPROVED)
                                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .date(LocalDate.parse("2019-12-27"))
                        .draftVersionStatistics(
                            RuleStats.builder()
                                .approved(0L)
                                .challenged(0L)
                                .declined(0L)
                                .addExample(
                                    RuleStats.Example.builder()
                                        .approved(true)
                                        .decision(RuleStats.Example.Decision.APPROVED)
                                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .build()
                )
                .end(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(v2RetrieveReportResponse.authRuleToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveReportResponse.begin()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(v2RetrieveReportResponse.dailyStatistics())
            .containsExactly(
                V2RetrieveReportResponse.DailyStatistic.builder()
                    .currentVersionStatistics(
                        RuleStats.builder()
                            .approved(0L)
                            .challenged(0L)
                            .declined(0L)
                            .addExample(
                                RuleStats.Example.builder()
                                    .approved(true)
                                    .decision(RuleStats.Example.Decision.APPROVED)
                                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .date(LocalDate.parse("2019-12-27"))
                    .draftVersionStatistics(
                        RuleStats.builder()
                            .approved(0L)
                            .challenged(0L)
                            .declined(0L)
                            .addExample(
                                RuleStats.Example.builder()
                                    .approved(true)
                                    .decision(RuleStats.Example.Decision.APPROVED)
                                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(v2RetrieveReportResponse.end()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2RetrieveReportResponse =
            V2RetrieveReportResponse.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .addDailyStatistic(
                    V2RetrieveReportResponse.DailyStatistic.builder()
                        .currentVersionStatistics(
                            RuleStats.builder()
                                .approved(0L)
                                .challenged(0L)
                                .declined(0L)
                                .addExample(
                                    RuleStats.Example.builder()
                                        .approved(true)
                                        .decision(RuleStats.Example.Decision.APPROVED)
                                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .date(LocalDate.parse("2019-12-27"))
                        .draftVersionStatistics(
                            RuleStats.builder()
                                .approved(0L)
                                .challenged(0L)
                                .declined(0L)
                                .addExample(
                                    RuleStats.Example.builder()
                                        .approved(true)
                                        .decision(RuleStats.Example.Decision.APPROVED)
                                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .build()
                )
                .end(LocalDate.parse("2019-12-27"))
                .build()

        val roundtrippedV2RetrieveReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2RetrieveReportResponse),
                jacksonTypeRef<V2RetrieveReportResponse>(),
            )

        assertThat(roundtrippedV2RetrieveReportResponse).isEqualTo(v2RetrieveReportResponse)
    }
}
