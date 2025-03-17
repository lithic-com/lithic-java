// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportSettlementListDetailsParamsTest {

    @Test
    fun create() {
        ReportSettlementListDetailsParams.builder()
            .reportDate(LocalDate.parse("2023-09-01"))
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2023-09-01"))
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "1")
        expected.put("starting_after", "starting_after")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2023-09-01"))
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ReportSettlementListDetailsParams.builder()
                .reportDate(LocalDate.parse("2023-09-01"))
                .build()
        assertThat(params).isNotNull
        // path param "reportDate"
        assertThat(params.getPathParam(0)).isEqualTo("2023-09-01")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
