// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExtendedCreditServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val extendedCreditServiceAsync = client.creditProducts().extendedCredit()

        val extendedCreditFuture =
            extendedCreditServiceAsync.retrieve(
                CreditProductExtendedCreditRetrieveParams.builder()
                    .creditProductToken("credit_product_token")
                    .build()
            )

        val extendedCredit = extendedCreditFuture.get()
        extendedCredit.validate()
    }
}
