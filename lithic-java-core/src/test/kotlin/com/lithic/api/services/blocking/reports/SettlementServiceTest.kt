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
class SettlementServiceTest {

    @Test
    fun callListDetails() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementService = client.reports().settlement()
        val response =
            settlementService.listDetails(
                ReportSettlementListDetailsParams.builder()
                    .reportDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callSummary() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementService = client.reports().settlement()
        val settlementReport =
            settlementService.summary(
                ReportSettlementSummaryParams.builder()
                    .reportDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(settlementReport)
        settlementReport.validate()
    }
}
