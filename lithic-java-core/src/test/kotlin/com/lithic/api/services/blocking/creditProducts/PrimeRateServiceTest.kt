// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PrimeRateServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val primeRateService = client.creditProducts().primeRates()
        primeRateService.create(
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()
        )
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val primeRateService = client.creditProducts().primeRates()
        val primeRateRetrieveResponse =
            primeRateService.retrieve(
                CreditProductPrimeRateRetrieveParams.builder()
                    .creditProductToken("credit_product_token")
                    .endingBefore(LocalDate.parse("2019-12-27"))
                    .startingAfter(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(primeRateRetrieveResponse)
        primeRateRetrieveResponse.validate()
    }
}
