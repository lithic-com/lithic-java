// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FundingEventServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val fundingEventFuture = fundingEventServiceAsync.retrieve("funding_event_token")

        val fundingEvent = fundingEventFuture.get()
        fundingEvent.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val pageFuture = fundingEventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun retrieveDetails() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val responseFuture =
            fundingEventServiceAsync.retrieveDetails("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
