package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse

class TokenizationDecisioningRotateSecretResponseTest {

    @Test
    fun createTokenizationDecisioningRotateSecretResponse() {
      val tokenizationDecisioningRotateSecretResponse = TokenizationDecisioningRotateSecretResponse.builder()
          .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
          .build()
      assertThat(tokenizationDecisioningRotateSecretResponse).isNotNull
      assertThat(tokenizationDecisioningRotateSecretResponse.secret()).contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
