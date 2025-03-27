// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.digitalcardart.DigitalCardArtRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalCardArtServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtServiceAsync = client.digitalCardArt()

        val digitalCardArtFuture =
            digitalCardArtServiceAsync.retrieve(
                DigitalCardArtRetrieveParams.builder()
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val digitalCardArt = digitalCardArtFuture.get()
        digitalCardArt.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtServiceAsync = client.digitalCardArt()

        val pageFuture = digitalCardArtServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
