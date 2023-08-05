package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthenticationServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authenticationService = client.threeDS().authentication()
        val authenticationRetrieveResponse =
            authenticationService.retrieve(
                ThreeDSAuthenticationRetrieveParams.builder()
                    .threeDSAuthenticationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(authenticationRetrieveResponse)
        authenticationRetrieveResponse.validate()
    }
}
