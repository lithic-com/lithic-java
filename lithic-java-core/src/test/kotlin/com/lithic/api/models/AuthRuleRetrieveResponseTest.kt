package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AuthRuleRetrieveResponse

class AuthRuleRetrieveResponseTest {

    @Test
    fun createAuthRuleRetrieveResponse() {
      val authRuleRetrieveResponse = AuthRuleRetrieveResponse.builder()
          .data(listOf(AuthRule.builder()
              .allowedMcc(listOf("string"))
              .blockedMcc(listOf("string"))
              .allowedCountries(listOf("string"))
              .blockedCountries(listOf("string"))
              .avsType(AuthRule.AvsType.ZIP_ONLY)
              .accountTokens(listOf("string"))
              .cardTokens(listOf("string"))
              .programLevel(true)
              .build()))
          .build()
      assertThat(authRuleRetrieveResponse).isNotNull
      assertThat(authRuleRetrieveResponse.data().get()).containsExactly(AuthRule.builder()
          .allowedMcc(listOf("string"))
          .blockedMcc(listOf("string"))
          .allowedCountries(listOf("string"))
          .blockedCountries(listOf("string"))
          .avsType(AuthRule.AvsType.ZIP_ONLY)
          .accountTokens(listOf("string"))
          .cardTokens(listOf("string"))
          .programLevel(true)
          .build())
    }
}
