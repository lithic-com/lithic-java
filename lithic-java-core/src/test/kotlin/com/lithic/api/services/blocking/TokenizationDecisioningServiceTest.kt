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
import com.lithic.api.services.blocking.TokenizationDecisioningService
import com.lithic.api.models.*

@ExtendWith(TestServerExtension::class)
class TokenizationDecisioningServiceTest {

    @Test
    fun callRetrieveSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val tokenizationDecisioningService = client.tokenizationDecisioning()
      val tokenizationSecret = tokenizationDecisioningService.retrieveSecret(TokenizationDecisioningRetrieveSecretParams.builder().build())
      println(tokenizationSecret)
      tokenizationSecret.validate()
    }

    @Test
    fun callRotateSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val tokenizationDecisioningService = client.tokenizationDecisioning()
      val tokenizationDecisioningRotateSecretResponse = tokenizationDecisioningService.rotateSecret(TokenizationDecisioningRotateSecretParams.builder().build())
      println(tokenizationDecisioningRotateSecretResponse)
      tokenizationDecisioningRotateSecretResponse.validate()
    }
}
