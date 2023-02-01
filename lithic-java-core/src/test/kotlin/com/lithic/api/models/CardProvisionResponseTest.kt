package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.CardProvisionResponse

class CardProvisionResponseTest {

    @Test
    fun createCardProvisionResponse() {
      val cardProvisionResponse = CardProvisionResponse.builder()
          .provisioningPayload("string")
          .build()
      assertThat(cardProvisionResponse).isNotNull
      assertThat(cardProvisionResponse.provisioningPayload()).contains("string")
    }
}
