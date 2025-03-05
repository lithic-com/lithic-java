// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExtendedCreditServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val extendedCreditService = client.creditProducts().extendedCredit()

        val extendedCredit =
            extendedCreditService.retrieve(
                CreditProductExtendedCreditRetrieveParams.builder()
                    .creditProductToken("credit_product_token")
                    .build()
            )

        extendedCredit.validate()
    }
}
