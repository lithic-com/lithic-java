// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettlementServiceAsyncTest {

    @Test
    fun listDetails() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementServiceAsync = client.reports().settlement()

        val pageFuture = settlementServiceAsync.listDetails(LocalDate.parse("2023-09-01"))

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun summary() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementServiceAsync = client.reports().settlement()

        val settlementReportFuture = settlementServiceAsync.summary(LocalDate.parse("2023-09-01"))

        val settlementReport = settlementReportFuture.get()
        settlementReport.validate()
    }
}
