// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportSettlementSummaryParamsTest {

    @Test
    fun create() {
        ReportSettlementSummaryParams.builder().reportDate(LocalDate.parse("2023-09-01")).build()
    }

    @Test
    fun pathParams() {
        val params =
            ReportSettlementSummaryParams.builder()
                .reportDate(LocalDate.parse("2023-09-01"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("2023-09-01")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
