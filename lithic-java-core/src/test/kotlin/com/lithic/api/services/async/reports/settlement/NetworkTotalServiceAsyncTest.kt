// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports.settlement

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NetworkTotalServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val networkTotalServiceAsync = client.reports().settlement().networkTotals()

        val networkTotalFuture =
            networkTotalServiceAsync.retrieve(
                ReportSettlementNetworkTotalRetrieveParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val networkTotal = networkTotalFuture.get()
        networkTotal.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val networkTotalServiceAsync = client.reports().settlement().networkTotals()

        val pageFuture = networkTotalServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
