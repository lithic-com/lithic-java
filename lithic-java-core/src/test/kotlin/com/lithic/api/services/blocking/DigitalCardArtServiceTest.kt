// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.DigitalCardArtRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalCardArtServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtService = client.digitalCardArt()
        val digitalCardArt =
            digitalCardArtService.retrieve(
                DigitalCardArtRetrieveParams.builder()
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(digitalCardArt)
        digitalCardArt.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtService = client.digitalCardArt()
        val response = digitalCardArtService.list()
        println(response)
        response.data().forEach { it.validate() }
    }
}
