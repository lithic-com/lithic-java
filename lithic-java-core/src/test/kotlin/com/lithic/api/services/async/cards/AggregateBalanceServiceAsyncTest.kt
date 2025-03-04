// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AggregateBalanceServiceAsyncTest {

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val aggregateBalanceServiceAsync = client.cards().aggregateBalances()

        val pageFuture = aggregateBalanceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
