// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportSettlementNetworkTotalListParamsTest {

    @Test
    fun create() {
        ReportSettlementNetworkTotalListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .institutionId("institution_id")
            .network(ReportSettlementNetworkTotalListParams.Network.VISA)
            .pageSize(1L)
            .reportDate(LocalDate.parse("2019-12-27"))
            .reportDateBegin(LocalDate.parse("2019-12-27"))
            .reportDateEnd(LocalDate.parse("2019-12-27"))
            .settlementInstitutionId("settlement_institution_id")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportSettlementNetworkTotalListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .institutionId("institution_id")
                .network(ReportSettlementNetworkTotalListParams.Network.VISA)
                .pageSize(1L)
                .reportDate(LocalDate.parse("2019-12-27"))
                .reportDateBegin(LocalDate.parse("2019-12-27"))
                .reportDateEnd(LocalDate.parse("2019-12-27"))
                .settlementInstitutionId("settlement_institution_id")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("institution_id", "institution_id")
                    .put("network", "VISA")
                    .put("page_size", "1")
                    .put("report_date", "2019-12-27")
                    .put("report_date_begin", "2019-12-27")
                    .put("report_date_end", "2019-12-27")
                    .put("settlement_institution_id", "settlement_institution_id")
                    .put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportSettlementNetworkTotalListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
