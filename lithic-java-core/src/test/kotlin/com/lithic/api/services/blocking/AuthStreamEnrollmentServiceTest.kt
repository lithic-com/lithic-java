package com.lithic.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.lithic.api.TestServerExtension
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.services.blocking.AuthStreamEnrollmentService
import com.lithic.api.models.*

@ExtendWith(TestServerExtension::class)
class AuthStreamEnrollmentServiceTest {

    @Test
    fun callRetrieve() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val authStreamEnrollmentService = client.authStreamEnrollment()
      val authStreamEnrollment = authStreamEnrollmentService.retrieve(AuthStreamEnrollmentRetrieveParams.builder().build())
      println(authStreamEnrollment)
      authStreamEnrollment.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callDisenroll() {
      val client = LithicOkHttpClient.builder()
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
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val authStreamEnrollmentService = client.authStreamEnrollment()
      authStreamEnrollmentService.enroll(AuthStreamEnrollmentEnrollParams.builder()
          .webhookUrl("https://example.com")
          .build())
    }

    @Test
    fun callRetrieveSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val authStreamEnrollmentService = client.authStreamEnrollment()
      val authStreamSecret = authStreamEnrollmentService.retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.builder().build())
      println(authStreamSecret)
      authStreamSecret.validate()
    }

    @Test
    fun callRotateSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val authStreamEnrollmentService = client.authStreamEnrollment()
      authStreamEnrollmentService.rotateSecret(AuthStreamEnrollmentRotateSecretParams.builder().build())
    }
}
