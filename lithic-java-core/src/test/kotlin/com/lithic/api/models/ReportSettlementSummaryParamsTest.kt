// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReportSettlementSummaryParamsTest {

    @Test
    fun createReportSettlementSummaryParams() {
        ReportSettlementSummaryParams.builder().reportDate(LocalDate.parse("2023-09-01")).build()
    }

    @Test
    fun getPathParam() {
        val params =
            ReportSettlementSummaryParams.builder()
                .reportDate(LocalDate.parse("2023-09-01"))
                .build()
        assertThat(params).isNotNull
        // path param "reportDate"
        assertThat(params.getPathParam(0)).isEqualTo("2023-09-01")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
