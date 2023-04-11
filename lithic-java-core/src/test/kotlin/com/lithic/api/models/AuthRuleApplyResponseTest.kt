package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AuthRuleApplyResponse

class AuthRuleApplyResponseTest {

    @Test
    fun createAuthRuleApplyResponse() {
      val authRuleApplyResponse = AuthRuleApplyResponse.builder()
          .data(AuthRule.builder()
              .allowedMcc(listOf("string"))
              .blockedMcc(listOf("string"))
              .allowedCountries(listOf("string"))
              .blockedCountries(listOf("string"))
              .avsType(AuthRule.AvsType.ZIP_ONLY)
              .accountTokens(listOf("string"))
              .cardTokens(listOf("string"))
              .programLevel(true)
              .build())
          .build()
      assertThat(authRuleApplyResponse).isNotNull
      assertThat(authRuleApplyResponse.data()).contains(AuthRule.builder()
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
