// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EnhancedCommercialDataServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val enhancedCommercialDataService = client.transactions().events().enhancedCommercialData()
        val enhancedData =
            enhancedCommercialDataService.retrieve(
                TransactionEventEnhancedCommercialDataRetrieveParams.builder()
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(enhancedData)
        enhancedData.validate()
    }
}
