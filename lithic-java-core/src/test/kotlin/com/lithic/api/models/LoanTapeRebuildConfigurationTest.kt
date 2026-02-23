// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoanTapeRebuildConfigurationTest {

    @Test
    fun create() {
        val loanTapeRebuildConfiguration =
            LoanTapeRebuildConfiguration.builder()
                .rebuildNeeded(true)
                .lastRebuild(LocalDate.parse("2019-12-27"))
                .rebuildFrom(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(loanTapeRebuildConfiguration.rebuildNeeded()).isEqualTo(true)
        assertThat(loanTapeRebuildConfiguration.lastRebuild())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(loanTapeRebuildConfiguration.rebuildFrom())
            .contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val loanTapeRebuildConfiguration =
            LoanTapeRebuildConfiguration.builder()
                .rebuildNeeded(true)
                .lastRebuild(LocalDate.parse("2019-12-27"))
                .rebuildFrom(LocalDate.parse("2019-12-27"))
                .build()

        val roundtrippedLoanTapeRebuildConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loanTapeRebuildConfiguration),
                jacksonTypeRef<LoanTapeRebuildConfiguration>(),
            )

        assertThat(roundtrippedLoanTapeRebuildConfiguration).isEqualTo(loanTapeRebuildConfiguration)
    }
}
