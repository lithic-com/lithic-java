// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettlementServiceTest {

    @Test
    fun listDetails() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementService = client.reports().settlement()

        val page =
            settlementService.listDetails(
                ReportSettlementListDetailsParams.builder()
                    .reportDate(LocalDate.parse("2023-09-01"))
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun summary() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementService = client.reports().settlement()

        val settlementReport =
            settlementService.summary(
                ReportSettlementSummaryParams.builder()
                    .reportDate(LocalDate.parse("2023-09-01"))
                    .build()
            )

        settlementReport.validate()
    }
}
