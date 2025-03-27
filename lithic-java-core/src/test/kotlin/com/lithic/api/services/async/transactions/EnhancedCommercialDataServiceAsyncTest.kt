// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.transactions.enhancedcommercialdata.EnhancedCommercialDataRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnhancedCommercialDataServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val enhancedCommercialDataServiceAsync = client.transactions().enhancedCommercialData()

        val enhancedCommercialDataFuture =
            enhancedCommercialDataServiceAsync.retrieve(
                EnhancedCommercialDataRetrieveParams.builder()
                    .transactionToken("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val enhancedCommercialData = enhancedCommercialDataFuture.get()
        enhancedCommercialData.validate()
    }
}
