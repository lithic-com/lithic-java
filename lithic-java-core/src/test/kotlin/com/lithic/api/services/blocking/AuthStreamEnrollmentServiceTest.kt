// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthStreamEnrollmentServiceTest {

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authStreamEnrollmentService = client.authStreamEnrollment()
        val authStreamSecret =
            authStreamEnrollmentService.retrieveSecret(
                AuthStreamEnrollmentRetrieveSecretParams.builder().build()
            )
        println(authStreamSecret)
        authStreamSecret.validate()
    }

    @Test
    fun callRotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authStreamEnrollmentService = client.authStreamEnrollment()
        authStreamEnrollmentService.rotateSecret(
            AuthStreamEnrollmentRotateSecretParams.builder().build()
        )
    }
}
