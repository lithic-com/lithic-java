package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.SubscriptionRetrieveSecretResponse

class SubscriptionRetrieveSecretResponseTest {

    @Test
    fun createSubscriptionRetrieveSecretResponse() {
      val subscriptionRetrieveSecretResponse = SubscriptionRetrieveSecretResponse.builder()
          .key("string")
          .build()
      assertThat(subscriptionRetrieveSecretResponse).isNotNull
      assertThat(subscriptionRetrieveSecretResponse.key()).contains("string")
    }
}
