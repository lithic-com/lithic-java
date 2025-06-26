// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BacktestResultsTest {

    @Test
    fun create() {
        val backtestResults =
            BacktestResults.builder()
                .backtestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .results(
                    BacktestResults.Results.builder()
                        .currentVersion(
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
                        .draftVersion(
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
                .simulationParameters(
                    BacktestResults.SimulationParameters.builder()
                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(backtestResults.backtestToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(backtestResults.results())
            .isEqualTo(
                BacktestResults.Results.builder()
                    .currentVersion(
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
                    .draftVersion(
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
        assertThat(backtestResults.simulationParameters())
            .isEqualTo(
                BacktestResults.SimulationParameters.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backtestResults =
            BacktestResults.builder()
                .backtestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .results(
                    BacktestResults.Results.builder()
                        .currentVersion(
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
                        .draftVersion(
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
                .simulationParameters(
                    BacktestResults.SimulationParameters.builder()
                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBacktestResults =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backtestResults),
                jacksonTypeRef<BacktestResults>(),
            )

        assertThat(roundtrippedBacktestResults).isEqualTo(backtestResults)
    }
}
