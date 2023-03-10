package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthStreamEnrollmentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val authStreamEnrollmentService = client.authStreamEnrollment()
        val authStreamEnrollment =
            authStreamEnrollmentService.retrieve(
                AuthStreamEnrollmentRetrieveParams.builder().build()
            )
        println(authStreamEnrollment)
        authStreamEnrollment.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callDisenroll() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val authStreamEnrollmentService = client.authStreamEnrollment()
        authStreamEnrollmentService.disenroll(AuthStreamEnrollmentDisenrollParams.builder().build())
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callEnroll() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val authStreamEnrollmentService = client.authStreamEnrollment()
        authStreamEnrollmentService.enroll(
            AuthStreamEnrollmentEnrollParams.builder().webhookUrl("https://example.com").build()
        )
    }
}
