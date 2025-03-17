// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.CardProgramRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardProgramServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardProgramService = client.cardPrograms()

        val cardProgram =
            cardProgramService.retrieve(
                CardProgramRetrieveParams.builder()
                    .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        cardProgram.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardProgramService = client.cardPrograms()

        val page = cardProgramService.list()

        page.response().validate()
    }
}
