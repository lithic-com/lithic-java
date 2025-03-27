// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditproducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.creditproducts.extendedcredit.ExtendedCreditRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExtendedCreditServiceAsyncTest {

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
                ExtendedCreditRetrieveParams.builder()
                    .creditProductToken("credit_product_token")
                    .build()
            )

        val extendedCredit = extendedCreditFuture.get()
        extendedCredit.validate()
    }
}
