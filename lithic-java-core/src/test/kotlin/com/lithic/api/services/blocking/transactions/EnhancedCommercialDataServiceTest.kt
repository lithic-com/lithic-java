// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnhancedCommercialDataServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val enhancedCommercialDataService = client.transactions().enhancedCommercialData()

        val enhancedCommercialData =
            enhancedCommercialDataService.retrieve("00000000-0000-0000-0000-000000000000")

        enhancedCommercialData.validate()
    }
}
