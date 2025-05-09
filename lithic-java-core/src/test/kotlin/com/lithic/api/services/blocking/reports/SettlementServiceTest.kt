// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
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

        val page = settlementService.listDetails(LocalDate.parse("2023-09-01"))

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

        val settlementReport = settlementService.summary(LocalDate.parse("2023-09-01"))

        settlementReport.validate()
    }
}
