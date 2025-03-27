// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.transactions.events.enhancedcommercialdata.EnhancedCommercialDataRetrieveParams
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
        val enhancedCommercialDataService = client.transactions().events().enhancedCommercialData()

        val enhancedData =
            enhancedCommercialDataService.retrieve(
                EnhancedCommercialDataRetrieveParams.builder()
                    .eventToken("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        enhancedData.validate()
    }
}
