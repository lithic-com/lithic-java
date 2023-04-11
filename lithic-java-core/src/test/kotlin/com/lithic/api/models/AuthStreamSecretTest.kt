package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AuthStreamSecret

class AuthStreamSecretTest {

    @Test
    fun createAuthStreamSecret() {
      val authStreamSecret = AuthStreamSecret.builder()
          .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
          .build()
      assertThat(authStreamSecret).isNotNull
      assertThat(authStreamSecret.secret()).contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
