// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams
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
        val enhancedCommercialDataService = client.transactions().enhancedCommercialData()
        val enhancedCommercialDataRetrieveResponse =
            enhancedCommercialDataService.retrieve(
                TransactionEnhancedCommercialDataRetrieveParams.builder()
                    .transactionToken("00000000-0000-0000-0000-000000000000")
                    .build()
            )
        println(enhancedCommercialDataRetrieveResponse)
        enhancedCommercialDataRetrieveResponse.validate()
    }
}
