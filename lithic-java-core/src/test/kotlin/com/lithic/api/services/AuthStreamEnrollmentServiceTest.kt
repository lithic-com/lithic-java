package com.lithic.api.services

import com.lithic.api.client.okhttp.LithicClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class AuthStreamEnrollmentServiceTest {
    @Test
    fun callRetrieve() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authStreamEnrollmentService = client.authStreamEnrollment
        val authStreamEnrollment =
            authStreamEnrollmentService.retrieve(
                AuthStreamEnrollmentRetrieveParams.builder().build()
            )
        println(authStreamEnrollment)
        authStreamEnrollment.validate()
    }

    @Test
    fun callDisenroll() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authStreamEnrollmentService = client.authStreamEnrollment
        authStreamEnrollmentService.disenroll(AuthStreamEnrollmentDisenrollParams.builder().build())
    }

    @Disabled(
        "skipped: currently no good way to test endpoints defining callbacks, Prism mock server will fail trying to reach the provided callback url"
    )
    @Test
    fun callEnroll() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authStreamEnrollmentService = client.authStreamEnrollment
        authStreamEnrollmentService.enroll(
            AuthStreamEnrollmentEnrollParams.builder().webhookUrl("https://example.com").build()
        )
    }
}
