// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExtendedCreditServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val extendedCreditService = client.creditProducts().extendedCredit()
        val extendedCredit =
            extendedCreditService.retrieve(
                CreditProductExtendedCreditRetrieveParams.builder()
                    .creditProductId("credit_product_id")
                    .build()
            )
        println(extendedCredit)
        extendedCredit.validate()
    }
}
