// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.CardAuthorizationChallengeResponseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthorizationServiceTest {

    @Test
    fun challengeResponse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardAuthorizationService = client.cardAuthorizations()

        cardAuthorizationService.challengeResponse(
            CardAuthorizationChallengeResponseParams.builder()
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .response(CardAuthorizationChallengeResponseParams.Response.APPROVE)
                .build()
        )
    }
}
