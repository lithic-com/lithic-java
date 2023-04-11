package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.TokenizationSecret

class TokenizationSecretTest {

    @Test
    fun createTokenizationSecret() {
      val tokenizationSecret = TokenizationSecret.builder()
          .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
          .build()
      assertThat(tokenizationSecret).isNotNull
      assertThat(tokenizationSecret.secret()).contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
