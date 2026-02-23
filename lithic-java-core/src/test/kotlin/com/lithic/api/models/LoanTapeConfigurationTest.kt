// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoanTapeConfigurationTest {

    @Test
    fun create() {
        val loanTapeConfiguration =
            LoanTapeConfiguration.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instanceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditProductToken("credit_product_token")
                .loanTapeRebuildConfiguration(
                    LoanTapeRebuildConfiguration.builder()
                        .rebuildNeeded(true)
                        .lastRebuild(LocalDate.parse("2019-12-27"))
                        .rebuildFrom(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .tierScheduleChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(loanTapeConfiguration.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTapeConfiguration.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(loanTapeConfiguration.instanceToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(loanTapeConfiguration.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTapeConfiguration.creditProductToken()).contains("credit_product_token")
        assertThat(loanTapeConfiguration.loanTapeRebuildConfiguration())
            .contains(
                LoanTapeRebuildConfiguration.builder()
                    .rebuildNeeded(true)
                    .lastRebuild(LocalDate.parse("2019-12-27"))
                    .rebuildFrom(LocalDate.parse("2019-12-27"))
                    .build()
            )
        assertThat(loanTapeConfiguration.tierScheduleChangedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val loanTapeConfiguration =
            LoanTapeConfiguration.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instanceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditProductToken("credit_product_token")
                .loanTapeRebuildConfiguration(
                    LoanTapeRebuildConfiguration.builder()
                        .rebuildNeeded(true)
                        .lastRebuild(LocalDate.parse("2019-12-27"))
                        .rebuildFrom(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .tierScheduleChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLoanTapeConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loanTapeConfiguration),
                jacksonTypeRef<LoanTapeConfiguration>(),
            )

        assertThat(roundtrippedLoanTapeConfiguration).isEqualTo(loanTapeConfiguration)
    }
}
