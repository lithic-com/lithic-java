// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BacktestStatsTest {

    @Test
    fun create() {
        val backtestStats =
            BacktestStats.builder()
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    BacktestStats.Example.builder()
                        .decision(BacktestStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .version(0L)
                .build()

        assertThat(backtestStats.approved()).contains(0L)
        assertThat(backtestStats.challenged()).contains(0L)
        assertThat(backtestStats.declined()).contains(0L)
        assertThat(backtestStats.examples().getOrNull())
            .containsExactly(
                BacktestStats.Example.builder()
                    .decision(BacktestStats.Example.Decision.APPROVED)
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(backtestStats.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backtestStats =
            BacktestStats.builder()
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    BacktestStats.Example.builder()
                        .decision(BacktestStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .version(0L)
                .build()

        val roundtrippedBacktestStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backtestStats),
                jacksonTypeRef<BacktestStats>(),
            )

        assertThat(roundtrippedBacktestStats).isEqualTo(backtestStats)
    }
}
