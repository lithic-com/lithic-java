// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReportSettlementListDetailsParamsTest {

    @Test
    fun createReportSettlementListDetailsParams() {
        ReportSettlementListDetailsParams.builder()
            .reportDate(LocalDate.parse("2019-12-27"))
            .endingBefore("string")
            .pageSize(100L)
            .startingAfter("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2019-12-27"))
                .endingBefore("string")
                .pageSize(100L)
                .startingAfter("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("string"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2019-12-27"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(params).isNotNull
        // path param "reportDate"
        assertThat(params.getPathParam(0)).isEqualTo("2019-12-27")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
